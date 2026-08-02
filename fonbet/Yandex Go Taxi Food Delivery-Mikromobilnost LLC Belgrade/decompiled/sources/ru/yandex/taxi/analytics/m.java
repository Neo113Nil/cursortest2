package ru.yandex.taxi.analytics;

import androidx.lifecycle.Lifecycle;
import defpackage.tje;
import defpackage.tse;
import defpackage.xzq0;
import defpackage.zz2;
import java.util.LinkedHashSet;

/* loaded from: classes9.dex */
public final class m {
    public final ru.yandex.taxi.perf.b a;
    public final xzq0 b;
    public final zz2 c;
    public final Lifecycle d;
    public final LinkedHashSet e = new LinkedHashSet();
    public boolean f;

    public m(ru.yandex.taxi.perf.b bVar, xzq0 xzq0Var, zz2 zz2Var, Lifecycle lifecycle, tse tseVar) {
        this.a = bVar;
        this.b = xzq0Var;
        this.c = zz2Var;
        this.d = lifecycle;
        tje.N(tseVar, null, null, new FirstTapOnScreenAnalytics$1(this, null), 3);
    }
}
