package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.pN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2344pN {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{0, 58, 59, 111, 32, 41, 111, 61, 46, 33, 40, 42, 117, 111, 106, 60};
    }

    public static char A00(byte b12, byte b22) {
        return (char) ((b12 << 8) | (b22 & 255));
    }

    public static char A01(long value) {
        char c9 = (char) value;
        AbstractC2070ki.A0H(((long) c9) == value, A02(0, 16, a.f21727Q), value);
        return c9;
    }

    public static boolean A04(char[] array, char target) {
        for (char c9 : array) {
            if (c9 == target) {
                return true;
            }
        }
        return false;
    }
}
