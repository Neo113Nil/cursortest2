package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.aa0;
import defpackage.btf;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.l1j;
import defpackage.nm6;
import defpackage.onb;
import defpackage.pnb;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tqn;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class j implements e {
    public final com.yandex.plus.pay.graphql.offers.j a;
    public final List b;
    public final List c;
    public final com.yandex.plus.experiments.impl.providers.h d;
    public final com.yandex.plus.pay.log.impl.b e;
    public final com.yandex.plus.pay.internal.analytics.j f;
    public final com.yandex.plus.pay.internal.analytics.tarifficator.j g;
    public final jyr h;
    public final jyr i;
    public final jyr j;

    public j(com.yandex.plus.pay.graphql.offers.j jVar, c5b c5bVar, List list, com.yandex.plus.experiments.impl.providers.h hVar, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.internal.analytics.j jVar2, com.yandex.plus.pay.internal.analytics.tarifficator.j jVar3) {
        jVar.getClass();
        c5bVar.getClass();
        list.getClass();
        hVar.getClass();
        bVar.getClass();
        jVar2.getClass();
        jVar3.getClass();
        this.a = jVar;
        this.b = c5bVar;
        this.c = list;
        this.d = hVar;
        this.e = bVar;
        this.f = jVar2;
        this.g = jVar3;
        this.h = btf.b(new com.yandex.plus.pay.internal.di.g(7));
        this.i = btf.b(new com.yandex.plus.pay.internal.di.g(8));
        this.j = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(18, this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|8|(1:(1:(1:(1:(7:14|15|(1:19)|(1:23)|24|(1:28)|29)(2:31|32))(8:33|34|35|36|(2:38|(1:40))(1:45)|41|(7:44|15|(2:17|19)|(2:21|23)|24|(2:26|28)|29)|43))(13:46|47|48|49|50|51|52|53|(1:55)|56|(1:58)|59|(2:61|(3:63|(7:65|34|35|36|(0)(0)|41|(0))|43)(7:66|35|36|(0)(0)|41|(0)|43))(2:67|68)))(1:80))(3:99|(1:101)|43)|81|82|83|84|85|86|(10:88|50|51|52|53|(0)|56|(0)|59|(0)(0))|43))|104|6|7|8|(0)(0)|81|82|83|84|85|86|(0)|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x012c, code lost:
    
        r12 = r24;
        r8 = r16;
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0123, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0124, code lost:
    
        r12 = r24;
        r8 = r16;
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013d, code lost:
    
        r24 = r2;
        r2 = null;
        r22 = r10;
        r17 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0133, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0134, code lost:
    
        r24 = r2;
        r2 = null;
        r22 = r10;
        r17 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009f  */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.yandex.plus.pay.internal.feature.offers.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.yandex.plus.pay.api.model.PlusPayCompositeOffers, com.yandex.plus.pay.internal.feature.offers.pre.a] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, com.yandex.plus.pay.api.analytics.c cVar, com.yandex.plus.pay.api.feature.offers.a aVar, Function1 function1, cg6 cg6Var) {
        f fVar;
        nm6 nm6Var;
        int i;
        Object b;
        Function1 function12;
        tqn tqnVar;
        com.yandex.plus.pay.api.analytics.c cVar2;
        com.yandex.plus.pay.internal.feature.offers.pre.a aVar2;
        com.yandex.plus.pay.internal.feature.offers.pre.a aVar3;
        com.yandex.plus.pay.internal.analytics.tarifficator.j jVar;
        com.yandex.plus.pay.api.analytics.c cVar3;
        Function1 function13;
        tqn tqnVar2;
        Object w;
        t7o t7oVar;
        com.yandex.plus.pay.internal.feature.offers.pre.a aVar4;
        com.yandex.plus.pay.internal.feature.offers.pre.a aVar5;
        Function1 function14;
        com.yandex.plus.pay.api.analytics.c cVar4;
        Throwable a;
        Throwable a2;
        PlusPayCompositeOffers d;
        int i2;
        int i3;
        ?? r4;
        ?? r2;
        tqn tqnVar3;
        boolean z;
        Function1 function15;
        com.yandex.plus.pay.api.analytics.c cVar5;
        com.yandex.plus.pay.internal.feature.offers.pre.a aVar6;
        PlusPayCompositeOffers plusPayCompositeOffers;
        com.yandex.plus.pay.internal.analytics.tarifficator.t tVar;
        PlusPayCompositeOffers copy$default;
        try {
            if (cg6Var instanceof f) {
                fVar = (f) cg6Var;
                int i4 = fVar.s;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    fVar.s = i4 - Integer.MIN_VALUE;
                    f fVar2 = fVar;
                    Object obj = fVar2.q;
                    nm6Var = nm6.a;
                    i = fVar2.s;
                    com.yandex.plus.pay.log.impl.b bVar = this.e;
                    com.yandex.plus.pay.internal.analytics.tarifficator.j jVar2 = this.g;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        com.yandex.plus.pay.log.impl.b.d(bVar, com.yandex.plus.pay.common.internal.log.a.c, "Start loading composite offers");
                        tqn tqnVar4 = new tqn();
                        fVar2.j = cVar;
                        fVar2.k = function1;
                        fVar2.l = tqnVar4;
                        fVar2.s = 1;
                        b = b(str, aVar, cVar, fVar2);
                        if (b != nm6Var) {
                            function12 = function1;
                            tqnVar = tqnVar4;
                            cVar2 = cVar;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                tqnVar3 = fVar2.l;
                                function15 = fVar2.k;
                                cVar5 = fVar2.j;
                                qgg.h0(obj);
                                jVar = jVar2;
                                z = true;
                                plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                                ((com.yandex.plus.pay.internal.analytics.evgen.b) this.f).d(plusPayCompositeOffers, cVar5);
                                if (!tqnVar3.a && plusPayCompositeOffers.getOffers().isEmpty()) {
                                    tqnVar3.a = z;
                                    com.yandex.plus.pay.internal.analytics.tarifficator.t tVar2 = (com.yandex.plus.pay.internal.analytics.tarifficator.t) jVar;
                                    tVar2.getClass();
                                    tVar2.a.c(plusPayCompositeOffers.getSessionId(), onb.Default, plusPayCompositeOffers.getTarget(), "In-app store returned empty list of offers");
                                }
                                if (function15 != null && (copy$default = PlusPayCompositeOffers.copy$default(plusPayCompositeOffers, null, null, (List) function15.invoke(plusPayCompositeOffers.getOffers()), null, 11, null)) != null) {
                                    plusPayCompositeOffers = copy$default;
                                }
                                tVar = (com.yandex.plus.pay.internal.analytics.tarifficator.t) jVar;
                                tVar.a(plusPayCompositeOffers);
                                if (!tqnVar3.a && plusPayCompositeOffers.getOffers().isEmpty()) {
                                    tVar.getClass();
                                    tVar.a.c(plusPayCompositeOffers.getSessionId(), onb.Default, plusPayCompositeOffers.getTarget(), "Client filtered and got empty list of offers");
                                }
                                return plusPayCompositeOffers;
                            }
                            i3 = fVar2.p;
                            i2 = fVar2.o;
                            d = fVar2.n;
                            tqnVar2 = fVar2.l;
                            function14 = fVar2.k;
                            cVar4 = fVar2.j;
                            qgg.h0(obj);
                            aVar6 = null;
                            jVar = jVar2;
                            r4 = i3;
                            r2 = aVar6;
                            tqnVar3 = tqnVar2;
                            if (d.getOffers().isEmpty()) {
                                z = true;
                                tqnVar3.a = true;
                                if (r4 != 0) {
                                    com.yandex.plus.pay.internal.analytics.tarifficator.t tVar3 = (com.yandex.plus.pay.internal.analytics.tarifficator.t) jVar;
                                    tVar3.getClass();
                                    tVar3.a.c(d.getSessionId(), onb.Default, d.getTarget(), "Backend returned empty list of offers");
                                }
                            } else {
                                z = true;
                            }
                            fVar2.j = cVar4;
                            fVar2.k = function14;
                            fVar2.l = tqnVar3;
                            fVar2.m = r2;
                            fVar2.n = r2;
                            fVar2.o = i2;
                            fVar2.p = r4;
                            fVar2.s = 4;
                            obj = c(d, fVar2);
                            if (obj != nm6Var) {
                                function15 = function14;
                                cVar5 = cVar4;
                                plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                                ((com.yandex.plus.pay.internal.analytics.evgen.b) this.f).d(plusPayCompositeOffers, cVar5);
                                if (!tqnVar3.a) {
                                    tqnVar3.a = z;
                                    com.yandex.plus.pay.internal.analytics.tarifficator.t tVar22 = (com.yandex.plus.pay.internal.analytics.tarifficator.t) jVar;
                                    tVar22.getClass();
                                    tVar22.a.c(plusPayCompositeOffers.getSessionId(), onb.Default, plusPayCompositeOffers.getTarget(), "In-app store returned empty list of offers");
                                }
                                if (function15 != null) {
                                    plusPayCompositeOffers = copy$default;
                                }
                                tVar = (com.yandex.plus.pay.internal.analytics.tarifficator.t) jVar;
                                tVar.a(plusPayCompositeOffers);
                                if (!tqnVar3.a) {
                                    tVar.getClass();
                                    tVar.a.c(plusPayCompositeOffers.getSessionId(), onb.Default, plusPayCompositeOffers.getTarget(), "Client filtered and got empty list of offers");
                                }
                                return plusPayCompositeOffers;
                            }
                            return nm6Var;
                        }
                        aVar2 = fVar2.m;
                        tqnVar2 = fVar2.l;
                        function13 = fVar2.k;
                        cVar3 = fVar2.j;
                        try {
                            qgg.h0(obj);
                            w = obj;
                            aVar3 = null;
                            jVar = jVar2;
                            try {
                                r7o r7oVar = z7o.b;
                                aVar5 = aVar3;
                            } catch (wis e) {
                                e = e;
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(e);
                                aVar4 = aVar3;
                                w = t7oVar;
                                aVar5 = aVar4;
                                function14 = function13;
                                cVar4 = cVar3;
                                if (!(w instanceof t7o)) {
                                }
                                a = z7o.a(w);
                                if (a != null) {
                                }
                                a2 = z7o.a(w);
                                if (a2 == null) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                r7o r7oVar3 = z7o.b;
                                t7oVar = new t7o(th);
                                aVar4 = aVar3;
                                w = t7oVar;
                                aVar5 = aVar4;
                                function14 = function13;
                                cVar4 = cVar3;
                                if (!(w instanceof t7o)) {
                                }
                                a = z7o.a(w);
                                if (a != null) {
                                }
                                a2 = z7o.a(w);
                                if (a2 == null) {
                                }
                            }
                        } catch (wis e2) {
                            e = e2;
                            aVar3 = null;
                            jVar = jVar2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            aVar4 = aVar3;
                            w = t7oVar;
                            aVar5 = aVar4;
                            function14 = function13;
                            cVar4 = cVar3;
                            if (!(w instanceof t7o)) {
                            }
                            a = z7o.a(w);
                            if (a != null) {
                            }
                            a2 = z7o.a(w);
                            if (a2 == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            aVar3 = null;
                            jVar = jVar2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            aVar4 = aVar3;
                            w = t7oVar;
                            aVar5 = aVar4;
                            function14 = function13;
                            cVar4 = cVar3;
                            if (!(w instanceof t7o)) {
                            }
                            a = z7o.a(w);
                            if (a != null) {
                            }
                            a2 = z7o.a(w);
                            if (a2 == null) {
                            }
                        }
                        function14 = function13;
                        cVar4 = cVar3;
                        if (!(w instanceof t7o)) {
                            com.yandex.plus.pay.log.impl.b.d(bVar, com.yandex.plus.pay.common.internal.log.a.c, "Got composite offers successfully");
                        }
                        a = z7o.a(w);
                        if (a != null) {
                            com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.common.internal.log.a.c, "Error when receiving composite offers.", a, 8);
                        }
                        a2 = z7o.a(w);
                        if (a2 == null) {
                            throw r1.U(a2);
                        }
                        com.yandex.plus.pay.repository.api.model.offers.s sVar = (com.yandex.plus.pay.repository.api.model.offers.s) w;
                        boolean z2 = sVar instanceof com.yandex.plus.pay.repository.api.model.offers.r;
                        d = ((com.yandex.plus.pay.internal.model.mappers.c) this.j.getValue()).d(aVar2.a, sVar.a());
                        if (!z2) {
                            i2 = 0;
                            r2 = aVar5;
                            r4 = z2;
                            tqnVar3 = tqnVar2;
                            if (d.getOffers().isEmpty()) {
                            }
                            fVar2.j = cVar4;
                            fVar2.k = function14;
                            fVar2.l = tqnVar3;
                            fVar2.m = r2;
                            fVar2.n = r2;
                            fVar2.o = i2;
                            fVar2.p = r4;
                            fVar2.s = 4;
                            obj = c(d, fVar2);
                            if (obj != nm6Var) {
                            }
                            return nm6Var;
                        }
                        fVar2.j = cVar4;
                        fVar2.k = function14;
                        fVar2.l = tqnVar2;
                        fVar2.m = aVar5;
                        fVar2.n = d;
                        fVar2.o = 0;
                        fVar2.p = z2 ? 1 : 0;
                        fVar2.s = 3;
                        if (d(d, cVar4, fVar2) != nm6Var) {
                            i3 = z2 ? 1 : 0;
                            i2 = 0;
                            aVar6 = aVar5;
                            r4 = i3;
                            r2 = aVar6;
                            tqnVar3 = tqnVar2;
                            if (d.getOffers().isEmpty()) {
                            }
                            fVar2.j = cVar4;
                            fVar2.k = function14;
                            fVar2.l = tqnVar3;
                            fVar2.m = r2;
                            fVar2.n = r2;
                            fVar2.o = i2;
                            fVar2.p = r4;
                            fVar2.s = 4;
                            obj = c(d, fVar2);
                            if (obj != nm6Var) {
                            }
                        }
                        return nm6Var;
                    }
                    tqn tqnVar5 = fVar2.l;
                    Function1 function16 = fVar2.k;
                    com.yandex.plus.pay.api.analytics.c cVar6 = fVar2.j;
                    qgg.h0(obj);
                    tqnVar = tqnVar5;
                    function12 = function16;
                    b = obj;
                    cVar2 = cVar6;
                    aVar2 = (com.yandex.plus.pay.internal.feature.offers.pre.a) b;
                    r7o r7oVar4 = z7o.b;
                    com.yandex.plus.home.feature.webviews.internal.stories.m mVar = new com.yandex.plus.home.feature.webviews.internal.stories.m(5, this);
                    aa0 aa0Var = new aa0(this, cVar2, aVar2, continuation, 18);
                    fVar2.j = cVar2;
                    fVar2.k = function12;
                    fVar2.l = tqnVar;
                    fVar2.m = aVar2;
                    fVar2.n = null;
                    fVar2.o = 0;
                    fVar2.p = 0;
                    fVar2.s = 2;
                    jVar = jVar2;
                    com.yandex.plus.pay.api.analytics.c cVar7 = cVar2;
                    tqn tqnVar6 = tqnVar;
                    aVar3 = null;
                    w = com.yandex.plus.bdui.plus.analytics.b.w(15, 5000L, 5000L, 1.0d, mVar, aa0Var, fVar2);
                    if (w != nm6Var) {
                        cVar3 = cVar7;
                        function13 = function12;
                        tqnVar2 = tqnVar6;
                        aVar3 = aVar3;
                        r7o r7oVar5 = z7o.b;
                        aVar5 = aVar3;
                        function14 = function13;
                        cVar4 = cVar3;
                        if (!(w instanceof t7o)) {
                        }
                        a = z7o.a(w);
                        if (a != null) {
                        }
                        a2 = z7o.a(w);
                        if (a2 == null) {
                        }
                    }
                    return nm6Var;
                }
            }
            if (i != 0) {
            }
            aVar2 = (com.yandex.plus.pay.internal.feature.offers.pre.a) b;
            r7o r7oVar42 = z7o.b;
            com.yandex.plus.home.feature.webviews.internal.stories.m mVar2 = new com.yandex.plus.home.feature.webviews.internal.stories.m(5, this);
            aa0 aa0Var2 = new aa0(this, cVar2, aVar2, continuation, 18);
            fVar2.j = cVar2;
            fVar2.k = function12;
            fVar2.l = tqnVar;
            fVar2.m = aVar2;
            fVar2.n = null;
            fVar2.o = 0;
            fVar2.p = 0;
            fVar2.s = 2;
            jVar = jVar2;
            com.yandex.plus.pay.api.analytics.c cVar72 = cVar2;
            tqn tqnVar62 = tqnVar;
            aVar3 = null;
            w = com.yandex.plus.bdui.plus.analytics.b.w(15, 5000L, 5000L, 1.0d, mVar2, aa0Var2, fVar2);
            if (w != nm6Var) {
            }
            return nm6Var;
        } catch (CancellationException e3) {
            throw e3;
        }
        fVar = new f(this, cg6Var);
        f fVar22 = fVar;
        Object obj2 = fVar22.q;
        nm6Var = nm6.a;
        i = fVar22.s;
        com.yandex.plus.pay.log.impl.b bVar2 = this.e;
        com.yandex.plus.pay.internal.analytics.tarifficator.j jVar22 = this.g;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.yandex.plus.pay.internal.feature.offers.pre.a b(String str, com.yandex.plus.pay.api.feature.offers.a aVar, com.yandex.plus.pay.api.analytics.c cVar, cg6 cg6Var) {
        g gVar;
        int i;
        Iterator it;
        int i2;
        com.yandex.plus.pay.internal.feature.offers.pre.a aVar2;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i3 = gVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.n = i3 - Integer.MIN_VALUE;
                Object obj = gVar.l;
                nm6 nm6Var = nm6.a;
                i = gVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = this.b;
                    com.yandex.plus.pay.internal.feature.offers.pre.a aVar3 = new com.yandex.plus.pay.internal.feature.offers.pre.a(str, aVar, cVar);
                    it = list.iterator();
                    i2 = 0;
                    aVar2 = aVar3;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = gVar.k;
                    it = gVar.j;
                    qgg.h0(obj);
                    aVar2 = (com.yandex.plus.pay.internal.feature.offers.pre.a) obj;
                }
                if (it.hasNext()) {
                    return aVar2;
                }
                if (it.next() != null) {
                    l1j.f();
                    return null;
                }
                gVar.j = it;
                gVar.k = i2;
                gVar.n = 1;
                throw null;
            }
        }
        gVar = new g(this, cg6Var);
        Object obj2 = gVar.l;
        nm6 nm6Var2 = nm6.a;
        i = gVar.n;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0057 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PlusPayCompositeOffers plusPayCompositeOffers, cg6 cg6Var) {
        h hVar;
        int i;
        Iterator it;
        int i2;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i3 = hVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.n = i3 - Integer.MIN_VALUE;
                Object obj = hVar.l;
                nm6 nm6Var = nm6.a;
                i = hVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    it = this.c.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = hVar.k;
                    Iterator it2 = hVar.j;
                    qgg.h0(obj);
                    Iterator it3 = it2;
                    i2 = i4;
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    it = it3;
                    if (it.hasNext()) {
                        com.yandex.plus.pay.internal.feature.offers.post.a aVar = (com.yandex.plus.pay.internal.feature.offers.post.a) it.next();
                        hVar.j = it;
                        hVar.k = i2;
                        hVar.n = 1;
                        Object a = aVar.a(plusPayCompositeOffers, hVar);
                        if (a == nm6Var) {
                            return nm6Var;
                        }
                        Iterator it4 = it;
                        obj = a;
                        i4 = i2;
                        it2 = it4;
                        Iterator it32 = it2;
                        i2 = i4;
                        plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        it = it32;
                        if (it.hasNext()) {
                            return plusPayCompositeOffers;
                        }
                    }
                }
            }
        }
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.l;
        nm6 nm6Var2 = nm6.a;
        i = hVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(PlusPayCompositeOffers plusPayCompositeOffers, com.yandex.plus.pay.api.analytics.c cVar, cg6 cg6Var) {
        i iVar;
        int i;
        String str;
        String str2;
        String str3;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.n = i2 - Integer.MIN_VALUE;
                Object obj = iVar.l;
                nm6 nm6Var = nm6.a;
                i = iVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    iVar.j = plusPayCompositeOffers;
                    iVar.k = cVar;
                    iVar.n = 1;
                    if (this.d.e(iVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = iVar.k;
                    plusPayCompositeOffers = iVar.j;
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                String str4 = cVar.b;
                Set set = cVar.c;
                String H = set == null ? r1.H(set) : null;
                Set set2 = cVar.d;
                String H2 = set2 != null ? r1.H(set2) : null;
                Map map = cVar.f;
                com.yandex.plus.pay.internal.analytics.tarifficator.t tVar = (com.yandex.plus.pay.internal.analytics.tarifficator.t) this.g;
                com.yandex.plus.pay.internal.di.o oVar = tVar.b;
                plusPayCompositeOffers.getClass();
                map.getClass();
                pnb pnbVar = tVar.a;
                String sessionId = plusPayCompositeOffers.getSessionId();
                String str5 = tVar.c;
                str = tVar.d;
                if (str == null) {
                    str = "no_value";
                }
                String str6 = str4 != null ? "no_value" : str4;
                com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) oVar.invoke();
                String str7 = (aVar != null || (str3 = aVar.a) == null) ? "no_value" : str3;
                com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) oVar.invoke();
                pnbVar.b(sessionId, str5, str, str6, str7, (aVar2 != null || (str2 = aVar2.b) == null) ? "no_value" : str2, H != null ? "no_value" : H, H2 != null ? "no_value" : H2, map);
                return Unit.a;
            }
        }
        iVar = new i(this, cg6Var);
        Object obj2 = iVar.l;
        nm6 nm6Var2 = nm6.a;
        i = iVar.n;
        if (i != 0) {
        }
        String str42 = cVar.b;
        Set set3 = cVar.c;
        if (set3 == null) {
        }
        Set set22 = cVar.d;
        if (set22 != null) {
        }
        Map map2 = cVar.f;
        com.yandex.plus.pay.internal.analytics.tarifficator.t tVar2 = (com.yandex.plus.pay.internal.analytics.tarifficator.t) this.g;
        com.yandex.plus.pay.internal.di.o oVar2 = tVar2.b;
        plusPayCompositeOffers.getClass();
        map2.getClass();
        pnb pnbVar2 = tVar2.a;
        String sessionId2 = plusPayCompositeOffers.getSessionId();
        String str52 = tVar2.c;
        str = tVar2.d;
        if (str == null) {
        }
        if (str42 != null) {
        }
        com.yandex.plus.experiments.api.a aVar3 = (com.yandex.plus.experiments.api.a) oVar2.invoke();
        if (aVar3 != null) {
        }
        com.yandex.plus.experiments.api.a aVar22 = (com.yandex.plus.experiments.api.a) oVar2.invoke();
        pnbVar2.b(sessionId2, str52, str, str6, str7, (aVar22 != null || (str2 = aVar22.b) == null) ? "no_value" : str2, H != null ? "no_value" : H, H2 != null ? "no_value" : H2, map2);
        return Unit.a;
    }
}
