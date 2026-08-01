package com.google.android.datatransport;

import android.view.View;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueSystem implements View.OnAttachStateChangeListener {
    public final /* synthetic */ WinterFlowBackendService WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ View WinterFlowVariableVersionControl;

    public WinterFlowQueueSystem(View view, WinterFlowBackendService winterFlowBackendService) {
        this.WinterFlowVariableVersionControl = view;
        this.WinterFlowTransactionManagerStrategy = winterFlowBackendService;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.WinterFlowVariableVersionControl.removeOnAttachStateChangeListener(this);
        this.WinterFlowTransactionManagerStrategy.WinterFlowResolverController();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
