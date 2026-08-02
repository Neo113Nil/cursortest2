package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1605cZ implements View.OnClickListener {
    public final /* synthetic */ KB A00;

    public ViewOnClickListenerC1605cZ(KB kb) {
        this.A00 = kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1690dx interfaceC1690dx;
        InterfaceC1690dx interfaceC1690dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1690dx = this.A00.A08;
            if (interfaceC1690dx != null) {
                interfaceC1690dx2 = this.A00.A08;
                interfaceC1690dx2.A9l();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
