package com.yandex.passport.internal.upgrader;

import androidx.core.app.n0;
import com.yandex.passport.data.network.a1;
import com.yandex.passport.data.network.f1;
import com.yandex.passport.data.network.g1;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class m extends n0 {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final g1 c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.yandex.passport.internal.core.accounts.e eVar, g1 g1Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.f fVar) {
        super((kotlinx.coroutines.a) ca8.a);
        eVar.getClass();
        g1Var.getClass();
        bVar.getClass();
        fVar.getClass();
        this.b = eVar;
        this.c = g1Var;
        this.d = bVar;
        this.e = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.common.core.f fVar, Continuation continuation) {
        l lVar;
        int i;
        com.yandex.passport.common.account.a aVar;
        Object obj;
        Object t7oVar;
        String str;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = lVar.j;
                nm6 nm6Var = nm6.a;
                i = lVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.core.accounts.e eVar = this.b;
                    com.yandex.passport.internal.l e = eVar.a().e(fVar);
                    com.yandex.passport.common.core.b bVar = fVar.a;
                    this.d.getClass();
                    com.yandex.passport.data.models.g a = com.yandex.passport.internal.network.mappers.b.a(bVar);
                    long h = e != null ? e.h() : 0L;
                    com.yandex.passport.internal.l e2 = eVar.a().e(fVar);
                    if (e2 == null || (aVar = e2.d) == null) {
                        aVar = new com.yandex.passport.common.account.a(null);
                    }
                    a1 a1Var = new a1(aVar, a, h, this.e.a(), e != null ? e.l() : 0L);
                    lVar.l = 1;
                    obj2 = this.c.g(a1Var, lVar);
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
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        str = ((f1) obj).f;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    if (str == null) {
                        throw new com.yandex.passport.data.exceptions.h("No url got from backend");
                    }
                    t7oVar = new com.yandex.passport.common.url.b(com.yandex.passport.common.url.b.l(str));
                    obj = t7oVar;
                }
                return new z7o(obj);
            }
        }
        lVar = new l(this, (cg6) continuation);
        Object obj22 = lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lVar.l;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }
}
