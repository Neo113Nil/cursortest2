package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.y1;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.xq0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.ui.challenge.s a;

    public l(com.yandex.passport.internal.ui.challenge.s sVar) {
        sVar.getClass();
        this.a = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r5 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0049, code lost:
    
        if (r5 == r7) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l lVar, com.yandex.passport.internal.ui.bouncer.model.f fVar, cg6 cg6Var) {
        k kVar;
        int i;
        com.yandex.passport.internal.usecase.i0 i0Var;
        com.yandex.passport.internal.ui.challenge.s sVar = lVar.a;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.m = i2 - Integer.MIN_VALUE;
                Object obj = kVar.k;
                nm6 nm6Var = nm6.a;
                i = kVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.f fVar2 = fVar.b;
                    kVar.j = fVar;
                    kVar.m = 1;
                    obj = sVar.b(fVar2, kVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar = kVar.j;
                        qgg.h0(obj);
                        com.yandex.passport.internal.ui.challenge.c0 c0Var = (com.yandex.passport.internal.ui.challenge.c0) obj;
                        return c0Var != null ? new com.yandex.passport.internal.ui.bouncer.model.a0(new com.yandex.passport.internal.ui.bouncer.model.m1(c0Var, fVar.b, fVar.c)) : new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.e1("ChallengeStartMiddleware", "No web case for challenge"));
                    }
                    fVar = kVar.j;
                    qgg.h0(obj);
                }
                i0Var = (com.yandex.passport.internal.usecase.i0) obj;
                if (!(i0Var instanceof com.yandex.passport.internal.usecase.f0)) {
                    boolean z = ((com.yandex.passport.internal.usecase.f0) i0Var).a;
                    if (z) {
                        return new com.yandex.passport.internal.ui.bouncer.model.g(fVar.a.a.p.a);
                    }
                    if (!z) {
                        return new com.yandex.passport.internal.ui.bouncer.model.s(com.yandex.passport.internal.ui.bouncer.model.g1.a);
                    }
                    b6e.s();
                    return null;
                }
                if (Intrinsics.d(i0Var, com.yandex.passport.internal.usecase.h0.a)) {
                    return new com.yandex.passport.internal.ui.bouncer.model.e(fVar.a);
                }
                if (!(i0Var instanceof com.yandex.passport.internal.usecase.g0)) {
                    b6e.s();
                    return null;
                }
                boolean z2 = fVar.d;
                com.yandex.passport.common.core.f fVar3 = fVar.b;
                if (z2) {
                    sVar.d(fVar3);
                }
                y1 y1Var = fVar.c;
                kVar.j = fVar;
                kVar.m = 2;
                obj = sVar.c(fVar3, (com.yandex.passport.internal.usecase.g0) i0Var, y1Var, kVar);
            }
        }
        kVar = new k(lVar, cg6Var);
        Object obj2 = kVar.k;
        nm6 nm6Var2 = nm6.a;
        i = kVar.m;
        if (i != 0) {
        }
        i0Var = (com.yandex.passport.internal.usecase.i0) obj2;
        if (!(i0Var instanceof com.yandex.passport.internal.usecase.f0)) {
        }
    }

    @Override // com.yandex.passport.common.mvi.e
    public final pjc a(x0q x0qVar) {
        x0qVar.getClass();
        int i = 3;
        return new com.yandex.passport.common.mvi.d(new com.yandex.passport.internal.t(x0qVar, i), this, i);
    }
}
