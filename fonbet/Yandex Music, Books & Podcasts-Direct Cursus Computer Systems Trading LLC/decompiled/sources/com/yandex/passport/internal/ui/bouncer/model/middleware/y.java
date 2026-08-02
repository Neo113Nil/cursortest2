package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class y implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.internal.usecase.ui.t b;

    public y(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.usecase.ui.t tVar) {
        eVar.getClass();
        tVar.getClass();
        this.a = eVar;
        this.b = tVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:24|(1:26))(2:27|28))|11|12|(2:14|15)(2:17|18)))|36|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r5 = defpackage.z7o.b;
        r5 = new defpackage.t7o(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        r5 = defpackage.z7o.b;
        r5 = new defpackage.t7o(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(y yVar, com.yandex.passport.internal.ui.bouncer.model.n nVar, cg6 cg6Var) {
        x xVar;
        int i;
        Throwable a;
        if (cg6Var instanceof x) {
            xVar = (x) cg6Var;
            int i2 = xVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xVar.j;
                nm6 nm6Var = nm6.a;
                i = xVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.internal.l e = yVar.a.a().e(nVar.a);
                    if (e == null) {
                        throw new com.yandex.passport.api.exception.a();
                    }
                    com.yandex.passport.internal.usecase.ui.t tVar = yVar.b;
                    xVar.l = 1;
                    if (tVar.g(e, xVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Object obj2 = Unit.a;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj2);
                if (a == null) {
                    return new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.f1(a));
                }
                return new com.yandex.passport.internal.ui.bouncer.model.s(com.yandex.passport.internal.ui.bouncer.model.g1.a);
            }
        }
        xVar = new x(yVar, cg6Var);
        Object obj3 = xVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xVar.l;
        if (i != 0) {
        }
        Object obj22 = Unit.a;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj22);
        if (a == null) {
        }
    }

    @Override // com.yandex.passport.common.mvi.e
    public final pjc a(x0q x0qVar) {
        x0qVar.getClass();
        return new com.yandex.passport.common.mvi.d(new com.yandex.passport.internal.t(x0qVar, 7), this, 5);
    }
}
