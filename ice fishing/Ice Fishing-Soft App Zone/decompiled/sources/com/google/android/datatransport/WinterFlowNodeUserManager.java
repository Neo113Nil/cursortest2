package com.google.android.datatransport;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNodeUserManager implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ViewTreeObserver WinterFlowTransactionManagerStrategy;
    public final Runnable WinterFlowUnitTestResponse;
    public final View WinterFlowVariableVersionControl;

    public WinterFlowNodeUserManager(View view, Runnable runnable) {
        this.WinterFlowVariableVersionControl = view;
        this.WinterFlowTransactionManagerStrategy = view.getViewTreeObserver();
        this.WinterFlowUnitTestResponse = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.WinterFlowTransactionManagerStrategy.isAlive();
        View view = this.WinterFlowVariableVersionControl;
        if (isAlive) {
            this.WinterFlowTransactionManagerStrategy.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.WinterFlowUnitTestResponse.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.WinterFlowTransactionManagerStrategy = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.WinterFlowTransactionManagerStrategy.isAlive();
        View view2 = this.WinterFlowVariableVersionControl;
        if (isAlive) {
            this.WinterFlowTransactionManagerStrategy.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
