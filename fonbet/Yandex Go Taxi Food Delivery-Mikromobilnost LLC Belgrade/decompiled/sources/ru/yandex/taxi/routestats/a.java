package ru.yandex.taxi.routestats;

import com.yandex.go.coroutines.b;
import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.dbl0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import ru.yandex.taxi.experiments.p;
import ru.yandex.taxi.experiments.r;

/* loaded from: classes9.dex */
public final class a extends r {
    public final tt2 b;
    public final hit c;

    public a(tt2 tt2Var, p pVar, hit hitVar) {
        super(pVar);
        this.b = tt2Var;
        this.c = hitVar;
    }

    @Override // defpackage.w1b0
    public final ExperimentSource getSource() {
        return ExperimentSource.ROUTESTATS;
    }

    public final void m(dbl0 dbl0Var) {
        hbp0 hbp0Var = this.c.a;
        this.b.getClass();
        sjh sjhVar = uyj.a;
        b.g(hbp0Var, mdh.b, null, new RouteStatsExperiments$handleRouteStatsResponse$1(this, dbl0Var, null), 2);
    }
}
