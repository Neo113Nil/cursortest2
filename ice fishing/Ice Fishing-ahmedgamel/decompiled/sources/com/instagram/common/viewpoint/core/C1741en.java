package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.en, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1741en extends ViewOutlineProvider {
    public final /* synthetic */ C1744eq A00;

    public C1741en(C1744eq c1744eq) {
        this.A00 = c1744eq;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 8.0f);
    }
}
