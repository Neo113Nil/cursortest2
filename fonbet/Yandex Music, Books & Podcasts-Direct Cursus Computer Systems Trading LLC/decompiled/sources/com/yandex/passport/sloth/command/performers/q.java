package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.command.data.w0;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class q implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.v a;
    public final o b;

    public q(com.yandex.passport.sloth.v vVar, o oVar) {
        vVar.getClass();
        oVar.getClass();
        this.a = vVar;
        this.b = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r7.a.c(r9, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.passport.sloth.command.r
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(w0 w0Var, cg6 cg6Var) {
        p pVar;
        int i;
        if (cg6Var instanceof p) {
            pVar = (p) cg6Var;
            int i2 = pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pVar.j;
                nm6 nm6Var = nm6.a;
                i = pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.e0 e0Var = new com.yandex.passport.sloth.e0(w0Var.a, w0Var.b, w0Var.c, w0Var.d);
                    pVar.l = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                pVar.l = 2;
                Object a = this.b.a(pVar);
                return a != nm6Var ? nm6Var : a;
            }
        }
        pVar = new p(this, cg6Var);
        Object obj2 = pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pVar.l;
        if (i != 0) {
        }
        pVar.l = 2;
        Object a2 = this.b.a(pVar);
        if (a2 != nm6Var2) {
        }
    }
}
