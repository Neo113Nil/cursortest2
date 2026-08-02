package ru.CryptoPro.AdES.evidence.crl;

import defpackage.a4x0;
import defpackage.er80;
import defpackage.jc51;
import defpackage.l2;
import defpackage.m79;
import defpackage.rbf;
import defpackage.sbf;
import defpackage.t5z0;
import defpackage.ubf;
import defpackage.v3;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.bouncycastle.cert.X509CRLHolder;
import ru.CryptoPro.AdES.AbstractFinder;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CRLFinder extends AbstractFinder<m79> {
    public CRLFinder(Collection<m79> collection) {
        super(collection);
    }

    public static boolean match(m79 m79Var, X509CRL x509crl, ubf ubfVar, String str) throws AdESException {
        t5z0 t5z0Var;
        try {
            er80 er80Var = ubfVar.a;
            if (er80Var == null) {
                throw new AdESException("CRL hash is null.", IAdESException.ecFinderWrongCrlRef);
            }
            String str2 = er80Var.m().a.a;
            byte[] encoded = m79Var.getEncoded();
            a4x0 a4x0Var = m79Var.a;
            boolean equals = Arrays.equals(AdESUtility.calculateDigest(str, str2, encoded), er80Var.n());
            rbf rbfVar = ubfVar.b;
            if (rbfVar == null) {
                return equals;
            }
            l2 l2Var = rbfVar.c;
            BigInteger x = l2Var == null ? null : l2Var.x();
            jc51 jc51Var = rbfVar.a;
            v3 v3Var = rbfVar.b;
            BigInteger cRLSerialNumber = AdESUtility.getCRLSerialNumber(x509crl);
            jc51 m = jc51.m(new X509CRLHolder(x509crl.getEncoded()).a.a.c);
            if (equals) {
                boolean equals2 = (x == null || cRLSerialNumber == null) ? x == null : x.equals(cRLSerialNumber);
                boolean equals3 = (jc51Var == null || m == null) ? jc51Var == null && m == null : jc51Var.equals(m);
                boolean q = (v3Var == null || (t5z0Var = a4x0Var.w) == null) ? v3Var == null && a4x0Var.w == null : v3Var.q(new v3(t5z0Var.m()));
                if (equals2 && equals3 && q) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecFinderWrongCrlRef);
        } catch (CRLException e2) {
            throw new AdESException(e2, IAdESException.ecFinderWrongCrlRef);
        }
    }

    public List<X509CRL> find(sbf sbfVar) throws AdESException {
        JCPLogger.finer("Looking for CRL by crl list identifier.");
        if (sbfVar == null) {
            throw new AdESException("CRLListID is null. CRL can not be found as revocation value. Check property ru.CryptoPro.AdES.require_tsp_evidence (require an evidence for the TSP certificate).", IAdESException.ecFinderWrongCrlRef);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : this.collection) {
            for (ubf ubfVar : sbfVar.m()) {
                try {
                    X509CRL x509crl = (X509CRL) AdESUtility.CERT_FACTORY.generateCRL(new ByteArrayInputStream(t.getEncoded("DER")));
                    if (match(t, x509crl, ubfVar, this.provider)) {
                        arrayList.add(x509crl);
                    }
                } catch (Exception e) {
                    JCPLogger.ignoredException(e);
                }
            }
        }
        return arrayList;
    }

    public static boolean match(m79 m79Var, ubf ubfVar, String str) throws AdESException {
        try {
            return match(m79Var, (X509CRL) AdESUtility.CERT_FACTORY.generateCRL(new ByteArrayInputStream(m79Var.getEncoded("DER"))), ubfVar, str);
        } catch (IOException | CRLException e) {
            JCPLogger.ignoredException(e);
            return false;
        }
    }
}
