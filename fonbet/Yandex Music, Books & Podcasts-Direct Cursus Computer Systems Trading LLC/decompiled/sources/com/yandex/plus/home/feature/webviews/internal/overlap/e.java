package com.yandex.plus.home.feature.webviews.internal.overlap;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import defpackage.b6e;
import defpackage.xqn;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class e {
    public final long a;
    public final float b;
    public final Function0 c;
    public final View d;
    public final com.yandex.passport.sloth.ui.c e;
    public volatile boolean f;
    public f g;
    public long h;

    public e(long j, float f, Function0 function0, FrameLayout frameLayout, com.yandex.passport.sloth.ui.c cVar) {
        function0.getClass();
        frameLayout.getClass();
        this.a = j;
        this.b = f;
        this.c = function0;
        this.d = frameLayout;
        this.e = cVar;
        this.g = f.b;
        this.h = ((Number) function0.invoke()).longValue();
    }

    public final void a(d dVar) {
        c cVar = c.a;
        if (this.f) {
            return;
        }
        if (!dVar.equals(b.a)) {
            if (!dVar.equals(cVar)) {
                b6e.s();
                return;
            }
            final xqn xqnVar = new xqn();
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.overlap.a
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    e eVar = e.this;
                    View view2 = eVar.d;
                    view2.removeOnLayoutChangeListener((View.OnLayoutChangeListener) xqnVar.a);
                    long longValue = (eVar.h + eVar.a) - ((Number) eVar.c.invoke()).longValue();
                    if (longValue < 0) {
                        longValue = 0;
                    }
                    view2.postDelayed(new androidx.core.app.a(13, eVar), longValue);
                }
            };
            xqnVar.a = onLayoutChangeListener;
            this.d.addOnLayoutChangeListener(onLayoutChangeListener);
            return;
        }
        f fVar = com.yandex.plus.bdui.flex.ui.a.q(this.d) <= this.b ? f.a : f.b;
        if (fVar != this.g) {
            this.g = fVar;
            t tVar = (t) this.e.b;
            com.yandex.plus.log.api.b bVar = tVar.u;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "WebViewsControllerImpl", "startViewOverlappingDetector(): " + fVar);
            }
            com.yandex.plus.home.feature.webviews.internal.container.a l = tVar.l();
            int ordinal = fVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    b6e.s();
                    return;
                } else if (l != null) {
                    l.i();
                }
            } else if (l != null) {
                l.l();
            }
        }
        this.h = ((Number) this.c.invoke()).longValue();
        a(cVar);
    }
}
