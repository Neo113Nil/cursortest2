package com.yandex.passport.internal.methods.performer.ui;

import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.core.accounts.e;
import com.yandex.passport.internal.methods.o3;
import com.yandex.passport.internal.methods.performer.z0;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.upgrader.i;
import com.yandex.passport.internal.upgrader.k;
import com.yandex.passport.internal.upgrader.o;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.wzv;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class b implements z0 {
    public final e a;
    public final k b;
    public final com.yandex.passport.internal.report.reporters.e c;

    public b(e eVar, k kVar, com.yandex.passport.internal.report.reporters.e eVar2) {
        eVar.getClass();
        kVar.getClass();
        eVar2.getClass();
        this.a = eVar;
        this.b = kVar;
        this.c = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, f fVar, o oVar, cg6 cg6Var) {
        a aVar;
        int i;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getActual for Uid=" + fVar, 8);
                    }
                    k kVar = bVar.b;
                    i iVar = new i(fVar, oVar);
                    aVar.l = 1;
                    obj = kVar.g(iVar, aVar);
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
        aVar = new a(bVar, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new wzv((o3) v5Var, this, null, 27));
    }
}
