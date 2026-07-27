package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZZ implements View.OnClickListener {
    public final /* synthetic */ C1401Zb A00;

    public ZZ(C1401Zb c1401Zb) {
        this.A00 = c1401Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1405Zf interfaceC1405Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1405Zf = this.A00.A04;
            interfaceC1405Zf.AAp();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
