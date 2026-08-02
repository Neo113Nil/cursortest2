package com.squareup.cash.payments.backend.real;

import com.squareup.cash.payments.backend.api.PaymentActionComplete;
import com.squareup.cash.util.cache.Cache;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealActivityPaymentManager$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Cache.AnonymousClass1.C00671 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealActivityPaymentManager$1$1$emit$1(Cache.AnonymousClass1.C00671 c00671, Continuation continuation) {
        super(continuation);
        this.this$0 = c00671;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((PaymentActionComplete) null, (Continuation) this);
    }
}
