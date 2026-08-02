package com.yandex.plus.pay.inapp.google.common.internal.operation;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.home.internal.di.y;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.wqn;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y2x;
import java.util.Set;

/* loaded from: classes5.dex */
public final class h implements b {
    public static final Set d = xz0.Y(new d[]{d.h, d.b});
    public final com.yandex.plus.log.api.b a;
    public final Set b;
    public final y c;

    public h(y yVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        Set set = d;
        set.getClass();
        this.a = bVar;
        this.b = set;
        this.c = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f1 -> B:17:0x00f4). Please report as a decompilation issue!!! */
    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, cg6 cg6Var) {
        g gVar;
        int i;
        g gVar2;
        int i2;
        int i3;
        wqn wqnVar;
        Object obj2;
        Object obj3;
        wqn wqnVar2;
        int i4;
        int i5;
        int i6;
        d dVar;
        int i7;
        h hVar = this;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i8 = gVar.r;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.r = i8 - Integer.MIN_VALUE;
                Object obj4 = gVar.p;
                nm6 nm6Var = nm6.a;
                i = gVar.r;
                int i9 = 0;
                y yVar = hVar.c;
                int i10 = 1;
                if (i != 0) {
                    qgg.h0(obj4);
                    wqn wqnVar3 = new wqn();
                    wqnVar3.a = 500L;
                    gVar2 = gVar;
                    i2 = 0;
                    i3 = 2;
                    wqnVar = wqnVar3;
                    obj2 = obj;
                    if (i2 < i3) {
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    int i11 = gVar.o;
                    int i12 = gVar.n;
                    int i13 = gVar.m;
                    int i14 = gVar.l;
                    wqnVar2 = gVar.k;
                    obj3 = gVar.j;
                    qgg.h0(obj4);
                    i5 = i11;
                    i6 = i13;
                    i3 = i14;
                    i4 = i12;
                    c cVar = (c) obj4;
                    e eVar = cVar.b;
                    dVar = eVar.a;
                    i7 = i10;
                    if (dVar != d.a) {
                    }
                    return cVar;
                }
                if (i != 2) {
                    if (i == 3) {
                        qgg.h0(obj4);
                        return obj4;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i6 = gVar.m;
                int i15 = gVar.l;
                wqn wqnVar4 = gVar.k;
                Object obj5 = gVar.j;
                qgg.h0(obj4);
                g gVar3 = gVar;
                char c = 2;
                i7 = 1;
                wqnVar = wqnVar4;
                obj2 = obj5;
                i3 = i15;
                long j = (long) (wqnVar.a * 2.0d);
                if (j > 2000) {
                    j = 2000;
                }
                wqnVar.a = j;
                i2 = i6 + 1;
                gVar2 = gVar3;
                i10 = i7;
                i9 = 0;
                hVar = this;
                if (i2 < i3) {
                    gVar2.j = obj2;
                    gVar2.k = wqnVar;
                    gVar2.l = i3;
                    gVar2.m = i2;
                    gVar2.n = i2;
                    gVar2.o = i9;
                    gVar2.r = i10;
                    Object g = yVar.g(obj2, gVar2);
                    if (g != nm6Var) {
                        obj3 = obj2;
                        wqnVar2 = wqnVar;
                        gVar = gVar2;
                        i6 = i2;
                        obj4 = g;
                        i5 = i9;
                        i4 = i6;
                        c cVar2 = (c) obj4;
                        e eVar2 = cVar2.b;
                        dVar = eVar2.a;
                        i7 = i10;
                        if (dVar != d.a) {
                            boolean contains = hVar.b.contains(dVar);
                            com.yandex.plus.log.api.b bVar = hVar.a;
                            if (contains) {
                                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                                if (bVar.b(aVar)) {
                                    bVar.c(aVar, "WithRetriesOperationDecorator", yVar.getName() + " is unsuccessful with result: " + eVar2 + ". Retrying");
                                }
                                long j2 = wqnVar2.a;
                                gVar.j = obj3;
                                gVar.k = wqnVar2;
                                gVar.l = i3;
                                gVar.m = i6;
                                gVar.n = i4;
                                gVar.o = i5;
                                c = 2;
                                gVar.r = 2;
                                if (y2x.o(j2, gVar) != nm6Var) {
                                    gVar3 = gVar;
                                    wqnVar = wqnVar2;
                                    obj2 = obj3;
                                    long j3 = (long) (wqnVar.a * 2.0d);
                                    if (j3 > 2000) {
                                    }
                                    wqnVar.a = j3;
                                    i2 = i6 + 1;
                                    gVar2 = gVar3;
                                    i10 = i7;
                                    i9 = 0;
                                    hVar = this;
                                    if (i2 < i3) {
                                        gVar2.j = null;
                                        gVar2.k = null;
                                        gVar2.r = 3;
                                        Object g2 = yVar.g(obj2, gVar2);
                                        if (g2 != nm6Var) {
                                            return g2;
                                        }
                                    }
                                }
                            } else {
                                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                                if (bVar.b(aVar2)) {
                                    bVar.c(aVar2, "WithRetriesOperationDecorator", yVar.getName() + " is unsuccessful with result: " + eVar2 + ". Error is not retryable");
                                }
                            }
                        }
                        return cVar2;
                    }
                }
                return nm6Var;
            }
        }
        gVar = new g(hVar, cg6Var);
        Object obj42 = gVar.p;
        nm6 nm6Var2 = nm6.a;
        i = gVar.r;
        int i92 = 0;
        y yVar2 = hVar.c;
        int i102 = 1;
        if (i != 0) {
        }
    }

    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    public final String getName() {
        return ((p) this.c.b).getName();
    }
}
