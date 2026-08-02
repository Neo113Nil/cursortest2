package ru.yandex.taxi.address;

import defpackage.csz;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.jy60;
import defpackage.l2z;
import defpackage.mdh;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes9.dex */
public final class d implements jy60 {
    public final tse a;
    public final tt2 b;
    public final h3y c;
    public final i3y d = kotlin.a.a(new csz(16, this));
    public final i3y e;

    public d(rqo rqoVar, tse tseVar, tt2 tt2Var, h3y h3yVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = h3yVar;
        this.e = kotlin.a.a(new l2z(5, rqoVar, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "NewbiesRedesignExperimentCollector";
    }

    @Override // defpackage.jy60
    public final void h() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, mdh.b, null, new NewbiesRedesignExperimentCollector$onFirstContentfulPaint$1(this, null), 2);
    }
}
