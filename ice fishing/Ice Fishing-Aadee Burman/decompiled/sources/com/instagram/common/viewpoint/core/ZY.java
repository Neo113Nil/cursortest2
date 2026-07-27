package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements View.OnClickListener {
    public final /* synthetic */ C1401Zb A00;

    public ZY(C1401Zb c1401Zb) {
        this.A00 = c1401Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z3;
        InterfaceC1405Zf interfaceC1405Zf;
        InterfaceC1405Zf interfaceC1405Zf2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z3 = this.A00.A05;
            if (z3) {
                interfaceC1405Zf2 = this.A00.A04;
                interfaceC1405Zf2.A53();
            } else {
                interfaceC1405Zf = this.A00.A04;
                interfaceC1405Zf.A54();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
