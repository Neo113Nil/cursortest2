package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1460aY implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public ViewOnClickListenerC1460aY(M8 m82) {
        this.A00 = m82;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1840gi c1840gi;
        InterfaceC1482au interfaceC1482au;
        InterfaceC1482au interfaceC1482au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1840gi = this.A00.A08;
            c1840gi.A0F().A9w();
            interfaceC1482au = this.A00.A05;
            if (interfaceC1482au != null) {
                interfaceC1482au2 = this.A00.A05;
                interfaceC1482au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
