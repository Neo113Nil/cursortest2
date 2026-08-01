package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class J8 extends AbstractRunnableC1327Wc {
    public static byte[] A01;
    public final /* synthetic */ C1616d4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{87, 104, 101, 100, 110, 33, 118, 96, 114, 33, 111, 100, 119, 100, 115, 33, 113, 115, 100, 113, 96, 115, 100, 101};
    }

    public J8(C1616d4 c1616d4) {
        this.A00 = c1616d4;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        boolean z3;
        z3 = this.A00.A03;
        if (z3) {
            return;
        }
        this.A00.A0I(A00(0, 24, 115));
    }
}
