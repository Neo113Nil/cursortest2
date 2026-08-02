package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.internal.report.reporters.r1;
import com.yandex.passport.internal.usecase.e2;
import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;

/* loaded from: classes4.dex */
public final class g1 implements gfu {
    public final l0 a;
    public final a b;
    public final com.yandex.passport.internal.push.m c;
    public final com.yandex.passport.internal.sloth.performers.webcard.g d;
    public final r1 e;
    public final e2 f;

    public g1(l0 l0Var, a aVar, com.yandex.passport.internal.push.m mVar, com.yandex.passport.internal.sloth.performers.webcard.g gVar, r1 r1Var, e2 e2Var) {
        l0Var.getClass();
        aVar.getClass();
        mVar.getClass();
        gVar.getClass();
        r1Var.getClass();
        e2Var.getClass();
        this.a = l0Var;
        this.b = aVar;
        this.c = mVar;
        this.d = gVar;
        this.e = r1Var;
        this.f = e2Var;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        return b(cls);
    }
}
