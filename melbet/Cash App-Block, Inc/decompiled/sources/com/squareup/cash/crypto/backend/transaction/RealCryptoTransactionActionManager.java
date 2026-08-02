package com.squareup.cash.crypto.backend.transaction;

import dev.zacsweers.metro.internal.Factory;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class RealCryptoTransactionActionManager {
    public final SharedFlowImpl transactionActions = FlowKt.MutableSharedFlow$default(0, 0, null, 6);

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealCryptoTransactionActionManager();
        }
    }

    public final Object onTransactionInitiated(String str, ContinuationImpl continuationImpl) {
        Object emit = this.transactionActions.emit(new CryptoTransactionAction$InitiateTransactionAction(str), continuationImpl);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
    }
}
