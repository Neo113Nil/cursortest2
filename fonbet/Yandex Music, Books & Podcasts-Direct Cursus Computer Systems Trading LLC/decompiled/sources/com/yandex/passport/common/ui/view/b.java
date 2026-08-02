package com.yandex.passport.common.ui.view;

import android.net.Uri;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import defpackage.bcu;
import defpackage.c7g;
import defpackage.jyr;
import defpackage.t7o;

/* loaded from: classes4.dex */
public final class b implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(View view, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                t tVar = (t) this.c;
                this.b.removeOnAttachStateChangeListener(this);
                Object r = tVar.i.r(Uri.parse((String) this.d));
                if (r instanceof t7o) {
                    r = null;
                }
                com.yandex.plus.home.feature.webviews.internal.uri.j jVar = (com.yandex.plus.home.feature.webviews.internal.uri.j) r;
                if (jVar == null) {
                    jVar = (com.yandex.plus.home.feature.webviews.internal.uri.b) ((jyr) tVar.i.e).getValue();
                }
                u.b(tVar, jVar, false, null, 4);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                ((LottieAnimationView) this.c).removeCallbacks((bcu) this.d);
                break;
            case 1:
                ((c7g) this.b).removeOnAttachStateChangeListener(this);
                ((c7g) this.c).removeCallbacks((androidx.core.app.a) this.d);
                break;
        }
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
