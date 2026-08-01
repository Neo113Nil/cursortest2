package com.google.android.datatransport;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererHandler extends EdgeEffect {
    public float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowRendererHandler(Context context) {
        super(context);
        this.WinterFlowRouterStructure = WinterFlowUnitTestLibrary.WinterFlowHookDataSource(context).WinterFlowVariableVersionControl * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.WinterFlowHookDataSource = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.WinterFlowHookDataSource = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.WinterFlowHookDataSource = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.WinterFlowHookDataSource = 0.0f;
        super.onPull(f);
    }
}
