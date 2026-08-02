package com.yandex.passport.internal.ui.bouncer.model.middleware;

import android.text.TextUtils;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.ui.bouncer.model.l2;
import com.yandex.passport.internal.ui.bouncer.model.m2;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.v75;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class l0 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.usecase.ui.h0 a;
    public final com.yandex.passport.internal.usecase.ui.d0 b;
    public final com.yandex.passport.internal.badges.e c;
    public final com.yandex.passport.internal.badges.h d;
    public final com.yandex.passport.internal.usecase.b1 e;
    public final com.yandex.passport.internal.flags.i f;

    public l0(com.yandex.passport.internal.usecase.ui.h0 h0Var, com.yandex.passport.internal.usecase.ui.d0 d0Var, com.yandex.passport.internal.badges.e eVar, com.yandex.passport.internal.badges.h hVar, com.yandex.passport.internal.usecase.b1 b1Var, com.yandex.passport.internal.flags.i iVar) {
        h0Var.getClass();
        d0Var.getClass();
        eVar.getClass();
        hVar.getClass();
        b1Var.getClass();
        iVar.getClass();
        this.a = h0Var;
        this.b = d0Var;
        this.c = eVar;
        this.d = hVar;
        this.e = b1Var;
        this.f = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x032c A[LOOP:0: B:15:0x0326->B:17:0x032c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x037c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0152  */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0250 -> B:33:0x0255). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x026d -> B:37:0x026b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l0 l0Var, com.yandex.passport.internal.ui.bouncer.model.r rVar, cg6 cg6Var) {
        k0 k0Var;
        nm6 nm6Var;
        int i;
        com.yandex.passport.internal.entities.k l;
        com.yandex.passport.internal.properties.l lVar;
        com.yandex.passport.internal.entities.k kVar;
        com.yandex.passport.internal.usecase.ui.e0 e0Var;
        z1 z1Var;
        com.yandex.passport.internal.l f;
        Object g;
        com.yandex.passport.internal.l lVar2;
        LinkedHashMap linkedHashMap;
        Iterator it;
        List list;
        k0 k0Var2;
        com.yandex.passport.internal.properties.l lVar3;
        com.yandex.passport.internal.entities.k kVar2;
        com.yandex.passport.internal.usecase.ui.e0 e0Var2;
        com.yandex.passport.internal.l lVar4;
        List list2;
        int i2;
        List list3;
        List list4;
        com.yandex.passport.internal.l lVar5;
        Iterator it2;
        LinkedHashMap linkedHashMap2;
        com.yandex.passport.internal.properties.l lVar6;
        com.yandex.passport.internal.l lVar7;
        int i3;
        int i4;
        com.yandex.passport.internal.l lVar8;
        LinkedHashMap linkedHashMap3;
        com.yandex.passport.internal.l lVar9;
        com.yandex.passport.internal.l lVar10;
        LinkedHashMap linkedHashMap4;
        com.yandex.passport.internal.l lVar11;
        z1 z1Var2;
        Object g2;
        String str;
        if (cg6Var instanceof k0) {
            k0Var = (k0) cg6Var;
            int i5 = k0Var.x;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                k0Var.x = i5 - Integer.MIN_VALUE;
                Object obj = k0Var.v;
                nm6Var = nm6.a;
                i = k0Var.x;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.properties.l lVar12 = rVar.a;
                    com.yandex.passport.internal.entities.k kVar3 = lVar12.d;
                    boolean z = lVar12.p.e;
                    com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
                    jVar.L(kVar3);
                    com.yandex.passport.api.n nVar = com.yandex.passport.api.n.PHONISH;
                    nVar.getClass();
                    com.yandex.passport.common.bitflag.b bVar = (com.yandex.passport.common.bitflag.b) jVar.e;
                    com.yandex.passport.api.n[] values = com.yandex.passport.api.n.values();
                    ArrayList arrayList = new ArrayList();
                    for (com.yandex.passport.api.n nVar2 : values) {
                        if (bVar.a.a(nVar2.a)) {
                            arrayList.add(nVar2);
                        }
                    }
                    EnumSet noneOf = EnumSet.noneOf(com.yandex.passport.api.n.class);
                    noneOf.addAll(arrayList);
                    if (noneOf.size() != 1 || CollectionsKt.P(noneOf) != nVar) {
                        com.yandex.passport.api.n nVar3 = com.yandex.passport.api.n.SOCIAL;
                        nVar3.getClass();
                        bVar.a(nVar3, z);
                        jVar.y(com.yandex.passport.api.n.LITE);
                    }
                    l = jVar.l();
                    com.yandex.passport.internal.usecase.ui.h0 h0Var = l0Var.a;
                    com.yandex.passport.internal.usecase.ui.f0 f0Var = new com.yandex.passport.internal.usecase.ui.f0(l);
                    k0Var.j = lVar12;
                    k0Var.k = l;
                    k0Var.x = 1;
                    Object g3 = h0Var.g(f0Var, k0Var);
                    if (g3 != nm6Var) {
                        lVar = lVar12;
                        obj = g3;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    l = k0Var.k;
                    com.yandex.passport.internal.properties.l lVar13 = k0Var.j;
                    qgg.h0(obj);
                    lVar = lVar13;
                } else {
                    if (i == 2) {
                        lVar2 = k0Var.m;
                        e0Var = k0Var.l;
                        kVar = k0Var.k;
                        lVar = k0Var.j;
                        qgg.h0(obj);
                        ArrayList arrayList2 = new ArrayList();
                        linkedHashMap = new LinkedHashMap();
                        it = e0Var.b.a.iterator();
                        com.yandex.passport.internal.usecase.ui.e0 e0Var3 = e0Var;
                        list = (List) obj;
                        k0Var2 = k0Var;
                        lVar3 = lVar;
                        kVar2 = kVar;
                        e0Var2 = e0Var3;
                        lVar4 = lVar2;
                        list2 = arrayList2;
                        i2 = 0;
                        if (it.hasNext()) {
                        }
                        return nm6Var;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            lVar11 = k0Var.q;
                            Map map = k0Var.p;
                            list2 = k0Var.o;
                            list = k0Var.n;
                            lVar10 = k0Var.m;
                            lVar3 = k0Var.j;
                            qgg.h0(obj);
                            linkedHashMap4 = map;
                            List list5 = list2;
                            for (com.yandex.passport.internal.entities.n nVar4 : (Iterable) obj) {
                                com.yandex.passport.common.core.f fVar = nVar4.a;
                                Set set = nVar4.h;
                                list5.add(new m2(fVar, nVar4.b, nVar4.d, nVar4.e, nVar4.f, nVar4.g, nVar4.c, set.contains("has_plus"), com.yandex.passport.internal.ui.a.t(list, set)));
                                lVar11 = lVar11;
                            }
                            lVar9 = lVar11;
                            linkedHashMap3 = linkedHashMap4;
                            lVar8 = lVar10;
                            com.yandex.passport.internal.properties.l lVar14 = lVar3;
                            return new com.yandex.passport.internal.ui.bouncer.model.b1(lVar14, list2, linkedHashMap3, lVar8, lVar9, (lVar14.g == null && lVar8 != null) || !TextUtils.isEmpty(lVar14.k));
                        }
                        i4 = k0Var.t;
                        lVar7 = k0Var.s;
                        it2 = k0Var.r;
                        Map map2 = k0Var.p;
                        List list6 = k0Var.o;
                        list3 = k0Var.n;
                        com.yandex.passport.internal.l lVar15 = k0Var.m;
                        e0Var2 = k0Var.l;
                        kVar2 = k0Var.k;
                        lVar6 = k0Var.j;
                        qgg.h0(obj);
                        LinkedHashMap linkedHashMap5 = map2;
                        Object obj2 = ((z7o) obj).a;
                        if (!(obj2 instanceof t7o)) {
                            linkedHashMap5.put(lVar7.j, (List) obj2);
                        }
                        k0Var2 = k0Var;
                        lVar4 = lVar15;
                        lVar3 = lVar6;
                        it = it2;
                        linkedHashMap = linkedHashMap5;
                        i2 = i4;
                        list2 = list6;
                        list = list3;
                        if (it.hasNext()) {
                            com.yandex.passport.internal.l lVar16 = (com.yandex.passport.internal.l) it.next();
                            com.yandex.passport.internal.d dVar = e0Var2.a;
                            k0Var2.j = lVar3;
                            k0Var2.k = kVar2;
                            k0Var2.l = e0Var2;
                            k0Var2.m = lVar4;
                            k0Var2.n = list;
                            k0Var2.o = list2;
                            k0Var2.p = linkedHashMap;
                            k0Var2.q = null;
                            k0Var2.r = it;
                            k0Var2.s = lVar16;
                            k0Var2.t = i2;
                            k0Var2.u = 0;
                            k0Var2.x = 3;
                            if (list.isEmpty()) {
                                g2 = c5b.a;
                            } else {
                                com.yandex.passport.internal.b a = dVar.a(lVar16.g);
                                g2 = (a == null || (str = a.d) == null) ? c5b.a : l0Var.d.g(new com.yandex.passport.internal.badges.g(str, list), k0Var2);
                            }
                            if (g2 != nm6Var) {
                                com.yandex.passport.internal.properties.l lVar17 = lVar3;
                                k0Var = k0Var2;
                                obj = g2;
                                linkedHashMap2 = linkedHashMap;
                                lVar6 = lVar17;
                                lVar5 = lVar4;
                                lVar7 = lVar16;
                                list4 = list2;
                                list3 = list;
                                i4 = i2;
                                i3 = 0;
                                it2 = it;
                                list4.add(new l2(lVar7, (List) obj));
                                if (lVar7.e.x) {
                                    com.yandex.passport.internal.usecase.ui.d0 d0Var = l0Var.b;
                                    LinkedHashMap linkedHashMap6 = linkedHashMap2;
                                    List list7 = list4;
                                    com.yandex.passport.internal.usecase.ui.c0 c0Var = new com.yandex.passport.internal.usecase.ui.c0(lVar7.j, lVar7.b.a, kVar2);
                                    k0Var.j = lVar6;
                                    k0Var.k = kVar2;
                                    k0Var.l = e0Var2;
                                    k0Var.m = lVar5;
                                    k0Var.n = list3;
                                    k0Var.o = list7;
                                    k0Var.p = linkedHashMap6;
                                    k0Var.q = null;
                                    k0Var.r = it2;
                                    k0Var.s = lVar7;
                                    k0Var.t = i4;
                                    k0Var.u = i3;
                                    k0Var.x = 4;
                                    obj = d0Var.g(c0Var, k0Var);
                                    if (obj != nm6Var) {
                                        lVar15 = lVar5;
                                        list6 = list7;
                                        linkedHashMap5 = linkedHashMap6;
                                        Object obj22 = ((z7o) obj).a;
                                        if (!(obj22 instanceof t7o)) {
                                        }
                                        k0Var2 = k0Var;
                                        lVar4 = lVar15;
                                        lVar3 = lVar6;
                                        it = it2;
                                        linkedHashMap = linkedHashMap5;
                                        i2 = i4;
                                        list2 = list6;
                                        list = list3;
                                        if (it.hasNext()) {
                                            com.yandex.passport.internal.properties.h hVar = lVar3.q;
                                            com.yandex.passport.internal.l e = (hVar == null || (z1Var2 = hVar.b) == null) ? null : e0Var2.a.e(com.yandex.plus.pay.ui.core.b.L(z1Var2));
                                            if (!((Boolean) l0Var.f.b(com.yandex.passport.internal.flags.o.q0)).booleanValue()) {
                                                lVar8 = lVar4;
                                                linkedHashMap3 = linkedHashMap;
                                                lVar9 = e;
                                                com.yandex.passport.internal.properties.l lVar142 = lVar3;
                                                return new com.yandex.passport.internal.ui.bouncer.model.b1(lVar142, list2, linkedHashMap3, lVar8, lVar9, (lVar142.g == null && lVar8 != null) || !TextUtils.isEmpty(lVar142.k));
                                            }
                                            com.yandex.passport.internal.usecase.b1 b1Var = l0Var.e;
                                            com.yandex.passport.internal.account.e eVar = e0Var2.b;
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator it3 = eVar.a.iterator();
                                            while (it3.hasNext()) {
                                                com.yandex.passport.common.core.f fVar2 = ((com.yandex.passport.internal.l) it3.next()).c;
                                                if (fVar2 != null) {
                                                    arrayList3.add(fVar2);
                                                }
                                            }
                                            com.yandex.passport.internal.account.e eVar2 = e0Var2.b;
                                            ArrayList arrayList4 = new ArrayList(v75.o(eVar2, 10));
                                            Iterator it4 = eVar2.a.iterator();
                                            while (it4.hasNext()) {
                                                arrayList4.add(((com.yandex.passport.internal.l) it4.next()).b);
                                            }
                                            com.yandex.passport.internal.core.accounts.h hVar2 = new com.yandex.passport.internal.core.accounts.h(kVar2, arrayList3, arrayList4, e0Var2.a);
                                            k0Var2.j = lVar3;
                                            k0Var2.k = null;
                                            k0Var2.l = null;
                                            k0Var2.m = lVar4;
                                            k0Var2.n = list;
                                            k0Var2.o = list2;
                                            k0Var2.p = linkedHashMap;
                                            k0Var2.q = e;
                                            k0Var2.r = null;
                                            k0Var2.s = null;
                                            k0Var2.x = 5;
                                            obj = b1Var.a(hVar2);
                                            if (obj != nm6Var) {
                                                lVar10 = lVar4;
                                                linkedHashMap4 = linkedHashMap;
                                                lVar11 = e;
                                                List list52 = list2;
                                                while (r1.hasNext()) {
                                                }
                                                lVar9 = lVar11;
                                                linkedHashMap3 = linkedHashMap4;
                                                lVar8 = lVar10;
                                                com.yandex.passport.internal.properties.l lVar1422 = lVar3;
                                                return new com.yandex.passport.internal.ui.bouncer.model.b1(lVar1422, list2, linkedHashMap3, lVar8, lVar9, (lVar1422.g == null && lVar8 != null) || !TextUtils.isEmpty(lVar1422.k));
                                            }
                                        }
                                    }
                                } else {
                                    k0Var2 = k0Var;
                                    lVar3 = lVar6;
                                    it = it2;
                                    lVar4 = lVar5;
                                    linkedHashMap = linkedHashMap2;
                                    i2 = i4;
                                    list2 = list4;
                                    list = list3;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    }
                    int i6 = k0Var.u;
                    int i7 = k0Var.t;
                    com.yandex.passport.internal.l lVar18 = k0Var.s;
                    Iterator it5 = k0Var.r;
                    Map map3 = k0Var.p;
                    List list8 = k0Var.o;
                    List list9 = k0Var.n;
                    lVar5 = k0Var.m;
                    com.yandex.passport.internal.usecase.ui.e0 e0Var4 = k0Var.l;
                    com.yandex.passport.internal.entities.k kVar4 = k0Var.k;
                    com.yandex.passport.internal.properties.l lVar19 = k0Var.j;
                    qgg.h0(obj);
                    i3 = i6;
                    i4 = i7;
                    it2 = it5;
                    kVar2 = kVar4;
                    list3 = list9;
                    linkedHashMap2 = map3;
                    lVar7 = lVar18;
                    e0Var2 = e0Var4;
                    list4 = list8;
                    lVar6 = lVar19;
                    list4.add(new l2(lVar7, (List) obj));
                    if (lVar7.e.x) {
                    }
                }
                kVar = l;
                e0Var = (com.yandex.passport.internal.usecase.ui.e0) obj;
                com.yandex.passport.internal.d dVar2 = e0Var.a;
                z1Var = lVar.g;
                if (z1Var == null) {
                    f = dVar2.e(com.yandex.plus.pay.ui.core.b.L(z1Var));
                } else {
                    String str2 = lVar.k;
                    f = str2 != null ? dVar2.f(str2) : null;
                }
                com.yandex.passport.internal.badges.e eVar3 = l0Var.c;
                Unit unit = Unit.a;
                k0Var.j = lVar;
                k0Var.k = kVar;
                k0Var.l = e0Var;
                k0Var.m = f;
                k0Var.x = 2;
                g = eVar3.g(unit, k0Var);
                if (g != nm6Var) {
                    lVar2 = f;
                    obj = g;
                    ArrayList arrayList22 = new ArrayList();
                    linkedHashMap = new LinkedHashMap();
                    it = e0Var.b.a.iterator();
                    com.yandex.passport.internal.usecase.ui.e0 e0Var32 = e0Var;
                    list = (List) obj;
                    k0Var2 = k0Var;
                    lVar3 = lVar;
                    kVar2 = kVar;
                    e0Var2 = e0Var32;
                    lVar4 = lVar2;
                    list2 = arrayList22;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                }
                return nm6Var;
            }
        }
        k0Var = new k0(l0Var, cg6Var);
        Object obj3 = k0Var.v;
        nm6Var = nm6.a;
        i = k0Var.x;
        if (i != 0) {
        }
        kVar = l;
        e0Var = (com.yandex.passport.internal.usecase.ui.e0) obj3;
        com.yandex.passport.internal.d dVar22 = e0Var.a;
        z1Var = lVar.g;
        if (z1Var == null) {
        }
        com.yandex.passport.internal.badges.e eVar32 = l0Var.c;
        Unit unit2 = Unit.a;
        k0Var.j = lVar;
        k0Var.k = kVar;
        k0Var.l = e0Var;
        k0Var.m = f;
        k0Var.x = 2;
        g = eVar32.g(unit2, k0Var);
        if (g != nm6Var) {
        }
        return nm6Var;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final pjc a(x0q x0qVar) {
        x0qVar.getClass();
        return new com.yandex.passport.common.mvi.d(new com.yandex.passport.internal.t(x0qVar, 10), this, 6);
    }
}
