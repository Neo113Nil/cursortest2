package com.squareup.cash.crypto.backend.performance;

import com.squareup.cash.crypto.backend.performance.BitcoinPerformanceSummary;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceSummary;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealBitcoinPerformanceDataRepo$bitcoinPerformanceSummary$1 extends SuspendLambda implements Function5 {
    public /* synthetic */ PerformanceSummary L$0;
    public /* synthetic */ Money L$1;
    public /* synthetic */ BitcoinPerformanceDataState L$2;

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        RealBitcoinPerformanceDataRepo$bitcoinPerformanceSummary$1 realBitcoinPerformanceDataRepo$bitcoinPerformanceSummary$1 = new RealBitcoinPerformanceDataRepo$bitcoinPerformanceSummary$1(5, (Continuation) obj5);
        realBitcoinPerformanceDataRepo$bitcoinPerformanceSummary$1.L$0 = (PerformanceSummary) obj;
        realBitcoinPerformanceDataRepo$bitcoinPerformanceSummary$1.L$1 = (Money) obj2;
        realBitcoinPerformanceDataRepo$bitcoinPerformanceSummary$1.L$2 = (BitcoinPerformanceDataState) obj3;
        return realBitcoinPerformanceDataRepo$bitcoinPerformanceSummary$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PerformanceSummary performanceSummary = this.L$0;
        Money money = this.L$1;
        BitcoinPerformanceDataState bitcoinPerformanceDataState = this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        boolean z = money.currency_code != CurrencyCode.BTC;
        if (performanceSummary == null) {
            return BitcoinPerformanceSummary.Empty.INSTANCE;
        }
        if (!z) {
            return BitcoinPerformanceSummary.Loading.INSTANCE;
        }
        long amount = Moneys.amount(performanceSummary.realized_gain_loss);
        long amount2 = Moneys.amount(money);
        long amount3 = Moneys.amount(performanceSummary.unrealized_quantity);
        long amount4 = Moneys.amount(performanceSummary.unrealized_total_cost);
        long j = (((amount2 * amount3) / 100000000) + amount) - amount4;
        long amount5 = Moneys.amount(performanceSummary.realized_total_cost) + amount4;
        return new BitcoinPerformanceSummary.Loaded(new Money(new Long(j), money.currency_code, 4), amount5 == 0 ? 0.0d : j / amount5, bitcoinPerformanceDataState == BitcoinPerformanceDataState.AWAITING_POTENTIAL_UPDATE);
    }
}
