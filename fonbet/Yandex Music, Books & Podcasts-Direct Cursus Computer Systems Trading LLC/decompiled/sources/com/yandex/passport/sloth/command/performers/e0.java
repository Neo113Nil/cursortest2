package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.command.data.d1;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.r0;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class e0 implements com.yandex.passport.sloth.command.r {
    public final a1 a;
    public final com.yandex.passport.sloth.v b;

    public e0(com.yandex.passport.sloth.v vVar, a1 a1Var) {
        a1Var.getClass();
        vVar.getClass();
        this.a = a1Var;
        this.b = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.sloth.command.r
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(d1 d1Var, cg6 cg6Var) {
        d0 d0Var;
        int i;
        if (cg6Var instanceof d0) {
            d0Var = (d0) cg6Var;
            int i2 = d0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = d0Var.j;
                nm6 nm6Var = nm6.a;
                i = d0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = d1Var.a;
                    if (str == null) {
                        com.yandex.passport.sloth.command.d dVar = com.yandex.passport.sloth.command.d.g;
                        return dVar instanceof com.yandex.passport.sloth.command.s ? new l2b(dVar) : new m2b(dVar);
                    }
                    this.a.a(new n0(16, r0.SOCIAL_AUTH_STARTED, dfi.n("socialConfiguration", str)));
                    com.yandex.passport.sloth.f0 f0Var = new com.yandex.passport.sloth.f0(str);
                    d0Var.l = 1;
                    if (this.b.c(f0Var, d0Var) == nm6Var) {
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
        d0Var = new d0(this, cg6Var);
        Object obj2 = d0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = d0Var.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }
}
