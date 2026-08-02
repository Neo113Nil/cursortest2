package com.instagram.common.viewpoint.core;

import com.anythink.basead.ui.f.d;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1658dQ implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C5T A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) + d.f11587c);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 77, 72, 73, 83, 52, 80, 69, 93, 70, 69, 71, 79, 41, 86, 86, 83, 86};
    }

    public RunnableC1658dQ(C5T c5t) {
        this.A00 = c5t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0S(A00(0, 18, a.f22514Q));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
