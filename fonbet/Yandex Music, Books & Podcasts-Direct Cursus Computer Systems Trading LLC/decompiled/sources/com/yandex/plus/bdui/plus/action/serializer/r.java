package com.yandex.plus.bdui.plus.action.serializer;

import android.webkit.URLUtil;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.plus.bdui.plus.content.serializer.a1;
import com.yandex.plus.bdui.plus.content.serializer.a2;
import com.yandex.plus.bdui.plus.content.serializer.d1;
import com.yandex.plus.bdui.plus.content.serializer.d2;
import com.yandex.plus.bdui.plus.content.serializer.g1;
import com.yandex.plus.bdui.plus.content.serializer.g2;
import com.yandex.plus.bdui.plus.content.serializer.i1;
import com.yandex.plus.bdui.plus.content.serializer.i2;
import com.yandex.plus.bdui.plus.content.serializer.o1;
import com.yandex.plus.bdui.plus.content.serializer.r1;
import com.yandex.plus.bdui.plus.content.serializer.u1;
import com.yandex.plus.bdui.plus.content.serializer.x0;
import com.yandex.plus.bdui.plus.content.serializer.x1;
import defpackage.btf;
import defpackage.c5b;
import defpackage.e5b;
import defpackage.eg7;
import defpackage.h0l;
import defpackage.jyr;
import defpackage.l6b;
import defpackage.q5f;
import defpackage.quj;
import defpackage.s4f;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import defpackage.w4f;
import defpackage.x3f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends com.yandex.plus.bdui.plus.utils.a {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Function0 function0, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.log.api.b bVar, int i) {
        super(function0, q.Companion.serializer(), bVar, "PlusNextDocumentActionSerializer");
        this.e = i;
        function0.getClass();
        bVar.getClass();
        switch (i) {
            case 1:
                super(function0, v.Companion.serializer(), bVar, "PlusRemoteActionSerializer");
                this.f = fVar;
                break;
            case 2:
                super(function0, com.yandex.plus.bdui.plus.checkout.content.serializer.x.Companion.serializer(), bVar, "PlusPayButtonContentSerializer");
                this.f = fVar;
                break;
            case 3:
                super(function0, com.yandex.plus.bdui.plus.content.serializer.w.Companion.serializer(), bVar, "PlusAuthorizeContentSerializer");
                this.f = fVar;
                break;
            case 4:
                super(function0, d1.Companion.serializer(), bVar, "PlusTechnicalErrorFailureContentSerializer");
                this.f = fVar;
                break;
            case 5:
                super(function0, g2.Companion.serializer(), bVar, "PlusWebContentSerializer");
                this.f = fVar;
                break;
            case 6:
                super(function0, com.yandex.plus.bdui.plus.shared.serializer.c.Companion.serializer(), bVar, "PlusAnalyticsSharedDataSerializer");
                this.f = fVar;
                break;
            case 7:
                super(function0, com.yandex.plus.bdui.plus.shared.serializer.g.Companion.serializer(), bVar, "PlusPayloadSharedDataSerializer");
                this.f = fVar;
                break;
            default:
                this.f = fVar;
                break;
        }
    }

    @Override // com.yandex.plus.bdui.plus.utils.a
    public final Object b(l6b l6bVar, Object obj) {
        switch (this.e) {
            case 0:
                com.yandex.plus.bdui.plus.action.z zVar = (com.yandex.plus.bdui.plus.action.z) obj;
                zVar.getClass();
                l6bVar.getClass();
                return new q((com.yandex.plus.bdui.query.e) zVar.a, Boolean.valueOf(zVar.e));
            case 1:
                com.yandex.plus.bdui.plus.action.a0 a0Var = (com.yandex.plus.bdui.plus.action.a0) obj;
                a0Var.getClass();
                l6bVar.getClass();
                return new v((com.yandex.plus.bdui.query.b) a0Var.a, a0Var.e);
            case 2:
                ((com.yandex.plus.bdui.plus.checkout.content.b) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 3:
                ((com.yandex.plus.bdui.plus.content.a) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 4:
                ((com.yandex.plus.bdui.plus.content.j) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 5:
                ((com.yandex.plus.bdui.plus.content.r) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 6:
                com.yandex.plus.bdui.plus.shared.e eVar = (com.yandex.plus.bdui.plus.shared.e) obj;
                eVar.getClass();
                l6bVar.getClass();
                Map map = eVar.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Map map2 = (Map) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(map2.size()));
                    for (Map.Entry entry2 : map2.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), com.yandex.plus.bdui.plus.analytics.b.K(entry2.getValue()));
                    }
                    linkedHashMap.put(key, linkedHashMap2);
                }
                return new com.yandex.plus.bdui.plus.shared.serializer.c(linkedHashMap);
            case 7:
                com.yandex.plus.bdui.plus.shared.g gVar = (com.yandex.plus.bdui.plus.shared.g) obj;
                gVar.getClass();
                l6bVar.getClass();
                Map map3 = gVar.a;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(map3.size()));
                for (Map.Entry entry3 : map3.entrySet()) {
                    linkedHashMap3.put(entry3.getKey(), com.yandex.plus.bdui.plus.analytics.b.K(entry3.getValue()));
                }
                return new com.yandex.plus.bdui.plus.shared.serializer.g(linkedHashMap3);
            default:
                ((com.yandex.plus.bdui.plus.scaffold.a) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v33, types: [c5b] */
    @Override // com.yandex.plus.bdui.plus.utils.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, eg7 eg7Var) {
        com.yandex.plus.bdui.plus.content.p pVar;
        Pair pair;
        x3f r;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.e) {
            case 0:
                q qVar = (q) obj;
                qVar.getClass();
                eg7Var.getClass();
                com.yandex.plus.bdui.plus.content.controller.f fVar = (com.yandex.plus.bdui.plus.content.controller.f) this.f;
                com.yandex.plus.bdui.query.e eVar = qVar.a;
                boolean d = Intrinsics.d(qVar.b, Boolean.TRUE);
                fVar.getClass();
                eVar.getClass();
                com.yandex.plus.log.api.b bVar = this.b;
                bVar.getClass();
                return new com.yandex.plus.bdui.plus.action.z(fVar, eVar, d, bVar);
            case 1:
                v vVar = (v) obj;
                vVar.getClass();
                eg7Var.getClass();
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = (com.yandex.plus.bdui.plus.content.controller.f) this.f;
                com.yandex.plus.bdui.query.b bVar2 = vVar.a;
                com.yandex.plus.bdui.action.a aVar = vVar.b;
                fVar2.getClass();
                bVar2.getClass();
                com.yandex.plus.log.api.b bVar3 = this.b;
                bVar3.getClass();
                return new com.yandex.plus.bdui.plus.action.a0(fVar2, bVar2, aVar, bVar3);
            case 2:
                com.yandex.plus.bdui.plus.checkout.content.serializer.x xVar = (com.yandex.plus.bdui.plus.checkout.content.serializer.x) obj;
                xVar.getClass();
                eg7Var.getClass();
                com.yandex.plus.bdui.plus.checkout.content.serializer.d0 d0Var = xVar.a;
                com.yandex.plus.bdui.action.a aVar2 = d0Var.b.a;
                com.yandex.plus.bdui.plus.content.controller.f fVar3 = (com.yandex.plus.bdui.plus.content.controller.f) this.f;
                String str = d0Var.a.a;
                aVar2.getClass();
                fVar3.getClass();
                com.yandex.plus.log.api.b bVar4 = this.b;
                bVar4.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.b(new com.yandex.plus.bdui.plus.content.s(fVar3, str, aVar2, bVar4));
            case 3:
                com.yandex.plus.bdui.plus.content.serializer.w wVar = (com.yandex.plus.bdui.plus.content.serializer.w) obj;
                wVar.getClass();
                eg7Var.getClass();
                com.yandex.plus.bdui.plus.content.serializer.c0 c0Var = wVar.a;
                com.yandex.plus.bdui.action.a aVar3 = c0Var.b.a;
                com.yandex.plus.bdui.plus.content.controller.f fVar4 = (com.yandex.plus.bdui.plus.content.controller.f) this.f;
                com.yandex.plus.bdui.plus.content.serializer.z zVar = c0Var.a;
                String str2 = zVar.b;
                aVar3.getClass();
                fVar4.getClass();
                com.yandex.plus.log.api.b bVar5 = this.b;
                bVar5.getClass();
                com.yandex.plus.bdui.plus.content.s sVar = new com.yandex.plus.bdui.plus.content.s(fVar4, str2, aVar3, bVar5);
                com.yandex.plus.bdui.action.a aVar4 = c0Var.b.b;
                String str3 = zVar.c;
                aVar4.getClass();
                return new com.yandex.plus.bdui.plus.content.serializer.d0(this, wVar, sVar, new com.yandex.plus.bdui.plus.content.s(fVar4, str3, aVar4, bVar5));
            case 4:
                d1 d1Var = (d1) obj;
                d1Var.getClass();
                eg7Var.getClass();
                g1 g1Var = d1Var.a;
                com.yandex.plus.bdui.action.a aVar5 = g1Var.b.a;
                com.yandex.plus.bdui.plus.content.controller.f fVar5 = (com.yandex.plus.bdui.plus.content.controller.f) this.f;
                a1 a1Var = g1Var.a;
                String str4 = a1Var.c;
                aVar5.getClass();
                fVar5.getClass();
                com.yandex.plus.log.api.b bVar6 = this.b;
                bVar6.getClass();
                com.yandex.plus.bdui.plus.content.s sVar2 = new com.yandex.plus.bdui.plus.content.s(fVar5, str4, aVar5, bVar6);
                x0 x0Var = g1Var.b;
                com.yandex.plus.bdui.action.a aVar6 = x0Var.b;
                return new com.yandex.plus.bdui.plus.content.j(new i1(this, d1Var, sVar2, aVar6 != null ? new com.yandex.plus.bdui.plus.content.s(fVar5, a1Var.d, aVar6, bVar6) : null, x0Var.c));
            case 5:
                g2 g2Var = (g2) obj;
                com.yandex.plus.bdui.plus.content.controller.f fVar6 = (com.yandex.plus.bdui.plus.content.controller.f) this.f;
                g2Var.getClass();
                eg7Var.getClass();
                x1 x1Var = g2Var.a;
                u1 u1Var = x1Var.f;
                o1 o1Var = u1Var.e;
                a2 a2Var = u1Var.d;
                StringBuilder sb = new StringBuilder();
                String str5 = x1Var.a;
                sb.append(str5);
                String str6 = x1Var.b;
                sb.append(str6);
                if (!URLUtil.isValidUrl(sb.toString())) {
                    throw new com.yandex.plus.bdui.plus.utils.b("Entry url is invalid", null, o1Var.b, 2);
                }
                String str7 = a2Var.a;
                int hashCode = str7.hashCode();
                if (hashCode == 1145383973) {
                    if (str7.equals("ON_READY_BRIDGE")) {
                        pVar = com.yandex.plus.bdui.plus.content.p.b;
                    }
                    pVar = null;
                } else if (hashCode != 1534878333) {
                    if (hashCode == 2052432322 && str7.equals("ON_PAGE_FINISHED")) {
                        pVar = com.yandex.plus.bdui.plus.content.p.a;
                    }
                    pVar = null;
                } else {
                    if (str7.equals("CLIENT_BRIDGE")) {
                        pVar = com.yandex.plus.bdui.plus.content.p.c;
                    }
                    pVar = null;
                }
                if (pVar == null) {
                    throw new com.yandex.plus.bdui.plus.utils.b("Unknown ready strategy", null, o1Var.b, 2);
                }
                com.yandex.plus.log.api.b bVar7 = this.b;
                com.yandex.plus.bdui.plus.content.n nVar = new com.yandex.plus.bdui.plus.content.n(fVar6, str5, str6, bVar7);
                d2 d2Var = u1Var.b;
                com.yandex.plus.bdui.plus.content.q qVar2 = d2Var != null ? new com.yandex.plus.bdui.plus.content.q(d2Var.a, d2Var.b) : new com.yandex.plus.bdui.plus.content.q(1000L, 1000L);
                com.yandex.plus.bdui.plus.content.o oVar = new com.yandex.plus.bdui.plus.content.o(a2Var.b, pVar);
                com.yandex.plus.bdui.action.a aVar7 = o1Var.b;
                r1 r1Var = o1Var.a;
                String str8 = r1Var.d;
                aVar7.getClass();
                i2 i2Var = new i2((com.yandex.plus.bdui.plus.content.controller.f) this.f, r1Var.a, r1Var.b, r1Var.c, new com.yandex.plus.bdui.plus.content.s(fVar6, str8, aVar7, bVar7), this.b);
                int i = u1Var.a;
                Integer num = u1Var.c;
                com.yandex.plus.bdui.plus.content.l lVar = new com.yandex.plus.bdui.plus.content.l(i, qVar2, num != null ? num.intValue() : 30, oVar, i2Var);
                boolean z = x1Var.c;
                boolean z2 = x1Var.d;
                List list = x1Var.e;
                Map map = x1Var.g;
                if (map == null) {
                    map = e5b.a;
                    map.getClass();
                }
                Map map2 = map;
                Map map3 = x1Var.h;
                if (map3 == null) {
                    map3 = e5b.a;
                    map3.getClass();
                }
                Map map4 = map3;
                Map map5 = x1Var.i;
                if (map5 == null) {
                    map5 = e5b.a;
                    map5.getClass();
                }
                return new com.yandex.plus.bdui.plus.content.r(nVar, z, z2, list, lVar, map2, map4, map5, x1Var.j.a);
            case 6:
                com.yandex.plus.bdui.plus.shared.serializer.c cVar = (com.yandex.plus.bdui.plus.shared.serializer.c) obj;
                cVar.getClass();
                eg7Var.getClass();
                Map map6 = cVar.a;
                Map map7 = null;
                if (map6 != null) {
                    ArrayList u = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1.u(map6, new v0(12));
                    if (u.isEmpty()) {
                        u = null;
                    }
                    if (u != null) {
                        map7 = uah.n(u);
                    }
                }
                com.yandex.plus.bdui.plus.content.controller.f fVar7 = (com.yandex.plus.bdui.plus.content.controller.f) this.f;
                if (map7 == null) {
                    map7 = e5b.a;
                    map7.getClass();
                }
                return new com.yandex.plus.bdui.plus.shared.e(fVar7, map7, this.b);
            case 7:
                com.yandex.plus.bdui.plus.shared.serializer.g gVar = (com.yandex.plus.bdui.plus.shared.serializer.g) obj;
                gVar.getClass();
                eg7Var.getClass();
                Map map8 = gVar.a;
                Map map9 = null;
                if (map8 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : map8.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            ((String) key).getClass();
                            Object t = com.yandex.plus.bdui.plus.analytics.b.t((w4f) value);
                            if (t != null) {
                                pair = new Pair(key, t);
                                if (pair == null) {
                                    arrayList3.add(pair);
                                }
                            }
                        }
                        pair = null;
                        if (pair == null) {
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        arrayList3 = null;
                    }
                    if (arrayList3 != null) {
                        map9 = uah.n(arrayList3);
                    }
                }
                com.yandex.plus.bdui.plus.content.controller.f fVar8 = (com.yandex.plus.bdui.plus.content.controller.f) this.f;
                if (map9 == null) {
                    map9 = e5b.a;
                    map9.getClass();
                }
                return new com.yandex.plus.bdui.plus.shared.g(fVar8, map9, this.b);
            default:
                com.yandex.plus.bdui.plus.scaffold.serializer.f fVar9 = (com.yandex.plus.bdui.plus.scaffold.serializer.f) obj;
                fVar9.getClass();
                eg7Var.getClass();
                com.yandex.plus.bdui.plus.scaffold.serializer.c cVar2 = fVar9.a;
                List list2 = cVar2.a;
                List list3 = cVar2.b;
                if (list2.isEmpty() && list3.isEmpty()) {
                    ?? r0 = c5b.a;
                    arrayList = r0;
                    arrayList2 = r0;
                } else {
                    com.yandex.plus.bdui.plus.scaffold.utils.a aVar8 = (com.yandex.plus.bdui.plus.scaffold.utils.a) ((jyr) this.f).getValue();
                    aVar8.getClass();
                    s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
                    if (s4fVar == null || (r = s4fVar.d()) == null) {
                        r = quj.r(x3f.d, new com.yandex.passport.internal.ui.bouncer.roundabout.k(18, eg7Var.a()));
                    }
                    com.yandex.passport.internal.flags.experiments.p pVar2 = new com.yandex.passport.internal.flags.experiments.p(r, aVar8.b, aVar8.a);
                    List list4 = cVar2.a;
                    ArrayList arrayList4 = new ArrayList(v75.o(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(pVar2.y((q5f) it.next()));
                    }
                    List list5 = list3;
                    arrayList = new ArrayList(v75.o(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(pVar2.y((q5f) it2.next()));
                    }
                    arrayList2 = arrayList4;
                }
                return new com.yandex.plus.bdui.plus.scaffold.a(arrayList2, arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.yandex.plus.bdui.s sVar, Function0 function0, List list, com.yandex.plus.log.api.b bVar) {
        super(function0, com.yandex.plus.bdui.plus.scaffold.serializer.f.Companion.serializer(), bVar, "PlusTopBottomScaffoldSerializer");
        this.e = 8;
        sVar.getClass();
        function0.getClass();
        list.getClass();
        bVar.getClass();
        this.f = btf.b(new h0l(sVar, function0, list, bVar, 12));
    }
}
