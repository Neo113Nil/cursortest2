package com.squareup.cash.bitcoin.views.stablecoin;

import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class SendStablecoinViewKt$SendStablecoinContent$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AmountDisplayState $amountDisplayState;
    public final /* synthetic */ SendStablecoinModel.Content $model;
    public final /* synthetic */ int $r8$classId = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendStablecoinViewKt$SendStablecoinContent$1$1(SendStablecoinModel.Content content, AmountDisplayState amountDisplayState, Continuation continuation) {
        super(2, continuation);
        this.$model = content;
        this.$amountDisplayState = amountDisplayState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.$amountDisplayState;
        SendStablecoinModel.Content content = this.$model;
        switch (i) {
            case 0:
                return new SendStablecoinViewKt$SendStablecoinContent$1$1(amountDisplayState, content, continuation);
            default:
                return new SendStablecoinViewKt$SendStablecoinContent$1$1(content, amountDisplayState, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SendStablecoinViewKt$SendStablecoinContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.$amountDisplayState;
        SendStablecoinModel.Content content = this.$model;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CurrencyCode currencyCode = content.maxAmount.currency_code;
                currencyCode.getClass();
                amountDisplayState.applyConfig(new AmountConfig.MoneyConfig(currencyCode, null, false, Moneys.wholeDigits(content.maxAmount), 6));
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str = content.restoreKeypadAmount;
                if (str != null) {
                    Function1 function1 = amountDisplayState.onEvent;
                    amountDisplayState.onEvent = null;
                    try {
                        AmountDisplayState.reset$default(amountDisplayState, str, 2);
                    } finally {
                        amountDisplayState.onEvent = function1;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendStablecoinViewKt$SendStablecoinContent$1$1(AmountDisplayState amountDisplayState, SendStablecoinModel.Content content, Continuation continuation) {
        super(2, continuation);
        this.$amountDisplayState = amountDisplayState;
        this.$model = content;
    }
}
