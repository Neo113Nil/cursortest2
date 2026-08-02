package defpackage;

import android.content.Context;
import com.yandex.go.route.interactor.c;
import com.yandex.go.zone.interactors.b;
import java.util.concurrent.TimeUnit;
import kotlin.NotImplementedError;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.dashboard.DeliveryDashboardCard;
import ru.yandex.taxi.logistics.dashboard.analytics.DeliveryDashboardOnScrollChangeListener;
import ru.yandex.taxi.logistics.payment.a;

/* loaded from: classes5.dex */
public final class r5i extends m230 {
    public final w030 E;
    public final yvf0 F;
    public final t5i G;
    public final h3y H;
    public final o4i I;
    public final yvf0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final b5i M;
    public final a5i N;
    public final yvf0 O;
    public final khg P;
    public final y50 Q;
    public final qsi R;
    public final h3y S;
    public final if9 T;
    public final dqe0 U;
    public final yvf0 V;
    public final zuj0 W;
    public final yvf0 Z;
    public final s6s a0;
    public final cwi b0;
    public final oep0 c0;
    public final ove d0;

    public r5i(w030 w030Var, yvf0 yvf0Var, t5i t5iVar, h3y h3yVar, o4i o4iVar, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, b5i b5iVar, a5i a5iVar, yvf0 yvf0Var5, khg khgVar, y50 y50Var, qsi qsiVar, h3y h3yVar2, if9 if9Var, dqe0 dqe0Var, yvf0 yvf0Var6, zuj0 zuj0Var, yvf0 yvf0Var7, s6s s6sVar, cwi cwiVar, oep0 oep0Var, ove oveVar) {
        super(null);
        this.E = w030Var;
        this.F = yvf0Var;
        this.G = t5iVar;
        this.H = h3yVar;
        this.I = o4iVar;
        this.J = yvf0Var2;
        this.K = yvf0Var3;
        this.L = yvf0Var4;
        this.M = b5iVar;
        this.N = a5iVar;
        this.O = yvf0Var5;
        this.P = khgVar;
        this.Q = y50Var;
        this.R = qsiVar;
        this.S = h3yVar2;
        this.T = if9Var;
        this.U = dqe0Var;
        this.V = yvf0Var6;
        this.W = zuj0Var;
        this.Z = yvf0Var7;
        this.a0 = s6sVar;
        this.b0 = cwiVar;
        this.c0 = oep0Var;
        this.d0 = oveVar;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        p4i p4iVar = (p4i) obj;
        if (((n4i) this.I.a.c()).b) {
            super.G(p4iVar);
        } else {
            jst.e.s(new NotImplementedError("Delivery dashboard is disabled"));
            r(new qu(9));
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        r0 r0Var = this.G.a;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.b0.a();
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        k4i d;
        String str = ((p4i) obj).a;
        g4i g4iVar = (g4i) this.H.get();
        q5i q5iVar = new q5i(this);
        m5i m5iVar = new m5i(0, this);
        w030 w030Var = this.E;
        g4iVar.getClass();
        w030Var.getClass();
        xvf0 b = i5m.b(new wif((Object) new ywf(2, g4iVar), (xvf0) n3w.a(q5iVar), 15));
        Context context = g4iVar.a;
        q5z.h(context);
        j4i j4iVar = (j4i) b.get();
        c2x0 c2x0Var = g4iVar.h;
        q5z.h(c2x0Var);
        pho phoVar = g4iVar.l;
        q5z.h(phoVar);
        DeliveryDashboardOnScrollChangeListener deliveryDashboardOnScrollChangeListener = new DeliveryDashboardOnScrollChangeListener(new zrv0(phoVar));
        c cVar = g4iVar.e;
        q5z.h(cVar);
        zch zchVar = new zch(cVar);
        o4i o4iVar = g4iVar.b;
        q5z.h(o4iVar);
        j4i j4iVar2 = (j4i) b.get();
        a aVar = g4iVar.g;
        q5z.h(aVar);
        n3h n3hVar = g4iVar.i;
        q5z.h(n3hVar);
        b bVar = g4iVar.c;
        q5z.h(bVar);
        com.yandex.go.route.interactor.b bVar2 = g4iVar.f;
        q5z.h(bVar2);
        ftx ftxVar = g4iVar.j;
        q5z.h(ftxVar);
        ru.yandex.taxi.logistics.dashboard.a aVar2 = new ru.yandex.taxi.logistics.dashboard.a(bVar, bVar2, ftxVar);
        com.yandex.go.urbanads.b bVar3 = g4iVar.k;
        q5z.h(bVar3);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Double d2 = ((n4i) o4iVar.a.c()).c;
        j4n j4nVar = new j4n(zchVar, aVar, new v3i(timeUnit.toMillis((long) (d2 != null ? d2.doubleValue() : 10.0d)), str), new h4i(j4iVar2, aVar2), m5iVar, new v8e(16, n3hVar), bVar3);
        synchronized (bvf0.g) {
            y8g y8gVar = bvf0.e;
            if (y8gVar == null) {
                y8gVar = null;
            }
            d = y8gVar.a().d(j4nVar);
        }
        DeliveryDashboardCard deliveryDashboardCard = new DeliveryDashboardCard(context, j4iVar, c2x0Var, deliveryDashboardOnScrollChangeListener, d);
        r0 r0Var = this.G.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.b0.b();
        return deliveryDashboardCard;
    }
}
