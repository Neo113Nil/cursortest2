package ru.CryptoPro.Crypto;

import defpackage.g8e;
import defpackage.yq61;
import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class CryptoProvider extends Provider {
    public static final String GOST_CIPHER_NAME = "GOST28147";
    public static final String GOST_CIPHER_NAME_CLEAR = "GOST28147Clear";
    public static final String GOST_EL_DH_OID = "1.2.643.2.2.98";
    public static final String GOST_K_CIPHER_NAME = "GOST3412_2015_K";
    public static final String GOST_M_CIPHER_NAME = "GOST3412_2015_M";
    public static final String GOST_TRANSPORT = "GostTransport";
    public static final String GOST_TRANSPORT_K = "GostTransportK";
    public static final String GOST_TRANSPORT_M = "GostTransportM";
    public static final String PROVIDER_INFO = "CryptoPro Java Cipher Provider.";
    public static final String PROVIDER_NAME = "Crypto";
    public static final String SYMMETRIC_512 = "SYMMETRIC512";

    public CryptoProvider() {
        super("Crypto", JCP.getJarVersion().getProductVersion().doubleValue(), PROVIDER_INFO);
        HashMap u = g8e.u("Mac.GOST28147Clear", "ru.CryptoPro.Crypto.Cipher.GostMac", "Cipher.GOST28147Clear", "ru.CryptoPro.Crypto.Cipher.GostSimpleCipher");
        u.put("Mac.GOST28147", "ru.CryptoPro.Crypto.Cipher.GostMeshedMac");
        u.put("Mac.GR3413_2015_M_IMIT", "ru.CryptoPro.Crypto.Cipher.GostMagmaMac");
        u.put("Mac.GR3413_2015_K_IMIT", "ru.CryptoPro.Crypto.Cipher.GostKuznechikMac");
        u.put("Mac.GOST3412_2015_M", "ru.CryptoPro.Crypto.Cipher.GostMagmaMac");
        u.put("Mac.GOST3412_2015_K", "ru.CryptoPro.Crypto.Cipher.GostKuznechikMac");
        u.put("Cipher.GOST28147", "ru.CryptoPro.Crypto.Cipher.GostMeshedCipher");
        u.put("Cipher.GOST3412_2015_M", "ru.CryptoPro.Crypto.Cipher.GostMagmaCipher");
        u.put("Cipher.GOST3412_2015_K", "ru.CryptoPro.Crypto.Cipher.GostKuznechikCipher");
        u.put("Cipher.GostJCEClear", "ru.CryptoPro.Crypto.Cipher.GostJCESimpleCipher");
        u.put("Cipher.GostJCE", "ru.CryptoPro.Crypto.Cipher.GostJCEMeshedCipher");
        u.put("Cipher.GostTransport", "ru.CryptoPro.Crypto.Cipher.TransportCipher");
        u.put("Cipher.GostTransportK", "ru.CryptoPro.Crypto.Cipher.TransportKCipher");
        u.put("Cipher.GostTransportM", "ru.CryptoPro.Crypto.Cipher.TransportMCipher");
        u.put("Cipher.XmlGostTransport2001", "ru.CryptoPro.Crypto.Cipher.XmlTransportCipher2001");
        u.put("Cipher.XmlGostTransport2012_256", "ru.CryptoPro.Crypto.Cipher.XmlTransportCipher2012_256");
        u.put("Cipher.XmlGostTransport2012_512", "ru.CryptoPro.Crypto.Cipher.XmlTransportCipher2012_512");
        u.put("KeyPairGenerator.GOST3410DHEL", "ru.CryptoPro.Crypto.Key.GostExchKeyPairGenerator");
        u.put("KeyPairGenerator.GOST3410DHELEPH", "ru.CryptoPro.Crypto.Key.GostEphExchKeyPairGenerator");
        u.put("KeyPairGenerator.GOST3410DH_2012_256", "ru.CryptoPro.Crypto.Key.GostExchKeyPairGenerator2012_256");
        u.put("KeyPairGenerator.GOST3410DHEPH_2012_256", "ru.CryptoPro.Crypto.Key.GostEphExchKeyPairGenerator2012_256");
        u.put("KeyPairGenerator.GOST3410DH_2012_512", "ru.CryptoPro.Crypto.Key.GostExchKeyPairGenerator2012_512");
        u.put("KeyPairGenerator.GOST3410DHEPH_2012_512", "ru.CryptoPro.Crypto.Key.GostEphExchKeyPairGenerator2012_512");
        u.put("Alg.Alias.KeyPairGenerator.1.2.643.2.2.19", "GOST3410DHEL");
        u.put("Alg.Alias.KeyPairGenerator.OID.1.2.643.2.2.19", "GOST3410DHEL");
        u.put("Alg.Alias.KeyPairGenerator.1.2.643.7.1.1.1.1", JCP.GOST_DH_2012_256_NAME);
        u.put("Alg.Alias.KeyPairGenerator.OID.1.2.643.7.1.1.1.1", JCP.GOST_DH_2012_256_NAME);
        u.put("Alg.Alias.KeyPairGenerator.1.2.643.7.1.1.1.2", JCP.GOST_DH_2012_512_NAME);
        u.put("Alg.Alias.KeyPairGenerator.OID.1.2.643.7.1.1.1.2", JCP.GOST_DH_2012_512_NAME);
        u.put("KeyAgreement.GOST3410DHEL", "ru.CryptoPro.Crypto.Key.KeyAgreement");
        u.put("KeyAgreement.GOST3410EL", "ru.CryptoPro.Crypto.Key.KeyAgreement");
        u.put("KeyAgreement.GOST3410DH_2012_256", "ru.CryptoPro.Crypto.Key.KeyAgreement");
        u.put("KeyAgreement.GOST3410_2012_256", "ru.CryptoPro.Crypto.Key.KeyAgreement");
        u.put("KeyAgreement.GOST3410DH_2012_512", "ru.CryptoPro.Crypto.Key.KeyAgreement");
        u.put("KeyAgreement.GOST3410_2012_512", "ru.CryptoPro.Crypto.Key.KeyAgreement");
        u.put("KeyGenerator.GOST28147", "ru.CryptoPro.Crypto.Key.GostKeyGenerator");
        u.put("KeyGenerator.SYMMETRIC512", "ru.CryptoPro.Crypto.Key.Symmetric512KeyGenerator");
        u.put("KeyGenerator.GOST3412_2015_M", "ru.CryptoPro.Crypto.Key.GostMagmaKeyGenerator");
        u.put("KeyGenerator.GOST3412_2015_K", "ru.CryptoPro.Crypto.Key.GostKuznechikKeyGenerator");
        u.put("Mac.HMAC_GOSTR3411", "ru.CryptoPro.Crypto.Cipher.GostHMAC");
        u.put("Alg.Alias.Mac.1.2.643.2.2.10", "HMAC_GOSTR3411");
        u.put("Alg.Alias.Mac.OID.1.2.643.2.2.10", "HMAC_GOSTR3411");
        u.put("Mac.HMAC_GOSTR3411_2012_256", "ru.CryptoPro.Crypto.Cipher.GostHMAC2012_256");
        u.put("Alg.Alias.Mac.1.2.643.7.1.1.4.1", "HMAC_GOSTR3411_2012_256");
        u.put("Alg.Alias.Mac.OID.1.2.643.7.1.1.4.1", "HMAC_GOSTR3411_2012_256");
        u.put("Mac.HMAC_GOSTR3411_2012_512", "ru.CryptoPro.Crypto.Cipher.GostHMAC2012_512");
        u.put("Alg.Alias.Mac.1.2.643.7.1.1.4.2", "HMAC_GOSTR3411_2012_512");
        u.put("Alg.Alias.Mac.OID.1.2.643.7.1.1.4.2", "HMAC_GOSTR3411_2012_512");
        u.put("AlgorithmParameters.GOST_OMAC", "ru.CryptoPro.JCP.params.OmacParams");
        u.put("KeyFactory.GOST28147", "ru.CryptoPro.Crypto.Key.CryptoKeyFactory");
        u.put("SecretKeyFactory.GOST28147", "ru.CryptoPro.Crypto.Key.GostSecretKeyFactory");
        u.put("SecretKeyFactory.GOST3412_2015_M", "ru.CryptoPro.Crypto.Key.GostMagmaKeyFactory");
        u.put("SecretKeyFactory.GOST3412_2015_K", "ru.CryptoPro.Crypto.Key.GostKuznechikKeyFactory");
        u.put("SecretKeyFactory.SYMMETRIC512", "ru.CryptoPro.Crypto.Key.GostSymmetric512Factory");
        u.put("SecretKeyFactory.MASTER_KEY", "ru.CryptoPro.Crypto.Key.GostMasterSecretKeyFactory");
        u.put("SecretKeyFactory.EXTENDED_MASTER_KEY", "ru.CryptoPro.Crypto.Key.GostExtendedMasterSecretKeyFactory");
        AccessController.doPrivileged(new yq61(0, this, u));
    }
}
