package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.internal.usecase.m1;
import defpackage.b6;
import defpackage.b6e;
import defpackage.bsh;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class s extends bsh {
    public final m1 g;
    public final d h;
    public final com.yandex.passport.internal.usecase.v i;
    public final com.yandex.passport.internal.usecase.ui.t j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.yandex.passport.internal.ui.challenge.o oVar, f0 f0Var, com.yandex.passport.internal.ui.challenge.s sVar, m1 m1Var, d dVar, com.yandex.passport.internal.usecase.v vVar, com.yandex.passport.internal.usecase.ui.t tVar) {
        super(oVar, f0Var, sVar, true);
        oVar.getClass();
        f0Var.getClass();
        sVar.getClass();
        m1Var.getClass();
        dVar.getClass();
        vVar.getClass();
        tVar.getClass();
        this.g = m1Var;
        this.h = dVar;
        this.i = vVar;
        this.j = tVar;
    }

    @Override // defpackage.bsh
    public final Object e0(cg6 cg6Var) {
        int ordinal = this.h.ordinal();
        if (ordinal == 0) {
            return h0(cg6Var);
        }
        if (ordinal == 1) {
            return i0(cg6Var);
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(cg6 cg6Var) {
        q qVar;
        int i;
        Object obj;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = qVar.j;
                nm6 nm6Var = nm6.a;
                i = qVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(bVar, null, "Executing logoutUseCase", 10);
                    }
                    com.yandex.passport.common.core.f j = j();
                    qVar.l = 1;
                    obj2 = this.g.g(j, qVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (z7o.a(obj) == null) {
                    return bsh.i();
                }
                return new com.yandex.passport.internal.ui.challenge.y(true);
            }
        }
        qVar = new q(this, cg6Var);
        Object obj22 = qVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qVar.l;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (z7o.a(obj) == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(4:11|12|13|(2:15|16)(2:18|19))(2:21|22))(1:23))(3:32|(1:34)|35)|24|(3:26|(1:28)|29)|13|(0)(0)))|39|6|7|(0)(0)|24|(0)|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r2.g(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        r0 = defpackage.z7o.b;
        r9 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #0 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x0080, B:26:0x0062, B:28:0x0070, B:29:0x0075), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i0(cg6 cg6Var) {
        r rVar;
        int i;
        Object t7oVar;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i2 = rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rVar.j;
                nm6 nm6Var = nm6.a;
                i = rVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(bVar, null, "Executing findMasterAccountUseCase", 10);
                    }
                    com.yandex.passport.common.core.f j = j();
                    rVar.l = 1;
                    obj = this.i.g(j, rVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        t7oVar = Unit.a;
                        r7o r7oVar = z7o.b;
                        if (z7o.a(t7oVar) != null) {
                            return bsh.i();
                        }
                        return new com.yandex.passport.internal.ui.challenge.y(true);
                    }
                    qgg.h0(obj);
                }
                t7oVar = ((z7o) obj).a;
                if (!(t7oVar instanceof t7o)) {
                    r7o r7oVar2 = z7o.b;
                    com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) t7oVar;
                    com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(bVar2, null, "Executing deleteAccountUseCase", 10);
                    }
                    com.yandex.passport.internal.usecase.ui.t tVar = this.j;
                    rVar.l = 2;
                }
                if (z7o.a(t7oVar) != null) {
                }
            }
        }
        rVar = new r(this, cg6Var);
        Object obj2 = rVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rVar.l;
        if (i != 0) {
        }
        t7oVar = ((z7o) obj2).a;
        if (!(t7oVar instanceof t7o)) {
        }
        if (z7o.a(t7oVar) != null) {
        }
    }

    @Override // defpackage.bsh
    public final com.yandex.passport.common.core.f j() {
        return ((com.yandex.passport.internal.ui.challenge.o) ((b6) this.b)).d;
    }
}
