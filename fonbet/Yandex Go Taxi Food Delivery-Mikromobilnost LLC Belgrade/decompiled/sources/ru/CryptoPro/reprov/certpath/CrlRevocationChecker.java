package ru.CryptoPro.reprov.certpath;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import defpackage.dy31;
import defpackage.er61;
import defpackage.g8e;
import defpackage.ku61;
import defpackage.ny61;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CRLReason;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions.CertificateAndCrlMatchingTechnique;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.reprov.JCPPKIXBuilderParameters;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.x509.AccessDescription;
import ru.CryptoPro.reprov.x509.AuthorityInfoAccessExtension;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.CryptoPro.reprov.x509.DistributionPoint;
import ru.CryptoPro.reprov.x509.GeneralName;
import ru.CryptoPro.reprov.x509.GeneralNames;
import ru.CryptoPro.reprov.x509.PKIXExtensions;
import ru.CryptoPro.reprov.x509.ReasonFlags;
import ru.CryptoPro.reprov.x509.X500Name;
import ru.CryptoPro.reprov.x509.X509CRLEntryImpl;

/* loaded from: classes4.dex */
public class CrlRevocationChecker extends PKIXCertPathChecker {
    public static final boolean[] E = {false, false, false, false, false, false, true};
    public static final boolean[] F = {true, true, true, true, true, true, true, true, true};
    public ArrayList A;
    public final PKIXParameters B;
    public final boolean C;
    public int D;
    public final TrustAnchor a;
    public final ArrayList b;
    public final String c;
    public final Date w;
    public PublicKey x;
    public boolean y;
    public ArrayList z;

    public class CertificateRevokedException extends CertPathValidatorException {
    }

    class RejectKeySelector extends java.security.cert.X509CertSelector {
        public final HashSet a;

        public RejectKeySelector(HashSet hashSet) {
            this.a = hashSet;
        }

        @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
        public boolean match(Certificate certificate) {
            if (!super.match(certificate)) {
                return false;
            }
            if (this.a.contains(certificate.getPublicKey())) {
                JCPLogger.finer("RejectCertSelector.match: bad key");
                return false;
            }
            JCPLogger.finer("RejectCertSelector.match: returning true");
            return true;
        }

        @Override // java.security.cert.X509CertSelector
        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("RejectCertSelector: [\n");
            stringBuffer.append(super.toString());
            stringBuffer.append(this.a);
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
    }

    public CrlRevocationChecker(TrustAnchor trustAnchor, PKIXParameters pKIXParameters, boolean z) {
        this.C = false;
        this.D = 0;
        this.a = trustAnchor;
        this.B = pKIXParameters;
        this.b = new ArrayList(pKIXParameters.getCertStores());
        this.c = pKIXParameters.getSigProvider();
        Date date = pKIXParameters.getDate();
        this.w = date == null ? new Date() : date;
        this.C = z;
        init(false);
    }

    public static boolean c(X509CRL x509crl, X509Certificate x509Certificate) {
        JCPLogger.finer("***rfcVerify");
        if (x509crl.getIssuerDN().equals(x509Certificate.getIssuerDN())) {
            JCPLogger.finer("***ok");
            return true;
        }
        JCPLogger.finer("***crl issuer does not equal cert issuer");
        return false;
    }

    public static boolean e(X509Certificate x509Certificate) {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null) {
            return keyUsage[6];
        }
        return false;
    }

    public static boolean f(X509CRL x509crl, X509Certificate x509Certificate, String str, PublicKey publicKey) {
        JCPLogger.finer("***msVerify");
        if (c(x509crl, x509Certificate)) {
            String str2 = ku61.a;
            byte[] extensionValue = x509Certificate.getExtensionValue("2.5.29.35");
            String a = extensionValue != null ? ku61.a(extensionValue) : null;
            byte[] extensionValue2 = x509crl.getExtensionValue("2.5.29.35");
            String a2 = extensionValue2 != null ? ku61.a(extensionValue2) : null;
            if (a == null || a2 == null || a.equals(a2)) {
                JCPLogger.finer("***verify CRL and certificate signature, provider = " + str);
                try {
                    if (str != null) {
                        x509crl.verify(publicKey, str);
                        x509Certificate.verify(publicKey, str);
                    } else {
                        x509crl.verify(publicKey);
                        x509Certificate.verify(publicKey);
                    }
                    JCPLogger.finer("***ok");
                    return true;
                } catch (Exception e) {
                    JCPLogger.subThrown(e);
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0360 A[Catch: InvalidAlgorithmParameterException -> 0x012d, CertPathBuilderException -> 0x0301, TryCatch #6 {CertPathBuilderException -> 0x0301, blocks: (B:123:0x035c, B:125:0x0360, B:129:0x036a, B:130:0x0371, B:132:0x0372, B:166:0x02f7, B:168:0x02fe, B:176:0x030c, B:178:0x0312, B:203:0x031b, B:204:0x031c, B:207:0x0350), top: B:122:0x035c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fe A[Catch: InvalidAlgorithmParameterException -> 0x012d, CertPathBuilderException -> 0x0301, CertPathValidatorException -> 0x0304, TRY_LEAVE, TryCatch #5 {CertPathValidatorException -> 0x0304, blocks: (B:166:0x02f7, B:168:0x02fe), top: B:165:0x02f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x027e A[Catch: InvalidAlgorithmParameterException -> 0x012d, CertPathBuilderException -> 0x0184, TRY_LEAVE, TryCatch #18 {CertPathBuilderException -> 0x0184, blocks: (B:60:0x01a8, B:62:0x01be, B:64:0x01c7, B:65:0x01cb, B:67:0x01d1, B:69:0x01dd, B:72:0x01eb, B:74:0x01ef, B:77:0x01f4, B:80:0x01f8, B:83:0x0200, B:84:0x0203, B:89:0x022f, B:91:0x023c, B:92:0x0245, B:94:0x0252, B:95:0x025a, B:97:0x026b, B:100:0x0281, B:104:0x028d, B:107:0x0297, B:110:0x02a5, B:113:0x02ac, B:117:0x02b9, B:161:0x02e2, B:163:0x02ef, B:213:0x026f, B:215:0x027e, B:217:0x01e6, B:219:0x0209, B:221:0x0218, B:224:0x021d, B:225:0x0221, B:226:0x01c2, B:240:0x015f, B:241:0x0168, B:243:0x016e, B:245:0x0180, B:250:0x0190), top: B:59:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023c A[Catch: InvalidAlgorithmParameterException -> 0x012d, CertPathBuilderException -> 0x0184, TryCatch #18 {CertPathBuilderException -> 0x0184, blocks: (B:60:0x01a8, B:62:0x01be, B:64:0x01c7, B:65:0x01cb, B:67:0x01d1, B:69:0x01dd, B:72:0x01eb, B:74:0x01ef, B:77:0x01f4, B:80:0x01f8, B:83:0x0200, B:84:0x0203, B:89:0x022f, B:91:0x023c, B:92:0x0245, B:94:0x0252, B:95:0x025a, B:97:0x026b, B:100:0x0281, B:104:0x028d, B:107:0x0297, B:110:0x02a5, B:113:0x02ac, B:117:0x02b9, B:161:0x02e2, B:163:0x02ef, B:213:0x026f, B:215:0x027e, B:217:0x01e6, B:219:0x0209, B:221:0x0218, B:224:0x021d, B:225:0x0221, B:226:0x01c2, B:240:0x015f, B:241:0x0168, B:243:0x016e, B:245:0x0180, B:250:0x0190), top: B:59:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0252 A[Catch: InvalidAlgorithmParameterException -> 0x012d, CertPathBuilderException -> 0x0184, TryCatch #18 {CertPathBuilderException -> 0x0184, blocks: (B:60:0x01a8, B:62:0x01be, B:64:0x01c7, B:65:0x01cb, B:67:0x01d1, B:69:0x01dd, B:72:0x01eb, B:74:0x01ef, B:77:0x01f4, B:80:0x01f8, B:83:0x0200, B:84:0x0203, B:89:0x022f, B:91:0x023c, B:92:0x0245, B:94:0x0252, B:95:0x025a, B:97:0x026b, B:100:0x0281, B:104:0x028d, B:107:0x0297, B:110:0x02a5, B:113:0x02ac, B:117:0x02b9, B:161:0x02e2, B:163:0x02ef, B:213:0x026f, B:215:0x027e, B:217:0x01e6, B:219:0x0209, B:221:0x0218, B:224:0x021d, B:225:0x0221, B:226:0x01c2, B:240:0x015f, B:241:0x0168, B:243:0x016e, B:245:0x0180, B:250:0x0190), top: B:59:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026b A[Catch: InvalidAlgorithmParameterException -> 0x012d, CertPathBuilderException -> 0x0184, TryCatch #18 {CertPathBuilderException -> 0x0184, blocks: (B:60:0x01a8, B:62:0x01be, B:64:0x01c7, B:65:0x01cb, B:67:0x01d1, B:69:0x01dd, B:72:0x01eb, B:74:0x01ef, B:77:0x01f4, B:80:0x01f8, B:83:0x0200, B:84:0x0203, B:89:0x022f, B:91:0x023c, B:92:0x0245, B:94:0x0252, B:95:0x025a, B:97:0x026b, B:100:0x0281, B:104:0x028d, B:107:0x0297, B:110:0x02a5, B:113:0x02ac, B:117:0x02b9, B:161:0x02e2, B:163:0x02ef, B:213:0x026f, B:215:0x027e, B:217:0x01e6, B:219:0x0209, B:221:0x0218, B:224:0x021d, B:225:0x0221, B:226:0x01c2, B:240:0x015f, B:241:0x0168, B:243:0x016e, B:245:0x0180, B:250:0x0190), top: B:59:0x01a8 }] */
    /* JADX WARN: Type inference failed for: r21v0, types: [ru.CryptoPro.reprov.certpath.CrlRevocationChecker] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(X509Certificate x509Certificate, PublicKey publicKey, Set set) {
        PKIXBuilderParameters pKIXBuilderParameters;
        ?? r4;
        Set set2;
        int i;
        PKIXCertPathBuilderResult pKIXCertPathBuilderResult;
        Set hashSet;
        TrustAnchor trustAnchor;
        PublicKey cAPublicKey;
        LinkedList linkedList;
        X509Certificate trustedCert;
        int i2;
        PKIXCertPathBuilderResult pKIXCertPathBuilderResult2;
        CertPathBuilder certPathBuilder;
        Set set3;
        Set<TrustAnchor> set4;
        int i3;
        CertPathBuilder certPathBuilder2;
        int size;
        PublicKey publicKey2;
        CertPathBuilder certPathBuilder3;
        LinkedList linkedList2;
        HashSet hashSet2;
        CertStore certStore;
        AuthorityInfoAccessExtension authorityInfoAccessExtension;
        List accessDescriptions;
        Iterator it;
        X509Certificate x509Certificate2 = x509Certificate;
        JCPLogger.finer("CrlRevocationChecker.buildToNewKey() starting work");
        HashSet hashSet3 = new HashSet();
        if (publicKey != null) {
            hashSet3.add(publicKey);
        }
        RejectKeySelector rejectKeySelector = new RejectKeySelector(hashSet3);
        rejectKeySelector.setSubject(x509Certificate2.getIssuerX500Principal());
        rejectKeySelector.setKeyUsage(E);
        PKIXParameters pKIXParameters = this.B;
        TrustAnchor trustAnchor2 = this.a;
        Set<TrustAnchor> trustAnchors = trustAnchor2 == null ? pKIXParameters.getTrustAnchors() : Collections.singleton(trustAnchor2);
        int i4 = 1;
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            pKIXBuilderParameters = (PKIXBuilderParameters) pKIXParameters.clone();
            pKIXBuilderParameters.setTargetCertConstraints(rejectKeySelector);
            pKIXBuilderParameters.setPolicyQualifiersRejected(true);
            try {
                pKIXBuilderParameters.setTrustAnchors(trustAnchors);
            } catch (InvalidAlgorithmParameterException e) {
                ny61.j(e);
                return;
            }
        } else {
            try {
                pKIXBuilderParameters = new PKIXBuilderParameters(trustAnchors, rejectKeySelector);
                pKIXBuilderParameters.setInitialPolicies(pKIXParameters.getInitialPolicies());
                pKIXBuilderParameters.setCertStores(this.b);
                pKIXBuilderParameters.setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
                pKIXBuilderParameters.setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
                pKIXBuilderParameters.setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
                pKIXBuilderParameters.setDate(pKIXParameters.getDate());
                pKIXBuilderParameters.setCertPathCheckers(pKIXParameters.getCertPathCheckers());
                pKIXBuilderParameters.setSigProvider(pKIXParameters.getSigProvider());
            } catch (InvalidAlgorithmParameterException e2) {
                ny61.j(e2);
                return;
            }
        }
        PKIXParameters pKIXParameters2 = pKIXBuilderParameters;
        pKIXParameters2.setRevocationEnabled(false);
        List<PKIXCertPathChecker> certPathCheckers = pKIXParameters2.getCertPathCheckers();
        CertSelector certSelector = null;
        pKIXParameters2.setCertPathCheckers(null);
        for (int i5 = 0; i5 < certPathCheckers.size(); i5++) {
            PKIXCertPathChecker pKIXCertPathChecker = certPathCheckers.get(i5);
            if (!(pKIXCertPathChecker instanceof CrlRevocationChecker)) {
                pKIXParameters2.addCertPathChecker(pKIXCertPathChecker);
            }
        }
        if (DistributionPointFetcher.getBooleanProperty("ru.CryptoPro.reprov.enableAIAcaIssuers", false)) {
            byte[] extensionValue = x509Certificate2.getExtensionValue(PKIXExtensions.AuthInfoAccess_Id.toString());
            if (extensionValue != null) {
                try {
                    authorityInfoAccessExtension = new AuthorityInfoAccessExtension(Boolean.FALSE, new DerValue(extensionValue).getOctetString());
                } catch (IOException e3) {
                    JCPLogger.warning("CrlRevocationChecker.buildToNewKey: error decoding AIA: ", (Throwable) e3);
                }
                if (authorityInfoAccessExtension != null && (accessDescriptions = authorityInfoAccessExtension.getAccessDescriptions()) != null) {
                    it = accessDescriptions.iterator();
                    while (it.hasNext()) {
                        CertStore b = URICertStore.b((AccessDescription) it.next());
                        if (b != null) {
                            JCPLogger.finer("adding AIAext CertStore");
                            pKIXParameters2.addCertStore(b);
                        }
                    }
                }
            }
            authorityInfoAccessExtension = null;
            if (authorityInfoAccessExtension != null) {
                it = accessDescriptions.iterator();
                while (it.hasNext()) {
                }
            }
        }
        try {
            Set set5 = set;
            CertPathValidatorException certPathValidatorException = null;
            CertPathBuilder certPathBuilder4 = CertPathBuilder.getInstance("PKIX");
            while (true) {
                try {
                    try {
                        JCPLogger.finer("CrlRevocationChecker.buildToNewKey() about to try build ...");
                        try {
                            try {
                                linkedList2 = new LinkedList();
                                if (Platform.isIbm || Platform.isAndroid) {
                                    JCPLogger.finer("CrlRevocationChecker.buildToNewKey() add cert store excluding bad keys...");
                                    List<CertStore> certStores = pKIXParameters2.getCertStores();
                                    if (!hashSet3.isEmpty()) {
                                        try {
                                            Iterator<CertStore> it2 = certStores.iterator();
                                            while (it2.hasNext()) {
                                                Collection<Certificate> unmodifiableCollection = Collections.unmodifiableCollection(it2.next().getCertificates(certSelector));
                                                int i6 = i4;
                                                ArrayList arrayList = new ArrayList();
                                                for (Certificate certificate : unmodifiableCollection) {
                                                    if (!hashSet3.contains(certificate.getPublicKey())) {
                                                        arrayList.add(certificate);
                                                    }
                                                }
                                                linkedList2.add(CertStore.getInstance("Collection", new CollectionCertStoreParameters(arrayList)));
                                                i4 = i6;
                                                certSelector = null;
                                            }
                                        } catch (NoSuchAlgorithmException | CertStoreException unused) {
                                            i = i4;
                                            set2 = set5;
                                            pKIXCertPathBuilderResult = (PKIXCertPathBuilderResult) certPathBuilder4.build(pKIXParameters2);
                                            JCPLogger.finer("CrlRevocationChecker.buildToNewKey() about to check revocation ...");
                                            if (set2 != null) {
                                            }
                                            hashSet.add(x509Certificate2);
                                            trustAnchor = pKIXCertPathBuilderResult.getTrustAnchor();
                                            cAPublicKey = trustAnchor.getCAPublicKey();
                                            if (cAPublicKey == null) {
                                            }
                                            linkedList = new LinkedList(pKIXCertPathBuilderResult.getCertPath().getCertificates());
                                            if (!Platform.isIbm) {
                                            }
                                            JCPLogger.finer("CrlRevocationChecker.buildToNewKey() remove root certificate (android)...");
                                            trustedCert = trustAnchor.getTrustedCert();
                                            if (linkedList.contains(trustedCert)) {
                                            }
                                            try {
                                                size = linkedList.size() - 1;
                                                PublicKey publicKey3 = cAPublicKey;
                                                ?? r42 = i;
                                                CertPathBuilder certPathBuilder5 = certPathBuilder4;
                                                while (size >= 0) {
                                                }
                                                PKIXCertPathBuilderResult pKIXCertPathBuilderResult3 = pKIXCertPathBuilderResult;
                                                certPathBuilder2 = certPathBuilder5;
                                                set3 = hashSet;
                                                set4 = trustAnchors;
                                                i3 = 0;
                                                JCPLogger.finer("CrlRevocationChecker.buildToNewKey() got key", pKIXCertPathBuilderResult3.getPublicKey());
                                                publicKey2 = pKIXCertPathBuilderResult3.getPublicKey();
                                                try {
                                                    r4 = i;
                                                    try {
                                                        b(x509Certificate2, publicKey2, r4, false, null, pKIXParameters.getTrustAnchors());
                                                        if (Platform.isAndroid) {
                                                        }
                                                    } catch (CertPathValidatorException e4) {
                                                        e = e4;
                                                        CertPathValidatorException certPathValidatorException2 = e;
                                                        if (er61.a()) {
                                                            if (certPathValidatorException2.getReason() == CertPathValidatorException.BasicReason.REVOKED) {
                                                                throw certPathValidatorException2;
                                                            }
                                                        } else if (certPathValidatorException2 instanceof CertificateRevokedException) {
                                                            throw certPathValidatorException2;
                                                        }
                                                        try {
                                                            if (Platform.isAndroid) {
                                                                int i7 = this.D + (r4 == true ? 1 : 0);
                                                                this.D = i7;
                                                                if (i7 > 60) {
                                                                    this.D = 0;
                                                                    throw new CertPathBuilderException("Loop in Android. Check your internet connection.");
                                                                }
                                                            }
                                                            hashSet3.add(publicKey2);
                                                            x509Certificate2 = x509Certificate;
                                                            certPathValidatorException = certPathValidatorException2;
                                                            i4 = r4;
                                                            certPathBuilder4 = certPathBuilder2;
                                                            set5 = set3;
                                                            trustAnchors = set4;
                                                            certSelector = null;
                                                        } catch (InvalidAlgorithmParameterException e5) {
                                                            e = e5;
                                                            certPathValidatorException = certPathValidatorException2;
                                                            if (certPathValidatorException == null) {
                                                                throw new CertPathValidatorException(e);
                                                            }
                                                            throw certPathValidatorException;
                                                        } catch (CertPathBuilderException e6) {
                                                            e = e6;
                                                            certPathValidatorException = certPathValidatorException2;
                                                            if (certPathValidatorException != null) {
                                                            }
                                                        }
                                                    }
                                                } catch (CertPathValidatorException e7) {
                                                    e = e7;
                                                    r4 = i;
                                                }
                                            } catch (CertPathValidatorException unused2) {
                                                i2 = i;
                                                pKIXCertPathBuilderResult2 = pKIXCertPathBuilderResult;
                                                certPathBuilder = certPathBuilder4;
                                                set3 = hashSet;
                                                set4 = trustAnchors;
                                            }
                                        }
                                    }
                                }
                                i = i4;
                            } catch (CertPathBuilderException e8) {
                                e = e8;
                                i = i4;
                            }
                        } catch (NoSuchAlgorithmException | CertStoreException unused3) {
                            set2 = set5;
                            i = i4;
                        }
                    } catch (CertPathBuilderException e9) {
                        e = e9;
                        r4 = i4;
                    }
                    try {
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            Set<TrustAnchor> unmodifiableSet = Collections.unmodifiableSet(pKIXParameters2.getTrustAnchors());
                            hashSet2 = new HashSet();
                            if (Platform.isIbm || Platform.isAndroid) {
                                JCPLogger.finer("CrlRevocationChecker.buildToNewKey() add trust anchors excluding bad keys...");
                            }
                            for (TrustAnchor trustAnchor3 : unmodifiableSet) {
                                X509Certificate trustedCert2 = trustAnchor3.getTrustedCert();
                                set2 = set5;
                                PublicKey publicKey4 = trustedCert2 != null ? trustedCert2.getPublicKey() : trustAnchor3.getCAPublicKey();
                                try {
                                    if (!Platform.isIbm && !Platform.isAndroid) {
                                        arrayList2.add(trustedCert2);
                                        set5 = set2;
                                    }
                                    if (!hashSet3.contains(publicKey4)) {
                                        if (trustedCert2 != null) {
                                            arrayList2.add(trustedCert2);
                                        }
                                        hashSet2.add(trustAnchor3);
                                    }
                                    set5 = set2;
                                } catch (NoSuchAlgorithmException | CertStoreException unused4) {
                                }
                            }
                            set2 = set5;
                            certStore = CertStore.getInstance("Collection", new CollectionCertStoreParameters(arrayList2));
                        } catch (NoSuchAlgorithmException | CertStoreException unused5) {
                            set2 = set5;
                            pKIXCertPathBuilderResult = (PKIXCertPathBuilderResult) certPathBuilder4.build(pKIXParameters2);
                            JCPLogger.finer("CrlRevocationChecker.buildToNewKey() about to check revocation ...");
                            if (set2 != null) {
                            }
                            hashSet.add(x509Certificate2);
                            trustAnchor = pKIXCertPathBuilderResult.getTrustAnchor();
                            cAPublicKey = trustAnchor.getCAPublicKey();
                            if (cAPublicKey == null) {
                            }
                            linkedList = new LinkedList(pKIXCertPathBuilderResult.getCertPath().getCertificates());
                            if (!Platform.isIbm) {
                            }
                            JCPLogger.finer("CrlRevocationChecker.buildToNewKey() remove root certificate (android)...");
                            trustedCert = trustAnchor.getTrustedCert();
                            if (linkedList.contains(trustedCert)) {
                            }
                            size = linkedList.size() - 1;
                            PublicKey publicKey32 = cAPublicKey;
                            ?? r422 = i;
                            CertPathBuilder certPathBuilder52 = certPathBuilder4;
                            while (size >= 0) {
                            }
                            PKIXCertPathBuilderResult pKIXCertPathBuilderResult32 = pKIXCertPathBuilderResult;
                            certPathBuilder2 = certPathBuilder52;
                            set3 = hashSet;
                            set4 = trustAnchors;
                            i3 = 0;
                            JCPLogger.finer("CrlRevocationChecker.buildToNewKey() got key", pKIXCertPathBuilderResult32.getPublicKey());
                            publicKey2 = pKIXCertPathBuilderResult32.getPublicKey();
                            r4 = i;
                            b(x509Certificate2, publicKey2, r4, false, null, pKIXParameters.getTrustAnchors());
                            if (Platform.isAndroid) {
                            }
                        }
                        if (!Platform.isIbm && !Platform.isAndroid) {
                            pKIXParameters2.addCertStore(certStore);
                            pKIXCertPathBuilderResult = (PKIXCertPathBuilderResult) certPathBuilder4.build(pKIXParameters2);
                            JCPLogger.finer("CrlRevocationChecker.buildToNewKey() about to check revocation ...");
                            hashSet = set2 != null ? new HashSet() : set2;
                            hashSet.add(x509Certificate2);
                            trustAnchor = pKIXCertPathBuilderResult.getTrustAnchor();
                            cAPublicKey = trustAnchor.getCAPublicKey();
                            if (cAPublicKey == null) {
                                cAPublicKey = trustAnchor.getTrustedCert().getPublicKey();
                            }
                            linkedList = new LinkedList(pKIXCertPathBuilderResult.getCertPath().getCertificates());
                            if (!Platform.isIbm || Platform.isAndroid) {
                                JCPLogger.finer("CrlRevocationChecker.buildToNewKey() remove root certificate (android)...");
                                trustedCert = trustAnchor.getTrustedCert();
                                if (linkedList.contains(trustedCert)) {
                                    linkedList.remove(trustedCert);
                                }
                            }
                            size = linkedList.size() - 1;
                            PublicKey publicKey322 = cAPublicKey;
                            ?? r4222 = i;
                            CertPathBuilder certPathBuilder522 = certPathBuilder4;
                            while (size >= 0) {
                                try {
                                    X509Certificate x509Certificate3 = (X509Certificate) linkedList.get(size);
                                    pKIXCertPathBuilderResult2 = pKIXCertPathBuilderResult;
                                    try {
                                        JCPLogger.finerFormat("CrlRevocationChecker.buildToNewKey() index {0} checking {1}", Integer.valueOf(size), x509Certificate3);
                                        certPathBuilder3 = certPathBuilder522;
                                        try {
                                            b(x509Certificate3, publicKey322, r4222, true, hashSet, trustAnchors);
                                            set3 = hashSet;
                                            set4 = trustAnchors;
                                            try {
                                                boolean e10 = e(x509Certificate3);
                                                publicKey322 = x509Certificate3.getPublicKey();
                                                if (Platform.isAndroid) {
                                                    i3 = 0;
                                                    try {
                                                        this.D = 0;
                                                    } catch (CertPathValidatorException unused6) {
                                                        r4 = i;
                                                        certPathBuilder2 = certPathBuilder3;
                                                        try {
                                                            if (Platform.isAndroid) {
                                                                int i8 = this.D + (r4 == true ? 1 : 0);
                                                                this.D = i8;
                                                                if (i8 > 60) {
                                                                    this.D = i3;
                                                                    throw new CertPathBuilderException("Loop in Android. Check your internet connection.");
                                                                }
                                                            }
                                                            hashSet3.add(pKIXCertPathBuilderResult2.getPublicKey());
                                                            x509Certificate2 = x509Certificate;
                                                            i4 = r4;
                                                            certPathBuilder4 = certPathBuilder2;
                                                            set5 = set3;
                                                            trustAnchors = set4;
                                                            certSelector = null;
                                                        } catch (CertPathBuilderException e11) {
                                                            e = e11;
                                                            if (certPathValidatorException != null) {
                                                                throw certPathValidatorException;
                                                            }
                                                            String str = e.toString().split(":")[r4];
                                                            if (!er61.a()) {
                                                                throw new CertPathValidatorException(g8e.o("Could not determine revocation status: ", str), e);
                                                            }
                                                            throw new CertPathValidatorException(g8e.o("Could not determine revocation status: ", str), null, null, -1, CertPathValidatorException.BasicReason.UNDETERMINED_REVOCATION_STATUS);
                                                        }
                                                    }
                                                }
                                                size--;
                                                certPathBuilder522 = certPathBuilder3;
                                                pKIXCertPathBuilderResult = pKIXCertPathBuilderResult2;
                                                hashSet = set3;
                                                trustAnchors = set4;
                                                r4222 = e10;
                                            } catch (CertPathValidatorException unused7) {
                                                i2 = i;
                                                certPathBuilder = certPathBuilder3;
                                                i3 = 0;
                                                r4 = i2;
                                                certPathBuilder2 = certPathBuilder;
                                                if (Platform.isAndroid) {
                                                }
                                                hashSet3.add(pKIXCertPathBuilderResult2.getPublicKey());
                                                x509Certificate2 = x509Certificate;
                                                i4 = r4;
                                                certPathBuilder4 = certPathBuilder2;
                                                set5 = set3;
                                                trustAnchors = set4;
                                                certSelector = null;
                                            }
                                        } catch (CertPathValidatorException unused8) {
                                            set3 = hashSet;
                                            set4 = trustAnchors;
                                            i2 = i;
                                            certPathBuilder = certPathBuilder3;
                                            i3 = 0;
                                            r4 = i2;
                                            certPathBuilder2 = certPathBuilder;
                                            if (Platform.isAndroid) {
                                            }
                                            hashSet3.add(pKIXCertPathBuilderResult2.getPublicKey());
                                            x509Certificate2 = x509Certificate;
                                            i4 = r4;
                                            certPathBuilder4 = certPathBuilder2;
                                            set5 = set3;
                                            trustAnchors = set4;
                                            certSelector = null;
                                        }
                                    } catch (CertPathValidatorException unused9) {
                                        certPathBuilder3 = certPathBuilder522;
                                        set3 = hashSet;
                                        set4 = trustAnchors;
                                        i2 = i;
                                        certPathBuilder = certPathBuilder3;
                                        i3 = 0;
                                        r4 = i2;
                                        certPathBuilder2 = certPathBuilder;
                                        if (Platform.isAndroid) {
                                        }
                                        hashSet3.add(pKIXCertPathBuilderResult2.getPublicKey());
                                        x509Certificate2 = x509Certificate;
                                        i4 = r4;
                                        certPathBuilder4 = certPathBuilder2;
                                        set5 = set3;
                                        trustAnchors = set4;
                                        certSelector = null;
                                    }
                                } catch (CertPathValidatorException unused10) {
                                    pKIXCertPathBuilderResult2 = pKIXCertPathBuilderResult;
                                }
                            }
                            PKIXCertPathBuilderResult pKIXCertPathBuilderResult322 = pKIXCertPathBuilderResult;
                            certPathBuilder2 = certPathBuilder522;
                            set3 = hashSet;
                            set4 = trustAnchors;
                            i3 = 0;
                            JCPLogger.finer("CrlRevocationChecker.buildToNewKey() got key", pKIXCertPathBuilderResult322.getPublicKey());
                            publicKey2 = pKIXCertPathBuilderResult322.getPublicKey();
                            r4 = i;
                            b(x509Certificate2, publicKey2, r4, false, null, pKIXParameters.getTrustAnchors());
                            if (Platform.isAndroid) {
                                return;
                            }
                            this.D = 0;
                            return;
                        }
                        JCPLogger.finer("CrlRevocationChecker.buildToNewKey() set cert stores and trust anchors...");
                        linkedList2.add(certStore);
                        pKIXParameters2.setCertStores(linkedList2);
                        pKIXParameters2.setTrustAnchors(hashSet2);
                        pKIXCertPathBuilderResult = (PKIXCertPathBuilderResult) certPathBuilder4.build(pKIXParameters2);
                        JCPLogger.finer("CrlRevocationChecker.buildToNewKey() about to check revocation ...");
                        if (set2 != null) {
                        }
                        hashSet.add(x509Certificate2);
                        trustAnchor = pKIXCertPathBuilderResult.getTrustAnchor();
                        cAPublicKey = trustAnchor.getCAPublicKey();
                        if (cAPublicKey == null) {
                        }
                        linkedList = new LinkedList(pKIXCertPathBuilderResult.getCertPath().getCertificates());
                        if (!Platform.isIbm) {
                        }
                        JCPLogger.finer("CrlRevocationChecker.buildToNewKey() remove root certificate (android)...");
                        trustedCert = trustAnchor.getTrustedCert();
                        if (linkedList.contains(trustedCert)) {
                        }
                        size = linkedList.size() - 1;
                        PublicKey publicKey3222 = cAPublicKey;
                        ?? r42222 = i;
                        CertPathBuilder certPathBuilder5222 = certPathBuilder4;
                        while (size >= 0) {
                        }
                        PKIXCertPathBuilderResult pKIXCertPathBuilderResult3222 = pKIXCertPathBuilderResult;
                        certPathBuilder2 = certPathBuilder5222;
                        set3 = hashSet;
                        set4 = trustAnchors;
                        i3 = 0;
                        JCPLogger.finer("CrlRevocationChecker.buildToNewKey() got key", pKIXCertPathBuilderResult3222.getPublicKey());
                        publicKey2 = pKIXCertPathBuilderResult3222.getPublicKey();
                        r4 = i;
                        b(x509Certificate2, publicKey2, r4, false, null, pKIXParameters.getTrustAnchors());
                        if (Platform.isAndroid) {
                        }
                        i4 = r4;
                        certPathBuilder4 = certPathBuilder2;
                        set5 = set3;
                        trustAnchors = set4;
                        certSelector = null;
                    } catch (CertPathBuilderException e12) {
                        e = e12;
                        r4 = i;
                        if (certPathValidatorException != null) {
                        }
                    }
                } catch (InvalidAlgorithmParameterException e13) {
                    e = e13;
                }
            }
        } catch (NoSuchAlgorithmException e14) {
            throw new CertPathValidatorException(e14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(X509Certificate x509Certificate, PublicKey publicKey, boolean z, boolean z2, Set set, Set set2) {
        PublicKey publicKey2;
        String str;
        boolean z3;
        String str2;
        ArrayList arrayList;
        Set set3;
        CRLDistributionPointsExtension cRLDistributionPointsExtension;
        List list;
        PKIXParameters pKIXParameters = this.B;
        ArrayList arrayList2 = this.b;
        String str3 = "revocation status";
        JCPLogger.finerFormat("CrlRevocationChecker.verifyRevocationStatus() ---checking {0}...", "revocation status");
        if (this.C && x509Certificate.getBasicConstraints() != -1) {
            JCPLogger.finer("Skipping revocation check, not end entity cert");
            return;
        }
        if (set != null && set.contains(x509Certificate)) {
            JCPLogger.finer("CrlRevocationChecker.verifyRevocationStatus() circular dependency");
            if (er61.a()) {
                throw new CertPathValidatorException("Could not determine revocation status", null, null, -1, CertPathValidatorException.BasicReason.UNDETERMINED_REVOCATION_STATUS);
            }
            dy31.r("Could not determine revocation status");
            return;
        }
        this.z = new ArrayList();
        this.A = new ArrayList();
        boolean[] zArr = new boolean[9];
        try {
            X509CRLSelector x509CRLSelector = new X509CRLSelector();
            x509CRLSelector.setCertificateChecking(x509Certificate);
            x509CRLSelector.setDateAndTime(this.w);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator<? extends CRL> it2 = ((CertStore) it.next()).getCRLs(x509CRLSelector).iterator();
                while (it2.hasNext()) {
                    this.z.add((X509CRL) it2.next());
                }
            }
            boolean[] zArr2 = DistributionPointFetcher.a;
            ArrayList arrayList3 = arrayList2;
            this.A.addAll(DistributionPointFetcher.getCRLs(x509CRLSelector, z, publicKey, this.c, arrayList3, zArr, set2, pKIXParameters.getDate()));
            JCPLogger.finer("CrlRevocationChecker.verifyRevocationStatus() crls.size() =", Integer.valueOf(this.z.size()));
            boolean isEmpty = this.z.isEmpty();
            boolean[] zArr3 = F;
            PublicKey publicKey3 = null;
            if (isEmpty) {
                publicKey2 = null;
                str = "revocation status";
            } else {
                ArrayList arrayList4 = this.A;
                ArrayList arrayList5 = this.z;
                try {
                    JCPLogger.finer("CRLRevocationChecker.verifyPossibleCRLs: Checking CRLDPs for", x509Certificate.getSubjectX500Principal());
                    byte[] extensionValue = x509Certificate.getExtensionValue(PKIXExtensions.CRLDistributionPoints_Id.toString());
                    if (extensionValue != null) {
                        cRLDistributionPointsExtension = new CRLDistributionPointsExtension(Boolean.FALSE, new DerValue(extensionValue).getOctetString());
                    } else {
                        cRLDistributionPointsExtension = null;
                    }
                    if (cRLDistributionPointsExtension == null) {
                        list = Collections.singletonList(new DistributionPoint(new GeneralNames().add(new GeneralName(new X500Name(x509Certificate.getIssuerX500Principal().getEncoded()))), (boolean[]) null, (GeneralNames) null));
                    } else {
                        list = (List) cRLDistributionPointsExtension.get(CRLDistributionPointsExtension.POINTS);
                    }
                    HashSet hashSet = new HashSet();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext() && !Arrays.equals(zArr, zArr3)) {
                        DistributionPoint distributionPoint = (DistributionPoint) it3.next();
                        Iterator it4 = arrayList5.iterator();
                        while (it4.hasNext()) {
                            X509CRL x509crl = (X509CRL) it4.next();
                            ArrayList arrayList6 = arrayList4;
                            DistributionPoint distributionPoint2 = distributionPoint;
                            try {
                                String str4 = this.c;
                                try {
                                    Date date = pKIXParameters.getDate();
                                    str = str3;
                                    arrayList = arrayList6;
                                    PKIXParameters pKIXParameters2 = pKIXParameters;
                                    publicKey2 = publicKey3;
                                    ArrayList arrayList7 = arrayList5;
                                    HashSet hashSet2 = hashSet;
                                    ArrayList arrayList8 = arrayList3;
                                    try {
                                        arrayList3 = arrayList8;
                                        if (DistributionPointFetcher.c(x509Certificate, distributionPoint2, x509crl, zArr, z, publicKey, str4, set2, arrayList8, date)) {
                                            hashSet2.add(x509crl);
                                        }
                                        hashSet = hashSet2;
                                        distributionPoint = distributionPoint2;
                                        arrayList4 = arrayList;
                                        str3 = str;
                                        pKIXParameters = pKIXParameters2;
                                        arrayList5 = arrayList7;
                                        publicKey3 = publicKey2;
                                    } catch (Exception e) {
                                        e = e;
                                        JCPLogger.subThrown("Exception while verifying CRL", e);
                                        set3 = Collections.EMPTY_SET;
                                        arrayList.addAll(set3);
                                        JCPLogger.finer("CrlRevocationChecker.verifyRevocationStatus() approved crls.size() =", Integer.valueOf(this.A.size()));
                                        if (!this.A.isEmpty()) {
                                        }
                                        PublicKey publicKey4 = publicKey;
                                        if (z2) {
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    str = str3;
                                    arrayList = arrayList6;
                                    publicKey2 = publicKey3;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                publicKey2 = publicKey3;
                                str = str3;
                                arrayList = arrayList6;
                            }
                        }
                    }
                    publicKey2 = publicKey3;
                    str = str3;
                    arrayList = arrayList4;
                    set3 = hashSet;
                } catch (Exception e4) {
                    e = e4;
                    publicKey2 = publicKey3;
                    str = str3;
                    arrayList = arrayList4;
                }
                arrayList.addAll(set3);
            }
            JCPLogger.finer("CrlRevocationChecker.verifyRevocationStatus() approved crls.size() =", Integer.valueOf(this.A.size()));
            if (!this.A.isEmpty() || !Arrays.equals(zArr, zArr3)) {
                PublicKey publicKey42 = publicKey;
                if (z2) {
                    if (er61.a()) {
                        throw new CertPathValidatorException("Could not determine revocation status", null, null, -1, CertPathValidatorException.BasicReason.UNDETERMINED_REVOCATION_STATUS);
                    }
                    dy31.r("Could not determine revocation status");
                    return;
                }
                JCPLogger.finerFormat("CrlRevocationChecker.verifyWithSeparateSigningKey() ---checking {0}...", str);
                if (set == null || !set.contains(x509Certificate)) {
                    if (!z) {
                        publicKey42 = publicKey2;
                    }
                    a(x509Certificate, publicKey42, set);
                    return;
                } else {
                    JCPLogger.finer("CrlRevocationChecker.verifyWithSeparateSigningKey() circular dependency");
                    if (er61.a()) {
                        throw new CertPathValidatorException("Could not determine revocation status", null, null, -1, CertPathValidatorException.BasicReason.UNDETERMINED_REVOCATION_STATUS);
                    }
                    dy31.r("Could not determine revocation status");
                    return;
                }
            }
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            JCPLogger.finer("starting the final sweep...");
            JCPLogger.finer("CrlRevocationChecker.verifyRevocationStatus cert SN: ", serialNumber.toString(16));
            CRLReason cRLReason = CRLReason.UNSPECIFIED;
            Iterator it5 = this.A.iterator();
            int i = 0;
            while (it5.hasNext()) {
                X509CRL x509crl2 = (X509CRL) it5.next();
                try {
                    try {
                        z3 = d(x509crl2, x509Certificate, this.c, publicKey);
                    } catch (CRLException | CertificateException e5) {
                        e = e5;
                        JCPLogger.ignoredException(e);
                        z3 = false;
                        if (!z3) {
                        }
                    }
                } catch (CRLException | CertificateException e6) {
                    e = e6;
                }
                if (!z3) {
                    i++;
                    X509CRLEntry revokedCertificate = x509crl2.getRevokedCertificate(x509Certificate);
                    if (revokedCertificate != null) {
                        try {
                            X509CRLEntryImpl impl = X509CRLEntryImpl.toImpl(revokedCertificate);
                            JCPLogger.finer("CrlRevocationChecker.verifyRevocationStatus CRL entry: ", impl);
                            Set criticalExtensionOIDs = impl.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                                criticalExtensionOIDs.remove(PKIXExtensions.ReasonCode_Id.toString());
                                criticalExtensionOIDs.remove(PKIXExtensions.CertificateIssuer_Id.toString());
                                criticalExtensionOIDs.remove("1.3.6.1.4.1.311.21.1");
                                criticalExtensionOIDs.remove(ku61.a);
                                if (!criticalExtensionOIDs.isEmpty()) {
                                    String str5 = "  Unrecognized critical extension(s) in CRL: " + criticalExtensionOIDs;
                                    JCPLogger.fine(str5);
                                    if (!er61.a()) {
                                        throw new CertPathValidatorException("Could not determine revocation status:".concat(str5));
                                    }
                                    throw new CertPathValidatorException("Could not determine revocation status: ".concat(str5), null, null, -1, CertPathValidatorException.BasicReason.UNDETERMINED_REVOCATION_STATUS);
                                }
                            }
                            CRLReason revocationReason = impl.getRevocationReason();
                            if (revocationReason == null) {
                                revocationReason = CRLReason.UNSPECIFIED;
                            }
                            int ordinal = revocationReason.ordinal();
                            if (er61.a()) {
                                java.security.cert.CertificateRevokedException certificateRevokedException = new java.security.cert.CertificateRevokedException(impl.getRevocationDate(), revocationReason, x509crl2.getIssuerX500Principal(), impl.getExtensions());
                                throw new CertPathValidatorException(certificateRevokedException.getMessage(), certificateRevokedException, null, -1, CertPathValidatorException.BasicReason.REVOKED);
                            }
                            switch (ordinal) {
                                case 0:
                                    str2 = "unspecified";
                                    break;
                                case 1:
                                    str2 = "key compromise";
                                    break;
                                case 2:
                                    str2 = "CA compromise";
                                    break;
                                case 3:
                                    str2 = "affiliation changed";
                                    break;
                                case 4:
                                    str2 = ReasonFlags.SUPERSEDED;
                                    break;
                                case 5:
                                    str2 = "cessation of operation";
                                    break;
                                case 6:
                                    str2 = "certificate hold";
                                    break;
                                case 7:
                                default:
                                    str2 = "unrecognized reason code";
                                    break;
                                case 8:
                                    str2 = "remove from CRL";
                                    break;
                            }
                            throw new CertificateRevokedException("Certificate has been revoked, reason: ".concat(str2));
                        } catch (CRLException e7) {
                            throw new CertPathValidatorException(e7);
                        }
                    }
                }
            }
            if (i == 0) {
                throw new CertPathValidatorException("Could not determine revocation status: appropriate crl not found", null, null, -1, CertPathValidatorException.BasicReason.UNDETERMINED_REVOCATION_STATUS);
            }
        } catch (Exception e8) {
            JCPLogger.warning("CrlRevocationChecker.verifyRevocationStatus() unexpected exception:", (Throwable) e8);
            throw new CertPathValidatorException(e8);
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        b(x509Certificate, this.x, this.y, true, null, this.B.getTrustAnchors());
        this.x = x509Certificate.getPublicKey();
        this.y = e(x509Certificate);
    }

    public final boolean d(X509CRL x509crl, X509Certificate x509Certificate, String str, PublicKey publicKey) {
        if (!JCPPKIXBuilderParameters.USE_MS_VERIFY.booleanValue()) {
            PKIXParameters pKIXParameters = this.B;
            if (!(pKIXParameters instanceof JCPPKIXBuilderParameters) || !((JCPPKIXBuilderParameters) pKIXParameters).isUseMicrosoftCheckOfCRL()) {
                byte[] extensionValue = x509crl.getExtensionValue(ku61.a);
                CertificateAndCrlMatchingTechnique certificateAndCrlMatchingTechnique = new CertificateAndCrlMatchingTechnique();
                certificateAndCrlMatchingTechnique.value = -1;
                if (extensionValue != null) {
                    Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(extensionValue);
                    Asn1OctetString asn1OctetString = new Asn1OctetString();
                    try {
                        asn1OctetString.decode(asn1BerDecodeBuffer);
                        certificateAndCrlMatchingTechnique.decode(new Asn1BerDecodeBuffer(asn1OctetString.value));
                    } catch (Asn1Exception | IOException unused) {
                    }
                }
                int i = certificateAndCrlMatchingTechnique.value;
                byte[] extensionValue2 = x509crl.getExtensionValue("1.3.6.1.4.1.311.21.1");
                Asn1Integer asn1Integer = new Asn1Integer();
                asn1Integer.value = -1L;
                if (extensionValue2 != null) {
                    Asn1BerDecodeBuffer asn1BerDecodeBuffer2 = new Asn1BerDecodeBuffer(extensionValue2);
                    Asn1OctetString asn1OctetString2 = new Asn1OctetString();
                    try {
                        asn1OctetString2.decode(asn1BerDecodeBuffer2);
                        asn1Integer.decode(new Asn1BerDecodeBuffer(asn1OctetString2.value));
                    } catch (Asn1Exception | IOException unused2) {
                    }
                }
                long j = asn1Integer.value;
                if (i != -1) {
                    JCPLogger.finer("***technique = ", Integer.valueOf(i));
                    if (i == 0) {
                        JCPLogger.finer("***technique = MS");
                        if (!f(x509crl, x509Certificate, str, publicKey)) {
                            return false;
                        }
                    } else if (i == 1) {
                        JCPLogger.finer("***technique = RFC");
                        if (!c(x509crl, x509Certificate)) {
                            return false;
                        }
                    }
                } else if (j != -1) {
                    JCPLogger.finer("***ms = ", Long.valueOf(j));
                    if (!f(x509crl, x509Certificate, str, publicKey)) {
                        return false;
                    }
                } else if (!c(x509crl, x509Certificate)) {
                    return false;
                }
                JCPLogger.finer("***ok");
                return true;
            }
        }
        JCPLogger.finer("***ms_verify enabled manually");
        if (!f(x509crl, x509Certificate, str, publicKey)) {
            return false;
        }
        JCPLogger.finer("***ok");
        return true;
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws CertPathValidatorException {
        if (z) {
            dy31.r("forward checking not supported");
            return;
        }
        TrustAnchor trustAnchor = this.a;
        this.x = trustAnchor != null ? trustAnchor.getCAPublicKey() != null ? trustAnchor.getCAPublicKey() : trustAnchor.getTrustedCert().getPublicKey() : null;
        this.y = true;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }

    public boolean check(X509Certificate x509Certificate, PublicKey publicKey, boolean z) throws CertPathValidatorException {
        b(x509Certificate, publicKey, z, true, null, this.B.getTrustAnchors());
        return e(x509Certificate);
    }

    public CrlRevocationChecker(TrustAnchor trustAnchor, PKIXParameters pKIXParameters) throws CertPathValidatorException {
        this(trustAnchor, pKIXParameters, false);
    }
}
