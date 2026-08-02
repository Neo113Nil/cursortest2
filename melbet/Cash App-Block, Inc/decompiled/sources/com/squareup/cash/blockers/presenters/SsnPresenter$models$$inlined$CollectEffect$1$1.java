package com.squareup.cash.blockers.presenters;

import android.content.Context;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.R;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemConfirmed;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemSelected;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$HelpClicked;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneyChanged;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinLandingPresenter;
import com.squareup.cash.bitcoin.presenters.send.SendBitcoinNavigator;
import com.squareup.cash.bitcoin.presenters.stablecoin.LegacyStablecoinDepositPresenter$DepositAddress;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinSendRestrictionScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositCopyScreen;
import com.squareup.cash.bitcoin.viewmodels.applet.map.BitcoinMapCardWidgetViewEvent$OnCardClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendRestrictionViewEvent;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinLandingViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewEvent;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.data.BlockersDataKt;
import com.squareup.cash.blockers.presenters.BankAccountLinkingPresenter;
import com.squareup.cash.blockers.presenters.PromotionPanePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewEvent;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.BirthdayEvent$Submit;
import com.squareup.cash.blockers.viewmodels.ConfirmPaymentViewEvent;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.IdvViewEvent;
import com.squareup.cash.blockers.viewmodels.IdvViewModel;
import com.squareup.cash.blockers.viewmodels.IneligibleMergeResult;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.blockers.viewmodels.PlaidLinkViewEvent;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.SetAddressViewEvent;
import com.squareup.cash.blockers.viewmodels.SetNameEvent;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$InputValidationFailed;
import com.squareup.cash.blockers.viewmodels.SetPinViewEvent;
import com.squareup.cash.blockers.viewmodels.SignatureViewEvent;
import com.squareup.cash.blockers.viewmodels.SsnViewEvent;
import com.squareup.cash.blockers.viewmodels.StatusResultViewEvent;
import com.squareup.cash.blockers.viewmodels.StripeLinkViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyAliasViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentViewEvent;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.borrow.applets.presenters.BorrowAppletTileViewEvent$BorrowAppletOnClickTile;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.borrow.presenters.LoanAmountPickerPresenter;
import com.squareup.cash.borrow.presenters.LoanAmountPickerPresenter$handleEvent$1;
import com.squareup.cash.borrow.screens.LoanAmountPicker;
import com.squareup.cash.borrow.viewmodels.LoanSelectorItem;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$2$2;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.ListIndices;
import com.squareup.cash.card.onboarding.screens.CardStudioExitDialogScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioUndoDialogScreen;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStamps;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.account.AccountRecoveryStart;
import com.squareup.cash.cdf.alias.AliasVerifyEdit;
import com.squareup.cash.cdf.alias.AliasVerifyRequireHelp;
import com.squareup.cash.cdf.alias.AliasVerifySkip;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractSkipBlocker;
import com.squareup.cash.cdf.cash.CashSendConfirm;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapCashtag;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapDraw;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapPattern;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapPatternCommit;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapPatternSlider;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTapStamps;
import com.squareup.cash.cdf.cashcard.CustomizeMode;
import com.squareup.cash.cdf.crypto.CryptoAllocatePayrollSetupDirectDeposit;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.earnings.EarningsOnboardingTapDone;
import com.squareup.cash.cdf.earnings.EarningsOnboardingTapManageCustomers;
import com.squareup.cash.cdf.earnings.EarningsOnboardingTapUpsellContinue;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.notificationsoptin.NotificationsOptInTapOptInCta;
import com.squareup.cash.cdf.notificationsoptin.NotificationsOptInTapSkipCta;
import com.squareup.cash.cdf.promotionpane.PromotionPaneSelectInviteFriends;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupOrigin;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupScreen;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PasscodeResetFlow;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$AppMessageErrorScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.securitysignals.backend.RealSecuritySignalsAggregator;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.GpsLocationConsentBlocker;
import com.squareup.protos.franklin.api.NotificationCategory;
import com.squareup.protos.franklin.api.SharingContent;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.RegisterAppMessageActionRequest;
import com.squareup.protos.franklin.app.VerifyIdentityRequest;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.android.Intents;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.workflow1.ui.TextControllerKt;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class SsnPresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ Object $$this$LaunchedEffect;
    public final /* synthetic */ Object $idvEvents$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ SsnPresenter$models$$inlined$CollectEffect$1$1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.this$0 = obj2;
        this.$idvEvents$inlined = obj3;
        this.$$this$LaunchedEffect = obj;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$SetNamePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Object obj2 = this.$idvEvents$inlined;
        MutableState mutableState = (MutableState) obj2;
        CardLockPresenter cardLockPresenter = (CardLockPresenter) this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = cardLockPresenter.navigator;
        BlockersScreens.SetNameScreen setNameScreen = (BlockersScreens.SetNameScreen) cardLockPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        SetNameEvent setNameEvent = (SetNameEvent) obj;
        Continuation continuation2 = null;
        if (setNameEvent instanceof SetNameEvent.NameSubmitted) {
            CharSequence trim = StringsKt.trim(((SetNameEvent.NameSubmitted) setNameEvent).name);
            if (!StringsKt.isBlank(trim)) {
                int length = trim.length();
                int i = setNameScreen.minLength;
                if (length >= i && (setNameScreen.maxLength <= i || trim.length() <= setNameScreen.maxLength)) {
                    JobKt.launch$default(coroutineScope, null, null, new RealIdvPresenter$models$1$1(cardLockPresenter, trim, setNameEvent, (MutableState) obj2, null), 3);
                }
            }
            mutableState.setValue(SetNameViewModel.copy$default((SetNameViewModel) mutableState.getValue(), SetNameViewModel$Event$InputValidationFailed.INSTANCE, null, 510));
        } else if (setNameEvent instanceof SetNameEvent.FooterUrlClicked) {
            ((IntentLauncher) cardLockPresenter.deviceLockAnimationBus).launchUrlInInternalBrowser(((SetNameEvent.FooterUrlClicked) setNameEvent).url);
        } else if (setNameEvent instanceof SetNameEvent.HelpButtonClicked) {
            List list = setNameScreen.helpItems;
            if (list != null && !list.isEmpty()) {
                screenNavigator.goTo(new BlockersScreens.HelpOptions.Impl(setNameScreen.blockersData, list));
            }
        } else if (setNameEvent instanceof SetNameEvent.HelpItemClick) {
            if (setNameScreen.blockersData.clientScenario != null) {
                JobKt.launch$default(coroutineScope, null, null, new PasscodePresenter$models$1$2(cardLockPresenter, setNameEvent, mutableState, continuation2, 28), 3);
            }
        } else {
            if (!(setNameEvent instanceof SetNameEvent.GoBack)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Screen back = ((BlockersDataNavigator) cardLockPresenter.cardLockFlowTypeProvider).getBack(setNameScreen, setNameScreen.blockersData);
            if (back == null) {
                back = Back.INSTANCE;
            }
            screenNavigator.goTo(back);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$SetPinPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        SetPinPresenter setPinPresenter = (SetPinPresenter) this.$$this$LaunchedEffect;
        BetterNavigator.ScreenNavigator screenNavigator = setPinPresenter.navigator;
        BlockersScreens.SetPinScreen setPinScreen = setPinPresenter.screen;
        SetPinViewEvent setPinViewEvent = (SetPinViewEvent) obj;
        if (setPinViewEvent instanceof SetPinViewEvent.SubmitPin) {
            MutableState mutableState = (MutableState) this.this$0;
            mutableState.setValue(VersionedKt.update((Versioned) mutableState.getValue(), ((SetPinViewEvent.SubmitPin) setPinViewEvent).pin));
        } else if (Intrinsics.areEqual(setPinViewEvent, SetPinViewEvent.PrimaryButtonClicked.INSTANCE)) {
            Analytics analytics = setPinPresenter.analytics;
            BlockersData blockersData = setPinScreen.blockersData;
            String str = blockersData.flowToken;
            ClientScenario clientScenario = blockersData.clientScenario;
            String analyticsName = clientScenario != null ? BlockerFlowAnalyticsHelperKt.analyticsName(clientScenario, blockersData.flowType) : null;
            Flow$Type flow$Type = setPinScreen.blockersData.flowType;
            analytics.track(new BlockerFlowInteractSkipBlocker(setPinScreen.blockersData.getNextBlockerId(), setPinScreen.blockersData.getNextBlockerType(), analyticsName, flow$Type != null ? flow$Type.name() : null, str), null);
            screenNavigator.goTo(setPinPresenter.blockersNavigator.getSkip(setPinScreen, setPinScreen.blockersData));
        } else if (Intrinsics.areEqual(setPinViewEvent, SetPinViewEvent.HelpButtonClicked.INSTANCE)) {
            screenNavigator.goTo(new BlockersScreens.PasscodeHelpScreen(setPinScreen.blockersData));
        } else {
            if (!Intrinsics.areEqual(setPinViewEvent, SetPinViewEvent.ForgotPasscodeHelpItemSelected.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            MutableState mutableState2 = (MutableState) this.$idvEvents$inlined;
            Integer num = (Integer) mutableState2.getValue();
            mutableState2.setValue(new Integer((num != null ? num.intValue() : 0) + 1));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object emit$com$squareup$cash$blockers$presenters$StatusResultPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Screen profileFor;
        BlockersScreens.StartFlowEntryPoint startProfileLinkingFlow;
        StatusResultPresenter statusResultPresenter = (StatusResultPresenter) this.this$0;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        StatusResultViewEvent statusResultViewEvent = (StatusResultViewEvent) obj;
        BlockersScreens.StartFlowEntryPointScreen.Origin origin = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (statusResultViewEvent instanceof StatusResultViewEvent.ButtonClick) {
            JobKt.launch$default(coroutineScope, null, null, new FileBlockerView$6$2$2(statusResultPresenter, statusResultViewEvent, (MutableState) this.$idvEvents$inlined, objArr5 == true ? 1 : 0, 3), 3);
        } else if (statusResultViewEvent instanceof StatusResultViewEvent.GoBack) {
            BetterNavigator.ScreenNavigator screenNavigator = statusResultPresenter.navigator;
            BlockersDataNavigator blockersDataNavigator = statusResultPresenter.blockersNavigator;
            BlockersScreens.StatusResultScreen statusResultScreen = statusResultPresenter.args;
            Screen back = blockersDataNavigator.getBack(statusResultScreen, statusResultScreen.getBlockersData());
            if (back == null) {
                back = Back.INSTANCE;
            }
            screenNavigator.goTo(back);
        } else {
            if (!(statusResultViewEvent instanceof StatusResultViewEvent.PromotionsSelected)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            PromotionPanePresenter promotionPanePresenter = statusResultPresenter.promotionPanePresenter;
            LayoutUpdate.Promotions promotions = ((StatusResultViewEvent.PromotionsSelected) statusResultViewEvent).promotions;
            Lazy lazy = promotionPanePresenter.flowStarter;
            BlockersScreens.StatusResultScreen statusResultScreen2 = promotionPanePresenter.args;
            CoroutineScope coroutineScope2 = promotionPanePresenter.scope;
            BetterNavigator.ScreenNavigator screenNavigator2 = promotionPanePresenter.navigator;
            promotions.getClass();
            String str = promotions.token;
            AppMessageAction appMessageAction = promotions.template.primary_navigation_action;
            appMessageAction.getClass();
            promotionPanePresenter.notificationManager.notificationManager.cancel(str, 2);
            JobKt.launch$default(coroutineScope2, null, null, new PasscodePresenter$models$1$2(promotionPanePresenter, new RegisterAppMessageActionRequest(str, appMessageAction.action_identifier, ByteString.EMPTY), appMessageAction, objArr4 == true ? 1 : 0, 16), 3);
            AppMessageAction.Action action = appMessageAction.action;
            if (action == null) {
                action = ProtoDefaults.APP_MESSAGE_ACTION_ACTION;
            }
            int i = PromotionPanePresenter.WhenMappings.$EnumSwitchMapping$2[action.ordinal()];
            Account account = Account.INSTANCE;
            PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home = PaymentScreens$HomeScreens$Home.INSTANCE;
            switch (i) {
                case 1:
                case 2:
                case 5:
                case 16:
                    break;
                case 3:
                case 4:
                    String str2 = appMessageAction.action_argument;
                    str2.getClass();
                    promotionPanePresenter.routerFactory.create$1(screenNavigator2).route(new RoutingParams(null, null, null, null, null, null, 511), str2);
                    break;
                case 6:
                    String str3 = appMessageAction.action_argument;
                    str3.getClass();
                    ClientScenario valueOf = ClientScenario.valueOf(str3);
                    ScenarioPlan scenarioPlan = appMessageAction.scenario_plan;
                    BlockersData.Flow flow = BlockersData.Flow.PROFILE_BLOCKERS;
                    if (scenarioPlan == null) {
                        int i2 = PromotionPanePresenter.WhenMappings.$EnumSwitchMapping$0[valueOf.ordinal()];
                        if (i2 == 6) {
                            screenNavigator2.goTo(new PaymentScreens$HomeScreens$AppMessageErrorScreen(R.string.app_message_change_passcode_invalid));
                            break;
                        } else if (i2 == 7) {
                            screenNavigator2.goTo(new PaymentScreens$HomeScreens$AppMessageErrorScreen(R.string.app_message_create_passcode_invalid));
                            break;
                        } else if (i2 == 8) {
                            if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) promotionPanePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$PasscodeResetFlow.INSTANCE)).enabled()) {
                                BlockersData.Flow.INSTANCE.getClass();
                                JobKt.launch$default(coroutineScope2, null, null, new SsnPresenter$models$2$2(promotionPanePresenter, BlockersData.Flow.Companion.generateToken(), objArr == true ? 1 : 0, 24), 3);
                                break;
                            } else {
                                screenNavigator2.goTo(((RealFlowStarter) ((FlowStarter) lazy.getValue())).startPasscodeFlow(Flow$Type.RESET_PASSCODE, new Finish(null)));
                                break;
                            }
                        } else {
                            BlockersHelper.launchClientScenario$default(promotionPanePresenter.blockersHelper, flow, valueOf, paymentScreens$HomeScreens$Home, null, null, null, false, null, null, false, 4008);
                            break;
                        }
                    } else {
                        RealFlowStarter realFlowStarter = (RealFlowStarter) ((FlowStarter) lazy.getValue());
                        realFlowStarter.getClass();
                        valueOf.getClass();
                        BlockersData.Flow.INSTANCE.getClass();
                        screenNavigator2.goTo(realFlowStarter.startProfileBlockersFlow(valueOf, BlockersData.Flow.Companion.generateToken(), scenarioPlan, paymentScreens$HomeScreens$Home));
                        break;
                    }
                case 7:
                    screenNavigator2.goTo(account);
                    break;
                case 8:
                    screenNavigator2.goTo(ActivityScreen.INSTANCE);
                    break;
                case 9:
                    LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                    String str4 = appMessageAction.action_argument;
                    str4.getClass();
                    profileFor = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(str4), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : null, RealUuidGenerator.generate(), GetProfileDetailsContext.UNKNOWN, CustomerProfileViewOpen.EntryPoint.APP_MESSAGE, statusResultScreen2, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                    screenNavigator2.goTo(profileFor);
                    break;
                case 10:
                    String str5 = appMessageAction.action_argument;
                    str5.getClass();
                    screenNavigator2.goTo(new HistoryScreens.PaymentReceipt((String) CollectionsKt.first(new Regex(":").split(-1, str5)), null, null, null, null, 62));
                    break;
                case 11:
                    FlowStarter flowStarter = (FlowStarter) lazy.getValue();
                    BlockersData.Flow.INSTANCE.getClass();
                    screenNavigator2.goTo(((RealFlowStarter) flowStarter).startBusinessAccountOnboardingFlow(account, C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_UNSPECIFIED, BlockersData.Flow.Companion.generateToken()));
                    break;
                case 12:
                    Context context = promotionPanePresenter.context;
                    RealIntentFactory realIntentFactory = promotionPanePresenter.intentFactory;
                    SharingContent sharingContent = appMessageAction.sharing_content;
                    sharingContent.getClass();
                    String str6 = sharingContent.default_text;
                    str6.getClass();
                    Intents.maybeStartActivity(context, RealIntentFactory.createTextIntent$default(realIntentFactory, str6, null, 6), new CameraX$$ExternalSyntheticLambda0(context, 12));
                    break;
                case 13:
                    promotionPanePresenter.analytics.track(new PromotionPaneSelectInviteFriends(), null);
                    FlowStarter flowStarter2 = (FlowStarter) lazy.getValue();
                    ClientScenario clientScenario = statusResultScreen2.getBlockersData().clientScenario;
                    int i3 = clientScenario != null ? PromotionPanePresenter.WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()] : -1;
                    if (i3 == 1) {
                        origin = BlockersScreens.StartFlowEntryPointScreen.Origin.PROFILE;
                    } else if (i3 == 2) {
                        origin = BlockersScreens.StartFlowEntryPointScreen.Origin.ACTIVITY;
                    } else if (i3 == 3 || i3 == 4) {
                        origin = BlockersScreens.StartFlowEntryPointScreen.Origin.ONBOARDING;
                    } else if (i3 == 5) {
                        origin = BlockersScreens.StartFlowEntryPointScreen.Origin.PAYMENT;
                    }
                    screenNavigator2.goTo(((RealFlowStarter) flowStarter2).startInviteFlow(paymentScreens$HomeScreens$Home, origin));
                    break;
                case 14:
                    screenNavigator2.goTo(new BlockersScreens.UpgradeConfirmationScreen(BlockersData.DUMMY));
                    break;
                case 15:
                    FlowStarter flowStarter3 = (FlowStarter) lazy.getValue();
                    String str7 = appMessageAction.action_argument;
                    str7.getClass();
                    startProfileLinkingFlow = ((RealFlowStarter) flowStarter3).startProfileLinkingFlow(RealMoneyNavigatorHelper.moneyTabScreen(), CashInstrumentType.valueOf(str7), (String) null);
                    screenNavigator2.goTo(startProfileLinkingFlow);
                    break;
                case 17:
                    String str8 = appMessageAction.action_argument;
                    str8.getClass();
                    int ordinal = UiAlias.Type.valueOf(str8).ordinal();
                    if (ordinal == 0) {
                        screenNavigator2.goTo(FlowStarter.startRegisterSmsFlow$default((FlowStarter) lazy.getValue(), paymentScreens$HomeScreens$Home, null, 14));
                        break;
                    } else {
                        if (ordinal != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m("Unknown register alias type ", appMessageAction.action_argument));
                            return null;
                        }
                        screenNavigator2.goTo(FlowStarter.startRegisterEmailFlow$default((FlowStarter) lazy.getValue(), paymentScreens$HomeScreens$Home, null, 14));
                        break;
                    }
                case 18:
                    String str9 = appMessageAction.action_argument;
                    str9.getClass();
                    JobKt.launch$default(coroutineScope2, null, null, new SsnPresenter$models$2$2(promotionPanePresenter, new Regex(":").split(2, str9), objArr2 == true ? 1 : 0, 22), 3);
                    break;
                case 19:
                    JobKt.launch$default(coroutineScope2, null, null, new SsnPresenter$models$2$2(promotionPanePresenter, appMessageAction, objArr3 == true ? 1 : 0, 23), 3);
                    break;
                case 20:
                    screenNavigator2.goTo(new BitcoinHome(null, null, null, null, 15));
                    break;
                case 21:
                    JobKt.launch$default(coroutineScope2, null, null, new CardModelView.AnonymousClass1.C00581(promotionPanePresenter, null, 3), 3);
                    break;
                case 22:
                case 23:
                    String str10 = appMessageAction.action_identifier;
                    str10.getClass();
                    a$$ExternalSyntheticBUOutline0.m$1("Unknown App Action ".concat(str10));
                    return null;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$StripeLinkPresenter$models$$inlined$CollectEffect$2$1(Object obj, Continuation continuation) {
        DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.this$0;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        StripeLinkViewEvent stripeLinkViewEvent = (StripeLinkViewEvent) obj;
        if (Intrinsics.areEqual(stripeLinkViewEvent, StripeLinkViewEvent.Dismiss.INSTANCE)) {
            ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(Back.INSTANCE);
        } else {
            Continuation continuation2 = null;
            if (Intrinsics.areEqual(stripeLinkViewEvent, StripeLinkViewEvent.WaitingForParams.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new SsnPresenter$models$2$2(disclosurePresenter, (MutableState) this.$idvEvents$inlined, continuation2, 29), 3);
            } else {
                if (!(stripeLinkViewEvent instanceof StripeLinkViewEvent.ReceivedResult)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                JobKt.launch$default(coroutineScope, null, null, new PlaidLinkView.AnonymousClass2(disclosurePresenter, stripeLinkViewEvent, continuation2, 1), 3);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$VerifyAliasPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$idvEvents$inlined;
        VerifyAliasPresenter verifyAliasPresenter = (VerifyAliasPresenter) this.this$0;
        Analytics analytics = verifyAliasPresenter.analytics;
        BlockersDataNavigator blockersDataNavigator = verifyAliasPresenter.blockersNavigator;
        BetterNavigator.ScreenNavigator screenNavigator = verifyAliasPresenter.navigator;
        BlockersScreens.VerifyAliasScreen verifyAliasScreen = verifyAliasPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        VerifyAliasViewEvent verifyAliasViewEvent = (VerifyAliasViewEvent) obj;
        Continuation continuation2 = null;
        if (verifyAliasViewEvent instanceof VerifyAliasViewEvent.SubmitCode) {
            JobKt.launch$default(coroutineScope, null, null, new VerifyAliasPresenter$models$3$1(verifyAliasPresenter, verifyAliasViewEvent, mutableState, continuation2, 0), 3);
        } else {
            int i = 0;
            if (Intrinsics.areEqual(verifyAliasViewEvent, VerifyAliasViewEvent.Help.INSTANCE)) {
                UserJourneyTracker userJourneyTracker = verifyAliasPresenter.userJourneyTracker;
                UserJourneyTracker.Companion companion = UserJourneyTracker.Companion;
                ((RealUserJourneyTracker) userJourneyTracker).addFrictionSignal(null, UserJourney$Friction.RequiredHelp.INSTANCE);
                BlockersScreens.VerifyAliasScreen.AliasType aliasType = verifyAliasScreen.aliasType;
                boolean z = verifyAliasScreen.suppressEdit;
                AliasType access$toCdfAliasType = OverlayKt.access$toCdfAliasType(aliasType);
                BlockersData blockersData = verifyAliasScreen.blockersData;
                analytics.track(new AliasVerifyRequireHelp(access$toCdfAliasType, blockersData.flowToken), null);
                ClientScenario clientScenario = blockersData.clientScenario;
                analytics.track(new AccountRecoveryStart(clientScenario != null ? clientScenario.name() : null, AccountRecoveryStart.Entrypoint.ALIAS_VERIFY, blockersData.flowToken), null);
                boolean z2 = aliasType == BlockersScreens.VerifyAliasScreen.AliasType.SMS;
                screenNavigator.goTo(new BlockersScreens.VerifyHelpScreen(verifyAliasScreen.blockersData, verifyAliasScreen.helpItems, z2 ? BlockersScreens.VerifyHelpScreen.Type.PHONE : BlockersScreens.VerifyHelpScreen.Type.EMAIL, verifyAliasScreen.skipMessage != null, !z2 && z, z2 && z));
            } else if (verifyAliasViewEvent instanceof VerifyAliasViewEvent.HelpItemSelected) {
                JobKt.launch$default(coroutineScope, null, null, new VerifyAliasPresenter$models$3$1(verifyAliasPresenter, verifyAliasViewEvent, mutableState, continuation2, 1), 3);
            } else {
                boolean areEqual = Intrinsics.areEqual(verifyAliasViewEvent, VerifyAliasViewEvent.EditAlias.INSTANCE);
                Screen screen = Back.INSTANCE;
                if (areEqual) {
                    analytics.track(new AliasVerifyEdit(OverlayKt.access$toCdfAliasType(verifyAliasScreen.aliasType), verifyAliasScreen.blockersData.flowToken), null);
                    screenNavigator.goTo(screen);
                } else if (verifyAliasViewEvent instanceof VerifyAliasViewEvent.ResendCode) {
                    JobKt.launch$default(coroutineScope, null, null, new VerifyAliasPresenter$models$3$1(verifyAliasPresenter, verifyAliasViewEvent, mutableState, continuation2, 2), 3);
                } else if (Intrinsics.areEqual(verifyAliasViewEvent, VerifyAliasViewEvent.RequestCall.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new VerifyAliasPresenter$models$3$4(verifyAliasPresenter, mutableState, continuation2, i), 3);
                } else if (Intrinsics.areEqual(verifyAliasViewEvent, VerifyAliasViewEvent.Skip.INSTANCE)) {
                    AliasType access$toCdfAliasType2 = OverlayKt.access$toCdfAliasType(verifyAliasScreen.aliasType);
                    BlockersData blockersData2 = verifyAliasScreen.blockersData;
                    analytics.track(new AliasVerifySkip(access$toCdfAliasType2, blockersData2.flowToken), null);
                    String str = verifyAliasScreen.skipMessage;
                    str.getClass();
                    screenNavigator.goTo(new BlockersScreens.SkipVerifyScreen(blockersData2, str));
                } else if (Intrinsics.areEqual(verifyAliasViewEvent, VerifyAliasViewEvent.ConfirmSkip.INSTANCE)) {
                    screenNavigator.goTo(blockersDataNavigator.getSkip(verifyAliasScreen, verifyAliasScreen.blockersData));
                } else if (Intrinsics.areEqual(verifyAliasViewEvent, VerifyAliasViewEvent.ConfirmError.INSTANCE)) {
                    verifyAliasPresenter.exitAfterVerificationFailed();
                } else if (Intrinsics.areEqual(verifyAliasViewEvent, VerifyAliasViewEvent.DismissError.INSTANCE)) {
                    verifyAliasPresenter.exitAfterVerificationFailed();
                } else if (verifyAliasViewEvent instanceof VerifyAliasViewEvent.MergeBlockerResult) {
                    if (((VerifyAliasViewEvent.MergeBlockerResult) verifyAliasViewEvent).result == IneligibleMergeResult.Negative.INSTANCE) {
                        screenNavigator.goTo(RealSupportNavigator.startSupportFlow$default(verifyAliasPresenter.supportNavigator, null, null, PaymentScreens$HomeScreens$Home.INSTANCE, SupportNavigator$Source.BLOCKER_FLOW, null, null, 103));
                    } else {
                        screenNavigator.goTo(blockersDataNavigator.getSkip(verifyAliasScreen, verifyAliasScreen.blockersData));
                    }
                } else if (verifyAliasViewEvent instanceof VerifyAliasViewEvent.MergeBlockerCancelled) {
                    screenNavigator.goTo(blockersDataNavigator.getSkip(verifyAliasScreen, verifyAliasScreen.blockersData));
                } else if (Intrinsics.areEqual(verifyAliasViewEvent, VerifyAliasViewEvent.GoBack.INSTANCE)) {
                    Screen back = blockersDataNavigator.getBack(verifyAliasScreen, verifyAliasScreen.blockersData);
                    if (back != null) {
                        screen = back;
                    }
                    screenNavigator.goTo(screen);
                } else if (Intrinsics.areEqual(verifyAliasViewEvent, VerifyAliasViewEvent.Dismiss.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new CardModelView.AnonymousClass1.C00581(verifyAliasPresenter, null, 10), 3);
                } else {
                    if (!(verifyAliasViewEvent instanceof VerifyAliasViewEvent.BlockerActionClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope, null, null, new PlaidLinkView.AnonymousClass2(verifyAliasPresenter, verifyAliasViewEvent, continuation2, 2), 3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$VerifyInstrumentPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$idvEvents$inlined;
        LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
        BlockersScreens.VerifyCardScreen verifyCardScreen = (BlockersScreens.VerifyCardScreen) localHomePresenter.tabContentPresenterFactory;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        VerifyInstrumentViewEvent verifyInstrumentViewEvent = (VerifyInstrumentViewEvent) obj;
        Continuation continuation2 = null;
        if (verifyInstrumentViewEvent instanceof VerifyInstrumentViewEvent.SubmitCardNumber) {
            JobKt.launch$default(coroutineScope, null, null, new RealBoostSelector$removeBoost$1(localHomePresenter, ((VerifyInstrumentViewEvent.SubmitCardNumber) verifyInstrumentViewEvent).cardNumber, mutableState, null), 3);
        } else if (Intrinsics.areEqual(verifyInstrumentViewEvent, VerifyInstrumentViewEvent.ShowHelpItems.INSTANCE)) {
            screenNavigator.goTo(new BlockersScreens.HelpOptions.Impl(verifyCardScreen.blockersData, verifyCardScreen.helpItems));
        } else if (verifyInstrumentViewEvent instanceof VerifyInstrumentViewEvent.SelectHelpItem) {
            JobKt.launch$default(coroutineScope, null, null, new FileBlockerView$6$2$2(localHomePresenter, verifyInstrumentViewEvent, mutableState, continuation2, 12), 3);
        } else {
            if (!Intrinsics.areEqual(verifyInstrumentViewEvent, VerifyInstrumentViewEvent.GoBack.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Screen back = ((BlockersDataNavigator) localHomePresenter.featureFlagManager).getBack(verifyCardScreen, verifyCardScreen.blockersData);
            if (back == null) {
                back = Back.INSTANCE;
            }
            screenNavigator.goTo(back);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$borrow$applets$presenters$BorrowAppletTilePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        if (((BorrowAppletTileViewEvent$BorrowAppletOnClickTile) obj) == null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) this.this$0;
        BorrowAppletTileModel borrowAppletTileModel = (BorrowAppletTileModel) ((MutableState) this.$idvEvents$inlined).getValue();
        BorrowAppletTileModel.Clickable clickable = borrowAppletTileModel instanceof BorrowAppletTileModel.Clickable ? (BorrowAppletTileModel.Clickable) borrowAppletTileModel : null;
        String clientRoute = clickable != null ? clickable.getClientRoute() : null;
        ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) localPosCheckInPresenter.store)).submitSelectItemEvent(ItemId.BORROW.INSTANCE, null, MoneySelectAction.TAP);
        JobKt.launch$default(coroutineScope, null, null, new CardModelView.AnonymousClass1.C00581(localPosCheckInPresenter, null, 14), 3);
        MoneyTabScreen moneyTabScreen = RealMoneyNavigatorHelper.moneyTabScreen();
        ((RealRouter) localPosCheckInPresenter.navigator).route(new RoutingParams(moneyTabScreen, BlockersData.AnalyticsData.Source.MONEY_TAB.getAnalyticsName(), moneyTabScreen, null, null, null, 500), clientRoute);
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$borrow$presenters$LoanAmountPickerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
        LoanAmountPickerPresenter loanAmountPickerPresenter = (LoanAmountPickerPresenter) this.this$0;
        MutableState mutableState = (MutableState) this.$idvEvents$inlined;
        BetterNavigator.ScreenNavigator screenNavigator = loanAmountPickerPresenter.navigator;
        if (Intrinsics.areEqual(amountPickerViewEvent, AmountPickerViewEvent$Full$Close.INSTANCE) || Intrinsics.areEqual(amountPickerViewEvent, AmountPickerViewEvent$Full$SystemBack.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemSelected) {
            AmountSelectorWidgetModel.Item item = ((AmountPickerViewEvent$Condensed$ItemSelected) amountPickerViewEvent).item;
            item.getClass();
            if (((LoanSelectorItem) item) instanceof LoanSelectorItem.CustomAmount) {
                screenNavigator.goTo(new LoanAmountPicker.LoanAmountPickerFull(loanAmountPickerPresenter.args.getLoanData(), loanAmountPickerPresenter.flowToken));
            }
        } else {
            Continuation continuation2 = null;
            if (amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemConfirmed) {
                JobKt.launch$default(coroutineScope, null, null, new LoanAmountPickerPresenter$handleEvent$1(loanAmountPickerPresenter, amountPickerViewEvent, mutableState, continuation2, 0), 3);
            } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneySubmitted) {
                JobKt.launch$default(coroutineScope, null, null, new LoanAmountPickerPresenter$handleEvent$1(loanAmountPickerPresenter, amountPickerViewEvent, mutableState, continuation2, 1), 3);
            } else if (!(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$HelpClicked) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneyChanged) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$borrow$presenters$RepayCustomAmountPickerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.this$0;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
        if ((amountPickerViewEvent instanceof AmountPickerViewEvent$Full$Close) || (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$SystemBack)) {
            ((BetterNavigator.ScreenNavigator) endAppLockPresenter.accountOutboundNavigator).goTo(Back.INSTANCE);
        } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneySubmitted) {
            JobKt.launch$default(coroutineScope, null, null, new FileBlockerView$6$2$2(endAppLockPresenter, amountPickerViewEvent, (ParcelableSnapshotMutableIntState) this.$idvEvents$inlined, null, 29), 3);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$card$onboarding$CardStudioPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$idvEvents$inlined;
        CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
        Analytics analytics = (Analytics) cardStudioPresenter.analytics;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        CardStudioViewEvent cardStudioViewEvent = (CardStudioViewEvent) obj;
        Continuation continuation2 = null;
        if (Intrinsics.areEqual(cardStudioViewEvent, CardStudioViewEvent.Exit.INSTANCE)) {
            JobKt.launch$default(coroutineScope, null, null, new CardModelView.AnonymousClass1.C00581(cardStudioPresenter, null, 17), 3);
        } else if (Intrinsics.areEqual(cardStudioViewEvent, CardStudioViewEvent.ShowExitDialog.INSTANCE)) {
            screenNavigator.goTo(new CardStudioExitDialogScreen(null));
        } else if (cardStudioViewEvent instanceof CardStudioViewEvent.ShowStamps) {
            analytics.track(new CashCardCustomizeTapStamps(Boolean.valueOf(((CardStudioViewEvent.ShowStamps) cardStudioViewEvent).mode instanceof CardStudioViewModel.CustomizationMode.Pattern)), null);
            screenNavigator.goTo(new PatternSignatureStamps(((CardStudioScreen) cardStudioPresenter.args).availableStamps));
        } else if (cardStudioViewEvent instanceof CardStudioViewEvent.ShowUndoDialog) {
            screenNavigator.goTo(CardStudioUndoDialogScreen.INSTANCE);
        } else if (cardStudioViewEvent instanceof CardStudioViewEvent.SetCustomizationMode) {
            CardStudioViewModel.CustomizationMode customizationMode = ((CardStudioViewEvent.SetCustomizationMode) cardStudioViewEvent).mode;
            analytics.track(new CashCardCustomizeTapDraw(((customizationMode instanceof CardStudioViewModel.CustomizationMode.DRAW) || (customizationMode instanceof CardStudioViewModel.CustomizationMode.Pattern.DRAW)) ? CustomizeMode.DRAW : CustomizeMode.STAMP, Boolean.valueOf(customizationMode instanceof CardStudioViewModel.CustomizationMode.Pattern)), null);
            CardStudioViewModel cardStudioViewModel = (CardStudioViewModel) mutableState.getValue();
            cardStudioViewModel.getClass();
            mutableState.setValue(CardStudioViewModel.Content.copy$default((CardStudioViewModel.Content) cardStudioViewModel, false, customizationMode, false, 895));
        } else if (cardStudioViewEvent instanceof CardStudioViewEvent.DoneCustomizing) {
            JobKt.launch$default(coroutineScope, null, null, new CardStudioPresenter$models$2$2(cardStudioPresenter, cardStudioViewEvent, mutableState, continuation2, 0), 3);
        } else if (cardStudioViewEvent instanceof CardStudioViewEvent.UpdateTempCustomization) {
            JobKt.launch$default(coroutineScope, null, null, new CardStudioPresenter$models$2$2(cardStudioPresenter, cardStudioViewEvent, mutableState, continuation2, 1), 3);
        } else {
            if (Intrinsics.areEqual(cardStudioViewEvent, CardStudioViewEvent.ToggleCashtagVisibility.INSTANCE)) {
                CardStudioViewModel cardStudioViewModel2 = (CardStudioViewModel) mutableState.getValue();
                cardStudioViewModel2.getClass();
                CardStudioViewModel.Content content = (CardStudioViewModel.Content) cardStudioViewModel2;
                boolean z = true ^ content.isShowingCashtag;
                analytics.track(new CashCardCustomizeTapCashtag(Boolean.valueOf(z)), null);
                mutableState.setValue(CardStudioViewModel.Content.copy$default(content, z, null, false, IptcConstants.IMAGE_RESOURCE_BLOCK_EPS_OPTIONS));
            } else if (cardStudioViewEvent instanceof CardStudioViewEvent.ToggleScaleBar) {
                CardStudioViewModel cardStudioViewModel3 = (CardStudioViewModel) mutableState.getValue();
                cardStudioViewModel3.getClass();
                CardStudioViewModel.Content content2 = (CardStudioViewModel.Content) cardStudioViewModel3;
                analytics.track(new CashCardCustomizeTapPatternSlider(), null);
                mutableState.setValue(CardStudioViewModel.Content.copy$default(content2, false, null, (((CardStudioViewEvent.ToggleScaleBar) cardStudioViewEvent).forceHidden || content2.displayScaleBar) ? false : true, 767));
            } else {
                boolean areEqual = Intrinsics.areEqual(cardStudioViewEvent, CardStudioViewEvent.EnterPatternCustomizationMode.INSTANCE);
                CardStudioViewModel.CustomizationMode.Pattern.DRAW draw = CardStudioViewModel.CustomizationMode.Pattern.DRAW.INSTANCE;
                if (areEqual) {
                    analytics.track(new CashCardCustomizeTapPattern(), null);
                    CardStudioViewModel cardStudioViewModel4 = (CardStudioViewModel) mutableState.getValue();
                    cardStudioViewModel4.getClass();
                    mutableState.setValue(CardStudioViewModel.Content.copy$default((CardStudioViewModel.Content) cardStudioViewModel4, false, draw, false, 895));
                } else if (cardStudioViewEvent instanceof CardStudioViewEvent.ExitPatternCustomizationMode) {
                    CardStudioViewModel cardStudioViewModel5 = (CardStudioViewModel) mutableState.getValue();
                    cardStudioViewModel5.getClass();
                    CardStudioViewModel.Content content3 = (CardStudioViewModel.Content) cardStudioViewModel5;
                    CardStudioViewEvent.ExitPatternCustomizationMode exitPatternCustomizationMode = (CardStudioViewEvent.ExitPatternCustomizationMode) cardStudioViewEvent;
                    analytics.track(new CashCardCustomizeTapPatternCommit(new Double(new BigDecimal(exitPatternCustomizationMode.patternDensity).setScale(3, RoundingMode.HALF_EVEN).doubleValue()), new Integer(exitPatternCustomizationMode.uniqueStrokes), new Integer(exitPatternCustomizationMode.uniqueStamps)), null);
                    mutableState.setValue(CardStudioViewModel.Content.copy$default(content3, false, Intrinsics.areEqual(content3.customizationMode, draw) ? CardStudioViewModel.CustomizationMode.DRAW.INSTANCE : CardStudioViewModel.CustomizationMode.STAMP.INSTANCE, false, 383));
                } else {
                    if (!(cardStudioViewEvent instanceof CardStudioViewEvent.LogViewOnlyEvent)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    analytics.track(((CardStudioViewEvent.LogViewOnlyEvent) cardStudioViewEvent).event, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.squareup.cash.data.blockers.BlockersDataNavigator] */
    /* JADX WARN: Type inference failed for: r0v60, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r1v129, types: [com.squareup.cash.data.blockers.BlockersDataNavigator] */
    /* JADX WARN: Type inference failed for: r1v130, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.compose.runtime.MutableState] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BankAccountLinkingViewModel copy$default;
        int i;
        String str;
        SignalsContext buildSignalsContext;
        CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1 cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        Back back = Back.INSTANCE;
        Object obj2 = this.this$0;
        Object obj3 = this.$$this$LaunchedEffect;
        Object obj4 = this.$idvEvents$inlined;
        ?? r11 = 0;
        ?? r112 = 0;
        ?? r113 = 0;
        switch (i3) {
            case 0:
                SsnPresenter ssnPresenter = (SsnPresenter) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                SsnViewEvent ssnViewEvent = (SsnViewEvent) obj;
                if (Intrinsics.areEqual(ssnViewEvent, SsnViewEvent.Help.INSTANCE)) {
                    BetterNavigator.ScreenNavigator screenNavigator = ssnPresenter.navigator;
                    BlockersScreens.SsnScreen ssnScreen = (BlockersScreens.SsnScreen) ssnPresenter.args;
                    screenNavigator.goTo(new BlockersScreens.HelpOptions.Impl(ssnScreen.blockersData, ssnScreen.helpItems));
                } else if (!Intrinsics.areEqual(ssnViewEvent, SsnViewEvent.InputExtraDigit.INSTANCE)) {
                    Continuation continuation2 = null;
                    if (ssnViewEvent instanceof SsnViewEvent.Next) {
                        JobKt.launch$default(coroutineScope, null, null, new SetNameViewKt$SetName$2$1((Channel) obj4, ssnViewEvent, ssnPresenter, continuation2, 16), 3);
                    } else {
                        if (!(ssnViewEvent instanceof SsnViewEvent.HelpItemClick)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope, null, null, new SsnPresenter$models$2$2(ssnPresenter, ssnViewEvent, continuation2, r4), 3);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                if (obj != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                MutableState mutableState = (MutableState) obj3;
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                CurrencyCode currencyCode = (CurrencyCode) ((State) obj2).getValue();
                if (currencyCode != null) {
                    RealProfileManager realProfileManager = (RealProfileManager) ((HCaptcha) obj4).exception;
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        currencyCode = CurrencyCode.BTC;
                    }
                    realProfileManager.setBitcoinAmountEntryCurrencyPreference(currencyCode);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                if (Intrinsics.areEqual((BitcoinMapCardWidgetViewEvent$OnCardClicked) obj, BitcoinMapCardWidgetViewEvent$OnCardClicked.INSTANCE)) {
                    JobKt.launch$default(coroutineScope2, null, null, new MLKitTitleGenerator$prepareModel$1((n) obj2, (BetterNavigator.ScreenNavigator) obj4, null, 27), 3);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 3:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj3;
                BitcoinSendRestrictionScreen bitcoinSendRestrictionScreen = (BitcoinSendRestrictionScreen) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                BitcoinSendRestrictionViewEvent bitcoinSendRestrictionViewEvent = (BitcoinSendRestrictionViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinSendRestrictionViewEvent, BitcoinSendRestrictionViewEvent.LearnMoreClicked.INSTANCE)) {
                    CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) localHomePresenter.localHomeGeoPresenterFactory;
                    Screen screen = bitcoinSendRestrictionScreen.exitScreen;
                    screen.getClass();
                    screenNavigator2.goTo(FlowStarter.startPlasmaFlow$default(((RealCryptoFlowStarter) cryptoFlowStarter).flowStarter, Flow$Type.RESTRICTION_CANT_SEND_INFO, screen, null, null, 12));
                } else if (Intrinsics.areEqual(bitcoinSendRestrictionViewEvent, BitcoinSendRestrictionViewEvent.DoneClicked.INSTANCE)) {
                    if (bitcoinSendRestrictionScreen.amount != null) {
                        SendBitcoinNavigator sendBitcoinNavigator = (SendBitcoinNavigator) localHomePresenter.featureFlagManager;
                        Long l = (Long) ((State) obj2).getValue();
                        CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) ((State) obj4).getValue();
                        sendBitcoinNavigator.navigate(screenNavigator2, l, cryptoBalance$BitcoinBalance != null ? TextControllerKt.toMoney(cryptoBalance$BitcoinBalance) : null);
                    } else {
                        screenNavigator2.goTo(bitcoinSendRestrictionScreen.exitScreen);
                    }
                } else {
                    if (!Intrinsics.areEqual(bitcoinSendRestrictionViewEvent, BitcoinSendRestrictionViewEvent.CloseClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.goTo(bitcoinSendRestrictionScreen.exitScreen);
                }
                return Unit.INSTANCE;
            case 4:
                PaidInBitcoinLandingPresenter paidInBitcoinLandingPresenter = (PaidInBitcoinLandingPresenter) obj2;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj3;
                PaidInBitcoinLandingViewEvent paidInBitcoinLandingViewEvent = (PaidInBitcoinLandingViewEvent) obj;
                Integer num = (Integer) ((State) obj4).getValue();
                r4 = num != null ? num.intValue() : 0;
                if (Intrinsics.areEqual(paidInBitcoinLandingViewEvent, PaidInBitcoinLandingViewEvent.Close.INSTANCE)) {
                    paidInBitcoinLandingPresenter.navigator.goTo(back);
                } else if (Intrinsics.areEqual(paidInBitcoinLandingViewEvent, PaidInBitcoinLandingViewEvent.SelectPercentage.INSTANCE)) {
                    JobKt.launch$default(coroutineScope3, null, null, new RingtoneView$playRingtone$1(paidInBitcoinLandingPresenter, r4, (Continuation) null, 6), 3);
                } else {
                    if (!Intrinsics.areEqual(paidInBitcoinLandingViewEvent, PaidInBitcoinLandingViewEvent.SetupDirectDeposit.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    paidInBitcoinLandingPresenter.analytics.track(new CryptoAllocatePayrollSetupDirectDeposit(Integer.valueOf(r4)), null);
                    paidInBitcoinLandingPresenter.directDepositInboundNavigator.navigator.goTo(new DirectDepositSetupScreen(paidInBitcoinLandingPresenter.args.exitScreen, DirectDepositSetupOrigin.PAID_IN_BITCOIN, ColorModel.Bitcoin.INSTANCE));
                }
                return Unit.INSTANCE;
            case 5:
                MutableState mutableState2 = (MutableState) obj4;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) ((LocalPosCheckInPresenter) obj3).navigator;
                StablecoinDepositViewEvent stablecoinDepositViewEvent = (StablecoinDepositViewEvent) obj;
                if (Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.BackPressed.INSTANCE)) {
                    screenNavigator3.goTo(back);
                } else if (!Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.HelpClicked.INSTANCE)) {
                    if (Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.CopyAddress.INSTANCE) || Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.Share.INSTANCE)) {
                        LegacyStablecoinDepositPresenter$DepositAddress legacyStablecoinDepositPresenter$DepositAddress = (LegacyStablecoinDepositPresenter$DepositAddress) ((MutableState) obj2).getValue();
                        if (legacyStablecoinDepositPresenter$DepositAddress != null) {
                            screenNavigator3.goTo(new StablecoinDepositCopyScreen(legacyStablecoinDepositPresenter$DepositAddress.address, legacyStablecoinDepositPresenter$DepositAddress.truncatedAddress));
                        }
                    } else if (Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.TryAgainClicked.INSTANCE)) {
                        ((Boolean) mutableState2.getValue()).booleanValue();
                        ((Boolean) mutableState2.getValue()).booleanValue();
                    } else if (!Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.ChangeNetwork.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState3 = (MutableState) obj4;
                AmountBlockerPresenter amountBlockerPresenter = (AmountBlockerPresenter) obj2;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj3;
                AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
                Continuation continuation3 = null;
                if ((amountPickerViewEvent instanceof AmountPickerViewEvent$Full$Close) || (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$SystemBack)) {
                    JobKt.launch$default(coroutineScope4, null, null, new AmountPickerCondensedView.AnonymousClass14(amountBlockerPresenter, null, 24), 3);
                } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$HelpClicked) {
                    BlockerAction blockerAction = amountBlockerPresenter.args.helpAction;
                    if (blockerAction == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    JobKt.launch$default(coroutineScope4, null, null, new AmountBlockerPresenter$models$1$2(amountBlockerPresenter, blockerAction, mutableState3, continuation3, 0), 3);
                } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneySubmitted) {
                    JobKt.launch$default(coroutineScope4, null, null, new AmountBlockerPresenter$models$1$3(amountBlockerPresenter, amountPickerViewEvent, mutableState3, null, 0), 3);
                } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted) {
                    JobKt.launch$default(coroutineScope4, null, null, new AmountBlockerPresenter$models$1$3(amountBlockerPresenter, amountPickerViewEvent, mutableState3, null, 1), 3);
                }
                return Unit.INSTANCE;
            case 7:
                BankAccountLinkingPresenter bankAccountLinkingPresenter = (BankAccountLinkingPresenter) obj2;
                ?? r0 = bankAccountLinkingPresenter.blockersNavigator;
                BetterNavigator.ScreenNavigator screenNavigator4 = bankAccountLinkingPresenter.navigator;
                BlockersScreens.BankAccountLinkingScreen bankAccountLinkingScreen = bankAccountLinkingPresenter.args;
                MutableState mutableState4 = (MutableState) obj4;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj3;
                BankAccountLinkingViewEvent bankAccountLinkingViewEvent = (BankAccountLinkingViewEvent) obj;
                if (bankAccountLinkingViewEvent instanceof BankAccountLinkingViewEvent.HelpClick) {
                    screenNavigator4.goTo(new BlockersScreens.HelpOptions.Impl(bankAccountLinkingScreen.blockersData, bankAccountLinkingScreen.helpItems));
                } else if (bankAccountLinkingViewEvent instanceof BankAccountLinkingViewEvent.SkipClick) {
                    screenNavigator4.goTo(r0.getSkip(bankAccountLinkingScreen, bankAccountLinkingScreen.blockersData));
                } else {
                    Continuation continuation4 = null;
                    if (bankAccountLinkingViewEvent instanceof BankAccountLinkingViewEvent.Submit) {
                        String str2 = ((BankAccountLinkingViewEvent.Submit) bankAccountLinkingViewEvent).text;
                        switch (((BankAccountLinkingViewModel) mutableState4.getValue()).mode.ordinal()) {
                            case 0:
                                if (str2.length() == 9) {
                                    int length = str2.length();
                                    int i4 = 0;
                                    while (true) {
                                        if (r4 >= length) {
                                            if (i4 % 10 == 0) {
                                                bankAccountLinkingPresenter.routingNumber = str2;
                                                copy$default = BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.accountModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.accountNumber, null, false, null, 7935);
                                                break;
                                            }
                                        } else {
                                            char charAt = str2.charAt(r4);
                                            if (Intrinsics.compare((int) charAt, 48) >= 0 && Intrinsics.compare((int) charAt, 57) <= 0) {
                                                int i5 = charAt - '0';
                                                switch (r4) {
                                                    case 0:
                                                    case 3:
                                                    case 6:
                                                        i = i5 * 3;
                                                        break;
                                                    case 1:
                                                    case 4:
                                                    case 7:
                                                        i = i5 * 7;
                                                        break;
                                                    case 2:
                                                    case 5:
                                                    case 8:
                                                        i4 += i5;
                                                        continue;
                                                }
                                                i4 = i + i4;
                                                r4++;
                                            }
                                        }
                                    }
                                }
                                copy$default = BankAccountLinkingViewModel.copy$default((BankAccountLinkingViewModel) mutableState4.getValue(), null, null, null, null, 0, 0, null, str2, null, false, VersionedKt.update(((BankAccountLinkingViewModel) mutableState4.getValue()).valid, Boolean.FALSE), 5887);
                                break;
                            case 1:
                                if (!BankAccountLinkingPresenter.access$validNumber(bankAccountLinkingPresenter, str2, ((BankAccountLinkingViewModel) mutableState4.getValue()).minDigits, ((BankAccountLinkingViewModel) mutableState4.getValue()).maxDigits)) {
                                    copy$default = BankAccountLinkingViewModel.copy$default((BankAccountLinkingViewModel) mutableState4.getValue(), null, null, null, null, 0, 0, null, str2, null, false, VersionedKt.update(((BankAccountLinkingViewModel) mutableState4.getValue()).valid, Boolean.FALSE), 5887);
                                    break;
                                } else {
                                    bankAccountLinkingPresenter.transitNumber = str2;
                                    copy$default = BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.institutionModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.institutionNumber, null, false, null, 7935);
                                    break;
                                }
                            case 2:
                                if (!BankAccountLinkingPresenter.access$validNumber(bankAccountLinkingPresenter, str2, ((BankAccountLinkingViewModel) mutableState4.getValue()).minDigits, ((BankAccountLinkingViewModel) mutableState4.getValue()).maxDigits)) {
                                    copy$default = BankAccountLinkingViewModel.copy$default((BankAccountLinkingViewModel) mutableState4.getValue(), null, null, null, null, 0, 0, null, str2, null, false, VersionedKt.update(((BankAccountLinkingViewModel) mutableState4.getValue()).valid, Boolean.FALSE), 5887);
                                    break;
                                } else {
                                    bankAccountLinkingPresenter.institutionNumber = str2;
                                    copy$default = BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.accountModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.accountNumber, null, false, null, 7935);
                                    break;
                                }
                            case 3:
                                if (!BankAccountLinkingPresenter.access$validNumber(bankAccountLinkingPresenter, str2, ((BankAccountLinkingViewModel) mutableState4.getValue()).minDigits, ((BankAccountLinkingViewModel) mutableState4.getValue()).maxDigits)) {
                                    copy$default = BankAccountLinkingViewModel.copy$default((BankAccountLinkingViewModel) mutableState4.getValue(), null, null, null, null, 0, 0, null, str2, null, false, VersionedKt.update(((BankAccountLinkingViewModel) mutableState4.getValue()).valid, Boolean.FALSE), 5887);
                                    break;
                                } else {
                                    bankAccountLinkingPresenter.bsbNumber = str2;
                                    copy$default = BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.accountModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.accountNumber, null, false, null, 7935);
                                    break;
                                }
                            case 4:
                                if (!BankAccountLinkingPresenter.access$validNumber(bankAccountLinkingPresenter, str2, ((BankAccountLinkingViewModel) mutableState4.getValue()).minDigits, ((BankAccountLinkingViewModel) mutableState4.getValue()).maxDigits)) {
                                    copy$default = BankAccountLinkingViewModel.copy$default((BankAccountLinkingViewModel) mutableState4.getValue(), null, null, null, null, 0, 0, null, str2, null, false, VersionedKt.update(((BankAccountLinkingViewModel) mutableState4.getValue()).valid, Boolean.FALSE), 5887);
                                    break;
                                } else {
                                    bankAccountLinkingPresenter.sortCode = str2;
                                    copy$default = BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.accountModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.accountNumber, null, false, null, 7935);
                                    break;
                                }
                            case 5:
                                if (!BankAccountLinkingPresenter.access$validNumber(bankAccountLinkingPresenter, str2, ((BankAccountLinkingViewModel) mutableState4.getValue()).minDigits, ((BankAccountLinkingViewModel) mutableState4.getValue()).maxDigits)) {
                                    copy$default = BankAccountLinkingViewModel.copy$default((BankAccountLinkingViewModel) mutableState4.getValue(), null, null, null, null, 0, 0, null, str2, null, false, VersionedKt.update(((BankAccountLinkingViewModel) mutableState4.getValue()).valid, Boolean.FALSE), 5887);
                                    break;
                                } else {
                                    bankAccountLinkingPresenter.accountNumber = str2;
                                    if (!bankAccountLinkingScreen.verifyingAcount) {
                                        copy$default = BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.verifyAccountModel, null, null, null, null, str2.length(), str2.length(), null, null, null, false, null, 7887);
                                        break;
                                    } else {
                                        JobKt.launch$default(coroutineScope5, null, null, new BankAccountLinkingPresenter$models$1$1(bankAccountLinkingPresenter, mutableState4, null, 0), 3);
                                        copy$default = BankAccountLinkingViewModel.copy$default((BankAccountLinkingViewModel) mutableState4.getValue(), null, null, null, null, 0, 0, null, null, null, true, null, 7167);
                                        break;
                                    }
                                }
                            case 6:
                                if (!Intrinsics.areEqual(bankAccountLinkingPresenter.accountNumber, str2)) {
                                    copy$default = BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.accountModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.accountNumber, VersionedKt.update(((BankAccountLinkingViewModel) mutableState4.getValue()).errorMessage, bankAccountLinkingPresenter.stringManager.get(R.string.blockers_ach_account_mismatch)), false, VersionedKt.update(((BankAccountLinkingViewModel) mutableState4.getValue()).valid, Boolean.FALSE), 5375);
                                    break;
                                } else {
                                    JobKt.launch$default(coroutineScope5, null, null, new BankAccountLinkingPresenter$models$1$1(bankAccountLinkingPresenter, mutableState4, null, 1), 3);
                                    copy$default = BankAccountLinkingViewModel.copy$default((BankAccountLinkingViewModel) mutableState4.getValue(), null, null, null, null, 0, 0, null, null, null, true, null, 7167);
                                    break;
                                }
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        mutableState4.setValue(copy$default);
                    } else if (bankAccountLinkingViewEvent instanceof BankAccountLinkingViewEvent.HelpItemClick) {
                        JobKt.launch$default(coroutineScope5, null, null, new CashtagPresenter$models$2$1(3, mutableState4, bankAccountLinkingPresenter, bankAccountLinkingViewEvent, continuation4), 3);
                    } else {
                        if (!(bankAccountLinkingViewEvent instanceof BankAccountLinkingViewEvent.Back)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        switch (((BankAccountLinkingViewModel) mutableState4.getValue()).mode.ordinal()) {
                            case 0:
                            case 1:
                            case 3:
                            case 4:
                                ?? back2 = r0.getBack(bankAccountLinkingScreen, bankAccountLinkingScreen.blockersData);
                                screenNavigator4.goTo(back2 == 0 ? back : back2);
                                break;
                            case 2:
                                mutableState4.setValue(BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.transitModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.transitNumber, null, false, null, 7935));
                                break;
                            case 5:
                                int i6 = BankAccountLinkingPresenter.WhenMappings.$EnumSwitchMapping$1[bankAccountLinkingScreen.blockersData.region.ordinal()];
                                mutableState4.setValue(i6 != 1 ? i6 != 2 ? i6 != 3 ? BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.routingModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.routingNumber, null, false, null, 7935) : BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.sortCodeModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.sortCode, null, false, null, 7935) : BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.institutionModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.institutionNumber, null, false, null, 7935) : BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.bsbModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.bsbNumber, null, false, null, 7935));
                                break;
                            case 6:
                                mutableState4.setValue(BankAccountLinkingViewModel.copy$default(bankAccountLinkingPresenter.accountModel, null, null, null, null, 0, 0, null, bankAccountLinkingPresenter.accountNumber, null, false, null, 7935));
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope6 = (CoroutineScope) obj3;
                BirthdayEvent$Submit birthdayEvent$Submit = (BirthdayEvent$Submit) obj;
                if (birthdayEvent$Submit instanceof BirthdayEvent$Submit) {
                    JobKt.launch$default(coroutineScope6, null, null, new SetNameViewKt$SetName$2$1((BirthdayPresenter) obj2, birthdayEvent$Submit, (MutableState) obj4, (Continuation) null, 13), 3);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 9:
                ?? r3 = (MutableState) obj4;
                StableCoroutineScope stableCoroutineScope = (StableCoroutineScope) obj2;
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj3;
                ProductionAttributionEventEmitter productionAttributionEventEmitter = (ProductionAttributionEventEmitter) disclosurePresenter.launcher;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                BlockersScreens.ConfirmPaymentScreen confirmPaymentScreen = (BlockersScreens.ConfirmPaymentScreen) disclosurePresenter.args;
                Analytics analytics = (Analytics) disclosurePresenter.analytics;
                ConfirmPaymentViewEvent confirmPaymentViewEvent = (ConfirmPaymentViewEvent) obj;
                Continuation continuation5 = null;
                if (Intrinsics.areEqual(confirmPaymentViewEvent, ConfirmPaymentViewEvent.ConfirmOrNextClick.INSTANCE)) {
                    analytics.track(new CashSendConfirm(Boolean.FALSE), null);
                    BlockersScreens.PasscodeScreen passcodeScreen = confirmPaymentScreen.passcodeScreen;
                    if (passcodeScreen != null) {
                        screenNavigator5.goTo(passcodeScreen);
                    } else {
                        RequestContext requestContext = confirmPaymentScreen.blockersData.requestContext;
                        productionAttributionEventEmitter.paymentConfirmationInitiated();
                        r3.setValue(Boolean.TRUE);
                        JobKt.launch$default(stableCoroutineScope, null, null, new CashtagPresenter$models$2$1(17, r3, disclosurePresenter, requestContext, continuation5), 3);
                    }
                } else if (Intrinsics.areEqual(confirmPaymentViewEvent, ConfirmPaymentViewEvent.PayDuplicateClick.INSTANCE)) {
                    Boolean bool = Boolean.TRUE;
                    analytics.track(new CashSendConfirm(bool), null);
                    String str3 = confirmPaymentScreen.duplicatePaymentToken;
                    str3.getClass();
                    RequestContext requestContext2 = new RequestContext(null, CollectionsKt__CollectionsJVMKt.listOf(str3), null, null, null, null, null, null, 8175);
                    productionAttributionEventEmitter.paymentConfirmationInitiated();
                    r3.setValue(bool);
                    JobKt.launch$default(stableCoroutineScope, null, null, new CashtagPresenter$models$2$1(17, r3, disclosurePresenter, requestContext2, continuation5), 3);
                } else {
                    if (!(confirmPaymentViewEvent instanceof ConfirmPaymentViewEvent.BackClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator5.goTo(((ConfirmPaymentViewEvent.BackClick) confirmPaymentViewEvent).screen);
                }
                return Unit.INSTANCE;
            case 10:
                String str4 = (String) obj2;
                EarnerEnrollmentSuccessBlockerPresenter earnerEnrollmentSuccessBlockerPresenter = (EarnerEnrollmentSuccessBlockerPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator6 = earnerEnrollmentSuccessBlockerPresenter.navigator;
                EarnerOnboardingAnalytics earnerOnboardingAnalytics = earnerEnrollmentSuccessBlockerPresenter.earnerOnboardingAnalytics;
                EarnerEnrollmentBlockerViewEvent earnerEnrollmentBlockerViewEvent = (EarnerEnrollmentBlockerViewEvent) obj;
                if (Intrinsics.areEqual(earnerEnrollmentBlockerViewEvent, EarnerEnrollmentBlockerViewEvent.Back.INSTANCE)) {
                    earnerOnboardingAnalytics.trackDismiss(str4, EarnerOnboardingScreen.SUCCESS);
                    screenNavigator6.goTo(back);
                } else if (Intrinsics.areEqual(earnerEnrollmentBlockerViewEvent, EarnerEnrollmentBlockerViewEvent.Done.INSTANCE)) {
                    str4.getClass();
                    earnerOnboardingAnalytics.analytics.track(new EarningsOnboardingTapDone(str4), null);
                    screenNavigator6.goTo(earnerEnrollmentSuccessBlockerPresenter.args.getBlockersData().exitScreen);
                } else if (Intrinsics.areEqual(earnerEnrollmentBlockerViewEvent, EarnerEnrollmentBlockerViewEvent.ManageCustomerList.INSTANCE)) {
                    str4.getClass();
                    earnerOnboardingAnalytics.analytics.track(new EarningsOnboardingTapManageCustomers(str4), null);
                    EarnerEnrollmentSuccessBlocker.Action action = (EarnerEnrollmentSuccessBlocker.Action) obj4;
                    if (action != null && (str = action.route_url) != null) {
                        earnerEnrollmentSuccessBlockerPresenter.router.route(new RoutingParams(null, null, null, null, null, null, 511), str);
                    }
                }
                return Unit.INSTANCE;
            case 11:
                String str5 = (String) obj4;
                EarnerUpsellBlockerPresenter earnerUpsellBlockerPresenter = (EarnerUpsellBlockerPresenter) obj2;
                EarnerOnboardingAnalytics earnerOnboardingAnalytics2 = earnerUpsellBlockerPresenter.earnerOnboardingAnalytics;
                CoroutineScope coroutineScope7 = (CoroutineScope) obj3;
                EarnerUpsellBlockerViewEvent earnerUpsellBlockerViewEvent = (EarnerUpsellBlockerViewEvent) obj;
                if (Intrinsics.areEqual(earnerUpsellBlockerViewEvent, EarnerUpsellBlockerViewEvent.Close.INSTANCE)) {
                    earnerOnboardingAnalytics2.trackDismiss(str5, EarnerOnboardingScreen.UPSELL);
                    BetterNavigator.ScreenNavigator screenNavigator7 = earnerUpsellBlockerPresenter.navigator;
                    ?? r1 = earnerUpsellBlockerPresenter.blockersDataNavigator;
                    BlockersScreens.EarnerUpsellBlockerScreenArgs earnerUpsellBlockerScreenArgs = earnerUpsellBlockerPresenter.args;
                    ?? back3 = r1.getBack(earnerUpsellBlockerScreenArgs, earnerUpsellBlockerScreenArgs.getBlockersData());
                    if (back3 != 0) {
                        back = back3;
                    }
                    screenNavigator7.goTo(back);
                } else {
                    if (!Intrinsics.areEqual(earnerUpsellBlockerViewEvent, EarnerUpsellBlockerViewEvent.GetStarted.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str5.getClass();
                    earnerOnboardingAnalytics2.analytics.track(new EarningsOnboardingTapUpsellContinue(str5), null);
                    JobKt.launch$default(coroutineScope7, null, null, new CardModelView.AnonymousClass1.C00581(earnerUpsellBlockerPresenter, null, 1), 3);
                }
                return Unit.INSTANCE;
            case 12:
                GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter = (GpsLocationConsentBlockerPresenter) obj2;
                CoroutineScope coroutineScope8 = (CoroutineScope) obj3;
                GpsLocationConsentBlockerViewEvent gpsLocationConsentBlockerViewEvent = (GpsLocationConsentBlockerViewEvent) obj;
                Continuation continuation6 = null;
                if (Intrinsics.areEqual(gpsLocationConsentBlockerViewEvent, GpsLocationConsentBlockerViewEvent.Cancel.INSTANCE)) {
                    JobKt.launch$default(gpsLocationConsentBlockerPresenter.scope, null, null, new GpsLocationConsentBlockerPresenter$models$1$1(gpsLocationConsentBlockerPresenter, null, 0), 3);
                    JobKt.launch$default(coroutineScope8, null, null, new GpsLocationConsentBlockerPresenter$models$1$1(gpsLocationConsentBlockerPresenter, null, 1), 3);
                } else if (gpsLocationConsentBlockerViewEvent instanceof GpsLocationConsentBlockerViewEvent.BlockerActionClicked) {
                    JobKt.launch$default(coroutineScope8, null, null, new CashtagPresenter$models$2$1(28, (MutableState) obj4, gpsLocationConsentBlockerPresenter, gpsLocationConsentBlockerViewEvent, continuation6), 3);
                } else {
                    if (!Intrinsics.areEqual(gpsLocationConsentBlockerViewEvent, GpsLocationConsentBlockerViewEvent.OpenHalfSheet.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BlockersScreens.GpsLocationConsentBlockerScreen gpsLocationConsentBlockerScreen = gpsLocationConsentBlockerPresenter.args;
                    GpsLocationConsentBlocker.InfoHalfSheet infoHalfSheet = gpsLocationConsentBlockerScreen.blocker.info_half_sheet;
                    if (infoHalfSheet != null) {
                        gpsLocationConsentBlockerPresenter.navigator.goTo(new BlockersScreens.GpsExplainerSheetScreen(gpsLocationConsentBlockerScreen.blockersData, infoHalfSheet));
                    }
                }
                return Unit.INSTANCE;
            case 13:
                PlaidLinkPresenter plaidLinkPresenter = (PlaidLinkPresenter) obj2;
                CoroutineScope coroutineScope9 = (CoroutineScope) obj3;
                PlaidLinkViewEvent plaidLinkViewEvent = (PlaidLinkViewEvent) obj;
                if (Intrinsics.areEqual(plaidLinkViewEvent, PlaidLinkViewEvent.Dismiss.INSTANCE)) {
                    plaidLinkPresenter.navigator.goTo(back);
                } else if (Intrinsics.areEqual(plaidLinkViewEvent, PlaidLinkViewEvent.WaitingForParams.INSTANCE)) {
                    JobKt.launch$default(coroutineScope9, null, null, new SsnPresenter$models$2$2(plaidLinkPresenter, (MutableState) obj4, r112 == true ? 1 : 0, 20), 3);
                } else {
                    if (!(plaidLinkViewEvent instanceof PlaidLinkViewEvent.ReceivedResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope9, null, null, new SsnPresenter$models$2$2(plaidLinkPresenter, plaidLinkViewEvent, r11 == true ? 1 : 0, 21), 3);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope10 = (CoroutineScope) obj3;
                IdvViewEvent idvViewEvent = (IdvViewEvent) obj;
                MutableState mutableState5 = (MutableState) obj4;
                ((IdvViewModel) mutableState5.getValue()).getClass();
                mutableState5.setValue(new IdvViewModel(true));
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) obj2;
                SecuritySignalsAggregator securitySignalsAggregator = (SecuritySignalsAggregator) disclosurePresenter2.launcher;
                BlockersScreens blockersScreens = (BlockersScreens) disclosurePresenter2.args;
                BlockersData blockersData = blockersScreens.getBlockersData();
                SignalsContext signalsContext = blockersScreens.getBlockersData().idvSignalsContext;
                boolean z = idvViewEvent instanceof IdvViewEvent.SubmitSsn;
                if (z) {
                    buildSignalsContext = ((RealSecuritySignalsAggregator) securitySignalsAggregator).buildSignalsContext(((IdvViewEvent.SubmitSsn) idvViewEvent).signalsContext);
                } else {
                    if (!(idvViewEvent instanceof IdvViewEvent.SubmitAddress)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    buildSignalsContext = ((RealSecuritySignalsAggregator) securitySignalsAggregator).buildSignalsContext(((IdvViewEvent.SubmitAddress) idvViewEvent).signalsContext);
                }
                BlockersData copy$default2 = BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, BlockersDataKt.plus(signalsContext, buildSignalsContext), null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -67108865, 65535);
                GlobalAddress globalAddress = idvViewEvent instanceof IdvViewEvent.SubmitAddress ? ((IdvViewEvent.SubmitAddress) idvViewEvent).address : (GlobalAddress) copy$default2.address.getValue();
                String str6 = z ? ((IdvViewEvent.SubmitSsn) idvViewEvent).ssn : (String) copy$default2.ssn.getValue();
                if (z && ((IdvViewEvent.SubmitSsn) idvViewEvent).lastFour) {
                    r4 = 1;
                }
                String str7 = (String) copy$default2.legalName.getValue();
                String str8 = (String) copy$default2.birthday.getValue();
                String str9 = r4 == 0 ? str6 : null;
                String str10 = r4 != 0 ? str6 : null;
                RequestContext requestContext3 = copy$default2.requestContext;
                JobKt.launch$default(coroutineScope10, null, null, new RealIdvPresenter$models$1$1(disclosurePresenter2, copy$default2, globalAddress, str6, new VerifyIdentityRequest(RequestContext.copy$default(requestContext3, null, null, null, null, null, null, null, copy$default2.idvSignalsContext, null, null, null, null, 8063), str7, str8, str10, str9, globalAddress, requestContext3.payment_tokens, requestContext3.transfer_token, ByteString.EMPTY), (MutableState) obj4, null, 0), 3);
                return Unit.INSTANCE;
            case 15:
                MutableState mutableState6 = (MutableState) obj4;
                RequestPushNotificationsBlockerPresenter requestPushNotificationsBlockerPresenter = (RequestPushNotificationsBlockerPresenter) obj2;
                Analytics analytics2 = requestPushNotificationsBlockerPresenter.analytics;
                CoroutineScope coroutineScope11 = (CoroutineScope) obj3;
                RequestPushNotificationsBlockerViewEvent requestPushNotificationsBlockerViewEvent = (RequestPushNotificationsBlockerViewEvent) obj;
                if (Intrinsics.areEqual(requestPushNotificationsBlockerViewEvent, RequestPushNotificationsBlockerViewEvent.OnContinue.INSTANCE)) {
                    analytics2.track(new NotificationsOptInTapOptInCta(requestPushNotificationsBlockerPresenter.mapEntryPoint()), null);
                    JobKt.launch$default(coroutineScope11, null, null, new SsnPresenter$models$2$2(requestPushNotificationsBlockerPresenter, mutableState6, r113 == true ? 1 : 0, 25), 3);
                } else if (Intrinsics.areEqual(requestPushNotificationsBlockerViewEvent, RequestPushNotificationsBlockerViewEvent.OnDismiss.INSTANCE)) {
                    analytics2.track(new NotificationsOptInTapSkipCta(requestPushNotificationsBlockerPresenter.mapEntryPoint()), null);
                    JobKt.launch$default(coroutineScope11, null, null, new CardModelView.AnonymousClass1.C00581(requestPushNotificationsBlockerPresenter, null, 5), 3);
                } else {
                    if (!(requestPushNotificationsBlockerViewEvent instanceof RequestPushNotificationsBlockerViewEvent.OnToggleChanged)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list = RequestPushNotificationsBlockerPresenter.ACCOUNT_HOLDER_LEVEL_CATEGORIES;
                    Map map = (Map) mutableState6.getValue();
                    RequestPushNotificationsBlockerViewEvent.OnToggleChanged onToggleChanged = (RequestPushNotificationsBlockerViewEvent.OnToggleChanged) requestPushNotificationsBlockerViewEvent;
                    NotificationCategory notificationCategory = onToggleChanged.category;
                    if (map.containsKey(notificationCategory)) {
                        mutableState6.setValue(MapsKt__MapsKt.plus((Map) mutableState6.getValue(), new Pair(notificationCategory, Boolean.valueOf(onToggleChanged.enabled))));
                    }
                }
                return Unit.INSTANCE;
            case 16:
                SavingsTransferOptionSelectionPresenter savingsTransferOptionSelectionPresenter = (SavingsTransferOptionSelectionPresenter) obj2;
                BlockersScreens.SavingsTransferOptionSelectionScreen savingsTransferOptionSelectionScreen = savingsTransferOptionSelectionPresenter.args;
                CoroutineScope coroutineScope12 = (CoroutineScope) obj3;
                SavingsTransferOptionSelectionViewEvent savingsTransferOptionSelectionViewEvent = (SavingsTransferOptionSelectionViewEvent) obj;
                Continuation continuation7 = null;
                if (savingsTransferOptionSelectionViewEvent instanceof SavingsTransferOptionSelectionViewEvent.SelectTransferOption) {
                    JobKt.launch$default(coroutineScope12, null, null, new PasscodePresenter$models$1$2(savingsTransferOptionSelectionPresenter, savingsTransferOptionSelectionViewEvent, (MutableState) obj4, continuation7, 25), 3);
                } else if (savingsTransferOptionSelectionViewEvent instanceof SavingsTransferOptionSelectionViewEvent.Back) {
                    BlockerAction retreatAction = savingsTransferOptionSelectionScreen.getRetreatAction();
                    if (retreatAction != null) {
                        JobKt.launch$default(coroutineScope12, null, null, new SsnPresenter$models$2$2(savingsTransferOptionSelectionPresenter, retreatAction, continuation7, 26), 3);
                    }
                } else {
                    if (!(savingsTransferOptionSelectionViewEvent instanceof SavingsTransferOptionSelectionViewEvent.Dismiss)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    savingsTransferOptionSelectionPresenter.blockerFlowAnalytics.onFlowCancelled(savingsTransferOptionSelectionScreen.getBlockersData());
                    savingsTransferOptionSelectionPresenter.navigator.goTo(savingsTransferOptionSelectionScreen.getBlockersData().exitScreen);
                }
                return Unit.INSTANCE;
            case 17:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator8 = cardLockPresenter.navigator;
                CoroutineScope coroutineScope13 = (CoroutineScope) obj3;
                SetAddressViewEvent setAddressViewEvent = (SetAddressViewEvent) obj;
                if (setAddressViewEvent instanceof SetAddressViewEvent.HelpClick) {
                    BlockersScreens.StreetAddressScreen streetAddressScreen = (BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter;
                    screenNavigator8.goTo(new BlockersScreens.HelpOptions.Impl(streetAddressScreen.blockersData, streetAddressScreen.helpItems));
                } else if (setAddressViewEvent instanceof SetAddressViewEvent.Submit) {
                    JobKt.launch$default(coroutineScope13, null, null, new SetNamePresenter$models$1$1$1(cardLockPresenter, (Channel) obj4, setAddressViewEvent, (Continuation) null, 28), 3);
                } else if (setAddressViewEvent instanceof SetAddressViewEvent.GoBack) {
                    screenNavigator8.goTo(back);
                } else {
                    if (!(setAddressViewEvent instanceof SetAddressViewEvent.Exit)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator8.goTo(((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter).blockersData.exitScreen);
                }
                return Unit.INSTANCE;
            case 18:
                return emit$com$squareup$cash$blockers$presenters$SetNamePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 19:
                return emit$com$squareup$cash$blockers$presenters$SetPinPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 20:
                LocalHomePresenter localHomePresenter2 = (LocalHomePresenter) obj2;
                CoroutineScope coroutineScope14 = (CoroutineScope) obj3;
                SignatureViewEvent signatureViewEvent = (SignatureViewEvent) obj;
                Continuation continuation8 = null;
                if (signatureViewEvent instanceof SignatureViewEvent.Back) {
                    JobKt.launch$default(coroutineScope14, null, null, new CardModelView.AnonymousClass1.C00581(localHomePresenter2, null, 7), 3);
                } else {
                    if (!(signatureViewEvent instanceof SignatureViewEvent.Submit)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope14, null, null, new zzmh(localHomePresenter2, (MutableState) obj4, signatureViewEvent, continuation8, 29), 3);
                }
                return Unit.INSTANCE;
            case 21:
                return emit$com$squareup$cash$blockers$presenters$StatusResultPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 22:
                return emit$com$squareup$cash$blockers$presenters$StripeLinkPresenter$models$$inlined$CollectEffect$2$1(obj, continuation);
            case 23:
                return emit$com$squareup$cash$blockers$presenters$VerifyAliasPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 24:
                return emit$com$squareup$cash$blockers$presenters$VerifyInstrumentPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 25:
                return emit$com$squareup$cash$borrow$applets$presenters$BorrowAppletTilePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 26:
                return emit$com$squareup$cash$borrow$presenters$LoanAmountPickerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 27:
                return emit$com$squareup$cash$borrow$presenters$RepayCustomAmountPickerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$card$onboarding$CardStudioPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                if (continuation instanceof CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1) {
                    cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1 = (CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i7 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj5 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            FlowCollector flowCollector = (FlowCollector) obj3;
                            if (((ListIndices) obj2).sectionRanges.size() > ((Number) obj).intValue() && !((LazyListState) obj4).scrollableState.isScrollInProgress()) {
                                cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj5);
                        }
                        return Unit.INSTANCE;
                    }
                }
                cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1 = new CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj52 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SsnPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.$$this$LaunchedEffect = obj;
        this.this$0 = obj2;
        this.$idvEvents$inlined = obj3;
    }
}
