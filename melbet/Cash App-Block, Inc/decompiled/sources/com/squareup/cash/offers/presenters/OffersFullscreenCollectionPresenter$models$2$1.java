package com.squareup.cash.offers.presenters;

import app.cash.api.ApiResult;
import app.cash.local.presenters.LocalCashBalancePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.BoostAction;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersCollectionTrackingAction;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.screens.OffersScreen$OffersNotificationScreen;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersFullscreenCollectionPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ LocalCashBalancePresenter this$0;

    /* renamed from: com.squareup.cash.offers.presenters.OffersFullscreenCollectionPresenter$models$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public final /* synthetic */ LocalCashBalancePresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(LocalCashBalancePresenter localCashBalancePresenter, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = localCashBalancePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            LocalCashBalancePresenter localCashBalancePresenter = this.this$0;
            switch (i) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(localCashBalancePresenter, continuation, 0);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                default:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(localCashBalancePresenter, continuation, 1);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass1) create((BoostAction.Error) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass1) create((ApiResult) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            LocalCashBalancePresenter localCashBalancePresenter = this.this$0;
            Object obj2 = this.L$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(new OffersScreen$OffersNotificationScreen(((BoostAction.Error) obj2).message, 3000L));
                    break;
                default:
                    ApiResult apiResult = (ApiResult) obj2;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (apiResult == null) {
                        ((ToolbarTuckTargets) localCashBalancePresenter.service).onAction(new OffersCollectionTrackingAction.StartLoading(true));
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersFullscreenCollectionPresenter$models$2$1(LocalCashBalancePresenter localCashBalancePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = localCashBalancePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LocalCashBalancePresenter localCashBalancePresenter = this.this$0;
        switch (i) {
            case 0:
                return new OffersFullscreenCollectionPresenter$models$2$1(localCashBalancePresenter, continuation, 0);
            default:
                return new OffersFullscreenCollectionPresenter$models$2$1(localCashBalancePresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OffersFullscreenCollectionPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        LocalCashBalancePresenter localCashBalancePresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(((RealBoostRepository) localCashBalancePresenter.analytics).boostSelector.actions, 14);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(localCashBalancePresenter, continuation, i2);
                    this.label = 1;
                    if (FlowKt.collectLatest(moneyTabPresenter$models$lambda$31$$inlined$map$1, anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) localCashBalancePresenter.sessionManager;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.merge(realOffersAnalyticsHelper.flowTokenUpdates(OffersAnalyticsHelper$Flow.SHOP), realOffersAnalyticsHelper.flowTokenUpdates(OffersAnalyticsHelper$Flow.BROWSE)));
                    InviteErrorPresenter$models$1$1 inviteErrorPresenter$models$1$1 = new InviteErrorPresenter$models$1$1(localCashBalancePresenter, continuation, 8);
                    this.label = 1;
                    if (FlowKt.collectLatest(distinctUntilChanged, inviteErrorPresenter$models$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
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
