package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Summary$SummaryState;

/* loaded from: classes14.dex */
public final class v0s {
    public final z880 a;
    public final pev0 b;
    public final xb80 c;
    public final biv0 d;
    public final wiq0 e;
    public final wjm f;
    public final e6t0 g;
    public final rf5 h;
    public final tbx0 i;
    public final nex0 j;

    public v0s(z880 z880Var, pev0 pev0Var, xb80 xb80Var, biv0 biv0Var, wiq0 wiq0Var, wjm wjmVar, e6t0 e6t0Var, rf5 rf5Var, tbx0 tbx0Var, nex0 nex0Var) {
        this.a = z880Var;
        this.b = pev0Var;
        this.c = xb80Var;
        this.d = biv0Var;
        this.e = wiq0Var;
        this.f = wjmVar;
        this.g = e6t0Var;
        this.h = rf5Var;
        this.i = tbx0Var;
        this.j = nex0Var;
    }

    public final Object a(u0s u0sVar, oiv0 oiv0Var, SuspendLambda suspendLambda) {
        if (u0sVar instanceof m0s) {
            e6t0 e6t0Var = this.g;
            xcv0 xcv0Var = e6t0Var.b;
            xcv0Var.a.a("Summary.Payment", nnm.m(xcv0Var, "summary_state", ((a7t0) e6t0Var.a).a().b), 2, new HashMap());
            oiv0Var.v();
        } else {
            if (u0sVar instanceof l0s) {
                z880 z880Var = this.a;
                boolean z = ((l89) z880Var).c;
                biv0 biv0Var = this.d;
                if (z) {
                    jst.e.n("Taxi order was initiated from Summary Screen, but another order was in processing");
                } else {
                    ((ci70) this.c).E = biv0Var.c() ? Events$Summary$SummaryState.EXPANDED : Events$Summary$SummaryState.COLLAPSED;
                    z880Var.a();
                    jst.e.n("Taxi order was initiated from Summary Screen");
                }
                if (biv0Var.c()) {
                    fnx0 n = ((k) this.e).n();
                    mi31 mi31Var = n != null ? n.a : null;
                    this.i.b(mi31Var != null ? mi31Var.f : null, mi31Var != null ? mi31Var.b : null);
                }
                this.j.a(this.f.q());
                this.h.b();
            } else if (u0sVar instanceof n0s) {
                ((n0s) u0sVar).a.invoke();
            } else if (u0sVar instanceof o0s) {
                ((o0s) u0sVar).a.invoke();
            } else {
                if (!(u0sVar instanceof q0s)) {
                    if (u0sVar instanceof p0s) {
                        throw null;
                    }
                    boolean l = jl40.l(u0sVar, r0s.a);
                    pev0 pev0Var = this.b;
                    if (l) {
                        return pev0Var.a(new fdv0(SummaryAnalytics$SummaryCollapseReasonV2.ChevronDownTap), suspendLambda);
                    }
                    if (jl40.l(u0sVar, s0s.a)) {
                        return pev0Var.a(new gdv0(SummaryExpandReason.OPTIONS_TAP), suspendLambda);
                    }
                    w511.b();
                    return null;
                }
                q0s q0sVar = (q0s) u0sVar;
                q0sVar.a.invoke(Boolean.valueOf(q0sVar.b));
            }
        }
        return zy11.a;
    }
}
