package ru.CryptoPro.CAdES.tools;

import defpackage.a2;
import defpackage.acs0;
import defpackage.b490;
import defpackage.c2;
import defpackage.i3;
import defpackage.jqf;
import defpackage.lqf;
import defpackage.m3;
import defpackage.m8z0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rd4;
import defpackage.u2;
import defpackage.u87;
import defpackage.vc3;
import defpackage.xc3;
import defpackage.y87;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.tsp.TSPException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.CAdESParameters;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CAdESUtility {
    public static final ArrayList a;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add(b490.K3);
        arrayList.add(b490.L3);
        arrayList.add(b490.M3);
        arrayList.add(b490.O3);
        arrayList.add(b490.I3);
        arrayList.add(b490.G3);
        arrayList.add(b490.Q3);
        arrayList.add(b490.t3);
        arrayList.add(b490.u3);
        arrayList.add(CAdESParameters.id_aa_ets_ATSHashIndex);
        arrayList.add(CAdESParameters.id_aa_ets_ATSHashIndexV3);
    }

    public static byte[] concatenate(byte[]... bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (bArr.length == 1 && bArr[0] == null) {
            return null;
        }
        if (bArr.length == 1) {
            return (byte[]) bArr[0].clone();
        }
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null) {
                i += bArr2.length;
            }
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            if (bArr4 != null) {
                System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
                i2 += bArr4.length;
            }
        }
        return bArr3;
    }

    public static m8z0 convertAttributeValueToTimestampToken(vc3 vc3Var) throws IOException, CMSException, TSPException {
        i3 i3Var = (i3) ((m3) ((i3) vc3Var.toASN1Primitive()).A(1)).a[0];
        if (i3Var != null) {
            return new m8z0(new u87(i3Var.getEncoded()));
        }
        ny61.v("Timestamp sequence is null.");
        return null;
    }

    public static Hashtable copyHashTable(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    public static vc3 createTimeStampAttribute(u2 u2Var, m8z0 m8z0Var) {
        c2 c2Var = new c2();
        i3 i3Var = (i3) m8z0Var.a.b.toASN1Primitive();
        a2 A = i3Var.A(0);
        a2 A2 = i3Var.A(1);
        c2 c2Var2 = new c2();
        c2Var2.a(A);
        c2Var2.a(A2);
        c2Var.a(new jqf(c2Var2));
        return new vc3(u2Var, new rd4(c2Var, false));
    }

    public static c2 getASN1EncodedCounterSigner(m3 m3Var, acs0 acs0Var) {
        c2 c2Var = new c2();
        if (m3Var != null) {
            int i = 0;
            while (true) {
                a2[] a2VarArr = m3Var.a;
                if (i >= a2VarArr.length) {
                    break;
                }
                c2Var.a(a2VarArr[i]);
                i++;
            }
        }
        c2Var.a(acs0Var.toASN1Structure());
        c2 c2Var2 = new c2();
        c2Var2.a(new u2(b490.x3.a));
        c2Var2.a(new lqf(c2Var));
        return c2Var2;
    }

    public static Vector<vc3> getAttributes(xc3 xc3Var, u2 u2Var) throws CAdESException {
        if (xc3Var == null) {
            return new Vector<>();
        }
        Vector<vc3> vector = new Vector<>();
        c2 d = xc3Var.d(u2Var);
        for (int i = 0; i < d.b; i++) {
            vector.add((vc3) d.c(i));
        }
        if (a.contains(u2Var)) {
            if (vector.size() > 1) {
                throw new CAdESException(oyr.t(new StringBuilder("Only a single instance of this attribute "), u2Var.a, " shall occur with an electronic signature"), IAdESException.ecSignatureWrongAttributeCount);
            }
            Iterator<vc3> it = vector.iterator();
            while (it.hasNext()) {
                if (it.next().b.a.length > 1) {
                    throw new CAdESException(oyr.t(new StringBuilder("Only a single attribute value inside this attribute "), u2Var.a, " shall occur with an electronic signature"), IAdESException.ecSignatureWrongAttributeCount);
                }
            }
        }
        return vector;
    }

    public static vc3 getSingleAttribute(xc3 xc3Var, u2 u2Var) throws CAdESException {
        Vector<vc3> attributes = getAttributes(xc3Var, u2Var);
        if (attributes.size() > 0) {
            return attributes.get(0);
        }
        return null;
    }

    public static a2 getSingleAttributeValue(xc3 xc3Var, u2 u2Var) throws CAdESException {
        m3 m3Var;
        Vector<vc3> attributes = getAttributes(xc3Var, u2Var);
        if (attributes.size() > 0 && (m3Var = attributes.get(0).b) != null) {
            return m3Var.a[0];
        }
        return null;
    }

    public static Vector<vc3> getUnsignedAttributes(xc3 xc3Var) {
        Vector<vc3> vector = new Vector<>();
        c2 g = xc3Var.g();
        Vector vector2 = new Vector();
        for (int i = 0; i < g.b; i++) {
            vector2.add((vc3) g.c(i));
        }
        Iterator it = vector2.iterator();
        while (it.hasNext()) {
            vc3 vc3Var = (vc3) it.next();
            u2 u2Var = vc3Var.a;
            u2 u2Var2 = vc3Var.a;
            if (u2Var.q(b490.J3) || u2Var2.q(b490.K3) || u2Var2.q(b490.L3) || u2Var2.q(b490.M3) || u2Var2.q(b490.O3) || u2Var2.q(b490.P3) || u2Var2.q(CAdESParameters.id_aa_ets_archiveTimestampV3)) {
                vector.add(vc3Var);
            }
        }
        return vector;
    }

    public static boolean ifKeyUsageIsKeyAgreementInCertificate(X509Certificate x509Certificate) {
        boolean[] keyUsage;
        if (!EnvelopedUtility.isKeyAgreementValidationEnabled()) {
            return true;
        }
        Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty() && criticalExtensionOIDs.contains(AdESUtility.KEY_USAGE) && (keyUsage = x509Certificate.getKeyUsage()) != null && keyUsage.length > 4 && keyUsage[4];
    }

    public static void initJCPAlgorithms() {
        JCPLogger.subEnter();
        JCPLogger.fine("Replacing of the BouncyCastle GOST algorithms...");
        for (Map.Entry entry : AlgorithmUtility.MAP_REPLACING_DIGEST_ALGORITHMS.entrySet()) {
            String str = (String) entry.getKey();
            new u2(str);
        }
        for (Map.Entry entry2 : AlgorithmUtility.MAP_REPLACING_KEY_ALGORITHMS.entrySet()) {
            String str2 = (String) entry2.getKey();
            y87.a(new u2(str2), (String) entry2.getValue());
        }
        JCPLogger.fine("Replacing of the BouncyCastle GOST algorithms completed.");
        JCPLogger.subExit();
    }
}
