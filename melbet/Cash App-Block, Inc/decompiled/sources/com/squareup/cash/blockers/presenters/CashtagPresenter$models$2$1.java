package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.CashtagPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AuthorizeGooglePayViewModel;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewEvent;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewEvent;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CashtagStatus;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.app.ConfirmPaymentResponse;
import com.squareup.protos.franklin.app.GetCashtagStatusResponse;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SetAmountResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class CashtagPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $cashtagCandidate;
    public final /* synthetic */ Object $cashtagStatus$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashtagPresenter$models$2$1(int i, MutableState mutableState, MoleculePresenter moleculePresenter, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$cashtagCandidate = obj;
        this.$cashtagStatus$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$cashtagStatus$delegate;
        switch (i) {
            case 0:
                return new CashtagPresenter$models$2$1(0, (MutableState) obj2, (CashtagPresenter) this.this$0, (MutableStateFlow) this.$cashtagCandidate, continuation);
            case 1:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$1 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (AuthorizeGooglePayPresenter) obj2, 1);
                cashtagPresenter$models$2$1.this$0 = obj;
                return cashtagPresenter$models$2$1;
            case 2:
                return new CashtagPresenter$models$2$1((AuthorizeGooglePayPresenter) this.this$0, (MutableState) obj2, (MutableState) this.$cashtagCandidate, continuation);
            case 3:
                return new CashtagPresenter$models$2$1(3, (MutableState) obj2, (BankAccountLinkingPresenter) this.this$0, (BankAccountLinkingViewEvent) this.$cashtagCandidate, continuation);
            case 4:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$12 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (CardLockPresenter) obj2, 4);
                cashtagPresenter$models$2$12.this$0 = obj;
                return cashtagPresenter$models$2$12;
            case 5:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$13 = new CashtagPresenter$models$2$1(this.$cashtagCandidate, continuation, (CardLockPresenter) obj2, 5);
                cashtagPresenter$models$2$13.this$0 = obj;
                return cashtagPresenter$models$2$13;
            case 6:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$14 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (AddAliasPresenter) obj2, 6);
                cashtagPresenter$models$2$14.this$0 = obj;
                return cashtagPresenter$models$2$14;
            case 7:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$15 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (AddAliasPresenter) obj2, 7);
                cashtagPresenter$models$2$15.this$0 = obj;
                return cashtagPresenter$models$2$15;
            case 8:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$16 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (CameraPermissionPresenter) obj2, 8);
                cashtagPresenter$models$2$16.this$0 = obj;
                return cashtagPresenter$models$2$16;
            case 9:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$17 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (CardStudioPresenter) obj2, 9);
                cashtagPresenter$models$2$17.this$0 = obj;
                return cashtagPresenter$models$2$17;
            case 10:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$18 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (LocalPosCheckInPresenter) obj2, 10);
                cashtagPresenter$models$2$18.this$0 = obj;
                return cashtagPresenter$models$2$18;
            case 11:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$19 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (ErrorPresenter) obj2, 11);
                cashtagPresenter$models$2$19.this$0 = obj;
                return cashtagPresenter$models$2$19;
            case 12:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$110 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (ErrorPresenter) obj2, 12);
                cashtagPresenter$models$2$110.this$0 = obj;
                return cashtagPresenter$models$2$110;
            case 13:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$111 = new CashtagPresenter$models$2$1((CashCardKt$$ExternalSyntheticLambda0) obj2, (CashtagPresenter) this.this$0, continuation);
                cashtagPresenter$models$2$111.$cashtagCandidate = obj;
                return cashtagPresenter$models$2$111;
            case 14:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$112 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (MusicPresenter) obj2, 14);
                cashtagPresenter$models$2$112.this$0 = obj;
                return cashtagPresenter$models$2$112;
            case 15:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$113 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (ErrorPresenter) obj2, 15);
                cashtagPresenter$models$2$113.this$0 = obj;
                return cashtagPresenter$models$2$113;
            case 16:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$114 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (ConfirmHelpPresenter) obj2, 16);
                cashtagPresenter$models$2$114.this$0 = obj;
                return cashtagPresenter$models$2$114;
            case 17:
                return new CashtagPresenter$models$2$1(17, (MutableState) obj2, (DisclosurePresenter) this.this$0, (RequestContext) this.$cashtagCandidate, continuation);
            case 18:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$115 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (ErrorPresenter) obj2, 18);
                cashtagPresenter$models$2$115.this$0 = obj;
                return cashtagPresenter$models$2$115;
            case 19:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$116 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (LocalPosCheckInPresenter) obj2, 19);
                cashtagPresenter$models$2$116.this$0 = obj;
                return cashtagPresenter$models$2$116;
            case 20:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$117 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (ErrorPresenter) obj2, 20);
                cashtagPresenter$models$2$117.this$0 = obj;
                return cashtagPresenter$models$2$117;
            case 21:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$118 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (EndAppLockPresenter) obj2, 21);
                cashtagPresenter$models$2$118.this$0 = obj;
                return cashtagPresenter$models$2$118;
            case 22:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$119 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (ErrorPresenter) obj2, 22);
                cashtagPresenter$models$2$119.this$0 = obj;
                return cashtagPresenter$models$2$119;
            case 23:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$120 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (AddAliasPresenter) obj2, 23);
                cashtagPresenter$models$2$120.this$0 = obj;
                return cashtagPresenter$models$2$120;
            case 24:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$121 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (AddAliasPresenter) obj2, 24);
                cashtagPresenter$models$2$121.this$0 = obj;
                return cashtagPresenter$models$2$121;
            case 25:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$122 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (FormMenuActionPresenter) obj2, 25);
                cashtagPresenter$models$2$122.this$0 = obj;
                return cashtagPresenter$models$2$122;
            case 26:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$123 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (LocalPosCheckInPresenter) obj2, 26);
                cashtagPresenter$models$2$123.this$0 = obj;
                return cashtagPresenter$models$2$123;
            case 27:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$124 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (GpsExplainerSheetPresenter) obj2, 27);
                cashtagPresenter$models$2$124.this$0 = obj;
                return cashtagPresenter$models$2$124;
            case 28:
                return new CashtagPresenter$models$2$1(28, (MutableState) obj2, (GpsLocationConsentBlockerPresenter) this.this$0, (GpsLocationConsentBlockerViewEvent) this.$cashtagCandidate, continuation);
            default:
                CashtagPresenter$models$2$1 cashtagPresenter$models$2$125 = new CashtagPresenter$models$2$1((Flow) this.$cashtagCandidate, continuation, (ErrorPresenter) obj2, 29);
                cashtagPresenter$models$2$125.this$0 = obj;
                return cashtagPresenter$models$2$125;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((CashtagPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object isReadyToPay;
        Object trackBlockerSubmissionAnalytics$default;
        Object until;
        Object available;
        Object obj2;
        BetterNavigator.ScreenNavigator screenNavigator;
        DisclosurePresenter disclosurePresenter;
        BlockersScreens.ConfirmPaymentScreen confirmPaymentScreen;
        Object trackBlockerSubmissionAnalytics$default2;
        int i = this.$r8$classId;
        int i2 = 8;
        int i3 = 12;
        int i4 = 14;
        int i5 = 15;
        int i6 = 17;
        int i7 = 18;
        int i8 = 2;
        Object obj3 = this.$cashtagStatus$delegate;
        int i9 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashtagPresenter cashtagPresenter = (CashtagPresenter) this.this$0;
                    MutableStateFlow mutableStateFlow = (MutableStateFlow) this.$cashtagCandidate;
                    CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda0 = new CashCardKt$$ExternalSyntheticLambda0(i2, (MutableState) obj3);
                    this.label = 1;
                    Duration.Companion companion = Duration.Companion;
                    Object collectLatest = FlowKt.collectLatest(FlowKt.m4195debounceHG0u8IE(mutableStateFlow, DurationKt.toDuration(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, DurationUnit.MILLISECONDS)), new CashtagPresenter$models$2$1(cashCardKt$$ExternalSyntheticLambda0, cashtagPresenter, null), this);
                    if (collectLatest != obj4) {
                        collectLatest = Unit.INSTANCE;
                    }
                    if (collectLatest == obj4) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$1 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope, (AuthorizeGooglePayPresenter) obj3, 3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(clientScenarioLauncherPresenter$models$1$1$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                AuthorizeGooglePayPresenter authorizeGooglePayPresenter = (AuthorizeGooglePayPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GooglePayPaymentsClient googlePayPaymentsClient = authorizeGooglePayPresenter.googlePayPaymentsClient;
                    this.label = 1;
                    isReadyToPay = ((RealGooglePayPaymentsClient) googlePayPaymentsClient).isReadyToPay(this);
                    if (isReadyToPay == coroutineSingletons2) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    isReadyToPay = obj;
                }
                if (((Boolean) isReadyToPay).booleanValue()) {
                    ((MutableState) obj3).setValue(AuthorizeGooglePayViewModel.Loaded.INSTANCE);
                    ((MutableState) this.$cashtagCandidate).setValue(Boolean.TRUE);
                } else {
                    BetterNavigator.ScreenNavigator screenNavigator2 = authorizeGooglePayPresenter.navigator;
                    BlockersData blockersData = authorizeGooglePayPresenter.args.blockersData;
                    AndroidStringManager androidStringManager = authorizeGooglePayPresenter.stringManager;
                    screenNavigator2.goTo(new FailureMessageBlockerScreen(blockersData, androidStringManager.get(R.string.error_messaging_message_try_again_later), androidStringManager.get(R.string.error_messaging_title_something_went_wrong)));
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BankAccountLinkingPresenter bankAccountLinkingPresenter = (BankAccountLinkingPresenter) this.this$0;
                    RealBlockersHelper realBlockersHelper = bankAccountLinkingPresenter.blockersHelper;
                    HelpItem helpItem = ((BankAccountLinkingViewEvent.HelpItemClick) ((BankAccountLinkingViewEvent) this.$cashtagCandidate)).item;
                    BlockersScreens.BankAccountLinkingScreen bankAccountLinkingScreen = bankAccountLinkingPresenter.args;
                    CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$1 = new CashMapViewKt$CashMapView$3$1((MutableState) obj3, null, i9);
                    this.label = 1;
                    if (realBlockersHelper.performHelpAction(helpItem, bankAccountLinkingScreen, null, cashMapViewKt$CashMapView$3$1, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$12 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope2, (CardLockPresenter) obj3, 4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(clientScenarioLauncherPresenter$models$1$1$12, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator3 = cardLockPresenter.navigator;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) cardLockPresenter.stringManager;
                BlockersScreens.BitcoinAmountScreen bitcoinAmountScreen = (BlockersScreens.BitcoinAmountScreen) cardLockPresenter.cashAppTagManager;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = null;
                    this.label = 1;
                    trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, bitcoinAmountScreen.blockersData, (Analytics) cardLockPresenter.analytics, androidStringManager2, this, null, new PagingDataPresenter$collectFrom$2(cardLockPresenter, (SetAmountRequest) this.$cashtagCandidate, null, i6));
                    if (trackBlockerSubmissionAnalytics$default == coroutineSingletons5) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    trackBlockerSubmissionAnalytics$default = obj;
                }
                ApiResult apiResult = (ApiResult) trackBlockerSubmissionAnalytics$default;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator3.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(androidStringManager2, (ApiResult.Failure) apiResult, null).message, null, 14));
                    }
                } else {
                    BlockersData blockersData2 = bitcoinAmountScreen.blockersData;
                    ResponseContext responseContext = ((SetAmountResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator3.goTo(((BlockersDataNavigator) cardLockPresenter.cardLockFlowTypeProvider).getNext(bitcoinAmountScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                }
                break;
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$13 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope3, (AddAliasPresenter) obj3, 5);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(clientScenarioLauncherPresenter$models$1$1$13, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$14 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope4, (AddAliasPresenter) obj3, 6);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(clientScenarioLauncherPresenter$models$1$1$14, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$15 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope5, (CameraPermissionPresenter) obj3, 7);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow5.collect(clientScenarioLauncherPresenter$models$1$1$15, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$16 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope6, (CardStudioPresenter) obj3, i2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow6.collect(clientScenarioLauncherPresenter$models$1$1$16, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$cashtagCandidate;
                    CardActivationQrScannerPresenter$models$1$1$2 cardActivationQrScannerPresenter$models$1$1$2 = new CardActivationQrScannerPresenter$models$1$1$2(coroutineScope7, (LocalPosCheckInPresenter) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow7.collect(cardActivationQrScannerPresenter$models$1$1$2, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$17 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope8, (ErrorPresenter) obj3, 9);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow8.collect(clientScenarioLauncherPresenter$models$1$1$17, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$18 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope9, (ErrorPresenter) obj3, 10);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow9.collect(clientScenarioLauncherPresenter$models$1$1$18, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                CashtagPresenter cashtagPresenter2 = (CashtagPresenter) this.this$0;
                CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda02 = (CashCardKt$$ExternalSyntheticLambda0) obj3;
                String str = (String) this.$cashtagCandidate;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str.length() != 0) {
                        cashCardKt$$ExternalSyntheticLambda02.invoke(CashtagPresenter.CashtagStatus.LookingUp.INSTANCE);
                        Signal signal = cashtagPresenter2.signOut;
                        CashtagPresenter$submitCashtag$result$1 cashtagPresenter$submitCashtag$result$1 = new CashtagPresenter$submitCashtag$result$1(cashtagPresenter2, str, null, i8);
                        this.$cashtagCandidate = null;
                        this.label = 1;
                        until = StateFlowKt.until(signal, cashtagPresenter$submitCashtag$result$1, this);
                        if (until == coroutineSingletons13) {
                            break;
                        }
                    } else {
                        cashCardKt$$ExternalSyntheticLambda02.invoke(new CashtagPresenter.CashtagStatus.Unavailable(null));
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    until = obj;
                }
                ApiResult apiResult2 = (ApiResult) until;
                if (!(apiResult2 instanceof ApiResult.Success)) {
                    if (!(apiResult2 instanceof ApiResult.Failure)) {
                        if (apiResult2 != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    } else {
                        cashtagPresenter2.handleLookupFailure((ApiResult.Failure) apiResult2, cashCardKt$$ExternalSyntheticLambda02, false);
                    }
                } else {
                    GetCashtagStatusResponse getCashtagStatusResponse = (GetCashtagStatusResponse) ((ApiResult.Success) apiResult2).response;
                    GetCashtagStatusResponse.Status status = getCashtagStatusResponse.status;
                    if (status == null) {
                        status = ProtoDefaults.GET_CASHTAG_STATUS_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal == 1) {
                        CashtagStatus cashtagStatus = getCashtagStatusResponse.cashtag_status;
                        if (cashtagStatus == null) {
                            cashtagStatus = ProtoDefaults.GET_CASHTAG_STATUS_CASHTAG_STATUS;
                        }
                        int ordinal2 = cashtagStatus.ordinal();
                        if (ordinal2 == 0) {
                            available = new CashtagPresenter.CashtagStatus.Available(getCashtagStatusResponse.cashtag_url_display_text);
                        } else if (ordinal2 != 1 && ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            available = new CashtagPresenter.CashtagStatus.Unavailable(getCashtagStatusResponse.failure_message);
                        }
                        obj2 = available;
                        cashCardKt$$ExternalSyntheticLambda02.invoke(obj2);
                    } else if (ordinal != 2) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                        break;
                    } else {
                        obj2 = CashtagPresenter.CashtagStatus.Unknown.INSTANCE;
                        cashCardKt$$ExternalSyntheticLambda02.invoke(obj2);
                    }
                    break;
                }
            case 14:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$19 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope10, (MusicPresenter) obj3, 11);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow10.collect(clientScenarioLauncherPresenter$models$1$1$19, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$110 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope11, (ErrorPresenter) obj3, i3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow11.collect(clientScenarioLauncherPresenter$models$1$1$110, this) == coroutineSingletons15) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$111 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope12, (ConfirmHelpPresenter) obj3, 13);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow12.collect(clientScenarioLauncherPresenter$models$1$1$111, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 17:
                RequestContext requestContext = (RequestContext) this.$cashtagCandidate;
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) disclosurePresenter2.navigator;
                AndroidStringManager androidStringManager3 = (AndroidStringManager) disclosurePresenter2.stringManager;
                BlockersScreens.ConfirmPaymentScreen confirmPaymentScreen2 = (BlockersScreens.ConfirmPaymentScreen) disclosurePresenter2.args;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = (Analytics) disclosurePresenter2.analytics;
                    screenNavigator = screenNavigator4;
                    BlockersData blockersData3 = confirmPaymentScreen2.blockersData;
                    MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(i3);
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(disclosurePresenter2, requestContext, continuation, i7);
                    this.label = 1;
                    disclosurePresenter = disclosurePresenter2;
                    confirmPaymentScreen = confirmPaymentScreen2;
                    trackBlockerSubmissionAnalytics$default2 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData3, analytics, androidStringManager3, this, moveBitcoinViewKt$$ExternalSyntheticLambda3, pagingDataPresenter$collectFrom$2);
                    if (trackBlockerSubmissionAnalytics$default2 == coroutineSingletons17) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    disclosurePresenter = disclosurePresenter2;
                    screenNavigator = screenNavigator4;
                    confirmPaymentScreen = confirmPaymentScreen2;
                    trackBlockerSubmissionAnalytics$default2 = obj;
                }
                ApiResult apiResult3 = (ApiResult) trackBlockerSubmissionAnalytics$default2;
                if (apiResult3 instanceof ApiResult.Success) {
                    ConfirmPaymentResponse confirmPaymentResponse = (ConfirmPaymentResponse) ((ApiResult.Success) apiResult3).response;
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) disclosurePresenter.blockersNavigator;
                    BlockersData blockersData4 = confirmPaymentScreen.blockersData;
                    ConfirmPaymentResponse.Status status2 = confirmPaymentResponse.status;
                    ResponseContext responseContext2 = confirmPaymentResponse.response_context;
                    if (status2 == null) {
                        status2 = ProtoDefaults.CONFIRM_PAYMENT_STATUS;
                    }
                    int ordinal3 = status2.ordinal();
                    if (ordinal3 == 1) {
                        responseContext2.getClass();
                        Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                        BlockersData updateFromResponseContext = blockersData4.updateFromResponseContext(responseContext2, false);
                        ((ProductionAttributionEventEmitter) disclosurePresenter.launcher).paymentConfirmationSuccessful(Role.RECIPIENT);
                        screenNavigator.goTo(blockersDataNavigator.getNext(confirmPaymentScreen, updateFromResponseContext));
                    } else if (ordinal3 == 2) {
                        Timber.Forest.d("Concurrent modification", new Object[0]);
                        responseContext2.getClass();
                        Parcelable.Creator<BlockersData> creator3 = BlockersData.CREATOR;
                        screenNavigator.goTo(blockersDataNavigator.getNext(confirmPaymentScreen, blockersData4.updateFromResponseContext(responseContext2, false)));
                    } else if (ordinal3 != 3) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) status2, "Unknown status: ");
                        break;
                    } else {
                        responseContext2.getClass();
                        Parcelable.Creator<BlockersData> creator4 = BlockersData.CREATOR;
                        screenNavigator.goTo(blockersDataNavigator.getNext(confirmPaymentScreen, blockersData4.updateFromResponseContext(responseContext2, false)));
                    }
                }
                MutableState mutableState = (MutableState) obj3;
                if (apiResult3 instanceof ApiResult.Failure) {
                    Timber.Forest.e("Failed to confirm payment.", new Object[0]);
                    mutableState.setValue(Boolean.FALSE);
                    screenNavigator.goTo(new FailureMessageBlockerScreen(confirmPaymentScreen.blockersData, TextUtilsCompat.errorMessaging(androidStringManager3, (ApiResult.Failure) apiResult3, null).message, null, 4));
                }
                break;
            case 18:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$112 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope13, (ErrorPresenter) obj3, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow13.collect(clientScenarioLauncherPresenter$models$1$1$112, this) == coroutineSingletons18) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 19:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$cashtagCandidate;
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$2 = new PasscodeViewKt$Passcode$3$1$1$1$2(i5, coroutineScope14, (LocalPosCheckInPresenter) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow14.collect(passcodeViewKt$Passcode$3$1$1$1$2, this) == coroutineSingletons19) {
                        break;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$113 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope15, (ErrorPresenter) obj3, i5);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow15.collect(clientScenarioLauncherPresenter$models$1$1$113, this) == coroutineSingletons20) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$114 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope16, (EndAppLockPresenter) obj3, 16);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow16.collect(clientScenarioLauncherPresenter$models$1$1$114, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$115 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope17, (ErrorPresenter) obj3, i6);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow17.collect(clientScenarioLauncherPresenter$models$1$1$115, this) == coroutineSingletons22) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 23:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow18 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$116 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope18, (AddAliasPresenter) obj3, i7);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow18.collect(clientScenarioLauncherPresenter$models$1$1$116, this) == coroutineSingletons23) {
                        break;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 24:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow19 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$117 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope19, (AddAliasPresenter) obj3, 19);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow19.collect(clientScenarioLauncherPresenter$models$1$1$117, this) == coroutineSingletons24) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                CoroutineScope coroutineScope20 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow20 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$118 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope20, (FormMenuActionPresenter) obj3, 22);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow20.collect(clientScenarioLauncherPresenter$models$1$1$118, this) == coroutineSingletons25) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 26:
                CoroutineScope coroutineScope21 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow21 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$119 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope21, (LocalPosCheckInPresenter) obj3, 23);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow21.collect(clientScenarioLauncherPresenter$models$1$1$119, this) == coroutineSingletons26) {
                        break;
                    }
                } else if (i36 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                CoroutineScope coroutineScope22 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow22 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$120 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope22, (GpsExplainerSheetPresenter) obj3, 24);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow22.collect(clientScenarioLauncherPresenter$models$1$1$120, this) == coroutineSingletons27) {
                        break;
                    }
                } else if (i37 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 28:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter = (GpsLocationConsentBlockerPresenter) this.this$0;
                    RealBlockersHelper realBlockersHelper2 = gpsLocationConsentBlockerPresenter.blockersHelper;
                    BlockerAction blockerAction = ((GpsLocationConsentBlockerViewEvent.BlockerActionClicked) ((GpsLocationConsentBlockerViewEvent) this.$cashtagCandidate)).action;
                    BlockersScreens.GpsLocationConsentBlockerScreen gpsLocationConsentBlockerScreen = gpsLocationConsentBlockerPresenter.args;
                    GpsLocationConsentBlockerPresenter$models$1$3$1 gpsLocationConsentBlockerPresenter$models$1$3$1 = new GpsLocationConsentBlockerPresenter$models$1$3$1(gpsLocationConsentBlockerPresenter, (MutableState) obj3, null);
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper2, blockerAction, gpsLocationConsentBlockerScreen, null, null, false, null, gpsLocationConsentBlockerPresenter$models$1$3$1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons28) {
                        break;
                    }
                } else if (i38 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope23 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow23 = (Flow) this.$cashtagCandidate;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$121 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope23, (ErrorPresenter) obj3, 25);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow23.collect(clientScenarioLauncherPresenter$models$1$1$121, this) == coroutineSingletons29) {
                        break;
                    }
                } else if (i39 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashtagPresenter$models$2$1(AuthorizeGooglePayPresenter authorizeGooglePayPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.this$0 = authorizeGooglePayPresenter;
        this.$cashtagStatus$delegate = mutableState;
        this.$cashtagCandidate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashtagPresenter$models$2$1(CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda0, CashtagPresenter cashtagPresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.$cashtagStatus$delegate = cashCardKt$$ExternalSyntheticLambda0;
        this.this$0 = cashtagPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashtagPresenter$models$2$1(Object obj, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cashtagCandidate = obj;
        this.$cashtagStatus$delegate = moleculePresenter;
    }
}
