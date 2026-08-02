package ru.CryptoPro.JCSP.Key;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.Key.ecdsa.ECDHPrivateKey;
import ru.CryptoPro.JCSP.Key.ecdsa.ECDSAPrivateKey;
import ru.CryptoPro.JCSP.Key.ecdsa.ECDSAPublicKey;
import ru.CryptoPro.JCSP.Key.eddsa.EDDSAPrivateKey;
import ru.CryptoPro.JCSP.Key.eddsa.EDDSAPublicKey;
import ru.CryptoPro.JCSP.Key.foreign.ForeignSymmetricKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAExchPrivateKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAPrivateKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAPublicKey;

/* loaded from: classes4.dex */
public class cl_2 {

    public static class cl_0 {
        public final KeyPair a;
        public final String b;
        public final String c;

        public cl_0(KeyPair keyPair, String str, String str2) {
            this.a = keyPair;
            this.b = str;
            this.c = str2;
        }
    }

    public static Key a(AbstractKeySpec abstractKeySpec) throws InvalidKeySpecException {
        if (abstractKeySpec instanceof JCSPSecretKeySpec) {
            return abstractKeySpec.isForeignKey() ? new ForeignSymmetricKey((JCSPSecretKeySpec) abstractKeySpec) : new GostSecretKey((JCSPSecretKeySpec) abstractKeySpec);
        }
        int i = cl_3.a[abstractKeySpec.getKeyAlgorithmGroup().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? abstractKeySpec instanceof ExchPrivateKeySpec ? new GostExchPrivateKey(abstractKeySpec) : new GostPrivateKey(abstractKeySpec) : new EDDSAPrivateKey(abstractKeySpec) : abstractKeySpec instanceof ExchPrivateKeySpec ? new ECDHPrivateKey(abstractKeySpec) : new ECDSAPrivateKey(abstractKeySpec) : abstractKeySpec instanceof ExchPrivateKeySpec ? new RSAExchPrivateKey(abstractKeySpec) : new RSAPrivateKey(abstractKeySpec);
    }

    public static cl_0 b(AbstractKeySpec abstractKeySpec) throws InvalidKeySpecException, InvalidKeyException {
        PrivateKey privateKey = (PrivateKey) a(abstractKeySpec);
        PublicKeySpec publicKeySpec = (PublicKeySpec) abstractKeySpec.generatePublic();
        int i = cl_3.a[abstractKeySpec.getKeyAlgorithmGroup().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? new cl_0(new KeyPair(new GostPublicKey(publicKeySpec), privateKey), "JCSP", null) : new cl_0(new KeyPair(new EDDSAPublicKey(publicKeySpec), privateKey), "JCSPEDDSA", "CP_Ed25519") : new cl_0(new KeyPair(new ECDSAPublicKey(publicKeySpec), privateKey), "JCSPECDSA", JCP.SIGN_CP_SHA256_ECDSA_NAME) : new cl_0(new KeyPair(new RSAPublicKey(publicKeySpec), privateKey), "JCSPRSA", JCP.SIGN_CP_SHA256_RSA_NAME);
    }

    public static PublicKey a(JCSPPublicKeyInterface jCSPPublicKeyInterface) throws InvalidKeySpecException {
        int i = cl_3.a[jCSPPublicKeyInterface.getKeyAlgorithmGroup().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? new GostPublicKey(jCSPPublicKeyInterface) : new EDDSAPublicKey(jCSPPublicKeyInterface) : new ECDSAPublicKey(jCSPPublicKeyInterface) : new RSAPublicKey(jCSPPublicKeyInterface);
    }
}
