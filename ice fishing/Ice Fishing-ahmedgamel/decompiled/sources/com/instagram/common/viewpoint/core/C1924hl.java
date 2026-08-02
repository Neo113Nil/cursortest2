package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.hl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1924hl implements QM {
    public static byte[] A01;
    public final /* synthetic */ C7M A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C1924hl(C7M c7m) {
        this.A00 = c7m;
    }

    private final void A02(QN qn) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.instagram.common.viewpoint.core.QM
    public final void ADg(QN qn) {
        A02(qn);
        throw null;
    }
}
