package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.cg6;
import defpackage.k32;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class x implements com.yandex.plus.pay.api.feature.offers.b {
    public final e a;
    public final com.yandex.plus.pay.internal.feature.offers.smart.a b;
    public final com.yandex.plus.pay.log.impl.b c;
    public final com.yandex.plus.core.benchmark.x d;
    public final com.yandex.plus.core.benchmark.l e;

    public x(e eVar, com.yandex.plus.pay.internal.feature.offers.smart.a aVar, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.core.benchmark.x xVar) {
        eVar.getClass();
        aVar.getClass();
        bVar.getClass();
        this.a = eVar;
        this.b = aVar;
        this.c = bVar;
        this.d = xVar;
        this.e = ((com.yandex.plus.core.benchmark.c) xVar).b("Offers.Loading");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Set set, Map map, com.yandex.plus.pay.api.analytics.c cVar, boolean z, com.yandex.plus.home.feature.webviews.internal.webview.e eVar, cg6 cg6Var) {
        u uVar;
        int i;
        String str2;
        Set set2;
        Map map2;
        com.yandex.plus.pay.api.analytics.c cVar2;
        boolean z2;
        com.yandex.plus.pay.log.impl.b bVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof u) {
                uVar = (u) cg6Var;
                int i2 = uVar.r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    uVar.r = i2 - Integer.MIN_VALUE;
                    u uVar2 = uVar;
                    Object obj2 = uVar2.p;
                    nm6 nm6Var = nm6.a;
                    i = uVar2.r;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.c;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.internal.feature.offers.smart.a aVar = this.b;
                            uVar2.j = str;
                            uVar2.k = set;
                            uVar2.l = map;
                            uVar2.m = cVar;
                            uVar2.n = bVar2;
                            uVar2.o = z;
                            uVar2.r = 1;
                            obj2 = ((com.yandex.plus.pay.internal.feature.offers.smart.f) aVar).b(str, set, map, cVar, z, eVar, uVar2);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            str2 = str;
                            set2 = set;
                            map2 = map;
                            cVar2 = cVar;
                            z2 = z;
                            bVar = bVar2;
                        } catch (wis e) {
                            e = e;
                            str2 = str;
                            set2 = set;
                            map2 = map;
                            cVar2 = cVar;
                            z2 = z;
                            bVar = bVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            str2 = str;
                            set2 = set;
                            map2 = map;
                            cVar2 = cVar;
                            z2 = z;
                            bVar = bVar2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = uVar2.o;
                        bVar = uVar2.n;
                        cVar2 = uVar2.m;
                        map2 = uVar2.l;
                        set2 = uVar2.k;
                        str2 = uVar2.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = (Map) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    Map map3 = (Map) obj;
                    com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.api.log.b.b, this + ".getBestSmartOffers(" + str2 + ", " + set2 + ", " + map2 + ", " + cVar2 + ", " + z2 + ") = " + map3);
                    return map3;
                }
            }
            if (i != 0) {
            }
            obj = (Map) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        uVar = new u(this, cg6Var);
        u uVar22 = uVar;
        Object obj22 = uVar22.p;
        nm6 nm6Var2 = nm6.a;
        i = uVar22.r;
        com.yandex.plus.pay.log.impl.b bVar22 = this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.yandex.plus.pay.log.impl.b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.plus.pay.log.impl.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, com.yandex.plus.pay.api.analytics.c cVar, com.yandex.plus.pay.api.feature.offers.a aVar, k32 k32Var, cg6 cg6Var) {
        v vVar;
        String str2;
        com.yandex.plus.pay.api.feature.offers.a aVar2;
        nm6 nm6Var;
        t7o t7oVar;
        String str3;
        com.yandex.plus.pay.api.analytics.c cVar2;
        com.yandex.plus.pay.api.feature.offers.a aVar3;
        nm6 nm6Var2;
        Object obj;
        String str4;
        com.yandex.plus.pay.api.feature.offers.a aVar4;
        nm6 nm6Var3;
        String str5;
        com.yandex.plus.pay.api.analytics.c cVar3;
        com.yandex.plus.pay.api.feature.offers.a aVar5;
        ?? r1;
        Throwable a;
        String str6;
        com.yandex.plus.pay.api.analytics.c cVar4;
        com.yandex.plus.pay.api.feature.offers.a aVar6;
        com.yandex.plus.pay.log.impl.b bVar;
        int i;
        ?? r4;
        if (!(cg6Var instanceof v) || (r4 = (i = (vVar = (v) cg6Var).p) & Integer.MIN_VALUE) == 0) {
            vVar = new v(this, cg6Var);
        } else {
            vVar.p = i - Integer.MIN_VALUE;
        }
        v vVar2 = vVar;
        Object obj2 = vVar2.n;
        nm6 nm6Var4 = nm6.a;
        ?? r2 = vVar2.p;
        ?? r9 = this.c;
        com.yandex.plus.core.benchmark.x xVar = this.d;
        ?? r3 = 1;
        ?? r32 = 1;
        com.yandex.plus.core.benchmark.l lVar = this.e;
        try {
            if (r2 == 0) {
                qgg.h0(obj2);
                lVar.c();
                try {
                    try {
                        r7o r7oVar = z7o.b;
                        try {
                            e eVar = this.a;
                            vVar2.j = str;
                            vVar2.k = cVar;
                            vVar2.l = aVar;
                            vVar2.m = r9;
                            vVar2.p = 1;
                            obj2 = ((j) eVar).a(str, cVar, aVar, k32Var, vVar2);
                            if (obj2 == nm6Var4) {
                                return nm6Var4;
                            }
                            str6 = str;
                            cVar4 = cVar;
                            aVar6 = aVar;
                            bVar = r9;
                        } catch (Throwable th) {
                            th = th;
                            lVar.d();
                            ((com.yandex.plus.core.benchmark.c) xVar).c(lVar, null);
                            throw th;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (wis e2) {
                    e = e2;
                    str4 = str;
                    r32 = cVar;
                    aVar4 = aVar;
                    nm6Var3 = r9;
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(e);
                    nm6Var2 = nm6Var3;
                    aVar3 = aVar4;
                    cVar2 = r32;
                    str3 = str4;
                    obj = t7oVar;
                    r1 = nm6Var2;
                    aVar5 = aVar3;
                    cVar3 = cVar2;
                    str5 = str3;
                    a = z7o.a(obj);
                    if (a != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str;
                    r3 = cVar;
                    aVar2 = aVar;
                    nm6Var = r9;
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                    nm6Var2 = nm6Var;
                    aVar3 = aVar2;
                    cVar2 = r3;
                    str3 = str2;
                    obj = t7oVar;
                    r1 = nm6Var2;
                    aVar5 = aVar3;
                    cVar3 = cVar2;
                    str5 = str3;
                    a = z7o.a(obj);
                    if (a != null) {
                    }
                }
            } else {
                if (r2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.yandex.plus.pay.log.impl.b bVar2 = vVar2.m;
                com.yandex.plus.pay.api.feature.offers.a aVar7 = vVar2.l;
                com.yandex.plus.pay.api.analytics.c cVar5 = vVar2.k;
                String str7 = vVar2.j;
                try {
                    qgg.h0(obj2);
                    bVar = bVar2;
                    aVar6 = aVar7;
                    cVar4 = cVar5;
                    str6 = str7;
                } catch (Throwable th3) {
                    th = th3;
                    lVar.d();
                    ((com.yandex.plus.core.benchmark.c) xVar).c(lVar, null);
                    throw th;
                }
            }
            obj = (PlusPayCompositeOffers) obj2;
            lVar.d();
            ((com.yandex.plus.core.benchmark.c) xVar).c(lVar, null);
            r7o r7oVar4 = z7o.b;
            r1 = bVar;
            aVar5 = aVar6;
            cVar3 = cVar4;
            str5 = str6;
        } catch (wis e3) {
            e = e3;
            nm6Var3 = nm6Var4;
            aVar4 = r2;
            str4 = r4;
        } catch (Throwable th4) {
            th = th4;
            nm6Var = nm6Var4;
            aVar2 = r2;
            str2 = r4;
        }
        a = z7o.a(obj);
        if (a != null) {
            if (a instanceof com.yandex.plus.pay.api.exception.a) {
                throw a;
            }
            com.yandex.plus.pay.log.impl.b.f(r1, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
            throw new PlusPayUnexpectedException(a);
        }
        PlusPayCompositeOffers plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(".getCompositeOffers(");
        sb.append(str5);
        sb.append(", ");
        sb.append(false);
        sb.append(", ");
        sb.append("PlusPayAnalyticsParams(" + cVar3.a + ", " + cVar3.b + ", " + cVar3.c + ", " + cVar3.d + ", " + cVar3.e + ", " + cVar3.f + ')');
        sb.append(", ");
        sb.append(aVar5);
        sb.append(") = ");
        sb.append(plusPayCompositeOffers);
        com.yandex.plus.pay.log.impl.b.d(r9, com.yandex.plus.pay.api.log.b.b, sb.toString());
        return plusPayCompositeOffers;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Set set, Map map, com.yandex.plus.pay.api.analytics.c cVar, boolean z, com.yandex.plus.home.feature.webviews.internal.webview.e eVar, cg6 cg6Var) {
        w wVar;
        int i;
        String str2;
        Set set2;
        Map map2;
        com.yandex.plus.pay.api.analytics.c cVar2;
        boolean z2;
        com.yandex.plus.pay.log.impl.b bVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof w) {
                wVar = (w) cg6Var;
                int i2 = wVar.r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wVar.r = i2 - Integer.MIN_VALUE;
                    w wVar2 = wVar;
                    Object obj2 = wVar2.p;
                    nm6 nm6Var = nm6.a;
                    i = wVar2.r;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.c;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.internal.feature.offers.smart.a aVar = this.b;
                            wVar2.j = str;
                            wVar2.k = set;
                            wVar2.l = map;
                            wVar2.m = cVar;
                            wVar2.n = bVar2;
                            wVar2.o = z;
                            wVar2.r = 1;
                            obj2 = ((com.yandex.plus.pay.internal.feature.offers.smart.f) aVar).c(str, set, map, cVar, z, eVar, wVar2);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            str2 = str;
                            set2 = set;
                            map2 = map;
                            cVar2 = cVar;
                            z2 = z;
                            bVar = bVar2;
                        } catch (wis e) {
                            e = e;
                            str2 = str;
                            set2 = set;
                            map2 = map;
                            cVar2 = cVar;
                            z2 = z;
                            bVar = bVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            str2 = str;
                            set2 = set;
                            map2 = map;
                            cVar2 = cVar;
                            z2 = z;
                            bVar = bVar2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = wVar2.o;
                        bVar = wVar2.n;
                        cVar2 = wVar2.m;
                        map2 = wVar2.l;
                        set2 = wVar2.k;
                        str2 = wVar2.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = (List) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    List list = (List) obj;
                    com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.api.log.b.b, this + ".getSmartOffers(" + str2 + ", " + set2 + ", " + map2 + ", " + cVar2 + ", " + z2 + ") = " + list);
                    return list;
                }
            }
            if (i != 0) {
            }
            obj = (List) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        wVar = new w(this, cg6Var);
        w wVar22 = wVar;
        Object obj22 = wVar22.p;
        nm6 nm6Var2 = nm6.a;
        i = wVar22.r;
        com.yandex.plus.pay.log.impl.b bVar22 = this.c;
    }
}
