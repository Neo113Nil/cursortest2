package ru.CryptoPro.reprov.certpath;

import defpackage.b64;
import defpackage.dac;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.x4e;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.Util.HexDumpEncoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;
import ru.CryptoPro.reprov.x509.AlgorithmId;
import ru.CryptoPro.reprov.x509.CertificatePoliciesExtension;
import ru.CryptoPro.reprov.x509.CertificatePolicyId;
import ru.CryptoPro.reprov.x509.DNSName;
import ru.CryptoPro.reprov.x509.EDIPartyName;
import ru.CryptoPro.reprov.x509.ExtendedKeyUsageExtension;
import ru.CryptoPro.reprov.x509.Extension;
import ru.CryptoPro.reprov.x509.GeneralName;
import ru.CryptoPro.reprov.x509.GeneralNameInterface;
import ru.CryptoPro.reprov.x509.GeneralNames;
import ru.CryptoPro.reprov.x509.GeneralSubtree;
import ru.CryptoPro.reprov.x509.GeneralSubtrees;
import ru.CryptoPro.reprov.x509.IPAddressName;
import ru.CryptoPro.reprov.x509.NameConstraintsExtension;
import ru.CryptoPro.reprov.x509.OIDName;
import ru.CryptoPro.reprov.x509.OtherName;
import ru.CryptoPro.reprov.x509.PolicyInformation;
import ru.CryptoPro.reprov.x509.PrivateKeyUsageExtension;
import ru.CryptoPro.reprov.x509.RFC822Name;
import ru.CryptoPro.reprov.x509.SubjectAlternativeNameExtension;
import ru.CryptoPro.reprov.x509.URIName;
import ru.CryptoPro.reprov.x509.X400Address;
import ru.CryptoPro.reprov.x509.X500Name;
import ru.CryptoPro.reprov.x509.X500Principal;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.CryptoPro.reprov.x509.X509Key;

/* loaded from: classes4.dex */
public class X509CertSelector implements CertSelector {
    public static final ObjectIdentifier R = ObjectIdentifier.newInternal(new int[]{2, 5, 29, 37, 0});
    public static final Boolean S;
    public static final String[] T;
    public ObjectIdentifier A;
    public PublicKey B;
    public byte[] C;
    public boolean[] D;
    public Set E;
    public HashSet F;
    public Set G;
    public Set H;
    public CertificatePolicySet I;
    public Set J;
    public Set K;
    public Set L;
    public NameConstraintsExtension M;
    public byte[] N;
    public X509Certificate P;
    public BigInteger a;
    public X500Principal b;
    public X500Principal c;
    public byte[] w;
    public byte[] x;
    public Date y;
    public Date z;
    public int O = -1;
    public boolean Q = true;

    static {
        CertPathHelperImpl.initialize();
        S = Boolean.FALSE;
        T = new String[]{"2.5.29.16", "2.5.29.17", "2.5.29.30", "2.5.29.32", AdESUtility.EXTENDED_KEY_USAGE};
    }

    public X509CertSelector(java.security.cert.X509CertSelector x509CertSelector) throws IOException {
        setSerialNumber(x509CertSelector.getSerialNumber());
        if (x509CertSelector.getIssuer() != null) {
            setIssuer(x509CertSelector.getIssuer().getEncoded());
        }
        if (x509CertSelector.getSubject() != null) {
            setSubject(x509CertSelector.getSubject().getEncoded());
        }
        setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
        setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
        setCertificateValid(x509CertSelector.getCertificateValid());
        setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
        setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
        setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
        setKeyUsage(x509CertSelector.getKeyUsage());
        setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
        setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
        setPolicy(x509CertSelector.getPolicy());
        setPathToNames(x509CertSelector.getPathToNames());
        setNameConstraints(x509CertSelector.getNameConstraints());
        setBasicConstraints(x509CertSelector.getBasicConstraints());
        setCertificate(x509CertSelector.getCertificate());
        setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
    }

    public static HashSet a(HashSet hashSet) {
        String str;
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            if (list.size() == 2) {
                Object obj = list.get(0);
                if (obj instanceof Integer) {
                    hashSet2.add(c(((Integer) obj).intValue(), list.get(1)));
                } else {
                    str = "expected an Integer";
                }
            } else {
                str = "name list size not 2";
            }
            ny61.v(str);
            return null;
        }
        return hashSet2;
    }

    public static Extension b(X509Certificate x509Certificate, int i) {
        if (x509Certificate instanceof X509CertImpl) {
            X509CertImpl x509CertImpl = (X509CertImpl) x509Certificate;
            if (i == 0) {
                return x509CertImpl.getPrivateKeyUsageExtension();
            }
            if (i == 1) {
                return x509CertImpl.getSubjectAlternativeNameExtension();
            }
            if (i == 2) {
                return x509CertImpl.getNameConstraintsExtension();
            }
            if (i == 3) {
                return x509CertImpl.getCertificatePoliciesExtension();
            }
            if (i == 4) {
                return x509CertImpl.getExtendedKeyUsageExtension();
            }
        } else {
            byte[] extensionValue = x509Certificate.getExtensionValue(T[i]);
            if (extensionValue != null) {
                byte[] octetString = new DerInputStream(extensionValue).getOctetString();
                Boolean bool = S;
                if (i == 0) {
                    try {
                        return new PrivateKeyUsageExtension(bool, octetString);
                    } catch (CertificateException e) {
                        ny61.v(e.getMessage());
                        return null;
                    }
                }
                if (i == 1) {
                    return new SubjectAlternativeNameExtension(bool, octetString);
                }
                if (i == 2) {
                    return new NameConstraintsExtension(bool, octetString);
                }
                if (i == 3) {
                    return new CertificatePoliciesExtension(bool, octetString);
                }
                if (i == 4) {
                    return new ExtendedKeyUsageExtension(bool, octetString);
                }
            }
        }
        return null;
    }

    public static GeneralNameInterface c(int i, Object obj) {
        String str;
        GeneralNameInterface otherName;
        StringBuilder sb;
        String str2;
        JCPLogger.fine("X509CertSelector.makeGeneralNameInterface(" + i + ")...");
        if (obj instanceof String) {
            JCPLogger.fine("X509CertSelector.makeGeneralNameInterface() name is String: " + obj);
            if (i == 1) {
                otherName = new RFC822Name((String) obj);
            } else if (i == 2) {
                otherName = new DNSName((String) obj);
            } else if (i == 4) {
                otherName = new X500Name((String) obj);
            } else if (i == 6) {
                otherName = new URIName((String) obj);
            } else if (i == 7) {
                otherName = new IPAddressName((String) obj);
            } else if (i == 8) {
                otherName = new OIDName((String) obj);
            } else {
                str2 = "unable to parse String names of type ";
                str = oyr.i(i, str2);
            }
            sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
            sb.append(otherName.toString());
            JCPLogger.fine(sb.toString());
            return otherName;
        }
        if (obj instanceof byte[]) {
            DerValue derValue = new DerValue((byte[]) obj);
            JCPLogger.fine("X509CertSelector.makeGeneralNameInterface() is byte[]");
            switch (i) {
                case 0:
                    otherName = new OtherName(derValue);
                    sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
                    sb.append(otherName.toString());
                    JCPLogger.fine(sb.toString());
                    return otherName;
                case 1:
                    otherName = new RFC822Name(derValue);
                    sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
                    sb.append(otherName.toString());
                    JCPLogger.fine(sb.toString());
                    return otherName;
                case 2:
                    otherName = new DNSName(derValue);
                    sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
                    sb.append(otherName.toString());
                    JCPLogger.fine(sb.toString());
                    return otherName;
                case 3:
                    otherName = new X400Address(derValue);
                    sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
                    sb.append(otherName.toString());
                    JCPLogger.fine(sb.toString());
                    return otherName;
                case 4:
                    otherName = new X500Name(derValue);
                    sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
                    sb.append(otherName.toString());
                    JCPLogger.fine(sb.toString());
                    return otherName;
                case 5:
                    otherName = new EDIPartyName(derValue);
                    sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
                    sb.append(otherName.toString());
                    JCPLogger.fine(sb.toString());
                    return otherName;
                case 6:
                    otherName = new URIName(derValue);
                    sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
                    sb.append(otherName.toString());
                    JCPLogger.fine(sb.toString());
                    return otherName;
                case 7:
                    otherName = new IPAddressName(derValue);
                    sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
                    sb.append(otherName.toString());
                    JCPLogger.fine(sb.toString());
                    return otherName;
                case 8:
                    otherName = new OIDName(derValue);
                    sb = new StringBuilder("X509CertSelector.makeGeneralNameInterface() result: ");
                    sb.append(otherName.toString());
                    JCPLogger.fine(sb.toString());
                    return otherName;
                default:
                    str2 = "unable to parse byte array names of type ";
                    str = oyr.i(i, str2);
                    break;
            }
        } else {
            JCPLogger.fine("X509CertSelector.makeGeneralName() input name not String or byte array");
            str = "name not String or byte array";
        }
        ny61.v(str);
        return null;
    }

    public static Set e(Set set) {
        return set instanceof HashSet ? (Set) ((HashSet) set).clone() : new HashSet(set);
    }

    public static HashSet h(Collection collection) {
        String str;
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(new ArrayList((List) it.next()));
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            if (list.size() == 2) {
                Object obj = list.get(0);
                if (obj instanceof Integer) {
                    int intValue = ((Integer) obj).intValue();
                    if (intValue < 0 || intValue > 8) {
                        str = "name type not 0-8";
                    } else {
                        Object obj2 = list.get(1);
                        boolean z = obj2 instanceof byte[];
                        if (!z && !(obj2 instanceof String)) {
                            JCPLogger.fine("X509CertSelector.cloneAndCheckNames() name not byte array");
                            str = "name not byte array or String";
                        } else if (z) {
                            list.set(1, ((byte[]) obj2).clone());
                        }
                    }
                } else {
                    str = "expected an Integer";
                }
            } else {
                str = "name list size not 2";
            }
            ny61.v(str);
            return null;
        }
        return hashSet;
    }

    public void addPathToName(int i, byte[] bArr) throws IOException {
        i(i, (Serializable) bArr.clone());
    }

    public void addSubjectAlternativeName(int i, byte[] bArr) throws IOException {
        f(i, (Serializable) bArr.clone());
    }

    @Override // java.security.cert.CertSelector
    public Object clone() {
        try {
            X509CertSelector x509CertSelector = (X509CertSelector) super.clone();
            Set set = this.G;
            if (set != null) {
                x509CertSelector.G = e(set);
                x509CertSelector.H = e(this.H);
            }
            if (this.L != null) {
                x509CertSelector.K = e(this.K);
                x509CertSelector.L = e(this.L);
            }
            return x509CertSelector;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString(), e);
        }
    }

    public final boolean d(GeneralSubtrees generalSubtrees) {
        int constrains;
        Iterator it = generalSubtrees.iterator();
        while (it.hasNext()) {
            GeneralNameInterface name = ((GeneralSubtree) it.next()).getName().getName();
            for (GeneralNameInterface generalNameInterface : this.L) {
                if (name.getType() == generalNameInterface.getType() && ((constrains = generalNameInterface.constrains(name)) == 0 || constrains == 2)) {
                    JCPLogger.fine("X509CertSelector.match: name constraints inhibit path to specified name");
                    JCPLogger.fine("X509CertSelector.match: excluded name: " + generalNameInterface);
                    return false;
                }
            }
        }
        return true;
    }

    public final void f(int i, Serializable serializable) {
        GeneralNameInterface c = c(i, serializable);
        if (this.G == null) {
            this.G = new HashSet();
        }
        if (this.H == null) {
            this.H = new HashSet();
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(serializable);
        this.G.add(arrayList);
        this.H.add(c);
    }

    public final boolean g(GeneralSubtrees generalSubtrees) {
        boolean z;
        for (GeneralNameInterface generalNameInterface : this.L) {
            Iterator it = generalSubtrees.iterator();
            String str = "";
            boolean z2 = false;
            while (true) {
                z = z2;
                while (it.hasNext() && !z2) {
                    GeneralNameInterface name = ((GeneralSubtree) it.next()).getName().getName();
                    if (name.getType() == generalNameInterface.getType()) {
                        str = str + "  " + name;
                        int constrains = generalNameInterface.constrains(name);
                        if (constrains == 0 || constrains == 2) {
                            z2 = true;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            if (!z2 && z) {
                JCPLogger.fine("X509CertSelector.match: name constraints inhibit path to specified name; permitted names of type " + generalNameInterface.getType() + ru.CryptoPro.JCP.tools.CertReader.Extension.COLON_SPACE + str);
                return false;
            }
        }
        return true;
    }

    public byte[] getAuthorityKeyIdentifier() {
        byte[] bArr = this.x;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public int getBasicConstraints() {
        return this.O;
    }

    public X509Certificate getCertificate() {
        return this.P;
    }

    public Date getCertificateValid() {
        Date date = this.y;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public Set getExtendedKeyUsage() {
        return this.E;
    }

    public X500Principal getIssuer() {
        return this.b;
    }

    public byte[] getIssuerAsBytes() throws IOException {
        X500Principal x500Principal = this.b;
        if (x500Principal == null) {
            return null;
        }
        return x500Principal.getEncoded();
    }

    public String getIssuerAsString() {
        X500Principal x500Principal = this.b;
        if (x500Principal == null) {
            return null;
        }
        return x500Principal.getName();
    }

    public boolean[] getKeyUsage() {
        boolean[] zArr = this.D;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public boolean getMatchAllSubjectAltNames() {
        return this.Q;
    }

    public byte[] getNameConstraints() {
        byte[] bArr = this.N;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public Collection getPathToNames() {
        Set set = this.K;
        if (set == null) {
            return null;
        }
        try {
            return h(set);
        } catch (IOException e) {
            kbs.g(x4e.d(e, new StringBuilder("cloneNames encountered IOException: ")));
            return null;
        }
    }

    public Set getPolicy() {
        return this.J;
    }

    public Date getPrivateKeyValid() {
        Date date = this.z;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public BigInteger getSerialNumber() {
        return this.a;
    }

    public X500Principal getSubject() {
        return this.c;
    }

    public Collection getSubjectAlternativeNames() {
        Set set = this.G;
        if (set == null) {
            return null;
        }
        try {
            return h(set);
        } catch (IOException e) {
            kbs.g(x4e.d(e, new StringBuilder("cloneNames encountered IOException: ")));
            return null;
        }
    }

    public byte[] getSubjectAsBytes() throws IOException {
        X500Principal x500Principal = this.c;
        if (x500Principal == null) {
            return null;
        }
        return x500Principal.getEncoded();
    }

    public String getSubjectAsString() {
        X500Principal x500Principal = this.c;
        if (x500Principal == null) {
            return null;
        }
        return x500Principal.getName();
    }

    public byte[] getSubjectKeyIdentifier() {
        byte[] bArr = this.w;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public PublicKey getSubjectPublicKey() {
        return this.B;
    }

    public String getSubjectPublicKeyAlgID() {
        ObjectIdentifier objectIdentifier = this.A;
        if (objectIdentifier == null) {
            return null;
        }
        return objectIdentifier.toString();
    }

    public final void i(int i, Serializable serializable) {
        GeneralNameInterface c = c(i, serializable);
        if (this.L == null) {
            this.K = new HashSet();
            this.L = new HashSet();
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(serializable);
        this.K.add(arrayList);
        this.L.add(c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0261, code lost:
    
        if (r2.isEmpty() != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0367, code lost:
    
        if (g(r4) == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
    
        ru.CryptoPro.JCP.tools.JCPLogger.fine("X509CertSelector.match: key usage bits don't match");
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03e8  */
    @Override // java.security.cert.CertSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean match(Certificate certificate) {
        String str;
        String str2;
        String str3;
        DerValue derValue;
        NameConstraintsExtension nameConstraintsExtension;
        String str4;
        StringBuilder sb;
        String str5;
        ExtendedKeyUsageExtension extendedKeyUsageExtension;
        boolean[] keyUsage;
        String sb2;
        boolean z = false;
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (JCPLogger.isFinerEnabled()) {
            JCPLogger.finer("X509CertSelector.match(SN: " + x509Certificate.getSerialNumber().toString(16) + "\n  Issuer: " + x509Certificate.getIssuerDN() + "\n  Subject: " + x509Certificate.getSubjectDN() + ru.CryptoPro.JCP.tools.CertReader.Extension.C_BRAKE);
        }
        X509Certificate x509Certificate2 = this.P;
        if (x509Certificate2 == null || x509Certificate2.equals(x509Certificate)) {
            BigInteger bigInteger = this.a;
            if (bigInteger == null || bigInteger.equals(x509Certificate.getSerialNumber())) {
                X500Principal x500Principal = this.b;
                if (x500Principal == null || Arrays.equals(x500Principal.getEncoded(), x509Certificate.getIssuerX500Principal().getEncoded())) {
                    X500Principal x500Principal2 = this.c;
                    if (x500Principal2 == null || Arrays.equals(x500Principal2.getEncoded(), x509Certificate.getSubjectX500Principal().getEncoded())) {
                        Date date = this.y;
                        if (date != null) {
                            try {
                                x509Certificate.checkValidity(date);
                            } catch (CertificateException unused) {
                                str = "X509CertSelector.match: certificate not within validity period";
                            }
                        }
                        if (this.C != null) {
                            if (!Arrays.equals(this.C, x509Certificate.getPublicKey().getEncoded())) {
                                str = "X509CertSelector.match: subject public keys don't match";
                            }
                        }
                        if (this.O != -1) {
                            int basicConstraints = x509Certificate.getBasicConstraints();
                            int i = this.O;
                            if (i == -2) {
                                if (basicConstraints != -1) {
                                    sb2 = "X509CertSelector.match: not an EE cert";
                                    JCPLogger.fine(sb2);
                                    if (z) {
                                        JCPLogger.fine("X509CertSelector.match returning: true");
                                    }
                                    return z;
                                }
                            } else if (basicConstraints < i) {
                                StringBuilder t = b64.t(basicConstraints, "X509CertSelector.match: cert's maxPathLen is less than the min maxPathLen set by basicConstraints. (", " < ");
                                t.append(this.O);
                                t.append(ru.CryptoPro.JCP.tools.CertReader.Extension.C_BRAKE);
                                sb2 = t.toString();
                                JCPLogger.fine(sb2);
                                if (z) {
                                }
                                return z;
                            }
                        }
                        if (this.D != null && (keyUsage = x509Certificate.getKeyUsage()) != null) {
                            int i2 = 0;
                            while (true) {
                                boolean[] zArr = this.D;
                                if (i2 >= zArr.length) {
                                    break;
                                }
                                if (!zArr[i2] || (i2 < keyUsage.length && keyUsage[i2])) {
                                    i2++;
                                }
                            }
                        }
                        Set set = this.E;
                        if (set != null && !set.isEmpty()) {
                            try {
                                extendedKeyUsageExtension = (ExtendedKeyUsageExtension) b(x509Certificate, 4);
                            } catch (IOException unused2) {
                                JCPLogger.fine("X509CertSelector.match: IOException in extended key usage check");
                            }
                            if (extendedKeyUsageExtension != null) {
                                Vector vector = (Vector) extendedKeyUsageExtension.get(ExtendedKeyUsageExtension.USAGES);
                                if (!vector.contains(R) && !vector.containsAll(this.F)) {
                                    JCPLogger.fine("X509CertSelector.match: cert failed extendedKeyUsage criterion");
                                    if (z) {
                                    }
                                    return z;
                                }
                            }
                        }
                        if (this.w != null) {
                            try {
                                byte[] extensionValue = x509Certificate.getExtensionValue("2.5.29.14");
                                if (extensionValue != null) {
                                    byte[] octetString = new DerInputStream(extensionValue).getOctetString();
                                    str2 = (octetString == null || !Arrays.equals(this.w, octetString)) ? "X509CertSelector.match: subject key IDs don't match" : "X509CertSelector.match: no subject key ID extension";
                                }
                                JCPLogger.fine(str2);
                            } catch (IOException unused3) {
                                JCPLogger.fine("X509CertSelector.match: exception in subject key ID check");
                            }
                            if (z) {
                            }
                            return z;
                        }
                        if (this.x != null) {
                            try {
                                byte[] extensionValue2 = x509Certificate.getExtensionValue("2.5.29.35");
                                if (extensionValue2 != null) {
                                    byte[] octetString2 = new DerInputStream(extensionValue2).getOctetString();
                                    str3 = (octetString2 == null || !Arrays.equals(this.x, octetString2)) ? "X509CertSelector.match: authority key IDs don't match" : "X509CertSelector.match: no authority key ID extension";
                                }
                                JCPLogger.fine(str3);
                            } catch (IOException unused4) {
                                JCPLogger.fine("X509CertSelector.match: exception in authority key ID check");
                            }
                            if (z) {
                            }
                            return z;
                        }
                        String str6 = "n/a";
                        if (this.z != null) {
                            PrivateKeyUsageExtension privateKeyUsageExtension = null;
                            try {
                                try {
                                    PrivateKeyUsageExtension privateKeyUsageExtension2 = (PrivateKeyUsageExtension) b(x509Certificate, 0);
                                    if (privateKeyUsageExtension2 != null) {
                                        try {
                                            privateKeyUsageExtension2.valid(this.z);
                                        } catch (CertificateExpiredException unused5) {
                                            privateKeyUsageExtension = privateKeyUsageExtension2;
                                            try {
                                                str6 = ((Date) privateKeyUsageExtension.get(PrivateKeyUsageExtension.NOT_AFTER)).toString();
                                            } catch (CertificateException unused6) {
                                            }
                                            str5 = "X509CertSelector.match: private key usage not within validity date; ext.NOT_After: ";
                                            sb = unr0.x(str5, str6, "; X509CertSelector: ");
                                            sb.append(toString());
                                            JCPLogger.fine(sb.toString());
                                            if (z) {
                                            }
                                            return z;
                                        } catch (CertificateNotYetValidException unused7) {
                                            privateKeyUsageExtension = privateKeyUsageExtension2;
                                            try {
                                                str6 = ((Date) privateKeyUsageExtension.get(PrivateKeyUsageExtension.NOT_BEFORE)).toString();
                                            } catch (CertificateException unused8) {
                                            }
                                            str5 = "X509CertSelector.match: private key usage not within validity date; ext.NOT_BEFORE: ";
                                            sb = unr0.x(str5, str6, "; X509CertSelector: ");
                                            sb.append(toString());
                                            JCPLogger.fine(sb.toString());
                                            if (z) {
                                            }
                                            return z;
                                        }
                                    }
                                } catch (IOException unused9) {
                                    sb = new StringBuilder("X509CertSelector.match: IOException in private key usage check; X509CertSelector: ");
                                    sb.append(toString());
                                    JCPLogger.fine(sb.toString());
                                    if (z) {
                                    }
                                    return z;
                                }
                            } catch (CertificateExpiredException unused10) {
                            } catch (CertificateNotYetValidException unused11) {
                            }
                        }
                        if (this.A != null) {
                            try {
                                derValue = new DerValue(x509Certificate.getPublicKey().getEncoded());
                            } catch (IOException unused12) {
                                JCPLogger.fine("X509CertSelector.match: IOException in subject public key algorithm OID check");
                            }
                            if (derValue.tag != 48) {
                                throw new IOException("invalid key format");
                            }
                            AlgorithmId parse = AlgorithmId.parse(derValue.data.getDerValue());
                            JCPLogger.fine("X509CertSelector.match: subjectPublicKeyAlgID = " + this.A + ", xcert subjectPublicKeyAlgID = " + parse.getOID());
                            if (!this.A.equals((Object) parse.getOID())) {
                                JCPLogger.fine("X509CertSelector.match: subject public key alg IDs don't match");
                                if (z) {
                                }
                                return z;
                            }
                        }
                        if (this.I != null) {
                            try {
                                CertificatePoliciesExtension certificatePoliciesExtension = (CertificatePoliciesExtension) b(x509Certificate, 3);
                                if (certificatePoliciesExtension == null) {
                                    JCPLogger.fine("X509CertSelector.match: no certificate policy extension");
                                } else {
                                    List list = (List) certificatePoliciesExtension.get(CertificatePoliciesExtension.POLICIES);
                                    ArrayList arrayList = new ArrayList(list.size());
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((PolicyInformation) it.next()).getPolicyIdentifier());
                                    }
                                    CertificatePolicySet certificatePolicySet = this.I;
                                    if (certificatePolicySet != null) {
                                        if (!certificatePolicySet.getCertPolicyIds().isEmpty()) {
                                            Iterator it2 = this.I.getCertPolicyIds().iterator();
                                            while (it2.hasNext()) {
                                                if (arrayList.contains((CertificatePolicyId) it2.next())) {
                                                }
                                            }
                                            JCPLogger.fine("X509CertSelector.match: cert failed policyAny criterion");
                                        }
                                    }
                                }
                            } catch (IOException unused13) {
                                JCPLogger.fine("X509CertSelector.match: IOException in certificate policy ID check");
                            }
                            if (z) {
                            }
                            return z;
                        }
                        Set set2 = this.G;
                        if (set2 != null && !set2.isEmpty()) {
                            try {
                                SubjectAlternativeNameExtension subjectAlternativeNameExtension = (SubjectAlternativeNameExtension) b(x509Certificate, 1);
                                if (subjectAlternativeNameExtension == null) {
                                    str4 = "X509CertSelector.match: no subject alternative name extension";
                                } else {
                                    GeneralNames generalNames = (GeneralNames) subjectAlternativeNameExtension.get(SubjectAlternativeNameExtension.SUBJECT_NAME);
                                    Iterator it3 = this.H.iterator();
                                    while (it3.hasNext()) {
                                        GeneralNameInterface generalNameInterface = (GeneralNameInterface) it3.next();
                                        Iterator it4 = generalNames.iterator();
                                        boolean z2 = false;
                                        while (it4.hasNext() && !z2) {
                                            z2 = ((GeneralName) it4.next()).getName().equals(generalNameInterface);
                                        }
                                        if (!z2 && (this.Q || !it3.hasNext())) {
                                            str4 = "X509CertSelector.match: subject alternative name " + generalNameInterface + " not found";
                                        } else if (z2 && !this.Q) {
                                            break;
                                        }
                                    }
                                }
                                JCPLogger.fine(str4);
                                break;
                            } catch (IOException unused14) {
                                JCPLogger.fine("X509CertSelector.match: IOException in subject alternative name check");
                            }
                            if (z) {
                            }
                            return z;
                        }
                        if (this.L != null) {
                            try {
                                nameConstraintsExtension = (NameConstraintsExtension) b(x509Certificate, 2);
                            } catch (IOException unused15) {
                                JCPLogger.fine("X509CertSelector.match: IOException in name constraints check");
                            }
                            if (nameConstraintsExtension != null) {
                                JCPLogger.fine("X509CertSelector.match pathToNames:\n");
                                Iterator it5 = this.L.iterator();
                                while (it5.hasNext()) {
                                    JCPLogger.fine(ru.CryptoPro.JCP.tools.CertReader.Extension.TAB_CHAR + it5.next() + "\n");
                                }
                                GeneralSubtrees generalSubtrees = (GeneralSubtrees) nameConstraintsExtension.get(NameConstraintsExtension.PERMITTED_SUBTREES);
                                GeneralSubtrees generalSubtrees2 = (GeneralSubtrees) nameConstraintsExtension.get(NameConstraintsExtension.EXCLUDED_SUBTREES);
                                if (generalSubtrees2 == null || d(generalSubtrees2)) {
                                    if (generalSubtrees != null) {
                                    }
                                }
                                if (z) {
                                }
                                return z;
                            }
                        }
                        NameConstraintsExtension nameConstraintsExtension2 = this.M;
                        if (nameConstraintsExtension2 != null) {
                            try {
                            } catch (IOException unused16) {
                                JCPLogger.fine("X509CertSelector.match: IOException in name constraints check");
                            }
                            if (!nameConstraintsExtension2.verify(x509Certificate)) {
                                JCPLogger.fine("X509CertSelector.match: name constraints not satisfied");
                                if (z) {
                                }
                                return z;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                        return z;
                    }
                    str = "X509CertSelector.match: subject DNs don't match";
                } else {
                    str = "X509CertSelector.match: issuer DNs don't match";
                }
            } else {
                str = "X509CertSelector.match: serial numbers don't match";
            }
        } else {
            str = "X509CertSelector.match: certs don't match";
        }
        JCPLogger.fine(str);
        return false;
    }

    public void setAuthorityKeyIdentifier(byte[] bArr) {
        this.x = bArr == null ? null : (byte[]) bArr.clone();
    }

    public void setBasicConstraints(int i) {
        if (i >= -2) {
            this.O = i;
        } else {
            ny61.g("basic constraints less than -2");
        }
    }

    public void setCertificate(X509Certificate x509Certificate) {
        this.P = x509Certificate;
    }

    public void setCertificateValid(Date date) {
        this.y = date == null ? null : (Date) date.clone();
    }

    public void setExtendedKeyUsage(Set set) throws IOException {
        if (set == null || set.isEmpty()) {
            this.E = null;
            this.F = null;
            return;
        }
        this.E = Collections.unmodifiableSet(new HashSet(set));
        this.F = new HashSet();
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            this.F.add(new ObjectIdentifier((String) it.next()));
        }
    }

    public void setIssuer(byte[] bArr) throws IOException {
        X500Principal x500Principal;
        if (bArr == null) {
            x500Principal = null;
        } else {
            try {
                x500Principal = new X500Principal(bArr);
            } catch (IllegalArgumentException e) {
                dac.g("Invalid name", e);
                return;
            }
        }
        this.b = x500Principal;
    }

    public void setKeyUsage(boolean[] zArr) {
        this.D = zArr == null ? null : (boolean[]) zArr.clone();
    }

    public void setMatchAllSubjectAltNames(boolean z) {
        this.Q = z;
    }

    public void setNameConstraints(byte[] bArr) throws IOException {
        if (bArr == null) {
            this.N = null;
            this.M = null;
        } else {
            this.N = (byte[]) bArr.clone();
            this.M = new NameConstraintsExtension(S, bArr);
        }
    }

    public void setPathToNames(Collection collection) throws IOException {
        if (collection == null || collection.isEmpty()) {
            this.K = null;
            this.L = null;
        } else {
            HashSet h = h(collection);
            this.L = a(h);
            this.K = h;
        }
    }

    public void setPolicy(Set set) throws IOException {
        if (set == null) {
            this.J = null;
            this.I = null;
            return;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(set));
        Vector vector = new Vector();
        for (Object obj : unmodifiableSet) {
            if (!(obj instanceof String)) {
                ny61.v("non String in certPolicySet");
                return;
            }
            vector.add(new CertificatePolicyId(new ObjectIdentifier((String) obj)));
        }
        this.J = unmodifiableSet;
        this.I = new CertificatePolicySet(vector);
    }

    public void setPrivateKeyValid(Date date) {
        this.z = date == null ? null : (Date) date.clone();
    }

    public void setSerialNumber(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public void setSubject(byte[] bArr) throws IOException {
        X500Principal x500Principal;
        if (bArr == null) {
            x500Principal = null;
        } else {
            try {
                x500Principal = new X500Principal(bArr);
            } catch (IllegalArgumentException e) {
                dac.g("Invalid name", e);
                return;
            }
        }
        this.c = x500Principal;
    }

    public void setSubjectAlternativeNames(Collection collection) throws IOException {
        if (collection == null) {
            this.G = null;
            this.H = null;
        } else if (collection.isEmpty()) {
            this.G = null;
            this.H = null;
        } else {
            HashSet h = h(collection);
            this.H = a(h);
            this.G = h;
        }
    }

    public void setSubjectKeyIdentifier(byte[] bArr) {
        this.w = bArr == null ? null : (byte[]) bArr.clone();
    }

    public void setSubjectPublicKey(byte[] bArr) throws IOException {
        if (bArr == null) {
            this.B = null;
            this.C = null;
        } else {
            byte[] bArr2 = (byte[]) bArr.clone();
            this.C = bArr2;
            this.B = X509Key.parse(new DerValue(bArr2));
        }
    }

    public void setSubjectPublicKeyAlgID(String str) throws IOException {
        if (str == null) {
            this.A = null;
        } else {
            this.A = new ObjectIdentifier(str);
        }
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("X509CertSelector: [\n");
        if (this.P != null) {
            stringBuffer.append("  Certificate: " + this.P.toString() + "\n");
        }
        if (this.a != null) {
            stringBuffer.append("  Serial Number: " + this.a.toString() + "\n");
        }
        if (this.b != null) {
            stringBuffer.append("  Issuer: " + getIssuerAsString() + "\n");
        }
        if (this.c != null) {
            stringBuffer.append("  Subject: " + getSubjectAsString() + "\n");
        }
        stringBuffer.append("  matchAllSubjectAltNames flag: " + String.valueOf(this.Q) + "\n");
        if (this.G != null) {
            stringBuffer.append("  SubjectAlternativeNames:\n");
            for (List list : this.G) {
                stringBuffer.append("    type " + list.get(0) + ", name " + list.get(1) + "\n");
            }
        }
        if (this.w != null) {
            stringBuffer.append("  Subject Key Identifier: " + new HexDumpEncoder().encodeBuffer(this.w) + "\n");
        }
        if (this.x != null) {
            stringBuffer.append("  Authority Key Identifier: " + new HexDumpEncoder().encodeBuffer(this.x) + "\n");
        }
        if (this.y != null) {
            stringBuffer.append("  Certificate Valid: " + this.y.toString() + "\n");
        }
        if (this.z != null) {
            stringBuffer.append("  Private Key Valid: " + this.z.toString() + "\n");
        }
        if (this.A != null) {
            stringBuffer.append("  Subject Public Key AlgID: " + this.A.toString() + "\n");
        }
        if (this.B != null) {
            stringBuffer.append("  Subject Public Key: " + this.B.toString() + "\n");
        }
        if (this.D != null) {
            StringBuilder sb = new StringBuilder("  Key Usage: ");
            boolean[] zArr = this.D;
            str = "KeyUsage [\n";
            try {
                str = zArr[0] ? "KeyUsage [\n  DigitalSignature\n" : "KeyUsage [\n";
                if (zArr[1]) {
                    str = str.concat("  Non_repudiation\n");
                }
                if (zArr[2]) {
                    str = str.concat("  Key_Encipherment\n");
                }
                if (zArr[3]) {
                    str = str.concat("  Data_Encipherment\n");
                }
                if (zArr[4]) {
                    str = str.concat("  Key_Agreement\n");
                }
                if (zArr[5]) {
                    str = str.concat("  Key_CertSign\n");
                }
                if (zArr[6]) {
                    str = str.concat("  Crl_Sign\n");
                }
                if (zArr[7]) {
                    str = str.concat("  Encipher_Only\n");
                }
                if (zArr[8]) {
                    str = str.concat("  Decipher_Only\n");
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            sb.append(str.concat("]\n"));
            sb.append("\n");
            stringBuffer.append(sb.toString());
        }
        if (this.E != null) {
            stringBuffer.append("  Extended Key Usage: " + this.E.toString() + "\n");
        }
        if (this.I != null) {
            stringBuffer.append("  Policy: " + this.I.toString() + "\n");
        }
        if (this.L != null) {
            stringBuffer.append("  Path to names:\n");
            Iterator it = this.L.iterator();
            while (it.hasNext()) {
                stringBuffer.append(ru.CryptoPro.JCP.tools.CertReader.Extension.TAB_CHAR + it.next() + "\n");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public void addPathToName(int i, String str) throws IOException {
        i(i, str);
    }

    public void addSubjectAlternativeName(int i, String str) throws IOException {
        f(i, str);
    }

    public void setIssuer(X500Principal x500Principal) {
        this.b = x500Principal;
    }

    public void setSubject(X500Principal x500Principal) {
        this.c = x500Principal;
    }

    public void setIssuer(String str) throws IOException {
        this.b = str == null ? null : new X500Name(str).asX500Principal();
    }

    public void setSubject(String str) throws IOException {
        this.c = str == null ? null : new X500Name(str).asX500Principal();
    }

    public void setSubjectPublicKey(PublicKey publicKey) {
        byte[] encoded;
        if (publicKey == null) {
            encoded = null;
            this.B = null;
        } else {
            this.B = publicKey;
            encoded = publicKey.getEncoded();
        }
        this.C = encoded;
    }

    public X509CertSelector() {
    }
}
