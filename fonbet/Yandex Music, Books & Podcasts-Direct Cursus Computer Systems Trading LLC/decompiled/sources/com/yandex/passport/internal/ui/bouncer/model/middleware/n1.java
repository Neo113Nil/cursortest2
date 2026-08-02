package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.xq0;
import java.util.List;

/* loaded from: classes4.dex */
public final class n1 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.usecase.ui.b a;

    public n1(com.yandex.passport.internal.usecase.ui.b bVar) {
        bVar.getClass();
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(n1 n1Var, com.yandex.passport.internal.ui.bouncer.model.b1 b1Var, cg6 cg6Var) {
        m1 m1Var;
        int i;
        if (cg6Var instanceof m1) {
            m1Var = (m1) cg6Var;
            int i2 = m1Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m1Var.m = i2 - Integer.MIN_VALUE;
                Object obj = m1Var.k;
                nm6 nm6Var = nm6.a;
                i = m1Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.ui.b bVar = n1Var.a;
                    com.yandex.passport.internal.usecase.ui.a aVar = new com.yandex.passport.internal.usecase.ui.a(b1Var.b, b1Var.c);
                    m1Var.j = b1Var;
                    m1Var.m = 1;
                    obj = bVar.g(aVar, m1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b1Var = m1Var.j;
                    qgg.h0(obj);
                }
                return new com.yandex.passport.internal.ui.bouncer.model.x(com.yandex.passport.internal.ui.bouncer.model.b1.a(b1Var, null, (List) obj, 61));
            }
        }
        m1Var = new m1(n1Var, cg6Var);
        Object obj2 = m1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = m1Var.m;
        if (i != 0) {
        }
        return new com.yandex.passport.internal.ui.bouncer.model.x(com.yandex.passport.internal.ui.bouncer.model.b1.a(b1Var, null, (List) obj2, 61));
    }

    @Override // com.yandex.passport.common.mvi.e
    public final pjc a(x0q x0qVar) {
        x0qVar.getClass();
        return new com.yandex.passport.common.mvi.d(new com.yandex.passport.internal.t(x0qVar, 20), this, 11);
    }
}
