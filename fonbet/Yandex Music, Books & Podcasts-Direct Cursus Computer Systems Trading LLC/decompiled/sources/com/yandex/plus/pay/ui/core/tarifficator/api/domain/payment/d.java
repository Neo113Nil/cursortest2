package com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment;

import com.yandex.plus.pay.api.feature.tarifficator.payment.j;
import com.yandex.plus.pay.api.feature.tarifficator.payment.k;
import com.yandex.plus.pay.api.feature.tarifficator.payment.l;
import com.yandex.plus.pay.api.feature.tarifficator.payment.m;
import com.yandex.plus.pay.api.feature.tarifficator.payment.n;
import com.yandex.plus.pay.api.feature.tarifficator.payment.o;
import com.yandex.plus.pay.api.feature.tarifficator.payment.p;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r0o;
import defpackage.st7;
import defpackage.ub7;
import defpackage.xq0;
import defpackage.zsd;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class d {
    public final List a;
    public final List b;
    public final com.yandex.plus.log.api.b c;

    public d(List list, List list2, com.yandex.plus.log.api.b bVar) {
        list.getClass();
        list2.getClass();
        bVar.getClass();
        this.a = list;
        this.b = list2;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, Function1 function1, Function0 function0, cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar2;
        Object obj;
        r0o r0oVar;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.c cVar2;
        Iterator it;
        int i2;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar3;
        p pVar;
        h hVar;
        Iterator it2;
        h hVar2;
        h hVar3;
        int i3;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar4;
        int i4;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i5 = cVar.u;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.u = i5 - Integer.MIN_VALUE;
                Object obj2 = cVar.s;
                nm6 nm6Var = nm6.a;
                i = cVar.u;
                com.yandex.plus.pay.ui.api.feature.payment.f fVar = com.yandex.plus.pay.ui.api.feature.payment.f.a;
                List list = this.b;
                if (i != 0) {
                    qgg.h0(obj2);
                    Iterator it3 = this.a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            aVar2 = aVar;
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        aVar2 = aVar;
                        if (((com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.c) obj).b(aVar2)) {
                            break;
                        }
                    }
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.c cVar3 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.c) obj;
                    r0oVar = new r0o(function0, function1);
                    com.yandex.plus.log.api.b bVar = this.c;
                    if (cVar3 == null) {
                        com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                        if (bVar.b(aVar5)) {
                            bVar.c(aVar5, "PlusTarifficatorPaymentFacade", "There is no proper factory to create payment session");
                        }
                        return new f(fVar);
                    }
                    com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.b;
                    if (bVar.b(aVar6)) {
                        bVar.c(aVar6, "PlusTarifficatorPaymentFacade", "Found proper session factory: " + cVar3);
                    }
                    cVar2 = cVar3;
                    it = list.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = cVar.r;
                            int i6 = cVar.q;
                            it2 = cVar.p;
                            hVar2 = cVar.o;
                            hVar3 = cVar.n;
                            aVar4 = cVar.j;
                            qgg.h0(obj2);
                            i3 = i6;
                            while (it2.hasNext()) {
                                com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.b bVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.b) it2.next();
                                cVar.j = aVar4;
                                cVar.k = null;
                                cVar.l = null;
                                cVar.m = null;
                                cVar.n = hVar3;
                                cVar.o = hVar2;
                                cVar.p = it2;
                                cVar.q = i3;
                                cVar.r = i4;
                                cVar.u = 3;
                                if (bVar2.c(aVar4, hVar2) == nm6Var) {
                                    return nm6Var;
                                }
                            }
                            return hVar3;
                        }
                        aVar3 = cVar.j;
                        qgg.h0(obj2);
                        pVar = (p) obj2;
                        if (!(pVar instanceof n) || (pVar instanceof m) || (pVar instanceof j) || (pVar instanceof o)) {
                            xq0.q("Unexpected terminal state for payment session");
                            return null;
                        }
                        if (pVar instanceof l) {
                            l lVar = (l) pVar;
                            hVar = new g(lVar.a, lVar.b);
                        } else if (pVar instanceof k) {
                            com.yandex.plus.pay.api.feature.tarifficator.payment.f fVar2 = ((k) pVar).b;
                            if (fVar2 instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.b) {
                                hVar = new f(new com.yandex.plus.pay.ui.api.feature.payment.c(((com.yandex.plus.pay.api.feature.tarifficator.payment.b) fVar2).a));
                            } else if (fVar2 instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.c) {
                                hVar = new f(new com.yandex.plus.pay.ui.api.feature.payment.a(((com.yandex.plus.pay.api.feature.tarifficator.payment.c) fVar2).a));
                            } else if (fVar2 instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.a) {
                                hVar = new f(com.yandex.plus.pay.ui.api.feature.payment.b.a);
                            } else if (fVar2 instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.d) {
                                hVar = new f(com.yandex.plus.pay.ui.api.feature.payment.e.a);
                            } else {
                                if (!(fVar2 instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.e)) {
                                    b6e.s();
                                    return null;
                                }
                                hVar = new f(fVar);
                            }
                        } else {
                            if (!(pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.i)) {
                                b6e.s();
                                return null;
                            }
                            hVar = e.a;
                        }
                        it2 = list.iterator();
                        hVar2 = hVar;
                        hVar3 = hVar2;
                        i3 = 0;
                        aVar4 = aVar3;
                        i4 = 0;
                        while (it2.hasNext()) {
                        }
                        return hVar3;
                    }
                    i2 = cVar.q;
                    it = cVar.m;
                    r0o r0oVar2 = cVar.l;
                    cVar2 = cVar.k;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar7 = cVar.j;
                    qgg.h0(obj2);
                    r0oVar = r0oVar2;
                    aVar2 = aVar7;
                }
                while (true) {
                    if (it.hasNext()) {
                        com.yandex.passport.internal.ui.challenge.d dVar = new com.yandex.passport.internal.ui.challenge.d(new ub7(12, cVar2.a(aVar2).a(), new st7(this, r0oVar, aVar2, (Continuation) null)), 2);
                        cVar.j = aVar2;
                        cVar.k = null;
                        cVar.l = null;
                        cVar.m = null;
                        cVar.n = null;
                        cVar.o = null;
                        cVar.u = 2;
                        obj2 = zsd.g0(dVar, cVar);
                        if (obj2 != nm6Var) {
                            aVar3 = aVar2;
                        }
                    } else {
                        com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.b bVar3 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.b) it.next();
                        cVar.j = aVar2;
                        cVar.k = cVar2;
                        cVar.l = r0oVar;
                        cVar.m = it;
                        cVar.n = null;
                        cVar.o = null;
                        cVar.q = i2;
                        cVar.r = 0;
                        cVar.u = 1;
                        if (bVar3.b(aVar2) == nm6Var) {
                            break;
                        }
                    }
                }
                pVar = (p) obj2;
                if (pVar instanceof n) {
                }
                xq0.q("Unexpected terminal state for payment session");
                return null;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj22 = cVar.s;
        nm6 nm6Var2 = nm6.a;
        i = cVar.u;
        com.yandex.plus.pay.ui.api.feature.payment.f fVar3 = com.yandex.plus.pay.ui.api.feature.payment.f.a;
        List list2 = this.b;
        if (i != 0) {
        }
        while (true) {
            if (it.hasNext()) {
            }
        }
        pVar = (p) obj22;
        if (pVar instanceof n) {
        }
        xq0.q("Unexpected terminal state for payment session");
        return null;
    }
}
