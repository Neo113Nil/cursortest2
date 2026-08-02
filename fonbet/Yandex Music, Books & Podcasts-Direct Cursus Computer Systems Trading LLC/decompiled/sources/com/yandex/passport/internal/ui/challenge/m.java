package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.api.y1;
import com.yandex.passport.internal.usecase.f0;
import com.yandex.passport.internal.usecase.g0;
import com.yandex.passport.internal.usecase.h0;
import com.yandex.passport.internal.usecase.i0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.gm5;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class m {
    public final s a;

    public m(s sVar) {
        sVar.getClass();
        this.a = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0048, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.ui.a aVar, cg6 cg6Var) {
        k kVar;
        int i;
        i0 i0Var;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.n = i2 - Integer.MIN_VALUE;
                Object obj = kVar.l;
                nm6 nm6Var = nm6.a;
                i = kVar.n;
                s sVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    kVar.j = fVar;
                    kVar.k = aVar;
                    kVar.n = 1;
                    obj = sVar.b(fVar, kVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        c0 c0Var = (c0) obj;
                        if (c0Var != null) {
                            return new i(c0Var);
                        }
                        return g.a;
                    }
                    aVar = kVar.k;
                    fVar = kVar.j;
                    qgg.h0(obj);
                }
                i0Var = (i0) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "ChallengeState = " + i0Var, 8);
                }
                if (!(i0Var instanceof f0)) {
                    if (i0Var instanceof h0) {
                        return h.a;
                    }
                    if (!(i0Var instanceof g0)) {
                        b6e.s();
                        return null;
                    }
                    y1 I = com.yandex.plus.pay.ui.core.b.I(aVar);
                    kVar.j = null;
                    kVar.k = null;
                    kVar.n = 2;
                    obj = sVar.c(fVar, (g0) i0Var, I, kVar);
                }
                return g.a;
            }
        }
        kVar = new k(this, cg6Var);
        Object obj2 = kVar.l;
        nm6 nm6Var2 = nm6.a;
        i = kVar.n;
        s sVar2 = this.a;
        if (i != 0) {
        }
        i0Var = (i0) obj2;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        if (!(i0Var instanceof f0)) {
        }
        return g.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, com.yandex.passport.common.core.f fVar, c0 c0Var, cg6 cg6Var) {
        l lVar;
        Object obj;
        int i;
        com.yandex.passport.common.core.f fVar2;
        i0 i0Var;
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.m = i2 - Integer.MIN_VALUE;
                obj = lVar.k;
                nm6 nm6Var = nm6.a;
                i = lVar.m;
                s sVar = this.a;
                g gVar = g.a;
                if (i != 0) {
                    qgg.h0(obj);
                    c0Var.a(str);
                    gm5 gm5Var = c0Var.b;
                    lVar.j = fVar;
                    lVar.m = 1;
                    obj = gm5Var.s(lVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar2 = lVar.j;
                        qgg.h0(obj);
                        i0Var = (i0) obj;
                        if (!(i0Var instanceof h0)) {
                            return h.a;
                        }
                        if ((i0Var instanceof f0) || (i0Var instanceof g0)) {
                            sVar.d(fVar2);
                            return gVar;
                        }
                        b6e.s();
                        return null;
                    }
                    fVar = lVar.j;
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return gVar;
                }
                lVar.j = fVar;
                lVar.m = 2;
                obj = sVar.b(fVar, lVar);
                if (obj != nm6Var) {
                    fVar2 = fVar;
                    i0Var = (i0) obj;
                    if (!(i0Var instanceof h0)) {
                    }
                }
                return nm6Var;
            }
        }
        lVar = new l(this, cg6Var);
        obj = lVar.k;
        nm6 nm6Var2 = nm6.a;
        i = lVar.m;
        s sVar2 = this.a;
        g gVar2 = g.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
