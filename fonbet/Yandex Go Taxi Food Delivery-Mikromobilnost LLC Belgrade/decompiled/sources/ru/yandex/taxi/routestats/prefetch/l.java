package ru.yandex.taxi.routestats.prefetch;

import defpackage.c900;
import defpackage.jy60;
import defpackage.mdh;
import defpackage.nbl0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class l implements jy60 {
    public final tse a;
    public final tt2 b;
    public final c900 c;
    public final com.yandex.go.taxi.tariffs.internal.routestats.factory.a d;
    public final m e;
    public final nbl0 f;
    public final AtomicBoolean g = new AtomicBoolean(true);

    public l(tse tseVar, tt2 tt2Var, c900 c900Var, com.yandex.go.taxi.tariffs.internal.routestats.factory.a aVar, m mVar, nbl0 nbl0Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = c900Var;
        this.d = aVar;
        this.e = mVar;
        this.f = nbl0Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "RouteStatsPrefetchListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(this.a, mdh.b, null, new RouteStatsPrefetchListener$onFirstContentfulPaint$1(this, null), 2);
    }
}
