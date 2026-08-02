package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.internal.usecase.f2;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class g1 implements com.yandex.passport.common.mvi.e {
    public final f2 a;

    public g1(f2 f2Var) {
        f2Var.getClass();
        this.a = f2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g1 g1Var, com.yandex.passport.internal.l lVar, cg6 cg6Var) {
        f1 f1Var;
        int i;
        if (cg6Var instanceof f1) {
            f1Var = (f1) cg6Var;
            int i2 = f1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = f1Var.j;
                nm6 nm6Var = nm6.a;
                i = f1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    f2 f2Var = g1Var.a;
                    com.yandex.passport.common.core.f fVar = lVar.b;
                    f1Var.l = 1;
                    obj = f2Var.g(fVar, f1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        f1Var = new f1(g1Var, cg6Var);
        Object obj2 = f1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = f1Var.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final pjc a(x0q x0qVar) {
        x0qVar.getClass();
        return new com.yandex.passport.common.mvi.d(new com.yandex.passport.internal.t(x0qVar, 18), this, 9);
    }
}
