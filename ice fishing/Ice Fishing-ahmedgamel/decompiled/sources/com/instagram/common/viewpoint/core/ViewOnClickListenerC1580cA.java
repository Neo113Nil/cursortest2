package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1580cA implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C6H A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 93);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-5, -18, -23, -22, -12};
    }

    public ViewOnClickListenerC1580cA(C6H c6h) {
        this.A00 = c6h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 40));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
