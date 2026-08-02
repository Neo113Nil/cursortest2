package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tyf;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements k {
    public static final PlusPayInvoice.PollingConfiguration e = new PlusPayInvoice.PollingConfiguration(60000, 1000);
    public final com.yandex.plus.pay.graphql.invoice.e a;
    public final com.yandex.plus.pay.graphql.user.c b;
    public final com.yandex.plus.pay.internal.model.mappers.f c;
    public final com.yandex.plus.pay.log.impl.b d;

    public r(com.yandex.plus.pay.graphql.invoice.e eVar, com.yandex.plus.pay.graphql.user.c cVar, com.yandex.plus.pay.internal.model.mappers.f fVar, com.yandex.plus.pay.log.impl.b bVar) {
        eVar.getClass();
        cVar.getClass();
        fVar.getClass();
        bVar.getClass();
        this.a = eVar;
        this.b = cVar;
        this.c = fVar;
        this.d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        if (r14 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        if (defpackage.y2x.o(r10, r0) != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00da -> B:12:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, PlusPayInvoice plusPayInvoice, long j, j jVar, cg6 cg6Var) {
        p pVar;
        int i;
        PlusPayInvoice plusPayInvoice2;
        j jVar2;
        long j2;
        j jVar3;
        PlusPayInvoice plusPayInvoice3;
        Boolean bool;
        boolean z;
        j jVar4;
        if (cg6Var instanceof p) {
            pVar = (p) cg6Var;
            int i2 = pVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.o = i2 - Integer.MIN_VALUE;
                Object obj = pVar.m;
                Object obj2 = nm6.a;
                i = pVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    plusPayInvoice.getClass();
                    PlusPayInvoice.Status invoiceStatus = plusPayInvoice.getInvoiceStatus();
                    switch (invoiceStatus == null ? -1 : com.yandex.plus.pay.internal.utils.a.a[invoiceStatus.ordinal()]) {
                        case -1:
                        case 9:
                        case 10:
                        case 11:
                            return plusPayInvoice;
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
                        case 7:
                        case 8:
                            String id = plusPayInvoice.getId();
                            pVar.j = plusPayInvoice;
                            pVar.k = jVar;
                            pVar.l = j;
                            pVar.o = 1;
                            obj = rVar.d(id, pVar);
                            if (obj != obj2) {
                            }
                            return obj2;
                    }
                }
                if (i == 1) {
                    j2 = pVar.l;
                    j jVar5 = pVar.k;
                    plusPayInvoice2 = pVar.j;
                    qgg.h0(obj);
                    jVar3 = jVar5;
                    plusPayInvoice3 = (PlusPayInvoice) obj;
                    if (plusPayInvoice3 == null) {
                    }
                    if (!Intrinsics.d(bool, Boolean.TRUE)) {
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2 = pVar.l;
                        j jVar6 = pVar.k;
                        plusPayInvoice2 = pVar.j;
                        qgg.h0(obj);
                        jVar4 = jVar6;
                        PlusPayInvoice plusPayInvoice4 = plusPayInvoice2;
                        jVar = jVar4;
                        j = j2;
                        plusPayInvoice = plusPayInvoice4;
                        String id2 = plusPayInvoice.getId();
                        pVar.j = plusPayInvoice;
                        pVar.k = jVar;
                        pVar.l = j;
                        pVar.o = 1;
                        obj = rVar.d(id2, pVar);
                        if (obj != obj2) {
                            j jVar7 = jVar;
                            plusPayInvoice2 = plusPayInvoice;
                            j2 = j;
                            jVar3 = jVar7;
                            plusPayInvoice3 = (PlusPayInvoice) obj;
                            if (plusPayInvoice3 == null) {
                                bool = null;
                            } else {
                                PlusPayInvoice.Status invoiceStatus2 = plusPayInvoice3.getInvoiceStatus();
                                switch (invoiceStatus2 == null ? -1 : com.yandex.plus.pay.internal.utils.a.a[invoiceStatus2.ordinal()]) {
                                    case -1:
                                    case 9:
                                    case 10:
                                    case 11:
                                        z = true;
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
                                    case 7:
                                    case 8:
                                        z = false;
                                        break;
                                }
                                bool = Boolean.valueOf(z);
                            }
                            if (!Intrinsics.d(bool, Boolean.TRUE)) {
                                return plusPayInvoice3;
                            }
                            jVar2 = jVar3;
                            if (Intrinsics.d(bool, Boolean.FALSE)) {
                                pVar.j = plusPayInvoice2;
                                pVar.k = jVar3;
                                pVar.l = j2;
                                pVar.o = 2;
                                x xVar = (x) jVar3;
                                Object a = xVar.a(plusPayInvoice3, pVar);
                                jVar2 = xVar;
                            }
                            pVar.j = plusPayInvoice2;
                            pVar.k = jVar2;
                            pVar.l = j2;
                            pVar.o = 3;
                            jVar4 = jVar2;
                        }
                        return obj2;
                    }
                    j2 = pVar.l;
                    j jVar8 = pVar.k;
                    plusPayInvoice2 = pVar.j;
                    qgg.h0(obj);
                    jVar2 = jVar8;
                    pVar.j = plusPayInvoice2;
                    pVar.k = jVar2;
                    pVar.l = j2;
                    pVar.o = 3;
                    jVar4 = jVar2;
                }
            }
        }
        pVar = new p(rVar, cg6Var);
        Object obj3 = pVar.m;
        Object obj22 = nm6.a;
        i = pVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (defpackage.y2x.o(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0055 -> B:21:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(r rVar, long j, cg6 cg6Var) {
        q qVar;
        int i;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.m = i2 - Integer.MIN_VALUE;
                Object obj = qVar.k;
                Object obj2 = nm6.a;
                i = qVar.m;
                if (i != 0) {
                    if (i == 1) {
                        j = qVar.j;
                        qgg.h0(obj);
                        if (((com.yandex.plus.pay.repository.api.model.sync.a) obj) == com.yandex.plus.pay.repository.api.model.sync.a.b) {
                            return Unit.a;
                        }
                        qVar.j = j;
                        qVar.m = 2;
                    } else {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = qVar.j;
                    }
                }
                qgg.h0(obj);
                qVar.j = j;
                qVar.m = 1;
                obj = rVar.e(qVar);
            }
        }
        qVar = new q(rVar, cg6Var);
        Object obj3 = qVar.k;
        Object obj22 = nm6.a;
        i = qVar.m;
        if (i != 0) {
        }
        qgg.h0(obj3);
        qVar.j = j;
        qVar.m = 1;
        obj3 = rVar.e(qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PlusPayInvoice plusPayInvoice, x xVar, cg6 cg6Var) {
        l lVar;
        int i;
        PlusPayInvoice plusPayInvoice2;
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lVar.j;
                nm6 nm6Var = nm6.a;
                i = lVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    PlusPayInvoice.PollingConfiguration pollingConfiguration = plusPayInvoice.getPollingConfiguration();
                    if (pollingConfiguration == null) {
                        pollingConfiguration = e;
                    }
                    PlusPayInvoice.PollingConfiguration pollingConfiguration2 = pollingConfiguration;
                    long totalTimeoutMillis = pollingConfiguration2.getTotalTimeoutMillis();
                    m mVar = new m(this, plusPayInvoice, pollingConfiguration2, xVar, null);
                    lVar.l = 1;
                    obj = tyf.L(totalTimeoutMillis, mVar, lVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                plusPayInvoice2 = (PlusPayInvoice) obj;
                if (plusPayInvoice2 == null) {
                    return plusPayInvoice2;
                }
                throw new com.yandex.plus.pay.api.exception.a("Invoice synchronization retry limit exceeded", null);
            }
        }
        lVar = new l(this, cg6Var);
        Object obj2 = lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lVar.l;
        if (i != 0) {
        }
        plusPayInvoice2 = (PlusPayInvoice) obj2;
        if (plusPayInvoice2 == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:10)(2:28|29))(3:30|31|(1:33))|11|12|(2:14|(1:16)(1:17))|18|(1:20)|21|(2:23|24)(1:26)))|40|6|7|(0)(0)|11|12|(0)|18|(0)|21|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0047, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cg6 cg6Var) {
        n nVar;
        Object obj;
        int i;
        Throwable a;
        com.yandex.plus.pay.repository.api.model.invoice.f fVar;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.l = i2 - Integer.MIN_VALUE;
                obj = nVar.j;
                nm6 nm6Var = nm6.a;
                i = nVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.graphql.invoice.e eVar = this.a;
                    nVar.l = 1;
                    obj = eVar.c(str, nVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    boolean z = a instanceof wis;
                    com.yandex.plus.pay.log.impl.b bVar = this.d;
                    if (z) {
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Timeout when receiving invoice.", null, 12);
                    } else {
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Error when receiving invoice.", a, 8);
                    }
                }
                if (obj instanceof t7o) {
                    obj = null;
                }
                fVar = (com.yandex.plus.pay.repository.api.model.invoice.f) obj;
                if (fVar == null) {
                    return this.c.a(fVar);
                }
                return null;
            }
        }
        nVar = new n(this, cg6Var);
        obj = nVar.j;
        nm6 nm6Var2 = nm6.a;
        i = nVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj);
        if (a != null) {
        }
        if (obj instanceof t7o) {
        }
        fVar = (com.yandex.plus.pay.repository.api.model.invoice.f) obj;
        if (fVar == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:10)(2:25|26))(3:27|28|(1:30))|11|12|(2:14|(1:16)(1:17))|18|(1:20)|21|22))|38|6|7|(0)(0)|11|12|(0)|18|(0)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0047, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum e(cg6 cg6Var) {
        o oVar;
        int i;
        Throwable a;
        if (cg6Var instanceof o) {
            oVar = (o) cg6Var;
            int i2 = oVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.l = i2 - Integer.MIN_VALUE;
                Object obj = oVar.j;
                nm6 nm6Var = nm6.a;
                i = oVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.graphql.user.c cVar = this.b;
                    oVar.l = 1;
                    obj = cVar.a(oVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    boolean z = a instanceof wis;
                    com.yandex.plus.pay.log.impl.b bVar = this.d;
                    if (z) {
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Timeout when wait for user sync status.", null, 12);
                    } else {
                        com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Error when receiving user sync status.", a, 8);
                    }
                }
                return (com.yandex.plus.pay.repository.api.model.sync.a) (obj instanceof t7o ? null : obj);
            }
        }
        oVar = new o(this, cg6Var);
        Object obj2 = oVar.j;
        nm6 nm6Var2 = nm6.a;
        i = oVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj2);
        if (a != null) {
        }
        return (com.yandex.plus.pay.repository.api.model.sync.a) (obj2 instanceof t7o ? null : obj2);
    }
}
