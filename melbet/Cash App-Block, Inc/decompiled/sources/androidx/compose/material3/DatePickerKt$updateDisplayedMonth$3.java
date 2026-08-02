package androidx.compose.material3;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.FocusInteraction$Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.LazyListScrollPosition;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextInputService;
import androidx.paging.PageEvent;
import androidx.paging.PagingData;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.LocalEditorialPresenter$models$2$2;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalCheckoutDeeplinkScreen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.viewmodels.BrandFollowViewEvent$Toggled;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalEditorialViewEvent;
import app.cash.local.viewmodels.LocalOrderStatusViewEvent;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewEvent;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.InputHandlerKt;
import com.google.mlkit.vision.common.zzb;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$Result$Failure;
import com.nimbusds.jose.jca.JCAContext;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.settings.viewmodels.ThemeData;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewEvent;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.presenters.PaymentHistoryActivityItemPresenter;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletPurchasesScreen;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletPurchasesEmbeddedViewEvent;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.banking.navigation.api.BankingOutboundNavigator$BalanceBasedAddCashIntent;
import com.squareup.cash.banking.presenters.BetterOverdraftPresenter$models$2$1;
import com.squareup.cash.banking.presenters.RecurringDepositsPresenter$models$1$1;
import com.squareup.cash.banking.screens.OverdraftCoverageSheetScreen;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.banking.viewmodels.BenefitDetailsViewModel;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewEvent;
import com.squareup.cash.banking.viewmodels.OverdraftInvalidToggleStateError;
import com.squareup.cash.banking.viewmodels.RecurringDepositsViewEvent;
import com.squareup.cash.banking.viewmodels.RecurringDepositsViewModel;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter;
import com.squareup.cash.benefits.screens.BenefitDetailScreen;
import com.squareup.cash.benefits.screens.BenefitsExplanationScreen;
import com.squareup.cash.benefits.screens.BenefitsHubScreen;
import com.squareup.cash.benefits.screens.GreenEligibleTransactionsScreen;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewEvent;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewEvent;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.applet.onramp.BitcoinOnRampWidgetPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsInfoPresenter;
import com.squareup.cash.bitcoin.presenters.deposits.copy.BitcoinDepositCopyPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinState;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.bitcoin.screens.BitcoinDepositCopyScreen;
import com.squareup.cash.bitcoin.screens.BitcoinExchangeFullScreen;
import com.squareup.cash.bitcoin.screens.BitcoinFeatureUnavailableScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinPayInUsdSettingsScreen;
import com.squareup.cash.bitcoin.screens.BitcoinPeriodSelectionScreen;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.screens.WalletAddressOptionsSheet;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoryViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampWidgetViewEvent$OptionClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewEvent;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.presenters.FormBlockerPresenter;
import com.squareup.cash.blockers.presenters.GpsLocationConsentBlockerPresenter;
import com.squareup.cash.blockers.presenters.PasscodePresenter;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$1$2;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewEvent;
import com.squareup.cash.borrow.presenters.BorrowHomeAmountPickerPresenter;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewEvent;
import com.squareup.cash.buynowpaylater.screens.AfterPayInfoSheetScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderHubScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPaySheetAnalyticsContext;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewModel;
import com.squareup.cash.card.onboarding.CardPreviewPresenter;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$models$2$4;
import com.squareup.cash.card.onboarding.CardPreviewViewEvent;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$models$6$1;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$models$6$2;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$models$6$4;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2$ModeTransition$Enter;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2$ModeTransition$Exit$Draw;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2$ModeTransition$Exit$Pattern;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioExitQuestion;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetQuestion;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.card.onboarding.screens.StampQuestion;
import com.squareup.cash.card.spendinginsights.screens.CardActivityListScreen;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.balancebasedaddcash.BalanceBasedAddCashSettingsEdit;
import com.squareup.cash.cdf.bankingbenefitshome.BankingBenefitsHomeTapClose;
import com.squareup.cash.cdf.bankingbenefitshome.BankingBenefitsHomeTapEligibleTransactions;
import com.squareup.cash.cdf.bankingbenefitshome.BankingBenefitsHomeTapSupportLink;
import com.squareup.cash.cdf.benefitshub.BenefitsHubScrollScrolledThrough;
import com.squareup.cash.cdf.benefitshub.BenefitsHubTapBenefitCard;
import com.squareup.cash.cdf.benefitshub.BenefitsHubTapLearnMore;
import com.squareup.cash.cdf.benefitshub.BenefitsHubTapSetupDirectDeposit;
import com.squareup.cash.cdf.benefitshub.BenefitsHubTapStartBenefit;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractSubmitBorrowAmount;
import com.squareup.cash.cdf.cash.CashRecurringDepositEdit;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeClose;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeTap;
import com.squareup.cash.cdf.crypto.CryptoDepositCopy;
import com.squareup.cash.cdf.crypto.CryptoStackStart;
import com.squareup.cash.cdf.formblocker.FormBlockerInteractStart;
import com.squareup.cash.cdf.overdraftcoverage.OverdraftCoverageManageRepay;
import com.squareup.cash.cdf.overdraftcoverage.OverdraftCoverageManageTapSupportLink;
import com.squareup.cash.cdf.referralreward.ReferralRewardReceiveSkip;
import com.squareup.cash.cdf.themepicker.ThemePickerManageExit;
import com.squareup.cash.cdf.themepicker.ThemePickerManageSelect;
import com.squareup.cash.checks.CaptureCheckFacePresenter;
import com.squareup.cash.checks.CaptureCheckFaceViewEvent;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.checks.CheckDepositError;
import com.squareup.cash.checks.MiSnapIntegrationError;
import com.squareup.cash.checks.screens.CheckCaptureAnswer;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatus;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.crypto.primitives.BitcoinFeature;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.cash.device.DeviceOrientation;
import com.squareup.cash.education.stories.screens.EducationStoryScreen;
import com.squareup.cash.education.stories.screens.EducationStoryViewPagerScreen;
import com.squareup.cash.featureflags.AmplitudeExperiments$FpBitcoinGrowToolsManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinStories_3dcubeAnimation;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewevents.real.RealFormAnalytics;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewEvent;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy$Companion$OneIn;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.transfers.backend.api.BalanceBasedAddCashPreference;
import com.squareup.cash.transfers.screens.BalanceBasedAddCashDisabledDialogScreen;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$AddressResult;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$CashtagResult;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$CellDefaultResult;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$CheckBoxResult;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$DateInputResult;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$EmojiPickerResult;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$MoneyInputResult;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$OptionPickerResult;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$TextInputResult;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.franklin.ui.PaymentHistoryReactions;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.util.coroutines.StateFlowKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import okio.ByteString;
import okio.Okio;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes3.dex */
public final class DatePickerKt$updateDisplayedMonth$3 implements FlowCollector {
    public final /* synthetic */ Object $calendarModel;
    public final /* synthetic */ Object $lazyListState;
    public final /* synthetic */ Object $onDisplayedMonthChange;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $yearRange;

    public DatePickerKt$updateDisplayedMonth$3(LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel, LazyListState lazyListState, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = 7;
        this.$onDisplayedMonthChange = localBrandLocationMenuViewModel;
        this.$lazyListState = lazyListState;
        this.$calendarModel = mutableState;
        this.$yearRange = parcelableSnapshotMutableIntState;
    }

    private final Object emit$com$squareup$cash$bitcoin$presenters$applet$onramp$BitcoinOnRampWidgetPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        RealBugReportSenderFactory realBugReportSenderFactory = (RealBugReportSenderFactory) this.$onDisplayedMonthChange;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.$calendarModel;
        CoroutineScope coroutineScope = (CoroutineScope) this.$lazyListState;
        BitcoinOnRampWidgetViewEvent$OptionClicked bitcoinOnRampWidgetViewEvent$OptionClicked = (BitcoinOnRampWidgetViewEvent$OptionClicked) obj;
        Continuation continuation2 = null;
        if (bitcoinOnRampWidgetViewEvent$OptionClicked == null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int ordinal = bitcoinOnRampWidgetViewEvent$OptionClicked.f1054type.ordinal();
        int i = 1;
        if (ordinal == 0) {
            int ordinal2 = ((CryptoIdvStatus) ((State) this.$yearRange).getValue()).ordinal();
            if (ordinal2 == 0 || ordinal2 == 1) {
                ((RealCryptoFlowStarter) ((CryptoFlowStarter) realBugReportSenderFactory.bugReportService)).startCryptoIdvFlow(new BitcoinHome(null, null, null, null, 15), screenNavigator, BitcoinFeature.DEPOSIT);
            } else if (ordinal2 == 2) {
                RealBitcoinInboundNavigator create = ((RealBitcoinInboundNavigator$Factory$Impl) realBugReportSenderFactory.featureEligibilityDumper).create(screenNavigator);
                create.navigator.goTo(create.isLightningDepositEnabled() ? new BitcoinDepositCopyScreen(null) : WalletAddressOptionsSheet.INSTANCE);
            } else {
                if (ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.goTo(BitcoinFeatureUnavailableScreen.INSTANCE);
            }
        } else if (ordinal == 1) {
            JobKt.launch$default(coroutineScope, null, null, new BitcoinOnRampWidgetPresenter$models$1$1(realBugReportSenderFactory, screenNavigator, continuation2, 0), 3);
        } else if (ordinal == 2) {
            screenNavigator.goTo(BitcoinPayInUsdSettingsScreen.INSTANCE);
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            JobKt.launch$default(coroutineScope, null, null, new BitcoinOnRampWidgetPresenter$models$1$1(realBugReportSenderFactory, screenNavigator, continuation2, i), 3);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$bitcoin$presenters$applet$stackingtools$BitcoinStackingToolsInfoPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        BitcoinStackingToolsInfoPresenter bitcoinStackingToolsInfoPresenter = (BitcoinStackingToolsInfoPresenter) this.$onDisplayedMonthChange;
        RealPaidInBitcoinNavigator realPaidInBitcoinNavigator = bitcoinStackingToolsInfoPresenter.paidInBitcoinNavigator;
        Analytics analytics = bitcoinStackingToolsInfoPresenter.analytics;
        BetterNavigator.ScreenNavigator screenNavigator = bitcoinStackingToolsInfoPresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$lazyListState;
        BitcoinStackingToolsInfoViewEvent bitcoinStackingToolsInfoViewEvent = (BitcoinStackingToolsInfoViewEvent) obj;
        boolean z = bitcoinStackingToolsInfoViewEvent instanceof BitcoinStackingToolsInfoViewEvent.ContinueClicked;
        Back back = Back.INSTANCE;
        if (z) {
            int ordinal = ((BitcoinStackingToolsInfoViewEvent.ContinueClicked) bitcoinStackingToolsInfoViewEvent).f1055type.ordinal();
            if (ordinal == 0) {
                JobKt.launch$default(coroutineScope, null, null, new AmountPickerCondensedView.AnonymousClass14(bitcoinStackingToolsInfoPresenter, null, 17), 3);
            } else if (ordinal == 1) {
                BitcoinTransferScreen bitcoinTransferScreen = new BitcoinTransferScreen(true, true, BitcoinTransferScreen.OrderType.Standard.INSTANCE, null, new BitcoinHome(null, null, null, null, 15), null, null, 512);
                screenNavigator.goTo(new InvestingScreens.RecurringFrequencyPickerFullScreen(InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin.INSTANCE, null, ColorModel.Bitcoin.INSTANCE, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) bitcoinStackingToolsInfoPresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$FpBitcoinGrowToolsManager.INSTANCE)).enabled() ? new BitcoinExchangeFullScreen(bitcoinTransferScreen) : bitcoinTransferScreen, OrderSide.BUY, new BitcoinHome(null, null, null, null, 15), 128));
            } else if (ordinal == 2) {
                realPaidInBitcoinNavigator.navigateToLandingScreen(0, new BitcoinHome(null, null, null, null, 15));
            } else if (ordinal == 3) {
                screenNavigator.goTo(back);
            } else {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.goTo(back);
                screenNavigator.goTo(FlowStarter.startPlasmaFlow$default(((RealCryptoFlowStarter) bitcoinStackingToolsInfoPresenter.cryptoFlowStarter).flowStarter, Flow$Type.CRYPTO_INVEST_CONVERSION_P2P_INFLOWS, new GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen(GrowToolsManagerScreen.Origin.BITCOIN), null, null, 12));
            }
        } else if (bitcoinStackingToolsInfoViewEvent instanceof BitcoinStackingToolsInfoViewEvent.ItemClicked) {
            int ordinal2 = ((BitcoinStackingToolsInfoViewEvent.ItemClicked) bitcoinStackingToolsInfoViewEvent).f1056type.ordinal();
            if (ordinal2 == 0) {
                ScaleKt.trackStackingToolStartEvent(analytics, BitcoinStackingToolsInfoScreen.Type.ROUND_UPS, CryptoStackStart.EntryPoint.INTERSTITIAL, Boolean.FALSE);
                RotateKt.onboardBitcoinRoundUps(screenNavigator, ((Boolean) ((State) this.$calendarModel).getValue()).booleanValue());
            } else if (ordinal2 == 1) {
                BitcoinStackingToolsInfoScreen.Type type2 = BitcoinStackingToolsInfoScreen.Type.AUTO_INVEST;
                ScaleKt.trackStackingToolStartEvent(analytics, type2, CryptoStackStart.EntryPoint.INTERSTITIAL, Boolean.FALSE);
                screenNavigator.goTo(new BitcoinStackingToolsInfoScreen(type2));
            } else {
                if (ordinal2 != 2) {
                    if (ordinal2 == 3) {
                        throw new IllegalStateException((BitcoinStackingToolsInfoScreen.Type.LEARN_MORE + " not an expected value.").toString());
                    }
                    if (ordinal2 != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    throw new IllegalStateException((BitcoinStackingToolsInfoScreen.Type.RECEIVE_P2P_AS_BITCOIN + " not an expected value.").toString());
                }
                ScaleKt.trackStackingToolStartEvent(analytics, BitcoinStackingToolsInfoScreen.Type.PAID_IN_BITCOIN, CryptoStackStart.EntryPoint.INTERSTITIAL, Boolean.FALSE);
                RotateKt.onboardPaidInBitcoin((PaidInBitcoinState) ((MutableState) this.$yearRange).getValue(), screenNavigator, realPaidInBitcoinNavigator);
            }
        } else {
            if (!Intrinsics.areEqual(bitcoinStackingToolsInfoViewEvent, BitcoinStackingToolsInfoViewEvent.BackClicked.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            screenNavigator.goTo(back);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$bitcoin$presenters$custom$order$BitcoinPeriodSelectionPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$calendarModel;
        MusicPresenter musicPresenter = (MusicPresenter) this.$lazyListState;
        PeriodSelectionViewEvent periodSelectionViewEvent = (PeriodSelectionViewEvent) obj;
        if (Intrinsics.areEqual(periodSelectionViewEvent, PeriodSelectionViewEvent.BackClick.INSTANCE)) {
            ((BetterNavigator.ScreenNavigator) musicPresenter.navigator).goTo(((BitcoinPeriodSelectionScreen) musicPresenter.args).prevScreenBottomSheet);
        } else if (periodSelectionViewEvent instanceof PeriodSelectionViewEvent.PeriodClick) {
            mutableState.setValue(((PeriodSelectionViewEvent.PeriodClick) periodSelectionViewEvent).token);
        } else {
            if (!Intrinsics.areEqual(periodSelectionViewEvent, PeriodSelectionViewEvent.SubmitClick.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            JobKt.launch$default((CoroutineScope) this.$onDisplayedMonthChange, null, null, new AmountBlockerPresenter$models$1$2((MoleculePresenter) musicPresenter, (MutableState) this.$yearRange, mutableState, (Continuation) null, 9), 3);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$bitcoin$presenters$deposits$copy$BitcoinDepositCopyPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        String str;
        BitcoinPayment bitcoinPayment;
        BitcoinAddress bitcoinAddress;
        MutableState mutableState = (MutableState) this.$calendarModel;
        DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.$onDisplayedMonthChange;
        Analytics analytics = (Analytics) disclosurePresenter.analytics;
        AndroidAccessibilityManager androidAccessibilityManager = (AndroidAccessibilityManager) disclosurePresenter.blockersNavigator;
        AndroidStringManager androidStringManager = (AndroidStringManager) disclosurePresenter.stringManager;
        RealClipboardManager realClipboardManager = (RealClipboardManager) disclosurePresenter.appService;
        CoroutineScope coroutineScope = (CoroutineScope) this.$lazyListState;
        BitcoinDepositCopyViewEvent bitcoinDepositCopyViewEvent = (BitcoinDepositCopyViewEvent) obj;
        if (Intrinsics.areEqual(bitcoinDepositCopyViewEvent, BitcoinDepositCopyViewEvent.Close.INSTANCE)) {
            ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(Back.INSTANCE);
        } else if (Intrinsics.areEqual(bitcoinDepositCopyViewEvent, BitcoinDepositCopyViewEvent.CopyOnChainAddress.INSTANCE)) {
            BitcoinPayments bitcoinPayments = (BitcoinPayments) mutableState.getValue();
            if (bitcoinPayments != null) {
                String str2 = androidStringManager.get(R.string.bitcoin_deposit_copy_bitcoin_network_label);
                BitcoinPayments.Bitcoin bitcoin = bitcoinPayments instanceof BitcoinPayments.Bitcoin ? (BitcoinPayments.Bitcoin) bitcoinPayments : null;
                if (bitcoin == null || (bitcoinPayment = bitcoin.bitcoinPayment) == null || (bitcoinAddress = bitcoinPayment.address) == null || (str = bitcoinAddress.getAddress()) == null) {
                    str = "";
                }
                realClipboardManager.copy(str2, str);
                androidAccessibilityManager.announceForAccessibility(androidStringManager.get(R.string.address_copied_announce));
                analytics.track(new CryptoDepositCopy(CryptoDepositCopy.CopyContentType.BITCOIN_ADDRESS, CryptoDepositCopy.Source.INVOICE), null);
            }
        } else if (Intrinsics.areEqual(bitcoinDepositCopyViewEvent, BitcoinDepositCopyViewEvent.CopyLightningInvoice.INSTANCE)) {
            BitcoinPayments bitcoinPayments2 = (BitcoinPayments) mutableState.getValue();
            if (bitcoinPayments2 != null) {
                realClipboardManager.copy(androidStringManager.get(R.string.bitcoin_deposit_copy_lightning_network_label), DisclosurePresenter.getLightningInvoice(bitcoinPayments2));
                androidAccessibilityManager.announceForAccessibility(androidStringManager.get(R.string.address_copied_announce));
                analytics.track(new CryptoDepositCopy(CryptoDepositCopy.CopyContentType.LIGHTNING_INVOICE, CryptoDepositCopy.Source.INVOICE), null);
            }
        } else {
            if (!Intrinsics.areEqual(bitcoinDepositCopyViewEvent, BitcoinDepositCopyViewEvent.Retry.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            JobKt.launch$default(coroutineScope, null, null, new BitcoinDepositCopyPresenter$models$1$1(disclosurePresenter, mutableState, (MutableState) this.$yearRange, null, 1), 3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x052f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0362  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$blockers$presenters$FormBlockerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        BlockerAction blockerAction;
        BlockerAction.ConfirmationDialog confirmationDialog;
        boolean z;
        BlockerAction.ConditionalConfirmation conditionalConfirmation;
        BlockerAction.SubmitAction submitAction;
        BlockerAction.ShareTextAction shareTextAction;
        BlockerAction.ShareTextAction shareTextAction2;
        BlockerAction blockerAction2;
        BlockerAction.SubmitAction submitAction2;
        BlockerAction.SubmitAction submitAction3;
        BlockerAction.Action action;
        BlockerAction.Action.SubmitAction submitAction4;
        BlockerAction.Action action2;
        BlockerAction.Action.ShareTextAction shareTextAction3;
        BlockerAction.SubmitAction submitAction5;
        BlockerAction.Action action3;
        BlockerAction.Action.SubmitAction submitAction6;
        Iterable<SubmitFormRequest.ElementResult> iterable;
        String str;
        FormBlocker.Element.OptionPickerElement optionPickerElement;
        String str2;
        FormBlockerInteractStart formBlockerInteractStart;
        BlockerAction.ConfirmationDialog confirmationDialog2;
        BlockerAction.ConfirmationElement confirmationElement;
        BlockerAction.ConfirmationElement confirmationElement2;
        BlockerAction.ConfirmationElement.ConditionalConfirmation conditionalConfirmation2;
        BlockerAction.ConfirmationSheet confirmationSheet;
        BlockerAction.ConfirmationElement confirmationElement3;
        BlockerAction.ConfirmationElement confirmationElement4;
        Object obj2;
        FormBlocker.Element.AbstractC0072Element abstractC0072Element;
        SubmitFormRequest.ElementResult.DateInputResult dateInputResult;
        Object failure;
        Object failure2;
        LocalDate localDate;
        Object failure3;
        LocalDate localDate2;
        BlockerAction.ConfirmationDialog confirmationDialog3;
        int years;
        zzdi zzdiVar;
        MutableState mutableState = (MutableState) this.$yearRange;
        Map map = (Map) this.$calendarModel;
        FormBlockerPresenter formBlockerPresenter = (FormBlockerPresenter) this.$lazyListState;
        BetterNavigator.ScreenNavigator screenNavigator = formBlockerPresenter.navigator;
        BlockersScreens.FormScreen formScreen = formBlockerPresenter.args;
        FormPresenter formPresenter = formBlockerPresenter.formPresenter;
        FormViewEvent mapNavigationEventToAction = formPresenter.mapNavigationEventToAction((FormViewEvent) obj);
        StateFlowKt.emitOrThrow((MutableSharedFlow) this.$onDisplayedMonthChange, mapNavigationEventToAction);
        BlockerAction blockerAction3 = formPresenter.toBlockerAction(mapNavigationEventToAction);
        FormBlocker.Element.OptionPickerElement.Option.Selectable selectable = null;
        if (blockerAction3 != null) {
            List list = formScreen.elements;
            LocalDate nowLocalDate = DimensionKt.nowLocalDate(formBlockerPresenter.clock);
            list.getClass();
            map.getClass();
            nowLocalDate.getClass();
            BlockerAction.ConfirmationElement confirmationElement5 = blockerAction3.confirmation_element;
            if (confirmationElement5 != null) {
                BlockerAction.ConfirmationElement.ConditionalConfirmation conditionalConfirmation3 = confirmationElement5 instanceof BlockerAction.ConfirmationElement.ConditionalConfirmation ? (BlockerAction.ConfirmationElement.ConditionalConfirmation) confirmationElement5 : null;
                BlockerAction.ConditionalConfirmation value = conditionalConfirmation3 != null ? conditionalConfirmation3.getValue() : null;
                if (value != null) {
                    String str3 = value.element_id;
                    if (str3 == null) {
                        blockerAction = BlockerAction.copy$default(blockerAction3, null, null, 27);
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (Intrinsics.areEqual(((FormBlocker.Element) obj2).id, str3)) {
                                break;
                            }
                        }
                        FormBlocker.Element element = (FormBlocker.Element) obj2;
                        if (element != null && (abstractC0072Element = element.element) != null) {
                            FormBlocker.Element.AbstractC0072Element.DateInputElement dateInputElement = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.DateInputElement ? (FormBlocker.Element.AbstractC0072Element.DateInputElement) abstractC0072Element : null;
                            FormBlocker.Element.DateInputElement value2 = dateInputElement != null ? dateInputElement.getValue() : null;
                            if (value2 != null) {
                                SubmitFormRequest.ElementResult elementResult = (SubmitFormRequest.ElementResult) map.get(str3);
                                if (elementResult != null && (zzdiVar = elementResult.result) != null) {
                                    SubmitFormRequest$ElementResult$Result$DateInputResult submitFormRequest$ElementResult$Result$DateInputResult = zzdiVar instanceof SubmitFormRequest$ElementResult$Result$DateInputResult ? (SubmitFormRequest$ElementResult$Result$DateInputResult) zzdiVar : null;
                                    if (submitFormRequest$ElementResult$Result$DateInputResult != null) {
                                        dateInputResult = submitFormRequest$ElementResult$Result$DateInputResult.value;
                                        if (dateInputResult != null) {
                                            Integer num = dateInputResult.day;
                                            Integer num2 = dateInputResult.month;
                                            Integer num3 = dateInputResult.year;
                                            if (num3 != null && num2 != null && num != null) {
                                                try {
                                                    Result.Companion companion = Result.Companion;
                                                    failure = LocalDate.of(num3.intValue(), num2.intValue(), num.intValue());
                                                } catch (Throwable th) {
                                                    Result.Companion companion2 = Result.Companion;
                                                    failure = new Result.Failure(th);
                                                }
                                                if (failure instanceof Result.Failure) {
                                                    failure = null;
                                                }
                                                LocalDate localDate3 = (LocalDate) failure;
                                                if (localDate3 == null) {
                                                    blockerAction = BlockerAction.copy$default(blockerAction3, null, null, 27);
                                                } else {
                                                    String str4 = value2.minimum_confirmation_threshold_date;
                                                    if (str4 != null) {
                                                        try {
                                                            failure2 = LocalDate.parse(str4);
                                                        } catch (Throwable th2) {
                                                            Result.Companion companion3 = Result.Companion;
                                                            failure2 = new Result.Failure(th2);
                                                        }
                                                        if (failure2 instanceof Result.Failure) {
                                                            failure2 = null;
                                                        }
                                                        localDate = (LocalDate) failure2;
                                                    } else {
                                                        localDate = null;
                                                    }
                                                    String str5 = value2.maximum_confirmation_threshold_date;
                                                    if (str5 != null) {
                                                        try {
                                                            failure3 = LocalDate.parse(str5);
                                                        } catch (Throwable th3) {
                                                            Result.Companion companion4 = Result.Companion;
                                                            failure3 = new Result.Failure(th3);
                                                        }
                                                        if (failure3 instanceof Result.Failure) {
                                                            failure3 = null;
                                                        }
                                                        localDate2 = (LocalDate) failure3;
                                                    } else {
                                                        localDate2 = null;
                                                    }
                                                    boolean z2 = !(localDate == null && localDate2 == null) && ((localDate != null && localDate3.isBefore(localDate)) || (localDate2 != null && localDate3.isAfter(localDate2)));
                                                    BlockerAction.ConditionalConfirmation.Element element2 = value.element;
                                                    if (element2 != null) {
                                                        BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog confirmationDialog4 = element2 instanceof BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog ? (BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog) element2 : null;
                                                        if (confirmationDialog4 != null) {
                                                            confirmationDialog3 = confirmationDialog4.getValue();
                                                            if (z2 || confirmationDialog3 == null) {
                                                                blockerAction = BlockerAction.copy$default(blockerAction3, null, null, 27);
                                                            } else {
                                                                String str6 = confirmationDialog3.message;
                                                                if (str6 != null && StringsKt.contains((CharSequence) str6, (CharSequence) "[[computed_age]]", false) && (years = Period.between(localDate3, nowLocalDate).getYears()) >= 0) {
                                                                    confirmationDialog3 = BlockerAction.ConfirmationDialog.copy$default(confirmationDialog3, null, StringsKt__StringsJVMKt.replace$default(str6, "[[computed_age]]", String.valueOf(years)), null, null, null, 29, null);
                                                                }
                                                                blockerAction = BlockerAction.copy$default(blockerAction3, new BlockerAction.ConfirmationElement.ConfirmationDialog(confirmationDialog3), null, 27);
                                                            }
                                                        }
                                                    }
                                                    confirmationDialog3 = null;
                                                    if (z2) {
                                                    }
                                                    blockerAction = BlockerAction.copy$default(blockerAction3, null, null, 27);
                                                }
                                            }
                                        }
                                        blockerAction = BlockerAction.copy$default(blockerAction3, null, null, 27);
                                    }
                                }
                                dateInputResult = null;
                                if (dateInputResult != null) {
                                }
                                blockerAction = BlockerAction.copy$default(blockerAction3, null, null, 27);
                            }
                        }
                        blockerAction = BlockerAction.copy$default(blockerAction3, null, null, 27);
                    }
                }
            }
            blockerAction = blockerAction3;
        } else {
            blockerAction = null;
        }
        if (blockerAction != null && (confirmationElement4 = blockerAction.confirmation_element) != null) {
            BlockerAction.ConfirmationElement.ConfirmationDialog confirmationDialog5 = confirmationElement4 instanceof BlockerAction.ConfirmationElement.ConfirmationDialog ? (BlockerAction.ConfirmationElement.ConfirmationDialog) confirmationElement4 : null;
            if (confirmationDialog5 != null) {
                confirmationDialog = confirmationDialog5.getValue();
                if (confirmationDialog == null) {
                    if (blockerAction != null && (confirmationElement3 = blockerAction.confirmation_element) != null) {
                        BlockerAction.ConfirmationElement.ConfirmationSheet confirmationSheet2 = confirmationElement3 instanceof BlockerAction.ConfirmationElement.ConfirmationSheet ? (BlockerAction.ConfirmationElement.ConfirmationSheet) confirmationElement3 : null;
                        if (confirmationSheet2 != null) {
                            confirmationSheet = confirmationSheet2.getValue();
                            if (confirmationSheet == null) {
                                z = false;
                                if (blockerAction3 != null && (confirmationElement2 = blockerAction3.confirmation_element) != null) {
                                    conditionalConfirmation2 = !(confirmationElement2 instanceof BlockerAction.ConfirmationElement.ConditionalConfirmation) ? (BlockerAction.ConfirmationElement.ConditionalConfirmation) confirmationElement2 : null;
                                    if (conditionalConfirmation2 != null) {
                                        conditionalConfirmation = conditionalConfirmation2.getValue();
                                        if (conditionalConfirmation != null) {
                                            if (blockerAction != null && (confirmationElement = blockerAction.confirmation_element) != null) {
                                                BlockerAction.ConfirmationElement.ConfirmationDialog confirmationDialog6 = confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationDialog ? (BlockerAction.ConfirmationElement.ConfirmationDialog) confirmationElement : null;
                                                if (confirmationDialog6 != null) {
                                                    confirmationDialog2 = confirmationDialog6.getValue();
                                                    if (confirmationDialog2 != null) {
                                                        BlockersData blockersData = formScreen.blockersData;
                                                        BlockerAction.ConfirmationElement confirmationElement6 = blockerAction.confirmation_element;
                                                        confirmationElement6.getClass();
                                                        BlockerAction.ConfirmationElement.ConfirmationDialog confirmationDialog7 = confirmationElement6 instanceof BlockerAction.ConfirmationElement.ConfirmationDialog ? (BlockerAction.ConfirmationElement.ConfirmationDialog) confirmationElement6 : null;
                                                        BlockerAction.ConfirmationDialog value3 = confirmationDialog7 != null ? confirmationDialog7.getValue() : null;
                                                        value3.getClass();
                                                        screenNavigator.goTo(new BlockersScreens.BlockerActionConfirmDialogScreen(blockersData, value3, BlockerAction.copy$default(blockerAction, null, null, 27)));
                                                        if ((mapNavigationEventToAction instanceof FormViewEvent.ElementEvent) && (str2 = formScreen.blockersData.blockerId) != null) {
                                                            RealFormAnalytics realFormAnalytics = formBlockerPresenter.formAnalytics;
                                                            FormViewEvent.ElementEvent elementEvent = (FormViewEvent.ElementEvent) mapNavigationEventToAction;
                                                            formBlockerInteractStart = !(elementEvent instanceof FormViewEvent.ElementEvent.StartInput) ? new FormBlockerInteractStart(str2, ((FormViewEvent.ElementEvent.StartInput) elementEvent).id) : null;
                                                            if (formBlockerInteractStart != null) {
                                                                realFormAnalytics.analytics.track(formBlockerInteractStart, null);
                                                            }
                                                        }
                                                        if (!(mapNavigationEventToAction instanceof FormViewEvent.UpdateResultEvent.UnselectableOptionClick)) {
                                                            String str7 = ((FormViewEvent.UpdateResultEvent.UnselectableOptionClick) mapNavigationEventToAction).unselectable.message;
                                                            if (str7 != null) {
                                                                screenNavigator.goTo(new BlockersScreens.UnselectableOptionDialog(formScreen.blockersData, str7));
                                                            }
                                                        } else {
                                                            if (mapNavigationEventToAction instanceof FormViewEvent.UpdateResultEvent.ConfirmableOptionClick) {
                                                                for (FormBlocker.Element element3 : formScreen.elements) {
                                                                    FormViewEvent.UpdateResultEvent.ConfirmableOptionClick confirmableOptionClick = (FormViewEvent.UpdateResultEvent.ConfirmableOptionClick) mapNavigationEventToAction;
                                                                    if (Intrinsics.areEqual(element3.id, confirmableOptionClick.id)) {
                                                                        FormBlocker.Element.AbstractC0072Element abstractC0072Element2 = element3.element;
                                                                        if (abstractC0072Element2 != null) {
                                                                            FormBlocker.Element.AbstractC0072Element.OptionPickerElement optionPickerElement2 = abstractC0072Element2 instanceof FormBlocker.Element.AbstractC0072Element.OptionPickerElement ? (FormBlocker.Element.AbstractC0072Element.OptionPickerElement) abstractC0072Element2 : null;
                                                                            if (optionPickerElement2 != null) {
                                                                                optionPickerElement = optionPickerElement2.getValue();
                                                                                optionPickerElement.getClass();
                                                                                for (FormBlocker.Element.OptionPickerElement.Option option : optionPickerElement.options) {
                                                                                    if (Intrinsics.areEqual(option.id, confirmableOptionClick.optionPickerResult.option_id)) {
                                                                                        FormBlocker.Element.OptionPickerElement.Option.Selectability selectability = option.selectability;
                                                                                        if (selectability != null) {
                                                                                            FormBlocker.Element.OptionPickerElement.Option.Selectability.Selectable selectable2 = selectability instanceof FormBlocker.Element.OptionPickerElement.Option.Selectability.Selectable ? (FormBlocker.Element.OptionPickerElement.Option.Selectability.Selectable) selectability : null;
                                                                                            if (selectable2 != null) {
                                                                                                selectable = selectable2.getValue();
                                                                                            }
                                                                                        }
                                                                                        selectable.getClass();
                                                                                        FormBlocker.Element.OptionPickerElement.Option.ConfirmationDialog confirmationDialog8 = selectable.confirmation_dialog;
                                                                                        confirmationDialog8.getClass();
                                                                                        String str8 = confirmationDialog8.title;
                                                                                        str8.getClass();
                                                                                        String str9 = confirmationDialog8.message;
                                                                                        str9.getClass();
                                                                                        String str10 = confirmationDialog8.confirm_button_text;
                                                                                        str10.getClass();
                                                                                        String str11 = confirmationDialog8.cancel_button_text;
                                                                                        BlockersData blockersData2 = formScreen.blockersData;
                                                                                        String str12 = confirmableOptionClick.id;
                                                                                        String str13 = option.id;
                                                                                        str13.getClass();
                                                                                        screenNavigator.goTo(new BlockersScreens.ConfirmableOptionDialog(blockersData2, str12, str13, str8, str9, str10, str11));
                                                                                    }
                                                                                }
                                                                                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                                                                return null;
                                                                            }
                                                                        }
                                                                        optionPickerElement = null;
                                                                        optionPickerElement.getClass();
                                                                        while (r0.hasNext()) {
                                                                        }
                                                                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                                                        return null;
                                                                    }
                                                                }
                                                                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                                                return null;
                                                            }
                                                            if (mapNavigationEventToAction.equals(FormViewEvent.GoBack.INSTANCE) || mapNavigationEventToAction.equals(FormViewEvent.Close.INSTANCE)) {
                                                                Screen back = formBlockerPresenter.blockersNavigator.getBack(formScreen, formScreen.blockersData);
                                                                if (back == null) {
                                                                    back = Back.INSTANCE;
                                                                }
                                                                screenNavigator.goTo(back);
                                                            } else if (mapNavigationEventToAction instanceof FormViewEvent.UpdateResultEvent) {
                                                                FormViewEvent.UpdateResultEvent updateResultEvent = (FormViewEvent.UpdateResultEvent) mapNavigationEventToAction;
                                                                List list2 = formScreen.elements;
                                                                list2.getClass();
                                                                if (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.AddressChange) {
                                                                    FormViewEvent.UpdateResultEvent.AddressChange addressChange = (FormViewEvent.UpdateResultEvent.AddressChange) updateResultEvent;
                                                                    iterable = CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(addressChange.id, new SubmitFormRequest$ElementResult$Result$AddressResult(addressChange.addressResult), 4));
                                                                } else if (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.OptionClick) {
                                                                    FormViewEvent.UpdateResultEvent.OptionClick optionClick = (FormViewEvent.UpdateResultEvent.OptionClick) updateResultEvent;
                                                                    iterable = CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(optionClick.id, new SubmitFormRequest$ElementResult$Result$OptionPickerResult(optionClick.optionPickerResult), 4));
                                                                } else if (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.InputChanged) {
                                                                    FormViewEvent.UpdateResultEvent.InputChanged inputChanged = (FormViewEvent.UpdateResultEvent.InputChanged) updateResultEvent;
                                                                    iterable = CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(inputChanged.id, new SubmitFormRequest$ElementResult$Result$TextInputResult(inputChanged.textInputResult), 4));
                                                                } else if (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.CashtagChanged) {
                                                                    FormViewEvent.UpdateResultEvent.CashtagChanged cashtagChanged = (FormViewEvent.UpdateResultEvent.CashtagChanged) updateResultEvent;
                                                                    iterable = CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(cashtagChanged.id, new SubmitFormRequest$ElementResult$Result$CashtagResult(cashtagChanged.cashtagResult), 4));
                                                                } else if (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.DateInputChanged) {
                                                                    FormViewEvent.UpdateResultEvent.DateInputChanged dateInputChanged = (FormViewEvent.UpdateResultEvent.DateInputChanged) updateResultEvent;
                                                                    iterable = CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(dateInputChanged.id, new SubmitFormRequest$ElementResult$Result$DateInputResult(dateInputChanged.dateInputResult), 4));
                                                                } else if (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.MoneyInputChanged) {
                                                                    FormViewEvent.UpdateResultEvent.MoneyInputChanged moneyInputChanged = (FormViewEvent.UpdateResultEvent.MoneyInputChanged) updateResultEvent;
                                                                    iterable = CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(moneyInputChanged.id, new SubmitFormRequest$ElementResult$Result$MoneyInputResult(moneyInputChanged.moneyInputResult), 4));
                                                                } else if ((updateResultEvent instanceof FormViewEvent.UpdateResultEvent.UnselectableOptionClick) || (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.ConfirmableOptionClick)) {
                                                                    iterable = EmptyList.INSTANCE;
                                                                } else if (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.EmojiPickChanged) {
                                                                    FormViewEvent.UpdateResultEvent.EmojiPickChanged emojiPickChanged = (FormViewEvent.UpdateResultEvent.EmojiPickChanged) updateResultEvent;
                                                                    iterable = CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(emojiPickChanged.id, new SubmitFormRequest$ElementResult$Result$EmojiPickerResult(emojiPickChanged.emojiPickerResult), 4));
                                                                } else if (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.MerchantTransactionOptionClick) {
                                                                    FormViewEvent.UpdateResultEvent.MerchantTransactionOptionClick merchantTransactionOptionClick = (FormViewEvent.UpdateResultEvent.MerchantTransactionOptionClick) updateResultEvent;
                                                                    iterable = CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(merchantTransactionOptionClick.id, new SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult(merchantTransactionOptionClick.merchantTransactionResult), 4));
                                                                } else if (updateResultEvent instanceof FormViewEvent.UpdateResultEvent.CheckBoxChecked) {
                                                                    FormViewEvent.UpdateResultEvent.CheckBoxChecked checkBoxChecked = (FormViewEvent.UpdateResultEvent.CheckBoxChecked) updateResultEvent;
                                                                    iterable = CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult(checkBoxChecked.id, new SubmitFormRequest$ElementResult$Result$CheckBoxResult(checkBoxChecked.checkBoxResult), 4));
                                                                } else {
                                                                    if (!(updateResultEvent instanceof FormViewEvent.UpdateResultEvent.CellDefaultChecked)) {
                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                        return null;
                                                                    }
                                                                    FormViewEvent.UpdateResultEvent.CellDefaultChecked cellDefaultChecked = (FormViewEvent.UpdateResultEvent.CellDefaultChecked) updateResultEvent;
                                                                    String str14 = cellDefaultChecked.id;
                                                                    String str15 = cellDefaultChecked.selectionGroupId;
                                                                    boolean z3 = cellDefaultChecked.checked;
                                                                    SubmitFormRequest.ElementResult elementResult2 = new SubmitFormRequest.ElementResult(str14, new SubmitFormRequest$ElementResult$Result$CellDefaultResult(new SubmitFormRequest.ElementResult.CellDefaultResult(Boolean.valueOf(z3), str15)), 4);
                                                                    if (!z3 || str15 == null) {
                                                                        iterable = CollectionsKt__CollectionsJVMKt.listOf(elementResult2);
                                                                    } else {
                                                                        ArrayList arrayList = new ArrayList();
                                                                        for (Object obj3 : list2) {
                                                                            FormBlocker.Element element4 = (FormBlocker.Element) obj3;
                                                                            if (!Intrinsics.areEqual(element4.id, str14)) {
                                                                                FormBlocker.Element.AbstractC0072Element abstractC0072Element3 = element4.element;
                                                                                if (abstractC0072Element3 != null) {
                                                                                    FormBlocker.Element.AbstractC0072Element.CellDefaultElement cellDefaultElement = abstractC0072Element3 instanceof FormBlocker.Element.AbstractC0072Element.CellDefaultElement ? (FormBlocker.Element.AbstractC0072Element.CellDefaultElement) abstractC0072Element3 : null;
                                                                                    FormBlocker.Element.CellDefaultElement value4 = cellDefaultElement != null ? cellDefaultElement.getValue() : null;
                                                                                    if (value4 != null) {
                                                                                        str = value4.selection_group_id;
                                                                                        if (!Intrinsics.areEqual(str, str15)) {
                                                                                            arrayList.add(obj3);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str = null;
                                                                                if (!Intrinsics.areEqual(str, str15)) {
                                                                                }
                                                                            }
                                                                        }
                                                                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                                                        Iterator it2 = arrayList.iterator();
                                                                        while (it2.hasNext()) {
                                                                            String str16 = ((FormBlocker.Element) it2.next()).id;
                                                                            str16.getClass();
                                                                            arrayList2.add(new SubmitFormRequest.ElementResult(str16, new SubmitFormRequest$ElementResult$Result$CellDefaultResult(new SubmitFormRequest.ElementResult.CellDefaultResult(Boolean.FALSE, str15)), 4));
                                                                        }
                                                                        iterable = CollectionsKt.plus((Iterable) arrayList2, (Collection) CollectionsKt__CollectionsJVMKt.listOf(elementResult2));
                                                                    }
                                                                }
                                                                for (SubmitFormRequest.ElementResult elementResult3 : iterable) {
                                                                    String str17 = elementResult3.id;
                                                                    if (str17 != null) {
                                                                        map.put(str17, elementResult3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                            confirmationDialog2 = null;
                                            if (confirmationDialog2 != null) {
                                            }
                                        }
                                        if (blockerAction != null && (action3 = blockerAction.action) != null) {
                                            submitAction6 = !(action3 instanceof BlockerAction.Action.SubmitAction) ? (BlockerAction.Action.SubmitAction) action3 : null;
                                            if (submitAction6 != null) {
                                                submitAction = submitAction6.getValue();
                                                if (submitAction != null || z) {
                                                    if (blockerAction != null && (action2 = blockerAction.action) != null) {
                                                        shareTextAction3 = !(action2 instanceof BlockerAction.Action.ShareTextAction) ? (BlockerAction.Action.ShareTextAction) action2 : null;
                                                        if (shareTextAction3 != null) {
                                                            shareTextAction = shareTextAction3.getValue();
                                                            if (shareTextAction != null) {
                                                                BlockerAction.Action action4 = blockerAction.action;
                                                                if (action4 != null) {
                                                                    BlockerAction.Action.ShareTextAction shareTextAction4 = action4 instanceof BlockerAction.Action.ShareTextAction ? (BlockerAction.Action.ShareTextAction) action4 : null;
                                                                    if (shareTextAction4 != null) {
                                                                        shareTextAction2 = shareTextAction4.getValue();
                                                                        shareTextAction2.getClass();
                                                                        blockerAction2 = shareTextAction2.after_successful_sms_blocker_action;
                                                                        if (blockerAction2 != null && (action = blockerAction2.action) != null) {
                                                                            submitAction4 = !(action instanceof BlockerAction.Action.SubmitAction) ? (BlockerAction.Action.SubmitAction) action : null;
                                                                            if (submitAction4 != null) {
                                                                                submitAction2 = submitAction4.getValue();
                                                                                if (submitAction2 != null) {
                                                                                    Versioned versioned = (Versioned) mutableState.getValue();
                                                                                    BlockerAction.Action action5 = blockerAction2.action;
                                                                                    if (action5 != null) {
                                                                                        BlockerAction.Action.SubmitAction submitAction7 = action5 instanceof BlockerAction.Action.SubmitAction ? (BlockerAction.Action.SubmitAction) action5 : null;
                                                                                        if (submitAction7 != null) {
                                                                                            submitAction3 = submitAction7.getValue();
                                                                                            mutableState.setValue(VersionedKt.update(versioned, submitAction3));
                                                                                        }
                                                                                    }
                                                                                    submitAction3 = null;
                                                                                    mutableState.setValue(VersionedKt.update(versioned, submitAction3));
                                                                                }
                                                                            }
                                                                        }
                                                                        submitAction2 = null;
                                                                        if (submitAction2 != null) {
                                                                        }
                                                                    }
                                                                }
                                                                shareTextAction2 = null;
                                                                shareTextAction2.getClass();
                                                                blockerAction2 = shareTextAction2.after_successful_sms_blocker_action;
                                                                if (blockerAction2 != null) {
                                                                    if (!(action instanceof BlockerAction.Action.SubmitAction)) {
                                                                    }
                                                                    if (submitAction4 != null) {
                                                                    }
                                                                }
                                                                submitAction2 = null;
                                                                if (submitAction2 != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    shareTextAction = null;
                                                    if (shareTextAction != null) {
                                                    }
                                                } else {
                                                    Versioned versioned2 = (Versioned) mutableState.getValue();
                                                    BlockerAction.Action action6 = blockerAction.action;
                                                    if (action6 != null) {
                                                        BlockerAction.Action.SubmitAction submitAction8 = action6 instanceof BlockerAction.Action.SubmitAction ? (BlockerAction.Action.SubmitAction) action6 : null;
                                                        if (submitAction8 != null) {
                                                            submitAction5 = submitAction8.getValue();
                                                            mutableState.setValue(VersionedKt.update(versioned2, submitAction5));
                                                        }
                                                    }
                                                    submitAction5 = null;
                                                    mutableState.setValue(VersionedKt.update(versioned2, submitAction5));
                                                }
                                                if (mapNavigationEventToAction instanceof FormViewEvent.ElementEvent) {
                                                    RealFormAnalytics realFormAnalytics2 = formBlockerPresenter.formAnalytics;
                                                    FormViewEvent.ElementEvent elementEvent2 = (FormViewEvent.ElementEvent) mapNavigationEventToAction;
                                                    if (!(elementEvent2 instanceof FormViewEvent.ElementEvent.StartInput)) {
                                                    }
                                                    if (formBlockerInteractStart != null) {
                                                    }
                                                }
                                                if (!(mapNavigationEventToAction instanceof FormViewEvent.UpdateResultEvent.UnselectableOptionClick)) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        submitAction = null;
                                        if (submitAction != null) {
                                        }
                                        if (blockerAction != null) {
                                            if (!(action2 instanceof BlockerAction.Action.ShareTextAction)) {
                                            }
                                            if (shareTextAction3 != null) {
                                            }
                                        }
                                        shareTextAction = null;
                                        if (shareTextAction != null) {
                                        }
                                        if (mapNavigationEventToAction instanceof FormViewEvent.ElementEvent) {
                                        }
                                        if (!(mapNavigationEventToAction instanceof FormViewEvent.UpdateResultEvent.UnselectableOptionClick)) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                conditionalConfirmation = null;
                                if (conditionalConfirmation != null) {
                                }
                                if (blockerAction != null) {
                                    if (!(action3 instanceof BlockerAction.Action.SubmitAction)) {
                                    }
                                    if (submitAction6 != null) {
                                    }
                                }
                                submitAction = null;
                                if (submitAction != null) {
                                }
                                if (blockerAction != null) {
                                }
                                shareTextAction = null;
                                if (shareTextAction != null) {
                                }
                                if (mapNavigationEventToAction instanceof FormViewEvent.ElementEvent) {
                                }
                                if (!(mapNavigationEventToAction instanceof FormViewEvent.UpdateResultEvent.UnselectableOptionClick)) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    confirmationSheet = null;
                    if (confirmationSheet == null) {
                    }
                }
                z = true;
                if (blockerAction3 != null) {
                    if (!(confirmationElement2 instanceof BlockerAction.ConfirmationElement.ConditionalConfirmation)) {
                    }
                    if (conditionalConfirmation2 != null) {
                    }
                }
                conditionalConfirmation = null;
                if (conditionalConfirmation != null) {
                }
                if (blockerAction != null) {
                }
                submitAction = null;
                if (submitAction != null) {
                }
                if (blockerAction != null) {
                }
                shareTextAction = null;
                if (shareTextAction != null) {
                }
                if (mapNavigationEventToAction instanceof FormViewEvent.ElementEvent) {
                }
                if (!(mapNavigationEventToAction instanceof FormViewEvent.UpdateResultEvent.UnselectableOptionClick)) {
                }
                return Unit.INSTANCE;
            }
        }
        confirmationDialog = null;
        if (confirmationDialog == null) {
        }
        z = true;
        if (blockerAction3 != null) {
        }
        conditionalConfirmation = null;
        if (conditionalConfirmation != null) {
        }
        if (blockerAction != null) {
        }
        submitAction = null;
        if (submitAction != null) {
        }
        if (blockerAction != null) {
        }
        shareTextAction = null;
        if (shareTextAction != null) {
        }
        if (mapNavigationEventToAction instanceof FormViewEvent.ElementEvent) {
        }
        if (!(mapNavigationEventToAction instanceof FormViewEvent.UpdateResultEvent.UnselectableOptionClick)) {
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$GpsLocationConsentBlockerPresenter$models$2$1$1$1(Object obj, Continuation continuation) {
        ((Boolean) obj).getClass();
        MutableState mutableState = (MutableState) this.$onDisplayedMonthChange;
        PermissionChecker permissionChecker = ((GpsLocationConsentBlockerPresenter) this.$lazyListState).permissionChecker;
        mutableState.setValue(Boolean.valueOf(permissionChecker.hasLocation()));
        ((MutableState) this.$calendarModel).setValue(Boolean.valueOf(permissionChecker.hasBackgroundLocation()));
        ((MutableState) this.$yearRange).setValue(Boolean.valueOf(permissionChecker.checkPermission("android.permission.ACCESS_FINE_LOCATION")));
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$PasscodePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        PasscodePresenter passcodePresenter = (PasscodePresenter) this.$onDisplayedMonthChange;
        BetterNavigator.ScreenNavigator screenNavigator = passcodePresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$lazyListState;
        PasscodeViewEvent passcodeViewEvent = (PasscodeViewEvent) obj;
        if (passcodeViewEvent instanceof PasscodeViewEvent.ForgotPasscode) {
            MutableState mutableState = (MutableState) this.$calendarModel;
            mutableState.setValue(VersionedKt.update((Versioned) mutableState.getValue(), passcodeViewEvent));
        } else {
            Continuation continuation2 = null;
            if (passcodeViewEvent instanceof PasscodeViewEvent.HelpButtonClick) {
                BlockersScreens.PasscodeScreen passcodeScreen = passcodePresenter.args;
                List list = passcodeScreen.helpItems;
                BlockersData blockersData = passcodeScreen.blockersData;
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    screenNavigator.goTo(new BlockersScreens.HelpOptions.Impl(blockersData, list));
                } else {
                    if (InputHandlerKt.toBrand(passcodeScreen.instrumentType) != CardBrandGuesser$Brand.BALANCE) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    boolean z = passcodeScreen.suppressForgotPasscode;
                    AndroidStringManager androidStringManager = passcodePresenter.stringManager;
                    ArrayList arrayList = new ArrayList();
                    if (!z) {
                        arrayList.add(new HelpItem(androidStringManager.get(R.string.cash_pin_help), HelpItem.Action.START_CLIENT_SCENARIO, ClientScenario.RESET_PASSCODE.toString(), null, 3962));
                    }
                    arrayList.add(new HelpItem(androidStringManager.get(R.string.blockers_passcode_support), HelpItem.Action.BLOCKER_ACTION, null, new BlockerAction(null, new BlockerAction.Action.InternalNavigationAction(new BlockerAction.InternalNavigationAction(new BlockerAction.InternalNavigationAction.Destination.ClientRoute(new BlockerAction.InternalNavigationAction.ClientRoute("https://internal.cash.app/dl/view/support-home", null, 2, null)), null, null, 6, null)), 23), 3066));
                    screenNavigator.goTo(new BlockersScreens.HelpOptions.Impl(blockersData, arrayList));
                }
            } else if (passcodeViewEvent instanceof PasscodeViewEvent.BackPressed) {
                screenNavigator.goTo(Back.INSTANCE);
            } else if (passcodeViewEvent instanceof PasscodeViewEvent.HelpClick) {
                JobKt.launch$default(coroutineScope, null, null, new PasscodePresenter$models$1$2(passcodePresenter, passcodeViewEvent, (MutableState) this.$yearRange, continuation2, 0), 3);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$ReferralCodePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        BlockersData.AnalyticsData.Source source;
        ReferralCodePresenter referralCodePresenter = (ReferralCodePresenter) this.$onDisplayedMonthChange;
        BlockersDataNavigator blockersDataNavigator = referralCodePresenter.blockersNavigator;
        BetterNavigator.ScreenNavigator screenNavigator = referralCodePresenter.navigator;
        BlockersScreens.ReferralCodeScreen referralCodeScreen = referralCodePresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$lazyListState;
        ReferralCodeViewEvent referralCodeViewEvent = (ReferralCodeViewEvent) obj;
        boolean z = referralCodeViewEvent instanceof ReferralCodeViewEvent.CodeInputChanged;
        Object obj2 = this.$calendarModel;
        Continuation continuation2 = null;
        if (z) {
            JobKt.launch$default(coroutineScope, null, null, new AndroidSecureStore$read$2(referralCodePresenter, referralCodeViewEvent, (MutableSharedFlow) obj2, (State) this.$yearRange, (Continuation) null, 26), 3);
        } else if (referralCodeViewEvent instanceof ReferralCodeViewEvent.SubmitAction) {
            JobKt.launch$default(coroutineScope, null, null, new SetNamePresenter$models$1$1$1((MutableSharedFlow) obj2, referralCodePresenter, referralCodeViewEvent, continuation2, 24), 3);
        } else if (referralCodeViewEvent instanceof ReferralCodeViewEvent.SkipAction) {
            Analytics analytics = referralCodePresenter.analytics;
            ClientScenario clientScenario = referralCodeScreen.blockersData.clientScenario;
            String name = clientScenario != null ? clientScenario.name() : null;
            Long l = new Long(referralCodePresenter.clock.millis() - referralCodePresenter.subscriptionTime);
            BlockersData blockersData = referralCodeScreen.blockersData;
            String str = blockersData.flowToken;
            String name2 = blockersData.ratePlan.name();
            BlockersData.AnalyticsData analyticsData = referralCodeScreen.blockersData.analyticsData;
            analytics.track(new ReferralRewardReceiveSkip(l, name, str, name2, (analyticsData == null || (source = analyticsData.source) == null) ? null : source.getAnalyticsName()), null);
            screenNavigator.goTo(blockersDataNavigator.getSkip(referralCodeScreen, referralCodeScreen.blockersData));
        } else {
            if (!(referralCodeViewEvent instanceof ReferralCodeViewEvent.GoBack)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Screen back = blockersDataNavigator.getBack(referralCodeScreen, referralCodeScreen.blockersData);
            if (back == null) {
                back = Back.INSTANCE;
            }
            screenNavigator.goTo(back);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$borrow$presenters$BorrowHomeAmountPickerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        InitiateLoanData initiateLoanData = (InitiateLoanData) this.$onDisplayedMonthChange;
        BorrowHomeAmountPickerPresenter borrowHomeAmountPickerPresenter = (BorrowHomeAmountPickerPresenter) this.$calendarModel;
        CoroutineScope coroutineScope = (CoroutineScope) this.$lazyListState;
        BorrowAmountPickerViewEvent borrowAmountPickerViewEvent = (BorrowAmountPickerViewEvent) obj;
        if (borrowAmountPickerViewEvent instanceof BorrowAmountPickerViewEvent.SelectQuickAmount) {
            if (((BorrowAmountPickerViewEvent.SelectQuickAmount) borrowAmountPickerViewEvent).index == initiateLoanData.quick_loan_options.size()) {
                ((MutableState) this.$yearRange).setValue(Boolean.TRUE);
                InitiateLoanData.CustomLoanOption customLoanOption = initiateLoanData.custom_loan_option;
                customLoanOption.getClass();
                borrowHomeAmountPickerPresenter.route(customLoanOption.action_url);
            }
        } else if (borrowAmountPickerViewEvent instanceof BorrowAmountPickerViewEvent.ConfirmQuickAmount) {
            Analytics analytics = borrowHomeAmountPickerPresenter.analytics;
            String str = borrowHomeAmountPickerPresenter.flowToken;
            BorrowAppletInteractSubmitBorrowAmount.SelectionType selectionType = BorrowAppletInteractSubmitBorrowAmount.SelectionType.RECOMMENDED;
            List<InitiateLoanData.QuickLoanOption> list = initiateLoanData.quick_loan_options;
            int i = ((BorrowAmountPickerViewEvent.ConfirmQuickAmount) borrowAmountPickerViewEvent).index;
            Money money = list.get(i).amount;
            money.getClass();
            analytics.track(new BorrowAppletInteractSubmitBorrowAmount(str, selectionType, money.amount), null);
            borrowHomeAmountPickerPresenter.route(initiateLoanData.quick_loan_options.get(i).action_url);
        } else {
            if (borrowAmountPickerViewEvent instanceof BorrowAmountPickerViewEvent.ConfirmCustomAmount) {
                throw new IllegalStateException((Reflection.factory.getOrCreateKotlinClass(BorrowAmountPickerViewEvent.ConfirmCustomAmount.class).getSimpleName() + " is an invalid event in " + coroutineScope.getClass()).toString());
            }
            if (!(borrowAmountPickerViewEvent instanceof BorrowAmountPickerViewEvent.Dismiss)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            borrowHomeAmountPickerPresenter.navigator.goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$buynowpaylater$presenters$AfterPayOrderHubPresenter$models$$inlined$CollectEffect$3$1(Object obj, Continuation continuation) {
        AfterPaySheetAnalyticsContext afterPaySheetAnalyticsContext;
        CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.$lazyListState;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
        RealRouter realRouter = (RealRouter) cardStudioPresenter.appConfig;
        AfterPayOrderHubViewEvent afterPayOrderHubViewEvent = (AfterPayOrderHubViewEvent) obj;
        if (Intrinsics.areEqual(afterPayOrderHubViewEvent, AfterPayOrderHubViewEvent.ToolbarBackClicked.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (afterPayOrderHubViewEvent instanceof AfterPayOrderHubViewEvent.OrderRowClicked) {
            realRouter.route(new RoutingParams((AfterPayOrderHubScreen) cardStudioPresenter.analytics, null, null, null, null, null, 510), ((AfterPayOrderHubViewEvent.OrderRowClicked) afterPayOrderHubViewEvent).url);
        } else if (afterPayOrderHubViewEvent instanceof AfterPayOrderHubViewEvent.ActionButtonClicked) {
            realRouter.route(new RoutingParams(new AfterPayOrderHubScreen(((AfterPayOrderHubScreen) cardStudioPresenter.analytics).fromLocation, true), null, null, null, null, null, 510), ((AfterPayOrderHubViewEvent.ActionButtonClicked) afterPayOrderHubViewEvent).url);
        } else if (afterPayOrderHubViewEvent instanceof AfterPayOrderHubViewEvent.TextWithInfoClicked) {
            AfterPayOrderHubViewEvent.TextWithInfoClicked textWithInfoClicked = (AfterPayOrderHubViewEvent.TextWithInfoClicked) afterPayOrderHubViewEvent;
            InfoSheetViewModel infoSheetViewModel = textWithInfoClicked.getInfoSheetViewModel();
            if (textWithInfoClicked instanceof AfterPayOrderHubViewEvent.TextWithInfoClicked.AvailableBalanceInfoClicked) {
                afterPaySheetAnalyticsContext = AfterPaySheetAnalyticsContext.AvailableCredit.INSTANCE;
            } else if (textWithInfoClicked instanceof AfterPayOrderHubViewEvent.TextWithInfoClicked.NonCashAppPayInfoClicked) {
                afterPaySheetAnalyticsContext = new AfterPaySheetAnalyticsContext.ManageOrderInAfterPayAnalytics(((AfterPayOrderHubViewEvent.TextWithInfoClicked.NonCashAppPayInfoClicked) textWithInfoClicked).orderId);
            } else {
                if (!(textWithInfoClicked instanceof AfterPayOrderHubViewEvent.TextWithInfoClicked.TotalOwedInfoClicked)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                afterPaySheetAnalyticsContext = AfterPaySheetAnalyticsContext.TotalOwed.INSTANCE;
            }
            screenNavigator.goTo(new AfterPayInfoSheetScreen(infoSheetViewModel, afterPaySheetAnalyticsContext));
        } else if (afterPayOrderHubViewEvent instanceof AfterPayOrderHubViewEvent.OpenUrl) {
            realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), ((AfterPayOrderHubViewEvent.OpenUrl) afterPayOrderHubViewEvent).url);
        } else {
            if (!(afterPayOrderHubViewEvent instanceof AfterPayOrderHubViewEvent.TryAgainClicked)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ((MutableState) this.$calendarModel).setValue(cardStudioPresenter.createPagerFlow((CoroutineScope) this.$onDisplayedMonthChange));
            ((MutableState) this.$yearRange).setValue(new PagingData(new AppLockMonitor$special$$inlined$map$2(new PageEvent.StaticList(EmptyList.INSTANCE), 19), PagingData.NOOP_UI_RECEIVER, PagingData.NOOP_HINT_RECEIVER, new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(29)));
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$card$onboarding$CardPreviewPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        State state = (State) this.$yearRange;
        CardPreviewPresenter cardPreviewPresenter = (CardPreviewPresenter) this.$onDisplayedMonthChange;
        BetterNavigator.ScreenNavigator screenNavigator = cardPreviewPresenter.navigator;
        Analytics analytics = cardPreviewPresenter.analytics;
        CardPreviewScreen cardPreviewScreen = cardPreviewPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$lazyListState;
        CardPreviewViewEvent cardPreviewViewEvent = (CardPreviewViewEvent) obj;
        Continuation continuation2 = null;
        if (cardPreviewViewEvent instanceof CardPreviewViewEvent.OrderCard) {
            JobKt.launch$default(coroutineScope, null, null, new CardStudioPresenter$models$1$1(4, (MutableState) this.$calendarModel, cardPreviewPresenter, cardPreviewViewEvent, continuation2), 3);
        } else if (cardPreviewViewEvent instanceof CardPreviewViewEvent.PersonalizeCard) {
            String str = (String) state.getValue();
            if (str != null) {
                CardPreviewPresenter.access$trackFpsMetadata(cardPreviewPresenter, str, ((CardPreviewViewEvent.PersonalizeCard) cardPreviewViewEvent).averageFps);
            }
            analytics.track(new CashCardCustomizeTap(String.valueOf(cardPreviewScreen.blockersData.clientScenario), cardPreviewScreen.blockersData.flowToken, Boolean.valueOf(cardPreviewPresenter.hasCustomization)), null);
            screenNavigator.goTo(new CardStudioScreen(cardPreviewScreen.blockersData, cardPreviewScreen.cashtagDisplay, cardPreviewScreen.cashtag, cardPreviewScreen.customizationEligible, cardPreviewScreen.availableStamps));
        } else if (cardPreviewViewEvent instanceof CardPreviewViewEvent.Exit) {
            analytics.track(new CashCardCustomizeClose(CashCardCustomizeClose.CustomizationType.PERSONALIZATION), null);
            String str2 = (String) state.getValue();
            if (str2 != null) {
                CardPreviewPresenter.access$trackFpsMetadata(cardPreviewPresenter, str2, ((CardPreviewViewEvent.Exit) cardPreviewViewEvent).averageFps);
            }
            JobKt.launch$default(coroutineScope, cardPreviewPresenter.ioDispatcher, null, new CardPreviewPresenter$models$2$4(cardPreviewPresenter, continuation2, 0), 2);
        } else {
            if (!(cardPreviewViewEvent instanceof CardPreviewViewEvent.Back)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String str3 = (String) state.getValue();
            if (str3 != null) {
                CardPreviewPresenter.access$trackFpsMetadata(cardPreviewPresenter, str3, ((CardPreviewViewEvent.Back) cardPreviewViewEvent).averageFps);
            }
            screenNavigator.goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$card$onboarding$CardStudioPresenterV2$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CardStudioViewModelV2.Content copy$default;
        CardStudioViewModelV2.Content copy$default2;
        CardStudioViewModelV2.Content copy$default3;
        MutableState mutableState = (MutableState) this.$yearRange;
        MutableState mutableState2 = (MutableState) this.$calendarModel;
        CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.$onDisplayedMonthChange;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$lazyListState;
        CardStudioViewEventV2 cardStudioViewEventV2 = (CardStudioViewEventV2) obj;
        Continuation continuation2 = null;
        if (Intrinsics.areEqual(cardStudioViewEventV2, CardStudioViewEventV2.Exit.INSTANCE)) {
            JobKt.launch$default(coroutineScope, null, null, new CardStudioPresenterV2$models$6$1(cardStudioPresenter, continuation2, 0), 3);
        } else if (cardStudioViewEventV2 instanceof CardStudioViewEventV2.DoneCustomizing) {
            JobKt.launch$default(coroutineScope, null, null, new CardStudioPresenterV2$models$6$2(cardStudioPresenter, cardStudioViewEventV2, mutableState2, continuation2, 0), 3);
        } else if (cardStudioViewEventV2 instanceof CardStudioViewEventV2.UpdateTempCustomization) {
            JobKt.launch$default(coroutineScope, null, null, new CardStudioPresenterV2$models$6$2(cardStudioPresenter, cardStudioViewEventV2, mutableState2, continuation2, 1), 3);
        } else if (cardStudioViewEventV2 instanceof CardStudioViewEventV2$ModeTransition$Enter) {
            CardStudioViewModelV2.CustomizationMode customizationMode = ((CardStudioViewEventV2$ModeTransition$Enter) cardStudioViewEventV2).mode;
            CardStudioViewModelV2 cardStudioViewModelV2 = (CardStudioViewModelV2) mutableState2.getValue();
            cardStudioViewModelV2.getClass();
            copy$default3 = CardStudioViewModelV2.Content.copy$default((CardStudioViewModelV2.Content) cardStudioViewModelV2, false, null, null, CardStudioPresenter.toCardStudioOrientation((DeviceOrientation) mutableState.getValue()), null, null, false, 1919);
            mutableState2.setValue(CardStudioViewModelV2.Content.copy$default(copy$default3, false, null, customizationMode, null, null, null, false, 1983));
        } else if (Intrinsics.areEqual(cardStudioViewEventV2, CardStudioViewEventV2$ModeTransition$Exit$Draw.INSTANCE) || (cardStudioViewEventV2 instanceof CardStudioViewEventV2$ModeTransition$Exit$Pattern)) {
            CardStudioViewModelV2 cardStudioViewModelV22 = (CardStudioViewModelV2) mutableState2.getValue();
            cardStudioViewModelV22.getClass();
            copy$default = CardStudioViewModelV2.Content.copy$default((CardStudioViewModelV2.Content) cardStudioViewModelV22, false, null, null, CardStudioPresenter.toCardStudioOrientation((DeviceOrientation) mutableState.getValue()), null, null, false, 1919);
            mutableState2.setValue(CardStudioViewModelV2.Content.copy$default(copy$default, false, null, CardStudioViewModelV2.CustomizationMode.DEFAULT.INSTANCE, null, null, null, false, 1983));
        } else if (cardStudioViewEventV2 instanceof CardStudioViewEventV2.SetPatternDensity) {
            CardStudioViewModelV2 cardStudioViewModelV23 = (CardStudioViewModelV2) mutableState2.getValue();
            cardStudioViewModelV23.getClass();
            copy$default2 = CardStudioViewModelV2.Content.copy$default((CardStudioViewModelV2.Content) cardStudioViewModelV23, false, null, null, CardStudioPresenter.toCardStudioOrientation((DeviceOrientation) mutableState.getValue()), null, null, false, 1919);
            mutableState2.setValue(CardStudioViewModelV2.Content.copy$default(copy$default2, false, null, null, null, ((CardStudioViewEventV2.SetPatternDensity) cardStudioViewEventV2).density, null, false, 1791));
        } else if (Intrinsics.areEqual(cardStudioViewEventV2, CardStudioViewEventV2.ShowExitDialog.INSTANCE)) {
            screenNavigator.askQuestion(CardStudioExitQuestion.INSTANCE, CardStudioPresenterV2$models$6$4.INSTANCE);
        } else if (cardStudioViewEventV2 instanceof CardStudioViewEventV2.ShowStamps) {
            screenNavigator.askQuestion(new StampQuestion(((CardStudioScreen) cardStudioPresenter.args).availableStamps), new KClasses$$Lambda$2(cardStudioPresenter, 11));
        } else if (Intrinsics.areEqual(cardStudioViewEventV2, CardStudioViewEventV2.ShowMoreSheet.INSTANCE)) {
            CardStudioViewModelV2 cardStudioViewModelV24 = (CardStudioViewModelV2) mutableState2.getValue();
            cardStudioViewModelV24.getClass();
            screenNavigator.askQuestion(CardStudioMoreSheetQuestion.INSTANCE, new KClasses$$Lambda$2((CardStudioViewModelV2.Content) cardStudioViewModelV24, 12));
        } else if (Intrinsics.areEqual(cardStudioViewEventV2, CardStudioViewEventV2.ClearPendingStampResult.INSTANCE)) {
            CardStudioViewModelV2 cardStudioViewModelV25 = (CardStudioViewModelV2) mutableState2.getValue();
            cardStudioViewModelV25.getClass();
            CardStudioViewModelV2.Content content = (CardStudioViewModelV2.Content) cardStudioViewModelV25;
            if (content.pendingStampResult != null) {
                mutableState2.setValue(CardStudioViewModelV2.Content.copy$default(content, false, null, null, null, null, null, false, 1535));
            }
        } else if (Intrinsics.areEqual(cardStudioViewEventV2, CardStudioViewEventV2.ClearPendingClearAll.INSTANCE)) {
            CardStudioViewModelV2 cardStudioViewModelV26 = (CardStudioViewModelV2) mutableState2.getValue();
            cardStudioViewModelV26.getClass();
            CardStudioViewModelV2.Content content2 = (CardStudioViewModelV2.Content) cardStudioViewModelV26;
            if (content2.pendingClearAll) {
                mutableState2.setValue(CardStudioViewModelV2.Content.copy$default(content2, false, null, null, null, null, null, false, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2));
            }
        } else {
            if (!(cardStudioViewEventV2 instanceof CardStudioViewEventV2.DeleteAllCustomization)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            JobKt.launch$default(coroutineScope, null, null, new CardStudioPresenterV2$models$6$2(cardStudioPresenter, cardStudioViewEventV2, mutableState2, continuation2, 2), 3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:289:0x066c, code lost:
    
        if (r1 != null) goto L276;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x068a  */
    /* JADX WARN: Type inference failed for: r10v21, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v7, types: [squareup.cash.overdraft.OverdraftStatus$Button] */
    /* JADX WARN: Type inference failed for: r12v8, types: [squareup.cash.overdraft.OverdraftStatus$Button] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v157, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v34, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.util.ArrayList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetEditorialResponse.ShareLinkInfo shareLinkInfo;
        int intValue;
        Object obj2;
        ?? r2;
        List<Reaction> list;
        OverdraftStatus.Button button;
        String str;
        Event benefitsHubTapStartBenefit;
        ArrayList arrayList;
        int i = this.$r8$classId;
        int i2 = 0;
        Back back = Back.INSTANCE;
        int i3 = 1;
        Object obj3 = this.$yearRange;
        Object obj4 = this.$calendarModel;
        Object obj5 = this.$onDisplayedMonthChange;
        Object obj6 = this.$lazyListState;
        ?? r12 = 0;
        String str2 = null;
        r12 = 0;
        switch (i) {
            case 0:
                ((Number) obj).intValue();
                LazyListScrollPosition lazyListScrollPosition = ((LazyListState) obj6).scrollPosition;
                int intValue2 = lazyListScrollPosition.index$delegate.getIntValue() / 12;
                int intValue3 = (lazyListScrollPosition.index$delegate.getIntValue() % 12) + 1;
                CalendarModelImpl calendarModelImpl = (CalendarModelImpl) obj4;
                int i4 = ((IntRange) obj3).first + intValue2;
                calendarModelImpl.getClass();
                ((Function1) obj5).invoke(new Long(calendarModelImpl.getMonth(LocalDate.of(i4, intValue3, 1)).startUtcTimeMillis));
                return Unit.INSTANCE;
            case 1:
                Interaction interaction = (Interaction) obj;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj5;
                Ref$IntRef ref$IntRef3 = (Ref$IntRef) obj6;
                if (interaction instanceof PressInteraction.Press) {
                    ref$IntRef3.element++;
                } else if (interaction instanceof PressInteraction.Release) {
                    ref$IntRef3.element--;
                } else if (interaction instanceof PressInteraction.Cancel) {
                    ref$IntRef3.element--;
                } else if (interaction instanceof HoverInteraction$Enter) {
                    ref$IntRef2.element++;
                } else if (interaction instanceof HoverInteraction$Exit) {
                    ref$IntRef2.element--;
                } else if (interaction instanceof FocusInteraction$Focus) {
                    ref$IntRef.element++;
                } else if (interaction instanceof FocusInteraction$Unfocus) {
                    ref$IntRef.element--;
                }
                boolean z = ref$IntRef3.element > 0;
                boolean z2 = ref$IntRef2.element > 0;
                boolean z3 = ref$IntRef.element > 0;
                DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = (DefaultDebugIndication.DefaultDebugIndicationInstance) obj3;
                if (defaultDebugIndicationInstance.isPressed != z) {
                    defaultDebugIndicationInstance.isPressed = z;
                    i2 = 1;
                }
                if (defaultDebugIndicationInstance.isHovered != z2) {
                    defaultDebugIndicationInstance.isHovered = z2;
                    i2 = 1;
                }
                if (defaultDebugIndicationInstance.isFocused != z3) {
                    defaultDebugIndicationInstance.isFocused = z3;
                } else {
                    i3 = i2;
                }
                if (i3 != 0) {
                    DepthSortedSetKt.invalidateDraw(defaultDebugIndicationInstance);
                }
                return Unit.INSTANCE;
            case 2:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj4;
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj6;
                if (((Boolean) obj).booleanValue() && legacyTextFieldState.getHasFocus()) {
                    KeyMappingKt.startInputSession((TextInputService) obj5, legacyTextFieldState, textFieldSelectionManager.getValue$foundation(), (ImeOptions) obj3, textFieldSelectionManager.offsetMapping);
                } else {
                    KeyMappingKt.endInputSession(legacyTextFieldState);
                }
                return Unit.INSTANCE;
            case 3:
                MutableState mutableState = (MutableState) obj3;
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj5;
                RealLocalLauncher realLocalLauncher = (RealLocalLauncher) localEditorialPresenter.launcher;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                LocalEditorialViewEvent localEditorialViewEvent = (LocalEditorialViewEvent) obj;
                if (Intrinsics.areEqual(localEditorialViewEvent, LocalEditorialViewEvent.BackClicked.INSTANCE)) {
                    screenNavigator.goTo(back);
                } else if (Intrinsics.areEqual(localEditorialViewEvent, LocalEditorialViewEvent.ShareClicked.INSTANCE)) {
                    GetEditorialResponse getEditorialResponse = (GetEditorialResponse) ((MutableState) obj4).getValue();
                    if (getEditorialResponse != null && (shareLinkInfo = getEditorialResponse.share_link_info) != null) {
                        String str3 = shareLinkInfo.title;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = shareLinkInfo.url;
                        str4.getClass();
                        realLocalLauncher.shareUri(str3, str4);
                    }
                } else if (localEditorialViewEvent instanceof LocalEditorialViewEvent.UrlClicked) {
                    realLocalLauncher.openWeb(screenNavigator, ((LocalEditorialViewEvent.UrlClicked) localEditorialViewEvent).url);
                } else if (localEditorialViewEvent instanceof LocalEditorialViewEvent.CarouselItemClicked) {
                    realLocalLauncher.openWeb(screenNavigator, ((LocalEditorialViewEvent.CarouselItemClicked) localEditorialViewEvent).url);
                } else {
                    boolean z4 = localEditorialViewEvent instanceof LocalEditorialViewEvent.AddBrandClicked;
                    Continuation continuation2 = null;
                    if (z4) {
                        JobKt.launch$default(coroutineScope, null, null, new LocalEditorialPresenter$models$2$2(localEditorialPresenter, localEditorialViewEvent, mutableState, continuation2, 0), 3);
                    } else {
                        if (!(localEditorialViewEvent instanceof LocalEditorialViewEvent.RemoveBrandClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope, null, null, new LocalEditorialPresenter$models$2$2(localEditorialPresenter, localEditorialViewEvent, mutableState, continuation2, 1), 3);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj6;
                if (Intrinsics.areEqual((BrandFollowViewEvent$Toggled) obj, BrandFollowViewEvent$Toggled.INSTANCE)) {
                    JobKt.launch$default(coroutineScope2, null, null, new SliderState$drag$2((RealBrandFollowPresenter) obj5, (State) obj4, (MutableState) obj3, null, 26), 3);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 5:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                LocalOrderStatusViewEvent localOrderStatusViewEvent = (LocalOrderStatusViewEvent) obj;
                if (localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.RetryClicked) {
                    ((MutableState) obj5).setValue(Boolean.FALSE);
                    ((MutableState) obj4).setValue(null);
                    int intValue4 = parcelableSnapshotMutableIntState.getIntValue();
                    parcelableSnapshotMutableIntState.setIntValue(intValue4 + 1);
                    Okio.boxInt(intValue4);
                } else if (localOrderStatusViewEvent instanceof LocalOrderStatusViewEvent.CloseClicked) {
                    LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) obj6;
                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter2.navigator).goTo(new LocalBrandProfileScreen(new BrandSpot(((LocalCheckoutDeeplinkScreen) localEditorialPresenter2.responseContextHandler).brandToken, null), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState2 = (MutableState) obj3;
                LocalOrderStatusViewEvent localOrderStatusViewEvent2 = (LocalOrderStatusViewEvent) obj;
                if (localOrderStatusViewEvent2 instanceof LocalOrderStatusViewEvent.CloseClicked) {
                    LocalOrderStatusPresenter localOrderStatusPresenter = (LocalOrderStatusPresenter) obj6;
                    BetterNavigator.ScreenNavigator screenNavigator2 = localOrderStatusPresenter.navigator;
                    LocalOrderStatusScreen.Type type2 = localOrderStatusPresenter.screen.f913type;
                    if (type2 instanceof LocalOrderStatusScreen.Type.Preloaded) {
                        LocalOrder localOrder = ((LocalOrderStatusScreen.Type.Preloaded) type2).order;
                        LocalOrder.LocalOrderBrand localOrderBrand = localOrder.local_order_brand;
                        localOrderBrand.getClass();
                        String str5 = localOrderBrand.token;
                        str5.getClass();
                        LocalLocationSummary localLocationSummary = localOrder.location_summary;
                        localLocationSummary.getClass();
                        String str6 = localLocationSummary.token;
                        str6.getClass();
                        screenNavigator2.goTo(new LocalBrandProfileScreen(new BrandSpot(str5, str6), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                    } else {
                        if (!(type2 instanceof LocalOrderStatusScreen.Type.Standalone)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator2.goTo(back);
                    }
                } else if (localOrderStatusViewEvent2 instanceof LocalOrderStatusViewEvent.RetryClicked) {
                    ((MutableState) obj5).setValue(Boolean.TRUE);
                    ((MutableState) obj4).setValue(null);
                    int intValue5 = ((Number) mutableState2.getValue()).intValue();
                    mutableState2.setValue(Integer.valueOf(intValue5 + 1));
                    Okio.boxInt(intValue5);
                }
                return Unit.INSTANCE;
            case 7:
                Pair pair = (Pair) obj;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj3;
                int intValue6 = ((Number) pair.first).intValue();
                if (((Boolean) pair.second).booleanValue()) {
                    intValue = CollectionsKt__CollectionsKt.getLastIndex(((LocalBrandLocationMenuViewModel) obj5).menuCategories);
                } else {
                    Integer num = (Integer) ((Map) ((MutableState) obj4).getValue()).get(new Integer(intValue6));
                    intValue = num != null ? num.intValue() : 0;
                }
                if (parcelableSnapshotMutableIntState2.getIntValue() == intValue) {
                    return Unit.INSTANCE;
                }
                parcelableSnapshotMutableIntState2.setIntValue(intValue);
                WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                Object animateScrollToItem = ((LazyListState) obj6).animateScrollToItem(intValue, 0, continuation);
                return animateScrollToItem == CoroutineSingletons.COROUTINE_SUSPENDED ? animateScrollToItem : Unit.INSTANCE;
            case 8:
                int intValue7 = ((Number) obj).intValue();
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj5;
                Ref$IntRef ref$IntRef4 = (Ref$IntRef) obj6;
                int i5 = ref$IntRef4.element;
                if (intValue7 > i5 && !ref$BooleanRef2.element) {
                    ((Function1) mutableState3.getValue()).invoke(LocalPosBrandOnboardingViewEvent.SwipeUp.INSTANCE);
                    ref$BooleanRef2.element = true;
                } else if (intValue7 < i5 && !ref$BooleanRef.element) {
                    ((Function1) mutableState3.getValue()).invoke(LocalPosBrandOnboardingViewEvent.SwipeDown.INSTANCE);
                    ref$BooleanRef.element = true;
                }
                ref$IntRef4.element = intValue7;
                return Unit.INSTANCE;
            case 9:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) obj3;
                LocalEditorialPresenter localEditorialPresenter3 = (LocalEditorialPresenter) obj5;
                Analytics analytics = (Analytics) localEditorialPresenter3.installedStore;
                MutableState mutableState4 = (MutableState) obj4;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj6;
                ThemeSwitcherViewEvent themeSwitcherViewEvent = (ThemeSwitcherViewEvent) obj;
                if (themeSwitcherViewEvent instanceof ThemeSwitcherViewEvent.SelectTheme) {
                    ThemeSwitcherViewModel themeSwitcherViewModel = (ThemeSwitcherViewModel) mutableState4.getValue();
                    themeSwitcherViewModel.getClass();
                    ThemeSwitcherViewModel.Loaded loaded = (ThemeSwitcherViewModel.Loaded) themeSwitcherViewModel;
                    ArrayList arrayList2 = loaded.themeData;
                    PaymentPadTheme paymentPadTheme = loaded.selectedTheme;
                    PaymentPadTheme paymentPadTheme2 = ((ThemeSwitcherViewEvent.SelectTheme) themeSwitcherViewEvent).theme;
                    if (paymentPadTheme != paymentPadTheme2) {
                        mutableState4.setValue(new ThemeSwitcherViewModel.Loaded(arrayList2, paymentPadTheme2, paymentPadTheme, true, loaded.showBratHype));
                    }
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((ThemeData) it.next()).theme);
                    }
                    analytics.track(new ThemePickerManageSelect(LocalEditorialPresenter.access$toCdfTheme(localEditorialPresenter3, paymentPadTheme2), new Integer(arrayList3.indexOf(paymentPadTheme2))), null);
                } else if (Intrinsics.areEqual(themeSwitcherViewEvent, ThemeSwitcherViewEvent.Done.INSTANCE)) {
                    JobKt.launch$default(coroutineScope3, null, null, new EditProfilePresenter$models$2$1(localEditorialPresenter3, mutableState4, (Continuation) null), 3);
                } else if (Intrinsics.areEqual(themeSwitcherViewEvent, ThemeSwitcherViewEvent.Exit.INSTANCE)) {
                    analytics.track(new ThemePickerManageExit(), null);
                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter3.navigator).goTo(back);
                } else if (Intrinsics.areEqual(themeSwitcherViewEvent, ThemeSwitcherViewEvent.Retry.INSTANCE)) {
                    mutableState4.setValue(ThemeSwitcherViewModel.Loading.INSTANCE);
                    int intValue8 = parcelableSnapshotMutableIntState3.getIntValue();
                    parcelableSnapshotMutableIntState3.setIntValue(intValue8 + 1);
                    Okio.boxInt(intValue8);
                } else {
                    if (!Intrinsics.areEqual(themeSwitcherViewEvent, ThemeSwitcherViewEvent.AnimationComplete.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ThemeSwitcherViewModel themeSwitcherViewModel2 = (ThemeSwitcherViewModel) mutableState4.getValue();
                    themeSwitcherViewModel2.getClass();
                    ThemeSwitcherViewModel.Loaded loaded2 = (ThemeSwitcherViewModel.Loaded) themeSwitcherViewModel2;
                    mutableState4.setValue(new ThemeSwitcherViewModel.Loaded(loaded2.themeData, loaded2.selectedTheme, null, false, loaded2.showBratHype));
                }
                return Unit.INSTANCE;
            case 10:
                PaymentHistoryActivityItemPresenter paymentHistoryActivityItemPresenter = (PaymentHistoryActivityItemPresenter) obj6;
                ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) obj;
                if (activityItemCallbackEvent instanceof ActivityItemCallbackEvent.ShowReactionPicker) {
                    MutableState mutableState5 = (MutableState) obj5;
                    if (((ActivityItemCallbackEvent.ShowReactionPicker) activityItemCallbackEvent).show) {
                        PaymentHistoryReactions paymentHistoryReactions = paymentHistoryActivityItemPresenter.activityItem.getPaymentHistoryData().reactions;
                        if (paymentHistoryReactions == null || (list = paymentHistoryReactions.available_reactions) == null) {
                            r2 = EmptyList.INSTANCE;
                        } else {
                            r2 = new ArrayList();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                String str7 = ((Reaction) it2.next()).data;
                                if (str7 != null) {
                                    r2.add(str7);
                                }
                            }
                        }
                        ReadonlyStateFlow readonlyStateFlow = paymentHistoryActivityItemPresenter.sharedReactionState.reactionConfig;
                        if (readonlyStateFlow == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("reactionConfig");
                            throw null;
                        }
                        obj2 = new ReactionsState.Shown(r2, (ReactionConfig) readonlyStateFlow.$$delegate_0.getValue());
                    } else {
                        obj2 = ReactionsState.Hidden.INSTANCE;
                    }
                    mutableState5.setValue(obj2);
                } else if (activityItemCallbackEvent instanceof ActivityItemCallbackEvent.ShowProgress) {
                    ((MutableState) obj4).setValue(Boolean.TRUE);
                } else if (!(activityItemCallbackEvent instanceof ActivityItemCallbackEvent.AnalyticsEvent)) {
                    if (!(activityItemCallbackEvent instanceof ActivityItemCallbackEvent.DismissBadge)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((MutableState) obj3).setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 11:
                Function1 function1 = ((UiCallbackModel) obj3).onEvent;
                Function1 function12 = ((UiCallbackModel) obj4).onEvent;
                AfterpayAppletPurchasesEmbeddedPresenter afterpayAppletPurchasesEmbeddedPresenter = (AfterpayAppletPurchasesEmbeddedPresenter) obj5;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = afterpayAppletPurchasesEmbeddedPresenter.afterpayAppletAnalytics;
                BetterNavigator.ScreenNavigator screenNavigator3 = afterpayAppletPurchasesEmbeddedPresenter.navigator;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj6;
                AfterpayAppletPurchasesEmbeddedViewEvent afterpayAppletPurchasesEmbeddedViewEvent = (AfterpayAppletPurchasesEmbeddedViewEvent) obj;
                if (afterpayAppletPurchasesEmbeddedViewEvent instanceof AfterpayAppletPurchasesEmbeddedViewEvent.TapBack) {
                    screenNavigator3.goTo(back);
                } else {
                    boolean z5 = afterpayAppletPurchasesEmbeddedViewEvent instanceof AfterpayAppletPurchasesEmbeddedViewEvent.Refresh;
                    ActivityEmbeddedViewEvent.Refresh refresh = ActivityEmbeddedViewEvent.Refresh.INSTANCE;
                    if (z5) {
                        JobKt.launch$default(coroutineScope4, null, null, new MLKitTitleGenerator$1(afterpayAppletPurchasesEmbeddedPresenter, r12, 6), 3);
                        function12.invoke(refresh);
                        function1.invoke(refresh);
                    } else if (afterpayAppletPurchasesEmbeddedViewEvent instanceof AfterpayAppletPurchasesEmbeddedViewEvent.TryAgainTapped) {
                        function12.invoke(refresh);
                        function1.invoke(refresh);
                    } else if (afterpayAppletPurchasesEmbeddedViewEvent instanceof AfterpayAppletPurchasesEmbeddedViewEvent.FooterLinkTapped) {
                        RealRouter realRouter = afterpayAppletPurchasesEmbeddedPresenter.router;
                        String str8 = ((AfterpayAppletPurchasesEmbeddedViewEvent.FooterLinkTapped) afterpayAppletPurchasesEmbeddedViewEvent).actionUrl;
                        AfterpayAppletScreen$AfterpayAppletPurchasesScreen afterpayAppletScreen$AfterpayAppletPurchasesScreen = afterpayAppletPurchasesEmbeddedPresenter.args;
                        realRouter.route(new RoutingParams(afterpayAppletScreen$AfterpayAppletPurchasesScreen, null, afterpayAppletScreen$AfterpayAppletPurchasesScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str8);
                    } else if (afterpayAppletPurchasesEmbeddedViewEvent instanceof AfterpayAppletPurchasesEmbeddedViewEvent.SeeAllUpcomingPurchases) {
                        Map map = AfterpayAppletPurchasesEmbeddedPresenter.refreshAttributePurchase;
                        realAfterpayAppletAnalytics.trackViewedAllOrders(false);
                        screenNavigator3.goTo(new AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen(AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType.UPCOMING));
                    } else {
                        if (!(afterpayAppletPurchasesEmbeddedViewEvent instanceof AfterpayAppletPurchasesEmbeddedViewEvent.SeeAllCompletedPurchases)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Map map2 = AfterpayAppletPurchasesEmbeddedPresenter.refreshAttributePurchase;
                        realAfterpayAppletAnalytics.trackViewedAllOrders(true);
                        screenNavigator3.goTo(new AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen(AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType.COMPLETED));
                    }
                }
                return Unit.INSTANCE;
            case 12:
                MutableState mutableState6 = (MutableState) obj3;
                MutableState mutableState7 = (MutableState) obj4;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj5;
                Analytics analytics2 = (Analytics) localHomePresenter.localHomeGeoPresenterFactory;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj6;
                BetterOverdraftViewEvent betterOverdraftViewEvent = (BetterOverdraftViewEvent) obj;
                if (Intrinsics.areEqual(betterOverdraftViewEvent, BetterOverdraftViewEvent.BackClicked.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(back);
                } else if (Intrinsics.areEqual(betterOverdraftViewEvent, BetterOverdraftViewEvent.ToggleButtonClicked.INSTANCE)) {
                    OverdraftStatus overdraftStatus = (OverdraftStatus) mutableState7.getValue();
                    overdraftStatus.getClass();
                    int ordinal = LocalHomePresenter.toToggleState(overdraftStatus).ordinal();
                    if (ordinal == 0) {
                        mutableState6.setValue(Boolean.TRUE);
                    } else if (ordinal == 1 || ordinal == 2) {
                        JobKt.launch$default(coroutineScope5, null, null, new BetterOverdraftPresenter$models$2$1(localHomePresenter, mutableState7, r12, i2), 3);
                    } else {
                        if (ordinal != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((ErrorReporter) localHomePresenter.featureFlagManager).report(new OverdraftInvalidToggleStateError((OverdraftStatus) mutableState7.getValue()), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    }
                } else if (Intrinsics.areEqual(betterOverdraftViewEvent, BetterOverdraftViewEvent.ConfirmTurnOffClicked.INSTANCE)) {
                    mutableState6.setValue(Boolean.FALSE);
                    JobKt.launch$default(coroutineScope5, null, null, new BetterOverdraftPresenter$models$2$1(localHomePresenter, mutableState7, r12, i3), 3);
                } else if (Intrinsics.areEqual(betterOverdraftViewEvent, BetterOverdraftViewEvent.CancelTurnOffClicked.INSTANCE)) {
                    mutableState6.setValue(Boolean.FALSE);
                } else if (Intrinsics.areEqual(betterOverdraftViewEvent, BetterOverdraftViewEvent.PayButtonClicked.INSTANCE)) {
                    OverdraftStatus overdraftStatus2 = (OverdraftStatus) mutableState7.getValue();
                    overdraftStatus2.getClass();
                    analytics2.track(new OverdraftCoverageManageRepay(), null);
                    OverdraftStatus.State_ state_ = overdraftStatus2.State;
                    if (state_ != null) {
                        OverdraftStatus.State_.Activated activated = state_ instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_ : null;
                        OverdraftStatus.Activated activated2 = activated != null ? activated.value : null;
                        if (activated2 != null) {
                            button = activated2.repayment_button;
                            break;
                        }
                    }
                    if (state_ != null) {
                        OverdraftStatus.State_.Disabled disabled = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : null;
                        OverdraftStatus.Disabled disabled2 = disabled != null ? disabled.value : null;
                        if (disabled2 != null) {
                            button = disabled2.repayment_button;
                            if (button == null) {
                                if (state_ != null) {
                                    OverdraftStatus.State_.PermanentlyDisabled permanentlyDisabled = state_ instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_ : null;
                                    OverdraftStatus.PermanentlyDisabled permanentlyDisabled2 = permanentlyDisabled != null ? permanentlyDisabled.value : null;
                                    if (permanentlyDisabled2 != null) {
                                        r12 = permanentlyDisabled2.repayment_button;
                                    }
                                }
                                if (r12 != 0) {
                                    ((RealRouter) localHomePresenter.neighborhoodsTabContentEnabled$delegate).route(new RoutingParams(null, null, ((OverdraftCoverageSheetScreen) localHomePresenter.tabContentPresenterFactory).exitScreen, null, null, null, 503), r12.client_route_url);
                                }
                            }
                            r12 = button;
                            if (r12 != 0) {
                            }
                        }
                    }
                    button = null;
                    if (button == null) {
                    }
                    r12 = button;
                    if (r12 != 0) {
                    }
                } else if (Intrinsics.areEqual(betterOverdraftViewEvent, BetterOverdraftViewEvent.SupportLinkClicked.INSTANCE)) {
                    analytics2.track(new OverdraftCoverageManageTapSupportLink(), null);
                }
                return Unit.INSTANCE;
            case 13:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj6;
                Analytics analytics3 = (Analytics) cardLockPresenter.analytics;
                RealRouter realRouter2 = (RealRouter) cardLockPresenter.flowNavigationHelper;
                RecurringDepositsScreen recurringDepositsScreen = (RecurringDepositsScreen) cardLockPresenter.franklinAppService;
                BetterNavigator.ScreenNavigator screenNavigator4 = cardLockPresenter.navigator;
                RecurringDepositsViewEvent recurringDepositsViewEvent = (RecurringDepositsViewEvent) obj;
                if (Intrinsics.areEqual(recurringDepositsViewEvent, RecurringDepositsViewEvent.ExitFlow.INSTANCE)) {
                    screenNavigator4.goTo(back);
                } else if (Intrinsics.areEqual(recurringDepositsViewEvent, RecurringDepositsViewEvent.LearnMoreHelpClick.INSTANCE)) {
                    ClientRoute.ViewSupportNode viewSupportNode = new ClientRoute.ViewSupportNode("auto_reload");
                    RecurringDepositsScreen recurringDepositsScreen2 = (RecurringDepositsScreen) cardLockPresenter.franklinAppService;
                    RoutingParams routingParams = new RoutingParams(recurringDepositsScreen2, null, recurringDepositsScreen2, null, null, null, HttpStatusCode.BAD_GATEWAY_502);
                    realRouter2.getClass();
                    realRouter2.clientRouteRouter.route(viewSupportNode, routingParams);
                } else if (recurringDepositsViewEvent instanceof RecurringDepositsViewEvent.BalanceBasedLockedConfirmedClick) {
                    String str9 = ((RecurringDepositsViewEvent.BalanceBasedLockedConfirmedClick) recurringDepositsViewEvent).route;
                    RecurringDepositsScreen recurringDepositsScreen3 = (RecurringDepositsScreen) cardLockPresenter.franklinAppService;
                    realRouter2.route(new RoutingParams(recurringDepositsScreen3, null, recurringDepositsScreen3, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str9);
                } else if (Intrinsics.areEqual(recurringDepositsViewEvent, RecurringDepositsViewEvent.BalanceBasedOptionClick.INSTANCE)) {
                    BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) ((State) obj4).getValue();
                    BalanceBasedAddCashPreference.State state = balanceBasedAddCashPreference != null ? balanceBasedAddCashPreference.state : null;
                    if (state instanceof BalanceBasedAddCashPreference.State.Enabled) {
                        screenNavigator4.goTo(new RecurringReloadOptionScreen(RecurringReloadOptionScreen.ReloadType.BALANCE_BASED, recurringDepositsScreen));
                    } else if (state instanceof BalanceBasedAddCashPreference.State.Locked) {
                        BalanceBasedAddCashPreference.State.Locked locked = (BalanceBasedAddCashPreference.State.Locked) state;
                        screenNavigator4.goTo(new BalanceBasedAddCashDisabledDialogScreen(locked.title, locked.description, locked.buttonText, locked.dismissButtonText, locked.clientRoute));
                    } else {
                        if (!(state instanceof BalanceBasedAddCashPreference.State.Disabled) && state != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        BankingOutboundNavigator$BalanceBasedAddCashIntent bankingOutboundNavigator$BalanceBasedAddCashIntent = BankingOutboundNavigator$BalanceBasedAddCashIntent.ENABLE;
                        analytics3.track(new BalanceBasedAddCashSettingsEdit(BalanceBasedAddCashSettingsEdit.SettingsOption.ENABLE), null);
                        ((UnleashContext) cardLockPresenter.ioDispatcher).goToBalanceBasedAddCashScreen(recurringDepositsScreen, bankingOutboundNavigator$BalanceBasedAddCashIntent);
                    }
                } else {
                    if (!Intrinsics.areEqual(recurringDepositsViewEvent, RecurringDepositsViewEvent.ScheduledOptionClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash = (RecurringDepositsViewModel.ScheduledAddCash) ((State) obj3).getValue();
                    if ((scheduledAddCash != null ? scheduledAddCash.state : null) instanceof RecurringDepositsViewModel.ScheduledAddCash.State.Enabled) {
                        screenNavigator4.goTo(new RecurringReloadOptionScreen(RecurringReloadOptionScreen.ReloadType.SCHEDULED, recurringDepositsScreen));
                    } else {
                        CashRecurringDepositEdit.SettingsOption settingsOption = CashRecurringDepositEdit.SettingsOption.ENABLE;
                        analytics3.track(new CashRecurringDepositEdit(), null);
                        JobKt.launch$default((CoroutineScope) obj5, null, null, new RecurringDepositsPresenter$models$1$1(cardLockPresenter, r12, i3), 3);
                    }
                }
                return Unit.INSTANCE;
            case 14:
                MutableState mutableState8 = (MutableState) obj4;
                BenefitsHomePresenter benefitsHomePresenter = (BenefitsHomePresenter) obj5;
                RealRouter realRouter3 = benefitsHomePresenter.router;
                BetterNavigator.ScreenNavigator screenNavigator5 = benefitsHomePresenter.navigator;
                Analytics analytics4 = benefitsHomePresenter.analytics;
                CoroutineScope coroutineScope6 = (CoroutineScope) obj6;
                BenefitsHomeViewEvent benefitsHomeViewEvent = (BenefitsHomeViewEvent) obj;
                ?? r10 = 0;
                if (Intrinsics.areEqual(benefitsHomeViewEvent, BenefitsHomeViewEvent.Exit.INSTANCE)) {
                    analytics4.track(new BankingBenefitsHomeTapClose(), null);
                    screenNavigator5.goTo(back);
                } else if (benefitsHomeViewEvent instanceof BenefitsHomeViewEvent.UrlTapped) {
                    realRouter3.route(new RoutingParams(null, null, null, null, null, null, 511), ((BenefitsHomeViewEvent.UrlTapped) benefitsHomeViewEvent).url);
                } else if (Intrinsics.areEqual(benefitsHomeViewEvent, BenefitsHomeViewEvent.OtherWaysToQualifyClicked.INSTANCE)) {
                    CashGreenV1 cashGreenV1 = (CashGreenV1) mutableState8.getValue();
                    analytics4.track(new BankingBenefitsHomeTapSupportLink(), null);
                    realRouter3.route(new RoutingParams(null, null, null, null, null, null, 511), cashGreenV1 != null ? cashGreenV1.support_url : null);
                } else if (!Intrinsics.areEqual(benefitsHomeViewEvent, BenefitsHomeViewEvent.ViewTransactionsClicked.INSTANCE)) {
                    if (!Intrinsics.areEqual(benefitsHomeViewEvent, BenefitsHomeViewEvent.StickyCtaClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope6, null, null, new ToastKt$Toast$9$1(benefitsHomePresenter, mutableState8, (State) obj3, r10 == true ? 1 : 0, 21), 3);
                } else if (benefitsHomePresenter.isEvergreenEligibleTransactionExperienceEnabled()) {
                    analytics4.track(new BankingBenefitsHomeTapEligibleTransactions(), null);
                    screenNavigator5.goTo(GreenEligibleTransactionsScreen.INSTANCE);
                } else {
                    zzb zzbVar = benefitsHomePresenter.benefitsOutboundNavigator;
                    String str10 = benefitsHomePresenter.stringManager.get(R.string.benefits_home_activity_section_title);
                    zzbVar.getClass();
                    str10.getClass();
                    JCAContext jCAContext = (JCAContext) zzbVar.zza;
                    jCAContext.getClass();
                    ((BetterNavigator.ScreenNavigator) jCAContext.provider).goTo(new CardActivityListScreen(str10));
                }
                return Unit.INSTANCE;
            case 15:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj6;
                RealRouter realRouter4 = (RealRouter) localPosCheckInPresenter.cameraPermissions;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                Analytics analytics5 = (Analytics) localPosCheckInPresenter.store;
                BenefitsHubViewEvent benefitsHubViewEvent = (BenefitsHubViewEvent) obj;
                if (benefitsHubViewEvent instanceof BenefitsHubViewEvent.ActionClicked) {
                    BenefitsHubViewModel benefitsHubViewModel = (BenefitsHubViewModel) ((MutableState) obj5).getValue();
                    benefitsHubViewModel.getClass();
                    BenefitsHubViewModel.Loaded loaded3 = (BenefitsHubViewModel.Loaded) benefitsHubViewModel;
                    RowAction.ID id = ((BenefitsHubViewEvent.ActionClicked) benefitsHubViewEvent).id;
                    BenefitsHubViewModel.Loaded.CallToActionViewModel callToActionViewModel = loaded3.callToAction;
                    if (id != (callToActionViewModel != null ? callToActionViewModel.id : null)) {
                        for (BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow benefitsRow : loaded3.benefits.rows) {
                            if (benefitsRow.actionId == id) {
                                str = benefitsRow.clientRoute;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    str = callToActionViewModel != null ? callToActionViewModel.clientRoute : null;
                    int ordinal2 = id.ordinal();
                    if (ordinal2 == 0) {
                        benefitsHubTapStartBenefit = new BenefitsHubTapStartBenefit(null);
                    } else if (ordinal2 == 1) {
                        benefitsHubTapStartBenefit = new BenefitsHubTapStartBenefit(BenefitsHubTapStartBenefit.Benefit.OverdraftCoverage);
                    } else if (ordinal2 == 2) {
                        benefitsHubTapStartBenefit = new BenefitsHubTapStartBenefit(BenefitsHubTapStartBenefit.Benefit.Savings);
                    } else {
                        if (ordinal2 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        benefitsHubTapStartBenefit = new BenefitsHubTapSetupDirectDeposit();
                    }
                    analytics5.track(benefitsHubTapStartBenefit, null);
                    String analyticsName = BlockersData.AnalyticsData.Source.BENEFITS_HUB.getAnalyticsName();
                    BenefitsHubScreen benefitsHubScreen = BenefitsHubScreen.INSTANCE;
                    realRouter4.route(new RoutingParams(benefitsHubScreen, analyticsName, benefitsHubScreen, null, null, null, 500), str);
                } else if (benefitsHubViewEvent instanceof BenefitsHubViewEvent.Close) {
                    screenNavigator6.goTo(back);
                } else if (Intrinsics.areEqual(benefitsHubViewEvent, BenefitsHubViewEvent.ExplainBenefitsClicked.INSTANCE)) {
                    BenefitsExplanationScreen benefitsExplanationScreen = (BenefitsExplanationScreen) ((MutableState) obj4).getValue();
                    benefitsExplanationScreen.getClass();
                    analytics5.track(new BenefitsHubTapLearnMore(), null);
                    screenNavigator6.goTo(benefitsExplanationScreen);
                } else if (benefitsHubViewEvent instanceof BenefitsHubViewEvent.Retry) {
                    ((MutableState) obj3).setValue(new Object());
                } else if (benefitsHubViewEvent instanceof BenefitsHubViewEvent.ScrolledThrough) {
                    analytics5.track(new BenefitsHubScrollScrolledThrough(((BenefitsHubViewEvent.ScrolledThrough) benefitsHubViewEvent).progress), null);
                } else if (benefitsHubViewEvent instanceof BenefitsHubViewEvent.UrlClicked) {
                    realRouter4.route(new RoutingParams(null, null, null, null, null, null, 511), ((BenefitsHubViewEvent.UrlClicked) benefitsHubViewEvent).url);
                } else {
                    if (!(benefitsHubViewEvent instanceof BenefitsHubViewEvent.InsightClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BenefitsHubViewModel.Loaded.Insight insight = ((BenefitsHubViewEvent.InsightClicked) benefitsHubViewEvent).insight;
                    analytics5.track(new BenefitsHubTapBenefitCard(), null);
                    BenefitDetailsViewModel benefitDetailsViewModel = insight.details;
                    benefitDetailsViewModel.getClass();
                    UiAvatar uiAvatar = benefitDetailsViewModel.avatar;
                    BenefitDetailsViewModel benefitDetailsViewModel2 = insight.details;
                    benefitDetailsViewModel2.getClass();
                    screenNavigator6.goTo(new BenefitDetailScreen(uiAvatar, benefitDetailsViewModel2.title, benefitDetailsViewModel2.contents, benefitDetailsViewModel2.disclaimers));
                }
                return Unit.INSTANCE;
            case 16:
                BitcoinStoriesWidgetViewEvent bitcoinStoriesWidgetViewEvent = (BitcoinStoriesWidgetViewEvent) obj;
                if (bitcoinStoriesWidgetViewEvent instanceof BitcoinStoriesWidgetViewEvent.OnStoryClicked) {
                    BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) obj5;
                    BitcoinStoriesWidgetViewModel bitcoinStoriesWidgetViewModel = (BitcoinStoriesWidgetViewModel) ((State) obj4).getValue();
                    bitcoinStoriesWidgetViewModel.getClass();
                    ?? r1 = ((BitcoinStoriesWidgetViewModel.Content) bitcoinStoriesWidgetViewModel).storyList;
                    BitcoinStoryViewModel bitcoinStoryViewModel = ((BitcoinStoriesWidgetViewEvent.OnStoryClicked) bitcoinStoriesWidgetViewEvent).storyViewModel;
                    if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) ((com.google.zxing.Result) obj6).text)).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinStories_3dcubeAnimation.INSTANCE)).enabled()) {
                        int indexOf = r1.indexOf(bitcoinStoryViewModel);
                        if (indexOf < 0) {
                            a$$ExternalSyntheticBUOutline0.m$1("Tried opening a story that's not in the list of stories");
                            return null;
                        }
                        Iterable<BitcoinStoryViewModel> iterable = (Iterable) r1;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                        for (BitcoinStoryViewModel bitcoinStoryViewModel2 : iterable) {
                            arrayList4.add(new EducationStoryScreen(bitcoinStoryViewModel2.url, bitcoinStoryViewModel2.sceneBackgroundColors, new BitcoinHome(AppNavigateOpenSpace.SourceTab.BITCOIN, AppNavigateOpenSpace.Source.CLIENT_ROUTE, null, null, 12), 20));
                        }
                        screenNavigator7.goTo(new EducationStoryViewPagerScreen(arrayList4, indexOf, ColorModel.Bitcoin.INSTANCE));
                    } else {
                        screenNavigator7.goTo(new EducationStoryScreen(bitcoinStoryViewModel.url, bitcoinStoryViewModel.sceneBackgroundColors, new BitcoinHome(AppNavigateOpenSpace.SourceTab.BITCOIN, AppNavigateOpenSpace.Source.CLIENT_ROUTE, null, null, 12), 4));
                    }
                } else {
                    if (!Intrinsics.areEqual(bitcoinStoriesWidgetViewEvent, BitcoinStoriesWidgetViewEvent.OnRefresh.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((MutableState) obj3).setValue(Boolean.valueOf(!((Boolean) r8.getValue()).booleanValue()));
                }
                return Unit.INSTANCE;
            case 17:
                return emit$com$squareup$cash$bitcoin$presenters$applet$onramp$BitcoinOnRampWidgetPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 18:
                return emit$com$squareup$cash$bitcoin$presenters$applet$stackingtools$BitcoinStackingToolsInfoPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 19:
                return emit$com$squareup$cash$bitcoin$presenters$custom$order$BitcoinPeriodSelectionPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 20:
                return emit$com$squareup$cash$bitcoin$presenters$deposits$copy$BitcoinDepositCopyPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 21:
                return emit$com$squareup$cash$blockers$presenters$FormBlockerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 22:
                return emit$com$squareup$cash$blockers$presenters$GpsLocationConsentBlockerPresenter$models$2$1$1$1(obj, continuation);
            case 23:
                return emit$com$squareup$cash$blockers$presenters$PasscodePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 24:
                return emit$com$squareup$cash$blockers$presenters$ReferralCodePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 25:
                return emit$com$squareup$cash$borrow$presenters$BorrowHomeAmountPickerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 26:
                return emit$com$squareup$cash$buynowpaylater$presenters$AfterPayOrderHubPresenter$models$$inlined$CollectEffect$3$1(obj, continuation);
            case 27:
                return emit$com$squareup$cash$card$onboarding$CardPreviewPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$card$onboarding$CardStudioPresenterV2$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                CaptureCheckFacePresenter captureCheckFacePresenter = (CaptureCheckFacePresenter) obj6;
                CaptureCheckFaceViewEvent captureCheckFaceViewEvent = (CaptureCheckFaceViewEvent) obj;
                if (Intrinsics.areEqual(captureCheckFaceViewEvent, CaptureCheckFaceViewEvent.GoBack.INSTANCE)) {
                    captureCheckFacePresenter.navigator.giveAnswer(captureCheckFacePresenter.args.question, CheckCaptureAnswer.Canceled.INSTANCE);
                } else if (Intrinsics.areEqual(captureCheckFaceViewEvent, CaptureCheckFaceViewEvent.GoToSettings.INSTANCE)) {
                    captureCheckFacePresenter.intentLauncher.launchSettings();
                } else if (captureCheckFaceViewEvent instanceof CaptureCheckFaceViewEvent.MiSnapFeedback) {
                    ?? r102 = (MutableState) obj5;
                    UserAction userAction = ((CaptureCheckFaceViewEvent.MiSnapFeedback) captureCheckFaceViewEvent).feedback;
                    AndroidStringManager androidStringManager = captureCheckFacePresenter.stringManager;
                    if (Intrinsics.areEqual(userAction, UserAction.Document.HOLD_STILL.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_hold_still_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.NOT_FOUND.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_not_found_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.PRESS_MANUAL_BUTTON.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_press_manual_button_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.REDUCE_GLARE.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_reduce_glare_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.STRAIGHTEN.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_straighten_check_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.TOO_BRIGHT.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_too_bright_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.TOO_CLOSE.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_too_close_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.TOO_DARK.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_too_dark_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.TOO_FAR.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_too_far_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.USE_DARK_BACKGROUND.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_dark_background_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_use_plain_background_hint);
                    } else if (Intrinsics.areEqual(userAction, UserAction.Document.WRONG_DOCUMENT.INSTANCE)) {
                        str2 = androidStringManager.get(R.string.misnap_document_wrong_document_hint);
                    }
                    r102.setValue(str2);
                } else if (captureCheckFaceViewEvent instanceof CaptureCheckFaceViewEvent.RawFinalFrame) {
                    MutableState mutableState9 = (MutableState) obj4;
                    CaptureCheckFaceViewEvent.RawFinalFrame rawFinalFrame = (CaptureCheckFaceViewEvent.RawFinalFrame) captureCheckFaceViewEvent;
                    Object obj7 = rawFinalFrame.captureWarnings;
                    if (obj7 == null) {
                        obj7 = EmptyList.INSTANCE;
                    }
                    mutableState9.setValue(obj7);
                    MutableState mutableState10 = (MutableState) obj3;
                    ByteString byteString = rawFinalFrame.frame;
                    List list2 = rawFinalFrame.fourCorners;
                    if (list2 != null) {
                        List<int[]> list3 = list2;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        for (int[] iArr : list3) {
                            arrayList5.add(new CaptureCheckFaceViewModel.Loaded.FinalFrame.Point(iArr[0], iArr[1]));
                        }
                        arrayList = arrayList5;
                    } else {
                        arrayList = null;
                    }
                    String str11 = rawFinalFrame.orientation;
                    mutableState10.setValue(new CaptureCheckFaceViewModel.Loaded.FinalFrame(byteString, arrayList, str11 != null ? str11.equals("Landscape") ? CaptureCheckFaceViewModel.Loaded.FinalFrame.Orientation.LANDSCAPE : CaptureCheckFaceViewModel.Loaded.FinalFrame.Orientation.PORTRAIT : null, rawFinalFrame.misnapViewWidth, rawFinalFrame.misnapViewHeight));
                } else {
                    if (!(captureCheckFaceViewEvent instanceof CaptureCheckFaceViewEvent.MiSnapError)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    MiSnapDocumentAnalyzer$Result$Failure miSnapDocumentAnalyzer$Result$Failure = ((CaptureCheckFaceViewEvent.MiSnapError) captureCheckFaceViewEvent).error;
                    if (miSnapDocumentAnalyzer$Result$Failure.equals(MiSnapDocumentAnalyzer$Result$Failure.ImageFormat.INSTANCE) || miSnapDocumentAnalyzer$Result$Failure.equals(MiSnapDocumentAnalyzer$Result$Failure.ImageFormat.INSTANCE$1)) {
                        throw new MiSnapIntegrationError(miSnapDocumentAnalyzer$Result$Failure.getClass().getSimpleName().concat(" error"));
                    }
                    if (!(miSnapDocumentAnalyzer$Result$Failure instanceof MiSnapDocumentAnalyzer$Result$Failure.License)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    captureCheckFacePresenter.errorReporter.report(new CheckDepositError.MiSnapLicenseError(((MiSnapDocumentAnalyzer$Result$Failure.License) miSnapDocumentAnalyzer$Result$Failure).a), new SampleStrategy$Companion$OneIn());
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DatePickerKt$updateDisplayedMonth$3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.$lazyListState = obj;
        this.$onDisplayedMonthChange = obj2;
        this.$calendarModel = obj3;
        this.$yearRange = obj4;
    }

    public /* synthetic */ DatePickerKt$updateDisplayedMonth$3(CoroutineScope coroutineScope, Object obj, Object obj2, Object obj3, State state, int i) {
        this.$r8$classId = i;
        this.$lazyListState = obj;
        this.$onDisplayedMonthChange = obj2;
        this.$calendarModel = obj3;
        this.$yearRange = state;
    }
}
