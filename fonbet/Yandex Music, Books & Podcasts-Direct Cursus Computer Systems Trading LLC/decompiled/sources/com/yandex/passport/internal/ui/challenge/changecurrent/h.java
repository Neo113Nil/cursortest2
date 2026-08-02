package com.yandex.passport.internal.ui.challenge.changecurrent;

import com.yandex.passport.internal.usecase.f2;
import defpackage.b6;
import defpackage.bsh;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends bsh {
    public final f2 g;
    public final com.yandex.passport.internal.account.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.yandex.passport.internal.ui.challenge.n nVar, j jVar, com.yandex.passport.internal.ui.challenge.s sVar, f2 f2Var, com.yandex.passport.internal.account.a aVar) {
        super(nVar, jVar, sVar, true);
        nVar.getClass();
        jVar.getClass();
        sVar.getClass();
        f2Var.getClass();
        aVar.getClass();
        this.g = f2Var;
        this.h = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.bsh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(cg6 cg6Var) {
        g gVar;
        int i;
        Object obj;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(bVar, null, "Executing setCurrentAccountUseCase", 10);
                    }
                    com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) ((com.yandex.passport.internal.ui.challenge.n) ((b6) this.b)).b;
                    gVar.l = 1;
                    obj2 = this.g.g(fVar, gVar);
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
        gVar = new g(this, cg6Var);
        Object obj22 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (z7o.a(obj) == null) {
        }
    }

    @Override // defpackage.bsh
    public final com.yandex.passport.common.core.f j() {
        com.yandex.passport.internal.l a = this.h.a();
        com.yandex.passport.common.core.f fVar = a != null ? a.b : null;
        if (Intrinsics.d(fVar, (com.yandex.passport.common.core.f) ((com.yandex.passport.internal.ui.challenge.n) ((b6) this.b)).b)) {
            return null;
        }
        return fVar;
    }
}
