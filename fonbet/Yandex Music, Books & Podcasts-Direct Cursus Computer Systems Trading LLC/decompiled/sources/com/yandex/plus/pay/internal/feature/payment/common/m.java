package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m extends aur implements Function2 {
    public PlusPayInvoice j;
    public int k;
    public final /* synthetic */ r l;
    public final /* synthetic */ PlusPayInvoice m;
    public final /* synthetic */ PlusPayInvoice.PollingConfiguration n;
    public final /* synthetic */ j o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, PlusPayInvoice plusPayInvoice, PlusPayInvoice.PollingConfiguration pollingConfiguration, j jVar, Continuation continuation) {
        super(2, continuation);
        this.l = rVar;
        this.m = plusPayInvoice;
        this.n = pollingConfiguration;
        this.o = jVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m mVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        r rVar = this.l;
        PlusPayInvoice.PollingConfiguration pollingConfiguration = this.n;
        if (i == 0) {
            qgg.h0(obj);
            long retryDelayMillis = pollingConfiguration.getRetryDelayMillis();
            this.k = 1;
            mVar = this;
            obj = r.a(rVar, this.m, retryDelayMillis, this.o, mVar);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                PlusPayInvoice plusPayInvoice = this.j;
                qgg.h0(obj);
                return plusPayInvoice;
            }
            qgg.h0(obj);
            mVar = this;
        }
        PlusPayInvoice plusPayInvoice2 = (PlusPayInvoice) obj;
        if (plusPayInvoice2.getInvoiceStatus() == PlusPayInvoice.Status.SUCCESS) {
            long retryDelayMillis2 = pollingConfiguration.getRetryDelayMillis();
            mVar.j = plusPayInvoice2;
            mVar.k = 2;
            if (r.b(rVar, retryDelayMillis2, this) == nm6Var) {
                return nm6Var;
            }
        }
        return plusPayInvoice2;
    }
}
