package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.gf;
import com.yandex.passport.sloth.d1;
import defpackage.bfu;
import defpackage.cg6;
import defpackage.gld;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 extends bfu implements mm6 {
    public d1 l;
    public final gf k = new gf();
    public final x0q m = y0q.b(1, 0, null, 6);
    public final x0q n = y0q.b(1, 0, null, 6);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.sloth.data.m mVar, cg6 cg6Var) {
        m0 m0Var;
        int i;
        d1 d1Var;
        if (cg6Var instanceof m0) {
            m0Var = (m0) cg6Var;
            int i2 = m0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = m0Var.j;
                nm6 nm6Var = nm6.a;
                i = m0Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
                    com.yandex.passport.internal.flags.experiments.p pVar = new com.yandex.passport.internal.flags.experiments.p(5);
                    mVar.getClass();
                    pVar.b = mVar;
                    pVar.c = a.getSlothStandalonePerformConfiguration().a();
                    pVar.d = a.getSlothDependenciesFactory().a();
                    d1 a2 = pVar.t().a();
                    this.l = a2;
                    if (a2 == null) {
                        Intrinsics.j("session");
                        throw null;
                    }
                    CoroutineContext context = m0Var.getContext();
                    m0Var.l = 1;
                    if (a2.b(context, m0Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                d1Var = this.l;
                if (d1Var != null) {
                    Intrinsics.j("session");
                    throw null;
                }
                x97.y(gld.e(m0Var.getContext()), null, null, new l0(d1Var.c.d, continuation, this, 0), 3);
                d1 d1Var2 = this.l;
                if (d1Var2 == null) {
                    Intrinsics.j("session");
                    throw null;
                }
                x97.y(gld.e(m0Var.getContext()), null, null, new l0(d1Var2.c.e, continuation, this, 1), 3);
                d1 d1Var3 = this.l;
                if (d1Var3 == null) {
                    Intrinsics.j("session");
                    throw null;
                }
                x97.y(gld.e(m0Var.getContext()), null, null, new l0(d1Var3.j.b(), continuation, this, 2), 3);
                d1 d1Var4 = this.l;
                if (d1Var4 != null) {
                    return d1Var4.j;
                }
                Intrinsics.j("session");
                throw null;
            }
        }
        m0Var = new m0(this, cg6Var);
        Object obj2 = m0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = m0Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        d1Var = this.l;
        if (d1Var != null) {
        }
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return ot0.F(this).a;
    }
}
