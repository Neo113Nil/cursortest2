package ru.CryptoPro.JCSP;

import defpackage.b64;
import defpackage.g8e;
import defpackage.oyr;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.awt.Toolkit;
import java.io.File;
import java.security.AccessController;
import java.security.Provider;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.JarVersionHolder;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfig;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;
import ru.CryptoPro.JCSP.MSCAPI.CAPI;
import ru.CryptoPro.XAdES.XAdESSignature;

/* loaded from: classes4.dex */
public class JCSP extends JCSPParameters {
    public static final String ADDRESS_BOOK_STORE_NAME = "AddressBook";
    public static final String AES_MAC_NAME = "AES_MAC";
    public static final String AES_NAME = "AES";
    public static final String ANDROID_APP_NAME = "ru.cprocsp.ACSP";
    public static final String ANDROID_APP_STORE;
    public static final String ANDROID_APP_STORE_LIB;
    public static final String CA_STORE_NAME = "CA";
    public static final String CERT_STORE_NAME = "CertStore";
    public static final String CP_AES_MAC_NAME = "CP_AES_MAC";
    public static final String CP_AES_NAME = "CP_AES";
    public static final String CP_DES_MAC_NAME = "CP_DES_MAC";
    public static final String CP_DES_NAME = "CP_DES";
    public static final String CP_PREFIX = "CP_";
    public static final String CP_RSA_NAME = "CP_RSA";
    public static final String CP_TRIPLE_DES_112_NAME = "CP_3DES_112";
    public static final String CP_TRIPLE_DES_NAME = "CP_3DES";
    public static final String DES_MAC_NAME = "DES_MAC";
    public static final String DES_NAME = "DES";
    public static final String FILE_STORE_NAME = "FILE";
    public static final String GOST_CIPHER_NAME = "GOST28147";
    public static final String GOST_TRANSPORT = "GostTransport";
    public static final String GOST_TRANSPORT_K = "GostTransportK";
    public static final String GOST_TRANSPORT_M = "GostTransportM";
    public static final String HARDWARE_RANDOM = "HardwareRandom";
    public static final String HD_STORE_NAME = "HDIMAGE";
    public static final String HMAC_KECCAK_224_NAME = "HMAC_KECCAK_224";
    public static final String HMAC_KECCAK_256_NAME = "HMAC_KECCAK_256";
    public static final String HMAC_KECCAK_384_NAME = "HMAC_KECCAK_384";
    public static final String HMAC_KECCAK_512_NAME = "HMAC_KECCAK_512";
    public static final String HMAC_SHA1_NAME = "HMAC_SHA1";
    public static final String HMAC_SHA1_OID = "1.2.840.113549.2.7";
    public static final String HMAC_SHA224_NAME = "HMAC_SHA224";
    public static final String HMAC_SHA224_OID = "1.2.840.113549.2.8";
    public static final String HMAC_SHA256_NAME = "HMAC_SHA256";
    public static final String HMAC_SHA256_OID = "1.2.840.113549.2.9";
    public static final String HMAC_SHA384_NAME = "HMAC_SHA384";
    public static final String HMAC_SHA384_OID = "1.2.840.113549.2.10";
    public static final String HMAC_SHA3_224_NAME = "HMAC_SHA3_224";
    public static final String HMAC_SHA3_224_OID = "2.16.840.1.101.3.4.2.13";
    public static final String HMAC_SHA3_256_NAME = "HMAC_SHA3_256";
    public static final String HMAC_SHA3_256_OID = "2.16.840.1.101.3.4.2.14";
    public static final String HMAC_SHA3_384_NAME = "HMAC_SHA3_384";
    public static final String HMAC_SHA3_384_OID = "2.16.840.1.101.3.4.2.15";
    public static final String HMAC_SHA3_512_NAME = "HMAC_SHA3_512";
    public static final String HMAC_SHA3_512_OID = "2.16.840.1.101.3.4.2.16";
    public static final String HMAC_SHA512_NAME = "HMAC_SHA512";
    public static final String HMAC_SHA512_OID = "1.2.840.113549.2.11";
    public static final String INFO = "CryptoPro Java CSP Provider (GOST)";
    public static final String MY_STORE_NAME = "MY";
    public static final String PFX_STORE_NAME = "PFXSTORE";
    public static final String PROVIDER_NAME = "JCSP";
    public static final String PROVIDER_PATH = "ru.CryptoPro.JCSP.";
    public static final String REG_STORE_NAME = "REGISTRY";
    public static final String ROOT_STORE_NAME = "ROOT";
    public static final String RSA_NAME = "RSA";
    public static final String SST_STORE_NAME = "SST";
    public static final String SYMMETRIC_512 = "SYMMETRIC512";
    public static final String TRIPLE_DES_112_NAME = "3DES_112";
    public static final String TRIPLE_DES_NAME = "3DES";
    public static final String X9_19_MAC_NAME_IECPADDING = "ANSI_X9_19_IEC_7816_4_PADDING";
    public static final String X9_19_MAC_NAME_ZEROPADDING = "ANSI_X9_19_ZERO_PADDING";
    protected static final String a = " implementedIn";
    private static final String b = "KeyStore";
    private static final boolean c;

    public static class cl_0 extends JarVersionHolder {
        public static final cl_0 a = new cl_0(JCSP.class);

        public cl_0(Class cls) {
            super(cls);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        g8e.D(sb, str, Constants.KEY_DATA, str, Constants.KEY_DATA);
        String t = oyr.t(sb, str, "ru.cprocsp.ACSP");
        ANDROID_APP_STORE = t;
        ANDROID_APP_STORE_LIB = g8e.p(t, str, "lib");
        c = GetProperty.getBooleanProperty("init_toolkit", Platform.isMacOS());
    }

    public JCSP(String str, double d, String str2, int i) {
        super(str, d, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(64);
        if (c) {
            Toolkit.getDefaultToolkit();
        }
        if (JCSPParameters.a(i)) {
            a(linkedHashMap);
            c(linkedHashMap);
            a(linkedHashMap, a());
        } else {
            JCSPLogger.fine(str2 + " is not configured, cryptographic provider with type " + i + " has not been registered.");
        }
        AccessController.doPrivileged(new cl_1(this, linkedHashMap));
        CAPI.CSP_PROVIDER_INFO.setProperties(this);
    }

    public static JarVersionHolder getJarVersion() {
        return cl_0.a;
    }

    public String ProviderName() {
        return "JCSP";
    }

    public void a(Map map, KeyStoreConfigBase keyStoreConfigBase) {
        String str;
        keyStoreConfigBase.load();
        String current = keyStoreConfigBase.getCurrent();
        String defaultKeyStorePrefix = keyStoreConfigBase.getDefaultKeyStorePrefix();
        String defaultKeyStoreName = keyStoreConfigBase.defaultKeyStoreName();
        Iterator it = KeyStoreConfigBase.convert(current).iterator();
        StringBuffer stringBuffer = new StringBuffer(100);
        while (it.hasNext()) {
            CSPStore cSPStore = (CSPStore) it.next();
            stringBuffer.delete(0, stringBuffer.length());
            String name = cSPStore.getName();
            boolean equals = defaultKeyStoreName.equals(name);
            if (a(name)) {
                putService(new Provider.Service(this, b, name, cSPStore.getClass().getName(), null, null));
                if (equals) {
                    str = defaultKeyStorePrefix;
                    putService(new Provider.Service(this, str, "DEFAULT_CLASS", cSPStore.getClass().getName(), null, null));
                    putService(new Provider.Service(this, str, "DEFAULT_NAME", name, null, null));
                    defaultKeyStorePrefix = str;
                }
            } else {
                stringBuffer.append(JCP.KEY_STORE_PREFIX);
                stringBuffer.append(name);
                map.put(stringBuffer.toString(), cSPStore.getClass().getName());
                if (equals) {
                    map.put(b64.j(defaultKeyStorePrefix, ".DEFAULT_CLASS"), cSPStore.getClass().getName());
                    map.put(defaultKeyStorePrefix + ".DEFAULT_NAME", name);
                }
            }
            str = defaultKeyStorePrefix;
            defaultKeyStorePrefix = str;
        }
    }

    public void b(Map map) {
        map.put("MessageDigest.GOST3411", "ru.CryptoPro.JCSP.Digest.JCSPGostDigest");
        map.put("Alg.Alias.MessageDigest.1.2.643.2.2.9", JCP.GOST_DIGEST_NAME);
        map.put("Alg.Alias.MessageDigest.OID.1.2.643.2.2.9", JCP.GOST_DIGEST_NAME);
        map.put("MessageDigest.GOST3411_2012_256", "ru.CryptoPro.JCSP.Digest.JCSPGostDigest2012_256");
        map.put("Alg.Alias.MessageDigest.1.2.643.7.1.1.2.2", JCP.GOST_DIGEST_2012_256_NAME);
        map.put("Alg.Alias.MessageDigest.OID.1.2.643.7.1.1.2.2", JCP.GOST_DIGEST_2012_256_NAME);
        map.put("MessageDigest.GOST3411_2012_512", "ru.CryptoPro.JCSP.Digest.JCSPGostDigest2012_512");
        map.put("Alg.Alias.MessageDigest.1.2.643.7.1.1.2.3", JCP.GOST_DIGEST_2012_512_NAME);
        map.put("Alg.Alias.MessageDigest.OID.1.2.643.7.1.1.2.3", JCP.GOST_DIGEST_2012_512_NAME);
        map.put("Mac.HMAC_GOSTR3411", "ru.CryptoPro.JCSP.Digest.JCSPGostHMAC");
        map.put("Alg.Alias.Mac.1.2.643.2.2.10", "HMAC_GOSTR3411");
        map.put("Alg.Alias.MessageDigest.OID.1.2.643.2.2.10", "HMAC_GOSTR3411");
        map.put("Mac.HMAC_GOSTR3411_2012_256", "ru.CryptoPro.JCSP.Digest.JCSPGostHMAC2012_256");
        map.put("Alg.Alias.Mac.1.2.643.7.1.1.4.1", "HMAC_GOSTR3411_2012_256");
        map.put("Alg.Alias.MessageDigest.OID.1.2.643.7.1.1.4.1", "HMAC_GOSTR3411_2012_256");
        map.put("Mac.HMAC_GOSTR3411_2012_512", "ru.CryptoPro.JCSP.Digest.JCSPGostHMAC2012_512");
        map.put("Alg.Alias.Mac.1.2.643.7.1.1.4.2", "HMAC_GOSTR3411_2012_512");
        map.put("Alg.Alias.MessageDigest.OID.1.2.643.7.1.1.4.2", "HMAC_GOSTR3411_2012_512");
        map.put("Signature.CryptoProSignature implementedIn", "Software");
        map.put("Signature.CryptoProSignature", "ru.CryptoPro.JCSP.Sign.JCSPCryptoProSign");
        map.put("Signature.NONEwithCryptoProSignature", "ru.CryptoPro.JCSP.Sign.JCSPRawCryptoProSign");
        map.put("Signature.CryptoProSignature_2012_256 implementedIn", "Software");
        map.put("Signature.CryptoProSignature_2012_256", "ru.CryptoPro.JCSP.Sign.JCSPCryptoProSign_2012_256");
        map.put("Signature.NONEwithCryptoProSignature_2012_256", "ru.CryptoPro.JCSP.Sign.JCSPRawCryptoProSign2012_256");
        map.put("Signature.CryptoProSignature_2012_512 implementedIn", "Software");
        map.put("Signature.CryptoProSignature_2012_512", "ru.CryptoPro.JCSP.Sign.JCSPCryptoProSign_2012_512");
        map.put("Signature.NONEwithCryptoProSignature_2012_512", "ru.CryptoPro.JCSP.Sign.JCSPRawCryptoProSign2012_512");
        map.put("Signature.GOST3411withGOST3410EL", "ru.CryptoPro.JCSP.Sign.JCSPGostElSign");
        map.put("Signature.GOST3411withGOST3410DHEL", "ru.CryptoPro.JCSP.Sign.JCSPGostElSign");
        map.put("Signature.NONEwithGOST3410EL", "ru.CryptoPro.JCSP.Sign.JCSPRawGostElSign");
        map.put("Signature.NONEwithGOST3410DHEL", "ru.CryptoPro.JCSP.Sign.JCSPRawGostElSign");
        map.put("Signature.GOST3411_2012_256withGOST3410_2012_256 implementedIn", "Software");
        map.put("Signature.GOST3411_2012_256withGOST3410DH_2012_256 implementedIn", "Software");
        map.put("Signature.GOST3411_2012_256withGOST3410_2012_256", "ru.CryptoPro.JCSP.Sign.JCSPGostElSign_2012_256");
        map.put("Signature.GOST3411_2012_256withGOST3410DH_2012_256", "ru.CryptoPro.JCSP.Sign.JCSPGostElSign_2012_256");
        map.put("Signature.NONEwithGOST3410_2012_256", "ru.CryptoPro.JCSP.Sign.JCSPRawGostElSign2012_256");
        map.put("Signature.NONEwithGOST3410DH_2012_256", "ru.CryptoPro.JCSP.Sign.JCSPRawGostElSign2012_256");
        map.put("Signature.GOST3411_2012_512withGOST3410_2012_512 implementedIn", "Software");
        map.put("Signature.GOST3411_2012_512withGOST3410DH_2012_512 implementedIn", "Software");
        map.put("Signature.GOST3411_2012_512withGOST3410_2012_512", "ru.CryptoPro.JCSP.Sign.JCSPGostElSign_2012_512");
        map.put("Signature.GOST3411_2012_512withGOST3410DH_2012_512", "ru.CryptoPro.JCSP.Sign.JCSPGostElSign_2012_512");
        map.put("Signature.NONEwithGOST3410_2012_512", "ru.CryptoPro.JCSP.Sign.JCSPRawGostElSign2012_512");
        map.put("Signature.NONEwithGOST3410DH_2012_512", "ru.CryptoPro.JCSP.Sign.JCSPRawGostElSign2012_512");
        boolean z = Platform.isAndroid;
        if (z) {
            a(XAdESSignature.ELEMENT_SIGNATURE, "GOST R 34.11-94 with GOST R 34.10-2001", "ru.CryptoPro.JCSP.Sign.JCSPGostElSign");
            a(XAdESSignature.ELEMENT_SIGNATURE, "GOST R 34.11-2012 (256) with GOST R 34.10-2012 (256)", "ru.CryptoPro.JCSP.Sign.JCSPGostElSign_2012_256");
            a(XAdESSignature.ELEMENT_SIGNATURE, "GOST R 34.11-2012 (512) with GOST R 34.10-2012 (512)", "ru.CryptoPro.JCSP.Sign.JCSPGostElSign_2012_512");
        }
        map.put("KeyPairGenerator.GOST3410EL", "ru.CryptoPro.JCSP.Key.JCSPGostKeyPairGenerator");
        map.put("KeyPairGenerator.GOST3410ELEPH", "ru.CryptoPro.JCSP.Key.JCSPGostEphKeyPairGenerator");
        map.put("KeyPairGenerator.GOST3410DHEL", "ru.CryptoPro.JCSP.Key.JCSPGostExchKeyPairGenerator");
        map.put("KeyPairGenerator.GOST3410DHELEPH", "ru.CryptoPro.JCSP.Key.JCSPGostEphExchKeyPairGenerator");
        map.put("KeyPairGenerator.GOST3410_2012_256", "ru.CryptoPro.JCSP.Key.JCSPGostKeyPairGenerator_2012_256");
        map.put("KeyPairGenerator.GOST3410EPH_2012_256", "ru.CryptoPro.JCSP.Key.JCSPGostEphKeyPairGenerator_2012_256");
        map.put("KeyPairGenerator.GOST3410DH_2012_256", "ru.CryptoPro.JCSP.Key.JCSPGostExchKeyPairGenerator_2012_256");
        map.put("KeyPairGenerator.GOST3410DHEPH_2012_256", "ru.CryptoPro.JCSP.Key.JCSPGostEphExchKeyPairGenerator_2012_256");
        map.put("KeyPairGenerator.GOST3410_2012_512", "ru.CryptoPro.JCSP.Key.JCSPGostKeyPairGenerator_2012_512");
        map.put("KeyPairGenerator.GOST3410EPH_2012_512", "ru.CryptoPro.JCSP.Key.JCSPGostEphKeyPairGenerator_2012_512");
        map.put("KeyPairGenerator.GOST3410DH_2012_512", "ru.CryptoPro.JCSP.Key.JCSPGostExchKeyPairGenerator_2012_512");
        map.put("KeyPairGenerator.GOST3410DHEPH_2012_512", "ru.CryptoPro.JCSP.Key.JCSPGostEphExchKeyPairGenerator_2012_512");
        map.put("KeyFactory.GOST3410EL", "ru.CryptoPro.JCSP.Key.JCSPGostKeyFactory");
        map.put("KeyFactory.GOST3410DHEL", "ru.CryptoPro.JCSP.Key.JCSPGostExchKeyFactory");
        map.put("KeyFactory.GOST3410_2012_256", "ru.CryptoPro.JCSP.Key.JCSPGostKeyFactory");
        map.put("KeyFactory.GOST3410DH_2012_256", "ru.CryptoPro.JCSP.Key.JCSPGostExchKeyFactory");
        map.put("KeyFactory.GOST3410_2012_512", "ru.CryptoPro.JCSP.Key.JCSPGostKeyFactory");
        map.put("KeyFactory.GOST3410DH_2012_512", "ru.CryptoPro.JCSP.Key.JCSPGostExchKeyFactory");
        map.put("Alg.Alias.KeyPairGenerator.1.2.643.2.2.19", JCP.GOST_EL_DEGREE_NAME);
        map.put("Alg.Alias.KeyPairGenerator.OID.1.2.643.2.2.19", JCP.GOST_EL_DEGREE_NAME);
        map.put("Alg.Alias.KeyPairGenerator.1.2.643.7.1.1.1.1", JCP.GOST_EL_2012_256_NAME);
        map.put("Alg.Alias.KeyPairGenerator.OID.1.2.643.7.1.1.1.1", JCP.GOST_EL_2012_256_NAME);
        map.put("Alg.Alias.KeyPairGenerator.1.2.643.7.1.1.1.2", JCP.GOST_EL_2012_512_NAME);
        map.put("Alg.Alias.KeyPairGenerator.OID.1.2.643.7.1.1.1.2", JCP.GOST_EL_2012_512_NAME);
        map.put("Mac.GOST28147", "ru.CryptoPro.JCSP.Cipher.GostMac");
        map.put("Mac.GR3413_2015_M_IMIT", "ru.CryptoPro.JCSP.Cipher.GostMMac");
        map.put("Mac.GR3413_2015_K_IMIT", "ru.CryptoPro.JCSP.Cipher.GostKMac");
        map.put("Mac.GOST3412_2015_M", "ru.CryptoPro.JCSP.Cipher.GostMMac");
        map.put("Mac.GOST3412_2015_K", "ru.CryptoPro.JCSP.Cipher.GostKMac");
        map.put("Cipher.GOST28147", "ru.CryptoPro.JCSP.Cipher.JCSPGostCipher");
        map.put("Cipher.GOST3412_2015_M", "ru.CryptoPro.JCSP.Cipher.JCSPGostMCipher");
        map.put("Cipher.GOST3412_2015_K", "ru.CryptoPro.JCSP.Cipher.JCSPGostKCipher");
        map.put("Cipher.GostJCE", "ru.CryptoPro.JCSP.Cipher.JCSPGostCipher");
        map.put("Cipher.GostTransport", "ru.CryptoPro.JCSP.Cipher.TransportCipher");
        map.put("Cipher.GostTransportK", "ru.CryptoPro.JCSP.Cipher.TransportKCipher");
        map.put("Cipher.GostTransportM", "ru.CryptoPro.JCSP.Cipher.TransportMCipher");
        map.put("Cipher.XmlGostTransport2001", "ru.CryptoPro.JCSP.Cipher.XmlTransportCipher2001");
        map.put("Cipher.XmlGostTransport2012_256", "ru.CryptoPro.JCSP.Cipher.XmlTransportCipher2012_256");
        map.put("Cipher.XmlGostTransport2012_512", "ru.CryptoPro.JCSP.Cipher.XmlTransportCipher2012_512");
        map.put("KeyAgreement.GOST3410DHEL", "ru.CryptoPro.JCSP.Key.JCSPKeyAgreement");
        map.put("KeyAgreement.GOST3410EL", "ru.CryptoPro.JCSP.Key.JCSPKeyAgreement");
        map.put("KeyAgreement.GOST3410DH_2012_256", "ru.CryptoPro.JCSP.Key.JCSPKeyAgreement");
        map.put("KeyAgreement.GOST3410_2012_256", "ru.CryptoPro.JCSP.Key.JCSPKeyAgreement");
        map.put("KeyAgreement.GOST3410DH_2012_512", "ru.CryptoPro.JCSP.Key.JCSPKeyAgreement");
        map.put("KeyAgreement.GOST3410_2012_512", "ru.CryptoPro.JCSP.Key.JCSPKeyAgreement");
        map.put("KeyGenerator.GOST28147", "ru.CryptoPro.JCSP.Key.JCSPGostKeyGenerator");
        map.put("KeyGenerator.GOST3412_2015_M", "ru.CryptoPro.JCSP.Key.JCSPGostMKeyGenerator");
        map.put("KeyGenerator.GOST3412_2015_K", "ru.CryptoPro.JCSP.Key.JCSPGostKKeyGenerator");
        map.put("KeyGenerator.SYMMETRIC512", "ru.CryptoPro.JCSP.Key.JCSPSymmetric512KeyGenerator");
        map.put("KeyGenerator.MASTER_KEY", "ru.CryptoPro.JCSP.Key.JCSPGostKeyTls1MasterGenerator");
        map.put("SecretKeyFactory.GOST28147", "ru.CryptoPro.JCSP.Key.GostSecretKeyFactory");
        map.put("SecretKeyFactory.GOST3412_2015_M", "ru.CryptoPro.JCSP.Key.GostMagmaKeyFactory");
        map.put("SecretKeyFactory.GOST3412_2015_K", "ru.CryptoPro.JCSP.Key.GostKuznechikKeyFactory");
        map.put("SecretKeyFactory.SYMMETRIC512", "ru.CryptoPro.JCSP.Key.GostSymmetric512KeyFactory");
        map.put("SecretKeyFactory.MASTER_KEY", "ru.CryptoPro.JCSP.Key.GostMasterSecretKeyFactory");
        map.put("SecretKeyFactory.EXTENDED_MASTER_KEY", "ru.CryptoPro.JCSP.Key.GostExtendedMasterSecretKeyFactory");
        map.put("SecretKeyFactory.MASTER_DUPLICATE_KEY", "ru.CryptoPro.JCSP.Key.tls.GostDuplicateMasterSecretKeyFactory");
        map.put("SecretKeyFactory.GOST3412_2015_K_MASTER_KEY", "ru.CryptoPro.JCSP.Key.tls.GostKuzMasterSecretKeyFactory");
        map.put("SecretKeyFactory.GOST3412_2015_K_TLS_CIPHER_KEY", "ru.CryptoPro.JCSP.Key.tls.GostKuzPerMasterCipherSecretKeyFactory");
        map.put("SecretKeyFactory.GOST3412_2015_K_TLS_MAC_KEY", "ru.CryptoPro.JCSP.Key.tls.GostKuzPerMasterMacSecretKeyFactory");
        map.put("SecretKeyFactory.GOST3412_2015_K_TLS_DERIVED_CIPHER_KEY", "ru.CryptoPro.JCSP.Key.tls.GostKuzPerMasterDerivedSecretKeyFactory");
        map.put("SecretKeyFactory.GOST3412_2015_K_TLS_DERIVED_MAC_KEY", "ru.CryptoPro.JCSP.Key.tls.GostKuzPerMasterDerivedSecretKeyFactory");
        map.put("Signature.CryptoProSignature KeySize", "1024");
        map.put("KeyPairGenerator.GOST3410EL KeySize", "1024");
        map.put("AlgorithmParameterGenerator.GOST3410EL KeySize", "1024");
        map.put("Signature.GOST3411_2012_256withGOST3410_2012_256 KeySize", "1024");
        map.put("Signature.GOST3411_2012_256withGOST3410DH_2012_256 KeySize", "1024");
        map.put("KeyPairGenerator.GOST3410_2012_256 KeySize", "1024");
        map.put("KeyPairGenerator.GOST3410DH_2012_256 KeySize", "1024");
        map.put("AlgorithmParameterGenerator.GOST3410_2012_256 KeySize", "1024");
        map.put("AlgorithmParameterGenerator.GOST3410DH_2012_256 KeySize", "1024");
        map.put("Signature.GOST3411_2012_512withGOST3410_2012_512 KeySize", "2048");
        map.put("Signature.GOST3411_2012_512withGOST3410DH_2012_512 KeySize", "2048");
        map.put("KeyPairGenerator.GOST3410_2012_512 KeySize", "2048");
        map.put("KeyPairGenerator.GOST3410DH_2012_512 KeySize", "2048");
        map.put("AlgorithmParameterGenerator.GOST3410_2012_512 KeySize", "2048");
        map.put("AlgorithmParameterGenerator.GOST3410DH_2012_512 KeySize", "2048");
        map.put("KeyPairGenerator.GOST3410EL implementedIn", "Software");
        map.put("MessageDigest.GOST3411 implementedIn", "Software");
        map.put("AlgorithmParameters.GOST3410EL implementedIn", "Software");
        map.put("KeyFactory.GOST3410EL implementedIn", "Software");
        map.put("KeyFactory.GOST3410DHEL implementedIn", "Software");
        map.put("KeyPairGenerator.GOST3410_2012_256 implementedIn", "Software");
        map.put("KeyPairGenerator.GOST3410DH_2012_256 implementedIn", "Software");
        map.put("MessageDigest.GOST3411_2012_256 implementedIn", "Software");
        map.put("AlgorithmParameters.GOST3410_2012_256 implementedIn", "Software");
        map.put("AlgorithmParameters.GOST3410DH_2012_256 implementedIn", "Software");
        map.put("KeyFactory.GOST3410_2012_256 implementedIn", "Software");
        map.put("KeyFactory.GOST3410DH_2012_256 implementedIn", "Software");
        map.put("KeyPairGenerator.GOST3410_2012_512 implementedIn", "Software");
        map.put("KeyPairGenerator.GOST3410DH_2012_512 implementedIn", "Software");
        map.put("MessageDigest.GOST3411_2012_512 implementedIn", "Software");
        map.put("AlgorithmParameters.GOST3410_2012_512 implementedIn", "Software");
        map.put("AlgorithmParameters.GOST3410DH_2012_512 implementedIn", "Software");
        map.put("KeyFactory.GOST3410_2012_512 implementedIn", "Software");
        map.put("KeyFactory.GOST3410DH_2012_512 implementedIn", "Software");
        map.put("Alg.Alias.Signature.OID.1.2.643.2.2.3", "GOST3411withGOST3410EL");
        map.put("Alg.Alias.Signature.1.2.643.2.2.3", "GOST3411withGOST3410EL");
        map.put("Alg.Alias.Signature.1.2.643.2.2.9with1.2.643.2.2.19", "GOST3411withGOST3410EL");
        map.put("Alg.Alias.Signature.1.2.643.2.2.9with1.2.643.2.2.98", JCP.GOST_DHEL_SIGN_NAME);
        map.put("Alg.Alias.Signature.1.2.643.7.1.1.3.2", JCP.GOST_SIGN_2012_256_NAME);
        map.put("Alg.Alias.Signature.OID.1.2.643.7.1.1.3.2", JCP.GOST_SIGN_2012_256_NAME);
        map.put("Alg.Alias.Signature.1.2.643.7.1.1.2.2with1.2.643.7.1.1.1.1", JCP.GOST_SIGN_2012_256_NAME);
        map.put("Alg.Alias.Signature.1.2.643.7.1.1.3.3", JCP.GOST_SIGN_2012_512_NAME);
        map.put("Alg.Alias.Signature.OID.1.2.643.7.1.1.3.3", JCP.GOST_SIGN_2012_512_NAME);
        map.put("Alg.Alias.Signature.1.2.643.7.1.1.2.3with1.2.643.7.1.1.1.2", JCP.GOST_SIGN_2012_512_NAME);
        map.put("AlgorithmParameters.GOST_OMAC", "ru.CryptoPro.JCP.params.OmacParams");
        map.put("AlgorithmParameters.GOST_PARAM_VALIDATOR", "ru.CryptoPro.JCSP.params.AlgorithmParameterValidator");
        map.put("AlgorithmParameters.GOST3410EL", "ru.CryptoPro.JCSP.params.JCSPGost2001AlgorithmParameters");
        map.put("AlgorithmParameters.GOST3410DHEL", "ru.CryptoPro.JCSP.params.JCSPGost2001AlgorithmParameters");
        map.put("AlgorithmParameters.GOST3410_2012_256", "ru.CryptoPro.JCSP.params.JCSPGost2012AlgorithmParameters");
        map.put("AlgorithmParameters.GOST3410DH_2012_256", "ru.CryptoPro.JCSP.params.JCSPGost2012AlgorithmParameters");
        map.put("AlgorithmParameters.GOST3410_2012_512", "ru.CryptoPro.JCSP.params.JCSPGost2012AlgorithmParameters");
        map.put("AlgorithmParameters.GOST3410DH_2012_512", "ru.CryptoPro.JCSP.params.JCSPGost2012AlgorithmParameters");
        map.put("AlgorithmParameters.1.2.643.2.2.20", "ru.CryptoPro.JCSP.params.JCSPGostOldAlgorithmParameters");
        map.put("AlgorithmParameters.1.2.643.2.2.99", "ru.CryptoPro.JCSP.params.JCSPGostOldAlgorithmParameters");
        map.put("Alg.Alias.AlgorithmParameters.1.2.643.2.2.19", JCP.GOST_EL_DEGREE_NAME);
        map.put("Alg.Alias.AlgorithmParameters.1.2.643.2.2.98", "GOST3410DHEL");
        map.put("Alg.Alias.AlgorithmParameters.1.2.643.7.1.1.1.1", JCP.GOST_EL_2012_256_NAME);
        map.put("Alg.Alias.AlgorithmParameters.1.2.643.7.1.1.6.1", JCP.GOST_DH_2012_256_NAME);
        map.put("Alg.Alias.AlgorithmParameters.1.2.643.7.1.1.1.2", JCP.GOST_EL_2012_512_NAME);
        map.put("Alg.Alias.AlgorithmParameters.1.2.643.7.1.1.6.2", JCP.GOST_DH_2012_512_NAME);
        map.put("Alg.Alias.KeyFactory.1.2.643.2.2.19", JCP.GOST_EL_DEGREE_NAME);
        map.put("Alg.Alias.KeyFactory.1.2.643.2.2.98", "GOST3410DHEL");
        map.put("Alg.Alias.KeyFactory.1.2.643.7.1.1.1.1", JCP.GOST_EL_2012_256_NAME);
        map.put("Alg.Alias.KeyFactory.1.2.643.7.1.1.6.1", JCP.GOST_DH_2012_256_NAME);
        map.put("Alg.Alias.KeyFactory.1.2.643.7.1.1.1.2", JCP.GOST_EL_2012_512_NAME);
        map.put("Alg.Alias.KeyFactory.1.2.643.7.1.1.6.2", JCP.GOST_DH_2012_512_NAME);
        map.put("KeyStore.CertStore", z ? "ru.CryptoPro.JCSP.KeyStore.JCSPTrustStore" : "ru.CryptoPro.JCP.KeyStore.TrustStore");
    }

    public void c(Map map) {
    }

    @Override // java.util.Hashtable
    public synchronized Object clone() {
        return super.clone();
    }

    public JCSP() {
        super("JCSP", getJarVersion().getProductVersion().doubleValue(), INFO);
        LinkedHashMap linkedHashMap = new LinkedHashMap(64);
        if (c) {
            Toolkit.getDefaultToolkit();
        }
        a(linkedHashMap);
        b(linkedHashMap);
        a(linkedHashMap, a());
        AccessController.doPrivileged(new ru.CryptoPro.JCSP.cl_0(this, linkedHashMap));
        CAPI.CSP_PROVIDER_INFO.setProperties(this);
    }

    public void a(String str, String str2, String str3) {
        putService(new Provider.Service(this, str, str2, str3, null, null));
    }

    public void a(Map map) {
        map.put("SecureRandom.CPRandom implementedIn", "Software");
        map.put("SecureRandom.HardwareRandom implementedIn", "Software");
        map.put("SecureRandom.CPRandom", "ru.CryptoPro.JCSP.Random.JCSPCPRandom");
        map.put("SecureRandom.HardwareRandom", "ru.CryptoPro.JCSP.Random.JCSPHardwareRandom");
        map.put("KeyStore.PFXSTORE", "ru.CryptoPro.JCSP.KeyStore.PFXStore");
        map.put("KeyStore.MY", "ru.CryptoPro.JCSP.KeyStore.MY");
        map.put("KeyStore.ROOT", "ru.CryptoPro.JCSP.KeyStore.ROOT");
        map.put("KeyStore.CA", "ru.CryptoPro.JCSP.KeyStore.CA");
        map.put("KeyStore.AddressBook", "ru.CryptoPro.JCSP.KeyStore.AddressBook");
        map.put("KeyStore.FILE", "ru.CryptoPro.JCSP.KeyStore.FILE");
        map.put("KeyStore.SST", "ru.CryptoPro.JCSP.KeyStore.FILE");
        map.put("KeyStore.HDImageFileInternal", "ru.CryptoPro.JCSP.KeyStore.JCSPHDImageFile");
        map.put("SecretKeyFactory.LOCAL_CONTEXT", "ru.CryptoPro.JCSP.Key.context.SecretKeyContextFactory");
    }

    public KeyStoreConfigBase a() {
        return KeyStoreConfig.getInstance();
    }

    private static boolean a(String str) {
        return str != null && str.indexOf(32) > -1;
    }
}
