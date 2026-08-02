package com.instagram.common.viewpoint.core;

import android.app.Activity;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class YX {
    public static byte[] A00;
    public static String[] A01 = {"fNLd7n7EkFNgLvt4vtbAtkfYXAQTEPRW", "T28d5tP6PdXMoXHWEuFSx", "qUncBokoif621v1GQ7gcKknRgizXPQsv", "IkdBxGtQCWxg3d0UA", "tTLCQWoYBdse5ixamGS9HTw2k7WXO8kY", "MyXxcbJBNTQUhn8S7mcX9rM3djOk", "ymwmgwOSW636xClV84tW2WEHiZAMdx7v", "xCAHRx5Y4"};

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            byte b9 = copyOfRange[i9];
            String[] strArr = A01;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[0] = "dZQs1GEaNPWr5rijC2ubsciPbAft3PPF";
            copyOfRange[i9] = (byte) ((b9 - i6) - 117);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{15, 13, 22, 13, 26, 17, 11};
    }

    static {
        A01();
    }

    public static void A02(Activity activity, int i, C1860gi c1860gi) {
        try {
            activity.setRequestedOrientation(i);
        } catch (IllegalStateException e9) {
            c1860gi.A08().ABz(A00(0, 7, 51), AbstractC1272Td.A0H, new C1273Te(e9));
        }
    }
}
