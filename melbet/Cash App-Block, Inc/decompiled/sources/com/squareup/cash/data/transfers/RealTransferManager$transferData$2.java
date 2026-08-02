package com.squareup.cash.data.transfers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AddCashAmountMax;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.backend.api.BalanceSnapshotManagerKt;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealTransferManager$transferData$2 extends SuspendLambda implements Function5 {
    public final /* synthetic */ boolean $customAmount;
    public final /* synthetic */ TransferType $type;
    public /* synthetic */ BalanceSnapshot L$0;
    public /* synthetic */ DepositPreferenceData L$1;
    public /* synthetic */ TransfersWithdrawManager.FeeData L$2;
    public /* synthetic */ boolean Z$0;
    public final /* synthetic */ RealTransferManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTransferManager$transferData$2(RealTransferManager realTransferManager, TransferType transferType, boolean z, Continuation continuation) {
        super(5, continuation);
        this.this$0 = realTransferManager;
        this.$type = transferType;
        this.$customAmount = z;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        TransferType transferType = this.$type;
        boolean z = this.$customAmount;
        RealTransferManager$transferData$2 realTransferManager$transferData$2 = new RealTransferManager$transferData$2(this.this$0, transferType, z, (Continuation) obj5);
        realTransferManager$transferData$2.L$0 = (BalanceSnapshot) obj;
        realTransferManager$transferData$2.L$1 = (DepositPreferenceData) obj2;
        realTransferManager$transferData$2.Z$0 = booleanValue;
        realTransferManager$transferData$2.L$2 = (TransfersWithdrawManager.FeeData) obj4;
        return realTransferManager$transferData$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BalanceSnapshot balanceSnapshot = this.L$0;
        DepositPreferenceData depositPreferenceData = this.L$1;
        boolean z = this.Z$0;
        TransfersWithdrawManager.FeeData feeData = this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (balanceSnapshot == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Need a balance snapshot to cash out");
            return null;
        }
        Money money = balanceSnapshot.balance;
        long j = ((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) this.this$0.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AddCashAmountMax.INSTANCE)).value;
        Long valueOf = Long.valueOf(j);
        if (j <= 0) {
            valueOf = null;
        }
        Money money2 = this.$customAmount ? null : money;
        Money money3 = valueOf != null ? new Money(Long.valueOf(valueOf.longValue()), money.currency_code, 4) : null;
        Instrument instrumentProto = BalanceSnapshotManagerKt.toInstrumentProto(balanceSnapshot);
        TransferType transferType = TransferType.CASH_OUT;
        TransferType transferType2 = this.$type;
        return new TransferData(money2, money3, instrumentProto, transferType2, depositPreferenceData, feeData, transferType2 == transferType && (depositPreferenceData == null || depositPreferenceData.cash_out_options.isEmpty()), z, 28304);
    }
}
