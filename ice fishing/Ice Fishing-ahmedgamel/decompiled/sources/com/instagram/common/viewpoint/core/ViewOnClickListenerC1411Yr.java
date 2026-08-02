package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1411Yr implements View.OnClickListener {
    public final /* synthetic */ PU A00;

    public ViewOnClickListenerC1411Yr(PU pu) {
        this.A00 = pu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1394Ya interfaceC1394Ya;
        ZM zm;
        InterfaceC1394Ya interfaceC1394Ya2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1394Ya = this.A00.A01;
            if (interfaceC1394Ya != null) {
                zm = this.A00.A02;
                if (zm.A03()) {
                    interfaceC1394Ya2 = this.A00.A01;
                    interfaceC1394Ya2.ACl(this.A00);
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
