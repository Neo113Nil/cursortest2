package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class r extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.data.network.m1 b;
    public final com.yandex.passport.internal.network.mappers.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.data.network.m1 m1Var, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        m1Var.getClass();
        bVar.getClass();
        this.b = m1Var;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable u(r rVar, p pVar, cg6 cg6Var) {
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
                    com.yandex.passport.data.network.m1 m1Var = rVar.b;
                    com.yandex.passport.internal.network.mappers.b bVar = rVar.c;
                    com.yandex.passport.common.core.b bVar2 = pVar.a;
                    bVar.getClass();
                    com.yandex.passport.data.network.h1 h1Var = new com.yandex.passport.data.network.h1(com.yandex.passport.internal.network.mappers.b.a(bVar2), pVar.b);
                    qVar.l = 1;
                    obj2 = m1Var.g(h1Var, qVar);
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
                        obj = (String) CollectionsKt.Q(((com.yandex.passport.data.network.l1) obj).b);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                return new z7o(obj);
            }
        }
        qVar = new q(rVar, cg6Var);
        Object obj22 = qVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qVar.l;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return u(this, (p) obj, rhwVar);
    }
}
