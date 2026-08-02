package com.instagram.common.viewpoint.core;

import com.anythink.core.common.w;
import com.anythink.expressad.foundation.d.j;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Oh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1151Oh {
    public static C1150Og A00;
    public static byte[] A01;
    public static String[] A02 = {"g", j.cD, "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            int i10 = copyOfRange[i9] ^ i6;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = w.f17699a;
            strArr2[0] = "P";
            copyOfRange[i9] = (byte) (i10 ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, 90, 88, 27, 83, 84, 86, 80, 87, 90, 90, 94, 27, 84, 81, 70, 27, 116, 113, 106, 103, 112, 101, 122, 103, 97, 124, 123, 114, 106, 118, 122, 123, 115, 124, 114};
    }

    static {
        A02();
    }

    public static C1150Og A00(C1856ge c1856ge) {
        if (A00 == null) {
            synchronized (C1150Og.class) {
                if (A00 == null) {
                    A00 = new C1150Og(new C1948iB(c1856ge.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c1856ge), 0)));
                }
            }
        }
        return A00;
    }
}
