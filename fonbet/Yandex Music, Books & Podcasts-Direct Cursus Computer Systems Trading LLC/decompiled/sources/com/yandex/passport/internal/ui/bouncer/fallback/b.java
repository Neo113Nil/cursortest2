package com.yandex.passport.internal.ui.bouncer.fallback;

import com.yandex.passport.internal.report.reporters.m;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.s;
import defpackage.cg6;
import defpackage.ei;
import defpackage.fft;
import defpackage.gi;
import defpackage.gld;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t13;
import defpackage.vh;
import defpackage.vrq;
import defpackage.xq0;
import defpackage.y2x;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b extends t13 {
    public final s l;
    public final m m;
    public p1 n;
    public final String o;
    public final vrq p;
    public final ei q;

    public b(BouncerActivity bouncerActivity, s sVar, m mVar) {
        bouncerActivity.getClass();
        sVar.getClass();
        mVar.getClass();
        this.l = sVar;
        this.m = mVar;
        this.o = "FallbackSlab";
        this.p = new vrq(bouncerActivity, 1);
        this.q = (ei) registerForActivityResult(new vh(17), new gi(14, this));
    }

    @Override // defpackage.orq
    public final String g() {
        return this.o;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.t13
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(p1 p1Var, cg6 cg6Var) {
        a aVar;
        int i;
        p1 p1Var2 = p1Var;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aVar.k;
                nm6 nm6Var = nm6.a;
                i = aVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "performBind: " + p1Var2, 8);
                    }
                    this.n = p1Var2;
                    long b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, 120L);
                    aVar.j = p1Var2;
                    aVar.m = 1;
                    if (y2x.o(b, aVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p1Var2 = aVar.j;
                    qgg.h0(obj);
                }
                if (this.c.e && gld.T(gld.e(aVar.getContext()))) {
                    this.m.u(p1Var2);
                    this.q.a(p1Var2);
                }
                return Unit.a;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aVar.m;
        if (i != 0) {
        }
        if (this.c.e) {
            this.m.u(p1Var2);
            this.q.a(p1Var2);
        }
        return Unit.a;
    }
}
