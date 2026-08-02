package com.squareup.cash.session.backend;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.room.TransactorKt;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.CacheNetworkResponse;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.google.android.gms.maps.zzai;
import com.google.android.play.integrity.internal.ax;
import com.google.crypto.tink.subtle.Hkdf;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cdf.NotificationType;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.cdf.customersupport.CustomerSupportReviewReceiveNotification;
import com.squareup.cash.cdf.globalsearch.GlobalSearchSelectItem;
import com.squareup.cash.cdf.globalsearch.TapTarget;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.exchangedata.api.FxExchangeRate;
import com.squareup.cash.exchangedata.real.RealExchangeDataSyncerFactory;
import com.squareup.cash.exchangedata.real.RealFxExchangeRateStreamingSubscriber;
import com.squareup.cash.fidesmo.api.FidesmoActivationData;
import com.squareup.cash.fidesmo.api.FidesmoClient;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoServiceType;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningFlowContext;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.globalsearch.analytics.api.GlobalSearchAnalyticsContext$Item;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.presenters.GlobalSearchActivityEventDecorator;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$FrameRenderer$5$1$1$1$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.instruments.backend.api.PaymentInstrument;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Action;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.db.WithHoldings;
import com.squareup.cash.investing.presenters.TradeEvent$TransferAllShares;
import com.squareup.cash.investing.presenters.TransferStockPresenter;
import com.squareup.cash.investing.presenters.TransferStockPresenter$models$3$1$2;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$State;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$2$1$1;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputQuestion;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.notifications.CashNotification;
import com.squareup.cash.notifications.CashNotification$ClearAppDataNotification$ClearAll;
import com.squareup.cash.notifications.channels.NotificationChannelGroupId;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.notifications.intents.CashNotificationIntents;
import com.squareup.cash.notifications.intents.RealNotificationIntentsCreator;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$AccountRemovalStatus;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccountList;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter;
import com.squareup.cash.payments.PaymentInitiator$Result;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.session.backend.RealSessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$State;
import com.squareup.cash.transfers.presenters.ScheduledReloadConfirmationPresenter;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.ui.PaymentPasscodeActivity;
import com.squareup.cash.ui.gcm.NotificationActionService;
import com.squareup.cash.ui.gcm.RealNotificationDispatcher;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction$CashTagProvisioning$NfcScanRetry;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$3$1$1;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.fx.app.StreamExchangeRateRequest;
import com.squareup.protos.cash.fx.app.StreamExchangeRateResponse;
import com.squareup.protos.cash.fx.app.StreamExchangeRateResponse$Type$Update;
import com.squareup.protos.cash.fx.service.GrpcFxRatesStreamingServiceClient;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetExchangeDataRequest;
import com.squareup.protos.franklin.app.GetExchangeDataResponse;
import com.squareup.protos.franklin.common.ExchangeData;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.protos.franklin.lending.PlasmaPrepurchaseCashCardToggleFlowParameters;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.WireGrpcClient;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import comsquareupcashexchangedatadb.ExchangeDataQueries$exchangeRates$2;
import comsquareupcashexchangedatadb.Exchange_data;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.sync.MutexImpl;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.MultipartBody;
import okio.ByteString;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class DbSessionManager$updateDb$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object $stateChangeReason;
    public /* synthetic */ Object $update;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DbSessionManager$updateDb$2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.L$1 = obj2;
        this.this$0 = obj3;
        this.L$2 = obj4;
        this.$update = obj5;
        this.L$3 = obj6;
        this.$stateChangeReason = obj7;
    }

    private final Object invokeSuspend$com$squareup$cash$payments$presenters$MainPaymentPresenter$models$4$1(Object obj) {
        DbSessionManager$updateDb$2 dbSessionManager$updateDb$2;
        MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            MutableState mutableState = (MutableState) this.$update;
            MutableState mutableState2 = (MutableState) this.L$3;
            State state = (State) this.$stateChangeReason;
            String str = (String) this.L$0;
            Recipient recipient = (Recipient) this.L$1;
            this.label = 1;
            dbSessionManager$updateDb$2 = this;
            if (MainPaymentPresenter.models$addRecipient(mainPaymentPresenter, mutableState, mutableState2, state, str, recipient, dbSessionManager$updateDb$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            dbSessionManager$updateDb$2 = this;
        }
        ((MainPaymentViewEvent.ListRowClicked) ((MainPaymentViewEvent) dbSessionManager$updateDb$2.this$0)).getClass();
        StateFlowImpl stateFlowImpl = mainPaymentPresenter.query;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, "");
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$payments$presenters$MainPaymentPresenter$submitPayment$2$2(Object obj) {
        Object initiate;
        PaymentInitiatorData paymentInitiatorData = (PaymentInitiatorData) this.L$1;
        List list = (List) this.this$0;
        MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) this.L$0;
        PaymentScreens.MainPayment mainPayment = mainPaymentPresenter.args;
        BetterNavigator.ScreenNavigator screenNavigator = mainPaymentPresenter.navigator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Screen screen = mainPayment.exitScreen;
            if (screen == null) {
                screen = PaymentScreens$HomeScreens$Home.INSTANCE;
            }
            Screen screen2 = screen;
            RealPaymentInitiator realPaymentInitiator = mainPaymentPresenter.paymentInitiator;
            ClientScenario clientScenario = ClientScenario.PAYMENT_FLOW;
            this.label = 1;
            initiate = realPaymentInitiator.initiate(paymentInitiatorData, clientScenario, screen2, screen2, false, this);
            if (initiate == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            initiate = obj;
        }
        PaymentInitiator$Result paymentInitiator$Result = (PaymentInitiator$Result) initiate;
        if (paymentInitiator$Result instanceof PaymentInitiator$Result.InitiatePayment) {
            screenNavigator.goTo(((PaymentInitiator$Result.InitiatePayment) paymentInitiator$Result).screen);
        } else if (paymentInitiator$Result instanceof PaymentInitiator$Result.SelectCard) {
            GoogleMapKt.goToSelectInstrument$default(screenNavigator, mainPaymentPresenter.analytics, mainPayment.amountInProfileCurrency, (List) this.this$0, (BalanceSnapshot) this.L$2, (List) this.$update, (InstrumentLinkingConfig) this.L$3, (InstrumentSelection) this.$stateChangeReason);
        } else if (paymentInitiator$Result instanceof PaymentInitiator$Result.ConfirmDuplicate) {
            Money money = paymentInitiatorData.amount;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(TextFieldValueKt.toPaymentRecipient((Recipient) it.next()));
            }
            screenNavigator.goTo(new PaymentScreens.ConfirmDuplicate(money, new RedactedParcelableList(arrayList)));
        } else {
            if (!(paymentInitiator$Result instanceof PaymentInitiator$Result.LongerNote)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(TextFieldValueKt.toPaymentRecipient((Recipient) it2.next()));
            }
            screenNavigator.goTo(new PaymentScreens.NoteRequired(new RedactedParcelableList(arrayList2), mainPayment.orientation, 4));
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$payments$presenters$NearbyPayRequestPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            ZiplineLoader$load$2.AnonymousClass1 anonymousClass1 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope, (CardLockPresenter) this.this$0, (SnapshotStateList) this.L$2, (MutableState) this.$update, (State) this.L$3, (MutableState) this.$stateChangeReason, 14);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$payments$presenters$NearbyPaymentKeypadPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            ZiplineLoader$load$2.AnonymousClass1 anonymousClass1 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope, (MoleculePresenter) this.this$0, (String) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 15);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (app.cash.local.presenters.LocalEditorialPresenter.access$syncPrepurchaseCashCard(r2, r14, r0, r13) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r14 == r4) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$prepurchasecashcard$presenters$PrepurchaseCashCardPlanningPresenter$models$4$1(Object obj) {
        MutableState mutableState = (MutableState) this.$stateChangeReason;
        MutableState mutableState2 = (MutableState) this.$update;
        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.L$1;
        PrepurchaseCashCardPlanningViewModel.ButtonAction buttonAction = (PrepurchaseCashCardPlanningViewModel.ButtonAction) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            PrepurchaseCashCardPlanningViewModel.ButtonAction.Toggle toggle = (PrepurchaseCashCardPlanningViewModel.ButtonAction.Toggle) buttonAction;
            mutableState2.setValue(CollectionsKt.plus((Collection) mutableState2.getValue(), (Object) toggle.buttonId));
            EglCore eglCore = (EglCore) localEditorialPresenter.service;
            PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent parent = (PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent) this.this$0;
            int i2 = 4;
            PlasmaPrepurchaseCashCardToggleFlowParameters plasmaPrepurchaseCashCardToggleFlowParameters = new PlasmaPrepurchaseCashCardToggleFlowParameters(i2, (String) ((MutableState) this.L$3).getValue(), toggle.opaqueRequestData);
            this.label = 1;
            obj = eglCore.getPrepurchaseToggleFlowScreen(parent, plasmaPrepurchaseCashCardToggleFlowParameters, parent, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue(CollectionsKt.minus((List) mutableState2.getValue(), ((PrepurchaseCashCardPlanningViewModel.ButtonAction.Toggle) buttonAction).buttonId));
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        Screen screen = (Screen) obj;
        if (screen == null) {
            screen = (Back) this.L$2;
        }
        if (screen == null) {
            mutableState.setValue(null);
            ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1 = new ShiftNotePresenter$models$1$1(localEditorialPresenter, mutableState);
            ConvertFromJavaKt$$Lambda$4 convertFromJavaKt$$Lambda$4 = new ConvertFromJavaKt$$Lambda$4(localEditorialPresenter, 7);
            this.label = 2;
        } else {
            ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(screen);
        }
        mutableState2.setValue(CollectionsKt.minus((List) mutableState2.getValue(), ((PrepurchaseCashCardPlanningViewModel.ButtonAction.Toggle) buttonAction).buttonId));
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$profile$presenters$personal$ArcadeAutofillSettingsDetailPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            ZiplineLoader$load$2.AnonymousClass1 anonymousClass1 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope, (PoolsListPresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 17);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$support$presenters$ContactSupportEmailMessagePresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            ZiplineLoader$load$2.AnonymousClass1 anonymousClass1 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope, (WorkHomePresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 18);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$taptopay$presenters$TapToPayPaymentPresenter$models$5$1(Object obj) {
        CardLockPresenter cardLockPresenter;
        MutexImpl mutexImpl;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        MutableState mutableState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CardLockPresenter cardLockPresenter2 = (CardLockPresenter) this.$update;
            MutexImpl mutexImpl2 = (MutexImpl) cardLockPresenter2.ioDispatcher;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) this.L$3;
            MutableState mutableState2 = (MutableState) this.$stateChangeReason;
            this.L$0 = mutexImpl2;
            this.L$1 = cardLockPresenter2;
            this.this$0 = parcelableSnapshotMutableIntState2;
            this.L$2 = mutableState2;
            this.label = 1;
            if (mutexImpl2.lock(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            cardLockPresenter = cardLockPresenter2;
            mutexImpl = mutexImpl2;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutableState = (MutableState) this.L$2;
            parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.this$0;
            cardLockPresenter = (CardLockPresenter) this.L$1;
            mutexImpl = (MutexImpl) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        try {
            if (parcelableSnapshotMutableIntState.getIntValue() > 0) {
                ((zzai) cardLockPresenter.args).stopReadingCardPayment();
            }
            mutableState.setValue(TapToPayPaymentPresenter$State.Initialized.INSTANCE);
            mutexImpl.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
    }

    private final Object invokeSuspend$com$squareup$cash$transfers$presenters$ScheduledReloadConfirmationPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$1 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope, (ScheduledReloadConfirmationPresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(cardSchemePresenter$toHeroModule$3$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x007b, code lost:
    
        if (r8 == r7) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0349  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$ui$gcm$RealNotificationDispatcher$showNotification$1(Object obj) {
        Object identifyChannelId;
        NotificationChannelId notificationChannelId;
        NotificationCompat.Builder buildBasicNotification;
        AndroidNotificationManager androidNotificationManager;
        CashNotificationIntents cashNotificationIntents;
        RealNotificationIntentsCreator realNotificationIntentsCreator;
        String str;
        RealNotificationDispatcher realNotificationDispatcher;
        Object first;
        NotificationChannelId notificationChannelId2;
        NotificationCompat.Builder builder;
        List list;
        Object first2;
        CashNotificationIntents cashNotificationIntents2;
        AndroidNotificationManager androidNotificationManager2;
        RealNotificationDispatcher realNotificationDispatcher2;
        NotificationChannelGroupId notificationChannelGroupId;
        Object viewEquities;
        String str2;
        Money money;
        boolean equals;
        boolean z;
        CashNotification cashNotification;
        String str3;
        PendingIntent pendingIntent;
        String str4;
        InstrumentType instrumentType;
        String str5;
        Intent createIntent;
        Bitmap bitmap = (Bitmap) this.$stateChangeReason;
        CashNotification cashNotification2 = (CashNotification) this.L$3;
        RealNotificationDispatcher realNotificationDispatcher3 = (RealNotificationDispatcher) this.$update;
        AndroidNotificationManager androidNotificationManager3 = realNotificationDispatcher3.notificationManager;
        RealNotificationIntentsCreator realNotificationIntentsCreator2 = realNotificationDispatcher3.notificationIntentsCreator;
        Context context = realNotificationDispatcher3.context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            identifyChannelId = realNotificationDispatcher3.channelsInitializer.identifyChannelId(cashNotification2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    CashNotificationIntents cashNotificationIntents3 = (CashNotificationIntents) this.this$0;
                    builder = (NotificationCompat.Builder) this.L$1;
                    notificationChannelId2 = (NotificationChannelId) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    cashNotificationIntents = cashNotificationIntents3;
                    androidNotificationManager = androidNotificationManager3;
                    realNotificationIntentsCreator = realNotificationIntentsCreator2;
                    str = "client-route-url";
                    first = obj;
                    list = (List) first;
                    ChannelFlowTransformLatest select = realNotificationDispatcher3.balanceSnapshotManager.select();
                    this.L$0 = notificationChannelId2;
                    this.L$1 = builder;
                    this.this$0 = cashNotificationIntents;
                    this.L$2 = list;
                    this.label = 3;
                    first2 = FlowKt.first(select, this);
                    if (first2 != coroutineSingletons) {
                        cashNotificationIntents2 = cashNotificationIntents;
                        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) first2;
                        CashNotification.PaymentNotification paymentNotification = (CashNotification.PaymentNotification) cashNotification2;
                        String str6 = paymentNotification.category;
                        str2 = paymentNotification.paymentToken;
                        money = paymentNotification.paymentAmount;
                        String str7 = paymentNotification.verificationInstrumentToken;
                        Intent intent = cashNotificationIntents2.content;
                        equals = "request".equals(str6);
                        if (equals) {
                        }
                        if (equals) {
                        }
                        boolean z2 = z;
                        if (money != null) {
                        }
                        cashNotification = cashNotification2;
                        realNotificationDispatcher = realNotificationDispatcher3;
                        str3 = str2;
                        pendingIntent = null;
                        if (pendingIntent != null) {
                        }
                        buildBasicNotification = builder;
                        notificationChannelId = notificationChannelId2;
                        cashNotification2 = cashNotification;
                        if (cashNotification2 instanceof CashNotification.PaymentNotification) {
                        }
                        realNotificationDispatcher2 = realNotificationDispatcher;
                        notificationChannelGroupId = notificationChannelId.group;
                        if (notificationChannelGroupId != NotificationChannelGroupId.Payments) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
                if (i != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) this.L$2;
                cashNotificationIntents2 = (CashNotificationIntents) this.this$0;
                builder = (NotificationCompat.Builder) this.L$1;
                NotificationChannelId notificationChannelId3 = (NotificationChannelId) this.L$0;
                SafeTrace.throwOnFailure(obj);
                notificationChannelId2 = notificationChannelId3;
                androidNotificationManager = androidNotificationManager3;
                realNotificationIntentsCreator = realNotificationIntentsCreator2;
                str = "client-route-url";
                first2 = obj;
                BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) first2;
                CashNotification.PaymentNotification paymentNotification2 = (CashNotification.PaymentNotification) cashNotification2;
                String str62 = paymentNotification2.category;
                str2 = paymentNotification2.paymentToken;
                money = paymentNotification2.paymentAmount;
                String str72 = paymentNotification2.verificationInstrumentToken;
                Intent intent2 = cashNotificationIntents2.content;
                equals = "request".equals(str62);
                z = equals && "request-passcode-required".equals(str62);
                if (!equals || z) {
                    boolean z22 = z;
                    if (money != null || Hkdf.instrumentTokenForBillPayment(balanceSnapshot2, money, list) == null) {
                        cashNotification = cashNotification2;
                        realNotificationDispatcher = realNotificationDispatcher3;
                        str3 = str2;
                        pendingIntent = null;
                    } else if (z22) {
                        boolean equals2 = "CUSTOMER_PASSCODE".equals(str72);
                        PaymentInstrument instrumentTokenForBillPayment = Hkdf.instrumentTokenForBillPayment(balanceSnapshot2, money, list);
                        if (equals2) {
                            int i2 = PaymentPasscodeActivity.$r8$clinit;
                            Context context2 = realNotificationDispatcher3.context;
                            instrumentTokenForBillPayment.getClass();
                            str4 = str2;
                            createIntent = WorkCookieJar.createIntent(context2, str4, instrumentTokenForBillPayment, "CUSTOMER_PASSCODE", null, null, intent2);
                        } else {
                            str4 = str2;
                            int i3 = PaymentPasscodeActivity.$r8$clinit;
                            Context context3 = realNotificationDispatcher3.context;
                            instrumentTokenForBillPayment.getClass();
                            String str8 = Hkdf.token(instrumentTokenForBillPayment);
                            boolean z3 = instrumentTokenForBillPayment instanceof PaymentInstrument.ExternalPaymentInstrument;
                            if (z3) {
                                instrumentType = ((PaymentInstrument.ExternalPaymentInstrument) instrumentTokenForBillPayment).instrument.cardBrand;
                            } else {
                                if (!(instrumentTokenForBillPayment instanceof PaymentInstrument.BalancePaymentInstrument)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                instrumentType = null;
                            }
                            if (z3) {
                                str5 = ((PaymentInstrument.ExternalPaymentInstrument) instrumentTokenForBillPayment).instrument.suffix;
                            } else {
                                if (!(instrumentTokenForBillPayment instanceof PaymentInstrument.BalancePaymentInstrument)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                str5 = null;
                            }
                            createIntent = WorkCookieJar.createIntent(context3, str4, instrumentTokenForBillPayment, str8, instrumentType, str5, intent2);
                        }
                        str3 = str4;
                        intent2 = intent2;
                        pendingIntent = PendingIntent.getActivity(context, 0, createIntent, 201326592);
                        cashNotification = cashNotification2;
                        realNotificationDispatcher = realNotificationDispatcher3;
                    } else {
                        str3 = str2;
                        Intent intent3 = new Intent(context, (Class<?>) NotificationActionService.class);
                        realNotificationDispatcher = realNotificationDispatcher3;
                        intent3.setAction("send");
                        cashNotification = cashNotification2;
                        intent3.setData(Uri.fromParts("payment", str3, null));
                        PaymentInstrument instrumentTokenForBillPayment2 = Hkdf.instrumentTokenForBillPayment(balanceSnapshot2, money, list);
                        intent3.putExtra("channel-id", notificationChannelId2.id);
                        intent3.putExtra("payment-token", str3);
                        intent3.putExtra("details-intent", intent2);
                        instrumentTokenForBillPayment2.getClass();
                        intent3.putExtra("instrument-token", Hkdf.token(instrumentTokenForBillPayment2));
                        pendingIntent = PendingIntent.getService(context, 0, intent3, 201326592);
                    }
                    if (pendingIntent != null) {
                        Intent intent4 = new Intent(context, (Class<?>) NotificationActionService.class);
                        intent4.setAction("decline");
                        intent4.setData(Uri.fromParts("payment", str3, null));
                        intent4.putExtra("channel-id", notificationChannelId2.id);
                        intent4.putExtra("payment-token", str3);
                        intent4.putExtra("details-intent", intent2);
                        PendingIntent service = PendingIntent.getService(context, 0, intent4, 201326592);
                        String string2 = context.getString(R.string.notif_action_send);
                        string2.getClass();
                        String string3 = context.getString(R.string.notif_action_decline);
                        string3.getClass();
                        builder.addAction(R.drawable.notification_decline, service, string3);
                        builder.addAction(R.drawable.notification_approve, pendingIntent, string2);
                        if (z22) {
                            string2 = context.getString(R.string.wear_action_send_passcode);
                        }
                        string2.getClass();
                        NotificationCompat.WearableExtender wearableExtender = new NotificationCompat.WearableExtender();
                        wearableExtender.addAction(new NotificationCompat.Action(2131233664, string2, pendingIntent));
                        wearableExtender.addAction(new NotificationCompat.Action(2131233665, string3, service));
                        builder.extend(wearableExtender);
                    }
                } else {
                    cashNotification = cashNotification2;
                    realNotificationDispatcher = realNotificationDispatcher3;
                }
                buildBasicNotification = builder;
                notificationChannelId = notificationChannelId2;
                cashNotification2 = cashNotification;
                if (cashNotification2 instanceof CashNotification.PaymentNotification) {
                    String str9 = ((CashNotification.PaymentNotification) cashNotification2).paymentToken;
                    Notification build = buildBasicNotification.build();
                    build.getClass();
                    androidNotificationManager2 = androidNotificationManager;
                    androidNotificationManager2.notify(str9, 1, build);
                } else {
                    androidNotificationManager2 = androidNotificationManager;
                    if (cashNotification2 instanceof CashNotification.HomeNotification) {
                        String uuid = UUID.randomUUID().toString();
                        Notification build2 = buildBasicNotification.build();
                        build2.getClass();
                        androidNotificationManager2.notify(uuid, 3, build2);
                    } else if (cashNotification2 instanceof CashNotification.ClientRouteNotification.SupportChatMessageNotification) {
                        String uuid2 = UUID.randomUUID().toString();
                        Notification build3 = buildBasicNotification.build();
                        build3.getClass();
                        androidNotificationManager2.notify(uuid2, 5, build3);
                    } else {
                        if (!(cashNotification2 instanceof CashNotification.ClientRouteNotification.SupportPhoneVerificationNotification)) {
                            if (cashNotification2 instanceof CashNotification.ClientRouteNotification.SupportSurveyNotification) {
                                realNotificationDispatcher2 = realNotificationDispatcher;
                                Analytics analytics = realNotificationDispatcher2.analytics;
                                ClientRoute.ViewSupportSurvey viewSupportSurvey = ((CashNotification.ClientRouteNotification.SupportSurveyNotification) cashNotification2).clientRoute;
                                analytics.track(new CustomerSupportReviewReceiveNotification(viewSupportSurvey.surveyToken), null);
                                String str10 = viewSupportSurvey.surveyToken;
                                Notification build4 = buildBasicNotification.build();
                                build4.getClass();
                                androidNotificationManager2.notify(str10, 7, build4);
                            } else {
                                realNotificationDispatcher2 = realNotificationDispatcher;
                                String uuid3 = UUID.randomUUID().toString();
                                Notification build5 = buildBasicNotification.build();
                                build5.getClass();
                                androidNotificationManager2.notify(uuid3, 0, build5);
                            }
                            notificationChannelGroupId = notificationChannelId.group;
                            if (notificationChannelGroupId != NotificationChannelGroupId.Payments) {
                                String str11 = notificationChannelGroupId.id;
                                androidNotificationManager2.getClass();
                                notificationChannelGroupId.getClass();
                                NotificationChannelGroup notificationChannelGroup = androidNotificationManager2.notificationManagerCompat.getNotificationChannelGroup(notificationChannelGroupId.id);
                                CharSequence name = notificationChannelGroup != null ? notificationChannelGroup.getName() : null;
                                NotificationChannelGroupId notificationChannelGroupId2 = notificationChannelId.group;
                                realNotificationIntentsCreator.getClass();
                                notificationChannelGroupId2.getClass();
                                switch (notificationChannelGroupId2) {
                                    case StocksOwned:
                                        viewEquities = new ClientRoute.ViewEquities();
                                        break;
                                    case StocksFollowed:
                                        viewEquities = new ClientRoute.ViewEquities();
                                        break;
                                    case NewsAndExclusives:
                                        viewEquities = new ClientRoute.ViewPaymentPad();
                                        break;
                                    case Payments:
                                        viewEquities = new ClientRoute.ViewActivity(ClientRoute.ViewActivity.spec, ClientRoute.ViewActivity.deepLinkSpecs, null);
                                        break;
                                    case Stock:
                                        viewEquities = new ClientRoute.ViewEquities();
                                        break;
                                    case Bitcoin:
                                        viewEquities = new ClientRoute.ViewBitcoin(ClientRoute.ViewBitcoin.spec, ClientRoute.ViewBitcoin.deepLinkSpecs, null);
                                        break;
                                    case Lending:
                                        viewEquities = new ClientRoute.ViewBorrowApplet(ClientRoute.ViewBorrowApplet.spec, ClientRoute.ViewBorrowApplet.deepLinkSpecs, null);
                                        break;
                                    case Local:
                                        viewEquities = new ClientRoute.ViewLocalHome(ClientRoute.ViewLocalHome.spec, ClientRoute.ViewLocalHome.deepLinkSpecs, null);
                                        break;
                                    case Support:
                                        viewEquities = new ClientRoute.ViewSupportChat(null, 7);
                                        break;
                                    case Tax:
                                        viewEquities = new ClientRoute.ViewDocumentCategory(ClientRoute.ViewDocumentCategory.spec, ClientRoute.ViewDocumentCategory.deepLinkSpecs, null, "category");
                                        break;
                                    case CashCard:
                                        viewEquities = new ClientRoute.ViewCard();
                                        break;
                                    case Security:
                                        viewEquities = new ClientRoute.ViewPin(ClientRoute.ViewPin.spec, ClientRoute.ViewPin.deepLinkSpecs, null);
                                        break;
                                    case Other:
                                        viewEquities = new ClientRoute.ViewPaymentPad();
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                }
                                String obj2 = viewEquities.toString();
                                RealNotificationIntentsCreator realNotificationIntentsCreator3 = realNotificationIntentsCreator;
                                Intent intent5 = new Intent(realNotificationIntentsCreator3.context, (Class<?>) MainActivity.class);
                                if (obj2 != null) {
                                    intent5.setData(Uri.fromParts("summary-id", obj2, null));
                                }
                                Intent putExtra = intent5.putExtra(str, (String) realNotificationIntentsCreator3.clientRouteFormatter.invoke(viewEquities)).putExtra("notification-channel-group", notificationChannelGroupId2.id);
                                putExtra.getClass();
                                NotificationCompat.Builder buildBasicNotification2 = realNotificationDispatcher2.buildBasicNotification(notificationChannelId, "", "");
                                buildBasicNotification2.mGroupSummary = true;
                                NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                                inboxStyle.mTexts = new ArrayList();
                                inboxStyle.setSummaryText$2(name);
                                buildBasicNotification2.setStyle(inboxStyle);
                                buildBasicNotification2.mContentIntent = PendingIntent.getActivity(context, 0, putExtra, 201326592);
                                Notification build6 = buildBasicNotification2.build();
                                build6.getClass();
                                androidNotificationManager2.notify(str11, 4, build6);
                            }
                            return Unit.INSTANCE;
                        }
                        String str12 = ((CashNotification.ClientRouteNotification.SupportPhoneVerificationNotification) cashNotification2).verificationId;
                        Notification build7 = buildBasicNotification.build();
                        build7.getClass();
                        androidNotificationManager2.notify(str12, 6, build7);
                    }
                }
                realNotificationDispatcher2 = realNotificationDispatcher;
                notificationChannelGroupId = notificationChannelId.group;
                if (notificationChannelGroupId != NotificationChannelGroupId.Payments) {
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
            identifyChannelId = obj;
        }
        notificationChannelId = (NotificationChannelId) identifyChannelId;
        String str13 = cashNotification2.title;
        str13.getClass();
        String str14 = cashNotification2.body;
        str14.getClass();
        buildBasicNotification = realNotificationDispatcher3.buildBasicNotification(notificationChannelId, str13, str14);
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.mObj1 = bitmap;
            buildBasicNotification.mLargeIcon = iconCompat;
            if (cashNotification2.imageUrl != null) {
                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                IconCompat iconCompat2 = new IconCompat(1);
                iconCompat2.mObj1 = bitmap;
                bigPictureStyle.mPictureIcon = iconCompat2;
                bigPictureStyle.mBigLargeIcon = null;
                bigPictureStyle.mBigLargeIconSet = true;
                buildBasicNotification.setStyle(bigPictureStyle);
            }
        }
        ax axVar = realNotificationIntentsCreator2.analyticsEventIntentFactory;
        if (cashNotification2 instanceof CashNotification.HomeNotification) {
            Intent createInternalIntent$default = RealNotificationIntentsCreator.createInternalIntent$default(realNotificationIntentsCreator2, "go-home");
            createInternalIntent$default.setAction("go-home");
            createInternalIntent$default.putExtra("go-home", true);
            AndroidAutofill_androidKt.access$attachCommonFields(createInternalIntent$default, cashNotification2);
            NotificationType notificationType = ((CashNotification.HomeNotification) cashNotification2).notificationType;
            Action action = Action.CONFIRMED_COMPLETE;
            cashNotificationIntents = new CashNotificationIntents(createInternalIntent$default, axVar.createIntent(notificationType));
            androidNotificationManager = androidNotificationManager3;
        } else if (cashNotification2 instanceof CashNotification.AppMessageActionNotification) {
            CashNotification.AppMessageActionNotification appMessageActionNotification = (CashNotification.AppMessageActionNotification) cashNotification2;
            AppMessageAction appMessageAction = appMessageActionNotification.appMessageAction;
            AppMessageAction.Action action2 = appMessageAction.action;
            Intent createInternalIntent$default2 = RealNotificationIntentsCreator.createInternalIntent$default(realNotificationIntentsCreator2, action2 != null ? action2.name() : null);
            androidNotificationManager = androidNotificationManager3;
            createInternalIntent$default2.setAction("do-app-message-action");
            createInternalIntent$default2.putExtra("do-app-message-action", (Parcelable) appMessageAction);
            AndroidAutofill_androidKt.access$attachCommonFields(createInternalIntent$default2, cashNotification2);
            NotificationType notificationType2 = appMessageActionNotification.notificationType;
            Action action3 = Action.CONFIRMED_COMPLETE;
            cashNotificationIntents = new CashNotificationIntents(createInternalIntent$default2, axVar.createIntent(notificationType2));
        } else {
            androidNotificationManager = androidNotificationManager3;
            if (cashNotification2 instanceof CashNotification.OpenExternalUrlNotification) {
                CashNotification.OpenExternalUrlNotification openExternalUrlNotification = (CashNotification.OpenExternalUrlNotification) cashNotification2;
                Intent createUrlIntent = realNotificationIntentsCreator2.intentFactory.createUrlIntent(openExternalUrlNotification.url);
                AndroidAutofill_androidKt.access$attachCommonFields(createUrlIntent, cashNotification2);
                NotificationType notificationType3 = openExternalUrlNotification.notificationType;
                Action action4 = Action.CONFIRMED_COMPLETE;
                cashNotificationIntents = new CashNotificationIntents(createUrlIntent, axVar.createIntent(notificationType3));
            } else if (cashNotification2 instanceof CashNotification.PaymentNotification) {
                Intent createInternalIntent$default3 = RealNotificationIntentsCreator.createInternalIntent$default(realNotificationIntentsCreator2, null);
                String str15 = ((CashNotification.PaymentNotification) cashNotification2).paymentToken;
                createInternalIntent$default3.setData(Uri.fromParts("payment", str15, null));
                createInternalIntent$default3.putExtra("payment-token", str15);
                AndroidAutofill_androidKt.access$attachCommonFields(createInternalIntent$default3, cashNotification2);
                cashNotificationIntents = new CashNotificationIntents(createInternalIntent$default3, null);
            } else if ((cashNotification2 instanceof CashNotification.PlayIntegrityDeviceChallengeNotification) || (cashNotification2 instanceof CashNotification.GetProfileNotification) || (cashNotification2 instanceof CashNotification.GetRewardsNotification) || (cashNotification2 instanceof CashNotification.PasscodeChangedNotification) || (cashNotification2 instanceof CashNotification$ClearAppDataNotification$ClearAll) || (cashNotification2 instanceof CashNotification.OtherNotification)) {
                Intent createInternalIntent$default4 = RealNotificationIntentsCreator.createInternalIntent$default(realNotificationIntentsCreator2, String.valueOf(realNotificationIntentsCreator2.clock.millis()));
                AndroidAutofill_androidKt.access$attachCommonFields(createInternalIntent$default4, cashNotification2);
                cashNotificationIntents = new CashNotificationIntents(createInternalIntent$default4, null);
            } else {
                if (!(cashNotification2 instanceof CashNotification.ClientRouteNotification)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                CashNotification.ClientRouteNotification clientRouteNotification = (CashNotification.ClientRouteNotification) cashNotification2;
                Intent createInternalIntent$default5 = RealNotificationIntentsCreator.createInternalIntent$default(realNotificationIntentsCreator2, clientRouteNotification.getClientRoute().toString());
                createInternalIntent$default5.putExtra("client-route-url", (String) realNotificationIntentsCreator2.clientRouteFormatter.invoke(clientRouteNotification.getClientRoute()));
                AndroidAutofill_androidKt.access$attachCommonFields(createInternalIntent$default5, cashNotification2);
                NotificationType notificationType4 = clientRouteNotification.getNotificationType();
                Action action5 = Action.CONFIRMED_COMPLETE;
                cashNotificationIntents = new CashNotificationIntents(createInternalIntent$default5, axVar.createIntent(notificationType4));
            }
        }
        Intent intent6 = cashNotificationIntents.content;
        if (intent6.getData() == null) {
            str = "client-route-url";
            realNotificationIntentsCreator = realNotificationIntentsCreator2;
            Timber.Forest.e(new IllegalStateException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Posting an intent for ", Reflection.factory.getOrCreateKotlinClass(cashNotification2.getClass()).getSimpleName(), " without any data.")));
        } else {
            realNotificationIntentsCreator = realNotificationIntentsCreator2;
            str = "client-route-url";
        }
        buildBasicNotification.mContentIntent = PendingIntent.getActivity(context, 0, intent6, 201326592);
        Intent intent7 = cashNotificationIntents.delete;
        if (intent7 != null) {
            buildBasicNotification.mNotification.deleteIntent = PendingIntent.getBroadcast(context, 0, intent7, 201326592);
        }
        buildBasicNotification.mPriority = cashNotification2.getPriority();
        if (!(cashNotification2 instanceof CashNotification.PaymentNotification)) {
            realNotificationDispatcher = realNotificationDispatcher3;
            if (cashNotification2 instanceof CashNotification.PaymentNotification) {
            }
            realNotificationDispatcher2 = realNotificationDispatcher;
            notificationChannelGroupId = notificationChannelId.group;
            if (notificationChannelGroupId != NotificationChannelGroupId.Payments) {
            }
            return Unit.INSTANCE;
        }
        Flow select2 = realNotificationDispatcher3.instrumentManager.select();
        this.L$0 = notificationChannelId;
        this.L$1 = buildBasicNotification;
        this.this$0 = cashNotificationIntents;
        this.label = 2;
        first = FlowKt.first(select2, this);
        if (first != coroutineSingletons) {
            notificationChannelId2 = notificationChannelId;
            builder = buildBasicNotification;
            list = (List) first;
            ChannelFlowTransformLatest select3 = realNotificationDispatcher3.balanceSnapshotManager.select();
            this.L$0 = notificationChannelId2;
            this.L$1 = builder;
            this.this$0 = cashNotificationIntents;
            this.L$2 = list;
            this.label = 3;
            first2 = FlowKt.first(select3, this);
            if (first2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new DbSessionManager$updateDb$2((DbSessionManager) this.this$0, (Function2) this.$update, (RealSessionManager.StateChangeReason) this.$stateChangeReason, continuation);
            case 1:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$2 = new DbSessionManager$updateDb$2((RealExchangeDataSyncerFactory) this.L$3, (CurrencyCode) this.$stateChangeReason, continuation, 1);
                dbSessionManager$updateDb$2.$update = obj;
                return dbSessionManager$updateDb$2;
            case 2:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$22 = new DbSessionManager$updateDb$2((RealFxExchangeRateStreamingSubscriber) this.this$0, (Map) this.L$2, (CurrencyCode) this.$update, (CurrencyCode) this.L$3, (ProducerScope) this.$stateChangeReason, continuation, 2);
                dbSessionManager$updateDb$22.L$1 = obj;
                return dbSessionManager$updateDb$22;
            case 3:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$23 = new DbSessionManager$updateDb$2((FidesmoDeprovisioningPresenter) this.this$0, (Activity) this.L$2, (CoroutineScope) this.$update, (String) this.L$3, (MutableState) this.$stateChangeReason, continuation, 3);
                dbSessionManager$updateDb$23.L$1 = obj;
                return dbSessionManager$updateDb$23;
            case 4:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$24 = new DbSessionManager$updateDb$2((FidesmoProvisioningPresenter) this.this$0, (Activity) this.L$2, (CoroutineScope) this.$update, (String) this.L$3, (MutableState) this.$stateChangeReason, continuation, 4);
                dbSessionManager$updateDb$24.L$1 = obj;
                return dbSessionManager$updateDb$24;
            case 5:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$25 = new DbSessionManager$updateDb$2((GlobalSearchActivityEventDecorator) this.L$3, (ActivityItem) this.$stateChangeReason, continuation, 5);
                dbSessionManager$updateDb$25.$update = obj;
                return dbSessionManager$updateDb$25;
            case 6:
                return new DbSessionManager$updateDb$2((TransferStockPresenter) this.L$0, (WithHoldings) this.L$1, (AmountSelection.TradeAll) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (Channel) this.$stateChangeReason, continuation, 6);
            case 7:
                return new DbSessionManager$updateDb$2((TransferStockPresenter) this.L$0, (WithHoldings) this.L$1, (MultipartBody.Companion) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (Channel) this.$stateChangeReason, continuation, 7);
            case 8:
                return new DbSessionManager$updateDb$2((TransferStockPresenter) this.L$0, (WithHoldings) this.L$1, (String) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (Channel) this.$stateChangeReason, continuation, 8);
            case 9:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$26 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (SnapshotStateMap) this.this$0, (LocalPosCheckInPresenter) this.L$2, (List) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 9);
                dbSessionManager$updateDb$26.L$0 = obj;
                return dbSessionManager$updateDb$26;
            case 10:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$27 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (CardStudioPresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableSharedFlow) this.L$3, (MutableState) this.$stateChangeReason, 10);
                dbSessionManager$updateDb$27.L$0 = obj;
                return dbSessionManager$updateDb$27;
            case 11:
                return new DbSessionManager$updateDb$2((ShareSheetPresenter) this.L$0, (MutableState) this.L$1, (MutableState) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, continuation, 11);
            case 12:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$28 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (LocalHomePresenter) this.this$0, (String) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 12);
                dbSessionManager$updateDb$28.L$0 = obj;
                return dbSessionManager$updateDb$28;
            case 13:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$29 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (CurrencyCode) this.this$0, (MoneybotAmountInputQuestion) this.L$2, (VerifyCheckDialogPresenter) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 13);
                dbSessionManager$updateDb$29.L$0 = obj;
                return dbSessionManager$updateDb$29;
            case 14:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$210 = new DbSessionManager$updateDb$2((AccountPickerPresenter$AccountRemovalStatus) this.L$1, (ValidatedAccountList) this.this$0, continuation, (TabToolbarPresenter) this.L$2, (MutableState) this.$update, (MutableState) this.L$3);
                dbSessionManager$updateDb$210.L$0 = obj;
                return dbSessionManager$updateDb$210;
            case 15:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$211 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (LocalCashBalancePresenter) this.this$0, (MutableState) this.L$2, (CoroutineScope) this.$update, (State) this.L$3, (State) this.$stateChangeReason, 15);
                dbSessionManager$updateDb$211.L$0 = obj;
                return dbSessionManager$updateDb$211;
            case 16:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$212 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (WorkHomePresenter) this.this$0, (MutableState) this.L$2, (State) this.$update, (MutableState) this.L$3, (ParcelableSnapshotMutableIntState) this.$stateChangeReason, 16);
                dbSessionManager$updateDb$212.L$0 = obj;
                return dbSessionManager$updateDb$212;
            case 17:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$213 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (LocalCashBalancePresenter) this.this$0, (EditDistributionConfiguration.DestinationUiConfiguration) this.L$2, (MutableFloatState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 17);
                dbSessionManager$updateDb$213.L$0 = obj;
                return dbSessionManager$updateDb$213;
            case 18:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$214 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (MainPaymentPadPresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (State) this.$stateChangeReason, 18);
                dbSessionManager$updateDb$214.L$0 = obj;
                return dbSessionManager$updateDb$214;
            case 19:
                return new DbSessionManager$updateDb$2((String) this.L$0, (Recipient) this.L$1, (MainPaymentViewEvent) this.this$0, (MainPaymentPresenter) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (State) this.$stateChangeReason, continuation, 19);
            case 20:
                return new DbSessionManager$updateDb$2((MainPaymentPresenter) this.L$0, (PaymentInitiatorData) this.L$1, (List) this.this$0, (BalanceSnapshot) this.L$2, (List) this.$update, (InstrumentLinkingConfig) this.L$3, (InstrumentSelection) this.$stateChangeReason, continuation, 20);
            case 21:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$215 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (CardLockPresenter) this.this$0, (SnapshotStateList) this.L$2, (MutableState) this.$update, (State) this.L$3, (MutableState) this.$stateChangeReason, 21);
                dbSessionManager$updateDb$215.L$0 = obj;
                return dbSessionManager$updateDb$215;
            case 22:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$216 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (LocalPosLocalCashRedemptionPresenter) this.this$0, (String) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 22);
                dbSessionManager$updateDb$216.L$0 = obj;
                return dbSessionManager$updateDb$216;
            case 23:
                return new DbSessionManager$updateDb$2((PrepurchaseCashCardPlanningViewModel.ButtonAction) this.L$0, (LocalEditorialPresenter) this.L$1, (PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent) this.this$0, (Back) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, continuation, 23);
            case 24:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$217 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (PoolsListPresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 24);
                dbSessionManager$updateDb$217.L$0 = obj;
                return dbSessionManager$updateDb$217;
            case 25:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$218 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (WorkHomePresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 25);
                dbSessionManager$updateDb$218.L$0 = obj;
                return dbSessionManager$updateDb$218;
            case 26:
                return new DbSessionManager$updateDb$2((CardLockPresenter) this.$update, (ParcelableSnapshotMutableIntState) this.L$3, (MutableState) this.$stateChangeReason, continuation, 26);
            case 27:
                DbSessionManager$updateDb$2 dbSessionManager$updateDb$219 = new DbSessionManager$updateDb$2((Flow) this.L$1, continuation, (ScheduledReloadConfirmationPresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 27);
                dbSessionManager$updateDb$219.L$0 = obj;
                return dbSessionManager$updateDb$219;
            case 28:
                return new DbSessionManager$updateDb$2((RealNotificationDispatcher) this.$update, (CashNotification) this.L$3, (Bitmap) this.$stateChangeReason, continuation, 28);
            default:
                return new DbSessionManager$updateDb$2((CardSchemePresenter) this.L$0, (MutableState) this.L$1, (MutableState) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (State) this.$stateChangeReason, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 2:
                ((DbSessionManager$updateDb$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((DbSessionManager$updateDb$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x024f, code lost:
    
        if (r1 == r2) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0287, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r1, r4, r28) == r2) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03f7, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r0).collect(r13, r28) == r2) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03c4, code lost:
    
        if (r0 == r2) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x063a, code lost:
    
        if (r5 == r13) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x06c3, code lost:
    
        if (r0.submitViewItemEvent(r1, r2, r3, "ACTIVITY", null, r28) == r13) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0774, code lost:
    
        if (r1 == r8) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x072d, code lost:
    
        if (r1 == r8) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0801, code lost:
    
        if (r1 == r6) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x07dd, code lost:
    
        if (r1 == r6) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x08ed, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r5, r28) == r15) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0916, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r5, r28) == r15) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0906, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r0)._channel.send(null, r28) != r15) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x09e9, code lost:
    
        if (r4 == r3) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0a6f, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r9, r28) != r3) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x09af, code lost:
    
        if (r2.emit(r5, r28) == r3) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x09c4, code lost:
    
        if (r2.emit(r4, r28) == r3) goto L382;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08b4 A[Catch: Exception -> 0x08f5, CancellationException -> 0x091a, TryCatch #3 {CancellationException -> 0x091a, Exception -> 0x08f5, blocks: (B:340:0x0859, B:345:0x0899, B:346:0x089f, B:349:0x08ac, B:351:0x08b4, B:353:0x08c0, B:356:0x08dd, B:362:0x0839, B:364:0x0842, B:366:0x084a, B:367:0x0850), top: B:334:0x0827 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08dd A[Catch: Exception -> 0x08f5, CancellationException -> 0x091a, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x091a, Exception -> 0x08f5, blocks: (B:340:0x0859, B:345:0x0899, B:346:0x089f, B:349:0x08ac, B:351:0x08b4, B:353:0x08c0, B:356:0x08dd, B:362:0x0839, B:364:0x0842, B:366:0x084a, B:367:0x0850), top: B:334:0x0827 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x09f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:309:0x08be -> B:303:0x089f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:311:0x08da -> B:303:0x089f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:314:0x08ed -> B:297:0x08f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:318:0x0916 -> B:297:0x08f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:355:0x0a6f -> B:342:0x09c8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DbSessionManager dbSessionManager;
        MutexImpl mutexImpl;
        Function2 function2;
        RealSessionManager.StateChangeReason stateChangeReason;
        CurrencyCode currencyCode;
        RealExchangeDataSyncerFactory realExchangeDataSyncerFactory;
        ExchangeData exchangeData;
        Object obj2;
        ApiResult apiResult;
        Object obj3;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        Object obj4;
        Object activationData;
        Object access$startDeprovisioningFlow;
        Object activationData2;
        FidesmoServiceType fidesmoServiceType;
        Object startProvisioningFlow;
        GlobalSearchAnalyticsContext$Item item;
        Analytics analytics;
        Object sharedPreference;
        Object sharedPreference2;
        Analytics analytics2;
        String str;
        GlobalSearchAnalyticsContext$Item globalSearchAnalyticsContext$Item;
        Object sharedPreference3;
        String str2;
        String str3;
        Object flowOn;
        AccountPickerPresenter$AccountRemovalStatus accountPickerPresenter$AccountRemovalStatus;
        Object access$removeAccount;
        int i = this.$r8$classId;
        UserJourney$Friction$CashTagProvisioning$NfcScanRetry userJourney$Friction$CashTagProvisioning$NfcScanRetry = UserJourney$Friction$CashTagProvisioning$NfcScanRetry.INSTANCE;
        FidesmoDeviceState.Disconnected disconnected = FidesmoDeviceState.Disconnected.INSTANCE;
        int i2 = 8;
        int i3 = 0;
        int i4 = 5;
        int i5 = 3;
        int i6 = 4;
        int i7 = 2;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                try {
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        dbSessionManager = (DbSessionManager) this.this$0;
                        mutexImpl = dbSessionManager.dbSessionStateLock;
                        function2 = (Function2) this.$update;
                        RealSessionManager.StateChangeReason stateChangeReason2 = (RealSessionManager.StateChangeReason) this.$stateChangeReason;
                        this.L$0 = mutexImpl;
                        this.L$1 = dbSessionManager;
                        this.L$2 = function2;
                        this.L$3 = stateChangeReason2;
                        this.label = 1;
                        if (mutexImpl.lock(this) != obj5) {
                            stateChangeReason = stateChangeReason2;
                        }
                        return obj5;
                    }
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stateChangeReason = (RealSessionManager.StateChangeReason) this.L$3;
                    function2 = (Function2) this.L$2;
                    dbSessionManager = (DbSessionManager) this.L$1;
                    mutexImpl = (MutexImpl) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    obj5 = (Boolean) TransactorKt.transactionWithResult$default(dbSessionManager.sessionQueries, new CardTransitionKt$$ExternalSyntheticLambda4(i2, dbSessionManager, function2, stateChangeReason));
                    obj5.getClass();
                    return obj5;
                } finally {
                    mutexImpl.unlock(null);
                }
            case 1:
                CurrencyCode currencyCode2 = (CurrencyCode) this.$stateChangeReason;
                RealExchangeDataSyncerFactory realExchangeDataSyncerFactory2 = (RealExchangeDataSyncerFactory) this.L$3;
                FlowCollector flowCollector = (FlowCollector) this.$update;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GpsConfigQueries gpsConfigQueries = realExchangeDataSyncerFactory2.queries;
                    CurrencyCode currencyCode3 = CurrencyCode.BTC;
                    gpsConfigQueries.getClass();
                    currencyCode2.getClass();
                    currencyCode3.getClass();
                    ExchangeDataQueries$exchangeRates$2 exchangeDataQueries$exchangeRates$2 = ExchangeDataQueries$exchangeRates$2.INSTANCE;
                    Exchange_data exchange_data = (Exchange_data) new BadgeQueries$VersionQuery(gpsConfigQueries, currencyCode2, currencyCode3, new ForwardingFileSystem$$ExternalSyntheticLambda0(gpsConfigQueries)).executeAsOneOrNull();
                    if (exchange_data == null) {
                        ExchangeData exchangeData2 = new ExchangeData((CurrencyCode) null, (List) null, 7);
                        this.$update = flowCollector;
                        this.L$0 = null;
                        this.label = 2;
                        break;
                    } else {
                        ExchangeData exchangeData3 = new ExchangeData(exchange_data.base_currency_code, exchange_data.rates, 4);
                        this.$update = flowCollector;
                        this.L$0 = null;
                        this.label = 1;
                        break;
                    }
                    apiResult = (ApiResult) obj2;
                    if (apiResult instanceof ApiResult.Success) {
                    }
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                    this.$update = flowCollector;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.this$0 = null;
                    this.L$2 = null;
                    this.label = 5;
                } else if (i9 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i9 == 2) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i9 == 3) {
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                    apiResult = (ApiResult) obj2;
                    if (apiResult instanceof ApiResult.Success) {
                        ApiResult.Success success = (ApiResult.Success) apiResult;
                        exchangeData = ((GetExchangeDataResponse) success.response).exchange_data;
                        if (exchangeData != null) {
                            this.$update = flowCollector;
                            this.L$0 = success;
                            this.L$1 = realExchangeDataSyncerFactory2;
                            this.this$0 = currencyCode2;
                            this.L$2 = exchangeData;
                            this.label = 4;
                            if (flowCollector.emit(exchangeData, this) != coroutineSingletons) {
                                currencyCode = currencyCode2;
                                realExchangeDataSyncerFactory = realExchangeDataSyncerFactory2;
                                GpsConfigQueries gpsConfigQueries2 = realExchangeDataSyncerFactory.queries;
                                CurrencyCode currencyCode4 = CurrencyCode.BTC;
                                List list = exchangeData.rates;
                                long millis = realExchangeDataSyncerFactory.clock.millis();
                                gpsConfigQueries2.getClass();
                                currencyCode.getClass();
                                currencyCode4.getClass();
                                list.getClass();
                                gpsConfigQueries2.driver.execute(514271897, "INSERT OR REPLACE INTO exchange_data\nVALUES (?, ?, ?, ?)", new BadgeQueries$$ExternalSyntheticLambda3(gpsConfigQueries2, currencyCode, currencyCode4, list, millis, 7));
                                gpsConfigQueries2.notifyQueries(514271897, new InstantKt$$ExternalSyntheticLambda0(16));
                                Duration.Companion companion2 = Duration.Companion;
                                long duration2 = DurationKt.toDuration(5, DurationUnit.SECONDS);
                                this.$update = flowCollector;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.this$0 = null;
                                this.L$2 = null;
                                this.label = 5;
                            }
                            return coroutineSingletons;
                        }
                    }
                    Duration.Companion companion22 = Duration.Companion;
                    long duration22 = DurationKt.toDuration(5, DurationUnit.SECONDS);
                    this.$update = flowCollector;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.this$0 = null;
                    this.L$2 = null;
                    this.label = 5;
                } else if (i9 == 4) {
                    ExchangeData exchangeData4 = (ExchangeData) this.L$2;
                    CurrencyCode currencyCode5 = (CurrencyCode) this.this$0;
                    realExchangeDataSyncerFactory = (RealExchangeDataSyncerFactory) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    currencyCode = currencyCode5;
                    exchangeData = exchangeData4;
                    GpsConfigQueries gpsConfigQueries22 = realExchangeDataSyncerFactory.queries;
                    CurrencyCode currencyCode42 = CurrencyCode.BTC;
                    List list2 = exchangeData.rates;
                    long millis2 = realExchangeDataSyncerFactory.clock.millis();
                    gpsConfigQueries22.getClass();
                    currencyCode.getClass();
                    currencyCode42.getClass();
                    list2.getClass();
                    gpsConfigQueries22.driver.execute(514271897, "INSERT OR REPLACE INTO exchange_data\nVALUES (?, ?, ?, ?)", new BadgeQueries$$ExternalSyntheticLambda3(gpsConfigQueries22, currencyCode, currencyCode42, list2, millis2, 7));
                    gpsConfigQueries22.notifyQueries(514271897, new InstantKt$$ExternalSyntheticLambda0(16));
                    Duration.Companion companion222 = Duration.Companion;
                    long duration222 = DurationKt.toDuration(5, DurationUnit.SECONDS);
                    this.$update = flowCollector;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.this$0 = null;
                    this.L$2 = null;
                    this.label = 5;
                    break;
                } else {
                    if (i9 != 5) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (!JobKt.isActive(getContext())) {
                    return Unit.INSTANCE;
                }
                AppService appService = realExchangeDataSyncerFactory2.appService;
                GetExchangeDataRequest getExchangeDataRequest = new GetExchangeDataRequest(currencyCode2, EmptyList.INSTANCE, ByteString.EMPTY);
                this.$update = flowCollector;
                this.L$0 = null;
                this.label = 3;
                obj2 = appService.getExchangeData(getExchangeDataRequest, this);
                break;
            case 2:
                ProducerScope producerScope = (ProducerScope) this.$stateChangeReason;
                CurrencyCode currencyCode6 = (CurrencyCode) this.L$3;
                CurrencyCode currencyCode7 = (CurrencyCode) this.$update;
                RealFxExchangeRateStreamingSubscriber realFxExchangeRateStreamingSubscriber = (RealFxExchangeRateStreamingSubscriber) this.this$0;
                MediaLoadData mediaLoadData = realFxExchangeRateStreamingSubscriber.exponentialBackoff;
                CoroutineScope coroutineScope = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    this.L$1 = coroutineScope;
                    this.L$0 = null;
                    this.label = 5;
                    break;
                }
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        o0 asGrpcServerStreamingCall = zzmn.asGrpcServerStreamingCall(new RealGrpcStreamingCall((WireGrpcClient) ((GrpcFxRatesStreamingServiceClient) realFxExchangeRateStreamingSubscriber.fxRatesStreamingClient.getValue()).client, new GrpcMethod("/squareup.cash.fx.service.FxRatesStreamingService/StreamExchangeRate", StreamExchangeRateRequest.ADAPTER, StreamExchangeRateResponse.ADAPTER)));
                        Map map = (Map) this.L$2;
                        map.getClass();
                        ((RealGrpcStreamingCall) asGrpcServerStreamingCall.a).requestMetadata = map;
                        StreamExchangeRateRequest streamExchangeRateRequest = new StreamExchangeRateRequest(currencyCode7, currencyCode6, ByteString.EMPTY);
                        this.L$1 = coroutineScope;
                        this.label = 1;
                        obj4 = asGrpcServerStreamingCall.executeIn(coroutineScope, streamExchangeRateRequest, this);
                        if (obj4 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        bufferedChannelIterator = ((ReceiveChannel) obj4).iterator();
                        this.L$1 = coroutineScope;
                        this.L$0 = bufferedChannelIterator;
                        this.label = 2;
                        obj3 = bufferedChannelIterator.hasNext(this);
                        if (obj3 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            CacheNetworkResponse cacheNetworkResponse = ((StreamExchangeRateResponse) bufferedChannelIterator.next()).f1263type;
                            if (cacheNetworkResponse instanceof StreamExchangeRateResponse$Type$Update) {
                                mediaLoadData.trackType = 0;
                                FxExchangeRate access$toFxExchangeRate = RealFxExchangeRateStreamingSubscriber.access$toFxExchangeRate(realFxExchangeRateStreamingSubscriber, ((StreamExchangeRateResponse$Type$Update) cacheNetworkResponse).value, currencyCode7, currencyCode6);
                                this.L$1 = coroutineScope;
                                this.L$0 = bufferedChannelIterator;
                                this.label = 3;
                                if (((ProducerCoroutine) producerScope)._channel.send(access$toFxExchangeRate, this) == coroutineSingletons2) {
                                }
                            }
                            this.L$1 = coroutineScope;
                            this.L$0 = bufferedChannelIterator;
                            this.label = 2;
                            obj3 = bufferedChannelIterator.hasNext(this);
                            if (obj3 == coroutineSingletons2) {
                            }
                            if (((Boolean) obj3).booleanValue()) {
                                long m1145nextDelayUwyO8pc = mediaLoadData.m1145nextDelayUwyO8pc();
                                this.L$1 = coroutineScope;
                                this.L$0 = null;
                                this.label = 4;
                                break;
                            }
                        }
                        return coroutineSingletons2;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        obj4 = obj;
                        bufferedChannelIterator = ((ReceiveChannel) obj4).iterator();
                        this.L$1 = coroutineScope;
                        this.L$0 = bufferedChannelIterator;
                        this.label = 2;
                        obj3 = bufferedChannelIterator.hasNext(this);
                        if (obj3 == coroutineSingletons2) {
                        }
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        return coroutineSingletons2;
                    case 2:
                        bufferedChannelIterator = (BufferedChannel.BufferedChannelIterator) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        obj3 = obj;
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        return coroutineSingletons2;
                    case 3:
                        bufferedChannelIterator = (BufferedChannel.BufferedChannelIterator) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        this.L$1 = coroutineScope;
                        this.L$0 = bufferedChannelIterator;
                        this.label = 2;
                        obj3 = bufferedChannelIterator.hasNext(this);
                        if (obj3 == coroutineSingletons2) {
                        }
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        return coroutineSingletons2;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        o0 asGrpcServerStreamingCall2 = zzmn.asGrpcServerStreamingCall(new RealGrpcStreamingCall((WireGrpcClient) ((GrpcFxRatesStreamingServiceClient) realFxExchangeRateStreamingSubscriber.fxRatesStreamingClient.getValue()).client, new GrpcMethod("/squareup.cash.fx.service.FxRatesStreamingService/StreamExchangeRate", StreamExchangeRateRequest.ADAPTER, StreamExchangeRateResponse.ADAPTER)));
                        Map map2 = (Map) this.L$2;
                        map2.getClass();
                        ((RealGrpcStreamingCall) asGrpcServerStreamingCall2.a).requestMetadata = map2;
                        StreamExchangeRateRequest streamExchangeRateRequest2 = new StreamExchangeRateRequest(currencyCode7, currencyCode6, ByteString.EMPTY);
                        this.L$1 = coroutineScope;
                        this.label = 1;
                        obj4 = asGrpcServerStreamingCall2.executeIn(coroutineScope, streamExchangeRateRequest2, this);
                        if (obj4 == coroutineSingletons2) {
                        }
                        bufferedChannelIterator = ((ReceiveChannel) obj4).iterator();
                        this.L$1 = coroutineScope;
                        this.L$0 = bufferedChannelIterator;
                        this.label = 2;
                        obj3 = bufferedChannelIterator.hasNext(this);
                        if (obj3 == coroutineSingletons2) {
                        }
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        return coroutineSingletons2;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        long m1145nextDelayUwyO8pc2 = mediaLoadData.m1145nextDelayUwyO8pc();
                        this.L$1 = coroutineScope;
                        this.label = 6;
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        o0 asGrpcServerStreamingCall22 = zzmn.asGrpcServerStreamingCall(new RealGrpcStreamingCall((WireGrpcClient) ((GrpcFxRatesStreamingServiceClient) realFxExchangeRateStreamingSubscriber.fxRatesStreamingClient.getValue()).client, new GrpcMethod("/squareup.cash.fx.service.FxRatesStreamingService/StreamExchangeRate", StreamExchangeRateRequest.ADAPTER, StreamExchangeRateResponse.ADAPTER)));
                        Map map22 = (Map) this.L$2;
                        map22.getClass();
                        ((RealGrpcStreamingCall) asGrpcServerStreamingCall22.a).requestMetadata = map22;
                        StreamExchangeRateRequest streamExchangeRateRequest22 = new StreamExchangeRateRequest(currencyCode7, currencyCode6, ByteString.EMPTY);
                        this.L$1 = coroutineScope;
                        this.label = 1;
                        obj4 = asGrpcServerStreamingCall22.executeIn(coroutineScope, streamExchangeRateRequest22, this);
                        if (obj4 == coroutineSingletons2) {
                        }
                        bufferedChannelIterator = ((ReceiveChannel) obj4).iterator();
                        this.L$1 = coroutineScope;
                        this.L$0 = bufferedChannelIterator;
                        this.label = 2;
                        obj3 = bufferedChannelIterator.hasNext(this);
                        if (obj3 == coroutineSingletons2) {
                        }
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        return coroutineSingletons2;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 3:
                MutableState mutableState = (MutableState) this.$stateChangeReason;
                FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter = (FidesmoDeprovisioningPresenter) this.this$0;
                FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoDeprovisioningPresenter.flowContext;
                FidesmoDeviceState fidesmoDeviceState = (FidesmoDeviceState) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(fidesmoDeviceState, disconnected)) {
                        int i11 = fidesmoDeprovisioningPresenter.scanAttempts + 1;
                        fidesmoDeprovisioningPresenter.scanAttempts = i11;
                        if (i11 > 1) {
                            ((RealUserJourneyTracker) fidesmoDeprovisioningPresenter.userJourneyTracker).addFrictionSignal(fidesmoDeprovisioningPresenter.journeyName, userJourney$Friction$CashTagProvisioning$NfcScanRetry);
                        }
                        fidesmoProvisioningFlowContext.logNfcScanStarted();
                        FidesmoClient fidesmoClient = fidesmoDeprovisioningPresenter.fidesmoClient;
                        Activity activity = (Activity) this.L$2;
                        this.L$1 = null;
                        this.label = 1;
                        activationData = ((RealFidesmoClient) fidesmoClient).getActivationData(activity, this);
                        break;
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableState = (MutableState) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        access$startDeprovisioningFlow = obj;
                        mutableState.setValue((FidesmoDeprovisioningPresenter.DeprovisionPhase) access$startDeprovisioningFlow);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    activationData = obj;
                }
                FidesmoActivationData fidesmoActivationData = (FidesmoActivationData) activationData;
                if (fidesmoActivationData != null) {
                    fidesmoProvisioningFlowContext.logNfcScanCompleted(fidesmoActivationData.installedAppsCount, fidesmoActivationData.fidesmoId);
                    mutableState.setValue(FidesmoDeprovisioningPresenter.DeprovisionPhase.FetchingResetInputs.INSTANCE);
                    String str4 = (String) this.L$3;
                    this.L$1 = null;
                    this.L$0 = mutableState;
                    this.label = 2;
                    access$startDeprovisioningFlow = FidesmoDeprovisioningPresenter.access$startDeprovisioningFlow(fidesmoDeprovisioningPresenter, fidesmoActivationData, str4, this);
                    break;
                } else {
                    return Unit.INSTANCE;
                }
            case 4:
                MutableState mutableState2 = (MutableState) this.$stateChangeReason;
                FidesmoProvisioningPresenter fidesmoProvisioningPresenter = (FidesmoProvisioningPresenter) this.this$0;
                FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext2 = fidesmoProvisioningPresenter.flowContext;
                FidesmoDeviceState fidesmoDeviceState2 = (FidesmoDeviceState) this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(FidesmoProvisioningPresenter.ActivationPhase.Activating.INSTANCE);
                    if (!Intrinsics.areEqual(fidesmoDeviceState2, disconnected)) {
                        int i13 = fidesmoProvisioningPresenter.scanAttempts + 1;
                        fidesmoProvisioningPresenter.scanAttempts = i13;
                        if (i13 > 1) {
                            ((RealUserJourneyTracker) fidesmoProvisioningPresenter.userJourneyTracker).addFrictionSignal(fidesmoProvisioningPresenter.journeyName, userJourney$Friction$CashTagProvisioning$NfcScanRetry);
                        }
                        fidesmoProvisioningFlowContext2.logNfcScanStarted();
                        FidesmoClient fidesmoClient2 = fidesmoProvisioningPresenter.fidesmoClient;
                        Activity activity2 = (Activity) this.L$2;
                        this.L$1 = null;
                        this.label = 1;
                        activationData2 = ((RealFidesmoClient) fidesmoClient2).getActivationData(activity2, this);
                        break;
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableState2 = (MutableState) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        startProvisioningFlow = obj;
                        mutableState2.setValue((FidesmoProvisioningPresenter.ActivationPhase) startProvisioningFlow);
                        fidesmoProvisioningPresenter.isActivationRequestInFlight = false;
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    activationData2 = obj;
                }
                FidesmoActivationData fidesmoActivationData2 = (FidesmoActivationData) activationData2;
                if (fidesmoActivationData2 != null) {
                    fidesmoProvisioningFlowContext2.logNfcScanCompleted(fidesmoActivationData2.installedAppsCount, fidesmoActivationData2.fidesmoId);
                    fidesmoProvisioningPresenter.isActivationRequestInFlight = true;
                    String str5 = (String) this.L$3;
                    this.L$1 = null;
                    this.L$0 = mutableState2;
                    this.label = 2;
                    int ordinal = fidesmoProvisioningPresenter.args.flowType.ordinal();
                    if (ordinal == 0) {
                        fidesmoServiceType = FidesmoServiceType.INSTALL;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        fidesmoServiceType = FidesmoServiceType.UNINSTALL;
                    }
                    int ordinal2 = fidesmoServiceType.ordinal();
                    if (ordinal2 == 0) {
                        startProvisioningFlow = fidesmoProvisioningPresenter.startProvisioningFlow(fidesmoActivationData2, str5, this);
                        break;
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        startProvisioningFlow = fidesmoProvisioningPresenter.startDeprovisioningFlow$1(fidesmoActivationData2, str5, this);
                        break;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            case 5:
                ActivityItem activityItem = (ActivityItem) this.$stateChangeReason;
                GlobalSearchActivityEventDecorator globalSearchActivityEventDecorator = (GlobalSearchActivityEventDecorator) this.L$3;
                RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = globalSearchActivityEventDecorator.analyticsHelper;
                ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) this.$update;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (activityItemCallbackEvent != ActivityItemCallbackEvent.AnalyticsEvent.ItemTapped) {
                        if (activityItemCallbackEvent == ActivityItemCallbackEvent.AnalyticsEvent.ItemViewed) {
                            SearchOrigin searchOrigin = globalSearchActivityEventDecorator.searchOrigin;
                            String rowId = activityItem.getRowId();
                            String itemId = ActivityItemKt.getItemId(activityItem);
                            this.$update = null;
                            this.label = 4;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    item = globalSearchActivityEventDecorator.analyticsContext.getItem(activityItem.getRowId());
                    analytics = globalSearchActivityEventDecorator.analytics;
                    this.$update = null;
                    this.L$0 = item;
                    this.L$1 = analytics;
                    this.label = 1;
                    sharedPreference = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_FLOW_TOKEN", this);
                    break;
                    return coroutineSingletons5;
                }
                if (i14 == 1) {
                    analytics = (Analytics) this.L$1;
                    item = (GlobalSearchAnalyticsContext$Item) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    sharedPreference = obj;
                    String str6 = (String) sharedPreference;
                    this.$update = null;
                    this.L$0 = item;
                    this.L$1 = analytics;
                    this.this$0 = str6;
                    this.label = 2;
                    sharedPreference2 = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_EXTERNAL_ID", this);
                    if (sharedPreference2 != coroutineSingletons5) {
                        GlobalSearchAnalyticsContext$Item globalSearchAnalyticsContext$Item2 = item;
                        analytics2 = analytics;
                        str = str6;
                        globalSearchAnalyticsContext$Item = globalSearchAnalyticsContext$Item2;
                        String str7 = (String) sharedPreference2;
                        this.$update = null;
                        this.L$0 = globalSearchAnalyticsContext$Item;
                        this.L$1 = analytics2;
                        this.this$0 = str;
                        this.L$2 = str7;
                        this.label = 3;
                        sharedPreference3 = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", this);
                        if (sharedPreference3 != coroutineSingletons5) {
                        }
                    }
                    return coroutineSingletons5;
                }
                if (i14 == 2) {
                    str = (String) this.this$0;
                    analytics2 = (Analytics) this.L$1;
                    globalSearchAnalyticsContext$Item = (GlobalSearchAnalyticsContext$Item) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    sharedPreference2 = obj;
                    String str72 = (String) sharedPreference2;
                    this.$update = null;
                    this.L$0 = globalSearchAnalyticsContext$Item;
                    this.L$1 = analytics2;
                    this.this$0 = str;
                    this.L$2 = str72;
                    this.label = 3;
                    sharedPreference3 = realGlobalSearchAnalyticsHelper.getSharedPreference("GLOBAL_SEARCH_QUERY_TOKEN", this);
                    if (sharedPreference3 != coroutineSingletons5) {
                        str2 = str72;
                    }
                    return coroutineSingletons5;
                }
                if (i14 != 3) {
                    if (i14 == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str8 = (String) this.L$2;
                str = (String) this.this$0;
                analytics2 = (Analytics) this.L$1;
                globalSearchAnalyticsContext$Item = (GlobalSearchAnalyticsContext$Item) this.L$0;
                SafeTrace.throwOnFailure(obj);
                str2 = str8;
                sharedPreference3 = obj;
                analytics2.track(new GlobalSearchSelectItem(str, str2, (String) sharedPreference3, globalSearchActivityEventDecorator.searchOrigin, ActivityItemKt.getItemId(activityItem), globalSearchAnalyticsContext$Item != null ? new Integer(globalSearchAnalyticsContext$Item.absoluteItemIndex) : null, globalSearchAnalyticsContext$Item != null ? new Integer(globalSearchAnalyticsContext$Item.sectionIndex) : null, TapTarget.RESULT_ROW, 512), null);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransferStockPresenter transferStockPresenter = (TransferStockPresenter) this.L$0;
                    WithHoldings withHoldings = (WithHoldings) this.L$1;
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) ((MutableState) this.L$2).getValue();
                    balanceSnapshot.getClass();
                    String str9 = balanceSnapshot.token;
                    TradeEvent$TransferAllShares tradeEvent$TransferAllShares = new TradeEvent$TransferAllShares(((AmountSelection.TradeAll) this.this$0).shareUnits);
                    AmountSheetSavedState amountSheetSavedState = (AmountSheetSavedState) ((MutableState) this.$update).getValue();
                    CaptureCheckFaceKt$$ExternalSyntheticLambda5 captureCheckFaceKt$$ExternalSyntheticLambda5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(29, (MutableState) this.L$3);
                    TransferStockPresenter$models$3$1$2 transferStockPresenter$models$3$1$2 = new TransferStockPresenter$models$3$1$2((Channel) this.$stateChangeReason, continuation, i3);
                    this.label = 1;
                    if (TransferStockPresenter.access$handleTradeEvent(transferStockPresenter, withHoldings, str9, tradeEvent$TransferAllShares, amountSheetSavedState, captureCheckFaceKt$$ExternalSyntheticLambda5, transferStockPresenter$models$3$1$2, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransferStockPresenter transferStockPresenter2 = (TransferStockPresenter) this.L$0;
                    WithHoldings withHoldings2 = (WithHoldings) this.L$1;
                    BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) ((MutableState) this.L$2).getValue();
                    if (balanceSnapshot2 == null || (str3 = balanceSnapshot2.token) == null) {
                        return Unit.INSTANCE;
                    }
                    MultipartBody.Companion companion3 = (MultipartBody.Companion) this.this$0;
                    AmountSheetSavedState amountSheetSavedState2 = (AmountSheetSavedState) ((MutableState) this.$update).getValue();
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(25, (MutableState) this.L$3);
                    TransferStockPresenter$models$3$1$2 transferStockPresenter$models$3$1$22 = new TransferStockPresenter$models$3$1$2((Channel) this.$stateChangeReason, continuation, i5);
                    this.label = 1;
                    if (TransferStockPresenter.access$handleTradeEvent(transferStockPresenter2, withHoldings2, str3, companion3, amountSheetSavedState2, realBrandFollowPresenter$models$2$1$1, transferStockPresenter$models$3$1$22, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransferStockPresenter transferStockPresenter3 = (TransferStockPresenter) this.L$0;
                    WithHoldings withHoldings3 = (WithHoldings) this.L$1;
                    BalanceSnapshot balanceSnapshot3 = (BalanceSnapshot) ((MutableState) this.L$2).getValue();
                    balanceSnapshot3.getClass();
                    String str10 = balanceSnapshot3.token;
                    TradeEvent$TransferAllShares tradeEvent$TransferAllShares2 = new TradeEvent$TransferAllShares((String) this.this$0);
                    AmountSheetSavedState amountSheetSavedState3 = (AmountSheetSavedState) ((MutableState) this.$update).getValue();
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12 = new RealBrandFollowPresenter$models$2$1$1(26, (MutableState) this.L$3);
                    TransferStockPresenter$models$3$1$2 transferStockPresenter$models$3$1$23 = new TransferStockPresenter$models$3$1$2((Channel) this.$stateChangeReason, continuation, i6);
                    this.label = 1;
                    if (TransferStockPresenter.access$handleTradeEvent(transferStockPresenter3, withHoldings3, str10, tradeEvent$TransferAllShares2, amountSheetSavedState3, realBrandFollowPresenter$models$2$1$12, transferStockPresenter$models$3$1$23, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$1;
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope2, (SnapshotStateMap) this.this$0, (LocalPosCheckInPresenter) this.L$2, (List) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$1;
                    ZiplineLoader$load$2.AnonymousClass1 anonymousClass1 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope3, (CardStudioPresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableSharedFlow) this.L$3, (MutableState) this.$stateChangeReason, 8);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(anonymousClass1, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.L$0;
                MerchantScreen$MerchantProfileScreen merchantScreen$MerchantProfileScreen = (MerchantScreen$MerchantProfileScreen) shareSheetPresenter.shareTargetsManager;
                MutableState mutableState3 = (MutableState) this.L$1;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState3.setValue(MerchantProfilePresenter$State.copy$default((MerchantProfilePresenter$State) mutableState3.getValue(), ((MerchantProfilePresenter$State) mutableState3.getValue()).headerState instanceof Loadable.Loaded ? ((MerchantProfilePresenter$State) mutableState3.getValue()).headerState : Loadable.Loading.INSTANCE, GenericTreeElementsViewModel.Loading.INSTANCE, null, null, 12));
                    EglCore eglCore = (EglCore) shareSheetPresenter.stringManager;
                    String str11 = (String) merchantScreen$MerchantProfileScreen.merchantOrBrandToken.getValue();
                    GetProfileDetailsContext getProfileDetailsContext = merchantScreen$MerchantProfileScreen.originContext;
                    String str12 = merchantScreen$MerchantProfileScreen.genericElementsContext;
                    this.label = 1;
                    flowOn = FlowKt.flowOn(new SafeFlow(new AnimationsKt$takeUntil$1$1(eglCore, str11, getProfileDetailsContext, str12, (Continuation) null, 19)), (CoroutineContext) eglCore.eglContext);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    flowOn = obj;
                }
                MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$1 = new MerchantProfilePresenter$models$2$1$1(shareSheetPresenter, (MutableState) this.L$1, (MutableState) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason);
                this.label = 2;
                break;
            case 12:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$1;
                    ZiplineLoader$load$2.AnonymousClass1 anonymousClass12 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope4, (MoleculePresenter) this.this$0, (String) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 10);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(anonymousClass12, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.L$1;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$1 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope5, (CurrencyCode) this.this$0, (MoneybotAmountInputQuestion) this.L$2, (VerifyCheckDialogPresenter) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(cardSchemePresenter$toHeroModule$3$1$1, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                MutableState mutableState4 = (MutableState) this.L$3;
                TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) this.L$2;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    accountPickerPresenter$AccountRemovalStatus = (AccountPickerPresenter$AccountRemovalStatus) this.L$1;
                    ValidatedAccountList validatedAccountList = (ValidatedAccountList) this.this$0;
                    if (!(accountPickerPresenter$AccountRemovalStatus instanceof AccountPickerPresenter$AccountRemovalStatus.Requested)) {
                        if (accountPickerPresenter$AccountRemovalStatus instanceof AccountPickerPresenter$AccountRemovalStatus.InProgress) {
                            AccountPickerPresenter$AccountRemovalStatus.InProgress inProgress = (AccountPickerPresenter$AccountRemovalStatus.InProgress) accountPickerPresenter$AccountRemovalStatus;
                            String str13 = inProgress.accountToken;
                            this.L$0 = null;
                            this.$stateChangeReason = inProgress;
                            this.label = 1;
                            access$removeAccount = TabToolbarPresenter.access$removeAccount(tabToolbarPresenter, str13, this);
                            break;
                        } else if (accountPickerPresenter$AccountRemovalStatus instanceof AccountPickerPresenter$AccountRemovalStatus.Success) {
                            CoroutineContext coroutineContext = (CoroutineContext) tabToolbarPresenter.screen;
                            SessionWorkerKt$runSession$snapshotMonitor$1 sessionWorkerKt$runSession$snapshotMonitor$1 = new SessionWorkerKt$runSession$snapshotMonitor$1(i7, continuation, i2);
                            this.L$0 = null;
                            this.$stateChangeReason = null;
                            this.label = 2;
                            break;
                        } else if (!(accountPickerPresenter$AccountRemovalStatus instanceof AccountPickerPresenter$AccountRemovalStatus.Failed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return coroutineSingletons14;
                    }
                    ((BetterNavigator.ScreenNavigator) tabToolbarPresenter.badges).goTo(new OnboardingConfirmAccountRemovalScreen(TabToolbarPresenter.access$forAccountToken(tabToolbarPresenter, validatedAccountList.accounts, ((AccountPickerPresenter$AccountRemovalStatus.Requested) accountPickerPresenter$AccountRemovalStatus).accountToken).proto));
                } else if (i23 == 1) {
                    AccountPickerPresenter$AccountRemovalStatus.InProgress inProgress2 = (AccountPickerPresenter$AccountRemovalStatus.InProgress) this.$stateChangeReason;
                    SafeTrace.throwOnFailure(obj);
                    accountPickerPresenter$AccountRemovalStatus = inProgress2;
                    access$removeAccount = obj;
                    ValidatedAccountList validatedAccountList2 = (ValidatedAccountList) access$removeAccount;
                    if (validatedAccountList2 != null) {
                        ((MutableState) this.$update).setValue(validatedAccountList2);
                        mutableState4.setValue(AccountPickerPresenter$AccountRemovalStatus.Success.INSTANCE);
                    } else {
                        mutableState4.setValue(new AccountPickerPresenter$AccountRemovalStatus.Failed(((AccountPickerPresenter$AccountRemovalStatus.InProgress) accountPickerPresenter$AccountRemovalStatus).accountToken));
                    }
                } else {
                    if (i23 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    mutableState4.setValue(null);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.L$1;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$12 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope6, (LocalCashBalancePresenter) this.this$0, (MutableState) this.L$2, (CoroutineScope) this.$update, (State) this.L$3, (State) this.$stateChangeReason);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(cardSchemePresenter$toHeroModule$3$1$12, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.L$1;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$13 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope7, (WorkHomePresenter) this.this$0, (MutableState) this.L$2, (State) this.$update, (MutableState) this.L$3, (ParcelableSnapshotMutableIntState) this.$stateChangeReason);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(cardSchemePresenter$toHeroModule$3$1$13, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.L$1;
                    ZiplineLoader$load$2.AnonymousClass1 anonymousClass13 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope8, (LocalCashBalancePresenter) this.this$0, (EditDistributionConfiguration.DestinationUiConfiguration) this.L$2, (MutableFloatState) this.$update, (MutableState) this.L$3, (MutableState) this.$stateChangeReason, 12);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(anonymousClass13, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.L$1;
                    ZiplineLoader$load$2.AnonymousClass1 anonymousClass14 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope9, (MainPaymentPadPresenter) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (State) this.$stateChangeReason, 13);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(anonymousClass14, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                return invokeSuspend$com$squareup$cash$payments$presenters$MainPaymentPresenter$models$4$1(obj);
            case 20:
                return invokeSuspend$com$squareup$cash$payments$presenters$MainPaymentPresenter$submitPayment$2$2(obj);
            case 21:
                return invokeSuspend$com$squareup$cash$payments$presenters$NearbyPayRequestPresenter$models$$inlined$CollectEffect$1(obj);
            case 22:
                return invokeSuspend$com$squareup$cash$payments$presenters$NearbyPaymentKeypadPresenter$models$$inlined$CollectEffect$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$prepurchasecashcard$presenters$PrepurchaseCashCardPlanningPresenter$models$4$1(obj);
            case 24:
                return invokeSuspend$com$squareup$cash$profile$presenters$personal$ArcadeAutofillSettingsDetailPresenter$models$$inlined$CollectEffect$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$support$presenters$ContactSupportEmailMessagePresenter$models$$inlined$CollectEffect$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$taptopay$presenters$TapToPayPaymentPresenter$models$5$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$transfers$presenters$ScheduledReloadConfirmationPresenter$models$$inlined$CollectEffect$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$ui$gcm$RealNotificationDispatcher$showNotification$1(obj);
            default:
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.drop(FlowKt.distinctUntilChanged(Updater.snapshotFlow(new CardSchemePresenter$$ExternalSyntheticLambda1(cardSchemePresenter, i4))), 1), 24);
                    GLSceneScope$FrameRenderer$5$1$1$1$1 gLSceneScope$FrameRenderer$5$1$1$1$1 = new GLSceneScope$FrameRenderer$5$1$1$1$1(cardSchemePresenter, (MutableState) this.L$1, (MutableState) this.this$0, (MutableState) this.L$2, (MutableState) this.$update, (MutableState) this.L$3, (State) this.$stateChangeReason, null, 5);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, gLSceneScope$FrameRenderer$5$1$1$1$1, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DbSessionManager$updateDb$2(DbSessionManager dbSessionManager, Function2 function2, RealSessionManager.StateChangeReason stateChangeReason, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = dbSessionManager;
        this.$update = function2;
        this.$stateChangeReason = stateChangeReason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DbSessionManager$updateDb$2(AccountPickerPresenter$AccountRemovalStatus accountPickerPresenter$AccountRemovalStatus, ValidatedAccountList validatedAccountList, Continuation continuation, TabToolbarPresenter tabToolbarPresenter, MutableState mutableState, MutableState mutableState2) {
        super(2, continuation);
        this.$r8$classId = 14;
        this.L$1 = accountPickerPresenter$AccountRemovalStatus;
        this.this$0 = validatedAccountList;
        this.L$2 = tabToolbarPresenter;
        this.$update = mutableState;
        this.L$3 = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DbSessionManager$updateDb$2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.L$2 = obj2;
        this.$update = obj3;
        this.L$3 = obj4;
        this.$stateChangeReason = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DbSessionManager$updateDb$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$update = obj;
        this.L$3 = obj2;
        this.$stateChangeReason = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DbSessionManager$updateDb$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$3 = obj;
        this.$stateChangeReason = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DbSessionManager$updateDb$2(Flow flow, Continuation continuation, Object obj, Object obj2, Object obj3, Object obj4, State state, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = flow;
        this.this$0 = obj;
        this.L$2 = obj2;
        this.$update = obj3;
        this.L$3 = obj4;
        this.$stateChangeReason = state;
    }
}
