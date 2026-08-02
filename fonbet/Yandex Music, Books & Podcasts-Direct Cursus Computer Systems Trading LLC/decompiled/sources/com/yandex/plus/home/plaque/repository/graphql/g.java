package com.yandex.plus.home.plaque.repository.graphql;

import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.graphql.c2;
import com.yandex.plus.core.graphql.d2;
import com.yandex.plus.core.graphql.e2;
import com.yandex.plus.core.graphql.fragment.xe;
import com.yandex.plus.core.graphql.k2;
import com.yandex.plus.core.graphql.m2;
import com.yandex.plus.core.graphql.type.t0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w1;
import defpackage.aa0;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.e5b;
import defpackage.eta;
import defpackage.i5f;
import defpackage.kp0;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oi3;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t6e;
import defpackage.t75;
import defpackage.t7o;
import defpackage.v75;
import defpackage.vn1;
import defpackage.wa2;
import defpackage.wis;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.ydr;
import defpackage.z7o;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class g implements com.yandex.plus.home.plaque.repository.api.a {
    public final dp0 a;
    public final com.yandex.plus.core.graphql.target.d b;
    public final ArrayList c;
    public final com.yandex.plus.home.plaque.plugin.internal.defaults.c d;
    public final com.yandex.plus.home.k e;
    public final com.yandex.plus.home.k f;
    public final com.yandex.plus.home.plaque.plugin.internal.di.b g;
    public final int h;
    public final com.yandex.plus.home.k i;
    public final com.yandex.plus.home.k j;
    public final com.yandex.plus.home.k k;
    public final com.yandex.plus.home.core.network.d l;
    public final com.yandex.plus.log.api.b m;
    public final kotlinx.coroutines.a n;
    public final x0q o;
    public final xdr p;
    public final xdr q;
    public final com.yandex.plus.home.plaque.animator.internal.utils.a r;
    public final com.yandex.passport.internal.entities.j s;

    public g(dp0 dp0Var, com.yandex.plus.core.graphql.target.d dVar, ArrayList arrayList, s sVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.home.plaque.plugin.internal.defaults.c cVar, com.yandex.plus.home.k kVar, com.yandex.plus.home.k kVar2, com.yandex.plus.home.plaque.plugin.internal.di.b bVar2, int i, com.yandex.plus.home.k kVar3, com.yandex.plus.home.k kVar4, com.yandex.plus.home.k kVar5, com.yandex.plus.home.core.network.d dVar2, com.yandex.plus.log.api.b bVar3, mm6 mm6Var, kotlinx.coroutines.a aVar) {
        dp0Var.getClass();
        dVar.getClass();
        dVar2.getClass();
        bVar3.getClass();
        mm6Var.getClass();
        aVar.getClass();
        this.a = dp0Var;
        this.b = dVar;
        this.c = arrayList;
        this.d = cVar;
        this.e = kVar;
        this.f = kVar2;
        this.g = bVar2;
        this.h = i;
        this.i = kVar3;
        this.j = kVar4;
        this.k = kVar5;
        this.l = dVar2;
        this.m = bVar3;
        this.n = aVar;
        x0q b = y0q.b(1, 0, oi3.b, 2);
        b.a(null);
        this.o = b;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.p = ydr.a(e5bVar);
        this.q = ydr.a(Boolean.FALSE);
        this.r = new com.yandex.plus.home.plaque.animator.internal.utils.a();
        aVar.getClass();
        bVar3.getClass();
        mm6Var.getClass();
        com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
        jVar.a = sVar;
        jVar.b = bVar;
        jVar.c = aVar;
        jVar.d = bVar3;
        jVar.e = mm6Var;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(g gVar, cg6 cg6Var) {
        b bVar;
        int i;
        Long l;
        boolean z;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bVar.l;
                nm6 nm6Var = nm6.a;
                i = bVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    Long id = ((com.yandex.plus.domain.auth.api.e) gVar.f.invoke()).getId();
                    boolean booleanValue = ((Boolean) gVar.e.invoke()).booleanValue();
                    com.yandex.plus.home.plaque.plugin.internal.di.b bVar2 = gVar.g;
                    bVar.j = id;
                    bVar.k = booleanValue;
                    bVar.n = 1;
                    Object invoke = bVar2.invoke(bVar);
                    if (invoke == nm6Var) {
                        return nm6Var;
                    }
                    l = id;
                    obj = invoke;
                    z = booleanValue;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = bVar.k;
                    l = bVar.j;
                    qgg.h0(obj);
                }
                return new com.yandex.plus.home.plaque.repository.graphql.cache.a(l, z, (String) obj);
            }
        }
        bVar = new b(gVar, cg6Var);
        Object obj2 = bVar.l;
        nm6 nm6Var2 = nm6.a;
        i = bVar.n;
        if (i != 0) {
        }
        return new com.yandex.plus.home.plaque.repository.graphql.cache.a(l, z, (String) obj2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(1:(9:12|13|14|15|(1:17)|18|(1:20)|21|(6:23|(1:25)|26|(2:30|(1:32))|33|34)(4:36|(1:38)|39|40))(2:42|43))(1:44))(1:52)|45|(1:47)|48|49))|61|6|7|8|(0)(0)|45|(0)|48|49|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        if (r0 != r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0069, code lost:
    
        if (r3 == r13) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
    
        r0 = r2;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b5, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0051  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(g gVar, String str, com.yandex.passport.internal.flags.experiments.p pVar, cg6 cg6Var) {
        d dVar;
        int i;
        String str2;
        Object b;
        com.yandex.passport.internal.flags.experiments.p pVar2;
        com.yandex.plus.log.api.a aVar;
        com.yandex.plus.log.api.b bVar = gVar.m;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.n = i2 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.l;
                nm6 nm6Var = nm6.a;
                i = dVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.graphql.target.d dVar3 = gVar.b;
                    str2 = str;
                    dVar2.j = str2;
                    com.yandex.passport.internal.flags.experiments.p pVar3 = pVar;
                    dVar2.k = pVar3;
                    dVar2.n = 1;
                    b = com.yandex.plus.core.graphql.target.d.b(dVar3, null, null, null, dVar2, 12);
                    pVar2 = pVar3;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        com.yandex.passport.internal.flags.experiments.p pVar4 = dVar2.k;
                        qgg.h0(obj);
                        i = pVar4;
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.internal.flags.experiments.p pVar5 = i;
                        if (!(obj instanceof t7o)) {
                            com.yandex.passport.internal.flags.experiments.p.E(pVar5);
                        }
                        if (z7o.a(obj) != null) {
                            pVar5.F();
                        }
                        Throwable a = z7o.a(obj);
                        if (a != null) {
                            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                            if (bVar.b(aVar2)) {
                                bVar.a(aVar2, "GraphQLPlaqueRepository", "error report plaqueClicked", a);
                            }
                            return Unit.a;
                        }
                        kp0 kp0Var = (kp0) obj;
                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.a;
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "GraphQLPlaqueRepository", "requestPlaqueClicked() response=" + kp0Var);
                        }
                        List list = kp0Var.d;
                        if (list != null && !list.isEmpty()) {
                            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                            if (bVar.b(aVar4)) {
                                bVar.c(aVar4, "GraphQLPlaqueRepository", "plaqueClicked mutation was failed! " + kp0Var.d);
                            }
                        }
                        return Unit.a;
                    }
                    com.yandex.passport.internal.flags.experiments.p pVar6 = dVar2.k;
                    String str3 = dVar2.j;
                    qgg.h0(obj);
                    b = obj;
                    str2 = str3;
                    pVar2 = pVar6;
                }
                t0 t0Var = (t0) b;
                aVar = com.yandex.plus.log.api.a.b;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "GraphQLPlaqueRepository", "requestPlaqueClicked() " + com.yandex.plus.bdui.plus.analytics.b.N(t0Var) + ", plaqueId=" + str2);
                }
                k2 k2Var = new k2(t0Var, str2);
                r7o r7oVar2 = z7o.b;
                kotlinx.coroutines.a aVar5 = gVar.n;
                com.yandex.plus.home.api.prefetch.j jVar = new com.yandex.plus.home.api.prefetch.j(pVar2, gVar, k2Var, null, 18);
                dVar2.j = null;
                dVar2.k = pVar2;
                dVar2.n = 2;
                obj = x97.V(aVar5, jVar, dVar2);
                i = pVar2;
            }
        }
        dVar = new d(gVar, cg6Var);
        d dVar22 = dVar;
        Object obj2 = dVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = dVar22.n;
        if (i != 0) {
        }
        t0 t0Var2 = (t0) b;
        aVar = com.yandex.plus.log.api.a.b;
        if (bVar.b(aVar)) {
        }
        k2 k2Var2 = new k2(t0Var2, str2);
        r7o r7oVar22 = z7o.b;
        kotlinx.coroutines.a aVar52 = gVar.n;
        com.yandex.plus.home.api.prefetch.j jVar2 = new com.yandex.plus.home.api.prefetch.j(pVar2, gVar, k2Var2, null, 18);
        dVar22.j = null;
        dVar22.k = pVar2;
        dVar22.n = 2;
        obj2 = x97.V(aVar52, jVar2, dVar22);
        i = pVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(10:5|6|7|8|(1:(1:(9:12|13|14|15|16|(1:18)|19|(1:21)|(6:23|24|(2:29|30)|32|(1:36)|(2:38|39)(2:40|41))(1:45))(2:52|53))(1:54))(3:71|(1:73)|63)|55|(1:57)|58|59|(3:61|(7:64|15|16|(0)|19|(0)|(0)(0))|63)(2:65|66)))|8|(0)(0)|55|(0)|58|59|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0111, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010d, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd A[Catch: all -> 0x0111, wis -> 0x0113, CancellationException -> 0x0126, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:59:0x009f, B:61:0x00bd, B:65:0x0115, B:66:0x011c), top: B:58:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115 A[Catch: all -> 0x0111, wis -> 0x0113, CancellationException -> 0x0126, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:59:0x009f, B:61:0x00bd, B:65:0x0115, B:66:0x011c), top: B:58:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0052  */
    /* JADX WARN: Type inference failed for: r16v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(g gVar, com.yandex.plus.home.benchmark.b bVar, int i, int i2, cg6 cg6Var) {
        e eVar;
        int i3;
        int i4;
        int i5;
        com.yandex.plus.home.benchmark.b bVar2;
        com.yandex.plus.log.api.b bVar3;
        com.yandex.plus.log.api.a aVar;
        com.yandex.plus.home.benchmark.b bVar4;
        Iterator it;
        t7o t7oVar;
        boolean z;
        d2 d2Var;
        int i6 = gVar.h;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i7 = eVar.o;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    eVar.o = i7 - Integer.MIN_VALUE;
                    e eVar2 = eVar;
                    Object obj = eVar2.m;
                    nm6 nm6Var = nm6.a;
                    i3 = eVar2.o;
                    xe xeVar = 0;
                    xeVar = 0;
                    if (i3 != 0) {
                        qgg.h0(obj);
                        com.yandex.plus.core.graphql.target.d dVar = gVar.b;
                        eVar2.j = bVar;
                        i4 = i;
                        eVar2.k = i4;
                        i5 = i2;
                        eVar2.l = i5;
                        eVar2.o = 1;
                        Object b = com.yandex.plus.core.graphql.target.d.b(dVar, null, null, null, eVar2, 12);
                        if (b != nm6Var) {
                            bVar2 = bVar;
                            obj = b;
                        }
                        return nm6Var;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar4 = eVar2.j;
                        try {
                            qgg.h0(obj);
                            r7o r7oVar = z7o.b;
                        } catch (wis e) {
                            e = e;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            z = obj instanceof t7o;
                            if (!z) {
                            }
                            if (z7o.a(obj) != null) {
                            }
                            if (!z) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            z = obj instanceof t7o;
                            if (!z) {
                            }
                            if (z7o.a(obj) != null) {
                            }
                            if (!z) {
                            }
                        }
                        z = obj instanceof t7o;
                        if (!z) {
                            bVar4.a();
                        }
                        if (z7o.a(obj) != null) {
                            bVar4.b();
                        }
                        if (!z) {
                            return obj;
                        }
                        try {
                            kp0 kp0Var = (kp0) obj;
                            List list = kp0Var.d;
                            if (list != null && !list.isEmpty()) {
                                throw new IllegalStateException(("Backend errors: " + kp0Var.d).toString());
                            }
                            c2 c2Var = (c2) kp0Var.c;
                            if (c2Var != null && (d2Var = c2Var.a) != null) {
                                xeVar = d2Var.b;
                            }
                            if (xeVar == 0) {
                                throw new IllegalStateException("Plaques are absent");
                            }
                            bVar4.e();
                            gVar.r.getClass();
                            w1 o = com.yandex.plus.home.plaque.animator.internal.utils.a.o(xeVar);
                            bVar4.d();
                            return o;
                        } catch (Throwable th2) {
                            r7o r7oVar4 = z7o.b;
                            return new t7o(th2);
                        }
                    }
                    int i8 = eVar2.l;
                    int i9 = eVar2.k;
                    bVar2 = eVar2.j;
                    qgg.h0(obj);
                    i5 = i8;
                    i4 = i9;
                    t0 t0Var = (t0) obj;
                    bVar3 = gVar.m;
                    aVar = com.yandex.plus.log.api.a.b;
                    if (bVar3.b(aVar)) {
                        bVar3.c(aVar, "GraphQLPlaqueRepository", "requestPlaqueConfiguration() " + com.yandex.plus.bdui.plus.analytics.b.N(t0Var) + ", sizeHint=" + i6);
                    }
                    r7o r7oVar5 = z7o.b;
                    bVar2.c();
                    dp0 dp0Var = gVar.a;
                    ArrayList arrayList = gVar.c;
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    it = arrayList.iterator();
                    if (!it.hasNext()) {
                        eta.q(it.next());
                        throw null;
                    }
                    e2 e2Var = new e2(r1.K(arrayList2), r1.K(new Integer(i6)), t0Var);
                    i5f i5fVar = gVar.l.a;
                    com.yandex.plus.home.core.network.c cVar = new com.yandex.plus.home.core.network.c(i4, i5);
                    i5fVar.getClass();
                    List c = t75.c(new t6e("X-Plus-Retry-Context", i5fVar.c(com.yandex.plus.home.core.network.c.Companion.serializer(), cVar)));
                    eVar2.j = bVar2;
                    eVar2.k = i4;
                    eVar2.l = i5;
                    eVar2.o = 2;
                    obj = com.yandex.plus.bdui.flex.ui.a.e(e2Var, new aa0(dp0Var, e2Var, c, xeVar, 14), eVar2);
                    if (obj != nm6Var) {
                        bVar4 = bVar2;
                        r7o r7oVar6 = z7o.b;
                        z = obj instanceof t7o;
                        if (!z) {
                        }
                        if (z7o.a(obj) != null) {
                        }
                        if (!z) {
                        }
                    }
                    return nm6Var;
                }
            }
            if (i3 != 0) {
            }
            t0 t0Var2 = (t0) obj;
            bVar3 = gVar.m;
            aVar = com.yandex.plus.log.api.a.b;
            if (bVar3.b(aVar)) {
            }
            r7o r7oVar52 = z7o.b;
            bVar2.c();
            dp0 dp0Var2 = gVar.a;
            ArrayList arrayList3 = gVar.c;
            ArrayList arrayList22 = new ArrayList(v75.o(arrayList3, 10));
            it = arrayList3.iterator();
            if (!it.hasNext()) {
            }
        } catch (CancellationException e2) {
            throw e2;
        }
        eVar = new e(gVar, cg6Var);
        e eVar22 = eVar;
        Object obj2 = eVar22.m;
        nm6 nm6Var2 = nm6.a;
        i3 = eVar22.o;
        xe xeVar2 = 0;
        xeVar2 = 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|8|(1:(1:(10:12|13|14|15|16|(1:18)|19|(1:21)|22|(6:24|(1:26)|27|(2:31|(1:33))|34|35)(4:37|(1:39)|40|41))(2:49|50))(1:51))(1:65)|52|(1:54)|55|56|(8:59|15|16|(0)|19|(0)|22|(0)(0))|58))|70|6|7|8|(0)(0)|52|(0)|55|56|(0)|58|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        r12 = r0;
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b8, code lost:
    
        r12 = r0;
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0062, code lost:
    
        if (r15 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(g gVar, String str, String str2, com.yandex.passport.internal.flags.experiments.p pVar, cg6 cg6Var) {
        f fVar;
        Object obj;
        nm6 nm6Var;
        int i;
        com.yandex.plus.log.api.a aVar;
        com.yandex.passport.internal.flags.experiments.p pVar2;
        Throwable a;
        com.yandex.plus.log.api.b bVar = gVar.m;
        try {
            if (cg6Var instanceof f) {
                fVar = (f) cg6Var;
                int i2 = fVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fVar.o = i2 - Integer.MIN_VALUE;
                    f fVar2 = fVar;
                    obj = fVar2.m;
                    nm6Var = nm6.a;
                    i = fVar2.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        com.yandex.plus.core.graphql.target.d dVar = gVar.b;
                        fVar2.j = str;
                        fVar2.k = str2;
                        fVar2.l = pVar;
                        fVar2.o = 1;
                        obj = com.yandex.plus.core.graphql.target.d.b(dVar, null, null, null, fVar2, 12);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            pVar2 = fVar2.l;
                            try {
                                qgg.h0(obj);
                                r7o r7oVar = z7o.b;
                            } catch (wis e) {
                                wis wisVar = e;
                                r7o r7oVar2 = z7o.b;
                                obj = new t7o(wisVar);
                                if (!(obj instanceof t7o)) {
                                }
                                if (z7o.a(obj) != null) {
                                }
                                a = z7o.a(obj);
                                if (a == null) {
                                }
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                r7o r7oVar3 = z7o.b;
                                obj = new t7o(th2);
                                if (!(obj instanceof t7o)) {
                                }
                                if (z7o.a(obj) != null) {
                                }
                                a = z7o.a(obj);
                                if (a == null) {
                                }
                            }
                            if (!(obj instanceof t7o)) {
                                com.yandex.passport.internal.flags.experiments.p.E(pVar2);
                            }
                            if (z7o.a(obj) != null) {
                                pVar2.F();
                            }
                            a = z7o.a(obj);
                            if (a == null) {
                                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                                if (bVar.b(aVar2)) {
                                    bVar.a(aVar2, "GraphQLPlaqueRepository", "error report plaqueSeen", a);
                                }
                                return Unit.a;
                            }
                            kp0 kp0Var = (kp0) obj;
                            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.a;
                            if (bVar.b(aVar3)) {
                                bVar.c(aVar3, "GraphQLPlaqueRepository", "requestPlaqueSeen() response=" + kp0Var);
                            }
                            List list = kp0Var.d;
                            if (list != null && !list.isEmpty()) {
                                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                                if (bVar.b(aVar4)) {
                                    bVar.c(aVar4, "GraphQLPlaqueRepository", "plaqueSeen mutation was failed! " + kp0Var.d);
                                }
                            }
                            return Unit.a;
                        }
                        pVar = fVar2.l;
                        str2 = fVar2.k;
                        str = fVar2.j;
                        qgg.h0(obj);
                    }
                    t0 t0Var = (t0) obj;
                    aVar = com.yandex.plus.log.api.a.b;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "GraphQLPlaqueRepository", "requestPlaqueSeen() " + com.yandex.plus.bdui.plus.analytics.b.N(t0Var) + ", plaqueId=" + str + ", seenContext=" + str2);
                    }
                    r7o r7oVar4 = z7o.b;
                    pVar.G();
                    dp0 dp0Var = gVar.a;
                    m2 m2Var = new m2(t0Var, str, r1.K(str2));
                    fVar2.j = null;
                    fVar2.k = null;
                    fVar2.l = pVar;
                    fVar2.o = 2;
                    obj = com.yandex.plus.bdui.flex.ui.a.d(dp0Var, m2Var, fVar2);
                    if (obj != nm6Var) {
                        pVar2 = pVar;
                        r7o r7oVar5 = z7o.b;
                        if (!(obj instanceof t7o)) {
                        }
                        if (z7o.a(obj) != null) {
                        }
                        a = z7o.a(obj);
                        if (a == null) {
                        }
                    }
                    return nm6Var;
                }
            }
            if (i != 0) {
            }
            t0 t0Var2 = (t0) obj;
            aVar = com.yandex.plus.log.api.a.b;
            if (bVar.b(aVar)) {
            }
            r7o r7oVar42 = z7o.b;
            pVar.G();
            dp0 dp0Var2 = gVar.a;
            m2 m2Var2 = new m2(t0Var2, str, r1.K(str2));
            fVar2.j = null;
            fVar2.k = null;
            fVar2.l = pVar;
            fVar2.o = 2;
            obj = com.yandex.plus.bdui.flex.ui.a.d(dp0Var2, m2Var2, fVar2);
            if (obj != nm6Var) {
            }
            return nm6Var;
        } catch (CancellationException e2) {
            throw e2;
        }
        fVar = new f(gVar, cg6Var);
        f fVar22 = fVar;
        obj = fVar22.m;
        nm6Var = nm6.a;
        i = fVar22.o;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final Object a(String str, String str2, cg6 cg6Var) {
        Object V = x97.V(this.n, new com.yandex.plus.home.api.prefetch.j(this, str, str2, null, 17), cg6Var);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final Object b(String str, String str2, cg6 cg6Var) {
        Object V = x97.V(this.n, new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, str, null, 9), cg6Var);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final Object c(int i, int i2, cg6 cg6Var) {
        return x97.V(this.n, new wa2(this, i, i2, (Continuation) null), cg6Var);
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final Object d(Map map, cg6 cg6Var) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.m;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "GraphQLPlaqueRepository", "updateTemplates(" + map + ')');
        }
        this.p.l(map);
        return Unit.a;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final pjc e() {
        return zsd.k0(zsd.s0(zsd.Q(this.o, this.p, this.q, c.a), new vn1(this, null)), this.n);
    }
}
