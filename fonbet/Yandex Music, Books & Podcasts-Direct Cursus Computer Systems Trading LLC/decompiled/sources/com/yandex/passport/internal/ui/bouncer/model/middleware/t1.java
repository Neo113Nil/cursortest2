package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;
import defpackage.gld;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xz0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class t1 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.ui.bouncer.model.sloth.b a;
    public final com.yandex.passport.internal.ui.bouncer.model.x0 b;

    public t1(com.yandex.passport.internal.ui.bouncer.model.sloth.b bVar, com.yandex.passport.internal.ui.bouncer.model.x0 x0Var) {
        bVar.getClass();
        x0Var.getClass();
        this.a = bVar;
        this.b = x0Var;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final pjc a(x0q x0qVar) {
        x0qVar.getClass();
        return new com.yandex.passport.common.mvi.d(new com.yandex.passport.internal.t(x0qVar, 21), this, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.sloth.data.m mVar, cg6 cg6Var) {
        s1 s1Var;
        int i;
        com.yandex.passport.sloth.data.m mVar2;
        com.yandex.passport.sloth.d1 d1Var;
        if (cg6Var instanceof s1) {
            s1Var = (s1) cg6Var;
            int i2 = s1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s1Var.n = i2 - Integer.MIN_VALUE;
                Object obj = s1Var.l;
                nm6 nm6Var = nm6.a;
                i = s1Var.n;
                int i3 = 0;
                int i4 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.ui.bouncer.model.sloth.b bVar = this.a;
                    bVar.getClass();
                    mVar.getClass();
                    com.yandex.passport.internal.flags.experiments.p pVar = new com.yandex.passport.internal.flags.experiments.p(5);
                    pVar.b = mVar;
                    pVar.c = new com.yandex.passport.sloth.dependencies.g(xz0.X(new com.yandex.passport.sloth.dependencies.f[]{bVar.b.a}));
                    pVar.d = bVar.a.a();
                    com.yandex.passport.sloth.d1 a = pVar.t().a();
                    CoroutineContext context = s1Var.getContext();
                    s1Var.j = mVar;
                    s1Var.k = a;
                    s1Var.n = 1;
                    if (a.b(context, s1Var) == nm6Var) {
                        return nm6Var;
                    }
                    mVar2 = mVar;
                    d1Var = a;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d1Var = s1Var.k;
                    mVar2 = s1Var.j;
                    qgg.h0(obj);
                }
                com.yandex.passport.sloth.v vVar = d1Var.c;
                com.yandex.passport.sloth.c1 c1Var = d1Var.j;
                x97.y(gld.e(s1Var.getContext()), null, null, new r1(vVar.d, continuation, this, i3), 3);
                x97.y(gld.e(s1Var.getContext()), null, null, new r1(d1Var.c.e, continuation, this, i4), 3);
                x97.y(gld.e(s1Var.getContext()), null, null, new r1(c1Var.b(), continuation, this, 2), 3);
                return new com.yandex.passport.internal.ui.bouncer.model.e0(new com.yandex.passport.internal.ui.bouncer.model.s1(mVar2, c1Var));
            }
        }
        s1Var = new s1(this, cg6Var);
        Object obj2 = s1Var.l;
        nm6 nm6Var2 = nm6.a;
        i = s1Var.n;
        int i32 = 0;
        int i42 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        com.yandex.passport.sloth.v vVar2 = d1Var.c;
        com.yandex.passport.sloth.c1 c1Var2 = d1Var.j;
        x97.y(gld.e(s1Var.getContext()), null, null, new r1(vVar2.d, continuation2, this, i32), 3);
        x97.y(gld.e(s1Var.getContext()), null, null, new r1(d1Var.c.e, continuation2, this, i42), 3);
        x97.y(gld.e(s1Var.getContext()), null, null, new r1(c1Var2.b(), continuation2, this, 2), 3);
        return new com.yandex.passport.internal.ui.bouncer.model.e0(new com.yandex.passport.internal.ui.bouncer.model.s1(mVar2, c1Var2));
    }
}
