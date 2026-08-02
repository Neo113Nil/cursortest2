package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1433Zn implements View.OnClickListener {
    public final /* synthetic */ C1427Zh A00;
    public final /* synthetic */ MD A01;

    public ViewOnClickListenerC1433Zn(MD md, C1427Zh c1427Zh) {
        this.A01 = md;
        this.A00 = c1427Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC1152Oi.A04);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
