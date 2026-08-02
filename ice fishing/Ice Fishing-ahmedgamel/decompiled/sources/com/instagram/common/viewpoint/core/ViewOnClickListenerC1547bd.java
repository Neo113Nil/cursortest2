package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1547bd implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C6M A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{61, 48, 43, 44, 54};
    }

    public ViewOnClickListenerC1547bd(C6M c6m) {
        this.A00 = c6m;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 111));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
