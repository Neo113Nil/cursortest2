package ru.CryptoPro.JCP.Util;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPublicKey;

/* loaded from: classes4.dex */
public class PublicKeyConvertor {
    public static PublicKey convert(PublicKey publicKey, String str) throws Exception {
        if (publicKey instanceof InternalGostPublicKey) {
            return publicKey;
        }
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(publicKey.getEncoded());
        if (str == null) {
            throw new Exception("Provider name is required for decoding of unknown public key: " + publicKey.getAlgorithm());
        }
        PublicKey generatePublic = KeyFactory.getInstance(JCP.GOST_EL_DEGREE_NAME, str).generatePublic(x509EncodedKeySpec);
        if (generatePublic instanceof InternalGostPublicKey) {
            return generatePublic;
        }
        throw new Exception("Invalid public key format: " + generatePublic.getFormat());
    }
}
