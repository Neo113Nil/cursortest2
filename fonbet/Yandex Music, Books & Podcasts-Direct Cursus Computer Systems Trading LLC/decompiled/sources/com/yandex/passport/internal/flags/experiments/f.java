package com.yandex.passport.internal.flags.experiments;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.yandex.passport.data.network.j2;
import com.yandex.passport.data.network.k2;
import com.yandex.passport.data.network.r2;
import com.yandex.passport.data.network.s2;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.o7;
import com.yandex.passport.internal.report.p7;
import com.yandex.passport.internal.report.q7;
import com.yandex.passport.internal.report.reporters.b0;
import com.yandex.passport.internal.report.reporters.c0;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.ze;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uah;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.z7o;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class f {
    public final s2 a;
    public final i b;
    public final com.yandex.passport.data.network.l c;
    public final c0 d;
    public final com.yandex.passport.common.analytics.f e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final x0q g;

    public f(s2 s2Var, i iVar, com.yandex.passport.data.network.l lVar, c0 c0Var, com.yandex.passport.common.analytics.f fVar, com.yandex.passport.internal.network.mappers.b bVar) {
        s2Var.getClass();
        iVar.getClass();
        lVar.getClass();
        c0Var.getClass();
        fVar.getClass();
        bVar.getClass();
        this.a = s2Var;
        this.b = iVar;
        this.c = lVar;
        this.d = c0Var;
        this.e = fVar;
        this.f = bVar;
        this.g = y0q.b(1, 0, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x00a5, code lost:
    
        if (r0 == r3) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.common.core.b bVar, cg6 cg6Var) {
        e eVar;
        nm6 nm6Var;
        int i;
        Object obj;
        z7o z7oVar;
        z7o z7oVar2;
        List list;
        Throwable a;
        long b;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = eVar.k;
                nm6Var = nm6.a;
                i = eVar.m;
                c0 c0Var = this.d;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "fetchExperiments()", 8);
                    }
                    String str = this.e.b().a;
                    if (str == null) {
                        str = null;
                    }
                    if (str == null) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Unknown device id, experiments will be updated later", 8);
                        }
                        Exception exc = new Exception("Unknown device id, experiments will be updated later");
                        c0Var.getClass();
                        c0Var.n(p7.d, new ff(exc), new ue(exc));
                        return Unit.a;
                    }
                    this.f.getClass();
                    k2 k2Var = new k2(com.yandex.passport.internal.network.mappers.b.a(bVar), str);
                    eVar.m = 1;
                    obj2 = this.a.g(k2Var, eVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z7oVar2 = eVar.j;
                        qgg.h0(obj2);
                        Object obj3 = z7oVar2.a;
                        a = z7o.a(obj3);
                        if (a != null) {
                            a aVar = (a) obj3;
                            i iVar = this.b;
                            iVar.getClass();
                            SharedPreferences sharedPreferences = iVar.a;
                            aVar.getClass();
                            Map map = aVar.a;
                            Map o = uah.o(map);
                            for (Map.Entry entry : map.entrySet()) {
                                String str2 = (String) entry.getKey();
                                str2.getClass();
                                Iterable iterable = (List) aVar.b.get(str2);
                                if (iterable == null) {
                                    iterable = c5b.a;
                                }
                                g gVar = iVar.b;
                                Object key = entry.getKey();
                                iterable.getClass();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(o);
                                Iterator it = iterable.iterator();
                                while (it.hasNext()) {
                                    if (((n) it.next()).a(gVar.a)) {
                                        linkedHashMap.remove(key);
                                    }
                                }
                                o = linkedHashMap;
                            }
                            b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, sharedPreferences.getLong("__last__enqueue__time", 0L));
                            SharedPreferences.Editor clear = sharedPreferences.edit().clear();
                            for (Map.Entry entry2 : o.entrySet()) {
                                clear.putString((String) entry2.getKey(), (String) entry2.getValue());
                            }
                            clear.putLong("__last__updated__time", System.currentTimeMillis());
                            clear.putLong("__last__enqueue__time", b);
                            clear.apply();
                            b0 b0Var = iVar.c;
                            b bVar2 = iVar.e;
                            ArrayList arrayList = new ArrayList();
                            Map<String, ?> all = bVar2.a.getAll();
                            all.getClass();
                            for (Map.Entry<String, ?> entry3 : all.entrySet()) {
                                String key2 = entry3.getKey();
                                key2.getClass();
                                arrayList.add(new com.yandex.passport.internal.report.c(entry3.getValue(), key2));
                            }
                            ArrayList g0 = CollectionsKt.g0(arrayList, iVar.d.a());
                            com.yandex.passport.internal.report.e eVar2 = b0Var.a;
                            eVar2.getClass();
                            IReporterYandex iReporterYandex = eVar2.a;
                            iReporterYandex.clearAppEnvironment();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = g0.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                ze zeVar = (ze) next;
                                if (!kotlin.text.c.v(zeVar.getName(), "experiments_ios_", false) && !kotlin.text.c.v(zeVar.getName(), "experiments_reporting_", false)) {
                                    arrayList2.add(next);
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                ze zeVar2 = (ze) it3.next();
                                iReporterYandex.putAppEnvironmentValue(zeVar2.getName(), zeVar2.getValue());
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.a, "[ENVIRONMENT EVENT]", zeVar2.getName() + ": " + zeVar2.getValue(), 8);
                                }
                            }
                            String str3 = aVar.c;
                            c0Var.getClass();
                            q7 q7Var = q7.d;
                            if (str3 == null) {
                                str3 = CommonUrlParts.Values.FALSE_INTEGER;
                            }
                            c0Var.n(q7Var, new com.yandex.passport.internal.report.c("server_date", str3));
                        } else {
                            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "fetchExperiments()", a);
                            }
                            c0Var.getClass();
                            c0Var.n(p7.d, new ff(a), new ue(a));
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.data.models.h hVar = (com.yandex.passport.data.models.h) obj;
                    c0 c0Var2 = (c0) this.c.a;
                    hVar.getClass();
                    r2 r2Var = hVar.a;
                    if (TextUtils.equals(r2Var.a, "ok")) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        List list2 = r2Var.b;
                        int size = list2.size();
                        int i3 = 1;
                        int i4 = 0;
                        while (i4 < size) {
                            try {
                                List list3 = ((j2) list2.get(i4)).b.a;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it4 = list3.iterator();
                                int i5 = i3;
                                while (it4.hasNext()) {
                                    String str4 = (String) it4.next();
                                    if (com.yandex.passport.data.network.l.t(str4, "appID")) {
                                        com.yandex.passport.data.network.l.J(str4, linkedHashMap3, arrayList3);
                                    } else if (com.yandex.passport.data.network.l.t(str4, "am_version")) {
                                        com.yandex.passport.data.network.l.I(str4, linkedHashMap3, arrayList3);
                                    } else {
                                        if (i5 == 0) {
                                            arrayList3.clear();
                                            i5 = i3;
                                        }
                                        Iterator it5 = it4;
                                        list = list2;
                                        try {
                                            String[] strArr = (String[]) new Regex("=").g(2, str4).toArray(new String[0]);
                                            arrayList3.add(strArr[0]);
                                            linkedHashMap2.put(strArr[0], strArr[i3]);
                                            it4 = it5;
                                            list2 = list;
                                        } catch (Exception e) {
                                            e = e;
                                            c0Var2.getClass();
                                            o7 o7Var = o7.d;
                                            ze[] zeVarArr = new ze[i3];
                                            zeVarArr[0] = new ve("flags", 17);
                                            c0Var2.n(o7Var, zeVarArr);
                                            com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "parseExperimentsResponse()", e);
                                            }
                                            i4++;
                                            list2 = list;
                                            i3 = 1;
                                        }
                                    }
                                    i5 = 0;
                                }
                                list = list2;
                            } catch (Exception e2) {
                                e = e2;
                                list = list2;
                            }
                            i4++;
                            list2 = list;
                            i3 = 1;
                        }
                        obj = new a(hVar.b, linkedHashMap2, linkedHashMap3);
                    } else {
                        c0Var2.getClass();
                        c0Var2.n(o7.d, new ve("status", 17));
                        e5b e5bVar = e5b.a;
                        e5bVar.getClass();
                        obj = new a(null, e5bVar, e5bVar);
                    }
                }
                z7o z7oVar3 = new z7o(obj);
                z7oVar = new z7o(obj);
                eVar.j = z7oVar3;
                eVar.m = 2;
                if (this.g.emit(z7oVar, eVar) != nm6Var) {
                    z7oVar2 = z7oVar3;
                    Object obj32 = z7oVar2.a;
                    a = z7o.a(obj32);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        eVar = new e(this, cg6Var);
        Object obj22 = eVar.k;
        nm6Var = nm6.a;
        i = eVar.m;
        c0 c0Var3 = this.d;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        z7o z7oVar32 = new z7o(obj);
        z7oVar = new z7o(obj);
        eVar.j = z7oVar32;
        eVar.m = 2;
        if (this.g.emit(z7oVar, eVar) != nm6Var) {
        }
        return nm6Var;
    }
}
