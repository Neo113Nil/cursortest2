package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements View.OnClickListener {
    public final /* synthetic */ C1400Zb A00;

    public ZY(C1400Zb c1400Zb) {
        this.A00 = c1400Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8;
        InterfaceC1404Zf interfaceC1404Zf;
        InterfaceC1404Zf interfaceC1404Zf2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A05;
            if (z8) {
                interfaceC1404Zf2 = this.A00.A04;
                interfaceC1404Zf2.A53();
            } else {
                interfaceC1404Zf = this.A00.A04;
                interfaceC1404Zf.A54();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
