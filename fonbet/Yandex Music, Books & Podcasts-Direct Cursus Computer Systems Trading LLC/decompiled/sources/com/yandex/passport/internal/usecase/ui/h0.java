package com.yandex.passport.internal.usecase.ui;

import defpackage.c5b;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import java.util.List;

/* loaded from: classes4.dex */
public final class h0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.internal.filter.l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.filter.l lVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).e);
        aVar.getClass();
        eVar.getClass();
        lVar.getClass();
        this.b = eVar;
        this.c = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(f0 f0Var, cg6 cg6Var) {
        g0 g0Var;
        int i;
        List list;
        com.yandex.passport.internal.d dVar;
        com.yandex.passport.internal.d dVar2;
        com.yandex.passport.internal.core.accounts.e eVar = this.b;
        if (cg6Var instanceof g0) {
            g0Var = (g0) cg6Var;
            int i2 = g0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = g0Var.k;
                nm6 nm6Var = nm6.a;
                i = g0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        dVar = eVar.a();
                        list = dVar.g();
                    } catch (SecurityException e) {
                        com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "SecurityException", e);
                        }
                        List list2 = c5b.a;
                        com.yandex.passport.internal.d dVar4 = new com.yandex.passport.internal.d(list2, eVar.a.h);
                        list = list2;
                        dVar = dVar4;
                    }
                    com.yandex.passport.internal.entities.k kVar = f0Var.a;
                    g0Var.j = dVar;
                    g0Var.m = 1;
                    Object c = this.c.c(list, kVar, g0Var);
                    if (c == nm6Var) {
                        return nm6Var;
                    }
                    com.yandex.passport.internal.d dVar5 = dVar;
                    obj = c;
                    dVar2 = dVar5;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar2 = g0Var.j;
                    qgg.h0(obj);
                }
                return new e0(dVar2, new com.yandex.passport.internal.account.e((List) obj));
            }
        }
        g0Var = new g0(this, cg6Var);
        Object obj2 = g0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = g0Var.m;
        if (i != 0) {
        }
        return new e0(dVar2, new com.yandex.passport.internal.account.e((List) obj2));
    }
}
