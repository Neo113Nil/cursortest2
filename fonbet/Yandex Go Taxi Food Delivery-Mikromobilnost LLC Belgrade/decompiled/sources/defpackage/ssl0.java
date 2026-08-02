package defpackage;

import android.content.Context;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.instructions.SafetyCenterInstructionsView;
import com.yandex.go.safety.center.instructions.a;

/* loaded from: classes13.dex */
public final class ssl0 extends n95 {
    public final hrl0 F;
    public final osl0 G;
    public final jsl0 H;
    public final dsl0 I;
    public final w030 J;
    public final boolean K = true;

    public ssl0(hrl0 hrl0Var, osl0 osl0Var, jsl0 jsl0Var, dsl0 dsl0Var, w030 w030Var) {
        this.F = hrl0Var;
        this.G = osl0Var;
        this.H = jsl0Var;
        this.I = dsl0Var;
        this.J = w030Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.J;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.K;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        psl0 psl0Var = new psl0(this);
        ho9 ho9Var = this.G.a;
        a aVar = new a(psl0Var, (com.yandex.go.safety.center.analytics.a) ho9Var.a.get(), this.F, (k7x0) ho9Var.b.get(), (pwy0) ho9Var.c.get(), (SafetyCenterExperiment) ho9Var.d.get());
        vx0 vx0Var = this.H.a;
        return new SafetyCenterInstructionsView((Context) vx0Var.a.get(), aVar, (pav) vx0Var.b.get(), (SafetyCenterExperiment) vx0Var.c.get());
    }
}
