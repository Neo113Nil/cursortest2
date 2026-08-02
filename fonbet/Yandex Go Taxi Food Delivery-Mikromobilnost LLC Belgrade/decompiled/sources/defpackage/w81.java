package defpackage;

import com.yandex.go.route.interactor.c;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryAction;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes14.dex */
public final class w81 {
    public final c a;
    public final bdv0 b;
    public final biv0 c;
    public final wiq0 d;
    public final xcv0 e;

    public w81(c cVar, bdv0 bdv0Var, biv0 biv0Var, wiq0 wiq0Var, xcv0 xcv0Var) {
        this.a = cVar;
        this.b = bdv0Var;
        this.c = biv0Var;
        this.d = wiq0Var;
        this.e = xcv0Var;
    }

    public final void a(v81 v81Var, oiv0 oiv0Var) {
        boolean z = v81Var instanceof u81;
        bdv0 bdv0Var = this.b;
        if (z) {
            SummaryAnalytics$SummaryExpandingState summaryAnalytics$SummaryExpandingState = SummaryAnalytics$SummaryExpandingState.Collapsed;
            bdv0Var.a.e(summaryAnalytics$SummaryExpandingState, bdv0Var.a(summaryAnalytics$SummaryExpandingState));
            oiv0Var.r();
            return;
        }
        boolean z2 = v81Var instanceof s81;
        xcv0 xcv0Var = this.e;
        biv0 biv0Var = this.c;
        if (z2) {
            if (this.a.c().b.size() > 1) {
                xcv0Var.d(qib1.d(biv0Var));
                oiv0Var.h();
                return;
            } else {
                SummaryAnalytics$SummaryExpandingState d = qib1.d(biv0Var);
                bdv0Var.a.c(d, bdv0Var.a(d), SummaryAnalytics$SummaryAction.AddressSuggest);
                oiv0Var.j();
                return;
            }
        }
        if (jl40.l(v81Var, r81.a)) {
            xcv0Var.a(qib1.d(biv0Var), ((k) this.d).h());
            oiv0Var.i();
        } else if (jl40.l(v81Var, t81.a)) {
            oiv0Var.m();
        } else {
            w511.b();
        }
    }
}
