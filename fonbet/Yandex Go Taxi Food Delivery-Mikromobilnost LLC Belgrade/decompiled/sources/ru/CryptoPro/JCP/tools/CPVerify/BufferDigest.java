package ru.CryptoPro.JCP.tools.CPVerify;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.PaneDefaultProvider;

/* loaded from: classes4.dex */
public class BufferDigest {
    public static byte[] getDigest(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[16384];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(JCP.GOST_DIGEST_NAME, PaneDefaultProvider.getDefaultDigestSignatureProvider(null));
            while (inputStream.available() > 0) {
                messageDigest.update(bArr, 0, inputStream.read(bArr));
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new Error(e.getMessage());
        } catch (NoSuchProviderException e2) {
            throw new Error(e2.getMessage());
        }
    }

    public static boolean verifyDigest(InputStream inputStream, byte[] bArr) throws IOException {
        if (bArr == null) {
            return false;
        }
        return Arrays.equals(getDigest(inputStream), bArr);
    }
}
