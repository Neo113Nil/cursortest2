package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1480aY implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public ViewOnClickListenerC1480aY(M8 m82) {
        this.A00 = m82;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1860gi c1860gi;
        InterfaceC1502au interfaceC1502au;
        InterfaceC1502au interfaceC1502au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1860gi = this.A00.A08;
            c1860gi.A0F().A9w();
            interfaceC1502au = this.A00.A05;
            if (interfaceC1502au != null) {
                interfaceC1502au2 = this.A00.A05;
                interfaceC1502au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
