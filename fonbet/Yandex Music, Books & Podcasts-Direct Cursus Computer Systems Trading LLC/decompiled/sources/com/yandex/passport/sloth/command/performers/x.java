package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.command.data.n0;
import defpackage.cg6;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class x implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.v a;

    public x(com.yandex.passport.sloth.v vVar) {
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
    public final Object n(n0 n0Var, cg6 cg6Var) {
        w wVar;
        int i;
        if (cg6Var instanceof w) {
            wVar = (w) cg6Var;
            int i2 = wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wVar.j;
                nm6 nm6Var = nm6.a;
                i = wVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = n0Var.a;
                    if (str == null) {
                        com.yandex.passport.sloth.command.d dVar = new com.yandex.passport.sloth.command.d("samlSsoUrl_missing");
                        return dVar instanceof com.yandex.passport.sloth.command.s ? new l2b(dVar) : new m2b(dVar);
                    }
                    com.yandex.passport.sloth.d0 d0Var = new com.yandex.passport.sloth.d0(str);
                    wVar.l = 1;
                    if (this.a.c(d0Var, wVar) == nm6Var) {
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
        wVar = new w(this, cg6Var);
        Object obj2 = wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = wVar.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }
}
