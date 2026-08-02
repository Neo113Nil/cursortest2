package com.plaid.internal;

import android.view.View;

/* loaded from: classes5.dex */
public final class S5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ P5 b;

    public S5(View view, P5 p5) {
        this.a = view;
        this.b = p5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.a.removeOnAttachStateChangeListener(this);
        P5 p5 = this.b;
        p5.post(new R5(p5));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
