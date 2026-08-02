package com.yandex.passport.internal.upgrader;

import androidx.core.app.n0;
import com.yandex.passport.common.network.r;
import com.yandex.passport.data.network.a1;
import com.yandex.passport.data.network.f1;
import com.yandex.passport.data.network.g1;
import com.yandex.passport.internal.report.bf;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.v;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class k extends n0 {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final g1 c;
    public final com.yandex.passport.internal.f d;
    public final q e;
    public final com.yandex.passport.internal.report.reporters.e f;
    public final com.yandex.passport.internal.network.mappers.b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, g1 g1Var, com.yandex.passport.internal.f fVar, q qVar, com.yandex.passport.internal.report.reporters.e eVar2, com.yandex.passport.internal.network.mappers.b bVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        eVar.getClass();
        g1Var.getClass();
        fVar.getClass();
        qVar.getClass();
        eVar2.getClass();
        bVar.getClass();
        this.b = eVar;
        this.c = g1Var;
        this.d = fVar;
        this.e = qVar;
        this.f = eVar2;
        this.g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(i iVar, cg6 cg6Var) {
        j jVar;
        int i;
        com.yandex.passport.common.account.a aVar;
        Object obj;
        i iVar2 = iVar;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = jVar.k;
                nm6 nm6Var = nm6.a;
                i = jVar.m;
                com.yandex.passport.internal.core.accounts.e eVar = this.b;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.common.core.f fVar = iVar2.a;
                    com.yandex.passport.internal.l e = eVar.a().e(fVar);
                    com.yandex.passport.common.core.b bVar = fVar.a;
                    this.g.getClass();
                    com.yandex.passport.data.models.g a = com.yandex.passport.internal.network.mappers.b.a(bVar);
                    long h = e != null ? e.h() : 0L;
                    com.yandex.passport.internal.l e2 = eVar.a().e(fVar);
                    if (e2 == null || (aVar = e2.d) == null) {
                        aVar = new com.yandex.passport.common.account.a(null);
                    }
                    a1 a1Var = new a1(aVar, a, h, this.d.a(), e != null ? e.l() : 0L);
                    jVar.j = iVar2;
                    jVar.m = 1;
                    obj2 = this.c.g(a1Var, jVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iVar2 = jVar.j;
                    qgg.h0(obj2);
                }
                z7o z7oVar = (z7o) obj2;
                Object obj3 = z7oVar.a;
                com.yandex.passport.common.core.f fVar2 = iVar2.a;
                o oVar = iVar2.b;
                com.yandex.passport.internal.report.reporters.e eVar2 = this.f;
                eVar2.getClass();
                fVar2.getClass();
                oVar.getClass();
                boolean z = false;
                eVar2.n(v.d, new ff(fVar2), new ff(oVar), new bf(new r(25), obj3));
                obj = z7oVar.a;
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        f1 f1Var = (f1) obj;
                        com.yandex.passport.internal.l e3 = eVar.a().e(fVar2);
                        com.yandex.passport.common.time.a aVar2 = e3 != null ? new com.yandex.passport.common.time.a(e3.l()) : null;
                        if (f1Var.e) {
                            obj = com.yandex.passport.api.o.d;
                        } else if (f1Var.d) {
                            obj = com.yandex.passport.api.o.b;
                        } else if (f1Var.b) {
                            obj = com.yandex.passport.api.o.a;
                        } else if (f1Var.c) {
                            if (aVar2 != null) {
                                z = com.yandex.passport.common.time.a.e(aVar2.a, 0L);
                            }
                            obj = !z ? com.yandex.passport.api.o.c : com.yandex.passport.api.o.a;
                        } else {
                            obj = com.yandex.passport.api.o.a;
                        }
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                if (!(obj instanceof t7o)) {
                    com.yandex.passport.api.o oVar2 = (com.yandex.passport.api.o) obj;
                    com.yandex.passport.internal.l e4 = eVar.a().e(fVar2);
                    if (e4 != null) {
                        this.e.a(e4, oVar2);
                    }
                }
                return new z7o(obj);
            }
        }
        jVar = new j(this, cg6Var);
        Object obj22 = jVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jVar.m;
        com.yandex.passport.internal.core.accounts.e eVar3 = this.b;
        if (i != 0) {
        }
        z7o z7oVar2 = (z7o) obj22;
        Object obj32 = z7oVar2.a;
        com.yandex.passport.common.core.f fVar22 = iVar2.a;
        o oVar3 = iVar2.b;
        com.yandex.passport.internal.report.reporters.e eVar22 = this.f;
        eVar22.getClass();
        fVar22.getClass();
        oVar3.getClass();
        boolean z2 = false;
        eVar22.n(v.d, new ff(fVar22), new ff(oVar3), new bf(new r(25), obj32));
        obj = z7oVar2.a;
        if (!(obj instanceof t7o)) {
        }
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }
}
