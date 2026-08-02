package ru.CryptoPro.AdES.evidence.crl.rfc3280;

import defpackage.a2;
import defpackage.ayo;
import defpackage.b3;
import defpackage.b8x;
import defpackage.dqf;
import defpackage.dy31;
import defpackage.e2;
import defpackage.fxs;
import defpackage.g2k;
import defpackage.g490;
import defpackage.g8e;
import defpackage.gxs;
import defpackage.h0j;
import defpackage.h2k;
import defpackage.h490;
import defpackage.i3;
import defpackage.i490;
import defpackage.j2;
import defpackage.j490;
import defpackage.j97;
import defpackage.jc51;
import defpackage.kbs;
import defpackage.l2;
import defpackage.l490;
import defpackage.m490;
import defpackage.ncc;
import defpackage.nju0;
import defpackage.ny61;
import defpackage.qm3;
import defpackage.qwd0;
import defpackage.ryh;
import defpackage.rza1;
import defpackage.u2;
import defpackage.w2;
import defpackage.w4i0;
import defpackage.xr1;
import defpackage.zyu0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.a;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.ReasonFlags;

/* loaded from: classes4.dex */
class CertPathValidatorUtilities {
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final PKIXCRLUtil CRL_UTIL = new PKIXCRLUtil();
    protected static final String CERTIFICATE_POLICIES = ayo.J.a;
    protected static final String BASIC_CONSTRAINTS = ayo.B.a;
    protected static final String POLICY_MAPPINGS = ayo.K.a;
    protected static final String SUBJECT_ALTERNATIVE_NAME = ayo.z.a;
    protected static final String NAME_CONSTRAINTS = ayo.H.a;
    protected static final String KEY_USAGE = ayo.y.a;
    protected static final String INHIBIT_ANY_POLICY = ayo.O.a;
    protected static final String ISSUING_DISTRIBUTION_POINT = ayo.F.a;
    protected static final String DELTA_CRL_INDICATOR = ayo.E.a;
    protected static final String POLICY_CONSTRAINTS = ayo.M.a;
    protected static final String FRESHEST_CRL = ayo.N.a;
    protected static final String CRL_DISTRIBUTION_POINTS = ayo.I.a;
    protected static final String AUTHORITY_KEY_IDENTIFIER = ayo.L.a;
    protected static final String CRL_NUMBER = ayo.C.a;
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", ReasonFlags.SUPERSEDED, "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    public static void checkCRLsNotEmpty(Set set, Object obj) throws AnnotatedException {
        if (set.isEmpty()) {
            throw new AnnotatedException("No CRLs found for issuer \"" + w4i0.e.d(PrincipalUtils.getIssuerPrincipal((X509Certificate) obj)) + "\"", null);
        }
    }

    public static Collection findCertificates(j490 j490Var, List list) throws AnnotatedException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : list) {
            if (obj instanceof nju0) {
                linkedHashSet.addAll(((ncc) ((nju0) obj)).a(j490Var));
            } else {
                try {
                    linkedHashSet.addAll(((CertStore) obj).getCertificates(new i490(j490Var)));
                } catch (CertStoreException e) {
                    h490.b(e, "Problem while picking certificates from certificate store.");
                    return null;
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection findIssuerCerts(X509Certificate x509Certificate, List<CertStore> list, List<Object> list2) throws AnnotatedException {
        String str;
        j490 j490Var;
        LinkedHashSet linkedHashSet;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509Certificate).getEncoded());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(AUTHORITY_KEY_IDENTIFIER);
                if (extensionValue != null) {
                    w2 w2Var = qm3.m(w2.x(extensionValue).a).a;
                    byte[] bArr = w2Var != null ? w2Var.a : null;
                    if (bArr != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new dqf(bArr).getEncoded());
                    }
                }
            } catch (Exception unused) {
            }
            j490Var = new j490((CertSelector) x509CertSelector.clone());
            linkedHashSet = new LinkedHashSet();
        } catch (IOException e) {
            e = e;
            str = "Subject criteria for certificate selector to find issuer certificate could not be set.";
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(findCertificates(j490Var, list));
            arrayList.addAll(findCertificates(j490Var, list2));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add((X509Certificate) it.next());
            }
            return linkedHashSet;
        } catch (AnnotatedException e2) {
            e = e2;
            str = "Issuer certificate cannot be searched.";
            h490.b(e, str);
            return null;
        }
    }

    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set, String str) throws AnnotatedException {
        X509CertSelector x509CertSelector = new X509CertSelector();
        jc51 encodedIssuerPrincipal = PrincipalUtils.getEncodedIssuerPrincipal(x509Certificate);
        try {
            x509CertSelector.setSubject(encodedIssuerPrincipal.getEncoded());
            Iterator it = set.iterator();
            TrustAnchor trustAnchor = null;
            Exception e = null;
            PublicKey publicKey = null;
            while (it.hasNext() && trustAnchor == null) {
                trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        publicKey = trustAnchor.getTrustedCert().getPublicKey();
                    }
                    trustAnchor = null;
                } else {
                    if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null) {
                        try {
                            if (encodedIssuerPrincipal.equals(PrincipalUtils.getCA(trustAnchor))) {
                                publicKey = trustAnchor.getCAPublicKey();
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    trustAnchor = null;
                }
                if (publicKey != null) {
                    try {
                        verifyX509Certificate(x509Certificate, publicKey, str);
                    } catch (Exception e2) {
                        e = e2;
                        trustAnchor = null;
                        publicKey = null;
                    }
                }
            }
            if (trustAnchor != null || e == null) {
                return trustAnchor;
            }
            h490.b(e, "TrustAnchor found but certificate validation failed.");
            return null;
        } catch (IOException e3) {
            h490.b(e3, "Cannot set subject search criteria for trust anchor.");
            return null;
        }
    }

    public static List<Object> getAdditionalStoresFromAltNames(byte[] bArr, Map<fxs, Object> map) throws CertificateParsingException {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        fxs[] n = gxs.m(w2.x(bArr).a).n();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != n.length; i++) {
            if (map.get(n[i]) != null) {
                ny61.u();
                return null;
            }
        }
        return arrayList;
    }

    public static List<Object> getAdditionalStoresFromCRLDistributionPoint(j97 j97Var, Map<fxs, Object> map) throws AnnotatedException {
        if (j97Var == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            g2k[] m = j97Var.m();
            ArrayList arrayList = new ArrayList();
            for (g2k g2kVar : m) {
                h2k h2kVar = g2kVar.a;
                if (h2kVar != null && h2kVar.b == 0) {
                    for (fxs fxsVar : gxs.m(h2kVar.a).n()) {
                        if (map.get(fxsVar) != null) {
                            ny61.u();
                            return null;
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            h490.b(e, "Distribution points could not be read.");
            return null;
        }
    }

    public static xr1 getAlgorithmIdentifier(PublicKey publicKey) throws CertPathValidatorException {
        try {
            return zyu0.m(new j2(publicKey.getEncoded()).n()).a;
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e);
        }
    }

    public static void getCRLIssuersFromDistributionPoint(g2k g2kVar, Collection collection, X509CRLSelector x509CRLSelector) throws AnnotatedException {
        ArrayList arrayList = new ArrayList();
        gxs gxsVar = g2kVar.c;
        if (gxsVar != null) {
            for (fxs fxsVar : gxsVar.n()) {
                if (fxsVar.b == 4) {
                    try {
                        arrayList.add(jc51.m(fxsVar.a.toASN1Primitive().getEncoded()));
                    } catch (IOException e) {
                        h490.b(e, "CRL issuer information from distribution point cannot be decoded.");
                        return;
                    }
                }
            }
        } else if (g2kVar.a == null) {
            h490.b(null, "CRL issuer is omitted from distribution point but no distributionPoint field present.");
            return;
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                x509CRLSelector.addIssuerName(((jc51) it2.next()).getEncoded());
            } catch (IOException e2) {
                h490.b(e2, "Cannot decode CRL issuer information.");
                return;
            }
        }
    }

    public static void getCertStatus(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        String str;
        X509CRLEntry revokedCertificate;
        e2 x;
        JCPLogger.subEnter();
        try {
            if (a.a(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj));
                if (revokedCertificate == null) {
                    return;
                }
                X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(certificateIssuer == null ? PrincipalUtils.getIssuerPrincipal(x509crl) : jc51.m(certificateIssuer.getEncoded()))) {
                    return;
                }
            } else if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(PrincipalUtils.getIssuerPrincipal(x509crl)) || (revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj))) == null) {
                return;
            }
            if (revokedCertificate.hasExtensions()) {
                try {
                    x = e2.x(getExtensionValue(revokedCertificate, ayo.D.a));
                } catch (Exception e) {
                    e = e;
                    str = "Reason code CRL entry extension could not be decoded.";
                    h490.b(e, str);
                    return;
                }
            } else {
                x = null;
            }
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || x == null || x.y().intValue() == 0 || x.y().intValue() == 1 || x.y().intValue() == 2 || x.y().intValue() == 8) {
                certStatus.setCertStatus(x != null ? x.y().intValue() : 0);
                certStatus.setRevocationDate(revokedCertificate.getRevocationDate());
            }
            JCPLogger.subExit();
        } catch (CRLException e2) {
            e = e2;
            str = "Failed check for indirect CRL.";
        }
    }

    public static Set getCompleteCRLs(g2k g2kVar, Object obj, Date date, l490 l490Var) throws AnnotatedException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(PrincipalUtils.getEncodedIssuerPrincipal(obj));
            getCRLIssuersFromDistributionPoint(g2kVar, hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            h0j h0jVar = new h0j(x509CRLSelector);
            h0jVar.a = true;
            g490 g490Var = new g490(h0jVar);
            l490Var.a();
            Set findCRLs = CRL_UTIL.findCRLs(g490Var, l490Var.a(), l490Var.a.getCertStores(), l490Var.x);
            checkCRLsNotEmpty(findCRLs, obj);
            return findCRLs;
        } catch (AnnotatedException e) {
            h490.b(e, "Could not get issuer information from distribution point.");
            return null;
        }
    }

    public static Set getDeltaCRLs(Date date, X509CRL x509crl, List<CertStore> list, List<Object> list2) throws AnnotatedException {
        String str;
        BigInteger bigInteger;
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            try {
                b3 extensionValue = getExtensionValue(x509crl, CRL_NUMBER);
                if (extensionValue != null) {
                    l2 u = l2.u(extensionValue);
                    u.getClass();
                    bigInteger = new BigInteger(1, u.a);
                } else {
                    bigInteger = null;
                }
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
                    x509CRLSelector.setMinCRLNumber(bigInteger != null ? bigInteger.add(BigInteger.valueOf(1L)) : null);
                    h0j h0jVar = new h0j(x509CRLSelector);
                    h0jVar.e = rza1.b(extensionValue2);
                    h0jVar.b = true;
                    h0jVar.d = bigInteger;
                    Set<X509CRL> findCRLs = CRL_UTIL.findCRLs(new g490(h0jVar), date, list, list2);
                    HashSet hashSet = new HashSet();
                    for (X509CRL x509crl2 : findCRLs) {
                        if (isDeltaCRL(x509crl2)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (Exception e) {
                    e = e;
                    str = "Issuing distribution point extension value could not be read.";
                    h490.b(e, str);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                str = "CRL number extension could not be extracted from CRL.";
            }
        } catch (IOException e3) {
            e = e3;
            str = "Cannot extract issuer from CRL.";
        }
    }

    public static b3 getExtensionValue(X509Extension x509Extension, String str) throws AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getObject(str, extensionValue);
    }

    public static PublicKey getNextWorkingKey(List list, int i, b8x b8xVar) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i++;
            if (i >= list.size()) {
                dy31.r("DSA parameters cannot be inherited from previous certificate.");
                return null;
            }
            PublicKey publicKey2 = ((X509Certificate) list.get(i)).getPublicKey();
            if (!(publicKey2 instanceof DSAPublicKey)) {
                dy31.r("DSA parameters cannot be inherited from previous certificate.");
                return null;
            }
            dSAPublicKey = (DSAPublicKey) publicKey2;
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return b8xVar.e().generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e) {
            kbs.g(e.getMessage());
            return null;
        }
    }

    private static b3 getObject(String str, byte[] bArr) throws AnnotatedException {
        try {
            return new j2(((w2) new j2(bArr).n()).a).n();
        } catch (Exception e) {
            throw new AnnotatedException(g8e.o("exception processing extension ", str), e);
        }
    }

    public static final Set getQualifierSet(i3 i3Var) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (i3Var != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ryh ryhVar = new ryh(5, byteArrayOutputStream);
            Enumeration B = i3Var.B();
            while (B.hasMoreElements()) {
                try {
                    a2 a2Var = (a2) B.nextElement();
                    if (a2Var == null) {
                        throw new IOException("null object detected");
                    }
                    a2Var.toASN1Primitive().n(ryhVar, true);
                    hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                    byteArrayOutputStream.reset();
                } catch (IOException e) {
                    throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e);
                }
            }
        }
        return hashSet;
    }

    private static BigInteger getSerialNumber(Object obj) {
        return ((X509Certificate) obj).getSerialNumber();
    }

    public static Date getValidCertDateFromValidityModel(l490 l490Var, CertPath certPath, int i) throws AnnotatedException {
        l490Var.getClass();
        return getValidDate(l490Var);
    }

    public static Date getValidDate(l490 l490Var) {
        return l490Var.a();
    }

    public static boolean isAnyPolicy(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    private static boolean isDeltaCRL(X509CRL x509crl) {
        Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        return criticalExtensionOIDs.contains(RFC3280CRLUtility.DELTA_CRL_INDICATOR);
    }

    public static boolean isIssuerTrustAnchor(X509Certificate x509Certificate, Set set, String str) throws AnnotatedException {
        return findTrustAnchor(x509Certificate, set, str) != null;
    }

    public static boolean isSelfIssued(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static void prepareNextCertB1(int i, List[] listArr, String str, Map map, X509Certificate x509Certificate) throws AnnotatedException, CertPathValidatorException {
        Set set;
        for (m490 m490Var : listArr[i]) {
            if (m490Var.f.equals(str)) {
                m490Var.c = (Set) map.get(str);
                return;
            }
        }
        for (m490 m490Var2 : listArr[i]) {
            if ("2.5.29.32.0".equals(m490Var2.f)) {
                try {
                    Enumeration B = i3.z(getExtensionValue(x509Certificate, CERTIFICATE_POLICIES)).B();
                    while (true) {
                        if (!B.hasMoreElements()) {
                            set = null;
                            break;
                        }
                        try {
                            qwd0 m = qwd0.m(B.nextElement());
                            if ("2.5.29.32.0".equals(m.a.a)) {
                                try {
                                    set = getQualifierSet(m.b);
                                    break;
                                } catch (CertPathValidatorException e) {
                                    throw new ExtCertPathValidatorException("Policy qualifier info set could not be built.", e);
                                }
                            }
                        } catch (Exception e2) {
                            h490.b(e2, "Policy information cannot be decoded.");
                            return;
                        }
                    }
                    Set set2 = set;
                    boolean contains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(CERTIFICATE_POLICIES) : false;
                    m490 m490Var3 = (m490) m490Var2.d;
                    if ("2.5.29.32.0".equals(m490Var3.f)) {
                        m490 m490Var4 = new m490(new ArrayList(), i, (Set) map.get(str), m490Var3, set2, str, contains);
                        m490Var3.a.add(m490Var4);
                        m490Var4.d = m490Var3;
                        listArr[i].add(m490Var4);
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    h490.b(e3, "Certificate policies cannot be decoded.");
                    return;
                }
            }
        }
    }

    public static m490 prepareNextCertB2(int i, List[] listArr, String str, m490 m490Var) {
        int i2;
        Iterator it = listArr[i].iterator();
        while (it.hasNext()) {
            m490 m490Var2 = (m490) it.next();
            if (m490Var2.f.equals(str)) {
                ((m490) m490Var2.d).a.remove(m490Var2);
                it.remove();
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    List list = listArr[i3];
                    while (i2 < list.size()) {
                        m490 m490Var3 = (m490) list.get(i2);
                        i2 = (m490Var3.a.isEmpty() && (m490Var = removePolicyNode(m490Var, listArr, m490Var3)) == null) ? 0 : i2 + 1;
                    }
                }
            }
        }
        return m490Var;
    }

    public static boolean processCertD1i(int i, List[] listArr, u2 u2Var, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            m490 m490Var = (m490) list.get(i2);
            if (m490Var.c.contains(u2Var.a)) {
                HashSet hashSet = new HashSet();
                hashSet.add(u2Var.a);
                m490 m490Var2 = new m490(new ArrayList(), i, hashSet, m490Var, set, u2Var.a, false);
                m490Var.a.add(m490Var2);
                m490Var2.d = m490Var;
                listArr[i].add(m490Var2);
                return true;
            }
        }
        return false;
    }

    public static void processCertD1ii(int i, List[] listArr, u2 u2Var, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            m490 m490Var = (m490) list.get(i2);
            if ("2.5.29.32.0".equals(m490Var.f)) {
                HashSet hashSet = new HashSet();
                hashSet.add(u2Var.a);
                m490 m490Var2 = new m490(new ArrayList(), i, hashSet, m490Var, set, u2Var.a, false);
                m490Var.a.add(m490Var2);
                m490Var2.d = m490Var;
                listArr[i].add(m490Var2);
                return;
            }
        }
    }

    public static m490 removePolicyNode(m490 m490Var, List[] listArr, m490 m490Var2) {
        m490 m490Var3 = (m490) m490Var2.d;
        if (m490Var == null) {
            return null;
        }
        if (m490Var3 != null) {
            m490Var3.a.remove(m490Var2);
            removePolicyNodeRecurse(listArr, m490Var2);
            return m490Var;
        }
        for (int i = 0; i < listArr.length; i++) {
            listArr[i] = new ArrayList();
        }
        return null;
    }

    private static void removePolicyNodeRecurse(List[] listArr, m490 m490Var) {
        listArr[m490Var.b].remove(m490Var);
        ArrayList arrayList = m490Var.a;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removePolicyNodeRecurse(listArr, (m490) it.next());
        }
    }

    public static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }

    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set) throws AnnotatedException {
        return findTrustAnchor(x509Certificate, set, null);
    }
}
