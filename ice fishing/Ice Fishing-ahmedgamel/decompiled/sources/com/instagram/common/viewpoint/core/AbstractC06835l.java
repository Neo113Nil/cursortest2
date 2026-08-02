package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC06835l {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, c.f17104b, 57, 56, 69, 54, 73, 69, 43, 28, 47, 43, -26, 45, 43, 43, 32, 21, 20};
    }

    public static /* synthetic */ boolean A02(String str) {
        if (str == null) {
            return false;
        }
        String A01 = AbstractC2055k7.A01(str);
        if (TextUtils.isEmpty(A01)) {
            return false;
        }
        return ((A01.contains(A00(4, 4, 105)) && !A01.contains(A00(8, 8, 79))) || A01.contains(A00(0, 4, 100)) || A01.contains(A00(16, 3, 64))) ? false : true;
    }
}
