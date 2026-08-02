package com.yandex.passport.internal.filter;

import com.yandex.passport.data.models.y;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.lmm;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.wb7;
import defpackage.x7j;
import defpackage.xq0;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {
    public final r a;
    public final com.yandex.passport.common.common.a b;
    public final String c;
    public final com.yandex.passport.data.network.token.i d;

    public l(r rVar, com.yandex.passport.common.common.a aVar, String str, com.yandex.passport.data.network.token.i iVar) {
        rVar.getClass();
        aVar.getClass();
        str.getClass();
        iVar.getClass();
        this.a = rVar;
        this.b = aVar;
        this.c = str;
        this.d = iVar;
    }

    public final boolean a(y yVar, String str) {
        try {
            com.yandex.passport.data.models.x xVar = yVar.a;
            String str2 = yVar.b;
            int ordinal = xVar.ordinal();
            com.yandex.passport.data.network.token.i iVar = this.d;
            if (ordinal == 0) {
                iVar.getClass();
                if (com.yandex.passport.data.network.token.i.c(str, str2) != 0) {
                    return false;
                }
            } else {
                if (ordinal != 1) {
                    throw new x7j();
                }
                iVar.getClass();
                if (com.yandex.passport.data.network.token.i.c(str, str2) < 0) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.entities.k kVar, cg6 cg6Var) {
        h hVar;
        int i;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hVar.j;
                Object obj2 = nm6.a;
                i = hVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    lVar.getClass();
                    com.yandex.passport.common.core.g gVar = lVar.e;
                    com.yandex.passport.common.core.f fVar = lVar.b;
                    kVar.getClass();
                    com.yandex.passport.common.core.b bVar = fVar.a;
                    if (bVar != com.yandex.plus.core.network.api.utils.a.L(kVar.a)) {
                        com.yandex.passport.api.impl.b bVar2 = kVar.b;
                        if (bVar != (bVar2 != null ? com.yandex.plus.core.network.api.utils.a.L(bVar2) : null)) {
                            return b.a;
                        }
                    }
                    if (!com.yandex.plus.pay.ui.core.b.B(fVar.a)) {
                        EnumSet j = kVar.j();
                        if (!j.isEmpty()) {
                            Iterator it = j.iterator();
                            while (it.hasNext()) {
                                if (lVar.f() == ((com.yandex.passport.api.n) it.next())) {
                                }
                            }
                        }
                        return a.a;
                    }
                    if (CollectionsKt.U(gVar.C, com.yandex.passport.internal.ui.a.I(kVar.d)).isEmpty()) {
                        return d.a;
                    }
                    Map map = gVar.X;
                    LinkedHashMap linkedHashMap = kVar.e;
                    hVar.l = 1;
                    obj = d(map, linkedHashMap, hVar);
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
                return ((Boolean) obj).booleanValue() ? c.a : f.a;
            }
        }
        hVar = new h(this, cg6Var);
        Object obj3 = hVar.j;
        Object obj22 = nm6.a;
        i = hVar.l;
        if (i != 0) {
        }
        if (((Boolean) obj3).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.passport.internal.filter.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:10:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, com.yandex.passport.internal.entities.k kVar, cg6 cg6Var) {
        i iVar;
        int i;
        int i2;
        Iterator it;
        ArrayList arrayList;
        int i3;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i4 = iVar.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iVar.r = i4 - Integer.MIN_VALUE;
                Object obj = iVar.p;
                nm6 nm6Var = nm6.a;
                i = iVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList arrayList2 = new ArrayList();
                    i2 = 0;
                    it = list.iterator();
                    arrayList = arrayList2;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = iVar.o;
                    int i5 = iVar.n;
                    Object obj2 = iVar.m;
                    Iterator it2 = iVar.l;
                    Collection collection = iVar.k;
                    com.yandex.passport.internal.entities.k kVar2 = iVar.j;
                    qgg.h0(obj);
                    int i6 = i5;
                    kVar = kVar2;
                    ArrayList arrayList3 = collection;
                    Iterator it3 = it2;
                    if (Intrinsics.d(obj, f.a)) {
                        arrayList3.add(obj2);
                    }
                    i2 = i6;
                    it = it3;
                    arrayList = arrayList3;
                    if (it.hasNext()) {
                        Object next = it.next();
                        iVar.j = kVar;
                        iVar.k = arrayList;
                        iVar.l = it;
                        iVar.m = next;
                        iVar.n = i2;
                        iVar.o = i3;
                        iVar.r = 1;
                        Object b = b((com.yandex.passport.internal.l) next, kVar, iVar);
                        if (b == nm6Var) {
                            return nm6Var;
                        }
                        int i7 = i2;
                        obj2 = next;
                        obj = b;
                        arrayList3 = arrayList;
                        it3 = it;
                        i6 = i7;
                        if (Intrinsics.d(obj, f.a)) {
                        }
                        i2 = i6;
                        it = it3;
                        arrayList = arrayList3;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        iVar = new i(this, cg6Var);
        Object obj3 = iVar.p;
        nm6 nm6Var2 = nm6.a;
        i = iVar.r;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(2:10|11)(2:50|51))(3:52|53|(1:55))|12|13|(1:15)|(1:17)|18|(3:21|(2:34|(2:(3:40|28|29)|32)(3:43|44|45))(4:23|(2:31|32)|28|29)|19)|46|47|48))|61|6|7|(0)(0)|12|13|(0)|(0)|18|(1:19)|46|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x002e, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0066, code lost:
    
        r0 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006e, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0070, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Can't read FilterRules from filterRulesStorage.", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0077, code lost:
    
        r11 = defpackage.e5b.a;
        r11.getClass();
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v3, types: [e5b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Map map, LinkedHashMap linkedHashMap, cg6 cg6Var) {
        j jVar;
        int i;
        boolean isEmpty;
        LinkedHashMap linkedHashMap2;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.n = i2 - Integer.MIN_VALUE;
                Object obj = jVar.l;
                nm6 nm6Var = nm6.a;
                i = jVar.n;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    r rVar = this.a;
                    jVar.j = map;
                    jVar.k = linkedHashMap;
                    jVar.n = 1;
                    obj = zsd.g0(new com.yandex.passport.common.mvi.d(((wb7) rVar.c.getValue(rVar.a, r.e[0])).getData(), rVar, i3), jVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = jVar.k;
                    map = jVar.j;
                    qgg.h0(obj);
                }
                LinkedHashMap linkedHashMap3 = (Map) obj;
                isEmpty = linkedHashMap3.isEmpty();
                linkedHashMap2 = linkedHashMap3;
                if (isEmpty) {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 != null) {
                    linkedHashMap = linkedHashMap2;
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    com.yandex.passport.data.models.j jVar2 = (com.yandex.passport.data.models.j) entry.getValue();
                    Set set = (Set) map.get(str);
                    com.yandex.passport.data.models.i iVar = jVar2.a;
                    Set set2 = jVar2.b;
                    int ordinal = iVar.ordinal();
                    if (ordinal == 0) {
                        if (set != null && !CollectionsKt.U(set2, set).isEmpty()) {
                        }
                        return Boolean.FALSE;
                    }
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    if (set != null && !CollectionsKt.U(set2, set).isEmpty()) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.l;
        nm6 nm6Var2 = nm6.a;
        i = jVar.n;
        int i32 = 1;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap32 = (Map) obj2;
        isEmpty = linkedHashMap32.isEmpty();
        linkedHashMap2 = linkedHashMap32;
        if (isEmpty) {
        }
        if (linkedHashMap2 != null) {
        }
        while (r10.hasNext()) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:14|15)(2:11|12))(7:18|19|(2:20|(3:22|(2:27|(2:32|(2:36|37)(2:39|55))(3:56|57|58))(3:60|61|62)|38)(2:64|65))|40|41|(3:43|(1:45)(1:49)|(1:47))(2:50|(1:52)(1:54))|48)|16|17))|70|6|7|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (r14 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0030, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00da, code lost:
    
        r0 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e4, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Can't apply AccountFilterConfig: " + r13, r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(com.yandex.passport.data.models.a aVar, cg6 cg6Var) {
        k kVar;
        int i;
        Object obj;
        com.yandex.passport.common.common.a aVar2 = this.b;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = kVar.k;
                Object obj3 = nm6.a;
                i = kVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    ArrayList arrayList = aVar.a;
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator.previous();
                        com.yandex.passport.data.models.b bVar = ((com.yandex.passport.data.models.f) obj).a;
                        String b = ((com.yandex.passport.internal.common.d) aVar2).b();
                        String a = ((com.yandex.passport.internal.common.d) aVar2).a();
                        String str = this.c;
                        y yVar = bVar.a;
                        if (yVar == null || a(yVar, str)) {
                            List list = bVar.c;
                            if (list == null || list.contains(a)) {
                                y yVar2 = bVar.b;
                                if (yVar2 == null || a(yVar2, b)) {
                                    break;
                                }
                            }
                        }
                    }
                    com.yandex.passport.data.models.f fVar = (com.yandex.passport.data.models.f) obj;
                    r rVar = this.a;
                    if (fVar != null) {
                        LinkedHashMap linkedHashMap = fVar.b;
                        kVar.j = aVar;
                        kVar.m = 1;
                        Object a2 = lmm.a((wb7) rVar.c.getValue(rVar.a, r.e[0]), new q(linkedHashMap, rVar, null), kVar);
                        if (a2 != nm6.a) {
                            a2 = Unit.a;
                        }
                        if (a2 == obj3) {
                        }
                    } else {
                        kVar.j = aVar;
                        kVar.m = 2;
                        Object a3 = lmm.a((wb7) rVar.c.getValue(rVar.a, r.e[0]), new o(2, null), kVar);
                        if (a3 != nm6.a) {
                            a3 = Unit.a;
                        }
                    }
                    return obj3;
                }
                if (i != 1 && i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.yandex.passport.data.models.a aVar3 = kVar.j;
                qgg.h0(obj2);
                return Unit.a;
            }
        }
        kVar = new k(this, cg6Var);
        Object obj22 = kVar.k;
        Object obj32 = nm6.a;
        i = kVar.m;
        if (i != 0) {
        }
        return Unit.a;
    }
}
