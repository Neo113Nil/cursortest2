package ru.CryptoPro.JCP.tools;

import java.security.Key;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class AlgorithmTools {
    public static String getSignatureAlgorithmByPrivateKey(Key key) {
        if (key == null) {
            return "GOST3411withGOST3410EL";
        }
        String algorithm = key.getAlgorithm();
        return (algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) ? JCP.GOST_SIGN_2012_256_NAME : (algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) ? JCP.GOST_SIGN_2012_512_NAME : (algorithm.equalsIgnoreCase("RSA") || algorithm.equalsIgnoreCase("CP_RSA")) ? JCP.SIGN_CP_SHA256_RSA_NAME : (algorithm.equalsIgnoreCase(JCP.ECDSA_NAME) || algorithm.equalsIgnoreCase(JCP.CP_ECDSA_NAME) || algorithm.equalsIgnoreCase(JCP.ECDH_NAME) || algorithm.equalsIgnoreCase(JCP.CP_ECDH_NAME)) ? JCP.SIGN_CP_SHA256_ECDSA_NAME : "GOST3411withGOST3410EL";
    }
}
