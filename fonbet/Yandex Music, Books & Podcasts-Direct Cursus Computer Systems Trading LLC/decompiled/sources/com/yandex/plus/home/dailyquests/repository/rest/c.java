package com.yandex.plus.home.dailyquests.repository.rest;

import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.core.openapi.g;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.d;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.e;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.f;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.h;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.i;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.j;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.l;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.d0;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.q;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.t;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.w;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.x;
import com.yandex.plus.home.dailyquests.repository.rest.prefs.y;
import com.yandex.plus.home.datasource.openapi.apis.MissionPlatformControllerApi;
import com.yandex.plus.home.datasource.openapi.models.n6;
import com.yandex.plus.home.datasource.openapi.models.s4;
import com.yandex.plus.home.datasource.openapi.models.t4;
import com.yandex.plus.home.datasource.openapi.models.t6;
import com.yandex.plus.home.datasource.openapi.models.w4;
import com.yandex.plus.home.k;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.r7o;
import defpackage.rqi;
import defpackage.t7o;
import defpackage.x7j;
import defpackage.xq0;
import defpackage.yhn;
import defpackage.z7o;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class c {
    public final d0 a;
    public final MissionPlatformControllerApi b;
    public final g c;
    public final a1 d;
    public final a1 e;
    public final k f;
    public final com.yandex.plus.core.android.extensions.c g;
    public final kotlinx.coroutines.a h;
    public final qqi i;

    public c(d0 d0Var, MissionPlatformControllerApi missionPlatformControllerApi, g gVar, k kVar, kotlinx.coroutines.a aVar) {
        a1 a1Var = new a1(13);
        a1 a1Var2 = new a1(14);
        com.yandex.plus.core.android.extensions.c.a.getClass();
        com.yandex.plus.core.android.extensions.a aVar2 = com.yandex.plus.core.android.extensions.b.b;
        missionPlatformControllerApi.getClass();
        gVar.getClass();
        aVar2.getClass();
        aVar.getClass();
        this.a = d0Var;
        this.b = missionPlatformControllerApi;
        this.c = gVar;
        this.d = a1Var;
        this.e = a1Var2;
        this.f = kVar;
        this.g = aVar2;
        this.h = aVar;
        this.i = rqi.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bf, code lost:
    
        if (r4.b(r1, r5) == r6) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d6, code lost:
    
        if (r9 == r6) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, Long l, Object obj, cg6 cg6Var) {
        b bVar;
        int i;
        Throwable a;
        int i2;
        Object c;
        String str;
        String str2;
        com.yandex.plus.home.dailyquests.repository.rest.prefs.k jVar;
        y lVar;
        String str3;
        String str4;
        w wVar;
        t tVar;
        Long l2 = l;
        a1 a1Var = cVar.d;
        d0 d0Var = cVar.a;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i3 = bVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.o = i3 - Integer.MIN_VALUE;
                Object obj2 = bVar.m;
                nm6 nm6Var = nm6.a;
                i = bVar.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    a = z7o.a(obj);
                    if (a == null) {
                        l lVar2 = (l) obj;
                        if (lVar2 != null) {
                            long j = cVar.g.get();
                            a1Var.getClass();
                            if (lVar2 instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.k) {
                                com.yandex.plus.home.dailyquests.repository.api.dailyquests.k kVar = (com.yandex.plus.home.dailyquests.repository.api.dailyquests.k) lVar2;
                                String str5 = kVar.a;
                                String str6 = kVar.b;
                                com.yandex.plus.home.dailyquests.repository.api.dailyquests.c cVar2 = kVar.f;
                                if (cVar2 instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.a) {
                                    str3 = ((com.yandex.plus.home.dailyquests.repository.api.dailyquests.a) cVar2).a;
                                } else {
                                    if (!(cVar2 instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.b)) {
                                        b6e.s();
                                        return null;
                                    }
                                    str3 = null;
                                }
                                boolean z = kVar.c;
                                j jVar2 = kVar.d;
                                if (jVar2 != null) {
                                    i iVar = jVar2.b;
                                    if (iVar != null) {
                                        String str7 = iVar.a;
                                        com.yandex.plus.core.data.common.y yVar = iVar.b;
                                        str4 = str5;
                                        tVar = new t(yVar.a, yVar.b, iVar.c, str7, iVar.d);
                                    } else {
                                        str4 = str5;
                                        tVar = null;
                                    }
                                    wVar = new w(jVar2.a, tVar);
                                } else {
                                    str4 = str5;
                                    wVar = null;
                                }
                                h hVar = kVar.e;
                                com.yandex.plus.core.data.common.y yVar2 = hVar.a;
                                lVar = new x(j, str4, str6, str3, z, wVar, new q(yVar2.a, yVar2.b, hVar.b, hVar.c, hVar.e, hVar.d, hVar.f));
                            } else {
                                if (!(lVar2 instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.g)) {
                                    b6e.s();
                                    return null;
                                }
                                com.yandex.plus.home.dailyquests.repository.api.dailyquests.g gVar = (com.yandex.plus.home.dailyquests.repository.api.dailyquests.g) lVar2;
                                String str8 = gVar.a;
                                String str9 = gVar.b;
                                com.yandex.plus.home.dailyquests.repository.api.dailyquests.c cVar3 = gVar.g;
                                if (cVar3 instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.a) {
                                    str = ((com.yandex.plus.home.dailyquests.repository.api.dailyquests.a) cVar3).a;
                                } else {
                                    if (!(cVar3 instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.b)) {
                                        b6e.s();
                                        return null;
                                    }
                                    str = null;
                                }
                                com.yandex.plus.core.data.common.y yVar3 = gVar.c;
                                String str10 = yVar3.a;
                                String str11 = yVar3.b;
                                com.yandex.plus.core.data.common.y yVar4 = gVar.d;
                                String str12 = yVar4.a;
                                String str13 = yVar4.b;
                                String str14 = gVar.e;
                                f fVar = gVar.f;
                                if (fVar instanceof d) {
                                    str2 = str8;
                                    jVar = new com.yandex.plus.home.dailyquests.repository.rest.prefs.g(((d) fVar).a);
                                } else {
                                    if (!(fVar instanceof e)) {
                                        b6e.s();
                                        return null;
                                    }
                                    e eVar = (e) fVar;
                                    com.yandex.plus.core.data.common.y yVar5 = eVar.b;
                                    str2 = str8;
                                    jVar = new com.yandex.plus.home.dailyquests.repository.rest.prefs.j(yVar5.a, yVar5.b, eVar.c, eVar.a, eVar.d, eVar.e);
                                }
                                lVar = new com.yandex.plus.home.dailyquests.repository.rest.prefs.l(j, str2, str9, str, str14, jVar, str10, str11, str12, str13);
                            }
                            bVar.j = null;
                            bVar.k = lVar2;
                            bVar.l = 0;
                            bVar.o = 1;
                            if (d0Var.d(l2, lVar, bVar) != nm6Var) {
                                return lVar2;
                            }
                        } else {
                            bVar.j = null;
                            bVar.k = null;
                            bVar.l = 0;
                            bVar.o = 2;
                        }
                    } else {
                        bVar.j = l2;
                        bVar.k = a;
                        i2 = 0;
                        bVar.l = 0;
                        bVar.o = 3;
                        c = d0Var.c(l2, bVar);
                    }
                } else {
                    if (i == 1) {
                        l lVar3 = (l) bVar.k;
                        qgg.h0(obj2);
                        return lVar3;
                    }
                    if (i == 2) {
                        qgg.h0(obj2);
                        xq0.q("Couldn't map response to daily quest!");
                        return null;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) bVar.k;
                        qgg.h0(obj2);
                        throw th;
                    }
                    int i4 = bVar.l;
                    Throwable th2 = (Throwable) bVar.k;
                    Long l3 = bVar.j;
                    qgg.h0(obj2);
                    i2 = i4;
                    l2 = l3;
                    c = obj2;
                    a = th2;
                    y yVar6 = (y) c;
                    if (yVar6 instanceof x) {
                        boolean c2 = cVar.c(yVar6);
                        a1Var.getClass();
                        return a1.g((x) yVar6, c2);
                    }
                    if ((yVar6 instanceof com.yandex.plus.home.dailyquests.repository.rest.prefs.l) && cVar.c(yVar6)) {
                        a1Var.getClass();
                        return a1.f((com.yandex.plus.home.dailyquests.repository.rest.prefs.l) yVar6);
                    }
                    bVar.j = null;
                    bVar.k = a;
                    bVar.l = i2;
                    bVar.o = 4;
                    if (d0Var.b(l2, bVar) != nm6Var) {
                        throw a;
                    }
                }
                return nm6Var;
            }
        }
        bVar = new b(cVar, cg6Var);
        Object obj22 = bVar.m;
        nm6 nm6Var2 = nm6.a;
        i = bVar.o;
        if (i != 0) {
        }
        return nm6Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r3 != null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.yandex.plus.home.dailyquests.repository.api.dailyquests.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, com.yandex.plus.core.openapi.a aVar) {
        String str;
        d dVar;
        com.yandex.plus.core.openapi.a aVar2 = aVar;
        cVar.getClass();
        try {
            if (aVar2 instanceof a.b) {
                t4 t4Var = ((w4) ((a.b) aVar2).a).b;
                if (t4Var == null) {
                    throw new IllegalArgumentException("mapNotNullCatching failed!");
                }
                aVar2 = new a.b(t4Var, ((a.b) aVar2).b);
            } else if (!(aVar2 instanceof a.AbstractC0017a)) {
                throw new x7j();
            }
        } catch (Throwable th) {
            aVar2 = new a.AbstractC0017a.c(aVar2.getB(), th);
        }
        g gVar = cVar.c;
        gVar.getClass();
        gVar.a(aVar2);
        if (!(aVar2 instanceof a.b)) {
            if (aVar2 instanceof a.AbstractC0017a) {
                r7o r7oVar = z7o.b;
                return new t7o(new Throwable("Server error when receiving daily quest"));
            }
            b6e.s();
            return null;
        }
        t4 t4Var2 = (t4) ((a.b) aVar2).a;
        r7o r7oVar2 = z7o.b;
        cVar.e.getClass();
        t4Var2.getClass();
        s4 s4Var = t4Var2.g;
        com.yandex.plus.home.datasource.openapi.models.e eVar = t4Var2.n;
        String str2 = t4Var2.d;
        String str3 = t4Var2.c;
        t6 t6Var = t4Var2.l;
        int ordinal = s4Var.ordinal();
        com.yandex.plus.home.dailyquests.repository.api.dailyquests.c cVar2 = com.yandex.plus.home.dailyquests.repository.api.dailyquests.b.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            if (t6Var != null) {
                String str4 = t6Var.g;
                dVar = str4 != null ? new e(str4, new com.yandex.plus.core.data.common.y(t6Var.c, t6Var.b), t6Var.d, t4Var2.f, t6Var.e) : null;
            }
            dVar = new d(t4Var2.f);
            d dVar2 = dVar;
            String str5 = t4Var2.a;
            com.yandex.plus.core.data.common.y yVar = new com.yandex.plus.core.data.common.y(str2, str3);
            com.yandex.plus.core.data.common.y yVar2 = new com.yandex.plus.core.data.common.y(t4Var2.h, t4Var2.i);
            String str6 = t4Var2.e;
            if (eVar != null) {
                cVar2 = new com.yandex.plus.home.dailyquests.repository.api.dailyquests.a(eVar.a);
            }
            return new com.yandex.plus.home.dailyquests.repository.api.dailyquests.g(str5, null, yVar, yVar2, str6, dVar2, cVar2);
        }
        n6 n6Var = t4Var2.j;
        if (n6Var == null) {
            return null;
        }
        i iVar = (t6Var == null || (str = t6Var.f) == null) ? null : new i(str, t6Var.d, t6Var.e, new com.yandex.plus.core.data.common.y(t6Var.c, t6Var.b));
        String str7 = t4Var2.a;
        boolean z = t4Var2.b;
        j jVar = new j(t4Var2.k, iVar);
        com.yandex.plus.core.data.common.y yVar3 = new com.yandex.plus.core.data.common.y(str2, str3);
        String str8 = t4Var2.e;
        int i = n6Var.b;
        String str9 = n6Var.d;
        String str10 = n6Var.c;
        Integer num = t4Var2.m;
        h hVar = new h(yVar3, str8, i, str10, str9, num != null ? Integer.valueOf(yhn.e(num.intValue(), new IntRange(1, 365, 1))) : null, true);
        if (eVar != null) {
            cVar2 = new com.yandex.plus.home.dailyquests.repository.api.dailyquests.a(eVar.a);
        }
        return new com.yandex.plus.home.dailyquests.repository.api.dailyquests.k(str7, null, z, jVar, hVar, cVar2);
    }

    public final boolean c(y yVar) {
        long j;
        long j2 = this.g.get();
        if (yVar.a() > j2) {
            return true;
        }
        long a = yVar.a();
        if (yVar instanceof x) {
            j = 900000;
        } else {
            if (!(yVar instanceof com.yandex.plus.home.dailyquests.repository.rest.prefs.l)) {
                b6e.s();
                return false;
            }
            j = 86400000;
        }
        return a + j > j2;
    }
}
