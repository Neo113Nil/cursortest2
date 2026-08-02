package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.j0;
import com.yandex.passport.internal.ui.challenge.delete.l1;
import com.yandex.passport.sloth.d1;
import com.yandex.passport.sloth.data.m0;
import defpackage.bfu;
import defpackage.cg6;
import defpackage.gld;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.o6c;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.r2f;
import defpackage.t75;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class t extends bfu implements mm6 {
    public final x0q k = y0q.b(1, 0, null, 6);
    public final x0q l = y0q.b(1, 0, null, 6);
    public final x0q m = y0q.b(0, 0, null, 7);

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j0 j0Var, com.yandex.passport.internal.l lVar, cg6 cg6Var) {
        s sVar;
        int i;
        d1 a;
        r2f r2fVar;
        if (cg6Var instanceof s) {
            sVar = (s) cg6Var;
            int i2 = sVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.m = i2 - Integer.MIN_VALUE;
                Object obj = sVar.k;
                nm6 nm6Var = nm6.a;
                i = sVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    PassportProcessGlobalComponent a2 = com.yandex.passport.internal.di.a.a();
                    com.yandex.passport.sloth.data.m mVar = new com.yandex.passport.sloth.data.m(new m0(com.yandex.plus.core.network.api.utils.a.S(j0Var.a), j0Var.d, lVar != null ? lVar.b : null, lVar != null ? new Long(lVar.h()) : null), com.yandex.plus.core.network.api.utils.a.L(j0Var.b), new com.yandex.passport.common.properties.a(15, false, false), 4);
                    com.yandex.passport.internal.flags.experiments.p pVar = new com.yandex.passport.internal.flags.experiments.p(5);
                    pVar.b = mVar;
                    pVar.c = new com.yandex.passport.sloth.dependencies.g(t75.c(a2.getSlothUserMenuPerformConfiguration().a));
                    pVar.d = a2.getSlothDependenciesFactory().a();
                    a = pVar.t().a();
                    x97.y(gld.e(sVar.getContext()), null, null, new r(a2.getUserMenuEventSender().a, continuation, this, 0), 3);
                    CoroutineContext context = sVar.getContext();
                    sVar.j = a;
                    sVar.m = 1;
                    if (a.b(context, sVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = sVar.j;
                    qgg.h0(obj);
                }
                x97.y(gld.e(sVar.getContext()), null, null, new r(a.c.d, continuation, this, 1), 3);
                x97.y(gld.e(sVar.getContext()), null, null, new r(a.c.e, continuation, this, 2), 3);
                r2fVar = (r2f) sVar.getContext().get(o6c.l);
                if (r2fVar != null) {
                    r2fVar.R(new l1(a, 1));
                }
                return a.j;
            }
        }
        sVar = new s(this, cg6Var);
        Object obj2 = sVar.k;
        nm6 nm6Var2 = nm6.a;
        i = sVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        x97.y(gld.e(sVar.getContext()), null, null, new r(a.c.d, continuation2, this, 1), 3);
        x97.y(gld.e(sVar.getContext()), null, null, new r(a.c.e, continuation2, this, 2), 3);
        r2fVar = (r2f) sVar.getContext().get(o6c.l);
        if (r2fVar != null) {
        }
        return a.j;
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return ot0.F(this).a;
    }
}
