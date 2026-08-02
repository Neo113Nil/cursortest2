package com.squareup.cash.aiedge;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.core.provider.FontsContractCompat;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.Presenter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.widget.Widget;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOne$$inlined$map$1$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.google.android.gms.internal.mlkit_genai_prompt.zzlq;
import com.google.android.gms.internal.mlkit_genai_prompt.zzot;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.appintro.presenters.SponsorshipRequestReferralIntroPresenter;
import com.squareup.cash.appintro.presenters.SponsorshipRequestReferralIntroPresenter$models$2$1$WhenMappings;
import com.squareup.cash.appintro.screens.SponsorshipRequestContent;
import com.squareup.cash.appintro.screens.SponsorshipRequestReferralIntroScreen;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.OnDemandMessageAnalyticsData;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.appmessages.db.PopupMessage;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter;
import com.squareup.cash.appmessages.presenters.RealTooltipAppMessagePresenter;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ProgressCircularKt$ProgressCircular$1$1$1;
import com.squareup.cash.attribution.deeplink.RealDeepLinkAttributionWorker;
import com.squareup.cash.banking.backend.real.RealConfirmCashOutVersionCodeProvider;
import com.squareup.cash.banking.screens.BenefitsLeafletSheetScreen;
import com.squareup.cash.banking.screens.ConfirmCashOutScreen;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewModel;
import com.squareup.cash.banking.viewmodels.ConfirmCashOutDialogViewEvent$TapButton;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletRequest;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$models$2$1$1;
import com.squareup.cash.bitcoin.presenters.BitcoinKeypadStateStore$State;
import com.squareup.cash.bitcoin.presenters.RealBitcoinKeypadStateStore;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter;
import com.squareup.cash.bitcoin.presenters.payinusd.BitcoinPayInUsdPreference;
import com.squareup.cash.bitcoin.presenters.payinusd.RealBitcoinPayInUsdPreferenceManager;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewModel;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.appmessage.AppMessageInteractView;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletViewViewError;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletViewViewLeaflet;
import com.squareup.cash.cdf.overdraftcoverage.OverdraftCoverageManageToggleEnabled;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.education.stories.backend.real.RealEducationStoryRepository;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.graphics.swampgl.GLThread$launch$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Handled;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.ui.PaymentPasscodeActivity$loadView$3$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.bankingbenefits.api.v1_0.BankingBenefitsAppService;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.janus.api.RegisterProspectTokenRequest;
import com.squareup.protos.cash.janus.api.RegisterProspectTokenResponse;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.DismissInAppMessageRequest;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.InAppMessageService;
import com.squareup.protos.cash.overdraftly.OverdraftlyService;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.util.compose.ConstantSpeedMotionDurationScale;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.Message;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.overdraft.OverdraftStatus$Action$Action$ActivateOverdraftAction;
import squareup.cash.overdraft.OverdraftStatus$Action$Action$DisableOverdraftAction;
import squareup.cash.overdraft.OverdraftStatus$Action$Action$EnableOverdraftAction;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class MLKitTitleGenerator$prepareModel$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MLKitTitleGenerator$prepareModel$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
    }

    private final Object invokeSuspend$com$squareup$cash$bitcoin$presenters$RealBitcoinKeypadStateStore$models$1$1(Object obj) {
        Object bitcoinAmountEntryCurrencyPreference;
        MutableState mutableState = (MutableState) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (((BitcoinKeypadStateStore$State) mutableState.getValue()).transferAmount != null) {
                BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State = (BitcoinKeypadStateStore$State) mutableState.getValue();
                Long l = new Long(Moneys.amount(((BitcoinKeypadStateStore$State) mutableState.getValue()).transferAmount));
                CurrencyCode currencyCode = RealBitcoinKeypadStateStore.lastCurrency;
                if (currencyCode == null) {
                    Money money = ((BitcoinKeypadStateStore$State) mutableState.getValue()).transferAmount;
                    money.getClass();
                    currencyCode = money.currency_code;
                }
                Money money2 = new Money(l, currencyCode, 4);
                BitcoinDisplayUnits bitcoinDisplayUnits = RealBitcoinKeypadStateStore.lastBitcoinDisplayUnits;
                if (bitcoinDisplayUnits == null) {
                    bitcoinDisplayUnits = ((BitcoinKeypadStateStore$State) mutableState.getValue()).displayUnits;
                }
                BitcoinDisplayUnits bitcoinDisplayUnits2 = bitcoinDisplayUnits;
                Money money3 = RealBitcoinKeypadStateStore.lastValuePerBitcoin;
                if (money3 == null) {
                    money3 = ((BitcoinKeypadStateStore$State) mutableState.getValue()).valuePerBitcoin;
                }
                mutableState.setValue(BitcoinKeypadStateStore$State.copy$default(bitcoinKeypadStateStore$State, money2, null, money3, null, bitcoinDisplayUnits2, null, null, null, false, 4074));
                return Unit.INSTANCE;
            }
            RealProfileManager realProfileManager = ((RealBitcoinKeypadStateStore) this.L$0).profileManager;
            this.label = 1;
            bitcoinAmountEntryCurrencyPreference = realProfileManager.bitcoinAmountEntryCurrencyPreference(this);
            if (bitcoinAmountEntryCurrencyPreference == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            bitcoinAmountEntryCurrencyPreference = obj;
        }
        mutableState.setValue(BitcoinKeypadStateStore$State.copy$default((BitcoinKeypadStateStore$State) mutableState.getValue(), new Money(new Long(0L), (CurrencyCode) bitcoinAmountEntryCurrencyPreference, 4), null, null, null, null, null, null, null, false, 4094));
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$education$BitcoinStoriesWidgetPresenter$models$storiesResponse$2$1(Object obj) {
        ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            produceStateScope.setValue(null);
            RealEducationStoryRepository realEducationStoryRepository = (RealEducationStoryRepository) ((Result) this.this$0).resultMetadata;
            Flow flowOn = FlowKt.flowOn(new FinishSetupTileBadgeCounter(21, new SafeFlow(new RealFidesmoClient$observeDeviceState$1(realEducationStoryRepository, null)), new AnchoredDraggableNode$drag$2(realEducationStoryRepository, null)), realEducationStoryRepository.ioDispatcher);
            FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, 3);
            this.L$0 = null;
            this.label = 1;
            if (flowOn.collect(flowExtKt$collectAsStateWithLifecycle$1$1$1$1, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$graph$BitcoinGraphWidgetPresenter$models$1$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            RealProfileManager realProfileManager = (RealProfileManager) ((HCaptcha) this.L$0).exception;
            this.label = 1;
            obj = realProfileManager.bitcoinAmountEntryCurrencyPreference(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        ((MutableState) this.this$0).setValue(Boolean.valueOf(((CurrencyCode) obj) != CurrencyCode.BTC));
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$map$BitcoinMapCardWidgetPresenter$models$1$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            n nVar = (n) this.L$0;
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.this$0;
            this.label = 1;
            Object showBitcoinMap = ((RealBitcoinInboundNavigator$Factory$Impl) nVar.b).create(screenNavigator).showBitcoinMap(BitcoinMapScreen.Source.BITCOIN_APPLET_CARD, this);
            if (showBitcoinMap != coroutineSingletons) {
                showBitcoinMap = Unit.INSTANCE;
            }
            if (showBitcoinMap == coroutineSingletons) {
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if ((r6 != null ? r6.enabled.equals(r4) : false) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$stackingtools$BitcoinStackingToolsPresenter$models$2$1(Object obj) {
        MutableState mutableState = (MutableState) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem = ((BitcoinStackingToolsViewModel) mutableState.getValue()).paidInBitcoinItem;
            if (!(bitcoinStackingToolsItem != null ? bitcoinStackingToolsItem.enabled.equals(Boolean.TRUE) : false)) {
                Boolean bool = ((BitcoinStackingToolsViewModel) mutableState.getValue()).autoInvestItem.enabled;
                Boolean bool2 = Boolean.TRUE;
                if (!bool.equals(bool2) && !((BitcoinStackingToolsViewModel) mutableState.getValue()).roundUpsItem.enabled.equals(bool2)) {
                    BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem2 = ((BitcoinStackingToolsViewModel) mutableState.getValue()).receiveP2PAsBitcoinItem;
                }
            }
            KeyValue keyValue = ((BitcoinStackingToolsPresenter) this.L$0).showBitcoinStackingToolsLearnMore;
            Boolean bool3 = Boolean.FALSE;
            this.label = 1;
            if (keyValue.set(bool3, this) == coroutineSingletons) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                MLKitTitleGenerator$prepareModel$1 mLKitTitleGenerator$prepareModel$1 = new MLKitTitleGenerator$prepareModel$1((BinaryBitmap) obj2, continuation, 0);
                mLKitTitleGenerator$prepareModel$1.L$0 = obj;
                return mLKitTitleGenerator$prepareModel$1;
            case 1:
                MLKitTitleGenerator$prepareModel$1 mLKitTitleGenerator$prepareModel$12 = new MLKitTitleGenerator$prepareModel$1((RealAfterpayAppletRepository) obj2, continuation, 1);
                mLKitTitleGenerator$prepareModel$12.L$0 = obj;
                return mLKitTitleGenerator$prepareModel$12;
            case 2:
                return new MLKitTitleGenerator$prepareModel$1((RealAfterpayMerchantRepo) this.L$0, (EngagedItemToken) obj2, continuation, 2);
            case 3:
                return new MLKitTitleGenerator$prepareModel$1((AfterpayAppletHomePresenter) this.L$0, (AfterpayAppletHomeContentViewModel) obj2, continuation, 3);
            case 4:
                return new MLKitTitleGenerator$prepareModel$1((AfterpayAppletPurchasesEmbeddedPresenter) this.L$0, (MutableState) obj2, continuation, 4);
            case 5:
                return new MLKitTitleGenerator$prepareModel$1((Animatable) this.L$0, (AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar) obj2, continuation, 5);
            case 6:
                return new MLKitTitleGenerator$prepareModel$1((Animatable) this.L$0, (Animatable) obj2, continuation, 6);
            case 7:
                return new MLKitTitleGenerator$prepareModel$1((SponsorshipRequestReferralIntroPresenter) this.L$0, (MutableState) obj2, continuation, 7);
            case 8:
                return new MLKitTitleGenerator$prepareModel$1((CardStudioPresenter) this.L$0, (MutableState) obj2, continuation, 8);
            case 9:
                return new MLKitTitleGenerator$prepareModel$1((CardStudioPresenter) this.L$0, (AppMessageViewEvent) obj2, continuation, 9);
            case 10:
                return new MLKitTitleGenerator$prepareModel$1((GrpcMethod) this.L$0, (AppMessageViewEvent.AppMessageActionTaken) obj2, continuation, 10);
            case 11:
                return new MLKitTitleGenerator$prepareModel$1((RealInAppNotificationPresenter) this.L$0, (AppMessageViewEvent) obj2, continuation, 11);
            case 12:
                return new MLKitTitleGenerator$prepareModel$1((n) this.L$0, (OnDemandMessageAnalyticsData) obj2, continuation, 12);
            case 13:
                return new MLKitTitleGenerator$prepareModel$1((TooltipAppMessageViewEvent) this.L$0, (RealTooltipAppMessagePresenter) obj2, continuation, 13);
            case 14:
                return new MLKitTitleGenerator$prepareModel$1((LottieCompositionResult) this.L$0, (LottieAnimatable) obj2, continuation, 14);
            case 15:
                return new MLKitTitleGenerator$prepareModel$1((AnchoredDraggableState) this.L$0, (Function1) obj2, continuation, 15);
            case 16:
                return new MLKitTitleGenerator$prepareModel$1((Presenter.Binding) this.L$0, (Widget) obj2, continuation, 16);
            case 17:
                MLKitTitleGenerator$prepareModel$1 mLKitTitleGenerator$prepareModel$13 = new MLKitTitleGenerator$prepareModel$1((RealDeepLinkAttributionWorker) obj2, continuation, 17);
                mLKitTitleGenerator$prepareModel$13.L$0 = obj;
                return mLKitTitleGenerator$prepareModel$13;
            case 18:
                return new MLKitTitleGenerator$prepareModel$1((LocalPosCheckInPresenter) this.L$0, (MutableState) obj2, continuation, 18);
            case 19:
                return new MLKitTitleGenerator$prepareModel$1((ConfirmCashOutDialogViewEvent$TapButton) this.L$0, (CardStudioPresenter) obj2, continuation, 19);
            case 20:
                return new MLKitTitleGenerator$prepareModel$1((LocalHomePresenter) this.L$0, (MutableState) obj2, continuation, 20);
            case 21:
                return new MLKitTitleGenerator$prepareModel$1((LocalHomePresenter) this.L$0, (BitcoinDisplayCurrencyViewEvent) obj2, continuation, 21);
            case 22:
                return new MLKitTitleGenerator$prepareModel$1((CardStudioPresenter) this.L$0, (State) obj2, continuation, 22);
            case 23:
                return new MLKitTitleGenerator$prepareModel$1((RealBitcoinKeypadStateStore) this.L$0, (MutableState) obj2, continuation, 23);
            case 24:
                return new MLKitTitleGenerator$prepareModel$1((StuckPlayerDetector) this.L$0, (MutableState) obj2, continuation, 24);
            case 25:
                MLKitTitleGenerator$prepareModel$1 mLKitTitleGenerator$prepareModel$14 = new MLKitTitleGenerator$prepareModel$1((Result) obj2, continuation, 25);
                mLKitTitleGenerator$prepareModel$14.L$0 = obj;
                return mLKitTitleGenerator$prepareModel$14;
            case 26:
                return new MLKitTitleGenerator$prepareModel$1((HCaptcha) this.L$0, (MutableState) obj2, continuation, 26);
            case 27:
                return new MLKitTitleGenerator$prepareModel$1((n) this.L$0, (BetterNavigator.ScreenNavigator) obj2, continuation, 27);
            case 28:
                return new MLKitTitleGenerator$prepareModel$1((BitcoinStackingToolsPresenter) this.L$0, (MutableState) obj2, continuation, 28);
            default:
                return new MLKitTitleGenerator$prepareModel$1((DisclosurePresenter) this.L$0, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 16:
                ((MLKitTitleGenerator$prepareModel$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((MLKitTitleGenerator$prepareModel$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0194, code lost:
    
        if (r8 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0485, code lost:
    
        if (app.cash.molecule.PlatformKt.retryWhenRetryable$default(null, r2, r24, 3) == r1) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x044d, code lost:
    
        if (r2.set(r3, r24) == r1) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x05ed, code lost:
    
        if (r0 == r1) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x05a5, code lost:
    
        if (r2 == r1) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x081c, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r2, r1, null, null, r24, 12) == r8) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x07f5, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(16, r24) == r8) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x092a, code lost:
    
        if (r0.emit(r2, r24) == r1) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0905, code lost:
    
        if (r2 == r1) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x09bc, code lost:
    
        if (r1.emit(r0, r24) == r2) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x09d3, code lost:
    
        if (r1.emit(r0, r24) != r2) goto L572;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:483:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0167  */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.String, kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList] */
    /* JADX WARN: Type inference failed for: r4v19 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object zzc;
        Object refreshAfterpayApplet;
        ?? r4;
        Object refreshAfterpayApplet2;
        Float f;
        TweenSpec tween$default;
        String str;
        Object registerProspectToken;
        AliasRegistrar$Result successful;
        int i;
        AliasRegistrar$Result.NotSuccessful.Status status;
        AliasRegistrar$Args.DeliveryMechanism deliveryMechanism;
        String str2;
        Object first;
        Object dismissInAppMessage;
        Object benefitLeaflet;
        OverdraftStatus.Upsell upsell;
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled;
        Message message;
        OverdraftStatus.ToggleButton toggleButton;
        OverdraftStatus.Action action;
        MoneyTabBookletKt moneyTabBookletKt;
        OverdraftStatus.ToggleButton toggleButton2;
        OverdraftStatus.Action action2;
        MoneyTabBookletKt moneyTabBookletKt2;
        Object obj2;
        OverdraftStatus.ToggleButton toggleButton3;
        OverdraftStatus.Action action3;
        MoneyTabBookletKt moneyTabBookletKt3;
        Object bitcoinAmountEntryCurrencyPreference;
        int i2 = this.$r8$classId;
        int i3 = 14;
        int i4 = 13;
        int i5 = 5;
        int i6 = 3;
        int i7 = 2;
        Object obj3 = this.this$0;
        int i8 = 1;
        Continuation continuation = null;
        switch (i2) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                try {
                } catch (Exception e) {
                    Timber.Forest.w("Failed to prepare AI model", new Object[0], e);
                    Boolean bool = Boolean.FALSE;
                    this.L$0 = null;
                    this.label = 5;
                    break;
                }
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzot zzotVar = (zzot) ((BinaryBitmap) obj3).binarizer;
                    this.L$0 = flowCollector;
                    this.label = 1;
                    zzc = zzlq.zzc(zzotVar.zzi, this);
                    if (zzc == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 == 2 || i9 == 3 || i9 == 4) {
                            SafeTrace.throwOnFailure(obj);
                        } else {
                            if (i9 != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    zzc = obj;
                }
                int intValue = ((Number) zzc).intValue();
                if (intValue != 0 && intValue != 1) {
                    if (intValue == 2) {
                        Boolean bool2 = Boolean.FALSE;
                        this.L$0 = flowCollector;
                        this.label = 3;
                        if (flowCollector.emit(bool2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return Unit.INSTANCE;
                    }
                    if (intValue != 3) {
                        Timber.Forest.w("Unknown model status: " + intValue, new Object[0]);
                        Boolean bool3 = Boolean.FALSE;
                        this.L$0 = flowCollector;
                        this.label = 4;
                        if (flowCollector.emit(bool3, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return Unit.INSTANCE;
                    }
                }
                Boolean bool4 = Boolean.TRUE;
                this.L$0 = flowCollector;
                this.label = 2;
                break;
            case 1:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    refreshAfterpayApplet = ((RealAfterpayAppletRepository) obj3).refreshAfterpayApplet(this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    refreshAfterpayApplet = obj;
                }
                ApiResult apiResult = (ApiResult) refreshAfterpayApplet;
                AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) (apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null);
                if (afterpayAppletResponse != null) {
                    Boolean valueOf = Boolean.valueOf(afterpayAppletResponse.entrypoint != null);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayMerchantRepo realAfterpayMerchantRepo = (RealAfterpayMerchantRepo) this.L$0;
                    CoroutineContext coroutineContext = realAfterpayMerchantRepo.ioContext;
                    BenefitsHubPresenter$models$1$1 benefitsHubPresenter$models$1$1 = new BenefitsHubPresenter$models$1$1(realAfterpayMerchantRepo, (EngagedItemToken) obj3, (Continuation) null, i8);
                    this.label = 1;
                    if (JobKt.withContext(coroutineContext, benefitsHubPresenter$models$1$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel = (AfterpayAppletHomeContentViewModel) obj3;
                AfterpayAppletHomePresenter afterpayAppletHomePresenter = (AfterpayAppletHomePresenter) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    afterpayAppletHomePresenter.observabilityManager.logEvent("afterpay_applet_pull_to_refresh", AfterpayAppletHomePresenter.refreshAttributeHome);
                    r4 = 0;
                    afterpayAppletHomePresenter.setHomeState(AfterpayAppletHomeContentViewModel.copy$default(afterpayAppletHomeContentViewModel, true, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE));
                    RealAfterpayAppletRepository realAfterpayAppletRepository = afterpayAppletHomePresenter.afterpayAppletRepository;
                    this.label = 1;
                    refreshAfterpayApplet2 = realAfterpayAppletRepository.refreshAfterpayApplet(this);
                    if (refreshAfterpayApplet2 == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    refreshAfterpayApplet2 = obj;
                    r4 = 0;
                }
                AfterpayAppletHomeContentViewModel copy$default = AfterpayAppletHomeContentViewModel.copy$default(afterpayAppletHomeContentViewModel, false, r4, r4, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
                Map map = AfterpayAppletHomePresenter.refreshAttributeHome;
                afterpayAppletHomePresenter.setHomeState(copy$default);
                if (((ApiResult) refreshAfterpayApplet2) instanceof ApiResult.Failure) {
                    afterpayAppletHomePresenter.setHomeState(afterpayAppletHomePresenter.toErrorState());
                }
                return Unit.INSTANCE;
            case 4:
                AfterpayAppletPurchasesEmbeddedPresenter afterpayAppletPurchasesEmbeddedPresenter = (AfterpayAppletPurchasesEmbeddedPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow home = afterpayAppletPurchasesEmbeddedPresenter.afterpayAppletRepository.getHome();
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3 = new ActivityTabViewKt$ActivityTab$5$1$3(8, afterpayAppletPurchasesEmbeddedPresenter, (MutableState) obj3);
                    this.label = 1;
                    if (home.collect(activityTabViewKt$ActivityTab$5$1$3, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Animatable animatable = (Animatable) this.L$0;
                Float f2 = new Float(((AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar) obj3).progress);
                SpringSpec spring$default = AnimatableKt.spring$default(1.0f, 175.0f, null, 4);
                this.label = 2;
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(200L, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        f = new Float(1.0f);
                        tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6);
                        this.label = 3;
                        if (Animatable.animateTo$default((Animatable) obj3, f, tween$default, null, null, this, 12) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Animatable animatable2 = (Animatable) this.L$0;
                Float f3 = new Float(1.0f);
                TweenSpec tween$default2 = AnimatableKt.tween$default(600, 0, EasingKt.LinearEasing, 2);
                this.label = 2;
                if (Animatable.animateTo$default(animatable2, f3, tween$default2, null, null, this, 12) == coroutineSingletons7) {
                    return coroutineSingletons7;
                }
                f = new Float(1.0f);
                tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6);
                this.label = 3;
                if (Animatable.animateTo$default((Animatable) obj3, f, tween$default, null, null, this, 12) == coroutineSingletons7) {
                }
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState = (MutableState) obj3;
                SponsorshipRequestReferralIntroPresenter sponsorshipRequestReferralIntroPresenter = (SponsorshipRequestReferralIntroPresenter) this.L$0;
                BetterNavigator.ScreenNavigator screenNavigator = sponsorshipRequestReferralIntroPresenter.navigator;
                SponsorshipRequestReferralIntroScreen sponsorshipRequestReferralIntroScreen = sponsorshipRequestReferralIntroPresenter.args;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JanusService janusService = sponsorshipRequestReferralIntroPresenter.service;
                    ClientScenario clientScenario = sponsorshipRequestReferralIntroScreen.blockersData.clientScenario;
                    String str3 = sponsorshipRequestReferralIntroScreen.flowToken;
                    SponsorshipRequestContent sponsorshipRequestContent = sponsorshipRequestReferralIntroScreen.content;
                    if (sponsorshipRequestContent instanceof SponsorshipRequestContent.Sponsor) {
                        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction acceptInvitationAction = ((SponsorshipRequestContent.Sponsor) sponsorshipRequestContent).content.primary_button_action;
                        acceptInvitationAction.getClass();
                        str = acceptInvitationAction.prospect_token;
                        str.getClass();
                    } else {
                        if (!(sponsorshipRequestContent instanceof SponsorshipRequestContent.Teen)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction acceptInvitationAction2 = ((SponsorshipRequestContent.Teen) sponsorshipRequestContent).content.primary_button_action;
                        acceptInvitationAction2.getClass();
                        str = acceptInvitationAction2.prospect_token;
                        str.getClass();
                    }
                    RegisterProspectTokenRequest registerProspectTokenRequest = new RegisterProspectTokenRequest(sponsorshipRequestReferralIntroScreen.blockersData.requestContext, str, ByteString.EMPTY);
                    this.label = 1;
                    registerProspectToken = janusService.registerProspectToken(clientScenario, str3, registerProspectTokenRequest, this);
                    if (registerProspectToken == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    registerProspectToken = obj;
                }
                ApiResult apiResult2 = (ApiResult) registerProspectToken;
                if (!(apiResult2 instanceof ApiResult.Failure)) {
                    if (apiResult2 instanceof ApiResult.Success) {
                        RegisterProspectTokenResponse registerProspectTokenResponse = (RegisterProspectTokenResponse) ((ApiResult.Success) apiResult2).response;
                        RegisterProspectTokenResponse.Status status2 = registerProspectTokenResponse.status;
                        int i17 = status2 == null ? -1 : SponsorshipRequestReferralIntroPresenter$models$2$1$WhenMappings.$EnumSwitchMapping$0[status2.ordinal()];
                        if (i17 != 1) {
                            if (i17 == 2 || i17 == 3) {
                                i = 4;
                            } else {
                                i = 4;
                                if (i17 != 4) {
                                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) status2, "Unsupported RegisterProspectTokenResponse.Status ");
                                }
                            }
                            int ordinal = status2.ordinal();
                            if (ordinal == 2) {
                                status = AliasRegistrar$Result.NotSuccessful.Status.TOO_MANY_REQUESTS;
                            } else if (ordinal == 3) {
                                status = AliasRegistrar$Result.NotSuccessful.Status.INVALID_ALIAS;
                            } else if (ordinal == i) {
                                status = AliasRegistrar$Result.NotSuccessful.Status.DUPLICATE_ALIAS;
                            } else {
                                OptionalProvider$$ExternalSyntheticLambda0.m$1(status2, "RegisterProspectTokenResponse.Status.toAliasRegistrarFailureStatus() doesn't support ");
                            }
                            successful = new AliasRegistrar$Result.NotSuccessful(status, registerProspectTokenResponse.response_context);
                        } else {
                            successful = new AliasRegistrar$Result.Successful(registerProspectTokenResponse.response_context);
                        }
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                    return null;
                }
                successful = new AliasRegistrar$Result.NetworkFailure((ApiResult.Failure) apiResult2);
                ApiResult.Success success = apiResult2 instanceof ApiResult.Success ? (ApiResult.Success) apiResult2 : null;
                RegisterProspectTokenResponse registerProspectTokenResponse2 = success != null ? (RegisterProspectTokenResponse) success.response : null;
                RegisterProspectTokenResponse.AliasType aliasType = registerProspectTokenResponse2 != null ? registerProspectTokenResponse2.alias_type : null;
                int i18 = aliasType == null ? -1 : SponsorshipRequestReferralIntroPresenter$models$2$1$WhenMappings.$EnumSwitchMapping$1[aliasType.ordinal()];
                if (i18 == -1) {
                    deliveryMechanism = null;
                } else if (i18 == 1) {
                    deliveryMechanism = AliasRegistrar$Args.DeliveryMechanism.SMS;
                } else {
                    if (i18 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    deliveryMechanism = AliasRegistrar$Args.DeliveryMechanism.EMAIL;
                }
                ImageLoader$Builder imageLoader$Builder = sponsorshipRequestReferralIntroPresenter.registerAliasResultHandler;
                if (registerProspectTokenResponse2 == null || (str2 = registerProspectTokenResponse2.redacted_alias) == null) {
                    str2 = "";
                }
                String str4 = str2;
                FontsContractCompat handleRegisterAliasResult = imageLoader$Builder.handleRegisterAliasResult(successful, str4, sponsorshipRequestReferralIntroScreen.flowToken, true, deliveryMechanism, sponsorshipRequestReferralIntroScreen, "Register Prospect Token with deliveryMechanism: " + deliveryMechanism);
                if (handleRegisterAliasResult instanceof RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging) {
                    mutableState.setValue(FormViewModel.SubmissionState.SubmissionFailed.INSTANCE);
                    screenNavigator.goTo(new FailureMessageBlockerScreen(sponsorshipRequestReferralIntroScreen.blockersData, ((RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging) handleRegisterAliasResult).message, null, 4));
                } else if (!handleRegisterAliasResult.equals(RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Handled.INSTANCE)) {
                    if (!(handleRegisterAliasResult instanceof RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation registerAliasResultHandler$RegisterAliasHandlingOutcome$Navigation = (RegisterAliasResultHandler$RegisterAliasHandlingOutcome$Navigation) handleRegisterAliasResult;
                    if (registerAliasResultHandler$RegisterAliasHandlingOutcome$Navigation.stopLoadingFirst) {
                        mutableState.setValue(FormViewModel.SubmissionState.None.INSTANCE);
                    }
                    screenNavigator.goTo(registerAliasResultHandler$RegisterAliasHandlingOutcome$Navigation.nextScreen);
                }
                return Unit.INSTANCE;
            case 8:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) cardStudioPresenter.analytics;
                    this.label = 1;
                    first = FlowKt.first(flow, this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                }
                PopupMessage popupMessage = (PopupMessage) first;
                ((MutableState) obj3).setValue(popupMessage);
                if (popupMessage != null) {
                    LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) cardStudioPresenter.cardStudioQueries;
                    String str5 = popupMessage.messageToken;
                    localTabContentQueries.getClass();
                    SafeFlow flow2 = DBUtil.toFlow(new RewardQueries.ForIdsQuery(localTabContentQueries, str5, new CardMessageQueries$$ExternalSyntheticLambda7(22), i5));
                    CoroutineContext coroutineContext2 = (CoroutineContext) cardStudioPresenter.ioContext;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$1 = new BitcoinDepositsPresenter$models$2$1$1(cardStudioPresenter, i6);
                    this.label = 2;
                    Object collect = flow2.collect(new FlowQuery$mapToOne$$inlined$map$1$2(bitcoinDepositsPresenter$models$2$1$1, coroutineContext2, 0), this);
                    if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        collect = Unit.INSTANCE;
                        break;
                    }
                } else {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2((CardStudioPresenter) this.L$0, (AppMessageViewEvent) obj3, continuation, 12);
                    this.label = 1;
                    if (PlatformKt.retryWhenRetryable$default(null, pagingDataPresenter$collectFrom$2, this, 3) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$22 = new PagingDataPresenter$collectFrom$2((GrpcMethod) this.L$0, (AppMessageViewEvent.AppMessageActionTaken) obj3, continuation, i4);
                    this.label = 1;
                    if (PlatformKt.retryWhenRetryable$default(null, pagingDataPresenter$collectFrom$22, this, 3) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$23 = new PagingDataPresenter$collectFrom$2((RealInAppNotificationPresenter) this.L$0, (AppMessageViewEvent) obj3, continuation, i3);
                    this.label = 1;
                    if (PlatformKt.retryWhenRetryable$default(null, pagingDataPresenter$collectFrom$23, this, 3) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                n nVar = (n) this.L$0;
                OnDemandMessageAnalyticsData onDemandMessageAnalyticsData = (OnDemandMessageAnalyticsData) obj3;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                try {
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        InAppMessageService inAppMessageService = (InAppMessageService) nVar.a;
                        DismissInAppMessageRequest dismissInAppMessageRequest = new DismissInAppMessageRequest(onDemandMessageAnalyticsData.campaignToken, new Long(((AndroidClock) nVar.b).millis()), onDemandMessageAnalyticsData.f1046format.name(), onDemandMessageAnalyticsData.templateToken, onDemandMessageAnalyticsData.templateVersion, ByteString.EMPTY);
                        this.label = 1;
                        dismissInAppMessage = inAppMessageService.dismissInAppMessage(dismissInAppMessageRequest, this);
                        if (dismissInAppMessage == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    } else {
                        if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        dismissInAppMessage = obj;
                    }
                    if (!(((ApiResult) dismissInAppMessage) instanceof ApiResult.Success)) {
                        Timber.Forest.d("Promoter activity message dismiss failed", new Object[0]);
                    }
                } catch (Exception e2) {
                    Timber.Forest.e("Failed to dismiss promoter activity message", new Object[0], e2);
                }
                return Unit.INSTANCE;
            case 13:
                RealTooltipAppMessagePresenter realTooltipAppMessagePresenter = (RealTooltipAppMessagePresenter) obj3;
                TooltipAppMessageViewEvent tooltipAppMessageViewEvent = (TooltipAppMessageViewEvent) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Intrinsics.areEqual(((TooltipAppMessageViewEvent.TooltipViewed) tooltipAppMessageViewEvent).messageToken, "moneybot-tooltip")) {
                        KeyValue keyValue = realTooltipAppMessagePresenter.moneybotTooltipViewed;
                        Boolean bool5 = Boolean.TRUE;
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                TooltipAppMessageViewEvent.TooltipViewed tooltipViewed = (TooltipAppMessageViewEvent.TooltipViewed) tooltipAppMessageViewEvent;
                realTooltipAppMessagePresenter.analytics.track(new AppMessageInteractView(null, AppMessageFormat.TOOLTIP, tooltipViewed.messageToken, new Long(realTooltipAppMessagePresenter.clock.millis()), 3), null);
                if (!tooltipViewed.isLocalTooltip) {
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$24 = new PagingDataPresenter$collectFrom$2(realTooltipAppMessagePresenter, tooltipAppMessageViewEvent, continuation, 15);
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 14:
                LottieCompositionResult lottieCompositionResult = (LottieCompositionResult) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String[] strArr = ProgressCircularKt.AllKeyPaths;
                    if (((LottieComposition) lottieCompositionResult.getValue()) == null) {
                        return Unit.INSTANCE;
                    }
                    ProgressCircularKt$ProgressCircular$1$1$1 progressCircularKt$ProgressCircular$1$1$1 = new ProgressCircularKt$ProgressCircular$1$1$1((LottieAnimatable) obj3, lottieCompositionResult, null);
                    this.label = 1;
                    if (JobKt.withContext(ConstantSpeedMotionDurationScale.INSTANCE, progressCircularKt$ProgressCircular$1$1$1, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new OffersNotificationKt$$ExternalSyntheticLambda3((AnchoredDraggableState) this.L$0, 6));
                    GLThread$launch$1 gLThread$launch$1 = new GLThread$launch$1((Function1) obj3, null, 4);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, gLThread$launch$1, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow models = ((Presenter.Binding) this.L$0).getModels();
                    PaymentPasscodeActivity$loadView$3$1 paymentPasscodeActivity$loadView$3$1 = new PaymentPasscodeActivity$loadView$3$1((Widget) obj3, i7);
                    this.label = 1;
                    if (models.collect(paymentPasscodeActivity$loadView$3$1, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 17:
                ActivityEvent activityEvent = (ActivityEvent) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (activityEvent.resumed) {
                        RealDeepLinkAttributionWorker realDeepLinkAttributionWorker = (RealDeepLinkAttributionWorker) obj3;
                        this.L$0 = null;
                        this.label = 1;
                        Object collect2 = realDeepLinkAttributionWorker.deepLinkState.collect(new FlowKt__MergeKt$flattenConcat$1$1(new BitcoinDepositsPresenter$models$2$1$1(realDeepLinkAttributionWorker, i5), 16), this);
                        if (collect2 != coroutineSingletons18) {
                            collect2 = Unit.INSTANCE;
                        }
                        if (collect2 != coroutineSingletons18) {
                            collect2 = Unit.INSTANCE;
                        }
                        if (collect2 == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                MutableState mutableState2 = (MutableState) obj3;
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) this.L$0;
                Analytics analytics = (Analytics) localPosCheckInPresenter.launcher;
                BenefitsLeafletSheetScreen benefitsLeafletSheetScreen = (BenefitsLeafletSheetScreen) localPosCheckInPresenter.store;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BankingBenefitsAppService bankingBenefitsAppService = (BankingBenefitsAppService) localPosCheckInPresenter.stringManager;
                    GetBenefitLeafletRequest getBenefitLeafletRequest = new GetBenefitLeafletRequest(benefitsLeafletSheetScreen.benefit, null, ByteString.EMPTY);
                    this.label = 1;
                    benefitLeaflet = bankingBenefitsAppService.getBenefitLeaflet(getBenefitLeafletRequest, this);
                    if (benefitLeaflet == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    benefitLeaflet = obj;
                }
                ApiResult apiResult3 = (ApiResult) benefitLeaflet;
                if (apiResult3 instanceof ApiResult.Success) {
                    mutableState2.setValue(new BenefitsLeafletViewModel.Loaded(((GetBenefitLeafletResponse) ((ApiResult.Success) apiResult3).response).elements));
                    analytics.track(new BenefitLeafletViewViewLeaflet(LocalPosCheckInPresenter.toAnalyticsType(benefitsLeafletSheetScreen.benefit)), null);
                }
                if (apiResult3 instanceof ApiResult.Failure) {
                    mutableState2.setValue(BenefitsLeafletViewModel.Error.INSTANCE);
                    analytics.track(new BenefitLeafletViewViewError(LocalPosCheckInPresenter.toAnalyticsType(benefitsLeafletSheetScreen.benefit)), null);
                }
                return Unit.INSTANCE;
            case 19:
                CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) cardStudioPresenter2.navigator;
                ConfirmCashOutDialogViewEvent$TapButton confirmCashOutDialogViewEvent$TapButton = (ConfirmCashOutDialogViewEvent$TapButton) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (confirmCashOutDialogViewEvent$TapButton.result != AlertDialogResult.NEGATIVE) {
                        screenNavigator2.goTo(new BlockersScreens.BalanceTransferLoading(((ConfirmCashOutScreen) cardStudioPresenter2.args).blockersData));
                        return Unit.INSTANCE;
                    }
                    RealConfirmCashOutVersionCodeProvider realConfirmCashOutVersionCodeProvider = (RealConfirmCashOutVersionCodeProvider) cardStudioPresenter2.ioContext;
                    this.label = 1;
                    Object delete = realConfirmCashOutVersionCodeProvider.confirmCashOutVersionCode.delete(this);
                    if (delete != coroutineSingletons20) {
                        delete = Unit.INSTANCE;
                    }
                    if (delete == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                screenNavigator2.goTo(new Finish(confirmCashOutDialogViewEvent$TapButton.result));
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.L$0;
                    OverdraftStatus overdraftStatus = (OverdraftStatus) ((MutableState) obj3).getValue();
                    overdraftStatus.getClass();
                    this.label = 1;
                    OverdraftlyService overdraftlyService = (OverdraftlyService) localHomePresenter.store;
                    Analytics analytics2 = (Analytics) localHomePresenter.clearMarketingBadgesIfNeeded;
                    OverdraftStatus.State_ state_ = overdraftStatus.State;
                    if (state_ != null) {
                        OverdraftStatus.State_.Upsell upsell2 = state_ instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_ : null;
                        if (upsell2 != null) {
                            upsell = upsell2.value;
                            if (upsell == null) {
                                if (state_ != null) {
                                    OverdraftStatus.State_.PermanentlyDisabled permanentlyDisabled2 = state_ instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_ : null;
                                    if (permanentlyDisabled2 != null) {
                                        permanentlyDisabled = permanentlyDisabled2.value;
                                        if (permanentlyDisabled == null) {
                                            if (state_ != null) {
                                                OverdraftStatus.State_.Eligible eligible = state_ instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_ : null;
                                                OverdraftStatus.Eligible eligible2 = eligible != null ? eligible.value : null;
                                                if (eligible2 != null && (toggleButton3 = eligible2.toggle_button) != null && (action3 = toggleButton3.action) != null && (moneyTabBookletKt3 = action3.action) != null) {
                                                    OverdraftStatus$Action$Action$ActivateOverdraftAction overdraftStatus$Action$Action$ActivateOverdraftAction = moneyTabBookletKt3 instanceof OverdraftStatus$Action$Action$ActivateOverdraftAction ? (OverdraftStatus$Action$Action$ActivateOverdraftAction) moneyTabBookletKt3 : null;
                                                    if (overdraftStatus$Action$Action$ActivateOverdraftAction == null) {
                                                        message = null;
                                                        break;
                                                    } else {
                                                        message = overdraftStatus$Action$Action$ActivateOverdraftAction.value;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (state_ != null) {
                                                OverdraftStatus.State_.Disabled disabled = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : null;
                                                OverdraftStatus.Disabled disabled2 = disabled != null ? disabled.value : null;
                                                if (disabled2 != null && (toggleButton2 = disabled2.toggle_button) != null && (action2 = toggleButton2.action) != null && (moneyTabBookletKt2 = action2.action) != null) {
                                                    OverdraftStatus$Action$Action$EnableOverdraftAction overdraftStatus$Action$Action$EnableOverdraftAction = moneyTabBookletKt2 instanceof OverdraftStatus$Action$Action$EnableOverdraftAction ? (OverdraftStatus$Action$Action$EnableOverdraftAction) moneyTabBookletKt2 : null;
                                                    if (overdraftStatus$Action$Action$EnableOverdraftAction != null) {
                                                        message = overdraftStatus$Action$Action$EnableOverdraftAction.value;
                                                        if (message == null) {
                                                            if (state_ != null) {
                                                                OverdraftStatus.State_.Activated activated = state_ instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_ : null;
                                                                OverdraftStatus.Activated activated2 = activated != null ? activated.value : null;
                                                                if (activated2 != null && (toggleButton = activated2.toggle_button) != null && (action = toggleButton.action) != null && (moneyTabBookletKt = action.action) != null) {
                                                                    OverdraftStatus$Action$Action$DisableOverdraftAction overdraftStatus$Action$Action$DisableOverdraftAction = moneyTabBookletKt instanceof OverdraftStatus$Action$Action$DisableOverdraftAction ? (OverdraftStatus$Action$Action$DisableOverdraftAction) moneyTabBookletKt : null;
                                                                    if (overdraftStatus$Action$Action$DisableOverdraftAction != null) {
                                                                        message = overdraftStatus$Action$Action$DisableOverdraftAction.value;
                                                                    }
                                                                }
                                                            }
                                                            message = null;
                                                        }
                                                        if (message instanceof OverdraftStatus.Action.ActivateOverdraftAction) {
                                                            if (message instanceof OverdraftStatus.Action.DisableOverdraftAction) {
                                                                analytics2.track(new OverdraftCoverageManageToggleEnabled(OverdraftCoverageManageToggleEnabled.Enabled.False), null);
                                                                obj2 = overdraftlyService.toggleOverdraft(ComposeUtilsKt.ToggleOverdraftRequest$default(null, new ToggleOverdraftRequest.Disable(), 13), this);
                                                                if (obj2 != coroutineSingletons21) {
                                                                    obj2 = Unit.INSTANCE;
                                                                }
                                                                if (obj2 != coroutineSingletons21) {
                                                                    obj2 = Unit.INSTANCE;
                                                                }
                                                            } else if (message instanceof OverdraftStatus.Action.EnableOverdraftAction) {
                                                                analytics2.track(new OverdraftCoverageManageToggleEnabled(OverdraftCoverageManageToggleEnabled.Enabled.True), null);
                                                                obj2 = overdraftlyService.toggleOverdraft(ComposeUtilsKt.ToggleOverdraftRequest$default(new ToggleOverdraftRequest.Enable(), null, 14), this);
                                                                if (obj2 != coroutineSingletons21) {
                                                                    obj2 = Unit.INSTANCE;
                                                                }
                                                                if (obj2 != coroutineSingletons21) {
                                                                    obj2 = Unit.INSTANCE;
                                                                }
                                                            } else if (message == null) {
                                                                a$$ExternalSyntheticBUOutline0.m$1("The server should always send down an action!");
                                                                return null;
                                                            }
                                                            if (obj2 == coroutineSingletons21) {
                                                                return coroutineSingletons21;
                                                            }
                                                        } else {
                                                            ((RealRouter) localHomePresenter.tabContentPresenterFactory).route(new RoutingParams(null, null, null, null, null, null, 511), ((OverdraftStatus.Action.ActivateOverdraftAction) message).client_route_url);
                                                        }
                                                        obj2 = Unit.INSTANCE;
                                                        if (obj2 == coroutineSingletons21) {
                                                        }
                                                    }
                                                }
                                            }
                                            message = null;
                                            if (message == null) {
                                            }
                                            if (message instanceof OverdraftStatus.Action.ActivateOverdraftAction) {
                                            }
                                            obj2 = Unit.INSTANCE;
                                            if (obj2 == coroutineSingletons21) {
                                            }
                                        }
                                    }
                                }
                                permanentlyDisabled = null;
                                if (permanentlyDisabled == null) {
                                }
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("We should not be receiving toggle button events in this state!");
                            return null;
                        }
                    }
                    upsell = null;
                    if (upsell == null) {
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("We should not be receiving toggle button events in this state!");
                    return null;
                }
                if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalHomePresenter localHomePresenter2 = (LocalHomePresenter) this.L$0;
                    BitcoinDisplayUnits bitcoinDisplayUnits = ((BitcoinDisplayCurrencyViewEvent.BitcoinDisplayUnitsSelected) ((BitcoinDisplayCurrencyViewEvent) obj3)).units;
                    this.label = 1;
                    if (((RealProfileManager) localHomePresenter2.store).setBitcoinDisplayPreference(bitcoinDisplayUnits, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBitcoinPayInUsdPreferenceManager realBitcoinPayInUsdPreferenceManager = (RealBitcoinPayInUsdPreferenceManager) ((CardStudioPresenter) this.L$0).ioContext;
                    BitcoinPayInUsdPreference bitcoinPayInUsdPreference = (BitcoinPayInUsdPreference) ((State) obj3).getValue();
                    BitcoinPayInUsdPreference bitcoinPayInUsdPreference2 = BitcoinPayInUsdPreference.Disabled.INSTANCE;
                    boolean areEqual = Intrinsics.areEqual(bitcoinPayInUsdPreference, bitcoinPayInUsdPreference2);
                    BitcoinPayInUsdPreference.Enabled enabled = BitcoinPayInUsdPreference.Enabled.INSTANCE;
                    if (areEqual) {
                        bitcoinPayInUsdPreference2 = enabled;
                    } else if (!Intrinsics.areEqual(bitcoinPayInUsdPreference, enabled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    this.label = 1;
                    if (realBitcoinPayInUsdPreferenceManager.setPreference(bitcoinPayInUsdPreference2, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                return invokeSuspend$com$squareup$cash$bitcoin$presenters$RealBitcoinKeypadStateStore$models$1$1(obj);
            case 24:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileManager realProfileManager = (RealProfileManager) ((StuckPlayerDetector) this.L$0).playerListener;
                    this.label = 1;
                    bitcoinAmountEntryCurrencyPreference = realProfileManager.bitcoinAmountEntryCurrencyPreference(this);
                    if (bitcoinAmountEntryCurrencyPreference == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    bitcoinAmountEntryCurrencyPreference = obj;
                }
                ((MutableState) obj3).setValue(Boolean.valueOf(((CurrencyCode) bitcoinAmountEntryCurrencyPreference) != CurrencyCode.BTC));
                return Unit.INSTANCE;
            case 25:
                return invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$education$BitcoinStoriesWidgetPresenter$models$storiesResponse$2$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$graph$BitcoinGraphWidgetPresenter$models$1$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$map$BitcoinMapCardWidgetPresenter$models$1$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$bitcoin$presenters$applet$stackingtools$BitcoinStackingToolsPresenter$models$2$1(obj);
            default:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.L$0;
                    CoroutineContext coroutineContext3 = (CoroutineContext) disclosurePresenter.stringManager;
                    AmountBlockerPresenter$models$1$2 amountBlockerPresenter$models$1$2 = new AmountBlockerPresenter$models$1$2(disclosurePresenter, (MutableState) obj3, continuation, 11);
                    this.label = 1;
                    if (JobKt.withContext(coroutineContext3, amountBlockerPresenter$models$1$2, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MLKitTitleGenerator$prepareModel$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
