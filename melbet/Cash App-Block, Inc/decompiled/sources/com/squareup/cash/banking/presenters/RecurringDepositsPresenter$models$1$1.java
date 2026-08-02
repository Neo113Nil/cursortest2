package com.squareup.cash.banking.presenters;

import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RecurringDepositsPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecurringDepositsPresenter$models$1$1(CardLockPresenter cardLockPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardLockPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardLockPresenter cardLockPresenter = this.this$0;
        switch (i) {
            case 0:
                return new RecurringDepositsPresenter$models$1$1(cardLockPresenter, continuation, 0);
            default:
                return new RecurringDepositsPresenter$models$1$1(cardLockPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RecurringDepositsPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardLockPresenter cardLockPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealClientSyncer) cardLockPresenter.issuedCardManager).sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BlockersHelper.launchClientScenario$default((RealBlockersHelper) cardLockPresenter.deviceLockAnimationBus, BlockersData.Flow.PROFILE_BLOCKERS, ClientScenario.ENABLE_SCHEDULED_RELOAD, (RecurringDepositsScreen) cardLockPresenter.franklinAppService, null, null, null, true, null, null, false, 3816);
                break;
        }
        return Unit.INSTANCE;
    }
}
