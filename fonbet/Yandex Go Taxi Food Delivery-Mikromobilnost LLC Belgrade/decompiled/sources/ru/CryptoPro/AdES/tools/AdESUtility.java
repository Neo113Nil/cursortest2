package ru.CryptoPro.AdES.tools;

import defpackage.a2;
import defpackage.b64;
import defpackage.cr80;
import defpackage.d79;
import defpackage.dqf;
import defpackage.fxs;
import defpackage.g2k;
import defpackage.gxs;
import defpackage.h2k;
import defpackage.h79;
import defpackage.i3;
import defpackage.j2;
import defpackage.j97;
import defpackage.jc51;
import defpackage.l2;
import defpackage.l79;
import defpackage.m79;
import defpackage.mc51;
import defpackage.nc51;
import defpackage.ncc;
import defpackage.ny61;
import defpackage.o2;
import defpackage.oc51;
import defpackage.oyr;
import defpackage.pc51;
import defpackage.pm3;
import defpackage.qc51;
import defpackage.qm3;
import defpackage.quu0;
import defpackage.r0x;
import defpackage.rc51;
import defpackage.ro60;
import defpackage.rza1;
import defpackage.s3;
import defpackage.u2;
import defpackage.vc51;
import defpackage.w2;
import defpackage.wbs0;
import defpackage.wo60;
import defpackage.xpf;
import defpackage.xr1;
import defpackage.xyu0;
import defpackage.yf;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.signature.AdESSigner;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.JCPKeyPair;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class AdESUtility {
    public static final CertificateFactory CERT_FACTORY;
    public static final int DIGITAL_SIGNATURE = 0;
    public static final String EXTENDED_KEY_USAGE = "2.5.29.37";
    public static final boolean FIX_NULL = true;
    public static final int KEY_AGREEMENT = 4;
    public static final String KEY_USAGE = "2.5.29.15";
    public static final String id_kp_timeStamping = "1.3.6.1.5.5.7.3.8";
    private static final List<String> ACCEPTED_PROVIDER_LIST = Arrays.asList("JCP", "JCSP");
    public static final String PROPERTY_VALIDATE_TSP = "ru.CryptoPro.AdES.validate_tsp";
    public static final boolean VALIDATE_TSP = GetProperty.getBooleanProperty(PROPERTY_VALIDATE_TSP, true);
    public static final String PROPERTY_VALIDATE_OTHER_TSP = "ru.CryptoPro.AdES.validate_other_tsp";
    public static final boolean VALIDATE_OTHER_TSP = GetProperty.getBooleanProperty(PROPERTY_VALIDATE_OTHER_TSP, false);
    public static final String PROPERTY_REQUIRE_TSP_EVIDENCE = "ru.CryptoPro.AdES.require_tsp_evidence";
    public static final boolean REQUIRE_TSP_EVIDENCE = GetProperty.getBooleanProperty(PROPERTY_REQUIRE_TSP_EVIDENCE, false);
    public static final String PROPERTY_REQUIRE_ALG_CONFORMITY = "ru.CryptoPro.AdES.require_alg_conformity";
    public static final boolean REQUIRE_ALG_CONFORMITY = GetProperty.getBooleanProperty(PROPERTY_REQUIRE_ALG_CONFORMITY, true);

    static {
        try {
            CERT_FACTORY = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
        } catch (CertificateException e) {
            ny61.j(e);
        }
    }

    public static byte[] calculateDigest(String str, String str2, byte[] bArr) throws AdESException {
        String correctProviderByHashAlgorithm = correctProviderByHashAlgorithm(str, str2);
        try {
            return (correctProviderByHashAlgorithm == null ? MessageDigest.getInstance(str2) : MessageDigest.getInstance(str2, correctProviderByHashAlgorithm)).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AdESException(e, IAdESException.ecInternal);
        } catch (NoSuchProviderException e2) {
            throw new AdESException(e2, IAdESException.ecInternal);
        }
    }

    public static String checkAndGetDigestAlgorithm(String str, String str2, Key key) {
        if (str != null) {
            return str;
        }
        if (isInternalImplemented(str2)) {
            return AlgorithmUtility.keyAlgToDigestOid(key.getAlgorithm());
        }
        return null;
    }

    public static String checkAndGetEncryptionAlgorithm(String str, String str2, PrivateKey privateKey) {
        if (str != null) {
            return str;
        }
        if (isInternalImplemented(str2)) {
            return AlgorithmUtility.keyAlgToKeyAlgorithmOid(privateKey.getAlgorithm());
        }
        return null;
    }

    public static void checkOidAndKeyAlgorithmCAdESConformity(String str, String str2, PrivateKey privateKey) throws AdESException {
        JCPLogger.subEnter();
        if (!REQUIRE_ALG_CONFORMITY) {
            JCPLogger.fine("Check of algorithm conformity disabled.");
            JCPLogger.subExit();
            return;
        }
        if (str == null || str2 == null || privateKey == null) {
            throw new AdESException("Any OID or private key is null", IAdESException.ecInternal);
        }
        String keyAlgToDigestOid = AlgorithmUtility.keyAlgToDigestOid(privateKey.getAlgorithm());
        if (keyAlgToDigestOid == null) {
            throw new AdESException("Digest algorithm list is empty", IAdESException.ecAlgorithmMismatch);
        }
        if (!str.equals(keyAlgToDigestOid)) {
            throw new AdESException(b64.l("Invalid digest OID: ", str, " (invalid private key algorithm or digest algorithm), expected digest OID: ", keyAlgToDigestOid), IAdESException.ecAlgorithmMismatch);
        }
        List keyAlgToKeyAlgorithmOidAdES = AlgorithmUtility.keyAlgToKeyAlgorithmOidAdES(privateKey.getAlgorithm());
        if (keyAlgToKeyAlgorithmOidAdES.isEmpty()) {
            throw new AdESException("Key algorithm list is empty", IAdESException.ecAlgorithmMismatch);
        }
        Iterator it = keyAlgToKeyAlgorithmOidAdES.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str2)) {
                JCPLogger.subExit();
                return;
            }
        }
        throw new AdESException(oyr.p("Invalid encryption oid ", str2, " (invalid private key algorithm or encryption algorithm)"), IAdESException.ecAlgorithmMismatch);
    }

    public static void checkOidAndKeyAlgorithmXAdESConformity(String str, String str2, PrivateKey privateKey) throws AdESException {
        JCPLogger.subEnter();
        if (!REQUIRE_ALG_CONFORMITY) {
            JCPLogger.fine("Check of algorithm conformity disabled.");
            JCPLogger.subExit();
            return;
        }
        if (str == null || str2 == null || privateKey == null) {
            throw new AdESException("OID or private key is null", IAdESException.ecAlgorithmMismatch);
        }
        String keyAlgToDigestOid = AlgorithmUtility.keyAlgToDigestOid(privateKey.getAlgorithm());
        if (keyAlgToDigestOid == null) {
            throw new AdESException("Digest algorithm list is empty", IAdESException.ecAlgorithmMismatch);
        }
        if (!str.equals(keyAlgToDigestOid)) {
            throw new AdESException(b64.l("Invalid digest OID: ", str, " (invalid private key algorithm or digest algorithm), expected digest OID: ", keyAlgToDigestOid), IAdESException.ecAlgorithmMismatch);
        }
        String keyAlgToSignatureOid = AlgorithmUtility.keyAlgToSignatureOid(privateKey.getAlgorithm());
        if (keyAlgToSignatureOid == null) {
            throw new AdESException("Signature algorithm list is empty", IAdESException.ecAlgorithmMismatch);
        }
        if (!keyAlgToSignatureOid.equals(str2)) {
            throw new AdESException(b64.l("Invalid signature OID: ", str2, " (invalid private key algorithm or signature algorithm), expected signature OID: ", keyAlgToSignatureOid), IAdESException.ecAlgorithmMismatch);
        }
        JCPLogger.subExit();
    }

    public static boolean compareCertificateID(l79 l79Var, l79 l79Var2) {
        d79 d79Var = l79Var.a;
        xr1 xr1Var = d79Var.a;
        String str = xr1Var.a.a;
        a2 a2Var = xr1Var.b;
        byte[] bArr = d79Var.c.a;
        byte[] bArr2 = d79Var.b.a;
        BigInteger x = d79Var.w.x();
        d79 d79Var2 = l79Var2.a;
        xr1 xr1Var2 = d79Var2.a;
        String str2 = xr1Var2.a.a;
        a2 a2Var2 = xr1Var2.b;
        byte[] bArr3 = d79Var2.c.a;
        byte[] bArr4 = d79Var2.b.a;
        BigInteger x2 = d79Var2.w.x();
        return str.equals(str2) && (a2Var == null || a2Var2 == null || a2Var.equals(a2Var2)) && x.equals(x2) && ((bArr == null || bArr3 == null || Array.compare(bArr, bArr3)) || (bArr2 == null || bArr4 == null || Array.compare(bArr2, bArr4)));
    }

    public static void compareSID2SigningCertificate(wbs0 wbs0Var, cr80 cr80Var) {
        JCPLogger.subEnter();
        nc51 nc51Var = wbs0Var.a;
        jc51 jc51Var = nc51Var.b;
        BigInteger bigInteger = nc51Var.c;
        if (jc51Var == null || bigInteger == null) {
            JCPLogger.info("ATTENTION! The SID of the signing certificate not found.");
        } else {
            r0x r0xVar = cr80Var.b;
            r0x r0xVar2 = cr80Var.b;
            if (r0xVar != null) {
                try {
                    if (!match(new vc51(jc51Var.getEncoded()), r0xVar2) || !bigInteger.equals(r0xVar2.b.x())) {
                        JCPLogger.info("ATTENTION! The SID of the signing certificate doesn't equal the certificate ID in the signing-certificate(V2) attribute.");
                    }
                } catch (IOException e) {
                    JCPLogger.thrown(e);
                }
            }
        }
        JCPLogger.subExit();
    }

    public static Set<X509Certificate> convertCertificateStoreToSet(ncc nccVar) throws AdESException {
        byte[] encoded;
        if (nccVar == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        try {
            Iterator it = nccVar.a(null).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof X509CertificateHolder) {
                    encoded = ((X509CertificateHolder) next).a.getEncoded();
                } else {
                    if (!(next instanceof h79)) {
                        throw new AdESException("Invalid certificate type", IAdESException.ecInternal);
                    }
                    encoded = ((h79) next).getEncoded();
                }
                hashSet.add((X509Certificate) CERT_FACTORY.generateCertificate(new ByteArrayInputStream(encoded)));
            }
            return hashSet;
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecInternal);
        } catch (CertificateException e2) {
            throw new AdESException(e2, IAdESException.ecInternal);
        }
    }

    public static Set convertValidationDataToSet(ncc nccVar, boolean z) throws AdESException {
        Object generateCRL;
        if (nccVar == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        try {
            Iterator it = nccVar.a(null).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof X509CRLHolder) {
                    generateCRL = CERT_FACTORY.generateCRL(new ByteArrayInputStream(((X509CRLHolder) next).a.getEncoded()));
                } else if (next instanceof m79) {
                    generateCRL = CERT_FACTORY.generateCRL(new ByteArrayInputStream(((m79) next).getEncoded()));
                } else if (z) {
                    continue;
                } else {
                    if (!(next instanceof wo60)) {
                        throw new AdESException("Unknown validation data type", IAdESException.ecInternal);
                    }
                    if (((wo60) next).a.a.y().intValue() != 0) {
                        throw new AdESException("Unsuccessful OCSP response cannot be used", IAdESException.ecInternal);
                    }
                    hashSet.add(next);
                }
                next = (X509CRL) generateCRL;
                hashSet.add(next);
            }
            return hashSet;
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecInternal);
        } catch (CRLException e2) {
            throw new AdESException(e2, IAdESException.ecInternal);
        }
    }

    public static m79 convertX509CRL2CertificateList(X509CRL x509crl) throws CRLException, IOException {
        return m79.m((i3) new j2(x509crl.getEncoded()).n());
    }

    public static String correctProviderByHashAlgorithm(String str, String str2) {
        JCPLogger.finerFormat("Find a provider that implements the digest algorithm {0} ({1})", str2, str);
        if (!ifMapContains(AlgorithmUtility.MAP_REPLACING_DIGEST_ALGORITHMS, str2)) {
            JCPLogger.finerFormat("Valid provider (digest algorithm: {0}): {1} is found instead of {2}", str2, "default", str);
            return null;
        }
        if (ACCEPTED_PROVIDER_LIST.contains(str)) {
            return str;
        }
        String str3 = AdESSigner.PROVIDER;
        JCPLogger.finerFormat("Valid provider (digest algorithm: {0}): {1} is found instead of {2}", str2, str3, str);
        return str3;
    }

    public static String correctProviderBySignatureOid(String str, String str2) {
        JCPLogger.finerFormat("Find a provider that implements the signature algorithm identifier {0} ({1})", str2, str);
        if (!ifMapContains(AlgorithmUtility.MAP_REPLACING_KEY_ALGORITHMS, str2) && !AlgorithmUtility.MAP_REPLACING_SIGNATURE_ALGORITHMS.contains(str2)) {
            JCPLogger.finerFormat("Valid provider (signature algorithm: {0}): {1} is found instead of {2}", str2, "default", str);
            return null;
        }
        if (ACCEPTED_PROVIDER_LIST.contains(str)) {
            return str;
        }
        String str3 = AdESSigner.PROVIDER;
        JCPLogger.finerFormat("Valid provider (signature algorithm: {0}): {1} is found instead of {2}", str2, str3, str);
        return str3;
    }

    public static X509Certificate findCertMatch(PrivateKey privateKey, List<X509Certificate> list, String str) throws AdESException {
        for (X509Certificate x509Certificate : list) {
            if (ifPrivateKeyAndMatchesCertificate(privateKey, x509Certificate, str)) {
                return x509Certificate;
            }
        }
        return null;
    }

    public static l79 fixCertificateID(l79 l79Var, String str) {
        xr1 xr1Var = new xr1(new u2(str));
        dqf dqfVar = new dqf(l79Var.a.b.a);
        d79 d79Var = l79Var.a;
        return new l79(new d79(xr1Var, dqfVar, new dqf(d79Var.c.a), new l2(d79Var.w.x())));
    }

    private static List<String> getAccessor(X509Certificate x509Certificate, String str) {
        o2 extensionValue;
        JCPLogger.finerFormat("Searching for extension by id {0} in certificate: sn {1}, subject {2}, issuer {3}", str, x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN());
        ArrayList arrayList = new ArrayList();
        try {
            extensionValue = getExtensionValue(x509Certificate, qc51.w.a);
        } catch (Exception e) {
            JCPLogger.thrown(e);
        }
        if (extensionValue == null) {
            return arrayList;
        }
        yf[] yfVarArr = pm3.m(extensionValue).a;
        int length = yfVarArr.length;
        yf[] yfVarArr2 = new yf[length];
        System.arraycopy(yfVarArr, 0, yfVarArr2, 0, yfVarArr.length);
        for (int i = 0; i < length; i++) {
            if (yfVarArr2[i].a.a.equals(str)) {
                fxs fxsVar = yfVarArr2[i].b;
                if (fxsVar.b == 6) {
                    arrayList.add(quu0.a(xpf.u(fxsVar.a).a));
                }
            }
        }
        JCPLogger.finerFormat("Found: {0} OCSP url(s).", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static byte[] getAuthorityKeyIdentifier(byte[] bArr) throws IOException {
        w2 w2Var;
        qm3 authorityKeyIdentifierInternal = getAuthorityKeyIdentifierInternal(bArr);
        if (authorityKeyIdentifierInternal == null || (w2Var = authorityKeyIdentifierInternal.a) == null) {
            return null;
        }
        return w2Var.a;
    }

    private static qm3 getAuthorityKeyIdentifierInternal(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return qm3.m(new j2(new ByteArrayInputStream(((dqf) new j2(new ByteArrayInputStream(bArr)).n()).a)).n());
    }

    public static BigInteger getCRLSerialNumber(X509CRL x509crl) {
        Set<String> nonCriticalExtensionOIDs = x509crl.getNonCriticalExtensionOIDs();
        String str = pc51.e.a;
        if (!nonCriticalExtensionOIDs.contains(str)) {
            return null;
        }
        try {
            o2 extensionValue = getExtensionValue(x509crl, str);
            if (extensionValue != null) {
                return ((l2) extensionValue).x();
            }
            return null;
        } catch (IOException e) {
            JCPLogger.ignoredException(e);
            return null;
        }
    }

    public static List<String> getCrlUrls(X509Certificate x509Certificate) {
        o2 extensionValue;
        JCPLogger.finerFormat("Reading CRL DP from the certificate\n\tserial number: {0}\n\tsubject: {1}\n\tissuer: {2}", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN());
        ArrayList arrayList = new ArrayList();
        try {
            extensionValue = getExtensionValue(x509Certificate, qc51.c.a);
        } catch (Exception e) {
            JCPLogger.thrown(e);
        }
        if (extensionValue == null) {
            return arrayList;
        }
        for (g2k g2kVar : j97.n(extensionValue).m()) {
            h2k h2kVar = g2kVar.a;
            if (h2kVar.b == 0) {
                for (fxs fxsVar : ((gxs) h2kVar.a).n()) {
                    if (fxsVar.b == 6) {
                        arrayList.add(quu0.a(xpf.u(fxsVar.a).a));
                    }
                }
            }
        }
        JCPLogger.finerFormat("Found: {0} CRL url(s).", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static o2 getExtensionValue(X509Extension x509Extension, String str) throws IOException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return new j2(new ByteArrayInputStream(((w2) new j2(new ByteArrayInputStream(extensionValue)).n()).a)).n();
    }

    public static List<String> getOcspUrls(X509Certificate x509Certificate) {
        return getAccessor(x509Certificate, "1.3.6.1.5.5.7.48.1");
    }

    public static byte[] getSubjectKeyIdentifier(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return rza1.b(xyu0.m(new j2(new ByteArrayInputStream(w2.x(new j2(new ByteArrayInputStream(bArr)).n()).a)).n()).a);
    }

    public static boolean hasExtension(X509Certificate x509Certificate, String str) {
        List<String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (CertificateParsingException unused) {
        }
        return extendedKeyUsage != null && extendedKeyUsage.contains(str);
    }

    public static boolean ifKeyUsageIsSignatureInCertificate(X509Certificate x509Certificate) {
        boolean[] keyUsage;
        Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
        return criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty() || !criticalExtensionOIDs.contains(KEY_USAGE) || (keyUsage = x509Certificate.getKeyUsage()) == null || keyUsage[0];
    }

    private static boolean ifMapContains(Map<String, String> map, String str) {
        return map.containsKey(str) || map.containsValue(str);
    }

    public static boolean ifPrivateKeyAndMatchesCertificate(PrivateKey privateKey, X509Certificate x509Certificate, String str) {
        try {
            return new JCPKeyPair(x509Certificate.getPublicKey(), privateKey).match(str);
        } catch (Exception e) {
            JCPLogger.warning(e);
            return false;
        }
    }

    public static boolean isExtensionCritical(X509Certificate x509Certificate, String str) {
        Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && criticalExtensionOIDs.contains(str);
    }

    public static boolean isGost(X509Certificate x509Certificate) {
        String algorithm = x509Certificate.getPublicKey().getAlgorithm();
        return algorithm.equalsIgnoreCase(JCP.GOST_EL_DEGREE_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME);
    }

    public static boolean isInternalImplemented(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("JCP") || str.equalsIgnoreCase("JCSP");
        }
        return false;
    }

    private static boolean isNoCheckCertificate(X509Certificate x509Certificate) {
        return x509Certificate.getExtensionValue(ro60.d.a) != null;
    }

    public static boolean isSelfSigned(X509Certificate x509Certificate) {
        return isSelfSignedFast(x509Certificate);
    }

    private static boolean isSelfSignedFast(X509Certificate x509Certificate) {
        return isSelfSignedForCaCerts(x509Certificate) && isSelfSignedSignature(x509Certificate);
    }

    public static boolean isSelfSignedForCaCerts(X509Certificate x509Certificate) {
        return x509Certificate.getBasicConstraints() != -1 && x509Certificate.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal());
    }

    public static boolean isSelfSignedSignature(X509Certificate x509Certificate) {
        String correctProviderBySignatureOid = correctProviderBySignatureOid(AdESSigner.PROVIDER, x509Certificate.getSigAlgOID());
        try {
            if (correctProviderBySignatureOid == null) {
                x509Certificate.verify(x509Certificate.getPublicKey());
                return true;
            }
            x509Certificate.verify(x509Certificate.getPublicKey(), correctProviderBySignatureOid);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean match(vc51 vc51Var, r0x r0xVar) throws IOException {
        vc51 vc51Var2 = new vc51(((s3) ((i3) ((i3) r0xVar.toASN1Primitive()).A(0).toASN1Primitive()).A(0).toASN1Primitive()).u().getEncoded());
        String rc51Var = vc51Var.toString();
        Hashtable hashtable = rc51.D;
        oc51 oc51Var = new oc51();
        Boolean bool = rc51.F;
        vc51 vc51Var3 = new vc51();
        vc51Var3.a = null;
        vc51Var3.b = new Vector();
        vc51Var3.c = new Vector();
        vc51Var3.w = new Vector();
        vc51Var3.a = oc51Var;
        mc51 mc51Var = new mc51(HexString.CHAR_COMMA, 1, rc51Var);
        while (mc51Var.c != mc51Var.b.length()) {
            String b = mc51Var.b();
            if (b.indexOf(43) > 0) {
                mc51 mc51Var2 = new mc51('+', 1, b);
                vc51Var3.m(hashtable, mc51Var2.b(), bool);
                while (mc51Var2.c != mc51Var2.b.length()) {
                    vc51Var3.m(hashtable, mc51Var2.b(), rc51.E);
                }
            } else {
                vc51Var3.m(hashtable, b, bool);
            }
        }
        return vc51Var3.equals(vc51Var2);
    }

    public static boolean skipCertificateValidity(X509Certificate x509Certificate, CertificateItem.CertificateRole certificateRole) {
        return certificateRole == CertificateItem.CertificateRole.OCSPSigner ? isNoCheckCertificate(x509Certificate) : certificateRole == CertificateItem.CertificateRole.Unknown ? isNoCheckCertificate(x509Certificate) || isSelfSigned(x509Certificate) : isSelfSigned(x509Certificate);
    }

    public static boolean skipTSPCertificateValidity(X509Certificate x509Certificate, CertificateItem.CertificateRole certificateRole) {
        return (certificateRole == CertificateItem.CertificateRole.TSPSigner || certificateRole == CertificateItem.CertificateRole.Unknown) && !REQUIRE_TSP_EVIDENCE && hasExtension(x509Certificate, "1.3.6.1.5.5.7.3.8");
    }
}
