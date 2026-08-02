package com.squareup.cash.music.presenters;

import android.app.NotificationChannelGroup;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.dynamite.zzo;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager$activities$2$1$2;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemConfirmed;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemSelected;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$HelpClicked;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneyChanged;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.moneybot.ChatContentState;
import com.squareup.cash.cdf.moneybot.HomeItemType;
import com.squareup.cash.cdf.moneybot.MoneybotChatClose;
import com.squareup.cash.cdf.moneybot.MoneybotChatOpen;
import com.squareup.cash.cdf.moneybot.MoneybotOverflowMenuSelectItem;
import com.squareup.cash.cdf.moneybot.MoneybotSurface;
import com.squareup.cash.cdf.moneybothome.MoneybotHomeBrowseViewItem;
import com.squareup.cash.cdf.moneybothome.TapElement;
import com.squareup.cash.cdf.singleusepayment.SingleUsePaymentCancelDismissConfirmSheet;
import com.squareup.cash.cdf.singleusepayment.SingleUsePaymentCancelTapConfirmButton;
import com.squareup.cash.cdf.stock.StockSelectSelectInvestSearchFilterContinue;
import com.squareup.cash.cdf.stock.StockSelectSelectInvestSearchFilterOption;
import com.squareup.cash.cdf.stock.StockToggleToggleFinancialWindow;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.db2.entities.ForToken;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreference;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$MriSigningTimeout;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SheetV3;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.globalsearch.views.GlobalSearchViewKt$GlobalSearch$1$1$2;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager$activities$$inlined$map$1$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.navigation.PaymentActionHandler$reverseDeposit$$inlined$map$1$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.history.viewmodels.CancelPendingSupPaymentViewEvent;
import com.squareup.cash.history.viewmodels.ReportAbuseEvent;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.OwnedHoldings;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringPurchaseReceiptPresenter;
import com.squareup.cash.investing.presenters.autoinvest.RecurringPreferenceKt;
import com.squareup.cash.investing.presenters.metrics.InvestingFinancialPresenter;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.teengraduation.StocksTransferEtaSheetPresenter;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.categories.FilterSubFiltersViewEvent;
import com.squareup.cash.investing.viewmodels.categories.FilterSubFiltersViewModel;
import com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewEvent;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewEvent;
import com.squareup.cash.investing.viewmodels.metrics.Range;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringPurchaseReceiptViewEvent;
import com.squareup.cash.investingcrypto.presenters.autoinvest.InvestingCryptoRecurringPreferences;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$HeaderState;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$State;
import com.squareup.cash.merchant.screens.BackNavigationAction;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewEvent;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import com.squareup.cash.money.applets.sections.AppletTileSectionProvider;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.RealUserSessionPager;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatContentFactory;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter$processEvent$1;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter;
import com.squareup.cash.moneybot.screens.ChatSourceContext;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotAutomationsScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotDebugOverlayScreen;
import com.squareup.cash.moneybot.screens.MoneybotOverflowMenuScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewEvent;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.viewmodels.MusicViewEvent;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.music.viewmodels.Track;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.notifications.NotificationChannelToggleState;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1;
import com.squareup.cash.notifications.channels.NotificationChannelGroupId;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.db.OffersSheet;
import com.squareup.cash.offers.presenters.DetailCaptionFormatStringResources;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.offers.viewmodels.OfferCountdownTemplateViewModel;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAliasPicker;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.payments.presenters.NearbyPayRequestPresenter$models$10$1$1$1;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recurring.db.Recurring_preference;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewEvent$BannerClicked;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$Config;
import com.squareup.preferences.values.RecentMoneybotSession;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.marketdata.model.InvestmentFinancials;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.marketprices.PriceTick;
import com.squareup.protos.cash.marketprices.service.GetCurrentPricesRequest;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.cash.marketprices.service.MarketPricesAppService;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataRequest;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.invest.ui.Section;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import com.squareup.wire.MoshiJsonIntegration;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MusicPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object $searchQueryFlow;
    public final /* synthetic */ Object $state$delegate;
    public Object $tracks$delegate;
    public int label;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicPresenter$models$1$1(MutableState mutableState, LocalHomePresenter localHomePresenter, AllocationDestination allocationDestination, PaychecksUiConfiguration paychecksUiConfiguration, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 29;
        this.$tracks$delegate = mutableState;
        this.$searchQueryFlow = localHomePresenter;
        this.this$0 = allocationDestination;
        this.$state$delegate = paychecksUiConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$state$delegate;
        switch (i) {
            case 0:
                return new MusicPresenter$models$1$1((MutableStateFlow) this.$searchQueryFlow, (MusicPresenter) this.this$0, (MutableState) this.$tracks$delegate, (MutableState) obj2, continuation, 0);
            case 1:
                return new MusicPresenter$models$1$1((StocksTransferEtaSheetPresenter) this.$searchQueryFlow, (InvestingState) this.this$0, (MutableState) obj2, continuation);
            case 2:
                return new MusicPresenter$models$1$1((CollapsingToolbarScaffoldState) this.$searchQueryFlow, (LazyListState) this.this$0, (MutableState) this.$tracks$delegate, (SearchBarKeyboardState) obj2, continuation, 2);
            case 3:
                MusicPresenter$models$1$1 musicPresenter$models$1$1 = new MusicPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) obj2, (MutableState) this.$tracks$delegate, 3);
                musicPresenter$models$1$1.$searchQueryFlow = obj;
                return musicPresenter$models$1$1;
            case 4:
                MusicPresenter$models$1$1 musicPresenter$models$1$12 = new MusicPresenter$models$1$1((AppletTileSectionProvider) this.$tracks$delegate, (Map) obj2, continuation);
                musicPresenter$models$1$12.this$0 = obj;
                return musicPresenter$models$1$12;
            case 5:
                MusicPresenter$models$1$1 musicPresenter$models$1$13 = new MusicPresenter$models$1$1((ProducerScope) this.this$0, (UnleashContext) this.$tracks$delegate, (String) obj2, continuation, 5);
                musicPresenter$models$1$13.$searchQueryFlow = obj;
                return musicPresenter$models$1$13;
            case 6:
                MusicPresenter$models$1$1 musicPresenter$models$1$14 = new MusicPresenter$models$1$1((UnleashContext) this.this$0, (Map) this.$tracks$delegate, (String) obj2, continuation, 6);
                musicPresenter$models$1$14.$searchQueryFlow = obj;
                return musicPresenter$models$1$14;
            case 7:
                MusicPresenter$models$1$1 musicPresenter$models$1$15 = new MusicPresenter$models$1$1((String) this.this$0, (MoneybotChatContentFactory) this.$tracks$delegate, (String) obj2, continuation, 7);
                musicPresenter$models$1$15.$searchQueryFlow = obj;
                return musicPresenter$models$1$15;
            case 8:
                MusicPresenter$models$1$1 musicPresenter$models$1$16 = new MusicPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$tracks$delegate, (State) obj2, 8);
                musicPresenter$models$1$16.$searchQueryFlow = obj;
                return musicPresenter$models$1$16;
            case 9:
                return new MusicPresenter$models$1$1((MoneybotChatPresenter) this.$searchQueryFlow, (AppForegroundState) this.this$0, (MutableState) this.$tracks$delegate, (MutableState) obj2, continuation, 9);
            case 10:
                return new MusicPresenter$models$1$1((MoneybotChatPresenter) this.$searchQueryFlow, (MoneybotChatPresenter.PluginMessage) this.this$0, (MutableState) this.$tracks$delegate, (MutableState) obj2, continuation, 10);
            case 11:
                return new MusicPresenter$models$1$1((MoneybotChatPresenter) this.$searchQueryFlow, (RealChatSessionManager) this.this$0, (MoneybotChatViewEvent) this.$tracks$delegate, (List) obj2, continuation, 11);
            case 12:
                MusicPresenter$models$1$1 musicPresenter$models$1$17 = new MusicPresenter$models$1$1((MoneybotChatPresenter) this.this$0, (MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion) this.$tracks$delegate, (RealChatSessionManager) obj2, continuation, 12);
                musicPresenter$models$1$17.$searchQueryFlow = obj;
                return musicPresenter$models$1$17;
            case 13:
                MusicPresenter$models$1$1 musicPresenter$models$1$18 = new MusicPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) obj2, (MutableState) this.$tracks$delegate, 13);
                musicPresenter$models$1$18.$searchQueryFlow = obj;
                return musicPresenter$models$1$18;
            case 14:
                MusicPresenter$models$1$1 musicPresenter$models$1$19 = new MusicPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) this.$tracks$delegate, (State) obj2, 14);
                musicPresenter$models$1$19.$searchQueryFlow = obj;
                return musicPresenter$models$1$19;
            case 15:
                MusicPresenter$models$1$1 musicPresenter$models$1$110 = new MusicPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) obj2, (MutableState) this.$tracks$delegate, 15);
                musicPresenter$models$1$110.$searchQueryFlow = obj;
                return musicPresenter$models$1$110;
            case 16:
                return new MusicPresenter$models$1$1((TemplateCardPresenter) this.$searchQueryFlow, (TemplateCardViewEvent) this.this$0, (MutableState) this.$tracks$delegate, (MutableState) obj2, continuation, 16);
            case 17:
                return new MusicPresenter$models$1$1((LazyListState) this.$searchQueryFlow, (MoneybotChatHistoryViewModel.Content) this.this$0, (MutableState) this.$tracks$delegate, (MutableState) obj2, continuation, 17);
            case 18:
                return new MusicPresenter$models$1$1((MRIContext) this.this$0, (RealMRIFactory) this.$tracks$delegate, (AttestedKeyService) obj2, continuation, 18);
            case 19:
                return new MusicPresenter$models$1$1((MusicPresenter) this.this$0, (MusicViewEvent) this.$searchQueryFlow, (MutableState) this.$tracks$delegate, (MutableState) obj2, continuation);
            case 20:
                MusicPresenter$models$1$1 musicPresenter$models$1$111 = new MusicPresenter$models$1$1((InviteContactsPresenter$special$$inlined$map$1) this.this$0, (RealOffersSheetRepository) this.$tracks$delegate, (Function1) obj2, continuation, 20);
                musicPresenter$models$1$111.$searchQueryFlow = obj;
                return musicPresenter$models$1$111;
            case 21:
                MusicPresenter$models$1$1 musicPresenter$models$1$112 = new MusicPresenter$models$1$1((FlowQuery$mapToList$$inlined$map$1) this.this$0, (RealOffersTabRepository) this.$tracks$delegate, (Overlay$$ExternalSyntheticLambda0) obj2, continuation, 21);
                musicPresenter$models$1$112.$searchQueryFlow = obj;
                return musicPresenter$models$1$112;
            case 22:
                MusicPresenter$models$1$1 musicPresenter$models$1$113 = new MusicPresenter$models$1$1((InviteContactsPresenter$special$$inlined$map$1) this.this$0, (RealOffersTabRepository) this.$tracks$delegate, (Overlay$$ExternalSyntheticLambda0) obj2, continuation, 22);
                musicPresenter$models$1$113.$searchQueryFlow = obj;
                return musicPresenter$models$1$113;
            case 23:
                return new MusicPresenter$models$1$1((OfferCountdownTemplateViewModel) this.$searchQueryFlow, (AndroidClock) this.this$0, (DetailCaptionFormatStringResources) obj2, (MutableState) this.$tracks$delegate, continuation);
            case 24:
                MusicPresenter$models$1$1 musicPresenter$models$1$114 = new MusicPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) obj2, (MutableState) this.$tracks$delegate, 24);
                musicPresenter$models$1$114.$searchQueryFlow = obj;
                return musicPresenter$models$1$114;
            case 25:
                MusicPresenter$models$1$1 musicPresenter$models$1$115 = new MusicPresenter$models$1$1((Flow) this.this$0, continuation, (LocalCashBalancePresenter) this.$tracks$delegate, (State) obj2, 25);
                musicPresenter$models$1$115.$searchQueryFlow = obj;
                return musicPresenter$models$1$115;
            case 26:
                MusicPresenter$models$1$1 musicPresenter$models$1$116 = new MusicPresenter$models$1$1((String) this.this$0, (ValidatedAliasPicker) this.$tracks$delegate, continuation, (CardLockPresenter) obj2);
                musicPresenter$models$1$116.$searchQueryFlow = obj;
                return musicPresenter$models$1$116;
            case 27:
                MusicPresenter$models$1$1 musicPresenter$models$1$117 = new MusicPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) obj2, (MutableState) this.$tracks$delegate, 27);
                musicPresenter$models$1$117.$searchQueryFlow = obj;
                return musicPresenter$models$1$117;
            case 28:
                MusicPresenter$models$1$1 musicPresenter$models$1$118 = new MusicPresenter$models$1$1((Flow) this.this$0, continuation, (MoleculePresenter) obj2, (MutableState) this.$tracks$delegate, 28);
                musicPresenter$models$1$118.$searchQueryFlow = obj;
                return musicPresenter$models$1$118;
            default:
                return new MusicPresenter$models$1$1((MutableState) this.$tracks$delegate, (LocalHomePresenter) this.$searchQueryFlow, (AllocationDestination) this.this$0, (PaychecksUiConfiguration) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((MusicPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0631, code lost:
    
        if (r1 == r0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x07e3, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r3)._channel.send(r7, r20) == r5) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0846, code lost:
    
        if (r0 == r5) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0828, code lost:
    
        if (r4 == r5) goto L375;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0673  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:349:0x07e3 -> B:336:0x079e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        Object obj2;
        Object first;
        Exception e;
        Object presignedUrl;
        MoneybotChatOpen.EntryPointSurface entryPointSurface;
        MoneybotChatOpen.EntryPointSurface entryPointSurface2;
        HomeItemType homeItemType;
        com.squareup.cash.moneybot.screens.HomeItemType homeItemType2;
        HomeItemType homeItemType3;
        Object obj3;
        Object sendMessages;
        Object access$executeServerToolCall;
        Object m4184withTimeoutKLykuaI;
        byte[] bArr;
        boolean z;
        String str;
        Object access$launchEditAllocation;
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 24;
        int i4 = 26;
        int i5 = 0;
        Object obj4 = this.$state$delegate;
        int i6 = 1;
        Continuation continuation = null;
        continuation = null;
        continuation = null;
        switch (i) {
            case 0:
                MutableStateFlow mutableStateFlow = (MutableStateFlow) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow debounce = FlowKt.debounce(mutableStateFlow, 250L);
                    MusicPresenter musicPresenter = (MusicPresenter) this.this$0;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(i5, mutableStateFlow, (MutableState) this.$tracks$delegate, (MutableState) obj4);
                    this.label = 1;
                    Object collect = debounce.collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(18, anonymousClass2, musicPresenter), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState2 = (MutableState) obj4;
                    StocksTransferEtaSheetPresenter stocksTransferEtaSheetPresenter = (StocksTransferEtaSheetPresenter) this.$searchQueryFlow;
                    InvestingState investingState = (InvestingState) this.this$0;
                    this.$tracks$delegate = mutableState2;
                    this.label = 1;
                    if (investingState instanceof InvestingState.Content) {
                        InvestingState.Content.BrokerageAccountState brokerageAccountState = ((InvestingState.Content) investingState).brokerageAccountState;
                        if (!(brokerageAccountState instanceof InvestingState.Content.BrokerageAccountState.Active) && !(brokerageAccountState instanceof InvestingState.Content.BrokerageAccountState.Inactive)) {
                            if (!(brokerageAccountState instanceof InvestingState.Content.BrokerageAccountState.TransferInProgress)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                continuation = JobKt.withContext(stocksTransferEtaSheetPresenter.ioDispatcher, new GenieViewKt$GenieView$1$1(stocksTransferEtaSheetPresenter, brokerageAccountState, continuation, 5), this);
                            }
                        }
                    } else if (!(investingState instanceof InvestingState.Loading)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                    if (continuation == coroutineSingletons2) {
                        break;
                    } else {
                        mutableState = mutableState2;
                        obj2 = continuation;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = (MutableState) this.$tracks$delegate;
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                }
                mutableState.setValue((String) obj2);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new GLSceneScope$$ExternalSyntheticLambda2(25, (CollapsingToolbarScaffoldState) this.$searchQueryFlow, (LazyListState) this.this$0, (MutableState) this.$tracks$delegate));
                    GlobalSearchViewKt$GlobalSearch$1$1$2 globalSearchViewKt$GlobalSearch$1$1$2 = new GlobalSearchViewKt$GlobalSearch$1$1$2((SearchBarKeyboardState) obj4, 1);
                    this.label = 1;
                    if (snapshotFlow.collect(globalSearchViewKt$GlobalSearch$1$1$2, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.this$0;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$1 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(coroutineScope, (WorkHomePresenter) obj4, (MutableState) this.$tracks$delegate, 7);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flow.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$1, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                RealAppletTileServerRecommendationProvider realAppletTileServerRecommendationProvider = ((AppletTileSectionProvider) this.$tracks$delegate).serverRecommendationProvider;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            produceStateScope = (ProduceStateScope) this.$searchQueryFlow;
                            SafeTrace.throwOnFailure(obj);
                            first = obj;
                            produceStateScope.setValue(first);
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    this.this$0 = produceStateScope;
                    this.label = 1;
                    Object withContext = JobKt.withContext(realAppletTileServerRecommendationProvider.ioDispatcher, new RealKeyStoreProvider$load$2(realAppletTileServerRecommendationProvider, continuation, i4), this);
                    if (withContext != coroutineSingletons5) {
                        withContext = Unit.INSTANCE;
                        break;
                    }
                }
                if (((Map) obj4) == null) {
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1((StateFlow) realAppletTileServerRecommendationProvider.cachedUninstalledSectionSortValues$delegate.getValue(), i3);
                    this.this$0 = null;
                    this.$searchQueryFlow = produceStateScope;
                    this.label = 2;
                    first = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
                    break;
                }
                break;
            case 5:
                ProducerScope producerScope = (ProducerScope) this.this$0;
                Map map = (Map) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (map == null) {
                        break;
                    }
                } else if (i12 == 1) {
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        ApiResult.Failure.NetworkFailure networkFailure = new ApiResult.Failure.NetworkFailure(e);
                        this.$searchQueryFlow = map;
                        this.label = 2;
                        break;
                    }
                } else if (i12 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                Map map2 = map;
                while (JobKt.isActive(((AbstractCoroutine) producerScope).context)) {
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        map = map2;
                        ApiResult.Failure.NetworkFailure networkFailure2 = new ApiResult.Failure.NetworkFailure(e);
                        this.$searchQueryFlow = map;
                        this.label = 2;
                    }
                    ChannelFlowBuilder channelFlow = FlowKt.channelFlow(new MusicPresenter$models$1$1((UnleashContext) this.$tracks$delegate, map2, (String) obj4, (Continuation) null, 6));
                    RealActivitiesManager$activities$2$1$2 realActivitiesManager$activities$2$1$2 = new RealActivitiesManager$activities$2$1$2(producerScope, i2);
                    this.$searchQueryFlow = map2;
                    this.label = 1;
                    if (channelFlow.collect(realActivitiesManager$activities$2$1$2, this) == coroutineSingletons6) {
                        break;
                    }
                }
                break;
            case 6:
                ProducerScope producerScope2 = (ProducerScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UnleashContext unleashContext = (UnleashContext) this.this$0;
                    CoroutineContext coroutineContext = (CoroutineContext) unleashContext.sessionId;
                    MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(unleashContext, (Map) this.$tracks$delegate, (String) obj4, producerScope2, (Continuation) null, 17);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (JobKt.withContext(coroutineContext, moleculeKt$immediateClockFlow$1$1$1, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = (String) this.this$0;
                    if (str2 == null) {
                        break;
                    } else {
                        ChatManager chatManager = ((MoneybotChatContentFactory) this.$tracks$delegate).chatManager;
                        this.$searchQueryFlow = produceStateScope2;
                        this.label = 1;
                        presignedUrl = ((RealChatManager) chatManager).getPresignedUrl((String) obj4, str2, this);
                        if (presignedUrl == coroutineSingletons8) {
                            break;
                        }
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    presignedUrl = obj;
                }
                ApiResult apiResult = (ApiResult) presignedUrl;
                if (apiResult instanceof ApiResult.Success) {
                    produceStateScope2.setValue(((ApiResult.Success) apiResult).response);
                } else {
                    produceStateScope2.setValue(null);
                }
                break;
            case 8:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.this$0;
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(23, coroutineScope2, (LocalEditorialPresenter) this.$tracks$delegate, (ParcelableSnapshotMutableIntState) obj4);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flow2.collect(anonymousClass22, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) this.$searchQueryFlow;
                    RealMoneybotAnalyticsService realMoneybotAnalyticsService = moneybotChatPresenter.analyticsService;
                    AppForegroundState appForegroundState = (AppForegroundState) this.this$0;
                    ChatContentState chatContentState = (ChatContentState) ((MutableState) this.$tracks$delegate).getValue();
                    String sessionId = ((MoneybotChatPresenter.ChatSessionState) ((MutableState) obj4).getValue()).session.getSessionId();
                    this.label = 1;
                    MoneybotChatScreen moneybotChatScreen = moneybotChatPresenter.args;
                    int ordinal = appForegroundState.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            realMoneybotAnalyticsService.analytics.track(new MoneybotChatClose(realMoneybotAnalyticsService.chatId, chatContentState, sessionId), null);
                            if (sessionId != null) {
                                obj3 = moneybotChatPresenter.chatMessagesCache.setRecentSession(new RecentMoneybotSession(sessionId, new Long(moneybotChatPresenter.clock.millis())), this);
                                break;
                            }
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    } else {
                        MoneybotChatEntryPoint moneybotChatEntryPoint = moneybotChatScreen.entryPoint;
                        HomeSourceContext homeSourceContext = moneybotChatScreen.homeSourceContext;
                        switch (moneybotChatEntryPoint == null ? -1 : MoneybotChatPresenter.WhenMappings.$EnumSwitchMapping$5[moneybotChatEntryPoint.ordinal()]) {
                            case -1:
                                entryPointSurface = null;
                                String str3 = homeSourceContext != null ? homeSourceContext.sessionId : null;
                                if (homeSourceContext != null || (homeItemType2 = homeSourceContext.itemType) == null) {
                                    homeItemType = null;
                                } else {
                                    int ordinal2 = homeItemType2.ordinal();
                                    if (ordinal2 == 0) {
                                        homeItemType3 = HomeItemType.NEXT_BEST_ACTION;
                                    } else if (ordinal2 != 1) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        homeItemType3 = HomeItemType.WIDGET;
                                    }
                                    homeItemType = homeItemType3;
                                }
                                realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, sessionId, entryPointSurface, str3, homeItemType, homeSourceContext != null ? homeSourceContext.itemId : null), null);
                                break;
                            case 0:
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            case 1:
                                entryPointSurface2 = MoneybotChatOpen.EntryPointSurface.HISTORY;
                                entryPointSurface = entryPointSurface2;
                                if (homeSourceContext != null) {
                                }
                                if (homeSourceContext != null) {
                                    break;
                                }
                                homeItemType = null;
                                realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, sessionId, entryPointSurface, str3, homeItemType, homeSourceContext != null ? homeSourceContext.itemId : null), null);
                                break;
                            case 2:
                                entryPointSurface2 = MoneybotChatOpen.EntryPointSurface.MONEY;
                                entryPointSurface = entryPointSurface2;
                                if (homeSourceContext != null) {
                                }
                                if (homeSourceContext != null) {
                                }
                                homeItemType = null;
                                realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, sessionId, entryPointSurface, str3, homeItemType, homeSourceContext != null ? homeSourceContext.itemId : null), null);
                                break;
                            case 3:
                                entryPointSurface2 = MoneybotChatOpen.EntryPointSurface.NULL_STATE;
                                entryPointSurface = entryPointSurface2;
                                if (homeSourceContext != null) {
                                }
                                if (homeSourceContext != null) {
                                }
                                homeItemType = null;
                                realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, sessionId, entryPointSurface, str3, homeItemType, homeSourceContext != null ? homeSourceContext.itemId : null), null);
                                break;
                            case 4:
                                entryPointSurface2 = MoneybotChatOpen.EntryPointSurface.NEW_CHAT;
                                entryPointSurface = entryPointSurface2;
                                if (homeSourceContext != null) {
                                }
                                if (homeSourceContext != null) {
                                }
                                homeItemType = null;
                                realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, sessionId, entryPointSurface, str3, homeItemType, homeSourceContext != null ? homeSourceContext.itemId : null), null);
                                break;
                            case 5:
                                entryPointSurface2 = MoneybotChatOpen.EntryPointSurface.MONEYBOT_HOME;
                                entryPointSurface = entryPointSurface2;
                                if (homeSourceContext != null) {
                                }
                                if (homeSourceContext != null) {
                                }
                                homeItemType = null;
                                realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, sessionId, entryPointSurface, str3, homeItemType, homeSourceContext != null ? homeSourceContext.itemId : null), null);
                                break;
                            case 6:
                                entryPointSurface2 = MoneybotChatOpen.EntryPointSurface.PUSH_NOTIFICATION;
                                entryPointSurface = entryPointSurface2;
                                if (homeSourceContext != null) {
                                }
                                if (homeSourceContext != null) {
                                }
                                homeItemType = null;
                                realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, sessionId, entryPointSurface, str3, homeItemType, homeSourceContext != null ? homeSourceContext.itemId : null), null);
                                break;
                            case 7:
                                entryPointSurface2 = MoneybotChatOpen.EntryPointSurface.IN_APP_MESSAGE;
                                entryPointSurface = entryPointSurface2;
                                if (homeSourceContext != null) {
                                }
                                if (homeSourceContext != null) {
                                }
                                homeItemType = null;
                                realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, sessionId, entryPointSurface, str3, homeItemType, homeSourceContext != null ? homeSourceContext.itemId : null), null);
                                break;
                            case 8:
                                entryPointSurface2 = MoneybotChatOpen.EntryPointSurface.DEEP_LINK;
                                entryPointSurface = entryPointSurface2;
                                if (homeSourceContext != null) {
                                }
                                if (homeSourceContext != null) {
                                }
                                homeItemType = null;
                                realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, sessionId, entryPointSurface, str3, homeItemType, homeSourceContext != null ? homeSourceContext.itemId : null), null);
                                break;
                        }
                    }
                    obj3 = Unit.INSTANCE;
                    if (obj3 == coroutineSingletons10) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MoneybotChatPresenter moneybotChatPresenter2 = (MoneybotChatPresenter) this.$searchQueryFlow;
                    RealChatSessionManager realChatSessionManager = (RealChatSessionManager) ((MutableState) this.$tracks$delegate).getValue();
                    MoneybotChatPresenter.PluginMessage pluginMessage = (MoneybotChatPresenter.PluginMessage) this.this$0;
                    String str4 = pluginMessage.message;
                    boolean z2 = pluginMessage.hidden;
                    MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata = new MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata((String) ((MutableState) obj4).getValue());
                    this.label = 1;
                    if (MoneybotChatPresenter.sendMessage$default(moneybotChatPresenter2, realChatSessionManager, str4, z2, null, moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata, this, 4) == coroutineSingletons11) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (MoneybotChatPresenter.sendMessage$default((MoneybotChatPresenter) this.$searchQueryFlow, (RealChatSessionManager) this.this$0, ((MoneybotChatViewEvent.SubmitMessagePrompt) ((MoneybotChatViewEvent) this.$tracks$delegate)).prompt, false, (List) obj4, null, this, 10) == coroutineSingletons12) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion = (MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion) this.$tracks$delegate;
                MoneybotChatPresenter moneybotChatPresenter3 = (MoneybotChatPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion.params.initialMessages;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list) {
                        if (!((Message.TextMessage) obj5).hiddenByServer) {
                            arrayList.add(obj5);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new MoneybotChatPresenter.PendingMessage.Resolved(new MessageViewModel.UserMessageViewModel(((Message.TextMessage) it.next()).text, false, 4)));
                    }
                    moneybotChatPresenter3.setPendingMessages(arrayList2);
                    List list2 = moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion.params.initialMessages;
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    sendMessages = moneybotChatPresenter3.sendMessages((RealChatSessionManager) obj4, list2, this);
                    if (sendMessages == coroutineSingletons13) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    sendMessages = obj;
                }
                if (((Boolean) sendMessages).booleanValue()) {
                    moneybotChatPresenter3.pendingStartChatMetadata$delegate.setValue(null);
                }
                break;
            case 13:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.this$0;
                    AnonymousClass2 anonymousClass23 = new AnonymousClass2(coroutineScope3, (MoneybotHomePresenter) obj4, (MutableState) this.$tracks$delegate, i3);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flow3.collect(anonymousClass23, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.this$0;
                    AnonymousClass2 anonymousClass24 = new AnonymousClass2(i4, coroutineScope4, (CardLockPresenter) this.$tracks$delegate, (ParcelableSnapshotMutableIntState) obj4);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flow4.collect(anonymousClass24, this) == coroutineSingletons15) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.this$0;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$12 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(coroutineScope5, (WorkHomePresenter) obj4, (MutableState) this.$tracks$delegate, 16);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flow5.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$12, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                TemplateCardViewEvent templateCardViewEvent = (TemplateCardViewEvent) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    access$executeServerToolCall = TemplateCardPresenter.access$executeServerToolCall((TemplateCardPresenter) this.$searchQueryFlow, (TemplateCardViewEvent.ExecuteServerToolCall) templateCardViewEvent, this);
                    if (access$executeServerToolCall == coroutineSingletons17) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    access$executeServerToolCall = obj;
                }
                if (!((Boolean) access$executeServerToolCall).booleanValue()) {
                    ((MutableState) this.$tracks$delegate).setValue(null);
                    ((MutableState) obj4).setValue((TemplateCardViewEvent.ExecuteServerToolCall) templateCardViewEvent);
                }
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24((LazyListState) this.$searchQueryFlow, 11)));
                    AnonymousClass2 anonymousClass25 = new AnonymousClass2(27, (MoneybotChatHistoryViewModel.Content) this.this$0, (MutableState) this.$tracks$delegate, (MutableState) obj4);
                    this.label = 1;
                    if (distinctUntilChanged.collect(anonymousClass25, this) == coroutineSingletons18) {
                        break;
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MRIContext mRIContext = (MRIContext) this.this$0;
                    mRIContext.getClass();
                    byte[] encode = MRIContext.ADAPTER.encode(mRIContext);
                    RealMRIFactory realMRIFactory = (RealMRIFactory) this.$tracks$delegate;
                    AttestedKeyService attestedKeyService = (AttestedKeyService) obj4;
                    if (attestedKeyService == null) {
                        attestedKeyService = realMRIFactory.defaultAttestedKeyService;
                    }
                    this.$searchQueryFlow = encode;
                    this.label = 1;
                    Duration.Companion companion = Duration.Companion;
                    m4184withTimeoutKLykuaI = JobKt.m4184withTimeoutKLykuaI(DurationKt.toDuration(((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) realMRIFactory.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$MriSigningTimeout.INSTANCE)).value, DurationUnit.SECONDS), new RealMRIFactory$sign$2(attestedKeyService, realMRIFactory, encode, null, 0), this);
                    if (m4184withTimeoutKLykuaI == coroutineSingletons19) {
                        break;
                    } else {
                        bArr = encode;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    bArr = (byte[]) this.$searchQueryFlow;
                    SafeTrace.throwOnFailure(obj);
                    m4184withTimeoutKLykuaI = obj;
                }
                Integer num = new Integer(1);
                ByteString.Companion companion2 = ByteString.Companion;
                break;
            case 19:
                MusicViewEvent musicViewEvent = (MusicViewEvent) this.$searchQueryFlow;
                RealMusicPlayer realMusicPlayer = (RealMusicPlayer) ((MusicPresenter) this.this$0).musicPlayer;
                MutableState mutableState3 = (MutableState) this.$tracks$delegate;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    realMusicPlayer.stop();
                    List<Track> list3 = (List) mutableState3.getValue();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (Track track : list3) {
                        boolean areEqual = Intrinsics.areEqual(track.musicId, ((MusicViewEvent.TrackTapped) musicViewEvent).musicId);
                        String str5 = track.title;
                        String str6 = track.artist;
                        Image image = track.image;
                        String str7 = track.musicId;
                        str7.getClass();
                        arrayList3.add(new Track(str5, str6, image, areEqual, str7));
                    }
                    mutableState3.setValue(arrayList3);
                    MutableState mutableState4 = (MutableState) obj4;
                    MusicViewModel musicViewModel = (MusicViewModel) mutableState4.getValue();
                    musicViewModel.getClass();
                    MusicViewModel.Loaded loaded = (MusicViewModel.Loaded) musicViewModel;
                    List list4 = (List) mutableState3.getValue();
                    List list5 = (List) mutableState3.getValue();
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((Track) it2.next()).isSelected) {
                                z = true;
                                mutableState4.setValue(MusicViewModel.Loaded.copy$default(loaded, list4, z, RecyclerView.DECELERATION_RATE, null, 12));
                                str = ((MusicViewEvent.TrackTapped) musicViewEvent).musicId;
                                this.label = 1;
                                if (realMusicPlayer.play(str, this) == coroutineSingletons20) {
                                    break;
                                }
                            }
                        }
                    }
                    z = false;
                    mutableState4.setValue(MusicViewModel.Loaded.copy$default(loaded, list4, z, RecyclerView.DECELERATION_RATE, null, 12));
                    str = ((MusicViewEvent.TrackTapped) musicViewEvent).musicId;
                    this.label = 1;
                    if (realMusicPlayer.play(str, this) == coroutineSingletons20) {
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                FlowCollector flowCollector = (FlowCollector) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InviteContactsPresenter$special$$inlined$map$1 inviteContactsPresenter$special$$inlined$map$1 = (InviteContactsPresenter$special$$inlined$map$1) this.this$0;
                    AnonymousClass2 anonymousClass26 = new AnonymousClass2(29, flowCollector, (RealOffersSheetRepository) this.$tracks$delegate, (Function1) obj4);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (inviteContactsPresenter$special$$inlined$map$1.collect(anonymousClass26, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                FlowCollector flowCollector2 = (FlowCollector) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = (FlowQuery$mapToList$$inlined$map$1) this.this$0;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1(flowCollector2, (RealOffersTabRepository) this.$tracks$delegate, (Overlay$$ExternalSyntheticLambda0) obj4, ref$BooleanRef, 23);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flowQuery$mapToList$$inlined$map$1.collect(nearbyPayRequestPresenter$models$10$1$1$1, this) == coroutineSingletons22) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                FlowCollector flowCollector3 = (FlowCollector) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InviteContactsPresenter$special$$inlined$map$1 inviteContactsPresenter$special$$inlined$map$12 = (InviteContactsPresenter$special$$inlined$map$1) this.this$0;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$2 = new AndroidPermissionChecker$granted$$inlined$map$2$2(i6, flowCollector3, (RealOffersTabRepository) this.$tracks$delegate, (Overlay$$ExternalSyntheticLambda0) obj4);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (inviteContactsPresenter$special$$inlined$map$12.collect(androidPermissionChecker$granted$$inlined$map$2$2, this) == coroutineSingletons23) {
                        break;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Long l = ((OfferCountdownTemplateViewModel) this.$searchQueryFlow).countdownMillis;
                    if (l != null) {
                        long longValue = l.longValue();
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$2 = new RepeatOnIntervalTaskRunner$repeatOn$2(14, longValue, (AndroidClock) this.this$0, (DetailCaptionFormatStringResources) obj4, (MutableState) this.$tracks$delegate, (Continuation) null);
                        this.label = 1;
                        if (JobKt.withContext(defaultIoScheduler, repeatOnIntervalTaskRunner$repeatOn$2, this) == coroutineSingletons24) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 24:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.this$0;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$13 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(coroutineScope6, (TaxReturnsPresenter) obj4, (MutableState) this.$tracks$delegate);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flow6.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$13, this) == coroutineSingletons25) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.this$0;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$22 = new AndroidPermissionChecker$granted$$inlined$map$2$2(3, coroutineScope7, (LocalCashBalancePresenter) this.$tracks$delegate, (State) obj4);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flow7.collect(androidPermissionChecker$granted$$inlined$map$2$22, this) == coroutineSingletons26) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str8 = (String) this.this$0;
                    ValidatedAliasPicker validatedAliasPicker = (ValidatedAliasPicker) this.$tracks$delegate;
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (CardLockPresenter.access$registerOnNext((CardLockPresenter) obj4, str8, validatedAliasPicker, this) == coroutineSingletons27) {
                        break;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.this$0;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$23 = new AndroidPermissionChecker$granted$$inlined$map$2$2(6, coroutineScope8, (PdfPreviewPresenter) obj4, (MutableState) this.$tracks$delegate);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flow8.collect(androidPermissionChecker$granted$$inlined$map$2$23, this) == coroutineSingletons28) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 28:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$searchQueryFlow;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.this$0;
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$14 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(coroutineScope9, (PoolsListPresenter) obj4, (MutableState) this.$tracks$delegate, 22);
                    this.$searchQueryFlow = null;
                    this.label = 1;
                    if (flow9.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$14, this) == coroutineSingletons29) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                MutableState mutableState5 = (MutableState) this.$tracks$delegate;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState5.setValue(Boolean.TRUE);
                    this.label = 1;
                    access$launchEditAllocation = LocalHomePresenter.access$launchEditAllocation((LocalHomePresenter) this.$searchQueryFlow, (AllocationDestination) this.this$0, (PaychecksUiConfiguration) obj4, this);
                    if (access$launchEditAllocation == coroutineSingletons30) {
                        break;
                    }
                } else if (i36 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    access$launchEditAllocation = obj;
                }
                Boolean bool = (Boolean) access$launchEditAllocation;
                bool.booleanValue();
                mutableState5.setValue(bool);
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.music.presenters.MusicPresenter$models$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object $searchQueryFlow;
        public final /* synthetic */ Object $state$delegate;
        public final /* synthetic */ Object $tracks$delegate;

        public /* synthetic */ AnonymousClass2(int i, Object obj, Object obj2, Object obj3) {
            this.$r8$classId = i;
            this.$searchQueryFlow = obj;
            this.$tracks$delegate = obj2;
            this.$state$delegate = obj3;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        private final java.lang.Object emit$com$squareup$cash$moneybot$backend$real$managers$RealChatManager$getTokenizedChat$$inlined$map$1$2(java.lang.Object r29, kotlin.coroutines.Continuation r30) {
            /*
                Method dump skipped, instructions count: 724
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.music.presenters.MusicPresenter$models$1$1.AnonymousClass2.emit$com$squareup$cash$moneybot$backend$real$managers$RealChatManager$getTokenizedChat$$inlined$map$1$2(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private final Object emit$com$squareup$cash$moneybot$presenters$MoneybotChatHistoryPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            CoroutineScope coroutineScope = (CoroutineScope) this.$searchQueryFlow;
            MoneybotChatHistoryViewEvent moneybotChatHistoryViewEvent = (MoneybotChatHistoryViewEvent) obj;
            LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$tracks$delegate;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) localEditorialPresenter.screen;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.$state$delegate;
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
            if (Intrinsics.areEqual(moneybotChatHistoryViewEvent, MoneybotChatHistoryViewEvent.Exit.INSTANCE)) {
                screenNavigator.goTo(Back.INSTANCE);
            } else {
                Continuation continuation2 = null;
                if (moneybotChatHistoryViewEvent instanceof MoneybotChatHistoryViewEvent.OpenChat) {
                    screenNavigator.goTo(new MoneybotChatScreen(new ChatKickoffParams(((MoneybotChatHistoryViewEvent.OpenChat) moneybotChatHistoryViewEvent).sessionId, null, 11), MoneybotChatEntryPoint.HISTORY, (HomeSourceContext) null, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 60));
                } else if (Intrinsics.areEqual(moneybotChatHistoryViewEvent, MoneybotChatHistoryViewEvent.LoadNextPage.INSTANCE)) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = (ParcelableSnapshotMutableState) localEditorialPresenter.stringManager;
                    if (!((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue() && ((RealUserSessionPager) localEditorialPresenter.service).hasMoreSessions) {
                        parcelableSnapshotMutableState2.setValue(Boolean.TRUE);
                        JobKt.launch$default(coroutineScope, null, null, new RealKeyStoreProvider$load$2(localEditorialPresenter, continuation2, 29), 3);
                    }
                } else if (Intrinsics.areEqual(moneybotChatHistoryViewEvent, MoneybotChatHistoryViewEvent.TryLoadingHistoryListAgain.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                } else if (Intrinsics.areEqual(moneybotChatHistoryViewEvent, MoneybotChatHistoryViewEvent.NewChatClicked.INSTANCE)) {
                    screenNavigator.goTo(new MoneybotChatScreen((ChatKickoffParams) null, MoneybotChatEntryPoint.NULL_STATE, (HomeSourceContext) null, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 61));
                } else if (moneybotChatHistoryViewEvent instanceof MoneybotChatHistoryViewEvent.SwipedToDelete) {
                    parcelableSnapshotMutableState.setValue(((MoneybotChatHistoryViewEvent.SwipedToDelete) moneybotChatHistoryViewEvent).sessionId);
                } else if (moneybotChatHistoryViewEvent instanceof MoneybotChatHistoryViewEvent.ConfirmDelete) {
                    parcelableSnapshotMutableState.setValue(null);
                    JobKt.launch$default(coroutineScope, null, null, new MusicPresenter$models$2$1(localEditorialPresenter, ((MoneybotChatHistoryViewEvent.ConfirmDelete) moneybotChatHistoryViewEvent).sessionId, continuation2, 15), 3);
                } else {
                    if (!Intrinsics.areEqual(moneybotChatHistoryViewEvent, MoneybotChatHistoryViewEvent.CancelDelete.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    parcelableSnapshotMutableState.setValue(null);
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$moneybot$presenters$MoneybotHomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            CoroutineScope coroutineScope = (CoroutineScope) this.$searchQueryFlow;
            MoneybotHomeViewEvent moneybotHomeViewEvent = (MoneybotHomeViewEvent) obj;
            MoneybotHomePresenter moneybotHomePresenter = (MoneybotHomePresenter) this.$state$delegate;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) moneybotHomePresenter.loadableNbas$delegate;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = (ParcelableSnapshotMutableState) moneybotHomePresenter.currentNbaIndex$delegate;
            RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) moneybotHomePresenter.analyticsService;
            String str = (String) ((MutableState) this.$tracks$delegate).getValue();
            if (str == null) {
                str = "";
            }
            String str2 = str;
            RealRouter realRouter = (RealRouter) moneybotHomePresenter.router;
            Analytics analytics = realMoneybotAnalyticsService.analytics;
            BetterNavigator.ScreenNavigator screenNavigator = moneybotHomePresenter.navigator;
            if (Intrinsics.areEqual(moneybotHomeViewEvent, MoneybotHomeViewEvent.ChatInputTapped.INSTANCE)) {
                screenNavigator.goTo(new MoneybotChatScreen((ChatKickoffParams) null, MoneybotChatEntryPoint.MONEYBOT_HOME, new HomeSourceContext(str2, 6), (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 41));
            } else {
                Continuation continuation2 = null;
                if (moneybotHomeViewEvent instanceof MoneybotHomeViewEvent.NbaViewed) {
                    MoneybotHomeViewEvent.NbaViewed nbaViewed = (MoneybotHomeViewEvent.NbaViewed) moneybotHomeViewEvent;
                    analytics.track(new MoneybotHomeBrowseViewItem(str2, com.squareup.cash.cdf.moneybothome.HomeItemType.NEXT_BEST_ACTION, nbaViewed.nextBestActionId, nbaViewed.category), null);
                } else if (moneybotHomeViewEvent instanceof MoneybotHomeViewEvent.LaunchNextBestAction) {
                    com.squareup.cash.cdf.moneybothome.HomeItemType homeItemType = com.squareup.cash.cdf.moneybothome.HomeItemType.NEXT_BEST_ACTION;
                    MoneybotHomeViewEvent.LaunchNextBestAction launchNextBestAction = (MoneybotHomeViewEvent.LaunchNextBestAction) moneybotHomeViewEvent;
                    String str3 = launchNextBestAction.nextBestActionId;
                    realMoneybotAnalyticsService.submitHomeBrowseSelectItem(str2, homeItemType, str3, launchNextBestAction.category, TapElement.PRIMARY_CTA);
                    JobKt.launch$default(coroutineScope, null, null, new MoneybotHomePresenter$processEvent$1(moneybotHomePresenter, moneybotHomeViewEvent, str2, continuation2, 0), 3);
                    realRouter.route(new RoutingParams(null, null, null, null, null, new FeatureContext.MoneybotHomeContext(str2, "NEXT_BEST_ACTION", str3), 255), launchNextBestAction.clientRoute);
                } else if (moneybotHomeViewEvent instanceof MoneybotHomeViewEvent.SkipNextBestAction) {
                    MoneybotHomeViewEvent.SkipNextBestAction skipNextBestAction = (MoneybotHomeViewEvent.SkipNextBestAction) moneybotHomeViewEvent;
                    realMoneybotAnalyticsService.submitHomeBrowseSelectItem(str2, com.squareup.cash.cdf.moneybothome.HomeItemType.NEXT_BEST_ACTION, skipNextBestAction.nextBestActionId, skipNextBestAction.category, TapElement.SECONDARY_CTA);
                    List list = (List) ((Loadable) parcelableSnapshotMutableState.getValue()).invoke();
                    if (list != null && !list.isEmpty()) {
                        parcelableSnapshotMutableState2.setValue(Integer.valueOf((((Number) parcelableSnapshotMutableState2.getValue()).intValue() + 1) % list.size()));
                    }
                } else if (moneybotHomeViewEvent instanceof MoneybotHomeViewEvent.WidgetViewed) {
                    com.squareup.cash.cdf.moneybothome.HomeItemType homeItemType2 = com.squareup.cash.cdf.moneybothome.HomeItemType.WIDGET;
                    String str4 = ((MoneybotHomeViewEvent.WidgetViewed) moneybotHomeViewEvent).widgetId;
                    str4.getClass();
                    analytics.track(new MoneybotHomeBrowseViewItem(str2, homeItemType2, str4, null), null);
                } else if (moneybotHomeViewEvent instanceof MoneybotHomeViewEvent.WidgetTapped) {
                    com.squareup.cash.cdf.moneybothome.HomeItemType homeItemType3 = com.squareup.cash.cdf.moneybothome.HomeItemType.WIDGET;
                    MoneybotHomeViewEvent.WidgetTapped widgetTapped = (MoneybotHomeViewEvent.WidgetTapped) moneybotHomeViewEvent;
                    String str5 = widgetTapped.widgetId;
                    realMoneybotAnalyticsService.submitHomeBrowseSelectItem(str2, homeItemType3, str5, null, TapElement.WIDGET);
                    JobKt.launch$default(coroutineScope, null, null, new MoneybotHomePresenter$processEvent$1(moneybotHomePresenter, moneybotHomeViewEvent, str2, continuation2, 1), 3);
                    MoneybotHomeViewEvent.WidgetTapAction widgetTapAction = widgetTapped.action;
                    if (widgetTapAction instanceof MoneybotHomeViewEvent.WidgetTapAction.ClientRoute) {
                        realRouter.route(new RoutingParams(null, null, null, null, null, new FeatureContext.MoneybotHomeContext(str2, "WIDGET", str5), 255), ((MoneybotHomeViewEvent.WidgetTapAction.ClientRoute) widgetTapAction).clientRoute);
                    } else {
                        if (!(widgetTapAction instanceof MoneybotHomeViewEvent.WidgetTapAction.ChatKickoff)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator.goTo(new MoneybotChatScreen(((MoneybotHomeViewEvent.WidgetTapAction.ChatKickoff) widgetTapAction).chatKickoffParams, MoneybotChatEntryPoint.MONEYBOT_HOME, new HomeSourceContext(str2, com.squareup.cash.moneybot.screens.HomeItemType.WIDGET, str5), (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 56));
                    }
                } else if (moneybotHomeViewEvent instanceof MoneybotHomeViewEvent.DeleteWidget) {
                    JobKt.launch$default(coroutineScope, null, null, new MoneybotHomePresenter$processEvent$1(moneybotHomePresenter, moneybotHomeViewEvent, str2, continuation2, 2), 3);
                } else if (!(moneybotHomeViewEvent instanceof MoneybotHomeViewEvent.TabToolbarEvent)) {
                    if (!Intrinsics.areEqual(moneybotHomeViewEvent, MoneybotHomeViewEvent.ReloadHome.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    parcelableSnapshotMutableState.setValue(Loadable.Loading.INSTANCE);
                    parcelableSnapshotMutableState2.setValue(0);
                    ((ParcelableSnapshotMutableState) moneybotHomePresenter.widgets$delegate).setValue(EmptyList.INSTANCE);
                    JobKt.launch$default(coroutineScope, null, null, new CashMapPresenter$models$3$1(moneybotHomePresenter, str2, continuation2, 26), 3);
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$moneybot$presenters$MoneybotOverflowMenuPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            String str;
            CoroutineScope coroutineScope = (CoroutineScope) this.$searchQueryFlow;
            MoneybotOverflowMenuViewEvent moneybotOverflowMenuViewEvent = (MoneybotOverflowMenuViewEvent) obj;
            CardLockPresenter cardLockPresenter = (CardLockPresenter) this.$tracks$delegate;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) cardLockPresenter.deviceLockAnimationBus;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.$state$delegate;
            BetterNavigator.ScreenNavigator screenNavigator = cardLockPresenter.navigator;
            MoneybotOverflowMenuScreen moneybotOverflowMenuScreen = (MoneybotOverflowMenuScreen) cardLockPresenter.args;
            ChatSourceContext chatSourceContext = moneybotOverflowMenuScreen.chatSourceContext;
            Continuation continuation2 = null;
            if (moneybotOverflowMenuViewEvent instanceof MoneybotOverflowMenuViewEvent.Close) {
                screenNavigator.goTo((chatSourceContext == null || (str = chatSourceContext.loadableSessionId) == null) ? Back.INSTANCE : new MoneybotChatScreen(new ChatKickoffParams(str, null, 11), (MoneybotChatEntryPoint) null, moneybotOverflowMenuScreen.homeSourceContext, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 58));
            } else if (moneybotOverflowMenuViewEvent instanceof MoneybotOverflowMenuViewEvent.OpenTerms) {
                RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) cardLockPresenter.franklinAppService;
                MoneybotOverflowMenuSelectItem.OverflowMenuItemType overflowMenuItemType = MoneybotOverflowMenuSelectItem.OverflowMenuItemType.DISCLOSURE_INFO;
                MoneybotSurface moneybotSurface = chatSourceContext != null ? MoneybotSurface.CHAT : MoneybotSurface.HOME;
                String str2 = chatSourceContext != null ? chatSourceContext.loadableSessionId : null;
                HomeSourceContext homeSourceContext = moneybotOverflowMenuScreen.homeSourceContext;
                realMoneybotAnalyticsService.analytics.track(new MoneybotOverflowMenuSelectItem(moneybotSurface, realMoneybotAnalyticsService.chatId, str2, homeSourceContext != null ? homeSourceContext.sessionId : null), null);
                ((RealRouter) cardLockPresenter.flowStarter).route(new RoutingParams(null, null, null, null, null, null, 511), "https://cash.app/legal/us/en-us/moneybot-terms-disclosures");
            } else if (moneybotOverflowMenuViewEvent instanceof MoneybotOverflowMenuViewEvent.MenuItemClickEvent) {
                int ordinal = ((MoneybotOverflowMenuViewEvent.MenuItemClickEvent) moneybotOverflowMenuViewEvent).item.ordinal();
                if (ordinal == 0) {
                    screenNavigator.goTo(new MoneybotChatScreen((ChatKickoffParams) null, MoneybotChatEntryPoint.NEW_CHAT, moneybotOverflowMenuScreen.homeSourceContext, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 41));
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(MoneybotAutomationsScreen.INSTANCE);
                }
            } else if (moneybotOverflowMenuViewEvent instanceof MoneybotOverflowMenuViewEvent.OpenChat) {
                screenNavigator.goTo(new MoneybotChatScreen(new ChatKickoffParams(((MoneybotOverflowMenuViewEvent.OpenChat) moneybotOverflowMenuViewEvent).sessionId, null, 11), MoneybotChatEntryPoint.HISTORY, moneybotOverflowMenuScreen.homeSourceContext, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 56));
            } else if (moneybotOverflowMenuViewEvent instanceof MoneybotOverflowMenuViewEvent.SwipedToDelete) {
                parcelableSnapshotMutableState.setValue(((MoneybotOverflowMenuViewEvent.SwipedToDelete) moneybotOverflowMenuViewEvent).sessionId);
            } else if (moneybotOverflowMenuViewEvent instanceof MoneybotOverflowMenuViewEvent.ConfirmDelete) {
                parcelableSnapshotMutableState.setValue(null);
                JobKt.launch$default(coroutineScope, null, null, new CashMapPresenter$models$3$1(cardLockPresenter, ((MoneybotOverflowMenuViewEvent.ConfirmDelete) moneybotOverflowMenuViewEvent).sessionId, continuation2, 27), 3);
            } else if (Intrinsics.areEqual(moneybotOverflowMenuViewEvent, MoneybotOverflowMenuViewEvent.CancelDelete.INSTANCE)) {
                parcelableSnapshotMutableState.setValue(null);
            } else if (Intrinsics.areEqual(moneybotOverflowMenuViewEvent, MoneybotOverflowMenuViewEvent.RefreshChatHistory.INSTANCE)) {
                NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
            } else {
                if (!Intrinsics.areEqual(moneybotOverflowMenuViewEvent, MoneybotOverflowMenuViewEvent.ShowDebugSheet.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (((MoneybotFlagsHelper) cardLockPresenter.issuedCardManager).showDebugOptions()) {
                    screenNavigator.goTo(new MoneybotDebugOverlayScreen(chatSourceContext));
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$moneybot$views$history$MoneybotChatHistoryViewKt$ChatHistory$3$1$2(Object obj, Continuation continuation) {
            Pair pair = (Pair) obj;
            MutableState mutableState = (MutableState) this.$tracks$delegate;
            Integer num = (Integer) pair.first;
            int intValue = ((Number) pair.second).intValue();
            if (num == null || num.intValue() < intValue - 10 || !((MoneybotChatHistoryViewModel.Content) this.$searchQueryFlow).hasMoreSessions) {
                mutableState.setValue(Boolean.FALSE);
            } else if (!((Boolean) mutableState.getValue()).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
                ((Function0) ((MutableState) this.$state$delegate).getValue()).invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Object emit$com$squareup$cash$notifications$RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2(Object obj, Continuation continuation) {
            RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1 realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1;
            int i;
            NotificationChannelToggleState notificationChannelToggleState;
            if (continuation instanceof RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1) {
                realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1 = (RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1) continuation;
                int i2 = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        FlowCollector flowCollector = (FlowCollector) this.$searchQueryFlow;
                        AndroidNotificationManager androidNotificationManager = ((RealAndroidNotificationSettingsChecker) this.$tracks$delegate).notificationManager;
                        NotificationChannelId notificationChannelId = (NotificationChannelId) this.$state$delegate;
                        notificationChannelId.getClass();
                        zzo notificationChannel = androidNotificationManager.getNotificationChannel(notificationChannelId);
                        if (notificationChannel == null) {
                            notificationChannelToggleState = NotificationChannelToggleState.NotFound;
                        } else {
                            NotificationChannelGroupId notificationChannelGroupId = notificationChannelId.group;
                            notificationChannelGroupId.getClass();
                            NotificationChannelGroup notificationChannelGroup = androidNotificationManager.notificationManagerCompat.getNotificationChannelGroup(notificationChannelGroupId.id);
                            notificationChannelToggleState = (notificationChannelGroup == null || !notificationChannelGroup.isBlocked()) ? notificationChannel.zza == 0 ? NotificationChannelToggleState.DisabledByChannel : NotificationChannelToggleState.Enabled : NotificationChannelToggleState.DisabledByGroup;
                        }
                        realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(notificationChannelToggleState, realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1) == coroutineSingletons) {
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
            realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1 = new RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1(this, continuation);
            Object obj22 = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2$1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:349:0x072d, code lost:
        
            if (r1.emit(r0, r3) != r2) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:372:0x07c4, code lost:
        
            if (r1.emit(r0, r3) != r2) goto L353;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x050f  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x051b  */
        /* JADX WARN: Removed duplicated region for block: B:294:0x05e6  */
        /* JADX WARN: Removed duplicated region for block: B:300:0x05f0  */
        /* JADX WARN: Removed duplicated region for block: B:317:0x0666  */
        /* JADX WARN: Removed duplicated region for block: B:323:0x0670  */
        /* JADX WARN: Removed duplicated region for block: B:340:0x06ef  */
        /* JADX WARN: Removed duplicated region for block: B:352:0x0703  */
        /* JADX WARN: Removed duplicated region for block: B:363:0x0753  */
        /* JADX WARN: Removed duplicated region for block: B:375:0x0768  */
        /* JADX WARN: Removed duplicated region for block: B:391:0x07ea  */
        /* JADX WARN: Removed duplicated region for block: B:397:0x07f4  */
        /* JADX WARN: Removed duplicated region for block: B:449:0x0962  */
        /* JADX WARN: Removed duplicated region for block: B:455:0x096e  */
        /* JADX WARN: Removed duplicated region for block: B:497:0x0a3b  */
        /* JADX WARN: Removed duplicated region for block: B:503:0x0a45  */
        /* JADX WARN: Removed duplicated region for block: B:515:0x0aa6  */
        /* JADX WARN: Removed duplicated region for block: B:521:0x0ab0  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01b4  */
        /* JADX WARN: Type inference failed for: r13v0, types: [com.squareup.cash.moneybot.screens.ChatSourceContext, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r3v22, types: [app.cash.broadway.screen.Screen] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            RealInvestingActivitiesManager$activities$$inlined$map$1$2$1 realInvestingActivitiesManager$activities$$inlined$map$1$2$1;
            int i;
            ArrayList arrayList;
            PaymentActionHandler$reverseDeposit$$inlined$map$1$2$1 paymentActionHandler$reverseDeposit$$inlined$map$1$2$1;
            int i2;
            PaymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1 paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1;
            int i3;
            GetProfileDetailsContext getProfileDetailsContext;
            Screen profileFor;
            PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1 persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1;
            int i4;
            RealEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1 realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1;
            int i5;
            FlowCollector flowCollector;
            RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1 realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1;
            int i6;
            FlowCollector flowCollector2;
            RealInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1 realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1;
            int i7;
            Money money;
            RealInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1 realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1;
            int i8;
            RealDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1 realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1;
            int i9;
            Long l;
            RecurringSchedule.Frequency frequency;
            RecurringSchedule recurringSchedule;
            Screen equity;
            SyncRecurringPreference syncRecurringPreference;
            ScheduledTransactionPreference scheduledTransactionPreference;
            RecurringSchedule recurringSchedule2;
            StockToggleToggleFinancialWindow.FinancialWindowType financialWindowType;
            InvestingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1 investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1;
            int i10;
            StackedAvatarViewModel.Avatar avatar;
            Image image;
            MoneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1 moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1;
            int i11;
            int i12 = this.$r8$classId;
            int i13 = 25;
            int i14 = 10;
            boolean z = false;
            int i15 = 0;
            int i16 = 0;
            z = false;
            Back back = Back.INSTANCE;
            int i17 = 1;
            Object obj2 = this.$searchQueryFlow;
            Object obj3 = this.$state$delegate;
            Object obj4 = this.$tracks$delegate;
            InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel = null;
            switch (i12) {
                case 0:
                    List list = (List) obj;
                    MutableState mutableState = (MutableState) obj3;
                    MutableState mutableState2 = (MutableState) obj4;
                    if (list != null) {
                        mutableState2.setValue(list);
                        List list2 = (List) mutableState2.getValue();
                        List list3 = (List) mutableState2.getValue();
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Track) it.next()).isSelected) {
                                        z = true;
                                    }
                                }
                            }
                        }
                        mutableState.setValue(new MusicViewModel.Loaded(list2, z, RecyclerView.DECELERATION_RATE, (String) ((StateFlowImpl) ((MutableStateFlow) obj2)).getValue()));
                    } else {
                        mutableState.setValue(new MusicViewModel.Error());
                    }
                    return Unit.INSTANCE;
                case 1:
                    if (continuation instanceof RealInvestingActivitiesManager$activities$$inlined$map$1$2$1) {
                        realInvestingActivitiesManager$activities$$inlined$map$1$2$1 = (RealInvestingActivitiesManager$activities$$inlined$map$1$2$1) continuation;
                        int i18 = realInvestingActivitiesManager$activities$$inlined$map$1$2$1.label;
                        if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                            realInvestingActivitiesManager$activities$$inlined$map$1$2$1.label = i18 - PKIFailureInfo.systemUnavail;
                            Object obj5 = realInvestingActivitiesManager$activities$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = realInvestingActivitiesManager$activities$$inlined$map$1$2$1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                FlowCollector flowCollector3 = (FlowCollector) obj2;
                                Activities activities = (Activities) obj;
                                List list4 = activities.recentActivities;
                                if (list4 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj6 : list4) {
                                        LocalDateTime ofInstant = LocalDateTime.ofInstant(((ActivityItem) obj6).getDisplayInstant(), ZoneId.systemDefault());
                                        LocalDateTime ofInstant2 = LocalDateTime.ofInstant(DimensionKt.now(((RealInvestingActivitiesManager) obj4).clock), ZoneId.systemDefault());
                                        ChronoUnit chronoUnit = (ChronoUnit) obj3;
                                        if (chronoUnit == null || chronoUnit.between(ofInstant, ofInstant2) < 1) {
                                            arrayList.add(obj6);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                Activities copy$default = Activities.copy$default(activities, arrayList, null, 30);
                                realInvestingActivitiesManager$activities$$inlined$map$1$2$1.label = 1;
                                if (flowCollector3.emit(copy$default, realInvestingActivitiesManager$activities$$inlined$map$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj5);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realInvestingActivitiesManager$activities$$inlined$map$1$2$1 = new RealInvestingActivitiesManager$activities$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = realInvestingActivitiesManager$activities$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realInvestingActivitiesManager$activities$$inlined$map$1$2$1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    if (continuation instanceof PaymentActionHandler$reverseDeposit$$inlined$map$1$2$1) {
                        paymentActionHandler$reverseDeposit$$inlined$map$1$2$1 = (PaymentActionHandler$reverseDeposit$$inlined$map$1$2$1) continuation;
                        int i19 = paymentActionHandler$reverseDeposit$$inlined$map$1$2$1.label;
                        if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentActionHandler$reverseDeposit$$inlined$map$1$2$1.label = i19 - PKIFailureInfo.systemUnavail;
                            Object obj7 = paymentActionHandler$reverseDeposit$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = paymentActionHandler$reverseDeposit$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                Orientation orientation = Orientation.CASH;
                                AppCreationActivity appCreationActivity = AppCreationActivity.HOMESCREEN;
                                CryptoPaymentOrigin cryptoPaymentOrigin = CryptoPaymentOrigin.DEPOSIT_REVERSAL;
                                Money money2 = ((RenderedPayment) obj).amount;
                                RealUuidGenerator realUuidGenerator = ((PaymentActionHandler) obj4).uuidGenerator;
                                PaymentAction.ReverseDepositAction reverseDepositAction = (PaymentAction.ReverseDepositAction) obj3;
                                PaymentActionResult.GoToScreen goToScreen = new PaymentActionResult.GoToScreen(new PaymentScreens.MainPayment(money2, orientation, appCreationActivity, RealUuidGenerator.generate(), PaymentScreens.MainPayment.SendCryptoCurrencyType.BTC, cryptoPaymentOrigin, reverseDepositAction.paymentToken, reverseDepositAction.exitScreen, 69112));
                                paymentActionHandler$reverseDeposit$$inlined$map$1$2$1.label = 1;
                                if (((FlowCollector) obj2).emit(goToScreen, paymentActionHandler$reverseDeposit$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            } else {
                                if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj7);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentActionHandler$reverseDeposit$$inlined$map$1$2$1 = new PaymentActionHandler$reverseDeposit$$inlined$map$1$2$1(this, continuation);
                    Object obj72 = paymentActionHandler$reverseDeposit$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = paymentActionHandler$reverseDeposit$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    PaymentActionHandler paymentActionHandler = (PaymentActionHandler) obj4;
                    PaymentAction.ShowProfile showProfile = (PaymentAction.ShowProfile) obj3;
                    if (continuation instanceof PaymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1) {
                        paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1 = (PaymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1) continuation;
                        int i20 = paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1.label;
                        if ((i20 & PKIFailureInfo.systemUnavail) != 0) {
                            paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1.label = i20 - PKIFailureInfo.systemUnavail;
                            Object obj8 = paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                FlowCollector flowCollector4 = (FlowCollector) obj2;
                                ForToken forToken = (ForToken) obj;
                                if (forToken != null) {
                                    Role role = forToken.role;
                                    paymentActionHandler.getClass();
                                    int i21 = PaymentActionHandler.WhenMappings.$EnumSwitchMapping$1[forToken.orientation.ordinal()];
                                    if (i21 == 1) {
                                        getProfileDetailsContext = (role != null ? PaymentActionHandler.WhenMappings.$EnumSwitchMapping$0[role.ordinal()] : -1) == 2 ? GetProfileDetailsContext.ACTIVITY_PAYMENT_REQUEST_RECEIVER : GetProfileDetailsContext.ACTIVITY_PAYMENT_REQUEST_SENDER;
                                    } else {
                                        if (i21 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        getProfileDetailsContext = (role != null ? PaymentActionHandler.WhenMappings.$EnumSwitchMapping$0[role.ordinal()] : -1) == 2 ? GetProfileDetailsContext.ACTIVITY_PAYMENT_PUSH_SENDER : GetProfileDetailsContext.ACTIVITY_PAYMENT_PUSH_RECEIVER;
                                    }
                                } else {
                                    getProfileDetailsContext = GetProfileDetailsContext.UNKNOWN;
                                }
                                GetProfileDetailsContext getProfileDetailsContext2 = getProfileDetailsContext;
                                String str = showProfile.theirId;
                                r13 = (StringsKt__StringsJVMKt.startsWith(str, "M_", false) || StringsKt__StringsJVMKt.startsWith(str, "BRAND_", false)) ? new MerchantScreen$MerchantProfileScreen(new RedactedString(str), getProfileDetailsContext2, null, BackNavigationAction.CLOSE, null) : 0;
                                Screen screen = r13;
                                if (r13 == 0) {
                                    LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                                    String str2 = showProfile.threadedCustomerId;
                                    if (str2 == null) {
                                        str2 = showProfile.theirId;
                                    }
                                    ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = new ProfileScreens.ProfileScreen.Customer.CashCustomer(str2, showProfile.isBusiness);
                                    ProfileScreens.ProfileScreen.Action.ActionType actionType = ProfileScreens.ProfileScreen.Action.ActionType.PAY;
                                    CustomerProfileViewOpen.EntryPoint entryPoint = CustomerProfileViewOpen.EntryPoint.CELL_AVATAR;
                                    RealUuidGenerator realUuidGenerator2 = paymentActionHandler.uuidGenerator;
                                    profileFor = ProfileLauncher.profileFor((ProfileScreens.ProfileScreen.Customer) cashCustomer, ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST, ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE, RealUuidGenerator.generate(), getProfileDetailsContext2, entryPoint, (Screen) ActivityScreen.INSTANCE, false, (ProfileScreens.ProfileScreen.ProfileAnalytics) null, (String) null, !showProfile.isMerchant, (BlockersData.MoneybotContext) null);
                                    screen = profileFor;
                                }
                                PaymentActionResult.GoToScreen goToScreen2 = new PaymentActionResult.GoToScreen(screen);
                                paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector4.emit(goToScreen2, paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1) == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                            } else {
                                if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj8);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1 = new PaymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj82 = paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = paymentActionHandler$showProfile$$inlined$mapNotNull$1$2$1.label;
                    if (i3 != 0) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj3;
                    HistoryScreens.CancelPendingSupPaymentScreen cancelPendingSupPaymentScreen = (HistoryScreens.CancelPendingSupPaymentScreen) disclosurePresenter.args;
                    Analytics analytics = (Analytics) disclosurePresenter.analytics;
                    CoroutineScope coroutineScope = (CoroutineScope) obj2;
                    CancelPendingSupPaymentViewEvent cancelPendingSupPaymentViewEvent = (CancelPendingSupPaymentViewEvent) obj;
                    if (Intrinsics.areEqual(cancelPendingSupPaymentViewEvent, CancelPendingSupPaymentViewEvent.PrimaryButtonClicked.INSTANCE)) {
                        ((MutableState) obj4).setValue(Boolean.TRUE);
                        analytics.track(new SingleUsePaymentCancelTapConfirmButton(cancelPendingSupPaymentScreen.paymentToken), null);
                        JobKt.launch$default(coroutineScope, null, null, new RealKeyStoreProvider$load$2(disclosurePresenter, r13, 8), 3);
                    } else {
                        if (!Intrinsics.areEqual(cancelPendingSupPaymentViewEvent, CancelPendingSupPaymentViewEvent.SecondaryButtonClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        analytics.track(new SingleUsePaymentCancelDismissConfirmSheet(cancelPendingSupPaymentScreen.paymentToken), null);
                        ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(back);
                    }
                    return Unit.INSTANCE;
                case 5:
                    LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj3;
                    CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                    ReportAbuseEvent reportAbuseEvent = (ReportAbuseEvent) obj;
                    if (reportAbuseEvent instanceof ReportAbuseEvent.ActionClick) {
                        HistoryScreens.ReportAbuseDialogScreen reportAbuseDialogScreen = (HistoryScreens.ReportAbuseDialogScreen) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
                        String str3 = reportAbuseDialogScreen.url;
                        if (str3 == null) {
                            ((MutableState) obj4).setValue(Boolean.TRUE);
                            JobKt.launch$default(coroutineScope2, null, null, new RealKeyStoreProvider$load$2(localHomePresenter, r13, 9), 3);
                        } else {
                            ((RealRouter) localHomePresenter.embeddedMapEnabled$delegate).route(new RoutingParams(reportAbuseDialogScreen, null, reportAbuseDialogScreen.destinationScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str3);
                        }
                    } else {
                        if (!(reportAbuseEvent instanceof ReportAbuseEvent.CancelClick)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(back);
                    }
                    return Unit.INSTANCE;
                case 6:
                    LocalHomePresenter localHomePresenter2 = (LocalHomePresenter) obj3;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter2.navigator;
                    HistoryScreens.ReportAbuse reportAbuse = (HistoryScreens.ReportAbuse) localHomePresenter2.neighborhoodsTabContentEnabled$delegate;
                    CoroutineScope coroutineScope3 = (CoroutineScope) obj2;
                    ReportAbuseEvent reportAbuseEvent2 = (ReportAbuseEvent) obj;
                    if (reportAbuseEvent2 instanceof ReportAbuseEvent.ActionClick) {
                        String str4 = reportAbuse.url;
                        if (str4 == null) {
                            ((MutableState) obj4).setValue(Boolean.TRUE);
                            JobKt.launch$default(coroutineScope3, null, null, new RealKeyStoreProvider$load$2(localHomePresenter2, r13, i14), 3);
                        } else {
                            screenNavigator.goTo(back);
                            screenNavigator.goTo(back);
                            RealRouter realRouter = (RealRouter) localHomePresenter2.embeddedMapEnabled$delegate;
                            ?? r3 = reportAbuse.destinationScreen;
                            realRouter.route(new RoutingParams(reportAbuse, null, r3 == 0 ? back : r3, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str4);
                        }
                    } else {
                        if (!(reportAbuseEvent2 instanceof ReportAbuseEvent.CancelClick)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator.goTo(back);
                    }
                    return Unit.INSTANCE;
                case 7:
                    if (continuation instanceof PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1) {
                        persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1 = (PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1) continuation;
                        int i22 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1.label;
                        if ((i22 & PKIFailureInfo.systemUnavail) != 0) {
                            persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1.label = i22 - PKIFailureInfo.systemUnavail;
                            Object obj9 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) obj;
                                RewardSlotQueries queries = ((PersistentHistoricalDataCache) obj4).getQueries();
                                HistoricalRange historicalRange = (HistoricalRange) obj3;
                                BalanceHistory balanceHistory = getPortfoliosHistoricalDataResponse.balance_history;
                                balanceHistory.getClass();
                                queries.getClass();
                                historicalRange.getClass();
                                queries.driver.execute(-164032096, "INSERT OR REPLACE INTO investing_stocks_portfolio_graph_cache\nVALUES (?, ?)", new GpsConfigQueries$$ExternalSyntheticLambda3(i13, queries, historicalRange, balanceHistory));
                                queries.notifyQueries(-164032096, new InvestmentEntityQueries$$ExternalSyntheticLambda1(22));
                                persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1.label = 1;
                                if (((FlowCollector) obj2).emit(getPortfoliosHistoricalDataResponse, persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1) == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                            } else {
                                if (i4 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj9);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1 = new PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1(this, continuation);
                    Object obj92 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$2$2$1.label;
                    if (i4 != 0) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    if (continuation instanceof RealEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1) {
                        realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1 = (RealEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1) continuation;
                        int i23 = realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.label;
                        if ((i23 & PKIFailureInfo.systemUnavail) != 0) {
                            realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.label = i23 - PKIFailureInfo.systemUnavail;
                            Object obj10 = realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                FlowCollector flowCollector5 = (FlowCollector) obj2;
                                MarketPricesAppService marketPricesAppService = ((RealEntityPriceRefresher) obj4).service;
                                List list5 = (List) obj3;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                Iterator it2 = list5.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((InvestmentEntityToken) it2.next()).value);
                                }
                                GetCurrentPricesRequest getCurrentPricesRequest = new GetCurrentPricesRequest(Boolean.TRUE, CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList2)), ByteString.EMPTY);
                                realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.L$4 = flowCollector5;
                                realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                                realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.label = 1;
                                Object currentPrices = marketPricesAppService.getCurrentPrices(getCurrentPricesRequest, realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1);
                                if (currentPrices != coroutineSingletons6) {
                                    flowCollector = flowCollector5;
                                    obj10 = currentPrices;
                                }
                                return coroutineSingletons6;
                            }
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    SafeTrace.throwOnFailure(obj10);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i16 = realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.I$0;
                            flowCollector = realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj10);
                            realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.L$4 = null;
                            realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.I$0 = i16;
                            realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.label = 2;
                            break;
                        }
                    }
                    realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1 = new RealEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj102 = realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                    realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.L$4 = null;
                    realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.I$0 = i16;
                    realEntityPriceRefresher$autoRefresh$lambda$0$$inlined$map$1$2$1.label = 2;
                case 9:
                    if (continuation instanceof RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1) {
                        realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1 = (RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1) continuation;
                        int i24 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.label;
                        if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                            realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.label = i24 - PKIFailureInfo.systemUnavail;
                            Object obj11 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                FlowCollector flowCollector6 = (FlowCollector) obj2;
                                realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.L$4 = flowCollector6;
                                realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                                realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.label = 1;
                                Object historicalExchangeData = ((RealInvestingHistoricalData) obj4).appService.getHistoricalExchangeData((GetHistoricalExchangeDataRequest) obj3, realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1);
                                if (historicalExchangeData != coroutineSingletons7) {
                                    flowCollector2 = flowCollector6;
                                    obj11 = historicalExchangeData;
                                }
                                return coroutineSingletons7;
                            }
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    SafeTrace.throwOnFailure(obj11);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i15 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.I$0;
                            flowCollector2 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj11);
                            realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.L$4 = null;
                            realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.I$0 = i15;
                            realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.label = 2;
                            break;
                        }
                    }
                    realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1 = new RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj112 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                    realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.L$4 = null;
                    realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.I$0 = i15;
                    realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$1$2$1.label = 2;
                case 10:
                    GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) obj4;
                    if (continuation instanceof RealInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1) {
                        realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1 = (RealInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1) continuation;
                        int i25 = realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1.label;
                        if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                            realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                            Object obj12 = realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                FlowCollector flowCollector7 = (FlowCollector) obj2;
                                CurrentPrice price = ((StockDetails) obj).entityWithPrice.getPrice();
                                if (price != null && (money = price.current_price) != null) {
                                    long millis = ((RealInvestingHistoricalData) obj3).clock.millis() / 1000;
                                    Long l2 = ((PriceTick) CollectionsKt.last(getInvestmentEntityHistoricalDataResponse.price_ticks)).time_sec;
                                    l2.getClass();
                                    getInvestmentEntityHistoricalDataResponse = GetInvestmentEntityHistoricalDataResponse.copy$default(getInvestmentEntityHistoricalDataResponse, CollectionsKt.plus((Collection) getInvestmentEntityHistoricalDataResponse.price_ticks, (Object) new PriceTick(money.amount, new Long(Math.max(millis, l2.longValue() + 1)), ByteString.EMPTY)), null, null, 503);
                                }
                                realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector7.emit(getInvestmentEntityHistoricalDataResponse, realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1) == coroutineSingletons8) {
                                    return coroutineSingletons8;
                                }
                            } else {
                                if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj12);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1 = new RealInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj122 = realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realInvestingHistoricalData$mergeCurrentPriceTick$lambda$0$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                case 11:
                    if (continuation instanceof RealInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1) {
                        realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1 = (RealInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1) continuation;
                        int i26 = realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1.label;
                        if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                            realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1.label = i26 - PKIFailureInfo.systemUnavail;
                            Object obj13 = realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                FlowCollector flowCollector8 = (FlowCollector) obj2;
                                PolledData polledData = (PolledData) obj;
                                Map map = (Map) polledData.value;
                                boolean z2 = polledData.isStale;
                                List<OwnedHoldings> list6 = (List) obj4;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                for (OwnedHoldings ownedHoldings : list6) {
                                    arrayList3.add(RealInvestmentEntities.access$asOwned((RealInvestmentEntities) obj3, ownedHoldings, (CurrentPrice) map.get(new InvestmentEntityToken(ownedHoldings.token))));
                                }
                                PolledData polledData2 = new PolledData(arrayList3, z2);
                                realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector8.emit(polledData2, realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1) == coroutineSingletons9) {
                                    return coroutineSingletons9;
                                }
                            } else {
                                if (i8 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj13);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1 = new RealInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj132 = realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realInvestmentEntities$ownedStocks$lambda$0$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                    return Unit.INSTANCE;
                case 12:
                    if (continuation instanceof RealDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1) {
                        realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1 = (RealDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1) continuation;
                        int i27 = realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1.label;
                        if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                            realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1.label = i27 - PKIFailureInfo.systemUnavail;
                            Object obj14 = realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                FlowCollector flowCollector9 = (FlowCollector) obj2;
                                PolledData polledData3 = (PolledData) obj;
                                Map map2 = (Map) polledData3.value;
                                boolean z3 = polledData3.isStale;
                                Map map3 = (Map) obj4;
                                ArrayList arrayList4 = new ArrayList(map3.size());
                                for (Map.Entry entry : map3.entrySet()) {
                                    StockDetails stockDetails = (StockDetails) entry.getKey();
                                    SyncInvestmentHolding syncInvestmentHolding = (SyncInvestmentHolding) entry.getValue();
                                    InvestmentEntityWithPrice investmentEntityWithPrice = stockDetails.entityWithPrice;
                                    CurrentPrice currentPrice = (CurrentPrice) map2.get(investmentEntityWithPrice.getToken());
                                    ((RealDependentInvestmentEntities) obj3).getClass();
                                    long id = investmentEntityWithPrice.getId();
                                    InvestmentEntityToken token = investmentEntityWithPrice.getToken();
                                    String displayName = investmentEntityWithPrice.getDisplayName();
                                    Image icon = investmentEntityWithPrice.getIcon();
                                    String str5 = syncInvestmentHolding.units;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    String str6 = str5;
                                    Money money3 = syncInvestmentHolding.active_invested_amount;
                                    arrayList4.add(new InvestmentEntityWithPrice.Owned(id, token, displayName, icon, currentPrice, stockDetails.symbol, investmentEntityWithPrice.getAccentColor(), str6, (money3 == null || (l = money3.amount) == null) ? 0L : l.longValue(), investmentEntityWithPrice.getDelisted(), investmentEntityWithPrice.getMarketCap(), syncInvestmentHolding.daily_gain_params, investmentEntityWithPrice.getReleaseStage()));
                                }
                                PolledData polledData4 = new PolledData(arrayList4, z3);
                                realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1.label = 1;
                                if (flowCollector9.emit(polledData4, realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1) == coroutineSingletons10) {
                                    return coroutineSingletons10;
                                }
                            } else {
                                if (i9 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj14);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1 = new RealDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1(this, continuation);
                    Object obj142 = realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = realDependentInvestmentEntities$getOwnedStocks$$inlined$map$1$2$1.label;
                    if (i9 != 0) {
                    }
                    return Unit.INSTANCE;
                case 13:
                    JobKt.launch$default((CoroutineScope) obj2, null, null, new GLSceneScopeProvider$SceneScope$2$1$1((InitiateInvestmentOrderRequest) obj, (InviteErrorPresenter) obj3, (MutableState) obj4, (Continuation) null, 29), 3);
                    return Unit.INSTANCE;
                case 14:
                    MutableState mutableState3 = (MutableState) obj4;
                    InvestingRecurringPurchaseReceiptPresenter investingRecurringPurchaseReceiptPresenter = (InvestingRecurringPurchaseReceiptPresenter) obj3;
                    InvestingScreens.RecurringPurchaseReceipt recurringPurchaseReceipt = investingRecurringPurchaseReceiptPresenter.args;
                    BetterNavigator.ScreenNavigator screenNavigator2 = investingRecurringPurchaseReceiptPresenter.navigator;
                    InvestingRecurringPurchaseReceiptViewEvent investingRecurringPurchaseReceiptViewEvent = (InvestingRecurringPurchaseReceiptViewEvent) obj;
                    DependentRecurringPreference.RecurringPreferenceLoaded recurringPreferenceLoaded = (DependentRecurringPreference.RecurringPreferenceLoaded) obj2;
                    if (recurringPreferenceLoaded == null || (syncRecurringPreference = recurringPreferenceLoaded.syncRecurringPreference) == null || (scheduledTransactionPreference = syncRecurringPreference.preference) == null || (recurringSchedule2 = scheduledTransactionPreference.recurring_schedule) == null || (frequency = recurringSchedule2.frequency) == null) {
                        Recurring_preference recurring_preference = (Recurring_preference) mutableState3.getValue();
                        frequency = (recurring_preference == null || (recurringSchedule = recurring_preference.schedule) == null) ? null : recurringSchedule.frequency;
                        frequency.getClass();
                    }
                    if (Intrinsics.areEqual(investingRecurringPurchaseReceiptViewEvent, InvestingRecurringPurchaseReceiptViewEvent.CancelPurchasePressed.INSTANCE)) {
                        InvestingScreens.RecurringPurchaseReceipt.Type type2 = recurringPurchaseReceipt.f1161type;
                        if (type2 instanceof InvestingScreens.RecurringPurchaseReceipt.Type.Bitcoin) {
                            BlockersData.Flow.INSTANCE.getClass();
                            equity = new InvestingScreens.CancelRecurringPurchase.Bitcoin(BlockersData.Flow.Companion.generateToken(), frequency);
                        } else {
                            if (!(type2 instanceof InvestingScreens.RecurringPurchaseReceipt.Type.Stock)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            InvestmentEntityToken investmentEntityToken = ((InvestingScreens.RecurringPurchaseReceipt.Type.Stock) type2).entityToken;
                            Recurring_preference recurring_preference2 = (Recurring_preference) mutableState3.getValue();
                            recurring_preference2.getClass();
                            equity = new InvestingScreens.CancelRecurringPurchase.Equity(frequency, investmentEntityToken, recurring_preference2.amount, recurringPurchaseReceipt.accentColor);
                        }
                        screenNavigator2.goTo(equity);
                    } else {
                        if (!Intrinsics.areEqual(investingRecurringPurchaseReceiptViewEvent, InvestingRecurringPurchaseReceiptViewEvent.ClosePressed.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator2);
                    }
                    return Unit.INSTANCE;
                case 15:
                    FilterSubFiltersViewEvent filterSubFiltersViewEvent = (FilterSubFiltersViewEvent) obj;
                    LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj4;
                    InvestingScreens.FilterSubFiltersScreen filterSubFiltersScreen = (InvestingScreens.FilterSubFiltersScreen) localPosCheckInPresenter.cameraPermissions;
                    if (Intrinsics.areEqual(filterSubFiltersViewEvent, FilterSubFiltersViewEvent.SubmitClick.INSTANCE)) {
                        List list7 = ((FilterSubFiltersViewModel.Content) obj2).options;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj15 : list7) {
                            if (((SubFilterViewModel) obj15).getSelectedOptionToken() != null) {
                                arrayList5.add(obj15);
                            }
                        }
                        boolean isEmpty = arrayList5.isEmpty();
                        Analytics analytics2 = (Analytics) localPosCheckInPresenter.store;
                        if (isEmpty) {
                            analytics2.track(new StockSelectSelectInvestSearchFilterContinue(filterSubFiltersScreen.filterConfiguration.filterToken.value), null);
                        } else {
                            analytics2.track(new StockSelectSelectInvestSearchFilterOption(filterSubFiltersScreen.filterConfiguration.filterToken.value, CollectionsKt.joinToString$default(arrayList5, "|", null, null, 0, null, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(i13), 30)), null);
                        }
                        BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                        FilterToken filterToken = filterSubFiltersScreen.filterConfiguration.filterToken;
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
                        Iterator it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            SubFilterViewModel subFilterViewModel = (SubFilterViewModel) it3.next();
                            String subFilterToken = subFilterViewModel.getSubFilterToken();
                            String selectedOptionToken = subFilterViewModel.getSelectedOptionToken();
                            selectedOptionToken.getClass();
                            linkedHashMap2.put(subFilterToken, selectedOptionToken);
                        }
                        screenNavigator3.goTo(new Finish(new FilterConfiguration.SubFilters(filterToken, linkedHashMap2)));
                    } else {
                        MutableState mutableState4 = (MutableState) ((Ref$ObjectRef) obj3).element;
                        Iterable<SubFilterViewModel> iterable = (Iterable) mutableState4.getValue();
                        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                        for (SubFilterViewModel subFilterViewModel2 : iterable) {
                            if (Intrinsics.areEqual(filterSubFiltersViewEvent, FilterSubFiltersViewEvent.ResetClick.INSTANCE)) {
                                subFilterViewModel2 = subFilterViewModel2.copyWithSelectedOption(null);
                            } else if (filterSubFiltersViewEvent instanceof FilterSubFiltersViewEvent.OptionClick) {
                                FilterSubFiltersViewEvent.OptionClick optionClick = (FilterSubFiltersViewEvent.OptionClick) filterSubFiltersViewEvent;
                                if (Intrinsics.areEqual(subFilterViewModel2.getSubFilterToken(), optionClick.subFilterToken)) {
                                    subFilterViewModel2 = subFilterViewModel2.copyWithSelectedOption(optionClick.subFilterOptionToken);
                                }
                            }
                            arrayList6.add(subFilterViewModel2);
                        }
                        mutableState4.setValue(arrayList6);
                    }
                    return Unit.INSTANCE;
                case 16:
                    AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
                    if (Intrinsics.areEqual(amountPickerViewEvent, AmountPickerViewEvent$Full$Close.INSTANCE) || Intrinsics.areEqual(amountPickerViewEvent, AmountPickerViewEvent$Full$SystemBack.INSTANCE)) {
                        ((BetterNavigator.ScreenNavigator) ((LocalHomePresenter) obj2).navigator).goTo(back);
                    } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneyChanged) {
                        ((MutableState) obj4).setValue((AmountPickerViewEvent$Full$MoneyChanged) amountPickerViewEvent);
                    } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneySubmitted) {
                        ((MutableState) obj3).setValue((AmountPickerViewEvent$Full$MoneySubmitted) amountPickerViewEvent);
                    } else if (!Intrinsics.areEqual(amountPickerViewEvent, AmountPickerViewEvent$Full$HelpClicked.INSTANCE) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemConfirmed) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemSelected) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    return Unit.INSTANCE;
                case 17:
                    LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj3;
                    BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator;
                    CoroutineScope coroutineScope4 = (CoroutineScope) obj2;
                    DividendReinvestmentSettingViewEvent dividendReinvestmentSettingViewEvent = (DividendReinvestmentSettingViewEvent) obj;
                    if (Intrinsics.areEqual(dividendReinvestmentSettingViewEvent, DividendReinvestmentSettingViewEvent.BackClicked.INSTANCE)) {
                        screenNavigator4.goTo(back);
                    } else if (Intrinsics.areEqual(dividendReinvestmentSettingViewEvent, DividendReinvestmentSettingViewEvent.CtaClicked.INSTANCE)) {
                        screenNavigator4.goTo(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) localCashBalancePresenter.store)).peekCurrentValue(LaunchDarklyFeatureFlags$SheetV3.INSTANCE)).enabled() ? InvestingScreens.DividendReinvestmentLearnMoreSheetV2.INSTANCE : InvestingScreens.DividendReinvestmentLearnMoreSheet.INSTANCE);
                    } else if (dividendReinvestmentSettingViewEvent instanceof DividendReinvestmentSettingViewEvent.TermsOfServiceClicked) {
                        ((RealRouter) localCashBalancePresenter.timestampFormatter).route(new RoutingParams(null, null, null, null, null, null, 511), ((DividendReinvestmentSettingViewEvent.TermsOfServiceClicked) dividendReinvestmentSettingViewEvent).url);
                    } else {
                        if (!(dividendReinvestmentSettingViewEvent instanceof DividendReinvestmentSettingViewEvent.EntryToggled)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope4, null, null, new InvestingHomeView$onScrollFlow$1(dividendReinvestmentSettingViewEvent, localCashBalancePresenter, (MutableState) obj4, null, 20), 3);
                    }
                    return Unit.INSTANCE;
                case 18:
                    MutableState mutableState5 = (MutableState) obj3;
                    InvestingFinancialPresenter investingFinancialPresenter = (InvestingFinancialPresenter) obj2;
                    InvestingFinancialViewEvent investingFinancialViewEvent = (InvestingFinancialViewEvent) obj;
                    if (Intrinsics.areEqual(investingFinancialViewEvent, InvestingFinancialViewEvent.MoreInfoClicked.INSTANCE)) {
                        BetterNavigator.ScreenNavigator screenNavigator5 = investingFinancialPresenter.navigator;
                        InvestmentFinancials investmentFinancials = (InvestmentFinancials) ((MutableState) obj4).getValue();
                        investmentFinancials.getClass();
                        Section.Row.MoreInfo moreInfo = investmentFinancials.more_info;
                        moreInfo.getClass();
                        screenNavigator5.goTo(new InvestingScreens.MoreInfoSheet(moreInfo));
                    } else {
                        if (!(investingFinancialViewEvent instanceof InvestingFinancialViewEvent.SelectRange)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Range range = (Range) mutableState5.getValue();
                        Range range2 = ((InvestingFinancialViewEvent.SelectRange) investingFinancialViewEvent).selectedButton;
                        if (range != range2) {
                            Analytics analytics3 = investingFinancialPresenter.analytics;
                            String str7 = investingFinancialPresenter.stockTicker;
                            int ordinal = range2.ordinal();
                            if (ordinal == 0) {
                                financialWindowType = StockToggleToggleFinancialWindow.FinancialWindowType.ANNUALLY;
                            } else {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                financialWindowType = StockToggleToggleFinancialWindow.FinancialWindowType.QUARTERLY;
                            }
                            analytics3.track(new StockToggleToggleFinancialWindow(str7, financialWindowType), null);
                        }
                        mutableState5.setValue(range2);
                    }
                    return Unit.INSTANCE;
                case 19:
                    StockDetails stockDetails2 = (StockDetails) obj3;
                    if (continuation instanceof InvestingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1) {
                        investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1 = (InvestingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1) continuation;
                        int i28 = investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1.label;
                        if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                            investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1.label = i28 - PKIFailureInfo.systemUnavail;
                            Object obj16 = investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj16);
                                FlowCollector flowCollector10 = (FlowCollector) obj2;
                                Recurring_preference recurring_preference3 = (Recurring_preference) obj;
                                if (recurring_preference3 != null) {
                                    InvestingStockDetailsPresenter investingStockDetailsPresenter = (InvestingStockDetailsPresenter) obj4;
                                    AndroidDateFormatManager androidDateFormatManager = investingStockDetailsPresenter.dateFormatManager;
                                    AndroidStringManager androidStringManager = investingStockDetailsPresenter.stringManager;
                                    LocalizedMoneyFormatter.Factory factory = investingStockDetailsPresenter.moneyFormatterFactory;
                                    InvestmentEntityWithPrice investmentEntityWithPrice2 = stockDetails2.entityWithPrice;
                                    Image icon2 = investmentEntityWithPrice2.getIcon();
                                    InvestingCryptoAvatarContentModel$Image investingCryptoAvatarContentModel$Image = icon2 != null ? new InvestingCryptoAvatarContentModel$Image(icon2, MoshiJsonIntegration.toModel(investmentEntityWithPrice2.getAccentColor())) : null;
                                    ColorModel.Accented accented = new ColorModel.Accented(stockDetails2.color);
                                    SimpleDateFormat simpleDateFormat = RecurringPreferenceKt.timeFormatter;
                                    if (!recurring_preference3.enabled) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                                        return null;
                                    }
                                    Long l3 = recurring_preference3.next_reload_at;
                                    l3.getClass();
                                    investingCryptoRecurringPurchaseTileViewModel = InvestingCryptoRecurringPreferences.m3586toTileViewModel_kfyX8k(l3.longValue(), recurring_preference3.schedule, recurring_preference3.entity_id, recurring_preference3.amount, androidDateFormatManager, androidStringManager, factory, investingCryptoAvatarContentModel$Image, accented);
                                }
                                investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector10.emit(investingCryptoRecurringPurchaseTileViewModel, investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1) == coroutineSingletons11) {
                                    return coroutineSingletons11;
                                }
                            } else {
                                if (i10 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj16);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1 = new InvestingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj162 = investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = investingStockDetailsPresenter$autoInvestViewModel$lambda$0$$inlined$map$1$2$1.label;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                case 20:
                    ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj2;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                    MutableState mutableState6 = (MutableState) obj4;
                    MerchantProfileViewEvent merchantProfileViewEvent = (MerchantProfileViewEvent) obj;
                    if (merchantProfileViewEvent instanceof MerchantProfileViewEvent.ReloadProfile) {
                        int intValue = parcelableSnapshotMutableIntState.getIntValue();
                        parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                        Okio.boxInt(intValue);
                    } else if (merchantProfileViewEvent instanceof MerchantProfileViewEvent.NavigationIconClicked) {
                        ((BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator).goTo(back);
                    } else if (merchantProfileViewEvent instanceof MerchantProfileViewEvent.AvatarClicked) {
                        MerchantProfilePresenter$HeaderState merchantProfilePresenter$HeaderState = (MerchantProfilePresenter$HeaderState) ((MerchantProfilePresenter$State) mutableState6.getValue()).headerState.invoke();
                        if (merchantProfilePresenter$HeaderState != null && (avatar = merchantProfilePresenter$HeaderState.avatarViewModel.avatar) != null && (image = avatar.remoteImage) != null) {
                            mutableState6.setValue(MerchantProfilePresenter$State.copy$default((MerchantProfilePresenter$State) mutableState6.getValue(), null, null, null, ((MerchantProfilePresenter$State) mutableState6.getValue()).profilePhoto == null ? new MerchantProfileViewModel.ProfilePhoto(image, avatar.backgroundColor, Boolean.valueOf(avatar.transformFillColor != null)) : null, 7));
                        }
                    } else if (!(merchantProfileViewEvent instanceof MerchantProfileViewEvent.MerchantGenericTreeElementsViewEvent) && !(merchantProfileViewEvent instanceof MerchantProfileViewEvent.PaymentHistoryViewEvent)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    return Unit.INSTANCE;
                case 21:
                    MutableState mutableState7 = (MutableState) obj4;
                    if (((UiCallbackModel) mutableState7.getValue()).model != null) {
                        Function1 function1 = ((UiCallbackModel) mutableState7.getValue()).onEvent;
                        MoneyTabScreen moneyTabScreen = ((MoneyTabPresenter) obj2).args;
                        function1.invoke(new AlertBannerViewEvent$BannerClicked(new RoutingParams(moneyTabScreen, null, moneyTabScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502)));
                    } else {
                        WorkReviewTermsBanner$Config workReviewTermsBanner$Config = (WorkReviewTermsBanner$Config) ((MutableState) obj3).getValue();
                        if (workReviewTermsBanner$Config != null) {
                            workReviewTermsBanner$Config.onTap.invoke();
                        }
                    }
                    return Unit.INSTANCE;
                case 22:
                    return emit$com$squareup$cash$moneybot$backend$real$managers$RealChatManager$getTokenizedChat$$inlined$map$1$2(obj, continuation);
                case 23:
                    return emit$com$squareup$cash$moneybot$presenters$MoneybotChatHistoryPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 24:
                    return emit$com$squareup$cash$moneybot$presenters$MoneybotHomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 25:
                    MutableState mutableState8 = (MutableState) obj4;
                    MoneybotHomePresenter moneybotHomePresenter = (MoneybotHomePresenter) obj3;
                    if (continuation instanceof MoneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1) {
                        moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1 = (MoneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1) continuation;
                        int i29 = moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1.label;
                        if ((i29 & PKIFailureInfo.systemUnavail) != 0) {
                            moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1.label = i29 - PKIFailureInfo.systemUnavail;
                            Object obj17 = moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                FlowCollector flowCollector11 = (FlowCollector) obj2;
                                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                                if ((tabToolbarInternalViewEvent instanceof TabToolbarInternalViewEvent.ToolbarButtonClick) && ((TabToolbarInternalViewEvent.ToolbarButtonClick) tabToolbarInternalViewEvent).id == TabToolbarInternalViewModel.ToolbarButton.Id.MoneybotOverflowMenu) {
                                    RealMoneybotAnalyticsService.submitOverflowMenuOpen$default((RealMoneybotAnalyticsService) moneybotHomePresenter.analyticsService, MoneybotSurface.HOME, null, (String) mutableState8.getValue(), 2);
                                    moneybotHomePresenter.navigator.goTo(new MoneybotOverflowMenuScreen(r13, new HomeSourceContext((String) mutableState8.getValue(), 6), i17));
                                } else {
                                    moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector11.emit(obj, moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1) == coroutineSingletons12) {
                                        return coroutineSingletons12;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj17);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1 = new MoneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1(this, continuation);
                    Object obj172 = moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = moneybotHomePresenter$models$lambda$6$$inlined$filter$1$2$1.label;
                    if (i11 != 0) {
                    }
                    return Unit.INSTANCE;
                case 26:
                    return emit$com$squareup$cash$moneybot$presenters$MoneybotOverflowMenuPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 27:
                    return emit$com$squareup$cash$moneybot$views$history$MoneybotChatHistoryViewKt$ChatHistory$3$1$2(obj, continuation);
                case 28:
                    return emit$com$squareup$cash$notifications$RealAndroidNotificationSettingsChecker$notificationChannelState$$inlined$map$1$2(obj, continuation);
                default:
                    return emit((Pair) obj, continuation);
            }
        }

        public /* synthetic */ AnonymousClass2(Object obj, MoleculePresenter moleculePresenter, MutableState mutableState, int i) {
            this.$r8$classId = i;
            this.$state$delegate = moleculePresenter;
            this.$tracks$delegate = mutableState;
            this.$searchQueryFlow = obj;
        }

        public /* synthetic */ AnonymousClass2(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, int i) {
            this.$r8$classId = i;
            this.$searchQueryFlow = moleculePresenter;
            this.$tracks$delegate = mutableState;
            this.$state$delegate = mutableState2;
        }

        public /* synthetic */ AnonymousClass2(CoroutineScope coroutineScope, Object obj, Object obj2, MutableState mutableState, int i) {
            this.$r8$classId = i;
            this.$searchQueryFlow = obj;
            this.$state$delegate = obj2;
            this.$tracks$delegate = mutableState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00db, code lost:
        
            if (com.squareup.cash.offers.backend.real.RealOffersSheetRepository.access$getOfferSheetOrNull(r4, r6, r1, r3, r7) != r2) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        
            if (com.squareup.cash.offers.backend.real.RealOffersSheetRepository.access$getOfferSheetOrNull(r4, r6, r1, r3, r7) != r2) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
        
            if (r6.emit(r0, r7) == r2) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(Pair pair, Continuation continuation) {
            RealOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1 realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1;
            int i;
            OfferSheetKey offerSheetKey;
            OfferSheetKey offerSheetKey2;
            Function1 function1 = (Function1) this.$state$delegate;
            RealOffersSheetRepository realOffersSheetRepository = (RealOffersSheetRepository) this.$tracks$delegate;
            AndroidClock androidClock = realOffersSheetRepository.clock;
            FlowCollector flowCollector = (FlowCollector) this.$searchQueryFlow;
            if (continuation instanceof RealOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1) {
                realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1 = (RealOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1) continuation;
                int i2 = realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        OfferSheetKey offerSheetKey3 = (OfferSheetKey) pair.first;
                        OffersSheet offersSheet = (OffersSheet) pair.second;
                        if (offersSheet == null) {
                            realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.L$0 = offerSheetKey3;
                            realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label = 1;
                            if (flowCollector.emit(null, realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1) != coroutineSingletons) {
                                offerSheetKey2 = offerSheetKey3;
                                realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.L$0 = null;
                                realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label = 2;
                            }
                        } else {
                            OffersSheetResponse offersSheetResponse = offersSheet.offers_sheet_response;
                            Long l = offersSheet.ttl_in_millis;
                            if ((l != null ? l.longValue() : 0L) >= androidClock.millis()) {
                                ApiResult.Success success = new ApiResult.Success(offersSheetResponse);
                                realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.L$0 = null;
                                realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label = 3;
                            } else {
                                if ((l != null ? l.longValue() : 0L) >= androidClock.millis()) {
                                    return Unit.INSTANCE;
                                }
                                ApiResult.Success success2 = new ApiResult.Success(offersSheetResponse);
                                realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.L$0 = offerSheetKey3;
                                realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label = 4;
                                if (flowCollector.emit(success2, realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1) != coroutineSingletons) {
                                    offerSheetKey = offerSheetKey3;
                                    realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.L$0 = null;
                                    realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label = 5;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        offerSheetKey2 = realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.L$0 = null;
                        realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label = 2;
                    } else {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i != 4) {
                            if (i == 5) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        offerSheetKey = realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.L$0 = null;
                        realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label = 5;
                    }
                }
            }
            realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1 = new RealOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1(this, continuation);
            Object obj2 = realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1.label;
            if (i != 0) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicPresenter$models$1$1(StocksTransferEtaSheetPresenter stocksTransferEtaSheetPresenter, InvestingState investingState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$searchQueryFlow = stocksTransferEtaSheetPresenter;
        this.this$0 = investingState;
        this.$state$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicPresenter$models$1$1(AppletTileSectionProvider appletTileSectionProvider, Map map, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.$tracks$delegate = appletTileSectionProvider;
        this.$state$delegate = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicPresenter$models$1$1(MusicPresenter musicPresenter, MusicViewEvent musicViewEvent, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 19;
        this.this$0 = musicPresenter;
        this.$searchQueryFlow = musicViewEvent;
        this.$tracks$delegate = mutableState;
        this.$state$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicPresenter$models$1$1(OfferCountdownTemplateViewModel offerCountdownTemplateViewModel, AndroidClock androidClock, DetailCaptionFormatStringResources detailCaptionFormatStringResources, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 23;
        this.$searchQueryFlow = offerCountdownTemplateViewModel;
        this.this$0 = androidClock;
        this.$state$delegate = detailCaptionFormatStringResources;
        this.$tracks$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicPresenter$models$1$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$searchQueryFlow = obj;
        this.this$0 = obj2;
        this.$tracks$delegate = obj3;
        this.$state$delegate = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicPresenter$models$1$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$tracks$delegate = obj2;
        this.$state$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicPresenter$models$1$1(String str, ValidatedAliasPicker validatedAliasPicker, Continuation continuation, CardLockPresenter cardLockPresenter) {
        super(2, continuation);
        this.$r8$classId = 26;
        this.this$0 = str;
        this.$tracks$delegate = validatedAliasPicker;
        this.$state$delegate = cardLockPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicPresenter$models$1$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, MutableState mutableState, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$state$delegate = moleculePresenter;
        this.$tracks$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicPresenter$models$1$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, State state, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$tracks$delegate = moleculePresenter;
        this.$state$delegate = state;
    }
}
