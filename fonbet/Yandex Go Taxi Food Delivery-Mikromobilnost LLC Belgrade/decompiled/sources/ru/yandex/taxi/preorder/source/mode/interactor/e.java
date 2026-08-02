package ru.yandex.taxi.preorder.source.mode.interactor;

import android.os.Handler;
import android.os.Looper;
import com.yandex.go.preorder.mode.PinMode;
import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.taxi.summary.api.map.model.FocusPointType;
import defpackage.ah00;
import defpackage.bgv0;
import defpackage.cvr;
import defpackage.d0l0;
import defpackage.egt0;
import defpackage.f0l0;
import defpackage.fgt0;
import defpackage.fgv0;
import defpackage.fpv0;
import defpackage.fy01;
import defpackage.ggt0;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.h5l0;
import defpackage.hjt0;
import defpackage.hp0;
import defpackage.iib;
import defpackage.ja00;
import defpackage.jgt0;
import defpackage.jpv0;
import defpackage.kt00;
import defpackage.lgv0;
import defpackage.m8t0;
import defpackage.mgv0;
import defpackage.mzb;
import defpackage.nwx0;
import defpackage.otg;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.vfv0;
import defpackage.vxj0;
import defpackage.xm00;
import defpackage.ze61;
import defpackage.zfv0;
import defpackage.zzs;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator;
import ru.yandex.taxi.preorder.map.n;

/* loaded from: classes6.dex */
public final class e implements hjt0 {
    public final jgt0 a;
    public final com.yandex.go.route.interactor.b b;
    public final ru.yandex.taxi.address.clarification.impl.repo.a c;
    public final ze61 d;
    public final lgv0 e;
    public final hp0 f;
    public final fgv0 g;
    public final mzb h;
    public final vfv0 i;
    public final ru.yandex.taxi.address.clarification.impl.repo.a j;
    public final cvr k;
    public final h3y l;
    public final Handler m = new Handler(Looper.getMainLooper());

    public e(jgt0 jgt0Var, com.yandex.go.route.interactor.b bVar, ru.yandex.taxi.address.clarification.impl.repo.a aVar, ze61 ze61Var, lgv0 lgv0Var, hp0 hp0Var, fgv0 fgv0Var, mzb mzbVar, vfv0 vfv0Var, ru.yandex.taxi.address.clarification.impl.repo.a aVar2, cvr cvrVar, h3y h3yVar) {
        this.a = jgt0Var;
        this.b = bVar;
        this.c = aVar;
        this.d = ze61Var;
        this.e = lgv0Var;
        this.f = hp0Var;
        this.g = fgv0Var;
        this.h = mzbVar;
        this.i = vfv0Var;
        this.j = aVar2;
        this.k = cvrVar;
        this.l = h3yVar;
    }

    public final void a(SourcePointMode sourcePointMode) {
        lgv0 lgv0Var = this.e;
        egt0 egt0Var = (egt0) this.l.get();
        int i = ggt0.a[sourcePointMode.ordinal()];
        iib c = (i == 1 || i == 2) ? lgv0Var.c(FocusPointType.POINT_A) : i != 3 ? null : lgv0Var.c(FocusPointType.POINT_B);
        if (c == null) {
            if (!lgv0Var.a()) {
                mgv0 mgv0Var = lgv0Var.b;
                mgv0Var.d = false;
                mgv0Var.e = null;
                mgv0Var.f = null;
            }
            h(SourcePointMode.ROUTE, false, false);
            return;
        }
        if (!this.i.a.isEnabled()) {
            this.k.b(sourcePointMode != SourcePointMode.ROUTE_WITH_POINT_A_CONFIRMATION);
        }
        if (((Boolean) kotlinx.coroutines.flow.e.d(this.c.f).a.getValue()).booleanValue()) {
            return;
        }
        f0l0 f0l0Var = ((fgt0) egt0Var).g;
        boolean k = sourcePointMode.k();
        boolean w = sourcePointMode.w();
        com.yandex.go.preorder.map.a aVar = (com.yandex.go.preorder.map.a) f0l0Var;
        aVar.getClass();
        aVar.b(new vxj0(13, aVar, c), k, w);
    }

    public final void b() {
        d();
        SourcePointMode a = this.a.a();
        boolean v = a.v();
        r0 r0Var = this.g.d;
        zfv0 zfv0Var = zfv0.a;
        if (v) {
            r0Var.getClass();
            r0Var.m(null, zfv0Var);
        } else {
            r0Var.k(zfv0Var, bgv0.a);
        }
        h3y h3yVar = this.l;
        fy01 fy01Var = ((fgt0) ((egt0) h3yVar.get())).c;
        if (v) {
            ((nwx0) fy01Var).a.c();
        } else {
            ((nwx0) fy01Var).a.c();
        }
        fgt0 fgt0Var = (fgt0) ((egt0) h3yVar.get());
        ja00 ja00Var = fgt0Var.k;
        jpv0 b = fgt0Var.h.b();
        b.getClass();
        if (!(b instanceof fpv0) || fgt0Var.i.b() || fgt0Var.j.a()) {
            fgt0Var.e.Lc(MainScreen.class, null);
        } else {
            com.yandex.go.taxi.main.a aVar = (com.yandex.go.taxi.main.a) ja00Var;
            fgt0Var.e.q3(MainScreen.class, 0, ((MainScreen) aVar.n.b).getTopContentHeight(), 0, ((MainScreen) aVar.n.b).getBottomContentHeight());
        }
        ((fgt0) ((egt0) h3yVar.get())).a.setVisible(a.f());
        boolean z = false;
        if (!a.w()) {
            this.k.b(false);
        }
        if (a.u() && a != SourcePointMode.WHERE_YOU_ARE) {
            g(false);
            c();
        }
        boolean z2 = this.f.a() || a.s();
        ru.yandex.taxi.preorder.source.routeoverlay.a aVar2 = (ru.yandex.taxi.preorder.source.routeoverlay.a) ((fgt0) ((egt0) h3yVar.get())).b;
        aVar2.m0 = z2;
        aVar2.Lg();
        xm00 xm00Var = aVar2.f0;
        if (xm00Var != null) {
            xm00Var.i(z2);
        }
        n nVar = aVar2.x;
        xm00 xm00Var2 = aVar2.f0;
        if (xm00Var2 != null && xm00Var2.b && aVar2.o0 && aVar2.n0 && !aVar2.V.isEmpty()) {
            z = true;
        }
        qv10.B(z, nVar.r, null);
        kt00 kt00Var = aVar2.E;
        kt00Var.d = z2;
        kt00Var.a();
        ((ru.yandex.taxi.map.c) aVar2.Z).c(z2);
        ((ru.yandex.taxi.map.c) aVar2.a0).c(z2);
    }

    public final void c() {
        egt0 egt0Var = (egt0) this.l.get();
        fgt0 fgt0Var = (fgt0) egt0Var;
        ((nwx0) fgt0Var.c).a.c().k3(this.a.a().j(), ITransitionCoordinator.VisibilityChangeReason.ADDRESS_CHANGED);
        ((ru.yandex.taxi.preorder.source.routeoverlay.a) fgt0Var.b).Hg();
    }

    public final void d() {
        egt0 egt0Var = (egt0) this.l.get();
        jgt0 jgt0Var = this.a;
        PinMode pinMode = jgt0Var.a().u() ? PinMode.NONE : PinMode.ROUTE;
        boolean z = jgt0Var.a().q() && !((Boolean) kotlinx.coroutines.flow.e.d(this.j.f).a.getValue()).booleanValue();
        boolean z2 = !z;
        fgt0 fgt0Var = (fgt0) egt0Var;
        fgt0Var.getClass();
        PinMode pinMode2 = PinMode.ROUTE;
        otg otgVar = fgt0Var.d;
        if (pinMode != pinMode2) {
            otgVar.g = true;
            return;
        }
        otgVar.g = z2;
        ru.yandex.taxi.preorder.source.routeoverlay.a aVar = (ru.yandex.taxi.preorder.source.routeoverlay.a) fgt0Var.b;
        aVar.o0 = z;
        if (!z) {
            aVar.x0.b();
        }
        aVar.Ng();
    }

    public final void e(boolean z) {
        jgt0 jgt0Var = this.a;
        boolean a = jgt0Var.a().a();
        SourcePointMode a2 = jgt0Var.a();
        SourcePointMode sourcePointMode = SourcePointMode.ROUTE_WITH_POINT_A_CONFIRMATION;
        mzb mzbVar = this.h;
        lgv0 lgv0Var = this.e;
        if (a2 == sourcePointMode && lgv0Var.e()) {
            ((com.yandex.go.clarify_address.before_order.a) mzbVar).b.d = true;
            a(sourcePointMode);
            return;
        }
        if (z || ((a && lgv0Var.f()) || jgt0Var.a() == SourcePointMode.ROUTE)) {
            this.k.b(false);
            Handler handler = this.m;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new m8t0(7, this), 200L);
            return;
        }
        SourcePointMode a3 = jgt0Var.a();
        SourcePointMode sourcePointMode2 = SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_A;
        if (a3 == sourcePointMode2) {
            ((com.yandex.go.clarify_address.before_order.a) mzbVar).b.d = true;
            a(sourcePointMode2);
            return;
        }
        SourcePointMode a4 = jgt0Var.a();
        SourcePointMode sourcePointMode3 = SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_B;
        if (a4 == sourcePointMode3) {
            a(sourcePointMode3);
        }
    }

    public final void f() {
        jgt0 jgt0Var = this.a;
        boolean v = jgt0Var.a().v();
        r0 r0Var = this.g.d;
        zfv0 zfv0Var = zfv0.a;
        if (v) {
            r0Var.getClass();
            r0Var.m(null, zfv0Var);
        } else {
            r0Var.k(zfv0Var, bgv0.a);
        }
        egt0 egt0Var = (egt0) this.l.get();
        boolean v2 = jgt0Var.a().v();
        fy01 fy01Var = ((fgt0) egt0Var).c;
        if (v2) {
            ((nwx0) fy01Var).a.c();
        } else {
            ((nwx0) fy01Var).a.c();
        }
    }

    public final void g(boolean z) {
        if (z && this.a.a().q()) {
            return;
        }
        com.yandex.go.route.interactor.b bVar = this.b;
        bVar.h = true;
        n0 n0Var = bVar.f;
        d0l0.Companion.getClass();
        n0Var.g(h5l0.a);
    }

    public final void h(SourcePointMode sourcePointMode, boolean z, boolean z2) {
        jgt0 jgt0Var = this.a;
        SourcePointMode a = jgt0Var.a();
        lgv0 lgv0Var = this.e;
        if (a == sourcePointMode && !z) {
            d();
            if (jgt0Var.a() == SourcePointMode.ROUTE) {
                ((com.yandex.go.clarify_address.before_order.a) this.h).b.d = true;
                e(z2);
            }
            lgv0Var.b();
            return;
        }
        jgt0Var.a.l(sourcePointMode);
        b();
        e(z2);
        boolean h = sourcePointMode.h();
        ze61 ze61Var = this.d;
        pzt0 pzt0Var = ze61Var.d;
        ah00 ah00Var = ze61Var.b;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (h) {
            zzs b = ((gh00) ah00Var).e.b();
            gh00 gh00Var = (gh00) ah00Var;
            if (gh00Var.a.e(ze61Var.c)) {
                gh00Var.L(b);
            }
            ze61Var.d = ru.yandex.taxi.lifecycle.c.b(ze61Var.a.a, CoroutineStart.DEFAULT, new ZoomFocusPointInteractor$setFocusOnPinWhenZooming$1(ze61Var, null));
        } else {
            ((gh00) ah00Var).L(null);
        }
        lgv0Var.b();
    }
}
