package ru.yandex.taxi.perf.analytics.storage;

import defpackage.jy60;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zbj;

/* loaded from: classes9.dex */
public final class b implements jy60 {
    public final tse a;
    public final tt2 b;
    public final a c;
    public final zbj d;

    public b(tse tseVar, tt2 tt2Var, a aVar, zbj zbjVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = aVar;
        this.d = zbjVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "StorageAnalyticsManager";
    }

    @Override // defpackage.jy60
    public final void h() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, mdh.b, null, new StorageAnalyticsManager$onFirstContentfulPaint$1(this, null), 2);
    }
}
