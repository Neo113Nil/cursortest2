package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1383Yk implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC07006x A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, c.f16474a, -125, -106, -121, -121, -122, -109, -122, -123, c.f16474a, -124, -115, -118, -124, -116, c.f16474a, -126, -121, -107, -122, -109, c.f16474a, -123, -122, -115, -126, -102};
    }

    public RunnableC1383Yk(ViewOnClickListenerC07006x viewOnClickListenerC07006x) {
        this.A00 = viewOnClickListenerC07006x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0I(A00(0, 31, 20));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
