package com.google.android.datatransport;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadMechanism extends AnimatorListenerAdapter {
    public final /* synthetic */ View WinterFlowHookDataSource;
    public final /* synthetic */ WinterFlowValidatorEngine WinterFlowRouterStructure;

    public WinterFlowThreadMechanism(View view, WinterFlowValidatorEngine winterFlowValidatorEngine) {
        this.WinterFlowRouterStructure = winterFlowValidatorEngine;
        this.WinterFlowHookDataSource = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        WinterFlowValidatorEngine winterFlowValidatorEngine = this.WinterFlowRouterStructure;
        winterFlowValidatorEngine.WinterFlowRouterStructure.WinterFlowVariableVersionControl(1.0f);
        WinterFlowControllerDataSource.WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, winterFlowValidatorEngine);
    }
}
