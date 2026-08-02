package com.yandex.plus.home.graphql.panel;

import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.ui.bouncer.p;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.graphql.b2;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.core.graphql.type.h;
import com.yandex.plus.core.graphql.type.j0;
import com.yandex.plus.core.graphql.type.r0;
import com.yandex.plus.core.graphql.type.t0;
import com.yandex.plus.core.graphql.x1;
import com.yandex.plus.home.feature.webviews.internal.stories.i;
import com.yandex.plus.home.repository.api.model.panel.b0;
import defpackage.bqi;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.kp0;
import defpackage.nm6;
import defpackage.q6n;
import defpackage.qgg;
import defpackage.r0w;
import defpackage.r2f;
import defpackage.r7o;
import defpackage.s6n;
import defpackage.saf;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g {
    public final dp0 a;
    public final com.yandex.plus.core.graphql.target.d b;
    public final com.yandex.plus.home.panel.a c;
    public final i d;
    public final i e;
    public final com.yandex.plus.core.dispatcher.b f;
    public final tf6 g;
    public final com.yandex.plus.core.analytics.logging.d h;
    public final com.yandex.plus.bdui.plus.content.controller.f i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final ReentrantLock l;

    public g(dp0 dp0Var, com.yandex.plus.core.graphql.target.d dVar, com.yandex.plus.home.analytics.diagnostic.panel.a aVar, com.yandex.plus.home.panel.a aVar2, com.yandex.plus.core.graphql.utils.b bVar, i iVar, i iVar2, com.yandex.plus.core.dispatcher.b bVar2, tf6 tf6Var, com.yandex.plus.core.analytics.logging.d dVar2, com.yandex.plus.home.internal.di.f fVar) {
        dp0Var.getClass();
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.a = dp0Var;
        this.b = dVar;
        this.c = aVar2;
        this.d = iVar;
        this.e = iVar2;
        this.f = bVar2;
        this.g = tf6Var;
        this.h = dVar2;
        bVar.getClass();
        l lVar = new l();
        lVar.a = bVar;
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = new com.yandex.plus.bdui.plus.content.controller.f(lVar);
        a1 a1Var = new a1(23);
        l lVar2 = new l(lVar);
        a1 a1Var2 = new a1(22);
        com.yandex.plus.bdui.plus.content.controller.f fVar3 = new com.yandex.plus.bdui.plus.content.controller.f(lVar, a1Var2, lVar2);
        this.i = new com.yandex.plus.bdui.plus.content.controller.f(24, new m(lVar, a1Var2, a1Var, fVar3, fVar), new com.yandex.plus.bdui.plus.content.controller.f(lVar, fVar2, a1Var2, a1Var, fVar3, aVar));
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new ReentrantLock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r9 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0057, code lost:
    
        if (r13 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, String str, com.yandex.plus.home.repository.api.model.panel.i iVar, ArrayList arrayList, cg6 cg6Var) {
        a aVar;
        int i;
        Object d;
        gVar.getClass();
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.n = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.l;
                Object obj2 = nm6.a;
                i = aVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    aVar2.j = iVar;
                    aVar2.k = arrayList;
                    aVar2.n = 1;
                    obj = com.yandex.plus.core.graphql.target.d.b(gVar.b, str, h.PULT, null, aVar2, 12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        d = ((z7o) obj).a;
                        r7o r7oVar = z7o.b;
                        if (d instanceof t7o) {
                            return d;
                        }
                        try {
                            com.yandex.plus.home.repository.api.model.panel.i iVar2 = (com.yandex.plus.home.repository.api.model.panel.i) d;
                            List list = iVar2.c;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                if (!((b0) obj3).d) {
                                    arrayList2.add(obj3);
                                }
                            }
                            return new com.yandex.plus.home.repository.api.model.panel.i(iVar2.a, iVar2.b, arrayList2);
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            return new t7o(th);
                        }
                    }
                    arrayList = aVar2.k;
                    iVar = aVar2.j;
                    qgg.h0(obj);
                }
                t0 t0Var = (t0) obj;
                s6n b2Var = new b2(arrayList, com.yandex.plus.bdui.plus.analytics.b.r(t0Var), t0.a(t0Var, r1.K(r0.DARK)), r1.K(j0.ALL));
                com.yandex.plus.home.benchmark.b bVar = (com.yandex.plus.home.benchmark.b) gVar.e.invoke();
                Function2 pVar = new p(19, gVar, iVar);
                aVar2.j = null;
                aVar2.k = null;
                aVar2.n = 2;
                d = gVar.d(b2Var, bVar, pVar, aVar2);
            }
        }
        aVar = new a(gVar, cg6Var);
        a aVar22 = aVar;
        Object obj4 = aVar22.l;
        Object obj22 = nm6.a;
        i = aVar22.n;
        if (i != 0) {
        }
        t0 t0Var2 = (t0) obj4;
        s6n b2Var2 = new b2(arrayList, com.yandex.plus.bdui.plus.analytics.b.r(t0Var2), t0.a(t0Var2, r1.K(r0.DARK)), r1.K(j0.ALL));
        com.yandex.plus.home.benchmark.b bVar2 = (com.yandex.plus.home.benchmark.b) gVar.e.invoke();
        Function2 pVar2 = new p(19, gVar, iVar);
        aVar22.j = null;
        aVar22.k = null;
        aVar22.n = 2;
        d = gVar.d(b2Var2, bVar2, pVar2, aVar22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r10 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, String str, cg6 cg6Var) {
        b bVar;
        int i;
        gVar.getClass();
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.j;
                Object obj2 = nm6.a;
                i = bVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bVar2.l = 1;
                    obj = com.yandex.plus.core.graphql.target.d.b(gVar.b, str, h.PULT, null, bVar2, 12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return ((z7o) obj).a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                t0 t0Var = (t0) obj;
                s6n x1Var = new x1(com.yandex.plus.bdui.plus.analytics.b.r(t0Var), t0.a(t0Var, r1.K(r0.DARK)), r1.K(j0.MAYBE_HEAVY));
                com.yandex.plus.home.benchmark.b bVar3 = (com.yandex.plus.home.benchmark.b) gVar.d.invoke();
                Function2 r0wVar = new r0w(28, gVar);
                bVar2.l = 2;
                Object d = gVar.d(x1Var, bVar3, r0wVar, bVar2);
                return d != obj2 ? obj2 : d;
            }
        }
        bVar = new b(gVar, cg6Var);
        b bVar22 = bVar;
        Object obj3 = bVar22.j;
        Object obj22 = nm6.a;
        i = bVar22.l;
        if (i != 0) {
        }
        t0 t0Var2 = (t0) obj3;
        s6n x1Var2 = new x1(com.yandex.plus.bdui.plus.analytics.b.r(t0Var2), t0.a(t0Var2, r1.K(r0.DARK)), r1.K(j0.MAYBE_HEAVY));
        com.yandex.plus.home.benchmark.b bVar32 = (com.yandex.plus.home.benchmark.b) gVar.d.invoke();
        Function2 r0wVar2 = new r0w(28, gVar);
        bVar22.l = 2;
        Object d2 = gVar.d(x1Var2, bVar32, r0wVar2, bVar22);
        if (d2 != obj22) {
        }
    }

    public final Unit c() {
        ReentrantLock reentrantLock = this.l;
        reentrantLock.lock();
        try {
            com.yandex.plus.core.analytics.logging.d dVar = this.h;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
            if (dVar.b(aVar)) {
                dVar.a(aVar, "GraphQLPanelRepository", "clearCache()", null);
            }
            Iterator it = this.k.entrySet().iterator();
            while (it.hasNext()) {
                saf.E((r2f) ((Map.Entry) it.next()).getValue());
            }
            Iterator it2 = this.j.entrySet().iterator();
            while (it2.hasNext()) {
                ((xdr) ((bqi) ((Map.Entry) it2.next()).getValue())).l(null);
            }
            reentrantLock.unlock();
            return Unit.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:30|31))(3:32|33|(1:35))|12|13|(3:20|21|(1:23)(2:24|25))|15|(1:17)|18))|42|6|7|(0)(0)|12|13|(0)|15|(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0032, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        r10 = defpackage.z7o.b;
        r10 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0030, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0059, code lost:
    
        r10 = defpackage.z7o.b;
        r10 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(s6n s6nVar, com.yandex.plus.home.benchmark.b bVar, Function2 function2, cg6 cg6Var) {
        c cVar;
        int i;
        Object t7oVar;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.n = i2 - Integer.MIN_VALUE;
                Object obj = cVar.l;
                nm6 nm6Var = nm6.a;
                i = cVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    bVar.c();
                    dp0 dp0Var = this.a;
                    cVar.j = bVar;
                    cVar.k = function2;
                    cVar.n = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.f(dp0Var, s6nVar, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function2 = cVar.k;
                    bVar = cVar.j;
                    qgg.h0(obj);
                }
                t7oVar = (kp0) obj;
                bVar.a();
                r7o r7oVar2 = z7o.b;
                if (!(t7oVar instanceof t7o)) {
                    try {
                        kp0 kp0Var = (kp0) t7oVar;
                        com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                        com.yandex.plus.core.analytics.logging.e.f("fetchPanel() response=" + kp0Var);
                        q6n q6nVar = (q6n) kp0Var.c;
                        if (q6nVar == null) {
                            throw new com.yandex.plus.core.graphql.exception.d("fetchPanel() response data is null", null);
                        }
                        bVar.e();
                        com.yandex.plus.home.graphql.panel.mappers.a aVar = new com.yandex.plus.home.graphql.panel.mappers.a();
                        com.yandex.plus.home.repository.api.model.panel.i iVar = (com.yandex.plus.home.repository.api.model.panel.i) function2.invoke(q6nVar, aVar);
                        bVar.d();
                        this.c.a(aVar.a);
                        t7oVar = iVar;
                    } catch (Throwable th) {
                        r7o r7oVar3 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                }
                if (z7o.a(t7oVar) != null) {
                    bVar.b();
                }
                return t7oVar;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.l;
        nm6 nm6Var2 = nm6.a;
        i = cVar.n;
        if (i != 0) {
        }
        t7oVar = (kp0) obj2;
        bVar.a();
        r7o r7oVar22 = z7o.b;
        if (!(t7oVar instanceof t7o)) {
        }
        if (z7o.a(t7oVar) != null) {
        }
        return t7oVar;
    }
}
