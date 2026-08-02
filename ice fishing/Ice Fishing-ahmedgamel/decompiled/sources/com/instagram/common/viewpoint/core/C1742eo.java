package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1742eo extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C1744eq A01;

    public C1742eo(C1744eq c1744eq, float f2) {
        this.A01 = c1744eq;
        this.A00 = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
