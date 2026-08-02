package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1458aC extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C1465aJ A01;

    public C1458aC(C1465aJ c1465aJ, float f2) {
        this.A01 = c1465aJ;
        this.A00 = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(XV.A00, XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
