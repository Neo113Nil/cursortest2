package ru.CryptoPro.ssl.util;

import java.security.PrivateKey;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;

/* loaded from: classes4.dex */
public class GostKeyUtil {
    public static String[] getAlgorithms(byte[] bArr) {
        String[] strArr = new String[bArr.length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            if (i2 == 238) {
                strArr[i] = JCP.GOST_EL_2012_256_NAME;
            } else if (i2 != 239) {
                strArr[i] = JCP.GOST_EL_DEGREE_NAME;
            } else {
                strArr[i] = JCP.GOST_EL_2012_512_NAME;
            }
            i++;
        }
        return strArr;
    }

    public static boolean isAvailable2012DHAllowed(PrivateKey privateKey) {
        PrivateKeyInterface privateKeyInterface = (PrivateKeyInterface) ((InternalGostPrivateKey) privateKey).getSpec();
        String algorithm = privateKey.getAlgorithm();
        if (algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME)) {
            return privateKeyInterface.isDhAllowed();
        }
        return true;
    }
}
