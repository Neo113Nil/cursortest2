package com.yandex.plus.acquisition.sdk.pay.impl.purchase;

import com.yandex.plus.acquisition.sdk.pay.common.api.c;
import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.l;
import com.yandex.plus.acquisition.sdk.pay.common.api.m;
import com.yandex.plus.acquisition.sdk.pay.common.api.n;
import com.yandex.plus.acquisition.sdk.pay.common.api.o;
import com.yandex.plus.acquisition.sdk.pay.common.api.p;
import com.yandex.plus.acquisition.sdk.pay.common.api.q;
import com.yandex.plus.acquisition.sdk.pay.common.api.r;
import com.yandex.plus.acquisition.sdk.pay.common.api.s;
import com.yandex.plus.pay.api.analytics.d;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.api.feature.payment.e;
import com.yandex.plus.pay.ui.api.feature.payment.f;
import com.yandex.plus.pay.ui.api.feature.payment.g;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.xq0;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements c {
    public final com.yandex.plus.pay.ui.core.a a;
    public final com.yandex.plus.acquisition.sdk.pay.impl.analytics.b b;
    public final com.yandex.plus.acquisition.sdk.pay.impl.providers.a c;

    public b(com.yandex.plus.pay.ui.core.a aVar, com.yandex.plus.acquisition.sdk.pay.impl.analytics.b bVar, com.yandex.plus.acquisition.sdk.pay.impl.providers.a aVar2) {
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.a = aVar;
        this.b = bVar;
        this.c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(k kVar, com.yandex.plus.acquisition.sdk.pay.common.api.a aVar, Map map, cg6 cg6Var) {
        a aVar2;
        Object obj;
        nm6 nm6Var;
        int i;
        com.yandex.plus.pay.ui.tarifficator.api.b bVar;
        d dVar;
        Object obj2;
        PlusPayCompositeOffers.Offer offer;
        int i2;
        b bVar2;
        k kVar2;
        b bVar3;
        com.yandex.plus.pay.ui.core.api.tarifficator.d dVar2;
        if (cg6Var instanceof a) {
            aVar2 = (a) cg6Var;
            int i3 = aVar2.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar2.r = i3 - Integer.MIN_VALUE;
                obj = aVar2.p;
                nm6Var = nm6.a;
                i = aVar2.r;
                if (i != 0) {
                    qgg.h0(obj);
                    q5b q5bVar = q5b.a;
                    com.yandex.plus.pay.ui.tarifficator.api.a aVar3 = com.yandex.plus.pay.ui.tarifficator.api.a.b;
                    e5b.a.getClass();
                    if (kVar.f) {
                        aVar3 = com.yandex.plus.pay.ui.tarifficator.api.a.a;
                    }
                    map.getClass();
                    bVar = new com.yandex.plus.pay.ui.tarifficator.api.b(q5bVar, aVar3, map);
                    String str = aVar.b;
                    Map map2 = aVar.c;
                    this.b.getClass();
                    d a = com.yandex.plus.acquisition.sdk.pay.impl.analytics.b.a(str, map2);
                    PlusPayCompositeOffers.Offer a2 = ((com.yandex.plus.acquisition.sdk.pay.impl.providers.b) this.c).a(kVar);
                    if (a2 != null) {
                        aVar2.j = kVar;
                        aVar2.k = bVar;
                        aVar2.l = a;
                        aVar2.m = a2;
                        aVar2.n = this;
                        aVar2.o = 0;
                        aVar2.r = 1;
                        com.yandex.plus.pay.ui.core.internal.a a3 = this.a.a();
                        if (a3 != nm6Var) {
                            dVar = a;
                            obj2 = a3;
                            offer = a2;
                            i2 = 0;
                            bVar2 = this;
                        }
                        return nm6Var;
                    }
                    return l.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar3 = aVar2.n;
                    kVar2 = aVar2.j;
                    qgg.h0(obj);
                    dVar2 = (com.yandex.plus.pay.ui.core.api.tarifficator.d) obj;
                    bVar3.getClass();
                    if (!(dVar2 instanceof com.yandex.plus.pay.ui.core.api.tarifficator.c)) {
                        return new s(kVar2);
                    }
                    if (!(dVar2 instanceof com.yandex.plus.pay.ui.core.api.tarifficator.b)) {
                        if (!(dVar2 instanceof com.yandex.plus.pay.ui.core.api.tarifficator.a)) {
                            b6e.s();
                            return null;
                        }
                        return l.a;
                    }
                    g gVar = ((com.yandex.plus.pay.ui.core.api.tarifficator.b) dVar2).a;
                    if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.a) {
                        String lowerCase = ((com.yandex.plus.pay.ui.api.feature.payment.a) gVar).a.name().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        return new m(lowerCase);
                    }
                    if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.c) {
                        String lowerCase2 = ((com.yandex.plus.pay.ui.api.feature.payment.c) gVar).a.name().toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        return new o(lowerCase2);
                    }
                    if (Intrinsics.d(gVar, com.yandex.plus.pay.ui.api.feature.payment.b.a)) {
                        return n.a;
                    }
                    if (!(gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.d)) {
                        if (Intrinsics.d(gVar, e.a)) {
                            return q.a;
                        }
                        if (Intrinsics.d(gVar, f.a)) {
                            return r.a;
                        }
                        b6e.s();
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("message = ");
                    com.yandex.plus.core.data.pay.k kVar3 = ((com.yandex.plus.pay.ui.api.feature.payment.d) gVar).a;
                    sb.append(kVar3.a);
                    sb.append(", code = ");
                    sb.append(kVar3.b);
                    sb.append(", status = ");
                    sb.append(kVar3.c);
                    sb.append(", kind = ");
                    sb.append(kVar3.d);
                    sb.append(", trigger = ");
                    sb.append(kVar3.e);
                    return new p(sb.toString());
                }
                int i4 = aVar2.o;
                bVar2 = aVar2.n;
                PlusPayCompositeOffers.Offer offer2 = aVar2.m;
                d dVar3 = aVar2.l;
                com.yandex.plus.pay.ui.tarifficator.api.b bVar4 = aVar2.k;
                k kVar4 = aVar2.j;
                qgg.h0(obj);
                i2 = i4;
                kVar = kVar4;
                bVar = bVar4;
                dVar = dVar3;
                obj2 = obj;
                offer = offer2;
                com.yandex.plus.pay.ui.tarifficator.api.e C = com.yandex.plus.bdui.flex.ui.a.C((com.yandex.plus.pay.ui.core.internal.a) obj2);
                aVar2.j = kVar;
                aVar2.k = null;
                aVar2.l = null;
                aVar2.m = null;
                aVar2.n = bVar2;
                aVar2.o = i2;
                aVar2.r = 2;
                obj = ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.e) C).a(offer, dVar, bVar, aVar2);
                if (obj != nm6Var) {
                    b bVar5 = bVar2;
                    kVar2 = kVar;
                    bVar3 = bVar5;
                    dVar2 = (com.yandex.plus.pay.ui.core.api.tarifficator.d) obj;
                    bVar3.getClass();
                    if (!(dVar2 instanceof com.yandex.plus.pay.ui.core.api.tarifficator.c)) {
                    }
                }
                return nm6Var;
            }
        }
        aVar2 = new a(this, cg6Var);
        obj = aVar2.p;
        nm6Var = nm6.a;
        i = aVar2.r;
        if (i != 0) {
        }
        com.yandex.plus.pay.ui.tarifficator.api.e C2 = com.yandex.plus.bdui.flex.ui.a.C((com.yandex.plus.pay.ui.core.internal.a) obj2);
        aVar2.j = kVar;
        aVar2.k = null;
        aVar2.l = null;
        aVar2.m = null;
        aVar2.n = bVar2;
        aVar2.o = i2;
        aVar2.r = 2;
        obj = ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.e) C2).a(offer, dVar, bVar, aVar2);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }
}
