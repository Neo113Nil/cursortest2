package com.squareup.cash.banking.applets.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.cash.CashDepositStart;
import com.squareup.cash.cdf.cash.CashWithdrawStart;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BalanceAppletTilePresenter$onClickAddCash$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public String L$0;
    public int label;
    public final /* synthetic */ TapToPayPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BalanceAppletTilePresenter$onClickAddCash$1(TapToPayPresenter tapToPayPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = tapToPayPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TapToPayPresenter tapToPayPresenter = this.this$0;
        switch (i) {
            case 0:
                return new BalanceAppletTilePresenter$onClickAddCash$1(tapToPayPresenter, continuation, 0);
            default:
                return new BalanceAppletTilePresenter$onClickAddCash$1(tapToPayPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BalanceAppletTilePresenter$onClickAddCash$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r8.collect(r6, r7) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r8 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r8.collect(r4, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r8 == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final String generateToken;
        final String generateToken2;
        int i = this.$r8$classId;
        final TapToPayPresenter tapToPayPresenter = this.this$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData.Flow.INSTANCE.getClass();
                    generateToken = BlockersData.Flow.Companion.generateToken();
                    ((Analytics) tapToPayPresenter.deviceIntegrityAttester).track(new CashDepositStart(generateToken), null);
                    BalanceAppletTileRepository balanceAppletTileRepository = (BalanceAppletTileRepository) tapToPayPresenter.errorReporter;
                    this.L$0 = generateToken;
                    this.label = 1;
                    obj = balanceAppletTileRepository.addMoneyTransferData();
                    break;
                } else if (i3 == 1) {
                    generateToken = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take((Flow) obj, 1);
                final int i4 = 0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.banking.applets.presenters.BalanceAppletTilePresenter$onClickAddCash$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i5 = i4;
                        String str = generateToken;
                        TapToPayPresenter tapToPayPresenter2 = tapToPayPresenter;
                        switch (i5) {
                            case 0:
                                Object startTransferFlow = ((UnleashContext) tapToPayPresenter2.ttpEligibilityProvider).startTransferFlow(TransferData.copy$default((TransferData) obj2, null, null, null, null, null, null, TransferSource.MONEY_TAB, null, 24575), str, continuation);
                                if (startTransferFlow != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    break;
                                }
                                break;
                            default:
                                Object startTransferFlow2 = ((UnleashContext) tapToPayPresenter2.ttpEligibilityProvider).startTransferFlow(TransferData.copy$default((TransferData) obj2, null, null, null, null, null, null, TransferSource.MONEY_TAB, null, 24575), str, continuation);
                                if (startTransferFlow2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    break;
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 2;
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData.Flow.INSTANCE.getClass();
                    generateToken2 = BlockersData.Flow.Companion.generateToken();
                    ((Analytics) tapToPayPresenter.deviceIntegrityAttester).track(new CashWithdrawStart(generateToken2), null);
                    BalanceAppletTileRepository balanceAppletTileRepository2 = (BalanceAppletTileRepository) tapToPayPresenter.errorReporter;
                    this.L$0 = generateToken2;
                    this.label = 1;
                    obj = balanceAppletTileRepository2.withdrawTransferData();
                    break;
                } else if (i5 == 1) {
                    generateToken2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take2 = FlowKt.take((Flow) obj, 1);
                FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.banking.applets.presenters.BalanceAppletTilePresenter$onClickAddCash$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i52 = i2;
                        String str = generateToken2;
                        TapToPayPresenter tapToPayPresenter2 = tapToPayPresenter;
                        switch (i52) {
                            case 0:
                                Object startTransferFlow = ((UnleashContext) tapToPayPresenter2.ttpEligibilityProvider).startTransferFlow(TransferData.copy$default((TransferData) obj2, null, null, null, null, null, null, TransferSource.MONEY_TAB, null, 24575), str, continuation);
                                if (startTransferFlow != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    break;
                                }
                                break;
                            default:
                                Object startTransferFlow2 = ((UnleashContext) tapToPayPresenter2.ttpEligibilityProvider).startTransferFlow(TransferData.copy$default((TransferData) obj2, null, null, null, null, null, null, TransferSource.MONEY_TAB, null, 24575), str, continuation);
                                if (startTransferFlow2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    break;
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }
}
