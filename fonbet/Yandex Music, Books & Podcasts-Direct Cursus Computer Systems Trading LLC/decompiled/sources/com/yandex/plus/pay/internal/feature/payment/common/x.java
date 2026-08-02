package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.aur;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.rqi;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class x implements j {
    public final aur a;
    public final aur b;
    public final qqi c = rqi.a();
    public volatile boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public x(pyc pycVar, Function1 function1) {
        this.a = (aur) pycVar;
        this.b = (aur) function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ce, code lost:
    
        if (r12.invoke(r0) == r1) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:27:0x0062, B:29:0x006a, B:32:0x0079, B:35:0x0081, B:37:0x0091, B:39:0x009b, B:41:0x00a1, B:42:0x00a7, B:48:0x0097, B:49:0x00bc, B:51:0x00c0), top: B:26:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:27:0x0062, B:29:0x006a, B:32:0x0079, B:35:0x0081, B:37:0x0091, B:39:0x009b, B:41:0x00a1, B:42:0x00a7, B:48:0x0097, B:49:0x00bc, B:51:0x00c0), top: B:26:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r12v18, types: [oqi] */
    /* JADX WARN: Type inference failed for: r12v22, types: [oqi] */
    /* JADX WARN: Type inference failed for: r12v5, types: [aur, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aur, pyc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayInvoice plusPayInvoice, cg6 cg6Var) {
        w wVar;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        qqi qqiVar2;
        qqi qqiVar3;
        String trustFormUrl;
        try {
            if (cg6Var instanceof w) {
                wVar = (w) cg6Var;
                int i3 = wVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    wVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = wVar.m;
                    nm6 nm6Var = nm6.a;
                    i = wVar.o;
                    boolean z = false;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.c;
                        wVar.j = plusPayInvoice;
                        wVar.k = qqiVar;
                        wVar.l = 0;
                        wVar.o = 1;
                        if (qqiVar.a(wVar) != nm6Var) {
                            i2 = 0;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            qqiVar2 = wVar.k;
                        } else {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qqiVar2 = wVar.k;
                        }
                        try {
                            qgg.h0(obj);
                            qqiVar3 = qqiVar2;
                            qqiVar = qqiVar3;
                            qqiVar.b(null);
                            return Unit.a;
                        } catch (Throwable th2) {
                            th = th2;
                            qqiVar2.b(null);
                            throw th;
                        }
                    }
                    int i4 = wVar.l;
                    ?? r2 = wVar.k;
                    PlusPayInvoice plusPayInvoice2 = wVar.j;
                    qgg.h0(obj);
                    qqiVar = r2;
                    i2 = i4;
                    plusPayInvoice = plusPayInvoice2;
                    if (plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.WAIT_FOR_3DS) {
                        if (plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.WAIT_FOR_NOTIFICATION) {
                        }
                        if (plusPayInvoice.getTrustFormUrl() != null || !z) {
                            if (this.d) {
                                ?? r12 = this.b;
                                wVar.j = null;
                                wVar.k = qqiVar;
                                wVar.l = i2;
                                wVar.o = 3;
                            }
                            qqiVar.b(null);
                            return Unit.a;
                        }
                        this.d = true;
                        ?? r3 = this.a;
                        String trustFormUrl2 = plusPayInvoice.getTrustFormUrl();
                        PlusPayInvoice.WebWidgetQrCodeParams webWidgetQrCodeParams = plusPayInvoice.getWebWidgetQrCodeParams();
                        if (webWidgetQrCodeParams == null || (trustFormUrl = webWidgetQrCodeParams.getUrl()) == null) {
                            trustFormUrl = plusPayInvoice.getTrustFormUrl();
                        }
                        PlusPayInvoice.WebWidgetQrCodeParams webWidgetQrCodeParams2 = plusPayInvoice.getWebWidgetQrCodeParams();
                        com.yandex.plus.pay.api.feature.tarifficator.payment.q qVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.q(trustFormUrl, webWidgetQrCodeParams2 != null ? webWidgetQrCodeParams2.getUnderlineText() : null);
                        wVar.j = null;
                        wVar.k = qqiVar;
                        wVar.l = i2;
                        wVar.o = 2;
                        if (r3.invoke(trustFormUrl2, qVar, wVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar3 = qqiVar;
                        qqiVar = qqiVar3;
                        qqiVar.b(null);
                        return Unit.a;
                    }
                    z = true;
                    if (plusPayInvoice.getTrustFormUrl() != null) {
                    }
                    if (this.d) {
                    }
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            if (plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.WAIT_FOR_3DS) {
            }
            z = true;
            if (plusPayInvoice.getTrustFormUrl() != null) {
            }
            if (this.d) {
            }
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th3) {
            qqi qqiVar4 = qqiVar;
            th = th3;
            qqiVar2 = qqiVar4;
            qqiVar2.b(null);
            throw th;
        }
        wVar = new w(this, cg6Var);
        Object obj2 = wVar.m;
        nm6 nm6Var2 = nm6.a;
        i = wVar.o;
        boolean z2 = false;
        if (i != 0) {
        }
    }
}
