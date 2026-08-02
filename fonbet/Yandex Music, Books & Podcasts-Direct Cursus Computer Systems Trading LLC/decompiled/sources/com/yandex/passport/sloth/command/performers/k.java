package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.y0;
import defpackage.cg6;
import defpackage.l2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class k implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.v a;

    public k(com.yandex.passport.sloth.v vVar) {
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
    public final Object n(com.yandex.passport.sloth.command.data.l lVar, cg6 cg6Var) {
        j jVar;
        int i;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jVar.j;
                nm6 nm6Var = nm6.a;
                i = jVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    y0 y0Var = new y0(lVar.a, lVar.b);
                    jVar.l = 1;
                    if (this.a.d(y0Var, jVar) == nm6Var) {
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
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jVar.l;
        if (i != 0) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }
}
