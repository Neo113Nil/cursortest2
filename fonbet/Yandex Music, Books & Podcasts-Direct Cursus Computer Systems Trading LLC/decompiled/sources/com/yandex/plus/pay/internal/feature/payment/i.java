package com.yandex.plus.pay.internal.feature.payment;

import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.di.s;
import com.yandex.plus.pay.internal.di.u;
import com.yandex.plus.pay.internal.feature.offers.t;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayTopupScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenParams;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class i implements b {
    public final s a;
    public final com.yandex.plus.pay.log.impl.b b;

    public i(u uVar, com.yandex.plus.pay.log.impl.b bVar) {
        uVar.getClass();
        bVar.getClass();
        this.a = uVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, cg6 cg6Var) {
        c cVar;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        com.yandex.plus.pay.log.impl.b bVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof c) {
                cVar = (c) cg6Var;
                int i2 = cVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.n = i2 - Integer.MIN_VALUE;
                    Object obj2 = cVar.l;
                    nm6 nm6Var = nm6.a;
                    i = cVar.n;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.internal.feature.closing.a aVar = (com.yandex.plus.pay.internal.feature.closing.a) ((u) this.a).e.C.getValue();
                            cVar.j = offer;
                            cVar.k = bVar2;
                            cVar.n = 1;
                            obj2 = ((com.yandex.plus.pay.internal.feature.closing.d) aVar).a(offer, cVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            offer2 = offer;
                            bVar = bVar2;
                        } catch (wis e) {
                            e = e;
                            offer2 = offer;
                            bVar = bVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            offer2 = offer;
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
                        bVar = cVar.k;
                        offer2 = cVar.j;
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
                    obj = (PlusPayClosingOffer) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayClosingOffer plusPayClosingOffer = (PlusPayClosingOffer) obj;
                    com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.api.log.b.b, this + ".getClosingOffer(" + offer2 + ", " + plusPayClosingOffer + ")} = " + plusPayClosingOffer);
                    return plusPayClosingOffer;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayClosingOffer) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        cVar = new c(this, cg6Var);
        Object obj22 = cVar.l;
        nm6 nm6Var2 = nm6.a;
        i = cVar.n;
        com.yandex.plus.pay.log.impl.b bVar22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, t tVar, cg6 cg6Var) {
        d dVar;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        com.yandex.plus.pay.log.impl.b bVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof d) {
                dVar = (d) cg6Var;
                int i2 = dVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.o = i2 - Integer.MIN_VALUE;
                    Object obj2 = dVar.m;
                    nm6 nm6Var = nm6.a;
                    i = dVar.o;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.internal.feature.offers.a aVar = (com.yandex.plus.pay.internal.feature.offers.a) ((u) this.a).e.u.getValue();
                            dVar.j = offer;
                            dVar.k = tVar;
                            dVar.l = bVar2;
                            dVar.o = 1;
                            obj2 = ((com.yandex.plus.pay.internal.feature.offers.d) aVar).a(offer, tVar, dVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            offer2 = offer;
                            bVar = bVar2;
                        } catch (wis e) {
                            e = e;
                            offer2 = offer;
                            bVar = bVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            offer2 = offer;
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
                        bVar = dVar.l;
                        tVar = dVar.k;
                        offer2 = dVar.j;
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
                    obj = (PlusPayCompositeOfferDetails) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) obj;
                    com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.api.log.b.b, this + ".getCompositeOfferDetails(" + offer2 + ", " + tVar + ")=" + plusPayCompositeOfferDetails);
                    return plusPayCompositeOfferDetails;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayCompositeOfferDetails) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        dVar = new d(this, cg6Var);
        Object obj22 = dVar.m;
        nm6 nm6Var2 = nm6.a;
        i = dVar.o;
        com.yandex.plus.pay.log.impl.b bVar22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PlusPayCompositeOffers.Offer offer, PlusPayCounterOffersReason plusPayCounterOffersReason, cg6 cg6Var) {
        e eVar;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        com.yandex.plus.pay.log.impl.b bVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i2 = eVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.n = i2 - Integer.MIN_VALUE;
                    Object obj2 = eVar.l;
                    nm6 nm6Var = nm6.a;
                    i = eVar.n;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            try {
                                com.yandex.plus.pay.internal.feature.counter_offers.a aVar = (com.yandex.plus.pay.internal.feature.counter_offers.a) ((u) this.a).e.D.getValue();
                                eVar.j = offer;
                                eVar.k = bVar2;
                                eVar.n = 1;
                                try {
                                    obj2 = ((com.yandex.plus.pay.internal.feature.counter_offers.d) aVar).a(offer, plusPayCounterOffersReason, eVar);
                                    if (obj2 == nm6Var) {
                                        return nm6Var;
                                    }
                                    offer2 = offer;
                                    bVar = bVar2;
                                } catch (wis e) {
                                    e = e;
                                    e = e;
                                    offer2 = offer;
                                    bVar = bVar2;
                                    r7o r7oVar2 = z7o.b;
                                    t7oVar = new t7o(e);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a == null) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    th = th;
                                    offer2 = offer;
                                    bVar = bVar2;
                                    r7o r7oVar3 = z7o.b;
                                    t7oVar = new t7o(th);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a == null) {
                                    }
                                }
                            } catch (wis e2) {
                                e = e2;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (wis e3) {
                            e = e3;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = eVar.k;
                        offer2 = eVar.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e4) {
                            e = e4;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = (PlusPayCounterOffers) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayCounterOffers plusPayCounterOffers = (PlusPayCounterOffers) obj;
                    com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.api.log.b.b, this + ".getCounterOffers(" + offer2 + ", " + plusPayCounterOffers + ")} = " + plusPayCounterOffers);
                    return plusPayCounterOffers;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayCounterOffers) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e5) {
            throw e5;
        }
        eVar = new e(this, cg6Var);
        Object obj22 = eVar.l;
        nm6 nm6Var2 = nm6.a;
        i = eVar.n;
        com.yandex.plus.pay.log.impl.b bVar22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(PlusPayCompositeOffers.Offer offer, cg6 cg6Var) {
        f fVar;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        com.yandex.plus.pay.log.impl.b bVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof f) {
                fVar = (f) cg6Var;
                int i2 = fVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fVar.n = i2 - Integer.MIN_VALUE;
                    Object obj2 = fVar.l;
                    nm6 nm6Var = nm6.a;
                    i = fVar.n;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.internal.feature.presale.d a2 = ((u) this.a).a();
                            fVar.j = offer;
                            fVar.k = bVar2;
                            fVar.n = 1;
                            obj2 = a2.a(offer, fVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            offer2 = offer;
                            bVar = bVar2;
                        } catch (wis e) {
                            e = e;
                            offer2 = offer;
                            bVar = bVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            offer2 = offer;
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
                        bVar = fVar.k;
                        offer2 = fVar.j;
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
                    obj = (PlusPayPresale) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayPresale plusPayPresale = (PlusPayPresale) obj;
                    com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.api.log.b.b, this + ".getPresale(" + offer2 + ") = " + plusPayPresale);
                    return plusPayPresale;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayPresale) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        fVar = new f(this, cg6Var);
        Object obj22 = fVar.l;
        nm6 nm6Var2 = nm6.a;
        i = fVar.n;
        com.yandex.plus.pay.log.impl.b bVar22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        g gVar;
        int i;
        com.yandex.plus.pay.log.impl.b bVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof g) {
                gVar = (g) cg6Var;
                int i2 = gVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gVar.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = gVar.k;
                    nm6 nm6Var = nm6.a;
                    i = gVar.m;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            try {
                                com.yandex.plus.pay.internal.feature.topup.c cVar = (com.yandex.plus.pay.internal.feature.topup.c) ((u) this.a).e.y.getValue();
                                gVar.j = bVar2;
                                gVar.m = 1;
                                try {
                                    obj2 = cVar.a.a(str, gVar);
                                    if (obj2 == nm6Var) {
                                        return nm6Var;
                                    }
                                    bVar = bVar2;
                                } catch (wis e) {
                                    e = e;
                                    e = e;
                                    bVar = bVar2;
                                    r7o r7oVar2 = z7o.b;
                                    t7oVar = new t7o(e);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a == null) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    th = th;
                                    bVar = bVar2;
                                    r7o r7oVar3 = z7o.b;
                                    t7oVar = new t7o(th);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a == null) {
                                    }
                                }
                            } catch (wis e2) {
                                e = e2;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (wis e3) {
                            e = e3;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = gVar.j;
                        try {
                            qgg.h0(obj2);
                        } catch (wis e4) {
                            e = e4;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = (PlusPayTopupScreenConfiguration) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayTopupScreenConfiguration plusPayTopupScreenConfiguration = (PlusPayTopupScreenConfiguration) obj;
                    com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.api.log.b.b, this + ".getTopupScreenConfiguration()=" + plusPayTopupScreenConfiguration);
                    return plusPayTopupScreenConfiguration;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayTopupScreenConfiguration) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e5) {
            throw e5;
        }
        gVar = new g(this, cg6Var);
        Object obj22 = gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gVar.m;
        com.yandex.plus.pay.log.impl.b bVar22 = this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams, cg6 cg6Var) {
        h hVar;
        int i;
        PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams2;
        com.yandex.plus.pay.log.impl.b bVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        try {
            if (cg6Var instanceof h) {
                hVar = (h) cg6Var;
                int i2 = hVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hVar.n = i2 - Integer.MIN_VALUE;
                    Object obj2 = hVar.l;
                    nm6 nm6Var = nm6.a;
                    i = hVar.n;
                    com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.internal.feature.success.d dVar = (com.yandex.plus.pay.internal.feature.success.d) ((u) this.a).e.z.getValue();
                            hVar.j = plusPayWebSuccessScreenParams;
                            hVar.k = bVar2;
                            hVar.n = 1;
                            obj2 = ((com.yandex.plus.pay.internal.feature.success.c) dVar.a).a(plusPayWebSuccessScreenParams, hVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            plusPayWebSuccessScreenParams2 = plusPayWebSuccessScreenParams;
                            bVar = bVar2;
                        } catch (wis e) {
                            e = e;
                            plusPayWebSuccessScreenParams2 = plusPayWebSuccessScreenParams;
                            bVar = bVar2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            plusPayWebSuccessScreenParams2 = plusPayWebSuccessScreenParams;
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
                        bVar = hVar.k;
                        plusPayWebSuccessScreenParams2 = hVar.j;
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
                    obj = (PlusPayWebSuccessScreenConfiguration) obj2;
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        if (a instanceof com.yandex.plus.pay.api.exception.a) {
                            throw a;
                        }
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.api.log.b.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayWebSuccessScreenConfiguration plusPayWebSuccessScreenConfiguration = (PlusPayWebSuccessScreenConfiguration) obj;
                    com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.api.log.b.b, this + ".getWebSuccessScreenConfiguration(" + plusPayWebSuccessScreenParams2 + ")=" + plusPayWebSuccessScreenConfiguration);
                    return plusPayWebSuccessScreenConfiguration;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayWebSuccessScreenConfiguration) obj2;
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        hVar = new h(this, cg6Var);
        Object obj22 = hVar.l;
        nm6 nm6Var2 = nm6.a;
        i = hVar.n;
        com.yandex.plus.pay.log.impl.b bVar22 = this.b;
    }
}
