package com.squareup.cash.directdeposit.presenters;

import com.squareup.cash.cdf.directdepositaccount.DirectDepositAccountViewStart;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import papa.SafeTrace;
import squareup.cash.paychecks.UiConfiguration;

/* loaded from: classes6.dex */
public final class DirectDepositSetupPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DirectDepositSetupPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DirectDepositSetupPresenter$models$1$1(DirectDepositSetupPresenter directDepositSetupPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = directDepositSetupPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        DirectDepositSetupPresenter directDepositSetupPresenter = this.this$0;
        switch (i) {
            case 0:
                return new DirectDepositSetupPresenter$models$1$1(directDepositSetupPresenter, continuation, 0);
            case 1:
                return new DirectDepositSetupPresenter$models$1$1(directDepositSetupPresenter, continuation, 1);
            default:
                return new DirectDepositSetupPresenter$models$1$1(directDepositSetupPresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((DirectDepositSetupPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((DirectDepositSetupPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((DirectDepositSetupPresenter$models$1$1) create((UiConfiguration) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        DirectDepositSetupPresenter directDepositSetupPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                directDepositSetupPresenter.analytics.track(new DirectDepositAccountViewStart(DirectDepositAccountViewStart.AppLocation.SETUP_DIRECT_DEPOSIT), null);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ChannelResult.m4192getOrThrowimpl(directDepositSetupPresenter.bankingOptionBadgeUpdater.optionIds.mo1159trySendJP2dKIU("PAYROLL_LOGIN"));
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(directDepositSetupPresenter.originalCardTransactionCountsAsPaycheck);
        }
    }
}
