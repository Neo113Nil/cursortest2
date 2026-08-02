package com.yandex.plus.home.feature.webviews.internal.purchase.pay;

import android.view.View;

/* loaded from: classes5.dex */
public final class g {
    public final View a;

    public g(View view) {
        view.getClass();
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        view.animate().cancel();
        if (view.getVisibility() == 0) {
            return;
        }
        view.post(new androidx.core.app.a(14, this));
    }
}
