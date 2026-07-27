package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1419Zt implements View.OnClickListener {
    public final /* synthetic */ C1421Zv A00;

    public ViewOnClickListenerC1419Zt(C1421Zv c1421Zv) {
        this.A00 = c1421Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1405Zf interfaceC1405Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1405Zf = this.A00.A02;
            interfaceC1405Zf.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
