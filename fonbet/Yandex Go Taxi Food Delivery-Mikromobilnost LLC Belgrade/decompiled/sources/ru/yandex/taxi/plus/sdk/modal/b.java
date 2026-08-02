package ru.yandex.taxi.plus.sdk.modal;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.plus.log.api.LogPriority;
import defpackage.a4d0;
import defpackage.b64;
import defpackage.d3d0;
import defpackage.fva0;
import defpackage.fze;
import defpackage.i3y;
import defpackage.kgz;
import defpackage.m9y0;
import defpackage.o501;
import defpackage.ozg;
import defpackage.pgz;
import defpackage.pzt0;
import defpackage.smw0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u3d0;
import defpackage.v920;
import defpackage.vrd0;
import defpackage.vzg;
import defpackage.x1d0;
import defpackage.znp0;
import java.util.Map;
import kotlin.Result;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.plus.repository.c;

/* loaded from: classes6.dex */
public final class b implements vrd0 {
    public final com.yandex.plus.home.feature.webviews.internal.container.a a;
    public final d3d0 b;
    public final String c;
    public final Map d;
    public final kgz e;
    public final a4d0 f;
    public final c g;
    public final com.yandex.go.payments.plus.domain.c h;
    public final String i;
    public final Runnable j;
    public final m9y0 k;
    public final x1d0 l;
    public final u3d0 m;
    public final ru.yandex.taxi.plus.sdk.prefetch.a n;
    public final tse o;
    public pzt0 p;

    public b(com.yandex.plus.home.feature.webviews.internal.container.a aVar, d3d0 d3d0Var, String str, Map map, kgz kgzVar, a4d0 a4d0Var, c cVar, com.yandex.go.payments.plus.domain.c cVar2, String str2, Runnable runnable, m9y0 m9y0Var, x1d0 x1d0Var, u3d0 u3d0Var, ru.yandex.taxi.plus.sdk.prefetch.a aVar2, tse tseVar) {
        this.a = aVar;
        this.b = d3d0Var;
        this.c = str;
        this.d = map;
        this.e = kgzVar;
        this.f = a4d0Var;
        this.g = cVar;
        this.h = cVar2;
        this.i = str2;
        this.j = runnable;
        this.k = m9y0Var;
        this.l = x1d0Var;
        this.m = u3d0Var;
        this.n = aVar2;
        this.o = tseVar;
    }

    public final void a(Runnable runnable) {
        pzt0 pzt0Var = this.p;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.m.a.add(this);
        x1d0 x1d0Var = this.l;
        znp0 znp0Var = x1d0Var.b.a;
        if (znp0Var != null) {
            fze fzeVar = znp0Var.f;
            x1d0Var.a.a.edit().putInt("ru.yandex.taxi.plus.counter.CounterPreferences.FIELD_LAST_OPENED_VALUE", fzeVar.a).apply();
            if (fzeVar.b) {
                x1d0Var.b.c(znp0.a(znp0Var, null, new fze(fzeVar.a, false), 95));
            }
        }
        this.n.b();
        fva0.f(this.k.a, "PlusWebHome", PerformanceAnalytics$Type.Loading, 0L, 4);
        this.p = tje.N(this.o, null, null, new SdkWebPlusScreen$showPlusHomeInternal$1(this, this, runnable, null), 3);
        final String str = this.c;
        final com.yandex.plus.home.feature.webviews.internal.container.a aVar = this.a;
        final String str2 = this.i;
        if (str != null) {
            final Map map = this.d;
            v920 v920Var = aVar.i;
            pgz pgzVar = aVar.w;
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "WebViewsControllerImpl", smw0.n(b64.v("showWithDeeplink(deeplink=", str, ", from=", str2, ", place=null, payload="), map, ')'));
            }
            final FrameLayout frameLayout = aVar.M;
            final String str3 = null;
            if (!frameLayout.isAttachedToWindow()) {
                frameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.container.WebViewsControllerImpl$showWithDeeplink$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        frameLayout.removeOnAttachStateChangeListener(this);
                        a aVar2 = aVar;
                        Object j = aVar2.i.j(Uri.parse(str));
                        if (j instanceof Result.Failure) {
                            j = null;
                        }
                        vzg vzgVar = (vzg) j;
                        a aVar3 = aVar;
                        if (vzgVar != null) {
                            o501 o501Var = aVar3.m;
                        } else {
                            vzgVar = (ozg) ((i3y) aVar3.i.y).getValue();
                        }
                        b.b(aVar2, vzgVar, false, null, str2, str3, map, 4);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }
                });
                return;
            }
            Object j = v920Var.j(Uri.parse(str));
            vzg vzgVar = (vzg) (j instanceof Result.Failure ? null : j);
            if (vzgVar == null) {
                vzgVar = (ozg) ((i3y) v920Var.y).getValue();
            }
            com.yandex.plus.home.feature.webviews.internal.container.b.b(aVar, vzgVar, false, null, str2, null, map, 4);
            return;
        }
        final Map map2 = this.d;
        pgz pgzVar2 = aVar.w;
        LogPriority logPriority2 = LogPriority.DEBUG;
        if (pgzVar2.e(logPriority2)) {
            pgzVar2.a(logPriority2, "WebViewsControllerImpl", "showPlusHome(from=" + str2 + ", message=null, place=null, payload=" + map2 + ')');
        }
        final FrameLayout frameLayout2 = aVar.M;
        final String str4 = null;
        if (frameLayout2.isAttachedToWindow()) {
            ozg ozgVar = (ozg) ((i3y) aVar.i.y).getValue();
            com.yandex.plus.home.feature.webviews.internal.container.b.b(aVar, ozg.a(ozgVar, null, ozgVar.c, 3), true, null, str2, null, map2, 4);
        } else {
            final String str5 = null;
            frameLayout2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.container.WebViewsControllerImpl$showPlusHome$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    frameLayout2.removeOnAttachStateChangeListener(this);
                    a aVar2 = aVar;
                    ozg ozgVar2 = (ozg) ((i3y) aVar2.i.y).getValue();
                    String str6 = str5;
                    if (str6 == null) {
                        str6 = ozgVar2.c;
                    }
                    b.b(aVar2, ozg.a(ozgVar2, null, str6, 3), true, null, str2, str4, map2, 4);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
    }
}
