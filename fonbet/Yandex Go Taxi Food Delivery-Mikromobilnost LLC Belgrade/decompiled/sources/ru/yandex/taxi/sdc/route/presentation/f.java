package ru.yandex.taxi.sdc.route.presentation;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bmp0;
import defpackage.c6p0;
import defpackage.czo0;
import defpackage.d0l0;
import defpackage.dqe0;
import defpackage.evu0;
import defpackage.ftx;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.mhf;
import defpackage.tje;
import defpackage.tmx;
import defpackage.tse;
import defpackage.uyo0;
import defpackage.wiq0;

/* loaded from: classes6.dex */
public final class f {
    public final wiq0 a;
    public final ftx b;
    public final dqe0 c;
    public final ru.yandex.taxi.sdc.route.repository.a d;
    public final bmp0 e;
    public final mhf f;
    public final ru.yandex.taxi.sdc.router.e g;
    public final com.yandex.go.route.interactor.c h;
    public final hbp0 i = new hbp0(new czo0(14), f.class.getSimpleName(), null);
    public kotlinx.coroutines.c j = kotlinx.coroutines.a.a();
    public final i3y k = kotlin.a.a(new c6p0(22));

    public f(wiq0 wiq0Var, ftx ftxVar, dqe0 dqe0Var, ru.yandex.taxi.sdc.route.repository.a aVar, bmp0 bmp0Var, mhf mhfVar, ru.yandex.taxi.sdc.router.e eVar, com.yandex.go.route.interactor.c cVar) {
        this.a = wiq0Var;
        this.b = ftxVar;
        this.c = dqe0Var;
        this.d = aVar;
        this.e = bmp0Var;
        this.f = mhfVar;
        this.g = eVar;
        this.h = cVar;
    }

    public final boolean a() {
        String str;
        String str2 = this.c.a.Q;
        return ((str2 != null ? (Mode) gtq0.j(str2, ((tmx) this.k.getValue()).a) : null) != Mode.SDC || (str = this.d.b) == null || evu0.J(str)) ? false : true;
    }

    public final void b() {
        this.j.a(null);
        this.e.a();
    }

    public final void c(tse tseVar) {
        hbp0 hbp0Var = this.i;
        hbp0Var.a();
        gtq0.t(tseVar, new uyo0(4, hbp0Var));
        tje.N(tseVar, null, null, new SdcPreorderRouteController$resume$$inlined$safeCollectIn$1(((k) this.a).j.b(), null, this), 3);
        tje.N(tseVar, null, null, new SdcPreorderRouteController$resume$$inlined$safeCollectIn$2(new c(this.f.a.c()), null, this), 3);
        tje.N(tseVar, null, null, new SdcPreorderRouteController$resume$$inlined$safeCollectIn$3(this.g.k, null, this), 3);
        tje.N(tseVar, null, null, new SdcPreorderRouteController$resume$$inlined$safeCollectIn$4(new e(this.h.f(), this), null, this), 3);
        gtq0.t(tseVar, new uyo0(12, this));
    }

    public final void d(d0l0 d0l0Var) {
        if (d0l0Var.a().isEmpty() || d0l0Var.b.isEmpty()) {
            this.e.a();
            return;
        }
        this.j.a(null);
        this.j = hbp0.e(this.i, null, null, new SdcPreorderRouteController$setRoute$1(this, d0l0Var, null), 3);
    }
}
