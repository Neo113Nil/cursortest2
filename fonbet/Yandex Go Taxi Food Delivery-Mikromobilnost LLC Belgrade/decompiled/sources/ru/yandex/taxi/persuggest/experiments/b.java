package ru.yandex.taxi.persuggest.experiments;

import defpackage.jbh;
import defpackage.jsq0;
import defpackage.qqo;
import defpackage.rqo;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class b {
    public final rqo a;

    public b(rqo rqoVar) {
        this.a = rqoVar;
    }

    public final qqo a() {
        SuggestHeuristicsExperiment.Companion.getClass();
        return ((jbh) this.a).c(SuggestHeuristicsExperiment.f);
    }

    public final boolean b(RoutePointType routePointType) {
        jsq0 jsq0Var;
        return ((SuggestHeuristicsExperiment) a().b()).b && (jsq0Var = ((SuggestHeuristicsExperiment) a().b()).d) != null && jsq0Var.contains(routePointType);
    }
}
