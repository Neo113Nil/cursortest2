package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigator.di.a;
import com.yandex.go.navigator.domain.j;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.events.f;
import com.yandex.go.navigator.gas_stations.experiment.c;
import com.yandex.go.navigator.main_screen.experiement.e;
import com.yandex.go.preorder.navigation.g;
import com.yandex.go.route.interactor.b;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class va50 extends sa50 {
    public final k0b0 D;
    public final i6r E;
    public final a F;
    public final BaseRootNavigationRouter.a G = new BaseRootNavigationRouter.a(Screen.NAVIGATOR, null, null, 14);

    public va50(k0b0 k0b0Var, i6r i6rVar, a aVar) {
        this.D = k0b0Var;
        this.E = i6rVar;
        this.F = aVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        a aVar = this.F;
        e100 e100Var = aVar.b;
        if (e100Var != null) {
            e100Var.w = null;
        }
        aVar.b = null;
        cb50 cb50Var = aVar.a;
        cb50Var.d = false;
        cb50Var.a();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ud50 ud50Var = (ud50) obj;
        if (this.D.b()) {
            R(ud50Var);
            return;
        }
        E(new ee50(Q().V2), zy11.a, new ua50(this, ud50Var), hxx.a);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.G;
    }

    public final m4g Q() {
        a aVar = this.F;
        cb50 cb50Var = aVar.a;
        e100 e100Var = aVar.b;
        if (e100Var == null) {
            e100 e100Var2 = new e100(this.E, (kv1) ((kkt) ((vg50) cb50Var.b().W.a).a.a).get());
            aVar.b = e100Var2;
            cb50Var.d = true;
            e100Var = e100Var2;
        }
        m4g m4gVar = (m4g) e100Var.w;
        if (m4gVar != null) {
            return m4gVar;
        }
        i6r i6rVar = (i6r) e100Var.b;
        kv1 kv1Var = (kv1) e100Var.c;
        i6rVar.getClass();
        kv1Var.getClass();
        m4g m4gVar2 = new m4g(i6rVar, kv1Var);
        e100Var.w = m4gVar2;
        return m4gVar2;
    }

    public final void R(ud50 ud50Var) {
        pho k2 = ((c0g) Q().b).k2();
        q5z.h(k2);
        String str = ud50Var.b.a;
        String str2 = ud50Var.c;
        HashMap hashMap = new HashMap();
        hashMap.put("is_opened_by_deeplink", Boolean.valueOf(ud50Var instanceof rd50));
        hashMap.put("source", str);
        k2.a("Navigator.Shown", hashMap, 2, tse0.r("utm", hashMap, str2));
        m4g Q = Q();
        kv1 kv1Var = Q.a;
        re50 re50Var = (re50) kv1Var.k;
        q5z.h(re50Var);
        ut utVar = Q.u2;
        c0g c0gVar = (c0g) Q.b;
        oc50 oc50Var = (oc50) c0gVar.z.sb.get();
        q5z.h(oc50Var);
        h3y a = i5m.a(Q.v2);
        rx4 rx4Var = Q.C2;
        xes0 xes0Var = new xes0(c0gVar.w);
        t tVar = (t) kv1Var.d;
        q5z.h(tVar);
        b g = c0gVar.g();
        q5z.h(g);
        atd0 H2 = c0gVar.H2();
        q5z.h(H2);
        com.yandex.go.navigator.address.a aVar = new com.yandex.go.navigator.address.a(g, H2);
        com.yandex.go.navigator.notifications.cartech.b bVar = (com.yandex.go.navigator.notifications.cartech.b) Q.c0.get();
        h3y a2 = i5m.a(Q.M);
        h3y a3 = i5m.a(Q.R2);
        zzf zzfVar = c0gVar.z;
        mf50 mf50Var = (mf50) zzfVar.rb.get();
        q5z.h(mf50Var);
        ii9 ii9Var = Q.s2;
        tz60 tz60Var = (tz60) Q.c.get();
        lx4 F = c0gVar.F();
        q5z.h(F);
        dne0 dne0Var = (dne0) zzfVar.d.get();
        q5z.h(dne0Var);
        dt20 dt20Var = new dt20((ma1) zzfVar.l.get(), F, dne0Var);
        ju9 ju9Var = Q.S2;
        rqo l2 = c0gVar.l2();
        q5z.h(l2);
        c cVar = (c) Q.f.get();
        rqo l22 = c0gVar.l2();
        q5z.h(l22);
        e eVar = new e(l2, new com.yandex.go.navigator.utils.a(cVar, new ipv(l22), (com.yandex.go.navigator.share.experiment.c) Q.j.get()));
        c0g c0gVar2 = c0gVar.A;
        sb50 sb50Var = (sb50) c0gVar2.a.A3.get();
        q5z.h(sb50Var);
        f fVar = (f) c0gVar2.a.B3.get();
        q5z.h(fVar);
        g gVar = (g) c0gVar.G.get();
        q5z.h(gVar);
        od50 od50Var = (od50) kv1Var.u;
        q5z.h(od50Var);
        par parVar = (par) kv1Var.l;
        q5z.h(parVar);
        hbp0 hbp0Var = (hbp0) kv1Var.i;
        q5z.h(hbp0Var);
        com.yandex.go.navigator.notifications.cartech.b bVar2 = (com.yandex.go.navigator.notifications.cartech.b) Q.c0.get();
        re50 re50Var2 = (re50) kv1Var.k;
        q5z.h(re50Var2);
        E(new com.yandex.go.navigator.navigation.e(re50Var, utVar, oc50Var, a, rx4Var, xes0Var, tVar, aVar, bVar, a2, a3, mf50Var, ii9Var, tz60Var, dt20Var, ju9Var, eVar, sb50Var, fVar, gVar, od50Var, new j(tVar, new com.yandex.go.navigator.alt_select.a(tVar, parVar, hbp0Var, bVar2, re50Var2), new yxf0(re50Var2, (lg50) Q.v1.get()))), ud50Var, new mo30(5, this), hxx.a);
    }
}
