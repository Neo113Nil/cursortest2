package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ca, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1586ca implements View.OnClickListener {
    public final /* synthetic */ KB A00;

    public ViewOnClickListenerC1586ca(KB kb) {
        this.A00 = kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1670dx interfaceC1670dx;
        InterfaceC1670dx interfaceC1670dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1670dx = this.A00.A08;
            if (interfaceC1670dx != null) {
                interfaceC1670dx2 = this.A00.A08;
                interfaceC1670dx2.AJz();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
