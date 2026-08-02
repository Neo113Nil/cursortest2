package com.squareup.cash.investing.components.exchange;

import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingExchangeView$Content$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AmountDisplayState $amountDisplayState;
    public final /* synthetic */ Money $maxAmount;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvestingExchangeView$Content$1$1$1(Money money, AmountDisplayState amountDisplayState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$maxAmount = money;
        this.$amountDisplayState = amountDisplayState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.$amountDisplayState;
        Money money = this.$maxAmount;
        switch (i) {
            case 0:
                return new InvestingExchangeView$Content$1$1$1(money, amountDisplayState, continuation, 0);
            default:
                return new InvestingExchangeView$Content$1$1$1(money, amountDisplayState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InvestingExchangeView$Content$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.$amountDisplayState;
        Money money = this.$maxAmount;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (money != null) {
                    CurrencyCode currencyCode = money.currency_code;
                    currencyCode.getClass();
                    amountDisplayState.applyConfig(new AmountConfig.MoneyConfig(currencyCode, null, false, Moneys.wholeDigits(money), 6));
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (money != null) {
                    CurrencyCode currencyCode2 = money.currency_code;
                    currencyCode2.getClass();
                    amountDisplayState.applyConfig(new AmountConfig.MoneyConfig(currencyCode2, null, false, Moneys.wholeDigits(money), 6));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
