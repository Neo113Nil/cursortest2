package defpackage;

import android.content.Context;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$WalkingNavigationGeneration;
import com.yandex.go.walking.navigation.impl.overview.interactor.a;
import com.yandex.go.walking.navigation.impl.overview.interactor.j;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class t441 extends pgd {
    public final Context F;
    public final w030 G;
    public final j H;
    public final a I;
    public final pso0 J;
    public final a3v K;
    public final b741 L;
    public final w041 M;
    public final v541 N;
    public y4c0 O;
    public final mu5 P;

    public t441(Context context, w030 w030Var, j jVar, a aVar, pso0 pso0Var, a3v a3vVar, b741 b741Var, w041 w041Var, v541 v541Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = jVar;
        this.I = aVar;
        this.J = pso0Var;
        this.K = a3vVar;
        this.L = b741Var;
        this.M = w041Var;
        this.N = v541Var;
        this.P = new mu5(new r441(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        f541 f541Var = (f541) obj;
        super.G(f541Var);
        this.K.b8(this);
        y4c0 y4c0Var = (y4c0) this.J.get();
        this.O = y4c0Var;
        A(y4c0Var, new q441(f541Var.c), sy60.Q2);
        List a = this.N.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            String routeId = ((Route) it.next()).getMetadata().getRouteId();
            if (routeId != null) {
                arrayList.add(routeId);
            }
        }
        w041 w041Var = this.M;
        String str = w041Var.a;
        WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration = null;
        if (w041Var.b != null) {
            Iterator<E> it2 = WalkingNavigationAnalytics$WalkingNavigationGeneration.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (jl40.l(((WalkingNavigationAnalytics$WalkingNavigationGeneration) next).getEventValue(), w041Var.b)) {
                    walkingNavigationAnalytics$WalkingNavigationGeneration = next;
                    break;
                }
            }
            walkingNavigationAnalytics$WalkingNavigationGeneration = walkingNavigationAnalytics$WalkingNavigationGeneration;
        }
        b741 b741Var = this.L;
        b741Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("list_routes_id", arrayList);
        if (str != null) {
            hashMap.put("hub_session_id", str);
        }
        if (walkingNavigationAnalytics$WalkingNavigationGeneration != null) {
            hashMap.put("generation", walkingNavigationAnalytics$WalkingNavigationGeneration.getEventValue());
        }
        b741Var.a.a("WalkingNavigation.Overview.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((f541) obj);
        a3v a3vVar = this.K;
        a3vVar.t4(this);
        a3vVar.a0(this);
        y4c0 y4c0Var = this.O;
        if (y4c0Var != null) {
            y4c0Var.i();
        }
        this.O = null;
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.P;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
