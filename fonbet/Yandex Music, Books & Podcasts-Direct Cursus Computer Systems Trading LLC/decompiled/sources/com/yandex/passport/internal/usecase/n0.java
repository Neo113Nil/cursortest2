package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.u3;
import com.yandex.passport.data.network.y3;
import com.yandex.passport.data.network.z3;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 extends com.yandex.passport.common.domain.a {
    public final z3 b;
    public final com.yandex.passport.internal.properties.x c;
    public final com.yandex.passport.internal.core.accounts.e d;
    public final com.yandex.passport.internal.network.mappers.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.yandex.passport.common.coroutine.a aVar, z3 z3Var, com.yandex.passport.internal.properties.x xVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        z3Var.getClass();
        xVar.getClass();
        eVar.getClass();
        bVar.getClass();
        this.b = z3Var;
        this.c = xVar;
        this.d = eVar;
        this.e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(l0 l0Var, cg6 cg6Var) {
        m0 m0Var;
        int i;
        com.yandex.passport.internal.credentials.f fVar;
        com.yandex.passport.common.core.b bVar;
        Object obj;
        if (cg6Var instanceof m0) {
            m0Var = (m0) cg6Var;
            int i2 = m0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = m0Var.k;
                nm6 nm6Var = nm6.a;
                i = m0Var.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.common.core.f fVar2 = l0Var.b;
                    com.yandex.passport.internal.credentials.e eVar = l0Var.c;
                    com.yandex.passport.common.core.b bVar2 = fVar2.a;
                    if (Intrinsics.d(eVar, com.yandex.passport.internal.credentials.a.a)) {
                        fVar = this.c.b(bVar2);
                    } else if (Intrinsics.d(eVar, com.yandex.passport.internal.credentials.c.a)) {
                        fVar = null;
                    } else {
                        if (!(eVar instanceof com.yandex.passport.internal.credentials.d)) {
                            b6e.s();
                            return null;
                        }
                        fVar = ((com.yandex.passport.internal.credentials.d) eVar).a;
                    }
                    com.yandex.passport.internal.l e = this.d.a().e(fVar2);
                    if (e == null) {
                        throw new com.yandex.passport.api.exception.b(fVar2);
                    }
                    com.yandex.passport.common.account.a aVar = e.d;
                    this.e.getClass();
                    u3 u3Var = new u3(e.h(), aVar, com.yandex.passport.internal.network.mappers.b.a(bVar2), fVar != null ? fVar.c : null, fVar != null ? fVar.d : null, String.valueOf(l0Var.a.b));
                    m0Var.j = bVar2;
                    m0Var.m = 1;
                    obj2 = this.b.g(u3Var, m0Var);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    bVar = bVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = m0Var.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        y3 y3Var = (y3) obj;
                        obj = new com.yandex.passport.internal.entities.f(y3Var.c, com.yandex.plus.core.network.api.utils.a.P(bVar), y3Var.b);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                return new z7o(obj);
            }
        }
        m0Var = new m0(this, cg6Var);
        Object obj22 = m0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = m0Var.m;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }
}
