package com.squareup.cash.paymentpad.presenters;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.appmessages.PaymentPadTabPopupAppMessage;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.overlay.OverlayAppMessagePlacement;
import com.squareup.cash.appmessages.overlay.OverlayAppMessageToken;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractViewPage;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.inappreview.real.RealRequestReviewFlagWrapper;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.PreferenceFlow;
import com.squareup.scannerview.ScannerView;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class HomeViewPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ HomeViewPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeViewPresenter$models$3$1(HomeViewPresenter homeViewPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = homeViewPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        HomeViewPresenter homeViewPresenter = this.this$0;
        switch (i) {
            case 0:
                return new HomeViewPresenter$models$3$1(homeViewPresenter, continuation, 0);
            default:
                return new HomeViewPresenter$models$3$1(homeViewPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((HomeViewPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        HomeViewPresenter homeViewPresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                BetterNavigator.ScreenNavigator screenNavigator = homeViewPresenter.navigator;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOverlayAppMessageReader realOverlayAppMessageReader = homeViewPresenter.overlayAppMessageReader;
                    OverlayAppMessagePlacement overlayAppMessagePlacement = OverlayAppMessagePlacement.PaymentPadTab;
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
                if (overlayAppMessageToken instanceof OverlayAppMessageToken.SheetToken) {
                    screenNavigator.goTo(new SheetAppMessage(((OverlayAppMessageToken.SheetToken) overlayAppMessageToken).token, DetailsPageInteractViewPage.DetailsPageOrigin.PAYMENT_TAB, PaymentScreens$HomeScreens$PaymentPad.INSTANCE));
                } else if (overlayAppMessageToken instanceof OverlayAppMessageToken.PopupToken) {
                    ((BetterNavigator.ScreenNavigator) homeViewPresenter.paymentPadOutboundNavigator.eglConfig).goTo(PaymentPadTabPopupAppMessage.INSTANCE);
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
                    RealRequestReviewFlagWrapper realRequestReviewFlagWrapper = homeViewPresenter.requestReviewFlagWrapper;
                    BooleanPreference booleanPreference = realRequestReviewFlagWrapper.shouldRequestReviewPrompt;
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new SwipeableState$special$$inlined$filter$1(new SafeFlow(new PasscodeDialogPresenter$models$1$1((Flow) new PreferenceFlow(booleanPreference.key, booleanPreference.preferences, new ScannerView.AnonymousClass1(booleanPreference)), continuation, (Object) new CheckStatusPresenter.AnonymousClass1.C00611(realRequestReviewFlagWrapper, continuation, 25), 15)), 15), 1);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$2 = new HomeViewPresenter$models$4$1$2(homeViewPresenter, 0);
                    this.label = 1;
                    if (take.collect(homeViewPresenter$models$4$1$2, this) == coroutineSingletons2) {
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
