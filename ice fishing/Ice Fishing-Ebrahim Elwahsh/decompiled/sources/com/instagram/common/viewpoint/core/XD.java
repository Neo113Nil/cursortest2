package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class XD {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final Map<String, String> A03;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-10, -14, -66, -11, -62, -11, -66, -76, -80, 124, -64, -61, -68, -68, -73, -68, -75, -83, -77, c.f16474a, -77, -84, -86, -83, -99};
    }

    static {
        A03();
        A01 = false;
        A00 = false;
        A03 = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized String A01(String str) {
        synchronized (XD.class) {
            if (!A04()) {
                return null;
            }
            return System.getProperty(A00(0, 7, 115) + str);
        }
    }

    public static Map<String, String> A02() {
        if (!A04()) {
            return Collections.emptyMap();
        }
        return A03;
    }

    public static synchronized boolean A04() {
        boolean z8;
        synchronized (XD.class) {
            if (!A00) {
                A01 = A00(21, 4, 27).equals(System.getProperty(A00(7, 14, 49)));
                A00 = true;
            }
            z8 = A01;
        }
        return z8;
    }

    public static synchronized boolean A05(String str) {
        boolean z8;
        synchronized (XD.class) {
            z8 = !TextUtils.isEmpty(A01(str));
        }
        return z8;
    }
}
