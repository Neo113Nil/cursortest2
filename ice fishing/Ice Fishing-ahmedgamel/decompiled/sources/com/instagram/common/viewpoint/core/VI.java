package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class VI {
    public static byte[] A02;
    public final VA A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-15, -13, -32, -14, -9, -18, -29};
    }

    public VI(String str, VA va) {
        this.A01 = str;
        this.A00 = va;
    }

    public static void A02(VH vh, Map<String, String> map, String str, VA va) {
        A03(vh.A03(), map, str, va);
    }

    public static void A03(String str, Map<String, String> map, String str2, VA va) {
        if (!VK.A0B(str2, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 81), str);
        va.ABF(str2, map);
    }

    public final void A04(VH vh, Map<String, String> data) {
        A05(vh.A03(), data);
    }

    public final void A05(String str, Map<String, String> data) {
        A03(str, data, this.A01, this.A00);
    }
}
