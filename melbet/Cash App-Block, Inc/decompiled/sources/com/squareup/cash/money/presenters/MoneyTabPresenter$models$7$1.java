package com.squareup.cash.money.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.appmessages.BalanceTabPopupAppMessage;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.overlay.OverlayAppMessagePlacement;
import com.squareup.cash.appmessages.overlay.OverlayAppMessageToken;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractViewPage;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.money.applets.sections.RealMoneyContentSpanTrackingService;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.protos.cash.unicorn.compute_banking_tab_sync_value.ComputeBankingTabSyncValueRequest;
import com.squareup.protos.cash.unicorn.service.UnicornService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Instant;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneyTabPresenter$models$7$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ MoneyTabPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyTabPresenter$models$7$1(MoneyTabPresenter moneyTabPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moneyTabPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MoneyTabPresenter moneyTabPresenter = this.this$0;
        switch (i) {
            case 0:
                return new MoneyTabPresenter$models$7$1(moneyTabPresenter, continuation, 0);
            default:
                return new MoneyTabPresenter$models$7$1(moneyTabPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneyTabPresenter$models$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MoneyTabPresenter moneyTabPresenter = this.this$0;
        switch (i) {
            case 0:
                BetterNavigator.ScreenNavigator screenNavigator = moneyTabPresenter.navigator;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService = moneyTabPresenter.moneyContentSpanTrackingService;
                    if (realMoneyContentSpanTrackingService.initialLoadingStateSpanId == null) {
                        realMoneyContentSpanTrackingService.initialSyncState = ((Instant) realMoneyContentSpanTrackingService.clientSyncCompletionTracker.completedSyncTimes.get(SyncTopic.CLIENTSYNC_PRIMARY)) != null ? RealMoneyContentSpanTrackingService.FullSyncState.COMPLETED_ON_START : RealMoneyContentSpanTrackingService.FullSyncState.PENDING;
                        String m = Boxes$$ExternalSyntheticOutline1.m();
                        realMoneyContentSpanTrackingService.initialLoadingStateSpanId = m;
                        realMoneyContentSpanTrackingService.openSpans.put(m, RealObservabilityManager.startTrackingSpan$default(realMoneyContentSpanTrackingService.observabilityManager, m, "money_initial_loading_state", Thread$State$EnumUnboxingLocalUtility.m("home_version", realMoneyContentSpanTrackingService.version), null, 8));
                    }
                    RealOverlayAppMessageReader realOverlayAppMessageReader = moneyTabPresenter.overlayAppMessageReader;
                    OverlayAppMessagePlacement overlayAppMessagePlacement = OverlayAppMessagePlacement.MoneyTab;
                    this.label = 1;
                    obj = realOverlayAppMessageReader.pendingMessageFor(overlayAppMessagePlacement, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OverlayAppMessageToken overlayAppMessageToken = (OverlayAppMessageToken) obj;
                if (overlayAppMessageToken instanceof OverlayAppMessageToken.PopupToken) {
                    screenNavigator.goTo(BalanceTabPopupAppMessage.INSTANCE);
                } else if (overlayAppMessageToken instanceof OverlayAppMessageToken.SheetToken) {
                    screenNavigator.goTo(new SheetAppMessage(((OverlayAppMessageToken.SheetToken) overlayAppMessageToken).token, DetailsPageInteractViewPage.DetailsPageOrigin.BALANCE_TAB, moneyTabPresenter.args));
                } else {
                    if (!(overlayAppMessageToken instanceof OverlayAppMessageToken.FullScreenToken)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(new FullscreenAdScreen(((OverlayAppMessageToken.FullScreenToken) overlayAppMessageToken).token));
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UnicornService unicornService = moneyTabPresenter.appService;
                    ComputeBankingTabSyncValueRequest computeBankingTabSyncValueRequest = new ComputeBankingTabSyncValueRequest();
                    this.label = 1;
                    if (unicornService.computeBankingTabSyncValue(computeBankingTabSyncValueRequest, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
