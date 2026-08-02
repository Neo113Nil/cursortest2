package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1485ad implements View.OnClickListener {
    public final /* synthetic */ M6 A00;

    public ViewOnClickListenerC1485ad(M6 m62) {
        this.A00 = m62;
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
            c1860gi = this.A00.A09;
            c1860gi.A0F().A9w();
            interfaceC1502au = this.A00.A06;
            if (interfaceC1502au != null) {
                interfaceC1502au2 = this.A00.A06;
                interfaceC1502au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
