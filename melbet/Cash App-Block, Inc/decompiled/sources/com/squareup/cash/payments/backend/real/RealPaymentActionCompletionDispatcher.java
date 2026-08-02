package com.squareup.cash.payments.backend.real;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class RealPaymentActionCompletionDispatcher {
    public final SharedFlowImpl completedPaymentActions = FlowKt.MutableSharedFlow$default(0, 50, null, 5);

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealPaymentActionCompletionDispatcher();
        }
    }
}
