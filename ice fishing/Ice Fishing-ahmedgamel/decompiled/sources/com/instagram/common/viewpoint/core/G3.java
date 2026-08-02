package com.instagram.common.viewpoint.core;

import android.view.Surface;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class G3 {
    public static byte[] A00;
    public static String[] A01 = {"C9RGb7NCXIcFkq487TbtOiV6wJyl5V", "dIw4BKlzmuU3zMuMzRjmW2qgnJuCAgWy", "9uTfiPT", "rJUClzDzuXOVG7xlKmzeqZnP5Peloa5p", "Z", "9S6veErjLDkLbxAihnisBS", "TmmUyGbb1uzRJUdaHSZi2e0nreAYvBIE", "B53ji15DIU9T3sUrLFCN0rmnX0Pwja5D"};

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            int i10 = (copyOfRange[i9] ^ i6) ^ 94;
            if (A01[0].length() != 30) {
                throw new RuntimeException();
            }
            A01[0] = "TD1mTFY2qo3QaoZPZEPw0mbH2R8uHE";
            copyOfRange[i9] = (byte) i10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {20, 51, 59, 62, 55, 54, 114, 38, 61, 114, 49, 51, 62, 62, 114, 1, 39, 32, 52, 51, 49, 55, 124, 33, 55, 38, 20, 32, 51, c.f17105c, 55, 0, 51, 38, 55, 77, 114, Byte.MAX_VALUE, 126, 116, 93, 105, 122, 118, 126, 73, 126, 119, 126, 122, 104, 126, 83, 126, 119, 107, 126, 105};
        if (A01[2].length() != 7) {
            throw new RuntimeException();
        }
        A01[5] = "Lq9CeCJTygMtbBn2m02oyI";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(Surface surface, float f2) {
        int compatibility;
        if (f2 == 0.0f) {
            compatibility = 0;
        } else {
            compatibility = 1;
        }
        try {
            surface.setFrameRate(f2, compatibility);
        } catch (IllegalStateException e9) {
            AbstractC06524g.A08(A00(35, 23, 69), A00(0, 35, 12), e9);
        }
    }
}
