package com.yandex.plus.home.feature.panel.internalapi;

import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.plus.bdui.flex.ui.s;

/* loaded from: classes5.dex */
public final class f implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ s a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;

    public f(s sVar, View view, boolean z) {
        this.a = sVar;
        this.b = view;
        this.c = z;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        s.c(this.a, this.b, this.c);
    }
}
