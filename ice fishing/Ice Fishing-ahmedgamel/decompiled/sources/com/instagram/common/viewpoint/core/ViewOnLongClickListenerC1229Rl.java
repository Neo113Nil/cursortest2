package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnLongClickListenerC1229Rl implements View.OnLongClickListener {
    public final /* synthetic */ C1900hM A00;
    public final /* synthetic */ C1514b6 A01;

    public ViewOnLongClickListenerC1229Rl(C1900hM c1900hM, C1514b6 c1514b6) {
        this.A00 = c1900hM;
        this.A01 = c1514b6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        View view3;
        View view4;
        view2 = this.A00.A00;
        if (view2 != null) {
            C1514b6 c1514b6 = this.A01;
            view3 = this.A00.A00;
            int width = view3.getWidth();
            view4 = this.A00.A00;
            c1514b6.setBounds(0, 0, width, view4.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
