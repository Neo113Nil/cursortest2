package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1439Zt implements View.OnClickListener {
    public final /* synthetic */ C1441Zv A00;

    public ViewOnClickListenerC1439Zt(C1441Zv c1441Zv) {
        this.A00 = c1441Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1425Zf interfaceC1425Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1425Zf = this.A00.A02;
            interfaceC1425Zf.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
