package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06283i {
    public static byte[] A04;
    public static final C06283i A05;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-23, -35, 32, 37, 30, 43, 43, 34, 41, 0, 44, 50, 43, 49, -6, 14, 2, 71, 80, 69, 81, 70, 75, 80, 73, 31, -33, 19, 2, 7, 13, -28, 13, 16, 11, -1, 18, -7, 17, -1, 11, 14, 10, 3, -16, -1, 18, 3, -37};
    }

    static {
        A01();
        A05 = new C06283i(-1, -1, -1);
    }

    public C06283i(int i, int i4, int i6) {
        int i9;
        this.A03 = i;
        this.A01 = i4;
        this.A02 = i6;
        if (C5C.A15(i6)) {
            i9 = C5C.A06(i6, i4);
        } else {
            i9 = -1;
        }
        this.A00 = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06283i)) {
            return false;
        }
        C06283i c06283i = (C06283i) obj;
        return this.A03 == c06283i.A03 && this.A01 == c06283i.A01 && this.A02 == c06283i.A02;
    }

    public final int hashCode() {
        return CB.A00(Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return A00(26, 23, 59) + this.A03 + A00(0, 15, 90) + this.A01 + A00(15, 11, a.f22515R) + this.A02 + ']';
    }
}
