package ru.CryptoPro.JCP.Key;

import java.nio.ByteBuffer;
import java.security.PublicKey;
import ru.CryptoPro.JCP.Util.HexDumpEncoder;

/* loaded from: classes4.dex */
public class StrictModeHelper {
    public static boolean warnIfKeyIsUntrusted(PublicKey publicKey, boolean z, boolean z2, StringBuffer stringBuffer) {
        if (!z2 || z) {
            return false;
        }
        String str = "Passed public key is untrusted, it might cause an error during signature validation in strict mode;\nclass: " + publicKey.getClass().getCanonicalName() + ", algorithm: " + publicKey.getAlgorithm();
        HexDumpEncoder hexDumpEncoder = new HexDumpEncoder();
        stringBuffer.append(str);
        stringBuffer.append("\n");
        stringBuffer.append(hexDumpEncoder.encode(ByteBuffer.wrap(publicKey.getEncoded())));
        return true;
    }
}
