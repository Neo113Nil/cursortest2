package com.google.crypto.tink.internal;

import com.google.crypto.tink.util.Bytes;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class Util {
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static final Bytes checkedToBytesFromPrintableAscii(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return Bytes.copyFrom(bArr);
    }

    public static boolean isPrefix(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static final Bytes toBytesFromPrintableAscii(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new TinkBugException("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return Bytes.copyFrom(bArr);
    }
}
