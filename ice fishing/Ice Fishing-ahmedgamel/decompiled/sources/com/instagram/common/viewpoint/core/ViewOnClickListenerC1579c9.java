package com.instagram.common.viewpoint.core;

import android.view.View;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.c9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1579c9 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C6J A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{c.f17105c, 59, 55, 49, 51};
    }

    public ViewOnClickListenerC1579c9(C6J c6j) {
        this.A00 = c6j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 54));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
