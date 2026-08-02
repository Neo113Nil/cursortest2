package com.yandex.passport.internal.push;

import android.database.Cursor;
import com.yandex.passport.api.v2;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.oa;
import com.yandex.passport.internal.report.va;
import com.yandex.passport.internal.report.ve;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.l48;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.u75;
import defpackage.uop;
import defpackage.v75;
import defpackage.wop;
import defpackage.xq0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class g {
    public final com.yandex.passport.internal.properties.x a;
    public final s0 b;
    public final com.yandex.passport.internal.core.accounts.e c;
    public final com.yandex.passport.internal.database.e d;
    public final com.yandex.passport.internal.util.k e;
    public final d0 f;
    public final com.yandex.passport.internal.report.reporters.w0 g;
    public final com.yandex.passport.internal.database.d h;
    public final com.yandex.passport.internal.flags.i i;
    public final com.yandex.passport.internal.provider.communication.p j;
    public final h k;
    public final com.yandex.passport.internal.provider.communication.q l;
    public final ConcurrentHashMap m;

    public g(com.yandex.passport.internal.properties.x xVar, s0 s0Var, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.database.e eVar2, com.yandex.passport.internal.util.k kVar, d0 d0Var, com.yandex.passport.internal.report.reporters.w0 w0Var, com.yandex.passport.internal.database.d dVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.provider.communication.p pVar, h hVar, com.yandex.passport.internal.provider.communication.q qVar) {
        xVar.getClass();
        s0Var.getClass();
        eVar.getClass();
        eVar2.getClass();
        kVar.getClass();
        d0Var.getClass();
        w0Var.getClass();
        dVar.getClass();
        iVar.getClass();
        pVar.getClass();
        hVar.getClass();
        qVar.getClass();
        this.a = xVar;
        this.b = s0Var;
        this.c = eVar;
        this.d = eVar2;
        this.e = kVar;
        this.f = d0Var;
        this.g = w0Var;
        this.h = dVar;
        this.i = iVar;
        this.j = pVar;
        this.k = hVar;
        this.l = qVar;
        this.m = new ConcurrentHashMap();
    }

    public final boolean a() {
        boolean z;
        androidx.core.app.y a;
        if (this.a.a() && !b().isEmpty()) {
            d0 d0Var = this.f;
            if (d0Var.a.b.areNotificationsEnabled() && ((a = q.a(d0Var.a)) == null || !a.c)) {
                androidx.core.app.u0 u0Var = this.k.a;
                int currentInterruptionFilter = u0Var.b.getCurrentInterruptionFilter();
                boolean z2 = currentInterruptionFilter == 1 || currentInterruptionFilter == 0;
                boolean b = q.b(u0Var);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "Notification state group canDisturb: " + z2 + " isOnException: " + b, 8);
                }
                if (z2 || b) {
                    z = true;
                    com.yandex.passport.internal.report.reporters.w0 w0Var = this.g;
                    w0Var.getClass();
                    w0Var.n(oa.d, new ve(15, z));
                    return z;
                }
            }
        }
        z = false;
        com.yandex.passport.internal.report.reporters.w0 w0Var2 = this.g;
        w0Var2.getClass();
        w0Var2.n(oa.d, new ve(15, z));
        return z;
    }

    public final List b() {
        com.yandex.passport.internal.properties.x xVar = this.a;
        l48 l48Var = xVar.m;
        List list = xVar.n;
        return l48Var != null ? CollectionsKt.h0(list, new com.yandex.passport.api.l(l48Var)) : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(v2 v2Var, cg6 cg6Var) {
        b bVar;
        int i;
        Iterator it;
        Object obj;
        com.yandex.passport.api.l lVar;
        String str;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                ConcurrentHashMap concurrentHashMap = this.m;
                String str2 = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    String str3 = (String) concurrentHashMap.get(v2Var);
                    if (str3 != null) {
                        return str3;
                    }
                    if (((Boolean) this.i.b(com.yandex.passport.internal.flags.o.o0)).booleanValue()) {
                        bVar.j = v2Var;
                        bVar.m = 1;
                        obj2 = this.j.a(v2Var, bVar);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                    }
                    it = b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        ((com.yandex.passport.api.l) obj).getClass();
                        if (v2.a == v2Var) {
                            break;
                        }
                    }
                    lVar = (com.yandex.passport.api.l) obj;
                    if (lVar == null) {
                        return null;
                    }
                    try {
                        str2 = lVar.a("1087931301371");
                    } catch (Exception e) {
                        v2 v2Var2 = v2.a;
                        this.g.u(e);
                        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error receive token for " + v2Var2, e);
                        }
                    }
                    String z = com.yandex.plus.core.network.api.utils.a.z(str2);
                    if (z != null) {
                        concurrentHashMap.put(v2Var, z);
                    }
                    return z;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var = bVar.j;
                qgg.h0(obj2);
                str = (String) obj2;
                if (str != null) {
                    concurrentHashMap.put(v2Var, str);
                    return str;
                }
                it = b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                lVar = (com.yandex.passport.api.l) obj;
                if (lVar == null) {
                }
            }
        }
        bVar = new b(this, cg6Var);
        Object obj22 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        ConcurrentHashMap concurrentHashMap2 = this.m;
        String str22 = null;
        if (i != 0) {
        }
        str = (String) obj22;
        if (str != null) {
        }
        it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        lVar = (com.yandex.passport.api.l) obj;
        if (lVar == null) {
        }
    }

    public final String d(String str) {
        try {
            List b = b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : b) {
                if (obj instanceof com.yandex.passport.api.l) {
                    arrayList.add(obj);
                }
            }
            com.yandex.passport.api.l lVar = (com.yandex.passport.api.l) CollectionsKt.firstOrNull(arrayList);
            if (lVar != null) {
                return lVar.a(str);
            }
        } catch (IOException e) {
            v2 v2Var = v2.a;
            this.g.u(e);
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error receive gcm token", e);
            }
        }
        return null;
    }

    public final boolean e(com.yandex.passport.internal.l lVar) {
        com.yandex.passport.internal.entities.e eVar;
        com.yandex.passport.common.core.f fVar = lVar.b;
        s0 s0Var = this.b;
        if (s0Var.c(fVar)) {
            return true;
        }
        com.yandex.passport.internal.credentials.f b = this.a.b(fVar.a);
        if (b != null) {
            String str = b.c;
            com.yandex.passport.internal.database.d dVar = this.h;
            dVar.getClass();
            str.getClass();
            eVar = dVar.b.b(fVar, str);
        } else {
            eVar = null;
        }
        boolean z = (eVar == null || com.yandex.plus.core.network.api.utils.a.z(eVar.a) == null) ? false : true;
        if (z) {
            s0Var.a(fVar, true);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0085 -> B:10:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(List list, Set set, Set set2, cg6 cg6Var) {
        c cVar;
        int i;
        Iterator it;
        int i2;
        Set set3;
        Set set4;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i3 = cVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.p = i3 - Integer.MIN_VALUE;
                Object obj = cVar.n;
                nm6 nm6Var = nm6.a;
                i = cVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    it = list.iterator();
                    i2 = 0;
                    set3 = set2;
                    set4 = set;
                    while (it.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = cVar.m;
                it = cVar.l;
                Set set5 = cVar.k;
                Set set6 = cVar.j;
                qgg.h0(obj);
                set3 = set5;
                set4 = set6;
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) pair.a;
                    v2 v2Var = (v2) pair.b;
                    if (!set4.contains(fVar) || !set3.contains(v2Var)) {
                        cVar.getClass();
                        cVar.j = set4;
                        cVar.k = set3;
                        cVar.l = it;
                        cVar.m = i2;
                        cVar.p = 1;
                        if (this.b.f(cVar, v2Var, fVar) == nm6Var) {
                            return nm6Var;
                        }
                        set6 = set4;
                        set5 = set3;
                        set3 = set5;
                        set4 = set6;
                        while (it.hasNext()) {
                        }
                    }
                }
                return Unit.a;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.n;
        nm6 nm6Var2 = nm6.a;
        i = cVar.p;
        if (i != 0) {
        }
    }

    public final Object g(v2 v2Var, String str, cg6 cg6Var) {
        ConcurrentHashMap concurrentHashMap = this.m;
        com.yandex.passport.internal.report.reporters.w0 w0Var = this.g;
        if (str == null) {
            w0Var.getClass();
            v2Var.getClass();
            w0Var.n(va.d, new ve(v2Var), new ff(26, false));
            concurrentHashMap.remove(v2Var);
            Object i = i(cg6Var, v2Var, null);
            return i == nm6.a ? i : Unit.a;
        }
        w0Var.getClass();
        v2Var.getClass();
        w0Var.n(va.d, new ve(v2Var), new ff(26, true));
        concurrentHashMap.put(v2Var, str);
        Object k = k(cg6Var, v2Var, null);
        return k == nm6.a ? k : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:10:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        d dVar;
        int i;
        int i2;
        v2[] v2VarArr;
        com.yandex.passport.common.core.f fVar2;
        int i3;
        int i4;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i5 = dVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar.q = i5 - Integer.MIN_VALUE;
                Object obj = dVar.o;
                nm6 nm6Var = nm6.a;
                i = dVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    v2[] values = v2.values();
                    int length = values.length;
                    i2 = 0;
                    v2VarArr = values;
                    fVar2 = fVar;
                    i3 = length;
                    i4 = 0;
                    if (i4 < i3) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = dVar.n;
                    i4 = dVar.m;
                    i2 = dVar.l;
                    v2VarArr = dVar.k;
                    com.yandex.passport.common.core.f fVar3 = dVar.j;
                    qgg.h0(obj);
                    fVar2 = fVar3;
                    i4++;
                    if (i4 < i3) {
                        v2 v2Var = v2VarArr[i4];
                        dVar.j = fVar2;
                        dVar.k = v2VarArr;
                        dVar.l = i2;
                        dVar.m = i4;
                        dVar.n = i3;
                        dVar.q = 1;
                        if (this.b.f(dVar, v2Var, fVar2) == nm6Var) {
                            return nm6Var;
                        }
                        i4++;
                        if (i4 < i3) {
                            return Unit.a;
                        }
                    }
                }
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.o;
        nm6 nm6Var2 = nm6.a;
        i = dVar.q;
        if (i != 0) {
        }
    }

    public final Object i(cg6 cg6Var, v2 v2Var, com.yandex.passport.common.core.f fVar) {
        if (((Boolean) this.i.b(com.yandex.passport.internal.flags.o.r)).booleanValue()) {
            Object k = k(cg6Var, v2Var, fVar);
            return k == nm6.a ? k : Unit.a;
        }
        Object j = j(v2Var != null, cg6Var);
        return j == nm6.a ? j : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0305 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008a  */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [com.yandex.passport.internal.l, java.lang.String, java.util.Map, java.util.Set] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x026a -> B:31:0x0344). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x033e -> B:30:0x0340). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(boolean z, cg6 cg6Var) {
        e eVar;
        int i;
        Pair pair;
        Iterator it;
        Set set;
        Map map;
        int i2;
        boolean z2;
        com.yandex.passport.common.core.f fVar;
        long parseLong;
        com.yandex.passport.common.core.b bVar;
        String str;
        com.yandex.passport.internal.l lVar;
        com.yandex.passport.internal.database.e eVar2;
        Map map2;
        Iterator it2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        Set set2;
        int i5;
        v2 v2Var;
        boolean z5;
        e eVar3;
        String str2;
        boolean z6;
        com.yandex.passport.internal.l lVar2;
        Set set3;
        int i6;
        int i7;
        boolean z7;
        Iterator it3;
        int i8;
        Set set4;
        Object obj;
        String d;
        ?? r12;
        int i9;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i10 = eVar.u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.u = i10 - Integer.MIN_VALUE;
                Object obj2 = eVar.s;
                nm6 nm6Var = nm6.a;
                i = eVar.u;
                s0 s0Var = this.b;
                com.yandex.passport.internal.database.e eVar4 = this.d;
                if (i != 0) {
                    qgg.h0(obj2);
                    eVar4.getClass();
                    ArrayList arrayList = new ArrayList();
                    Cursor query = eVar4.a.getReadableDatabase().query("gcm_subscriptions", com.yandex.passport.internal.database.tables.a.c, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("uid"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("gcm_token_hash"));
                            string.getClass();
                            int R = StringsKt.R(string, ':', 0, false);
                            if (R >= 1 && R != string.length() - 1) {
                                String substring = string.substring(0, R);
                                try {
                                    parseLong = Long.parseLong(string.substring(R + 1));
                                } catch (NumberFormatException unused) {
                                }
                                if (parseLong > 0) {
                                    try {
                                        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                                        int parseInt = Integer.parseInt(substring);
                                        aVar.getClass();
                                        bVar = com.yandex.passport.common.core.a.b(parseInt);
                                    } catch (Exception unused2) {
                                        bVar = com.yandex.passport.common.core.b.c;
                                    }
                                    fVar = new com.yandex.passport.common.core.f(bVar, parseLong);
                                    if (fVar == null) {
                                        arrayList.add(new t0(fVar, string2));
                                    }
                                }
                            }
                            fVar = null;
                            if (fVar == null) {
                            }
                        } finally {
                        }
                    }
                    query.close();
                    if (a()) {
                        ArrayList g = this.c.a().g();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it4 = g.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            if (e((com.yandex.passport.internal.l) next)) {
                                arrayList2.add(next);
                            } else {
                                arrayList3.add(next);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(v75.o(arrayList, 10));
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(((t0) it5.next()).a);
                        }
                        ArrayList arrayList5 = new ArrayList(v75.o(g, 10));
                        Iterator it6 = g.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((com.yandex.passport.internal.l) it6.next()).b);
                        }
                        List e0 = CollectionsKt.e0(arrayList4, CollectionsKt.A0(arrayList5));
                        ArrayList arrayList6 = new ArrayList(v75.o(arrayList3, 10));
                        Iterator it7 = arrayList3.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((com.yandex.passport.internal.l) it7.next()).b);
                        }
                        pair = new Pair(arrayList2, CollectionsKt.A0(CollectionsKt.g0(arrayList6, e0)));
                    } else {
                        c5b c5bVar = c5b.a;
                        ArrayList arrayList7 = new ArrayList(v75.o(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList7.add(((t0) it8.next()).a);
                        }
                        pair = new Pair(c5bVar, CollectionsKt.A0(arrayList7));
                    }
                    List list = (List) pair.a;
                    Set set5 = (Set) pair.b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    it = list.iterator();
                    set = set5;
                    map = linkedHashMap;
                    i2 = 0;
                    z2 = z;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        i7 = eVar.r;
                        i6 = eVar.q;
                        i2 = eVar.p;
                        z6 = eVar.j;
                        str2 = eVar.o;
                        lVar2 = eVar.n;
                        it = eVar.m;
                        map = eVar.l;
                        set3 = eVar.k;
                        qgg.h0(obj2);
                        eVar2 = eVar4;
                        z4 = true;
                        i4 = i6;
                        set2 = set3;
                        i3 = i7;
                        i5 = i2;
                        z3 = z6;
                        lVar = lVar2;
                        str = str2;
                        map2 = map;
                        it2 = it;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        v2Var = v2.a;
                        if (i3 == 0) {
                        }
                        eVar.getClass();
                        eVar.k = set2;
                        eVar.l = map2;
                        eVar.m = it2;
                        eVar.n = null;
                        eVar.o = null;
                        eVar.j = z3;
                        eVar.p = i5;
                        eVar.q = i4;
                        eVar.r = i3;
                        eVar.u = 2;
                        eVar3 = eVar;
                        if (this.b.d(lVar, v2Var, str, z5, true, true, eVar3) != nm6Var) {
                        }
                        return nm6Var;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i8 = eVar.p;
                        z7 = eVar.j;
                        it3 = eVar.m;
                        Map map3 = eVar.l;
                        Set set6 = eVar.k;
                        qgg.h0(obj2);
                        while (it3.hasNext()) {
                            com.yandex.passport.common.core.f fVar2 = (com.yandex.passport.common.core.f) it3.next();
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                r12 = 0;
                                i9 = 8;
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateToken skipping subscribe for non-current account", 8);
                            } else {
                                r12 = 0;
                                i9 = 8;
                            }
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, r12, "updateToken unsubscribe for non-current account", i9);
                            }
                            v2 v2Var2 = v2.a;
                            eVar.getClass();
                            eVar.k = r12;
                            eVar.l = r12;
                            eVar.m = it3;
                            eVar.n = r12;
                            eVar.o = r12;
                            eVar.j = z7;
                            eVar.p = i8;
                            eVar.q = 0;
                            eVar.u = 3;
                            if (s0Var.f(eVar, v2Var2, fVar2) == nm6Var) {
                                return nm6Var;
                            }
                        }
                        return Unit.a;
                    }
                    i5 = eVar.p;
                    z3 = eVar.j;
                    it2 = eVar.m;
                    map2 = eVar.l;
                    set2 = eVar.k;
                    qgg.h0(obj2);
                    eVar2 = eVar4;
                    z2 = z3;
                    it = it2;
                    map = map2;
                    i2 = i5;
                    set = set2;
                    eVar4 = eVar2;
                    if (!it.hasNext()) {
                        z7 = z2;
                        it3 = set.iterator();
                        i8 = 0;
                        while (it3.hasNext()) {
                        }
                        return Unit.a;
                    }
                    lVar2 = (com.yandex.passport.internal.l) it.next();
                    com.yandex.passport.common.core.f fVar3 = lVar2.b;
                    com.yandex.passport.common.core.b bVar2 = fVar3.a;
                    Object obj3 = map.get(bVar2);
                    if (obj3 != null) {
                        set4 = set;
                        obj = obj3;
                    } else {
                        int ordinal = fVar3.a.ordinal();
                        if (ordinal == 0) {
                            set4 = set;
                            d = d("1087931301371");
                        } else if (ordinal != 1) {
                            set4 = set;
                            d = ordinal == 2 ? d("410800666107") : ordinal == 3 ? d("410800666107") : ordinal != 4 ? null : d("1087931301371");
                        } else {
                            set4 = set;
                            d = d("1087931301371");
                        }
                        map.put(bVar2, d);
                        obj = d;
                    }
                    str2 = (String) obj;
                    if (str2 != null) {
                        t0 a = eVar4.a(fVar3);
                        String str3 = a != null ? a.b : null;
                        this.e.getClass();
                        boolean d2 = Intrinsics.d(str3, com.yandex.passport.internal.util.k.a(str2));
                        i3 = !d2 ? 1 : 0;
                        if (d2 || str3 == null) {
                            eVar2 = eVar4;
                            z4 = true;
                            set2 = set4;
                            i5 = i2;
                            i4 = 0;
                            z3 = z2;
                            it2 = it;
                            lVar = lVar2;
                            str = str2;
                            map2 = map;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateToken subscribe", 8);
                            }
                            v2Var = v2.a;
                            z5 = (i3 == 0 || z3) ? z4 : false;
                            eVar.getClass();
                            eVar.k = set2;
                            eVar.l = map2;
                            eVar.m = it2;
                            eVar.n = null;
                            eVar.o = null;
                            eVar.j = z3;
                            eVar.p = i5;
                            eVar.q = i4;
                            eVar.r = i3;
                            eVar.u = 2;
                            eVar3 = eVar;
                            if (this.b.d(lVar, v2Var, str, z5, true, true, eVar3) != nm6Var) {
                                eVar = eVar3;
                                z2 = z3;
                                it = it2;
                                map = map2;
                                i2 = i5;
                                set = set2;
                                eVar4 = eVar2;
                                if (!it.hasNext()) {
                                }
                            }
                            return nm6Var;
                        }
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            eVar2 = eVar4;
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateToken unsubscribe previous token", 8);
                        } else {
                            eVar2 = eVar4;
                        }
                        v2 v2Var3 = v2.a;
                        eVar.getClass();
                        eVar.k = set4;
                        eVar.l = map;
                        eVar.m = it;
                        eVar.n = lVar2;
                        eVar.o = str2;
                        eVar.j = z2;
                        eVar.p = i2;
                        eVar.q = 0;
                        eVar.r = i3;
                        z4 = true;
                        eVar.u = 1;
                        if (s0Var.f(eVar, v2Var3, fVar3) != nm6Var) {
                            z6 = z2;
                            i7 = i3;
                            i6 = 0;
                            set3 = set4;
                            i4 = i6;
                            set2 = set3;
                            i3 = i7;
                            i5 = i2;
                            z3 = z6;
                            lVar = lVar2;
                            str = str2;
                            map2 = map;
                            it2 = it;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            }
                            v2Var = v2.a;
                            if (i3 == 0) {
                            }
                            eVar.getClass();
                            eVar.k = set2;
                            eVar.l = map2;
                            eVar.m = it2;
                            eVar.n = null;
                            eVar.o = null;
                            eVar.j = z3;
                            eVar.p = i5;
                            eVar.q = i4;
                            eVar.r = i3;
                            eVar.u = 2;
                            eVar3 = eVar;
                            if (this.b.d(lVar, v2Var, str, z5, true, true, eVar3) != nm6Var) {
                            }
                        }
                        return nm6Var;
                    }
                    set2 = set4;
                    eVar2 = eVar4;
                    set = set2;
                    eVar4 = eVar2;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        eVar = new e(this, cg6Var);
        Object obj22 = eVar.s;
        nm6 nm6Var2 = nm6.a;
        i = eVar.u;
        s0 s0Var2 = this.b;
        com.yandex.passport.internal.database.e eVar42 = this.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0125, code lost:
    
        if (r7 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0399, code lost:
    
        if (f(r8, r2, r7, r4) != r5) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x036d A[LOOP:0: B:43:0x0367->B:45:0x036d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.yandex.passport.internal.push.g] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0314 -> B:18:0x0323). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x032f -> B:19:0x032c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x024d -> B:21:0x0260). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var, v2 v2Var, com.yandex.passport.common.core.f fVar) {
        f fVar2;
        int i;
        boolean a;
        Set i2;
        Collection i3;
        Object obj;
        ArrayList arrayList;
        Iterator it;
        int i4;
        com.yandex.passport.common.core.f fVar3;
        Pair pair;
        long parseLong;
        com.yandex.passport.common.core.b bVar;
        Object obj2;
        Iterator it2;
        Object obj3;
        int i5;
        int i6;
        ArrayList arrayList2;
        Object obj4;
        Set set;
        f fVar4;
        boolean z;
        boolean z2;
        Iterator it3;
        int i7;
        v2 v2Var2;
        com.yandex.passport.internal.l lVar;
        Iterator it4;
        com.yandex.passport.common.core.f fVar5;
        int i8;
        Object obj5;
        String str;
        v2 v2Var3 = v2Var;
        com.yandex.passport.common.core.f fVar6 = fVar;
        if (cg6Var instanceof f) {
            fVar2 = (f) cg6Var;
            int i9 = fVar2.A;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                fVar2.A = i9 - Integer.MIN_VALUE;
                Object obj6 = fVar2.y;
                nm6 nm6Var = nm6.a;
                i = fVar2.A;
                if (i != 0) {
                    qgg.h0(obj6);
                    a = a();
                    com.yandex.passport.internal.core.accounts.e eVar = this.c;
                    Collection g = eVar.a().g();
                    if (a || ((Boolean) this.i.b(com.yandex.passport.internal.flags.o.l0)).booleanValue()) {
                        if (fVar6 != null && (i3 = u75.i(eVar.a().e(fVar6))) != null) {
                            g = i3;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj7 : g) {
                            if (!((com.yandex.passport.internal.l) obj7).d.f()) {
                                arrayList3.add(obj7);
                            }
                        }
                        if (v2Var3 != null) {
                            i2 = uop.b(v2Var3);
                            obj = arrayList3;
                        }
                        List b = b();
                        ArrayList arrayList4 = new ArrayList(v75.o(b, 10));
                        Iterator it5 = b.iterator();
                        while (it5.hasNext()) {
                            ((com.yandex.passport.api.l) it5.next()).getClass();
                            arrayList4.add(v2.a);
                        }
                        i2 = wop.i(CollectionsKt.A0(arrayList4), CollectionsKt.A0(this.l.a));
                        obj = arrayList3;
                    } else {
                        Object obj8 = c5b.a;
                        i2 = q5b.a;
                        obj = obj8;
                    }
                    Set<String> keySet = this.b.d.a().a.keySet();
                    ArrayList arrayList5 = new ArrayList();
                    for (String str2 : keySet) {
                        v0.f.getClass();
                        str2.getClass();
                        v2 v2Var4 = v2.b;
                        if (!kotlin.text.c.n(str2, t.a(v2Var4), false)) {
                            v2Var4 = v2.c;
                            if (!kotlin.text.c.n(str2, t.a(v2Var4), false)) {
                                v2Var4 = v2.a;
                            }
                        }
                        String a0 = StringsKt.a0(str2, t.a(v2Var4));
                        int R = StringsKt.R(a0, ':', 0, false);
                        if (R >= 1 && R != a0.length() - 1) {
                            String substring = a0.substring(0, R);
                            try {
                                parseLong = Long.parseLong(a0.substring(R + 1));
                            } catch (NumberFormatException unused) {
                            }
                            if (parseLong > 0) {
                                try {
                                    com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                                    int parseInt = Integer.parseInt(substring);
                                    aVar.getClass();
                                    bVar = com.yandex.passport.common.core.a.b(parseInt);
                                } catch (Exception unused2) {
                                    bVar = com.yandex.passport.common.core.b.c;
                                }
                                fVar3 = new com.yandex.passport.common.core.f(bVar, parseLong);
                                pair = fVar3 == null ? new Pair(fVar3, v2Var4) : null;
                                if (pair == null) {
                                    arrayList5.add(pair);
                                }
                            }
                        }
                        fVar3 = null;
                        if (fVar3 == null) {
                        }
                        if (pair == null) {
                        }
                    }
                    arrayList = new ArrayList();
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        Pair pair2 = (Pair) next;
                        if (fVar6 == null || Intrinsics.d(pair2.a, fVar6)) {
                            if (v2Var3 == null || pair2.b == v2Var3) {
                                arrayList.add(next);
                            }
                        }
                    }
                    boolean isEmpty = ((Collection) obj).isEmpty();
                    obj2 = obj;
                    if (!isEmpty) {
                        obj2 = obj;
                        if (!i2.isEmpty()) {
                            it = ((Iterable) obj).iterator();
                            i4 = 0;
                            obj3 = obj;
                            obj2 = obj3;
                            if (it.hasNext()) {
                            }
                        }
                    }
                    ArrayList arrayList6 = (Iterable) obj2;
                    ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
                    it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                    }
                    Set A0 = CollectionsKt.A0(arrayList7);
                    fVar2.j = null;
                    fVar2.k = null;
                    fVar2.l = null;
                    fVar2.m = null;
                    fVar2.n = null;
                    fVar2.o = null;
                    fVar2.p = null;
                    fVar2.q = null;
                    fVar2.r = null;
                    fVar2.s = a;
                    fVar2.A = 3;
                } else if (i == 1) {
                    int i10 = fVar2.x;
                    int i11 = fVar2.w;
                    boolean z3 = fVar2.t;
                    int i12 = fVar2.v;
                    int i13 = fVar2.u;
                    boolean z4 = fVar2.s;
                    v2 v2Var5 = fVar2.r;
                    it3 = fVar2.q;
                    com.yandex.passport.internal.l lVar2 = fVar2.p;
                    Iterator it7 = fVar2.o;
                    List list = fVar2.n;
                    Set set2 = fVar2.m;
                    Object obj9 = (List) fVar2.l;
                    com.yandex.passport.common.core.f fVar7 = fVar2.k;
                    v2 v2Var6 = fVar2.j;
                    qgg.h0(obj6);
                    i7 = i13;
                    lVar = lVar2;
                    z2 = z4;
                    v2Var2 = v2Var5;
                    arrayList2 = list;
                    obj4 = obj9;
                    i6 = i11;
                    fVar4 = fVar2;
                    fVar5 = fVar7;
                    v2Var3 = v2Var6;
                    obj5 = obj6;
                    set = set2;
                    i5 = i12;
                    it4 = it7;
                    z = z3;
                    i8 = i10;
                    str = (String) obj5;
                    if (v2Var3 != v2Var2) {
                    }
                    if (str == null) {
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = fVar2.n;
                        Set set3 = fVar2.m;
                        List list3 = fVar2.l;
                        qgg.h0(obj6);
                        return Unit.a;
                    }
                    int i14 = fVar2.w;
                    boolean z5 = fVar2.t;
                    int i15 = fVar2.v;
                    i4 = fVar2.u;
                    boolean z6 = fVar2.s;
                    Iterator it8 = fVar2.q;
                    com.yandex.passport.internal.l lVar3 = fVar2.p;
                    it = fVar2.o;
                    List list4 = fVar2.n;
                    Set set4 = fVar2.m;
                    Object obj10 = (List) fVar2.l;
                    com.yandex.passport.common.core.f fVar8 = fVar2.k;
                    v2 v2Var7 = fVar2.j;
                    qgg.h0(obj6);
                    Iterator it9 = it8;
                    i6 = i14;
                    v2Var3 = v2Var7;
                    ArrayList arrayList8 = list4;
                    int i16 = i6;
                    int i17 = i15;
                    Object obj11 = obj10;
                    boolean e = z5;
                    fVar6 = fVar8;
                    i2 = set4;
                    com.yandex.passport.internal.l lVar4 = lVar3;
                    arrayList = arrayList8;
                    Iterator it10 = it9;
                    a = z6;
                    i5 = i17;
                    i6 = i16;
                    Object obj12 = obj11;
                    if (!it10.hasNext()) {
                        Object obj13 = obj12;
                        v2 v2Var8 = (v2) it10.next();
                        fVar2.j = v2Var3;
                        fVar2.k = fVar6;
                        v2 v2Var9 = v2Var3;
                        fVar2.l = (List) obj13;
                        fVar2.m = i2;
                        fVar2.n = arrayList;
                        fVar2.o = it;
                        fVar2.p = lVar4;
                        fVar2.q = it10;
                        fVar2.r = v2Var8;
                        fVar2.s = a;
                        fVar2.u = i4;
                        fVar2.v = i5;
                        fVar2.t = e;
                        fVar2.w = i6;
                        fVar2.x = 0;
                        fVar2.A = 1;
                        Object c = c(v2Var8, fVar2);
                        if (c != nm6Var) {
                            boolean z7 = e;
                            z2 = a;
                            obj5 = c;
                            v2Var3 = v2Var9;
                            set = i2;
                            lVar = lVar4;
                            it3 = it10;
                            z = z7;
                            obj4 = obj13;
                            arrayList2 = arrayList;
                            v2Var2 = v2Var8;
                            it4 = it;
                            i7 = i4;
                            fVar4 = fVar2;
                            fVar5 = fVar6;
                            i8 = 0;
                            str = (String) obj5;
                            boolean z8 = v2Var3 != v2Var2 || Intrinsics.d(lVar.b, fVar5);
                            if (str == null) {
                                fVar4.j = v2Var3;
                                fVar4.k = fVar5;
                                boolean z9 = z8;
                                fVar4.l = (List) obj4;
                                fVar4.m = set;
                                fVar4.n = arrayList2;
                                fVar4.o = it4;
                                fVar4.p = lVar;
                                fVar4.q = it3;
                                fVar4.r = null;
                                fVar4.s = z2;
                                fVar4.u = i7;
                                fVar4.v = i5;
                                fVar4.t = z;
                                fVar4.w = i6;
                                fVar4.x = i8;
                                fVar4.A = 2;
                                Iterator it11 = it4;
                                int i18 = i7;
                                it9 = it3;
                                if (this.b.d(lVar, v2Var2, str, z9, z2, z, fVar4) != nm6Var) {
                                    lVar3 = lVar;
                                    i15 = i5;
                                    it = it11;
                                    set4 = set;
                                    fVar8 = fVar5;
                                    z6 = z2;
                                    fVar2 = fVar4;
                                    obj10 = obj4;
                                    i4 = i18;
                                    z5 = z;
                                    arrayList8 = arrayList2;
                                    int i162 = i6;
                                    int i172 = i15;
                                    Object obj112 = obj10;
                                    boolean e2 = z5;
                                    fVar6 = fVar8;
                                    i2 = set4;
                                    com.yandex.passport.internal.l lVar42 = lVar3;
                                    arrayList = arrayList8;
                                    Iterator it102 = it9;
                                    a = z6;
                                    i5 = i172;
                                    i6 = i162;
                                    Object obj122 = obj112;
                                    if (!it102.hasNext()) {
                                        obj3 = obj122;
                                        obj2 = obj3;
                                        if (it.hasNext()) {
                                            lVar42 = (com.yandex.passport.internal.l) it.next();
                                            e2 = e(lVar42);
                                            it102 = i2.iterator();
                                            i5 = 0;
                                            i6 = 0;
                                            obj122 = obj3;
                                            if (!it102.hasNext()) {
                                            }
                                        }
                                        ArrayList arrayList62 = (Iterable) obj2;
                                        ArrayList arrayList72 = new ArrayList(v75.o(arrayList62, 10));
                                        it2 = arrayList62.iterator();
                                        while (it2.hasNext()) {
                                            arrayList72.add(((com.yandex.passport.internal.l) it2.next()).b);
                                        }
                                        Set A02 = CollectionsKt.A0(arrayList72);
                                        fVar2.j = null;
                                        fVar2.k = null;
                                        fVar2.l = null;
                                        fVar2.m = null;
                                        fVar2.n = null;
                                        fVar2.o = null;
                                        fVar2.p = null;
                                        fVar2.q = null;
                                        fVar2.r = null;
                                        fVar2.s = a;
                                        fVar2.A = 3;
                                    }
                                }
                            } else {
                                Iterator it12 = it4;
                                it9 = it3;
                                f fVar9 = fVar4;
                                i4 = i7;
                                fVar6 = fVar5;
                                fVar2 = fVar9;
                                lVar42 = lVar;
                                it = it12;
                                i2 = set;
                                obj112 = obj4;
                                arrayList = arrayList2;
                                i162 = i6;
                                i172 = i5;
                                z6 = z2;
                                e2 = z;
                                Iterator it1022 = it9;
                                a = z6;
                                i5 = i172;
                                i6 = i162;
                                Object obj1222 = obj112;
                                if (!it1022.hasNext()) {
                                }
                            }
                        }
                        return nm6Var;
                    }
                }
            }
        }
        fVar2 = new f(this, cg6Var);
        Object obj62 = fVar2.y;
        nm6 nm6Var2 = nm6.a;
        i = fVar2.A;
        if (i != 0) {
        }
    }
}
