package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.command.data.g1;
import defpackage.cg6;
import defpackage.l2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class g0 implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.v a;

    public g0(com.yandex.passport.sloth.v vVar) {
        vVar.getClass();
        this.a = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.r
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(g1 g1Var, cg6 cg6Var) {
        f0 f0Var;
        int i;
        if (cg6Var instanceof f0) {
            f0Var = (f0) cg6Var;
            int i2 = f0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.j;
                nm6 nm6Var = nm6.a;
                i = f0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.g0 g0Var = new com.yandex.passport.sloth.g0(g1Var.a);
                    f0Var.l = 1;
                    if (this.a.c(g0Var, f0Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new l2b(com.yandex.passport.sloth.command.v.c);
            }
        }
        f0Var = new f0(this, cg6Var);
        Object obj2 = f0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = f0Var.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }
}
