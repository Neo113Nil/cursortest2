package com.yandex.plus.home.dailyquests.feature.internal.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.gld;
import defpackage.rar;
import defpackage.tf6;
import defpackage.tvt;
import defpackage.x97;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class e implements View.OnAttachStateChangeListener {
    public final float a;
    public final a b;
    public final tf6 c;
    public long d;
    public rar e;
    public d f;
    public tvt g;

    public e(float f, CoroutineContext coroutineContext, a aVar) {
        coroutineContext.getClass();
        this.a = f;
        this.b = aVar;
        this.c = gld.e(coroutineContext);
    }

    public final void c(View view) {
        rar rarVar = this.e;
        if (rarVar == null || !rarVar.b()) {
            this.e = x97.y(this.c, null, null, new com.yandex.plus.bdui.ui.b(this, view, null, 12), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.plus.home.dailyquests.feature.internal.utils.d] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(final View view) {
        view.getClass();
        this.f = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.yandex.plus.home.dailyquests.feature.internal.utils.d
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                e.this.c(view);
            }
        };
        this.g = new tvt(this, view);
        view.getViewTreeObserver().addOnScrollChangedListener(this.f);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.g);
        c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        view.getViewTreeObserver().removeOnScrollChangedListener(this.f);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.g);
        rar rarVar = this.e;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.f = null;
        this.g = null;
    }
}
