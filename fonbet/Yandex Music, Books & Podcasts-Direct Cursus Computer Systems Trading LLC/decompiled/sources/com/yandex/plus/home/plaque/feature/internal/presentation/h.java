package com.yandex.plus.home.plaque.feature.internal.presentation;

import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.plaquesdk.plaque.api.models.c0;
import com.yandex.plus.plaquesdk.plaque.api.models.n;
import com.yandex.plus.plaquesdk.plaque.api.models.r;
import com.yandex.plus.plaquesdk.plaque.api.models.t;
import com.yandex.plus.plaquesdk.plaque.api.models.u;
import com.yandex.plus.plaquesdk.plaque.api.models.v;
import com.yandex.plus.plaquesdk.plaque.api.models.w;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.a4g;
import defpackage.b6e;
import defpackage.bsd;
import defpackage.cg6;
import defpackage.gld;
import defpackage.lf2;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.ouj;
import defpackage.q6k;
import defpackage.qgg;
import defpackage.rea;
import defpackage.tf6;
import defpackage.u21;
import defpackage.uah;
import defpackage.v42;
import defpackage.v75;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.y2x;
import defpackage.ydr;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {
    public final y a;
    public final y b;
    public final com.yandex.plus.bdui.flex.factory.e c;
    public final com.yandex.plus.home.dailyquests.plugin.internal.proxy.a d;
    public final j e;
    public final com.yandex.plus.home.dailyquests.plugin.internal.proxy.d f;
    public final com.yandex.plus.log.api.b g;
    public final tf6 h;
    public final kotlinx.coroutines.a i;
    public final x0q j;
    public final xdr k;
    public final xdr l;
    public final xdr m;
    public final tf6 n;

    public h(p pVar, y yVar, y yVar2, com.yandex.plus.bdui.flex.factory.e eVar, com.yandex.plus.home.dailyquests.plugin.internal.proxy.a aVar, j jVar, com.yandex.plus.home.dailyquests.plugin.internal.proxy.d dVar, com.yandex.plus.log.api.b bVar, tf6 tf6Var, kotlinx.coroutines.a aVar2, bsd bsdVar) {
        pVar.getClass();
        jVar.getClass();
        aVar2.getClass();
        bsdVar.getClass();
        this.a = yVar;
        this.b = yVar2;
        this.c = eVar;
        this.d = aVar;
        this.e = jVar;
        this.f = dVar;
        this.g = bVar;
        this.h = tf6Var;
        this.i = aVar2;
        Continuation continuation = null;
        this.j = y0q.b(0, 0, null, 7);
        this.k = ydr.a(null);
        Boolean bool = Boolean.FALSE;
        this.l = ydr.a(bool);
        this.m = ydr.a(bool);
        tf6 e = gld.e(bsdVar.plus(a4g.n()));
        this.n = e;
        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar3)) {
            bVar.c(aVar3, "PlaqueViewModel", "init");
        }
        xdr xdrVar = (xdr) ((p) yVar.a).d;
        com.yandex.plus.home.feature.webviews.internal.webview.e eVar2 = new com.yandex.plus.home.feature.webviews.internal.webview.e(6);
        rea reaVar = q6k.g;
        com.yandex.plus.bdui.flex.ui.a.l(q6k.m(new u21(10, q6k.m(xdrVar, eVar2, reaVar), ((com.yandex.plus.home.plaque.repository.api.a) pVar.b).e(), new v42(this, continuation, 26)), new m(1, this), reaVar), e, new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, continuation, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01c8, code lost:
    
        if (r0.emit(r1, r5) == r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013a, code lost:
    
        if (defpackage.y2x.p(r1, r5) == r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        if (r17.c(r5) == r6) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, com.yandex.plus.home.plaque.feature.api.context.b bVar, com.yandex.plus.home.plaque.repository.api.model.a aVar, com.yandex.plus.home.plaque.repository.api.model.b bVar2, cg6 cg6Var) {
        d dVar;
        com.yandex.plus.home.plaque.repository.api.model.a aVar2;
        com.yandex.plus.home.plaque.repository.api.model.b bVar3;
        com.yandex.plus.home.plaque.feature.api.context.b bVar4;
        com.yandex.plus.home.plaque.repository.api.model.b bVar5;
        com.yandex.plus.home.plaque.feature.api.context.b bVar6;
        com.yandex.plus.home.plaque.feature.api.context.b bVar7;
        long j;
        com.yandex.plus.home.plaque.repository.api.model.a aVar3;
        com.yandex.plus.log.api.a aVar4;
        Object value;
        com.yandex.plus.home.plaque.feature.api.context.b bVar8;
        com.yandex.plus.home.dailyquests.plugin.internal.proxy.a aVar5 = hVar.d;
        com.yandex.plus.log.api.b bVar9 = hVar.g;
        xdr xdrVar = hVar.k;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i = dVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.o = i - Integer.MIN_VALUE;
                Object obj = dVar.m;
                nm6 nm6Var = nm6.a;
                int i2 = 2;
                Continuation continuation = null;
                switch (dVar.o) {
                    case 0:
                        qgg.h0(obj);
                        dVar.j = bVar;
                        dVar.k = aVar;
                        dVar.l = bVar2;
                        dVar.o = 1;
                        Object h0 = zsd.h0(hVar.m, new lf2(i2, 19, continuation), dVar);
                        if (h0 != nm6Var) {
                            h0 = Unit.a;
                        }
                        if (h0 != nm6Var) {
                            aVar2 = aVar;
                            bVar3 = bVar2;
                            bVar4 = bVar;
                            if (aVar2 != null) {
                                xdrVar.l(bVar3);
                                dVar.j = bVar4;
                                dVar.k = null;
                                dVar.l = bVar3;
                                dVar.o = 7;
                                if (hVar.c(dVar) != nm6Var) {
                                    bVar5 = bVar3;
                                    bVar6 = bVar4;
                                    if (!Intrinsics.d(bVar5, com.yandex.plus.home.plaque.repository.api.model.b.g)) {
                                        aVar5.b(bVar5, bVar6);
                                    }
                                    return Unit.a;
                                }
                            } else if (!nsa.m(aVar2.i) || !nsa.m(aVar2.h)) {
                                bVar7 = bVar4;
                                dVar.j = bVar7;
                                dVar.k = aVar2;
                                dVar.l = null;
                                dVar.o = 4;
                                break;
                            } else {
                                xdrVar.l(bVar3);
                                dVar.j = bVar4;
                                dVar.k = aVar2;
                                dVar.l = bVar3;
                                dVar.o = 2;
                                if (hVar.c(dVar) != nm6Var) {
                                    bVar7 = bVar4;
                                    if (!Intrinsics.d(bVar3, com.yandex.plus.home.plaque.repository.api.model.b.g)) {
                                        aVar5.b(bVar3, bVar7);
                                    }
                                    j = aVar2.h;
                                    dVar.j = bVar7;
                                    dVar.k = aVar2;
                                    dVar.l = null;
                                    dVar.o = 3;
                                    if (y2x.p(j, dVar) != nm6Var) {
                                        aVar3 = aVar2;
                                        aVar4 = com.yandex.plus.log.api.a.c;
                                        if (bVar9.b(aVar4)) {
                                            bVar9.c(aVar4, "PlaqueViewModel", "showAfterMillis ended for " + aVar3.a.a);
                                        }
                                        aVar2 = aVar3;
                                        dVar.j = bVar7;
                                        dVar.k = aVar2;
                                        dVar.l = null;
                                        dVar.o = 4;
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    case 1:
                        bVar3 = dVar.l;
                        aVar2 = dVar.k;
                        bVar4 = dVar.j;
                        qgg.h0(obj);
                        if (aVar2 != null) {
                        }
                        return nm6Var;
                    case 2:
                        bVar3 = dVar.l;
                        com.yandex.plus.home.plaque.repository.api.model.a aVar6 = dVar.k;
                        com.yandex.plus.home.plaque.feature.api.context.b bVar10 = dVar.j;
                        qgg.h0(obj);
                        aVar2 = aVar6;
                        bVar7 = bVar10;
                        if (!Intrinsics.d(bVar3, com.yandex.plus.home.plaque.repository.api.model.b.g)) {
                        }
                        j = aVar2.h;
                        dVar.j = bVar7;
                        dVar.k = aVar2;
                        dVar.l = null;
                        dVar.o = 3;
                        if (y2x.p(j, dVar) != nm6Var) {
                        }
                        return nm6Var;
                    case 3:
                        aVar3 = dVar.k;
                        bVar7 = dVar.j;
                        qgg.h0(obj);
                        aVar4 = com.yandex.plus.log.api.a.c;
                        if (bVar9.b(aVar4)) {
                        }
                        aVar2 = aVar3;
                        dVar.j = bVar7;
                        dVar.k = aVar2;
                        dVar.l = null;
                        dVar.o = 4;
                        break;
                    case 4:
                        com.yandex.plus.home.plaque.repository.api.model.a aVar7 = dVar.k;
                        bVar7 = dVar.j;
                        qgg.h0(obj);
                        aVar2 = aVar7;
                        xdrVar.l(aVar2);
                        aVar5.b(aVar2, bVar7);
                        x97.y(hVar.n, null, null, new com.yandex.plus.home.feature.webviews.internal.treasury.d(hVar, aVar2, continuation, 7), 3);
                        long j2 = aVar2.i;
                        dVar.j = null;
                        dVar.k = aVar2;
                        dVar.l = null;
                        dVar.o = 5;
                        break;
                    case 5:
                        com.yandex.plus.home.plaque.repository.api.model.a aVar8 = dVar.k;
                        qgg.h0(obj);
                        aVar2 = aVar8;
                        com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.c;
                        if (bVar9.b(aVar9)) {
                            bVar9.c(aVar9, "PlaqueViewModel", "closeAfterMillis ended for " + aVar2.a.a);
                        }
                        y yVar = hVar.a;
                        String str = aVar2.a.a;
                        str.getClass();
                        com.yandex.plus.log.api.b bVar11 = (com.yandex.plus.log.api.b) yVar.b;
                        if (bVar11.b(aVar9)) {
                            bVar11.c(aVar9, "PlaqueContextObservableImpl", ouj.k(')', "onPlaqueShown(", str));
                        }
                        p pVar = (p) yVar.a;
                        Set set = (Set) pVar.b;
                        xdr xdrVar2 = (xdr) pVar.d;
                        do {
                            value = xdrVar2.getValue();
                            bVar8 = (com.yandex.plus.home.plaque.feature.api.context.b) value;
                            set.add(str);
                        } while (!xdrVar2.k(value, com.yandex.plus.home.plaque.feature.api.context.b.a(bVar8, uah.j(bVar8.a, new Pair("PlaquesShown", CollectionsKt.A0(set))))));
                        x0q x0qVar = hVar.j;
                        com.yandex.plus.home.plaque.feature.api.entity.c cVar = new com.yandex.plus.home.plaque.feature.api.entity.c(aVar2.a.a);
                        dVar.j = null;
                        dVar.k = null;
                        dVar.l = null;
                        dVar.o = 6;
                        break;
                    case 6:
                        qgg.h0(obj);
                        return Unit.a;
                    case 7:
                        bVar5 = dVar.l;
                        bVar6 = dVar.j;
                        qgg.h0(obj);
                        if (!Intrinsics.d(bVar5, com.yandex.plus.home.plaque.repository.api.model.b.g)) {
                        }
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dVar = new d(hVar, cg6Var);
        Object obj2 = dVar.m;
        nm6 nm6Var2 = nm6.a;
        int i22 = 2;
        Continuation continuation2 = null;
        switch (dVar.o) {
        }
    }

    public static x b(x xVar, Map map) {
        if (xVar instanceof u) {
            u uVar = (u) xVar;
            String str = uVar.a;
            Boolean bool = (Boolean) map.get(str);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            c0 c0Var = uVar.b;
            com.yandex.plus.plaquesdk.plaque.api.models.a aVar = uVar.c;
            com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar2 = uVar.d;
            w wVar = uVar.e;
            str.getClass();
            aVar.getClass();
            xVar2.getClass();
            wVar.getClass();
            return new u(str, c0Var, aVar, xVar2, wVar, booleanValue);
        }
        if (xVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.m) {
            com.yandex.plus.plaquesdk.plaque.api.models.m mVar = (com.yandex.plus.plaquesdk.plaque.api.models.m) xVar;
            List list = mVar.e;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b((x) it.next(), map));
            }
            String str2 = mVar.a;
            c0 c0Var2 = mVar.b;
            com.yandex.plus.plaquesdk.plaque.api.models.a aVar2 = mVar.c;
            com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar3 = mVar.d;
            str2.getClass();
            aVar2.getClass();
            xVar3.getClass();
            return new com.yandex.plus.plaquesdk.plaque.api.models.m(str2, c0Var2, aVar2, xVar3, arrayList);
        }
        if (!(xVar instanceof r)) {
            if ((xVar instanceof n) || (xVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.p) || (xVar instanceof t)) {
                return xVar;
            }
            if (xVar instanceof v) {
                return xVar;
            }
            b6e.s();
            return null;
        }
        r rVar = (r) xVar;
        List list2 = rVar.e;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((x) it2.next(), map));
        }
        String str3 = rVar.a;
        c0 c0Var3 = rVar.b;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar3 = rVar.c;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar4 = rVar.d;
        int i = rVar.f;
        str3.getClass();
        aVar3.getClass();
        xVar4.getClass();
        return new r(str3, c0Var3, aVar3, xVar4, arrayList2, i);
    }

    public final Object c(d dVar) {
        Object h0 = zsd.h0(this.l, new lf2(2, 20, null), dVar);
        return h0 == nm6.a ? h0 : Unit.a;
    }
}
