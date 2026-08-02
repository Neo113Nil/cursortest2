package com.yandex.passport.internal.autologin;

import androidx.core.app.n0;
import com.yandex.passport.internal.core.accounts.s;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.rhw;
import defpackage.tah;
import defpackage.v75;
import defpackage.xq0;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class o extends n0 {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.internal.badges.e c;
    public final com.yandex.passport.internal.badges.h d;
    public final com.yandex.passport.internal.config.b e;
    public final com.yandex.passport.common.common.a f;
    public final com.yandex.passport.internal.flags.i g;
    public final s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.badges.e eVar2, com.yandex.passport.internal.badges.h hVar, com.yandex.passport.internal.config.b bVar, com.yandex.passport.common.common.a aVar2, com.yandex.passport.internal.flags.i iVar, s sVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        eVar.getClass();
        eVar2.getClass();
        hVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        iVar.getClass();
        sVar.getClass();
        this.b = eVar;
        this.c = eVar2;
        this.d = hVar;
        this.e = bVar;
        this.f = aVar2;
        this.g = iVar;
        this.h = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [q5b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static List u(List list, List list2, Map map) {
        ?? r5;
        list.getClass();
        list2.getClass();
        map.getClass();
        if (list2.isEmpty()) {
            return list;
        }
        List<c> list3 = list;
        int a = tah.a(v75.o(list3, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (c cVar : list3) {
            List list4 = (List) map.get(cVar.a);
            if (list4 != null) {
                List list5 = list4;
                r5 = new ArrayList(v75.o(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    r5.add(((com.yandex.passport.internal.badges.a) it.next()).a);
                }
            } else {
                r5 = q5b.a;
            }
            com.yandex.passport.common.core.f fVar = cVar.a;
            int size = list2.size();
            boolean[] zArr = new boolean[size];
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) list2.get(i);
                zArr[i] = r5.contains((String) pair.a) == ((Boolean) pair.b).booleanValue();
            }
            linkedHashMap.put(fVar, zArr);
        }
        return CollectionsKt.o0(list3, new ze0(7, linkedHashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0112 A[Catch: Exception -> 0x0063, TryCatch #0 {Exception -> 0x0063, blocks: (B:12:0x004f, B:14:0x0158, B:15:0x010c, B:17:0x0112, B:22:0x0166, B:24:0x0178, B:29:0x0195, B:30:0x01b5, B:32:0x01c5, B:35:0x01cc, B:39:0x0181, B:44:0x0076, B:46:0x009e, B:47:0x00b9, B:49:0x00bf, B:51:0x00ce, B:53:0x00de, B:54:0x00e7, B:57:0x00fa, B:58:0x00e5, B:60:0x0085), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0166 A[Catch: Exception -> 0x0063, TryCatch #0 {Exception -> 0x0063, blocks: (B:12:0x004f, B:14:0x0158, B:15:0x010c, B:17:0x0112, B:22:0x0166, B:24:0x0178, B:29:0x0195, B:30:0x01b5, B:32:0x01c5, B:35:0x01cc, B:39:0x0181, B:44:0x0076, B:46:0x009e, B:47:0x00b9, B:49:0x00bf, B:51:0x00ce, B:53:0x00de, B:54:0x00e7, B:57:0x00fa, B:58:0x00e5, B:60:0x0085), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: Exception -> 0x0063, LOOP:0: B:47:0x00b9->B:49:0x00bf, LOOP_END, TryCatch #0 {Exception -> 0x0063, blocks: (B:12:0x004f, B:14:0x0158, B:15:0x010c, B:17:0x0112, B:22:0x0166, B:24:0x0178, B:29:0x0195, B:30:0x01b5, B:32:0x01c5, B:35:0x01cc, B:39:0x0181, B:44:0x0076, B:46:0x009e, B:47:0x00b9, B:49:0x00bf, B:51:0x00ce, B:53:0x00de, B:54:0x00e7, B:57:0x00fa, B:58:0x00e5, B:60:0x0085), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de A[Catch: Exception -> 0x0063, TryCatch #0 {Exception -> 0x0063, blocks: (B:12:0x004f, B:14:0x0158, B:15:0x010c, B:17:0x0112, B:22:0x0166, B:24:0x0178, B:29:0x0195, B:30:0x01b5, B:32:0x01c5, B:35:0x01cc, B:39:0x0181, B:44:0x0076, B:46:0x009e, B:47:0x00b9, B:49:0x00bf, B:51:0x00ce, B:53:0x00de, B:54:0x00e7, B:57:0x00fa, B:58:0x00e5, B:60:0x0085), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5 A[Catch: Exception -> 0x0063, TryCatch #0 {Exception -> 0x0063, blocks: (B:12:0x004f, B:14:0x0158, B:15:0x010c, B:17:0x0112, B:22:0x0166, B:24:0x0178, B:29:0x0195, B:30:0x01b5, B:32:0x01c5, B:35:0x01cc, B:39:0x0181, B:44:0x0076, B:46:0x009e, B:47:0x00b9, B:49:0x00bf, B:51:0x00ce, B:53:0x00de, B:54:0x00e7, B:57:0x00fa, B:58:0x00e5, B:60:0x0085), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x014a -> B:14:0x0158). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object x(o oVar, l lVar, cg6 cg6Var) {
        m mVar;
        int i;
        l lVar2;
        Object obj;
        int i2;
        Iterator it;
        int a;
        Map linkedHashMap;
        Iterator it2;
        List list;
        com.yandex.passport.internal.d dVar;
        Collection collection;
        o oVar2;
        l lVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        List list2;
        o oVar3 = oVar;
        try {
            if (cg6Var instanceof m) {
                mVar = (m) cg6Var;
                int i7 = mVar.y;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    mVar.y = i7 - Integer.MIN_VALUE;
                    Object obj2 = mVar.w;
                    nm6 nm6Var = nm6.a;
                    i = mVar.y;
                    if (i != 0) {
                        cg6Var = null;
                        qgg.h0(obj2);
                        com.yandex.passport.internal.badges.e eVar = oVar3.c;
                        Unit unit = Unit.a;
                        mVar.j = oVar3;
                        mVar.k = lVar;
                        mVar.s = 0;
                        mVar.y = 1;
                        Object g = eVar.g(unit, mVar);
                        if (g == nm6Var) {
                            return nm6Var;
                        }
                        lVar2 = lVar;
                        obj = g;
                        i2 = 0;
                    } else if (i == 1) {
                        cg6Var = null;
                        int i8 = mVar.s;
                        lVar2 = mVar.k;
                        o oVar4 = mVar.j;
                        qgg.h0(obj2);
                        i2 = i8;
                        oVar3 = oVar4;
                        obj = obj2;
                    } else {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i9 = mVar.v;
                        int i10 = mVar.u;
                        int i11 = mVar.t;
                        i5 = mVar.s;
                        com.yandex.passport.common.core.f fVar = mVar.r;
                        linkedHashMap = mVar.q;
                        Iterator it3 = mVar.p;
                        Map map = mVar.o;
                        Collection collection2 = (List) mVar.n;
                        com.yandex.passport.internal.d dVar2 = mVar.m;
                        List list3 = mVar.l;
                        cg6Var = null;
                        lVar3 = mVar.k;
                        o oVar5 = mVar.j;
                        qgg.h0(obj2);
                        m mVar2 = mVar;
                        int i12 = i9;
                        i3 = i11;
                        o oVar6 = oVar5;
                        int i13 = i10;
                        m mVar3 = mVar2;
                        List list4 = list3;
                        com.yandex.passport.internal.d dVar3 = dVar2;
                        Collection collection3 = collection2;
                        Iterator it4 = it3;
                        Map map2 = map;
                        linkedHashMap.put(fVar, obj2);
                        i6 = i12;
                        mVar = mVar3;
                        i4 = i13;
                        oVar2 = oVar6;
                        linkedHashMap = map2;
                        it2 = it4;
                        collection = collection3;
                        dVar = dVar3;
                        list = list4;
                        if (!it2.hasNext()) {
                            c cVar = (c) it2.next();
                            fVar = cVar.a;
                            mVar.j = oVar2;
                            mVar.k = lVar3;
                            mVar.l = list;
                            mVar.m = dVar;
                            mVar.n = (List) collection;
                            mVar.o = linkedHashMap;
                            mVar.p = it2;
                            mVar.q = linkedHashMap;
                            mVar.r = fVar;
                            mVar.s = i5;
                            mVar.t = i3;
                            mVar.u = i4;
                            mVar.v = i6;
                            mVar.y = 2;
                            Object w = oVar2.w(list, dVar, cVar, mVar);
                            if (w != nm6Var) {
                                m mVar4 = mVar;
                                i12 = i6;
                                obj2 = w;
                                oVar6 = oVar2;
                                i13 = i4;
                                mVar3 = mVar4;
                                list4 = list;
                                dVar3 = dVar;
                                collection3 = collection;
                                it4 = it2;
                                map2 = linkedHashMap;
                                linkedHashMap.put(fVar, obj2);
                                i6 = i12;
                                mVar = mVar3;
                                i4 = i13;
                                oVar2 = oVar6;
                                linkedHashMap = map2;
                                it2 = it4;
                                collection = collection3;
                                dVar = dVar3;
                                list = list4;
                                if (!it2.hasNext()) {
                                    com.yandex.passport.internal.flags.i iVar = oVar2.g;
                                    com.yandex.passport.internal.config.b bVar = oVar2.e;
                                    if (((Boolean) iVar.b(com.yandex.passport.internal.flags.o.D)).booleanValue()) {
                                        String str = lVar3.c;
                                        com.yandex.passport.common.core.b bVar2 = lVar3.b;
                                        if (str == null) {
                                            list2 = cg6Var;
                                        } else {
                                            bVar.getClass();
                                            bVar2.getClass();
                                            list2 = (List) bVar.a(bVar2, "autologin_client_id_parameters").get(str);
                                        }
                                        if (list2 == 0) {
                                            String a2 = ((com.yandex.passport.internal.common.d) oVar2.f).a();
                                            bVar.getClass();
                                            bVar2.getClass();
                                            a2.getClass();
                                            list2 = (List) bVar.a(bVar2, "autologin_app_parameters").get(a2);
                                        }
                                    } else {
                                        list2 = cg6Var;
                                    }
                                    List o0 = CollectionsKt.o0(collection, new n(linkedHashMap));
                                    Collection collection4 = list2;
                                    if (collection4 != null && !collection4.isEmpty()) {
                                        return u(o0, list2, linkedHashMap);
                                    }
                                    return o0;
                                }
                            }
                            return nm6Var;
                        }
                    }
                    List list5 = (List) obj;
                    com.yandex.passport.internal.d a3 = oVar3.b.a();
                    List list6 = lVar2.a;
                    ArrayList arrayList = new ArrayList(v75.o(list6, 10));
                    it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new a((com.yandex.passport.internal.l) it.next()));
                    }
                    ArrayList g0 = CollectionsKt.g0(arrayList, !((Boolean) oVar3.g.b(com.yandex.passport.internal.flags.o.E)).booleanValue() ? oVar3.v(a3, lVar2.a) : c5b.a);
                    a = tah.a(v75.o(g0, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    linkedHashMap = new LinkedHashMap(a);
                    it2 = g0.iterator();
                    list = list5;
                    dVar = a3;
                    collection = g0;
                    oVar2 = oVar3;
                    lVar3 = lVar2;
                    i3 = 0;
                    i4 = a;
                    i5 = i2;
                    i6 = 0;
                    if (!it2.hasNext()) {
                    }
                }
            }
            if (i != 0) {
            }
            List list52 = (List) obj;
            com.yandex.passport.internal.d a32 = oVar3.b.a();
            List list62 = lVar2.a;
            ArrayList arrayList2 = new ArrayList(v75.o(list62, 10));
            it = list62.iterator();
            while (it.hasNext()) {
            }
            ArrayList g02 = CollectionsKt.g0(arrayList2, !((Boolean) oVar3.g.b(com.yandex.passport.internal.flags.o.E)).booleanValue() ? oVar3.v(a32, lVar2.a) : c5b.a);
            a = tah.a(v75.o(g02, 10));
            if (a < 16) {
            }
            linkedHashMap = new LinkedHashMap(a);
            it2 = g02.iterator();
            list = list52;
            dVar = a32;
            collection = g02;
            oVar2 = oVar3;
            lVar3 = lVar2;
            i3 = 0;
            i4 = a;
            i5 = i2;
            i6 = 0;
            if (!it2.hasNext()) {
            }
        } catch (Exception e) {
            com.yandex.passport.common.logger.d dVar4 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, cg6Var, "Error ordering accounts for auto-login", e);
            }
            return c5b.a;
        }
        mVar = new m(oVar3, cg6Var);
        Object obj22 = mVar.w;
        nm6 nm6Var2 = nm6.a;
        i = mVar.y;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return x(this, (l) obj, rhwVar);
    }

    public final ArrayList v(com.yandex.passport.internal.d dVar, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.yandex.passport.internal.l) it.next()).b);
        }
        LinkedHashSet z0 = CollectionsKt.z0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        s sVar = this.h;
        sVar.getClass();
        for (com.yandex.passport.internal.entities.n nVar : CollectionsKt.w0(sVar.a(dVar).values())) {
            if (z0.add(nVar.a)) {
                arrayList2.add(new b(nVar));
            }
        }
        return arrayList2;
    }

    public final Object w(List list, com.yandex.passport.internal.d dVar, c cVar, m mVar) {
        String str;
        if (!(cVar instanceof a)) {
            if (cVar instanceof b) {
                return com.yandex.passport.internal.ui.a.t(list, ((b) cVar).b.h);
            }
            b6e.s();
            return null;
        }
        com.yandex.passport.internal.l lVar = ((a) cVar).b;
        if (list.isEmpty()) {
            return c5b.a;
        }
        com.yandex.passport.internal.b a = dVar.a(lVar.g);
        return (a == null || (str = a.d) == null) ? c5b.a : this.d.g(new com.yandex.passport.internal.badges.g(str, list), mVar);
    }
}
