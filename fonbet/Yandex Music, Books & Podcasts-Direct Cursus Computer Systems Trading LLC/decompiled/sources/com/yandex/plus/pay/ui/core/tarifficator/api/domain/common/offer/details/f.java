package com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.feature.offers.r;
import com.yandex.plus.pay.internal.feature.offers.t;
import com.yandex.plus.pay.internal.feature.payment.i;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class f implements d {
    public final com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b a;
    public final com.yandex.plus.pay.internal.g b;
    public final List c;

    public f(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar, com.yandex.plus.pay.internal.g gVar, List list) {
        bVar.getClass();
        list.getClass();
        this.a = bVar;
        this.b = gVar;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b A[Catch: all -> 0x0034, CancellationException -> 0x0037, wis -> 0x003a, LOOP:0: B:14:0x0085->B:16:0x008b, LOOP_END, TryCatch #3 {CancellationException -> 0x0037, blocks: (B:12:0x0030, B:13:0x0075, B:14:0x0085, B:16:0x008b, B:18:0x0096, B:39:0x004c), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, r rVar, cg6 cg6Var) {
        e eVar;
        int i;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar;
        j jVar;
        f fVar;
        t7o t7oVar;
        t7o t7oVar2;
        Throwable a;
        Iterator it;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i2 = eVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.m;
                    nm6 nm6Var = nm6.a;
                    i = eVar.o;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar = this.a;
                    if (i != 0) {
                        qgg.h0(obj);
                        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = bVar.a();
                        j jVar2 = a2.b;
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.internal.feature.payment.b h = this.b.h();
                            t.Companion.getClass();
                            t tVar = new t(true, false, null);
                            eVar.j = a2;
                            eVar.k = jVar2;
                            eVar.l = this;
                            eVar.o = 1;
                            obj = ((i) h).b(offer, tVar, eVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            fVar = this;
                            aVar = a2;
                            jVar = jVar2;
                        } catch (wis e) {
                            e = e;
                            aVar = a2;
                            jVar = jVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            t7oVar2 = t7oVar;
                            j jVar3 = jVar;
                            a = z7o.a(t7oVar2);
                            if (a != null) {
                            }
                            if (t7oVar2 instanceof t7o) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            aVar = a2;
                            jVar = jVar2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            t7oVar2 = t7oVar;
                            j jVar32 = jVar;
                            a = z7o.a(t7oVar2);
                            if (a != null) {
                            }
                            if (t7oVar2 instanceof t7o) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar = eVar.l;
                        jVar = eVar.k;
                        aVar = eVar.j;
                        try {
                            qgg.h0(obj);
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            t7oVar2 = t7oVar;
                            j jVar322 = jVar;
                            a = z7o.a(t7oVar2);
                            if (a != null) {
                            }
                            if (t7oVar2 instanceof t7o) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            t7oVar2 = t7oVar;
                            j jVar3222 = jVar;
                            a = z7o.a(t7oVar2);
                            if (a != null) {
                            }
                            if (t7oVar2 instanceof t7o) {
                            }
                        }
                    }
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) obj;
                    List list = fVar.c;
                    plusPayCompositeOfferDetails.getClass();
                    list.getClass();
                    it = list.iterator();
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = plusPayCompositeOfferDetails;
                    while (it.hasNext()) {
                        plusPayCompositeOfferDetails2 = ((g) it.next()).a(plusPayCompositeOfferDetails2);
                    }
                    r7o r7oVar4 = z7o.b;
                    t7oVar2 = plusPayCompositeOfferDetails2;
                    j jVar32222 = jVar;
                    a = z7o.a(t7oVar2);
                    if (a != null) {
                        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a3 = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a.a(aVar, j.a(jVar32222, null, null, null, new com.yandex.plus.pay.ui.core.tarifficator.api.data.common.e(com.yandex.plus.bdui.flex.ui.a.t(a)), null, null, 119), null, 29);
                        bVar.getClass();
                        bVar.a = a3;
                    }
                    if (t7oVar2 instanceof t7o) {
                        return t7oVar2;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            PlusPayCompositeOfferDetails plusPayCompositeOfferDetails3 = (PlusPayCompositeOfferDetails) obj;
            List list2 = fVar.c;
            plusPayCompositeOfferDetails3.getClass();
            list2.getClass();
            it = list2.iterator();
            PlusPayCompositeOfferDetails plusPayCompositeOfferDetails22 = plusPayCompositeOfferDetails3;
            while (it.hasNext()) {
            }
            r7o r7oVar42 = z7o.b;
            t7oVar2 = plusPayCompositeOfferDetails22;
            j jVar322222 = jVar;
            a = z7o.a(t7oVar2);
            if (a != null) {
            }
            if (t7oVar2 instanceof t7o) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.m;
        nm6 nm6Var2 = nm6.a;
        i = eVar.o;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar2 = this.a;
    }
}
