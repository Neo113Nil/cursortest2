package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1602cW implements View.OnClickListener {
    public final /* synthetic */ KD A00;

    public ViewOnClickListenerC1602cW(KD kd) {
        this.A00 = kd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1690dx interfaceC1690dx;
        InterfaceC1690dx interfaceC1690dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1690dx = this.A00.A02;
            if (interfaceC1690dx != null) {
                interfaceC1690dx2 = this.A00.A02;
                interfaceC1690dx2.AJz();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
