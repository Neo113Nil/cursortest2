package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1416Zr implements View.OnClickListener {
    public final /* synthetic */ C1133Ok A00;
    public final /* synthetic */ C1406Zh A01;
    public final /* synthetic */ MD A02;

    public ViewOnClickListenerC1416Zr(MD md, C1406Zh c1406Zh, C1133Ok c1133Ok) {
        this.A02 = md;
        this.A01 = c1406Zh;
        this.A00 = c1133Ok;
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
