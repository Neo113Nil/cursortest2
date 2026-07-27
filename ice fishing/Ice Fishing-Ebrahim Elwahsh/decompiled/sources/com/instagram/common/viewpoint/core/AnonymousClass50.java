package com.instagram.common.viewpoint.core;

import android.view.Surface;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.50, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass50 {
    public static byte[] A04;
    public static String[] A05 = {"rYnPbEfuSaTBbvatyKmqENn8mgRSZdek", "ofstc3luVQLhDPNdocOCjRxToKRzk7nB", "Fnbmz9sIEw5y7N9QBLdBg", "MRjsdls7eSgWLCoo8pA3j", "UfW8AgM42njlyNRr2q7EB3IdvayipkgN", "kcxrVmXx561a0K31f6UYVe0sWhenvrT2", "", "AcILJL5UwW37jf1DZrUjVyU1aBx980VR"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final Surface A03;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{66, 95, 68, 72, 67, 89, 76, 89, 68, 66, 67, 105, 72, 74, 95, 72, 72, 94, 13, c.f16475b, 88, 94, 89, 13, 79, 72, 13, 29, 1, 13, 20, 29, 1, 13, 28, 21, 29, 1, 13, 66, 95, 13, 31, 26, 29};
    }

    static {
        A01();
    }

    public AnonymousClass50(Surface surface, int i, int i4) {
        this(surface, i, i4, 0);
    }

    public AnonymousClass50(Surface surface, int i, int i4, int i9) {
        AbstractC06233y.A09(i9 == 0 || i9 == 90 || i9 == 180 || i9 == 270, A00(0, 45, 12));
        this.A03 = surface;
        this.A02 = i;
        this.A00 = i4;
        this.A01 = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass50)) {
            return false;
        }
        AnonymousClass50 anonymousClass50 = (AnonymousClass50) obj;
        if (this.A02 == anonymousClass50.A02 && this.A00 == anonymousClass50.A00) {
            int i = this.A01;
            int i4 = anonymousClass50.A01;
            if (A05[7].charAt(29) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "IfmXZsmHB8xObc4DA1o6c";
            strArr[3] = "9bmF1UX1T4riDJeOAx7tH";
            if (i == i4 && this.A03.equals(anonymousClass50.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03.hashCode();
        int i = result * 31;
        int result2 = this.A02;
        int result3 = (((i + result2) * 31) + this.A00) * 31;
        int result4 = this.A01;
        return result3 + result4;
    }
}
