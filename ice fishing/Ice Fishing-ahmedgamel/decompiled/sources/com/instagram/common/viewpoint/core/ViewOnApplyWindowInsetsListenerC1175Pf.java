package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.Pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnApplyWindowInsetsListenerC1175Pf implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ PR A00;
    public final /* synthetic */ C0n A01;

    public ViewOnApplyWindowInsetsListenerC1175Pf(C0n c0n, PR pr) {
        this.A01 = c0n;
        this.A00 = pr;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1191Py compatInsets = this.A00.ACw(view, C1191Py.A00(windowInsets));
        return (WindowInsets) C1191Py.A01(compatInsets);
    }
}
