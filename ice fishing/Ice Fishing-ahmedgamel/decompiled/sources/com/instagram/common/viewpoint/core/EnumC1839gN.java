package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.gN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1839gN {
    A03,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"xrpFqliwvTmrUeY9fA", "WQofXYOtPOfcZVcnLB6jDFevspEJYzJo", "xmcQ51qE3IL5CD3g", "vqfe6L9tI0UCZhHJZZILisyG0KCy4R", "fiUEN16u3MZCpDGCMqSf2x4N5Q5QlPxX", "5xn2ImkHS4ATQgLTDfLLcMPpUWGwzNh4", "NsPZM3725QIioQriGr2vh8z8GZ7DcYd3", "wIDfTgN4CVihAS6ZHyHagF8TJWsTJSVw"};

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[1].length() == 22) {
                throw new RuntimeException();
            }
            A01[1] = "aO5t2";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 98);
            String[] strArr = A01;
            if (strArr[0].length() != strArr[2].length()) {
                A01[3] = "tB3IEJBlHxhWtpYKuvAk87dclmwGEs";
                i9++;
            } else {
                i9++;
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{58, 53, 48, 60, 55, 45, 38, 54, 46, 55, 60, 61, 85, 67, 84, 80, 67, 84, 89, 73, 81, 72, 67, 66};
    }

    static {
        A01();
    }
}
