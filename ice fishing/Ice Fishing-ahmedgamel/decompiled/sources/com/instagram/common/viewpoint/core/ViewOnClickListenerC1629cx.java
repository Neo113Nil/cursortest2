package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1629cx implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass67 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{36, 23, 18, 19, 29};
    }

    public ViewOnClickListenerC1629cx(AnonymousClass67 anonymousClass67) {
        this.A00 = anonymousClass67;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
