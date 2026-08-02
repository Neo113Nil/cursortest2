package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZZ implements View.OnClickListener {
    public final /* synthetic */ C1421Zb A00;

    public ZZ(C1421Zb c1421Zb) {
        this.A00 = c1421Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1425Zf interfaceC1425Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1425Zf = this.A00.A04;
            interfaceC1425Zf.AAp();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
