package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class J8 extends AbstractRunnableC1347Wc {
    public static byte[] A01;
    public final /* synthetic */ C1636d4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{87, 104, 101, 100, 110, 33, 118, 96, 114, 33, 111, 100, 119, 100, 115, 33, 113, 115, 100, 113, 96, 115, 100, 101};
    }

    public J8(C1636d4 c1636d4) {
        this.A00 = c1636d4;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        boolean z6;
        z6 = this.A00.A03;
        if (z6) {
            return;
        }
        this.A00.A0I(A00(0, 24, 115));
    }
}
