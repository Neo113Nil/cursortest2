package com.squareup.cash.savings.views;

import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.protos.common.CurrencyCode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class FullTransferInViewKt$ReadyContent$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AmountDisplayState $amountDisplayState;
    public final /* synthetic */ CurrencyCode $currency;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FullTransferInViewKt$ReadyContent$1$1(CurrencyCode currencyCode, AmountDisplayState amountDisplayState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$currency = currencyCode;
        this.$amountDisplayState = amountDisplayState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.$amountDisplayState;
        CurrencyCode currencyCode = this.$currency;
        switch (i) {
            case 0:
                return new FullTransferInViewKt$ReadyContent$1$1(currencyCode, amountDisplayState, continuation, 0);
            default:
                return new FullTransferInViewKt$ReadyContent$1$1(currencyCode, amountDisplayState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FullTransferInViewKt$ReadyContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.$amountDisplayState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CurrencyCode currencyCode = this.$currency;
                if (currencyCode != null) {
                    amountDisplayState.applyConfig(new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14));
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CurrencyCode currencyCode2 = this.$currency;
                if (currencyCode2 != null) {
                    amountDisplayState.applyConfig(new AmountConfig.MoneyConfig(currencyCode2, null, false, 0, 14));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
