package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.appmessages.OffersTabPopupAppMessage;
import com.squareup.cash.appmessages.db.PopupMessage;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersHomePresenter$models$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $browseStartEventSpec$delegate;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ OffersHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$5$1(MutableState mutableState, OffersHomePresenter offersHomePresenter, Continuation continuation) {
        super(2, continuation);
        this.$browseStartEventSpec$delegate = mutableState;
        this.this$0 = offersHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        OffersHomePresenter offersHomePresenter = this.this$0;
        MutableState mutableState = this.$browseStartEventSpec$delegate;
        switch (i) {
            case 0:
                return new OffersHomePresenter$models$5$1(offersHomePresenter, mutableState, continuation);
            default:
                return new OffersHomePresenter$models$5$1(mutableState, offersHomePresenter, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OffersHomePresenter$models$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OffersAnalyticsEventSpec offersAnalyticsEventSpec;
        int i = this.$r8$classId;
        OffersHomePresenter offersHomePresenter = this.this$0;
        MutableState mutableState = this.$browseStartEventSpec$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!offersHomePresenter.isBrowseStartTracked && (offersAnalyticsEventSpec = (OffersAnalyticsEventSpec) mutableState.getValue()) != null) {
                    RealOffersAnalytics.trackGenericAnalyticsEvent$default(offersHomePresenter.analytics, offersAnalyticsEventSpec);
                    offersHomePresenter.isBrowseStartTracked = true;
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PopupMessage popupMessage = (PopupMessage) mutableState.getValue();
                if (popupMessage != null) {
                    OffersScreen$OffersHomeScreen.OriginInfo originInfo = offersHomePresenter.args.originInfo;
                    if (originInfo == null || !originInfo.isDeepLink) {
                        offersHomePresenter.navigator.goTo(OffersTabPopupAppMessage.INSTANCE);
                    } else {
                        RealOffersPopupMessageDismisser realOffersPopupMessageDismisser = offersHomePresenter.offersPopupMessageDismisser;
                        JobKt.launch$default(realOffersPopupMessageDismisser.scope, realOffersPopupMessageDismisser.ioContext, null, new OverlayKt$Overlay$1$1$1$1$1(realOffersPopupMessageDismisser, popupMessage.messageToken, null, 4), 2);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$5$1(OffersHomePresenter offersHomePresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = offersHomePresenter;
        this.$browseStartEventSpec$delegate = mutableState;
    }
}
