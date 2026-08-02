package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.challenge.delete.l1;
import com.yandex.passport.sloth.d1;
import com.yandex.passport.sloth.data.o0;
import defpackage.bfu;
import defpackage.cg6;
import defpackage.gld;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.o6c;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.r2f;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class t extends bfu implements mm6 {
    public final x0q k = y0q.b(0, 0, null, 7);

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.sloth.data.m mVar, cg6 cg6Var) {
        s sVar;
        int i;
        com.yandex.passport.sloth.data.c0 c0Var;
        d1 a;
        PassportProcessGlobalComponent passportProcessGlobalComponent;
        r2f r2fVar;
        if (cg6Var instanceof s) {
            sVar = (s) cg6Var;
            int i2 = sVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.o = i2 - Integer.MIN_VALUE;
                Object obj = sVar.m;
                nm6 nm6Var = nm6.a;
                i = sVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    o0 o0Var = mVar.a;
                    c0Var = o0Var instanceof com.yandex.passport.sloth.data.c0 ? (com.yandex.passport.sloth.data.c0) o0Var : null;
                    PassportProcessGlobalComponent a2 = com.yandex.passport.internal.di.a.a();
                    com.yandex.passport.internal.flags.experiments.p pVar = new com.yandex.passport.internal.flags.experiments.p(5);
                    pVar.b = mVar;
                    pVar.c = a2.getSlothStandalonePerformConfiguration().a();
                    pVar.d = a2.getSlothDependenciesFactory().a();
                    a = pVar.t().a();
                    CoroutineContext context = sVar.getContext();
                    sVar.j = c0Var;
                    sVar.k = a2;
                    sVar.l = a;
                    sVar.o = 1;
                    if (a.b(context, sVar) == nm6Var) {
                        return nm6Var;
                    }
                    passportProcessGlobalComponent = a2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = sVar.l;
                    PassportProcessGlobalComponent passportProcessGlobalComponent2 = sVar.k;
                    c0Var = sVar.j;
                    qgg.h0(obj);
                    passportProcessGlobalComponent = passportProcessGlobalComponent2;
                }
                com.yandex.passport.sloth.data.c0 c0Var2 = c0Var;
                Continuation continuation = null;
                x97.y(gld.e(sVar.getContext()), null, null, new r(a.c.e, continuation, passportProcessGlobalComponent, c0Var2, this, 0), 3);
                x97.y(gld.e(sVar.getContext()), null, null, new r(a.c.d, continuation, passportProcessGlobalComponent, c0Var2, this, 1), 3);
                r2fVar = (r2f) sVar.getContext().get(o6c.l);
                if (r2fVar != null) {
                    r2fVar.R(new l1(a, 2));
                }
                return a.j;
            }
        }
        sVar = new s(this, cg6Var);
        Object obj2 = sVar.m;
        nm6 nm6Var2 = nm6.a;
        i = sVar.o;
        if (i != 0) {
        }
        com.yandex.passport.sloth.data.c0 c0Var22 = c0Var;
        Continuation continuation2 = null;
        x97.y(gld.e(sVar.getContext()), null, null, new r(a.c.e, continuation2, passportProcessGlobalComponent, c0Var22, this, 0), 3);
        x97.y(gld.e(sVar.getContext()), null, null, new r(a.c.d, continuation2, passportProcessGlobalComponent, c0Var22, this, 1), 3);
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
