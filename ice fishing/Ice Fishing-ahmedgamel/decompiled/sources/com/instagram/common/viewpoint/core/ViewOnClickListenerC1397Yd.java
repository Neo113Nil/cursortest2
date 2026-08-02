package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1397Yd implements View.OnClickListener {
    public final /* synthetic */ C1174Pe A00;

    public ViewOnClickListenerC1397Yd(C1174Pe c1174Pe) {
        this.A00 = c1174Pe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0G();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
