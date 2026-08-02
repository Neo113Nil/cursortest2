package com.yandex.plus.home.feature.webviews.internal.purchase.pay;

import android.view.View;

/* loaded from: classes5.dex */
public final class e implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ f c;

    public /* synthetic */ e(View view, f fVar, int i) {
        this.a = i;
        this.b = view;
        this.c = fVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                f fVar = this.c;
                fVar.d.f(fVar);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                this.c.d.h();
                break;
        }
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
