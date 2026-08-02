package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.b9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1517b9 {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, -31, -22, -21, -16, -10, -11, -37, -42, -36, -54, -49};
    }

    public C1517b9() {
        this.A00 = new HashMap();
    }

    public C1517b9(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C1517b9 A02(Y2 y22) {
        if (y22 != null) {
            this.A00.put(A00(11, 5, 48), AbstractC1371Xd.A01(y22.A04()));
        }
        return this;
    }

    public final C1517b9 A03(C1805fp c1805fp) {
        if (c1805fp != null) {
            this.A00.putAll(c1805fp.A0S());
        }
        return this;
    }

    public final C1517b9 A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
