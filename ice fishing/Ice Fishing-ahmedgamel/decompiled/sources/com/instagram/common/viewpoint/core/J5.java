package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class J5 extends AbstractRunnableC1347Wc {
    public static byte[] A02;
    public final /* synthetic */ C1636d4 A00;
    public final /* synthetic */ C4A A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public J5(C1636d4 c1636d4, C4A c4a) {
        this.A00 = c1636d4;
        this.A01 = c4a;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C0897Ek c0897Ek;
        C0897Ek c0897Ek2;
        c0897Ek = this.A00.A0D;
        if (c0897Ek.getState() != EnumC1802fm.A02) {
            return;
        }
        c0897Ek2 = this.A00.A0D;
        if (c0897Ek2.getCurrentPositionInMillis() != A00()) {
            return;
        }
        this.A00.A0I(A00(0, 22, 47));
    }
}
