package defpackage;

import com.google.protobuf.ByteString;

/* loaded from: classes11.dex */
public abstract class tlt0 {
    public static final ByteString a(String str) {
        if (str.length() == 0) {
            return ByteString.a;
        }
        int length = str.length();
        if (length % 2 != 0) {
            ny61.g("Hex string must have an even number of characters");
            return null;
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2 += 2) {
            try {
                bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
            } catch (Exception e) {
                yci0.p("Invalid hex string: ".concat(str), e);
                return null;
            }
        }
        return ByteString.f(0, i, bArr);
    }
}
