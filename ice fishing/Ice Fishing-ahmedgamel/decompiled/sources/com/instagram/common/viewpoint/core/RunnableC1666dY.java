package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1666dY implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C5G A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 113, 124, 125, 119, 72, 116, 121, 97, 122, 121, 123, 115, 93, 106, 106, 119, 106};
    }

    public RunnableC1666dY(C5G c5g) {
        this.A00 = c5g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1680dm interfaceC1680dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1680dm = this.A00.A00.A0Z;
            interfaceC1680dm.AGQ(A00(0, 18, 75));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
