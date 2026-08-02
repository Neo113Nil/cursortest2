package com.squareup.cash.payments.common;

import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.util.cache.Cache;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class RealPaymentListener {
    public final CoroutineScope coroutineScope;
    public final PaymentManager paymentManager;
    public final SharedFlowImpl status = FlowKt.MutableSharedFlow$default(1, 0, null, 6);

    public RealPaymentListener(PaymentManager paymentManager, CoroutineScope coroutineScope) {
        this.paymentManager = paymentManager;
        this.coroutineScope = coroutineScope;
        JobKt.launch$default(coroutineScope, null, null, new Cache.AnonymousClass1(this, null, 2), 3);
    }

    public final void onPaymentStarted() {
        JobKt.launch$default(this.coroutineScope, null, null, new RealPaymentListener$onPaymentEnded$1(this, null, 2), 3);
    }
}
