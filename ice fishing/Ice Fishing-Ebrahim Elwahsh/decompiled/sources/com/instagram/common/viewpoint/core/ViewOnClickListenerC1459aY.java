package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1459aY implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public ViewOnClickListenerC1459aY(M8 m8) {
        this.A00 = m8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1839gi c1839gi;
        InterfaceC1481au interfaceC1481au;
        InterfaceC1481au interfaceC1481au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1839gi = this.A00.A08;
            c1839gi.A0F().A9w();
            interfaceC1481au = this.A00.A05;
            if (interfaceC1481au != null) {
                interfaceC1481au2 = this.A00.A05;
                interfaceC1481au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
