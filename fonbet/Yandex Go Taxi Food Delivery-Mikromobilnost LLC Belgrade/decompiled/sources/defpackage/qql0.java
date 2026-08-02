package defpackage;

import android.content.Context;
import com.yandex.go.safety.center.api.AccidentsResponse;
import com.yandex.go.safety.center.car.crash.status.SafetyCenterCarCrashStatusAnswerView;
import com.yandex.go.safety.center.car.crash.status.a;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;

/* loaded from: classes13.dex */
public final class qql0 extends o95 {
    public final mql0 F;
    public final lql0 G;
    public final dsl0 H;
    public final w030 I;
    public final boolean J = true;

    public qql0(mql0 mql0Var, lql0 lql0Var, dsl0 dsl0Var, w030 w030Var) {
        this.F = mql0Var;
        this.G = lql0Var;
        this.H = dsl0Var;
        this.I = w030Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.I;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.J;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        AccidentsResponse.Accident accident = (AccidentsResponse.Accident) obj;
        ndl0 ndl0Var = new ndl0(3, this);
        jql0 jql0Var = ((nql0) this.F).a;
        a aVar = new a((SafetyCenterExperiment) jql0Var.a.get(), (tt2) jql0Var.b.get(), ndl0Var, (com.yandex.go.safety.center.analytics.a) jql0Var.c.get(), accident, (j) jql0Var.d.get(), (k7x0) jql0Var.e.get(), (pwy0) jql0Var.f.get());
        vx0 vx0Var = this.G.a;
        return new SafetyCenterCarCrashStatusAnswerView((Context) vx0Var.a.get(), aVar, (yiz0) vx0Var.b.get(), (pav) vx0Var.c.get());
    }
}
