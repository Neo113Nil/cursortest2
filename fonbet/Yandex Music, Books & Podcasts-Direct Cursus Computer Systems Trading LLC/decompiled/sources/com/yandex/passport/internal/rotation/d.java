package com.yandex.passport.internal.rotation;

import com.yandex.passport.internal.report.g9;
import com.yandex.passport.internal.report.reporters.k0;
import com.yandex.passport.internal.report.reporters.x0;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.x8;
import com.yandex.passport.internal.usecase.a1;
import com.yandex.passport.internal.usecase.a2;
import com.yandex.passport.internal.usecase.v1;
import com.yandex.passport.internal.usecase.x1;
import com.yandex.passport.internal.usecase.y0;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.kac;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends com.yandex.passport.common.domain.a {
    public final a1 b;
    public final a2 c;
    public final k0 d;
    public final h e;
    public final com.yandex.passport.internal.credentials.g f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.yandex.passport.common.coroutine.a aVar, a1 a1Var, a2 a2Var, k0 k0Var, h hVar, com.yandex.passport.internal.credentials.g gVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        a1Var.getClass();
        a2Var.getClass();
        k0Var.getClass();
        hVar.getClass();
        gVar.getClass();
        this.b = a1Var;
        this.c = a2Var;
        this.d = k0Var;
        this.e = hVar;
        this.f = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable u(d dVar, a aVar, cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.passport.internal.credentials.f fVar;
        Object obj;
        int i2;
        Object obj2;
        a aVar2;
        com.yandex.passport.common.account.a aVar3;
        d dVar2;
        g gVar;
        com.yandex.passport.internal.credentials.f fVar2;
        Throwable a;
        Object obj3;
        d dVar3 = dVar;
        a aVar4 = aVar;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i3 = cVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.r = i3 - Integer.MIN_VALUE;
                Object obj4 = cVar.p;
                nm6 nm6Var = nm6.a;
                i = cVar.r;
                b bVar = null;
                if (i != 0) {
                    qgg.h0(obj4);
                    k0 k0Var = dVar3.d;
                    long j = aVar4.f.b;
                    String e = aVar4.b.e();
                    k0Var.getClass();
                    k0Var.n(g9.d, new com.yandex.passport.internal.report.c(Long.valueOf(j)), new ve(e, 0));
                    com.yandex.passport.internal.credentials.g gVar2 = dVar3.f;
                    String str = aVar4.e;
                    com.yandex.passport.common.core.b bVar2 = aVar4.c;
                    gVar2.getClass();
                    str.getClass();
                    bVar2.getClass();
                    jyr jyrVar = com.yandex.passport.internal.credentials.g.b;
                    int ordinal = bVar2.ordinal();
                    if (ordinal == 0) {
                        for (com.yandex.passport.internal.credentials.f fVar3 : (List) com.yandex.passport.internal.credentials.g.b.getValue()) {
                            if (!Intrinsics.d(fVar3.c, str)) {
                            }
                        }
                        wvs.h("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if (ordinal == 2) {
                        for (com.yandex.passport.internal.credentials.f fVar32 : (List) com.yandex.passport.internal.credentials.g.c.getValue()) {
                            if (!Intrinsics.d(fVar32.c, str)) {
                            }
                        }
                        wvs.h("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if (ordinal != 4) {
                        kac.j(bVar2, "Unsupported environment ");
                        return null;
                    }
                    for (com.yandex.passport.internal.credentials.f fVar322 : (List) com.yandex.passport.internal.credentials.g.b.getValue()) {
                        if (!Intrinsics.d(fVar322.c, str)) {
                        }
                    }
                    wvs.h("Collection contains no element matching the predicate.");
                    return null;
                    fVar = fVar322;
                    a1 a1Var = dVar3.b;
                    y0 y0Var = new y0(aVar4.b, fVar, aVar4.c, aVar4.d, com.yandex.passport.internal.analytics.a.y);
                    cVar.j = dVar3;
                    cVar.k = aVar4;
                    cVar.l = fVar;
                    cVar.o = 0;
                    cVar.r = 1;
                    Object g = a1Var.g(y0Var, cVar);
                    if (g != nm6Var) {
                        obj = g;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gVar = cVar.n;
                    aVar3 = cVar.m;
                    fVar2 = cVar.l;
                    aVar2 = cVar.k;
                    dVar2 = cVar.j;
                    qgg.h0(obj4);
                    obj3 = ((z7o) obj4).a;
                    if (!(obj3 instanceof t7o)) {
                        dVar2.e.b(gVar);
                    }
                    bVar = new b(aVar3, fVar2);
                    dVar3 = dVar2;
                    aVar4 = aVar2;
                    r7o r7oVar = z7o.b;
                    obj2 = bVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                        dVar3.d.v(aVar4.f.b, aVar4.b.e(), null, false, a.getMessage());
                    }
                    return new z7o(obj2);
                }
                int i4 = cVar.o;
                com.yandex.passport.internal.credentials.f fVar4 = cVar.l;
                a aVar5 = cVar.k;
                d dVar4 = cVar.j;
                qgg.h0(obj4);
                fVar = fVar4;
                aVar4 = aVar5;
                obj = obj4;
                i2 = i4;
                dVar3 = dVar4;
                obj2 = ((z7o) obj).a;
                if (!(obj2 instanceof t7o)) {
                    r7o r7oVar2 = z7o.b;
                    com.yandex.passport.common.account.a aVar6 = (com.yandex.passport.common.account.a) obj2;
                    com.yandex.passport.common.account.a aVar7 = aVar4.b;
                    com.yandex.passport.common.core.f fVar5 = aVar4.f;
                    String str2 = aVar4.e;
                    if (!Intrinsics.d(aVar7, aVar6)) {
                        dVar3.d.v(fVar5.b, aVar7.e(), aVar6.e(), true, null);
                        String e2 = aVar7.e();
                        g gVar3 = new g(e2, fVar5, str2);
                        h hVar = dVar3.e;
                        hVar.getClass();
                        hVar.c(CollectionsKt.h0(hVar.a(), gVar3));
                        k0 k0Var2 = hVar.a;
                        k0Var2.getClass();
                        k0Var2.n(x8.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar5.b)), new ve(e2, 0));
                        a2 a2Var = dVar3.c;
                        v1 v1Var = new v1(aVar4.a, aVar4.b, new x1(str2), fVar5, x0.f, false);
                        cVar.j = dVar3;
                        cVar.k = aVar4;
                        cVar.l = fVar;
                        cVar.m = aVar6;
                        cVar.n = gVar3;
                        cVar.o = i2;
                        cVar.r = 2;
                        obj4 = a2Var.g(v1Var, cVar);
                        if (obj4 != nm6Var) {
                            aVar2 = aVar4;
                            aVar3 = aVar6;
                            dVar2 = dVar3;
                            gVar = gVar3;
                            fVar2 = fVar;
                            obj3 = ((z7o) obj4).a;
                            if (!(obj3 instanceof t7o)) {
                            }
                            bVar = new b(aVar3, fVar2);
                            dVar3 = dVar2;
                            aVar4 = aVar2;
                            r7o r7oVar3 = z7o.b;
                            obj2 = bVar;
                        }
                        return nm6Var;
                    }
                    dVar3.d.v(fVar5.b, aVar7.e(), aVar6.e(), false, "Same tokens");
                    r7o r7oVar32 = z7o.b;
                    obj2 = bVar;
                }
                a = z7o.a(obj2);
                if (a != null) {
                }
                return new z7o(obj2);
            }
        }
        cVar = new c(dVar3, cg6Var);
        Object obj42 = cVar.p;
        nm6 nm6Var2 = nm6.a;
        i = cVar.r;
        b bVar3 = null;
        if (i != 0) {
        }
        obj2 = ((z7o) obj).a;
        if (!(obj2 instanceof t7o)) {
        }
        a = z7o.a(obj2);
        if (a != null) {
        }
        return new z7o(obj2);
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return u(this, (a) obj, rhwVar);
    }
}
