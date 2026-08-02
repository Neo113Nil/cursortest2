package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1437Zr implements View.OnClickListener {
    public final /* synthetic */ C1154Ok A00;
    public final /* synthetic */ C1427Zh A01;
    public final /* synthetic */ MD A02;

    public ViewOnClickListenerC1437Zr(MD md, C1427Zh c1427Zh, C1154Ok c1154Ok) {
        this.A02 = md;
        this.A01 = c1427Zh;
        this.A00 = c1154Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
