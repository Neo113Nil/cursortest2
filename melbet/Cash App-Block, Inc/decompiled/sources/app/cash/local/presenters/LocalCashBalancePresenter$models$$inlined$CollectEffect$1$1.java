package app.cash.local.presenters;

import android.os.Parcelable;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.core.net.UriKt;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.cart.LocalBrandLocationOpenTabPresenter;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.presenters.pos.LocalPosBrandOnboardingPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandLocationOpenTabScreen;
import app.cash.local.screens.app.LocalCashAllActivityScreen;
import app.cash.local.screens.app.LocalCashBalanceScreen;
import app.cash.local.screens.app.LocalPosCheckInScreen;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewEvent;
import app.cash.local.viewmodels.LocalCashBalanceViewEvent;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewEvent;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.fillr.e;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.banking.presenters.TransfersPresenter$models$1$1;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.DemandDepositDialogScreen;
import com.squareup.cash.banking.screens.TransfersScreen;
import com.squareup.cash.banking.viewmodels.TransfersInstructionsEvent;
import com.squareup.cash.banking.viewmodels.TransfersViewModel$Companion$TransfersTab;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.navigation.BitcoinInboundNavigator;
import com.squareup.cash.bitcoin.presenters.buy.BuyBitcoinNavigator;
import com.squareup.cash.bitcoin.presenters.sell.SellBitcoinNavigator;
import com.squareup.cash.bitcoin.screens.BitcoinExchangeFullScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinSendReceiveBottomSheetScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.deposits.note.BitcoinDepositNoteViewEvent;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositNoteScreenView;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmSheetPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmSheetPresenter$models$3$1;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmSheetPresenter$models$3$3;
import com.squareup.cash.blockers.actions.presenters.BlockerActionUtilKt;
import com.squareup.cash.blockers.actions.util.RealBlockerActionUriDecoder;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.AddMoneyBlockerPresenter;
import com.squareup.cash.blockers.presenters.AddMoneyBlockerPresenter$models$2$1;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.presenters.AtmPickerAmountBlockerPresenter;
import com.squareup.cash.blockers.presenters.AtmPickerAmountBlockerPresenter$models$1$1;
import com.squareup.cash.blockers.presenters.CalendarBlockerPresenter;
import com.squareup.cash.blockers.presenters.CashtagPresenter;
import com.squareup.cash.blockers.presenters.CashtagPresenter$models$3$1;
import com.squareup.cash.blockers.presenters.FileBlockerPresenter;
import com.squareup.cash.blockers.presenters.FileBlockerPresenter$models$2$2;
import com.squareup.cash.blockers.presenters.InstrumentSelectionBlockerPresenter$SubmissionData;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter$register$result$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.blockers.presenters.VerifyContactsPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.CashtagViewEvent;
import com.squareup.cash.blockers.viewmodels.FileBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList;
import com.squareup.cash.blockers.viewmodels.LoadingAnimationDirection;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerHeaderModel;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewEvent;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewModel;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.presenters.LiteCashOutPresenter$InputMode;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractConfirmationSheetConfirmClicked;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractConfirmationSheetDismiss;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractConfirmationSheetReturnClicked;
import com.squareup.cash.cdf.check.CheckDepositExit;
import com.squareup.cash.cdf.check.CheckDepositVerify;
import com.squareup.cash.cdf.crypto.CryptoInteractOpenTransfer;
import com.squareup.cash.cdf.instrument.InstrumentSelectClose;
import com.squareup.cash.cdf.instrument.InstrumentSelectTapOption;
import com.squareup.cash.cdf.localclient.LocalClientLocalCashClickManageEarningCards;
import com.squareup.cash.cdf.localclient.LocalClientPOSOnboardingSheetInteraction;
import com.squareup.cash.cdf.roundups.RoundUpsChangeTapActivityPresentAll;
import com.squareup.cash.cdf.roundups.RoundUpsChangeTapDestination;
import com.squareup.cash.cdf.roundups.RoundUpsChangeTapDestinationAsset;
import com.squareup.cash.cdf.roundups.RoundUpsChangeToggleOnOff;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageAllowanceStartCreation;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageNavigateToSettings;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageTapBalance;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountQRCodeView;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountReviewActivityTapSeeAll;
import com.squareup.cash.cdf.stock.StockSelectApplyCategoryFilter;
import com.squareup.cash.cdf.stock.StockSelectResetCategoryFilter;
import com.squareup.cash.cdf.stock.StockSelectSelectInvestSearchFilterContinue;
import com.squareup.cash.cdf.stock.StockSelectSelectInvestSearchFilterOption;
import com.squareup.cash.cdf.stock.StockViewViewStockDetails;
import com.squareup.cash.cdf.transfers.TransfersTapGoToCards;
import com.squareup.cash.cdf.transfers.TransfersTapHowToMakeATransfer;
import com.squareup.cash.cdf.transfers.TransfersTapOrderCashCard;
import com.squareup.cash.cdf.transfers.TransfersTapWireDeactivatedAction;
import com.squareup.cash.cdf.transfers.TransfersTapWireIneligibleAction;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.checks.VerifyCheckDepositViewEvent;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$StablecoinBalance;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentagePresenter;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewEvent;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.profile.Effective_limits;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditFullNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormCompletionScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormDetailsScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormDetailsViewEvent;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.presenters.DependentDetailPresenter$models$3$1;
import com.squareup.cash.family.familyhub.screens.DependentActivityScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlsAndLimitsScreen;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.family.familyhub.screens.DependentGeneralSavingsScreen;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceSectionViewEvent$TapAllowanceView;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewEvent;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewEvent;
import com.squareup.cash.favorites.presenters.AddFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1;
import com.squareup.cash.favorites.viewmodels.FavoriteViewModel;
import com.squareup.cash.favorites.viewmodels.SectionViewModel;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesFamilyAppletPhaseFBitcoin;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesFamilyAppletPhaseFStocks;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$WireTransfersDeactivatedState;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsContext;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.backend.api.SearchResult;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.presenters.ActivitySectionPresenter;
import com.squareup.cash.globalsearch.presenters.ActivitySectionPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.GlobalSearchActivityEventDecorator$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.GlobalSearchQueryPresenter$IntermediateState;
import com.squareup.cash.globalsearch.presenters.RowSectionPresenter;
import com.squareup.cash.globalsearch.presenters.RowSectionPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.SectionPresenter;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.google.pay.CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1;
import com.squareup.cash.google.pay.CashLiteGooglePayProvisioningGateway$provision$2$result$1;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.google.pay.GooglePayProvisioningPayload;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.growtools.presenters.manager.autoinvest.GrowToolsAutoInvestManager;
import com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsAutomationTarget;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData;
import com.squareup.cash.growtools.screens.GrowToolsCompleteActivityScreen;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.instruments.presenters.InstrumentSelectionBlockerPresenter;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewEvent;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.AutoInvestPreference;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.data.CategoryDetails;
import com.squareup.cash.investing.backend.api.data.FilterDetails;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.categories.SelectionState;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewEvent;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.qrcodes.screens.TeenQrCodeScreen;
import com.squareup.cash.recipients.data.RecipientRepository$Result;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.recurringpayments.backend.RecurringPayment;
import com.squareup.cash.recurringpayments.backend.RecurringPayments;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.cash.transfers.viewmodels.WithdrawViewEvent;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.protos.cash.cashliteflow.api.v1.CashLiteCashOutFlowParameters;
import com.squareup.protos.cash.cashliteflow.api.v1.PushProvisionGooglePayResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.PushProvisionStatus;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.local.client.app.v1.UpdateEarningCardRequest;
import com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard;
import com.squareup.protos.cash.local.client.v1.LocalButton;
import com.squareup.protos.cash.local.client.v1.LocalButton$Action$NavigateToClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalButton$Action$OpenUrl;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalCashInformationalContent;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsResponse;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.AtmPickerAmountBlocker;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.WebviewBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.invest.ui.Section;
import com.squareup.util.cash.Cashtags;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.RandomKt;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.text.CharsKt__CharKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.internal.concurrent.TaskLoggerKt;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes3.dex */
public final class LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ Object $$this$LaunchedEffect;
    public final /* synthetic */ Object $content$delegate$inlined;
    public final /* synthetic */ Object $earningCardUpdating$delegate$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $showCardManagementSheet$delegate$inlined;
    public final /* synthetic */ Object this$0;

    public LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, MutableState mutableState, ArcadeFormTextInputGroupView arcadeFormTextInputGroupView, FocusRequester focusRequester, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController) {
        this.$r8$classId = 22;
        this.$showCardManagementSheet$delegate$inlined = mutableState;
        this.this$0 = arcadeFormTextInputGroupView;
        this.$content$delegate$inlined = focusRequester;
        this.$earningCardUpdating$delegate$inlined = delegatingSoftwareKeyboardController;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AtmPickerOption$Keypad] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$blockers$presenters$AtmPickerAmountBlockerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        AtmPickerAmountBlocker.AtmPickerOption.PresetAmount presetAmount;
        MutableState mutableState = (MutableState) this.$earningCardUpdating$delegate$inlined;
        AtmPickerAmountBlockerPresenter atmPickerAmountBlockerPresenter = (AtmPickerAmountBlockerPresenter) this.this$0;
        BlockersScreens.AtmPickerAmountBlockerScreen atmPickerAmountBlockerScreen = atmPickerAmountBlockerPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        AtmPickerAmountBlockerViewEvent atmPickerAmountBlockerViewEvent = (AtmPickerAmountBlockerViewEvent) obj;
        ?? r4 = 0;
        r4 = 0;
        if (atmPickerAmountBlockerViewEvent instanceof AtmPickerAmountBlockerViewEvent.SelectAtmPickerOption) {
            List<AtmPickerAmountBlocker.AtmPickerOption> list = atmPickerAmountBlockerPresenter.atmPicker.options;
            int i = ((AtmPickerAmountBlockerViewEvent.SelectAtmPickerOption) atmPickerAmountBlockerViewEvent).index;
            AtmPickerAmountBlocker.AtmPickerOption atmPickerOption = list.get(i);
            AtmPickerAmountBlocker.AtmPickerOption.Option option = atmPickerOption.option;
            if (option != null) {
                AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount presetAmount2 = option instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount ? (AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) option : null;
                if (presetAmount2 != null) {
                    presetAmount = presetAmount2.getValue();
                    if (presetAmount == null) {
                        ((ParcelableSnapshotMutableIntState) this.$content$delegate$inlined).setIntValue(i);
                    } else {
                        AtmPickerAmountBlocker.AtmPickerOption.Option option2 = atmPickerOption.option;
                        if (option2 != null) {
                            AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad keypad = option2 instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad ? (AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad) option2 : null;
                            if (keypad != null) {
                                r4 = keypad.getValue();
                            }
                        }
                        if (r4 != 0) {
                            ((MutableState) this.$showCardManagementSheet$delegate$inlined).setValue(AtmPickerAmountBlockerPresenter.PickerType.Keypad);
                        }
                    }
                }
            }
            presetAmount = null;
            if (presetAmount == null) {
            }
        } else if (atmPickerAmountBlockerViewEvent instanceof AtmPickerAmountBlockerViewEvent.ConfirmAtmPickerOption) {
            JobKt.launch$default(coroutineScope, null, null, new AtmPickerAmountBlockerPresenter$models$1$1(atmPickerAmountBlockerPresenter, atmPickerAmountBlockerViewEvent, mutableState, null), 3);
        } else if (atmPickerAmountBlockerViewEvent instanceof AtmPickerAmountBlockerViewEvent.ConfirmKeypadAmount) {
            JobKt.launch$default(coroutineScope, null, null, new AmountBlockerPresenter$models$1$2(atmPickerAmountBlockerPresenter, atmPickerAmountBlockerViewEvent, mutableState, (Continuation) r4, 29), 3);
        } else {
            if (!Intrinsics.areEqual(atmPickerAmountBlockerViewEvent, AtmPickerAmountBlockerViewEvent.Dismiss.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            BlockerAction retreatAction = atmPickerAmountBlockerScreen.getRetreatAction();
            if (retreatAction == null) {
                retreatAction = atmPickerAmountBlockerScreen.getDismissAction();
            }
            Screen back = atmPickerAmountBlockerPresenter.blockersDataNavigator.getBack(atmPickerAmountBlockerScreen, atmPickerAmountBlockerScreen.getBlockersData());
            if (back == null) {
                back = Back.INSTANCE;
            }
            if (retreatAction != null) {
                JobKt.launch$default(coroutineScope, null, null, new SsnPresenter$models$2$2(atmPickerAmountBlockerPresenter, retreatAction, r4, 7), 3);
            } else {
                atmPickerAmountBlockerPresenter.blockerFlowAnalytics.onFlowCancelled(atmPickerAmountBlockerScreen.getBlockersData());
                atmPickerAmountBlockerPresenter.navigator.goTo(back);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$CashtagPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CashtagPresenter cashtagPresenter = (CashtagPresenter) this.$content$delegate$inlined;
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.this$0;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        CashtagViewEvent cashtagViewEvent = (CashtagViewEvent) obj;
        if (cashtagViewEvent instanceof CashtagViewEvent.InputChange) {
            ((StateFlowImpl) mutableStateFlow).setValue(((CashtagViewEvent.InputChange) cashtagViewEvent).input);
        } else {
            boolean z = cashtagViewEvent instanceof CashtagViewEvent.NextClick;
            Object obj2 = this.$showCardManagementSheet$delegate$inlined;
            Object obj3 = this.$earningCardUpdating$delegate$inlined;
            Continuation continuation2 = null;
            if (z) {
                ((StateFlowImpl) mutableStateFlow).setValue(((CashtagViewEvent.NextClick) cashtagViewEvent).cashtagInput);
                JobKt.launch$default(coroutineScope, null, null, new CashtagPresenter$models$3$1(cashtagPresenter, cashtagViewEvent, (MutableState) obj2, (MutableState) obj3, null, 0), 3);
            } else if (cashtagViewEvent instanceof CashtagViewEvent.DialogPositiveResult) {
                JobKt.launch$default(coroutineScope, null, null, new CashtagPresenter$models$3$1(cashtagPresenter, cashtagViewEvent, (MutableState) obj2, (MutableState) obj3, null, 1), 3);
            } else if (Intrinsics.areEqual(cashtagViewEvent, CashtagViewEvent.DialogNegativeResult.INSTANCE)) {
                ((MutableState) obj3).setValue(Boolean.FALSE);
            } else {
                if (!Intrinsics.areEqual(cashtagViewEvent, CashtagViewEvent.Dismiss.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                BlockerAction blockerAction = cashtagPresenter.args.dismissAction;
                if (blockerAction == null) {
                    blockerAction = new BlockerAction(null, new BlockerAction.Action.EndFlowAction(new BlockerAction.EndFlowAction(BlockerAction.EndFlowAction.Result.CANCELLED, null, null, 6, null)), 23);
                }
                JobKt.launch$default(coroutineScope, null, null, new SsnPresenter$models$2$2(cashtagPresenter, blockerAction, continuation2, 11), 3);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$FileBlockerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Screen back;
        FileBlockerPresenter fileBlockerPresenter = (FileBlockerPresenter) this.this$0;
        BlockersDataNavigator blockersDataNavigator = fileBlockerPresenter.blockersNavigator;
        BlockersScreens.FileBlockerScreen fileBlockerScreen = fileBlockerPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        FileBlockerViewEvent fileBlockerViewEvent = (FileBlockerViewEvent) obj;
        if (fileBlockerViewEvent instanceof FileBlockerViewEvent.NavigationAction) {
            BetterNavigator.ScreenNavigator screenNavigator = fileBlockerPresenter.navigator;
            FileBlockerViewEvent.NavigationAction navigationAction = (FileBlockerViewEvent.NavigationAction) fileBlockerViewEvent;
            if (navigationAction.equals(FileBlockerViewEvent.NavigationAction.CameraAccessDenied.INSTANCE)) {
                BlockersData blockersData = fileBlockerScreen.blockersData;
                FileCategory fileCategory = fileBlockerPresenter.category;
                int i = FileBlockerPresenter.WhenMappings.$EnumSwitchMapping$0[fileCategory.ordinal()];
                if (i != 1 && i != 2 && i != 3 && i != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Category ", fileCategory, " not supported");
                    return null;
                }
                back = new BlockersScreens.FileBlockerExplanation(blockersData, R.string.explanation_message_document);
            } else if (navigationAction.equals(FileBlockerViewEvent.NavigationAction.HelpClick.INSTANCE)) {
                back = new BlockersScreens.HelpOptions.Impl(fileBlockerScreen.blockersData, fileBlockerScreen.helpItems);
            } else if (navigationAction.equals(FileBlockerViewEvent.NavigationAction.CameraError.INSTANCE)) {
                back = new BlockersScreens.CameraError(fileBlockerScreen.blockersData);
            } else if (navigationAction instanceof FileBlockerViewEvent.NavigationAction.BlockerError) {
                Screen screen = ((FileBlockerViewEvent.NavigationAction.BlockerError) fileBlockerViewEvent).screenArgs;
                screen.getClass();
                back = blockersDataNavigator.getNext(fileBlockerScreen, ((BlockersScreens.Error) screen).blockersData);
            } else if (navigationAction.equals(FileBlockerViewEvent.NavigationAction.CameraAccessDeniedForever.INSTANCE)) {
                back = new BlockersScreens.CameraPermissionScreen(fileBlockerScreen.blockersData);
            } else if (navigationAction.equals(FileBlockerViewEvent.NavigationAction.FileBlockerExplanationCanceled.INSTANCE)) {
                back = blockersDataNavigator.getSkip(fileBlockerScreen, fileBlockerScreen.blockersData);
            } else {
                if (!navigationAction.equals(FileBlockerViewEvent.NavigationAction.Exit.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                back = blockersDataNavigator.getBack(fileBlockerScreen, fileBlockerScreen.blockersData);
                if (back == null) {
                    back = Back.INSTANCE;
                }
            }
            screenNavigator.goTo(back);
        } else {
            Continuation continuation2 = null;
            if (fileBlockerViewEvent instanceof FileBlockerViewEvent.BlockerActionClick) {
                JobKt.launch$default(coroutineScope, null, null, new SsnPresenter$models$2$2(fileBlockerPresenter, fileBlockerViewEvent, continuation2, 13), 3);
            } else {
                boolean z = fileBlockerViewEvent instanceof FileBlockerViewEvent.CameraAccessGranted;
                if (z || (fileBlockerViewEvent instanceof FileBlockerViewEvent.RestartCapture)) {
                    if (z) {
                        ((MutableState) this.$showCardManagementSheet$delegate$inlined).setValue(Boolean.TRUE);
                    }
                } else if (fileBlockerViewEvent instanceof FileBlockerViewEvent.HelpItemClick) {
                    JobKt.launch$default(coroutineScope, null, null, new FileBlockerPresenter$models$2$2(fileBlockerPresenter, fileBlockerViewEvent, (MutableState) this.$earningCardUpdating$delegate$inlined, continuation2, 0), 3);
                } else {
                    if (!(fileBlockerViewEvent instanceof FileBlockerViewEvent.CaptureCompleted)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope, null, null, new FileBlockerPresenter$models$2$2(fileBlockerPresenter, fileBlockerViewEvent, (MutableState) this.$content$delegate$inlined, continuation2, 1), 3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$InstrumentSelectionBlockerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$content$delegate$inlined;
        MutableState mutableState2 = (MutableState) this.$earningCardUpdating$delegate$inlined;
        MutableState mutableState3 = (MutableState) this.$showCardManagementSheet$delegate$inlined;
        DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
        BlockersScreens.InstrumentSelectionScreen instrumentSelectionScreen = (BlockersScreens.InstrumentSelectionScreen) disclosurePresenter.appService;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        InstrumentSelectionViewEvent instrumentSelectionViewEvent = (InstrumentSelectionViewEvent) obj;
        if (instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent.Close) {
            screenNavigator.goTo(instrumentSelectionScreen.blockersData.exitScreen);
        } else {
            if (instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent.DetailRowClicked) {
                InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption = instrumentSelectionScreen.data.useSecondaryOptionDetails ? (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState3.getValue() : (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState2.getValue();
                InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail detail = preselectableOption != null ? preselectableOption.getDetail() : null;
                InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList detailList = detail instanceof InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList ? (InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList) detail : null;
                if (detailList != null) {
                    InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog detailInfoDialog = ((InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList.DetailRow) detailList.detailRows.get(((InstrumentSelectionViewEvent.DetailRowClicked) instrumentSelectionViewEvent).rowIndex)).dialog;
                    detailInfoDialog.getClass();
                    screenNavigator.goTo(new BlockersScreens.InstrumentSelectionDetailsDialogScreen(instrumentSelectionScreen.blockersData, detailInfoDialog));
                }
            } else if (instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent.DetailTextClicked) {
                InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption2 = instrumentSelectionScreen.data.useSecondaryOptionDetails ? (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState3.getValue() : (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState2.getValue();
                InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail detail2 = preselectableOption2 != null ? preselectableOption2.getDetail() : null;
                InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailText detailText = detail2 instanceof InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailText ? (InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailText) detail2 : null;
                if (detailText != null) {
                    InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailInfoDialog detailInfoDialog2 = detailText.dialog;
                    detailInfoDialog2.getClass();
                    screenNavigator.goTo(new BlockersScreens.InstrumentSelectionDetailsDialogScreen(instrumentSelectionScreen.blockersData, detailInfoDialog2));
                }
            } else if (instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList) {
                DisclosurePresenter.access$goToInstrumentListScreen(disclosurePresenter, ((InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionsList) instrumentSelectionViewEvent).isSecondaryOption);
            } else if (instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails) {
                InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails instrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails = (InstrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails) instrumentSelectionViewEvent;
                boolean z = instrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails.isSecondaryOption;
                InstrumentSelectionData.InstrumentOption access$getInstrumentById = DisclosurePresenter.access$getInstrumentById(disclosurePresenter, instrumentSelectionViewEvent$InstrumentClicked$ShowOptionDetails.id, z);
                InstrumentSelectionData instrumentSelectionData = instrumentSelectionScreen.data;
                InstrumentSelectionData.PreselectedOptionAction preselectedOptionAction = z ? instrumentSelectionData.preselectedSecondaryOptionAction : instrumentSelectionData.preselectedOptionAction;
                preselectedOptionAction.getClass();
                InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog optionDialog = ((InstrumentSelectionData.PreselectedOptionAction.PreselectedShowDialogAction) preselectedOptionAction).dialog;
                BlockersData blockersData = instrumentSelectionScreen.blockersData;
                InstrumentSelectionData instrumentSelectionData2 = instrumentSelectionScreen.data;
                screenNavigator.goTo(new BlockersScreens.InstrumentSelectionDetailsScreen(blockersData, access$getInstrumentById, optionDialog, (z ? instrumentSelectionData2.preselectedSecondaryOptionAction : instrumentSelectionData2.preselectedOptionAction) instanceof InstrumentSelectionData.PreselectedOptionAction.PreselectedShowDialogAction, z));
            } else if (instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent.NewInstrumentSelected) {
                InstrumentSelectionViewEvent.NewInstrumentSelected newInstrumentSelected = (InstrumentSelectionViewEvent.NewInstrumentSelected) instrumentSelectionViewEvent;
                boolean z2 = newInstrumentSelected.isSecondaryOption;
                boolean z3 = newInstrumentSelected.isSecondaryOption;
                InstrumentSelectionData.InstrumentOption access$getInstrumentById2 = DisclosurePresenter.access$getInstrumentById(disclosurePresenter, newInstrumentSelected.id, z3);
                if (access$getInstrumentById2 instanceof InstrumentSelectionData.InstrumentOption.Enabled.SelectOption) {
                    InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption3 = (InstrumentSelectionData.InstrumentOption.PreselectableOption) access$getInstrumentById2;
                    if (z2) {
                        mutableState3.setValue(preselectableOption3);
                    } else {
                        mutableState2.setValue(preselectableOption3);
                    }
                } else if (access$getInstrumentById2 instanceof InstrumentSelectionData.InstrumentOption.Enabled.SubmitOption) {
                    mutableState.setValue(DisclosurePresenter.access$buildSubmissionData(disclosurePresenter, access$getInstrumentById2, z3, (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState2.getValue(), (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState3.getValue()));
                } else if (access$getInstrumentById2 instanceof InstrumentSelectionData.InstrumentOption.Enabled.ShowDialogOption) {
                    InstrumentSelectionData.InstrumentOption.Enabled.OptionDialog optionDialog2 = ((InstrumentSelectionData.InstrumentOption.Enabled.ShowDialogOption) access$getInstrumentById2).dialog;
                    BlockersData blockersData2 = instrumentSelectionScreen.blockersData;
                    InstrumentSelectionData instrumentSelectionData3 = instrumentSelectionScreen.data;
                    screenNavigator.goTo(new BlockersScreens.InstrumentSelectionDetailsScreen(blockersData2, access$getInstrumentById2, optionDialog2, (z3 ? instrumentSelectionData3.preselectedSecondaryOptionAction : instrumentSelectionData3.preselectedOptionAction) instanceof InstrumentSelectionData.PreselectedOptionAction.PreselectedShowDialogAction, z3));
                } else {
                    if (!(access$getInstrumentById2 instanceof InstrumentSelectionData.InstrumentOption.Disabled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption4 = (InstrumentSelectionData.InstrumentOption.PreselectableOption) access$getInstrumentById2;
                    if (z2) {
                        mutableState3.setValue(preselectableOption4);
                    } else {
                        mutableState2.setValue(preselectableOption4);
                    }
                }
            } else if (instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent.InstrumentDetailActionRequested) {
                JobKt.launch$default(coroutineScope, null, null, new AndroidSecureStore$read$2(disclosurePresenter, instrumentSelectionViewEvent, mutableState2, mutableState3, mutableState, null, 23), 3);
            } else if (instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent.Next) {
                InstrumentSelectionViewEvent.Next next = (InstrumentSelectionViewEvent.Next) instrumentSelectionViewEvent;
                ByteString byteString = next.submittedOption.encodedSelectedOption;
                InstrumentSelectionData.InstrumentOption.Enabled.SelectOption selectOption = next.secondarySubmittedOption;
                mutableState.setValue(new InstrumentSelectionBlockerPresenter$SubmissionData(byteString, selectOption != null ? selectOption.encodedSelectedOption : null));
            } else {
                if (!(instrumentSelectionViewEvent instanceof InstrumentSelectionViewEvent.DismissInstrumentDetails)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                InstrumentSelectionData instrumentSelectionData4 = instrumentSelectionScreen.data;
                boolean z4 = ((InstrumentSelectionViewEvent.DismissInstrumentDetails) instrumentSelectionViewEvent).isSecondaryOption;
                InstrumentSelectionData.PreselectedOptionAction preselectedOptionAction2 = z4 ? instrumentSelectionData4.preselectedSecondaryOptionAction : instrumentSelectionData4.preselectedOptionAction;
                if (preselectedOptionAction2 instanceof InstrumentSelectionData.PreselectedOptionAction.PreselectedShowOptionsAction) {
                    DisclosurePresenter.access$goToInstrumentListScreen(disclosurePresenter, z4);
                } else if (!(preselectedOptionAction2 instanceof InstrumentSelectionData.PreselectedOptionAction.PreselectedShowDialogAction) && preselectedOptionAction2 != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$VerifyContactsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$showCardManagementSheet$delegate$inlined;
        VerifyContactsPresenter verifyContactsPresenter = (VerifyContactsPresenter) this.this$0;
        BlockersScreens.ContactVerificationScreen contactVerificationScreen = verifyContactsPresenter.args;
        BetterNavigator.ScreenNavigator screenNavigator = verifyContactsPresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        VerifyContactsViewEvent verifyContactsViewEvent = (VerifyContactsViewEvent) obj;
        if (verifyContactsViewEvent instanceof VerifyContactsViewEvent.HelpClick) {
            screenNavigator.goTo(new BlockersScreens.HelpOptions.Impl(contactVerificationScreen.blockersData, contactVerificationScreen.helpItems));
        } else {
            boolean z = verifyContactsViewEvent instanceof VerifyContactsViewEvent.Submit;
            Back back = Back.INSTANCE;
            Continuation continuation2 = null;
            if (z) {
                if (((Boolean) ((State) this.$content$delegate$inlined).getValue()).booleanValue()) {
                    JobKt.launch$default(coroutineScope, null, null, new PlaidLinkView.AnonymousClass2(verifyContactsPresenter, mutableState, continuation2, 4), 3);
                } else if (((Boolean) ((MutableState) this.$earningCardUpdating$delegate$inlined).getValue()).booleanValue()) {
                    screenNavigator.goTo(new BlockersScreens.ReadContactsPermissionScreen());
                } else {
                    screenNavigator.goTo(back);
                }
            } else if (verifyContactsViewEvent instanceof VerifyContactsViewEvent.HelpItemClick) {
                JobKt.launch$default(coroutineScope, null, null, new FileBlockerView$6$2$2(verifyContactsPresenter, verifyContactsViewEvent, mutableState, continuation2, 9), 3);
            } else if ((verifyContactsViewEvent instanceof VerifyContactsViewEvent.AccessDenied) || (verifyContactsViewEvent instanceof VerifyContactsViewEvent.OSBack)) {
                screenNavigator.goTo(back);
            } else if (verifyContactsViewEvent instanceof VerifyContactsViewEvent.Retreat) {
                BlockerAction blockerAction = contactVerificationScreen.retreatAction;
                if (blockerAction == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                    return null;
                }
                VerifyContactsViewModel verifyContactsViewModel = (VerifyContactsViewModel) mutableState.getValue();
                LoadingAnimationDirection loadingAnimationDirection = LoadingAnimationDirection.FORWARD;
                mutableState.setValue(VerifyContactsViewModel.copy$default(verifyContactsViewModel, true, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE));
                JobKt.launch$default(coroutineScope, null, null, new PlaidLinkView.AnonymousClass2(verifyContactsPresenter, blockerAction, continuation2, 5), 3);
            } else {
                if (!(verifyContactsViewEvent instanceof VerifyContactsViewEvent.Dismiss)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                JobKt.launch$default(coroutineScope, null, null, new CardModelView.AnonymousClass1.C00581(verifyContactsPresenter, null, 11), 3);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$web$presenters$WebViewBlockerPresenter$models$$inlined$CollectEffect$2$1(Object obj, Continuation continuation) {
        WebViewBlockerPresenter webViewBlockerPresenter = (WebViewBlockerPresenter) this.$content$delegate$inlined;
        BlockersScreens.WebViewBlockerScreen webViewBlockerScreen = (BlockersScreens.WebViewBlockerScreen) this.this$0;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        WebViewBlockerViewEvent webViewBlockerViewEvent = (WebViewBlockerViewEvent) obj;
        if (webViewBlockerViewEvent instanceof WebViewBlockerViewEvent.UrlLoading) {
            JobKt.launch$default(coroutineScope, null, null, new EngineInterceptor$intercept$2(webViewBlockerScreen, webViewBlockerPresenter, webViewBlockerViewEvent, (MutableState) this.$showCardManagementSheet$delegate$inlined, (Continuation) null, 21), 3);
        } else {
            boolean z = webViewBlockerViewEvent instanceof WebViewBlockerViewEvent.TitleUpdated;
            Object obj2 = this.$earningCardUpdating$delegate$inlined;
            if (z) {
                MutableState mutableState = (MutableState) obj2;
                Object obj3 = (WebViewBlockerViewModel) mutableState.getValue();
                if (!Intrinsics.areEqual(obj3, WebViewBlockerViewModel.ErrorUrl.INSTANCE) && !Intrinsics.areEqual(obj3, WebViewBlockerViewModel.Loading.INSTANCE)) {
                    if (!(obj3 instanceof WebViewBlockerViewModel.LoadUrl)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    WebviewBlocker.NavigationHeader navigationHeader = webViewBlockerScreen.navigationHeader;
                    if ((navigationHeader != null ? navigationHeader.title : null) == null) {
                        WebViewBlockerViewModel.LoadUrl loadUrl = (WebViewBlockerViewModel.LoadUrl) obj3;
                        WebViewBlockerHeaderModel webViewBlockerHeaderModel = loadUrl.navigationHeader;
                        obj3 = WebViewBlockerViewModel.LoadUrl.copy$default(loadUrl, webViewBlockerHeaderModel != null ? new WebViewBlockerHeaderModel(((WebViewBlockerViewEvent.TitleUpdated) webViewBlockerViewEvent).title, webViewBlockerHeaderModel.urlText, webViewBlockerHeaderModel.closeButtonOnly, webViewBlockerHeaderModel.shouldHideUrl) : null, false, 119);
                    } else {
                        obj3 = (WebViewBlockerViewModel.LoadUrl) obj3;
                    }
                }
                mutableState.setValue(obj3);
            } else if (!(webViewBlockerViewEvent instanceof WebViewBlockerViewEvent.ProgressUpdated) && !(webViewBlockerViewEvent instanceof WebViewBlockerViewEvent.NavigationStateUpdated)) {
                if (webViewBlockerViewEvent instanceof WebViewBlockerViewEvent.FooterButtonClick) {
                    JobKt.launch$default(coroutineScope, null, null, new RealBoostSelector$removeBoost$1(webViewBlockerViewEvent, webViewBlockerPresenter, webViewBlockerScreen, (MutableState) obj2, null, 10), 3);
                } else if (webViewBlockerViewEvent instanceof WebViewBlockerViewEvent.LaunchNewWindow) {
                    webViewBlockerPresenter.launcher.launchUrlInInternalBrowser(((WebViewBlockerViewEvent.LaunchNewWindow) webViewBlockerViewEvent).url);
                } else {
                    if (!Intrinsics.areEqual(webViewBlockerViewEvent, WebViewBlockerViewEvent.Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    webViewBlockerPresenter.navigator.goTo(webViewBlockerScreen.blockersData.exitScreen);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$cashapplite$presenters$LiteCashOutPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$earningCardUpdating$delegate$inlined;
        LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) this.$$this$LaunchedEffect;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
        MutableState mutableState2 = (MutableState) this.$content$delegate$inlined;
        MutableState mutableState3 = (MutableState) this.$showCardManagementSheet$delegate$inlined;
        WithdrawViewEvent withdrawViewEvent = (WithdrawViewEvent) obj;
        if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.CloseClick.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.CtaClick.INSTANCE)) {
            FlowStarter flowStarter = (FlowStarter) localPosCheckInPresenter.launcher;
            String m = Boxes$$ExternalSyntheticOutline1.m();
            Money money = (Money) mutableState3.getValue();
            money.getClass();
            screenNavigator.goTo(FlowStarter.startPlasmaFlowWithParams$default((RealFlowStarter) flowStarter, Flow$Type.CASH_LITE_CASH_OUT, new CashLiteCashOutFlowParameters(m, money, null, ByteString.EMPTY), PaymentScreens$HomeScreens$Home.INSTANCE, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS));
        } else if (withdrawViewEvent instanceof WithdrawViewEvent.OnAmountChanged) {
            mutableState3.setValue(Moneys.parseMoneyFromString$default(((WithdrawViewEvent.OnAmountChanged) withdrawViewEvent).amount, (CurrencyCode) this.this$0));
        } else if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.Expanded.INSTANCE)) {
            mutableState.setValue((Money) mutableState3.getValue());
            mutableState2.setValue(LiteCashOutPresenter$InputMode.CHANGE_AMOUNT);
        } else if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.Peeking.INSTANCE)) {
            mutableState2.setValue(LiteCashOutPresenter$InputMode.VIEW_AMOUNT);
        } else if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.SaveAmountClick.INSTANCE)) {
            mutableState2.setValue(LiteCashOutPresenter$InputMode.VIEW_AMOUNT);
        } else if (Intrinsics.areEqual(withdrawViewEvent, WithdrawViewEvent.DismissChangeAmountClick.INSTANCE)) {
            mutableState3.setValue((Money) mutableState.getValue());
            mutableState2.setValue(LiteCashOutPresenter$InputMode.VIEW_AMOUNT);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$checks$VerifyCheckDepositPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CheckDepositVerify.Side side;
        VerifyCheckDepositPresenter verifyCheckDepositPresenter = (VerifyCheckDepositPresenter) this.this$0;
        VerifyCheckDepositScreen verifyCheckDepositScreen = verifyCheckDepositPresenter.args;
        Analytics analytics = verifyCheckDepositPresenter.analytics;
        BetterNavigator.ScreenNavigator screenNavigator = verifyCheckDepositPresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        VerifyCheckDepositViewEvent verifyCheckDepositViewEvent = (VerifyCheckDepositViewEvent) obj;
        if (verifyCheckDepositViewEvent instanceof VerifyCheckDepositViewEvent.Submit) {
            JobKt.launch$default(coroutineScope, null, null, new VerifyCheckDepositPresenter$models$3$1((Object) verifyCheckDepositPresenter, this.$showCardManagementSheet$delegate$inlined, this.$earningCardUpdating$delegate$inlined, this.$content$delegate$inlined, (Continuation) null, 0), 3);
        } else if (verifyCheckDepositViewEvent instanceof VerifyCheckDepositViewEvent.Exit) {
            analytics.track(new CheckDepositExit(CheckDepositExit.Step.CAPTURE), null);
            verifyCheckDepositPresenter.blockerFlowAnalytics.onFlowCancelled(verifyCheckDepositScreen.blockersData);
            screenNavigator.goTo(verifyCheckDepositScreen.blockersData.exitScreen);
        } else if (verifyCheckDepositViewEvent instanceof VerifyCheckDepositViewEvent.CaptureCheckImage) {
            CheckDepositVerify.State state = CheckDepositVerify.State.CAPTURING;
            int ordinal = ((VerifyCheckDepositViewEvent.CaptureCheckImage) verifyCheckDepositViewEvent).face.ordinal();
            if (ordinal == 0) {
                side = CheckDepositVerify.Side.FRONT;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                side = CheckDepositVerify.Side.BACK;
            }
            analytics.track(new CheckDepositVerify(side, state, 1), null);
            screenNavigator.askQuestion(CheckCaptureQuestion.INSTANCE, new VerifyCheckDepositPresenter$models$3$2(0, verifyCheckDepositViewEvent, verifyCheckDepositPresenter));
        } else {
            if (!Intrinsics.areEqual(verifyCheckDepositViewEvent, VerifyCheckDepositViewEvent.GoBack.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            screenNavigator.goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object emit$com$squareup$cash$crypto$common$presenters$BitcoinP2pConversionPercentagePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        String str;
        MutableState mutableState = (MutableState) this.$showCardManagementSheet$delegate$inlined;
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = (ParcelableSnapshotMutableLongState) this.$content$delegate$inlined;
        MutableState mutableState2 = (MutableState) this.$earningCardUpdating$delegate$inlined;
        BitcoinP2pConversionPercentagePresenter bitcoinP2pConversionPercentagePresenter = (BitcoinP2pConversionPercentagePresenter) this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = bitcoinP2pConversionPercentagePresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        BitcoinP2pConversionPercentageViewEvent bitcoinP2pConversionPercentageViewEvent = (BitcoinP2pConversionPercentageViewEvent) obj;
        if (bitcoinP2pConversionPercentageViewEvent instanceof BitcoinP2pConversionPercentageViewEvent.SelectPercentage) {
            long j = ((BitcoinP2pConversionPercentageViewEvent.SelectPercentage) bitcoinP2pConversionPercentageViewEvent).bps;
            if (1 > j || j >= 10001) {
                List list = BitcoinP2pConversionPercentagePresenter.DEFAULT_PICKER_OPTIONS;
                mutableState.setValue(Boolean.TRUE);
            } else {
                List list2 = BitcoinP2pConversionPercentagePresenter.DEFAULT_PICKER_OPTIONS;
                parcelableSnapshotMutableLongState.setLongValue(j);
            }
        } else {
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (Intrinsics.areEqual(bitcoinP2pConversionPercentageViewEvent, BitcoinP2pConversionPercentageViewEvent.TapCustomPercentage.INSTANCE)) {
                BlockersData blockersData = bitcoinP2pConversionPercentagePresenter.args.blockersData;
                long longValue = parcelableSnapshotMutableLongState.getLongValue();
                BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI percentageSelectionUI = bitcoinP2pConversionPercentagePresenter.blocker.ui_elements;
                if (percentageSelectionUI == null || (str = percentageSelectionUI.header) == null) {
                    str = "";
                }
                screenNavigator.goTo(new CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen(blockersData, longValue, 10000L, str, percentageSelectionUI != null ? percentageSelectionUI.custom_amount_subtitle : null));
            } else if (Intrinsics.areEqual(bitcoinP2pConversionPercentageViewEvent, BitcoinP2pConversionPercentageViewEvent.Confirm.INSTANCE)) {
                List list3 = BitcoinP2pConversionPercentagePresenter.DEFAULT_PICKER_OPTIONS;
                mutableState2.setValue(Boolean.TRUE);
                JobKt.launch$default(coroutineScope, null, null, new RealProfileManager$setPhoto$2(bitcoinP2pConversionPercentagePresenter, parcelableSnapshotMutableLongState, mutableState2, objArr2 == true ? 1 : 0, 15), 3);
            } else if (Intrinsics.areEqual(bitcoinP2pConversionPercentageViewEvent, BitcoinP2pConversionPercentageViewEvent.Disable.INSTANCE)) {
                List list4 = BitcoinP2pConversionPercentagePresenter.DEFAULT_PICKER_OPTIONS;
                mutableState2.setValue(Boolean.TRUE);
                JobKt.launch$default(coroutineScope, null, null, new EntitySyncerKt$hasSyncedFlow$1((Object) bitcoinP2pConversionPercentagePresenter, (Object) mutableState2, (Continuation) (objArr == true ? 1 : 0), 19), 3);
            } else if (Intrinsics.areEqual(bitcoinP2pConversionPercentageViewEvent, BitcoinP2pConversionPercentageViewEvent.Exit.INSTANCE)) {
                screenNavigator.goTo(Back.INSTANCE);
            } else {
                if (!Intrinsics.areEqual(bitcoinP2pConversionPercentageViewEvent, BitcoinP2pConversionPercentageViewEvent.DismissAlert.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list5 = BitcoinP2pConversionPercentagePresenter.DEFAULT_PICKER_OPTIONS;
                mutableState.setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$directdeposit$presenters$DirectDepositManualFormDetailsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$content$delegate$inlined;
        final MutableState mutableState2 = (MutableState) this.this$0;
        final MutableState mutableState3 = (MutableState) this.$earningCardUpdating$delegate$inlined;
        MutableState mutableState4 = (MutableState) this.$showCardManagementSheet$delegate$inlined;
        final CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.$$this$LaunchedEffect;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
        DirectDepositManualFormDetailsViewEvent directDepositManualFormDetailsViewEvent = (DirectDepositManualFormDetailsViewEvent) obj;
        if (Intrinsics.areEqual(directDepositManualFormDetailsViewEvent, DirectDepositManualFormDetailsViewEvent.NavigationIconClick.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (directDepositManualFormDetailsViewEvent instanceof DirectDepositManualFormDetailsViewEvent.CheckAddSignature) {
            mutableState4.setValue(Boolean.valueOf(((DirectDepositManualFormDetailsViewEvent.CheckAddSignature) directDepositManualFormDetailsViewEvent).checked));
        } else if (Intrinsics.areEqual(directDepositManualFormDetailsViewEvent, DirectDepositManualFormDetailsViewEvent.CreateForm.INSTANCE)) {
            screenNavigator.goTo(new DirectDepositManualFormCompletionScreen(((DirectDepositManualFormDetailsScreen) cardStudioPresenter.appConfig).token, new DirectDepositManualFormSubmissionScreen.FormDetails((String) mutableState3.getValue(), (String) mutableState2.getValue(), (PaycheckDepositAllocation) mutableState.getValue(), ((Boolean) mutableState4.getValue()).booleanValue())));
        } else if (Intrinsics.areEqual(directDepositManualFormDetailsViewEvent, DirectDepositManualFormDetailsViewEvent.EditCompanyName.INSTANCE)) {
            final int i = 0;
            screenNavigator.askQuestion(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.INSTANCE, new Function1() { // from class: com.squareup.cash.directdeposit.presenters.DirectDepositManualFormDetailsPresenter$models$4$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i2 = i;
                    MutableState mutableState5 = mutableState2;
                    CardStudioPresenter cardStudioPresenter2 = cardStudioPresenter;
                    switch (i2) {
                        case 0:
                            AskedQuestion askedQuestion = (AskedQuestion) obj2;
                            askedQuestion.getClass();
                            return new DirectDepositEditCompanyNameScreen(((DirectDepositManualFormDetailsScreen) cardStudioPresenter2.appConfig).token, (String) mutableState5.getValue(), askedQuestion);
                        default:
                            AskedQuestion askedQuestion2 = (AskedQuestion) obj2;
                            askedQuestion2.getClass();
                            return new DirectDepositEditFullNameScreen(((DirectDepositManualFormDetailsScreen) cardStudioPresenter2.appConfig).token, (String) mutableState5.getValue(), askedQuestion2);
                    }
                }
            });
        } else if (Intrinsics.areEqual(directDepositManualFormDetailsViewEvent, DirectDepositManualFormDetailsViewEvent.EditName.INSTANCE)) {
            final int i2 = 1;
            screenNavigator.askQuestion(DirectDepositEditFullNameScreen.FullNameQuestion.INSTANCE, new Function1() { // from class: com.squareup.cash.directdeposit.presenters.DirectDepositManualFormDetailsPresenter$models$4$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i22 = i2;
                    MutableState mutableState5 = mutableState3;
                    CardStudioPresenter cardStudioPresenter2 = cardStudioPresenter;
                    switch (i22) {
                        case 0:
                            AskedQuestion askedQuestion = (AskedQuestion) obj2;
                            askedQuestion.getClass();
                            return new DirectDepositEditCompanyNameScreen(((DirectDepositManualFormDetailsScreen) cardStudioPresenter2.appConfig).token, (String) mutableState5.getValue(), askedQuestion);
                        default:
                            AskedQuestion askedQuestion2 = (AskedQuestion) obj2;
                            askedQuestion2.getClass();
                            return new DirectDepositEditFullNameScreen(((DirectDepositManualFormDetailsScreen) cardStudioPresenter2.appConfig).token, (String) mutableState5.getValue(), askedQuestion2);
                    }
                }
            });
        } else {
            if (!Intrinsics.areEqual(directDepositManualFormDetailsViewEvent, DirectDepositManualFormDetailsViewEvent.EditPaycheckAmount.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            screenNavigator.askQuestion(new DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion((PaycheckDepositAllocation) mutableState.getValue()), new KClasses$$Lambda$2(cardStudioPresenter, 14));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object emit$com$squareup$cash$family$familyhub$presenters$DependentDetailPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        SponsoredAccountManageTapBalance.BalanceType balanceType;
        Object obj2;
        State state = (State) this.$earningCardUpdating$delegate$inlined;
        SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) this.this$0;
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) savingsScreenPresenter.savingsBalanceStore;
        RealRouter realRouter = savingsScreenPresenter.router;
        SessionManager sessionManager = savingsScreenPresenter.sessionManager;
        Analytics analytics = savingsScreenPresenter.analytics;
        BetterNavigator.ScreenNavigator screenNavigator = savingsScreenPresenter.navigator;
        DependentDetailScreen dependentDetailScreen = (DependentDetailScreen) savingsScreenPresenter.oneErrorPerAppSessionStrategy;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        DependentDetailViewEvent dependentDetailViewEvent = (DependentDetailViewEvent) obj;
        int i = 0;
        int i2 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (dependentDetailViewEvent instanceof DependentDetailViewEvent.TapSendCash) {
            JobKt.launch$default(coroutineScope, null, null, new DependentDetailPresenter$models$3$1(savingsScreenPresenter, objArr2 == true ? 1 : 0, i), 3);
        } else if (dependentDetailViewEvent instanceof DependentDetailViewEvent.TapBack) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (dependentDetailViewEvent instanceof DependentDetailViewEvent.SeeAllActivitiesEvent) {
            analytics.track(new SponsoredAccountReviewActivityTapSeeAll(PlatformKt.activeAccountToken(sessionManager), dependentDetailScreen.dependentCustomerToken), null);
            screenNavigator.goTo(new DependentActivityScreen(DependentActivityScreen.ActivityType.ALL_ACTIVITIES, dependentDetailScreen.dependentCustomerToken, false));
        } else if (dependentDetailViewEvent instanceof DependentDetailViewEvent.OpenControlsAndLimitClicked) {
            analytics.track(new SponsoredAccountManageNavigateToSettings(PlatformKt.activeAccountToken(sessionManager), dependentDetailScreen.dependentCustomerToken), null);
            screenNavigator.goTo(new DependentControlsAndLimitsScreen(dependentDetailScreen.dependentCustomerToken, false));
        } else if (dependentDetailViewEvent instanceof DependentDetailViewEvent.AllowanceSectionEvent) {
            AllowanceSectionViewEvent$TapAllowanceView allowanceSectionViewEvent$TapAllowanceView = ((DependentDetailViewEvent.AllowanceSectionEvent) dependentDetailViewEvent).allowanceSectionViewEvent;
            RecurringPayments recurringPayments = (RecurringPayments) ((MutableState) this.$showCardManagementSheet$delegate$inlined).getValue();
            recurringPayments.getClass();
            RecurringPayments.Loaded loaded = (RecurringPayments.Loaded) recurringPayments;
            AllowanceViewEvent allowanceViewEvent = allowanceSectionViewEvent$TapAllowanceView.allowanceViewEvent;
            if (Intrinsics.areEqual(allowanceViewEvent, AllowanceViewEvent.TapNoAllowanceInDependentDetail.INSTANCE)) {
                String str = loaded.initializationUrl;
                str.getClass();
                analytics.track(new SponsoredAccountManageAllowanceStartCreation(PlatformKt.activeAccountToken(sessionManager), dependentDetailScreen.dependentCustomerToken), null);
                DependentDetailScreen dependentDetailScreen2 = (DependentDetailScreen) savingsScreenPresenter.oneErrorPerAppSessionStrategy;
                realRouter.route(new RoutingParams(dependentDetailScreen2, null, dependentDetailScreen2, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
            } else {
                if (Intrinsics.areEqual(allowanceViewEvent, AllowanceViewEvent.TapNoAllowanceInSponsorDetail.INSTANCE)) {
                    a$$ExternalSyntheticBUOutline0.m$1("TapNoAllowanceInSponsorDetail is impossible on DependentDetailView");
                    return null;
                }
                if (!(allowanceViewEvent instanceof AllowanceViewEvent.TapAllowanceDetail)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Iterator it = loaded.recurringPayments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((RecurringPayment) obj2).token.equals(((AllowanceViewEvent.TapAllowanceDetail) allowanceViewEvent).allowanceToken)) {
                        break;
                    }
                }
                RecurringPayment recurringPayment = (RecurringPayment) obj2;
                String str2 = recurringPayment != null ? recurringPayment.editUrl : null;
                str2.getClass();
                DependentDetailScreen dependentDetailScreen3 = (DependentDetailScreen) savingsScreenPresenter.oneErrorPerAppSessionStrategy;
                realRouter.route(new RoutingParams(dependentDetailScreen3, null, dependentDetailScreen3, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str2);
            }
        } else if (dependentDetailViewEvent instanceof DependentDetailViewEvent.BalanceTapped) {
            int ordinal = ((DependentDetailViewEvent.BalanceTapped) dependentDetailViewEvent).name.ordinal();
            if (ordinal == 1) {
                screenNavigator.goTo(new DependentGeneralSavingsScreen(dependentDetailScreen.dependentCustomerToken, SavingsScreen.ScreenType.Home.INSTANCE));
                balanceType = SponsoredAccountManageTapBalance.BalanceType.Savings;
            } else if (ordinal == 2) {
                if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesFamilyAppletPhaseFStocks.INSTANCE)).enabled()) {
                    String str3 = dependentDetailScreen.dependentCustomerToken;
                    boolean booleanValue = ((Boolean) ((State) this.$content$delegate$inlined).getValue()).booleanValue();
                    Recipient recipient = (Recipient) state.getValue();
                    screenNavigator.goTo(new InvestingScreens.InvestingHome(str3, recipient != null ? recipient.getFirstName() : null, 7, booleanValue));
                }
                balanceType = SponsoredAccountManageTapBalance.BalanceType.Stocks;
            } else if (ordinal != 3) {
                balanceType = null;
            } else {
                if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesFamilyAppletPhaseFBitcoin.INSTANCE)).enabled()) {
                    screenNavigator.goTo(new BitcoinHome(null, null, dependentDetailScreen.dependentCustomerToken, null, 11));
                }
                balanceType = SponsoredAccountManageTapBalance.BalanceType.Bitcoin;
            }
            if (balanceType != null) {
                analytics.track(new SponsoredAccountManageTapBalance(dependentDetailScreen.dependentCustomerToken, balanceType), null);
            }
        } else if (dependentDetailViewEvent instanceof DependentDetailViewEvent.TapProfile) {
            JobKt.launch$default(coroutineScope, null, null, new DependentDetailPresenter$models$3$1(savingsScreenPresenter, objArr == true ? 1 : 0, i2), 3);
        } else if (dependentDetailViewEvent instanceof DependentDetailViewEvent.OpenNotificationSettingsClicked) {
            screenNavigator.goTo(new DependentControlScreen.Toggle(ControlType.NOTIFICATIONS, dependentDetailScreen.dependentCustomerToken));
        } else {
            if (!(dependentDetailViewEvent instanceof DependentDetailViewEvent.TapShowQrCode)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            analytics.track(new SponsoredAccountQRCodeView(PlatformKt.activeAccountToken(sessionManager), dependentDetailScreen.dependentCustomerToken), null);
            Recipient recipient2 = (Recipient) state.getValue();
            if (recipient2 != null) {
                String fromString = Cashtags.fromString(recipient2.cashtag, recipient2.region);
                String str4 = recipient2.fullName;
                if (fromString != null && str4 != null) {
                    screenNavigator.goTo(new TeenQrCodeScreen(dependentDetailScreen.dependentCustomerToken, str4, fromString, recipient2.region, dependentDetailScreen));
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [app.cash.broadway.screen.Screen, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$ScreenNavigator] */
    private final Object emit$com$squareup$cash$family$requestsponsorship$presenters$SelectSponsorPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        BlockerAction blockerAction;
        BlockersData blockersData;
        SelectSponsorPresenter selectSponsorPresenter = (SelectSponsorPresenter) this.this$0;
        SelectSponsorScreen selectSponsorScreen = selectSponsorPresenter.selectSponsorScreen;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        SelectSponsorViewEvent selectSponsorViewEvent = (SelectSponsorViewEvent) obj;
        ?? r4 = 0;
        r4 = 0;
        if (selectSponsorViewEvent instanceof SelectSponsorViewEvent.EnableContact) {
            JobKt.launch$default(coroutineScope, null, null, new GooglePayPresenter$models$1$1(selectSponsorPresenter, r4, 24), 3);
        } else if (selectSponsorViewEvent instanceof SelectSponsorViewEvent.Search) {
            JobKt.launch$default(coroutineScope, null, null, new GLSceneScopeProvider$SceneScope$2$1$1(selectSponsorPresenter, selectSponsorViewEvent, (MutableStateFlow) this.$content$delegate$inlined, (Continuation) r4, 12), 3);
        } else if (selectSponsorViewEvent instanceof SelectSponsorViewEvent.SponsorRowTapped) {
            JobKt.launch$default(coroutineScope, null, null, new AnimationsKt$takeUntil$1$1.AnonymousClass1(selectSponsorPresenter, selectSponsorViewEvent, (MutableState) this.$earningCardUpdating$delegate$inlined, r4, 5), 3);
        } else if (selectSponsorViewEvent instanceof SelectSponsorViewEvent.DialogDismissed) {
            ((MutableState) this.$showCardManagementSheet$delegate$inlined).setValue(Boolean.FALSE);
        } else if (selectSponsorViewEvent instanceof SelectSponsorViewEvent.ClosePressed) {
            ?? r8 = selectSponsorPresenter.navigator;
            BlockersScreens blockersScreens = selectSponsorScreen;
            if (selectSponsorScreen == null) {
                blockersScreens = selectSponsorPresenter.selectDependentScreen;
            }
            if (blockersScreens != null && (blockersData = blockersScreens.getBlockersData()) != null) {
                r4 = blockersData.exitScreen;
            }
            r4.getClass();
            r8.goTo(r4);
        } else {
            if (!(selectSponsorViewEvent instanceof SelectSponsorViewEvent.SendInviteTapped)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (selectSponsorScreen != null && (blockerAction = selectSponsorScreen.inviteContactAction) != null) {
                JobKt.launch$default(coroutineScope, null, null, new FormCashtag.AnonymousClass8.AnonymousClass2(selectSponsorPresenter, blockerAction, r4, 12), 3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$favorites$presenters$AddFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2(Object obj, Continuation continuation) {
        AddFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1 addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1;
        int i;
        Region region;
        SectionViewModel sectionViewModel;
        String str;
        SectionViewModel.Type type2;
        SectionViewModel.Type type3;
        LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
        if (continuation instanceof AddFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1) {
            addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1 = (AddFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1) continuation;
            int i2 = addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1.label;
                int i3 = 1;
                Object obj3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.$$this$LaunchedEffect;
                    List<Section> list = ((RecipientRepository$Result) obj).sections;
                    RecipientRepository$Result.Status status = RecipientRepository$Result.Status.SUCCESS;
                    MutableState mutableState = (MutableState) this.$showCardManagementSheet$delegate$inlined;
                    RecipientRepository$Result.Status status2 = RecipientRepository$Result.Status.SUCCESS;
                    mutableState.setValue(null);
                    ((MutableState) this.$earningCardUpdating$delegate$inlined).setValue(Boolean.FALSE);
                    AndroidStringManager androidStringManager = (AndroidStringManager) localHomePresenter.syncer;
                    Region region2 = (Region) this.$content$delegate$inlined;
                    if (region2 == null) {
                        region2 = Region.USA;
                    }
                    list.getClass();
                    region2.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Section section : list) {
                        List list2 = section.recipients;
                        Section.Type type4 = section.f1192type;
                        if (list2.isEmpty()) {
                            region = region2;
                            sectionViewModel = null;
                        } else {
                            int ordinal = type4.ordinal();
                            if (ordinal == 0) {
                                str = androidStringManager.get(R.string.suggested_header);
                            } else if (ordinal == i3) {
                                str = androidStringManager.get(R.string.contacts_header);
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj3;
                                }
                                str = androidStringManager.get(R.string.results_header);
                            }
                            int ordinal2 = type4.ordinal();
                            if (ordinal2 == 0) {
                                type2 = SectionViewModel.Type.SUGGESTED;
                            } else if (ordinal2 == i3) {
                                type2 = SectionViewModel.Type.CONTACTS;
                            } else {
                                if (ordinal2 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj3;
                                }
                                type2 = SectionViewModel.Type.RESULTS;
                            }
                            List list3 = section.recipients;
                            int ordinal3 = type4.ordinal();
                            if (ordinal3 == 0) {
                                type3 = SectionViewModel.Type.SUGGESTED;
                            } else if (ordinal3 == i3) {
                                type3 = SectionViewModel.Type.CONTACTS;
                            } else {
                                if (ordinal3 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj3;
                                }
                                type3 = SectionViewModel.Type.RESULTS;
                            }
                            SectionViewModel.Type type5 = type3;
                            list3.getClass();
                            List<com.squareup.cash.recipients.data.Recipient> list4 = list3;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                            for (com.squareup.cash.recipients.data.Recipient recipient : list4) {
                                String str2 = recipient.customerId;
                                String str3 = recipient.displayName;
                                String str4 = (str2 == null && (str2 = recipient.lookupKey) == null) ? "" : str2;
                                String str5 = str3 == null ? "" : str3;
                                String recipientSubtitle = UriKt.getRecipientSubtitle(recipient, region2, androidStringManager);
                                arrayList2.add(new FavoriteViewModel(recipient, str4, str5, recipientSubtitle == null ? "" : recipientSubtitle, str3 != null ? Character.valueOf(Character.toUpperCase(str3.charAt(0))) : null, false, recipient.isFavorited, recipient.isVerified, recipient.isBusiness, recipient.photo, recipient.getAccentColor(), type5));
                                region2 = region2;
                            }
                            region = region2;
                            sectionViewModel = new SectionViewModel(str, type2, arrayList2);
                        }
                        if (sectionViewModel != null) {
                            arrayList.add(sectionViewModel);
                        }
                        region2 = region;
                        i3 = 1;
                        obj3 = null;
                    }
                    addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1.label = i3;
                    if (flowCollector.emit(arrayList, addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1 = new AddFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2$1.label;
        int i32 = 1;
        Object obj32 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0064, code lost:
    
        if (r4 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$globalsearch$presenters$GlobalSearchQueryPresenter$models$state$2$1$1(Object obj, Continuation continuation) {
        boolean z;
        boolean z2;
        GlobalSearchQueryPresenter$IntermediateState globalSearchQueryPresenter$IntermediateState;
        ArrayList arrayList;
        SectionPresenter rowSectionPresenter;
        SearchResult searchResult = (SearchResult) obj;
        ProduceStateScope produceStateScope = (ProduceStateScope) this.$$this$LaunchedEffect;
        StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) this.this$0;
        if (!((GlobalSearchScreen) stuckPlayerDetector.playerListener).isActivityOnlySearch || ((Boolean) ((MutableState) this.$showCardManagementSheet$delegate$inlined).getValue()).booleanValue()) {
            CharSequence charSequence = (CharSequence) this.$content$delegate$inlined;
            z = false;
            if (charSequence instanceof String) {
                z2 = ((String) charSequence).equalsIgnoreCase("pay over time available");
            } else {
                if (charSequence != "pay over time available") {
                    if (charSequence != null && charSequence.length() == 23) {
                        int length = charSequence.length();
                        for (int i = 0; i < length; i++) {
                            if (CharsKt__CharKt.equals(charSequence.charAt(i), "pay over time available".charAt(i), true)) {
                            }
                        }
                    }
                    z2 = false;
                    break;
                }
                z2 = true;
            }
        }
        z = true;
        AndroidStringManager androidStringManager = (AndroidStringManager) stuckPlayerDetector.stuckPlayingNotEndingDetector;
        GlobalSearchScreen globalSearchScreen = (GlobalSearchScreen) stuckPlayerDetector.playerListener;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) stuckPlayerDetector.player;
        if (searchResult instanceof SearchResult.HasSections) {
            List<RealGlobalSearchRepository.RealSectionHandle> sections = ((SearchResult.HasSections) searchResult).getSections();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sections, 10));
            for (RealGlobalSearchRepository.RealSectionHandle realSectionHandle : sections) {
                GlobalSearchResponseSectionModel globalSearchResponseSectionModel = (GlobalSearchResponseSectionModel) ((Function0) realSectionHandle.section.getValue).invoke();
                if (globalSearchResponseSectionModel instanceof GlobalSearchResponseSectionModel.Activities) {
                    ActivitySectionPresenter$Factory$Impl activitySectionPresenter$Factory$Impl = (ActivitySectionPresenter$Factory$Impl) stuckPlayerDetector.clock;
                    RealGooglePayer$$ExternalSyntheticLambda0 realGooglePayer$$ExternalSyntheticLambda0 = new RealGooglePayer$$ExternalSyntheticLambda0(stuckPlayerDetector, 6);
                    globalSearchScreen.getClass();
                    LocalHomePresenter.MetroFactory metroFactory = activitySectionPresenter$Factory$Impl.delegateFactory;
                    ActivityItemPresenter.Factory factory = (ActivityItemPresenter.Factory) metroFactory.store.invoke();
                    DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) metroFactory.clearMarketingBadgesIfNeeded.invoke();
                    Analytics analytics = (Analytics) metroFactory.syncer.getValue();
                    RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = (RealGlobalSearchAnalyticsHelper) metroFactory.featureFlagManager.getValue();
                    RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) metroFactory.tabContentPresenterFactory.invoke();
                    GlobalSearchActivityEventDecorator$Factory$Impl globalSearchActivityEventDecorator$Factory$Impl = (GlobalSearchActivityEventDecorator$Factory$Impl) metroFactory.localHomeGeoPresenterFactory.value;
                    factory.getClass();
                    defaultActivityItemEventHandler$Factory$Impl.getClass();
                    analytics.getClass();
                    realGlobalSearchAnalyticsHelper.getClass();
                    realActivityTokenFactory.getClass();
                    globalSearchActivityEventDecorator$Factory$Impl.getClass();
                    arrayList = arrayList2;
                    rowSectionPresenter = new ActivitySectionPresenter(screenNavigator, globalSearchScreen, realSectionHandle, realGooglePayer$$ExternalSyntheticLambda0, factory, defaultActivityItemEventHandler$Factory$Impl, analytics, realGlobalSearchAnalyticsHelper, realActivityTokenFactory, globalSearchActivityEventDecorator$Factory$Impl);
                } else {
                    arrayList = arrayList2;
                    if (!(globalSearchResponseSectionModel instanceof GlobalSearchResponseSectionModel.Rows)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RowSectionPresenter$Factory$Impl rowSectionPresenter$Factory$Impl = (RowSectionPresenter$Factory$Impl) stuckPlayerDetector.period;
                    globalSearchScreen.getClass();
                    ComponentRegistry.Builder builder = rowSectionPresenter$Factory$Impl.delegateFactory;
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) builder.interceptors).invoke();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) ((DoubleCheck) builder.mappers).getValue();
                    Analytics analytics2 = (Analytics) ((DoubleCheck) builder.keyers).getValue();
                    RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper2 = (RealGlobalSearchAnalyticsHelper) ((DoubleCheck) builder.lazyFetcherFactories).getValue();
                    RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext = (RealGlobalSearchAnalyticsContext) ((DoubleCheck) builder.lazyDecoderFactories).getValue();
                    realRouter$Factory$Impl.getClass();
                    realClientRouteParser.getClass();
                    analytics2.getClass();
                    realGlobalSearchAnalyticsHelper2.getClass();
                    realGlobalSearchAnalyticsContext.getClass();
                    rowSectionPresenter = new RowSectionPresenter(screenNavigator, globalSearchScreen, realSectionHandle, realRouter$Factory$Impl, realClientRouteParser, analytics2, realGlobalSearchAnalyticsHelper2, realGlobalSearchAnalyticsContext);
                }
                arrayList.add(rowSectionPresenter);
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (z ? ((SectionPresenter) next) instanceof ActivitySectionPresenter : true) {
                    arrayList3.add(next);
                }
            }
            if (arrayList3.isEmpty()) {
                final GlobalSearchViewModel.NoResults noResults = GlobalSearchViewModel.NoResults.INSTANCE;
                globalSearchQueryPresenter$IntermediateState = new GlobalSearchQueryPresenter$IntermediateState(CollectionsKt__CollectionsJVMKt.listOf(new SectionPresenter(noResults) { // from class: com.squareup.cash.globalsearch.presenters.GlobalSearchQueryPresenter$SimpleSectionPresenter
                    public final GlobalSearchViewModel.Section section;

                    {
                        this.section = noResults;
                    }

                    @Override // com.squareup.cash.globalsearch.presenters.SectionPresenter
                    public final GlobalSearchViewModel.Section models(GapComposer gapComposer) {
                        gapComposer.startReplaceGroup(-570511204);
                        gapComposer.end(false);
                        return this.section;
                    }
                }), null);
            } else {
                globalSearchQueryPresenter$IntermediateState = new GlobalSearchQueryPresenter$IntermediateState(arrayList3, searchResult instanceof SearchResult.LocalOnly ? new GlobalSearchViewModel.ErrorToast(androidStringManager.get(R.string.global_search_error_toast_title), androidStringManager.get(R.string.global_search_error_toast_body)) : null);
            }
        } else {
            if (!Intrinsics.areEqual(searchResult, SearchResult.Error.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            final GlobalSearchViewModel.SearchError searchError = GlobalSearchViewModel.SearchError.INSTANCE;
            globalSearchQueryPresenter$IntermediateState = new GlobalSearchQueryPresenter$IntermediateState(CollectionsKt__CollectionsJVMKt.listOf(new SectionPresenter(searchError) { // from class: com.squareup.cash.globalsearch.presenters.GlobalSearchQueryPresenter$SimpleSectionPresenter
                public final GlobalSearchViewModel.Section section;

                {
                    this.section = searchError;
                }

                @Override // com.squareup.cash.globalsearch.presenters.SectionPresenter
                public final GlobalSearchViewModel.Section models(GapComposer gapComposer) {
                    gapComposer.startReplaceGroup(-570511204);
                    gapComposer.end(false);
                    return this.section;
                }
            }), null);
        }
        produceStateScope.setValue(globalSearchQueryPresenter$IntermediateState);
        ((MutableState) this.$earningCardUpdating$delegate$inlined).setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        if (r4.emit(r6, r7) != r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$google$pay$CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2(Object obj, Continuation continuation) {
        CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1 cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1;
        int i;
        int i2;
        FlowCollector flowCollector;
        IssuedCardFactory.IssuedCard issuedCard;
        boolean z;
        if (continuation instanceof CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1) {
            cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1 = (CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1) continuation;
            int i3 = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1.label = i3 - PKIFailureInfo.systemUnavail;
                CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1 cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12 = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1;
                Object obj2 = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.$$this$LaunchedEffect;
                    IssuedCardFactory.IssuedCard issuedCard2 = (IssuedCardFactory.IssuedCard) obj;
                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) this.this$0;
                    Analytics analytics = (Analytics) markwonConfiguration.imageDestinationProcessor;
                    BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen = (BlockersScreens.ProvisionGooglePayScreen) this.$content$delegate$inlined;
                    BlockersData blockersData = provisionGooglePayScreen.blockersData;
                    AndroidStringManager androidStringManager = (AndroidStringManager) markwonConfiguration.spansFactory;
                    RegisterAliasPresenter$register$result$1 registerAliasPresenter$register$result$1 = new RegisterAliasPresenter$register$result$1((Object) markwonConfiguration, (BlockersScreens) provisionGooglePayScreen, (Object) issuedCard2, (String) this.$showCardManagementSheet$delegate$inlined, this.$earningCardUpdating$delegate$inlined, (Continuation) null, 3);
                    cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.L$4 = flowCollector2;
                    cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.L$6 = issuedCard2;
                    i2 = 0;
                    cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.I$0 = 0;
                    cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.label = 1;
                    Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, analytics, androidStringManager, cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12, CashLiteGooglePayProvisioningGateway$provision$2$result$1.INSTANCE, registerAliasPresenter$register$result$1);
                    if (trackBlockerSubmissionAnalytics$default != coroutineSingletons) {
                        flowCollector = flowCollector2;
                        obj2 = trackBlockerSubmissionAnalytics$default;
                        issuedCard = issuedCard2;
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
                i2 = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.I$0;
                issuedCard = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.L$6;
                flowCollector = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.L$4;
                SafeTrace.throwOnFailure(obj2);
                ApiResult apiResult = (ApiResult) obj2;
                z = apiResult instanceof ApiResult.Success;
                Object obj3 = GooglePayProvisioningPayload.Error.INSTANCE;
                if (!z) {
                    PushProvisionGooglePayResponse pushProvisionGooglePayResponse = (PushProvisionGooglePayResponse) ((ApiResult.Success) apiResult).response;
                    String str = pushProvisionGooglePayResponse.opaque_payment_card;
                    if (pushProvisionGooglePayResponse.status == PushProvisionStatus.PUSH_PROVISION_STATUS_SUCCESS && str != null) {
                        obj3 = new GooglePayProvisioningPayload.Success(str, issuedCard.lastFour);
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.L$4 = null;
                cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.L$6 = null;
                cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.I$0 = i2;
                cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$12.label = 2;
            }
        }
        cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1 = new CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1(this, continuation);
        CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1 cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$122 = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$1;
        Object obj22 = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj22;
        z = apiResult2 instanceof ApiResult.Success;
        Object obj32 = GooglePayProvisioningPayload.Error.INSTANCE;
        if (!z) {
        }
        cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$122.L$4 = null;
        cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$122.L$6 = null;
        cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$122.I$0 = i2;
        cashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2$122.label = 2;
    }

    private final Object emit$com$squareup$cash$growtools$presenters$manager$autoinvest$GrowToolsAutoInvestManager$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        String str;
        GrowToolsManagerState growToolsManagerState = (GrowToolsManagerState) this.$content$delegate$inlined;
        GrowToolsAutoInvestManager growToolsAutoInvestManager = (GrowToolsAutoInvestManager) this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = growToolsAutoInvestManager.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        GrowToolsManagerViewEvent growToolsManagerViewEvent = (GrowToolsManagerViewEvent) obj;
        if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ActivityShowMoreTapped.INSTANCE)) {
            screenNavigator.goTo(new GrowToolsCompleteActivityScreen(growToolsAutoInvestManager.args));
        } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.Back.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else {
            int i = 3;
            Continuation continuation2 = null;
            if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ChangeButtonTapped.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new RealKeyStoreProvider$load$2(growToolsAutoInvestManager, continuation2, i), 3);
            } else {
                int i2 = 1;
                int i3 = 0;
                if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.DialogConfirmTapped.INSTANCE)) {
                    growToolsManagerState.setShowDialog(null);
                    growToolsManagerState.setInteractive(false);
                    JobKt.launch$default(growToolsAutoInvestManager.activityScope, null, null, new CheckStatusPresenter.AnonymousClass1(growToolsAutoInvestManager, growToolsManagerState, continuation2, i2), 3);
                } else if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DialogDismissTapped) {
                    growToolsManagerState.setShowDialog(null);
                    growToolsManagerState.setInteractive(true);
                } else if (!Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.TargetAvatarTapped.INSTANCE)) {
                    if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.ToggleTapped) {
                        if (((OriginSpecificData) ((MutableState) this.$showCardManagementSheet$delegate$inlined).getValue()).enabled) {
                            growToolsManagerState.setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.TOGGLE_OFF_CONFIRMATION));
                        } else {
                            growToolsManagerState.setInteractive(false);
                            AutoInvestPreference autoInvestPreference = (AutoInvestPreference) ((MutableState) this.$earningCardUpdating$delegate$inlined).getValue();
                            autoInvestPreference.getClass();
                            String format2 = growToolsAutoInvestManager.moneyFormatter.format(autoInvestPreference.amount);
                            int length = format2.length();
                            while (true) {
                                if (i3 >= length) {
                                    str = "";
                                    break;
                                }
                                if (format2.charAt(i3) != '$') {
                                    str = format2.substring(i3);
                                    break;
                                }
                                i3++;
                            }
                            BitcoinTransferScreen bitcoinTransferScreen = new BitcoinTransferScreen(true, true, BitcoinTransferScreen.OrderType.Standard.INSTANCE, new BitcoinTransferScreen.SavedState(new AmountSheetSavedState.AmountKeypadState(str)), growToolsAutoInvestManager.args, null, null, 512);
                            screenNavigator.goTo(new InvestingScreens.RecurringFrequencyPickerFullScreen(InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin.INSTANCE, autoInvestPreference.recurringSchedule.frequency, ColorModel.Bitcoin.INSTANCE, new BitcoinExchangeFullScreen(bitcoinTransferScreen), OrderSide.BUY, growToolsAutoInvestManager.args, false, false));
                        }
                    } else if (!(growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DetailRowTapped)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$growtools$presenters$manager$roundups$GrowToolsRoundUpsManager$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Automation.AutomationTarget automationTarget;
        Automation.AutomationTarget automationTarget2;
        MutableState mutableState = (MutableState) this.$earningCardUpdating$delegate$inlined;
        GrowToolsManagerState growToolsManagerState = (GrowToolsManagerState) this.$content$delegate$inlined;
        RealAccountOutboundNavigator realAccountOutboundNavigator = (RealAccountOutboundNavigator) this.this$0;
        CoroutineScope coroutineScope = (CoroutineScope) realAccountOutboundNavigator.transfersInboundNavigatorFactory;
        GrowToolsManagerScreen.ManageRoundUpsScreen manageRoundUpsScreen = (GrowToolsManagerScreen.ManageRoundUpsScreen) realAccountOutboundNavigator.featureFlagManager;
        BetterNavigator.ScreenNavigator screenNavigator = realAccountOutboundNavigator.navigator;
        Analytics analytics = realAccountOutboundNavigator.analytics;
        CoroutineScope coroutineScope2 = (CoroutineScope) this.$$this$LaunchedEffect;
        GrowToolsManagerViewEvent growToolsManagerViewEvent = (GrowToolsManagerViewEvent) obj;
        if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.Back.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else {
            boolean z = true;
            boolean z2 = false;
            Continuation continuation2 = null;
            if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.ToggleTapped) {
                analytics.track(new RoundUpsChangeToggleOnOff(), null);
                com.squareup.cash.growtools.presenters.manager.roundups.OriginSpecificData originSpecificData = (com.squareup.cash.growtools.presenters.manager.roundups.OriginSpecificData) ((MutableState) this.$showCardManagementSheet$delegate$inlined).getValue();
                if (originSpecificData == null || !originSpecificData.active) {
                    growToolsManagerState.setInteractive(false);
                    if (manageRoundUpsScreen.origin == GrowToolsManagerScreen.Origin.BITCOIN) {
                        Automation automation = (Automation) mutableState.getValue();
                        if (((automation == null || (automationTarget2 = automation.target) == null) ? null : automationTarget2.f1279type) != Automation.AutomationTarget.Type.CRYPTOCURRENCY) {
                            JobKt.launch$default(coroutineScope2, null, null, new RealKeyStoreProvider$load$2(realAccountOutboundNavigator, continuation2, 5), 3);
                        }
                    }
                    JobKt.launch$default(coroutineScope, null, null, new RoomDatabase$performClear$1.AnonymousClass1((Automation) mutableState.getValue(), z, realAccountOutboundNavigator, growToolsManagerState, (Continuation) null, 11), 3);
                } else {
                    growToolsManagerState.setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.TOGGLE_OFF_CONFIRMATION));
                }
            } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ChangeButtonTapped.INSTANCE)) {
                analytics.track(new RoundUpsChangeTapDestination(), null);
                realAccountOutboundNavigator.startChangeDestinationFlow(null, null);
            } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ActivityShowMoreTapped.INSTANCE)) {
                analytics.track(new RoundUpsChangeTapActivityPresentAll(), null);
                screenNavigator.goTo(new GrowToolsCompleteActivityScreen(manageRoundUpsScreen));
            } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.DialogConfirmTapped.INSTANCE)) {
                growToolsManagerState.setShowDialog(null);
                growToolsManagerState.setInteractive(false);
                JobKt.launch$default(coroutineScope, null, null, new RoomDatabase$performClear$1.AnonymousClass1((Automation) mutableState.getValue(), z2, realAccountOutboundNavigator, growToolsManagerState, (Continuation) null, 11), 3);
            } else if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DialogDismissTapped) {
                growToolsManagerState.setShowDialog(null);
                growToolsManagerState.setInteractive(true);
            } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.TargetAvatarTapped.INSTANCE)) {
                analytics.track(new RoundUpsChangeTapDestinationAsset(), null);
                Automation automation2 = (Automation) mutableState.getValue();
                if (automation2 != null && (automationTarget = automation2.target) != null) {
                    RoundUpsAutomationTarget target = RandomKt.toTarget(realAccountOutboundNavigator, automationTarget);
                    if (target instanceof RoundUpsAutomationTarget.InvestmentEntity) {
                        screenNavigator.goTo(new InvestingScreens.StockDetails(null, new InvestmentEntityToken(((RoundUpsAutomationTarget.InvestmentEntity) target).identifier), StockViewViewStockDetails.InvestingScreenOrigin.ROUND_UP, new InvestingScreens.StockDetails.Origin.Tradable(false), null, false, 49));
                    } else {
                        boolean z3 = target instanceof RoundUpsAutomationTarget.SavingsBalance;
                        SavingsScreen.ScreenType.Home home = SavingsScreen.ScreenType.Home.INSTANCE;
                        if (z3) {
                            screenNavigator.goTo(new GeneralSavingsScreen(home));
                        } else if (target instanceof RoundUpsAutomationTarget.CryptoCurrency) {
                            screenNavigator.goTo(new BitcoinHome(null, null, null, null, 15));
                        } else {
                            if (!(target instanceof RoundUpsAutomationTarget.SavingsGoals)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            String str = ((RoundUpsAutomationTarget.SavingsGoals) target).identifier;
                            if (str == null) {
                                screenNavigator.goTo(new GeneralSavingsScreen(home));
                            } else {
                                screenNavigator.goTo(new GeneralSavingsScreen(new SavingsScreen.ScreenType.GoalDetail(str)));
                            }
                        }
                    }
                }
            } else if (!(growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DetailRowTapped)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$instruments$presenters$InstrumentSelectionBlockerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$earningCardUpdating$delegate$inlined;
        MutableState mutableState2 = (MutableState) this.$content$delegate$inlined;
        MutableState mutableState3 = (MutableState) this.$showCardManagementSheet$delegate$inlined;
        InstrumentSelectionBlockerPresenter instrumentSelectionBlockerPresenter = (InstrumentSelectionBlockerPresenter) this.this$0;
        Analytics analytics = instrumentSelectionBlockerPresenter.analytics;
        InstrumentSelectionBlockerScreen instrumentSelectionBlockerScreen = instrumentSelectionBlockerPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        InstrumentSelectionBlockerViewEvent instrumentSelectionBlockerViewEvent = (InstrumentSelectionBlockerViewEvent) obj;
        Continuation continuation2 = null;
        if (Intrinsics.areEqual(instrumentSelectionBlockerViewEvent, InstrumentSelectionBlockerViewEvent.CloseClick.INSTANCE)) {
            analytics.track(new InstrumentSelectClose(String.valueOf(instrumentSelectionBlockerScreen.blockersData.clientScenario), instrumentSelectionBlockerScreen.blockersData.flowToken), null);
            BetterNavigator.ScreenNavigator screenNavigator = instrumentSelectionBlockerPresenter.navigator;
            screenNavigator.goTo(Back.INSTANCE);
            screenNavigator.goTo(instrumentSelectionBlockerScreen.blockersData.exitScreen);
        } else if (instrumentSelectionBlockerViewEvent instanceof InstrumentSelectionBlockerViewEvent.InstrumentOptionClick) {
            InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex selectedInstrumentOptionIndex = ((InstrumentSelectionBlockerViewEvent.InstrumentOptionClick) instrumentSelectionBlockerViewEvent).selectedInstrumentOptionIndex;
            InstrumentSelectionBlockerScreen.InstrumentSection instrumentSection = (InstrumentSelectionBlockerScreen.InstrumentSection) CollectionsKt.getOrNull(selectedInstrumentOptionIndex.sectionIndex, instrumentSelectionBlockerScreen.instrumentSection);
            InstrumentSelectionBlockerScreen.InstrumentOption instrumentOption = instrumentSection != null ? (InstrumentSelectionBlockerScreen.InstrumentOption) CollectionsKt.getOrNull(selectedInstrumentOptionIndex.itemIndex, instrumentSection.instrumentOptions) : null;
            InstrumentSelectionBlockerScreen.InstrumentAction instrumentAction = instrumentOption != null ? instrumentOption.action : null;
            if (instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) {
                mutableState3.setValue((InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) instrumentAction);
                instrumentSelectionBlockerPresenter.logAction(analytics, InstrumentSelectTapOption.Action.SHOW_SHEET, null);
                InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet showSheet = (InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) mutableState3.getValue();
                showSheet.getClass();
                instrumentSelectionBlockerPresenter.navigateToOptionsSheet(showSheet);
            } else if ((instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Link) || (instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Replace)) {
                JobKt.launch$default(coroutineScope, null, null, new PasscodeDialogPresenter$models$1$1(instrumentSelectionBlockerPresenter, instrumentAction, mutableState, continuation2, 21), 3);
            } else if (instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Select) {
                instrumentSelectionBlockerPresenter.logAction(analytics, InstrumentSelectTapOption.Action.SELECT, ((InstrumentSelectionBlockerScreen.InstrumentAction.Select) instrumentAction).instrumentType);
                mutableState2.setValue(selectedInstrumentOptionIndex);
            } else if (!(instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.None)) {
                if (instrumentAction == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Instrument option has no action.");
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        } else {
            if (!Intrinsics.areEqual(instrumentSelectionBlockerViewEvent, InstrumentSelectionBlockerViewEvent.CtaClick.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex selectedInstrumentOptionIndex2 = (InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex) mutableState2.getValue();
            InstrumentSelectionBlockerScreen.InstrumentSection instrumentSection2 = (InstrumentSelectionBlockerScreen.InstrumentSection) CollectionsKt.getOrNull(selectedInstrumentOptionIndex2.sectionIndex, instrumentSelectionBlockerScreen.instrumentSection);
            InstrumentSelectionBlockerScreen.InstrumentOption instrumentOption2 = instrumentSection2 != null ? (InstrumentSelectionBlockerScreen.InstrumentOption) CollectionsKt.getOrNull(selectedInstrumentOptionIndex2.itemIndex, instrumentSection2.instrumentOptions) : null;
            if (instrumentOption2 != null) {
                JobKt.launch$default(coroutineScope, null, null, new PasscodeDialogPresenter$models$1$1(instrumentSelectionBlockerPresenter, instrumentOption2, mutableState, continuation2, 22), 3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$investing$backend$real$metrics$RealInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2(Object obj, Continuation continuation) {
        RealInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1 realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1;
        int i;
        String str;
        if (continuation instanceof RealInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1) {
            realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1 = (RealInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1) continuation;
            int i2 = realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.$$this$LaunchedEffect;
                    CurrentPrice currentPrice = (CurrentPrice) ((Map) ((PolledData) obj).value).get((InvestmentEntityToken) this.this$0);
                    if (currentPrice != null) {
                        MoneyFormatter moneyFormatter = ((RealInvestingMetrics) this.$earningCardUpdating$delegate$inlined).moneyFormatter;
                        Money money = currentPrice.current_price;
                        money.getClass();
                        str = moneyFormatter.format(money);
                    } else {
                        str = null;
                    }
                    GetInvestingMetricsResponse getInvestingMetricsResponse = (GetInvestingMetricsResponse) this.$content$delegate$inlined;
                    InvestmentEntityStats investmentEntityStats = (InvestmentEntityStats) this.$showCardManagementSheet$delegate$inlined;
                    List<Section.Row> list = investmentEntityStats.rows;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (Section.Row row : list) {
                        Section.Row.Value value = row.value;
                        value.getClass();
                        String str2 = value.text;
                        ClientDriven clientDriven = value.client_driven;
                        int i3 = clientDriven == null ? -1 : RealInvestingMetrics.WhenMappings.$EnumSwitchMapping$0[clientDriven.ordinal()];
                        if (i3 != -1) {
                            if (i3 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (str != null) {
                                str2 = str;
                            }
                        }
                        arrayList.add(Section.Row.copy$default(row, Section.Row.Value.copy$default(value, str2, null, 30), null, null, 29));
                    }
                    GetInvestingMetricsResponse copy$default = GetInvestingMetricsResponse.copy$default(getInvestingMetricsResponse, InvestmentEntityStats.copy$default(investmentEntityStats, arrayList, null, null, 61), null, null, null, null, 61);
                    realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(copy$default, realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1 = new RealInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1(this, continuation);
        Object obj22 = realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.squareup.cash.clientrouting.RealRouter] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r1v96, types: [app.cash.broadway.screen.Screen] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocalButton localButton;
        String str;
        POSBrandOnboarding.LegalConsent legalConsent;
        Object obj2;
        String str2;
        String str3;
        WiresAccountInfo.DeactivationDetails deactivationDetails;
        WiresAccountInfo.IneligibilityDetails ineligibilityDetails;
        WiresAccountInfo.Action action;
        String str4;
        WiresAccountInfo.IneligibilityDetails ineligibilityDetails2;
        WiresAccountInfo.Action action2;
        WiresAccountInfo.DeactivationDetails deactivationDetails2;
        WiresAccountInfo.Action action3;
        WiresAccountInfo.WiresProfile wiresProfile;
        String str5;
        WiresAccountInfo.WiresProfile wiresProfile2;
        String str6;
        DirectDepositAccount directDepositAccount;
        DirectDepositAccount directDepositAccount2;
        Effective_limits effective_limits;
        Money money;
        Long l;
        String joinToString$default;
        String str7;
        Parcelable subFilters;
        int i = this.$r8$classId;
        LocalTabScreen localTabScreen = LocalTabScreen.INSTANCE;
        int i2 = 10;
        int i3 = 1;
        Back back = Back.INSTANCE;
        Object obj3 = this.$content$delegate$inlined;
        Object obj4 = this.$$this$LaunchedEffect;
        Object obj5 = this.this$0;
        Object obj6 = this.$earningCardUpdating$delegate$inlined;
        Object obj7 = this.$showCardManagementSheet$delegate$inlined;
        ?? r12 = 0;
        r12 = null;
        String str8 = null;
        r12 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj6;
                MutableState mutableState2 = (MutableState) obj7;
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj5;
                RealLocalLauncher realLocalLauncher = (RealLocalLauncher) localCashBalancePresenter.launcher;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator;
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                LocalCashBalanceViewEvent localCashBalanceViewEvent = (LocalCashBalanceViewEvent) obj;
                if (localCashBalanceViewEvent instanceof LocalCashBalanceViewEvent.Dismiss) {
                    if (((LocalCashBalanceScreen) localCashBalancePresenter.screen).navigateToLocalTabOnDismiss) {
                        screenNavigator.goTo(localTabScreen);
                    } else {
                        screenNavigator.goTo(back);
                    }
                } else if (localCashBalanceViewEvent instanceof LocalCashBalanceViewEvent.UrlClicked) {
                    realLocalLauncher.openWeb(screenNavigator, ((LocalCashBalanceViewEvent.UrlClicked) localCashBalanceViewEvent).url);
                } else if (localCashBalanceViewEvent instanceof LocalCashBalanceViewEvent.ButtonClicked) {
                    LocalCashInformationalContent localCashInformationalContent = (LocalCashInformationalContent) ((State) obj3).getValue();
                    if (localCashInformationalContent != null && (localButton = localCashInformationalContent.button) != null) {
                        zzir zzirVar = localButton.action;
                        if (zzirVar instanceof LocalButton$Action$OpenUrl) {
                            str = ((LocalButton$Action$OpenUrl) zzirVar).value;
                        } else if (zzirVar instanceof LocalButton$Action$NavigateToClientRoute) {
                            str = ((LocalButton$Action$NavigateToClientRoute) zzirVar).value;
                        } else if (zzirVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        realLocalLauncher.openWeb(screenNavigator, str);
                    }
                } else if (localCashBalanceViewEvent instanceof LocalCashBalanceViewEvent.ManageCardsClicked) {
                    mutableState2.setValue(Boolean.TRUE);
                    ((Analytics) localCashBalancePresenter.analytics).track(new LocalClientLocalCashClickManageEarningCards(PlatformKt.activeAccountTokenOrNull((SessionManager) localCashBalancePresenter.sessionManager)), null);
                } else if (localCashBalanceViewEvent instanceof LocalCashBalanceViewEvent.SheetDismissed) {
                    mutableState2.setValue(Boolean.FALSE);
                } else if (localCashBalanceViewEvent instanceof LocalCashBalanceViewEvent.UpdateCardState) {
                    mutableState.setValue(Boolean.TRUE);
                    LocalCashBalanceViewEvent.UpdateCardState updateCardState = (LocalCashBalanceViewEvent.UpdateCardState) localCashBalanceViewEvent;
                    JobKt.launch$default(coroutineScope, null, null, new SliderState$drag$2(localCashBalancePresenter, new UpdateEarningCardRequest(null, updateCardState.id, updateCardState.currentlyLinked ? LocalEarningCard.EarningState.EARNING_STATE_DISABLED_FOR_EARNING : LocalEarningCard.EarningState.EARNING_STATE_ENABLED_FOR_EARNING, ByteString.EMPTY), mutableState, null, 23), 3);
                } else if (localCashBalanceViewEvent instanceof LocalCashBalanceViewEvent.CheckInClicked) {
                    screenNavigator.goTo(LocalPosCheckInScreen.INSTANCE);
                } else {
                    if (!(localCashBalanceViewEvent instanceof LocalCashBalanceViewEvent.ViewAllClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(LocalCashAllActivityScreen.INSTANCE);
                }
                return Unit.INSTANCE;
            case 1:
                LocalBrandLocationOpenTabPresenter localBrandLocationOpenTabPresenter = (LocalBrandLocationOpenTabPresenter) obj5;
                BetterNavigator.ScreenNavigator screenNavigator2 = localBrandLocationOpenTabPresenter.navigator;
                MutableState mutableState3 = (MutableState) obj6;
                LocalBrandLocationOpenTabViewEvent localBrandLocationOpenTabViewEvent = (LocalBrandLocationOpenTabViewEvent) obj;
                MutableState mutableState4 = (MutableState) obj7;
                if (!((Boolean) mutableState4.getValue()).booleanValue()) {
                    if (Intrinsics.areEqual(localBrandLocationOpenTabViewEvent, LocalBrandLocationOpenTabViewEvent.BackClicked.INSTANCE)) {
                        screenNavigator2.goTo(back);
                    } else if (Intrinsics.areEqual(localBrandLocationOpenTabViewEvent, LocalBrandLocationOpenTabViewEvent.AddItemsClicked.INSTANCE)) {
                        mutableState3.setValue(EmptyList.INSTANCE);
                        LocalBrandLocationOpenTabScreen localBrandLocationOpenTabScreen = localBrandLocationOpenTabPresenter.screen;
                        screenNavigator2.goTo(new LocalBrandLocationMenuScreen(localBrandLocationOpenTabScreen.brandSpot, localBrandLocationOpenTabScreen.isProfileSheetInline, localBrandLocationOpenTabScreen.attributionKey, localBrandLocationOpenTabScreen.syncTokens, 32));
                    } else if (Intrinsics.areEqual(localBrandLocationOpenTabViewEvent, LocalBrandLocationOpenTabViewEvent.FinishAndPayClicked.INSTANCE)) {
                        LocalCart localCart = (LocalCart) ((MutableState) obj3).getValue();
                        if (OpenTabStateKt.getHasOpenTabRounds(localCart)) {
                            mutableState3.setValue(EmptyList.INSTANCE);
                            mutableState4.setValue(Boolean.TRUE);
                            JobKt.launch$default((CoroutineScope) obj4, null, null, new zzmo(localBrandLocationOpenTabPresenter, localCart, (MutableState) obj6, (MutableState) obj7, null, 3), 3);
                        }
                    } else {
                        if (!(localBrandLocationOpenTabViewEvent instanceof LocalBrandLocationOpenTabViewEvent.ErrorDismissed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        List list = (List) mutableState3.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj8 : list) {
                            if (!((CreateCartErrorViewModel) obj8).id.equals(((LocalBrandLocationOpenTabViewEvent.ErrorDismissed) localBrandLocationOpenTabViewEvent).id)) {
                                arrayList.add(obj8);
                            }
                        }
                        mutableState3.setValue(arrayList);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                ShortlinkAction shortlinkAction = (ShortlinkAction) obj3;
                LocalPosBrandOnboardingPresenter localPosBrandOnboardingPresenter = (LocalPosBrandOnboardingPresenter) obj5;
                RealLocalLauncher realLocalLauncher2 = localPosBrandOnboardingPresenter.launcher;
                POSBrandOnboarding pOSBrandOnboarding = localPosBrandOnboardingPresenter.onboarding;
                POSBrandOnboarding.LegalConsent legalConsent2 = localPosBrandOnboardingPresenter.legalConsent;
                BetterNavigator.ScreenNavigator screenNavigator3 = localPosBrandOnboardingPresenter.navigator;
                Analytics analytics = localPosBrandOnboardingPresenter.analytics;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                LocalPosBrandOnboardingViewEvent localPosBrandOnboardingViewEvent = (LocalPosBrandOnboardingViewEvent) obj;
                MutableState mutableState5 = (MutableState) obj7;
                String str12 = ((LocalPosBrandOnboardingViewModel) mutableState5.getValue()).getCallToAction().label;
                boolean z = localPosBrandOnboardingViewEvent instanceof LocalPosBrandOnboardingViewEvent.NavigationClicked;
                if (!z) {
                    legalConsent = legalConsent2;
                    if (!(localPosBrandOnboardingViewEvent instanceof LocalPosBrandOnboardingViewEvent.CtaClicked)) {
                        obj2 = obj6;
                        if (localPosBrandOnboardingViewEvent instanceof LocalPosBrandOnboardingViewEvent.SwipeUp) {
                            analytics.track(new LocalClientPOSOnboardingSheetInteraction(LocalClientPOSOnboardingSheetInteraction.UserAction.SwipeUp, str12, null, null), null);
                        } else if (localPosBrandOnboardingViewEvent instanceof LocalPosBrandOnboardingViewEvent.SwipeDown) {
                            analytics.track(new LocalClientPOSOnboardingSheetInteraction(LocalClientPOSOnboardingSheetInteraction.UserAction.SwipeDown, str12, null, null), null);
                        } else if (!(localPosBrandOnboardingViewEvent instanceof LocalPosBrandOnboardingViewEvent.UrlClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    } else if (!(((LocalPosBrandOnboardingViewModel) mutableState5.getValue()) instanceof LocalPosBrandOnboardingViewModel.CardModel) || legalConsent == null) {
                        LocalClientPOSOnboardingSheetInteraction.UserAction userAction = LocalClientPOSOnboardingSheetInteraction.UserAction.CompleteOnboardingShortlink;
                        if (shortlinkAction == null || (str2 = shortlinkAction.shortlink_key) == null) {
                            str2 = "";
                        }
                        obj2 = obj6;
                        if (shortlinkAction == null || (str3 = shortlinkAction.next_shortlink_flow_state) == null) {
                            str3 = "";
                        }
                        analytics.track(new LocalClientPOSOnboardingSheetInteraction(userAction, str12, str2, str3), null);
                    }
                    if (!z) {
                        String str13 = pOSBrandOnboarding.close_button_client_route;
                        if (str13 != null) {
                            realLocalLauncher2.openWeb(screenNavigator3, str13);
                        } else {
                            screenNavigator3.goTo(localTabScreen);
                        }
                    } else if (localPosBrandOnboardingViewEvent instanceof LocalPosBrandOnboardingViewEvent.CtaClicked) {
                        if (!(((LocalPosBrandOnboardingViewModel) mutableState5.getValue()) instanceof LocalPosBrandOnboardingViewModel.CardModel) || legalConsent == null) {
                            ((MutableState) obj2).setValue(Boolean.TRUE);
                            JobKt.launch$default(coroutineScope2, null, null, new ZiplineLoader$ModuleJob$run$3(localPosBrandOnboardingPresenter, shortlinkAction, null, 16), 3);
                        } else {
                            mutableState5.setValue(new LocalPosBrandOnboardingViewModel.LegalConsentModel(pOSBrandOnboarding.legal_consent, new LocalPosBrandOnboardingViewModel.CallToAction(localPosBrandOnboardingPresenter.stringManager.get(R.string.local_presenters_pos_call_to_action_accept), LocalPosBrandOnboardingViewModel.CallToAction.Style.PROMINENT_BUTTON)));
                        }
                    } else if (localPosBrandOnboardingViewEvent instanceof LocalPosBrandOnboardingViewEvent.UrlClicked) {
                        realLocalLauncher2.openWeb(screenNavigator3, ((LocalPosBrandOnboardingViewEvent.UrlClicked) localPosBrandOnboardingViewEvent).url);
                    } else if (!(localPosBrandOnboardingViewEvent instanceof LocalPosBrandOnboardingViewEvent.SwipeUp) && !(localPosBrandOnboardingViewEvent instanceof LocalPosBrandOnboardingViewEvent.SwipeDown)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    return Unit.INSTANCE;
                }
                legalConsent = legalConsent2;
                analytics.track(new LocalClientPOSOnboardingSheetInteraction(LocalClientPOSOnboardingSheetInteraction.UserAction.Dismiss, str12, null, null), null);
                obj2 = obj6;
                if (!z) {
                }
                return Unit.INSTANCE;
            case 3:
                State state = (State) obj3;
                State state2 = (State) obj6;
                TransfersPresenter transfersPresenter = (TransfersPresenter) obj5;
                ?? r0 = (RealRouter) transfersPresenter.router;
                Analytics analytics2 = (Analytics) transfersPresenter.analytics;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj4;
                TransfersInstructionsEvent transfersInstructionsEvent = (TransfersInstructionsEvent) obj;
                if (Intrinsics.areEqual(transfersInstructionsEvent, TransfersInstructionsEvent.BankTransferAccountNumberClick.INSTANCE)) {
                    UiDda uiDda = (UiDda) state.getValue();
                    if (uiDda != null && (directDepositAccount2 = uiDda.account) != null) {
                        str8 = directDepositAccount2.account_number;
                    }
                    TransfersPresenter.access$copyAccountNumber(transfersPresenter, str8, com.squareup.cash.cdf.transfers.Section.BANK_TRANSFER);
                } else if (Intrinsics.areEqual(transfersInstructionsEvent, TransfersInstructionsEvent.BankTransferRoutingNumberClick.INSTANCE)) {
                    UiDda uiDda2 = (UiDda) state.getValue();
                    if (uiDda2 != null && (directDepositAccount = uiDda2.account) != null) {
                        str9 = directDepositAccount.routing_number;
                    }
                    TransfersPresenter.access$copyRoutingNumber(transfersPresenter, str9, com.squareup.cash.cdf.transfers.Section.BANK_TRANSFER);
                } else if (Intrinsics.areEqual(transfersInstructionsEvent, TransfersInstructionsEvent.BankTransferHowToClick.INSTANCE)) {
                    analytics2.track(new TransfersTapHowToMakeATransfer(com.squareup.cash.cdf.transfers.Section.BANK_TRANSFER), null);
                    BlockersHelper.launchClientScenario$default((RealBlockersHelper) transfersPresenter.blockersHelper, BlockersData.Flow.CLIENT_SCENARIO, ClientScenario.TRANSFER_FROM_BANKS, (TransfersScreen) transfersPresenter.args, null, null, null, false, null, null, false, 3816);
                } else if (Intrinsics.areEqual(transfersInstructionsEvent, TransfersInstructionsEvent.WireTransferAccountNumberClick.INSTANCE)) {
                    WiresAccountInfo wiresAccountInfo = (WiresAccountInfo) state2.getValue();
                    if (wiresAccountInfo != null && (wiresProfile2 = wiresAccountInfo.wires_profile) != null) {
                        WiresAccountInfo.WiresProfile.EligibilityDetails eligibilityDetails = wiresProfile2 instanceof WiresAccountInfo.WiresProfile.EligibilityDetails ? (WiresAccountInfo.WiresProfile.EligibilityDetails) wiresProfile2 : null;
                        WiresAccountInfo.EligibilityDetails eligibilityDetails2 = eligibilityDetails != null ? eligibilityDetails.value : null;
                        if (eligibilityDetails2 != null && (str6 = eligibilityDetails2.account_number) != null) {
                            str10 = str6;
                            TransfersPresenter.access$copyAccountNumber(transfersPresenter, str10, com.squareup.cash.cdf.transfers.Section.WIRE_TRANSFER);
                        }
                    }
                    WiresAccountInfo wiresAccountInfo2 = (WiresAccountInfo) state2.getValue();
                    if (wiresAccountInfo2 != null) {
                        str10 = wiresAccountInfo2.account_number;
                    }
                    TransfersPresenter.access$copyAccountNumber(transfersPresenter, str10, com.squareup.cash.cdf.transfers.Section.WIRE_TRANSFER);
                } else if (Intrinsics.areEqual(transfersInstructionsEvent, TransfersInstructionsEvent.WireTransferRoutingNumberClick.INSTANCE)) {
                    WiresAccountInfo wiresAccountInfo3 = (WiresAccountInfo) state2.getValue();
                    if (wiresAccountInfo3 != null && (wiresProfile = wiresAccountInfo3.wires_profile) != null) {
                        WiresAccountInfo.WiresProfile.EligibilityDetails eligibilityDetails3 = wiresProfile instanceof WiresAccountInfo.WiresProfile.EligibilityDetails ? (WiresAccountInfo.WiresProfile.EligibilityDetails) wiresProfile : null;
                        WiresAccountInfo.EligibilityDetails eligibilityDetails4 = eligibilityDetails3 != null ? eligibilityDetails3.value : null;
                        if (eligibilityDetails4 != null && (str5 = eligibilityDetails4.routing_number) != null) {
                            str11 = str5;
                            TransfersPresenter.access$copyRoutingNumber(transfersPresenter, str11, com.squareup.cash.cdf.transfers.Section.WIRE_TRANSFER);
                        }
                    }
                    WiresAccountInfo wiresAccountInfo4 = (WiresAccountInfo) state2.getValue();
                    if (wiresAccountInfo4 != null) {
                        str11 = wiresAccountInfo4.routing_number;
                    }
                    TransfersPresenter.access$copyRoutingNumber(transfersPresenter, str11, com.squareup.cash.cdf.transfers.Section.WIRE_TRANSFER);
                } else if (Intrinsics.areEqual(transfersInstructionsEvent, TransfersInstructionsEvent.WireTransferActionClick.INSTANCE)) {
                    WiresAccountInfo wiresAccountInfo5 = (WiresAccountInfo) state2.getValue();
                    wiresAccountInfo5.getClass();
                    WiresAccountInfo.WiresProfile wiresProfile3 = wiresAccountInfo5.wires_profile;
                    if (wiresProfile3 != null) {
                        WiresAccountInfo.WiresProfile.DeactivationDetails deactivationDetails3 = wiresProfile3 instanceof WiresAccountInfo.WiresProfile.DeactivationDetails ? (WiresAccountInfo.WiresProfile.DeactivationDetails) wiresProfile3 : null;
                        if (deactivationDetails3 != null) {
                            deactivationDetails = deactivationDetails3.value;
                            if (deactivationDetails != null) {
                                if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) transfersPresenter.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$WireTransfersDeactivatedState.INSTANCE)).enabled()) {
                                    analytics2.track(new TransfersTapWireDeactivatedAction(), null);
                                    if (wiresProfile3 != null) {
                                        WiresAccountInfo.WiresProfile.DeactivationDetails deactivationDetails4 = wiresProfile3 instanceof WiresAccountInfo.WiresProfile.DeactivationDetails ? (WiresAccountInfo.WiresProfile.DeactivationDetails) wiresProfile3 : null;
                                        if (deactivationDetails4 != null) {
                                            deactivationDetails2 = deactivationDetails4.value;
                                            deactivationDetails2.getClass();
                                            action3 = deactivationDetails2.action;
                                            if (action3 != null) {
                                                str4 = action3.client_route_url;
                                                if (str4 != null) {
                                                    WiresAccountInfo.Action action4 = wiresAccountInfo5.action;
                                                    if (action4 != null) {
                                                        r12 = action4.client_route_url;
                                                    }
                                                } else {
                                                    r12 = str4;
                                                }
                                                r0.route(new RoutingParams(null, null, (TransfersScreen) transfersPresenter.args, null, null, null, 503), r12);
                                            }
                                            str4 = null;
                                            if (str4 != null) {
                                            }
                                            r0.route(new RoutingParams(null, null, (TransfersScreen) transfersPresenter.args, null, null, null, 503), r12);
                                        }
                                    }
                                    deactivationDetails2 = null;
                                    deactivationDetails2.getClass();
                                    action3 = deactivationDetails2.action;
                                    if (action3 != null) {
                                    }
                                    str4 = null;
                                    if (str4 != null) {
                                    }
                                    r0.route(new RoutingParams(null, null, (TransfersScreen) transfersPresenter.args, null, null, null, 503), r12);
                                }
                            }
                            if (wiresProfile3 != null) {
                                WiresAccountInfo.WiresProfile.IneligibilityDetails ineligibilityDetails3 = wiresProfile3 instanceof WiresAccountInfo.WiresProfile.IneligibilityDetails ? (WiresAccountInfo.WiresProfile.IneligibilityDetails) wiresProfile3 : null;
                                if (ineligibilityDetails3 != null) {
                                    ineligibilityDetails = ineligibilityDetails3.value;
                                    if (ineligibilityDetails != null) {
                                        analytics2.track(new TransfersTapWireIneligibleAction(), null);
                                        if (wiresProfile3 != null) {
                                            WiresAccountInfo.WiresProfile.IneligibilityDetails ineligibilityDetails4 = wiresProfile3 instanceof WiresAccountInfo.WiresProfile.IneligibilityDetails ? (WiresAccountInfo.WiresProfile.IneligibilityDetails) wiresProfile3 : null;
                                            if (ineligibilityDetails4 != null) {
                                                ineligibilityDetails2 = ineligibilityDetails4.value;
                                                ineligibilityDetails2.getClass();
                                                action2 = ineligibilityDetails2.action;
                                                if (action2 != null) {
                                                    str4 = action2.client_route_url;
                                                    if (str4 != null) {
                                                    }
                                                    r0.route(new RoutingParams(null, null, (TransfersScreen) transfersPresenter.args, null, null, null, 503), r12);
                                                }
                                                str4 = null;
                                                if (str4 != null) {
                                                }
                                                r0.route(new RoutingParams(null, null, (TransfersScreen) transfersPresenter.args, null, null, null, 503), r12);
                                            }
                                        }
                                        ineligibilityDetails2 = null;
                                        ineligibilityDetails2.getClass();
                                        action2 = ineligibilityDetails2.action;
                                        if (action2 != null) {
                                        }
                                        str4 = null;
                                        if (str4 != null) {
                                        }
                                        r0.route(new RoutingParams(null, null, (TransfersScreen) transfersPresenter.args, null, null, null, 503), r12);
                                    } else {
                                        analytics2.track(new TransfersTapHowToMakeATransfer(com.squareup.cash.cdf.transfers.Section.WIRE_TRANSFER), null);
                                        if (wiresProfile3 != null) {
                                            WiresAccountInfo.WiresProfile.EligibilityDetails eligibilityDetails5 = wiresProfile3 instanceof WiresAccountInfo.WiresProfile.EligibilityDetails ? (WiresAccountInfo.WiresProfile.EligibilityDetails) wiresProfile3 : null;
                                            WiresAccountInfo.EligibilityDetails eligibilityDetails6 = eligibilityDetails5 != null ? eligibilityDetails5.value : null;
                                            if (eligibilityDetails6 != null && (action = eligibilityDetails6.action) != null) {
                                                str4 = action.client_route_url;
                                                if (str4 != null) {
                                                }
                                                r0.route(new RoutingParams(null, null, (TransfersScreen) transfersPresenter.args, null, null, null, 503), r12);
                                            }
                                        }
                                        str4 = null;
                                        if (str4 != null) {
                                        }
                                        r0.route(new RoutingParams(null, null, (TransfersScreen) transfersPresenter.args, null, null, null, 503), r12);
                                    }
                                }
                            }
                            ineligibilityDetails = null;
                            if (ineligibilityDetails != null) {
                            }
                        }
                    }
                    deactivationDetails = null;
                    if (deactivationDetails != null) {
                    }
                    if (wiresProfile3 != null) {
                    }
                    ineligibilityDetails = null;
                    if (ineligibilityDetails != null) {
                    }
                } else if (Intrinsics.areEqual(transfersInstructionsEvent, TransfersInstructionsEvent.BankTransferGoToCards.INSTANCE)) {
                    analytics2.track(new TransfersTapGoToCards(), null);
                    RealRouter.route$default((RealRouter) r0, new ClientRoute.ViewCard());
                } else if (Intrinsics.areEqual(transfersInstructionsEvent, TransfersInstructionsEvent.BankTransferOrderCashCard.INSTANCE)) {
                    UiDda uiDda3 = (UiDda) state.getValue();
                    BalanceData.Button button = uiDda3 != null ? uiDda3.button : null;
                    BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) transfersPresenter.navigator;
                    analytics2.track(new TransfersTapOrderCashCard(), null);
                    if (button != null) {
                        BalanceData.Button.Action action5 = button.action;
                        action5.getClass();
                        int ordinal = action5.ordinal();
                        if (ordinal == 0) {
                            ClientScenario clientScenario = button.client_scenario;
                            clientScenario.getClass();
                            BlockersHelper.launchClientScenario$default((RealBlockersHelper) transfersPresenter.blockersHelper, BlockersData.Flow.CLIENT_SCENARIO, clientScenario, (TransfersScreen) transfersPresenter.args, null, null, null, false, null, null, false, 3816);
                        } else if (ordinal == 1) {
                            screenNavigator4.goTo(new BalanceHomeScreen(null));
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            BalanceData.Dialog dialog = button.dialog;
                            dialog.getClass();
                            screenNavigator4.goTo(new DemandDepositDialogScreen(dialog));
                        }
                    }
                } else if (Intrinsics.areEqual(transfersInstructionsEvent, TransfersInstructionsEvent.GoBack.INSTANCE)) {
                    JobKt.launch$default(coroutineScope3, null, null, new TransfersPresenter$models$1$1(transfersPresenter, null, 1), 3);
                } else {
                    if (!(transfersInstructionsEvent instanceof TransfersInstructionsEvent.TabClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    e eVar = TransfersViewModel$Companion$TransfersTab.Companion;
                    int i4 = ((TransfersInstructionsEvent.TabClick) transfersInstructionsEvent).tab.id;
                    eVar.getClass();
                    ((MutableState) obj7).setValue(e.fromId(i4));
                }
                return Unit.INSTANCE;
            case 4:
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) obj5;
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj4;
                BuyBitcoinNavigator buyBitcoinNavigator = (BuyBitcoinNavigator) stuckPlayerDetector.playerListener;
                BitcoinTradeButtonsWidgetViewEvent bitcoinTradeButtonsWidgetViewEvent = (BitcoinTradeButtonsWidgetViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinTradeButtonsWidgetViewEvent, BitcoinTradeButtonsWidgetViewEvent.Buy.INSTANCE)) {
                    buyBitcoinNavigator.navigate(screenNavigator5, (CustomerLimitsManager.TransactionLimit) ((State) obj3).getValue());
                } else if (Intrinsics.areEqual(bitcoinTradeButtonsWidgetViewEvent, BitcoinTradeButtonsWidgetViewEvent.Sell.INSTANCE)) {
                    SellBitcoinNavigator sellBitcoinNavigator = (SellBitcoinNavigator) stuckPlayerDetector.callback;
                    CustomerLimitsManager.TransactionLimit transactionLimit = (CustomerLimitsManager.TransactionLimit) ((State) obj6).getValue();
                    if (transactionLimit == null || (effective_limits = transactionLimit.customerLimit) == null || (money = effective_limits.limit_amount) == null || (l = money.amount) == null || l.longValue() != 0) {
                        BitcoinInboundNavigator.showTransferBitcoin$default(sellBitcoinNavigator.bitcoinInboundNavigatorFactory.create(screenNavigator5), false, null, null, null, null, null, 506);
                    } else {
                        String str14 = effective_limits.limit_exceeded_message;
                        str14.getClass();
                        screenNavigator5.goTo(new ProfileScreens.ErrorScreen(str14, null, 10));
                    }
                } else if (Intrinsics.areEqual(bitcoinTradeButtonsWidgetViewEvent, BitcoinTradeButtonsWidgetViewEvent.Transfer.INSTANCE)) {
                    ((Analytics) stuckPlayerDetector.stuckSuppressedDetector).track(new CryptoInteractOpenTransfer(), null);
                    screenNavigator5.goTo(BitcoinSendReceiveBottomSheetScreen.INSTANCE);
                } else {
                    if (!Intrinsics.areEqual(bitcoinTradeButtonsWidgetViewEvent, BitcoinTradeButtonsWidgetViewEvent.Convert.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance = (CryptoBalance$StablecoinBalance) ((MutableState) obj7).getValue();
                    if (cryptoBalance$StablecoinBalance == null || cryptoBalance$StablecoinBalance.amount > 0) {
                        buyBitcoinNavigator.navigate(screenNavigator5, null);
                    } else {
                        screenNavigator5.goTo(new CryptoCommonScreens.CryptoCommonInsufficientFunds(CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin.INSTANCE));
                    }
                }
                return Unit.INSTANCE;
            case 5:
                MutableState mutableState6 = (MutableState) obj7;
                Function1 function1 = (Function1) obj6;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj3;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                BitcoinDepositNoteScreenView bitcoinDepositNoteScreenView = (BitcoinDepositNoteScreenView) obj4;
                FormView formView = bitcoinDepositNoteScreenView.formView;
                FormViewEvent formViewEvent = (FormViewEvent) obj;
                if (Intrinsics.areEqual(formViewEvent, FormViewEvent.Close.INSTANCE)) {
                    BitcoinDepositNoteScreenView.access$hideKeyboard(bitcoinDepositNoteScreenView, formView, delegatingSoftwareKeyboardController, focusOwnerImpl);
                    function1.invoke(BitcoinDepositNoteViewEvent.Close.INSTANCE);
                } else if (Intrinsics.areEqual(formViewEvent, FormViewEvent.PrimaryActionSelected.INSTANCE)) {
                    BitcoinDepositNoteScreenView.access$hideKeyboard(bitcoinDepositNoteScreenView, formView, delegatingSoftwareKeyboardController, focusOwnerImpl);
                    function1.invoke(new BitcoinDepositNoteViewEvent.Done((String) mutableState6.getValue()));
                } else if (formViewEvent instanceof FormViewEvent.UpdateResultEvent.InputChanged) {
                    String str15 = (String) CollectionsKt.first(((FormViewEvent.UpdateResultEvent.InputChanged) formViewEvent).textInputResult.input_field_values);
                    int i5 = BitcoinDepositNoteScreenView.$r8$clinit;
                    mutableState6.setValue(str15);
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState7 = (MutableState) obj6;
                MutableState mutableState8 = (MutableState) obj7;
                BlockerActionConfirmSheetPresenter blockerActionConfirmSheetPresenter = (BlockerActionConfirmSheetPresenter) obj5;
                BetterNavigator.ScreenNavigator screenNavigator6 = blockerActionConfirmSheetPresenter.navigator;
                Analytics analytics3 = blockerActionConfirmSheetPresenter.analytics;
                BlockersScreens.BlockerActionConfirmSheetScreen blockerActionConfirmSheetScreen = blockerActionConfirmSheetPresenter.args;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj4;
                BlockerActionConfirmSheetViewEvent blockerActionConfirmSheetViewEvent = (BlockerActionConfirmSheetViewEvent) obj;
                NavAction$$ExternalSyntheticOutline0.m(1, (ParcelableSnapshotMutableIntState) obj3);
                if (!Intrinsics.areEqual(blockerActionConfirmSheetViewEvent, BlockerActionConfirmSheetViewEvent.InteractionEvent.INSTANCE)) {
                    Continuation continuation2 = null;
                    if (blockerActionConfirmSheetViewEvent instanceof BlockerActionConfirmSheetViewEvent.UrlClicked) {
                        BlockerActionConfirmSheetViewEvent.UrlClicked urlClicked = (BlockerActionConfirmSheetViewEvent.UrlClicked) blockerActionConfirmSheetViewEvent;
                        BlockerAction decode = ((RealBlockerActionUriDecoder) blockerActionConfirmSheetPresenter.blockerActionUriDecoder).decode(urlClicked.url);
                        if (decode == null) {
                            decode = new BlockerAction(null, new BlockerAction.Action.OpenUrlAction(new BlockerAction.OpenURLAction(urlClicked.url, null, null, null, 14, null)), 23);
                        }
                        JobKt.launch$default(coroutineScope4, null, null, new BlockerActionConfirmSheetPresenter$models$3$1(blockerActionConfirmSheetPresenter, decode, continuation2, 0), 3);
                    } else if (Intrinsics.areEqual(blockerActionConfirmSheetViewEvent, BlockerActionConfirmSheetViewEvent.ConfirmClicked.INSTANCE)) {
                        analytics3.track(new BlockerFlowInteractConfirmationSheetConfirmClicked(blockerActionConfirmSheetScreen.blockersData.flowToken), null);
                        SubmitFormRequest submitFormRequest = blockerActionConfirmSheetScreen.submitFormRequest;
                        if (submitFormRequest != null) {
                            mutableState8.setValue(Boolean.TRUE);
                            JobKt.launch$default(coroutineScope4, null, null, new AmountBlockerPresenter$models$1$2(blockerActionConfirmSheetPresenter, submitFormRequest, mutableState7, continuation2, 24), 3);
                            mutableState8.setValue(Boolean.FALSE);
                        } else {
                            JobKt.launch$default(coroutineScope4, null, null, new BlockerActionConfirmSheetPresenter$models$3$3(blockerActionConfirmSheetPresenter, null), 3);
                        }
                    } else if (Intrinsics.areEqual(blockerActionConfirmSheetViewEvent, BlockerActionConfirmSheetViewEvent.GoBackClicked.INSTANCE)) {
                        analytics3.track(new BlockerFlowInteractConfirmationSheetReturnClicked(blockerActionConfirmSheetScreen.blockersData.flowToken), null);
                        Screen screen = blockerActionConfirmSheetScreen.goBackArgs;
                        if (screen == null) {
                            screen = new Finish(null);
                        }
                        screenNavigator6.goTo(screen);
                    } else if (Intrinsics.areEqual(blockerActionConfirmSheetViewEvent, BlockerActionConfirmSheetViewEvent.SuccessAnimationComplete.INSTANCE)) {
                        ApiResult.Success success = (ApiResult.Success) mutableState7.getValue();
                        if (success != null) {
                            BlockerActionUtilKt.handleSubmitFormResponseContext(success, blockerActionConfirmSheetScreen, blockerActionConfirmSheetScreen.blockersData, screenNavigator6, blockerActionConfirmSheetPresenter.blockersDataNavigator);
                        }
                    } else {
                        if (!Intrinsics.areEqual(blockerActionConfirmSheetViewEvent, BlockerActionConfirmSheetViewEvent.Dismiss.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        analytics3.track(new BlockerFlowInteractConfirmationSheetDismiss(blockerActionConfirmSheetScreen.blockersData.flowToken), null);
                        BlockerAction blockerAction = blockerActionConfirmSheetScreen.dismissAction;
                        if (blockerAction != null) {
                            JobKt.launch$default(coroutineScope4, null, null, new BlockerActionConfirmSheetPresenter$models$3$1(blockerActionConfirmSheetPresenter, blockerAction, continuation2, i3), 3);
                        } else {
                            Screen screen2 = blockerActionConfirmSheetScreen.goBackArgs;
                            if (screen2 == null) {
                                screen2 = new Finish(null);
                            }
                            screenNavigator6.goTo(screen2);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState9 = (MutableState) obj7;
                MutableState mutableState10 = (MutableState) obj6;
                AddMoneyBlockerPresenter addMoneyBlockerPresenter = (AddMoneyBlockerPresenter) obj5;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj4;
                AddMoneyViewEvent addMoneyViewEvent = (AddMoneyViewEvent) obj;
                if (addMoneyViewEvent instanceof AddMoneyViewEvent.AmountKeypadEntered) {
                    mutableState9.setValue(Moneys.parseMoneyFromString$default(((AddMoneyViewEvent.AmountKeypadEntered) addMoneyViewEvent).amount, addMoneyBlockerPresenter.currency));
                } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.CtaClick.INSTANCE)) {
                    if (!((Boolean) mutableState10.getValue()).booleanValue() && addMoneyBlockerPresenter.isSubmittable((Money) mutableState9.getValue())) {
                        mutableState10.setValue(Boolean.TRUE);
                        JobKt.launch$default(coroutineScope5, null, null, new AddMoneyBlockerPresenter$models$2$1(addMoneyBlockerPresenter, mutableState9, mutableState10, null, 0), 3);
                    }
                } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.PayWithGooglePayClick.INSTANCE)) {
                    if (((String) ((State) obj3).getValue()) != null && !((Boolean) mutableState10.getValue()).booleanValue() && addMoneyBlockerPresenter.isSubmittable((Money) mutableState9.getValue())) {
                        mutableState10.setValue(Boolean.TRUE);
                        JobKt.launch$default(coroutineScope5, null, null, new AddMoneyBlockerPresenter$models$2$1(addMoneyBlockerPresenter, mutableState9, mutableState10, null, 1), 3);
                    }
                } else if (Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.CloseClick.INSTANCE)) {
                    BetterNavigator.ScreenNavigator screenNavigator7 = addMoneyBlockerPresenter.navigator;
                    BlockersDataNavigator blockersDataNavigator = addMoneyBlockerPresenter.blockersDataNavigator;
                    BlockersScreens.AddMoneyBlockerScreen addMoneyBlockerScreen = addMoneyBlockerPresenter.args;
                    ?? back2 = blockersDataNavigator.getBack(addMoneyBlockerScreen, addMoneyBlockerScreen.blockersData);
                    if (back2 != 0) {
                        back = back2;
                    }
                    screenNavigator7.goTo(back);
                } else if (!(addMoneyViewEvent instanceof AddMoneyViewEvent.AmountPickerItemSelected) && !Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.ChangeInstrumentClick.INSTANCE) && !Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.Expanded.INSTANCE) && !(addMoneyViewEvent instanceof AddMoneyViewEvent.InstrumentSelected) && !Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.InstrumentPickerDoneClick.INSTANCE) && !Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.Peeking.INSTANCE) && !Intrinsics.areEqual(addMoneyViewEvent, AddMoneyViewEvent.RecurringCashInToggleClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 8:
                return emit$com$squareup$cash$blockers$presenters$AtmPickerAmountBlockerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 9:
                CalendarBlockerPresenter calendarBlockerPresenter = (CalendarBlockerPresenter) obj5;
                CoroutineScope coroutineScope6 = (CoroutineScope) obj4;
                CalendarBlockerViewEvent calendarBlockerViewEvent = (CalendarBlockerViewEvent) obj;
                if (Intrinsics.areEqual(calendarBlockerViewEvent, CalendarBlockerViewEvent.ActionButtonClicked.INSTANCE)) {
                    JobKt.launch$default(coroutineScope6, null, null, new SetNamePresenter$models$1$1$1(calendarBlockerPresenter, (MutableState) obj7, (MutableState) obj6, (MutableState) obj3, null, 14), 3);
                } else if (Intrinsics.areEqual(calendarBlockerViewEvent, CalendarBlockerViewEvent.ToolbarButtonClicked.INSTANCE)) {
                    BlockersScreens.CalendarBlockerScreen calendarBlockerScreen = calendarBlockerPresenter.args;
                    BlockerAction blockerAction2 = calendarBlockerScreen.retreatAction;
                    if (blockerAction2 == null) {
                        blockerAction2 = calendarBlockerScreen.dismissAction;
                    }
                    if (blockerAction2 != null) {
                        JobKt.launch$default(coroutineScope6, null, null, new SsnPresenter$models$2$2(calendarBlockerPresenter, blockerAction2, r12, 10), 3);
                    }
                } else if (calendarBlockerViewEvent instanceof CalendarBlockerViewEvent.DateSelected) {
                    ((MutableState) obj6).setValue(((CalendarBlockerViewEvent.DateSelected) calendarBlockerViewEvent).date);
                } else {
                    if (!(calendarBlockerViewEvent instanceof CalendarBlockerViewEvent.ToggleOption)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((MutableState) obj7).setValue(Boolean.valueOf(((CalendarBlockerViewEvent.ToggleOption) calendarBlockerViewEvent).toggledOn));
                }
                return Unit.INSTANCE;
            case 10:
                return emit$com$squareup$cash$blockers$presenters$CashtagPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 11:
                return emit$com$squareup$cash$blockers$presenters$FileBlockerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 12:
                return emit$com$squareup$cash$blockers$presenters$InstrumentSelectionBlockerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 13:
                return emit$com$squareup$cash$blockers$presenters$VerifyContactsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 14:
                return emit$com$squareup$cash$blockers$web$presenters$WebViewBlockerPresenter$models$$inlined$CollectEffect$2$1(obj, continuation);
            case 15:
                return emit$com$squareup$cash$cashapplite$presenters$LiteCashOutPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 16:
                return emit$com$squareup$cash$checks$VerifyCheckDepositPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 17:
                return emit$com$squareup$cash$crypto$common$presenters$BitcoinP2pConversionPercentagePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 18:
                return emit$com$squareup$cash$directdeposit$presenters$DirectDepositManualFormDetailsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 19:
                return emit$com$squareup$cash$family$familyhub$presenters$DependentDetailPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 20:
                return emit$com$squareup$cash$family$requestsponsorship$presenters$SelectSponsorPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 21:
                return emit$com$squareup$cash$favorites$presenters$AddFavoritesPresenter$models$lambda$20$1$$inlined$map$1$2(obj, continuation);
            case 22:
                JobKt.launch$default((CoroutineScope) obj4, null, null, new RealFidesmoClient$observeDeviceState$1((MutableState) obj7, (ArcadeFormTextInputGroupView) obj5, (FocusRequester) obj3, (DelegatingSoftwareKeyboardController) obj6, null, 23), 3);
                return Unit.INSTANCE;
            case 23:
                return emit$com$squareup$cash$globalsearch$presenters$GlobalSearchQueryPresenter$models$state$2$1$1(obj, continuation);
            case 24:
                return emit$com$squareup$cash$google$pay$CashLiteGooglePayProvisioningGateway$provision$$inlined$map$1$2(obj, continuation);
            case 25:
                return emit$com$squareup$cash$growtools$presenters$manager$autoinvest$GrowToolsAutoInvestManager$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 26:
                return emit$com$squareup$cash$growtools$presenters$manager$roundups$GrowToolsRoundUpsManager$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 27:
                return emit$com$squareup$cash$instruments$presenters$InstrumentSelectionBlockerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$investing$backend$real$metrics$RealInvestingMetrics$overrideClientDrivenStats$$inlined$map$1$2(obj, continuation);
            default:
                MutableState mutableState11 = (MutableState) obj7;
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj5;
                BetterNavigator.ScreenNavigator screenNavigator8 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                InvestingScreens.InvestingCategoryFilterScreen investingCategoryFilterScreen = (InvestingScreens.InvestingCategoryFilterScreen) localPosCheckInPresenter.cameraPermissions;
                Analytics analytics4 = (Analytics) localPosCheckInPresenter.store;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj4;
                InvestingCategoryFilterViewEvent investingCategoryFilterViewEvent = (InvestingCategoryFilterViewEvent) obj;
                if (investingCategoryFilterViewEvent instanceof InvestingCategoryFilterViewEvent.TapApply) {
                    if (snapshotStateMap.isEmpty()) {
                        analytics4.track(new StockSelectSelectInvestSearchFilterContinue(investingCategoryFilterScreen.token.value), null);
                    } else {
                        for (InvestingCategoryFilterViewModel.Content.FilterSection filterSection : (List) obj3) {
                            SelectionState selectionState = (SelectionState) snapshotStateMap.get(filterSection.token);
                            if (selectionState != null) {
                                if (selectionState instanceof SelectionState.MultiSelect) {
                                    Set<String> set = ((SelectionState.MultiSelect) selectionState).tokens;
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, i2));
                                    for (String str16 : set) {
                                        List<InvestingCategoryFilterViewModel.Content.FilterOption> list2 = filterSection.options;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (InvestingCategoryFilterViewModel.Content.FilterOption filterOption : list2) {
                                            if (filterOption instanceof InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox) {
                                                InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox checkbox = (InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox) filterOption;
                                                if (Intrinsics.areEqual(checkbox.token, str16)) {
                                                    str7 = checkbox.title;
                                                    if (str7 == null) {
                                                        arrayList3.add(str7);
                                                    }
                                                }
                                            } else if (!(filterOption instanceof InvestingCategoryFilterViewModel.Content.FilterOption.Selection)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            str7 = null;
                                            if (str7 == null) {
                                            }
                                        }
                                        arrayList2.add(arrayList3);
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        if (!((List) next).isEmpty()) {
                                            arrayList4.add(next);
                                        }
                                    }
                                    joinToString$default = CollectionsKt.joinToString$default(arrayList4, "|", null, null, 0, null, null, 62);
                                } else {
                                    if (!(selectionState instanceof SelectionState.GroupedSingleSelect)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    joinToString$default = CollectionsKt.joinToString$default(((SelectionState.GroupedSingleSelect) selectionState).groups.keySet(), "|", null, null, 0, null, new TooltipBoxKt$$ExternalSyntheticLambda2(filterSection, 20), 30);
                                }
                                analytics4.track(new StockSelectSelectInvestSearchFilterOption(filterSection.token, joinToString$default), null);
                            }
                            i2 = 10;
                        }
                    }
                    CategoryDetails categoryDetails = (CategoryDetails) mutableState11.getValue();
                    categoryDetails.getClass();
                    FilterDetails[] filterDetailsArr = (FilterDetails[]) ((MutableState) obj6).getValue();
                    filterDetailsArr.getClass();
                    SyncInvestmentCategory.CategoryType categoryType = SyncInvestmentCategory.CategoryType.PERFORMANCE;
                    String tokenByType = TaskLoggerKt.getTokenByType(filterDetailsArr, categoryType);
                    SyncInvestmentCategory.CategoryType categoryType2 = SyncInvestmentCategory.CategoryType.ADVANCED;
                    String tokenByType2 = TaskLoggerKt.getTokenByType(filterDetailsArr, categoryType2);
                    SyncInvestmentCategory.CategoryType categoryType3 = SyncInvestmentCategory.CategoryType.SUBCATEGORY;
                    String tokenByType3 = TaskLoggerKt.getTokenByType(filterDetailsArr, categoryType3);
                    String str17 = categoryDetails.category.name;
                    SelectionState selectionState2 = (SelectionState) snapshotStateMap.get(tokenByType);
                    String trackApplyFilterCdfEvent$toCdfString = selectionState2 != null ? TaskLoggerKt.trackApplyFilterCdfEvent$toCdfString(selectionState2, filterDetailsArr, categoryType) : null;
                    SelectionState selectionState3 = (SelectionState) snapshotStateMap.get(tokenByType2);
                    String trackApplyFilterCdfEvent$toCdfString2 = selectionState3 != null ? TaskLoggerKt.trackApplyFilterCdfEvent$toCdfString(selectionState3, filterDetailsArr, categoryType2) : null;
                    SelectionState selectionState4 = (SelectionState) snapshotStateMap.get(tokenByType3);
                    analytics4.track(new StockSelectApplyCategoryFilter(str17, trackApplyFilterCdfEvent$toCdfString, trackApplyFilterCdfEvent$toCdfString2, selectionState4 != null ? TaskLoggerKt.trackApplyFilterCdfEvent$toCdfString(selectionState4, filterDetailsArr, categoryType3) : null), null);
                    AskedQuestion askedQuestion = investingCategoryFilterScreen.askedQuestion;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(snapshotStateMap.size()));
                    for (Map.Entry entry : snapshotStateMap.entries) {
                        linkedHashMap.put(new FilterToken((String) entry.getKey()), entry.getValue());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        Object key = entry2.getKey();
                        SelectionState selectionState5 = (SelectionState) entry2.getValue();
                        if (selectionState5 instanceof SelectionState.MultiSelect) {
                            FilterToken filterToken = (FilterToken) entry2.getKey();
                            Set set2 = ((SelectionState.MultiSelect) selectionState5).tokens;
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                            Iterator it2 = set2.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(new CategoryToken((String) it2.next()));
                            }
                            subFilters = new FilterConfiguration.Categories(filterToken, arrayList5);
                        } else {
                            if (!(selectionState5 instanceof SelectionState.GroupedSingleSelect)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            subFilters = new FilterConfiguration.SubFilters((FilterToken) entry2.getKey(), ((SelectionState.GroupedSingleSelect) selectionState5).groups);
                        }
                        linkedHashMap2.put(key, subFilters);
                    }
                    screenNavigator8.giveAnswer(askedQuestion, linkedHashMap2);
                } else if (Intrinsics.areEqual(investingCategoryFilterViewEvent, InvestingCategoryFilterViewEvent.TapClose.INSTANCE)) {
                    screenNavigator8.goTo(back);
                } else if (Intrinsics.areEqual(investingCategoryFilterViewEvent, InvestingCategoryFilterViewEvent.TapReset.INSTANCE)) {
                    snapshotStateMap.clear();
                    CategoryDetails categoryDetails2 = (CategoryDetails) mutableState11.getValue();
                    analytics4.track(new StockSelectResetCategoryFilter(categoryDetails2 != null ? categoryDetails2.category.name : null), null);
                    AskedQuestion askedQuestion2 = investingCategoryFilterScreen.askedQuestion;
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    screenNavigator8.giveAnswer(askedQuestion2, emptyMap);
                } else if (investingCategoryFilterViewEvent instanceof InvestingCategoryFilterViewEvent.ToggleCheckboxOption) {
                    InvestingCategoryFilterViewEvent.ToggleCheckboxOption toggleCheckboxOption = (InvestingCategoryFilterViewEvent.ToggleCheckboxOption) investingCategoryFilterViewEvent;
                    String str18 = toggleCheckboxOption.token;
                    String str19 = toggleCheckboxOption.sectionToken;
                    Object orDefault = snapshotStateMap.getOrDefault(str19, new SelectionState.MultiSelect(EmptySet.INSTANCE));
                    orDefault.getClass();
                    LinkedHashSet mutableSet = CollectionsKt.toMutableSet(((SelectionState.MultiSelect) orDefault).tokens);
                    if (mutableSet.contains(str18)) {
                        mutableSet.remove(str18);
                    } else {
                        mutableSet.add(str18);
                    }
                    if (mutableSet.isEmpty()) {
                        snapshotStateMap.remove(str19);
                    } else {
                        snapshotStateMap.put(str19, new SelectionState.MultiSelect(mutableSet));
                    }
                } else {
                    if (!(investingCategoryFilterViewEvent instanceof InvestingCategoryFilterViewEvent.SelectDropDownOption)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    InvestingCategoryFilterViewEvent.SelectDropDownOption selectDropDownOption = (InvestingCategoryFilterViewEvent.SelectDropDownOption) investingCategoryFilterViewEvent;
                    String str20 = selectDropDownOption.token;
                    String str21 = selectDropDownOption.sectionToken;
                    EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                    emptyMap2.getClass();
                    Object orDefault2 = snapshotStateMap.getOrDefault(str21, new SelectionState.GroupedSingleSelect(emptyMap2));
                    orDefault2.getClass();
                    LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(((SelectionState.GroupedSingleSelect) orDefault2).groups);
                    mutableMap.remove(str20);
                    mutableMap.put(str20, selectDropDownOption.selectedOption);
                    snapshotStateMap.put(str21, new SelectionState.GroupedSingleSelect(mutableMap));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.this$0 = obj2;
        this.$content$delegate$inlined = obj3;
        this.$showCardManagementSheet$delegate$inlined = obj4;
        this.$earningCardUpdating$delegate$inlined = obj5;
        this.$$this$LaunchedEffect = obj;
    }

    public /* synthetic */ LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(int i, MutableState mutableState, MutableState mutableState2, State state, MoleculePresenter moleculePresenter, CoroutineScope coroutineScope) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$showCardManagementSheet$delegate$inlined = mutableState;
        this.$earningCardUpdating$delegate$inlined = mutableState2;
        this.$content$delegate$inlined = state;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, SnapshotStateMap snapshotStateMap, LocalPosCheckInPresenter localPosCheckInPresenter, List list, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 29;
        this.$$this$LaunchedEffect = snapshotStateMap;
        this.this$0 = localPosCheckInPresenter;
        this.$content$delegate$inlined = list;
        this.$showCardManagementSheet$delegate$inlined = mutableState;
        this.$earningCardUpdating$delegate$inlined = mutableState2;
    }

    public /* synthetic */ LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, MutableState mutableState, Object obj, State state, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$showCardManagementSheet$delegate$inlined = mutableState;
        this.$content$delegate$inlined = obj;
        this.$earningCardUpdating$delegate$inlined = state;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalBrandLocationOpenTabPresenter localBrandLocationOpenTabPresenter, CoroutineScope coroutineScope2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.$r8$classId = 1;
        this.this$0 = localBrandLocationOpenTabPresenter;
        this.$$this$LaunchedEffect = coroutineScope2;
        this.$showCardManagementSheet$delegate$inlined = mutableState;
        this.$earningCardUpdating$delegate$inlined = mutableState2;
        this.$content$delegate$inlined = mutableState3;
    }

    public LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalPosCheckInPresenter localPosCheckInPresenter, CurrencyCode currencyCode, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.$r8$classId = 15;
        this.$$this$LaunchedEffect = localPosCheckInPresenter;
        this.this$0 = currencyCode;
        this.$showCardManagementSheet$delegate$inlined = mutableState;
        this.$earningCardUpdating$delegate$inlined = mutableState2;
        this.$content$delegate$inlined = mutableState3;
    }

    public LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, TransfersPresenter transfersPresenter, State state, State state2, MutableState mutableState) {
        this.$r8$classId = 3;
        this.this$0 = transfersPresenter;
        this.$content$delegate$inlined = state;
        this.$earningCardUpdating$delegate$inlined = state2;
        this.$showCardManagementSheet$delegate$inlined = mutableState;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, CardStudioPresenter cardStudioPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.$r8$classId = 18;
        this.$$this$LaunchedEffect = cardStudioPresenter;
        this.$showCardManagementSheet$delegate$inlined = mutableState;
        this.$earningCardUpdating$delegate$inlined = mutableState2;
        this.this$0 = mutableState3;
        this.$content$delegate$inlined = mutableState4;
    }

    public /* synthetic */ LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, Object obj, Object obj2, Object obj3, Object obj4, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.$$this$LaunchedEffect = obj;
        this.this$0 = obj2;
        this.$content$delegate$inlined = obj3;
        this.$earningCardUpdating$delegate$inlined = obj4;
        this.$showCardManagementSheet$delegate$inlined = mutableState;
    }
}
