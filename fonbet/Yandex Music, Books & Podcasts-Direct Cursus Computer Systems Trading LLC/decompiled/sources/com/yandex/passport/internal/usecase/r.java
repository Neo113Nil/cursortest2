package com.yandex.passport.internal.usecase;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class r extends com.yandex.passport.common.domain.a {
    public final u b;
    public final com.yandex.passport.internal.core.accounts.f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.yandex.passport.common.coroutine.a aVar, u uVar, com.yandex.passport.internal.core.accounts.f fVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        uVar.getClass();
        fVar.getClass();
        this.b = uVar;
        this.c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(s sVar, Continuation continuation) {
        q qVar;
        int i;
        Object obj;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i2 = qVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = qVar.k;
                nm6 nm6Var = nm6.a;
                i = qVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    qVar.j = sVar;
                    qVar.m = 1;
                    obj2 = this.b.g(sVar, qVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sVar = qVar.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        obj = this.c.b((com.yandex.passport.internal.l) obj, sVar.e.d(), true);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                return new z7o(obj);
            }
        }
        qVar = new q(this, (cg6) continuation);
        Object obj22 = qVar.k;
        nm6 nm6Var2 = nm6.a;
        i = qVar.m;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }
}
