package com.squareup.cash.payments.views;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusRequester;
import androidx.core.net.UriKt;
import app.cash.api.ApiResult;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.asset.AssetPoolPoolHomeView;
import com.squareup.cash.cdf.asset.AssetRequestStart;
import com.squareup.cash.cdf.asset.AssetRequestViewRecipientSelectionScreen;
import com.squareup.cash.cdf.asset.AssetSendStart;
import com.squareup.cash.cdf.asset.AssetSendViewRecipientSelectionScreen;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentDiscoverPageLand;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentGetPaidYouAreNowVisiblePageLand;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentNuxScreenLand;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentNuxTurnOnBluetoothLand;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentPayPadPageLand;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.cdf.recipient.RecipientSearchSubmitTransaction;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.db2.payment.Pending;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.api.ViewTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersSpanManager;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$1$1$1;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$7$2;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter;
import com.squareup.cash.offers.screens.OffersScreen$OffersNotificationScreen;
import com.squareup.cash.offers.viewmodels.ArcadeOffersTimelineViewModels;
import com.squareup.cash.offers.viewmodels.OfferCountdownCaptionViewModel;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$Error;
import com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEvent;
import com.squareup.cash.paychecks.presenters.PaychecksHomePresenter$models$2$1;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewModel;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewState;
import com.squareup.cash.payments.backend.real.RealRawOfflineActivityService;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter;
import com.squareup.cash.payments.presenters.QuickPayPresenter;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PersonalizePaymentResult;
import com.squareup.cash.payments.viewmodels.ConfirmRetryResourceDialog;
import com.squareup.cash.payments.viewmodels.DialogViewModel;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.payments.viewmodels.MainPaymentViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestTab;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPosition;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphSmoother;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.screens.Back;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.treehouse.activity.OfflinePendingItem;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.thing.Thing;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class MainPaymentView$Content$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $onEvent;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPaymentView$Content$2$1(Function1 function1, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 28;
        this.$onEvent = function1;
        this.this$0 = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$onEvent;
        switch (i) {
            case 0:
                return new MainPaymentView$Content$2$1((MainPaymentView) this.this$0, (Function1) obj2, continuation, 0);
            case 1:
                MainPaymentView$Content$2$1 mainPaymentView$Content$2$1 = new MainPaymentView$Content$2$1((OffersHomePresenter) obj2, continuation, 1);
                mainPaymentView$Content$2$1.this$0 = obj;
                return mainPaymentView$Content$2$1;
            case 2:
                return new MainPaymentView$Content$2$1((PoolsListPresenter) this.this$0, (MutableState) obj2, continuation, 2);
            case 3:
                MainPaymentView$Content$2$1 mainPaymentView$Content$2$12 = new MainPaymentView$Content$2$1((PoolsListPresenter) obj2, continuation, 3);
                mainPaymentView$Content$2$12.this$0 = obj;
                return mainPaymentView$Content$2$12;
            case 4:
                return new MainPaymentView$Content$2$1((RealOffersSearchPresenter) this.this$0, (MutableState) obj2, continuation, 4);
            case 5:
                return new MainPaymentView$Content$2$1((OfferCountdownCaptionViewModel) this.this$0, (Function1) obj2, continuation, 5);
            case 6:
                return new MainPaymentView$Content$2$1((OffersHomeListItemViewModel.ClusterSection) this.this$0, (Function1) obj2, continuation, 6);
            case 7:
                MainPaymentView$Content$2$1 mainPaymentView$Content$2$13 = new MainPaymentView$Content$2$1((TapToPayPresenter) obj2, continuation, 7);
                mainPaymentView$Content$2$13.this$0 = obj;
                return mainPaymentView$Content$2$13;
            case 8:
                return new MainPaymentView$Content$2$1((LitePaymentPadViewModel) this.this$0, (AmountKeypadState) obj2, continuation, 8);
            case 9:
                return new MainPaymentView$Content$2$1((MainPaymentPadViewState) this.this$0, (MutableState) obj2, continuation, 9);
            case 10:
                MainPaymentView$Content$2$1 mainPaymentView$Content$2$14 = new MainPaymentView$Content$2$1((RealRawOfflineActivityService) obj2, continuation, 10);
                mainPaymentView$Content$2$14.this$0 = obj;
                return mainPaymentView$Content$2$14;
            case 11:
                return new MainPaymentView$Content$2$1((MainPaymentPresenter) this.this$0, (List) obj2, continuation, 11);
            case 12:
                return new MainPaymentView$Content$2$1((NearbyPayRequestViewModel.NotReady) this.this$0, (CardLockPresenter) obj2, continuation, 12);
            case 13:
                return new MainPaymentView$Content$2$1((CardLockPresenter) this.this$0, (MutableState) obj2, continuation, 13);
            case 14:
                return new MainPaymentView$Content$2$1((SnapshotStateList) this.this$0, (CardLockPresenter) obj2, continuation, 14);
            case 15:
                return new MainPaymentView$Content$2$1((LocalPosLocalCashRedemptionPresenter) this.this$0, (String) obj2, continuation, 15);
            case 16:
                return new MainPaymentView$Content$2$1((PaymentConfigurationPresenter) this.this$0, (State) obj2, continuation, 16);
            case 17:
                return new MainPaymentView$Content$2$1((MutableState) this.this$0, (State) obj2, continuation, 17);
            case 18:
                return new MainPaymentView$Content$2$1((MutableState) this.this$0, (PaymentConfigurationPresenter) obj2, continuation, 18);
            case 19:
                return new MainPaymentView$Content$2$1((PersonalizePaymentPresenter) this.this$0, (MutableState) obj2, continuation, 19);
            case 20:
                return new MainPaymentView$Content$2$1((QuickPayPresenter) this.this$0, (MutableState) obj2, continuation, 20);
            case 21:
                return new MainPaymentView$Content$2$1((MainPaymentViewModel) this.this$0, (Function1) obj2, continuation, 21);
            case 22:
                return new MainPaymentView$Content$2$1((MainPaymentViewState) this.this$0, (MutableState) obj2, continuation, 22);
            case 23:
                return new MainPaymentView$Content$2$1((Versioned) this.this$0, (FocusRequester) obj2, continuation, 23);
            case 24:
                return new MainPaymentView$Content$2$1((CoreFlowRealSheetState) this.this$0, (Function1) obj2, continuation, 24);
            case 25:
                return new MainPaymentView$Content$2$1((NearbyPayRequestTab[]) this.this$0, (NearbyPayRequestTab) obj2, continuation, 25);
            case 26:
                MainPaymentView$Content$2$1 mainPaymentView$Content$2$15 = new MainPaymentView$Content$2$1((RealScrollPerformanceTrackerFactory) obj2, continuation, 26);
                mainPaymentView$Content$2$15.this$0 = obj;
                return mainPaymentView$Content$2$15;
            case 27:
                return new MainPaymentView$Content$2$1((ProfilePresenter) this.this$0, (MutableState) obj2, continuation, 27);
            case 28:
                return new MainPaymentView$Content$2$1((Function1) obj2, (Ref$ObjectRef) this.this$0, continuation);
            default:
                return new MainPaymentView$Content$2$1((RealInvestingGraphSmoother) this.this$0, (List) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((MainPaymentView$Content$2$1) create((ApiResult) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((MainPaymentView$Content$2$1) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((MainPaymentView$Content$2$1) create((PerformanceMeasureScrollPerformance) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((MainPaymentView$Content$2$1) create((CharSequence) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((MainPaymentView$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.squareup.cash.treehouse.activity.OfflinePendingItem$Payment] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OfflinePendingItem.Transfer transfer;
        Object obj2;
        Object failure;
        Enum r0;
        RecipientSearchSubmitTransaction.SuggestionStrategy suggestionStrategy;
        SuggestionStrategy suggestionStrategy2;
        com.squareup.cash.cdf.asset.SuggestionStrategy suggestionStrategy3;
        com.squareup.cash.cdf.asset.SuggestionStrategy suggestionStrategy4;
        com.squareup.cash.cdf.asset.SuggestionStrategy suggestionStrategy5;
        com.squareup.cash.cdf.asset.SuggestionStrategy suggestionStrategy6;
        String str;
        Object failure2;
        Enum r02;
        int i = this.$r8$classId;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        Integer num = null;
        Object obj3 = this.$onEvent;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MainPaymentView mainPaymentView = (MainPaymentView) this.this$0;
                Object obj4 = Thing.Companion.thing(mainPaymentView).result;
                mainPaymentView.lastResult = obj4;
                if (obj4 instanceof PersonalizePaymentResult) {
                    ((Function1) obj3).invoke(new MainPaymentViewEvent.OnDialogResult(null, obj4));
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersHomePresenter offersHomePresenter = (OffersHomePresenter) obj3;
                Continuation continuation = null;
                JobKt.launch$default(coroutineScope, null, null, new OffersHomePresenter$models$1$1$1(offersHomePresenter, continuation, i2), 3);
                JobKt.launch$default(coroutineScope, null, null, new OffersHomePresenter$models$7$2(offersHomePresenter, continuation, i4), 3);
                JobKt.launch$default(coroutineScope, null, null, new OffersHomePresenter$models$7$2(offersHomePresenter, continuation, i3), 3);
                return Unit.INSTANCE;
            case 2:
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) ((PoolsListPresenter) this.this$0).navigator;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) obj3;
                if (((ArcadeOffersTimelineViewModels) mutableState.getValue()) instanceof OffersTimelineViewModel$Error) {
                    screenNavigator.goTo(Back.INSTANCE);
                    ArcadeOffersTimelineViewModels arcadeOffersTimelineViewModels = (ArcadeOffersTimelineViewModels) mutableState.getValue();
                    arcadeOffersTimelineViewModels.getClass();
                    screenNavigator.goTo(new OffersScreen$OffersNotificationScreen(((OffersTimelineViewModel$Error) arcadeOffersTimelineViewModels).title, 3000L));
                }
                return Unit.INSTANCE;
            case 3:
                ApiResult apiResult = (ApiResult) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj3;
                RealOffersSpanManager realOffersSpanManager = (RealOffersSpanManager) poolsListPresenter.localeAssetProvider;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    if (apiResult instanceof ApiResult.Success) {
                        Long l = ((OffersSheetResponse) ((ApiResult.Success) apiResult).response).expire_at_ms;
                        if ((l != null ? l.longValue() : 0L) <= ((AndroidClock) poolsListPresenter.args).millis()) {
                            realOffersSpanManager.onAction(new OffersSpanAction.StartLoading("offers_timeline_sheet_loading", false));
                        }
                    } else {
                        if (apiResult != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        realOffersSpanManager.onAction(new OffersSpanAction.StartLoading("offers_timeline_sheet_loading", true));
                    }
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealOffersAnalyticsHelper realOffersAnalyticsHelper = ((RealOffersSearchPresenter) this.this$0).analyticsHelper;
                if (!Intrinsics.areEqual(realOffersAnalyticsHelper.activeShopSessionId(), (String) ((MutableState) obj3).getValue())) {
                    realOffersAnalyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.SEARCH);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Function1 function1 = (Function1) obj3;
                if (((OfferCountdownCaptionViewModel) this.this$0).isExpired) {
                    function1.invoke(OffersDetailsSheetViewEvent.OfferExpired.INSTANCE);
                } else {
                    function1.invoke(OffersDetailsSheetViewEvent.OfferActive.INSTANCE);
                }
                return Unit.INSTANCE;
            case 6:
                Function1 function12 = (Function1) obj3;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersHomeListItemViewModel.ClusterSection clusterSection = (OffersHomeListItemViewModel.ClusterSection) this.this$0;
                if (!clusterSection.getInfoItem().impressionEventSpecs.isEmpty()) {
                    function12.invoke(new ItemViewed(clusterSection.getInfoItem().impressionEventSpecs));
                }
                for (ClusterItem clusterItem : CollectionsKt.take(clusterSection.getOffersList(), 3)) {
                    if (!clusterItem.getImpressionEventSpecs().isEmpty()) {
                        function12.invoke(new ItemViewed(clusterItem.getImpressionEventSpecs()));
                    }
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj3;
                JobKt.launch$default(coroutineScope2, (CoroutineContext) tapToPayPresenter.tapToPayRepository, null, new PaychecksHomePresenter$models$2$1(tapToPayPresenter, null, i4), 2);
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((LitePaymentPadViewModel) this.this$0).amountErrorTrigger != null) {
                    ((AmountKeypadState) obj3).shake();
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MainPaymentPadViewState mainPaymentPadViewState = (MainPaymentPadViewState) this.this$0;
                String str2 = mainPaymentPadViewState.rawAmount;
                String str3 = mainPaymentPadViewState.transferRawAmount;
                CurrencyCode currencyCode = mainPaymentPadViewState.currencyCode;
                BitcoinDisplayUnits bitcoinDisplayUnits = mainPaymentPadViewState.bitcoinDisplayUnits;
                str2.getClass();
                MainPaymentPadViewState mainPaymentPadViewState2 = new MainPaymentPadViewState(str2, str3, currencyCode, bitcoinDisplayUnits, true);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = MainPaymentPadViewKt.LocalElementBoundsRegistry;
                ((MutableState) obj3).setValue(mainPaymentPadViewState2);
                return Unit.INSTANCE;
            case 10:
                List<Pending> list = (List) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                for (Pending pending : list) {
                    InitiatePaymentRequest initiatePaymentRequest = pending.payment_request;
                    TransferFundsRequest transferFundsRequest = pending.transfer_request;
                    long j = pending.created_at;
                    if (initiatePaymentRequest != null) {
                        InitiatePaymentRequest initiatePaymentRequest2 = pending.payment_request;
                        initiatePaymentRequest2.getClass();
                        transfer = new OfflinePendingItem.Payment(j, initiatePaymentRequest2.encodeByteString());
                    } else if (transferFundsRequest != null) {
                        transferFundsRequest.getClass();
                        transfer = new OfflinePendingItem.Transfer(j, transferFundsRequest.encodeByteString());
                    } else {
                        Timber.Forest.w("Pending item without payment or transfer request, external_id=%s", pending.external_id);
                        transfer = null;
                    }
                    if (transfer != null) {
                        arrayList.add(transfer);
                    }
                }
                return arrayList;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) this.this$0;
                List list2 = (List) obj3;
                for (String str4 : CollectionsKt.toList(mainPaymentPresenter.recipientsSelectedFromSearchResult)) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (Intrinsics.areEqual(str4, UriKt.getCustomerId((Recipient) obj2))) {
                            }
                        } else {
                            obj2 = num;
                        }
                    }
                    Recipient recipient = (Recipient) obj2;
                    if (recipient != null) {
                        ContactsStatus contactsStatus = recipient.contactsStatus;
                        ContactStatus analyticsContactStatus = contactsStatus != null ? RecipientAnalyticsKt.toAnalyticsContactStatus(contactsStatus) : ContactStatus.IN_CONTACTS;
                        Analytics analytics = mainPaymentPresenter.analytics;
                        String uuid = mainPaymentPresenter.args.paymentToken.toString();
                        uuid.getClass();
                        String str5 = mainPaymentPresenter.searchFlowToken;
                        Recipient.Analytics analytics2 = recipient.analytics;
                        Map map = RecipientAnalyticsKt.SEARCH_TYPES;
                        Integer num2 = analytics2 != null ? analytics2.absoluteIndex : num;
                        Integer num3 = analytics2 != null ? analytics2.matchedAliasLength : num;
                        ?? r13 = analytics2 != null ? analytics2.matchedFields : num;
                        ?? r14 = analytics2 != null ? analytics2.remoteSuggestionType : num;
                        Integer num4 = analytics2 != null ? analytics2.searchTextLength : num;
                        String str6 = (String) RecipientAnalyticsKt.SEARCH_TYPES.get(analytics2 != null ? analytics2.searchType : num);
                        if (str6 != null) {
                            try {
                                Result.Companion companion = Result.Companion;
                                String upperCase = str6.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                failure = RecipientSearchSubmitTransaction.SearchType.valueOf(upperCase);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            if (failure instanceof Result.Failure) {
                                failure = null;
                            }
                            r0 = (Enum) failure;
                        } else {
                            r0 = null;
                        }
                        RecipientSearchSubmitTransaction.SearchType searchType = (RecipientSearchSubmitTransaction.SearchType) r0;
                        String str7 = analytics2 != null ? analytics2.section : null;
                        Integer num5 = analytics2 != null ? analytics2.sectionTotal : null;
                        if (analytics2 == null || (suggestionStrategy2 = analytics2.suggestionStrategy) == null) {
                            suggestionStrategy = null;
                        } else {
                            int ordinal = suggestionStrategy2.ordinal();
                            suggestionStrategy = ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? ordinal != 6 ? null : RecipientSearchSubmitTransaction.SuggestionStrategy.FAVORITE : RecipientSearchSubmitTransaction.SuggestionStrategy.REMOTE : RecipientSearchSubmitTransaction.SuggestionStrategy.CONTACTS_OFF_CASH : RecipientSearchSubmitTransaction.SuggestionStrategy.CONTACTS_ON_CASH : RecipientSearchSubmitTransaction.SuggestionStrategy.RECENTS;
                        }
                        analytics.track(new RecipientSearchSubmitTransaction(num2, uuid, num3, r13, r14, num4, searchType, str7, num5, suggestionStrategy, analytics2 != null ? analytics2.entityToken : null, analyticsContactStatus, str5, analytics2 != null ? analytics2.queryToken : null), null);
                    }
                    num = null;
                }
                return Unit.INSTANCE;
            case 12:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj3;
                String str8 = (String) cardLockPresenter.ioDispatcher;
                Analytics analytics3 = (Analytics) cardLockPresenter.analytics;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NearbyPayRequestViewModel.NotReady notReady = (NearbyPayRequestViewModel.NotReady) this.this$0;
                if (notReady.isBluetoothOff) {
                    str8.getClass();
                    analytics3.track(new NearbyPaymentNuxTurnOnBluetoothLand(str8), null);
                } else if (notReady.buttonLabel != null) {
                    str8.getClass();
                    analytics3.track(new NearbyPaymentNuxScreenLand(str8), null);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj3;
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    CardLockPresenter cardLockPresenter2 = (CardLockPresenter) this.this$0;
                    Analytics analytics4 = (Analytics) cardLockPresenter2.analytics;
                    String str9 = (String) cardLockPresenter2.ioDispatcher;
                    str9.getClass();
                    analytics4.track(new NearbyPaymentDiscoverPageLand(str9), null);
                    mutableState2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((SnapshotStateList) this.this$0).clear();
                CardLockPresenter cardLockPresenter3 = (CardLockPresenter) obj3;
                Analytics analytics5 = (Analytics) cardLockPresenter3.analytics;
                String str10 = (String) cardLockPresenter3.ioDispatcher;
                str10.getClass();
                analytics5.track(new NearbyPaymentGetPaidYouAreNowVisiblePageLand(str10), null);
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((LocalPosLocalCashRedemptionPresenter) this.this$0).analytics.track(new NearbyPaymentPayPadPageLand((String) obj3), null);
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) this.this$0;
                Analytics analytics6 = paymentConfigurationPresenter.analytics;
                Orientation orientation = paymentConfigurationPresenter.args.orientation;
                String uuid2 = paymentConfigurationPresenter.paymentToken.toString();
                uuid2.getClass();
                boolean models$lambda$1 = PaymentConfigurationPresenter.models$lambda$1((State) obj3);
                String str11 = paymentConfigurationPresenter.flowToken;
                orientation.getClass();
                int i5 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
                if (i5 == 1) {
                    analytics6.track(new AssetSendViewRecipientSelectionScreen(Boolean.valueOf(models$lambda$1), uuid2, str11), null);
                } else {
                    if (i5 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    analytics6.track(new AssetRequestViewRecipientSelectionScreen(Boolean.valueOf(models$lambda$1), uuid2, str11), null);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState3 = (MutableState) this.this$0;
                mutableState3.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState3.getValue(), null, null, null, false, ((Boolean) ((State) obj3).getValue()).booleanValue(), false, null, null, false, null, false, false, null, null, null, null, null, null, false, 16777151));
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState4 = (MutableState) this.this$0;
                PaymentRouterData.ShareLink shareLink = ((PaymentRouterData) mutableState4.getValue()).shareLink;
                if (shareLink != null) {
                    String str12 = shareLink.link;
                    PaymentConfigurationPresenter paymentConfigurationPresenter2 = (PaymentConfigurationPresenter) obj3;
                    if (shareLink.wasShared) {
                        return Unit.INSTANCE;
                    }
                    paymentConfigurationPresenter2.intentLauncher.shareText(str12, null, null);
                    PaymentRouterData paymentRouterData = (PaymentRouterData) mutableState4.getValue();
                    String str13 = shareLink.note;
                    str12.getClass();
                    str13.getClass();
                    mutableState4.setValue(PaymentRouterData.copy$default(paymentRouterData, null, null, null, false, false, false, null, null, false, null, false, false, new PaymentRouterData.ShareLink(str12, str13, true), null, null, null, null, null, false, 16744447));
                }
                return Unit.INSTANCE;
            case 19:
                PersonalizePaymentPresenter personalizePaymentPresenter = (PersonalizePaymentPresenter) this.this$0;
                RealObservabilityManager realObservabilityManager = personalizePaymentPresenter.observabilityManager;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DialogViewModel dialogViewModel = (DialogViewModel) ((MutableState) obj3).getValue();
                if (dialogViewModel instanceof PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.ConfirmOfflinePaymentDialog) {
                    ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
                    personalizePaymentPresenter.dialogViewTracking = RealObservabilityManager.startTrackingView$default(realObservabilityManager, "personalized_payments_sender_offline_alert");
                } else if (dialogViewModel instanceof ConfirmRetryResourceDialog) {
                    ObservabilityView[] observabilityViewArr2 = ObservabilityView.$VALUES;
                    personalizePaymentPresenter.dialogViewTracking = RealObservabilityManager.startTrackingView$default(realObservabilityManager, "personalized_payments_sender_offline_no_resources");
                } else {
                    if (dialogViewModel != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ViewTracking viewTracking = personalizePaymentPresenter.dialogViewTracking;
                    if (viewTracking != null) {
                        ViewTracking.viewEnded$default(viewTracking);
                    }
                }
                return Unit.INSTANCE;
            case 20:
                MutableState mutableState5 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                QuickPayPresenter quickPayPresenter = (QuickPayPresenter) this.this$0;
                PaymentScreens.QuickPay quickPay = quickPayPresenter.args;
                if (quickPay.paymentGetters.isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return null;
                }
                if (!((Boolean) mutableState5.getValue()).booleanValue()) {
                    Analytics analytics7 = quickPayPresenter.analytics;
                    quickPay.getClass();
                    Orientation orientation2 = quickPay.orientation;
                    PaymentScreens.QuickPay.QuickPayAnalytics quickPayAnalytics = quickPay.analytics;
                    int i6 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation2.ordinal()];
                    if (i6 == 1) {
                        Integer num6 = quickPayAnalytics.absoluteIndex;
                        ContactStatus contactStatus = quickPayAnalytics.contactStatus;
                        String uuid3 = quickPayAnalytics.externalPaymentId.toString();
                        Integer num7 = quickPayAnalytics.matchedAliasLength;
                        Origin origin = quickPayAnalytics.origin;
                        String str14 = quickPayAnalytics.remoteSuggestionType;
                        Integer num8 = quickPayAnalytics.searchTextLength;
                        String str15 = quickPayAnalytics.section;
                        Integer num9 = quickPayAnalytics.sectionIndex;
                        Integer num10 = quickPayAnalytics.sectionTotal;
                        String str16 = quickPayAnalytics.sectionId;
                        SuggestionStrategy suggestionStrategy7 = quickPayAnalytics.suggestionStrategy;
                        switch (suggestionStrategy7 == null ? -1 : AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$0[suggestionStrategy7.ordinal()]) {
                            case 1:
                                suggestionStrategy3 = com.squareup.cash.cdf.asset.SuggestionStrategy.RECENTS;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 2:
                                suggestionStrategy3 = com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE_SUGGESTIONS;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 3:
                                suggestionStrategy3 = com.squareup.cash.cdf.asset.SuggestionStrategy.CONTACTS_ON_CASH;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 4:
                                suggestionStrategy3 = com.squareup.cash.cdf.asset.SuggestionStrategy.CONTACTS_OFF_CASH;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 5:
                                suggestionStrategy3 = com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE_SEARCH;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            case 6:
                                suggestionStrategy3 = com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE;
                                suggestionStrategy4 = suggestionStrategy3;
                                break;
                            default:
                                suggestionStrategy4 = null;
                                break;
                        }
                        analytics7.track(new AssetSendStart(num6, contactStatus, uuid3, num7, origin, str14, num8, str15, num9, num10, str16, suggestionStrategy4, null, null, null, null, 2088992), null);
                    } else {
                        if (i6 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Integer num11 = quickPayAnalytics.absoluteIndex;
                        ContactStatus contactStatus2 = quickPayAnalytics.contactStatus;
                        String uuid4 = quickPayAnalytics.externalPaymentId.toString();
                        Integer num12 = quickPayAnalytics.matchedAliasLength;
                        Origin origin2 = quickPayAnalytics.origin;
                        String str17 = quickPayAnalytics.remoteSuggestionType;
                        Integer num13 = quickPayAnalytics.searchTextLength;
                        String str18 = quickPayAnalytics.section;
                        Integer num14 = quickPayAnalytics.sectionIndex;
                        Integer num15 = quickPayAnalytics.sectionTotal;
                        String str19 = quickPayAnalytics.sectionId;
                        SuggestionStrategy suggestionStrategy8 = quickPayAnalytics.suggestionStrategy;
                        switch (suggestionStrategy8 == null ? -1 : AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$0[suggestionStrategy8.ordinal()]) {
                            case 1:
                                suggestionStrategy5 = com.squareup.cash.cdf.asset.SuggestionStrategy.RECENTS;
                                suggestionStrategy6 = suggestionStrategy5;
                                break;
                            case 2:
                                suggestionStrategy5 = com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE_SUGGESTIONS;
                                suggestionStrategy6 = suggestionStrategy5;
                                break;
                            case 3:
                                suggestionStrategy5 = com.squareup.cash.cdf.asset.SuggestionStrategy.CONTACTS_ON_CASH;
                                suggestionStrategy6 = suggestionStrategy5;
                                break;
                            case 4:
                                suggestionStrategy5 = com.squareup.cash.cdf.asset.SuggestionStrategy.CONTACTS_OFF_CASH;
                                suggestionStrategy6 = suggestionStrategy5;
                                break;
                            case 5:
                                suggestionStrategy5 = com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE_SEARCH;
                                suggestionStrategy6 = suggestionStrategy5;
                                break;
                            case 6:
                                suggestionStrategy5 = com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE;
                                suggestionStrategy6 = suggestionStrategy5;
                                break;
                            default:
                                suggestionStrategy6 = null;
                                break;
                        }
                        analytics7.track(new AssetRequestStart(num11, contactStatus2, uuid4, num12, origin2, str17, num13, str18, num14, num15, str19, suggestionStrategy6, null, null, null, null, 253984), null);
                    }
                    mutableState5.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((MainPaymentViewModel) this.this$0).shouldShowContactsSyncPrompt) {
                    ((Function1) obj3).invoke(MainPaymentViewEvent.ContactSyncPermission.INSTANCE);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MainPaymentViewState mainPaymentViewState = (MainPaymentViewState) this.this$0;
                String str20 = mainPaymentViewState.query;
                String str21 = mainPaymentViewState.note;
                InstrumentSelection instrumentSelection = mainPaymentViewState.instrumentSelected;
                Map map2 = mainPaymentViewState.selectedRecipients;
                str20.getClass();
                str21.getClass();
                map2.getClass();
                MainPaymentViewState mainPaymentViewState2 = new MainPaymentViewState(str20, str21, instrumentSelection, map2, true);
                int i7 = MainPaymentView.$r8$clinit;
                ((MutableState) obj3).setValue(mainPaymentViewState2);
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Versioned versioned = (Versioned) this.this$0;
                if (versioned != null && ((Boolean) versioned.value).booleanValue()) {
                    FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) obj3);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((CoreFlowSheetPosition) ((CoreFlowRealSheetState) this.this$0).draggableState.settledValue$delegate.getValue()) == CoreFlowSheetPosition.Peeking) {
                    ((Function1) obj3).invoke(PaymentConfigurationViewEvent.OnSheetPeeked.INSTANCE);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((NearbyPayRequestTab[]) this.this$0)[0] = (NearbyPayRequestTab) obj3;
                return Unit.INSTANCE;
            case 26:
                PerformanceMeasureScrollPerformance performanceMeasureScrollPerformance = (PerformanceMeasureScrollPerformance) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory = (RealScrollPerformanceTrackerFactory) obj3;
                realScrollPerformanceTrackerFactory.analytics.track(performanceMeasureScrollPerformance, null);
                realScrollPerformanceTrackerFactory.observabilityManager.addViewAttributes(MapsKt__MapsKt.mapOf(new Pair("scroll_duration_ms", new Long(performanceMeasureScrollPerformance.scroll_duration_ms.longValue())), new Pair("scroll_hitch_time_ratio", new Integer(performanceMeasureScrollPerformance.scroll_hitch_time_ratio.intValue()))));
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProfilePresenter profilePresenter = (ProfilePresenter) this.this$0;
                Analytics analytics8 = profilePresenter.analytics;
                String str22 = (String) profilePresenter.profileDetailsProvider;
                PoolDetailsScreen poolDetailsScreen = (PoolDetailsScreen) profilePresenter.paymentsInboundNavigator;
                String str23 = poolDetailsScreen.token;
                String str24 = poolDetailsScreen.origin;
                if (str24 != null) {
                    String lowerCase = str24.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    str = StringsKt.trim(lowerCase).toString();
                } else {
                    str = null;
                }
                if (str != null) {
                    try {
                        Result.Companion companion3 = Result.Companion;
                        String upperCase2 = str.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        failure2 = AssetPoolPoolHomeView.ViewHomeSource.valueOf(upperCase2);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.Companion;
                        failure2 = new Result.Failure(th2);
                    }
                    if (failure2 instanceof Result.Failure) {
                        failure2 = null;
                    }
                    r02 = (Enum) failure2;
                } else {
                    r02 = null;
                }
                AssetPoolPoolHomeView.ViewHomeSource viewHomeSource = (AssetPoolPoolHomeView.ViewHomeSource) r02;
                if (viewHomeSource == null) {
                    viewHomeSource = poolDetailsScreen.source;
                }
                MoneyPool moneyPool = (MoneyPool) ((MutableState) obj3).getValue();
                moneyPool.getClass();
                PoolOwner poolOwner = moneyPool.owner;
                poolOwner.getClass();
                boolean areEqual = Intrinsics.areEqual(poolOwner.customer_token, PlatformKt.activeAccountTokenOrNull((SessionManager) profilePresenter.jurisdictionConfigManager));
                str22.getClass();
                str23.getClass();
                analytics8.track(new AssetPoolPoolHomeView(str23, areEqual ? AssetPoolPoolHomeView.MemberType.OWNER : AssetPoolPoolHomeView.MemberType.CONTRIBUTOR, viewHomeSource, str22), null);
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) obj3).invoke(new PoolInvitePeopleListViewEvent.SearchTermChanged(((TextFieldState) ((Ref$ObjectRef) this.this$0).element).getValue$foundation().text.toString()));
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return RealInvestingGraphSmoother.smoothPointsBlocking((List) obj3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainPaymentView$Content$2$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onEvent = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainPaymentView$Content$2$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$onEvent = obj2;
    }
}
