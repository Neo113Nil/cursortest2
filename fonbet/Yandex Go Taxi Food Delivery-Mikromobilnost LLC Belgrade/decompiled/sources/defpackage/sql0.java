package defpackage;

import android.content.Context;
import com.yandex.go.safety.center.analytics.a;
import com.yandex.go.safety.center.contacts.SafetyCenterAddContactView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;

/* loaded from: classes13.dex */
public final class sql0 extends n95 {
    public final hrl0 F;
    public final opl0 G;
    public final npl0 H;
    public final w030 I;
    public final boolean J = true;

    public sql0(hrl0 hrl0Var, opl0 opl0Var, npl0 npl0Var, w030 w030Var) {
        this.F = hrl0Var;
        this.G = opl0Var;
        this.H = npl0Var;
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
        aye0 aye0Var = new aye0(24, this);
        ho9 ho9Var = this.H.a;
        mpl0 mpl0Var = new mpl0((j) ho9Var.a.get(), this.F, aye0Var, (a) ho9Var.b.get(), (itl0) ho9Var.c.get(), (q3u0) ho9Var.d.get());
        fcj0 fcj0Var = this.G.a;
        return new SafetyCenterAddContactView((Context) ((xvf0) fcj0Var.a).get(), mpl0Var, (SafetyCenterExperiment) ((xvf0) fcj0Var.b).get(), (ibq0) ((xvf0) fcj0Var.c).get(), (rv70) ((xvf0) fcj0Var.d).get(), (hbq0) ((m7q0) fcj0Var.e).get());
    }
}
