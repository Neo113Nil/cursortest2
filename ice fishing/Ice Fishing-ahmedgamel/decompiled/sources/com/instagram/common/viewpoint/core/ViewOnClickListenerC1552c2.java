package com.instagram.common.viewpoint.core;

import android.view.View;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.c2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1552c2 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C6K A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ a.f21727Q);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{53, 49, 61, 59, 57};
    }

    public ViewOnClickListenerC1552c2(C6K c6k) {
        this.A00 = c6k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 34));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
