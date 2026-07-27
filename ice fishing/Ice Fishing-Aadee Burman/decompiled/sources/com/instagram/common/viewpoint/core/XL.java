package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XL {
    public static byte[] A00;
    public static String[] A01 = {"qSiXKiq1IG9lqM50Z2Mb9O8Z2LWgBu", "r2U8xUOmaYVPqVNF7ipuwqUkClKOL9fI", "t2SmaoScOMFcI6wk6u94gycUTd7TrCEv", "g958mvzQCDN4laMR6tofpj9QKe8MWy18", "srt0ITOyv23HblPPEDvfXyJdFCTOXScH", "yBqqog3SgBsnKDzcKk1fPvagOkeR5j", "3gR", "V2iGxa"};

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{16, 23, 27, 24, 14, 5, 14, 27, 21, 26, 35, 32, 43, 44};
    }

    static {
        A02();
    }

    public static String A00(float f3) {
        if (A03(f3)) {
            return A01(10, 4, 69);
        }
        if (A05(f3)) {
            return A01(0, 4, a.f21727Q);
        }
        if (A04(f3)) {
            return A01(4, 3, 96);
        }
        String A012 = A01(7, 3, 112);
        String[] strArr = A01;
        if (strArr[0].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A01[4] = "joCrsBqpJwLPerzsPAAgEpnRec6YcWpS";
        return A012;
    }

    public static boolean A03(float f3) {
        return f3 <= 0.7f;
    }

    public static boolean A04(float f3) {
        return f3 == 1.0f;
    }

    public static boolean A05(float f3) {
        return f3 >= 1.2f;
    }
}
