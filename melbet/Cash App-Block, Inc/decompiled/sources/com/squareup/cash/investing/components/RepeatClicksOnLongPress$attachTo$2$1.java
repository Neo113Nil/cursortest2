package com.squareup.cash.investing.components;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.subtle.PrfAesCmac;
import com.nimbusds.jose.util.DeflateUtils;
import com.squareup.cash.R;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinExchangeFullScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.crypto.CryptoTradeSetAutoInvest;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.sponsoredaccount.DependentBalanceType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountBalanceDetailGraphTimeUnitChange;
import com.squareup.cash.cdf.stock.Frequency;
import com.squareup.cash.cdf.stock.StockOpenOpenCategoryFilter;
import com.squareup.cash.cdf.stock.StockOpenOpenCategoryStock;
import com.squareup.cash.cdf.stock.StockOpenOpenHoldingsDetailsStock;
import com.squareup.cash.cdf.stock.StockOpenOpenSortBy;
import com.squareup.cash.cdf.stock.StockSelectResetCategoryFilter;
import com.squareup.cash.cdf.stock.StockSelectSelectDisclosures;
import com.squareup.cash.cdf.stock.StockSelectSelectHoldingsStock;
import com.squareup.cash.cdf.stock.StockSelectSelectInvestSearchFilterContinue;
import com.squareup.cash.cdf.stock.StockSelectSelectInvestSearchFilterOption;
import com.squareup.cash.cdf.stock.StockSelectSelectMyInvestmentsDetails;
import com.squareup.cash.cdf.stock.StockSelectSelectSortBy;
import com.squareup.cash.cdf.stock.StockSelectSelectStock;
import com.squareup.cash.cdf.stock.StockSource;
import com.squareup.cash.cdf.stock.StockToggleToggleHoldingsDetailsGroup;
import com.squareup.cash.cdf.stock.StockViewOpenStockSearch;
import com.squareup.cash.cdf.stock.StockViewSortList;
import com.squareup.cash.cdf.stock.StockViewViewMoreHoldings;
import com.squareup.cash.cdf.stock.StockViewViewStockDetails;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.family.familyhub.screens.DependentControlsAndLimitsScreen;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SheetV3;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.FormattedResources;
import com.squareup.cash.history.presenters.ReportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.history.presenters.ReportAbusePresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.history.presenters.SkipPaymentPresenter$viewModels$$inlined$map$1$2$1;
import com.squareup.cash.history.viewmodels.SkipPaymentViewModel;
import com.squareup.cash.inappreview.real.RealRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1;
import com.squareup.cash.incentives.finishsetup.applets.viewmodels.FinishSetupAppletTileViewEvent$FinishSetupOnClickTile;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager$forType$$inlined$map$1$2$1;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager$forTypes$$inlined$map$1$2$1;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.presenters.InstrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOptions;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.applets.presenters.PriceChangeViewModel;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTilePriceMovementRepository;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository$StocksModel$Installed$GraphError;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository$StocksModel$Installed$LoadingPriceMovement;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.api.data.CategoryDetails;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher$observe$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities$stockDetails$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.backend.real.autoinvest.RealAutoInvestRepo$preference$$inlined$filter$1$2$1;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.FilterConfigurationCacheMap;
import com.squareup.cash.investing.presenters.InvestingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringFrequencyPickerFullPresenter;
import com.squareup.cash.investing.presenters.categories.InvestingFilterCategoriesPresenter$models$1$3;
import com.squareup.cash.investing.presenters.holdings.InvestingEtfHoldingsPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingAnalystOpinionsPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingEarningsPresenter;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.FollowingStockMetricType;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.PortfolioStockMetricType;
import com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewEvent;
import com.squareup.cash.investing.viewmodels.StockSource$Discovery;
import com.squareup.cash.investing.viewmodels.StockSource$Following;
import com.squareup.cash.investing.viewmodels.StockSource$Portfolio;
import com.squareup.cash.investing.viewmodels.StockSource$SearchResult;
import com.squareup.cash.investing.viewmodels.StockSource$Welcome;
import com.squareup.cash.investing.viewmodels.categories.FilterCategoriesViewEvent;
import com.squareup.cash.investing.viewmodels.categories.FilterCategoriesViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentWelcomeViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewEvent;
import com.squareup.cash.investing.viewmodels.holdings.InvestmentType;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewEvent$MoreInfoClicked;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingFrequencyOption;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewEvent;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.performance.ScrollPerformanceAnalyzer;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.EnumPreference;
import com.squareup.protos.cash.marketdata.model.InvestmentAnalystOpinions;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.cash.money.content.FinishSetupTileV1;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.invest.ui.Section;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.BigDecimalsKt;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import nl.dionsegijn.konfetti.core.Position;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.ZipFilesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RepeatClicksOnLongPress$attachTo$2$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $repeater;
    public final /* synthetic */ Object $view;

    public /* synthetic */ RepeatClicksOnLongPress$attachTo$2$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$view = obj;
        this.$repeater = obj2;
    }

    private final Object emit$com$squareup$cash$investing$presenters$StockMetricTypePickerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$repeater;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
        Analytics analytics = (Analytics) localEditorialPresenter.installedStore;
        CoroutineScope coroutineScope = (CoroutineScope) this.$view;
        StockMetricTypePickerViewEvent stockMetricTypePickerViewEvent = (StockMetricTypePickerViewEvent) obj;
        boolean z = stockMetricTypePickerViewEvent instanceof StockMetricTypePickerViewEvent.SelectFollowingMetricType;
        Back back = Back.INSTANCE;
        Continuation continuation2 = null;
        if (z) {
            FollowingStockMetricType followingStockMetricType = ((StockMetricTypePickerViewEvent.SelectFollowingMetricType) stockMetricTypePickerViewEvent).metricType;
            analytics.track(new StockViewSortList(followingStockMetricType.toString()), null);
            analytics.track(new StockSelectSelectSortBy(Position.getSortType(followingStockMetricType), StockSource.FOLLOW), null);
            ((EnumPreference) localEditorialPresenter.service).set(followingStockMetricType);
            screenNavigator.goTo(back);
        } else {
            if (!(stockMetricTypePickerViewEvent instanceof StockMetricTypePickerViewEvent.SelectPortfolioMetricType)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            PortfolioStockMetricType portfolioStockMetricType = ((StockMetricTypePickerViewEvent.SelectPortfolioMetricType) stockMetricTypePickerViewEvent).metricType;
            analytics.track(new StockViewSortList(portfolioStockMetricType.toString()), null);
            analytics.track(new StockSelectSelectSortBy(Position.getSortType(portfolioStockMetricType), StockSource.STOCKS_I_OWN), null);
            JobKt.launch$default(coroutineScope, (CoroutineContext) localEditorialPresenter.clock, null, new CheckStatusPresenter.AnonymousClass1(localEditorialPresenter, stockMetricTypePickerViewEvent, continuation2, 28), 2);
            screenNavigator.goTo(back);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object emit$com$squareup$cash$investing$presenters$autoinvest$InvestingRecurringFrequencyPickerFullPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Frequency frequency;
        InvestingRecurringFrequencyPickerFullPresenter investingRecurringFrequencyPickerFullPresenter = (InvestingRecurringFrequencyPickerFullPresenter) this.$repeater;
        BetterNavigator.ScreenNavigator screenNavigator = investingRecurringFrequencyPickerFullPresenter.navigator;
        InvestingScreens.RecurringFrequencyPickerFullScreen recurringFrequencyPickerFullScreen = investingRecurringFrequencyPickerFullPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$view;
        InvestingRecurringFrequencyPickerViewEvent investingRecurringFrequencyPickerViewEvent = (InvestingRecurringFrequencyPickerViewEvent) obj;
        RecurringSchedule.Frequency frequency2 = null;
        Object[] objArr = 0;
        if (Intrinsics.areEqual(investingRecurringFrequencyPickerViewEvent, InvestingRecurringFrequencyPickerViewEvent.BackPressed.INSTANCE)) {
            NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator);
        } else {
            if (!(investingRecurringFrequencyPickerViewEvent instanceof InvestingRecurringFrequencyPickerViewEvent.ConfirmPressed)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            InvestingScreens.OrderTypeSelectionScreen.Type type2 = recurringFrequencyPickerFullScreen.f1160type;
            OrderSide orderSide = recurringFrequencyPickerFullScreen.orderSide;
            if (Intrinsics.areEqual(type2, InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin.INSTANCE)) {
                investingRecurringFrequencyPickerFullPresenter.analytics.track(new CryptoTradeSetAutoInvest(ZipFilesKt.getBitcoinTargetAsset(orderSide), ZipFilesKt.getBitcoinSourceAsset(orderSide)), null);
            }
            InvestingScreens.OrderTypeSelectionScreen.Type type3 = recurringFrequencyPickerFullScreen.f1160type;
            if (type3 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity) {
                InvestingFrequencyOption investingFrequencyOption = ((InvestingRecurringFrequencyPickerViewEvent.ConfirmPressed) investingRecurringFrequencyPickerViewEvent).selectedFrequency;
                if (Intrinsics.areEqual(investingFrequencyOption, InvestingFrequencyOption.OneTime.INSTANCE)) {
                    frequency = Frequency.ONE_TIME;
                } else {
                    if (!(investingFrequencyOption instanceof InvestingFrequencyOption.Recurring)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int i = InvestingRecurringFrequencyPickerFullPresenter.WhenMappings.$EnumSwitchMapping$0[((InvestingFrequencyOption.Recurring) investingFrequencyOption).frequency.ordinal()];
                    if (i == 1) {
                        frequency = Frequency.DAILY;
                    } else if (i == 2) {
                        frequency = Frequency.WEEKLY;
                    } else if (i == 3) {
                        frequency = Frequency.EVERY_TWO_WEEKS;
                    } else {
                        if (i != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        frequency = Frequency.MONTHLY;
                    }
                }
                Frequency frequency3 = frequency;
                JobKt.launch$default(coroutineScope, null, null, new RealKeyStoreProvider$setEntry$2((Object) investingRecurringFrequencyPickerFullPresenter, (Object) type3, (Object) frequency3, (Continuation) (objArr == true ? 1 : 0), 1), 3);
            }
            InvestingFrequencyOption investingFrequencyOption2 = ((InvestingRecurringFrequencyPickerViewEvent.ConfirmPressed) investingRecurringFrequencyPickerViewEvent).selectedFrequency;
            if (!(investingFrequencyOption2 instanceof InvestingFrequencyOption.OneTime)) {
                if (!(investingFrequencyOption2 instanceof InvestingFrequencyOption.Recurring)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                frequency2 = ((InvestingFrequencyOption.Recurring) investingFrequencyOption2).frequency;
            }
            if (!(recurringFrequencyPickerFullScreen.prevScreenBottomSheet instanceof BitcoinExchangeFullScreen)) {
                screenNavigator.goTo(recurringFrequencyPickerFullScreen.exitScreen);
            }
            screenNavigator.goTo(recurringFrequencyPickerFullScreen.prevScreenBottomSheet.copyWithFrequency(frequency2));
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$investing$presenters$categories$InvestingCategoryDetailPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        State state = (State) this.$repeater;
        DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.$view;
        Analytics analytics = (Analytics) disclosurePresenter.analytics;
        FilterConfigurationCacheMap filterConfigurationCacheMap = (FilterConfigurationCacheMap) disclosurePresenter.blockersNavigator;
        CategoryToken categoryToken = (CategoryToken) disclosurePresenter.launcher;
        InvestingSearchViewEvent investingSearchViewEvent = (InvestingSearchViewEvent) obj;
        if (Intrinsics.areEqual(investingSearchViewEvent, InvestingSearchViewEvent.BackClicked.INSTANCE)) {
            categoryToken.getClass();
            Cache cache = (Cache) filterConfigurationCacheMap.map.get(categoryToken);
            if (cache != null) {
                cache.cache = null;
            }
        } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.StockClicked) {
            CategoryDetails categoryDetails = (CategoryDetails) state.getValue();
            categoryDetails.getClass();
            String str = categoryDetails.category.name;
            RealInvestingAnalytics realInvestingAnalytics = (RealInvestingAnalytics) disclosurePresenter.stringManager;
            InvestingSearchViewEvent.StockClicked stockClicked = (InvestingSearchViewEvent.StockClicked) investingSearchViewEvent;
            InvestmentEntityToken investmentEntityToken = stockClicked.token;
            String str2 = stockClicked.symbol;
            categoryToken.getClass();
            str.getClass();
            investmentEntityToken.getClass();
            str2.getClass();
            realInvestingAnalytics.analytics.track(new StockOpenOpenCategoryStock(str, str2), null);
        } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.FilterMenuClicked) {
            CategoryDetails categoryDetails2 = (CategoryDetails) state.getValue();
            categoryDetails2.getClass();
            analytics.track(new StockOpenOpenCategoryFilter(categoryDetails2.category.name), null);
            Object obj2 = filterConfigurationCacheMap.getCache(categoryToken).cache;
            obj2.getClass();
            ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).askQuestion(new InvestingScreens.UpdateCategoryFilterQuestion(), new VerifyCheckDepositPresenter$models$3$2(10, disclosurePresenter, (Map) obj2));
        } else if (investingSearchViewEvent instanceof InvestingSearchViewEvent.ResetFiltersClicked) {
            CategoryDetails categoryDetails3 = (CategoryDetails) state.getValue();
            categoryDetails3.getClass();
            analytics.track(new StockSelectResetCategoryFilter(categoryDetails3.category.name), null);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$investing$presenters$categories$InvestingFilterCategoriesPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Object categories;
        MutableState mutableState = (MutableState) this.$repeater;
        LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) this.$view;
        InvestingScreens.FilterCategoriesScreen filterCategoriesScreen = (InvestingScreens.FilterCategoriesScreen) localPosCheckInPresenter.cameraPermissions;
        FilterCategoriesViewEvent filterCategoriesViewEvent = (FilterCategoriesViewEvent) obj;
        if (filterCategoriesViewEvent instanceof FilterCategoriesViewEvent.ResetClick) {
            List list = (List) mutableState.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(FilterCategoriesViewModel.ChoiceRowModel.copy$default((FilterCategoriesViewModel.ChoiceRowModel) it.next(), false));
            }
            mutableState.setValue(arrayList);
        } else if (filterCategoriesViewEvent instanceof FilterCategoriesViewEvent.RowClick) {
            List<FilterCategoriesViewModel.ChoiceRowModel> list2 = (List) mutableState.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (FilterCategoriesViewModel.ChoiceRowModel choiceRowModel : list2) {
                if (Intrinsics.areEqual(choiceRowModel.token, ((FilterCategoriesViewEvent.RowClick) filterCategoriesViewEvent).token)) {
                    choiceRowModel = FilterCategoriesViewModel.ChoiceRowModel.copy$default(choiceRowModel, !choiceRowModel.isChecked);
                }
                arrayList2.add(choiceRowModel);
            }
            mutableState.setValue(arrayList2);
        } else {
            if (!(filterCategoriesViewEvent instanceof FilterCategoriesViewEvent.SubmitClick)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            List list3 = (List) mutableState.getValue();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list3) {
                if (((FilterCategoriesViewModel.ChoiceRowModel) obj2).isChecked) {
                    arrayList3.add(obj2);
                }
            }
            boolean isEmpty = arrayList3.isEmpty();
            Analytics analytics = (Analytics) localPosCheckInPresenter.store;
            if (isEmpty) {
                analytics.track(new StockSelectSelectInvestSearchFilterContinue(filterCategoriesScreen.filterConfiguration.filterToken.value), null);
            } else {
                analytics.track(new StockSelectSelectInvestSearchFilterOption(filterCategoriesScreen.filterConfiguration.filterToken.value, CollectionsKt.joinToString$default(arrayList3, "|", null, null, 0, null, InvestingFilterCategoriesPresenter$models$1$3.INSTANCE, 30)), null);
            }
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
            if (arrayList3.isEmpty()) {
                categories = new FilterConfiguration.Empty(filterCategoriesScreen.filterConfiguration.filterToken);
            } else {
                FilterToken filterToken = filterCategoriesScreen.filterConfiguration.filterToken;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((FilterCategoriesViewModel.ChoiceRowModel) it2.next()).token);
                }
                categories = new FilterConfiguration.Categories(filterToken, arrayList4);
            }
            screenNavigator.goTo(new Finish(categories));
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$investing$presenters$drip$DividendReinvestmentWelcomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.$view;
        InvestingScreens.DividendReinvestmentWelcomeScreen dividendReinvestmentWelcomeScreen = (InvestingScreens.DividendReinvestmentWelcomeScreen) cardStudioPresenter.cardStudioQueries;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
        DividendReinvestmentWelcomeViewEvent dividendReinvestmentWelcomeViewEvent = (DividendReinvestmentWelcomeViewEvent) obj;
        if (Intrinsics.areEqual(dividendReinvestmentWelcomeViewEvent, DividendReinvestmentWelcomeViewEvent.CloseClicked.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (Intrinsics.areEqual(dividendReinvestmentWelcomeViewEvent, DividendReinvestmentWelcomeViewEvent.CtaClicked.INSTANCE)) {
            if (((Boolean) ((MutableState) this.$repeater).getValue()).booleanValue()) {
                FlowStarter flowStarter = (FlowStarter) cardStudioPresenter.analytics;
                Screen screen = dividendReinvestmentWelcomeScreen.exitScreen;
                screen.getClass();
                screenNavigator.goTo(new BlockersScreens.StartFlowEntryPointScreen(FlowStarter.startFlow$default((RealFlowStarter) flowStarter, BlockersData.Flow.CLIENT_SCENARIO, dividendReinvestmentWelcomeScreen, null, ClientScenario.PLASMA, null, screen, null, null, new FlowStarter$$ExternalSyntheticLambda0(26), 436), (String) null, (Screen) null, (BlockersScreens.StartFlowEntryPointScreen.Origin) null, 30));
            } else {
                screenNavigator.goTo(dividendReinvestmentWelcomeScreen.exitScreen);
            }
        } else {
            if (!Intrinsics.areEqual(dividendReinvestmentWelcomeViewEvent, DividendReinvestmentWelcomeViewEvent.LearnMoreClicked.INSTANCE)) {
                Path$$ExternalSyntheticBUOutline0.m$1(dividendReinvestmentWelcomeViewEvent, "Unexpected event ");
                return null;
            }
            screenNavigator.goTo(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) cardStudioPresenter.appConfig)).peekCurrentValue(LaunchDarklyFeatureFlags$SheetV3.INSTANCE)).enabled() ? InvestingScreens.DividendReinvestmentLearnMoreSheetV2.INSTANCE : InvestingScreens.DividendReinvestmentLearnMoreSheet.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$investing$presenters$holdings$InvestingEtfHoldingDetailsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        StockToggleToggleHoldingsDetailsGroup.Group group;
        ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.$view;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
        InvestingScreens.EtfHoldingsDetailsScreen etfHoldingsDetailsScreen = (InvestingScreens.EtfHoldingsDetailsScreen) shareSheetPresenter.modelUpdates;
        Analytics analytics = (Analytics) shareSheetPresenter.analytics;
        InvestingEtfHoldingDetailsViewEvent investingEtfHoldingDetailsViewEvent = (InvestingEtfHoldingDetailsViewEvent) obj;
        if (investingEtfHoldingDetailsViewEvent instanceof InvestingEtfHoldingDetailsViewEvent.TapHolding) {
            analytics.track(new StockSelectSelectHoldingsStock(etfHoldingsDetailsScreen.tickerSymbol), null);
            screenNavigator.goTo(new InvestingScreens.StockDetails(null, new InvestmentEntityToken(((InvestingEtfHoldingDetailsViewEvent.TapHolding) investingEtfHoldingDetailsViewEvent).token), StockViewViewStockDetails.InvestingScreenOrigin.CLIENT_ROUTE, null, null, false, 57));
        } else if (Intrinsics.areEqual(investingEtfHoldingDetailsViewEvent, InvestingEtfHoldingDetailsViewEvent.TapBack.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else {
            if (!(investingEtfHoldingDetailsViewEvent instanceof InvestingEtfHoldingDetailsViewEvent.ToggleInvestmentType)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String str = etfHoldingsDetailsScreen.tickerSymbol;
            InvestmentType investmentType = ((InvestingEtfHoldingDetailsViewEvent.ToggleInvestmentType) investingEtfHoldingDetailsViewEvent).f1164type;
            int ordinal = investmentType.ordinal();
            if (ordinal == 0) {
                group = StockToggleToggleHoldingsDetailsGroup.Group.HOLDINGS;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                group = StockToggleToggleHoldingsDetailsGroup.Group.SECTORS;
            }
            analytics.track(new StockToggleToggleHoldingsDetailsGroup(str, group), null);
            ((MutableState) this.$repeater).setValue(investmentType);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$investing$presenters$holdings$InvestingEtfHoldingsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        String str;
        String str2;
        MutableState mutableState = (MutableState) this.$repeater;
        InvestingEtfHoldingsPresenter investingEtfHoldingsPresenter = (InvestingEtfHoldingsPresenter) this.$view;
        BetterNavigator.ScreenNavigator screenNavigator = investingEtfHoldingsPresenter.navigator;
        Analytics analytics = investingEtfHoldingsPresenter.analytics;
        InvestingEtfHoldingsViewEvent investingEtfHoldingsViewEvent = (InvestingEtfHoldingsViewEvent) obj;
        if (investingEtfHoldingsViewEvent instanceof InvestingEtfHoldingsViewEvent.HoldingClicked) {
            StockDetails stockDetails = (StockDetails) mutableState.getValue();
            if (stockDetails != null && (str2 = stockDetails.symbol) != null) {
                analytics.track(new StockOpenOpenHoldingsDetailsStock(str2), null);
            }
            screenNavigator.goTo(new InvestingScreens.StockDetails(null, new InvestmentEntityToken(((InvestingEtfHoldingsViewEvent.HoldingClicked) investingEtfHoldingsViewEvent).token), StockViewViewStockDetails.InvestingScreenOrigin.CLIENT_ROUTE, null, null, false, 57));
        } else {
            if (!Intrinsics.areEqual(investingEtfHoldingsViewEvent, InvestingEtfHoldingsViewEvent.ShowMoreClicked.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            StockDetails stockDetails2 = (StockDetails) mutableState.getValue();
            if (stockDetails2 != null && (str = stockDetails2.symbol) != null) {
                analytics.track(new StockViewViewMoreHoldings(str), null);
            }
            InvestmentEntityToken investmentEntityToken = investingEtfHoldingsPresenter.args.investmentEntityToken;
            StockDetails stockDetails3 = (StockDetails) mutableState.getValue();
            stockDetails3.getClass();
            screenNavigator.goTo(new InvestingScreens.EtfHoldingsDetailsScreen(investmentEntityToken, stockDetails3.symbol));
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$investing$presenters$metrics$InvestingAnalystOpinionsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        if (!Intrinsics.areEqual((InvestingAnalystOpinionsViewEvent$MoreInfoClicked) obj, InvestingAnalystOpinionsViewEvent$MoreInfoClicked.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        BetterNavigator.ScreenNavigator screenNavigator = ((InvestingAnalystOpinionsPresenter) this.$view).navigator;
        InvestmentAnalystOpinions investmentAnalystOpinions = (InvestmentAnalystOpinions) ((MutableState) this.$repeater).getValue();
        investmentAnalystOpinions.getClass();
        Section.Row.MoreInfo moreInfo = investmentAnalystOpinions.more_info;
        moreInfo.getClass();
        screenNavigator.goTo(new InvestingScreens.MoreInfoSheet(moreInfo));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:547:0x09b8, code lost:
    
        if (((com.squareup.cash.history.presenters.CheckStatusPresenter.AnonymousClass1.C00611) r15).invoke(r1, r3) != r2) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x09a9, code lost:
    
        if (((kotlinx.coroutines.flow.FlowCollector) r14).emit(r1, r3) == r2) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x09fc, code lost:
    
        if (r4 == 0) goto L517;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0ae0  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0aeb  */
    /* JADX WARN: Type inference failed for: r14v14, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r14v7, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r14v8, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r14v9, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ReportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1 reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1;
        int i;
        String str;
        EnumListAdapter$encode$1 enumListAdapter$encode$1;
        ReportAbusePresenter$models$lambda$2$$inlined$map$1$2$1 reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1;
        int i2;
        String str2;
        EnumListAdapter$encode$1 enumListAdapter$encode$12;
        SkipPaymentPresenter$viewModels$$inlined$map$1$2$1 skipPaymentPresenter$viewModels$$inlined$map$1$2$1;
        int i3;
        RealRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1 realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1;
        int i4;
        RealInstrumentManager$forType$$inlined$map$1$2$1 realInstrumentManager$forType$$inlined$map$1$2$1;
        int i5;
        RealInstrumentManager$forTypes$$inlined$map$1$2$1 realInstrumentManager$forTypes$$inlined$map$1$2$1;
        int i6;
        InstrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1 instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1;
        int i7;
        SelectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1 selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1;
        int i8;
        boolean z;
        RealStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1 realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1;
        int i9;
        List list;
        BalanceTick balanceTick;
        String format2;
        StocksAppletTileModel.Installed.ChangeDirection changeDirection;
        PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1 persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1;
        int i10;
        RealEntityPriceRefresher$observe$$inlined$map$1$2$1 realEntityPriceRefresher$observe$$inlined$map$1$2$1;
        int i11;
        RealInvestmentEntities$stockDetails$$inlined$map$1$2$1 realInvestmentEntities$stockDetails$$inlined$map$1$2$1;
        int i12;
        RealAutoInvestRepo$preference$$inlined$filter$1$2$1 realAutoInvestRepo$preference$$inlined$filter$1$2$1;
        int i13;
        RealDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1 realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1;
        int i14;
        RealDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1 realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1;
        int i15;
        InvestingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1 investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1;
        int i16;
        StockViewOpenStockSearch.Source source;
        InvestingScreens.StockMetricTypePicker.MetricType metricType;
        String str3;
        StockViewViewStockDetails.InvestingScreenOrigin investingScreenOrigin;
        InvestingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1 investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1;
        int i17;
        Object obj2 = obj;
        int i18 = this.$r8$classId;
        int i19 = -1;
        int i20 = 0;
        Object obj3 = this.$view;
        Object obj4 = this.$repeater;
        ?? r4 = 0;
        r4 = null;
        r4 = null;
        PriceChangeViewModel priceChangeViewModel = null;
        String str4 = null;
        switch (i18) {
            case 0:
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) obj3;
                if (appCompatImageButton.isEnabled() && appCompatImageButton.isClickable()) {
                    appCompatImageButton.performClick();
                    appCompatImageButton.performHapticFeedback(3);
                } else {
                    StateFlowKt.emitOrThrow((SharedFlowImpl) ((EglCore) obj4).eglConfig, Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 1:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj4;
                AndroidStringManager androidStringManager = (AndroidStringManager) localHomePresenter.clearMarketingBadgesIfNeeded;
                HistoryScreens.ReportAbuseDialogScreen reportAbuseDialogScreen = (HistoryScreens.ReportAbuseDialogScreen) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
                if (continuation instanceof ReportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1) {
                    reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1 = (ReportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i21 = reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i21 & PKIFailureInfo.systemUnavail) != 0) {
                        reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1.label = i21 - PKIFailureInfo.systemUnavail;
                        Object obj5 = reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            FlowCollector flowCollector = (FlowCollector) obj3;
                            String str5 = (String) obj2;
                            if (str5 == null) {
                                str5 = (String) reportAbuseDialogScreen.customerFirstName.getValue();
                            }
                            if (str5 != null) {
                                boolean z2 = reportAbuseDialogScreen.block;
                                FormattedResources formattedResources = FormattedResources.INSTANCE;
                                if (z2) {
                                    enumListAdapter$encode$1 = new EnumListAdapter$encode$1(1, formattedResources, FormattedResources.class, "activity_report_abuse_title", "activity_report_abuse_title(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 15);
                                } else {
                                    if (z2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    enumListAdapter$encode$1 = new EnumListAdapter$encode$1(1, formattedResources, FormattedResources.class, "activity_unreport_abuse_title", "activity_unreport_abuse_title(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 16);
                                }
                                str = androidStringManager.getString((FormattedResource) enumListAdapter$encode$1.invoke(str5));
                            } else {
                                str = androidStringManager.get(reportAbuseDialogScreen.block ? R.string.activity_report_abuse_title_no_name : R.string.activity_unreport_abuse_title_no_name);
                            }
                            reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons) {
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
                reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1 = new ReportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj52 = reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reportAbuseDialogPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            case 2:
                LocalHomePresenter localHomePresenter2 = (LocalHomePresenter) obj4;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) localHomePresenter2.clearMarketingBadgesIfNeeded;
                HistoryScreens.ReportAbuse reportAbuse = (HistoryScreens.ReportAbuse) localHomePresenter2.neighborhoodsTabContentEnabled$delegate;
                if (continuation instanceof ReportAbusePresenter$models$lambda$2$$inlined$map$1$2$1) {
                    reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1 = (ReportAbusePresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i22 = reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i22 & PKIFailureInfo.systemUnavail) != 0) {
                        reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1.label = i22 - PKIFailureInfo.systemUnavail;
                        Object obj6 = reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            FlowCollector flowCollector2 = (FlowCollector) obj3;
                            String str6 = (String) obj2;
                            if (str6 == null) {
                                str6 = (String) reportAbuse.customerName.getValue();
                            }
                            if (str6 != null) {
                                boolean z3 = reportAbuse.block;
                                FormattedResources formattedResources2 = FormattedResources.INSTANCE;
                                if (z3) {
                                    enumListAdapter$encode$12 = new EnumListAdapter$encode$1(1, formattedResources2, FormattedResources.class, "activity_report_abuse_title", "activity_report_abuse_title(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 17);
                                } else {
                                    if (z3) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    enumListAdapter$encode$12 = new EnumListAdapter$encode$1(1, formattedResources2, FormattedResources.class, "activity_unreport_abuse_title", "activity_unreport_abuse_title(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 18);
                                }
                                str2 = androidStringManager2.getString((FormattedResource) enumListAdapter$encode$12.invoke(str6));
                            } else {
                                str2 = androidStringManager2.get(reportAbuse.block ? R.string.activity_report_abuse_title_no_name : R.string.activity_unreport_abuse_title_no_name);
                            }
                            reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector2.emit(str2, reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj6);
                        }
                        return Unit.INSTANCE;
                    }
                }
                reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1 = new ReportAbusePresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj62 = reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = reportAbusePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 3:
                if (continuation instanceof SkipPaymentPresenter$viewModels$$inlined$map$1$2$1) {
                    skipPaymentPresenter$viewModels$$inlined$map$1$2$1 = (SkipPaymentPresenter$viewModels$$inlined$map$1$2$1) continuation;
                    int i23 = skipPaymentPresenter$viewModels$$inlined$map$1$2$1.label;
                    if ((i23 & PKIFailureInfo.systemUnavail) != 0) {
                        skipPaymentPresenter$viewModels$$inlined$map$1$2$1.label = i23 - PKIFailureInfo.systemUnavail;
                        Object obj7 = skipPaymentPresenter$viewModels$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = skipPaymentPresenter$viewModels$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            FlowCollector flowCollector3 = (FlowCollector) obj3;
                            String str7 = ((RenderedPayment) obj2).historyData.confirm_cancellation_text;
                            if (str7 != null) {
                                if (!StringsKt.isBlank(str7)) {
                                    r4 = str7;
                                    break;
                                }
                            }
                            r4 = ((AndroidStringManager) ((LocalPosCheckInPresenter) obj4).stringManager).get(R.string.history_skip_loan_payment_default_message);
                            SkipPaymentViewModel skipPaymentViewModel = new SkipPaymentViewModel(r4);
                            skipPaymentPresenter$viewModels$$inlined$map$1$2$1.label = 1;
                            if (flowCollector3.emit(skipPaymentViewModel, skipPaymentPresenter$viewModels$$inlined$map$1$2$1) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj7);
                        }
                        return Unit.INSTANCE;
                    }
                }
                skipPaymentPresenter$viewModels$$inlined$map$1$2$1 = new SkipPaymentPresenter$viewModels$$inlined$map$1$2$1(this, continuation);
                Object obj72 = skipPaymentPresenter$viewModels$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = skipPaymentPresenter$viewModels$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
                return Unit.INSTANCE;
            case 4:
                if (continuation instanceof RealRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1) {
                    realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1 = (RealRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1) continuation;
                    int i24 = realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.label;
                    if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                        realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.label = i24 - PKIFailureInfo.systemUnavail;
                        Object obj8 = realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.L$2 = obj2;
                            realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.I$0 = 0;
                            realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.label = 1;
                            break;
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    SafeTrace.throwOnFailure(obj8);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i20 = realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.I$0;
                            obj2 = realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.L$2;
                            SafeTrace.throwOnFailure(obj8);
                        }
                        realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.L$2 = null;
                        realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.I$0 = i20;
                        realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.label = 2;
                        break;
                    }
                }
                realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1 = new RealRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1(this, continuation);
                Object obj82 = realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.label;
                if (i4 != 0) {
                }
                realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.L$2 = null;
                realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.I$0 = i20;
                realRequestReviewFlagWrapperKt$onAfterEach$$inlined$transform$1$1$1.label = 2;
            case 5:
                MusicPresenter musicPresenter = (MusicPresenter) obj3;
                if (!Intrinsics.areEqual((FinishSetupAppletTileViewEvent$FinishSetupOnClickTile) obj2, FinishSetupAppletTileViewEvent$FinishSetupOnClickTile.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) musicPresenter.args)).submitSelectItemEvent(ItemId.FINISH_SETUP.INSTANCE, null, MoneySelectAction.TAP);
                RealRouter realRouter = (RealRouter) musicPresenter.navigator;
                FinishSetupTileV1 finishSetupTileV1 = (FinishSetupTileV1) ((State) obj4).getValue();
                realRouter.route(new RoutingParams(RealMoneyNavigatorHelper.moneyTabScreen(), null, null, null, null, null, 510), finishSetupTileV1 != null ? finishSetupTileV1.client_route : null);
                return Unit.INSTANCE;
            case 6:
                if (continuation instanceof RealInstrumentManager$forType$$inlined$map$1$2$1) {
                    realInstrumentManager$forType$$inlined$map$1$2$1 = (RealInstrumentManager$forType$$inlined$map$1$2$1) continuation;
                    int i25 = realInstrumentManager$forType$$inlined$map$1$2$1.label;
                    if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                        realInstrumentManager$forType$$inlined$map$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                        Object obj9 = realInstrumentManager$forType$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realInstrumentManager$forType$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            ?? r14 = (FlowCollector) obj3;
                            List list2 = (List) obj2;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj10 : list2) {
                                if (((Instrument) obj10).cashInstrumentType == ((CashInstrumentType) obj4)) {
                                    arrayList.add(obj10);
                                }
                            }
                            realInstrumentManager$forType$$inlined$map$1$2$1.label = 1;
                            if (r14.emit(arrayList, realInstrumentManager$forType$$inlined$map$1$2$1) == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                        } else {
                            if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj9);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realInstrumentManager$forType$$inlined$map$1$2$1 = new RealInstrumentManager$forType$$inlined$map$1$2$1(this, continuation);
                Object obj92 = realInstrumentManager$forType$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realInstrumentManager$forType$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
                return Unit.INSTANCE;
            case 7:
                if (continuation instanceof RealInstrumentManager$forTypes$$inlined$map$1$2$1) {
                    realInstrumentManager$forTypes$$inlined$map$1$2$1 = (RealInstrumentManager$forTypes$$inlined$map$1$2$1) continuation;
                    int i26 = realInstrumentManager$forTypes$$inlined$map$1$2$1.label;
                    if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                        realInstrumentManager$forTypes$$inlined$map$1$2$1.label = i26 - PKIFailureInfo.systemUnavail;
                        Object obj11 = realInstrumentManager$forTypes$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realInstrumentManager$forTypes$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            ?? r142 = (FlowCollector) obj3;
                            List list3 = (List) obj2;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj12 : list3) {
                                if (ArraysKt___ArraysKt.contains((CashInstrumentType[]) obj4, ((Instrument) obj12).cashInstrumentType)) {
                                    arrayList2.add(obj12);
                                }
                            }
                            realInstrumentManager$forTypes$$inlined$map$1$2$1.label = 1;
                            if (r142.emit(arrayList2, realInstrumentManager$forTypes$$inlined$map$1$2$1) == coroutineSingletons7) {
                                return coroutineSingletons7;
                            }
                        } else {
                            if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj11);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realInstrumentManager$forTypes$$inlined$map$1$2$1 = new RealInstrumentManager$forTypes$$inlined$map$1$2$1(this, continuation);
                Object obj112 = realInstrumentManager$forTypes$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realInstrumentManager$forTypes$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
                return Unit.INSTANCE;
            case 8:
                if (continuation instanceof InstrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1) {
                    instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1 = (InstrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1) continuation;
                    int i27 = instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1.label;
                    if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                        instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1.label = i27 - PKIFailureInfo.systemUnavail;
                        Object obj13 = instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            ?? r143 = (FlowCollector) obj3;
                            List<SelectPaymentInstrumentOption> list4 = ((SelectPaymentInstrumentOptions) obj2).options;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                            for (SelectPaymentInstrumentOption selectPaymentInstrumentOption : list4) {
                                TransfersPresenter transfersPresenter = (TransfersPresenter) obj4;
                                InstrumentSelectionScreen instrumentSelectionScreen = (InstrumentSelectionScreen) transfersPresenter.initialTab;
                                arrayList3.add(PrfAesCmac.toPaymentInstrument(selectPaymentInstrumentOption, instrumentSelectionScreen.amount, instrumentSelectionScreen.recipients, transfersPresenter.stringManager, (LocalizedMoneyFormatter.Factory) transfersPresenter.demandDepositAccountManager));
                            }
                            instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1.label = 1;
                            if (r143.emit(arrayList3, instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1) == coroutineSingletons8) {
                                return coroutineSingletons8;
                            }
                        } else {
                            if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj13);
                        }
                        return Unit.INSTANCE;
                    }
                }
                instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1 = new InstrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1(this, continuation);
                Object obj132 = instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = instrumentSelectionPresenter$loadInstruments$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
                return Unit.INSTANCE;
            case 9:
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj4;
                AndroidStringManager androidStringManager3 = (AndroidStringManager) localCashBalancePresenter.stringManager;
                SelectPaymentInstrumentArgs selectPaymentInstrumentArgs = (SelectPaymentInstrumentArgs) localCashBalancePresenter.clock;
                if (continuation instanceof SelectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1) {
                    selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1 = (SelectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1) continuation;
                    int i28 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1.label;
                    if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                        selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1.label = i28 - PKIFailureInfo.systemUnavail;
                        Object obj14 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            FlowCollector flowCollector4 = (FlowCollector) obj3;
                            SelectPaymentInstrumentOptions selectPaymentInstrumentOptions = (SelectPaymentInstrumentOptions) obj2;
                            if (selectPaymentInstrumentArgs.getShowDisabledOptions()) {
                                str4 = androidStringManager3.get(R.string.select_payment_instrument_prompt);
                            } else if (selectPaymentInstrumentOptions.insufficientBalance) {
                                String format3 = ((MoneyFormatter) localCashBalancePresenter.timestampFormatter).format(selectPaymentInstrumentOptions.totalAmount);
                                format3.getClass();
                                Resources resources = androidStringManager3.resources;
                                resources.getClass();
                                str4 = new MessageFormat(resources.getString(R.string.insufficient_balance)).format(new Object[]{format3});
                                str4.getClass();
                            } else if (selectPaymentInstrumentArgs.getConfirmingPayment()) {
                                str4 = androidStringManager3.get(R.string.history_confirm_message);
                            } else if (selectPaymentInstrumentArgs.isRequest()) {
                                str4 = androidStringManager3.get(R.string.history_request_message);
                            }
                            List list5 = selectPaymentInstrumentOptions.options;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(PrfAesCmac.toPaymentInstrument((SelectPaymentInstrumentOption) it.next(), selectPaymentInstrumentArgs.getAmount(), selectPaymentInstrumentArgs.getRecipients(), androidStringManager3, (LocalizedMoneyFormatter.Factory) localCashBalancePresenter.screen));
                            }
                            SelectPaymentInstrumentViewModel selectPaymentInstrumentViewModel = new SelectPaymentInstrumentViewModel(str4, arrayList4, -1);
                            selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1.label = 1;
                            if (flowCollector4.emit(selectPaymentInstrumentViewModel, selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1) == coroutineSingletons9) {
                                return coroutineSingletons9;
                            }
                        } else {
                            if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj14);
                        }
                        return Unit.INSTANCE;
                    }
                }
                selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1 = new SelectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1(this, continuation);
                Object obj142 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = selectPaymentInstrumentPresenter$initialModel$$inlined$map$2$2$1.label;
                if (i8 != 0) {
                }
                return Unit.INSTANCE;
            case 10:
                SelectPaymentInstrumentViewModel selectPaymentInstrumentViewModel2 = (SelectPaymentInstrumentViewModel) obj2;
                MutableState mutableState = (MutableState) obj4;
                List list6 = selectPaymentInstrumentViewModel2.instruments;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj15 : list6) {
                    if (!(((SelectPaymentInstrumentViewModel.PaymentInstrument) obj15) instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument)) {
                        arrayList5.add(obj15);
                    }
                }
                SelectPaymentInstrumentArgs selectPaymentInstrumentArgs2 = (SelectPaymentInstrumentArgs) ((LocalCashBalancePresenter) obj3).clock;
                Iterator it2 = arrayList5.iterator();
                int i29 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument) it2.next();
                        if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) {
                            z = Intrinsics.areEqual(((SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) paymentInstrument).instrument.token, selectPaymentInstrumentArgs2.getSelectedInstrumentToken());
                        } else if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) {
                            z = Intrinsics.areEqual(((SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) paymentInstrument).balance.token, selectPaymentInstrumentArgs2.getSelectedInstrumentToken());
                        } else {
                            if (!(paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            z = false;
                        }
                        if (z) {
                            i19 = i29;
                        } else {
                            i29++;
                        }
                    }
                }
                String str8 = selectPaymentInstrumentViewModel2.title;
                List list7 = selectPaymentInstrumentViewModel2.instruments;
                list7.getClass();
                mutableState.setValue(new SelectPaymentInstrumentViewModel(str8, list7, i19));
                return Unit.INSTANCE;
            case 11:
                RealStocksAppletTilePriceMovementRepository realStocksAppletTilePriceMovementRepository = (RealStocksAppletTilePriceMovementRepository) obj4;
                if (continuation instanceof RealStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1) {
                    realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1 = (RealStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1) continuation;
                    int i30 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1.label;
                    if ((i30 & PKIFailureInfo.systemUnavail) != 0) {
                        realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1.label = i30 - PKIFailureInfo.systemUnavail;
                        Object obj16 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            FlowCollector flowCollector5 = (FlowCollector) obj3;
                            Triple triple = (Triple) obj2;
                            PolledData polledData = (PolledData) triple.first;
                            PolledData polledData2 = (PolledData) triple.second;
                            boolean booleanValue = ((Boolean) triple.third).booleanValue();
                            Lazy lazy = realStocksAppletTilePriceMovementRepository.appletTilePriceTickFormatter;
                            GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) polledData.value;
                            HistoricalRange historicalRange = RealStocksAppletTilePriceMovementRepository.STOCKS_RANGE;
                            getPortfoliosHistoricalDataResponse.getClass();
                            historicalRange.getClass();
                            BalanceHistory balanceHistory = getPortfoliosHistoricalDataResponse.balance_history;
                            if (balanceHistory != null && (list = balanceHistory.balance_ticks) != null && (balanceTick = (BalanceTick) CollectionsKt.last(list)) != null) {
                                Long l = balanceTick.gain_bps;
                                l.getClass();
                                BigDecimal stripTrailingZeros = new BigDecimal(l.longValue()).divide(BigDecimal.valueOf(100L), 2, RoundingMode.HALF_UP).stripTrailingZeros();
                                Long l2 = balanceTick.amount_cents;
                                long longValue = l2 != null ? l2.longValue() : 0L;
                                BigDecimal abs = stripTrailingZeros.abs();
                                abs.getClass();
                                String concat = BigDecimalsKt.toPrettyString(abs, false).concat("%");
                                Long l3 = balanceTick.time_sec;
                                l3.getClass();
                                long longValue2 = l3.longValue();
                                AndroidStringManager androidStringManager4 = (AndroidStringManager) lazy.value;
                                AndroidClock androidClock = (AndroidClock) lazy.initializer;
                                ZoneId of = ZoneId.of(androidClock.timeZone().getID());
                                ZonedDateTime atZone = Instant.ofEpochSecond(longValue2).atZone(of);
                                if (Intrinsics.areEqual(atZone.toLocalDate(), Instant.ofEpochMilli(androidClock.millis()).atZone(of).toLocalDate())) {
                                    format2 = androidStringManager4.get(R.string.price_change_day_text);
                                } else {
                                    format2 = DateTimeFormatter.ofPattern("EEEE", Locale.US).format(atZone);
                                    format2.getClass();
                                }
                                String str9 = format2;
                                int signum = stripTrailingZeros.signum();
                                if (signum == -1) {
                                    changeDirection = StocksAppletTileModel.Installed.ChangeDirection.DOWN;
                                } else if (signum == 0) {
                                    changeDirection = StocksAppletTileModel.Installed.ChangeDirection.ZERO;
                                } else {
                                    if (signum != 1) {
                                        Path$$ExternalSyntheticBUOutline0.m$2();
                                        return null;
                                    }
                                    changeDirection = StocksAppletTileModel.Installed.ChangeDirection.UP;
                                }
                                priceChangeViewModel = new PriceChangeViewModel(longValue, concat, changeDirection, str9);
                            }
                            Object obj17 = RealStocksAppletTileRepository$StocksModel$Installed$LoadingPriceMovement.INSTANCE;
                            if (priceChangeViewModel != null) {
                                GraphPresenterData presenterDataFor = realStocksAppletTilePriceMovementRepository.graphCalculator.presenterDataFor((GetPortfoliosHistoricalDataResponse) polledData.value, historicalRange, (polledData.isStale || polledData2.isStale) ? InvestingGraphContentModel$AccentColorType$StaleData.INSTANCE : new InvestingGraphContentModel$AccentColorType$UptoDateData(ColorModel.Investing.INSTANCE), booleanValue, new Float(RecyclerView.DECELERATION_RATE));
                                if (presenterDataFor != null) {
                                    InvestingGraphContentModel investingGraphContentModel = presenterDataFor.contentModel;
                                    boolean z4 = investingGraphContentModel instanceof InvestingGraphContentModel.Error;
                                    long j = priceChangeViewModel.amountCents;
                                    obj17 = z4 ? new RealStocksAppletTileRepository$StocksModel$Installed$GraphError(j) : new RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement(j, priceChangeViewModel.percentText, priceChangeViewModel.rangeText, priceChangeViewModel.changeDirection, investingGraphContentModel);
                                }
                            }
                            realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1.label = 1;
                            if (flowCollector5.emit(obj17, realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1) == coroutineSingletons10) {
                                return coroutineSingletons10;
                            }
                        } else {
                            if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj16);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1 = new RealStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1(this, continuation);
                Object obj162 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = realStocksAppletTilePriceMovementRepository$models$$inlined$map$2$2$1.label;
                if (i9 != 0) {
                }
                return Unit.INSTANCE;
            case 12:
                if (continuation instanceof PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1) {
                    persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1 = (PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1) continuation;
                    int i31 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1.label;
                    if ((i31 & PKIFailureInfo.systemUnavail) != 0) {
                        persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1.label = i31 - PKIFailureInfo.systemUnavail;
                        Object obj18 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse2 = (GetPortfoliosHistoricalDataResponse) obj2;
                            Cache cache = ((PersistentHistoricalDataCache) obj4).portfoliosHistoricalDataResponseCache;
                            getPortfoliosHistoricalDataResponse2.getClass();
                            cache.cache = getPortfoliosHistoricalDataResponse2;
                            persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1.label = 1;
                            if (((FlowCollector) obj3).emit(getPortfoliosHistoricalDataResponse2, persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1) == coroutineSingletons11) {
                                return coroutineSingletons11;
                            }
                        } else {
                            if (i10 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj18);
                        }
                        return Unit.INSTANCE;
                    }
                }
                persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1 = new PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1(this, continuation);
                Object obj182 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$3$2$1.label;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            case 13:
                if (continuation instanceof RealEntityPriceRefresher$observe$$inlined$map$1$2$1) {
                    realEntityPriceRefresher$observe$$inlined$map$1$2$1 = (RealEntityPriceRefresher$observe$$inlined$map$1$2$1) continuation;
                    int i32 = realEntityPriceRefresher$observe$$inlined$map$1$2$1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        realEntityPriceRefresher$observe$$inlined$map$1$2$1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj19 = realEntityPriceRefresher$observe$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = realEntityPriceRefresher$observe$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            ?? r144 = (FlowCollector) obj3;
                            Map map = (Map) obj2;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (((HashSet) obj4).contains((InvestmentEntityToken) entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            realEntityPriceRefresher$observe$$inlined$map$1$2$1.label = 1;
                            if (r144.emit(linkedHashMap, realEntityPriceRefresher$observe$$inlined$map$1$2$1) == coroutineSingletons12) {
                                return coroutineSingletons12;
                            }
                        } else {
                            if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj19);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realEntityPriceRefresher$observe$$inlined$map$1$2$1 = new RealEntityPriceRefresher$observe$$inlined$map$1$2$1(this, continuation);
                Object obj192 = realEntityPriceRefresher$observe$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = realEntityPriceRefresher$observe$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
                return Unit.INSTANCE;
            case 14:
                if (continuation instanceof RealInvestmentEntities$stockDetails$$inlined$map$1$2$1) {
                    realInvestmentEntities$stockDetails$$inlined$map$1$2$1 = (RealInvestmentEntities$stockDetails$$inlined$map$1$2$1) continuation;
                    int i33 = realInvestmentEntities$stockDetails$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        realInvestmentEntities$stockDetails$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj20 = realInvestmentEntities$stockDetails$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realInvestmentEntities$stockDetails$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            Object obj21 = ((Map) ((PolledData) obj2).value).get((InvestmentEntityToken) obj4);
                            realInvestmentEntities$stockDetails$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj3).emit(obj21, realInvestmentEntities$stockDetails$$inlined$map$1$2$1) == coroutineSingletons13) {
                                return coroutineSingletons13;
                            }
                        } else {
                            if (i12 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj20);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realInvestmentEntities$stockDetails$$inlined$map$1$2$1 = new RealInvestmentEntities$stockDetails$$inlined$map$1$2$1(this, continuation);
                Object obj202 = realInvestmentEntities$stockDetails$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = realInvestmentEntities$stockDetails$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
                return Unit.INSTANCE;
            case 15:
                if (continuation instanceof RealAutoInvestRepo$preference$$inlined$filter$1$2$1) {
                    realAutoInvestRepo$preference$$inlined$filter$1$2$1 = (RealAutoInvestRepo$preference$$inlined$filter$1$2$1) continuation;
                    int i34 = realAutoInvestRepo$preference$$inlined$filter$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        realAutoInvestRepo$preference$$inlined$filter$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj22 = realAutoInvestRepo$preference$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = realAutoInvestRepo$preference$$inlined$filter$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj22);
                            FlowCollector flowCollector6 = (FlowCollector) obj3;
                            ScheduledTransactionPreference scheduledTransactionPreference = (ScheduledTransactionPreference) obj2;
                            if ((scheduledTransactionPreference != null ? scheduledTransactionPreference.type : null) == ((ScheduledTransactionPreference.Type) obj4)) {
                                realAutoInvestRepo$preference$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector6.emit(obj2, realAutoInvestRepo$preference$$inlined$filter$1$2$1) == coroutineSingletons14) {
                                    return coroutineSingletons14;
                                }
                            }
                        } else {
                            if (i13 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj22);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realAutoInvestRepo$preference$$inlined$filter$1$2$1 = new RealAutoInvestRepo$preference$$inlined$filter$1$2$1(this, continuation);
                Object obj222 = realAutoInvestRepo$preference$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = realAutoInvestRepo$preference$$inlined$filter$1$2$1.label;
                if (i13 != 0) {
                }
                return Unit.INSTANCE;
            case 16:
                if (continuation instanceof RealDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1) {
                    realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1 = (RealDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1) continuation;
                    int i35 = realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj23 = realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj23);
                            FlowCollector flowCollector7 = (FlowCollector) obj3;
                            boolean z5 = ((PolledData) obj2).isStale;
                            Map map2 = (Map) obj4;
                            ArrayList arrayList6 = new ArrayList(map2.size());
                            Iterator it3 = map2.entrySet().iterator();
                            while (it3.hasNext()) {
                                InvestmentEntityWithPrice investmentEntityWithPrice = ((StockDetails) ((Map.Entry) it3.next()).getKey()).entityWithPrice;
                                arrayList6.add(new InvestmentEntityWithPrice.Following(investmentEntityWithPrice.getId(), investmentEntityWithPrice.getToken(), investmentEntityWithPrice.getDisplayName(), investmentEntityWithPrice.getIcon(), investmentEntityWithPrice.getPrice(), investmentEntityWithPrice.getSymbol(), investmentEntityWithPrice.getAccentColor(), investmentEntityWithPrice.getDelisted(), investmentEntityWithPrice.getMarketCap(), investmentEntityWithPrice.getReleaseStage()));
                            }
                            PolledData polledData3 = new PolledData(arrayList6, z5);
                            realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1.label = 1;
                            if (flowCollector7.emit(polledData3, realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1) == coroutineSingletons15) {
                                return coroutineSingletons15;
                            }
                        } else {
                            if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj23);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1 = new RealDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1(this, continuation);
                Object obj232 = realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = realDependentInvestmentEntities$getFollowingStocks$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
                return Unit.INSTANCE;
            case 17:
                if (continuation instanceof RealDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1) {
                    realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1 = (RealDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i36 = realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj24 = realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            Pair pair = new Pair((StockDetails) obj2, (SyncInvestmentHolding) obj4);
                            realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj3).emit(pair, realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons16) {
                                return coroutineSingletons16;
                            }
                        } else {
                            if (i15 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj24);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1 = new RealDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj242 = realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = realDependentInvestmentEntities$getInvestmentDetailsMap$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
                return Unit.INSTANCE;
            case 18:
                if (continuation instanceof InvestingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1) {
                    investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1 = (InvestingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1) continuation;
                    int i37 = investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj25 = investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj25);
                            InvestingHomeViewEvent.SelectHistoricalRange selectHistoricalRange = (InvestingHomeViewEvent.SelectHistoricalRange) obj2;
                            Cache cache2 = (Cache) ((SelectCustomerPresenter) obj4).inputFieldTextSaver;
                            selectHistoricalRange.getClass();
                            cache2.cache = selectHistoricalRange;
                            investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj3).emit(selectHistoricalRange, investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1) == coroutineSingletons17) {
                                return coroutineSingletons17;
                            }
                        } else {
                            if (i16 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj25);
                        }
                        return Unit.INSTANCE;
                    }
                }
                investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1 = new InvestingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1(this, continuation);
                Object obj252 = investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = investingDiscoveryPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                if (i16 != 0) {
                }
                return Unit.INSTANCE;
            case 19:
                ProfilePresenter profilePresenter = (ProfilePresenter) obj4;
                InvestingScreens.InvestingHome investingHome = (InvestingScreens.InvestingHome) profilePresenter.profileDetailsProvider;
                Analytics analytics = profilePresenter.analytics;
                BetterNavigator.ScreenNavigator screenNavigator = profilePresenter.navigator;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                InvestingHomeViewEvent investingHomeViewEvent = (InvestingHomeViewEvent) obj2;
                if (investingHomeViewEvent instanceof InvestingHomeViewEvent.SelectStock) {
                    InvestingHomeViewEvent.SelectStock selectStock = (InvestingHomeViewEvent.SelectStock) investingHomeViewEvent;
                    DeflateUtils deflateUtils = selectStock.source;
                    boolean z6 = deflateUtils instanceof StockSource$Discovery;
                    StockSource$Welcome stockSource$Welcome = StockSource$Welcome.INSTANCE;
                    StockSource$SearchResult stockSource$SearchResult = StockSource$SearchResult.INSTANCE;
                    StockSource$Portfolio stockSource$Portfolio = StockSource$Portfolio.INSTANCE;
                    StockSource$Following stockSource$Following = StockSource$Following.INSTANCE;
                    if (z6) {
                        str3 = ((StockSource$Discovery) deflateUtils).analyticsSource;
                    } else if (deflateUtils.equals(stockSource$Following)) {
                        str3 = "Following";
                    } else if (deflateUtils.equals(stockSource$Portfolio)) {
                        str3 = "Stocks Owned";
                    } else {
                        if (!deflateUtils.equals(stockSource$SearchResult) && !deflateUtils.equals(stockSource$Welcome)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str3 = null;
                    }
                    analytics.track(new StockSelectSelectStock(str3), null);
                    boolean z7 = investingHome.dependentCustomerToken != null;
                    InvestmentEntityToken investmentEntityToken = selectStock.token;
                    if (z6 || deflateUtils.equals(stockSource$Following) || deflateUtils.equals(stockSource$Portfolio)) {
                        investingScreenOrigin = StockViewViewStockDetails.InvestingScreenOrigin.HOME;
                    } else if (deflateUtils.equals(stockSource$SearchResult)) {
                        investingScreenOrigin = StockViewViewStockDetails.InvestingScreenOrigin.SEARCH;
                    } else {
                        if (!deflateUtils.equals(stockSource$Welcome)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        investingScreenOrigin = StockViewViewStockDetails.InvestingScreenOrigin.WELCOME_TILES;
                    }
                    screenNavigator.goTo(new InvestingScreens.StockDetails(null, investmentEntityToken, investingScreenOrigin, null, null, z7, 25));
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.ClickStockMetric) {
                    long j2 = ((InvestingHomeViewEvent.ClickStockMetric) investingHomeViewEvent).headerId;
                    if (j2 == -2) {
                        metricType = InvestingScreens.StockMetricTypePicker.MetricType.PORTFOLIO;
                    } else {
                        if (j2 != -3) {
                            throw new IllegalAccessException(Recorder$$ExternalSyntheticOutline2.m(j2, "No metric type for the header "));
                        }
                        metricType = InvestingScreens.StockMetricTypePicker.MetricType.FOLLOWING;
                    }
                    analytics.track(new StockOpenOpenSortBy(), null);
                    screenNavigator.goTo(new InvestingScreens.StockMetricTypePicker(metricType, investingHome.dependentCustomerToken != null));
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.DisclosureClicked) {
                    analytics.track(new StockSelectSelectDisclosures(StockSelectSelectDisclosures.DisclosureOrigin.HOME), null);
                    ((IntentLauncher) profilePresenter.favoritesManager).launchUrlInInternalBrowser(((InvestingHomeViewEvent.DisclosureClicked) investingHomeViewEvent).url);
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.MyFirstStockClicked) {
                    JobKt.launch$default(coroutineScope, null, null, new CheckStatusPresenter.AnonymousClass1.C00611(profilePresenter, investingHomeViewEvent, r4, 28), 3);
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.ShowPortfolioPerformance) {
                    analytics.track(new StockSelectSelectMyInvestmentsDetails(), null);
                    screenNavigator.goTo(new InvestingScreens.PerformanceScreens.PortfolioPerformanceScreen(investingHome.dependentCustomerToken));
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.SettingsMenuIconClicked) {
                    screenNavigator.goTo(InvestingScreens.InvestingSettingsScreen.INSTANCE);
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.StocksTransferStatusTileClicked) {
                    screenNavigator.goTo(InvestingScreens.StocksTransferEtaScreen.INSTANCE);
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.PendingTradesTileViewAllClicked) {
                    screenNavigator.goTo(HistoryScreens.InvestingPendingTransactionsScreen.INSTANCE);
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.Close) {
                    screenNavigator.goTo(Back.INSTANCE);
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.SearchClicked) {
                    InvestingHomeViewEvent.SearchClicked.Source source2 = ((InvestingHomeViewEvent.SearchClicked) investingHomeViewEvent).source;
                    int ordinal = source2.ordinal();
                    if (ordinal == 0) {
                        source = StockViewOpenStockSearch.Source.NEW_CUSTOMER_CTA_BUTTON;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        source = StockViewOpenStockSearch.Source.PORTFOLIO_SEARCH_BAR;
                    }
                    analytics.track(new StockViewOpenStockSearch(source), null);
                    screenNavigator.goTo(new InvestingScreens.InvestingSearch(source2 == InvestingHomeViewEvent.SearchClicked.Source.PORTFOLIO_SEARCH_BAR));
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.SelectCategory) {
                    JobKt.launch$default(coroutineScope, null, null, new CheckStatusPresenter.AnonymousClass1(profilePresenter, investingHomeViewEvent, r4, 20), 3);
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.ScrollEvent) {
                    ScrollPerformanceAnalyzer scrollPerformanceAnalyzer = (ScrollPerformanceAnalyzer) profilePresenter.genericProfileElementsPresenter;
                    scrollPerformanceAnalyzer.start();
                    if (scrollPerformanceAnalyzer.running) {
                        scrollPerformanceAnalyzer.renderedFramesCountdown = 5;
                    }
                } else if (investingHomeViewEvent instanceof InvestingHomeViewEvent.DependentDisabledStateCtaClicked) {
                    String str10 = investingHome.dependentCustomerToken;
                    str10.getClass();
                    screenNavigator.goTo(new DependentControlsAndLimitsScreen(str10, false));
                } else if (!(investingHomeViewEvent instanceof InvestingHomeViewEvent.NewsEvent) && !(investingHomeViewEvent instanceof InvestingHomeViewEvent.SelectHistoricalRange) && !(investingHomeViewEvent instanceof InvestingHomeViewEvent.DependentAutoInvestClicked) && !(investingHomeViewEvent instanceof InvestingHomeViewEvent.ScrubPoint) && !Intrinsics.areEqual(investingHomeViewEvent, InvestingHomeViewEvent.DependentAutoInvestInfoClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 20:
                InvestingPortfolioPresenter investingPortfolioPresenter = (InvestingPortfolioPresenter) obj4;
                if (continuation instanceof InvestingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1) {
                    investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1 = (InvestingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                    int i38 = investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj26 = investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            FlowCollector flowCollector8 = (FlowCollector) obj3;
                            InvestingHomeViewEvent.SelectHistoricalRange selectHistoricalRange2 = (InvestingHomeViewEvent.SelectHistoricalRange) obj2;
                            int i39 = InvestingPortfolioPresenter.$r8$clinit;
                            if (investingPortfolioPresenter.isDependentPortfolio()) {
                                RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager = investingPortfolioPresenter.dependentBalanceDetailerLogger;
                                HistoricalRange historicalRange2 = selectHistoricalRange2.range;
                                historicalRange2.getClass();
                                String customerToken = realDependentBalanceDetailLoggingManager.dependentCustomerTokenRepository.getCustomerToken();
                                if (customerToken != null) {
                                    realDependentBalanceDetailLoggingManager.analytics.track(new SponsoredAccountBalanceDetailGraphTimeUnitChange(DependentBalanceType.Stock, customerToken, RealDependentBalanceDetailLoggingManager.mapHistoricalRange(historicalRange2)), null);
                                }
                            }
                            investingPortfolioPresenter.rangeSelectionCache.cache = new InvestingHomeViewEvent.SelectHistoricalRange(selectHistoricalRange2.range);
                            HistoricalRange historicalRange3 = selectHistoricalRange2.range;
                            investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector8.emit(historicalRange3, investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons18) {
                                return coroutineSingletons18;
                            }
                        } else {
                            if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj26);
                        }
                        return Unit.INSTANCE;
                    }
                }
                investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1 = new InvestingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj262 = investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = investingPortfolioPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
                return Unit.INSTANCE;
            case 21:
                return emit$com$squareup$cash$investing$presenters$StockMetricTypePickerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 22:
                return emit$com$squareup$cash$investing$presenters$autoinvest$InvestingRecurringFrequencyPickerFullPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 23:
                return emit$com$squareup$cash$investing$presenters$categories$InvestingCategoryDetailPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 24:
                return emit$com$squareup$cash$investing$presenters$categories$InvestingFilterCategoriesPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 25:
                return emit$com$squareup$cash$investing$presenters$drip$DividendReinvestmentWelcomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 26:
                return emit$com$squareup$cash$investing$presenters$holdings$InvestingEtfHoldingDetailsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 27:
                return emit$com$squareup$cash$investing$presenters$holdings$InvestingEtfHoldingsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$investing$presenters$metrics$InvestingAnalystOpinionsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                if (!Intrinsics.areEqual((InvestingEarningsViewEvent$MoreInfoClicked) obj2, InvestingEarningsViewEvent$MoreInfoClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                InvestmentEarnings investmentEarnings = (InvestmentEarnings) ((State) obj4).getValue();
                Section.Row.MoreInfo moreInfo = investmentEarnings != null ? investmentEarnings.more_info : null;
                if (moreInfo != null) {
                    ((InvestingEarningsPresenter) obj3).navigator.goTo(new InvestingScreens.MoreInfoSheet(moreInfo));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RepeatClicksOnLongPress$attachTo$2$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, State state, int i) {
        this.$r8$classId = i;
        this.$view = moleculePresenter;
        this.$repeater = state;
    }
}
