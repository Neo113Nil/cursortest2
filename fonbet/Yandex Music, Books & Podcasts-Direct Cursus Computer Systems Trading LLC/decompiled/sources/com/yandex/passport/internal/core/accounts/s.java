package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.data.network.w8;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ze;
import defpackage.b6e;
import defpackage.c4f;
import defpackage.c5b;
import defpackage.i5f;
import defpackage.ome;
import defpackage.pkr;
import defpackage.q5f;
import defpackage.tah;
import defpackage.tkr;
import defpackage.v6f;
import defpackage.v75;
import defpackage.w4f;
import defpackage.wsd;
import defpackage.x4f;
import defpackage.z75;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s {
    public final com.yandex.passport.internal.report.reporters.a a;

    public s(com.yandex.passport.internal.report.reporters.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public static Set b(Map map) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            v6f v6fVar = value instanceof v6f ? (v6f) value : null;
            if (v6fVar != null) {
                ome omeVar = x4f.a;
                z = Intrinsics.d(pkr.b(v6fVar.a()), Boolean.TRUE);
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return CollectionsKt.A0(arrayList);
    }

    public static com.yandex.passport.internal.entities.a d(s sVar, int i) {
        com.yandex.passport.api.n.b.getClass();
        com.yandex.passport.api.n h = com.yandex.passport.api.q.h(i, false);
        h.getClass();
        switch (h) {
            case PORTAL:
                return com.yandex.passport.internal.entities.a.a;
            case LITE:
                return com.yandex.passport.internal.entities.a.b;
            case SOCIAL:
                return com.yandex.passport.internal.entities.a.c;
            case PDD:
                return com.yandex.passport.internal.entities.a.d;
            case PHONISH:
                return com.yandex.passport.internal.entities.a.e;
            case MAILISH:
                return com.yandex.passport.internal.entities.a.f;
            case MUSIC_PHONISH:
                return com.yandex.passport.internal.entities.a.g;
            case CHILDISH:
                return com.yandex.passport.internal.entities.a.h;
            case UNDEFINED:
                return com.yandex.passport.internal.entities.a.i;
            default:
                b6e.s();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap a(com.yandex.passport.internal.d dVar) {
        int i;
        RandomAccess randomAccess;
        int i2;
        int i3;
        ArrayList arrayList;
        com.yandex.passport.internal.entities.n nVar;
        com.yandex.passport.internal.entities.n nVar2;
        int i4 = 0;
        List<com.yandex.passport.internal.l> o0 = CollectionsKt.o0(dVar.g(), new r(i4));
        ArrayList arrayList2 = new ArrayList();
        for (com.yandex.passport.internal.l lVar : o0) {
            String str = lVar.e.a;
            if (str == null) {
                randomAccess = c5b.a;
            } else {
                com.yandex.passport.common.core.f fVar = lVar.c;
                if (fVar == null) {
                    randomAccess = c5b.a;
                } else {
                    com.yandex.passport.common.core.b bVar = fVar.a;
                    i5f i5fVar = com.yandex.passport.data.network.core.q.a;
                    i5fVar.getClass();
                    w4f w4fVar = (w4f) ((q5f) i5fVar.b(q5f.Companion.serializer(), str)).get("master_members");
                    if (w4fVar != null) {
                        ome omeVar = x4f.a;
                        c4f c4fVar = w4fVar instanceof c4f ? (c4f) w4fVar : null;
                        if (c4fVar == null) {
                            x4f.d(w4fVar, "JsonArray");
                            throw null;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = arrayList3;
                        for (w4f w4fVar2 : c4fVar.a) {
                            try {
                                i5f i5fVar2 = com.yandex.passport.data.network.core.q.a;
                                i5fVar2.getClass();
                                w8 w8Var = (w8) i5fVar2.a(w8.Companion.serializer(), w4fVar2);
                                Map map = (Map) i5fVar2.a(new wsd(tkr.a, w4f.Companion.serializer(), 1), w4fVar2);
                                try {
                                    long j = w8Var.a;
                                    bVar.getClass();
                                    ArrayList arrayList5 = arrayList4;
                                    try {
                                    } catch (Exception e) {
                                        e = e;
                                        i2 = i4;
                                        i3 = 1;
                                        arrayList = arrayList5;
                                    }
                                    try {
                                        i2 = i4;
                                        arrayList = arrayList5;
                                        i3 = 1;
                                        nVar = null;
                                    } catch (Exception e2) {
                                        e = e2;
                                        i2 = i4;
                                        arrayList = arrayList5;
                                        i3 = 1;
                                        nVar = null;
                                        com.yandex.passport.internal.report.reporters.a aVar = this.a;
                                        aVar.getClass();
                                        com.yandex.passport.internal.report.h hVar = com.yandex.passport.internal.report.h.d;
                                        ff ffVar = new ff(e);
                                        ze[] zeVarArr = new ze[i3];
                                        zeVarArr[i2] = ffVar;
                                        aVar.n(hVar, zeVarArr);
                                        nVar2 = nVar;
                                        if (nVar2 != null) {
                                        }
                                        arrayList4 = arrayList;
                                        i4 = i2;
                                    }
                                    try {
                                        nVar2 = new com.yandex.passport.internal.entities.n(new com.yandex.passport.common.core.f(bVar, j), fVar, d(this, w8Var.f), w8Var.b, w8Var.c, w8Var.d, w8Var.e, b(map));
                                    } catch (Exception e3) {
                                        e = e3;
                                        com.yandex.passport.internal.report.reporters.a aVar2 = this.a;
                                        aVar2.getClass();
                                        com.yandex.passport.internal.report.h hVar2 = com.yandex.passport.internal.report.h.d;
                                        ff ffVar2 = new ff(e);
                                        ze[] zeVarArr2 = new ze[i3];
                                        zeVarArr2[i2] = ffVar2;
                                        aVar2.n(hVar2, zeVarArr2);
                                        nVar2 = nVar;
                                        if (nVar2 != null) {
                                        }
                                        arrayList4 = arrayList;
                                        i4 = i2;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    i2 = i4;
                                    arrayList = arrayList4;
                                    i3 = 1;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                i2 = i4;
                                i3 = 1;
                                arrayList = arrayList4;
                            }
                            if (nVar2 != null) {
                                arrayList.add(nVar2);
                            }
                            arrayList4 = arrayList;
                            i4 = i2;
                        }
                        i = i4;
                        randomAccess = arrayList4;
                    } else {
                        i = i4;
                        randomAccess = c5b.a;
                    }
                    z75.t(arrayList2, (Iterable) randomAccess);
                    i4 = i;
                }
            }
            i = i4;
            z75.t(arrayList2, (Iterable) randomAccess);
            i4 = i;
        }
        int a = tah.a(v75.o(arrayList2, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((com.yandex.passport.internal.entities.n) next).a, next);
        }
        return linkedHashMap;
    }

    public final ArrayList c(com.yandex.passport.common.core.f fVar, com.yandex.passport.internal.d dVar) {
        fVar.getClass();
        dVar.getClass();
        Collection values = a(dVar).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (Intrinsics.d(((com.yandex.passport.internal.entities.n) obj).b, fVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
