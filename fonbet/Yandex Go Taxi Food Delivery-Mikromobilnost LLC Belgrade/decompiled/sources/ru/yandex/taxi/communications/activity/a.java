package ru.yandex.taxi.communications.activity;

import defpackage.h3y;
import defpackage.jqr;
import defpackage.lz60;
import defpackage.osf0;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.jobs.b;
import ru.yandex.taxi.jobs.push.g;
import ru.yandex.taxi.jobs.push.j;
import ru.yandex.taxi.launch.c;

/* loaded from: classes9.dex */
public final class a implements lz60 {
    public final c a;
    public final b b;
    public final tse c;
    public final tt2 d;
    public final osf0 e;
    public final h3y f;

    public a(c cVar, b bVar, tse tseVar, tt2 tt2Var, osf0 osf0Var, h3y h3yVar) {
        this.a = cVar;
        this.b = bVar;
        this.c = tseVar;
        this.d = tt2Var;
        this.e = osf0Var;
        this.f = h3yVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        j jVar = (j) this.e;
        jVar.getClass();
        jqr jqrVar = new jqr(new g(d.b(jVar), jVar), new PromotionsLifecycleListener$onLargestContentfulPaint$1(this, null), 3);
        this.d.getClass();
        com.yandex.go.coroutines.b.h(this.c, e.F(jqrVar, uyj.a));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PromotionsLifecycleListener";
    }
}
