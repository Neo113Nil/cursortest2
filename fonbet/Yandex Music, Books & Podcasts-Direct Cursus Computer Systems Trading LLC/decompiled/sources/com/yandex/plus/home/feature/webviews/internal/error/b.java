package com.yandex.plus.home.feature.webviews.internal.error;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.home.datasource.openapi.models.u6;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b {
    public final ViewGroup a;
    public final com.yandex.plus.home.api.webview.b b;
    public final com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c c;
    public final Function0 d;
    public String e;
    public View f;

    public b(ViewGroup viewGroup, com.yandex.plus.home.api.webview.b bVar, com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c cVar, Function0 function0) {
        viewGroup.getClass();
        bVar.getClass();
        cVar.getClass();
        this.a = viewGroup;
        this.b = bVar;
        this.c = cVar;
        this.d = function0;
    }

    public final void a(boolean z) {
        ViewGroup viewGroup = this.a;
        if (z) {
            ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) this.c).b(viewGroup);
        } else {
            viewGroup.setVisibility(8);
        }
    }

    public final void b(String str, boolean z) {
        str.getClass();
        View view = this.f;
        if (!str.equals(this.e)) {
            view = null;
        }
        ViewGroup viewGroup = this.a;
        if (view == null) {
            Context context = viewGroup.getContext();
            context.getClass();
            view = ((c) this.b).a(context, str, this.d);
        }
        if (!view.equals(this.f)) {
            View view2 = this.f;
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
            viewGroup.addView(view);
            this.f = view;
            this.e = str;
        }
        if (z) {
            ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) this.c).c(viewGroup, new u6(25));
        } else {
            viewGroup.setVisibility(0);
        }
    }
}
