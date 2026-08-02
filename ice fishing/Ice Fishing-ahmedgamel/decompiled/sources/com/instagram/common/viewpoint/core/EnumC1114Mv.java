package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Mv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1114Mv {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{68, 67, 94, 89, 76, 65, 65, 72, 73, 31, 30, 31, 20, 114, 115, 104, 99, 117, 114, 111, 104, 125, 112, 112, 121, 120};
    }

    static {
        A02();
    }

    public static EnumC1114Mv A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return A03;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return A03;
        }
    }
}
