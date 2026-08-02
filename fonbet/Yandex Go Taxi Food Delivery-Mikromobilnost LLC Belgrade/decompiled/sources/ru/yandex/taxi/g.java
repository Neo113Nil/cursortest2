package ru.yandex.taxi;

import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.u6r;
import defpackage.uyj;
import ru.yandex.taxi.experiments.p;
import ru.yandex.taxi.experiments.r;

/* loaded from: classes9.dex */
public final class g extends r {
    public final tt2 b;
    public final hit c;

    public g(tt2 tt2Var, p pVar, hit hitVar) {
        super(pVar);
        this.b = tt2Var;
        this.c = hitVar;
    }

    @Override // defpackage.w1b0
    public final ExperimentSource getSource() {
        return ExperimentSource.FINAL_SUGGEST;
    }

    public final void m(u6r u6rVar) {
        hbp0 hbp0Var = this.c.a;
        this.b.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(hbp0Var, mdh.b, null, new PinDropExperiments$handleFinalSuggestResponse$1(this, u6rVar, null), 2);
    }
}
