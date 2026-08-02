package androidx.compose.material;

import android.os.Handler;
import android.os.Message;
import androidx.activity.BackEventCompat;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.FocusInteraction$Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.FloatingActionButtonElevationAnimatable;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntRectKt;
import androidx.core.os.BundleKt;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.presenters.sheet.EducationalSheetPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalCurbsidePickupCarScreen;
import app.cash.local.screens.app.LocalEducationalSheet;
import app.cash.local.screens.app.LocalMarketingMessageScreen;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.screens.app.VehicleDescription;
import app.cash.local.viewmodels.CurbsidePickupCarViewEvent;
import app.cash.local.viewmodels.VehicleColorOption;
import app.cash.local.viewmodels.VehicleTypeOption;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewEvent;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.pos.LocalPosLocalCashRedemptionViewEvent;
import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchInitiationSource;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.screens.AddAccountScreen;
import com.squareup.cash.account.screens.SwitchFullAccountLoadingScreen;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewEvent;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.SingleActivity;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$models$1$1;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.afterpayapplet.applets.presenters.AfterpayAppletTilePresenter;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewEvent;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.applets.viewmodels.CreditRowType;
import com.squareup.cash.afterpayapplet.applets.viewmodels.CreditStateType;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.afterpayapplet.backend.AppletCreditLineState;
import com.squareup.cash.afterpayapplet.backend.HomeResult;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1;
import com.squareup.cash.afterpayapplet.db.AfterpayApplet;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter$models$1$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter$models$8$5$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletRetroOrderSelectionPresenter$models$1$1;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletInfoSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Loading;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletMerchantSheetViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletRetroOrderSelectionViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.appintro.presenters.SponsorshipRequestReferralIntroPresenter;
import com.squareup.cash.appintro.screens.AlternativeNewSponsorAliasScreen;
import com.squareup.cash.appintro.screens.SponsorshipRequestContent;
import com.squareup.cash.appintro.screens.SponsorshipRequestReferralIntroScreen;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.appmessages.sheet.SheetAppMessageEvent;
import com.squareup.cash.appmessages.views.RealTooltipTargetLoadedCallbackRegistry;
import com.squareup.cash.appmessages.views.TooltipAppMessageView;
import com.squareup.cash.appmessages.views.TooltipAppMessageView$renderTooltip$1$1$WhenMappings;
import com.squareup.cash.appmessages.views.TooltipContainerView;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTilePresenter$onClickAddCash$1;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.presenters.BalanceHomePresenter;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.DemandDepositDialogScreen;
import com.squareup.cash.banking.screens.OverdraftCoverageSheetScreen;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitDetailsViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewEvent;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$BenefitsBreakdown;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$CallToActions;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$CommonQuestions;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$DefaultPerks;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$Disclosures;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub$Section$Body_$Insights;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsHubRequest;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsHubResponse;
import com.squareup.cash.bankingbenefits.api.v1_0.app.Prominence;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction$Action_$ClientRoute;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TextRow;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedIcon;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedLink;
import com.squareup.cash.benefits.applets.presenters.BankingBenefitsAppletTilePresenter$models$1$1;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileEvent;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1$2$emit$1;
import com.squareup.cash.benefits.screens.BenefitsExplanationScreen;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.biometrics.AndroidBiometricsStore$read$$inlined$transform$1$1$1;
import com.squareup.cash.biometrics.Biometrics$Result;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelCache;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.bitcoin.navigation.CryptoScannerSource;
import com.squareup.cash.bitcoin.presenters.MoveBitcoinPresenter;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.bitcoin.viewmodels.MoveBitcoinEvent;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay;
import com.squareup.cash.bitcoin.viewmodels.keypad.BitcoinAmountEntrySource;
import com.squareup.cash.bitcoin.viewmodels.keypad.BitcoinKeypadEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.account.AccountSwitchAccountSelectAddAccount;
import com.squareup.cash.cdf.account.AccountSwitchAccountSelectExistingAccount;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletExperimentSelectCard;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletPaymentScheduleScrollToWeek;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletScreen;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletUXVersion;
import com.squareup.cash.cdf.afterpayapplet.AfterpayProduct;
import com.squareup.cash.cdf.appmessage.AppMessageInteractTapShareButton;
import com.squareup.cash.cdf.balancehome.BalanceHomeBrowseTapElement;
import com.squareup.cash.cdf.balancehome.BalanceHomeBrowseTapOverdraftUpsellCard;
import com.squareup.cash.cdf.balancehome.BalanceHomeElement;
import com.squareup.cash.cdf.benefitshub.BenefitsHubViewError;
import com.squareup.cash.cdf.crypto.CryptoDepositCopy;
import com.squareup.cash.cdf.crypto.CryptoSendClose;
import com.squareup.cash.cdf.crypto.CryptoSendSetMaxAmount;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractScroll;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractTapShareButton;
import com.squareup.cash.cdf.directdepositaccount.DirectDepositAccountEnableStart;
import com.squareup.cash.cdf.localclient.LocalClientEducationalSheetInteraction;
import com.squareup.cash.cdf.localclient.LocalClientEducationalSheetViewItem;
import com.squareup.cash.cdf.localclient.LocalClientEducationalSheetViewPage;
import com.squareup.cash.cdf.localclient.LocalClientInStoreRedemptionTap;
import com.squareup.cash.cdf.localmarketing.LocalMarketingBuyerMarketingCampaignCloseMessage;
import com.squareup.cash.cdf.localmarketing.LocalMarketingBuyerMarketingCampaignRedeemMessage;
import com.squareup.cash.cdf.localmarketing.LocalMarketingBuyerMarketingCampaignViewTermsOfService;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.outofnetworksponsor.OutOfNetworkSponsorShownWelcomeScreenProceedWithPrefilledAlias;
import com.squareup.cash.cdf.overdraftcoverage.OverdraftCoverageManageRepay;
import com.squareup.cash.cdf.overdraftcoverage.OverdraftCoverageManageTapBalanceHomeOverdraftCoverageItem;
import com.squareup.cash.cdf.overdraftcoverage.OverdraftCoverageManageTapFooter;
import com.squareup.cash.cdf.prepurchasecard.PrepurchaseCardToggleView;
import com.squareup.cash.cdf.prepurchasecard.Surface;
import com.squareup.cash.cdf.prepurchasecard.ToggleState;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.CryptoAddress$BitcoinAddress;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.cash.elementboundsregistry.core.BoundsRegistry$Bounds;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferScreen;
import com.squareup.cash.featureflags.AmplitudeExperiments$AfterpayAppletV3OptimizationExperiment;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneyTabBalanceAppletMathText;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.booklet.DisclosureSectionKt;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.money.core.ids.ElementId;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.util.money.Moneys;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.bankingbenefits.api.v1_0.BankingBenefitsAppService;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$CreditBalance;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$CreditDetails;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$OverDue;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$Uninstalled;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$V3TextBrief;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletRequest;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.protos.cash.cashsuggest.api.CreditLineData;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSnapshot;
import com.squareup.protos.cash.cashsuggest.api.CreditLineType;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.janus.api.CreateSecondaryPersonalAccountEntryPoint;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.ShareSheet;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.StatementType;
import com.squareup.protos.franklin.ui.PaymentHistoryReactions;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.coroutines.StateFlowKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.paychecks.UiState;

/* loaded from: classes3.dex */
public final class SwipeableState$animateTo$2 implements FlowCollector {
    public final /* synthetic */ Object $anim;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $targetValue;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ SwipeableState$animateTo$2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.$targetValue = obj;
        this.this$0 = obj2;
        this.$anim = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x06a7, code lost:
    
        if (r6 == null) goto L436;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026e  */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52, types: [com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$Uninstalled] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54, types: [com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Uninstalled] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$Uninstalled] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Uninstalled] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [com.squareup.cash.ui.widget.StackedAvatarViewModel$Avatar] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$CreditBalance] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint$Entrypoint$CreditBalance] */
    /* JADX WARN: Type inference failed for: r5v89 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$afterpayapplet$applets$presenters$AfterpayAppletTilePresenter$models$1$1$1(Object obj, Continuation continuation) {
        Object obj2;
        State state;
        char c;
        AfterpayAppletEntrypoint.CreditBalance creditBalance;
        Object obj3;
        AfterpayAppletEntrypoint.CreditBalance creditBalance2;
        AfterpayAppletEntrypoint.Overdue overdue;
        AfterpayAppletEntrypoint.CreditDetails creditDetails;
        AfterpayAppletEntrypoint.CreditDetails creditDetails2;
        Object creditDetails3;
        Icon icon;
        LocalizedString localizedString;
        AfterpayAppletTileViewModel.Installed.CreditState creditState;
        Float f;
        float coerceIn;
        LocalizedString localizedString2;
        List plus;
        Iterator it;
        LocalizedString localizedString3;
        Pair pair;
        AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType ringCreditLineType;
        Long l;
        Long l2;
        float coerceIn2;
        String str;
        ?? r13;
        UiAvatar uiAvatar;
        LocalizedString localizedString4;
        AfterpayAppletEntrypoint.V3TextBrief v3TextBrief;
        AfterpayAppletEntrypoint.V3LoanBrief access$getV3_loan_brief;
        AfterpayAppletEntrypoint.V3Uninstalled v3Uninstalled;
        HomeResult homeResult = (HomeResult) obj;
        State state2 = (State) this.this$0;
        MutableState mutableState = (MutableState) this.$anim;
        if (homeResult instanceof HomeResult.HomeData) {
            AfterpayAppletResponse afterpayAppletResponse = ((HomeResult.HomeData) homeResult).data;
            AfterpayAppletEntrypoint afterpayAppletEntrypoint = afterpayAppletResponse.entrypoint;
            if (afterpayAppletEntrypoint != null) {
                AfterpayAppletEntrypoint.TileConfiguration tileConfiguration = afterpayAppletEntrypoint.tile_configuration;
                AfterpayAppletTilePresenter afterpayAppletTilePresenter = (AfterpayAppletTilePresenter) this.$targetValue;
                CreditLineSnapshot creditLineSnapshot = afterpayAppletResponse.credit_line_snapshot;
                AnalyticsEvent analyticsEvent = afterpayAppletEntrypoint.analytic_view_event;
                AnalyticsEvent analyticsEvent2 = afterpayAppletEntrypoint.analytic_tap_event;
                LocalizedString localizedString5 = afterpayAppletEntrypoint.title;
                TableQrCodeScannerViewKt tableQrCodeScannerViewKt = afterpayAppletEntrypoint.entrypoint;
                int i = tileConfiguration == null ? -1 : AfterpayAppletTilePresenter.WhenMappings.$EnumSwitchMapping$0[tileConfiguration.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        c = 0;
                        creditBalance = null;
                        if ((tableQrCodeScannerViewKt != null ? DisclosureSectionKt.access$getV3_loan_brief(tableQrCodeScannerViewKt) : null) != null) {
                            String translated = localizedString5 != null ? StringsKt.translated(localizedString5) : null;
                            if (translated == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("title was null");
                                return null;
                            }
                            MoneyFormatter moneyFormatter = afterpayAppletTilePresenter.moneyFormatter;
                            Money money = (tableQrCodeScannerViewKt == null || (access$getV3_loan_brief = DisclosureSectionKt.access$getV3_loan_brief(tableQrCodeScannerViewKt)) == null) ? null : access$getV3_loan_brief.amount;
                            money.getClass();
                            String format2 = moneyFormatter.format(money);
                            tableQrCodeScannerViewKt.getClass();
                            AfterpayAppletEntrypoint.V3LoanBrief access$getV3_loan_brief2 = DisclosureSectionKt.access$getV3_loan_brief(tableQrCodeScannerViewKt);
                            access$getV3_loan_brief2.getClass();
                            LocalizedString localizedString6 = access$getV3_loan_brief2.text;
                            String translated2 = localizedString6 != null ? StringsKt.translated(localizedString6) : null;
                            if (translated2 == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("suffix for overdue/due date was null");
                                return null;
                            }
                            AfterpayAppletEntrypoint.V3LoanBrief access$getV3_loan_brief3 = DisclosureSectionKt.access$getV3_loan_brief(tableQrCodeScannerViewKt);
                            access$getV3_loan_brief3.getClass();
                            LocalizedString localizedString7 = access$getV3_loan_brief3.hint_text;
                            String translated3 = localizedString7 != null ? StringsKt.translated(localizedString7) : null;
                            AfterpayAppletEntrypoint.V3LoanBrief access$getV3_loan_brief4 = DisclosureSectionKt.access$getV3_loan_brief(tableQrCodeScannerViewKt);
                            access$getV3_loan_brief4.getClass();
                            obj3 = new AfterpayAppletTileViewModel.Installed.V3Installed(translated, format2, translated2, translated3, AfterpayAppletTilePresenter.createAvatarFromUiAvatar(access$getV3_loan_brief4.avatar), analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null);
                        } else {
                            if (tableQrCodeScannerViewKt != null) {
                                AfterpayAppletEntrypoint$Entrypoint$V3TextBrief afterpayAppletEntrypoint$Entrypoint$V3TextBrief = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3TextBrief ? (AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) tableQrCodeScannerViewKt : null;
                                if (afterpayAppletEntrypoint$Entrypoint$V3TextBrief != null) {
                                    v3TextBrief = afterpayAppletEntrypoint$Entrypoint$V3TextBrief.value;
                                    if (v3TextBrief != null) {
                                        String translated4 = localizedString5 != null ? StringsKt.translated(localizedString5) : null;
                                        if (translated4 == null) {
                                            a$$ExternalSyntheticBUOutline0.m$3("title was null");
                                            return null;
                                        }
                                        tableQrCodeScannerViewKt.getClass();
                                        boolean z = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3TextBrief;
                                        AfterpayAppletEntrypoint$Entrypoint$V3TextBrief afterpayAppletEntrypoint$Entrypoint$V3TextBrief2 = z ? (AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) tableQrCodeScannerViewKt : null;
                                        AfterpayAppletEntrypoint.V3TextBrief v3TextBrief2 = afterpayAppletEntrypoint$Entrypoint$V3TextBrief2 != null ? afterpayAppletEntrypoint$Entrypoint$V3TextBrief2.value : null;
                                        v3TextBrief2.getClass();
                                        LocalizedString localizedString8 = v3TextBrief2.text;
                                        String translated5 = localizedString8 != null ? StringsKt.translated(localizedString8) : null;
                                        if (translated5 == null) {
                                            a$$ExternalSyntheticBUOutline0.m$3("textBrief text was null");
                                            return null;
                                        }
                                        AfterpayAppletEntrypoint$Entrypoint$V3TextBrief afterpayAppletEntrypoint$Entrypoint$V3TextBrief3 = z ? (AfterpayAppletEntrypoint$Entrypoint$V3TextBrief) tableQrCodeScannerViewKt : null;
                                        AfterpayAppletEntrypoint.V3TextBrief v3TextBrief3 = afterpayAppletEntrypoint$Entrypoint$V3TextBrief3 != null ? afterpayAppletEntrypoint$Entrypoint$V3TextBrief3.value : null;
                                        v3TextBrief3.getClass();
                                        obj3 = new AfterpayAppletTileViewModel.Installed.V3Installed(translated4, translated5, null, null, AfterpayAppletTilePresenter.createAvatarFromUiAvatar(v3TextBrief3.avatar), analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null);
                                    }
                                    obj3 = creditBalance;
                                }
                            }
                            v3TextBrief = null;
                            if (v3TextBrief != null) {
                            }
                            obj3 = creditBalance;
                        }
                    } else {
                        if (i != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (tableQrCodeScannerViewKt != null) {
                            AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled afterpayAppletEntrypoint$Entrypoint$V3Uninstalled = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled ? (AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) tableQrCodeScannerViewKt : null;
                            if (afterpayAppletEntrypoint$Entrypoint$V3Uninstalled != null) {
                                v3Uninstalled = afterpayAppletEntrypoint$Entrypoint$V3Uninstalled.value;
                                if (v3Uninstalled != null) {
                                    String translated6 = localizedString5 != null ? StringsKt.translated(localizedString5) : null;
                                    if (translated6 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("title was null");
                                        return null;
                                    }
                                    tableQrCodeScannerViewKt.getClass();
                                    AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled afterpayAppletEntrypoint$Entrypoint$V3Uninstalled2 = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled ? (AfterpayAppletEntrypoint$Entrypoint$V3Uninstalled) tableQrCodeScannerViewKt : null;
                                    AfterpayAppletEntrypoint.V3Uninstalled v3Uninstalled2 = afterpayAppletEntrypoint$Entrypoint$V3Uninstalled2 != null ? afterpayAppletEntrypoint$Entrypoint$V3Uninstalled2.value : null;
                                    v3Uninstalled2.getClass();
                                    LocalizedString localizedString9 = v3Uninstalled2.body;
                                    String translated7 = localizedString9 != null ? StringsKt.translated(localizedString9) : null;
                                    if (translated7 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("uninstalled body text was null");
                                        return null;
                                    }
                                    c = 0;
                                    creditBalance = null;
                                    obj3 = new AfterpayAppletTileViewModel.V3Uninstalled(translated6, translated7, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null);
                                }
                            }
                        }
                        v3Uninstalled = null;
                        if (v3Uninstalled != null) {
                        }
                    }
                    if (obj3 == null) {
                        state = state2;
                        obj2 = obj3;
                    } else {
                        int i2 = tileConfiguration == null ? -1 : AfterpayAppletTilePresenter.WhenMappings.$EnumSwitchMapping$0[tileConfiguration.ordinal()];
                        if (i2 == -1) {
                            state = state2;
                            obj2 = null;
                        } else if (i2 != 1) {
                            if (i2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return creditBalance;
                            }
                            String translated8 = localizedString5 != null ? StringsKt.translated(localizedString5) : "Afterpay";
                            if (tableQrCodeScannerViewKt != null) {
                                ?? r0 = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$Uninstalled ? (AfterpayAppletEntrypoint$Entrypoint$Uninstalled) tableQrCodeScannerViewKt : creditBalance;
                                ?? r02 = r0 != 0 ? r0.value : creditBalance;
                                if (r02 != 0 && (localizedString4 = r02.body) != null) {
                                    str = StringsKt.translated(localizedString4);
                                    String str2 = str;
                                    if (tableQrCodeScannerViewKt != null) {
                                        ?? r03 = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$Uninstalled ? (AfterpayAppletEntrypoint$Entrypoint$Uninstalled) tableQrCodeScannerViewKt : creditBalance;
                                        ?? r04 = r03 != 0 ? r03.value : creditBalance;
                                        if (r04 != 0 && (uiAvatar = r04.avatar) != null) {
                                            r13 = StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar).avatar;
                                            state = state2;
                                            obj2 = new AfterpayAppletTileViewModel.Uninstalled(translated8, str2, r13, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : creditBalance, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : creditBalance, null);
                                        }
                                    }
                                    r13 = creditBalance;
                                    state = state2;
                                    obj2 = new AfterpayAppletTileViewModel.Uninstalled(translated8, str2, r13, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : creditBalance, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : creditBalance, null);
                                }
                            }
                            str = "Buy now, pay later";
                            String str22 = str;
                            if (tableQrCodeScannerViewKt != null) {
                            }
                            r13 = creditBalance;
                            state = state2;
                            obj2 = new AfterpayAppletTileViewModel.Uninstalled(translated8, str22, r13, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : creditBalance, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : creditBalance, null);
                        } else if (creditLineSnapshot != null) {
                            String requiredString = AfterpayAppletTilePresenter.getRequiredString(localizedString5);
                            if (tableQrCodeScannerViewKt != null) {
                                ?? r5 = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditBalance ? (AfterpayAppletEntrypoint$Entrypoint$CreditBalance) tableQrCodeScannerViewKt : creditBalance;
                                if (r5 != 0) {
                                    creditBalance2 = r5.value;
                                    if (creditBalance2 == null) {
                                        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
                                        if (tableQrCodeScannerViewKt != null) {
                                            ?? r4 = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditBalance ? (AfterpayAppletEntrypoint$Entrypoint$CreditBalance) tableQrCodeScannerViewKt : creditBalance;
                                            AfterpayAppletEntrypoint.CreditBalance creditBalance3 = r4 != 0 ? r4.value : creditBalance;
                                            if (creditBalance3 != null) {
                                                LocalizedString localizedString10 = creditBalance3.total_credit_suffix;
                                                LocalizedString localizedString11 = creditBalance3.total_balance_suffix;
                                                CreditLineData allCreditLine = AfterpayAppletTilePresenter.allCreditLine(creditLineSnapshot);
                                                Money money2 = allCreditLine.total_credit;
                                                Money money3 = allCreditLine.outstanding_balance;
                                                Money money4 = allCreditLine.remaining_credit;
                                                if (creditBalance3.ring_style == AfterpayAppletEntrypoint.CreditBalance.RingStyle.COMBINED) {
                                                    CreditLineData allCreditLine2 = AfterpayAppletTilePresenter.allCreditLine(creditLineSnapshot);
                                                    f = valueOf;
                                                    float amount = allCreditLine2.total_credit != null ? Moneys.amount(r4) : 0.0f;
                                                    float amount2 = allCreditLine2.remaining_credit != null ? Moneys.amount(r5) : 0.0f;
                                                    if (amount == RecyclerView.DECELERATION_RATE) {
                                                        plus = EmptyList.INSTANCE;
                                                        state = state2;
                                                    } else {
                                                        state = state2;
                                                        float f2 = amount;
                                                        float coerceIn3 = RangesKt___RangesKt.coerceIn(amount2 / amount, RecyclerView.DECELERATION_RATE, 1.0f);
                                                        if (Float.valueOf(amount2).equals(f)) {
                                                            coerceIn2 = 1.0f;
                                                        } else {
                                                            coerceIn2 = RangesKt___RangesKt.coerceIn(allCreditLine2.outstanding_balance != null ? Moneys.amount(r1) / f2 : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
                                                        }
                                                        plus = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Float.valueOf(coerceIn3), AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.CREDIT_ALL), new Pair(Float.valueOf(coerceIn2), AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.OUTSTANDING_BALANCE)});
                                                    }
                                                } else {
                                                    state = state2;
                                                    f = valueOf;
                                                    CreditLineData allCreditLine3 = AfterpayAppletTilePresenter.allCreditLine(creditLineSnapshot);
                                                    float amount3 = allCreditLine3.total_credit != null ? Moneys.amount(r4) : RecyclerView.DECELERATION_RATE;
                                                    float amount4 = allCreditLine3.remaining_credit != null ? Moneys.amount(r5) : RecyclerView.DECELERATION_RATE;
                                                    if (amount3 == RecyclerView.DECELERATION_RATE) {
                                                        plus = EmptyList.INSTANCE;
                                                    } else {
                                                        if (Float.valueOf(amount4).equals(f)) {
                                                            coerceIn = 1.0f;
                                                        } else {
                                                            coerceIn = RangesKt___RangesKt.coerceIn(allCreditLine3.outstanding_balance != null ? Moneys.amount(r2) / amount3 : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
                                                        }
                                                        List list = creditLineSnapshot.credit_lines;
                                                        ArrayList arrayList = new ArrayList();
                                                        Iterator it2 = list.iterator();
                                                        while (it2.hasNext()) {
                                                            Object next = it2.next();
                                                            Iterator it3 = it2;
                                                            CreditLineType creditLineType = ((CreditLineData) next).line_type;
                                                            float f3 = coerceIn;
                                                            if (creditLineType != CreditLineType.ALL && creditLineType != null) {
                                                                arrayList.add(next);
                                                            }
                                                            it2 = it3;
                                                            coerceIn = f3;
                                                        }
                                                        float f4 = coerceIn;
                                                        ArrayList arrayList2 = new ArrayList();
                                                        Iterator it4 = arrayList.iterator();
                                                        while (it4.hasNext()) {
                                                            CreditLineData creditLineData = (CreditLineData) it4.next();
                                                            if (creditLineData.remaining_credit != null) {
                                                                localizedString3 = localizedString10;
                                                                it = it4;
                                                                Float valueOf2 = Float.valueOf(RangesKt___RangesKt.coerceIn(Moneys.amount(r6) / amount3, RecyclerView.DECELERATION_RATE, 1.0f));
                                                                CreditLineType creditLineType2 = creditLineData.line_type;
                                                                creditLineType2.getClass();
                                                                int ordinal = creditLineType2.ordinal();
                                                                if (ordinal == 0) {
                                                                    ringCreditLineType = AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.CREDIT_INN;
                                                                } else if (ordinal == 1) {
                                                                    ringCreditLineType = AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.CREDIT_ONN;
                                                                } else if (ordinal == 2) {
                                                                    ringCreditLineType = AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.CREDIT_ALL;
                                                                } else {
                                                                    if (ordinal != 3) {
                                                                        if (ordinal != 4) {
                                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                            return creditBalance;
                                                                        }
                                                                        ?? r1 = creditBalance;
                                                                        throw new NotImplementedError(r1, 1, r1);
                                                                    }
                                                                    ringCreditLineType = AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.CREDIT_RETRO;
                                                                }
                                                                pair = new Pair(valueOf2, ringCreditLineType);
                                                            } else {
                                                                it = it4;
                                                                localizedString3 = localizedString10;
                                                                pair = null;
                                                            }
                                                            if (pair != null) {
                                                                arrayList2.add(pair);
                                                            }
                                                            localizedString10 = localizedString3;
                                                            it4 = it;
                                                            creditBalance = null;
                                                        }
                                                        localizedString2 = localizedString10;
                                                        plus = CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(new Pair(Float.valueOf(f4), AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.OUTSTANDING_BALANCE)), (Collection) arrayList2);
                                                        if (localizedString2 != null || localizedString11 == null) {
                                                            if (localizedString2 == null) {
                                                                creditState = new AfterpayAppletTileViewModel.Installed.CreditState(requiredString, afterpayAppletTilePresenter.getRequiredMoney(money2), StringsKt.translated(localizedString2), CreditStateType.SHOW_FULL_CREDIT_AVAILABLE, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null);
                                                            } else {
                                                                if (localizedString11 == null) {
                                                                    a$$ExternalSyntheticBUOutline0.m$1("Invalid credit balance state");
                                                                    return null;
                                                                }
                                                                creditState = new AfterpayAppletTileViewModel.Installed.CreditState(requiredString, afterpayAppletTilePresenter.getRequiredMoney(money3), StringsKt.translated(localizedString11), CreditStateType.SHOW_TOTAL_BALANCE, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null);
                                                            }
                                                            obj2 = creditState;
                                                        } else {
                                                            List listOf = analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null;
                                                            List listOf2 = analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null;
                                                            String requiredMoney = afterpayAppletTilePresenter.getRequiredMoney(money4);
                                                            String translated9 = StringsKt.translated(localizedString2);
                                                            CreditRowType creditRowType = CreditRowType.AVAILABLE_ROW;
                                                            AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.CreditRingAllocation creditRingAllocation = new AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.CreditRingAllocation(requiredMoney, translated9, plus);
                                                            String requiredMoney2 = afterpayAppletTilePresenter.getRequiredMoney(money3);
                                                            String translated10 = StringsKt.translated(localizedString11);
                                                            CreditRowType creditRowType2 = CreditRowType.AVAILABLE_ROW;
                                                            float longValue = (money2 == null || (l2 = money2.amount) == null) ? RecyclerView.DECELERATION_RATE : l2.longValue();
                                                            float longValue2 = (money4 == null || (l = money4.amount) == null) ? RecyclerView.DECELERATION_RATE : l.longValue();
                                                            AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.OwedRingAllocation owedRingAllocation = new AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.OwedRingAllocation(requiredMoney2, translated10, longValue == RecyclerView.DECELERATION_RATE ? EmptyList.INSTANCE : CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(RangesKt___RangesKt.coerceIn(longValue2 / longValue, RecyclerView.DECELERATION_RATE, 1.0f)), Float.valueOf(Float.valueOf(longValue2).equals(f) ? 1.0f : RangesKt___RangesKt.coerceIn((money3.amount != null ? r9.longValue() : RecyclerView.DECELERATION_RATE) / longValue, RecyclerView.DECELERATION_RATE, 1.0f))}));
                                                            AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow[] allocationRowArr = new AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow[2];
                                                            allocationRowArr[c] = creditRingAllocation;
                                                            allocationRowArr[1] = owedRingAllocation;
                                                            creditDetails3 = new AfterpayAppletTileViewModel.Installed.CreditBreakdown(requiredString, CollectionsKt__CollectionsKt.listOf((Object[]) allocationRowArr), listOf2, listOf);
                                                            obj2 = creditDetails3;
                                                        }
                                                    }
                                                }
                                                localizedString2 = localizedString10;
                                                if (localizedString2 != null) {
                                                }
                                                if (localizedString2 == null) {
                                                }
                                                obj2 = creditState;
                                            }
                                        }
                                        AfterpayAppletEntrypoint.CreditBalance creditBalance4 = creditBalance;
                                        a$$ExternalSyntheticBUOutline0.m$1("credit balance null");
                                        return creditBalance4;
                                    }
                                    state = state2;
                                    if (tableQrCodeScannerViewKt != null) {
                                        AfterpayAppletEntrypoint$Entrypoint$OverDue afterpayAppletEntrypoint$Entrypoint$OverDue = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$OverDue ? (AfterpayAppletEntrypoint$Entrypoint$OverDue) tableQrCodeScannerViewKt : null;
                                        if (afterpayAppletEntrypoint$Entrypoint$OverDue != null) {
                                            overdue = afterpayAppletEntrypoint$Entrypoint$OverDue.value;
                                            if (overdue == null) {
                                                String requiredMoney3 = afterpayAppletTilePresenter.getRequiredMoney(AfterpayAppletTilePresenter.allCreditLine(creditLineSnapshot).overdue_balance);
                                                if (tableQrCodeScannerViewKt != null) {
                                                    AfterpayAppletEntrypoint$Entrypoint$OverDue afterpayAppletEntrypoint$Entrypoint$OverDue2 = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$OverDue ? (AfterpayAppletEntrypoint$Entrypoint$OverDue) tableQrCodeScannerViewKt : null;
                                                    AfterpayAppletEntrypoint.Overdue overdue2 = afterpayAppletEntrypoint$Entrypoint$OverDue2 != null ? afterpayAppletEntrypoint$Entrypoint$OverDue2.value : null;
                                                    if (overdue2 != null) {
                                                        localizedString = overdue2.overdue_suffix;
                                                        creditState = new AfterpayAppletTileViewModel.Installed.CreditState(requiredString, requiredMoney3, AfterpayAppletTilePresenter.getRequiredString(localizedString), CreditStateType.SHOW_OVER_DUE, analyticsEvent == null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null, analyticsEvent2 == null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null);
                                                        obj2 = creditState;
                                                    }
                                                }
                                                localizedString = null;
                                                if (analyticsEvent2 == null) {
                                                }
                                                creditState = new AfterpayAppletTileViewModel.Installed.CreditState(requiredString, requiredMoney3, AfterpayAppletTilePresenter.getRequiredString(localizedString), CreditStateType.SHOW_OVER_DUE, analyticsEvent == null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null, analyticsEvent2 == null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null);
                                                obj2 = creditState;
                                            } else {
                                                if (tableQrCodeScannerViewKt != null) {
                                                    AfterpayAppletEntrypoint$Entrypoint$CreditDetails afterpayAppletEntrypoint$Entrypoint$CreditDetails = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditDetails ? (AfterpayAppletEntrypoint$Entrypoint$CreditDetails) tableQrCodeScannerViewKt : null;
                                                    if (afterpayAppletEntrypoint$Entrypoint$CreditDetails != null) {
                                                        creditDetails = afterpayAppletEntrypoint$Entrypoint$CreditDetails.value;
                                                        if (creditDetails == null) {
                                                            if (tableQrCodeScannerViewKt != null) {
                                                                AfterpayAppletEntrypoint$Entrypoint$CreditDetails afterpayAppletEntrypoint$Entrypoint$CreditDetails2 = tableQrCodeScannerViewKt instanceof AfterpayAppletEntrypoint$Entrypoint$CreditDetails ? (AfterpayAppletEntrypoint$Entrypoint$CreditDetails) tableQrCodeScannerViewKt : null;
                                                                if (afterpayAppletEntrypoint$Entrypoint$CreditDetails2 != null) {
                                                                    creditDetails2 = afterpayAppletEntrypoint$Entrypoint$CreditDetails2.value;
                                                                    if (creditDetails2 != null) {
                                                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                        return null;
                                                                    }
                                                                    List<AfterpayAppletEntrypoint.CreditDetails.DetailLine> list2 = creditDetails2.detail_lines;
                                                                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                                                    for (AfterpayAppletEntrypoint.CreditDetails.DetailLine detailLine : list2) {
                                                                        UiAvatar uiAvatar2 = detailLine.avatar;
                                                                        Color color = uiAvatar2 != null ? uiAvatar2.background_color : null;
                                                                        Color color2 = uiAvatar2 != null ? uiAvatar2.tint_color : null;
                                                                        String str3 = (uiAvatar2 == null || (icon = uiAvatar2.icon) == null) ? null : icon.arcade_id;
                                                                        String requiredMoney4 = afterpayAppletTilePresenter.getRequiredMoney(detailLine.amount);
                                                                        LocalizedString localizedString12 = detailLine.text_suffix;
                                                                        arrayList3.add(new AfterpayAppletTileViewModel.Installed.CreditDetails.CreditDetail(color, color2, str3, requiredMoney4, localizedString12 != null ? StringsKt.translated(localizedString12) : ""));
                                                                    }
                                                                    creditDetails3 = new AfterpayAppletTileViewModel.Installed.CreditDetails(requiredString, arrayList3, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null);
                                                                    obj2 = creditDetails3;
                                                                }
                                                            }
                                                            creditDetails2 = null;
                                                            if (creditDetails2 != null) {
                                                            }
                                                        } else {
                                                            obj2 = new AfterpayAppletTileViewModel.Installed.DefaultState(requiredString, afterpayAppletTilePresenter.getRequiredMoney(AfterpayAppletTilePresenter.allCreditLine(creditLineSnapshot).total_credit), analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null, analyticsEvent2 != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2)) : null);
                                                        }
                                                    }
                                                }
                                                creditDetails = null;
                                                if (creditDetails == null) {
                                                }
                                            }
                                        }
                                    }
                                    overdue = null;
                                    if (overdue == null) {
                                    }
                                }
                            }
                            creditBalance2 = creditBalance;
                            if (creditBalance2 == null) {
                            }
                        } else {
                            state = state2;
                            obj2 = new AfterpayAppletTileViewModel.Installed.InstalledFailure();
                        }
                    }
                }
                c = 0;
                creditBalance = null;
                obj3 = creditBalance;
                if (obj3 == null) {
                }
            } else {
                state = state2;
            }
            obj2 = (AfterpayAppletTileViewModel.Loading) state.getValue();
        } else if (homeResult instanceof HomeResult.HomeError) {
            obj2 = new AfterpayAppletTileViewModel.Installed.InstalledFailure();
        } else if (homeResult instanceof HomeResult.Empty) {
            obj2 = new AfterpayAppletTileViewModel.Loading(false);
        } else {
            if (!(homeResult instanceof HomeResult.HomeLoading)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            obj2 = (AfterpayAppletTileViewModel.Loading) state2.getValue();
        }
        mutableState.setValue(obj2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$afterpayapplet$presenters$AfterpayAppletHomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        ToggleEntryPointData.ToggleState toggleState;
        ToggleState cdfToggleState;
        AfterpayProduct afterpayProduct;
        AfterpayProduct afterpayProduct2;
        AfterpayAppletUXVersion afterpayAppletUXVersion;
        List analyticsAppletTappedEvent;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter = (AfterpayAppletHomePresenter) this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = afterpayAppletHomePresenter.navigator;
        RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = afterpayAppletHomePresenter.analytics;
        CoroutineScope coroutineScope = (CoroutineScope) this.$targetValue;
        AfterpayAppletHomeViewEvent afterpayAppletHomeViewEvent = (AfterpayAppletHomeViewEvent) obj;
        if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.CarouselTileTapped) {
            AfterpayAppletHomeViewEvent.CarouselTileTapped carouselTileTapped = (AfterpayAppletHomeViewEvent.CarouselTileTapped) afterpayAppletHomeViewEvent;
            EngagedItemToken engagedItemToken = carouselTileTapped.engagedItemToken;
            if (engagedItemToken != null) {
                afterpayAppletHomePresenter.afterpayMerchantRepo.addToRecentlyViewed(engagedItemToken);
            }
            AfterpayAppletHomePresenter.access$handleTapEvent(afterpayAppletHomePresenter, carouselTileTapped.tap, afterpayAppletHomeViewEvent);
        } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped) {
            afterpayAppletHomePresenter.routeAction(((AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped) afterpayAppletHomeViewEvent).actionUrl, afterpayAppletHomePresenter.args, AfterpayAppletHomePresenter.getSectionIdForEvent(afterpayAppletHomeViewEvent), BlockersData.AnalyticsData.Source.MONEY_TAB.getAnalyticsName(), BlockerFlowReferrerType.AFTERPAY_APPLET);
        } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped) {
            afterpayAppletHomePresenter.routeAction(((AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped) afterpayAppletHomeViewEvent).actionUrl, afterpayAppletHomePresenter.args, AfterpayAppletHomePresenter.getSectionIdForEvent(afterpayAppletHomeViewEvent), BlockersData.AnalyticsData.Source.MONEY_TAB.getAnalyticsName(), BlockerFlowReferrerType.AFTERPAY_APPLET);
        } else {
            boolean z = afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.PaymentButtonTapped;
            Back back = Back.INSTANCE;
            Continuation continuation2 = null;
            if (z) {
                Tap tap = ((AfterpayAppletHomeViewEvent.PaymentButtonTapped) afterpayAppletHomeViewEvent).tap;
                if (tap instanceof Tap.Url) {
                    afterpayAppletHomePresenter.routeAction(((Tap.Url) tap).actionUrl, afterpayAppletHomePresenter.args, AfterpayAppletHomePresenter.getSectionIdForEvent(afterpayAppletHomeViewEvent), BlockersData.AnalyticsData.Source.MONEY_TAB.getAnalyticsName(), BlockerFlowReferrerType.AFTERPAY_APPLET);
                } else if (tap instanceof Tap.Info) {
                    String str = afterpayAppletHomePresenter.args.referrerFlowToken;
                    InfoSheet infoSheet = ((Tap.Info) tap).info;
                    LocalizedString localizedString = infoSheet.title;
                    String translated = localizedString != null ? StringsKt.translated(localizedString) : "";
                    LocalizedString localizedString2 = infoSheet.subtitle;
                    String translated2 = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
                    List list = infoSheet.text_content;
                    screenNavigator.goTo(new AfterpayAppletScreen$AfterpayAppletInfoSheet(str, translated, translated2, !list.isEmpty() ? list : null, infoSheet.cta_button, infoSheet.analytic_view_event, infoSheet.analytic_dismiss_event, infoSheet.avatar));
                } else if (tap instanceof Tap.Dismiss) {
                    screenNavigator.goTo(back);
                } else if (!(tap instanceof Tap.ScrollTo)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            } else {
                int i = 3;
                if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.TryAgainTapped) {
                    Map map = AfterpayAppletHomePresenter.refreshAttributeHome;
                    afterpayAppletHomePresenter.setHomeState(new Loading(afterpayAppletHomePresenter.stringManager.get(R.string.afterpay_applet_home_toolbar_title)));
                    JobKt.launch$default(coroutineScope, null, null, new AfterpayAppletHomePresenter$models$1$1(afterpayAppletHomePresenter, continuation2, 2), 3);
                } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.GoBack) {
                    screenNavigator.goTo(back);
                } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.HelpButtonTapped) {
                    RealRouter realRouter = afterpayAppletHomePresenter.router;
                    ClientRoute.ViewSupportNode viewSupportNode = new ClientRoute.ViewSupportNode("SH_CASH_APP_AFTERPAY");
                    AfterpayAppletScreen$AfterpayAppletHomeScreen afterpayAppletScreen$AfterpayAppletHomeScreen = afterpayAppletHomePresenter.args;
                    RoutingParams routingParams = new RoutingParams(afterpayAppletScreen$AfterpayAppletHomeScreen, null, afterpayAppletScreen$AfterpayAppletHomeScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502);
                    realRouter.getClass();
                    realRouter.clientRouteRouter.route(viewSupportNode, routingParams);
                } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.LegalSectionUrlTapped) {
                    AfterpayAppletHomePresenter.routeAction$default(afterpayAppletHomePresenter, ((AfterpayAppletHomeViewEvent.LegalSectionUrlTapped) afterpayAppletHomeViewEvent).actionUrl, null, AfterpayAppletHomePresenter.getSectionIdForEvent(afterpayAppletHomeViewEvent), 26);
                } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.Refresh) {
                    Map map2 = AfterpayAppletHomePresenter.refreshAttributeHome;
                    AfterpayAppletHomeViewModel homeState = afterpayAppletHomePresenter.getHomeState();
                    if (homeState instanceof AfterpayAppletHomeContentViewModel) {
                        JobKt.launch$default(coroutineScope, null, null, new MLKitTitleGenerator$prepareModel$1(afterpayAppletHomePresenter, (AfterpayAppletHomeContentViewModel) homeState, continuation2, i), 3);
                    }
                } else {
                    int i2 = 0;
                    if (afterpayAppletHomeViewEvent instanceof ItemViewed) {
                        ItemViewed itemViewed = (ItemViewed) afterpayAppletHomeViewEvent;
                        String str2 = itemViewed.sectionId;
                        if (str2 != null) {
                            JobKt.launch$default(coroutineScope, null, null, new AfterpayAppletHomePresenter$models$8$5$1(afterpayAppletHomePresenter, str2, continuation2, i2), 3);
                        }
                        realAfterpayAppletAnalytics.trackImpressionAnalyticsEvents(itemViewed.analyticsEventSpecs, afterpayAppletHomePresenter.getDefaultHomeAnalyticsParams());
                    } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.TapActionEvent) {
                        AfterpayAppletHomePresenter.access$handleTapEvent(afterpayAppletHomePresenter, ((AfterpayAppletHomeViewEvent.TapActionEvent) afterpayAppletHomeViewEvent).tap, afterpayAppletHomeViewEvent);
                    } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent) {
                        AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent afterpayAppletBalanceHeroSectionEvent = (AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent) afterpayAppletHomeViewEvent;
                        if (!(afterpayAppletBalanceHeroSectionEvent instanceof AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent.DateTapped) && !(afterpayAppletBalanceHeroSectionEvent instanceof AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent.RequestMoreDates)) {
                            if (!(afterpayAppletBalanceHeroSectionEvent instanceof AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent.ScrollToWeek)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            List list2 = ((AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent.ScrollToWeek) afterpayAppletHomeViewEvent).weekDates;
                            if (!list2.isEmpty()) {
                                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) CollectionsKt.firstOrNull(list2);
                                long j = calendarDate != null ? calendarDate.dateMs : 0L;
                                String localDate = j > 0 ? Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDate().toString() : "";
                                localDate.getClass();
                                long millis = (j - afterpayAppletHomePresenter.clock.millis()) / 604800000;
                                List list3 = list2;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        List<AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment> list4 = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) it.next()).treatments;
                                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                            for (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment dateTreatment : list4) {
                                                if ((dateTreatment instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.PaymentDue) || (dateTreatment instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Overdue)) {
                                                    i2++;
                                                    if (i2 < 0) {
                                                        CollectionsKt__CollectionsKt.throwCountOverflow();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                long j2 = i2;
                                String upperCase = "V3".toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                switch (upperCase.hashCode()) {
                                    case 2715:
                                        if (upperCase.equals("V1")) {
                                            afterpayAppletUXVersion = AfterpayAppletUXVersion.V1;
                                            break;
                                        }
                                        afterpayAppletUXVersion = AfterpayAppletUXVersion.V3;
                                        break;
                                    case 2716:
                                        if (upperCase.equals("V2")) {
                                            afterpayAppletUXVersion = AfterpayAppletUXVersion.V2;
                                            break;
                                        }
                                        afterpayAppletUXVersion = AfterpayAppletUXVersion.V3;
                                        break;
                                    case 2717:
                                        if (upperCase.equals("V3")) {
                                            afterpayAppletUXVersion = AfterpayAppletUXVersion.V3;
                                            break;
                                        }
                                        afterpayAppletUXVersion = AfterpayAppletUXVersion.V3;
                                        break;
                                    default:
                                        afterpayAppletUXVersion = AfterpayAppletUXVersion.V3;
                                        break;
                                }
                                realAfterpayAppletAnalytics.analytics.track(new AfterpayAppletPaymentScheduleScrollToWeek(realAfterpayAppletAnalytics.afterpayAppletFlowToken, afterpayAppletUXVersion, localDate, Long.valueOf(millis), Long.valueOf(j2)), null);
                            }
                        }
                    } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.CardClicked) {
                        AfterpayAppletHomeViewEvent.CardClicked cardClicked = (AfterpayAppletHomeViewEvent.CardClicked) afterpayAppletHomeViewEvent;
                        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent afterpayCardContent = cardClicked.content;
                        if (afterpayCardContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TileCarousel) {
                            afterpayProduct2 = AfterpayProduct.AFTERPAY_ONLINE_CHECKOUT;
                        } else if (afterpayCardContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionList) {
                            afterpayProduct2 = AfterpayProduct.RETROACTIVE_FINANCING;
                        } else if (afterpayCardContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent) {
                            afterpayProduct2 = AfterpayProduct.PRE_PURCHASE_FINANCING;
                        } else {
                            if (afterpayCardContent != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            afterpayProduct = null;
                            if (afterpayProduct != null) {
                                FeatureFlagManager featureFlagManager = afterpayAppletHomePresenter.featureFlagManager;
                                AmplitudeExperiments$AfterpayAppletV3OptimizationExperiment amplitudeExperiments$AfterpayAppletV3OptimizationExperiment = AmplitudeExperiments$AfterpayAppletV3OptimizationExperiment.INSTANCE;
                                FeatureFlag$StringAmplitudeExperiment.Value value = (FeatureFlag$StringAmplitudeExperiment.Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(amplitudeExperiments$AfterpayAppletV3OptimizationExperiment);
                                String str3 = (String) amplitudeExperiments$AfterpayAppletV3OptimizationExperiment.root;
                                String str4 = value.value;
                                int i3 = cardClicked.cardPosition;
                                str4.getClass();
                                Analytics analytics = realAfterpayAppletAnalytics.analytics;
                                String str5 = realAfterpayAppletAnalytics.afterpayAppletFlowToken;
                                AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.ENTRYPOINT;
                                AfterpayAppletUXVersion afterpayAppletUXVersion2 = AfterpayAppletUXVersion.V1;
                                analytics.track(new AfterpayAppletExperimentSelectCard(str5, afterpayProduct, str3, str4, Integer.valueOf(i3)), null);
                            }
                        }
                        afterpayProduct = afterpayProduct2;
                        if (afterpayProduct != null) {
                        }
                    } else if (afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.PrepurchaseToggleTapped) {
                        JobKt.launch$default(coroutineScope, null, null, new AfterpayAppletHomePresenter$models$1$1(afterpayAppletHomePresenter, continuation2, i), 3);
                    } else {
                        if (!(afterpayAppletHomeViewEvent instanceof AfterpayAppletHomeViewEvent.PrepurchaseToggleViewed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        MutableState mutableState = (MutableState) this.$anim;
                        Map map3 = AfterpayAppletHomePresenter.refreshAttributeHome;
                        ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) mutableState.getValue();
                        if (toggleEntryPointData != null && (toggleState = toggleEntryPointData.toggle_state) != null && (cdfToggleState = IntRectKt.toCdfToggleState(toggleState)) != null) {
                            afterpayAppletHomePresenter.cdfAnalytics.track(new PrepurchaseCardToggleView(cdfToggleState, Surface.AFTERPAY_APPLET), null);
                        }
                    }
                }
            }
        }
        Map map4 = AfterpayAppletHomePresenter.refreshAttributeHome;
        if ((afterpayAppletHomeViewEvent instanceof AfterpayAnalyticsAppletTappedEvent) && (analyticsAppletTappedEvent = ((AfterpayAnalyticsAppletTappedEvent) afterpayAppletHomeViewEvent).getAnalyticsAppletTappedEvent()) != null) {
            realAfterpayAppletAnalytics.trackGenericAnalyticsEvents(analyticsAppletTappedEvent, afterpayAppletHomePresenter.getDefaultHomeAnalyticsParams());
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$appmessages$presenters$sheet$SheetAppMessagePresenter$models$$inlined$CollectEffect$2$1(Object obj, Continuation continuation) {
        HalfSheetMessage halfSheetMessage;
        zzjr zzjrVar;
        DetailsPage access$getDetailsPage;
        HalfSheetMessage halfSheetMessage2;
        zzjr zzjrVar2;
        Event appMessageInteractTapShareButton;
        HalfSheetMessage halfSheetMessage3;
        HalfSheetMessage halfSheetMessage4;
        zzjr zzjrVar3;
        DetailsPage access$getDetailsPage2;
        CoroutineScope coroutineScope = (CoroutineScope) this.$targetValue;
        LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.this$0;
        Analytics analytics = (Analytics) localCashBalancePresenter.analytics;
        CoroutineContext coroutineContext = (CoroutineContext) localCashBalancePresenter.launcher;
        MutableState mutableState = (MutableState) this.$anim;
        SheetAppMessageEvent sheetAppMessageEvent = (SheetAppMessageEvent) obj;
        Continuation continuation2 = null;
        if (sheetAppMessageEvent instanceof SheetAppMessageEvent.BackClicked) {
            JobKt.launch$default(coroutineScope, coroutineContext, null, new SearchBarBinding$Content$1$1(localCashBalancePresenter, mutableState, continuation2, 25), 2);
        } else if (sheetAppMessageEvent instanceof SheetAppMessageEvent.CtaButtonClicked) {
            JobKt.launch$default(coroutineScope, coroutineContext, null, new SetNameViewKt$SetName$2$1(localCashBalancePresenter, sheetAppMessageEvent, mutableState, continuation2, 9), 2);
        } else if (sheetAppMessageEvent instanceof SheetAppMessageEvent.ShareClicked) {
            String str = (String) localCashBalancePresenter.screen;
            String str2 = ((SheetAppMessage) localCashBalancePresenter.syncer).messageToken;
            SheetMessage sheetMessage = (SheetMessage) mutableState.getValue();
            String str3 = (sheetMessage == null || (halfSheetMessage4 = sheetMessage.message_format) == null || (zzjrVar3 = halfSheetMessage4.secondaryNavigationAction) == null || (access$getDetailsPage2 = QuirkSettingsLoader.access$getDetailsPage(zzjrVar3)) == null) ? null : access$getDetailsPage2.token;
            SheetMessage sheetMessage2 = (SheetMessage) mutableState.getValue();
            String str4 = sheetMessage2 != null ? sheetMessage2.metadata_id : null;
            if (str3 != null) {
                appMessageInteractTapShareButton = new DetailsPageInteractTapShareButton(19, null, null, str3, str, null);
            } else {
                AppMessageFormat appMessageFormat = AppMessageFormat.FULL_SCREEN;
                appMessageInteractTapShareButton = new AppMessageInteractTapShareButton(str4, str2);
            }
            analytics.track(appMessageInteractTapShareButton, null);
            SheetMessage sheetMessage3 = (SheetMessage) mutableState.getValue();
            ShareSheet shareSheet = (sheetMessage3 == null || (halfSheetMessage3 = sheetMessage3.message_format) == null) ? null : halfSheetMessage3.share_sheet;
            if (shareSheet == null) {
                a$$ExternalSyntheticBUOutline0.m$1("ShareClicked event should not be fired when share_sheet is null.");
                return null;
            }
            String str5 = shareSheet.url;
            String str6 = shareSheet.message;
            StringBuilder sb = new StringBuilder();
            if (str6 != null && !kotlin.text.StringsKt.isBlank(str6)) {
                sb.append(str6);
            }
            if (str5 != null && !kotlin.text.StringsKt.isBlank(str5)) {
                sb.append("\n\n");
                sb.append(str5);
            }
            ((IntentLauncher) localCashBalancePresenter.service).shareText(sb.toString(), null, null);
        } else {
            if (!(sheetAppMessageEvent instanceof SheetAppMessageEvent.ViewedTreehouseContent)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            SheetMessage sheetMessage4 = (SheetMessage) mutableState.getValue();
            if (((sheetMessage4 == null || (halfSheetMessage2 = sheetMessage4.message_format) == null || (zzjrVar2 = halfSheetMessage2.secondaryNavigationAction) == null) ? null : QuirkSettingsLoader.access$getDetailsPage(zzjrVar2)) != null) {
                SheetMessage sheetMessage5 = (SheetMessage) mutableState.getValue();
                analytics.track(new DetailsPageInteractScroll(19, null, null, (sheetMessage5 == null || (halfSheetMessage = sheetMessage5.message_format) == null || (zzjrVar = halfSheetMessage.secondaryNavigationAction) == null || (access$getDetailsPage = QuirkSettingsLoader.access$getDetailsPage(zzjrVar)) == null) ? null : access$getDetailsPage.token, (String) localCashBalancePresenter.screen, null), null);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$appmessages$views$TooltipAppMessageView$renderTooltip$1$1(Object obj, Continuation continuation) {
        BoundsRegistry$Bounds boundsRegistry$Bounds = (BoundsRegistry$Bounds) obj;
        TooltipAppMessageViewModel.Ready.ArrowPosition arrowPosition = (TooltipAppMessageViewModel.Ready.ArrowPosition) this.$anim;
        TooltipAppMessageViewModel.Ready ready = (TooltipAppMessageViewModel.Ready) this.this$0;
        TooltipAppMessageView tooltipAppMessageView = (TooltipAppMessageView) this.$targetValue;
        tooltipAppMessageView.targetBounds = boundsRegistry$Bounds;
        TooltipContainerView tooltipContainerView = tooltipAppMessageView.tooltipContainer;
        if (boundsRegistry$Bounds == null) {
            return Unit.INSTANCE;
        }
        String str = ready.messageToken;
        String str2 = ready.text;
        TooltipAppMessageViewModel.Ready.TooltipType tooltipType = ready.tooltipType;
        tooltipAppMessageView.lastToken = str;
        tooltipAppMessageView.targetAction = ready.targetClickAction;
        tooltipAppMessageView.tooltipAction = ready.tooltipClickAction;
        tooltipAppMessageView.dismissed = ready.dismiss;
        tooltipAppMessageView.setContentDescription(tooltipAppMessageView.getContext().getString(R.string.tooltip_content_description) + ". " + str2);
        float f = boundsRegistry$Bounds.right;
        float f2 = boundsRegistry$Bounds.left;
        int m = (int) Recorder$$ExternalSyntheticOutline2.m(f, f2, 2.0f, f2);
        int ordinal = arrowPosition.ordinal();
        tooltipContainerView.setAnchorPoint(m, (int) ((ordinal == 3 || ordinal == 4 || ordinal == 5) ? boundsRegistry$Bounds.bottom : boundsRegistry$Bounds.top));
        int[] iArr = TooltipAppMessageView$renderTooltip$1$1$WhenMappings.$EnumSwitchMapping$1;
        tooltipContainerView.setTheme(iArr[tooltipType.ordinal()] == 1 ? Theme.MooncakeDark : ThemeHelpersKt.themeInfo(tooltipAppMessageView).theme);
        tooltipContainerView.setArrowPosition(arrowPosition);
        tooltipContainerView.setTooltipText(str2);
        int i = 0;
        switch (tooltipType.ordinal()) {
            case 0:
                i = tooltipAppMessageView.toolbarDiscoverMenuItemOffset;
                break;
            case 1:
                i = tooltipAppMessageView.toolbarMenuItemOffset;
                break;
            case 2:
                i = tooltipAppMessageView.tabHugOffset;
                break;
            case 3:
                i = tooltipAppMessageView.balanceAppletTileOffset;
                break;
            case 4:
                i = tooltipAppMessageView.keypadButtonItemOffset;
                break;
            case 5:
            case 6:
                i = tooltipAppMessageView.keypadQrButtonItemOffset;
                break;
            case 7:
                i = tooltipAppMessageView.accountSettingsOffset;
                break;
            case 8:
            case 10:
                break;
            case 9:
                i = tooltipAppMessageView.toolbarMoneybotHomeMenuItemOffset;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        tooltipContainerView.setHugOffset(i);
        if (iArr[tooltipType.ordinal()] != 4) {
            TooltipAppMessageView.access$revealTooltip(tooltipAppMessageView, ready);
            return Unit.INSTANCE;
        }
        tooltipAppMessageView.readyToAnimate = true;
        RealTooltipTargetLoadedCallbackRegistry realTooltipTargetLoadedCallbackRegistry = tooltipAppMessageView.tooltipTargetLoadedCallbackRegistry;
        BankingDialogKt$$ExternalSyntheticLambda5 bankingDialogKt$$ExternalSyntheticLambda5 = new BankingDialogKt$$ExternalSyntheticLambda5(7, tooltipAppMessageView, ready);
        realTooltipTargetLoadedCallbackRegistry.getClass();
        realTooltipTargetLoadedCallbackRegistry.animateInCallback = bankingDialogKt$$ExternalSyntheticLambda5;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object emit$com$squareup$cash$banking$applets$presenters$BalanceAppletTilePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Money money;
        MutableState mutableState = (MutableState) this.this$0;
        TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) this.$targetValue;
        CoroutineScope coroutineScope = (CoroutineScope) tapToPayPresenter.tapToPayErrorReporter;
        Navigator navigator = (Navigator) tapToPayPresenter.tapToPayRepository;
        MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) tapToPayPresenter.keyProvider;
        BalanceAppletTileViewEvent balanceAppletTileViewEvent = (BalanceAppletTileViewEvent) obj;
        boolean areEqual = Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletOnClickTile.INSTANCE);
        Continuation continuation2 = null;
        ItemId.BALANCE balance = ItemId.BALANCE.INSTANCE;
        if (areEqual) {
            ((RealMoneyAnalyticsService) moneyAnalyticsService).submitSelectItemEvent(balance, null, MoneySelectAction.TAP);
            navigator.goTo(new BalanceHomeScreen(null));
        } else {
            Object[] objArr = 0;
            if (Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletOnClickAddCash.INSTANCE)) {
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                ((RealMoneyAnalyticsService) moneyAnalyticsService).submitSelectItemEvent(balance, ElementId.BALANCE_ADD_CASH, MoneySelectAction.TAP);
                if (booleanValue) {
                    navigator.goTo(new ManagedAccountTransferScreen(ManagedAccountTransferScreen.TransferType.ADD_MONEY, null, null, false));
                } else {
                    JobKt.launch$default(coroutineScope, null, null, new BalanceAppletTilePresenter$onClickAddCash$1(tapToPayPresenter, continuation2, objArr == true ? 1 : 0), 3);
                }
            } else if (Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletOnClickCashOut.INSTANCE)) {
                BalanceAppletTileViewModel balanceAppletTileViewModel = (BalanceAppletTileViewModel) ((State) this.$anim).getValue();
                boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                if (balanceAppletTileViewModel.getBalanceMovementButtons().canWithdraw) {
                    ((RealMoneyAnalyticsService) moneyAnalyticsService).submitSelectItemEvent(balance, ElementId.BALANCE_CASH_OUT, MoneySelectAction.TAP);
                    if (booleanValue2) {
                        UiState uiState = (UiState) ((SyncValueReader) tapToPayPresenter.tapToPayAnalyticsHelper).getSingleValue(AndroidSyncValueSpecs.PaychecksUiState).getValue();
                        boolean areEqual2 = uiState != null ? Intrinsics.areEqual(uiState.customer_is_denylisted, Boolean.TRUE) : false;
                        if (areEqual2) {
                            BalanceAppletTileViewModel.Loaded loaded = balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded ? (BalanceAppletTileViewModel.Loaded) balanceAppletTileViewModel : null;
                            if (loaded != null) {
                                money = new Money(Long.valueOf(loaded.getRawBalance()), CurrencyCode.USD, 4);
                                navigator.goTo(new ManagedAccountTransferScreen(ManagedAccountTransferScreen.TransferType.WITHDRAW, money, null, areEqual2));
                            }
                        }
                        money = null;
                        navigator.goTo(new ManagedAccountTransferScreen(ManagedAccountTransferScreen.TransferType.WITHDRAW, money, null, areEqual2));
                    } else {
                        JobKt.launch$default(coroutineScope, null, null, new BalanceAppletTilePresenter$onClickAddCash$1(tapToPayPresenter, continuation2, 1), 3);
                    }
                }
            } else if (!Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletOnClickUninstalledRow.INSTANCE)) {
                if (Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.BalanceAppletObfuscationToggled.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new AmountPickerCondensedView.AnonymousClass14(tapToPayPresenter, continuation2, 8), 3);
                    ((RealMoneyAnalyticsService) moneyAnalyticsService).submitSelectItemEvent(balance, ElementId.BALANCE_OBFUSCATE, MoneySelectAction.TAP);
                } else {
                    if (!Intrinsics.areEqual(balanceAppletTileViewEvent, BalanceAppletTileViewEvent.Viewed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealFeatureFlagManager) ((FeatureFlagManager) tapToPayPresenter.sessionManager)).currentValue(AmplitudeExperiments$MoneyTabBalanceAppletMathText.INSTANCE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$banking$presenters$BalanceHomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Pair pair;
        State state = (State) this.this$0;
        State state2 = (State) this.$anim;
        BalanceHomePresenter balanceHomePresenter = (BalanceHomePresenter) this.$targetValue;
        RealRouter realRouter = balanceHomePresenter.router;
        BetterNavigator.ScreenNavigator screenNavigator = balanceHomePresenter.navigator;
        Analytics analytics = balanceHomePresenter.analytics;
        BalanceHomeViewEvent balanceHomeViewEvent = (BalanceHomeViewEvent) obj;
        if (balanceHomeViewEvent instanceof BalanceHomeViewEvent.CopyNumber) {
            BalanceHomeViewEvent.CopyNumber.Type type2 = ((BalanceHomeViewEvent.CopyNumber) balanceHomeViewEvent).f1051type;
            UiDda uiDda = (UiDda) state.getValue();
            uiDda.getClass();
            DirectDepositAccount directDepositAccount = uiDda.account;
            directDepositAccount.getClass();
            if (type2 == BalanceHomeViewEvent.CopyNumber.Type.ROUTING) {
                analytics.track(new BalanceHomeBrowseTapElement(BalanceHomeElement.CopyRoutingNumberButton), null);
                String str = directDepositAccount.routing_number;
                str.getClass();
                pair = new Pair("Routing", str);
            } else {
                analytics.track(new BalanceHomeBrowseTapElement(BalanceHomeElement.CopyAccountNumberButton), null);
                String str2 = directDepositAccount.account_number;
                str2.getClass();
                pair = new Pair("Account", str2);
            }
            String str3 = (String) pair.first;
            String str4 = (String) pair.second;
            RealClipboardManager realClipboardManager = balanceHomePresenter.clipboardManager;
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(30, DurationUnit.SECONDS);
            str3.getClass();
            str4.getClass();
            realClipboardManager.copy(str3, str4);
            Handler handler = realClipboardManager.handler;
            handler.sendMessageDelayed(Message.obtain(handler, 0, str3), Duration.m4167getInWholeMillisecondsimpl(duration));
        } else if (Intrinsics.areEqual(balanceHomeViewEvent, BalanceHomeViewEvent.Close.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (Intrinsics.areEqual(balanceHomeViewEvent, BalanceHomeViewEvent.Help.INSTANCE)) {
            UiDda uiDda2 = (UiDda) state.getValue();
            uiDda2.getClass();
            DirectDepositAccount directDepositAccount2 = uiDda2.account;
            directDepositAccount2.getClass();
            String str5 = directDepositAccount2.support_node_token;
            analytics.track(new BalanceHomeBrowseTapElement(BalanceHomeElement.AccountAndRoutingFooter), null);
            UnleashContext unleashContext = balanceHomePresenter.bankingOutboundNavigator;
            ((Navigator) unleashContext.userId).goTo(RealSupportNavigator.startSupportFlow$default((RealSupportNavigator) unleashContext.sessionId, str5, null, RealMoneyNavigatorHelper.moneyTabScreen(), SupportNavigator$Source.MONEY, null, null, 102));
        } else if (Intrinsics.areEqual(balanceHomeViewEvent, BalanceHomeViewEvent.SetupDirectDeposit.INSTANCE)) {
            ClientRoute.ViewDirectDepositSetup viewDirectDepositSetup = new ClientRoute.ViewDirectDepositSetup(ClientRoute.ViewDirectDepositSetup.spec, ClientRoute.ViewDirectDepositSetup.deepLinkSpecs, null);
            BalanceHomeScreen balanceHomeScreen = balanceHomePresenter.args;
            RoutingParams routingParams = new RoutingParams(balanceHomeScreen, null, balanceHomeScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502);
            realRouter.getClass();
            realRouter.clientRouteRouter.route(viewDirectDepositSetup, routingParams);
        } else if (Intrinsics.areEqual(balanceHomeViewEvent, BalanceHomeViewEvent.OverdraftClicked.INSTANCE)) {
            analytics.track(new OverdraftCoverageManageTapBalanceHomeOverdraftCoverageItem(), null);
            OverdraftStatus overdraftStatus = (OverdraftStatus) state2.getValue();
            overdraftStatus.getClass();
            BalanceHomePresenter.access$handleOverdraftClicked(balanceHomePresenter, overdraftStatus);
        } else if (Intrinsics.areEqual(balanceHomeViewEvent, BalanceHomeViewEvent.OverdraftManageClicked.INSTANCE)) {
            analytics.track(new BalanceHomeBrowseTapElement(BalanceHomeElement.OverdraftManageRow), null);
            OverdraftStatus overdraftStatus2 = (OverdraftStatus) state2.getValue();
            overdraftStatus2.getClass();
            BalanceHomePresenter.access$handleOverdraftClicked(balanceHomePresenter, overdraftStatus2);
        } else if (Intrinsics.areEqual(balanceHomeViewEvent, BalanceHomeViewEvent.OverdraftUpsellClicked.INSTANCE)) {
            analytics.track(new BalanceHomeBrowseTapOverdraftUpsellCard(), null);
            OverdraftStatus overdraftStatus3 = (OverdraftStatus) state2.getValue();
            overdraftStatus3.getClass();
            BalanceHomePresenter.access$handleOverdraftClicked(balanceHomePresenter, overdraftStatus3);
        } else if (balanceHomeViewEvent instanceof BalanceHomeViewEvent.CallToActionClicked) {
            realRouter.route(new RoutingParams(balanceHomePresenter.args, BlockersData.AnalyticsData.Source.BALANCE_HOME.getAnalyticsName(), null, null, null, null, 508), ((BalanceHomeViewEvent.CallToActionClicked) balanceHomeViewEvent).route);
        } else if (balanceHomeViewEvent instanceof BalanceHomeViewEvent.BankingDetailsClicked) {
            BalanceData.Button button = ((BalanceHomeViewEvent.BankingDetailsClicked) balanceHomeViewEvent).button;
            BalanceData.Button.Action action = button.action;
            int i = action == null ? -1 : BalanceHomePresenter.WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    ClientScenario clientScenario = button.client_scenario;
                    clientScenario.getClass();
                    analytics.track(new DirectDepositAccountEnableStart(clientScenario.name(), 2), null);
                    BlockersHelper.launchClientScenario$default(balanceHomePresenter.blockersHelper, BlockersData.Flow.CLIENT_SCENARIO, clientScenario, balanceHomePresenter.args, null, null, null, false, null, null, false, 4072);
                } else if (i == 2) {
                    analytics.track(new DirectDepositAccountEnableStart(null, 1), null);
                    BalanceData.Dialog dialog = button.dialog;
                    dialog.getClass();
                    screenNavigator.goTo(new DemandDepositDialogScreen(dialog));
                } else if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            analytics.track(new BalanceHomeBrowseTapElement(BalanceHomeElement.BankingDetailsLearnMore), null);
        } else if (balanceHomeViewEvent instanceof BalanceHomeViewEvent.DisclosureUrlClicked) {
            analytics.track(new BalanceHomeBrowseTapElement(BalanceHomeElement.Disclosure), null);
            realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), ((BalanceHomeViewEvent.DisclosureUrlClicked) balanceHomeViewEvent).url);
        } else {
            if (!Intrinsics.areEqual(balanceHomeViewEvent, BalanceHomeViewEvent.RestrictedBalanceClicked.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            CryptoFlowStarter cryptoFlowStarter = balanceHomePresenter.cryptoFlowStarter;
            BalanceHomeScreen balanceHomeScreen2 = balanceHomePresenter.args;
            balanceHomeScreen2.getClass();
            screenNavigator.goTo(FlowStarter.startPlasmaFlow$default(((RealCryptoFlowStarter) cryptoFlowStarter).flowStarter, Flow$Type.RESTRICTION_HOLDING_PERIOD_INFO, balanceHomeScreen2, null, null, 12));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r1 != null) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [squareup.cash.overdraft.OverdraftStatus$Button] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$banking$presenters$OverdraftCoveragePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        OverdraftStatus.Upsell upsell;
        OverdraftStatus.Eligible eligible;
        OverdraftStatus.Button button;
        MutableState mutableState = (MutableState) this.$anim;
        LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
        OverdraftCoverageSheetScreen overdraftCoverageSheetScreen = (OverdraftCoverageSheetScreen) localHomePresenter.localHomeGeoPresenterFactory;
        RealRouter realRouter = (RealRouter) localHomePresenter.tabContentPresenterFactory;
        Analytics analytics = (Analytics) localHomePresenter.clearMarketingBadgesIfNeeded;
        CoroutineScope coroutineScope = (CoroutineScope) this.$targetValue;
        OverdraftViewEvent overdraftViewEvent = (OverdraftViewEvent) obj;
        if (Intrinsics.areEqual(overdraftViewEvent, OverdraftViewEvent.GoBack.INSTANCE)) {
            ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(Back.INSTANCE);
        } else {
            ?? r8 = 0;
            r8 = 0;
            if (Intrinsics.areEqual(overdraftViewEvent, OverdraftViewEvent.FooterClicked.INSTANCE)) {
                OverdraftStatus overdraftStatus = (OverdraftStatus) mutableState.getValue();
                overdraftStatus.getClass();
                analytics.track(new OverdraftCoverageManageTapFooter(), null);
                OverdraftStatus.Button button2 = overdraftStatus.footer_button;
                realRouter.route(new RoutingParams(null, null, overdraftCoverageSheetScreen.exitScreen, null, null, null, 503), button2 != null ? button2.client_route_url : null);
            } else {
                if (Intrinsics.areEqual(overdraftViewEvent, OverdraftViewEvent.RepaymentClicked.INSTANCE)) {
                    OverdraftStatus overdraftStatus2 = (OverdraftStatus) mutableState.getValue();
                    overdraftStatus2.getClass();
                    OverdraftStatus.State_ state_ = overdraftStatus2.State;
                    if (state_ != null) {
                        OverdraftStatus.State_.Upsell upsell2 = state_ instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_ : null;
                        if (upsell2 != null) {
                            upsell = upsell2.value;
                            if (upsell == null) {
                                if (state_ != null) {
                                    OverdraftStatus.State_.Eligible eligible2 = state_ instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_ : null;
                                    if (eligible2 != null) {
                                        eligible = eligible2.value;
                                        if (eligible == null) {
                                            analytics.track(new OverdraftCoverageManageRepay(), null);
                                            if (state_ != null) {
                                                OverdraftStatus.State_.Activated activated = state_ instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_ : null;
                                                OverdraftStatus.Activated activated2 = activated != null ? activated.value : null;
                                                if (activated2 != null) {
                                                    button = activated2.repayment_button;
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
                                                                r8 = permanentlyDisabled2.repayment_button;
                                                            }
                                                        }
                                                        r8.getClass();
                                                        button = r8;
                                                    }
                                                    realRouter.route(new RoutingParams(null, null, overdraftCoverageSheetScreen.exitScreen, null, null, null, 503), button.client_route_url);
                                                }
                                            }
                                            button = null;
                                            if (button == null) {
                                            }
                                            realRouter.route(new RoutingParams(null, null, overdraftCoverageSheetScreen.exitScreen, null, null, null, 503), button.client_route_url);
                                        }
                                    }
                                }
                                eligible = null;
                                if (eligible == null) {
                                }
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("We should not be receiving repayment button clicks in this state!");
                            return null;
                        }
                    }
                    upsell = null;
                    if (upsell == null) {
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("We should not be receiving repayment button clicks in this state!");
                    return null;
                }
                if (!Intrinsics.areEqual(overdraftViewEvent, OverdraftViewEvent.ToggleClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                JobKt.launch$default(coroutineScope, null, null, new MLKitTitleGenerator$prepareModel$1(localHomePresenter, mutableState, r8, 20), 3);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$benefits$applets$presenters$BankingBenefitsAppletTilePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$anim;
        LinkedAccountsPresenter linkedAccountsPresenter = (LinkedAccountsPresenter) this.this$0;
        CoroutineScope coroutineScope = (CoroutineScope) this.$targetValue;
        BankingBenefitsAppletTileEvent bankingBenefitsAppletTileEvent = (BankingBenefitsAppletTileEvent) obj;
        Continuation continuation2 = null;
        if (Intrinsics.areEqual(bankingBenefitsAppletTileEvent, BankingBenefitsAppletTileEvent.OnAppletTileClick.INSTANCE)) {
            JobKt.launch$default(coroutineScope, null, null, new BankingBenefitsAppletTilePresenter$models$1$1(linkedAccountsPresenter, mutableState, continuation2, 0), 3);
        } else {
            if (!Intrinsics.areEqual(bankingBenefitsAppletTileEvent, BankingBenefitsAppletTileEvent.OnPromotedAppletTileClick.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            JobKt.launch$default(coroutineScope, null, null, new BankingBenefitsAppletTilePresenter$models$1$1(linkedAccountsPresenter, mutableState, continuation2, 1), 3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x046f A[EDGE_INSN: B:155:0x046f->B:156:0x046f BREAK  A[LOOP:4: B:127:0x039e->B:741:0x039e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x054e A[EDGE_INSN: B:185:0x054e->B:186:0x054e BREAK  A[LOOP:5: B:157:0x047d->B:669:0x047d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0584 A[LOOP:6: B:198:0x057e->B:200:0x0584, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0682 A[EDGE_INSN: B:231:0x0682->B:232:0x0682 BREAK  A[LOOP:7: B:203:0x05b1->B:594:0x05b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0767 A[EDGE_INSN: B:245:0x0767->B:246:0x0767 BREAK  A[LOOP:8: B:233:0x0690->B:517:0x0762], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0184 A[EDGE_INSN: B:25:0x0184->B:26:0x0184 BREAK  A[LOOP:0: B:13:0x008d->B:894:0x0171], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x079d A[LOOP:9: B:258:0x0797->B:260:0x079d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0896 A[EDGE_INSN: B:275:0x0896->B:276:0x0896 BREAK  A[LOOP:10: B:263:0x07bf->B:437:0x0891], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08f5 A[LOOP:11: B:293:0x08ef->B:295:0x08f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0a04 A[EDGE_INSN: B:326:0x0a04->B:327:0x0a04 BREAK  A[LOOP:12: B:298:0x0933->B:360:0x0933], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0933 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0a04 A[EDGE_INSN: B:373:0x0a04->B:327:0x0a04 BREAK  A[LOOP:12: B:298:0x0933->B:360:0x0933], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0933 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0a04 A[EDGE_INSN: B:386:0x0a04->B:327:0x0a04 BREAK  A[LOOP:12: B:298:0x0933->B:360:0x0933], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0933 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0a04 A[EDGE_INSN: B:399:0x0a04->B:327:0x0a04 BREAK  A[LOOP:12: B:298:0x0933->B:360:0x0933], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0933 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0a04 A[EDGE_INSN: B:412:0x0a04->B:327:0x0a04 BREAK  A[LOOP:12: B:298:0x0933->B:360:0x0933], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0933 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a04 A[EDGE_INSN: B:425:0x0a04->B:327:0x0a04 BREAK  A[LOOP:12: B:298:0x0933->B:360:0x0933], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0933 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a03 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0891 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0896 A[EDGE_INSN: B:450:0x0896->B:276:0x0896 BREAK  A[LOOP:10: B:263:0x07bf->B:437:0x0891], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0891 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0896 A[EDGE_INSN: B:464:0x0896->B:276:0x0896 BREAK  A[LOOP:10: B:263:0x07bf->B:437:0x0891], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0891 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0896 A[EDGE_INSN: B:478:0x0896->B:276:0x0896 BREAK  A[LOOP:10: B:263:0x07bf->B:437:0x0891], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0891 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0896 A[EDGE_INSN: B:492:0x0896->B:276:0x0896 BREAK  A[LOOP:10: B:263:0x07bf->B:437:0x0891], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0891 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0896 A[EDGE_INSN: B:506:0x0896->B:276:0x0896 BREAK  A[LOOP:10: B:263:0x07bf->B:437:0x0891], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0891 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0895 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0767 A[EDGE_INSN: B:530:0x0767->B:246:0x0767 BREAK  A[LOOP:8: B:233:0x0690->B:517:0x0762], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0767 A[EDGE_INSN: B:544:0x0767->B:246:0x0767 BREAK  A[LOOP:8: B:233:0x0690->B:517:0x0762], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0767 A[EDGE_INSN: B:558:0x0767->B:246:0x0767 BREAK  A[LOOP:8: B:233:0x0690->B:517:0x0762], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0767 A[EDGE_INSN: B:572:0x0767->B:246:0x0767 BREAK  A[LOOP:8: B:233:0x0690->B:517:0x0762], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0767 A[EDGE_INSN: B:586:0x0767->B:246:0x0767 BREAK  A[LOOP:8: B:233:0x0690->B:517:0x0762], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0682 A[EDGE_INSN: B:607:0x0682->B:232:0x0682 BREAK  A[LOOP:7: B:203:0x05b1->B:594:0x05b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:608:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0682 A[EDGE_INSN: B:620:0x0682->B:232:0x0682 BREAK  A[LOOP:7: B:203:0x05b1->B:594:0x05b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0682 A[EDGE_INSN: B:633:0x0682->B:232:0x0682 BREAK  A[LOOP:7: B:203:0x05b1->B:594:0x05b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0682 A[EDGE_INSN: B:646:0x0682->B:232:0x0682 BREAK  A[LOOP:7: B:203:0x05b1->B:594:0x05b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0682 A[EDGE_INSN: B:659:0x0682->B:232:0x0682 BREAK  A[LOOP:7: B:203:0x05b1->B:594:0x05b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:660:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0681 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:682:0x054e A[EDGE_INSN: B:682:0x054e->B:186:0x054e BREAK  A[LOOP:5: B:157:0x047d->B:669:0x047d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:695:0x054e A[EDGE_INSN: B:695:0x054e->B:186:0x054e BREAK  A[LOOP:5: B:157:0x047d->B:669:0x047d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:696:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:708:0x054e A[EDGE_INSN: B:708:0x054e->B:186:0x054e BREAK  A[LOOP:5: B:157:0x047d->B:669:0x047d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:709:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:721:0x054e A[EDGE_INSN: B:721:0x054e->B:186:0x054e BREAK  A[LOOP:5: B:157:0x047d->B:669:0x047d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:722:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:734:0x054e A[EDGE_INSN: B:734:0x054e->B:186:0x054e BREAK  A[LOOP:5: B:157:0x047d->B:669:0x047d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:735:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:738:0x054d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:740:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x046f A[EDGE_INSN: B:754:0x046f->B:156:0x046f BREAK  A[LOOP:4: B:127:0x039e->B:741:0x039e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:755:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:767:0x046f A[EDGE_INSN: B:767:0x046f->B:156:0x046f BREAK  A[LOOP:4: B:127:0x039e->B:741:0x039e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:768:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:780:0x046f A[EDGE_INSN: B:780:0x046f->B:156:0x046f BREAK  A[LOOP:4: B:127:0x039e->B:741:0x039e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:781:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:793:0x046f A[EDGE_INSN: B:793:0x046f->B:156:0x046f BREAK  A[LOOP:4: B:127:0x039e->B:741:0x039e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:794:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:806:0x046f A[EDGE_INSN: B:806:0x046f->B:156:0x046f BREAK  A[LOOP:4: B:127:0x039e->B:741:0x039e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:807:0x039e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:810:0x046e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:814:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ef A[EDGE_INSN: B:81:0x02ef->B:82:0x02ef BREAK  A[LOOP:2: B:53:0x021e->B:818:0x021e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:831:0x02ef A[EDGE_INSN: B:831:0x02ef->B:82:0x02ef BREAK  A[LOOP:2: B:53:0x021e->B:818:0x021e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:832:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:844:0x02ef A[EDGE_INSN: B:844:0x02ef->B:82:0x02ef BREAK  A[LOOP:2: B:53:0x021e->B:818:0x021e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:845:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:857:0x02ef A[EDGE_INSN: B:857:0x02ef->B:82:0x02ef BREAK  A[LOOP:2: B:53:0x021e->B:818:0x021e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:858:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:870:0x02ef A[EDGE_INSN: B:870:0x02ef->B:82:0x02ef BREAK  A[LOOP:2: B:53:0x021e->B:818:0x021e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:871:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:883:0x02ef A[EDGE_INSN: B:883:0x02ef->B:82:0x02ef BREAK  A[LOOP:2: B:53:0x021e->B:818:0x021e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:884:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:887:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:889:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:893:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:907:0x0184 A[EDGE_INSN: B:907:0x0184->B:26:0x0184 BREAK  A[LOOP:0: B:13:0x008d->B:894:0x0171], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:908:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:921:0x0184 A[EDGE_INSN: B:921:0x0184->B:26:0x0184 BREAK  A[LOOP:0: B:13:0x008d->B:894:0x0171], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:922:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:935:0x0184 A[EDGE_INSN: B:935:0x0184->B:26:0x0184 BREAK  A[LOOP:0: B:13:0x008d->B:894:0x0171], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:936:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:949:0x0184 A[EDGE_INSN: B:949:0x0184->B:26:0x0184 BREAK  A[LOOP:0: B:13:0x008d->B:894:0x0171], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:950:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:963:0x0184 A[EDGE_INSN: B:963:0x0184->B:26:0x0184 BREAK  A[LOOP:0: B:13:0x008d->B:894:0x0171], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:964:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:970:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:973:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$benefits$presenters$BenefitsHubPresenter$models$1$1$2(Object obj, Continuation continuation) {
        BenefitsHubPresenter$models$1$1$2$emit$1 benefitsHubPresenter$models$1$1$2$emit$1;
        int i;
        ApiResult apiResult;
        LocalPosCheckInPresenter localPosCheckInPresenter;
        BenefitsHub benefitsHub;
        List list;
        BenefitsHubViewModel.Loaded.PageHeaderViewModel pageHeaderViewModel;
        Object obj2;
        List list2;
        ArrayList arrayList;
        Iterator it;
        Object obj3;
        BenefitsHub.Section section;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown;
        List list3;
        Iterator it2;
        Iterator it3;
        Object obj4;
        Iterator it4;
        Object obj5;
        BenefitsHub.Section section2;
        List list4;
        Iterator it5;
        Object obj6;
        Iterator it6;
        Object obj7;
        BenefitsHub.Section section3;
        List list5;
        Iterator it7;
        Object obj8;
        BenefitsHub.Section section4;
        ButtonRow buttonRow;
        BenefitsHubViewModel.Loaded.CallToActionViewModel callToActionViewModel;
        Iterator it8;
        Iterator it9;
        Object obj9;
        BenefitsHub.Section section5;
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen benefitsExplanationScreen;
        BenefitsExplanationScreen benefitsExplanationScreen2;
        ImageResourcesKt imageResourcesKt;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown2;
        BenefitsHub.BenefitsBreakdown.LearnMore learnMore;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown3;
        BenefitsHub.DefaultPerks defaultPerks;
        BenefitsHub.CallToActions callToActions;
        BenefitsHub.CommonQuestions commonQuestions;
        BenefitsHub.Disclosures disclosures;
        BenefitsHub.Insights insights;
        ImageResourcesKt imageResourcesKt2;
        BenefitsHub.CallToActions callToActions2;
        Iterator it10;
        BenefitsHub.Insights insights2;
        BenefitsHub.Disclosures disclosures2;
        BenefitsHub.CommonQuestions commonQuestions2;
        BenefitsHub.CallToActions callToActions3;
        BenefitsHub.DefaultPerks defaultPerks2;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown4;
        ImageResourcesKt imageResourcesKt3;
        BenefitsHub.CommonQuestions commonQuestions3;
        Iterator it11;
        BenefitsHub.Insights insights3;
        BenefitsHub.Disclosures disclosures3;
        BenefitsHub.CommonQuestions commonQuestions4;
        BenefitsHub.CallToActions callToActions4;
        BenefitsHub.DefaultPerks defaultPerks3;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown5;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown6;
        BenefitsHub.DefaultPerks defaultPerks4;
        BenefitsHub.CallToActions callToActions5;
        BenefitsHub.CommonQuestions commonQuestions5;
        BenefitsHub.Disclosures disclosures4;
        BenefitsHub.Insights insights4;
        ImageResourcesKt imageResourcesKt4;
        BenefitsHub.DefaultPerks defaultPerks5;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown7;
        BenefitsHub.DefaultPerks defaultPerks6;
        BenefitsHub.CallToActions callToActions6;
        BenefitsHub.CommonQuestions commonQuestions6;
        BenefitsHub.Disclosures disclosures5;
        BenefitsHub.Insights insights5;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown8;
        BenefitsHub.DefaultPerks defaultPerks7;
        BenefitsHub.CallToActions callToActions7;
        BenefitsHub.CommonQuestions commonQuestions7;
        BenefitsHub.Disclosures disclosures6;
        BenefitsHub.Insights insights6;
        BenefitsHub.BenefitsBreakdown.LearnMore learnMore2;
        TintedLink tintedLink;
        BenefitsHub.BenefitsBreakdown.LearnMore learnMore3;
        TintedLink tintedLink2;
        RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute;
        ImageResourcesKt imageResourcesKt5;
        BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown9;
        BenefitsHub.DefaultPerks defaultPerks8;
        BenefitsHub.CallToActions callToActions8;
        BenefitsHub.CommonQuestions commonQuestions8;
        BenefitsHub.Disclosures disclosures7;
        BenefitsHub.Insights insights7;
        MutableState mutableState;
        ApiResult apiResult2;
        LocalPosCheckInPresenter localPosCheckInPresenter2;
        GetBankingBenefitsHubResponse getBankingBenefitsHubResponse;
        BenefitDetailsViewModel benefitDetailsViewModel;
        ImageResourcesKt imageResourcesKt6;
        BenefitsHub.Insights insights8;
        BenefitsHub.Disclosures disclosures8;
        BenefitsHub.CommonQuestions commonQuestions9;
        BenefitsHub.CallToActions callToActions9;
        BenefitsHub.DefaultPerks defaultPerks9;
        BenefitsHub.BenefitsBreakdown benefitsBreakdown10;
        LocalPosCheckInPresenter localPosCheckInPresenter3 = (LocalPosCheckInPresenter) this.$targetValue;
        MutableState mutableState2 = (MutableState) this.this$0;
        if (continuation instanceof BenefitsHubPresenter$models$1$1$2$emit$1) {
            benefitsHubPresenter$models$1$1$2$emit$1 = (BenefitsHubPresenter$models$1$1$2$emit$1) continuation;
            int i2 = benefitsHubPresenter$models$1$1$2$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                benefitsHubPresenter$models$1$1$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj10 = benefitsHubPresenter$models$1$1$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitsHubPresenter$models$1$1$2$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj10);
                    mutableState2.setValue(BenefitsHubViewModel.Loading.INSTANCE);
                    BankingBenefitsAppService bankingBenefitsAppService = (BankingBenefitsAppService) localPosCheckInPresenter3.launcher;
                    GetBankingBenefitsHubRequest getBankingBenefitsHubRequest = new GetBankingBenefitsHubRequest(ByteString.EMPTY);
                    benefitsHubPresenter$models$1$1$2$emit$1.label = 1;
                    obj10 = bankingBenefitsAppService.getBankingBenefitsHub(getBankingBenefitsHubRequest, benefitsHubPresenter$models$1$1$2$emit$1);
                    if (obj10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj10);
                }
                apiResult = (ApiResult) obj10;
                MutableState mutableState3 = (MutableState) this.$anim;
                if (apiResult instanceof ApiResult.Success) {
                    localPosCheckInPresenter = localPosCheckInPresenter3;
                } else {
                    GetBankingBenefitsHubResponse getBankingBenefitsHubResponse2 = (GetBankingBenefitsHubResponse) ((ApiResult.Success) apiResult).response;
                    BenefitsHub benefitsHub2 = getBankingBenefitsHubResponse2.benefits_hub;
                    benefitsHub2.getClass();
                    String str = benefitsHub2.title;
                    str.getClass();
                    TextRow textRow = benefitsHub2.status;
                    textRow.getClass();
                    TintedIcon tintedIcon = textRow.icon;
                    tintedIcon.getClass();
                    String str2 = textRow.title;
                    str2.getClass();
                    BenefitsHubViewModel.Loaded.PageHeaderViewModel pageHeaderViewModel2 = new BenefitsHubViewModel.Loaded.PageHeaderViewModel(tintedIcon, str, str2);
                    List list6 = benefitsHub2.sections;
                    Iterator it12 = list6.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            benefitsHub = benefitsHub2;
                            list = list6;
                            pageHeaderViewModel = pageHeaderViewModel2;
                            obj2 = null;
                            break;
                        }
                        obj2 = it12.next();
                        benefitsHub = benefitsHub2;
                        BenefitsHub.Section section6 = (BenefitsHub.Section) obj2;
                        list = list6;
                        ReflectionFactory reflectionFactory = Reflection.factory;
                        Iterator it13 = it12;
                        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(BenefitsHub.Insights.class);
                        pageHeaderViewModel = pageHeaderViewModel2;
                        if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class))) {
                            ImageResourcesKt imageResourcesKt7 = section6.Body;
                            if (imageResourcesKt7 != null) {
                                BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown2 = imageResourcesKt7 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt7 : null;
                                if (benefitsHub$Section$Body_$BenefitsBreakdown2 != null) {
                                    benefitsBreakdown10 = benefitsHub$Section$Body_$BenefitsBreakdown2.value;
                                    if (benefitsBreakdown10 == null) {
                                        break;
                                    }
                                    list6 = list;
                                    benefitsHub2 = benefitsHub;
                                    it12 = it13;
                                    pageHeaderViewModel2 = pageHeaderViewModel;
                                }
                            }
                            benefitsBreakdown10 = null;
                            if (benefitsBreakdown10 == null) {
                            }
                        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class))) {
                            ImageResourcesKt imageResourcesKt8 = section6.Body;
                            if (imageResourcesKt8 != null) {
                                BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks = imageResourcesKt8 instanceof BenefitsHub$Section$Body_$DefaultPerks ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt8 : null;
                                if (benefitsHub$Section$Body_$DefaultPerks != null) {
                                    defaultPerks9 = benefitsHub$Section$Body_$DefaultPerks.value;
                                    if (defaultPerks9 == null) {
                                        break;
                                    }
                                    list6 = list;
                                    benefitsHub2 = benefitsHub;
                                    it12 = it13;
                                    pageHeaderViewModel2 = pageHeaderViewModel;
                                }
                            }
                            defaultPerks9 = null;
                            if (defaultPerks9 == null) {
                            }
                        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.CallToActions.class))) {
                            ImageResourcesKt imageResourcesKt9 = section6.Body;
                            if (imageResourcesKt9 != null) {
                                BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions = imageResourcesKt9 instanceof BenefitsHub$Section$Body_$CallToActions ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt9 : null;
                                if (benefitsHub$Section$Body_$CallToActions != null) {
                                    callToActions9 = benefitsHub$Section$Body_$CallToActions.value;
                                    if (callToActions9 == null) {
                                        break;
                                    }
                                    list6 = list;
                                    benefitsHub2 = benefitsHub;
                                    it12 = it13;
                                    pageHeaderViewModel2 = pageHeaderViewModel;
                                }
                            }
                            callToActions9 = null;
                            if (callToActions9 == null) {
                            }
                        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class))) {
                            ImageResourcesKt imageResourcesKt10 = section6.Body;
                            if (imageResourcesKt10 != null) {
                                BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions = imageResourcesKt10 instanceof BenefitsHub$Section$Body_$CommonQuestions ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt10 : null;
                                if (benefitsHub$Section$Body_$CommonQuestions != null) {
                                    commonQuestions9 = benefitsHub$Section$Body_$CommonQuestions.value;
                                    if (commonQuestions9 == null) {
                                        break;
                                    }
                                    list6 = list;
                                    benefitsHub2 = benefitsHub;
                                    it12 = it13;
                                    pageHeaderViewModel2 = pageHeaderViewModel;
                                }
                            }
                            commonQuestions9 = null;
                            if (commonQuestions9 == null) {
                            }
                        } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.Disclosures.class))) {
                            ImageResourcesKt imageResourcesKt11 = section6.Body;
                            if (imageResourcesKt11 != null) {
                                BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures = imageResourcesKt11 instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt11 : null;
                                if (benefitsHub$Section$Body_$Disclosures != null) {
                                    disclosures8 = benefitsHub$Section$Body_$Disclosures.value;
                                    if (disclosures8 == null) {
                                        break;
                                    }
                                    list6 = list;
                                    benefitsHub2 = benefitsHub;
                                    it12 = it13;
                                    pageHeaderViewModel2 = pageHeaderViewModel;
                                }
                            }
                            disclosures8 = null;
                            if (disclosures8 == null) {
                            }
                        } else {
                            if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(BenefitsHub.Insights.class))) {
                                ImageResourcesKt imageResourcesKt12 = section6.Body;
                                if (imageResourcesKt12 != null) {
                                    BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights = imageResourcesKt12 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt12 : null;
                                    if (benefitsHub$Section$Body_$Insights != null) {
                                        insights8 = benefitsHub$Section$Body_$Insights.value;
                                        if (insights8 == null) {
                                            break;
                                        }
                                    }
                                }
                                insights8 = null;
                                if (insights8 == null) {
                                }
                            } else {
                                continue;
                            }
                            list6 = list;
                            benefitsHub2 = benefitsHub;
                            it12 = it13;
                            pageHeaderViewModel2 = pageHeaderViewModel;
                        }
                    }
                    BenefitsHub.Section section7 = (BenefitsHub.Section) obj2;
                    if (section7 != null && (imageResourcesKt6 = section7.Body) != null) {
                        BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights2 = imageResourcesKt6 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt6 : null;
                        BenefitsHub.Insights insights9 = benefitsHub$Section$Body_$Insights2 != null ? benefitsHub$Section$Body_$Insights2.value : null;
                        if (insights9 != null) {
                            list2 = insights9.insights;
                            if (list2 == null) {
                                List list7 = list2;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                Iterator it14 = list7.iterator();
                                while (it14.hasNext()) {
                                    BenefitsHub.Insights.Insight insight = (BenefitsHub.Insights.Insight) it14.next();
                                    String str3 = insight.heading;
                                    str3.getClass();
                                    String str4 = insight.subheading;
                                    str4.getClass();
                                    Iterator it15 = it14;
                                    Prominence prominence = insight.prominence;
                                    prominence.getClass();
                                    BenefitsHub.Insights.Insight.Tooltip tooltip = insight.tooltip;
                                    if (tooltip != null) {
                                        localPosCheckInPresenter2 = localPosCheckInPresenter3;
                                        apiResult2 = apiResult;
                                        UiAvatar uiAvatar = tooltip.avatar;
                                        uiAvatar.getClass();
                                        mutableState = mutableState3;
                                        String str5 = tooltip.title;
                                        str5.getClass();
                                        getBankingBenefitsHubResponse = getBankingBenefitsHubResponse2;
                                        benefitDetailsViewModel = new BenefitDetailsViewModel(uiAvatar, str5, tooltip.paragraphs, tooltip.footnote);
                                    } else {
                                        mutableState = mutableState3;
                                        apiResult2 = apiResult;
                                        localPosCheckInPresenter2 = localPosCheckInPresenter3;
                                        getBankingBenefitsHubResponse = getBankingBenefitsHubResponse2;
                                        benefitDetailsViewModel = null;
                                    }
                                    arrayList2.add(new BenefitsHubViewModel.Loaded.Insight(str3, str4, prominence, benefitDetailsViewModel));
                                    it14 = it15;
                                    localPosCheckInPresenter3 = localPosCheckInPresenter2;
                                    apiResult = apiResult2;
                                    mutableState3 = mutableState;
                                    getBankingBenefitsHubResponse2 = getBankingBenefitsHubResponse;
                                }
                                arrayList = arrayList2;
                            } else {
                                arrayList = null;
                            }
                            MutableState mutableState4 = mutableState3;
                            ApiResult apiResult3 = apiResult;
                            localPosCheckInPresenter = localPosCheckInPresenter3;
                            GetBankingBenefitsHubResponse getBankingBenefitsHubResponse3 = getBankingBenefitsHubResponse2;
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it.next();
                                BenefitsHub.Section section8 = (BenefitsHub.Section) obj3;
                                ReflectionFactory reflectionFactory2 = Reflection.factory;
                                KClass orCreateKotlinClass2 = reflectionFactory2.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class);
                                if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class))) {
                                    ImageResourcesKt imageResourcesKt13 = section8.Body;
                                    if (imageResourcesKt13 != null) {
                                        BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown3 = imageResourcesKt13 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt13 : null;
                                        if (benefitsHub$Section$Body_$BenefitsBreakdown3 != null) {
                                            benefitsBreakdown9 = benefitsHub$Section$Body_$BenefitsBreakdown3.value;
                                            if (benefitsBreakdown9 == null) {
                                                break;
                                            }
                                        }
                                    }
                                    benefitsBreakdown9 = null;
                                    if (benefitsBreakdown9 == null) {
                                    }
                                } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class))) {
                                    ImageResourcesKt imageResourcesKt14 = section8.Body;
                                    if (imageResourcesKt14 != null) {
                                        BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks2 = imageResourcesKt14 instanceof BenefitsHub$Section$Body_$DefaultPerks ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt14 : null;
                                        if (benefitsHub$Section$Body_$DefaultPerks2 != null) {
                                            defaultPerks8 = benefitsHub$Section$Body_$DefaultPerks2.value;
                                            if (defaultPerks8 == null) {
                                                break;
                                            }
                                        }
                                    }
                                    defaultPerks8 = null;
                                    if (defaultPerks8 == null) {
                                    }
                                } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(BenefitsHub.CallToActions.class))) {
                                    ImageResourcesKt imageResourcesKt15 = section8.Body;
                                    if (imageResourcesKt15 != null) {
                                        BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions2 = imageResourcesKt15 instanceof BenefitsHub$Section$Body_$CallToActions ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt15 : null;
                                        if (benefitsHub$Section$Body_$CallToActions2 != null) {
                                            callToActions8 = benefitsHub$Section$Body_$CallToActions2.value;
                                            if (callToActions8 == null) {
                                                break;
                                            }
                                        }
                                    }
                                    callToActions8 = null;
                                    if (callToActions8 == null) {
                                    }
                                } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class))) {
                                    ImageResourcesKt imageResourcesKt16 = section8.Body;
                                    if (imageResourcesKt16 != null) {
                                        BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions2 = imageResourcesKt16 instanceof BenefitsHub$Section$Body_$CommonQuestions ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt16 : null;
                                        if (benefitsHub$Section$Body_$CommonQuestions2 != null) {
                                            commonQuestions8 = benefitsHub$Section$Body_$CommonQuestions2.value;
                                            if (commonQuestions8 == null) {
                                                break;
                                            }
                                        }
                                    }
                                    commonQuestions8 = null;
                                    if (commonQuestions8 == null) {
                                    }
                                } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(BenefitsHub.Disclosures.class))) {
                                    ImageResourcesKt imageResourcesKt17 = section8.Body;
                                    if (imageResourcesKt17 != null) {
                                        BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures2 = imageResourcesKt17 instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt17 : null;
                                        if (benefitsHub$Section$Body_$Disclosures2 != null) {
                                            disclosures7 = benefitsHub$Section$Body_$Disclosures2.value;
                                            if (disclosures7 == null) {
                                                break;
                                            }
                                        }
                                    }
                                    disclosures7 = null;
                                    if (disclosures7 == null) {
                                    }
                                } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(BenefitsHub.Insights.class))) {
                                    ImageResourcesKt imageResourcesKt18 = section8.Body;
                                    if (imageResourcesKt18 != null) {
                                        BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights3 = imageResourcesKt18 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt18 : null;
                                        if (benefitsHub$Section$Body_$Insights3 != null) {
                                            insights7 = benefitsHub$Section$Body_$Insights3.value;
                                            if (insights7 == null) {
                                                break;
                                            }
                                        }
                                    }
                                    insights7 = null;
                                    if (insights7 == null) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                            section = (BenefitsHub.Section) obj3;
                            if (section != null && (imageResourcesKt5 = section.Body) != null) {
                                benefitsHub$Section$Body_$BenefitsBreakdown = !(imageResourcesKt5 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown) ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt5 : null;
                                if (benefitsHub$Section$Body_$BenefitsBreakdown != null) {
                                    benefitsBreakdown = benefitsHub$Section$Body_$BenefitsBreakdown.value;
                                    list3 = benefitsBreakdown != null ? benefitsBreakdown.benefits : null;
                                    if (list3 == null) {
                                        list3 = EmptyList.INSTANCE;
                                    }
                                    List list8 = list3;
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                                    it2 = list8.iterator();
                                    while (it2.hasNext()) {
                                        TextRow textRow2 = (TextRow) it2.next();
                                        TintedIcon tintedIcon2 = textRow2.icon;
                                        tintedIcon2.getClass();
                                        String str6 = textRow2.title;
                                        str6.getClass();
                                        String str7 = textRow2.subtitle;
                                        str7.getClass();
                                        RowAction rowAction = textRow2.row_action;
                                        Iterator it16 = it2;
                                        arrayList3.add(new BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow(tintedIcon2, str6, str7, Intrinsics.areEqual(textRow2.disabled, Boolean.TRUE), rowAction != null ? rowAction.id : null, rowAction != null ? rowAction.text : null, (rowAction == null || (rowAction$Action_$ClientRoute = rowAction.Action) == null) ? null : rowAction$Action_$ClientRoute.value));
                                        it2 = it16;
                                    }
                                    BenefitsHubViewModel.Loaded.BenefitsViewModel benefitsViewModel = new BenefitsHubViewModel.Loaded.BenefitsViewModel(arrayList3, (benefitsBreakdown != null || (learnMore3 = benefitsBreakdown.learn_more) == null || (tintedLink2 = learnMore3.link) == null) ? null : tintedLink2.link_text, (benefitsBreakdown != null || (learnMore2 = benefitsBreakdown.learn_more) == null || (tintedLink = learnMore2.link) == null) ? null : tintedLink.tint_color);
                                    it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = it3.next();
                                        BenefitsHub.Section section9 = (BenefitsHub.Section) obj4;
                                        ReflectionFactory reflectionFactory3 = Reflection.factory;
                                        KClass orCreateKotlinClass3 = reflectionFactory3.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class);
                                        if (orCreateKotlinClass3.equals(reflectionFactory3.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class))) {
                                            ImageResourcesKt imageResourcesKt19 = section9.Body;
                                            if (imageResourcesKt19 != null) {
                                                BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown4 = imageResourcesKt19 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt19 : null;
                                                if (benefitsHub$Section$Body_$BenefitsBreakdown4 != null) {
                                                    benefitsBreakdown8 = benefitsHub$Section$Body_$BenefitsBreakdown4.value;
                                                    if (benefitsBreakdown8 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            benefitsBreakdown8 = null;
                                            if (benefitsBreakdown8 == null) {
                                            }
                                        } else if (orCreateKotlinClass3.equals(reflectionFactory3.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class))) {
                                            ImageResourcesKt imageResourcesKt20 = section9.Body;
                                            if (imageResourcesKt20 != null) {
                                                BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks3 = imageResourcesKt20 instanceof BenefitsHub$Section$Body_$DefaultPerks ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt20 : null;
                                                if (benefitsHub$Section$Body_$DefaultPerks3 != null) {
                                                    defaultPerks7 = benefitsHub$Section$Body_$DefaultPerks3.value;
                                                    if (defaultPerks7 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            defaultPerks7 = null;
                                            if (defaultPerks7 == null) {
                                            }
                                        } else if (orCreateKotlinClass3.equals(reflectionFactory3.getOrCreateKotlinClass(BenefitsHub.CallToActions.class))) {
                                            ImageResourcesKt imageResourcesKt21 = section9.Body;
                                            if (imageResourcesKt21 != null) {
                                                BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions3 = imageResourcesKt21 instanceof BenefitsHub$Section$Body_$CallToActions ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt21 : null;
                                                if (benefitsHub$Section$Body_$CallToActions3 != null) {
                                                    callToActions7 = benefitsHub$Section$Body_$CallToActions3.value;
                                                    if (callToActions7 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            callToActions7 = null;
                                            if (callToActions7 == null) {
                                            }
                                        } else if (orCreateKotlinClass3.equals(reflectionFactory3.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class))) {
                                            ImageResourcesKt imageResourcesKt22 = section9.Body;
                                            if (imageResourcesKt22 != null) {
                                                BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions3 = imageResourcesKt22 instanceof BenefitsHub$Section$Body_$CommonQuestions ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt22 : null;
                                                if (benefitsHub$Section$Body_$CommonQuestions3 != null) {
                                                    commonQuestions7 = benefitsHub$Section$Body_$CommonQuestions3.value;
                                                    if (commonQuestions7 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            commonQuestions7 = null;
                                            if (commonQuestions7 == null) {
                                            }
                                        } else if (orCreateKotlinClass3.equals(reflectionFactory3.getOrCreateKotlinClass(BenefitsHub.Disclosures.class))) {
                                            ImageResourcesKt imageResourcesKt23 = section9.Body;
                                            if (imageResourcesKt23 != null) {
                                                BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures3 = imageResourcesKt23 instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt23 : null;
                                                if (benefitsHub$Section$Body_$Disclosures3 != null) {
                                                    disclosures6 = benefitsHub$Section$Body_$Disclosures3.value;
                                                    if (disclosures6 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            disclosures6 = null;
                                            if (disclosures6 == null) {
                                            }
                                        } else if (orCreateKotlinClass3.equals(reflectionFactory3.getOrCreateKotlinClass(BenefitsHub.Insights.class))) {
                                            ImageResourcesKt imageResourcesKt24 = section9.Body;
                                            if (imageResourcesKt24 != null) {
                                                BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights4 = imageResourcesKt24 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt24 : null;
                                                if (benefitsHub$Section$Body_$Insights4 != null) {
                                                    insights6 = benefitsHub$Section$Body_$Insights4.value;
                                                    if (insights6 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            insights6 = null;
                                            if (insights6 == null) {
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    BenefitsHub.Section section10 = (BenefitsHub.Section) obj4;
                                    section10.getClass();
                                    String str8 = section10.heading;
                                    str8.getClass();
                                    it4 = list.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            obj5 = null;
                                            break;
                                        }
                                        obj5 = it4.next();
                                        BenefitsHub.Section section11 = (BenefitsHub.Section) obj5;
                                        ReflectionFactory reflectionFactory4 = Reflection.factory;
                                        KClass orCreateKotlinClass4 = reflectionFactory4.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class);
                                        if (Intrinsics.areEqual(orCreateKotlinClass4, reflectionFactory4.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class))) {
                                            ImageResourcesKt imageResourcesKt25 = section11.Body;
                                            if (imageResourcesKt25 != null) {
                                                BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown5 = imageResourcesKt25 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt25 : null;
                                                if (benefitsHub$Section$Body_$BenefitsBreakdown5 != null) {
                                                    benefitsBreakdown7 = benefitsHub$Section$Body_$BenefitsBreakdown5.value;
                                                    if (benefitsBreakdown7 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            benefitsBreakdown7 = null;
                                            if (benefitsBreakdown7 == null) {
                                            }
                                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, reflectionFactory4.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class))) {
                                            ImageResourcesKt imageResourcesKt26 = section11.Body;
                                            if (imageResourcesKt26 != null) {
                                                BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks4 = imageResourcesKt26 instanceof BenefitsHub$Section$Body_$DefaultPerks ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt26 : null;
                                                if (benefitsHub$Section$Body_$DefaultPerks4 != null) {
                                                    defaultPerks6 = benefitsHub$Section$Body_$DefaultPerks4.value;
                                                    if (defaultPerks6 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            defaultPerks6 = null;
                                            if (defaultPerks6 == null) {
                                            }
                                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, reflectionFactory4.getOrCreateKotlinClass(BenefitsHub.CallToActions.class))) {
                                            ImageResourcesKt imageResourcesKt27 = section11.Body;
                                            if (imageResourcesKt27 != null) {
                                                BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions4 = imageResourcesKt27 instanceof BenefitsHub$Section$Body_$CallToActions ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt27 : null;
                                                if (benefitsHub$Section$Body_$CallToActions4 != null) {
                                                    callToActions6 = benefitsHub$Section$Body_$CallToActions4.value;
                                                    if (callToActions6 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            callToActions6 = null;
                                            if (callToActions6 == null) {
                                            }
                                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, reflectionFactory4.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class))) {
                                            ImageResourcesKt imageResourcesKt28 = section11.Body;
                                            if (imageResourcesKt28 != null) {
                                                BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions4 = imageResourcesKt28 instanceof BenefitsHub$Section$Body_$CommonQuestions ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt28 : null;
                                                if (benefitsHub$Section$Body_$CommonQuestions4 != null) {
                                                    commonQuestions6 = benefitsHub$Section$Body_$CommonQuestions4.value;
                                                    if (commonQuestions6 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            commonQuestions6 = null;
                                            if (commonQuestions6 == null) {
                                            }
                                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, reflectionFactory4.getOrCreateKotlinClass(BenefitsHub.Disclosures.class))) {
                                            ImageResourcesKt imageResourcesKt29 = section11.Body;
                                            if (imageResourcesKt29 != null) {
                                                BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures4 = imageResourcesKt29 instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt29 : null;
                                                if (benefitsHub$Section$Body_$Disclosures4 != null) {
                                                    disclosures5 = benefitsHub$Section$Body_$Disclosures4.value;
                                                    if (disclosures5 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            disclosures5 = null;
                                            if (disclosures5 == null) {
                                            }
                                        } else if (Intrinsics.areEqual(orCreateKotlinClass4, reflectionFactory4.getOrCreateKotlinClass(BenefitsHub.Insights.class))) {
                                            ImageResourcesKt imageResourcesKt30 = section11.Body;
                                            if (imageResourcesKt30 != null) {
                                                BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights5 = imageResourcesKt30 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt30 : null;
                                                if (benefitsHub$Section$Body_$Insights5 != null) {
                                                    insights5 = benefitsHub$Section$Body_$Insights5.value;
                                                    if (insights5 == null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            insights5 = null;
                                            if (insights5 == null) {
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    section2 = (BenefitsHub.Section) obj5;
                                    if (section2 != null && (imageResourcesKt4 = section2.Body) != null) {
                                        BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks5 = !(imageResourcesKt4 instanceof BenefitsHub$Section$Body_$DefaultPerks) ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt4 : null;
                                        defaultPerks5 = benefitsHub$Section$Body_$DefaultPerks5 == null ? benefitsHub$Section$Body_$DefaultPerks5.value : null;
                                        if (defaultPerks5 != null) {
                                            list4 = defaultPerks5.details;
                                            list4.getClass();
                                            List<TextRow> list9 = list4;
                                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                                            for (TextRow textRow3 : list9) {
                                                TintedIcon tintedIcon3 = textRow3.icon;
                                                tintedIcon3.getClass();
                                                String str9 = textRow3.title;
                                                str9.getClass();
                                                String str10 = textRow3.subtitle;
                                                str10.getClass();
                                                arrayList4.add(new BenefitsHubViewModel.Loaded.DefaultPerk(tintedIcon3, str9, str10));
                                            }
                                            BenefitsHubViewModel.Loaded.DefaultPerksViewModel defaultPerksViewModel = new BenefitsHubViewModel.Loaded.DefaultPerksViewModel(str8, CollectionsKt.windowed(arrayList4, 2, 2, true));
                                            it5 = list.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    obj6 = null;
                                                    break;
                                                }
                                                obj6 = it5.next();
                                                BenefitsHub.Section section12 = (BenefitsHub.Section) obj6;
                                                ReflectionFactory reflectionFactory5 = Reflection.factory;
                                                KClass orCreateKotlinClass5 = reflectionFactory5.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class);
                                                if (Intrinsics.areEqual(orCreateKotlinClass5, reflectionFactory5.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class))) {
                                                    ImageResourcesKt imageResourcesKt31 = section12.Body;
                                                    if (imageResourcesKt31 != null) {
                                                        BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown6 = imageResourcesKt31 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt31 : null;
                                                        if (benefitsHub$Section$Body_$BenefitsBreakdown6 != null) {
                                                            benefitsBreakdown6 = benefitsHub$Section$Body_$BenefitsBreakdown6.value;
                                                            if (benefitsBreakdown6 == null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    benefitsBreakdown6 = null;
                                                    if (benefitsBreakdown6 == null) {
                                                    }
                                                } else if (Intrinsics.areEqual(orCreateKotlinClass5, reflectionFactory5.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class))) {
                                                    ImageResourcesKt imageResourcesKt32 = section12.Body;
                                                    if (imageResourcesKt32 != null) {
                                                        BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks6 = imageResourcesKt32 instanceof BenefitsHub$Section$Body_$DefaultPerks ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt32 : null;
                                                        if (benefitsHub$Section$Body_$DefaultPerks6 != null) {
                                                            defaultPerks4 = benefitsHub$Section$Body_$DefaultPerks6.value;
                                                            if (defaultPerks4 == null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    defaultPerks4 = null;
                                                    if (defaultPerks4 == null) {
                                                    }
                                                } else if (Intrinsics.areEqual(orCreateKotlinClass5, reflectionFactory5.getOrCreateKotlinClass(BenefitsHub.CallToActions.class))) {
                                                    ImageResourcesKt imageResourcesKt33 = section12.Body;
                                                    if (imageResourcesKt33 != null) {
                                                        BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions5 = imageResourcesKt33 instanceof BenefitsHub$Section$Body_$CallToActions ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt33 : null;
                                                        if (benefitsHub$Section$Body_$CallToActions5 != null) {
                                                            callToActions5 = benefitsHub$Section$Body_$CallToActions5.value;
                                                            if (callToActions5 == null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    callToActions5 = null;
                                                    if (callToActions5 == null) {
                                                    }
                                                } else if (Intrinsics.areEqual(orCreateKotlinClass5, reflectionFactory5.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class))) {
                                                    ImageResourcesKt imageResourcesKt34 = section12.Body;
                                                    if (imageResourcesKt34 != null) {
                                                        BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions5 = imageResourcesKt34 instanceof BenefitsHub$Section$Body_$CommonQuestions ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt34 : null;
                                                        if (benefitsHub$Section$Body_$CommonQuestions5 != null) {
                                                            commonQuestions5 = benefitsHub$Section$Body_$CommonQuestions5.value;
                                                            if (commonQuestions5 == null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    commonQuestions5 = null;
                                                    if (commonQuestions5 == null) {
                                                    }
                                                } else if (Intrinsics.areEqual(orCreateKotlinClass5, reflectionFactory5.getOrCreateKotlinClass(BenefitsHub.Disclosures.class))) {
                                                    ImageResourcesKt imageResourcesKt35 = section12.Body;
                                                    if (imageResourcesKt35 != null) {
                                                        BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures5 = imageResourcesKt35 instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt35 : null;
                                                        if (benefitsHub$Section$Body_$Disclosures5 != null) {
                                                            disclosures4 = benefitsHub$Section$Body_$Disclosures5.value;
                                                            if (disclosures4 == null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    disclosures4 = null;
                                                    if (disclosures4 == null) {
                                                    }
                                                } else if (Intrinsics.areEqual(orCreateKotlinClass5, reflectionFactory5.getOrCreateKotlinClass(BenefitsHub.Insights.class))) {
                                                    ImageResourcesKt imageResourcesKt36 = section12.Body;
                                                    if (imageResourcesKt36 != null) {
                                                        BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights6 = imageResourcesKt36 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt36 : null;
                                                        if (benefitsHub$Section$Body_$Insights6 != null) {
                                                            insights4 = benefitsHub$Section$Body_$Insights6.value;
                                                            if (insights4 == null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    insights4 = null;
                                                    if (insights4 == null) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                            BenefitsHub.Section section13 = (BenefitsHub.Section) obj6;
                                            section13.getClass();
                                            String str11 = section13.heading;
                                            str11.getClass();
                                            it6 = list.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    obj7 = null;
                                                    break;
                                                }
                                                obj7 = it6.next();
                                                BenefitsHub.Section section14 = (BenefitsHub.Section) obj7;
                                                ReflectionFactory reflectionFactory6 = Reflection.factory;
                                                KClass orCreateKotlinClass6 = reflectionFactory6.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class);
                                                it11 = it6;
                                                if (Intrinsics.areEqual(orCreateKotlinClass6, reflectionFactory6.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class))) {
                                                    ImageResourcesKt imageResourcesKt37 = section14.Body;
                                                    if (imageResourcesKt37 != null) {
                                                        BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown7 = imageResourcesKt37 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt37 : null;
                                                        if (benefitsHub$Section$Body_$BenefitsBreakdown7 != null) {
                                                            benefitsBreakdown5 = benefitsHub$Section$Body_$BenefitsBreakdown7.value;
                                                            if (benefitsBreakdown5 == null) {
                                                                break;
                                                            }
                                                            it6 = it11;
                                                        }
                                                    }
                                                    benefitsBreakdown5 = null;
                                                    if (benefitsBreakdown5 == null) {
                                                    }
                                                } else if (Intrinsics.areEqual(orCreateKotlinClass6, reflectionFactory6.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class))) {
                                                    ImageResourcesKt imageResourcesKt38 = section14.Body;
                                                    if (imageResourcesKt38 != null) {
                                                        BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks7 = imageResourcesKt38 instanceof BenefitsHub$Section$Body_$DefaultPerks ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt38 : null;
                                                        if (benefitsHub$Section$Body_$DefaultPerks7 != null) {
                                                            defaultPerks3 = benefitsHub$Section$Body_$DefaultPerks7.value;
                                                            if (defaultPerks3 == null) {
                                                                break;
                                                            }
                                                            it6 = it11;
                                                        }
                                                    }
                                                    defaultPerks3 = null;
                                                    if (defaultPerks3 == null) {
                                                    }
                                                } else if (Intrinsics.areEqual(orCreateKotlinClass6, reflectionFactory6.getOrCreateKotlinClass(BenefitsHub.CallToActions.class))) {
                                                    ImageResourcesKt imageResourcesKt39 = section14.Body;
                                                    if (imageResourcesKt39 != null) {
                                                        BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions6 = imageResourcesKt39 instanceof BenefitsHub$Section$Body_$CallToActions ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt39 : null;
                                                        if (benefitsHub$Section$Body_$CallToActions6 != null) {
                                                            callToActions4 = benefitsHub$Section$Body_$CallToActions6.value;
                                                            if (callToActions4 == null) {
                                                                break;
                                                            }
                                                            it6 = it11;
                                                        }
                                                    }
                                                    callToActions4 = null;
                                                    if (callToActions4 == null) {
                                                    }
                                                } else if (Intrinsics.areEqual(orCreateKotlinClass6, reflectionFactory6.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class))) {
                                                    ImageResourcesKt imageResourcesKt40 = section14.Body;
                                                    if (imageResourcesKt40 != null) {
                                                        BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions6 = imageResourcesKt40 instanceof BenefitsHub$Section$Body_$CommonQuestions ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt40 : null;
                                                        if (benefitsHub$Section$Body_$CommonQuestions6 != null) {
                                                            commonQuestions4 = benefitsHub$Section$Body_$CommonQuestions6.value;
                                                            if (commonQuestions4 == null) {
                                                                break;
                                                            }
                                                            it6 = it11;
                                                        }
                                                    }
                                                    commonQuestions4 = null;
                                                    if (commonQuestions4 == null) {
                                                    }
                                                } else if (Intrinsics.areEqual(orCreateKotlinClass6, reflectionFactory6.getOrCreateKotlinClass(BenefitsHub.Disclosures.class))) {
                                                    ImageResourcesKt imageResourcesKt41 = section14.Body;
                                                    if (imageResourcesKt41 != null) {
                                                        BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures6 = imageResourcesKt41 instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt41 : null;
                                                        if (benefitsHub$Section$Body_$Disclosures6 != null) {
                                                            disclosures3 = benefitsHub$Section$Body_$Disclosures6.value;
                                                            if (disclosures3 == null) {
                                                                break;
                                                            }
                                                            it6 = it11;
                                                        }
                                                    }
                                                    disclosures3 = null;
                                                    if (disclosures3 == null) {
                                                    }
                                                } else {
                                                    if (Intrinsics.areEqual(orCreateKotlinClass6, reflectionFactory6.getOrCreateKotlinClass(BenefitsHub.Insights.class))) {
                                                        ImageResourcesKt imageResourcesKt42 = section14.Body;
                                                        if (imageResourcesKt42 != null) {
                                                            BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights7 = imageResourcesKt42 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt42 : null;
                                                            if (benefitsHub$Section$Body_$Insights7 != null) {
                                                                insights3 = benefitsHub$Section$Body_$Insights7.value;
                                                                if (insights3 == null) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        insights3 = null;
                                                        if (insights3 == null) {
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                    it6 = it11;
                                                }
                                            }
                                            section3 = (BenefitsHub.Section) obj7;
                                            if (section3 != null && (imageResourcesKt3 = section3.Body) != null) {
                                                BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions7 = !(imageResourcesKt3 instanceof BenefitsHub$Section$Body_$CommonQuestions) ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt3 : null;
                                                commonQuestions3 = benefitsHub$Section$Body_$CommonQuestions7 == null ? benefitsHub$Section$Body_$CommonQuestions7.value : null;
                                                if (commonQuestions3 != null) {
                                                    list5 = commonQuestions3.details;
                                                    list5.getClass();
                                                    List<BenefitsHub.CommonQuestions.QuestionAndAnswer> list10 = list5;
                                                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
                                                    for (BenefitsHub.CommonQuestions.QuestionAndAnswer questionAndAnswer : list10) {
                                                        String str12 = questionAndAnswer.question;
                                                        str12.getClass();
                                                        String str13 = questionAndAnswer.answer;
                                                        str13.getClass();
                                                        arrayList5.add(new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel.QuestionAndAnswer(str12, str13));
                                                    }
                                                    BenefitsHubViewModel.Loaded.CommonQuestionsViewModel commonQuestionsViewModel = new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel(str11, arrayList5);
                                                    it7 = list.iterator();
                                                    while (true) {
                                                        if (!it7.hasNext()) {
                                                            obj8 = null;
                                                            break;
                                                        }
                                                        obj8 = it7.next();
                                                        BenefitsHub.Section section15 = (BenefitsHub.Section) obj8;
                                                        ReflectionFactory reflectionFactory7 = Reflection.factory;
                                                        KClass orCreateKotlinClass7 = reflectionFactory7.getOrCreateKotlinClass(BenefitsHub.CallToActions.class);
                                                        it10 = it7;
                                                        if (Intrinsics.areEqual(orCreateKotlinClass7, reflectionFactory7.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class))) {
                                                            ImageResourcesKt imageResourcesKt43 = section15.Body;
                                                            if (imageResourcesKt43 != null) {
                                                                BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown8 = imageResourcesKt43 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt43 : null;
                                                                if (benefitsHub$Section$Body_$BenefitsBreakdown8 != null) {
                                                                    benefitsBreakdown4 = benefitsHub$Section$Body_$BenefitsBreakdown8.value;
                                                                    if (benefitsBreakdown4 == null) {
                                                                        break;
                                                                    }
                                                                    it7 = it10;
                                                                }
                                                            }
                                                            benefitsBreakdown4 = null;
                                                            if (benefitsBreakdown4 == null) {
                                                            }
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass7, reflectionFactory7.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class))) {
                                                            ImageResourcesKt imageResourcesKt44 = section15.Body;
                                                            if (imageResourcesKt44 != null) {
                                                                BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks8 = imageResourcesKt44 instanceof BenefitsHub$Section$Body_$DefaultPerks ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt44 : null;
                                                                if (benefitsHub$Section$Body_$DefaultPerks8 != null) {
                                                                    defaultPerks2 = benefitsHub$Section$Body_$DefaultPerks8.value;
                                                                    if (defaultPerks2 == null) {
                                                                        break;
                                                                    }
                                                                    it7 = it10;
                                                                }
                                                            }
                                                            defaultPerks2 = null;
                                                            if (defaultPerks2 == null) {
                                                            }
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass7, reflectionFactory7.getOrCreateKotlinClass(BenefitsHub.CallToActions.class))) {
                                                            ImageResourcesKt imageResourcesKt45 = section15.Body;
                                                            if (imageResourcesKt45 != null) {
                                                                BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions7 = imageResourcesKt45 instanceof BenefitsHub$Section$Body_$CallToActions ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt45 : null;
                                                                if (benefitsHub$Section$Body_$CallToActions7 != null) {
                                                                    callToActions3 = benefitsHub$Section$Body_$CallToActions7.value;
                                                                    if (callToActions3 == null) {
                                                                        break;
                                                                    }
                                                                    it7 = it10;
                                                                }
                                                            }
                                                            callToActions3 = null;
                                                            if (callToActions3 == null) {
                                                            }
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass7, reflectionFactory7.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class))) {
                                                            ImageResourcesKt imageResourcesKt46 = section15.Body;
                                                            if (imageResourcesKt46 != null) {
                                                                BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions8 = imageResourcesKt46 instanceof BenefitsHub$Section$Body_$CommonQuestions ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt46 : null;
                                                                if (benefitsHub$Section$Body_$CommonQuestions8 != null) {
                                                                    commonQuestions2 = benefitsHub$Section$Body_$CommonQuestions8.value;
                                                                    if (commonQuestions2 == null) {
                                                                        break;
                                                                    }
                                                                    it7 = it10;
                                                                }
                                                            }
                                                            commonQuestions2 = null;
                                                            if (commonQuestions2 == null) {
                                                            }
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass7, reflectionFactory7.getOrCreateKotlinClass(BenefitsHub.Disclosures.class))) {
                                                            ImageResourcesKt imageResourcesKt47 = section15.Body;
                                                            if (imageResourcesKt47 != null) {
                                                                BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures7 = imageResourcesKt47 instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt47 : null;
                                                                if (benefitsHub$Section$Body_$Disclosures7 != null) {
                                                                    disclosures2 = benefitsHub$Section$Body_$Disclosures7.value;
                                                                    if (disclosures2 == null) {
                                                                        break;
                                                                    }
                                                                    it7 = it10;
                                                                }
                                                            }
                                                            disclosures2 = null;
                                                            if (disclosures2 == null) {
                                                            }
                                                        } else {
                                                            if (Intrinsics.areEqual(orCreateKotlinClass7, reflectionFactory7.getOrCreateKotlinClass(BenefitsHub.Insights.class))) {
                                                                ImageResourcesKt imageResourcesKt48 = section15.Body;
                                                                if (imageResourcesKt48 != null) {
                                                                    BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights8 = imageResourcesKt48 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt48 : null;
                                                                    if (benefitsHub$Section$Body_$Insights8 != null) {
                                                                        insights2 = benefitsHub$Section$Body_$Insights8.value;
                                                                        if (insights2 == null) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                insights2 = null;
                                                                if (insights2 == null) {
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                            it7 = it10;
                                                        }
                                                    }
                                                    section4 = (BenefitsHub.Section) obj8;
                                                    if (section4 != null && (imageResourcesKt2 = section4.Body) != null) {
                                                        BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions8 = !(imageResourcesKt2 instanceof BenefitsHub$Section$Body_$CallToActions) ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt2 : null;
                                                        callToActions2 = benefitsHub$Section$Body_$CallToActions8 == null ? benefitsHub$Section$Body_$CallToActions8.value : null;
                                                        if (callToActions2 != null) {
                                                            buttonRow = callToActions2.details;
                                                            if (buttonRow == null) {
                                                                RowAction rowAction2 = buttonRow.row_action;
                                                                rowAction2.getClass();
                                                                RowAction.ID id = rowAction2.id;
                                                                id.getClass();
                                                                String str14 = buttonRow.text;
                                                                str14.getClass();
                                                                ButtonRow.Prominence prominence2 = buttonRow.prominence;
                                                                RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute2 = rowAction2.Action;
                                                                String str15 = rowAction$Action_$ClientRoute2 != null ? rowAction$Action_$ClientRoute2.value : null;
                                                                str15.getClass();
                                                                callToActionViewModel = new BenefitsHubViewModel.Loaded.CallToActionViewModel(id, str14, prominence2, str15);
                                                            } else {
                                                                callToActionViewModel = null;
                                                            }
                                                            List disclosures9 = LocalPosCheckInPresenter.getDisclosures(benefitsHub);
                                                            disclosures9.getClass();
                                                            List list11 = disclosures9;
                                                            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                                                            it8 = list11.iterator();
                                                            while (it8.hasNext()) {
                                                                BenefitsHub.Disclosures.Disclosure disclosure = (BenefitsHub.Disclosures.Disclosure) it8.next();
                                                                Iterator it17 = it8;
                                                                TintedIcon tintedIcon4 = disclosure.icon;
                                                                String str16 = disclosure.text;
                                                                str16.getClass();
                                                                arrayList6.add(new BenefitsHubViewModel.Loaded.Disclosure(tintedIcon4, str16));
                                                                it8 = it17;
                                                            }
                                                            mutableState2.setValue(new BenefitsHubViewModel.Loaded(pageHeaderViewModel, arrayList, benefitsViewModel, defaultPerksViewModel, commonQuestionsViewModel, callToActionViewModel, arrayList6));
                                                            BenefitsHub benefitsHub3 = getBankingBenefitsHubResponse3.benefits_hub;
                                                            benefitsHub3.getClass();
                                                            it9 = benefitsHub3.sections.iterator();
                                                            while (true) {
                                                                if (it9.hasNext()) {
                                                                    obj9 = null;
                                                                    break;
                                                                }
                                                                obj9 = it9.next();
                                                                BenefitsHub.Section section16 = (BenefitsHub.Section) obj9;
                                                                ReflectionFactory reflectionFactory8 = Reflection.factory;
                                                                KClass orCreateKotlinClass8 = reflectionFactory8.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class);
                                                                if (Intrinsics.areEqual(orCreateKotlinClass8, reflectionFactory8.getOrCreateKotlinClass(BenefitsHub.BenefitsBreakdown.class))) {
                                                                    ImageResourcesKt imageResourcesKt49 = section16.Body;
                                                                    if (imageResourcesKt49 != null) {
                                                                        BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown9 = imageResourcesKt49 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt49 : null;
                                                                        if (benefitsHub$Section$Body_$BenefitsBreakdown9 != null) {
                                                                            benefitsBreakdown3 = benefitsHub$Section$Body_$BenefitsBreakdown9.value;
                                                                            if (benefitsBreakdown3 == null) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    benefitsBreakdown3 = null;
                                                                    if (benefitsBreakdown3 == null) {
                                                                    }
                                                                } else if (Intrinsics.areEqual(orCreateKotlinClass8, reflectionFactory8.getOrCreateKotlinClass(BenefitsHub.DefaultPerks.class))) {
                                                                    ImageResourcesKt imageResourcesKt50 = section16.Body;
                                                                    if (imageResourcesKt50 != null) {
                                                                        BenefitsHub$Section$Body_$DefaultPerks benefitsHub$Section$Body_$DefaultPerks9 = imageResourcesKt50 instanceof BenefitsHub$Section$Body_$DefaultPerks ? (BenefitsHub$Section$Body_$DefaultPerks) imageResourcesKt50 : null;
                                                                        if (benefitsHub$Section$Body_$DefaultPerks9 != null) {
                                                                            defaultPerks = benefitsHub$Section$Body_$DefaultPerks9.value;
                                                                            if (defaultPerks == null) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    defaultPerks = null;
                                                                    if (defaultPerks == null) {
                                                                    }
                                                                } else if (Intrinsics.areEqual(orCreateKotlinClass8, reflectionFactory8.getOrCreateKotlinClass(BenefitsHub.CallToActions.class))) {
                                                                    ImageResourcesKt imageResourcesKt51 = section16.Body;
                                                                    if (imageResourcesKt51 != null) {
                                                                        BenefitsHub$Section$Body_$CallToActions benefitsHub$Section$Body_$CallToActions9 = imageResourcesKt51 instanceof BenefitsHub$Section$Body_$CallToActions ? (BenefitsHub$Section$Body_$CallToActions) imageResourcesKt51 : null;
                                                                        if (benefitsHub$Section$Body_$CallToActions9 != null) {
                                                                            callToActions = benefitsHub$Section$Body_$CallToActions9.value;
                                                                            if (callToActions == null) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    callToActions = null;
                                                                    if (callToActions == null) {
                                                                    }
                                                                } else if (Intrinsics.areEqual(orCreateKotlinClass8, reflectionFactory8.getOrCreateKotlinClass(BenefitsHub.CommonQuestions.class))) {
                                                                    ImageResourcesKt imageResourcesKt52 = section16.Body;
                                                                    if (imageResourcesKt52 != null) {
                                                                        BenefitsHub$Section$Body_$CommonQuestions benefitsHub$Section$Body_$CommonQuestions9 = imageResourcesKt52 instanceof BenefitsHub$Section$Body_$CommonQuestions ? (BenefitsHub$Section$Body_$CommonQuestions) imageResourcesKt52 : null;
                                                                        if (benefitsHub$Section$Body_$CommonQuestions9 != null) {
                                                                            commonQuestions = benefitsHub$Section$Body_$CommonQuestions9.value;
                                                                            if (commonQuestions == null) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    commonQuestions = null;
                                                                    if (commonQuestions == null) {
                                                                    }
                                                                } else if (Intrinsics.areEqual(orCreateKotlinClass8, reflectionFactory8.getOrCreateKotlinClass(BenefitsHub.Disclosures.class))) {
                                                                    ImageResourcesKt imageResourcesKt53 = section16.Body;
                                                                    if (imageResourcesKt53 != null) {
                                                                        BenefitsHub$Section$Body_$Disclosures benefitsHub$Section$Body_$Disclosures8 = imageResourcesKt53 instanceof BenefitsHub$Section$Body_$Disclosures ? (BenefitsHub$Section$Body_$Disclosures) imageResourcesKt53 : null;
                                                                        if (benefitsHub$Section$Body_$Disclosures8 != null) {
                                                                            disclosures = benefitsHub$Section$Body_$Disclosures8.value;
                                                                            if (disclosures == null) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    disclosures = null;
                                                                    if (disclosures == null) {
                                                                    }
                                                                } else if (Intrinsics.areEqual(orCreateKotlinClass8, reflectionFactory8.getOrCreateKotlinClass(BenefitsHub.Insights.class))) {
                                                                    ImageResourcesKt imageResourcesKt54 = section16.Body;
                                                                    if (imageResourcesKt54 != null) {
                                                                        BenefitsHub$Section$Body_$Insights benefitsHub$Section$Body_$Insights9 = imageResourcesKt54 instanceof BenefitsHub$Section$Body_$Insights ? (BenefitsHub$Section$Body_$Insights) imageResourcesKt54 : null;
                                                                        if (benefitsHub$Section$Body_$Insights9 != null) {
                                                                            insights = benefitsHub$Section$Body_$Insights9.value;
                                                                            if (insights == null) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    insights = null;
                                                                    if (insights == null) {
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                            }
                                                            section5 = (BenefitsHub.Section) obj9;
                                                            if (section5 != null && (imageResourcesKt = section5.Body) != null) {
                                                                BenefitsHub$Section$Body_$BenefitsBreakdown benefitsHub$Section$Body_$BenefitsBreakdown10 = !(imageResourcesKt instanceof BenefitsHub$Section$Body_$BenefitsBreakdown) ? (BenefitsHub$Section$Body_$BenefitsBreakdown) imageResourcesKt : null;
                                                                benefitsBreakdown2 = benefitsHub$Section$Body_$BenefitsBreakdown10 == null ? benefitsHub$Section$Body_$BenefitsBreakdown10.value : null;
                                                                if (benefitsBreakdown2 != null && (learnMore = benefitsBreakdown2.learn_more) != null) {
                                                                    benefitsExplanationScreen = learnMore.benefits_explanation_screen;
                                                                    if (benefitsExplanationScreen == null) {
                                                                        String str17 = benefitsExplanationScreen.title;
                                                                        str17.getClass();
                                                                        List<BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section> list12 = benefitsExplanationScreen.sections;
                                                                        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list12, 10));
                                                                        for (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section section17 : list12) {
                                                                            String str18 = section17.paragraph;
                                                                            str18.getClass();
                                                                            arrayList7.add(new Pair(str18, section17.list_items));
                                                                        }
                                                                        benefitsExplanationScreen2 = new BenefitsExplanationScreen(str17, arrayList7, benefitsExplanationScreen.footers);
                                                                    } else {
                                                                        benefitsExplanationScreen2 = null;
                                                                    }
                                                                    mutableState4.setValue(benefitsExplanationScreen2);
                                                                    apiResult = apiResult3;
                                                                }
                                                            }
                                                            benefitsExplanationScreen = null;
                                                            if (benefitsExplanationScreen == null) {
                                                            }
                                                            mutableState4.setValue(benefitsExplanationScreen2);
                                                            apiResult = apiResult3;
                                                        }
                                                    }
                                                    buttonRow = null;
                                                    if (buttonRow == null) {
                                                    }
                                                    List disclosures92 = LocalPosCheckInPresenter.getDisclosures(benefitsHub);
                                                    disclosures92.getClass();
                                                    List list112 = disclosures92;
                                                    ArrayList arrayList62 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list112, 10));
                                                    it8 = list112.iterator();
                                                    while (it8.hasNext()) {
                                                    }
                                                    mutableState2.setValue(new BenefitsHubViewModel.Loaded(pageHeaderViewModel, arrayList, benefitsViewModel, defaultPerksViewModel, commonQuestionsViewModel, callToActionViewModel, arrayList62));
                                                    BenefitsHub benefitsHub32 = getBankingBenefitsHubResponse3.benefits_hub;
                                                    benefitsHub32.getClass();
                                                    it9 = benefitsHub32.sections.iterator();
                                                    while (true) {
                                                        if (it9.hasNext()) {
                                                        }
                                                    }
                                                    section5 = (BenefitsHub.Section) obj9;
                                                    if (section5 != null) {
                                                        if (!(imageResourcesKt instanceof BenefitsHub$Section$Body_$BenefitsBreakdown)) {
                                                        }
                                                        if (benefitsHub$Section$Body_$BenefitsBreakdown10 == null) {
                                                        }
                                                        if (benefitsBreakdown2 != null) {
                                                            benefitsExplanationScreen = learnMore.benefits_explanation_screen;
                                                            if (benefitsExplanationScreen == null) {
                                                            }
                                                            mutableState4.setValue(benefitsExplanationScreen2);
                                                            apiResult = apiResult3;
                                                        }
                                                    }
                                                    benefitsExplanationScreen = null;
                                                    if (benefitsExplanationScreen == null) {
                                                    }
                                                    mutableState4.setValue(benefitsExplanationScreen2);
                                                    apiResult = apiResult3;
                                                }
                                            }
                                            list5 = null;
                                            list5.getClass();
                                            List<BenefitsHub.CommonQuestions.QuestionAndAnswer> list102 = list5;
                                            ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list102, 10));
                                            while (r1.hasNext()) {
                                            }
                                            BenefitsHubViewModel.Loaded.CommonQuestionsViewModel commonQuestionsViewModel2 = new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel(str11, arrayList52);
                                            it7 = list.iterator();
                                            while (true) {
                                                if (!it7.hasNext()) {
                                                }
                                                it7 = it10;
                                            }
                                            section4 = (BenefitsHub.Section) obj8;
                                            if (section4 != null) {
                                                if (!(imageResourcesKt2 instanceof BenefitsHub$Section$Body_$CallToActions)) {
                                                }
                                                if (benefitsHub$Section$Body_$CallToActions8 == null) {
                                                }
                                                if (callToActions2 != null) {
                                                }
                                            }
                                            buttonRow = null;
                                            if (buttonRow == null) {
                                            }
                                            List disclosures922 = LocalPosCheckInPresenter.getDisclosures(benefitsHub);
                                            disclosures922.getClass();
                                            List list1122 = disclosures922;
                                            ArrayList arrayList622 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list1122, 10));
                                            it8 = list1122.iterator();
                                            while (it8.hasNext()) {
                                            }
                                            mutableState2.setValue(new BenefitsHubViewModel.Loaded(pageHeaderViewModel, arrayList, benefitsViewModel, defaultPerksViewModel, commonQuestionsViewModel2, callToActionViewModel, arrayList622));
                                            BenefitsHub benefitsHub322 = getBankingBenefitsHubResponse3.benefits_hub;
                                            benefitsHub322.getClass();
                                            it9 = benefitsHub322.sections.iterator();
                                            while (true) {
                                                if (it9.hasNext()) {
                                                }
                                            }
                                            section5 = (BenefitsHub.Section) obj9;
                                            if (section5 != null) {
                                            }
                                            benefitsExplanationScreen = null;
                                            if (benefitsExplanationScreen == null) {
                                            }
                                            mutableState4.setValue(benefitsExplanationScreen2);
                                            apiResult = apiResult3;
                                        }
                                    }
                                    list4 = null;
                                    list4.getClass();
                                    List<TextRow> list92 = list4;
                                    ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list92, 10));
                                    while (r1.hasNext()) {
                                    }
                                    BenefitsHubViewModel.Loaded.DefaultPerksViewModel defaultPerksViewModel2 = new BenefitsHubViewModel.Loaded.DefaultPerksViewModel(str8, CollectionsKt.windowed(arrayList42, 2, 2, true));
                                    it5 = list.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                        }
                                    }
                                    BenefitsHub.Section section132 = (BenefitsHub.Section) obj6;
                                    section132.getClass();
                                    String str112 = section132.heading;
                                    str112.getClass();
                                    it6 = list.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                        }
                                        it6 = it11;
                                    }
                                    section3 = (BenefitsHub.Section) obj7;
                                    if (section3 != null) {
                                        if (!(imageResourcesKt3 instanceof BenefitsHub$Section$Body_$CommonQuestions)) {
                                        }
                                        if (benefitsHub$Section$Body_$CommonQuestions7 == null) {
                                        }
                                        if (commonQuestions3 != null) {
                                        }
                                    }
                                    list5 = null;
                                    list5.getClass();
                                    List<BenefitsHub.CommonQuestions.QuestionAndAnswer> list1022 = list5;
                                    ArrayList arrayList522 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list1022, 10));
                                    while (r1.hasNext()) {
                                    }
                                    BenefitsHubViewModel.Loaded.CommonQuestionsViewModel commonQuestionsViewModel22 = new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel(str112, arrayList522);
                                    it7 = list.iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                        }
                                        it7 = it10;
                                    }
                                    section4 = (BenefitsHub.Section) obj8;
                                    if (section4 != null) {
                                    }
                                    buttonRow = null;
                                    if (buttonRow == null) {
                                    }
                                    List disclosures9222 = LocalPosCheckInPresenter.getDisclosures(benefitsHub);
                                    disclosures9222.getClass();
                                    List list11222 = disclosures9222;
                                    ArrayList arrayList6222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11222, 10));
                                    it8 = list11222.iterator();
                                    while (it8.hasNext()) {
                                    }
                                    mutableState2.setValue(new BenefitsHubViewModel.Loaded(pageHeaderViewModel, arrayList, benefitsViewModel, defaultPerksViewModel2, commonQuestionsViewModel22, callToActionViewModel, arrayList6222));
                                    BenefitsHub benefitsHub3222 = getBankingBenefitsHubResponse3.benefits_hub;
                                    benefitsHub3222.getClass();
                                    it9 = benefitsHub3222.sections.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                        }
                                    }
                                    section5 = (BenefitsHub.Section) obj9;
                                    if (section5 != null) {
                                    }
                                    benefitsExplanationScreen = null;
                                    if (benefitsExplanationScreen == null) {
                                    }
                                    mutableState4.setValue(benefitsExplanationScreen2);
                                    apiResult = apiResult3;
                                }
                            }
                            benefitsBreakdown = null;
                            if (benefitsBreakdown != null) {
                            }
                            if (list3 == null) {
                            }
                            List list82 = list3;
                            ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list82, 10));
                            it2 = list82.iterator();
                            while (it2.hasNext()) {
                            }
                            BenefitsHubViewModel.Loaded.BenefitsViewModel benefitsViewModel2 = new BenefitsHubViewModel.Loaded.BenefitsViewModel(arrayList32, (benefitsBreakdown != null || (learnMore3 = benefitsBreakdown.learn_more) == null || (tintedLink2 = learnMore3.link) == null) ? null : tintedLink2.link_text, (benefitsBreakdown != null || (learnMore2 = benefitsBreakdown.learn_more) == null || (tintedLink = learnMore2.link) == null) ? null : tintedLink.tint_color);
                            it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                }
                            }
                            BenefitsHub.Section section102 = (BenefitsHub.Section) obj4;
                            section102.getClass();
                            String str82 = section102.heading;
                            str82.getClass();
                            it4 = list.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                }
                            }
                            section2 = (BenefitsHub.Section) obj5;
                            if (section2 != null) {
                                if (!(imageResourcesKt4 instanceof BenefitsHub$Section$Body_$DefaultPerks)) {
                                }
                                if (benefitsHub$Section$Body_$DefaultPerks5 == null) {
                                }
                                if (defaultPerks5 != null) {
                                }
                            }
                            list4 = null;
                            list4.getClass();
                            List<TextRow> list922 = list4;
                            ArrayList arrayList422 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list922, 10));
                            while (r1.hasNext()) {
                            }
                            BenefitsHubViewModel.Loaded.DefaultPerksViewModel defaultPerksViewModel22 = new BenefitsHubViewModel.Loaded.DefaultPerksViewModel(str82, CollectionsKt.windowed(arrayList422, 2, 2, true));
                            it5 = list.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                }
                            }
                            BenefitsHub.Section section1322 = (BenefitsHub.Section) obj6;
                            section1322.getClass();
                            String str1122 = section1322.heading;
                            str1122.getClass();
                            it6 = list.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                }
                                it6 = it11;
                            }
                            section3 = (BenefitsHub.Section) obj7;
                            if (section3 != null) {
                            }
                            list5 = null;
                            list5.getClass();
                            List<BenefitsHub.CommonQuestions.QuestionAndAnswer> list10222 = list5;
                            ArrayList arrayList5222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10222, 10));
                            while (r1.hasNext()) {
                            }
                            BenefitsHubViewModel.Loaded.CommonQuestionsViewModel commonQuestionsViewModel222 = new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel(str1122, arrayList5222);
                            it7 = list.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                }
                                it7 = it10;
                            }
                            section4 = (BenefitsHub.Section) obj8;
                            if (section4 != null) {
                            }
                            buttonRow = null;
                            if (buttonRow == null) {
                            }
                            List disclosures92222 = LocalPosCheckInPresenter.getDisclosures(benefitsHub);
                            disclosures92222.getClass();
                            List list112222 = disclosures92222;
                            ArrayList arrayList62222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list112222, 10));
                            it8 = list112222.iterator();
                            while (it8.hasNext()) {
                            }
                            mutableState2.setValue(new BenefitsHubViewModel.Loaded(pageHeaderViewModel, arrayList, benefitsViewModel2, defaultPerksViewModel22, commonQuestionsViewModel222, callToActionViewModel, arrayList62222));
                            BenefitsHub benefitsHub32222 = getBankingBenefitsHubResponse3.benefits_hub;
                            benefitsHub32222.getClass();
                            it9 = benefitsHub32222.sections.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                }
                            }
                            section5 = (BenefitsHub.Section) obj9;
                            if (section5 != null) {
                            }
                            benefitsExplanationScreen = null;
                            if (benefitsExplanationScreen == null) {
                            }
                            mutableState4.setValue(benefitsExplanationScreen2);
                            apiResult = apiResult3;
                        }
                    }
                    list2 = null;
                    if (list2 == null) {
                    }
                    MutableState mutableState42 = mutableState3;
                    ApiResult apiResult32 = apiResult;
                    localPosCheckInPresenter = localPosCheckInPresenter3;
                    GetBankingBenefitsHubResponse getBankingBenefitsHubResponse32 = getBankingBenefitsHubResponse2;
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    section = (BenefitsHub.Section) obj3;
                    if (section != null) {
                        if (!(imageResourcesKt5 instanceof BenefitsHub$Section$Body_$BenefitsBreakdown)) {
                        }
                        if (benefitsHub$Section$Body_$BenefitsBreakdown != null) {
                        }
                    }
                    benefitsBreakdown = null;
                    if (benefitsBreakdown != null) {
                    }
                    if (list3 == null) {
                    }
                    List list822 = list3;
                    ArrayList arrayList322 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list822, 10));
                    it2 = list822.iterator();
                    while (it2.hasNext()) {
                    }
                    BenefitsHubViewModel.Loaded.BenefitsViewModel benefitsViewModel22 = new BenefitsHubViewModel.Loaded.BenefitsViewModel(arrayList322, (benefitsBreakdown != null || (learnMore3 = benefitsBreakdown.learn_more) == null || (tintedLink2 = learnMore3.link) == null) ? null : tintedLink2.link_text, (benefitsBreakdown != null || (learnMore2 = benefitsBreakdown.learn_more) == null || (tintedLink = learnMore2.link) == null) ? null : tintedLink.tint_color);
                    it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                        }
                    }
                    BenefitsHub.Section section1022 = (BenefitsHub.Section) obj4;
                    section1022.getClass();
                    String str822 = section1022.heading;
                    str822.getClass();
                    it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                        }
                    }
                    section2 = (BenefitsHub.Section) obj5;
                    if (section2 != null) {
                    }
                    list4 = null;
                    list4.getClass();
                    List<TextRow> list9222 = list4;
                    ArrayList arrayList4222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9222, 10));
                    while (r1.hasNext()) {
                    }
                    BenefitsHubViewModel.Loaded.DefaultPerksViewModel defaultPerksViewModel222 = new BenefitsHubViewModel.Loaded.DefaultPerksViewModel(str822, CollectionsKt.windowed(arrayList4222, 2, 2, true));
                    it5 = list.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                        }
                    }
                    BenefitsHub.Section section13222 = (BenefitsHub.Section) obj6;
                    section13222.getClass();
                    String str11222 = section13222.heading;
                    str11222.getClass();
                    it6 = list.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                        }
                        it6 = it11;
                    }
                    section3 = (BenefitsHub.Section) obj7;
                    if (section3 != null) {
                    }
                    list5 = null;
                    list5.getClass();
                    List<BenefitsHub.CommonQuestions.QuestionAndAnswer> list102222 = list5;
                    ArrayList arrayList52222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list102222, 10));
                    while (r1.hasNext()) {
                    }
                    BenefitsHubViewModel.Loaded.CommonQuestionsViewModel commonQuestionsViewModel2222 = new BenefitsHubViewModel.Loaded.CommonQuestionsViewModel(str11222, arrayList52222);
                    it7 = list.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                        }
                        it7 = it10;
                    }
                    section4 = (BenefitsHub.Section) obj8;
                    if (section4 != null) {
                    }
                    buttonRow = null;
                    if (buttonRow == null) {
                    }
                    List disclosures922222 = LocalPosCheckInPresenter.getDisclosures(benefitsHub);
                    disclosures922222.getClass();
                    List list1122222 = disclosures922222;
                    ArrayList arrayList622222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list1122222, 10));
                    it8 = list1122222.iterator();
                    while (it8.hasNext()) {
                    }
                    mutableState2.setValue(new BenefitsHubViewModel.Loaded(pageHeaderViewModel, arrayList, benefitsViewModel22, defaultPerksViewModel222, commonQuestionsViewModel2222, callToActionViewModel, arrayList622222));
                    BenefitsHub benefitsHub322222 = getBankingBenefitsHubResponse32.benefits_hub;
                    benefitsHub322222.getClass();
                    it9 = benefitsHub322222.sections.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                        }
                    }
                    section5 = (BenefitsHub.Section) obj9;
                    if (section5 != null) {
                    }
                    benefitsExplanationScreen = null;
                    if (benefitsExplanationScreen == null) {
                    }
                    mutableState42.setValue(benefitsExplanationScreen2);
                    apiResult = apiResult32;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    LocalPosCheckInPresenter localPosCheckInPresenter4 = localPosCheckInPresenter;
                    AndroidStringManager androidStringManager = (AndroidStringManager) localPosCheckInPresenter4.stringManager;
                    mutableState2.setValue(new BenefitsHubViewModel.Error(androidStringManager.get(R.string.benefits_hub_error_title), androidStringManager.get(R.string.benefits_hub_error_subtitle), androidStringManager.get(R.string.benefits_hub_error_cta), BundleKt.isRetryable((ApiResult.Failure) apiResult)));
                    ((Analytics) localPosCheckInPresenter4.store).track(new BenefitsHubViewError(), null);
                }
                return Unit.INSTANCE;
            }
        }
        benefitsHubPresenter$models$1$1$2$emit$1 = new BenefitsHubPresenter$models$1$1$2$emit$1(this, continuation);
        Object obj102 = benefitsHubPresenter$models$1$1$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsHubPresenter$models$1$1$2$emit$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj102;
        MutableState mutableState32 = (MutableState) this.$anim;
        if (apiResult instanceof ApiResult.Success) {
        }
        if (apiResult instanceof ApiResult.Failure) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r5.invoke(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r7.emit(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$biometrics$AndroidBiometricsStore$read$$inlined$transform$1$1(Object obj, Continuation continuation) {
        AndroidBiometricsStore$read$$inlined$transform$1$1$1 androidBiometricsStore$read$$inlined$transform$1$1$1;
        int i;
        if (continuation instanceof AndroidBiometricsStore$read$$inlined$transform$1$1$1) {
            androidBiometricsStore$read$$inlined$transform$1$1$1 = (AndroidBiometricsStore$read$$inlined$transform$1$1$1) continuation;
            int i2 = androidBiometricsStore$read$$inlined$transform$1$1$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidBiometricsStore$read$$inlined$transform$1$1$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = androidBiometricsStore$read$$inlined$transform$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidBiometricsStore$read$$inlined$transform$1$1$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.$targetValue;
                    Biometrics$Result biometrics$Result = (Biometrics$Result) obj;
                    if (biometrics$Result instanceof Biometrics$Result.Failure) {
                        ((Ref$IntRef) this.this$0).element++;
                        Function1 function1 = (Function1) this.$anim;
                        androidBiometricsStore$read$$inlined$transform$1$1$1.label = 1;
                    } else {
                        androidBiometricsStore$read$$inlined$transform$1$1$1.label = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        androidBiometricsStore$read$$inlined$transform$1$1$1 = new AndroidBiometricsStore$read$$inlined$transform$1$1$1(this, continuation);
        Object obj22 = androidBiometricsStore$read$$inlined$transform$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidBiometricsStore$read$$inlined$transform$1$1$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r8.emit(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$bitcoin$graph$real$RealBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2(Object obj, Continuation continuation) {
        RealBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1 realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1;
        Object obj2;
        int i;
        FlowCollector flowCollector;
        int i2;
        if (continuation instanceof RealBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1) {
            realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1 = (RealBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1) continuation;
            int i3 = realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.label = i3 - PKIFailureInfo.systemUnavail;
                obj2 = realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.$targetValue;
                    RealBitcoinGraphModelCache realBitcoinGraphModelCache = ((RealBitcoinGraphModelProvider) this.this$0).bitcoinGraphModelCache;
                    HistoricalRange historicalRange = (HistoricalRange) this.$anim;
                    realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.L$3 = flowCollector2;
                    realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.I$0 = 0;
                    realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.label = 1;
                    Object processAndCache = realBitcoinGraphModelCache.processAndCache(historicalRange, (PolledData) obj, realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1);
                    if (processAndCache != coroutineSingletons) {
                        flowCollector = flowCollector2;
                        obj2 = processAndCache;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.I$0;
                flowCollector = realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.L$3;
                SafeTrace.throwOnFailure(obj2);
                if (obj2 != null) {
                    realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.L$3 = null;
                    realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.I$0 = i2;
                    realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.label = 2;
                }
                return Unit.INSTANCE;
            }
        }
        realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1 = new RealBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1(this, continuation);
        obj2 = realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$bitcoin$presenters$MoveBitcoinPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MoveBitcoinPresenter.State state;
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.$targetValue;
        MoveBitcoinPresenter moveBitcoinPresenter = (MoveBitcoinPresenter) this.this$0;
        Analytics analytics = moveBitcoinPresenter.analytics;
        MoveBitcoinScreen moveBitcoinScreen = moveBitcoinPresenter.args;
        MoveBitcoinEvent moveBitcoinEvent = (MoveBitcoinEvent) obj;
        MutableState mutableState = (MutableState) this.$anim;
        if (moveBitcoinEvent instanceof MoveBitcoinEvent.SwitchCurrency) {
            StateFlowKt.emitOrThrow(mutableSharedFlow, new BitcoinKeypadEvent.SwitchCurrency(BitcoinAmountEntrySource.BITCOIN_SEND_AMOUNT));
            state = (MoveBitcoinPresenter.State) mutableState.getValue();
        } else if (moveBitcoinEvent instanceof MoveBitcoinEvent.Withdraw) {
            StateFlowKt.emitOrThrow(mutableSharedFlow, new BitcoinKeypadEvent.Transfer(moveBitcoinScreen.origin));
            state = (MoveBitcoinPresenter.State) mutableState.getValue();
        } else if (moveBitcoinEvent instanceof MoveBitcoinEvent.AmountChanged) {
            StateFlowKt.emitOrThrow(mutableSharedFlow, new BitcoinKeypadEvent.AmountChanged(((MoveBitcoinEvent.AmountChanged) moveBitcoinEvent).rawAmount));
            state = (MoveBitcoinPresenter.State) mutableState.getValue();
        } else if (moveBitcoinEvent instanceof MoveBitcoinEvent.ScanQrCode) {
            moveBitcoinPresenter.bitcoinInboundNavigator.showCryptoScanner(CryptoScannerSource.BITCOIN_AMOUNT_ENTRY, moveBitcoinScreen.origin, ((MoveBitcoinPresenter.State) mutableState.getValue()).bitcoinKeypadState.getBitcoinAmount());
            state = (MoveBitcoinPresenter.State) mutableState.getValue();
        } else if (Intrinsics.areEqual(moveBitcoinEvent, MoveBitcoinEvent.ClosePressed.INSTANCE)) {
            analytics.track(new CryptoSendClose(), null);
            moveBitcoinPresenter.navigator.goTo(Back.INSTANCE);
            state = (MoveBitcoinPresenter.State) mutableState.getValue();
        } else {
            if (!Intrinsics.areEqual(moveBitcoinEvent, MoveBitcoinEvent.MaxSend.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            analytics.track(new CryptoSendSetMaxAmount(), null);
            StateFlowKt.emitOrThrow(mutableSharedFlow, BitcoinKeypadEvent.SetMaxAmount.INSTANCE);
            state = (MoveBitcoinPresenter.State) mutableState.getValue();
        }
        mutableState.setValue(state);
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$bitcoin$presenters$WalletAddressOptionsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.this$0;
        PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.$targetValue;
        WalletAddressOptionsViewEvent walletAddressOptionsViewEvent = (WalletAddressOptionsViewEvent) obj;
        if (Intrinsics.areEqual(walletAddressOptionsViewEvent, WalletAddressOptionsViewEvent.CopyAddress.INSTANCE)) {
            CryptoAddress$BitcoinAddress cryptoAddress$BitcoinAddress = (CryptoAddress$BitcoinAddress) mutableState.getValue();
            if (cryptoAddress$BitcoinAddress != null) {
                ((RealClipboardManager) poolsListPresenter.repository).copy("Cash BTC Wallet Address", cryptoAddress$BitcoinAddress.address);
            }
            ((AndroidAccessibilityManager) poolsListPresenter.moneyFormatter).announceForAccessibility(((AndroidStringManager) poolsListPresenter.stringManager).get(R.string.address_copied_announce));
            ((Analytics) poolsListPresenter.analytics).track(new CryptoDepositCopy(CryptoDepositCopy.CopyContentType.BITCOIN_ADDRESS, CryptoDepositCopy.Source.WALLET_WIDGET), null);
            ((MutableState) this.$anim).setValue(Boolean.TRUE);
        } else if (Intrinsics.areEqual(walletAddressOptionsViewEvent, WalletAddressOptionsViewEvent.ShareAddress.INSTANCE)) {
            CryptoAddress$BitcoinAddress cryptoAddress$BitcoinAddress2 = (CryptoAddress$BitcoinAddress) mutableState.getValue();
            if (cryptoAddress$BitcoinAddress2 != null) {
                ((IntentLauncher) poolsListPresenter.sessionManager).shareText(cryptoAddress$BitcoinAddress2.address, null, null);
            }
        } else {
            if (!Intrinsics.areEqual(walletAddressOptionsViewEvent, WalletAddressOptionsViewEvent.Close.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ((BetterNavigator.ScreenNavigator) poolsListPresenter.navigator).goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04c9, code lost:
    
        if (r6.emit(r7, r2) == r1) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03ec, code lost:
    
        if (r0 != r1) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03bc, code lost:
    
        if (com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository.access$emitCreditLineStateFromResponse(r7, r6, r0, r14, r2) == r1) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03cc, code lost:
    
        if (com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository.access$emitCreditLineStateFromResponse(r7, r6, r0, r14, r2) == r1) goto L209;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x09d0  */
    /* JADX WARN: Type inference failed for: r1v96, types: [com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v54, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v55, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28, types: [com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocalPOSCheckIn localPOSCheckIn;
        boolean z;
        LocalClientEducationalSheetInteraction.UserAction userAction;
        AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1 accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1;
        int i;
        Object obj2;
        ?? r2;
        List<Reaction> list;
        List<AfterpayAppletAnalyticsEventsSpec> impressionEvent;
        List list2;
        List list3;
        List analyticsTapEvents;
        RealAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1 realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1;
        FlowCollector flowCollector;
        int i2;
        FlowCollector flowCollector2;
        List list4;
        Object obj3;
        boolean z2;
        List list5;
        CashSuggestClientService cashSuggestClientService;
        int i3;
        boolean z3;
        int i4;
        FlowCollector flowCollector3;
        ApiResult apiResult;
        ApiResult apiResult2;
        FlowCollector flowCollector4;
        AfterpayAppletResponse afterpayAppletResponse;
        int i5;
        int i6;
        ApiResult apiResult3;
        FlowCollector flowCollector5;
        List analyticsAppletTappedEvent;
        GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog;
        int i7 = this.$r8$classId;
        int i8 = 6;
        int i9 = 0;
        int i10 = 7;
        Back back = Back.INSTANCE;
        int i11 = 1;
        Object obj4 = this.$anim;
        Object obj5 = this.$targetValue;
        Object obj6 = this.this$0;
        ?? r4 = 0;
        ?? r42 = 0;
        ?? r43 = 0;
        ?? r44 = 0;
        switch (i7) {
            case 0:
                return emit((Map) obj, continuation);
            case 1:
                Interaction interaction = (Interaction) obj;
                ArrayList arrayList = (ArrayList) obj5;
                if (interaction instanceof HoverInteraction$Enter) {
                    arrayList.add(interaction);
                } else if (interaction instanceof HoverInteraction$Exit) {
                    arrayList.remove(((HoverInteraction$Exit) interaction).enter);
                } else if (interaction instanceof FocusInteraction$Focus) {
                    arrayList.add(interaction);
                } else if (interaction instanceof FocusInteraction$Unfocus) {
                    arrayList.remove(((FocusInteraction$Unfocus) interaction).focus);
                } else if (interaction instanceof PressInteraction.Press) {
                    arrayList.add(interaction);
                } else if (interaction instanceof PressInteraction.Release) {
                    arrayList.remove(((PressInteraction.Release) interaction).press);
                } else if (interaction instanceof PressInteraction.Cancel) {
                    arrayList.remove(((PressInteraction.Cancel) interaction).press);
                }
                JobKt.launch$default((CoroutineScope) obj6, null, null, new PageFetcher$flow$1((FloatingActionButtonElevationAnimatable) obj4, (Interaction) CollectionsKt.lastOrNull((List) arrayList), null, i8), 3);
                return Unit.INSTANCE;
            case 2:
                BackEventCompat backEventCompat = (BackEventCompat) obj;
                if (((List) ((MutableState) obj5).getValue()).size() > 1) {
                    ((MutableState) obj6).setValue(Boolean.TRUE);
                    ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj4)).setFloatValue(backEventCompat.progress);
                }
                return Unit.INSTANCE;
            case 3:
                MarketingMessageOfferDetails marketingMessageOfferDetails = (MarketingMessageOfferDetails) obj5;
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj6;
                Analytics analytics = (Analytics) cardStudioPresenter.analytics;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
                LocalMarketingMessageScreen localMarketingMessageScreen = (LocalMarketingMessageScreen) cardStudioPresenter.cardStudioQueries;
                MarketingMessageViewEvent marketingMessageViewEvent = (MarketingMessageViewEvent) obj;
                if (Intrinsics.areEqual(marketingMessageViewEvent, MarketingMessageViewEvent.CtaOnClick.INSTANCE)) {
                    screenNavigator.goTo(back);
                    if (((MarketingMessageViewModel.OfferPreview) obj4) == null || marketingMessageOfferDetails == null) {
                        MarketingMessageData marketingMessageData = localMarketingMessageScreen.marketingMessage;
                        analytics.track(new LocalMarketingBuyerMarketingCampaignCloseMessage(marketingMessageData.brandSpot.brandToken, marketingMessageData.messageToken, localMarketingMessageScreen.eventLocation), null);
                        screenNavigator.goTo(new LocalBrandProfileScreen(localMarketingMessageScreen.marketingMessage.brandSpot, (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                    } else {
                        MarketingMessageData marketingMessageData2 = localMarketingMessageScreen.marketingMessage;
                        analytics.track(new LocalMarketingBuyerMarketingCampaignRedeemMessage(marketingMessageData2.brandSpot.brandToken, marketingMessageData2.messageToken, marketingMessageOfferDetails.offerToken, localMarketingMessageScreen.eventLocation), null);
                        screenNavigator.goTo(new LocalBrandProfileScreen(localMarketingMessageScreen.marketingMessage.brandSpot, (AttributionKey) null, marketingMessageOfferDetails, (String) null, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE));
                    }
                } else if (Intrinsics.areEqual(marketingMessageViewEvent, MarketingMessageViewEvent.DismissOnClick.INSTANCE)) {
                    MarketingMessageData marketingMessageData3 = localMarketingMessageScreen.marketingMessage;
                    analytics.track(new LocalMarketingBuyerMarketingCampaignCloseMessage(marketingMessageData3.brandSpot.brandToken, marketingMessageData3.messageToken, localMarketingMessageScreen.eventLocation), null);
                    screenNavigator.goTo(back);
                } else if (Intrinsics.areEqual(marketingMessageViewEvent, MarketingMessageViewEvent.TermsOnClick.INSTANCE)) {
                    String str = marketingMessageOfferDetails != null ? marketingMessageOfferDetails.termsUrl : null;
                    if (str != null) {
                        ((RealLocalLauncher) cardStudioPresenter.appConfig).openWeb(screenNavigator, str);
                    }
                } else {
                    if (!Intrinsics.areEqual(marketingMessageViewEvent, MarketingMessageViewEvent.OfferSheetOpened.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (marketingMessageOfferDetails != null) {
                        MarketingMessageData marketingMessageData4 = localMarketingMessageScreen.marketingMessage;
                        analytics.track(new LocalMarketingBuyerMarketingCampaignViewTermsOfService(marketingMessageData4.brandSpot.brandToken, marketingMessageData4.messageToken, marketingMessageOfferDetails.offerToken, localMarketingMessageScreen.eventLocation), null);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                LocalPosLocalCashRedemptionPresenter localPosLocalCashRedemptionPresenter = (LocalPosLocalCashRedemptionPresenter) obj6;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                LocalPosLocalCashRedemptionViewEvent localPosLocalCashRedemptionViewEvent = (LocalPosLocalCashRedemptionViewEvent) obj;
                if (localPosLocalCashRedemptionViewEvent instanceof LocalPosLocalCashRedemptionViewEvent.ConfirmClicked) {
                    Analytics analytics2 = localPosLocalCashRedemptionPresenter.analytics;
                    LocalClientInStoreRedemptionTap.InStoreRedemptionElement inStoreRedemptionElement = LocalClientInStoreRedemptionTap.InStoreRedemptionElement.DoneButton;
                    analytics2.track(new LocalClientInStoreRedemptionTap(), null);
                    localPosLocalCashRedemptionPresenter.navigator.goTo(LocalTabScreen.INSTANCE);
                } else {
                    if (!(localPosLocalCashRedemptionViewEvent instanceof LocalPosLocalCashRedemptionViewEvent.UnlinkClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (localPosLocalCashRedemptionPresenter.canAbandonCheckIn && (localPOSCheckIn = (LocalPOSCheckIn) ((State) obj4).getValue()) != null) {
                        JobKt.launch$default(coroutineScope, null, null, new ZiplineLoader$ModuleJob$run$3(localPosLocalCashRedemptionPresenter, localPOSCheckIn, null, 17), 3);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj5;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) endAppLockPresenter.accountOutboundNavigator;
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj6;
                CurbsidePickupCarViewEvent curbsidePickupCarViewEvent = (CurbsidePickupCarViewEvent) obj;
                if (curbsidePickupCarViewEvent instanceof CurbsidePickupCarViewEvent.ColorSelected) {
                    mutableState2.setValue(((CurbsidePickupCarViewEvent.ColorSelected) curbsidePickupCarViewEvent).option);
                } else if (curbsidePickupCarViewEvent instanceof CurbsidePickupCarViewEvent.TypeSelected) {
                    mutableState.setValue(((CurbsidePickupCarViewEvent.TypeSelected) curbsidePickupCarViewEvent).option);
                } else if (curbsidePickupCarViewEvent instanceof CurbsidePickupCarViewEvent.Confirm) {
                    AskedQuestion askedQuestion = ((LocalCurbsidePickupCarScreen) endAppLockPresenter.appLockState).question;
                    VehicleColorOption vehicleColorOption = (VehicleColorOption) mutableState2.getValue();
                    String str2 = vehicleColorOption != null ? vehicleColorOption.label : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    VehicleTypeOption vehicleTypeOption = (VehicleTypeOption) mutableState.getValue();
                    String str3 = vehicleTypeOption != null ? vehicleTypeOption.label : null;
                    screenNavigator2.giveAnswer(askedQuestion, new VehicleDescription(str2, str3 != null ? str3 : "", ((CurbsidePickupCarViewEvent.Confirm) curbsidePickupCarViewEvent).note));
                } else {
                    if (!(curbsidePickupCarViewEvent instanceof CurbsidePickupCarViewEvent.Exit)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.goTo(back);
                }
                return Unit.INSTANCE;
            case 6:
                EducationalSheetPresenter educationalSheetPresenter = (EducationalSheetPresenter) obj6;
                Navigator navigator = educationalSheetPresenter.navigator;
                String str4 = educationalSheetPresenter.shortlinkKey;
                LocalEducationalSheet localEducationalSheet = educationalSheetPresenter.screen;
                SessionManager sessionManager = educationalSheetPresenter.sessionManager;
                Analytics analytics3 = educationalSheetPresenter.analytics;
                EducationalSheetEvent educationalSheetEvent = (EducationalSheetEvent) obj;
                EducationalSheetModel educationalSheetModel = (EducationalSheetModel) ((EducationalSheetModelList) obj5).sheets.get(educationalSheetEvent.getSheetIndex());
                boolean z4 = educationalSheetEvent instanceof EducationalSheetEvent.SwipeToSeeMoreTap;
                if (!z4) {
                    if (educationalSheetEvent instanceof EducationalSheetEvent.ButtonTap) {
                        String str5 = educationalSheetPresenter.sheetToken;
                        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(sessionManager);
                        EducationalSheetEvent.ButtonTap buttonTap = (EducationalSheetEvent.ButtonTap) educationalSheetEvent;
                        long j = buttonTap.sheetIndex;
                        String str6 = localEducationalSheet.flowToken;
                        EducationalButtonAction educationalButtonAction = buttonTap.action;
                        if (educationalButtonAction instanceof EducationalButtonAction.ClientRoute) {
                            userAction = LocalClientEducationalSheetInteraction.UserAction.ClientRoute;
                        } else if (educationalButtonAction instanceof EducationalButtonAction.Shortlink) {
                            userAction = LocalClientEducationalSheetInteraction.UserAction.ShortLink;
                        } else if (educationalButtonAction instanceof EducationalButtonAction.Dismiss) {
                            userAction = LocalClientEducationalSheetInteraction.UserAction.Dismiss;
                        } else {
                            if (!(educationalButtonAction instanceof EducationalButtonAction.Paginate)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            userAction = LocalClientEducationalSheetInteraction.UserAction.NextPage;
                        }
                        analytics3.track(new LocalClientEducationalSheetInteraction(str5, activeAccountTokenOrNull, new Long(j), userAction, educationalSheetModel.primaryButton.label, str6, str4 == null ? null : str4, educationalSheetPresenter.nextShortlinkFlowState), null);
                    } else if (educationalSheetEvent instanceof EducationalSheetEvent.OnUrlClick) {
                        String str7 = educationalSheetPresenter.sheetToken;
                        String activeAccountTokenOrNull2 = PlatformKt.activeAccountTokenOrNull(sessionManager);
                        analytics3.track(new LocalClientEducationalSheetInteraction(str7, activeAccountTokenOrNull2 == null ? "Not logged" : activeAccountTokenOrNull2, new Long(((EducationalSheetEvent.OnUrlClick) educationalSheetEvent).sheetIndex), LocalClientEducationalSheetInteraction.UserAction.Exit, educationalSheetModel.primaryButton.label, localEducationalSheet.flowToken, str4 == null ? null : str4, educationalSheetPresenter.nextShortlinkFlowState), null);
                    } else if (educationalSheetEvent instanceof EducationalSheetEvent.SheetHasBeenExpanded) {
                        String str8 = educationalSheetPresenter.sheetToken;
                        String activeAccountTokenOrNull3 = PlatformKt.activeAccountTokenOrNull(sessionManager);
                        analytics3.track(new LocalClientEducationalSheetInteraction(str8, activeAccountTokenOrNull3 == null ? "Not logged" : activeAccountTokenOrNull3, new Long(0L), LocalClientEducationalSheetInteraction.UserAction.SwipeUp, educationalSheetModel.primaryButton.label, localEducationalSheet.flowToken, str4 == null ? null : str4, educationalSheetPresenter.nextShortlinkFlowState), null);
                    } else if (educationalSheetEvent instanceof EducationalSheetEvent.PageSeen) {
                        String str9 = educationalSheetPresenter.sheetToken;
                        String activeAccountTokenOrNull4 = PlatformKt.activeAccountTokenOrNull(sessionManager);
                        if (activeAccountTokenOrNull4 == null) {
                            activeAccountTokenOrNull4 = "Not logged";
                        }
                        z = z4;
                        long j2 = ((EducationalSheetEvent.PageSeen) educationalSheetEvent).sheetIndex;
                        analytics3.track(new LocalClientEducationalSheetViewPage(str9, activeAccountTokenOrNull4, localEducationalSheet.flowToken, new Long(j2)), null);
                        Iterator it = CollectionsKt.plus((Iterable) educationalSheetModel.collapsedContents, (Collection) educationalSheetModel.visibleContents).iterator();
                        while (it.hasNext()) {
                            EducationalSheetModel.Content content = (EducationalSheetModel.Content) it.next();
                            if (content.getAnalyticsId() != null) {
                                String str10 = educationalSheetPresenter.sheetToken;
                                String activeAccountTokenOrNull5 = PlatformKt.activeAccountTokenOrNull(sessionManager);
                                String str11 = activeAccountTokenOrNull5 == null ? "Not logged" : activeAccountTokenOrNull5;
                                String str12 = localEducationalSheet.flowToken;
                                String analyticsId = content.getAnalyticsId();
                                analyticsId.getClass();
                                analytics3.track(new LocalClientEducationalSheetViewItem(new Long(j2), str10, str11, analyticsId, str12), null);
                            }
                        }
                    } else {
                        z = z4;
                        if (!(educationalSheetEvent instanceof EducationalSheetEvent.SheetDismissed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                    if (!z) {
                        if (educationalSheetEvent instanceof EducationalSheetEvent.ButtonTap) {
                            educationalSheetPresenter.handleAction(((EducationalSheetEvent.ButtonTap) educationalSheetEvent).action);
                        } else if (educationalSheetEvent instanceof EducationalSheetEvent.OnUrlClick) {
                            educationalSheetPresenter.launcher.openWeb(navigator, ((EducationalSheetEvent.OnUrlClick) educationalSheetEvent).url);
                        } else if (educationalSheetEvent instanceof EducationalSheetEvent.SheetHasBeenExpanded) {
                            ((MutableState) obj4).setValue(Boolean.TRUE);
                        } else if (!(educationalSheetEvent instanceof EducationalSheetEvent.PageSeen)) {
                            if (!(educationalSheetEvent instanceof EducationalSheetEvent.SheetDismissed)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            EducationalButtonAction educationalButtonAction2 = educationalSheetModel.closeButtonAction;
                            if (educationalButtonAction2 != null) {
                                educationalSheetPresenter.handleAction(educationalButtonAction2);
                            } else {
                                navigator.goTo(back);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                String str13 = educationalSheetPresenter.sheetToken;
                String activeAccountTokenOrNull6 = PlatformKt.activeAccountTokenOrNull(sessionManager);
                analytics3.track(new LocalClientEducationalSheetInteraction(str13, activeAccountTokenOrNull6 == null ? "Not logged" : activeAccountTokenOrNull6, new Long(0L), LocalClientEducationalSheetInteraction.UserAction.SwipeUp, educationalSheetModel.primaryButton.label, localEducationalSheet.flowToken, str4 == null ? null : str4, educationalSheetPresenter.nextShortlinkFlowState), null);
                z = z4;
                if (!z) {
                }
                return Unit.INSTANCE;
            case 7:
                String str14 = (String) obj6;
                PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) obj5;
                FlowStarter flowStarter = (FlowStarter) paymentLoadingPresenter.flowStarter;
                RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) paymentLoadingPresenter.featureFlagManager;
                AccountSwitcherScreen accountSwitcherScreen = (AccountSwitcherScreen) paymentLoadingPresenter.paymentToken;
                Analytics analytics4 = (Analytics) paymentLoadingPresenter.analytics;
                BetterNavigator.ScreenNavigator screenNavigator3 = paymentLoadingPresenter.navigator;
                AccountSwitcherViewEvent accountSwitcherViewEvent = (AccountSwitcherViewEvent) obj;
                if (accountSwitcherViewEvent instanceof AccountSwitcherViewEvent.AccountClicked) {
                    String str15 = ((AccountSwitcherViewEvent.AccountClicked) accountSwitcherViewEvent).targetAccountToken;
                    analytics4.track(new AccountSwitchAccountSelectExistingAccount(str14, str15), null);
                    if (!PlatformKt.activeAccountToken((SessionManager) paymentLoadingPresenter.blockersNavigator).equals(str15)) {
                        FullAccount fullAccount = null;
                        for (?? r5 : (List) ((State) obj4).getValue()) {
                            if (Intrinsics.areEqual(((FullAccount) r5).account_id, str15)) {
                                if (i9 != 0) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                                    return null;
                                }
                                fullAccount = r5;
                                i9 = 1;
                            }
                        }
                        if (i9 == 0) {
                            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                            return null;
                        }
                        FullAccount fullAccount2 = fullAccount;
                        String str16 = fullAccount2.account_id;
                        screenNavigator3.goTo(new SwitchFullAccountLoadingScreen(fullAccount2, str16 == null ? str15 : str16, (String) obj6, accountSwitcherScreen.targetDestination, AccountSwitcher$AccountSwitchInitiationSource.ACCOUNT_SWITCHER, null));
                    }
                } else if (Intrinsics.areEqual(accountSwitcherViewEvent, AccountSwitcherViewEvent.CreateBusinessAccountClick.INSTANCE)) {
                    analytics4.track(new AccountSwitchAccountSelectAddAccount(str14, AccountSwitchAccountSelectAddAccount.AccountType.BUSINESS), null);
                    realSettingsEligibilityManager.cachedSettingsResult = null;
                    screenNavigator3.goTo(((RealFlowStarter) flowStarter).startBusinessAccountCreationFlow(accountSwitcherScreen.exitScreen, C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_ACCOUNT_SWITCHER, str14));
                } else if (Intrinsics.areEqual(accountSwitcherViewEvent, AccountSwitcherViewEvent.CreatePersonalAccountClick.INSTANCE)) {
                    analytics4.track(new AccountSwitchAccountSelectAddAccount(str14, AccountSwitchAccountSelectAddAccount.AccountType.PERSONAL), null);
                    realSettingsEligibilityManager.cachedSettingsResult = null;
                    screenNavigator3.goTo(((RealFlowStarter) flowStarter).startPersonalAccountCreationFlow(str14, accountSwitcherScreen.exitScreen, CreateSecondaryPersonalAccountEntryPoint.ACCOUNT_SWITCHER));
                } else if (Intrinsics.areEqual(accountSwitcherViewEvent, AccountSwitcherViewEvent.AddAccountClick.INSTANCE)) {
                    analytics4.track(new AccountSwitchAccountSelectAddAccount(str14, AccountSwitchAccountSelectAddAccount.AccountType.LINK_EXISTING), null);
                    screenNavigator3.goTo(new AddAccountScreen(null));
                } else {
                    if (!Intrinsics.areEqual(accountSwitcherViewEvent, AccountSwitcherViewEvent.Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator3.goTo(back);
                }
                return Unit.INSTANCE;
            case 8:
                if (continuation instanceof AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1) {
                    accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1 = (AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1) continuation;
                    int i12 = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj7 = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            AccountDocumentsViewModel accountDocumentsViewModel = new AccountDocumentsViewModel((String) obj6, (List) obj, (StatementType) obj4, (String) null, 20);
                            accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1.label = 1;
                            if (((FlowCollector) obj5).emit(accountDocumentsViewModel, accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj7);
                        }
                        return Unit.INSTANCE;
                    }
                }
                accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1 = new AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1(this, continuation);
                Object obj72 = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDocumentsPresenter$taxFormsViewModel$$inlined$map$3$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                RealActivityEmbeddedPresenter realActivityEmbeddedPresenter = (RealActivityEmbeddedPresenter) obj6;
                StandaloneCoroutine standaloneCoroutine = realActivityEmbeddedPresenter.loadMoreJob;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                realActivityEmbeddedPresenter.loadMoreJob = null;
                JobKt.launch$default(coroutineScope2, null, null, new RealActivityEmbeddedPresenter$models$1$1(realActivityEmbeddedPresenter, (MutableState) obj4, r4 == true ? 1 : 0, i9), 3);
                return Unit.INSTANCE;
            case 10:
                ReceiptPresenter receiptPresenter = (ReceiptPresenter) obj5;
                ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) obj;
                if (!(activityItemCallbackEvent instanceof ActivityItemCallbackEvent.AnalyticsEvent) && !Intrinsics.areEqual(activityItemCallbackEvent, ActivityItemCallbackEvent.DismissBadge.INSTANCE) && !(activityItemCallbackEvent instanceof ActivityItemCallbackEvent.ShowProgress)) {
                    if (!(activityItemCallbackEvent instanceof ActivityItemCallbackEvent.ShowReactionPicker)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    MutableState mutableState3 = (MutableState) obj4;
                    if (((ActivityItemCallbackEvent.ShowReactionPicker) activityItemCallbackEvent).show) {
                        ActivityItem activityItem = ((SingleActivity) ((MutableState) obj6).getValue()).activityItem;
                        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = activityItem instanceof FormattedPaymentHistoryActivityItem ? (FormattedPaymentHistoryActivityItem) activityItem : null;
                        if (formattedPaymentHistoryActivityItem != null) {
                            PaymentHistoryReactions paymentHistoryReactions = formattedPaymentHistoryActivityItem.getPaymentHistoryData().reactions;
                            if (paymentHistoryReactions == null || (list = paymentHistoryReactions.available_reactions) == null) {
                                r2 = EmptyList.INSTANCE;
                            } else {
                                r2 = new ArrayList();
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    String str17 = ((Reaction) it2.next()).data;
                                    if (str17 != null) {
                                        r2.add(str17);
                                    }
                                }
                            }
                        } else {
                            r2 = 0;
                        }
                        if (r2 == 0) {
                            r2 = EmptyList.INSTANCE;
                        }
                        ReadonlyStateFlow readonlyStateFlow = receiptPresenter.sharedReactionState.reactionConfig;
                        if (readonlyStateFlow == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("reactionConfig");
                            throw null;
                        }
                        obj2 = new ReactionsState.Shown(r2, (ReactionConfig) readonlyStateFlow.$$delegate_0.getValue());
                    } else {
                        obj2 = ReactionsState.Hidden.INSTANCE;
                    }
                    mutableState3.setValue(obj2);
                }
                return Unit.INSTANCE;
            case 11:
                MutableState mutableState4 = (MutableState) obj4;
                AfterpayAppletTilePresenter afterpayAppletTilePresenter = (AfterpayAppletTilePresenter) obj6;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = afterpayAppletTilePresenter.afterpayAppletAnalytics;
                MoneyAnalyticsService moneyAnalyticsService = afterpayAppletTilePresenter.moneyAnalyticsService;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj5;
                AfterpayAppletTileViewEvent afterpayAppletTileViewEvent = (AfterpayAppletTileViewEvent) obj;
                if (afterpayAppletTileViewEvent instanceof AfterpayAppletTileViewEvent.AfterpayAppletOnClickTile) {
                    ((RealMoneyAnalyticsService) moneyAnalyticsService).submitSelectItemEvent(ItemId.AFTERPAY.INSTANCE, null, MoneySelectAction.TAP);
                    AfterpayAppletTileViewModel afterpayAppletTileViewModel = (AfterpayAppletTileViewModel) mutableState4.getValue();
                    AfterpayAppletTileViewModel.Installed installed = afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Installed ? (AfterpayAppletTileViewModel.Installed) afterpayAppletTileViewModel : null;
                    if (installed != null && (analyticsTapEvents = installed.getAnalyticsTapEvents()) != null) {
                        realAfterpayAppletAnalytics.trackGenericAnalyticsEvents(analyticsTapEvents, MapsKt__MapsKt.mapOf(new Pair(AnalyticsEvent.ParamType.ORIGIN, "MONEY_TAB"), new Pair(AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN, ((RealMoneyAnalyticsService) moneyAnalyticsService).flowToken)));
                    }
                    AfterpayAppletTileViewModel.Uninstalled uninstalled = afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Uninstalled ? (AfterpayAppletTileViewModel.Uninstalled) afterpayAppletTileViewModel : null;
                    if (uninstalled != null && (list3 = uninstalled.analyticsTapEvents) != null) {
                        realAfterpayAppletAnalytics.trackGenericAnalyticsEvents(list3, MapsKt__MapsKt.mapOf(new Pair(AnalyticsEvent.ParamType.ORIGIN, "MONEY_TAB"), new Pair(AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN, ((RealMoneyAnalyticsService) moneyAnalyticsService).flowToken)));
                    }
                    AfterpayAppletTileViewModel.V3Uninstalled v3Uninstalled = afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.V3Uninstalled ? (AfterpayAppletTileViewModel.V3Uninstalled) afterpayAppletTileViewModel : null;
                    if (v3Uninstalled != null && (list2 = v3Uninstalled.analyticsTapEvents) != null) {
                        realAfterpayAppletAnalytics.trackGenericAnalyticsEvents(list2, MapsKt__MapsKt.mapOf(new Pair(AnalyticsEvent.ParamType.ORIGIN, "MONEY_TAB"), new Pair(AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN, ((RealMoneyAnalyticsService) moneyAnalyticsService).flowToken)));
                    }
                    JobKt.launch$default(coroutineScope3, null, null, new SearchBarBinding$Content$1$1(afterpayAppletTilePresenter, new AfterpayAppletScreen$AfterpayAppletHomeScreen(afterpayAppletTilePresenter.appletFlowToken), r42 == true ? 1 : 0, i10), 3);
                } else {
                    if (!(afterpayAppletTileViewEvent instanceof AfterpayAppletTileViewEvent.ItemViewed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AfterpayAppletTileViewModel afterpayAppletTileViewModel2 = (AfterpayAppletTileViewModel) mutableState4.getValue();
                    AfterpayAppletItemViewed afterpayAppletItemViewed = afterpayAppletTileViewModel2 instanceof AfterpayAppletItemViewed ? (AfterpayAppletItemViewed) afterpayAppletTileViewModel2 : null;
                    if (afterpayAppletItemViewed != null && (impressionEvent = afterpayAppletItemViewed.getImpressionEvent()) != null) {
                        Pair pair = new Pair(AnalyticsEvent.ParamType.ORIGIN, "MONEY_TAB");
                        AnalyticsEvent.ParamType paramType = AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN;
                        Map mapOf = MapsKt__MapsKt.mapOf(pair, new Pair(paramType, ((RealMoneyAnalyticsService) moneyAnalyticsService).flowToken));
                        LinkedHashSet linkedHashSet = realAfterpayAppletAnalytics.loggedTileEntrypointImpressionHashes;
                        String str18 = (String) mapOf.get(paramType);
                        if (!Intrinsics.areEqual(str18, realAfterpayAppletAnalytics.lastTileEntrypointReferrerToken)) {
                            realAfterpayAppletAnalytics.lastTileEntrypointReferrerToken = str18;
                            linkedHashSet.clear();
                        }
                        for (AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec : impressionEvent) {
                            int hashCode = afterpayAppletAnalyticsEventsSpec.hashCode();
                            if (!linkedHashSet.contains(Integer.valueOf(hashCode))) {
                                realAfterpayAppletAnalytics.track(realAfterpayAppletAnalytics.createEvent(afterpayAppletAnalyticsEventsSpec, mapOf), null);
                                linkedHashSet.add(Integer.valueOf(hashCode));
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 12:
                return emit$com$squareup$cash$afterpayapplet$applets$presenters$AfterpayAppletTilePresenter$models$1$1$1(obj, continuation);
            case 13:
                FormattedDetail formattedDetail = (FormattedDetail) obj4;
                ?? r7 = (RealAfterpayAppletRepository) obj6;
                if (continuation instanceof RealAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1) {
                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1 = (RealAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1) continuation;
                    int i13 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label;
                    if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = i13 - PKIFailureInfo.systemUnavail;
                        Object obj8 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        switch (realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label) {
                            case 0:
                                SafeTrace.throwOnFailure(obj8);
                                flowCollector = (FlowCollector) obj5;
                                Pair pair2 = (Pair) obj;
                                AfterpayApplet afterpayApplet = (AfterpayApplet) pair2.first;
                                AfterpayAppletResponse afterpayAppletResponse2 = (AfterpayAppletResponse) pair2.second;
                                if (afterpayApplet != null) {
                                    Long l = afterpayApplet.ttl_in_millis;
                                    if ((l != null ? l.longValue() : 0L) >= r7.clock.millis()) {
                                        AfterpayAppletResponse afterpayAppletResponse3 = afterpayApplet.afterpay_applet_response;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = null;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = 0;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 10;
                                        break;
                                    }
                                }
                                if (afterpayAppletResponse2 != null) {
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = null;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = 0;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 1;
                                    break;
                                } else {
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = 0;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 2;
                                    if (flowCollector.emit(AppletCreditLineState.Loading.INSTANCE, realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1) != coroutineSingletons3) {
                                        i2 = 0;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i2;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 3;
                                        obj8 = r7.getAllViewedMessageIds(realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
                                        break;
                                    }
                                }
                                return coroutineSingletons3;
                            case 1:
                            case 10:
                                SafeTrace.throwOnFailure(obj8);
                                return Unit.INSTANCE;
                            case 2:
                                i2 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0;
                                flowCollector = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2;
                                SafeTrace.throwOnFailure(obj8);
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i2;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 3;
                                obj8 = r7.getAllViewedMessageIds(realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
                                break;
                            case 3:
                                i2 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0;
                                flowCollector = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2;
                                SafeTrace.throwOnFailure(obj8);
                                flowCollector2 = flowCollector;
                                List list6 = (List) obj8;
                                KeyValue keyValue = r7.hasViewedApplet;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector2;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5 = list6;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i2;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 4;
                                Object obj9 = keyValue.get(realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
                                if (obj9 != coroutineSingletons3) {
                                    list4 = list6;
                                    obj8 = obj9;
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    CashSuggestClientService cashSuggestClientService2 = r7.appService;
                                    KeyValue keyValue2 = r7.viewedSectionIds;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector2;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5 = list4;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6 = cashSuggestClientService2;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i2;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0 = booleanValue;
                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 5;
                                    obj3 = keyValue2.get(realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
                                    if (obj3 != coroutineSingletons3) {
                                        int i14 = i2;
                                        z2 = booleanValue;
                                        obj8 = obj3;
                                        list5 = list4;
                                        cashSuggestClientService = cashSuggestClientService2;
                                        i3 = i14;
                                        AfterpayAppletRequest afterpayAppletRequest = new AfterpayAppletRequest(list5, Boolean.valueOf(z2), CollectionsKt.toList((Iterable) obj8));
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector2;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5 = null;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6 = null;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i3;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0 = z2;
                                        realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 6;
                                        obj8 = cashSuggestClientService.afterpayAppletHome(afterpayAppletRequest, realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
                                        if (obj8 != coroutineSingletons3) {
                                            z3 = z2;
                                            i4 = i3;
                                            flowCollector3 = flowCollector2;
                                            apiResult = (ApiResult) obj8;
                                            if (apiResult instanceof ApiResult.Success) {
                                                AfterpayAppletResponse afterpayAppletResponse4 = (AfterpayAppletResponse) ((ApiResult.Success) apiResult).response;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector3;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5 = null;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6 = apiResult;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$7 = afterpayAppletResponse4;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i4;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0 = z3;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$1 = 0;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$2 = 0;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 7;
                                                if (r7.handleSuccessfulAppletResponse(afterpayAppletResponse4, "Failed to save afterpay response to cache for INN credit line", realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1) != coroutineSingletons3) {
                                                    apiResult2 = apiResult;
                                                    flowCollector4 = flowCollector3;
                                                    afterpayAppletResponse = afterpayAppletResponse4;
                                                    i5 = 0;
                                                    i6 = 0;
                                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector4;
                                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5 = null;
                                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6 = apiResult2;
                                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$7 = null;
                                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i4;
                                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0 = z3;
                                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$1 = i6;
                                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$2 = i5;
                                                    realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 8;
                                                    if (RealAfterpayAppletRepository.access$emitCreditLineStateFromResponse(r7, flowCollector4, afterpayAppletResponse, formattedDetail, realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1) != coroutineSingletons3) {
                                                        apiResult3 = apiResult2;
                                                        flowCollector5 = flowCollector4;
                                                        apiResult = apiResult3;
                                                        flowCollector3 = flowCollector5;
                                                    }
                                                }
                                            }
                                            if (apiResult instanceof ApiResult.Failure) {
                                                AppletCreditLineState.Error error = new AppletCreditLineState.Error("Unable to fetch merchant data");
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = null;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5 = null;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6 = apiResult;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$7 = null;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i4;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0 = z3;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$1 = 0;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$2 = 0;
                                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 9;
                                                break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                                return coroutineSingletons3;
                            case 4:
                                i2 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0;
                                List list7 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5;
                                flowCollector2 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2;
                                SafeTrace.throwOnFailure(obj8);
                                list4 = list7;
                                boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                CashSuggestClientService cashSuggestClientService22 = r7.appService;
                                KeyValue keyValue22 = r7.viewedSectionIds;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector2;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5 = list4;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6 = cashSuggestClientService22;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i2;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0 = booleanValue2;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 5;
                                obj3 = keyValue22.get(realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
                                if (obj3 != coroutineSingletons3) {
                                }
                                return coroutineSingletons3;
                            case 5:
                                z2 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0;
                                i3 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0;
                                CashSuggestClientService cashSuggestClientService3 = (CashSuggestClientService) realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6;
                                List list8 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5;
                                FlowCollector flowCollector6 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2;
                                SafeTrace.throwOnFailure(obj8);
                                cashSuggestClientService = cashSuggestClientService3;
                                flowCollector2 = flowCollector6;
                                list5 = list8;
                                AfterpayAppletRequest afterpayAppletRequest2 = new AfterpayAppletRequest(list5, Boolean.valueOf(z2), CollectionsKt.toList((Iterable) obj8));
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector2;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5 = null;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6 = null;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i3;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0 = z2;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 6;
                                obj8 = cashSuggestClientService.afterpayAppletHome(afterpayAppletRequest2, realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1);
                                if (obj8 != coroutineSingletons3) {
                                }
                                return coroutineSingletons3;
                            case 6:
                                z3 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0;
                                i4 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0;
                                List list9 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5;
                                flowCollector3 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2;
                                SafeTrace.throwOnFailure(obj8);
                                apiResult = (ApiResult) obj8;
                                if (apiResult instanceof ApiResult.Success) {
                                }
                                if (apiResult instanceof ApiResult.Failure) {
                                }
                                return Unit.INSTANCE;
                            case 7:
                                int i15 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$2;
                                int i16 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$1;
                                boolean z5 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0;
                                int i17 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0;
                                afterpayAppletResponse = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$7;
                                apiResult2 = (ApiResult) realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6;
                                List list10 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5;
                                flowCollector4 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2;
                                SafeTrace.throwOnFailure(obj8);
                                i5 = i15;
                                z3 = z5;
                                i6 = i16;
                                i4 = i17;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2 = flowCollector4;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5 = null;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6 = apiResult2;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$7 = null;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0 = i4;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0 = z3;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$1 = i6;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$2 = i5;
                                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label = 8;
                                if (RealAfterpayAppletRepository.access$emitCreditLineStateFromResponse(r7, flowCollector4, afterpayAppletResponse, formattedDetail, realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1) != coroutineSingletons3) {
                                }
                                return coroutineSingletons3;
                            case 8:
                                z3 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.Z$0;
                                i4 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.I$0;
                                apiResult3 = (ApiResult) realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$6;
                                List list11 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5;
                                flowCollector5 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$2;
                                SafeTrace.throwOnFailure(obj8);
                                apiResult = apiResult3;
                                flowCollector3 = flowCollector5;
                                if (apiResult instanceof ApiResult.Failure) {
                                }
                                return Unit.INSTANCE;
                            case 9:
                                List list12 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.L$5;
                                SafeTrace.throwOnFailure(obj8);
                                return Unit.INSTANCE;
                            default:
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1 = new RealAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1(this, continuation);
                Object obj82 = realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (realAfterpayAppletRepository$emitCacheOrRefreshINNCreditLineState$$inlined$transform$1$1$1.label) {
                }
            case 14:
                return emit$com$squareup$cash$afterpayapplet$presenters$AfterpayAppletHomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 15:
                Function1 function1 = (Function1) obj4;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj6;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics2 = (RealAfterpayAppletAnalytics) localHomePresenter.featureFlagManager;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) localHomePresenter.embeddedMapEnabled$delegate;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj5;
                AfterpayAppletMerchantSheetViewEvent afterpayAppletMerchantSheetViewEvent = (AfterpayAppletMerchantSheetViewEvent) obj;
                if (afterpayAppletMerchantSheetViewEvent instanceof AfterpayAppletMerchantSheetViewEvent.CtaButtonTapped) {
                    Tap tap = ((AfterpayAppletMerchantSheetViewEvent.CtaButtonTapped) afterpayAppletMerchantSheetViewEvent).tap;
                    if (tap instanceof Tap.Url) {
                        Tap.Url url = (Tap.Url) tap;
                        ((IntentLauncher) localHomePresenter.localHomeGeoPresenterFactory).launchUrlInExternalBrowser(url.actionUrl);
                        List list13 = url.analyticsTapEventsSpec;
                        if (list13 != null) {
                            realAfterpayAppletAnalytics2.trackImpressionAnalyticsEvents(list13, localHomePresenter.clientAnalyticsParams());
                        }
                    } else if (!(tap instanceof Tap.Info)) {
                        if (tap instanceof Tap.Dismiss) {
                            screenNavigator4.goTo(back);
                            LocalHomePresenter.access$trackDismissViewEvent(localHomePresenter);
                        } else {
                            if (!(tap instanceof Tap.ScrollTo)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator4.goTo(back);
                            LocalHomePresenter.access$trackDismissViewEvent(localHomePresenter);
                        }
                    }
                } else if (afterpayAppletMerchantSheetViewEvent instanceof AfterpayAppletMerchantSheetViewEvent.Dismiss) {
                    screenNavigator4.goTo(back);
                    LocalHomePresenter.access$trackDismissViewEvent(localHomePresenter);
                } else if (afterpayAppletMerchantSheetViewEvent instanceof AfterpayAppletMerchantSheetViewEvent.TryAgain) {
                    parcelableSnapshotMutableState.setValue(AfterpayAppletMerchantSheetViewModel.Loading.INSTANCE);
                    function1.invoke(coroutineScope4);
                } else if (!(afterpayAppletMerchantSheetViewEvent instanceof AfterpayAppletMerchantSheetViewEvent.SheetViewed)) {
                    if (!(afterpayAppletMerchantSheetViewEvent instanceof AfterpayAppletMerchantSheetViewEvent.SheetViewedFromForeground)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    function1.invoke(coroutineScope4);
                } else if (((AfterpayAppletMerchantSheetViewModel) parcelableSnapshotMutableState.getValue()) instanceof AfterpayAppletMerchantSheetViewModel.Loaded) {
                    AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel = (AfterpayAppletMerchantSheetViewModel) parcelableSnapshotMutableState.getValue();
                    afterpayAppletMerchantSheetViewModel.getClass();
                    AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2 = ((AfterpayAppletMerchantSheetViewModel.Loaded) afterpayAppletMerchantSheetViewModel).analyticsAppearEvent;
                    if (afterpayAppletAnalyticsEventsSpec2 != null) {
                        realAfterpayAppletAnalytics2.trackGenericAnalyticsEvents(CollectionsKt__CollectionsJVMKt.listOf(afterpayAppletAnalyticsEventsSpec2), localHomePresenter.clientAnalyticsParams());
                    }
                }
                return Unit.INSTANCE;
            case 16:
                MutableState mutableState5 = (MutableState) obj4;
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj6;
                AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen afterpayAppletScreen$AfterpayRetroOrderSelectionScreen = (AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen) poolsListPresenter.sessionManager;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics3 = (RealAfterpayAppletAnalytics) poolsListPresenter.analytics;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj5;
                AfterpayAppletRetroOrderSelectionViewEvent afterpayAppletRetroOrderSelectionViewEvent = (AfterpayAppletRetroOrderSelectionViewEvent) obj;
                if (afterpayAppletRetroOrderSelectionViewEvent instanceof AfterpayAppletRetroOrderSelectionViewEvent.GoBack) {
                    screenNavigator5.goTo(back);
                } else if (afterpayAppletRetroOrderSelectionViewEvent instanceof AfterpayAppletHomeViewEvent.TapActionEvent) {
                    Tap tap2 = ((AfterpayAppletHomeViewEvent.TapActionEvent) afterpayAppletRetroOrderSelectionViewEvent).tap;
                    if (tap2 instanceof Tap.Url) {
                        PoolsListPresenter.access$routeAction(poolsListPresenter, ((Tap.Url) tap2).actionUrl);
                    } else if (tap2 instanceof Tap.Info) {
                        String str19 = afterpayAppletScreen$AfterpayRetroOrderSelectionScreen.referrerFlowToken;
                        InfoSheet infoSheet = ((Tap.Info) tap2).info;
                        LocalizedString localizedString = infoSheet.title;
                        String translated = localizedString != null ? StringsKt.translated(localizedString) : "";
                        LocalizedString localizedString2 = infoSheet.subtitle;
                        screenNavigator5.goTo(new AfterpayAppletScreen$AfterpayAppletInfoSheet(str19, translated, localizedString2 != null ? StringsKt.translated(localizedString2) : null, null, infoSheet.cta_button, infoSheet.analytic_view_event, infoSheet.analytic_dismiss_event, infoSheet.avatar));
                    } else if (tap2 instanceof Tap.Dismiss) {
                        screenNavigator5.goTo(back);
                    } else {
                        if (!(tap2 instanceof Tap.ScrollTo)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator5.goTo(back);
                    }
                } else if (afterpayAppletRetroOrderSelectionViewEvent instanceof AfterpayAppletRetroOrderSelectionViewEvent.TryAgainTapped) {
                    mutableState5.setValue(AfterpayAppletRetroOrderSelectionViewModel.Loading.INSTANCE);
                    JobKt.launch$default(coroutineScope5, null, null, new AfterpayAppletRetroOrderSelectionPresenter$models$1$1(poolsListPresenter, mutableState5, r43 == true ? 1 : 0, i11), 3);
                } else if (afterpayAppletRetroOrderSelectionViewEvent instanceof AfterpayAppletRetroOrderSelectionViewEvent.RetroItemTapped) {
                    PoolsListPresenter.access$routeAction(poolsListPresenter, ((AfterpayAppletRetroOrderSelectionViewEvent.RetroItemTapped) afterpayAppletRetroOrderSelectionViewEvent).actionUrl);
                } else if (afterpayAppletRetroOrderSelectionViewEvent instanceof AfterpayAppletRetroOrderSelectionViewEvent.RetroAccessoryTapped) {
                    PoolsListPresenter.access$routeAction(poolsListPresenter, ((AfterpayAppletRetroOrderSelectionViewEvent.RetroAccessoryTapped) afterpayAppletRetroOrderSelectionViewEvent).actionUrl);
                } else if (afterpayAppletRetroOrderSelectionViewEvent instanceof AfterpayAppletRetroOrderSelectionViewEvent.UrlTapped) {
                    PoolsListPresenter.access$routeAction(poolsListPresenter, ((AfterpayAppletRetroOrderSelectionViewEvent.UrlTapped) afterpayAppletRetroOrderSelectionViewEvent).url);
                } else if (afterpayAppletRetroOrderSelectionViewEvent instanceof ItemViewed) {
                    realAfterpayAppletAnalytics3.trackImpressionAnalyticsEvents(((ItemViewed) afterpayAppletRetroOrderSelectionViewEvent).analyticsEventSpecs, poolsListPresenter.getDefaultRetroAnalyticsParams());
                } else {
                    if (!(afterpayAppletRetroOrderSelectionViewEvent instanceof AfterpayAppletRetroOrderSelectionViewEvent.RetroOrderSelectionScreenScreenViewed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realAfterpayAppletAnalytics3.trackImpressionAnalyticsEvents(((AfterpayAppletRetroOrderSelectionViewEvent.RetroOrderSelectionScreenScreenViewed) afterpayAppletRetroOrderSelectionViewEvent).analyticsEventSpecs, MapsKt__MapsKt.mapOf(new Pair(AnalyticsEvent.ParamType.ORIGIN, "AFTERPAY_APPLET"), new Pair(AnalyticsEvent.ParamType.FROM_SCREEN, "HOME"), new Pair(AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN, afterpayAppletScreen$AfterpayRetroOrderSelectionScreen.referrerFlowToken)));
                }
                if ((afterpayAppletRetroOrderSelectionViewEvent instanceof AfterpayAnalyticsAppletTappedEvent) && (analyticsAppletTappedEvent = ((AfterpayAnalyticsAppletTappedEvent) afterpayAppletRetroOrderSelectionViewEvent).getAnalyticsAppletTappedEvent()) != null) {
                    realAfterpayAppletAnalytics3.trackGenericAnalyticsEvents(analyticsAppletTappedEvent, poolsListPresenter.getDefaultRetroAnalyticsParams());
                }
                return Unit.INSTANCE;
            case 17:
                MutableState mutableState6 = (MutableState) obj4;
                SponsorshipRequestReferralIntroPresenter sponsorshipRequestReferralIntroPresenter = (SponsorshipRequestReferralIntroPresenter) obj6;
                SponsorshipRequestReferralIntroScreen sponsorshipRequestReferralIntroScreen = sponsorshipRequestReferralIntroPresenter.args;
                CoroutineScope coroutineScope6 = (CoroutineScope) obj5;
                FormViewEvent formViewEvent = (FormViewEvent) obj;
                if (Intrinsics.areEqual(formViewEvent, FormViewEvent.PrimaryActionSelected.INSTANCE)) {
                    sponsorshipRequestReferralIntroPresenter.analytics.track(new OutOfNetworkSponsorShownWelcomeScreenProceedWithPrefilledAlias(sponsorshipRequestReferralIntroScreen.deepLinkPayload, sponsorshipRequestReferralIntroScreen.content.inviter), null);
                    mutableState6.setValue(new FormViewModel.SubmissionState.SubmissionInFlight((BlockerAction.SubmitAction.AnimationDirection) null, 3));
                    JobKt.launch$default(coroutineScope6, null, null, new MLKitTitleGenerator$prepareModel$1(sponsorshipRequestReferralIntroPresenter, mutableState6, r44 == true ? 1 : 0, i10), 3);
                } else if (Intrinsics.areEqual(formViewEvent, FormViewEvent.Close.INSTANCE)) {
                    BetterNavigator.ScreenNavigator screenNavigator6 = sponsorshipRequestReferralIntroPresenter.navigator;
                    SponsorshipRequestContent sponsorshipRequestContent = sponsorshipRequestReferralIntroScreen.content;
                    if (sponsorshipRequestContent instanceof SponsorshipRequestContent.Sponsor) {
                        closeScreenDialog = ((SponsorshipRequestContent.Sponsor) sponsorshipRequestContent).content.close_screen_dialog;
                        closeScreenDialog.getClass();
                    } else {
                        if (!(sponsorshipRequestContent instanceof SponsorshipRequestContent.Teen)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        closeScreenDialog = ((SponsorshipRequestContent.Teen) sponsorshipRequestContent).content.close_screen_dialog;
                        closeScreenDialog.getClass();
                    }
                    screenNavigator6.goTo(new AlternativeNewSponsorAliasScreen(closeScreenDialog, sponsorshipRequestReferralIntroScreen.deepLinkPayload, sponsorshipRequestReferralIntroScreen.content.inviter));
                }
                return Unit.INSTANCE;
            case 18:
                return emit$com$squareup$cash$appmessages$presenters$sheet$SheetAppMessagePresenter$models$$inlined$CollectEffect$2$1(obj, continuation);
            case 19:
                return emit$com$squareup$cash$appmessages$views$TooltipAppMessageView$renderTooltip$1$1(obj, continuation);
            case 20:
                return emit$com$squareup$cash$banking$applets$presenters$BalanceAppletTilePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 21:
                return emit$com$squareup$cash$banking$presenters$BalanceHomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 22:
                return emit$com$squareup$cash$banking$presenters$OverdraftCoveragePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 23:
                return emit$com$squareup$cash$benefits$applets$presenters$BankingBenefitsAppletTilePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 24:
                return emit$com$squareup$cash$benefits$presenters$BenefitsHubPresenter$models$1$1$2(obj, continuation);
            case 25:
                return emit$com$squareup$cash$biometrics$AndroidBiometricsStore$read$$inlined$transform$1$1(obj, continuation);
            case 26:
                return emit$com$squareup$cash$bitcoin$graph$real$RealBitcoinGraphModelProvider$bitcoinGraphModel$$inlined$mapNotNull$1$2(obj, continuation);
            case 27:
                return emit$com$squareup$cash$bitcoin$presenters$MoveBitcoinPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$bitcoin$presenters$WalletAddressOptionsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                MutableState mutableState7 = (MutableState) obj5;
                if (!Intrinsics.areEqual((BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay) obj, BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                mutableState7.setValue(Boolean.valueOf(!((Boolean) mutableState7.getValue()).booleanValue()));
                CurrencyCode currencyCode = (CurrencyCode) ((MutableState) obj6).getValue();
                if (currencyCode != null) {
                    RealProfileManager realProfileManager = (RealProfileManager) ((StuckPlayerDetector) obj4).playerListener;
                    if (!((Boolean) mutableState7.getValue()).booleanValue()) {
                        currencyCode = CurrencyCode.BTC;
                    }
                    realProfileManager.setBitcoinAmountEntryCurrencyPreference(currencyCode);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SwipeableState$animateTo$2(CoroutineScope coroutineScope, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.$targetValue = obj;
        this.this$0 = obj2;
        this.$anim = obj3;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(Map map, Continuation continuation) {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        int i;
        Object firstOrNull;
        DismissState dismissState = (DismissState) this.this$0;
        try {
            if (continuation instanceof SwipeableState$animateTo$2$emit$1) {
                swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) continuation;
                int i2 = swipeableState$animateTo$2$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    swipeableState$animateTo$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = swipeableState$animateTo$2$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = swipeableState$animateTo$2$emit$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float access$getOffset = CardKt.access$getOffset(map, this.$targetValue);
                        if (access$getOffset != null) {
                            float floatValue = access$getOffset.floatValue();
                            AnimationSpec animationSpec = (AnimationSpec) this.$anim;
                            swipeableState$animateTo$2$emit$1.L$0 = map;
                            swipeableState$animateTo$2$emit$1.label = 1;
                            if (dismissState.animateInternalToOffset(floatValue, animationSpec, swipeableState$animateTo$2$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            throw new IllegalArgumentException("The target value must have an associated anchor.");
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = swipeableState$animateTo$2$emit$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    float floatValue2 = dismissState.absoluteOffset.getFloatValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (Math.abs(((Number) entry.getKey()).floatValue() - floatValue2) < 0.5f) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    firstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
                    if (firstOrNull == null) {
                        firstOrNull = dismissState.currentValue$delegate.getValue();
                    }
                    dismissState.setCurrentValue(firstOrNull);
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            float floatValue22 = dismissState.absoluteOffset.getFloatValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (r7.hasNext()) {
            }
            firstOrNull = CollectionsKt.firstOrNull(linkedHashMap2.values());
            if (firstOrNull == null) {
            }
            dismissState.setCurrentValue(firstOrNull);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            float floatValue3 = dismissState.absoluteOffset.getFloatValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (Math.abs(((Number) entry2.getKey()).floatValue() - floatValue3) < 0.5f) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            Object firstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap3.values());
            if (firstOrNull2 == null) {
                firstOrNull2 = dismissState.currentValue$delegate.getValue();
            }
            dismissState.setCurrentValue(firstOrNull2);
            throw th;
        }
        swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
        Object obj2 = swipeableState$animateTo$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = swipeableState$animateTo$2$emit$1.label;
    }
}
