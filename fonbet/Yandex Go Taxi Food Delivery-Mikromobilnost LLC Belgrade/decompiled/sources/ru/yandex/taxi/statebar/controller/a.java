package ru.yandex.taxi.statebar.controller;

import defpackage.al60;
import defpackage.avj0;
import defpackage.bb1;
import defpackage.c9p;
import defpackage.czo0;
import defpackage.gdc;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.t3u0;
import defpackage.u3u0;
import defpackage.uc60;
import defpackage.v060;
import defpackage.v3u0;
import defpackage.w060;
import defpackage.w511;
import defpackage.x060;
import defpackage.y3u0;
import defpackage.zuj0;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;

/* loaded from: classes10.dex */
public final class a extends c {
    public final zuj0 j;
    public final al60 k;
    public final uc60 l;
    public final ru.yandex.taxi.failure_notificator.b m;
    public final c9p n;
    public String o;
    public String p;
    public boolean q;
    public final hbp0 r;
    public volatile boolean s;

    public a(com.yandex.go.navigation.screen.c cVar, y3u0 y3u0Var, v3u0 v3u0Var, zuj0 zuj0Var, al60 al60Var, uc60 uc60Var, ru.yandex.taxi.failure_notificator.b bVar, c9p c9pVar) {
        super(cVar, y3u0Var, v3u0Var);
        this.j = zuj0Var;
        this.k = al60Var;
        this.l = uc60Var;
        this.m = bVar;
        this.n = c9pVar;
        this.q = true;
        this.r = new hbp0(new czo0(14), "", null);
    }

    public static final void h(a aVar, x060 x060Var, bb1 bb1Var) {
        if (aVar.e()) {
            return;
        }
        if (bb1Var instanceof v060) {
            v060 v060Var = (v060) bb1Var;
            aVar.k.a(v060Var.p0(), v060Var.r());
        } else if (jl40.l(bb1Var, w060.f)) {
            aVar.k.a(null, bb1Var.r());
        } else if (bb1Var != null) {
            w511.b();
            return;
        }
        if (x060Var == null) {
            avj0 avj0Var = (avj0) aVar.j;
            aVar.o = avj0Var.h(kyh0.no_connection_title);
            aVar.p = avj0Var.h(kyh0.no_connection_check_prompt);
        } else {
            aVar.o = x060Var.a;
            aVar.p = x060Var.b;
        }
        aVar.q = false;
        aVar.s = true;
        if (aVar.e() && !aVar.s) {
            aVar.k.a("improper", NotificatorReporter$MessageType.NETWORK_ERROR);
        }
        aVar.f();
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void b(ru.yandex.taxi.statebar.a aVar) {
        super.b(aVar);
        hbp0 hbp0Var = this.r;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new InternetConnectionStateBarController$observeStateRepository$1(this, null), 3);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final boolean e() {
        return !this.q && super.e();
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void f() {
        ru.yandex.taxi.statebar.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        gdc gdcVar = new gdc(mqg0.component_white);
        t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.NO_INTERNET_CONNECTION);
        t3u0Var.b = e();
        String str = this.o;
        if (str == null) {
            str = ((avj0) this.j).h(kyh0.common_error_no_internet_connection_title);
        }
        t3u0Var.e = str;
        t3u0Var.g = this.p;
        t3u0Var.k = gdcVar;
        t3u0Var.l = gdcVar;
        t3u0Var.h = new gdc(mqg0.component_red_normal);
        aVar.a(new u3u0(t3u0Var));
        e();
        g();
        this.s = false;
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void stop() {
        super.stop();
        this.r.b();
    }
}
