package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnLongClickListenerC1209Rl implements View.OnLongClickListener {
    public final /* synthetic */ C1880hM A00;
    public final /* synthetic */ C1494b6 A01;

    public ViewOnLongClickListenerC1209Rl(C1880hM c1880hM, C1494b6 c1494b6) {
        this.A00 = c1880hM;
        this.A01 = c1494b6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        View view3;
        View view4;
        view2 = this.A00.A00;
        if (view2 != null) {
            C1494b6 c1494b6 = this.A01;
            view3 = this.A00.A00;
            int width = view3.getWidth();
            view4 = this.A00.A00;
            c1494b6.setBounds(0, 0, width, view4.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
