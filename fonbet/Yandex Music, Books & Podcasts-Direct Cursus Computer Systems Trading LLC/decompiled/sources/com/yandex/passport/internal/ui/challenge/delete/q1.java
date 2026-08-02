package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.b6;
import defpackage.bsh;
import defpackage.cg6;
import defpackage.gld;
import defpackage.nm6;
import defpackage.o6c;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.r2f;
import defpackage.x97;
import defpackage.xq0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class q1 extends com.yandex.passport.internal.ui.challenge.b0 {
    public h1 l;
    public final PassportProcessGlobalComponent m;
    public final com.yandex.passport.internal.report.reporters.o1 n;

    public q1() {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.m = a;
        this.n = a.getWebAmReporter();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(com.yandex.passport.internal.properties.r rVar, long j, cg6 cg6Var) {
        p1 p1Var;
        int i;
        com.yandex.passport.sloth.d1 a;
        r2f r2fVar;
        if (cg6Var instanceof p1) {
            p1Var = (p1) cg6Var;
            int i2 = p1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = p1Var.k;
                nm6 nm6Var = nm6.a;
                i = p1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.data.m mVar = new com.yandex.passport.sloth.data.m(new com.yandex.passport.sloth.data.t(j, com.yandex.plus.pay.ui.core.b.L(rVar.a), com.yandex.plus.core.network.api.utils.a.S(rVar.c)), com.yandex.plus.pay.ui.core.b.L(rVar.a).a, new com.yandex.passport.common.properties.a(15, false, false), 4);
                    com.yandex.passport.internal.flags.experiments.p pVar = new com.yandex.passport.internal.flags.experiments.p(5);
                    pVar.b = mVar;
                    PassportProcessGlobalComponent passportProcessGlobalComponent = this.m;
                    pVar.c = passportProcessGlobalComponent.getSlothStandalonePerformConfiguration().a();
                    pVar.d = passportProcessGlobalComponent.getSlothDependenciesFactory().a();
                    a = pVar.t().a();
                    CoroutineContext context = p1Var.getContext();
                    p1Var.j = a;
                    p1Var.m = 1;
                    if (a.b(context, p1Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = p1Var.j;
                    qgg.h0(obj);
                }
                com.yandex.passport.sloth.c1 c1Var = a.j;
                com.yandex.passport.sloth.v vVar = a.c;
                Continuation continuation = null;
                x97.y(gld.e(p1Var.getContext()), null, null, new o1(c1Var.b(), continuation, this, 0), 3);
                x97.y(gld.e(p1Var.getContext()), null, null, new o1(vVar.e, continuation, this, 1), 3);
                x97.y(gld.e(p1Var.getContext()), null, null, new o1(vVar.d, continuation, this, 2), 3);
                r2fVar = (r2f) p1Var.getContext().get(o6c.l);
                if (r2fVar != null) {
                    r2fVar.R(new l1(a, 0));
                }
                return a.j;
            }
        }
        p1Var = new p1(this, cg6Var);
        Object obj2 = p1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = p1Var.m;
        if (i != 0) {
        }
        com.yandex.passport.sloth.c1 c1Var2 = a.j;
        com.yandex.passport.sloth.v vVar2 = a.c;
        Continuation continuation2 = null;
        x97.y(gld.e(p1Var.getContext()), null, null, new o1(c1Var2.b(), continuation2, this, 0), 3);
        x97.y(gld.e(p1Var.getContext()), null, null, new o1(vVar2.e, continuation2, this, 1), 3);
        x97.y(gld.e(p1Var.getContext()), null, null, new o1(vVar2.d, continuation2, this, 2), 3);
        r2fVar = (r2f) p1Var.getContext().get(o6c.l);
        if (r2fVar != null) {
        }
        return a.j;
    }

    public final void H(u0 u0Var) {
        x97.y(ot0.F(this), null, null, new com.yandex.passport.internal.provider.communication.c(this, u0Var, (Continuation) null, 18), 3);
    }

    @Override // com.yandex.passport.internal.ui.challenge.b0
    public final bsh a(b6 b6Var) {
        com.yandex.passport.internal.ui.challenge.o oVar = (com.yandex.passport.internal.ui.challenge.o) b6Var;
        oVar.getClass();
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.m;
        com.yandex.passport.internal.l e = passportProcessGlobalComponent.getAccountsRetriever().a().e(oVar.d);
        Object obj = passportProcessGlobalComponent.createDeleteForever().challengeData(oVar).isChallengeNeeded(e != null ? e.o() : true).viewModel(this).build().getSessionProvider().get();
        obj.getClass();
        h1 h1Var = (h1) obj;
        this.l = h1Var;
        return h1Var;
    }
}
