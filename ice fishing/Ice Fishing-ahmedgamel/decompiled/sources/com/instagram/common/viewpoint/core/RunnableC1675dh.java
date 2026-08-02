package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1675dh implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass56 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 93, 80, 81, 91, 100, 88, 85, 77, 86, 85, 87, 95, 113, 70, 70, 91, 70};
    }

    public RunnableC1675dh(AnonymousClass56 anonymousClass56) {
        this.A00 = anonymousClass56;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0s(A00(0, 18, 82));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
