package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class FD extends C1555bl {
    public final ImageView A00;
    public final C1860gi A01;

    public FD(C1860gi c1860gi) {
        super(c1860gi);
        this.A01 = c1860gi;
        this.A00 = new ImageView(c1860gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        LM downloadImageTask = new LM(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
