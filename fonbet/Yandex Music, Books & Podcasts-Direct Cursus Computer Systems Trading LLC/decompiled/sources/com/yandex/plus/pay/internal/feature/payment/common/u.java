package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.api.exception.PlusPayApiException;
import com.yandex.plus.pay.api.exception.PlusPayNetworkException;
import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.exception.PlusPayPaymentException;
import com.yandex.plus.pay.api.exception.PlusPaySslException;
import com.yandex.plus.pay.api.exception.PlusPayUnauthorizedException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rjc;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class u extends aur implements Function2 {
    public xqn j;
    public Object k;
    public v l;
    public rjc m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ v r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Continuation continuation) {
        super(2, continuation);
        this.r = vVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        u uVar = new u(this.r, continuation);
        uVar.q = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00c7, code lost:
    
        if (r8.e(r18) == r7) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00b8, code lost:
    
        if (r6.emit(com.yandex.plus.pay.api.feature.tarifficator.payment.n.a, r18) == r7) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x024d, code lost:
    
        if (r6.emit(r2, r18) == r7) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141 A[Catch: CancellationException -> 0x0042, all -> 0x0060, wis -> 0x0066, TryCatch #3 {CancellationException -> 0x0042, blocks: (B:12:0x0036, B:15:0x01a6, B:57:0x0058, B:59:0x0137, B:61:0x0141, B:62:0x018b, B:70:0x0154, B:73:0x0160, B:75:0x007a, B:77:0x011c, B:81:0x0090, B:83:0x00f5, B:90:0x00d6), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154 A[Catch: CancellationException -> 0x0042, all -> 0x0060, wis -> 0x0066, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0042, blocks: (B:12:0x0036, B:15:0x01a6, B:57:0x0058, B:59:0x0137, B:61:0x0141, B:62:0x018b, B:70:0x0154, B:73:0x0160, B:75:0x007a, B:77:0x011c, B:81:0x0090, B:83:0x00f5, B:90:0x00d6), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.plus.pay.internal.analytics.j jVar;
        xqn xqnVar;
        t7o t7oVar;
        Object obj2;
        Throwable a;
        com.yandex.plus.pay.api.feature.tarifficator.payment.f eVar;
        com.yandex.plus.pay.api.feature.tarifficator.payment.f fVar;
        Object c;
        rjc rjcVar;
        xqn xqnVar2;
        int i;
        int i2;
        Object d;
        v vVar;
        int i3;
        int i4;
        Object e;
        PlusPayInvoice plusPayInvoice;
        Object kVar;
        v vVar2 = this.r;
        String str = vVar2.i;
        PlusPayCompositeOffers.Offer offer = vVar2.a;
        com.yandex.plus.pay.internal.analytics.j jVar2 = vVar2.d;
        rjc rjcVar2 = (rjc) this.q;
        nm6 nm6Var = nm6.a;
        try {
            try {
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (wis e3) {
            e = e3;
            jVar = jVar2;
        } catch (Throwable th) {
            th = th;
            jVar = jVar2;
        }
        switch (this.p) {
            case 0:
                qgg.h0(obj);
                this.q = rjcVar2;
                this.p = 1;
                break;
            case 1:
                qgg.h0(obj);
                com.yandex.plus.experiments.impl.providers.h hVar = vVar2.e;
                this.q = rjcVar2;
                this.p = 2;
                break;
            case 2:
                qgg.h0(obj);
                ((z7o) obj).getClass();
                ((com.yandex.plus.pay.internal.analytics.evgen.b) jVar2).g(offer, str);
                xqn xqnVar3 = new xqn();
                try {
                    r7o r7oVar = z7o.b;
                    this.q = rjcVar2;
                    this.j = xqnVar3;
                    this.k = null;
                    this.l = vVar2;
                    this.m = rjcVar2;
                    this.n = 0;
                    this.o = 0;
                    this.p = 3;
                    c = vVar2.c(this);
                } catch (wis e4) {
                    e = e4;
                    jVar = jVar2;
                    xqnVar = xqnVar3;
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(e);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    jVar = jVar2;
                    xqnVar = xqnVar3;
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                if (c != nm6Var) {
                    rjcVar = rjcVar2;
                    xqnVar2 = xqnVar3;
                    i = 0;
                    i2 = 0;
                    PlusPayInvoice plusPayInvoice2 = (PlusPayInvoice) c;
                    xqnVar2.a = plusPayInvoice2.getId();
                    this.q = rjcVar2;
                    this.j = xqnVar2;
                    this.k = null;
                    this.l = vVar2;
                    this.m = rjcVar;
                    this.n = i2;
                    this.o = i;
                    this.p = 4;
                    d = vVar2.d(plusPayInvoice2, this);
                    if (d == nm6Var) {
                        int i5 = i2;
                        vVar = vVar2;
                        i3 = i;
                        i4 = i5;
                        this.q = rjcVar2;
                        this.j = xqnVar2;
                        this.k = null;
                        this.l = vVar;
                        this.m = rjcVar;
                        this.n = i4;
                        this.o = i3;
                        this.p = 5;
                        e = vVar.e((PlusPayInvoice) d, rjcVar, this);
                        if (e == nm6Var) {
                        }
                        plusPayInvoice = (PlusPayInvoice) e;
                        if (plusPayInvoice.getInvoiceStatus() == PlusPayInvoice.Status.SUCCESS) {
                            v.b(vVar, plusPayInvoice);
                            kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.l(plusPayInvoice.getId(), plusPayInvoice.getPaymentMethodId());
                            jVar = jVar2;
                        } else {
                            com.yandex.plus.pay.internal.analytics.j jVar3 = vVar.d;
                            jVar = jVar2;
                            try {
                                ((com.yandex.plus.pay.internal.analytics.evgen.b) jVar3).e(vVar.a, (String) xqnVar2.a, vVar.i, "invoice_status: " + plusPayInvoice.getInvoiceStatus());
                                kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(plusPayInvoice.getId(), new com.yandex.plus.pay.api.feature.tarifficator.payment.c(com.yandex.plus.pay.internal.utils.d.a(plusPayInvoice.getPayment())));
                            } catch (wis e5) {
                                e = e5;
                                xqnVar = xqnVar2;
                                r7o r7oVar22 = z7o.b;
                                t7oVar = new t7o(e);
                                obj2 = t7oVar;
                                a = z7o.a(obj2);
                                if (a != null) {
                                }
                                return Unit.a;
                            } catch (Throwable th3) {
                                th = th3;
                                xqnVar = xqnVar2;
                                r7o r7oVar32 = z7o.b;
                                t7oVar = new t7o(th);
                                obj2 = t7oVar;
                                a = z7o.a(obj2);
                                if (a != null) {
                                }
                                return Unit.a;
                            }
                        }
                        this.q = rjcVar2;
                        this.j = xqnVar2;
                        this.k = null;
                        this.l = null;
                        this.m = null;
                        this.n = i4;
                        this.o = i3;
                        this.p = 6;
                        if (rjcVar.emit(kVar, this) != nm6Var) {
                            xqnVar = xqnVar2;
                            try {
                                obj2 = Unit.a;
                                r7o r7oVar4 = z7o.b;
                            } catch (wis e6) {
                                e = e6;
                                r7o r7oVar222 = z7o.b;
                                t7oVar = new t7o(e);
                                obj2 = t7oVar;
                                a = z7o.a(obj2);
                                if (a != null) {
                                }
                                return Unit.a;
                            } catch (Throwable th4) {
                                th = th4;
                                r7o r7oVar322 = z7o.b;
                                t7oVar = new t7o(th);
                                obj2 = t7oVar;
                                a = z7o.a(obj2);
                                if (a != null) {
                                }
                                return Unit.a;
                            }
                            a = z7o.a(obj2);
                            if (a != null) {
                                if (a instanceof PlusPayUnauthorizedException) {
                                    fVar = com.yandex.plus.pay.api.feature.tarifficator.payment.d.a;
                                } else {
                                    if ((a instanceof PlusPayApiException) || (a instanceof PlusPayParseException)) {
                                        String message = a.getMessage();
                                        eVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.e(message != null ? message : "");
                                    } else if ((a instanceof PlusPaySslException) || (a instanceof PlusPayNetworkException)) {
                                        fVar = com.yandex.plus.pay.api.feature.tarifficator.payment.a.a;
                                    } else if (a instanceof PlusPayPaymentException) {
                                        eVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.c(((PlusPayPaymentException) a).a);
                                    } else {
                                        String message2 = a.getMessage();
                                        eVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.e(message2 != null ? message2 : "");
                                    }
                                    fVar = eVar;
                                }
                                ((com.yandex.plus.pay.internal.analytics.evgen.b) jVar).e(offer, (String) xqnVar.a, str, fVar.toString());
                                com.yandex.plus.pay.api.feature.tarifficator.payment.k kVar2 = new com.yandex.plus.pay.api.feature.tarifficator.payment.k((String) xqnVar.a, fVar);
                                this.q = null;
                                this.j = null;
                                this.k = obj2;
                                this.l = null;
                                this.m = null;
                                this.n = 0;
                                this.p = 7;
                                break;
                            }
                            return Unit.a;
                        }
                    }
                }
                return nm6Var;
            case 3:
                int i6 = this.o;
                int i7 = this.n;
                rjc rjcVar3 = this.m;
                v vVar3 = this.l;
                xqnVar2 = this.j;
                qgg.h0(obj);
                i = i6;
                vVar2 = vVar3;
                i2 = i7;
                rjcVar = rjcVar3;
                c = obj;
                PlusPayInvoice plusPayInvoice22 = (PlusPayInvoice) c;
                xqnVar2.a = plusPayInvoice22.getId();
                this.q = rjcVar2;
                this.j = xqnVar2;
                this.k = null;
                this.l = vVar2;
                this.m = rjcVar;
                this.n = i2;
                this.o = i;
                this.p = 4;
                d = vVar2.d(plusPayInvoice22, this);
                if (d == nm6Var) {
                }
                break;
            case 4:
                i3 = this.o;
                i4 = this.n;
                rjc rjcVar4 = this.m;
                vVar = this.l;
                xqnVar2 = this.j;
                qgg.h0(obj);
                rjcVar = rjcVar4;
                d = obj;
                this.q = rjcVar2;
                this.j = xqnVar2;
                this.k = null;
                this.l = vVar;
                this.m = rjcVar;
                this.n = i4;
                this.o = i3;
                this.p = 5;
                e = vVar.e((PlusPayInvoice) d, rjcVar, this);
                if (e == nm6Var) {
                }
                plusPayInvoice = (PlusPayInvoice) e;
                if (plusPayInvoice.getInvoiceStatus() == PlusPayInvoice.Status.SUCCESS) {
                }
                this.q = rjcVar2;
                this.j = xqnVar2;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = i4;
                this.o = i3;
                this.p = 6;
                if (rjcVar.emit(kVar, this) != nm6Var) {
                }
                return nm6Var;
            case 5:
                i3 = this.o;
                i4 = this.n;
                rjc rjcVar5 = this.m;
                vVar = this.l;
                xqnVar2 = this.j;
                qgg.h0(obj);
                rjcVar = rjcVar5;
                e = obj;
                plusPayInvoice = (PlusPayInvoice) e;
                if (plusPayInvoice.getInvoiceStatus() == PlusPayInvoice.Status.SUCCESS) {
                }
                this.q = rjcVar2;
                this.j = xqnVar2;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = i4;
                this.o = i3;
                this.p = 6;
                if (rjcVar.emit(kVar, this) != nm6Var) {
                }
                return nm6Var;
            case 6:
                xqnVar = this.j;
                try {
                    qgg.h0(obj);
                    jVar = jVar2;
                    obj2 = Unit.a;
                    r7o r7oVar42 = z7o.b;
                } catch (wis e7) {
                    e = e7;
                    jVar = jVar2;
                    r7o r7oVar2222 = z7o.b;
                    t7oVar = new t7o(e);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    return Unit.a;
                } catch (Throwable th5) {
                    th = th5;
                    jVar = jVar2;
                    r7o r7oVar3222 = z7o.b;
                    t7oVar = new t7o(th);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                a = z7o.a(obj2);
                if (a != null) {
                }
                return Unit.a;
            case 7:
                qgg.h0(obj);
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
