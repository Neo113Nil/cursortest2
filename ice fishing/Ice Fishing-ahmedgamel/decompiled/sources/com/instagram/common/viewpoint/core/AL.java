package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class AL extends C2346p5 {
    public static byte[] A01;
    public final String A00;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, 26, 34, 13, 24, 21, 16, -52, 15, 27, 26, 32, 17, 26, 32, -52, 32, 37, 28, 17, -26, -52};
    }

    public AL(String str, C06805i c06805i) {
        super(A01(0, 22, 85) + str, c06805i, AdError.INTERNAL_ERROR_2003, 1);
        this.A00 = str;
    }
}
