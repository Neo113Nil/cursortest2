package com.yandex.passport.internal.autologin;

import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.p1;
import com.yandex.passport.internal.report.r1;
import com.yandex.passport.internal.usecase.o0;
import com.yandex.passport.internal.usecase.s0;
import com.yandex.passport.internal.usecase.ui.a0;
import com.yandex.passport.internal.usecase.ui.b0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.v75;
import defpackage.x7j;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.storage.m b;
    public final x c;
    public final com.yandex.passport.internal.report.reporters.i d;
    public final s0 e;
    public final o f;
    public final com.yandex.passport.internal.usecase.ui.e g;
    public final b0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.storage.m mVar, x xVar, com.yandex.passport.internal.report.reporters.i iVar, s0 s0Var, o oVar, com.yandex.passport.internal.usecase.ui.e eVar, b0 b0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        mVar.getClass();
        xVar.getClass();
        iVar.getClass();
        s0Var.getClass();
        oVar.getClass();
        eVar.getClass();
        b0Var.getClass();
        this.b = mVar;
        this.c = xVar;
        this.d = iVar;
        this.e = s0Var;
        this.f = oVar;
        this.g = eVar;
        this.h = b0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(2:11|12)(2:17|18))(2:19|20))(6:21|22|(2:38|(2:39|(1:48)(2:41|(3:43|(1:45)|46)(1:47))))(1:26)|27|(1:(3:30|(1:32)|12)(2:34|35))(1:36)|33)|13|14|15))|55|6|7|(0)(0)|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (r11 == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        r10 = defpackage.z7o.b;
        r11 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
    
        r10 = defpackage.z7o.b;
        r11 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable y(k kVar, e eVar, cg6 cg6Var) {
        j jVar;
        int i;
        Object t7oVar;
        com.yandex.passport.internal.report.reporters.i iVar = kVar.d;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jVar.j;
                nm6 nm6Var = nm6.a;
                i = jVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.api.x xVar = eVar.a;
                    iVar.v(xVar);
                    com.yandex.passport.common.core.f c = kVar.b.c();
                    List list = eVar.b;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (Intrinsics.d(((com.yandex.passport.internal.l) it.next()).b, c)) {
                                iVar.u(xVar, c != null ? new Long(c.b) : null);
                            }
                        }
                    }
                    int ordinal = xVar.ordinal();
                    if (ordinal == 0) {
                        jVar.l = 1;
                        obj = kVar.u(eVar, jVar);
                    } else {
                        if (ordinal != 1) {
                            throw new x7j();
                        }
                        jVar.l = 2;
                        obj = kVar.x(eVar, jVar);
                        if (obj == nm6Var) {
                        }
                        t7oVar = (com.yandex.passport.internal.l) obj;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    t7oVar = (com.yandex.passport.internal.l) obj;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    t7oVar = (com.yandex.passport.internal.l) obj;
                }
                r7o r7oVar2 = z7o.b;
                return new z7o(t7oVar);
            }
        }
        jVar = new j(kVar, cg6Var);
        Object obj2 = jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        return new z7o(t7oVar);
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return y(this, (e) obj, rhwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(e eVar, cg6 cg6Var) {
        f fVar;
        int i;
        com.yandex.passport.internal.l lVar;
        Object v;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.n = i2 - Integer.MIN_VALUE;
                Object obj = fVar.l;
                Object obj2 = nm6.a;
                i = fVar.n;
                com.yandex.passport.internal.report.reporters.i iVar = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    if (eVar.b.size() != 1) {
                        com.yandex.passport.api.x xVar = eVar.a;
                        iVar.getClass();
                        xVar.getClass();
                        iVar.n(r1.d, new com.yandex.passport.internal.report.a(xVar));
                        return null;
                    }
                    lVar = (com.yandex.passport.internal.l) eVar.b.get(0);
                    com.yandex.passport.internal.storage.e a = this.b.a(lVar.b);
                    if (!((Boolean) a.a.getValue(a, com.yandex.passport.internal.storage.e.d[0])).booleanValue()) {
                        boolean z = eVar.c;
                        com.yandex.passport.internal.credentials.f fVar2 = eVar.e;
                        fVar.j = eVar;
                        fVar.k = lVar;
                        fVar.n = 1;
                        v = v(lVar, z, fVar2, fVar);
                        if (v == obj2) {
                            return obj2;
                        }
                    }
                    com.yandex.passport.api.x xVar2 = eVar.a;
                    long j = lVar.b.b;
                    iVar.getClass();
                    xVar2.getClass();
                    iVar.n(p1.d, new com.yandex.passport.internal.report.a(xVar2), new ff(j, 18));
                    return null;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.yandex.passport.internal.l lVar2 = fVar.k;
                e eVar2 = fVar.j;
                qgg.h0(obj);
                lVar = lVar2;
                eVar = eVar2;
                v = obj;
                if (((Boolean) v).booleanValue()) {
                    return lVar;
                }
                com.yandex.passport.api.x xVar22 = eVar.a;
                long j2 = lVar.b.b;
                iVar.getClass();
                xVar22.getClass();
                iVar.n(p1.d, new com.yandex.passport.internal.report.a(xVar22), new ff(j2, 18));
                return null;
            }
        }
        fVar = new f(this, cg6Var);
        Object obj3 = fVar.l;
        Object obj22 = nm6.a;
        i = fVar.n;
        com.yandex.passport.internal.report.reporters.i iVar2 = this.d;
        if (i != 0) {
        }
        if (((Boolean) v).booleanValue()) {
        }
        com.yandex.passport.api.x xVar222 = eVar.a;
        long j22 = lVar.b.b;
        iVar2.getClass();
        xVar222.getClass();
        iVar2.n(p1.d, new com.yandex.passport.internal.report.a(xVar222), new ff(j22, 18));
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:17|18))(5:19|(1:21)|(2:23|(1:25))|13|14)|11|12|13|14))|30|6|7|(0)(0)|11|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r8 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error get auth token", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(com.yandex.passport.internal.l lVar, boolean z, com.yandex.passport.internal.credentials.f fVar, cg6 cg6Var) {
        g gVar;
        int i;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                boolean z2 = false;
                if (i != 0) {
                    qgg.h0(obj);
                    if (fVar == null) {
                        fVar = this.c.b(lVar.b.a);
                    }
                    if (fVar != null) {
                        s0 s0Var = this.e;
                        o0 o0Var = new o0(lVar, fVar, z);
                        gVar.l = 1;
                        obj = s0Var.g(o0Var, gVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                qgg.h0(((z7o) obj).a);
                z2 = true;
                return Boolean.valueOf(z2);
            }
        }
        gVar = new g(this, cg6Var);
        Object obj2 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        boolean z22 = false;
        if (i != 0) {
        }
        qgg.h0(((z7o) obj2).a);
        z22 = true;
        return Boolean.valueOf(z22);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(2:19|20))(3:28|29|(2:31|27))|21|(2:23|24)(1:25)))|36|6|7|(0)(0)|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r0 == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        r3 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Silent login by master member failed for uid=" + r2.a.b, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:12:0x002f, B:13:0x007f, B:20:0x003d, B:21:0x0058, B:25:0x005d, B:29:0x0044), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(com.yandex.passport.internal.entities.n nVar, cg6 cg6Var) {
        h hVar;
        int i;
        com.yandex.passport.internal.l lVar;
        com.yandex.passport.internal.entities.n nVar2 = nVar;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hVar.k;
                nm6 nm6Var = nm6.a;
                i = hVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    b0 b0Var = this.h;
                    a0 a0Var = new a0(nVar2.b);
                    hVar.j = nVar2;
                    hVar.m = 1;
                    obj = b0Var.g(a0Var, hVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nVar2 = hVar.j;
                        qgg.h0(obj);
                        Object obj2 = ((z7o) obj).a;
                        qgg.h0(obj2);
                        return (com.yandex.passport.internal.l) obj2;
                    }
                    nVar2 = hVar.j;
                    qgg.h0(obj);
                }
                lVar = (com.yandex.passport.internal.l) obj;
                if (lVar != null) {
                    return null;
                }
                com.yandex.passport.internal.usecase.ui.e eVar = this.g;
                com.yandex.passport.common.core.f fVar = nVar2.a;
                com.yandex.passport.common.core.f fVar2 = nVar2.b;
                com.yandex.passport.common.core.f fVar3 = lVar.b;
                com.yandex.passport.internal.usecase.ui.c cVar = new com.yandex.passport.internal.usecase.ui.c(fVar, fVar2, fVar3, lVar.d, fVar3.a, com.yandex.passport.internal.analytics.a.z, lVar.h());
                hVar.j = nVar2;
                hVar.m = 2;
                obj = eVar.g(cVar, hVar);
            }
        }
        hVar = new h(this, cg6Var);
        Object obj3 = hVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hVar.m;
        if (i != 0) {
        }
        lVar = (com.yandex.passport.internal.l) obj3;
        if (lVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0076, code lost:
    
        if (r15 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b A[LOOP:1: B:43:0x0115->B:45:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d4 -> B:17:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ef -> B:12:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(e eVar, cg6 cg6Var) {
        i iVar;
        int i;
        List list;
        Iterator it;
        Iterator it2;
        List list2;
        com.yandex.passport.internal.l lVar;
        Iterator it3;
        Object w;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.p = i2 - Integer.MIN_VALUE;
                Object obj = iVar.n;
                Object obj2 = nm6.a;
                i = iVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    List list3 = eVar.b;
                    com.yandex.passport.common.core.b bVar = eVar.d;
                    com.yandex.passport.internal.credentials.f fVar = eVar.e;
                    l lVar2 = new l(list3, bVar, fVar != null ? fVar.c : null);
                    iVar.j = eVar;
                    iVar.p = 1;
                    obj = this.f.g(lVar2, iVar);
                } else if (i == 1) {
                    eVar = iVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        com.yandex.passport.internal.l lVar3 = iVar.m;
                        Iterator it4 = iVar.l;
                        List list4 = iVar.k;
                        e eVar2 = iVar.j;
                        qgg.h0(obj);
                        it2 = it4;
                        list2 = list4;
                        if (!((Boolean) obj).booleanValue()) {
                            return lVar3;
                        }
                        list = list2;
                        it = it2;
                        eVar = eVar2;
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            com.yandex.passport.internal.storage.e a = this.b.a(cVar.a);
                            if (!((Boolean) a.a.getValue(a, com.yandex.passport.internal.storage.e.d[0])).booleanValue()) {
                                iVar.j = eVar;
                                iVar.k = list;
                                iVar.l = it;
                                iVar.m = null;
                                iVar.p = 2;
                                if (cVar instanceof a) {
                                    w = ((a) cVar).b;
                                } else {
                                    if (!(cVar instanceof b)) {
                                        b6e.s();
                                        return null;
                                    }
                                    w = w(((b) cVar).b, iVar);
                                }
                                if (w != obj2) {
                                    Iterator it5 = it;
                                    list2 = list;
                                    obj = w;
                                    it2 = it5;
                                    lVar = (com.yandex.passport.internal.l) obj;
                                    if (lVar != null) {
                                        list = list2;
                                        it = it2;
                                        while (it.hasNext()) {
                                        }
                                    } else {
                                        boolean z = eVar.c;
                                        com.yandex.passport.internal.credentials.f fVar2 = eVar.e;
                                        iVar.j = eVar;
                                        iVar.k = list2;
                                        iVar.l = it2;
                                        iVar.m = lVar;
                                        iVar.p = 3;
                                        Object v = v(lVar, z, fVar2, iVar);
                                        if (v != obj2) {
                                            eVar2 = eVar;
                                            lVar3 = lVar;
                                            obj = v;
                                            if (!((Boolean) obj).booleanValue()) {
                                            }
                                        }
                                    }
                                }
                                return obj2;
                            }
                        }
                        List list5 = list;
                        ArrayList arrayList = new ArrayList(v75.o(list5, 10));
                        it3 = list5.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(String.valueOf(((c) it3.next()).a.b));
                        }
                        List w0 = CollectionsKt.w0(arrayList);
                        com.yandex.passport.api.x xVar = eVar.a;
                        com.yandex.passport.internal.report.reporters.i iVar2 = this.d;
                        iVar2.getClass();
                        xVar.getClass();
                        w0.getClass();
                        iVar2.n(p1.d, new com.yandex.passport.internal.report.a(xVar), new ff(w0));
                        return null;
                    }
                    Iterator it6 = iVar.l;
                    list2 = iVar.k;
                    e eVar3 = iVar.j;
                    qgg.h0(obj);
                    it2 = it6;
                    eVar = eVar3;
                    lVar = (com.yandex.passport.internal.l) obj;
                    if (lVar != null) {
                    }
                }
                list = (List) obj;
                it = list.iterator();
                while (it.hasNext()) {
                }
                List list52 = list;
                ArrayList arrayList2 = new ArrayList(v75.o(list52, 10));
                it3 = list52.iterator();
                while (it3.hasNext()) {
                }
                List w02 = CollectionsKt.w0(arrayList2);
                com.yandex.passport.api.x xVar2 = eVar.a;
                com.yandex.passport.internal.report.reporters.i iVar22 = this.d;
                iVar22.getClass();
                xVar2.getClass();
                w02.getClass();
                iVar22.n(p1.d, new com.yandex.passport.internal.report.a(xVar2), new ff(w02));
                return null;
            }
        }
        iVar = new i(this, cg6Var);
        Object obj3 = iVar.n;
        Object obj22 = nm6.a;
        i = iVar.p;
        if (i != 0) {
        }
        list = (List) obj3;
        it = list.iterator();
        while (it.hasNext()) {
        }
        List list522 = list;
        ArrayList arrayList22 = new ArrayList(v75.o(list522, 10));
        it3 = list522.iterator();
        while (it3.hasNext()) {
        }
        List w022 = CollectionsKt.w0(arrayList22);
        com.yandex.passport.api.x xVar22 = eVar.a;
        com.yandex.passport.internal.report.reporters.i iVar222 = this.d;
        iVar222.getClass();
        xVar22.getClass();
        w022.getClass();
        iVar222.n(p1.d, new com.yandex.passport.internal.report.a(xVar22), new ff(w022));
        return null;
    }
}
