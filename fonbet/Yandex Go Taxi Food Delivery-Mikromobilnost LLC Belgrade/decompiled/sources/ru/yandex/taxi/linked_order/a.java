package ru.yandex.taxi.linked_order;

import com.yandex.go.navigation.screen.b;
import com.yandex.go.preorder.mode.SourcePointMode;
import defpackage.b7;
import defpackage.bdc;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.jgt0;
import defpackage.loy;
import defpackage.mhf;
import defpackage.p10;
import defpackage.pwf0;
import defpackage.q10;
import defpackage.t3u0;
import defpackage.tje;
import defpackage.u3u0;
import defpackage.v3u0;
import defpackage.xng0;
import defpackage.y3u0;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.interactor.i0;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;
import ru.yandex.taxi.statebar.controller.c;
import ru.yandex.taxi.utils.f;

/* loaded from: classes9.dex */
public final class a extends c {
    public final i0 j;
    public final mhf k;
    public final r0 l;
    public final f m;
    public loy n;
    public boolean o;
    public jgt0 p;
    public final r0 q;
    public final hbp0 r;
    public final q10 s;

    public a(i0 i0Var, mhf mhfVar, com.yandex.go.navigation.screen.c cVar, y3u0 y3u0Var, v3u0 v3u0Var) {
        super(cVar, y3u0Var, v3u0Var);
        this.j = i0Var;
        this.k = mhfVar;
        this.l = bvf0.c(SourcePointMode.POINT);
        ConcurrentHashMap concurrentHashMap = pwf0.a;
        this.m = new f(p10.class);
        this.n = loy.e;
        this.q = bvf0.c(Boolean.FALSE);
        this.r = new hbp0(new czo0(14), "linkedOrderStateBar", null);
        this.s = new q10(this);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void b(ru.yandex.taxi.statebar.a aVar) {
        super.b(aVar);
        this.o = true;
        h();
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final boolean e() {
        return this.n.a && super.e();
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void f() {
        ru.yandex.taxi.statebar.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        bdc bdcVar = new bdc(xng0.textMain);
        t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.ACTIVE_LINKED_ORDER);
        loy loyVar = this.n;
        t3u0Var.b = loyVar.a;
        t3u0Var.e = loyVar.c;
        t3u0Var.g = loyVar.d;
        t3u0Var.j = true;
        t3u0Var.k = bdcVar;
        t3u0Var.l = bdcVar;
        t3u0Var.h = new bdc(xng0.bgMain);
        t3u0Var.i = new b7(2, this);
        aVar.a(new u3u0(t3u0Var));
        e();
        g();
    }

    public final void h() {
        r0 r0Var;
        if (this.o) {
            hbp0 hbp0Var = this.r;
            hbp0Var.f();
            mhf mhfVar = this.k;
            r0 r0Var2 = mhfVar.b;
            b c = mhfVar.a.c();
            jgt0 jgt0Var = this.p;
            if (jgt0Var == null || (r0Var = jgt0Var.b()) == null) {
                r0Var = this.l;
            }
            tje.N(hbp0Var, null, null, new ActiveLinkedOrderController$subscribeForUpdatesInternal$$inlined$safeCollectIn$1(e.t(new m0(e.m(r0Var2, c, r0Var, this.q, new ActiveLinkedOrderController$canShowNotificationFlow$1(this, null)), this.j.a(), new ActiveLinkedOrderController$subscribeForUpdatesInternal$1(3, null))), null, this), 3);
        }
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void stop() {
        super.stop();
        this.o = false;
        this.r.b();
    }
}
