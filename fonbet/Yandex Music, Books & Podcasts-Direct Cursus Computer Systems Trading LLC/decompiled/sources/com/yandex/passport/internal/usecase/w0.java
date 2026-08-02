package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.j6;
import com.yandex.passport.data.network.n6;
import com.yandex.passport.data.network.o6;
import com.yandex.passport.internal.report.i5;
import com.yandex.passport.internal.report.j5;
import com.yandex.passport.internal.report.k5;
import com.yandex.passport.internal.report.ue;
import defpackage.avf;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public final class w0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final o6 c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.p e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, o6 o6Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.p pVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        eVar.getClass();
        o6Var.getClass();
        bVar.getClass();
        pVar.getClass();
        this.b = eVar;
        this.c = o6Var;
        this.d = bVar;
        this.e = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(cg6 cg6Var, com.yandex.passport.common.core.f fVar, String str) {
        u0 u0Var;
        int i;
        if (cg6Var instanceof u0) {
            u0Var = (u0) cg6Var;
            int i2 = u0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = u0Var.j;
                Object obj2 = nm6.a;
                i = u0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Object t0Var = new t0(fVar, str);
                    u0Var.l = 1;
                    obj = g(t0Var, u0Var);
                    if (obj == obj2) {
                        return obj2;
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
        u0Var = new u0(this, cg6Var);
        Object obj3 = u0Var.j;
        Object obj22 = nm6.a;
        i = u0Var.l;
        if (i != 0) {
        }
        return ((z7o) obj3).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // androidx.core.app.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(t0 t0Var, cg6 cg6Var) {
        v0 v0Var;
        int i;
        com.yandex.passport.internal.report.reporters.p pVar;
        t0 t0Var2 = t0Var;
        try {
            if (cg6Var instanceof v0) {
                v0Var = (v0) cg6Var;
                int i2 = v0Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    v0Var.m = i2 - Integer.MIN_VALUE;
                    Object obj = v0Var.k;
                    nm6 nm6Var = nm6.a;
                    i = v0Var.m;
                    pVar = this.e;
                    if (i != 0) {
                        qgg.h0(obj);
                        com.yandex.passport.common.core.f fVar = t0Var2.a;
                        String str = t0Var2.b;
                        pVar.getClass();
                        fVar.getClass();
                        str.getClass();
                        pVar.n(j5.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new com.yandex.passport.internal.report.f(str, 12));
                        com.yandex.passport.internal.l e = this.b.a().e(fVar);
                        if (e == null) {
                            throw new com.yandex.passport.api.exception.b(fVar);
                        }
                        if (e.n() || e.o()) {
                            throw new com.yandex.passport.api.exception.c();
                        }
                        o6 o6Var = this.c;
                        com.yandex.passport.internal.network.mappers.b bVar = this.d;
                        com.yandex.passport.common.core.b bVar2 = fVar.a;
                        bVar.getClass();
                        j6 j6Var = new j6(com.yandex.passport.internal.network.mappers.b.a(bVar2), e.h(), e.d.d(), t0Var2.b);
                        v0Var.j = t0Var2;
                        v0Var.m = 1;
                        obj = o6Var.g(j6Var, v0Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t0Var2 = v0Var.j;
                        qgg.h0(obj);
                    }
                    Object obj2 = ((z7o) obj).a;
                    qgg.h0(obj2);
                    List list = ((n6) obj2).b;
                    com.yandex.passport.common.core.f fVar2 = t0Var2.a;
                    String str2 = t0Var2.b;
                    pVar.getClass();
                    fVar2.getClass();
                    str2.getClass();
                    pVar.n(k5.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar2.b)), new com.yandex.passport.internal.report.f(str2, 12));
                    return new z7o(avf.u(new com.yandex.passport.internal.entities.c(t0Var2.a, list, str2)));
                }
            }
            if (i != 0) {
            }
            Object obj22 = ((z7o) obj).a;
            qgg.h0(obj22);
            List list2 = ((n6) obj22).b;
            com.yandex.passport.common.core.f fVar22 = t0Var2.a;
            String str22 = t0Var2.b;
            pVar.getClass();
            fVar22.getClass();
            str22.getClass();
            pVar.n(k5.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar22.b)), new com.yandex.passport.internal.report.f(str22, 12));
            return new z7o(avf.u(new com.yandex.passport.internal.entities.c(t0Var2.a, list2, str22)));
        } catch (Exception e2) {
            com.yandex.passport.common.core.f fVar3 = t0Var2.a;
            String str3 = t0Var2.b;
            pVar.getClass();
            fVar3.getClass();
            str3.getClass();
            pVar.n(i5.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar3.b)), new com.yandex.passport.internal.report.f(str3, 12), new ue(e2));
            throw e2;
        }
        v0Var = new v0(this, cg6Var);
        Object obj3 = v0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = v0Var.m;
        pVar = this.e;
    }
}
