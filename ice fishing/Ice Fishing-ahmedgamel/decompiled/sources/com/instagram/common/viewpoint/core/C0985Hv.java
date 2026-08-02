package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0985Hv extends AbstractRunnableC1347Wc {
    public static byte[] A01;
    public final /* synthetic */ C5F A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{118, 73, 68, 69, 79, 0, 87, 65, 83, 0, 78, 69, 86, 69, 82, 0, 80, 82, 69, 80, 65, 82, 69, 68};
    }

    public C0985Hv(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        boolean z6;
        InterfaceC1680dm interfaceC1680dm;
        z6 = this.A00.A0T;
        if (!z6) {
            interfaceC1680dm = this.A00.A0Z;
            interfaceC1680dm.AGQ(A00(0, 24, 86));
        }
    }
}
