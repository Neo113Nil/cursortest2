package ru.yandex.taxi.widgets.data.datasources.fallback;

import defpackage.c551;
import defpackage.g551;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import java.util.Map;

/* loaded from: classes10.dex */
public final class a {
    public final g551 a;

    public a(g551 g551Var) {
        this.a = g551Var;
    }

    public final pzt0 a(tse tseVar, vpr vprVar, Map map, c551 c551Var, boolean z) {
        return tje.N(tseVar, null, null, new TimedFallback$launchTimedFallbackJob$1(c551Var, this, vprVar, map, z, null), 3);
    }
}
