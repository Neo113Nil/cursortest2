package defpackage;

import java.io.ByteArrayOutputStream;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes9.dex */
public final class ruu0 {
    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static byte[] b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String c(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + HexString.CHAR_SPACE);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static void d(char[] cArr, ByteArrayOutputStream byteArrayOutputStream) {
        int i = 0;
        while (i < cArr.length) {
            char c = cArr[i];
            if (c < 128) {
                byteArrayOutputStream.write(c);
            } else if (c < 2048) {
                byteArrayOutputStream.write((c >> 6) | 192);
                byteArrayOutputStream.write((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                byteArrayOutputStream.write((c >> '\f') | 224);
                byteArrayOutputStream.write(((c >> 6) & 63) | 128);
                byteArrayOutputStream.write((c & '?') | 128);
            } else {
                i++;
                if (i >= cArr.length) {
                    ny61.r("invalid UTF-16 codepoint");
                    return;
                }
                char c2 = cArr[i];
                if (c > 56319) {
                    ny61.r("invalid UTF-16 codepoint");
                    return;
                }
                int i2 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                byteArrayOutputStream.write((i2 >> 18) | PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                byteArrayOutputStream.write(((i2 >> 12) & 63) | 128);
                byteArrayOutputStream.write(((i2 >> 6) & 63) | 128);
                byteArrayOutputStream.write((i2 & 63) | 128);
            }
            i++;
        }
    }
}
