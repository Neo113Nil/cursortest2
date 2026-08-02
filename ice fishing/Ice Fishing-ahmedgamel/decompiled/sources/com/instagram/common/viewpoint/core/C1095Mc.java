package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1095Mc implements XN {
    public static byte[] A01;
    public final /* synthetic */ MW A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{36, 48, 49, 42, 38, 41, 44, 38, 46};
    }

    public C1095Mc(MW mw) {
        this.A00 = mw;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        boolean z6;
        boolean z9;
        z6 = this.A00.A0C;
        if (!z6) {
            z9 = this.A00.A0B;
            if (!z9) {
                this.A00.A0V(false, A00(0, 9, 123));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f2) {
    }
}
