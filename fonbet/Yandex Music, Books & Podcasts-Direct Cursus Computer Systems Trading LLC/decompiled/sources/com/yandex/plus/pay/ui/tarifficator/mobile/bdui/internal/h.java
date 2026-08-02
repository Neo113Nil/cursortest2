package com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.i;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.j;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.k;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.l;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.m;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.n;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.o;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.p;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {
    public final String a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final u c;

    public h(String str, com.yandex.plus.pay.log.impl.b bVar, u uVar) {
        str.getClass();
        bVar.getClass();
        uVar.getClass();
        this.a = str;
        this.b = bVar;
        this.c = uVar;
    }

    public static p c(com.yandex.plus.pay.ui.tarifficator.api.d dVar) {
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            return p.a;
        }
        if (ordinal == 1) {
            return p.c;
        }
        if (ordinal == 2) {
            return p.d;
        }
        if (ordinal == 3) {
            return p.e;
        }
        if (ordinal == 4) {
            return p.f;
        }
        b6e.s();
        return null;
    }

    public static com.yandex.plus.pay.ui.core.api.tarifficator.d d(l lVar) {
        if (lVar instanceof j) {
            j jVar = (j) lVar;
            return new com.yandex.plus.pay.ui.core.api.tarifficator.b(jVar.b, jVar.c, jVar.a, 8);
        }
        if (lVar instanceof k) {
            k kVar = (k) lVar;
            return new com.yandex.plus.pay.ui.core.api.tarifficator.c(kVar.a, kVar.b);
        }
        if (lVar instanceof i) {
            return new com.yandex.plus.pay.ui.core.api.tarifficator.a(((i) lVar).a);
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a5, code lost:
    
        if (r1 == r5) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0060  */
    /* JADX WARN: Type inference failed for: r7v16, types: [com.yandex.plus.pay.api.analytics.d, com.yandex.plus.pay.api.model.PlusPayCompositeOffers$Offer, com.yandex.plus.pay.ui.tarifficator.api.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, com.yandex.plus.pay.api.analytics.d dVar, com.yandex.plus.pay.ui.tarifficator.api.b bVar, boolean z, cg6 cg6Var) {
        f fVar;
        int i;
        boolean z2;
        l lVar;
        com.yandex.plus.pay.api.analytics.d dVar2;
        o oVar;
        PlusPayCompositeOffers.Offer offer2;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.d dVar3;
        Object u;
        PlusPayCompositeOffers.Offer offer3;
        l lVar2;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.b bVar2;
        Object u2;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c cVar;
        com.yandex.plus.pay.ui.tarifficator.api.b bVar3 = bVar;
        boolean z3 = z;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.q = i2 - Integer.MIN_VALUE;
                Object obj = fVar.o;
                nm6 nm6Var = nm6.a;
                i = fVar.q;
                String str = this.a;
                u uVar = this.c;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z3) {
                        this.b.getClass();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        UUID randomUUID = UUID.randomUUID();
                        randomUUID.getClass();
                        Map map = bVar3.c;
                        Set set = bVar3.a;
                        lVar = null;
                        ArrayList arrayList = new ArrayList(v75.o(set, 10));
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            arrayList.add(c((com.yandex.plus.pay.ui.tarifficator.api.d) it.next()));
                        }
                        Set A0 = CollectionsKt.A0(arrayList);
                        int ordinal = bVar3.b.ordinal();
                        if (ordinal == 0) {
                            dVar3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.d.a;
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            dVar3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.d.b;
                        }
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.e eVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.e(randomUUID, offer, dVar, map, A0, dVar3, null);
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.f fVar2 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.f(str, 1);
                        fVar.j = offer;
                        dVar2 = dVar;
                        fVar.k = dVar2;
                        fVar.l = bVar3;
                        fVar.m = z3;
                        fVar.n = z2;
                        fVar.q = 1;
                        u = uVar.u(fVar2, eVar, fVar);
                        if (u != nm6Var) {
                            offer3 = offer;
                        }
                        return nm6Var;
                    }
                    lVar = null;
                    dVar2 = dVar;
                    oVar = null;
                    offer2 = offer;
                    com.yandex.plus.pay.api.analytics.d dVar4 = dVar2;
                    if (oVar instanceof n) {
                        lVar2 = ((n) oVar).a;
                    } else {
                        if (!Intrinsics.d(oVar, m.a) && oVar != null) {
                            l lVar3 = lVar;
                            b6e.s();
                            return lVar3;
                        }
                        lVar2 = lVar;
                    }
                    if (lVar2 != null) {
                        return d(lVar2);
                    }
                    UUID randomUUID2 = UUID.randomUUID();
                    randomUUID2.getClass();
                    Map map2 = bVar3.c;
                    Set set2 = bVar3.a;
                    ArrayList arrayList2 = new ArrayList(v75.o(set2, 10));
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        int ordinal2 = ((com.yandex.plus.pay.ui.tarifficator.api.d) it2.next()).ordinal();
                        if (ordinal2 == 0) {
                            cVar = com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.a;
                        } else if (ordinal2 == 1) {
                            cVar = com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.c;
                        } else if (ordinal2 == 2) {
                            cVar = com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.d;
                        } else if (ordinal2 == 3) {
                            cVar = com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.e;
                        } else {
                            if (ordinal2 != 4) {
                                b6e.s();
                                return lVar;
                            }
                            cVar = com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.c.f;
                        }
                        arrayList2.add(cVar);
                    }
                    Set A02 = CollectionsKt.A0(arrayList2);
                    int ordinal3 = bVar3.b.ordinal();
                    if (ordinal3 == 0) {
                        bVar2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.b.a;
                    } else {
                        if (ordinal3 != 1) {
                            b6e.s();
                            return lVar;
                        }
                        bVar2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.b.b;
                    }
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar5 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d(randomUUID2, offer2, dVar4, map2, A02, bVar2, null);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.f fVar3 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.f(str, 0);
                    ?? r7 = lVar;
                    fVar.j = r7;
                    fVar.k = r7;
                    fVar.l = r7;
                    fVar.m = z3;
                    fVar.n = z2;
                    fVar.q = 2;
                    u2 = uVar.u(fVar3, dVar5, fVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        u2 = ((z7o) obj).a;
                        r7o r7oVar = z7o.b;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.k kVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.k) (u2 instanceof t7o ? null : u2);
                        if (kVar == null) {
                            return new com.yandex.plus.pay.ui.core.api.tarifficator.a(null);
                        }
                        if (kVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.h) {
                            com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.h hVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.h) kVar;
                            return new com.yandex.plus.pay.ui.core.api.tarifficator.b(hVar.a, hVar.b, null, 12);
                        }
                        if (kVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.j) {
                            return new com.yandex.plus.pay.ui.core.api.tarifficator.c(null, ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.j) kVar).b);
                        }
                        if (kVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.g) {
                            return new com.yandex.plus.pay.ui.core.api.tarifficator.a(null);
                        }
                        b6e.s();
                        return null;
                    }
                    boolean z4 = fVar.n;
                    z3 = fVar.m;
                    com.yandex.plus.pay.ui.tarifficator.api.b bVar4 = fVar.l;
                    com.yandex.plus.pay.api.analytics.d dVar6 = fVar.k;
                    offer3 = fVar.j;
                    qgg.h0(obj);
                    Object obj2 = ((z7o) obj).a;
                    z2 = z4;
                    bVar3 = bVar4;
                    u = obj2;
                    lVar = null;
                    dVar2 = dVar6;
                }
                r7o r7oVar2 = z7o.b;
                if (u instanceof t7o) {
                    u = lVar;
                }
                oVar = (o) u;
                offer2 = offer3;
                com.yandex.plus.pay.api.analytics.d dVar42 = dVar2;
                if (oVar instanceof n) {
                }
                if (lVar2 != null) {
                }
            }
        }
        fVar = new f(this, cg6Var);
        Object obj3 = fVar.o;
        nm6 nm6Var2 = nm6.a;
        i = fVar.q;
        String str2 = this.a;
        u uVar2 = this.c;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (u instanceof t7o) {
        }
        oVar = (o) u;
        offer2 = offer3;
        com.yandex.plus.pay.api.analytics.d dVar422 = dVar2;
        if (oVar instanceof n) {
        }
        if (lVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.plus.pay.ui.tarifficator.api.c cVar, com.yandex.plus.pay.api.analytics.c cVar2, cg6 cg6Var) {
        g gVar;
        int i;
        Object u;
        o oVar;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    UUID randomUUID = UUID.randomUUID();
                    randomUUID.getClass();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.g gVar2 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.g(cVar.a, cVar.b, null, cVar.c);
                    Map map = cVar.d;
                    Set set = cVar.e;
                    ArrayList arrayList = new ArrayList(v75.o(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(c((com.yandex.plus.pay.ui.tarifficator.api.d) it.next()));
                    }
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h hVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h(randomUUID, gVar2, map, CollectionsKt.A0(arrayList), true, cVar2);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.f fVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.f(this.a, 2);
                    gVar.l = 1;
                    u = this.c.u(fVar, hVar, gVar);
                    if (u == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    u = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (u instanceof t7o) {
                    u = null;
                }
                oVar = (o) u;
                if (!(oVar instanceof n)) {
                    return d(((n) oVar).a);
                }
                if (Intrinsics.d(oVar, m.a)) {
                    return new com.yandex.plus.pay.ui.core.api.tarifficator.b(com.yandex.plus.pay.ui.api.feature.payment.f.a, true, null, 4);
                }
                if (oVar == null) {
                    return new com.yandex.plus.pay.ui.core.api.tarifficator.a(null);
                }
                b6e.s();
                return null;
            }
        }
        gVar = new g(this, cg6Var);
        Object obj2 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (u instanceof t7o) {
        }
        oVar = (o) u;
        if (!(oVar instanceof n)) {
        }
    }
}
