package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.api.exception.PlusPayPaymentException;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class i implements e {
    public final com.yandex.plus.pay.graphql.invoice.e a;
    public final com.yandex.plus.pay.internal.model.mappers.f b;
    public final com.yandex.plus.pay.log.impl.b c;

    public i(com.yandex.plus.pay.graphql.invoice.e eVar, com.yandex.plus.pay.internal.model.mappers.f fVar, com.yandex.plus.pay.log.impl.b bVar) {
        eVar.getClass();
        fVar.getClass();
        bVar.getClass();
        this.a = eVar;
        this.b = fVar;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayInvoice plusPayInvoice, cg6 cg6Var) {
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
                if (i != 0) {
                    qgg.h0(obj);
                    PlusPayInvoice.Status invoiceStatus = plusPayInvoice.getInvoiceStatus();
                    switch (invoiceStatus == null ? -1 : f.a[invoiceStatus.ordinal()]) {
                        case -1:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            if (plusPayInvoice.getInvoiceStatus() == null || plusPayInvoice.getInvoiceStatus() == PlusPayInvoice.Status.UNKNOWN) {
                                throw new PlusPayPaymentException("Unknown invoice status", com.yandex.plus.pay.api.exception.c.n);
                            }
                            if (plusPayInvoice.getInvoiceStatus() == PlusPayInvoice.Status.FAILED) {
                                PlusPayInvoice.Payment payment = plusPayInvoice.getPayment();
                                throw new PlusPayPaymentException(payment != null ? payment.getDescription() : null, com.yandex.plus.pay.internal.utils.d.a(plusPayInvoice.getPayment()));
                            }
                            String id = plusPayInvoice.getId();
                            gVar.l = 1;
                            obj = this.a.d(id, gVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            break;
                        case 0:
                        default:
                            b6e.s();
                            return null;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            return plusPayInvoice;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return this.b.a((com.yandex.plus.pay.repository.api.model.invoice.f) obj);
            }
        }
        gVar = new g(this, cg6Var);
        Object obj2 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        return this.b.a((com.yandex.plus.pay.repository.api.model.invoice.f) obj2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(2:15|16)(2:18|19)))|34|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayInvoice plusPayInvoice, cg6 cg6Var) {
        h hVar;
        int i;
        Throwable a;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hVar.k;
                Object obj2 = nm6.a;
                i = hVar.m;
                com.yandex.plus.pay.log.impl.b bVar = this.c;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.log.impl.b.d(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Starting invoice: " + plusPayInvoice.getId());
                    r7o r7oVar = z7o.b;
                    hVar.j = plusPayInvoice;
                    hVar.m = 1;
                    obj = a(plusPayInvoice, hVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plusPayInvoice = hVar.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a == null) {
                    com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Error starting invoice: " + plusPayInvoice.getId(), a, 8);
                    throw r1.U(a);
                }
                com.yandex.plus.pay.log.impl.b.d(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Start invoice result: " + plusPayInvoice);
                return obj;
            }
        }
        hVar = new h(this, cg6Var);
        Object obj3 = hVar.k;
        Object obj22 = nm6.a;
        i = hVar.m;
        com.yandex.plus.pay.log.impl.b bVar2 = this.c;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj3);
        if (a == null) {
        }
    }
}
