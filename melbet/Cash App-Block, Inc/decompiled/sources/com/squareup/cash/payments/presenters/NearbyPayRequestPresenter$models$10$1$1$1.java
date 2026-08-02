package com.squareup.cash.payments.presenters;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.core.view.ViewGroupKt;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.ViewSizeResolver$size$3$1;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahx;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchInitiationSource;
import com.squareup.cash.account.backend.ManagedAccountFlipDirection;
import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.account.screens.SwitchFullAccountLoadingScreen;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.ContactInviteEntryPoint;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.Placement;
import com.squareup.cash.cdf.asset.AssetPoolCreatePoolStart;
import com.squareup.cash.cdf.asset.AssetPoolPoolContributionChooseAmount;
import com.squareup.cash.cdf.asset.AssetPoolPoolContributionInstrumentSelection;
import com.squareup.cash.cdf.asset.AssetPoolPoolHomeView;
import com.squareup.cash.cdf.asset.AssetPoolPoolReviewStart;
import com.squareup.cash.cdf.cardmerchantinfofeedback.CardMerchantInfoFeedbackSubmitFeedbackReport;
import com.squareup.cash.cdf.contact.ContactAccessRequestPermission;
import com.squareup.cash.cdf.contact.ContactInviteComplete;
import com.squareup.cash.cdf.contact.ContactInviteInviteConsentScreenDismissed;
import com.squareup.cash.cdf.contact.ContactInviteInviteConsentScreenViewed;
import com.squareup.cash.cdf.contact.ContactInviteTapPromotionUpsell;
import com.squareup.cash.cdf.contact.ContactInviteViewInfo;
import com.squareup.cash.cdf.directdepositaccount.DirectDepositAccountTapEmailForm;
import com.squareup.cash.cdf.directdepositaccount.DirectDepositAccountTapViewForm;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentGetPaidPaymentReceivedPageLand;
import com.squareup.cash.cdf.offers.OfferUpdateType;
import com.squareup.cash.cdf.offers.SheetButtonType;
import com.squareup.cash.cdf.offers.SheetDismissOrigin;
import com.squareup.cash.cdf.ondemandmessage.OnDemandMessageInteractClick;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenAddFavorites;
import com.squareup.cash.cdf.savingsfolder.SavingsFolderManageViewAllActivity;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountInviteFromSponsoredAccountsViewStart;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManagePendingRequestTapEntryPointToViewAll;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManagePendingRequestTapOne;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountTapSectionItemStart;
import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.cash.cdf.stock.StockScrollScrollNews;
import com.squareup.cash.cdf.stock.StockSelectToggleStockSelection;
import com.squareup.cash.cdf.stock.StockViewBrowseNews;
import com.squareup.cash.cdf.stock.StockViewOpenNews;
import com.squareup.cash.cdf.stock.StockViewViewAllNews;
import com.squareup.cash.cdf.stock.StockViewViewNews;
import com.squareup.cash.cdf.thread.EntryPoint;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.receiveasbitcoin.ReceiveP2PAsBitcoinState;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.directdeposit.presenters.DirectDepositForm;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewEvent;
import com.squareup.cash.earnings.viewmodels.payers.PayerCustomerRowModel;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter$models$3$1;
import com.squareup.cash.family.familyhub.presenters.DependentSavingsScreenPresenter;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter;
import com.squareup.cash.family.familyhub.presenters.FamilyUpsellAnalytics;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.family.familyhub.screens.DependentGeneralSavingsScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.familyhub.screens.FamilyPendingRequestsScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewEvent;
import com.squareup.cash.favorites.screens.AddFavorites;
import com.squareup.cash.favorites.screens.ListFavorites;
import com.squareup.cash.favorites.viewmodels.FavoritePersonViewModel;
import com.squareup.cash.favorites.viewmodels.ListFavoritesViewEvent;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ActivityPasscodeModalPinFix;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.screens.GrowToolsCompleteActivityScreen;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.navigation.PaymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$VerifyPasscodeAttempt;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewEvent;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.instruments.presenters.ResolvedTransferOption;
import com.squareup.cash.instruments.screens.TransferOptionPickerAnswer;
import com.squareup.cash.instruments.screens.TransferOptionPickerScreen;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.instruments.screens.TransferOptions;
import com.squareup.cash.instruments.screens.WhichInstrument;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewEvent;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.integration.analytics.UtilsKt$toCdfEvent$2;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.api.data.FilterDetails;
import com.squareup.cash.investing.backend.api.data.FilterGroup;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.presenters.InvestingStockSelectionBlockerPresenter$models$2$1;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$filterGroupCarousels$groups$1$WhenMappings;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewEvent;
import com.squareup.cash.investing.viewmodels.categories.InvestingFilterPillViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.invitations.InviteContactsPresenter;
import com.squareup.cash.invitations.InviteContactsPresenter$models$1$1;
import com.squareup.cash.invitations.InviteContactsPresenter$models$3$3;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.invitations.screens.InviteReferralsRulesBottomSheet;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewEvent;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantInfoFeedbackBottomSheetScreen;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewEvent;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackAnswer;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackOption;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackQuestion;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackScreen;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewEvent;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.offers.backend.api.HomeResult;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1;
import com.squareup.cash.offers.db.OffersHome;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.offers.presenters.OffersDetailsState;
import com.squareup.cash.offers.presenters.RealOffersAnalytics;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.offers.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEvent;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.pools.presenters.PoolContributeWithNotePresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.pools.presenters.StartPoolPresenter;
import com.squareup.cash.pools.presenters.StartPoolPresenter$models$2$4;
import com.squareup.cash.pools.screens.PoolContributeScreen;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.screens.StartPoolScreen;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewEvent;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.PoolsListViewEvent;
import com.squareup.cash.pools.viewmodels.StartPoolViewEvent;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.profile.devicemanager.backend.LoggedInDevice;
import com.squareup.cash.profile.devicemanager.presenters.DataLoadingState;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceDetailsScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewEvent;
import com.squareup.cash.recipients.data.RecipientRepository$Result;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.data.SavingsBalance;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.screens.SavingsCardSheet;
import com.squareup.cash.savings.screens.SavingsFullActivityScreen;
import com.squareup.cash.savings.viewmodels.SavingsHeaderEvent$InformationClicked;
import com.squareup.cash.savings.viewmodels.SavingsHeaderEvent$RouteClicked;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.aegis.core.FamilyAccountsParameters;
import com.squareup.protos.cash.aegis.core.InviteLink;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipTier;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import com.squareup.protos.cash.fiatly.api.v2.PaymentStateCategory;
import com.squareup.protos.cash.fiatly.api.v2.PaymentUpdate;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataRequest;
import com.squareup.protos.cash.marketprices.service.MarketPricesAppService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataRequest;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.api.CardBlocker;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataResponse;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.Intents;
import com.squareup.util.cash.Cashtags;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.analytics.CdfEvent;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class NearbyPayRequestPresenter$models$10$1$1$1 implements FlowCollector {
    public final /* synthetic */ Object $confirmedPayments;
    public final /* synthetic */ Object $lastVibrationTime$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $vibrate$delegate;
    public final /* synthetic */ Object this$0;

    public NearbyPayRequestPresenter$models$10$1$1$1(CoroutineScope coroutineScope, MutableState mutableState, ArcadeFormDateInputView arcadeFormDateInputView, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController) {
        this.$r8$classId = 7;
        this.$vibrate$delegate = mutableState;
        this.this$0 = arcadeFormDateInputView;
        this.$lastVibrationTime$delegate = delegatingSoftwareKeyboardController;
        this.$confirmedPayments = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r11.emit(r12, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$investing$backend$real$RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2(Object obj, Continuation continuation) {
        RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1 realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        int i2;
        FlowCollector flowCollector;
        if (continuation instanceof RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1) {
            realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1 = (RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i3 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.$confirmedPayments;
                    MarketPricesAppService marketPricesAppService = ((RealInvestingHistoricalData) this.this$0).marketPricesService;
                    GetInvestmentEntityHistoricalDataRequest getInvestmentEntityHistoricalDataRequest = new GetInvestmentEntityHistoricalDataRequest((HistoricalRange) this.$vibrate$delegate, ((InvestmentEntityToken) this.$lastVibrationTime$delegate).value, EmptyList.INSTANCE, ByteString.EMPTY);
                    realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = flowCollector2;
                    i2 = 0;
                    realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                    realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    Object investmentEntityHistoricalData = marketPricesAppService.getInvestmentEntityHistoricalData(getInvestmentEntityHistoricalDataRequest, realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1);
                    if (investmentEntityHistoricalData != coroutineSingletons) {
                        obj2 = investmentEntityHistoricalData;
                        flowCollector = flowCollector2;
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
                i2 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.I$0;
                flowCollector = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                SafeTrace.throwOnFailure(obj2);
                realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i2;
                realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
            }
        }
        realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1 = new RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
        realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i2;
        realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r10.emit(r11, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$investing$backend$real$RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2(Object obj, Continuation continuation) {
        RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1 realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        int i2;
        FlowCollector flowCollector;
        if (continuation instanceof RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1) {
            realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1 = (RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i3 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.$confirmedPayments;
                    PortfoliosService portfoliosService = ((RealInvestingHistoricalData) this.this$0).portfoliosService;
                    GetPortfoliosHistoricalDataRequest getPortfoliosHistoricalDataRequest = new GetPortfoliosHistoricalDataRequest((HistoricalRange) this.$lastVibrationTime$delegate, (String) this.$vibrate$delegate, 12);
                    realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = flowCollector2;
                    i2 = 0;
                    realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                    realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    Object portfoliosHistoricalData = portfoliosService.getPortfoliosHistoricalData(getPortfoliosHistoricalDataRequest, realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1);
                    if (portfoliosHistoricalData != coroutineSingletons) {
                        obj2 = portfoliosHistoricalData;
                        flowCollector = flowCollector2;
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
                i2 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.I$0;
                flowCollector = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                SafeTrace.throwOnFailure(obj2);
                realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i2;
                realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
            }
        }
        realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1 = new RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
        realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = i2;
        realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object emit$com$squareup$cash$investing$presenters$InvestingStockSelectionBlockerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$lastVibrationTime$delegate;
        MutableState mutableState2 = (MutableState) this.$vibrate$delegate;
        TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) this.this$0;
        CoroutineContext coroutineContext = (CoroutineContext) tapToPayPresenter.flowStarter;
        CoroutineScope coroutineScope = (CoroutineScope) this.$confirmedPayments;
        InvestingStockSelectionViewEvent investingStockSelectionViewEvent = (InvestingStockSelectionViewEvent) obj;
        boolean z = false;
        Object[] objArr = 0;
        Continuation continuation2 = null;
        if (investingStockSelectionViewEvent instanceof InvestingStockSelectionViewEvent.NavigationClicked) {
            JobKt.launch$default(coroutineScope, coroutineContext, null, new InvestingStockSelectionBlockerPresenter$models$2$1(tapToPayPresenter, investingStockSelectionViewEvent, continuation2, objArr == true ? 1 : 0), 2);
        } else if (investingStockSelectionViewEvent instanceof InvestingStockSelectionViewEvent.SearchTextChanged) {
            mutableState2.setValue(((InvestingStockSelectionViewEvent.SearchTextChanged) investingStockSelectionViewEvent).text);
        } else {
            int i = 1;
            if (investingStockSelectionViewEvent instanceof InvestingStockSelectionViewEvent.SelectStockClicked) {
                JobKt.launch$default(coroutineScope, coroutineContext, null, new InvestingStockSelectionBlockerPresenter$models$2$1(tapToPayPresenter, investingStockSelectionViewEvent, continuation2, i), 2);
            } else if (investingStockSelectionViewEvent instanceof InvestingStockSelectionViewEvent.MultiSelectStockClicked) {
                mutableState2.setValue(new InputFieldText.Simple(""));
                Set set = (Set) mutableState.getValue();
                InvestingStockSelectionViewEvent.MultiSelectStockClicked multiSelectStockClicked = (InvestingStockSelectionViewEvent.MultiSelectStockClicked) investingStockSelectionViewEvent;
                String str = multiSelectStockClicked.entityToken.value;
                LinkedHashSet mutableSet = CollectionsKt.toMutableSet(set);
                if (mutableSet.contains(str)) {
                    mutableSet.remove(str);
                } else {
                    mutableSet.add(str);
                    z = true;
                }
                ((Analytics) tapToPayPresenter.keyProvider).track(new StockSelectToggleStockSelection(Boolean.valueOf(z), multiSelectStockClicked.symbol), null);
                mutableState.setValue(mutableSet);
            } else if (investingStockSelectionViewEvent instanceof InvestingStockSelectionViewEvent.ViewStockClicked) {
                ((BetterNavigator.ScreenNavigator) tapToPayPresenter.navigator).askQuestion(new InvestingScreens.SelectStockQuestion(), new MerchantBlockingViewKt$$ExternalSyntheticLambda15(25, (InvestingStockSelectionViewEvent.ViewStockClicked) investingStockSelectionViewEvent, tapToPayPresenter));
            } else {
                if (!(investingStockSelectionViewEvent instanceof InvestingStockSelectionViewEvent.SubmitMultiSelection)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                JobKt.launch$default(coroutineScope, coroutineContext, null, new InvestingHomeView$onScrollFlow$1(tapToPayPresenter, investingStockSelectionViewEvent, mutableState, null, 10), 2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$investing$presenters$search$InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2(Object obj, Continuation continuation) {
        InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1 investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1;
        int i;
        String str;
        List list = ((FilterConfiguration.Categories) this.this$0).categoryTokens;
        FilterGroup filterGroup = (FilterGroup) this.$lastVibrationTime$delegate;
        if (continuation instanceof InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1) {
            investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1 = (InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1) continuation;
            int i2 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.$confirmedPayments;
                    FilterDetails.Categories categories = (FilterDetails.Categories) obj;
                    int size = list.size();
                    if (size == 1) {
                        for (Category category : categories.categories) {
                            if (Intrinsics.areEqual(category.token, list.get(0))) {
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    category = null;
                    if (size == 0) {
                        str = filterGroup.name;
                    } else if (size != 1) {
                        str = filterGroup.namePlural;
                        if (str == null) {
                            str = filterGroup.name;
                        }
                    } else {
                        category.getClass();
                        str = category.name;
                    }
                    InvestingFilterPillViewModel investingFilterPillViewModel = new InvestingFilterPillViewModel(filterGroup.token, (ColorModel) this.$vibrate$delegate, category != null ? category.prefixIcon : null, str, size, filterGroup.name);
                    investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(investingFilterPillViewModel, investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons) {
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
        investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1 = new InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
        Object obj22 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$investing$presenters$search$InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2(Object obj, Continuation continuation) {
        InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1 investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1) {
            investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1 = (InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1) continuation;
            int i2 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1.label;
                SyncInvestmentCategory.PrefixIcon prefixIcon = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.$confirmedPayments;
                    String str = (String) obj;
                    SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph optionGlyph = ((SyncInvestmentFilterGroup.SubfilterOption) CollectionsKt.first((List) this.this$0)).glyph;
                    int i3 = optionGlyph == null ? -1 : InvestingSearchPresenter$filterGroupCarousels$groups$1$WhenMappings.$EnumSwitchMapping$0[optionGlyph.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            prefixIcon = SyncInvestmentCategory.PrefixIcon.UP_ARROW;
                        } else if (i3 == 2) {
                            prefixIcon = SyncInvestmentCategory.PrefixIcon.DOWN_ARROW;
                        } else if (i3 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                    SyncInvestmentCategory.PrefixIcon prefixIcon2 = prefixIcon;
                    FilterGroup filterGroup = (FilterGroup) this.$lastVibrationTime$delegate;
                    InvestingFilterPillViewModel investingFilterPillViewModel = new InvestingFilterPillViewModel(filterGroup.token, (ColorModel) this.$vibrate$delegate, prefixIcon2, str, 1, filterGroup.name);
                    investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(investingFilterPillViewModel, investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1) == coroutineSingletons) {
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
        investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1 = new InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1(this, continuation);
        Object obj22 = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2$1.label;
        SyncInvestmentCategory.PrefixIcon prefixIcon3 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (r10 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        r0 = "invested";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (((com.squareup.cash.investing.primitives.InvestingState.Content) r9).portfolioState == com.squareup.cash.investing.primitives.InvestingState.Content.PortfolioState.ABSENT) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$investingcrypto$presenters$news$InvestingCryptoNewsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$vibrate$delegate;
        MoneybotHomePresenter moneybotHomePresenter = (MoneybotHomePresenter) this.$confirmedPayments;
        EquityType equityType = (EquityType) moneybotHomePresenter.contentExceededLoadTime$delegate;
        BetterNavigator.ScreenNavigator screenNavigator = moneybotHomePresenter.navigator;
        boolean z = moneybotHomePresenter.shouldAnimateHomeEntrance;
        Analytics analytics = (Analytics) moneybotHomePresenter.pluginRegistry;
        NewsKind newsKind = (NewsKind) moneybotHomePresenter.failedToLoadHome$delegate;
        InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent = (InvestingCryptoNewsViewEvent) obj;
        if (investingCryptoNewsViewEvent instanceof InvestingCryptoNewsViewEvent.ArticleClicked) {
            IntentLauncher intentLauncher = (IntentLauncher) moneybotHomePresenter.moneybotFlagsHelper;
            InvestingCryptoNewsViewEvent.ArticleClicked articleClicked = (InvestingCryptoNewsViewEvent.ArticleClicked) investingCryptoNewsViewEvent;
            InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel = articleClicked.article;
            intentLauncher.launchUrlInInternalBrowser(investingCryptoNewsArticleViewModel.url);
            analytics.track(new StockViewOpenNews(z ? StockViewOpenNews.Location.CAROUSEL : StockViewOpenNews.Location.LIST, MoneybotHomePresenter.getAnalyticsName(newsKind), Integer.valueOf(articleClicked.positionInList + 1), investingCryptoNewsArticleViewModel.provider), null);
        } else if (Intrinsics.areEqual(investingCryptoNewsViewEvent, InvestingCryptoNewsViewEvent.ListScrolled.INSTANCE)) {
            analytics.track(new StockScrollScrollNews(MoneybotHomePresenter.access$getSourceType(moneybotHomePresenter, newsKind)), null);
        } else if (Intrinsics.areEqual(investingCryptoNewsViewEvent, InvestingCryptoNewsViewEvent.NavigationClicked.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (Intrinsics.areEqual(investingCryptoNewsViewEvent, InvestingCryptoNewsViewEvent.ViewAllArticlesClicked.INSTANCE)) {
            boolean booleanValue = ((Boolean) ((State) this.$lastVibrationTime$delegate).getValue()).booleanValue();
            InvestingState investingState = (InvestingState) this.this$0;
            analytics.track(new StockViewViewAllNews(MoneybotHomePresenter.getAnalyticsName(newsKind), equityType), null);
            String str = "never_invested";
            if (!(newsKind instanceof NewsKind.BitcoinPortfolio)) {
                if (!(investingState instanceof InvestingState.Content)) {
                    str = null;
                }
                if (str != null) {
                    analytics.track(new StockViewBrowseNews(str, MoneybotHomePresenter.getAnalyticsName(newsKind)), null);
                }
                screenNavigator.goTo(new InvestingScreens.NewsScreen(newsKind, true));
            }
        } else {
            if (!Intrinsics.areEqual(investingCryptoNewsViewEvent, InvestingCryptoNewsViewEvent.ListViewed.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (!((Boolean) mutableState.getValue()).booleanValue() && !(newsKind instanceof NewsKind.BitcoinPortfolio) && z) {
                analytics.track(new StockViewViewNews(MoneybotHomePresenter.access$getSourceType(moneybotHomePresenter, newsKind), equityType), null);
                mutableState.setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$invitations$InviteContactsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        ContactInviteInviteConsentScreenViewed.ContactSection contactSection;
        InviteContactsPresenter inviteContactsPresenter = (InviteContactsPresenter) this.this$0;
        BlockersScreens.InviteContactsScreen inviteContactsScreen = inviteContactsPresenter.args;
        BetterNavigator.ScreenNavigator screenNavigator = inviteContactsPresenter.navigator;
        StateFlowImpl stateFlowImpl = inviteContactsPresenter.inviteConsentBottomSheetViewModel;
        ContactInviteEntryPoint contactInviteEntryPoint = inviteContactsPresenter.entryPoint;
        Analytics analytics = inviteContactsPresenter.analytics;
        CoroutineScope coroutineScope = (CoroutineScope) this.$confirmedPayments;
        InviteContactsViewEvent inviteContactsViewEvent = (InviteContactsViewEvent) obj;
        Continuation continuation2 = null;
        if (inviteContactsViewEvent instanceof InviteContactsViewEvent.Close) {
            ContactInviteComplete.Trigger trigger = ContactInviteComplete.Trigger.CLOSE_BUTTON;
            analytics.track(new ContactInviteComplete(contactInviteEntryPoint), null);
            screenNavigator.goTo(inviteContactsPresenter.blockersNavigator.getSkip(inviteContactsScreen, inviteContactsScreen.blockersData));
        } else {
            int i = 4;
            if (inviteContactsViewEvent instanceof InviteContactsViewEvent.RequestPermissions) {
                analytics.track(new ContactAccessRequestPermission(ContactAccessRequestPermission.PermissionRequestSource.INVITE_SCREEN_ALLOW_BANNER, contactInviteEntryPoint, null), null);
                JobKt.launch$default(coroutineScope, null, null, new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation2, i), 3);
            } else if (inviteContactsViewEvent instanceof InviteContactsViewEvent.Shared) {
                JobKt.launch$default(coroutineScope, null, null, new InviteContactsPresenter$models$1$1(inviteContactsPresenter, continuation2, 5), 3);
            } else if (inviteContactsViewEvent instanceof InviteContactsViewEvent.ShowReferralRules) {
                analytics.track(new ContactInviteViewInfo(), null);
                screenNavigator.goTo(new InviteReferralsRulesBottomSheet(inviteContactsScreen.inviteFriendsScreen.enable_referral_text));
            } else if (inviteContactsViewEvent instanceof InviteContactsViewEvent.ShowConsent) {
                InviteContactsViewEvent.ShowConsent showConsent = (InviteContactsViewEvent.ShowConsent) inviteContactsViewEvent;
                InviteContactsViewEvent.SendInvite.ContactSection contactSection2 = showConsent.section;
                RedactedString redactedString = showConsent.phoneNumber;
                Versioned versioned = (Versioned) stateFlowImpl.getValue();
                AndroidStringManager androidStringManager = inviteContactsPresenter.stringManager;
                String str = androidStringManager.get(R.string.invite_consent_title);
                String str2 = redactedString.value;
                str2.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.invite_consent_description)).format(new Object[]{str2});
                format2.getClass();
                stateFlowImpl.updateState(null, VersionedKt.update(versioned, new InviteContactsViewModel.InviteConsentBottomSheetViewModel(str, format2, androidStringManager.get(R.string.invite_consent_button_title), showConsent.alias, contactSection2, redactedString)));
                int ordinal = contactSection2.ordinal();
                if (ordinal == 0) {
                    contactSection = ContactInviteInviteConsentScreenViewed.ContactSection.RECOMMENDED;
                } else if (ordinal == 1) {
                    contactSection = ContactInviteInviteConsentScreenViewed.ContactSection.ALL_CONTACTS;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    contactSection = ContactInviteInviteConsentScreenViewed.ContactSection.NOT_IN_CONTACTS;
                }
                analytics.track(new ContactInviteInviteConsentScreenViewed(contactSection, showConsent.state.stateName), null);
            } else if (inviteContactsViewEvent instanceof InviteContactsViewEvent.ConsentAccepted) {
                analytics.track(new ContactInviteInviteConsentScreenDismissed(Boolean.TRUE), null);
                Versioned update = VersionedKt.update((Versioned) stateFlowImpl.getValue(), null);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, update);
                JobKt.launch$default(coroutineScope, null, null, new InviteContactsPresenter$models$3$3(inviteContactsPresenter, inviteContactsViewEvent, null, 0), 3);
            } else if (inviteContactsViewEvent instanceof InviteContactsViewEvent.DismissBottomSheet) {
                analytics.track(new ContactInviteInviteConsentScreenDismissed(Boolean.FALSE), null);
                Versioned update2 = VersionedKt.update((Versioned) stateFlowImpl.getValue(), null);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, update2);
            } else if (inviteContactsViewEvent instanceof InviteContactsViewEvent.SendInvite) {
                JobKt.launch$default(coroutineScope, null, null, new InviteContactsPresenter$models$3$3(inviteContactsPresenter, inviteContactsViewEvent, null, 1), 3);
            } else if (inviteContactsViewEvent instanceof InviteContactsViewEvent.TextChanged) {
                JobKt.launch$default(coroutineScope, null, null, new MusicPresenter$models$2$1((MutableSharedFlow) this.$lastVibrationTime$delegate, inviteContactsViewEvent, null, 4), 3);
            } else if (inviteContactsViewEvent instanceof InviteContactsViewEvent.SearchFocusChanged) {
                ((MutableState) this.$vibrate$delegate).setValue(Boolean.valueOf(((InviteContactsViewEvent.SearchFocusChanged) inviteContactsViewEvent).hasFocus));
            } else {
                if (!(inviteContactsViewEvent instanceof InviteContactsViewEvent.TapPromotionUpSellCTA)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str3 = ((InviteContactsViewEvent.TapPromotionUpSellCTA) inviteContactsViewEvent).clientRoute;
                analytics.track(new ContactInviteTapPromotionUpsell(contactInviteEntryPoint, str3), null);
                inviteContactsPresenter.router.route(new RoutingParams(inviteContactsPresenter.args, null, Back.INSTANCE, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str3);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$merchant$presenters$MerchantInfoFeedbackPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CardMerchantInfoFeedbackSubmitFeedbackReport.IssueType issueType;
        MutableState mutableState = (MutableState) this.$vibrate$delegate;
        ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.$confirmedPayments;
        MerchantInfoFeedbackViewEvent merchantInfoFeedbackViewEvent = (MerchantInfoFeedbackViewEvent) obj;
        if (Intrinsics.areEqual(merchantInfoFeedbackViewEvent, MerchantInfoFeedbackViewEvent.ContinueClicked.INSTANCE)) {
            Map map = (Map) mutableState.getValue();
            Recipient recipient = (Recipient) ((State) this.this$0).getValue();
            String str = recipient != null ? recipient.threadedCustomerId : null;
            MerchantScreen$MerchantInfoFeedbackBottomSheetScreen merchantScreen$MerchantInfoFeedbackBottomSheetScreen = (MerchantScreen$MerchantInfoFeedbackBottomSheetScreen) shareSheetPresenter.modelUpdates;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category category = (MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category) ((Map.Entry) it.next()).getKey();
                Analytics analytics = (Analytics) shareSheetPresenter.analytics;
                String str2 = merchantScreen$MerchantInfoFeedbackBottomSheetScreen.merchantToken;
                String activeAccountToken = PlatformKt.activeAccountToken((SessionManager) shareSheetPresenter.profileManager);
                String str3 = merchantScreen$MerchantInfoFeedbackBottomSheetScreen.transactionToken;
                int ordinal = category.ordinal();
                if (ordinal == 0) {
                    issueType = CardMerchantInfoFeedbackSubmitFeedbackReport.IssueType.MerchantName;
                } else if (ordinal == 1) {
                    issueType = CardMerchantInfoFeedbackSubmitFeedbackReport.IssueType.MerchantLogo;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    issueType = CardMerchantInfoFeedbackSubmitFeedbackReport.IssueType.MerchantLocation;
                }
                analytics.track(new CardMerchantInfoFeedbackSubmitFeedbackReport(str2, str, activeAccountToken, str3, issueType), null);
            }
            ((MutableState) this.$lastVibrationTime$delegate).setValue(Boolean.TRUE);
        } else if (merchantInfoFeedbackViewEvent instanceof MerchantInfoFeedbackViewEvent.RowSelected) {
            Map map2 = (Map) mutableState.getValue();
            MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow merchantInfoRow = ((MerchantInfoFeedbackViewEvent.RowSelected) merchantInfoFeedbackViewEvent).row;
            mutableState.setValue(MapsKt__MapsKt.plus(map2, new Pair(merchantInfoRow.category, Boolean.valueOf(merchantInfoRow.selected))));
        } else {
            if (!Intrinsics.areEqual(merchantInfoFeedbackViewEvent, MerchantInfoFeedbackViewEvent.SheetDismissed.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ((BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator).goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$moneybot$presenters$MoneybotFeedbackPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MoneybotFeedbackQuestion moneybotFeedbackQuestion = (MoneybotFeedbackQuestion) this.this$0;
        MutableState mutableState = (MutableState) this.$lastVibrationTime$delegate;
        MutableState mutableState2 = (MutableState) this.$vibrate$delegate;
        MusicPresenter musicPresenter = (MusicPresenter) this.$confirmedPayments;
        MoneybotFeedbackScreen moneybotFeedbackScreen = (MoneybotFeedbackScreen) musicPresenter.musicPlayer;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) musicPresenter.navigator;
        MoneybotFeedbackViewEvent moneybotFeedbackViewEvent = (MoneybotFeedbackViewEvent) obj;
        if (moneybotFeedbackViewEvent instanceof MoneybotFeedbackViewEvent.OptionSelected) {
            mutableState2.setValue(((MoneybotFeedbackViewEvent.OptionSelected) moneybotFeedbackViewEvent).option);
        } else if (moneybotFeedbackViewEvent instanceof MoneybotFeedbackViewEvent.CommentChanged) {
            mutableState.setValue(((MoneybotFeedbackViewEvent.CommentChanged) moneybotFeedbackViewEvent).text);
        } else if (Intrinsics.areEqual(moneybotFeedbackViewEvent, MoneybotFeedbackViewEvent.SubmitTapped.INSTANCE)) {
            screenNavigator.giveAnswer(moneybotFeedbackScreen.askedQuestion, new MoneybotFeedbackAnswer.Submitted(moneybotFeedbackQuestion.sessionId, moneybotFeedbackQuestion.messageId, moneybotFeedbackQuestion.direction, (MoneybotFeedbackOption) mutableState2.getValue(), (String) mutableState.getValue()));
        } else if (Intrinsics.areEqual(moneybotFeedbackViewEvent, MoneybotFeedbackViewEvent.Dismissed.INSTANCE)) {
            screenNavigator.giveAnswer(moneybotFeedbackScreen.askedQuestion, new MoneybotFeedbackAnswer.Dismissed(moneybotFeedbackQuestion.sessionId, moneybotFeedbackQuestion.messageId, moneybotFeedbackQuestion.direction));
        } else {
            if (!Intrinsics.areEqual(moneybotFeedbackViewEvent, MoneybotFeedbackViewEvent.LearnMoreTapped.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ((RealRouter) musicPresenter.args).route(new RoutingParams(null, null, null, null, null, null, 511), ((AndroidStringManager) musicPresenter.musicRepository).get(R.string.moneybot_feedback_learn_more_url));
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$offers$presenters$OffersDetailsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.this$0;
        MutableState mutableState2 = (MutableState) this.$vibrate$delegate;
        OffersDetailsPresenter offersDetailsPresenter = (OffersDetailsPresenter) this.$confirmedPayments;
        OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = (OffersScreen$OffersDetailsScreen) offersDetailsPresenter.args;
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) offersDetailsPresenter.analyticsHelper;
        BetterNavigator.ScreenNavigator screenNavigator = offersDetailsPresenter.navigator;
        RealOffersAnalytics realOffersAnalytics = (RealOffersAnalytics) offersDetailsPresenter.analytics;
        OffersDetailsSheetViewEvent offersDetailsSheetViewEvent = (OffersDetailsSheetViewEvent) obj;
        boolean z = offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.OfferButtonEvent.Close;
        Back back = Back.INSTANCE;
        if (z) {
            realOffersAnalytics.trackDetailsSheetDismissed(SheetDismissOrigin.Button);
            screenNavigator.goTo(back);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.CloseWithError) {
            offersDetailsPresenter.closeAndShowErrorNotification(offersDetailsPresenter.stringManager.get(R.string.offers_tab_generic_error_title));
        } else if (offersDetailsSheetViewEvent instanceof ItemViewed) {
            RealOffersAnalytics.trackImpressionAnalyticsEvents$default(realOffersAnalytics, ((ItemViewed) offersDetailsSheetViewEvent).analyticsEventSpecs);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.OfferExpired) {
            mutableState2.setValue(Boolean.TRUE);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.OfferActive) {
            mutableState2.setValue(Boolean.FALSE);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.LearnMoreClicked) {
            OffersDetailsPresenter.access$routeFooterActionUrl(offersDetailsPresenter, ((OffersDetailsSheetViewEvent.LearnMoreClicked) offersDetailsSheetViewEvent).routeUrl);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.TermsClicked) {
            OffersDetailsPresenter.access$routeFooterActionUrl(offersDetailsPresenter, ((OffersDetailsSheetViewEvent.TermsClicked) offersDetailsSheetViewEvent).routeUrl);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.FooterMarkdownClicked) {
            OffersDetailsPresenter.access$routeFooterActionUrl(offersDetailsPresenter, ((OffersDetailsSheetViewEvent.FooterMarkdownClicked) offersDetailsSheetViewEvent).routeUrl);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.OfferButtonEvent.ActionUrl) {
            realOffersAnalyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.BOOST_PLASMA);
            RealRouter realRouter = (RealRouter) offersDetailsPresenter.router;
            String str = ((OffersDetailsSheetViewEvent.OfferButtonEvent.ActionUrl) offersDetailsSheetViewEvent).url;
            OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen2 = (OffersScreen$OffersDetailsScreen) offersDetailsPresenter.args;
            String analyticsName = BlockersData.AnalyticsData.Source.SHOPPING.getAnalyticsName();
            Screen screen = offersScreen$OffersDetailsScreen.parentScreen;
            String str2 = offersScreen$OffersDetailsScreen.referrerFlowToken;
            if (str2 == null && (str2 = realOffersAnalyticsHelper.getReferrerFlowToken()) == null) {
                str2 = realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP);
            }
            realRouter.route(new RoutingParams(offersScreen$OffersDetailsScreen2, analyticsName, screen, null, new AnalyticsParams.OffersTabAnalyticsParams(str2, false), null, 468), str);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.OfferButtonEvent.AddOffer) {
            OffersDetailsSheetViewEvent.OfferButtonEvent.AddOffer addOffer = (OffersDetailsSheetViewEvent.OfferButtonEvent.AddOffer) offersDetailsSheetViewEvent;
            String str3 = addOffer.boostToken;
            OffersDetailsPresenter.access$handleOfferSelection(offersDetailsPresenter, str3, addOffer.analyticsActionEventSpecs, OfferUpdateType.ADD);
            mutableState.setValue(str3);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.OfferButtonEvent.SwapOffer) {
            OffersDetailsSheetViewEvent.OfferButtonEvent.SwapOffer swapOffer = (OffersDetailsSheetViewEvent.OfferButtonEvent.SwapOffer) offersDetailsSheetViewEvent;
            String str4 = swapOffer.boostToken;
            OffersDetailsPresenter.access$handleOfferSelection(offersDetailsPresenter, str4, swapOffer.analyticsActionEventSpecs, OfferUpdateType.SWAP);
            mutableState.setValue(str4);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.OfferButtonEvent.RemoveOffer) {
            OffersDetailsPresenter.access$handleOfferSelection(offersDetailsPresenter, null, ((OffersDetailsSheetViewEvent.OfferButtonEvent.RemoveOffer) offersDetailsSheetViewEvent).analyticsActionEventSpecs, OfferUpdateType.REMOVE);
            screenNavigator.goTo(back);
        } else if (offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.OfferButtonEvent.CashCardAction) {
            OffersDetailsState offersDetailsState = (OffersDetailsState) ((MutableState) this.$lastVibrationTime$delegate).getValue();
            List list = ((OffersDetailsSheetViewEvent.OfferButtonEvent.CashCardAction) offersDetailsSheetViewEvent).analyticsActionEventSpecs;
            int ordinal = offersDetailsState.cardState.ordinal();
            if (ordinal == 1) {
                BlockersData.Flow.INSTANCE.getClass();
                String generateToken = BlockersData.Flow.Companion.generateToken();
                Pair pair = new Pair(AnalyticsEvent.ParamType.CARD_PLASMA_FLOW_TOKEN, generateToken);
                AnalyticsEvent.ParamType paramType = AnalyticsEvent.ParamType.BUTTON_TYPE;
                SheetButtonType[] sheetButtonTypeArr = SheetButtonType.$VALUES;
                realOffersAnalytics.trackGenericAnalyticsEvents(list, MapsKt__MapsKt.mapOf(pair, new Pair(paramType, "REQUEST_CASH_CARD")));
                FlowStarter flowStarter = (FlowStarter) offersDetailsPresenter.flowStarter;
                Screen screen2 = offersScreen$OffersDetailsScreen.parentScreen;
                if (screen2 == null) {
                    screen2 = new OffersScreen$OffersHomeScreen(RealUuidGenerator.generate(), null, "");
                }
                Screen screen3 = screen2;
                screenNavigator.goTo(new BlockersScreens.StartFlowEntryPointScreen(BlockersData.copy$default(FlowStarter.startFlow$default((RealFlowStarter) flowStarter, BlockersData.Flow.SERVER_FLOW, screen3, null, null, generateToken, null, new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.SHOPPING, (String) null, 6), null, null, 860), null, null, null, Flow$Type.REQUEST_PHYSICAL_CARD, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -9, 65535), (String) null, screen3, (BlockersScreens.StartFlowEntryPointScreen.Origin) null, 26));
            } else if (ordinal == 3) {
                AnalyticsEvent.ParamType paramType2 = AnalyticsEvent.ParamType.BUTTON_TYPE;
                SheetButtonType[] sheetButtonTypeArr2 = SheetButtonType.$VALUES;
                realOffersAnalytics.trackGenericAnalyticsEvents(list, MapsKt__MapsJVMKt.mapOf(new Pair(paramType2, "ACTIVATE_CASH_CARD")));
                screenNavigator.goTo(new WalletHomeScreen(7, (Integer) null, (String) null));
            }
        } else {
            if (!(offersDetailsSheetViewEvent instanceof OffersDetailsSheetViewEvent.DismissSheet)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            realOffersAnalytics.trackDetailsSheetDismissed(SheetDismissOrigin.Other);
            screenNavigator.goTo(back);
        }
        if (offersDetailsSheetViewEvent instanceof OffersAnalyticsViewEvent) {
            RealOffersAnalytics.trackGenericAnalyticsEvents$default(realOffersAnalytics, ((OffersAnalyticsViewEvent) offersDetailsSheetViewEvent).getAnalyticsActionEventSpecs());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
    private final Object emit$com$squareup$cash$pools$presenters$PoolContributeWithNotePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        String format2;
        long longValue;
        Object amountAtmPicker;
        MutableState mutableState = (MutableState) this.$lastVibrationTime$delegate;
        MutableState mutableState2 = (MutableState) this.$vibrate$delegate;
        PoolContributeWithNotePresenter poolContributeWithNotePresenter = (PoolContributeWithNotePresenter) this.this$0;
        MoneyFormatter moneyFormatter = poolContributeWithNotePresenter.moneyFormatter;
        MoneyFormatter moneyFormatter2 = poolContributeWithNotePresenter.noSymbolMoneyFormatter;
        BetterNavigator.ScreenNavigator screenNavigator = poolContributeWithNotePresenter.navigator;
        Analytics analytics = poolContributeWithNotePresenter.analytics;
        PoolContributeScreen poolContributeScreen = poolContributeWithNotePresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$confirmedPayments;
        PoolContributeWithNoteViewEvent poolContributeWithNoteViewEvent = (PoolContributeWithNoteViewEvent) obj;
        boolean areEqual = Intrinsics.areEqual(poolContributeWithNoteViewEvent, PoolContributeWithNoteViewEvent.DismissSheet.INSTANCE);
        Back back = Back.INSTANCE;
        if (areEqual) {
            screenNavigator.goTo(back);
        } else if (Intrinsics.areEqual(poolContributeWithNoteViewEvent, PoolContributeWithNoteViewEvent.Back.INSTANCE)) {
            AbstractPersistentList abstractPersistentList = PoolContributeWithNotePresenter.quickAmounts;
            PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) mutableState2.getValue();
            if ((poolContributeWithNoteViewModel instanceof PoolContributeWithNoteViewModel.AmountAtmPicker) || (poolContributeWithNoteViewModel instanceof PoolContributeWithNoteViewModel.AmountCustomPicker)) {
                screenNavigator.goTo(back);
            } else if (poolContributeWithNoteViewModel instanceof PoolContributeWithNoteViewModel.InputNote) {
                PoolContributeWithNoteViewModel.InputNote inputNote = (PoolContributeWithNoteViewModel.InputNote) poolContributeWithNoteViewModel;
                Money money = inputNote.amount;
                String format3 = moneyFormatter2.format(money);
                ListBuilder buildAmountPickerOptions = poolContributeWithNotePresenter.buildAmountPickerOptions(money);
                format3.getClass();
                buildAmountPickerOptions.getClass();
                if (inputNote.customAmount) {
                    CurrencyCode currencyCode = money.currency_code;
                    currencyCode.getClass();
                    amountAtmPicker = new PoolContributeWithNoteViewModel.AmountCustomPicker(money, currencyCode, format3, 8);
                } else {
                    amountAtmPicker = new PoolContributeWithNoteViewModel.AmountAtmPicker(money, buildAmountPickerOptions, true);
                }
                mutableState2.setValue(amountAtmPicker);
            } else {
                if (!(poolContributeWithNoteViewModel instanceof PoolContributeWithNoteViewModel.Review)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                PoolContributeWithNoteViewModel.Review review = (PoolContributeWithNoteViewModel.Review) poolContributeWithNoteViewModel;
                mutableState2.setValue(new PoolContributeWithNoteViewModel.InputNote(review.amount, review.amountFormatted, review.poolName, review.customAmount, review.note, 32));
            }
        } else {
            if (Intrinsics.areEqual(poolContributeWithNoteViewEvent, PoolContributeWithNoteViewEvent.Continue.INSTANCE)) {
                AbstractPersistentList abstractPersistentList2 = PoolContributeWithNotePresenter.quickAmounts;
                PoolContributeWithNoteViewModel poolContributeWithNoteViewModel2 = (PoolContributeWithNoteViewModel) mutableState2.getValue();
                if (poolContributeWithNoteViewModel2 instanceof PoolContributeWithNoteViewModel.AmountAtmPicker) {
                    String str = poolContributeScreen.flowToken;
                    String str2 = poolContributeScreen.poolToken;
                    PoolContributeWithNoteViewModel.AmountAtmPicker amountAtmPicker2 = (PoolContributeWithNoteViewModel.AmountAtmPicker) poolContributeWithNoteViewModel2;
                    Money money2 = amountAtmPicker2.amount;
                    Long l = money2.amount;
                    longValue = l != null ? l.longValue() : 0L;
                    CurrencyCode currencyCode2 = money2.currency_code;
                    String name = currencyCode2 != null ? currencyCode2.name() : null;
                    zzahx.trackContributionChooseAmount(analytics, str, str2, AssetPoolPoolContributionChooseAmount.SelectionType.ATM_AMOUNT, longValue, name != null ? name : "");
                    String format4 = moneyFormatter.format(money2);
                    String str3 = (String) poolContributeScreen.poolName.getValue();
                    format4.getClass();
                    str3.getClass();
                    mutableState2.setValue(new PoolContributeWithNoteViewModel.InputNote(amountAtmPicker2.amount, format4, str3, false, (String) null, 48));
                } else {
                    if (poolContributeWithNoteViewModel2 instanceof PoolContributeWithNoteViewModel.AmountCustomPicker) {
                        String str4 = poolContributeScreen.flowToken;
                        String str5 = poolContributeScreen.poolToken;
                        PoolContributeWithNoteViewModel.AmountCustomPicker amountCustomPicker = (PoolContributeWithNoteViewModel.AmountCustomPicker) poolContributeWithNoteViewModel2;
                        Money money3 = amountCustomPicker.amount;
                        Long l2 = money3.amount;
                        longValue = l2 != null ? l2.longValue() : 0L;
                        CurrencyCode currencyCode3 = money3.currency_code;
                        r7 = currencyCode3 != null ? currencyCode3.name() : null;
                        zzahx.trackContributionChooseAmount(analytics, str4, str5, AssetPoolPoolContributionChooseAmount.SelectionType.CUSTOM_AMOUNT, longValue, r7 != null ? r7 : "");
                        String format5 = moneyFormatter.format(money3);
                        String str6 = (String) poolContributeScreen.poolName.getValue();
                        format5.getClass();
                        str6.getClass();
                        mutableState2.setValue(new PoolContributeWithNoteViewModel.InputNote(amountCustomPicker.amount, format5, str6, true, (String) null, 48));
                    } else if (poolContributeWithNoteViewModel2 instanceof PoolContributeWithNoteViewModel.InputNote) {
                        String str7 = poolContributeScreen.flowToken;
                        String str8 = poolContributeScreen.poolToken;
                        PoolContributeWithNoteViewModel.InputNote inputNote2 = (PoolContributeWithNoteViewModel.InputNote) poolContributeWithNoteViewModel2;
                        String str9 = inputNote2.note;
                        r10 = (str9 == null || str9.length() == 0) ? 1 : 0;
                        str7.getClass();
                        str8.getClass();
                        analytics.track(new AssetPoolPoolReviewStart(str8, str7, Boolean.valueOf((boolean) (r10 ^ 1))), null);
                        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = (InstrumentSelectionRowViewModel) mutableState.getValue();
                        boolean z = poolContributeWithNotePresenter.isOwner;
                        AndroidStringManager androidStringManager = poolContributeWithNotePresenter.stringManager;
                        if (z) {
                            format2 = androidStringManager.get(R.string.pools_owner_contribute_button_disclaimer_title);
                        } else {
                            Object value = poolContributeScreen.ownerName.getValue();
                            value.getClass();
                            ArrayMap arrayMap = new ArrayMap(1);
                            arrayMap.put("name", value);
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            format2 = new MessageFormat(resources.getString(R.string.pools_send_button_disclaimer_title_note)).format(arrayMap);
                            format2.getClass();
                        }
                        String str10 = format2;
                        str10.getClass();
                        mutableState2.setValue(new PoolContributeWithNoteViewModel.Review(inputNote2.amount, inputNote2.amountFormatted, inputNote2.poolName, inputNote2.customAmount, inputNote2.note, instrumentSelectionRowViewModel, str10));
                    } else {
                        if (!(poolContributeWithNoteViewModel2 instanceof PoolContributeWithNoteViewModel.Review)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope, null, null, new PhonePlansHomePresenter$models$1$1(16, mutableState, (Object) poolContributeWithNotePresenter, poolContributeWithNoteViewModel2, r7), 3);
                    }
                }
            } else if (poolContributeWithNoteViewEvent instanceof PoolContributeWithNoteViewEvent.AmountCustomChanged) {
                long j = ((PoolContributeWithNoteViewEvent.AmountCustomChanged) poolContributeWithNoteViewEvent).amountCents;
                Money money4 = new Money(new Long(j), CurrencyCode.USD, 4);
                boolean z2 = j < 100;
                AbstractPersistentList abstractPersistentList3 = PoolContributeWithNotePresenter.quickAmounts;
                PoolContributeWithNoteViewModel poolContributeWithNoteViewModel3 = (PoolContributeWithNoteViewModel) mutableState2.getValue();
                poolContributeWithNoteViewModel3.getClass();
                String format6 = moneyFormatter2.format(money4);
                CurrencyCode currencyCode4 = ((PoolContributeWithNoteViewModel.AmountCustomPicker) poolContributeWithNoteViewModel3).currency;
                currencyCode4.getClass();
                format6.getClass();
                mutableState2.setValue(new PoolContributeWithNoteViewModel.AmountCustomPicker(money4, currencyCode4, format6, z2, !z2));
            } else if (poolContributeWithNoteViewEvent instanceof PoolContributeWithNoteViewEvent.AmountItemClicked) {
                AbstractPersistentList abstractPersistentList4 = PoolContributeWithNotePresenter.quickAmounts;
                PoolContributeWithNoteViewModel poolContributeWithNoteViewModel4 = (PoolContributeWithNoteViewModel) mutableState2.getValue();
                poolContributeWithNoteViewModel4.getClass();
                PoolContributeWithNoteViewModel.AmountAtmPicker amountAtmPicker3 = (PoolContributeWithNoteViewModel.AmountAtmPicker) poolContributeWithNoteViewModel4;
                ListBuilder buildAmountPickerOptions2 = poolContributeWithNotePresenter.buildAmountPickerOptions(amountAtmPicker3.amount);
                ListIterator listIterator = buildAmountPickerOptions2.listIterator(0);
                while (true) {
                    ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
                    if (!itr.hasNext()) {
                        r10 = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(((PoolContributeWithNoteViewModel.AmountAtmPicker.AmountPickerQuickAmount) itr.next()).label, ((PoolContributeWithNoteViewEvent.AmountItemClicked) poolContributeWithNoteViewEvent).item.label)) {
                        break;
                    }
                    r10++;
                }
                mutableState2.setValue(r10 == buildAmountPickerOptions2.getSize() - 1 ? new PoolContributeWithNoteViewModel.AmountCustomPicker(PoolContributeWithNoteViewModel.AmountAtmPicker.copy$default(amountAtmPicker3, new Money(new Long(0L), CurrencyCode.USD, 4), 6).amount, null, null, 30) : PoolContributeWithNoteViewModel.AmountAtmPicker.copy$default(amountAtmPicker3, (Money) PoolContributeWithNotePresenter.quickAmounts.get(r10), 2));
            } else if (poolContributeWithNoteViewEvent instanceof PoolContributeWithNoteViewEvent.NoteChanged) {
                AbstractPersistentList abstractPersistentList5 = PoolContributeWithNotePresenter.quickAmounts;
                PoolContributeWithNoteViewModel poolContributeWithNoteViewModel5 = (PoolContributeWithNoteViewModel) mutableState2.getValue();
                poolContributeWithNoteViewModel5.getClass();
                PoolContributeWithNoteViewModel.InputNote inputNote3 = (PoolContributeWithNoteViewModel.InputNote) poolContributeWithNoteViewModel5;
                String str11 = ((PoolContributeWithNoteViewEvent.NoteChanged) poolContributeWithNoteViewEvent).note;
                if (str11.length() <= 0) {
                    str11 = null;
                }
                mutableState2.setValue(PoolContributeWithNoteViewModel.InputNote.copy$default(inputNote3, str11, null, 47));
            } else {
                if (!Intrinsics.areEqual(poolContributeWithNoteViewEvent, PoolContributeWithNoteViewEvent.InstrumentClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str12 = poolContributeScreen.poolToken;
                analytics.track(new AssetPoolPoolContributionInstrumentSelection(str12, str12), null);
                screenNavigator.askQuestion(WhichInstrument.INSTANCE, new ViewSizeResolver$size$3$1(10, poolContributeWithNotePresenter, mutableState2, mutableState));
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$pools$presenters$PoolsListPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$confirmedPayments;
        PoolsListViewEvent poolsListViewEvent = (PoolsListViewEvent) obj;
        if (poolsListViewEvent instanceof PoolsListViewEvent.GoBack) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (poolsListViewEvent instanceof PoolsListViewEvent.TapOnPool) {
            screenNavigator.goTo(new PoolDetailsScreen(((PoolsListViewEvent.TapOnPool) poolsListViewEvent).token, null, null, (String) poolsListPresenter.flowToken, AssetPoolPoolHomeView.ViewHomeSource.MONEY_TAB, null, 38));
        } else {
            Continuation continuation2 = null;
            if (poolsListViewEvent instanceof PoolsListViewEvent.TapNewPool) {
                screenNavigator.goTo(new StartPoolScreen(null, RealUuidGenerator.generate(), StartPoolScreen.EntryPoint.POOLS_APPLET));
            } else {
                boolean z = poolsListViewEvent instanceof PoolsListViewEvent.Refresh;
                Object obj2 = this.$lastVibrationTime$delegate;
                Object obj3 = this.$vibrate$delegate;
                if (z) {
                    JobKt.launch$default(coroutineScope, null, null, new PoolsListPresenter$models$2$1(poolsListPresenter, (MutableState) obj3, (MutableState) obj2, continuation2, 0), 3);
                } else {
                    if (!(poolsListViewEvent instanceof PoolsListViewEvent.SelectCategory)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope, null, null, new PoolsListPresenter$models$2$2(poolsListViewEvent, poolsListPresenter, (MutableState) obj2, (MutableState) obj3, (Continuation) null), 3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object emit$com$squareup$cash$pools$presenters$StartPoolPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Long l;
        Money money;
        Long l2;
        StartPoolPresenter startPoolPresenter = (StartPoolPresenter) this.this$0;
        MoneyFormatter moneyFormatter = startPoolPresenter.moneyFormatter;
        AndroidStringManager androidStringManager = startPoolPresenter.stringManager;
        StartPoolScreen startPoolScreen = startPoolPresenter.args;
        BetterNavigator.ScreenNavigator screenNavigator = startPoolPresenter.navigator;
        MutableState mutableState = (MutableState) this.$vibrate$delegate;
        CoroutineScope coroutineScope = (CoroutineScope) this.$confirmedPayments;
        StartPoolViewEvent startPoolViewEvent = (StartPoolViewEvent) obj;
        boolean areEqual = Intrinsics.areEqual(startPoolViewEvent, StartPoolViewEvent.DismissSheet.INSTANCE);
        Back back = Back.INSTANCE;
        if (areEqual) {
            screenNavigator.goTo(back);
        } else {
            Object[] objArr = 0;
            if (Intrinsics.areEqual(startPoolViewEvent, StartPoolViewEvent.Back.INSTANCE)) {
                StartPoolViewModel startPoolViewModel = (StartPoolViewModel) mutableState.getValue();
                if (startPoolViewModel instanceof StartPoolViewModel.Amount) {
                    screenNavigator.goTo(back);
                } else if (startPoolViewModel instanceof StartPoolViewModel.Name) {
                    if (startPoolScreen.amount != null) {
                        screenNavigator.goTo(back);
                    } else {
                        mutableState.setValue(new StartPoolViewModel.Amount(null, null));
                    }
                } else if (!(startPoolViewModel instanceof StartPoolViewModel.Success)) {
                    screenNavigator.goTo(back);
                }
            } else {
                boolean z = false;
                if (Intrinsics.areEqual(startPoolViewEvent, StartPoolViewEvent.Continue.INSTANCE)) {
                    StartPoolViewModel startPoolViewModel2 = (StartPoolViewModel) mutableState.getValue();
                    if (startPoolViewModel2 instanceof StartPoolViewModel.Amount) {
                        if (((Boolean) ((State) this.$lastVibrationTime$delegate).getValue()).booleanValue() && (money = ((StartPoolViewModel.Amount) startPoolViewModel2).amount) != null && (l2 = money.amount) != null && l2.longValue() > 1000000) {
                            z = true;
                        }
                        StartPoolViewModel.Amount amount = (StartPoolViewModel.Amount) startPoolViewModel2;
                        Money money2 = amount.amount;
                        if (money2 == null || (l = money2.amount) == null || l.longValue() < 100) {
                            mutableState.setValue(StartPoolViewModel.Amount.copy$default(amount, null, androidStringManager.get(R.string.pools_create_error_minimum_goal), 1));
                        } else if (z) {
                            String format2 = moneyFormatter.format(new Money(new Long(1000000L), (CurrencyCode) null, 6));
                            format2.getClass();
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            String format3 = new MessageFormat(resources.getString(R.string.pools_create_error_maximum_goal)).format(new Object[]{format2});
                            format3.getClass();
                            mutableState.setValue(StartPoolViewModel.Amount.copy$default(amount, null, format3, 1));
                        } else {
                            Analytics analytics = startPoolPresenter.analytics;
                            Double d = money2.amount != null ? new Double(r4.longValue()) : null;
                            String str = startPoolPresenter.flowToken;
                            String name = startPoolScreen.entryPoint.name();
                            str.getClass();
                            name.getClass();
                            analytics.track(new AssetPoolCreatePoolStart(d, str, name), null);
                            String format4 = moneyFormatter.format(money2);
                            format4.getClass();
                            mutableState.setValue(new StartPoolViewModel.Name(money2, format4, ""));
                        }
                    } else if (startPoolViewModel2 instanceof StartPoolViewModel.Name) {
                        StartPoolViewModel.Name name2 = (StartPoolViewModel.Name) startPoolViewModel2;
                        String str2 = name2.name;
                        if (str2.length() > 0) {
                            mutableState.setValue(new StartPoolViewModel.Submit(name2.amount, str2));
                            JobKt.launch$default(coroutineScope, null, null, new PdfPreviewPresenter$models$1$1(8, mutableState, name2, startPoolPresenter, objArr == true ? 1 : 0), 3);
                        }
                    }
                } else if (startPoolViewEvent instanceof StartPoolViewEvent.AmountChanged) {
                    StartPoolViewModel startPoolViewModel3 = (StartPoolViewModel) mutableState.getValue();
                    StartPoolViewModel.Amount amount2 = startPoolViewModel3 instanceof StartPoolViewModel.Amount ? (StartPoolViewModel.Amount) startPoolViewModel3 : null;
                    if (amount2 != null) {
                        mutableState.setValue(StartPoolViewModel.Amount.copy$default(amount2, ((StartPoolViewEvent.AmountChanged) startPoolViewEvent).amount, null, 2));
                    }
                } else if (startPoolViewEvent instanceof StartPoolViewEvent.NameChanged) {
                    StartPoolViewModel startPoolViewModel4 = (StartPoolViewModel) mutableState.getValue();
                    StartPoolViewModel.Name name3 = startPoolViewModel4 instanceof StartPoolViewModel.Name ? (StartPoolViewModel.Name) startPoolViewModel4 : null;
                    if (name3 != null) {
                        String str3 = ((StartPoolViewEvent.NameChanged) startPoolViewEvent).name;
                        Money money3 = name3.amount;
                        String str4 = name3.formattedAmount;
                        money3.getClass();
                        str4.getClass();
                        str3.getClass();
                        mutableState.setValue(new StartPoolViewModel.Name(money3, str4, str3));
                    }
                } else {
                    if (!(startPoolViewEvent instanceof StartPoolViewEvent.TermsOfService)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope, null, null, new StartPoolPresenter$models$2$4(startPoolPresenter, null, 0), 3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:319:0x069c, code lost:
    
        if (r9 == false) goto L274;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019c  */
    /* JADX WARN: Type inference failed for: r3v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v68, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StateListIterator stateListIterator;
        Long l;
        Uri uri;
        Pair pair;
        Long l2;
        BlockerAction.InternalNavigationAction.Destination destination;
        String str;
        FormBlocker.Element element;
        FormBlocker.Element.AbstractC0072Element abstractC0072Element;
        FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData;
        String str2;
        ManagedAccountAnimationInfo managedAccountAnimationInfo;
        Iterator it;
        PaymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1 paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1;
        int i;
        CardBlocker cardBlocker;
        Object obj2;
        BlockersScreens blockersScreens;
        ResolvedTransferOption resolvedTransferOption;
        ResolvedTransferOption resolvedTransferOption2;
        BlockersScreens.StartFlowEntryPoint startProfileLinkingFlow;
        PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1 persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1;
        int i2;
        int i3 = this.$r8$classId;
        String str3 = "";
        int i4 = 2;
        Back back = Back.INSTANCE;
        Object obj3 = this.$vibrate$delegate;
        Object obj4 = this.this$0;
        Object obj5 = this.$confirmedPayments;
        Object obj6 = this.$lastVibrationTime$delegate;
        Continuation continuation2 = null;
        switch (i3) {
            case 0:
                PaymentUpdate paymentUpdate = (PaymentUpdate) obj;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj5;
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj4;
                if (paymentUpdate.payment_state_category == PaymentStateCategory.PAYMENT_STATE_CATEGORY_PAID_OUT) {
                    if (snapshotStateList == null || !snapshotStateList.isEmpty()) {
                        ListIterator listIterator = snapshotStateList.listIterator();
                        do {
                            stateListIterator = (StateListIterator) listIterator;
                            if (stateListIterator.hasNext()) {
                            }
                        } while (!Intrinsics.areEqual(((PaymentUpdate) stateListIterator.next()).payment_token, paymentUpdate.payment_token));
                    }
                    snapshotStateList.add(paymentUpdate);
                    CardLockPresenter.access$models$throttledVibrate(cardLockPresenter, (ParcelableSnapshotMutableLongState) obj6, (MutableState) obj3);
                    String str4 = paymentUpdate.sender_customer_token;
                    if (str4 != null && str4.length() != 0) {
                        Analytics analytics = (Analytics) cardLockPresenter.analytics;
                        Money money = paymentUpdate.amount;
                        long longValue = (money == null || (l = money.amount) == null) ? 0L : l.longValue();
                        String str5 = (String) cardLockPresenter.ioDispatcher;
                        str5.getClass();
                        analytics.track(new NearbyPaymentGetPaidPaymentReceivedPageLand(Long.valueOf(longValue), str4, str5), null);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                MutableState mutableState = (MutableState) obj3;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj4;
                Analytics analytics2 = (Analytics) localHomePresenter.tabContentPresenterFactory;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                DirectDepositManualFormCompletionViewEvent directDepositManualFormCompletionViewEvent = (DirectDepositManualFormCompletionViewEvent) obj;
                if (Intrinsics.areEqual(directDepositManualFormCompletionViewEvent, DirectDepositManualFormCompletionViewEvent.Exit.INSTANCE)) {
                    screenNavigator.goTo(back);
                } else if (Intrinsics.areEqual(directDepositManualFormCompletionViewEvent, DirectDepositManualFormCompletionViewEvent.SendEmail.INSTANCE)) {
                    analytics2.track(new DirectDepositAccountTapEmailForm(), null);
                    JobKt.launch$default(coroutineScope, null, null, new EntitySyncerKt$hasSyncedFlow$1(localHomePresenter, mutableState, continuation2, 25), 3);
                } else if (Intrinsics.areEqual(directDepositManualFormCompletionViewEvent, DirectDepositManualFormCompletionViewEvent.ViewForm.INSTANCE)) {
                    analytics2.track(new DirectDepositAccountTapViewForm(), null);
                    DirectDepositForm directDepositForm = (DirectDepositForm) mutableState.getValue();
                    if (directDepositForm != null && (uri = directDepositForm.pdfLocalUri) != null) {
                        screenNavigator.goTo(new PdfScreen(uri, ((AndroidStringManager) localHomePresenter.syncer).get(R.string.direct_deposit_view_pdf_title)));
                    }
                } else {
                    if (!Intrinsics.areEqual(directDepositManualFormCompletionViewEvent, DirectDepositManualFormCompletionViewEvent.RetryFormSubmission.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    MutableState mutableState2 = (MutableState) obj6;
                    mutableState2.setValue(VersionedKt.update((Versioned) mutableState2.getValue(), Unit.INSTANCE));
                }
                return Unit.INSTANCE;
            case 2:
                List list = ((RecipientRepository$Result) obj).sections;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((Section) it2.next()).recipients, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    com.squareup.cash.recipients.data.Recipient recipient = (com.squareup.cash.recipients.data.Recipient) next;
                    if (recipient.customerId != null && !recipient.isBusiness && recipient.isCashCustomer) {
                        arrayList2.add(next);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (hashSet.add(((com.squareup.cash.recipients.data.Recipient) next2).customerId)) {
                        arrayList3.add(next2);
                    }
                }
                SnapshotStateSet snapshotStateSet = (SnapshotStateSet) obj5;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    com.squareup.cash.recipients.data.Recipient recipient2 = (com.squareup.cash.recipients.data.Recipient) it5.next();
                    boolean contains = CollectionsKt.contains(snapshotStateSet, recipient2.customerId);
                    String str6 = recipient2.customerId;
                    String str7 = recipient2.displayName;
                    String str8 = str6 == null ? "" : str6;
                    String str9 = str7 == null ? "" : str7;
                    String fromString = Cashtags.fromString(recipient2.cashtag, recipient2.region);
                    String str10 = fromString == null ? "" : fromString;
                    Character firstOrNull = str7 != null ? StringsKt___StringsKt.firstOrNull(str7) : null;
                    Color accentColor = recipient2.getAccentColor();
                    Image image = recipient2.photo;
                    arrayList4.add(new PayerCustomerRowModel(str8, str9, str10, firstOrNull, accentColor, image != null ? image.light_url : null, contains));
                }
                Map map = (Map) obj4;
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    PayerCustomerRowModel payerCustomerRowModel = (PayerCustomerRowModel) it6.next();
                    map.put(payerCustomerRowModel.customerToken, payerCustomerRowModel);
                }
                ((MutableState) obj3).setValue(arrayList4);
                ((MutableState) obj6).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                BaseDependentControlPresenter baseDependentControlPresenter = (BaseDependentControlPresenter) obj4;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                DependentControlViewEvent dependentControlViewEvent = (DependentControlViewEvent) obj;
                if (dependentControlViewEvent instanceof DependentControlViewEvent.TapBack) {
                    baseDependentControlPresenter.navigator.goTo(back);
                } else if (dependentControlViewEvent instanceof DependentControlViewEvent.FooterLinkClicked) {
                    baseDependentControlPresenter.handleFooterLinkClicked(((DependentControlViewEvent.FooterLinkClicked) dependentControlViewEvent).url);
                } else if (dependentControlViewEvent instanceof DependentControlViewEvent.CustomLimitSetupEnded) {
                    JobKt.launch$default(coroutineScope2, null, null, new BaseDependentControlPresenter$models$3$1(baseDependentControlPresenter, null, 0), 3);
                } else {
                    JobKt.launch$default(coroutineScope2, null, null, new RealFidesmoClient$observeDeviceState$1(baseDependentControlPresenter, dependentControlViewEvent, (State) obj6, (State) obj3, null, 11), 3);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope3 = (CoroutineScope) obj5;
                SavingsScreenViewEvent savingsScreenViewEvent = (SavingsScreenViewEvent) obj;
                DependentSavingsScreenPresenter dependentSavingsScreenPresenter = (DependentSavingsScreenPresenter) obj4;
                CoroutineContext coroutineContext = dependentSavingsScreenPresenter.ioDispatcher;
                SavingsBalance savingsBalance = (SavingsBalance) ((MutableState) obj3).getValue();
                MutableState mutableState3 = (MutableState) obj6;
                RealRouter realRouter = dependentSavingsScreenPresenter.router;
                DependentGeneralSavingsScreen dependentGeneralSavingsScreen = dependentSavingsScreenPresenter.screen;
                BetterNavigator.ScreenNavigator screenNavigator2 = dependentSavingsScreenPresenter.navigator;
                Analytics analytics3 = dependentSavingsScreenPresenter.analytics;
                if (Intrinsics.areEqual(savingsScreenViewEvent, SavingsScreenViewEvent.Exit.INSTANCE)) {
                    screenNavigator2.goTo(back);
                } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.Clicked) {
                    SavingsScreenViewEvent.Clicked clicked = (SavingsScreenViewEvent.Clicked) savingsScreenViewEvent;
                    Event event = clicked.analyticsEvent;
                    if (event != null) {
                        analytics3.track(event, null);
                    }
                    CdfEvent cdfEvent = clicked.cdfEvent;
                    if (cdfEvent != null) {
                        analytics3.track(new UtilsKt$toCdfEvent$2(cdfEvent, new Pair[0]), null);
                    }
                    realRouter.route(new RoutingParams(null, null, new DependentGeneralSavingsScreen(dependentGeneralSavingsScreen.dependentCustomerToken, dependentGeneralSavingsScreen.screenType), null, null, null, 503), clicked.clientRoute);
                } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.SavingsHeaderClicked) {
                    ViewGroupKt viewGroupKt = ((SavingsScreenViewEvent.SavingsHeaderClicked) savingsScreenViewEvent).event;
                    if (viewGroupKt instanceof SavingsHeaderEvent$InformationClicked) {
                        SavingsHeaderEvent$InformationClicked savingsHeaderEvent$InformationClicked = (SavingsHeaderEvent$InformationClicked) viewGroupKt;
                        CdfEvent cdfEvent2 = savingsHeaderEvent$InformationClicked.cdfEvent;
                        if (cdfEvent2 != null) {
                            analytics3.track(new UtilsKt$toCdfEvent$2(cdfEvent2, new Pair[0]), null);
                        }
                        screenNavigator2.goTo(new SavingsCardSheet(savingsHeaderEvent$InformationClicked.card, new GeneralSavingsScreen(dependentGeneralSavingsScreen.screenType)));
                    } else if (viewGroupKt instanceof SavingsHeaderEvent$RouteClicked) {
                        SavingsHeaderEvent$RouteClicked savingsHeaderEvent$RouteClicked = (SavingsHeaderEvent$RouteClicked) viewGroupKt;
                        CdfEvent cdfEvent3 = savingsHeaderEvent$RouteClicked.cdfEvent;
                        if (cdfEvent3 != null) {
                            analytics3.track(new UtilsKt$toCdfEvent$2(cdfEvent3, new Pair[0]), null);
                        }
                        realRouter.route(new RoutingParams(null, null, dependentSavingsScreenPresenter.screen, null, null, null, 503), savingsHeaderEvent$RouteClicked.clientRoute);
                    }
                } else if (Intrinsics.areEqual(savingsScreenViewEvent, SavingsScreenViewEvent.SeeAllActivitiesEvent.INSTANCE)) {
                    SavingsScreen.ScreenType screenType = dependentGeneralSavingsScreen.screenType;
                    String str11 = dependentGeneralSavingsScreen.dependentCustomerToken;
                    if (screenType instanceof SavingsScreen.ScreenType.GoalDetail) {
                        pair = new Pair(ActivityTokenType.SAVINGS_FOLDER_TOKEN, ((SavingsScreen.ScreenType.GoalDetail) screenType).token);
                    } else if (screenType instanceof SavingsScreen.ScreenType.GeneralSavings) {
                        pair = new Pair(ActivityTokenType.SAVINGS_FOLDER_TOKEN, savingsBalance != null ? savingsBalance.token : null);
                    } else {
                        l2 = null;
                        pair = new Pair(ActivityTokenType.CUSTOMER_TOKEN_SAVINGS_ACCOUNT, null);
                        ActivityTokenType activityTokenType = (ActivityTokenType) pair.first;
                        String str12 = (String) pair.second;
                        analytics3.track(new SavingsFolderManageViewAllActivity(str11), l2);
                        screenNavigator2.goTo(new SavingsFullActivityScreen(ActivityScope.SPONSORED_ACCOUNT, activityTokenType, str12, str11));
                    }
                    l2 = null;
                    ActivityTokenType activityTokenType2 = (ActivityTokenType) pair.first;
                    String str122 = (String) pair.second;
                    analytics3.track(new SavingsFolderManageViewAllActivity(str11), l2);
                    screenNavigator2.goTo(new SavingsFullActivityScreen(ActivityScope.SPONSORED_ACCOUNT, activityTokenType2, str122, str11));
                } else {
                    Continuation continuation3 = null;
                    if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.GoalCelebrationSeen) {
                        JobKt.launch$default(coroutineScope3, coroutineContext, null, new RealAppConfigManager$update$2$2(dependentSavingsScreenPresenter, savingsScreenViewEvent, continuation3, 29), 2);
                    } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent) {
                        mutableState3.setValue(Boolean.TRUE);
                        JobKt.launch$default(coroutineScope3, coroutineContext, null, new FormCashtag.AnonymousClass8.AnonymousClass2((SavingsScreenViewEvent.BalanceSeenEvent) savingsScreenViewEvent, dependentSavingsScreenPresenter, continuation3, 7), 2);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                MutableState mutableState4 = (MutableState) obj3;
                FamilyHomePresenter familyHomePresenter = (FamilyHomePresenter) obj5;
                Analytics analytics4 = familyHomePresenter.analytics;
                RealRouter realRouter2 = familyHomePresenter.router;
                BetterNavigator.ScreenNavigator screenNavigator3 = familyHomePresenter.navigator;
                FamilyHomeViewEvent familyHomeViewEvent = (FamilyHomeViewEvent) obj;
                if (Intrinsics.areEqual(familyHomeViewEvent, FamilyHomeViewEvent.TapBack.INSTANCE)) {
                    screenNavigator3.goTo(back);
                } else if (familyHomeViewEvent instanceof FamilyHomeViewEvent.TapDependent) {
                    FamilyHomeViewEvent.TapDependent tapDependent = (FamilyHomeViewEvent.TapDependent) familyHomeViewEvent;
                    String str13 = tapDependent.dependentCustomerToken;
                    SponsorshipTier sponsorshipTier = tapDependent.sponsorshipTier;
                    int i5 = sponsorshipTier == null ? -1 : FamilyHomePresenter.WhenMappings.$EnumSwitchMapping$0[sponsorshipTier.ordinal()];
                    if (i5 == -1 || i5 == 1 || i5 == 2) {
                        screenNavigator3.goTo(new DependentDetailScreen(str13));
                    } else {
                        if (i5 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        StackedAvatarViewModel.Avatar avatar = FamilyHomePresenter.LOADING_AVATAR;
                        Iterator it7 = ((List) ((State) obj6).getValue()).iterator();
                        FullAccount fullAccount = null;
                        boolean z = false;
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            } else {
                                ?? next3 = it7.next();
                                if (Intrinsics.areEqual(((FullAccount) next3).account_id, str13)) {
                                    if (!z) {
                                        fullAccount = next3;
                                        z = true;
                                    }
                                }
                            }
                        }
                        fullAccount = null;
                        FullAccount fullAccount2 = fullAccount;
                        String str14 = tapDependent.dependentDisplayName;
                        if (str14 != null) {
                            AndroidStringManager androidStringManager = familyHomePresenter.stringManager;
                            ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "name", str14);
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            String format2 = new MessageFormat(resources.getString(R.string.family_home_switch_to_managed_account_title)).format(m);
                            format2.getClass();
                            managedAccountAnimationInfo = new ManagedAccountAnimationInfo(format2, ManagedAccountFlipDirection.TO_KID);
                        } else {
                            managedAccountAnimationInfo = null;
                        }
                        screenNavigator3.goTo(new SwitchFullAccountLoadingScreen(fullAccount2, tapDependent.dependentCustomerToken, (String) obj4, new TargetDestination.ScreenDestination(new MoneyTabScreen(null)), AccountSwitcher$AccountSwitchInitiationSource.FAMILIES, managedAccountAnimationInfo));
                    }
                } else {
                    if (Intrinsics.areEqual(familyHomeViewEvent, FamilyHomeViewEvent.TapMembersSectionHeaderButton.INSTANCE)) {
                        StackedAvatarViewModel.Avatar avatar2 = FamilyHomePresenter.LOADING_AVATAR;
                        FamilyAccountsParameters familyAccountsParameters = (FamilyAccountsParameters) mutableState4.getValue();
                        InviteLink inviteLink = familyAccountsParameters != null ? familyAccountsParameters.invite_teen_action : null;
                        if (inviteLink != null) {
                            BlockerAction.ShareTextAction shareTextAction = inviteLink.share_action;
                            String str15 = inviteLink.url;
                            if (str15 != null && !StringsKt.isBlank(str15)) {
                                FamilyHome familyHome = familyHomePresenter.args;
                                realRouter2.route(new RoutingParams(familyHome, null, familyHome, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str15);
                            } else if (shareTextAction != null) {
                                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(familyHomePresenter.sessionManager);
                                if (activeAccountTokenOrNull != null) {
                                    analytics4.track(new SponsoredAccountInviteFromSponsoredAccountsViewStart(activeAccountTokenOrNull), null);
                                }
                                FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                                try {
                                    String str16 = shareTextAction.text_data;
                                    if (str16 != null) {
                                        str2 = str16;
                                    } else {
                                        try {
                                            throw new IllegalArgumentException("share_action.text_data");
                                        } catch (Exception e) {
                                            familyHomePresenter.errorReporter.report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(BlockerAction.ShareTextAction.class), familyParsingErrorFactory, null), familyHomePresenter.oneErrorPerAppSessionStrategy);
                                            str2 = null;
                                        }
                                    }
                                    if (str2 != null) {
                                        familyHomePresenter.launcher.shareText(str2, shareTextAction.title, shareTextAction.email_subject);
                                    }
                                } catch (Exception e2) {
                                    throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(BlockerAction.ShareTextAction.class), familyParsingErrorFactory, null);
                                }
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FamilyHome.familyAccountsParameters.invite_teen_action has neither url(", str15, ") nor shareAction(null)"));
                            }
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("TapMembersSectionHeaderButton cannot be triggered when familyAccountsParameters.invite_teen_action is null");
                        }
                        return null;
                    }
                    if (familyHomeViewEvent instanceof FamilyHomeViewEvent.TapPendingRequest) {
                        FamilyHomeViewEvent.TapPendingRequest tapPendingRequest = (FamilyHomeViewEvent.TapPendingRequest) familyHomeViewEvent;
                        analytics4.track(new SponsoredAccountManagePendingRequestTapOne(tapPendingRequest.requesterCustomerToken, SponsoredAccountManagePendingRequestTapOne.PendingRequestLocation.FamilyHome), null);
                        String str17 = tapPendingRequest.url;
                        FamilyHome familyHome2 = familyHomePresenter.args;
                        realRouter2.route(new RoutingParams(familyHome2, null, familyHome2, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str17);
                    } else if (familyHomeViewEvent instanceof FamilyHomeViewEvent.TapMultiplePendingRequests) {
                        analytics4.track(new SponsoredAccountManagePendingRequestTapEntryPointToViewAll(), null);
                        screenNavigator3.goTo(new FamilyPendingRequestsScreen(null));
                    } else if (familyHomeViewEvent instanceof FamilyHomeViewEvent.TapListItem) {
                        FamilyHomeViewEvent.TapListItem tapListItem = (FamilyHomeViewEvent.TapListItem) familyHomeViewEvent;
                        analytics4.track(new SponsoredAccountTapSectionItemStart(tapListItem.analyticalIdentifier), null);
                        String str18 = tapListItem.url;
                        FamilyHome familyHome3 = familyHomePresenter.args;
                        realRouter2.route(new RoutingParams(familyHome3, null, familyHome3, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str18);
                    } else {
                        if (!(familyHomeViewEvent instanceof FamilyHomeViewEvent.TapUpsellCard)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        BlockerAction.Action action = ((FamilyHomeViewEvent.TapUpsellCard) familyHomeViewEvent).action.action;
                        if (action != null) {
                            BlockerAction.Action.InternalNavigationAction internalNavigationAction = action instanceof BlockerAction.Action.InternalNavigationAction ? (BlockerAction.Action.InternalNavigationAction) action : null;
                            BlockerAction.InternalNavigationAction value = internalNavigationAction != null ? internalNavigationAction.getValue() : null;
                            if (value != null && (destination = value.destination) != null) {
                                BlockerAction.InternalNavigationAction.Destination.ClientRoute clientRoute = destination instanceof BlockerAction.InternalNavigationAction.Destination.ClientRoute ? (BlockerAction.InternalNavigationAction.Destination.ClientRoute) destination : null;
                                BlockerAction.InternalNavigationAction.ClientRoute value2 = clientRoute != null ? clientRoute.getValue() : null;
                                if (value2 != null && (str = value2.url) != null) {
                                    StackedAvatarViewModel.Avatar avatar3 = FamilyHomePresenter.LOADING_AVATAR;
                                    FamilyAccountsParameters familyAccountsParameters2 = (FamilyAccountsParameters) mutableState4.getValue();
                                    if (familyAccountsParameters2 != null && (element = familyAccountsParameters2.upsell_element) != null && (abstractC0072Element = element.element) != null) {
                                        FormBlocker.Element.AbstractC0072Element.UpsellElement upsellElement = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.UpsellElement ? (FormBlocker.Element.AbstractC0072Element.UpsellElement) abstractC0072Element : null;
                                        FormBlocker.Element.UpsellElement value3 = upsellElement != null ? upsellElement.getValue() : null;
                                        if (value3 != null && (onDemandMessageData = value3.on_demand_message_data) != null) {
                                            FamilyUpsellAnalytics familyUpsellAnalytics = familyHomePresenter.familyUpsellAnalytics;
                                            familyUpsellAnalytics.analytics.track(new OnDemandMessageInteractClick(onDemandMessageData.campaign_token, Long.valueOf(familyUpsellAnalytics.clock.millis()), null, Placement.FAMILY_APPLET, onDemandMessageData.template_token, onDemandMessageData.template_version, AppMessageFormat.CARD, onDemandMessageData.product_type, 20), null);
                                        }
                                    }
                                    FamilyHome familyHome4 = familyHomePresenter.args;
                                    realRouter2.route(new RoutingParams(familyHome4, null, familyHome4, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj4;
                EglCore eglCore = (EglCore) localEditorialPresenter.responseContextHandler;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj5;
                ListFavoritesViewEvent listFavoritesViewEvent = (ListFavoritesViewEvent) obj;
                if (listFavoritesViewEvent instanceof ListFavoritesViewEvent.ListRowClicked) {
                    com.squareup.cash.recipients.data.Recipient recipient3 = ((ListFavoritesViewEvent.ListRowClicked) listFavoritesViewEvent).favorite.recipient;
                    ListFavorites listFavorites = (ListFavorites) localEditorialPresenter.screen;
                    UUID uuid = listFavorites.externalId;
                    EntryPoint[] entryPointArr = EntryPoint.$VALUES;
                    eglCore.showFavorite(uuid, recipient3, listFavorites);
                } else if (listFavoritesViewEvent instanceof ListFavoritesViewEvent.FavoriteClicked) {
                    MutableState mutableState5 = (MutableState) obj3;
                    List list2 = (List) mutableState5.getValue();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        FavoritePersonViewModel favoritePersonViewModel = (FavoritePersonViewModel) it8.next();
                        if (favoritePersonViewModel.customerId.equals(((ListFavoritesViewEvent.FavoriteClicked) listFavoritesViewEvent).customerId)) {
                            it = it8;
                            favoritePersonViewModel = new FavoritePersonViewModel(favoritePersonViewModel.recipient, favoritePersonViewModel.customerId, favoritePersonViewModel.title, favoritePersonViewModel.subtitle, favoritePersonViewModel.monogram, true, favoritePersonViewModel.isFavorite, favoritePersonViewModel.isVerified, favoritePersonViewModel.isBusiness, favoritePersonViewModel.photoImage, favoritePersonViewModel.accentColor, favoritePersonViewModel.badgeIcon);
                        } else {
                            it = it8;
                        }
                        arrayList5.add(favoritePersonViewModel);
                        it8 = it;
                    }
                    mutableState5.setValue(arrayList5);
                    JobKt.launch$default(coroutineScope4, null, null, new FormCashtag.AnonymousClass8.AnonymousClass2(localEditorialPresenter, listFavoritesViewEvent, null, 14), 3);
                } else if (listFavoritesViewEvent instanceof ListFavoritesViewEvent.BackClicked) {
                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(back);
                } else {
                    if (!(listFavoritesViewEvent instanceof ListFavoritesViewEvent.AddMoreFavorites)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((Analytics) localEditorialPresenter.launcher).track(new PersonalProfileViewOpenAddFavorites(new Integer(((List) ((MutableState) obj6).getValue()).size())), null);
                    ((BetterNavigator.ScreenNavigator) eglCore.eglDisplay).goTo(new AddFavorites(RealUuidGenerator.generate()));
                }
                return Unit.INSTANCE;
            case 7:
                JobKt.launch$default((CoroutineScope) obj5, null, null, new AnimationsKt$takeUntil$1$1.AnonymousClass1((MutableState) obj3, (ArcadeFormDateInputView) obj4, (DelegatingSoftwareKeyboardController) obj6, null, 13), 3);
                return Unit.INSTANCE;
            case 8:
                GrowToolsManagerState growToolsManagerState = (GrowToolsManagerState) obj4;
                e0 e0Var = (e0) obj5;
                CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) e0Var.b;
                GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen manageReceiveP2PAsBitcoinScreen = (GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen) e0Var.i;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) e0Var.f;
                GrowToolsManagerViewEvent growToolsManagerViewEvent = (GrowToolsManagerViewEvent) obj;
                if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ActivityShowMoreTapped.INSTANCE)) {
                    screenNavigator4.goTo(new GrowToolsCompleteActivityScreen(manageReceiveP2PAsBitcoinScreen));
                } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.Back.INSTANCE)) {
                    screenNavigator4.goTo(back);
                } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ChangeButtonTapped.INSTANCE)) {
                    manageReceiveP2PAsBitcoinScreen.getClass();
                    screenNavigator4.goTo(FlowStarter.startPlasmaFlow$default(((RealCryptoFlowStarter) cryptoFlowStarter).flowStarter, Flow$Type.CRYPTO_INVEST_CONVERSION_P2P_INFLOWS, manageReceiveP2PAsBitcoinScreen, null, null, 12));
                } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.DialogConfirmTapped.INSTANCE)) {
                    growToolsManagerState.setShowDialog(null);
                    growToolsManagerState.setInteractive(false);
                    JobKt.launch$default((CoroutineScope) obj6, null, null, new CheckStatusPresenter.AnonymousClass1(e0Var, growToolsManagerState, continuation2, i4), 3);
                } else if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DialogDismissTapped) {
                    growToolsManagerState.setShowDialog(null);
                    growToolsManagerState.setInteractive(true);
                } else if (!Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.TargetAvatarTapped.INSTANCE)) {
                    if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.ToggleTapped) {
                        if (((ReceiveP2PAsBitcoinState) ((MutableState) obj3).getValue()) instanceof ReceiveP2PAsBitcoinState.Active) {
                            growToolsManagerState.setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.TOGGLE_OFF_CONFIRMATION));
                        } else {
                            manageReceiveP2PAsBitcoinScreen.getClass();
                            screenNavigator4.goTo(FlowStarter.startPlasmaFlow$default(((RealCryptoFlowStarter) cryptoFlowStarter).flowStarter, Flow$Type.CRYPTO_INVEST_CONVERSION_P2P_INFLOWS, manageReceiveP2PAsBitcoinScreen, null, null, 12));
                        }
                    } else if (!(growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DetailRowTapped)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Unit.INSTANCE;
            case 9:
                PaymentAction.LinkCardAction linkCardAction = (PaymentAction.LinkCardAction) obj3;
                PaymentActionHandler paymentActionHandler = (PaymentActionHandler) obj6;
                RenderedPayment renderedPayment = (RenderedPayment) obj4;
                if (continuation instanceof PaymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1) {
                    paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1 = (PaymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1) continuation;
                    int i6 = paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj7 = paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1.label;
                        if (i == 0) {
                            if (i == 1) {
                                SafeTrace.throwOnFailure(obj7);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj7);
                        FlowCollector flowCollector = (FlowCollector) obj5;
                        Recipient recipient4 = (Recipient) obj;
                        ScenarioPlan scenarioPlan = renderedPayment.historyData.scenario_plan;
                        scenarioPlan.getClass();
                        Iterator it9 = scenarioPlan.blocker_descriptors.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                Blockers blockers = ((BlockerDescriptor) it9.next()).blocker;
                                blockers.getClass();
                                cardBlocker = blockers.card;
                                if (cardBlocker == null) {
                                }
                            } else {
                                cardBlocker = null;
                            }
                        }
                        if (cardBlocker == null) {
                            OptionalProvider$$ExternalSyntheticLambda0.m("No element of the collection was transformed to a non-null value.");
                            return null;
                        }
                        Iterator it10 = cardBlocker.supported_instrument_types.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                obj2 = it10.next();
                                if (ArraysKt___ArraysKt.toSet(new CashInstrumentType[]{CashInstrumentType.BANK_ACCOUNT, CashInstrumentType.DEBIT_CARD, CashInstrumentType.CREDIT_CARD}).contains((CashInstrumentType) obj2)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        CashInstrumentType cashInstrumentType = (CashInstrumentType) obj2;
                        if (cashInstrumentType != null) {
                            blockersScreens = ((RealFlowStarter) paymentActionHandler.flowStarter).startActivityLinkingFlow(linkCardAction.flowToken, cashInstrumentType, cashInstrumentType != CashInstrumentType.DEBIT_CARD, recipient4.isBusiness, renderedPayment.role, renderedPayment.token, (Screen) paymentActionHandler.activeArgs.invoke());
                        } else {
                            Timber.Forest.e(new IllegalStateException("No appropriate instrument types on CardBlocker " + cardBlocker));
                            ((RealPaymentManager) paymentActionHandler.paymentManager).error(linkCardAction.flowToken, paymentActionHandler.stringManager.get(R.string.history_confirm_error_message));
                            blockersScreens = null;
                        }
                        paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(blockersScreens, paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return Unit.INSTANCE;
                    }
                }
                paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1 = new PaymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj72 = paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentActionHandler$linkCard$lambda$0$$inlined$map$1$2$1.label;
                if (i == 0) {
                }
            case 10:
                MutableState mutableState6 = (MutableState) obj3;
                TransfersPresenter transfersPresenter = (TransfersPresenter) obj4;
                Navigator navigator = (Navigator) transfersPresenter.blockersHelper;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj5;
                PasscodeDialogViewEvent passcodeDialogViewEvent = (PasscodeDialogViewEvent) obj;
                Continuation continuation4 = null;
                if (passcodeDialogViewEvent instanceof PasscodeDialogViewEvent.Submit) {
                    if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) transfersPresenter.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$ActivityPasscodeModalPinFix.INSTANCE)).enabled()) {
                        JobKt.launch$default(coroutineScope5, (CoroutineContext) transfersPresenter.syncValueReader, null, new PasscodeDialogPresenter$models$1$1(transfersPresenter, passcodeDialogViewEvent, mutableState6, continuation4, 0), 2);
                    } else {
                        ((MutableState) obj6).setValue(new PasscodeDialogPresenter$VerifyPasscodeAttempt(((PasscodeDialogViewEvent.Submit) passcodeDialogViewEvent).passcode, null));
                    }
                } else if (Intrinsics.areEqual(passcodeDialogViewEvent, PasscodeDialogViewEvent.Cancel.INSTANCE)) {
                    navigator.goTo(new Finish(new HistoryScreens.PaymentPasscodeDialog.Result(HistoryScreens.PaymentPasscodeDialog.Result.Status.CANCELED, null)));
                } else {
                    if (!Intrinsics.areEqual(passcodeDialogViewEvent, PasscodeDialogViewEvent.GoBack.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (!((PasscodeDialogViewModel) mutableState6.getValue()).loading) {
                        navigator.goTo(back);
                    }
                }
                return Unit.INSTANCE;
            case 11:
                MutableState mutableState7 = (MutableState) obj3;
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj5;
                TransferOptionPickerScreen transferOptionPickerScreen = (TransferOptionPickerScreen) poolsListPresenter.flowToken;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                TransferOptionPickerViewEvent transferOptionPickerViewEvent = (TransferOptionPickerViewEvent) obj;
                if (transferOptionPickerViewEvent instanceof TransferOptionPickerViewEvent.OptionTapped) {
                    Iterator it11 = ((List) mutableState7.getValue()).iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            ?? next4 = it11.next();
                            ResolvedTransferOption resolvedTransferOption3 = (ResolvedTransferOption) next4;
                            if (resolvedTransferOption3.selection.equals(((TransferOptionPickerViewEvent.OptionTapped) transferOptionPickerViewEvent).selection) && resolvedTransferOption3.instrument.enabled) {
                                resolvedTransferOption2 = next4;
                            }
                        } else {
                            resolvedTransferOption2 = null;
                        }
                    }
                    ResolvedTransferOption resolvedTransferOption4 = resolvedTransferOption2;
                    if (resolvedTransferOption4 != null) {
                        TransferOptions transferOptions = resolvedTransferOption4.selection.transferOption;
                        if (transferOptions == TransferOptions.LinkDebit) {
                            screenNavigator5.giveAnswer(transferOptionPickerScreen.askedQuestion, new TransferOptionPickerAnswer.LinkTapped(transferOptions));
                            FlowStarter flowStarter = (FlowStarter) poolsListPresenter.localeAssetProvider;
                            CashInstrumentType cashInstrumentType2 = CashInstrumentType.DEBIT_CARD;
                            ?? r4 = transferOptionPickerScreen.linkDebitExitScreen;
                            if (r4 != 0) {
                                transferOptionPickerScreen = r4;
                            }
                            startProfileLinkingFlow = ((RealFlowStarter) flowStarter).startProfileLinkingFlow(transferOptionPickerScreen, cashInstrumentType2, (String) null);
                            screenNavigator5.goTo(startProfileLinkingFlow);
                        } else if (resolvedTransferOption4.isSelectable()) {
                            ((MutableState) obj4).setValue(((TransferOptionPickerViewEvent.OptionTapped) transferOptionPickerViewEvent).selection);
                        }
                    }
                } else if (Intrinsics.areEqual(transferOptionPickerViewEvent, TransferOptionPickerViewEvent.ContinueTapped.INSTANCE)) {
                    Iterator it12 = ((List) mutableState7.getValue()).iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            ?? next5 = it12.next();
                            ResolvedTransferOption resolvedTransferOption5 = (ResolvedTransferOption) next5;
                            if (resolvedTransferOption5.selection.equals((TransferOptionPickerSelection) ((MutableState) obj6).getValue()) && resolvedTransferOption5.isSelectable()) {
                                resolvedTransferOption = next5;
                            }
                        } else {
                            resolvedTransferOption = null;
                        }
                    }
                    ResolvedTransferOption resolvedTransferOption6 = resolvedTransferOption;
                    if (resolvedTransferOption6 != null) {
                        screenNavigator5.giveAnswer(transferOptionPickerScreen.askedQuestion, new TransferOptionPickerAnswer.Selected(resolvedTransferOption6.selectedOption));
                    }
                } else {
                    if (!Intrinsics.areEqual(transferOptionPickerViewEvent, TransferOptionPickerViewEvent.Dismissed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator5.giveAnswer(transferOptionPickerScreen.askedQuestion, TransferOptionPickerAnswer.Dismissed.INSTANCE);
                }
                return Unit.INSTANCE;
            case 12:
                if (continuation instanceof PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1) {
                    persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1 = (PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1) continuation;
                    int i7 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj8 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) obj;
                            RewardSlotQueries queries = ((PersistentHistoricalDataCache) obj4).getQueries();
                            CurrencyCode currencyCode = (CurrencyCode) obj6;
                            PriceHistory priceHistory = getHistoricalExchangeDataResponse.price_history;
                            priceHistory.getClass();
                            queries.getClass();
                            currencyCode.getClass();
                            queries.driver.execute(991979515, "INSERT OR REPLACE INTO investing_bitcoin_portfolio_graph_cache\nVALUES (?, ?, ?)", new BankingConfigQueries$$ExternalSyntheticLambda0(queries, currencyCode, (HistoricalRange) obj3, priceHistory, 19));
                            queries.notifyQueries(991979515, new InvestmentEntityQueries$$ExternalSyntheticLambda1(21));
                            persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1.label = 1;
                            if (((FlowCollector) obj5).emit(getHistoricalExchangeDataResponse, persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj8);
                        }
                        return Unit.INSTANCE;
                    }
                }
                persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1 = new PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1(this, continuation);
                Object obj82 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$2$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 13:
                return emit$com$squareup$cash$investing$backend$real$RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$1$2(obj, continuation);
            case 14:
                return emit$com$squareup$cash$investing$backend$real$RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$1$2(obj, continuation);
            case 15:
                return emit$com$squareup$cash$investing$presenters$InvestingStockSelectionBlockerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 16:
                return emit$com$squareup$cash$investing$presenters$search$InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$$inlined$map$2$2(obj, continuation);
            case 17:
                return emit$com$squareup$cash$investing$presenters$search$InvestingSearchPresenter$filterGroupCarousels$groups$1$invokeSuspend$lambda$4$$inlined$map$2$2(obj, continuation);
            case 18:
                return emit$com$squareup$cash$investingcrypto$presenters$news$InvestingCryptoNewsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 19:
                return emit$com$squareup$cash$invitations$InviteContactsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 20:
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj4;
                CoroutineScope coroutineScope6 = (CoroutineScope) obj5;
                LanguageDisclosureViewEvent languageDisclosureViewEvent = (LanguageDisclosureViewEvent) obj;
                Continuation continuation5 = null;
                if (languageDisclosureViewEvent instanceof LanguageDisclosureViewEvent.Accept) {
                    JobKt.launch$default(coroutineScope6, null, null, new CashMapPresenter$models$3$1(localCashBalancePresenter, (MutableState) obj3, (State) obj6, continuation5, 6), 3);
                } else if (languageDisclosureViewEvent instanceof LanguageDisclosureViewEvent.Close) {
                    ((AndroidActivityFinisher) localCashBalancePresenter.syncer).finish();
                } else {
                    if (!(languageDisclosureViewEvent instanceof LanguageDisclosureViewEvent.OpenLocaleSettings)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (Build.VERSION.SDK_INT >= 33) {
                        Activity activity = ((IntentLauncher) localCashBalancePresenter.service).activity;
                        String packageName = activity.getPackageName();
                        packageName.getClass();
                        Intents.maybeStartActivity(activity, new Intent("android.settings.APP_LOCALE_SETTINGS", Uri.fromParts("package", packageName, null)), new CameraX$$ExternalSyntheticLambda0(activity, 12));
                    }
                }
                return Unit.INSTANCE;
            case 21:
                return emit$com$squareup$cash$merchant$presenters$MerchantInfoFeedbackPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 22:
                return emit$com$squareup$cash$moneybot$presenters$MoneybotFeedbackPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 23:
                return emit$com$squareup$cash$offers$backend$real$RealOffersTabRepository$emitCacheOrRefreshHome$1$1(obj, continuation);
            case 24:
                return emit$com$squareup$cash$offers$presenters$OffersDetailsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 25:
                return emit$com$squareup$cash$payments$presenters$PaymentConfigurationPresenter$models$14$1$3(obj, continuation);
            case 26:
                return emit$com$squareup$cash$pools$presenters$PoolContributeWithNotePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 27:
                return emit$com$squareup$cash$pools$presenters$PoolsListPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$pools$presenters$StartPoolPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj6;
                BetterNavigator.ScreenNavigator screenNavigator6 = ((PdfPreviewPresenter) obj5).navigator;
                DeviceManagerListViewEvent deviceManagerListViewEvent = (DeviceManagerListViewEvent) obj;
                if (deviceManagerListViewEvent instanceof DeviceManagerListViewEvent.DeviceSelected) {
                    screenNavigator6.goTo(new DeviceManagerDeviceDetailsScreen(((DeviceManagerListViewEvent.DeviceSelected) deviceManagerListViewEvent).token, 1));
                } else if (Intrinsics.areEqual(deviceManagerListViewEvent, DeviceManagerListViewEvent.GoBack.INSTANCE)) {
                    screenNavigator6.goTo(back);
                } else if (Intrinsics.areEqual(deviceManagerListViewEvent, DeviceManagerListViewEvent.RequestRemoveAll.INSTANCE)) {
                    DataLoadingState dataLoadingState = (DataLoadingState) ((State) obj4).getValue();
                    if (dataLoadingState instanceof DataLoadingState.DataLoaded) {
                        List<LoggedInDevice> list3 = (List) ((DataLoadingState.DataLoaded) dataLoadingState).data;
                        if (list3 != null) {
                            for (LoggedInDevice loggedInDevice : list3) {
                                if (loggedInDevice.isThisDevice) {
                                    str3 = loggedInDevice.name;
                                }
                            }
                            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                            return null;
                        }
                        screenNavigator6.goTo(new DeviceManagerConfirmRemoveDevicesScreen(new RedactedString(str3)));
                    }
                } else if (!Intrinsics.areEqual(deviceManagerListViewEvent, DeviceManagerListViewEvent.RemoveAllCancelled.INSTANCE)) {
                    if (Intrinsics.areEqual(deviceManagerListViewEvent, DeviceManagerListViewEvent.RemoveAllConfirmed.INSTANCE)) {
                        MutableState mutableState8 = (MutableState) obj3;
                        Integer num = (Integer) mutableState8.getValue();
                        mutableState8.setValue(new Integer((num != null ? num.intValue() : 0) + 1));
                    } else {
                        if (!Intrinsics.areEqual(deviceManagerListViewEvent, DeviceManagerListViewEvent.RefreshDevices.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        int intValue = parcelableSnapshotMutableIntState.getIntValue();
                        parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                        Okio.boxInt(intValue);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ NearbyPayRequestPresenter$models$10$1$1$1(Object obj, MoleculePresenter moleculePresenter, MutableState mutableState, State state, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$vibrate$delegate = mutableState;
        this.$lastVibrationTime$delegate = state;
        this.$confirmedPayments = obj;
    }

    public /* synthetic */ NearbyPayRequestPresenter$models$10$1$1$1(Object obj, Object obj2, Object obj3, MutableState mutableState, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.$confirmedPayments = obj2;
        this.this$0 = obj3;
        this.$vibrate$delegate = mutableState;
        this.$lastVibrationTime$delegate = mutableState2;
    }

    public /* synthetic */ NearbyPayRequestPresenter$models$10$1$1$1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.this$0 = obj2;
        this.$lastVibrationTime$delegate = obj3;
        this.$vibrate$delegate = obj4;
        this.$confirmedPayments = obj;
    }

    public /* synthetic */ NearbyPayRequestPresenter$models$10$1$1$1(int i, MutableState mutableState, MutableState mutableState2, State state, MoleculePresenter moleculePresenter, CoroutineScope coroutineScope) {
        this.$r8$classId = i;
        this.$confirmedPayments = moleculePresenter;
        this.$vibrate$delegate = mutableState;
        this.this$0 = state;
        this.$lastVibrationTime$delegate = mutableState2;
    }

    public /* synthetic */ NearbyPayRequestPresenter$models$10$1$1$1(CoroutineScope coroutineScope, Object obj, Object obj2, Object obj3, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.$confirmedPayments = obj;
        this.this$0 = obj2;
        this.$lastVibrationTime$delegate = obj3;
        this.$vibrate$delegate = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x01b1 -> B:10:0x01c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0120 -> B:11:0x0143). Please report as a decompilation issue!!! */
    /* renamed from: emit, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit$com$squareup$cash$payments$presenters$PaymentConfigurationPresenter$models$14$1$3(List list, Continuation continuation) {
        PaymentConfigurationPresenter$models$14$1$3$emit$1 paymentConfigurationPresenter$models$14$1$3$emit$1;
        int i;
        String str;
        PaymentConfigurationPresenter paymentConfigurationPresenter;
        ArrayList arrayList;
        Iterator it;
        MutableState mutableState;
        int i2;
        int i3;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        MutableState mutableState2 = (MutableState) this.$vibrate$delegate;
        if (continuation instanceof PaymentConfigurationPresenter$models$14$1$3$emit$1) {
            paymentConfigurationPresenter$models$14$1$3$emit$1 = (PaymentConfigurationPresenter$models$14$1$3$emit$1) continuation;
            int i4 = paymentConfigurationPresenter$models$14$1$3$emit$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                paymentConfigurationPresenter$models$14$1$3$emit$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = paymentConfigurationPresenter$models$14$1$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentConfigurationPresenter$models$14$1$3$emit$1.label;
                if (i != 0) {
                    str = null;
                    SafeTrace.throwOnFailure(obj);
                    List list2 = list;
                    paymentConfigurationPresenter = (PaymentConfigurationPresenter) this.this$0;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    it = list2.iterator();
                    mutableState = mutableState2;
                    i2 = 0;
                    i3 = 0;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = paymentConfigurationPresenter$models$14$1$3$emit$1.I$4;
                    int i6 = paymentConfigurationPresenter$models$14$1$3$emit$1.I$3;
                    int i7 = paymentConfigurationPresenter$models$14$1$3$emit$1.I$2;
                    int i8 = paymentConfigurationPresenter$models$14$1$3$emit$1.I$1;
                    int i9 = paymentConfigurationPresenter$models$14$1$3$emit$1.I$0;
                    Collection collection = paymentConfigurationPresenter$models$14$1$3$emit$1.L$19;
                    RecipientViewModel recipientViewModel = paymentConfigurationPresenter$models$14$1$3$emit$1.L$18;
                    str = null;
                    Collection collection2 = paymentConfigurationPresenter$models$14$1$3$emit$1.L$17;
                    Iterator it2 = paymentConfigurationPresenter$models$14$1$3$emit$1.L$14;
                    Collection collection3 = paymentConfigurationPresenter$models$14$1$3$emit$1.L$13;
                    String str7 = paymentConfigurationPresenter$models$14$1$3$emit$1.L$12;
                    SectionViewModel sectionViewModel = paymentConfigurationPresenter$models$14$1$3$emit$1.L$10;
                    Iterator it3 = paymentConfigurationPresenter$models$14$1$3$emit$1.L$6;
                    Collection collection4 = paymentConfigurationPresenter$models$14$1$3$emit$1.L$5;
                    MutableState mutableState3 = paymentConfigurationPresenter$models$14$1$3$emit$1.L$3;
                    PaymentConfigurationPresenter paymentConfigurationPresenter2 = paymentConfigurationPresenter$models$14$1$3$emit$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                    SectionViewModel sectionViewModel2 = sectionViewModel;
                    MutableState mutableState4 = mutableState2;
                    String str8 = str7;
                    int i10 = i8;
                    ArrayList arrayList2 = collection4;
                    PaymentConfigurationPresenter paymentConfigurationPresenter3 = paymentConfigurationPresenter2;
                    int i11 = i6;
                    ArrayList arrayList3 = collection;
                    Object obj2 = obj;
                    ArrayList arrayList4 = collection3;
                    Iterator it4 = it2;
                    MutableState mutableState5 = mutableState3;
                    int i12 = i5;
                    PaymentConfigurationPresenter$models$14$1$3$emit$1 paymentConfigurationPresenter$models$14$1$3$emit$12 = paymentConfigurationPresenter$models$14$1$3$emit$1;
                    Iterator it5 = it3;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    String str9 = recipientViewModel.listUniqueId;
                    SectionViewModel sectionViewModel3 = sectionViewModel2;
                    com.squareup.cash.recipients.data.Recipient recipient = recipientViewModel.recipient;
                    String str10 = recipientViewModel.title;
                    RecipientViewModel.Avatar avatar = recipientViewModel.avatar;
                    Character ch = recipientViewModel.monogram;
                    String str11 = recipientViewModel.subtitle;
                    boolean z2 = recipientViewModel.isSelected;
                    boolean z3 = recipientViewModel.isVerified;
                    boolean z4 = recipientViewModel.isBusiness;
                    Color color = recipientViewModel.accentColor;
                    boolean z5 = recipientViewModel.showInfoButton;
                    boolean z6 = recipientViewModel.showCheckbox;
                    str9.getClass();
                    recipient.getClass();
                    str10.getClass();
                    avatar.getClass();
                    collection2.add(new RecipientViewModel(str9, recipient, str10, avatar, ch, str11, z2, z3, z4, color, z5, z6, booleanValue));
                    int i13 = i7;
                    int i14 = i10;
                    ArrayList arrayList5 = arrayList4;
                    SectionViewModel sectionViewModel4 = sectionViewModel3;
                    String str12 = str8;
                    mutableState2 = mutableState4;
                    if (it4.hasNext()) {
                        mutableState4 = mutableState2;
                        RecipientViewModel recipientViewModel2 = (RecipientViewModel) it4.next();
                        OfflineManager offlineManager = paymentConfigurationPresenter3.offlineManager;
                        Money money = ((PaymentRouterData) mutableState5.getValue()).amount;
                        ArrayList arrayList6 = arrayList3;
                        Orientation orientation = paymentConfigurationPresenter3.args.orientation;
                        CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                        List listOf = CollectionsKt__CollectionsJVMKt.listOf(com.squareup.cash.recipients.data.UtilsKt.toSendableUiCustomer(recipientViewModel2.recipient));
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$2 = paymentConfigurationPresenter3;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$3 = mutableState5;
                        PaymentConfigurationPresenter paymentConfigurationPresenter4 = paymentConfigurationPresenter3;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$5 = arrayList2;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$6 = it5;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$10 = sectionViewModel4;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$12 = str12;
                        ArrayList arrayList7 = arrayList5;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$13 = arrayList7;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$14 = it4;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$17 = arrayList7;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$18 = recipientViewModel2;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.L$19 = arrayList6;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.I$0 = i9;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.I$1 = i14;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.I$2 = i13;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.I$3 = i11;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.I$4 = i12;
                        paymentConfigurationPresenter$models$14$1$3$emit$12.label = 1;
                        Object isDuplicatePayment = ((RealOfflineManager) offlineManager).isDuplicatePayment(money, orientation, listOf, paymentConfigurationPresenter$models$14$1$3$emit$12);
                        coroutineSingletons = coroutineSingletons2;
                        if (isDuplicatePayment == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        SectionViewModel sectionViewModel5 = sectionViewModel4;
                        obj2 = isDuplicatePayment;
                        sectionViewModel2 = sectionViewModel5;
                        arrayList4 = arrayList5;
                        arrayList3 = arrayList6;
                        paymentConfigurationPresenter3 = paymentConfigurationPresenter4;
                        i10 = i14;
                        recipientViewModel = recipientViewModel2;
                        str8 = str12;
                        i7 = i13;
                        collection2 = arrayList4;
                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                        String str92 = recipientViewModel.listUniqueId;
                        SectionViewModel sectionViewModel32 = sectionViewModel2;
                        com.squareup.cash.recipients.data.Recipient recipient2 = recipientViewModel.recipient;
                        String str102 = recipientViewModel.title;
                        RecipientViewModel.Avatar avatar2 = recipientViewModel.avatar;
                        Character ch2 = recipientViewModel.monogram;
                        String str112 = recipientViewModel.subtitle;
                        boolean z22 = recipientViewModel.isSelected;
                        boolean z32 = recipientViewModel.isVerified;
                        boolean z42 = recipientViewModel.isBusiness;
                        Color color2 = recipientViewModel.accentColor;
                        boolean z52 = recipientViewModel.showInfoButton;
                        boolean z62 = recipientViewModel.showCheckbox;
                        str92.getClass();
                        recipient2.getClass();
                        str102.getClass();
                        avatar2.getClass();
                        collection2.add(new RecipientViewModel(str92, recipient2, str102, avatar2, ch2, str112, z22, z32, z42, color2, z52, z62, booleanValue2));
                        int i132 = i7;
                        int i142 = i10;
                        ArrayList arrayList52 = arrayList4;
                        SectionViewModel sectionViewModel42 = sectionViewModel32;
                        String str122 = str8;
                        mutableState2 = mutableState4;
                        if (it4.hasNext()) {
                            MutableState mutableState6 = mutableState2;
                            PaymentConfigurationPresenter paymentConfigurationPresenter5 = paymentConfigurationPresenter3;
                            ArrayList arrayList8 = arrayList52;
                            SectionViewModel.Type type2 = sectionViewModel42.f1193type;
                            String str13 = sectionViewModel42.description;
                            Integer num = sectionViewModel42.position;
                            str122.getClass();
                            type2.getClass();
                            arrayList8.getClass();
                            arrayList3.add(new SectionViewModel(str122, type2, arrayList8, str13, num));
                            it = it5;
                            paymentConfigurationPresenter$models$14$1$3$emit$1 = paymentConfigurationPresenter$models$14$1$3$emit$12;
                            mutableState = mutableState5;
                            i2 = i9;
                            i3 = i142;
                            arrayList = arrayList2;
                            mutableState2 = mutableState6;
                            paymentConfigurationPresenter = paymentConfigurationPresenter5;
                            if (!it.hasNext()) {
                                SectionViewModel sectionViewModel6 = (SectionViewModel) it.next();
                                str122 = sectionViewModel6.name;
                                if (sectionViewModel6.f1193type != SectionViewModel.Type.CONTACTS) {
                                    str122 = str;
                                }
                                if (str122 == null) {
                                    str122 = "";
                                }
                                List list3 = sectionViewModel6.recipients;
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj3 : list3) {
                                    com.squareup.cash.recipients.data.Recipient recipient3 = ((RecipientViewModel) obj3).recipient;
                                    Iterator it6 = it;
                                    String str14 = recipient3.emailAddresses;
                                    if ((str14 != null && !StringsKt.isBlank(str14)) || (((str2 = recipient3.smsNumbers) != null && !StringsKt.isBlank(str2)) || (((str3 = recipient3.cashtag) != null && !StringsKt.isBlank(str3)) || (((str4 = recipient3.customerId) != null && !StringsKt.isBlank(str4)) || (((str5 = recipient3.sms) != null && !StringsKt.isBlank(str5)) || ((str6 = recipient3.email) != null && !StringsKt.isBlank(str6))))))) {
                                        arrayList9.add(obj3);
                                    }
                                    it = it6;
                                }
                                Iterator it7 = it;
                                arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                arrayList2 = arrayList;
                                i142 = i3;
                                sectionViewModel42 = sectionViewModel6;
                                it4 = arrayList9.iterator();
                                i11 = 0;
                                paymentConfigurationPresenter3 = paymentConfigurationPresenter;
                                arrayList3 = arrayList2;
                                mutableState5 = mutableState;
                                i9 = i2;
                                i12 = 0;
                                i132 = 0;
                                paymentConfigurationPresenter$models$14$1$3$emit$12 = paymentConfigurationPresenter$models$14$1$3$emit$1;
                                it5 = it7;
                                if (it4.hasNext()) {
                                }
                            } else {
                                MutableState mutableState7 = mutableState2;
                                ArrayList arrayList10 = arrayList;
                                if (PaymentConfigurationPresenter.models$lambda$1((State) this.$lastVibrationTime$delegate)) {
                                    ArrayList arrayList11 = arrayList10;
                                    if (!(arrayList11 instanceof Collection) || !arrayList11.isEmpty()) {
                                        Iterator it8 = arrayList11.iterator();
                                        while (it8.hasNext()) {
                                            if (!((SectionViewModel) it8.next()).recipients.isEmpty()) {
                                                break;
                                            }
                                        }
                                    }
                                    if (StringsKt.isBlank((CharSequence) ((StateFlowImpl) ((MutableStateFlow) this.$confirmedPayments)).getValue())) {
                                        z = true;
                                        mutableState7.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState7.getValue(), null, null, null, false, false, z, null, null, false, arrayList10, false, false, null, null, null, null, null, null, false, 16770943));
                                        return Unit.INSTANCE;
                                    }
                                }
                                z = false;
                                mutableState7.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState7.getValue(), null, null, null, false, false, z, null, null, false, arrayList10, false, false, null, null, null, null, null, null, false, 16770943));
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
            }
        }
        paymentConfigurationPresenter$models$14$1$3$emit$1 = new PaymentConfigurationPresenter$models$14$1$3$emit$1(this, continuation);
        Object obj4 = paymentConfigurationPresenter$models$14$1$3$emit$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentConfigurationPresenter$models$14$1$3$emit$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (com.squareup.cash.offers.backend.real.RealOffersTabRepository.access$refreshHomeOrEmitError(r5, r7, r4, r8) == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (com.squareup.cash.offers.backend.real.RealOffersTabRepository.access$refreshHomeOrEmitError(r5, r7, r4, r8) == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r7.emit(com.squareup.cash.offers.backend.api.HomeResult.HomeLoading.INSTANCE, r8) == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ab, code lost:
    
        if (r7.emit(r1, r8) == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        if (r7.emit(r1, r8) == r2) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* renamed from: emit, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit$com$squareup$cash$offers$backend$real$RealOffersTabRepository$emitCacheOrRefreshHome$1$1(OffersHome offersHome, Continuation continuation) {
        RealOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1 realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1;
        int i;
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.$vibrate$delegate;
        Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0 = (Overlay$$ExternalSyntheticLambda0) this.$lastVibrationTime$delegate;
        RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) this.this$0;
        AndroidClock androidClock = realOffersTabRepository.clock;
        FlowCollector flowCollector = (FlowCollector) this.$confirmedPayments;
        if (continuation instanceof RealOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1) {
            realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1 = (RealOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1) continuation;
            int i2 = realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (offersHome == null) {
                        realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.label = 1;
                    } else {
                        OffersTabHomeResponse offersTabHomeResponse = offersHome.offers_home_response;
                        Long l = offersHome.ttl_in_millis;
                        if ((l != null ? l.longValue() : 0L) < androidClock.millis()) {
                            if (realOffersTabRepository.networkInfo.isNetworkAvailable()) {
                                HomeResult.HomeData homeData = new HomeResult.HomeData(offersTabHomeResponse, false);
                                realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.label = 3;
                            }
                            if (!ref$BooleanRef.element) {
                            }
                            return Unit.INSTANCE;
                        }
                        if ((l != null ? l.longValue() : 0L) >= androidClock.millis()) {
                            HomeResult.HomeData homeData2 = new HomeResult.HomeData(offersTabHomeResponse, true);
                            realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.label = 5;
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        if (!ref$BooleanRef.element) {
                            ref$BooleanRef.element = true;
                            realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.label = 4;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 5) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ref$BooleanRef.element = false;
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.label = 2;
            }
        }
        realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1 = new RealOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1(this, continuation);
        Object obj2 = realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOffersTabRepository$emitCacheOrRefreshHome$1$1$emit$1.label;
        if (i != 0) {
        }
    }
}
