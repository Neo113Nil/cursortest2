package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.data.repositories.h;
import com.yandex.go.domain.interactor.d;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.taxi.summary.map.walkingroute.e;
import com.yandex.go.walking.navigation.impl.guidance.interactor.k;
import com.yandex.go.walking.navigation.impl.overview.interactor.j;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.report.reporters.q0;
import com.yandex.passport.internal.ui.bouncer.roundabout.g;
import com.yandex.passport.internal.ui.bouncer.roundabout.i;
import com.yandex.passport.internal.ui.bouncer.roundabout.l;
import com.yandex.passport.internal.ui.challenge.changecurrent.f;
import com.yandex.passport.internal.ui.challenge.n;
import com.yandex.passport.internal.usecase.j1;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.x;
import defpackage.yvf0;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.uploaded_images_preview.b;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.walkroute.a;

/* loaded from: classes14.dex */
public final class qd21 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;

    public qd21(yvf0 yvf0Var, n3w n3wVar, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4) {
        this.a = 14;
        this.c = yvf0Var;
        this.b = n3wVar;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.f;
        yvf0 yvf0Var2 = this.e;
        yvf0 yvf0Var3 = this.d;
        final yvf0 yvf0Var4 = this.b;
        final yvf0 yvf0Var5 = this.c;
        switch (i) {
            case 0:
                return new b((u3s) ((n3w) yvf0Var4).a, (s5s) ((p1g) yvf0Var5).get(), (p6s) ((p1g) yvf0Var3).get(), (sae) ((srb) yvf0Var2).get(), (do6) ((eu0) yvf0Var).get());
            case 1:
                return new e((a) ((xvf0) yvf0Var4).get(), (po21) ((xvf0) yvf0Var5).get(), (tt2) ((xvf0) yvf0Var3).get(), (fp21) ((sk21) yvf0Var2).get(), (rz0) ((nb11) yvf0Var).get());
            case 2:
                return new d((tt2) ((xvf0) yvf0Var4).get(), (h) ((xvf0) yvf0Var5).get(), (fr21) ((icg) yvf0Var3).get(), (d9v) ((icg) yvf0Var2).get(), (eq21) ((fq21) yvf0Var).get());
            case 3:
                return new k((a341) ((ocg) yvf0Var4).get(), (com.yandex.go.walking.navigation.impl.navigation_core.b) ((xvf0) yvf0Var5).get(), (ah00) ((pcg) yvf0Var3).get(), (a3v) ((pcg) yvf0Var2).get(), (tt2) ((jcg) yvf0Var).get());
            case 4:
                return new r141((Context) ((jcg) yvf0Var4).get(), (w030) ((pcg) yvf0Var5).get(), (a201) ((ibz0) yvf0Var3).get(), (b741) ((xvf0) yvf0Var2).get(), (w041) ((xvf0) yvf0Var).get());
            case 5:
                return new com.yandex.go.walking.navigation.impl.overview.interactor.a((com.yandex.go.walking.navigation.impl.domain.interactor.b) ((xvf0) yvf0Var4).get(), (n441) ((xvf0) yvf0Var5).get(), (v541) ((ocg) yvf0Var3).get(), (b741) ((xvf0) yvf0Var2).get(), (w041) ((xvf0) yvf0Var).get());
            case 6:
                return new j((vmn0) ((uw11) yvf0Var4).get(), (v541) ((ocg) yvf0Var5).get(), (ah00) ((pcg) yvf0Var3).get(), (n441) ((xvf0) yvf0Var2).get(), (a3l0) ((pcg) yvf0Var).get());
            case 7:
                return new com.ybsdk.feature.webview.internal.domain.a((AppAnalyticsReporter) ((rbg) yvf0Var4).get(), (oq41) ((rbg) yvf0Var5).get(), (x) ((rbg) yvf0Var3).get(), (um41) ((rbg) yvf0Var2).get(), (com.ybsdk.feature.webview.internal.domain.b) ((xvf0) yvf0Var).get());
            case 8:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.wheel_picker.b((u3s) ((n3w) yvf0Var4).a, (hwy0) ((gxf) yvf0Var5).get(), (u0z) ((eu0) yvf0Var).get(), (p6s) ((p1g) yvf0Var3).get(), (sae) ((srb) yvf0Var2).get());
            case 9:
                return new com.yandex.go.where_you_are.impl.presentation.d((Activity) ((c1g) yvf0Var4).get(), (a3v) ((c1g) yvf0Var5).get(), (yy41) ((e641) yvf0Var3).get(), (c) ((c1g) yvf0Var2).get(), (com.yandex.go.where_you_are.impl.router.a) ((eqh) yvf0Var).get());
            case 10:
                return new wz41((f0) ((xvf0) yvf0Var4).get(), (f0) ((xvf0) yvf0Var5).get(), (ru.yandex.taxi.orderforanother.repository.a) ((xvf0) yvf0Var3).get(), (com.yandex.go.repositories.e) ((xvf0) yvf0Var2).get(), (qv70) ((t160) yvf0Var).get());
            case 11:
                return new ke51((s421) ((t4v0) yvf0Var4).get(), (String) ((xvf0) yvf0Var5).get(), (x22) ((xvf0) yvf0Var3).get(), (c370) ((xvf0) yvf0Var2).get(), (wd51) ((y101) yvf0Var).get());
            case 12:
                return new lu51((np51) ((xvf0) yvf0Var4).get(), (xvf0) yvf0Var5, (com.ybsdk.screens.initial.a) ((xat) yvf0Var3).get(), (di51) ((xvf0) yvf0Var2).get(), (y750) ((xvf0) yvf0Var).get());
            case 13:
                final int i2 = 0;
                fum fumVar = new fum(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.f
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        yvf0 yvf0Var6 = yvf0Var4;
                        switch (i3) {
                        }
                        return (com.lightside.slab.a) yvf0Var6.get();
                    }
                }, g.a);
                final int i3 = 1;
                return new l(scc.g(fumVar, new fum(new tls() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.f
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i32 = i3;
                        yvf0 yvf0Var6 = yvf0Var5;
                        switch (i32) {
                        }
                        return (com.lightside.slab.a) yvf0Var6.get();
                    }
                }, com.yandex.passport.internal.ui.bouncer.roundabout.h.a), new fum(new a0(11, (com.yandex.passport.internal.ui.bouncer.roundabout.items.d) yvf0Var3), i.a), new fum(new a0(12, (com.yandex.passport.internal.ui.bouncer.roundabout.items.d) yvf0Var2), com.yandex.passport.internal.ui.bouncer.roundabout.j.a), new fum(new a0(13, (q0) yvf0Var), com.yandex.passport.internal.ui.bouncer.roundabout.k.a)), 2);
            default:
                return new f((com.yandex.passport.internal.ui.challenge.j) yvf0Var5.get(), (com.yandex.passport.internal.ui.challenge.changecurrent.h) ((n3w) yvf0Var4).a, (n) yvf0Var3.get(), (j1) yvf0Var2.get(), (com.yandex.passport.internal.account.a) yvf0Var.get());
        }
    }

    public /* synthetic */ qd21(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
    }

    public qd21(n3w n3wVar, gxf gxfVar, eu0 eu0Var, p1g p1gVar, srb srbVar) {
        this.a = 8;
        this.b = n3wVar;
        this.c = gxfVar;
        this.f = eu0Var;
        this.d = p1gVar;
        this.e = srbVar;
    }
}
