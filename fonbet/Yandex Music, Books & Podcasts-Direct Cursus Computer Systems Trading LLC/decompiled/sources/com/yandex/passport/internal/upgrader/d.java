package com.yandex.passport.internal.upgrader;

import androidx.core.app.n0;
import com.yandex.passport.internal.report.a0;
import com.yandex.passport.internal.report.bf;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.y;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class d extends n0 {
    public final m b;
    public final com.yandex.passport.internal.core.accounts.e c;
    public final com.yandex.passport.internal.report.reporters.e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.yandex.passport.common.coroutine.a aVar, m mVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.report.reporters.e eVar2) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        mVar.getClass();
        eVar.getClass();
        eVar2.getClass();
        this.b = mVar;
        this.c = eVar;
        this.d = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(b bVar, cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.passport.common.core.f fVar;
        Object obj;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar.k;
                nm6 nm6Var = nm6.a;
                i = cVar.m;
                com.yandex.passport.internal.report.reporters.e eVar = this.d;
                if (i != 0) {
                    qgg.h0(obj2);
                    fVar = bVar.a.a;
                    eVar.getClass();
                    fVar.getClass();
                    eVar.o(y.d, fVar);
                    cVar.j = fVar;
                    cVar.m = 1;
                    obj2 = this.b.g(fVar, cVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = cVar.j;
                    qgg.h0(obj2);
                }
                z7o z7oVar = (z7o) obj2;
                Object obj3 = z7oVar.a;
                eVar.getClass();
                fVar.getClass();
                eVar.n(a0.d, new ff(fVar), new bf(com.yandex.passport.internal.report.reporters.d.a, obj3));
                obj = z7oVar.a;
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        obj = new a(this.c.a().e(fVar), ((com.yandex.passport.common.url.b) obj).a);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                return new z7o(obj);
            }
        }
        cVar = new c(this, cg6Var);
        Object obj22 = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
        com.yandex.passport.internal.report.reporters.e eVar2 = this.d;
        if (i != 0) {
        }
        z7o z7oVar2 = (z7o) obj22;
        Object obj32 = z7oVar2.a;
        eVar2.getClass();
        fVar.getClass();
        eVar2.n(a0.d, new ff(fVar), new bf(com.yandex.passport.internal.report.reporters.d.a, obj32));
        obj = z7oVar2.a;
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }
}
