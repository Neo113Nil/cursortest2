package com.squareup.cash.banking.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.unicorn.api.ComputeDisclosureSyncValueRequest;
import com.squareup.protos.cash.unicorn.compute_banking_tab_sync_value.ComputeBankingTabSyncValueRequest;
import com.squareup.protos.cash.unicorn.service.UnicornService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BalanceHomePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ BalanceHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BalanceHomePresenter$models$1$1(BalanceHomePresenter balanceHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = balanceHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        BalanceHomePresenter balanceHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new BalanceHomePresenter$models$1$1(balanceHomePresenter, continuation, 0);
            default:
                return new BalanceHomePresenter$models$1$1(balanceHomePresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BalanceHomePresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        BalanceHomePresenter balanceHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UnicornService unicornService = balanceHomePresenter.unicornAppService;
                    ComputeBankingTabSyncValueRequest computeBankingTabSyncValueRequest = new ComputeBankingTabSyncValueRequest();
                    this.label = 1;
                    if (unicornService.computeBankingTabSyncValue(computeBankingTabSyncValueRequest, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UnicornService unicornService2 = balanceHomePresenter.unicornAppService;
                    ComputeDisclosureSyncValueRequest computeDisclosureSyncValueRequest = new ComputeDisclosureSyncValueRequest(null, ByteString.EMPTY);
                    this.label = 1;
                    if (unicornService2.computeDisclosureSyncValue(computeDisclosureSyncValueRequest, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
