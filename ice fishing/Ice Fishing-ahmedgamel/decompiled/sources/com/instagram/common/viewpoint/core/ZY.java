package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements View.OnClickListener {
    public final /* synthetic */ C1421Zb A00;

    public ZY(C1421Zb c1421Zb) {
        this.A00 = c1421Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z6;
        InterfaceC1425Zf interfaceC1425Zf;
        InterfaceC1425Zf interfaceC1425Zf2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z6 = this.A00.A05;
            if (z6) {
                interfaceC1425Zf2 = this.A00.A04;
                interfaceC1425Zf2.A53();
            } else {
                interfaceC1425Zf = this.A00.A04;
                interfaceC1425Zf.A54();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
