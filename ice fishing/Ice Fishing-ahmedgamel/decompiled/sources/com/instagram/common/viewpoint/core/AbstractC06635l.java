package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC06635l {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, c.f16317b, 57, 56, 69, 54, 73, 69, 43, 28, 47, 43, -26, 45, 43, 43, 32, 21, 20};
    }

    public static /* synthetic */ boolean A02(String str) {
        if (str == null) {
            return false;
        }
        String A01 = AbstractC2035k7.A01(str);
        if (TextUtils.isEmpty(A01)) {
            return false;
        }
        return ((A01.contains(A00(4, 4, 105)) && !A01.contains(A00(8, 8, 79))) || A01.contains(A00(0, 4, 100)) || A01.contains(A00(16, 3, 64))) ? false : true;
    }
}
