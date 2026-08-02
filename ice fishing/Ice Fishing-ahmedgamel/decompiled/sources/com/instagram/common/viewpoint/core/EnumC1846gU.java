package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.gU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1846gU {
    A03(A01(37, 3, a.f22514Q)),
    A04(A01(40, 7, 55));

    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 117);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{48, 50, 58, 108, 75, 83, 68, 73, 76, 65, 5, 86, c.f17104b, 87, 83, c.f17104b, 87, 5, 87, c.f17104b, 86, 85, 74, 75, 86, c.f17104b, 31, 5, 0, 86, 51, 40, 45, 40, 41, 49, 40, 106, 104, 96, 55, 44, 41, 44, 45, 53, 44};
    }

    static {
        A02();
    }

    EnumC1846gU(String str) {
        this.A00 = str;
    }

    public static EnumC1846gU A00(String str) {
        for (EnumC1846gU enumC1846gU : values()) {
            if (enumC1846gU.A00.equals(str)) {
                return enumC1846gU;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 80), str));
    }
}
