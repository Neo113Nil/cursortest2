package com.squareup.cash.crypto.backend.performance;

import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceSummary;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealBitcoinPerformanceDataRepo$bitcoinBalance$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RealBitcoinPerformanceDataRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBitcoinPerformanceDataRepo$bitcoinBalance$1(RealBitcoinPerformanceDataRepo realBitcoinPerformanceDataRepo, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realBitcoinPerformanceDataRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealBitcoinPerformanceDataRepo realBitcoinPerformanceDataRepo = this.this$0;
        switch (i) {
            case 0:
                RealBitcoinPerformanceDataRepo$bitcoinBalance$1 realBitcoinPerformanceDataRepo$bitcoinBalance$1 = new RealBitcoinPerformanceDataRepo$bitcoinBalance$1(realBitcoinPerformanceDataRepo, continuation, 0);
                realBitcoinPerformanceDataRepo$bitcoinBalance$1.L$0 = obj;
                return realBitcoinPerformanceDataRepo$bitcoinBalance$1;
            default:
                RealBitcoinPerformanceDataRepo$bitcoinBalance$1 realBitcoinPerformanceDataRepo$bitcoinBalance$12 = new RealBitcoinPerformanceDataRepo$bitcoinBalance$1(realBitcoinPerformanceDataRepo, continuation, 1);
                realBitcoinPerformanceDataRepo$bitcoinBalance$12.L$0 = obj;
                return realBitcoinPerformanceDataRepo$bitcoinBalance$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealBitcoinPerformanceDataRepo$bitcoinBalance$1) create((CryptoBalance$BitcoinBalance) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealBitcoinPerformanceDataRepo$bitcoinBalance$1) create((PerformanceSummary) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long l;
        Instant instant;
        int i = this.$r8$classId;
        RealBitcoinPerformanceDataRepo realBitcoinPerformanceDataRepo = this.this$0;
        switch (i) {
            case 0:
                StateFlowImpl stateFlowImpl = realBitcoinPerformanceDataRepo.bitcoinBalanceVersion;
                StateFlowImpl stateFlowImpl2 = realBitcoinPerformanceDataRepo.performanceDataState;
                CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                long longValue = (cryptoBalance$BitcoinBalance == null || (l = cryptoBalance$BitcoinBalance.version) == null) ? 0L : l.longValue();
                if (stateFlowImpl2.getValue() == BitcoinPerformanceDataState.ENTERED_FLOW && longValue > ((Number) stateFlowImpl.getValue()).longValue()) {
                    BitcoinPerformanceDataState bitcoinPerformanceDataState = BitcoinPerformanceDataState.AWAITING_POTENTIAL_UPDATE;
                    stateFlowImpl2.getClass();
                    stateFlowImpl2.updateState(null, bitcoinPerformanceDataState);
                }
                Long l2 = new Long(longValue);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, l2);
                break;
            default:
                PerformanceSummary performanceSummary = (PerformanceSummary) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl3 = realBitcoinPerformanceDataRepo.lastPerformanceSummaryUpdated;
                Instant instant2 = (Instant) stateFlowImpl3.getValue();
                if (instant2 == null || (performanceSummary != null && (instant = performanceSummary.version) != null && instant.isAfter(instant2))) {
                    StateFlowImpl stateFlowImpl4 = realBitcoinPerformanceDataRepo.performanceDataState;
                    BitcoinPerformanceDataState bitcoinPerformanceDataState2 = BitcoinPerformanceDataState.FRESH;
                    stateFlowImpl4.getClass();
                    stateFlowImpl4.updateState(null, bitcoinPerformanceDataState2);
                }
                stateFlowImpl3.setValue(performanceSummary != null ? performanceSummary.version : null);
                break;
        }
        return Unit.INSTANCE;
    }
}
