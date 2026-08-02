package com.squareup.cash.investing.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.paraphrase.FormattedResource;
import com.google.mlkit.vision.text.zza;
import com.google.photos.vision.barhopper.zzg;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.R;
import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.investing.viewmodels.PortfolioStockMetricType;
import com.squareup.cash.investing.viewmodels.StockContentModel;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investing.viewmodels.families.DependentActivityViewModel;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestViewModel;
import com.squareup.cash.investing.viewmodels.families.DependentDisabledStateViewModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPendingTradesTileWidgetViewModel;
import com.squareup.cash.investingcrypto.viewmodels.ColoredLearnMoreConfigurationModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.portfolios.BalanceEventList;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import com.squareup.util.BigDecimalsKt;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nl.dionsegijn.konfetti.compose.KonfettiViewKt;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingPortfolioPresenter$models$model$2$3 extends AdaptedFunctionReference implements Function15 {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0234, code lost:
    
        if (kotlin.text.StringsKt.contains((java.lang.CharSequence) r0, (java.lang.CharSequence) "Watchlist", true) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0241, code lost:
    
        r7.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x023b, code lost:
    
        if ((r10 instanceof com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow.Stock.Following) != false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0674  */
    @Override // kotlin.jvm.functions.Function15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Serializable serializable) {
        InvestingGraphContentModel.Point point;
        Long l;
        int i;
        String str;
        Long l2;
        ArrayList arrayList;
        long j;
        String str2;
        boolean z;
        MyInvestmentsContentModel unknownNetProfit;
        boolean z2;
        Set set;
        InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel;
        InvestingPortfolioPresenter investingPortfolioPresenter;
        DependentDisabledStateViewModel dependentDisabledStateViewModel;
        ArrayList arrayList2;
        String str3;
        InvestingGraphContentModel investingGraphContentModel;
        MyInvestmentsContentModel myInvestmentsContentModel;
        BalanceTick balanceTick;
        String str4;
        TextIndentKt investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
        LearnMoreConfiguration learnMoreConfiguration;
        LearnMoreConfiguration learnMoreConfiguration2;
        String str5;
        InvestingState investingState;
        FormattedResource formattedResource;
        PolledData polledData = (PolledData) obj;
        List list = (List) obj2;
        HistoricalRange historicalRange = (HistoricalRange) obj3;
        InvestingGraphContentModel.Point point2 = (InvestingGraphContentModel.Point) obj4;
        GraphPresenterData graphPresenterData = (GraphPresenterData) obj5;
        PortfolioStockMetricType portfolioStockMetricType = (PortfolioStockMetricType) obj6;
        Investing_settings investing_settings = (Investing_settings) obj7;
        boolean booleanValue = ((Boolean) obj8).booleanValue();
        InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj9;
        InvestingState investingState2 = (InvestingState) obj10;
        long longValue = ((Number) obj11).longValue();
        UiCallbackModel uiCallbackModel = (UiCallbackModel) obj12;
        DependentActivityViewModel dependentActivityViewModel = (DependentActivityViewModel) obj13;
        DependentAutoInvestViewModel dependentAutoInvestViewModel = (DependentAutoInvestViewModel) obj14;
        InvestingPortfolioPresenter investingPortfolioPresenter2 = (InvestingPortfolioPresenter) this.receiver;
        MoneyFormatter moneyFormatter = investingPortfolioPresenter2.moneyFormatter;
        long j2 = 0L;
        AndroidStringManager androidStringManager = investingPortfolioPresenter2.stringManager;
        Resources resources = androidStringManager.resources;
        InvestingScreens.InvestingHome investingHome = investingPortfolioPresenter2.screen;
        String str6 = investingHome.dependentCustomerToken;
        boolean z3 = investingHome.dependentControlDisabled;
        String str7 = investingHome.dependentName;
        boolean z4 = str6 == null;
        String str8 = investingPortfolioPresenter2.isDependentPortfolio() ? androidStringManager.get(R.string.my_portfolio_dependent_title) : androidStringManager.get(R.string.my_portfolio_title);
        String str9 = "";
        if (investingPortfolioPresenter2.isDependentPortfolio()) {
            String str10 = str7 == null ? "" : str7;
            portfolioStockMetricType.getClass();
            switch (portfolioStockMetricType.ordinal()) {
                case 0:
                    point = point2;
                    l = null;
                    formattedResource = new FormattedResource(R.string.my_portfolio_dependent_description_daily_percent_change, new Object[]{str10});
                    break;
                case 1:
                    point = point2;
                    l = null;
                    formattedResource = new FormattedResource(R.string.my_portfolio_dependent_description_daily_return, new Object[]{str10});
                    break;
                case 2:
                    point = point2;
                    l = null;
                    formattedResource = new FormattedResource(R.string.my_portfolio_dependent_description_total_return, new Object[]{str10});
                    break;
                case 3:
                    point = point2;
                    l = null;
                    formattedResource = new FormattedResource(R.string.my_portfolio_dependent_description_total_percent_return, new Object[]{str10});
                    break;
                case 4:
                    point = point2;
                    l = null;
                    formattedResource = new FormattedResource(R.string.my_portfolio_dependent_description_total_investment_value, new Object[]{str10});
                    break;
                case 5:
                    point = point2;
                    l = null;
                    formattedResource = new FormattedResource(R.string.my_portfolio_dependent_description_share_price, new Object[]{str10});
                    break;
                case 6:
                    l = null;
                    point = point2;
                    formattedResource = new FormattedResource(R.string.my_portfolio_dependent_description_market_cap, new Object[]{str10});
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
            str = Countries.getString(resources, formattedResource);
        } else {
            point = point2;
            l = null;
            portfolioStockMetricType.getClass();
            switch (portfolioStockMetricType.ordinal()) {
                case 0:
                    i = R.string.stock_metric_type_daily_percent_change;
                    break;
                case 1:
                    i = R.string.stock_metric_type_daily_return;
                    break;
                case 2:
                    i = R.string.stock_metric_type_total_return;
                    break;
                case 3:
                    i = R.string.stock_metric_type_total_percent_return;
                    break;
                case 4:
                    i = R.string.stock_metric_type_total_investment_value;
                    break;
                case 5:
                    i = R.string.stock_metric_type_share_price;
                    break;
                case 6:
                    i = R.string.stock_metric_type_market_cap;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
            str = androidStringManager.get(i);
        }
        String str11 = str;
        str8.getClass();
        str11.getClass();
        InvestingHomeViewModel.InvestingHomeRow.Header header = new InvestingHomeViewModel.InvestingHomeRow.Header(str8, str11, InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction.CHANGE_SORTING_ORDER, -2L, InvestingHomeViewModel.InvestingHomeRow.Header.HeaderDescriptionColor.Tertiary);
        Iterable iterable = (Iterable) polledData.value;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InvestmentEntityWithPrice.Owned owned = (InvestmentEntityWithPrice.Owned) it.next();
            Iterator it2 = it;
            StockMetric createMetric = investingPortfolioPresenter2.stockMetricFactory.createMetric(portfolioStockMetricType, owned);
            moneyFormatter.getClass();
            arrayList3.add(new InvestingHomeViewModel.InvestingHomeRow.Stock.Portfolio(KonfettiViewKt.asContentModel(owned, createMetric, false, booleanValue, false, androidStringManager, moneyFormatter), owned.id));
            iterable = iterable;
            portfolioStockMetricType = portfolioStockMetricType;
            it = it2;
            str9 = str9;
            investingHome = investingHome;
        }
        Iterable iterable2 = iterable;
        InvestingScreens.InvestingHome investingHome2 = investingHome;
        String str12 = str9;
        List sortedWith = CollectionsKt.sortedWith(arrayList3, new SemanticsSortKt$special$$inlined$thenBy$1(new b.C0008b(18), 9));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            InvestingHomeViewModel.InvestingHomeRow investingHomeRow = (InvestingHomeViewModel.InvestingHomeRow) next;
            List list2 = sortedWith;
            if (investingHomeRow instanceof InvestingHomeViewModel.InvestingHomeRow.Header) {
                InvestingHomeViewModel.InvestingHomeRow.Header header2 = (InvestingHomeViewModel.InvestingHomeRow.Header) investingHomeRow;
                String str13 = header2.title;
                investingState = investingState2;
                if (header2.id != -3) {
                    if (!StringsKt.contains((CharSequence) str13, (CharSequence) "Following", true)) {
                    }
                }
                arrayList4.add(next);
            } else {
                investingState = investingState2;
            }
            sortedWith = list2;
            investingState2 = investingState;
        }
        InvestingState investingState3 = investingState2;
        List list3 = sortedWith;
        if (!list3.isEmpty()) {
            ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(header);
            mutableListOf.addAll(list3);
            if (dependentAutoInvestViewModel != null) {
                mutableListOf.add(new InvestingHomeViewModel.InvestingHomeRow.DependentAutoInvest(dependentAutoInvestViewModel));
            }
            mutableListOf.addAll(arrayList4);
            if (dependentActivityViewModel != null) {
                mutableListOf.add(new InvestingHomeViewModel.InvestingHomeRow.DependentActivity(dependentActivityViewModel));
            }
            arrayList4 = mutableListOf;
        }
        Iterator it4 = iterable2.iterator();
        long j3 = 0;
        while (it4.hasNext()) {
            j3 += ((InvestmentEntityWithPrice.Owned) it4.next()).investedAmount;
        }
        Long valueOf = Long.valueOf(j3);
        CurrencyCode currencyCode = CurrencyCode.USD;
        String format2 = moneyFormatter.format(new Money(valueOf, currencyCode, 4));
        if (investingPortfolioPresenter2.isDependentPortfolio() && j3 == 0) {
            l2 = 0L;
        } else {
            BalanceTick balanceTick2 = (BalanceTick) zzg.lastOrNull(graphPresenterData.ticks);
            l2 = balanceTick2 != null ? balanceTick2.amount_cents : l;
        }
        if (l2 != null) {
            long longValue2 = l2.longValue() - j3;
            float f = j3 != 0 ? (longValue2 / j3) * 100.0f : 0.0f;
            arrayList = arrayList4;
            j = j3;
            str2 = "%";
            unknownNetProfit = new MyInvestmentsContentModel.KnownNetProfit(format2, booleanValue, CollectionsKt__CollectionsKt.listOf((Object[]) new MyInvestmentsContentModel.StatRow[]{new MyInvestmentsContentModel.StatRow(androidStringManager.get(R.string.myinvestments_total_value_stat), moneyFormatter.format(new Money(l2, currencyCode, 4)), l), new MyInvestmentsContentModel.StatRow(androidStringManager.get(R.string.myinvestments_total_gain_percent_stat), String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(Math.abs(f))}, 1)).concat(str2), f == RecyclerView.DECELERATION_RATE ? null : f > RecyclerView.DECELERATION_RATE ? MyInvestmentsContentModel.StatRow.StatValueIconKind.ArrowUp : MyInvestmentsContentModel.StatRow.StatValueIconKind.ArrowDown)}), investingPortfolioPresenter2.alwaysSignedMoneyFormatter.format(new Money(Long.valueOf(longValue2), currencyCode, 4)), investingPortfolioPresenter2.isDependentPortfolio() ? androidStringManager.get(R.string.investing_components_stat_dependent_investments) : androidStringManager.get(R.string.investing_components_stat_my_investment), !((Collection) r0).isEmpty());
            z = booleanValue;
        } else {
            arrayList = arrayList4;
            j = j3;
            str2 = "%";
            z = booleanValue;
            unknownNetProfit = new MyInvestmentsContentModel.UnknownNetProfit(format2, investingPortfolioPresenter2.isDependentPortfolio() ? androidStringManager.get(R.string.investing_components_stat_dependent_investments) : androidStringManager.get(R.string.investing_components_stat_my_investment), z, !((Collection) r0).isEmpty());
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            InvestingHomeViewModel.InvestingHomeRow investingHomeRow2 = (InvestingHomeViewModel.InvestingHomeRow) it5.next();
            if (investingHomeRow2 instanceof InvestingHomeViewModel.InvestingHomeRow.Stock.Discovery) {
                InvestingHomeViewModel.InvestingHomeRow.Stock.Discovery discovery = (InvestingHomeViewModel.InvestingHomeRow.Stock.Discovery) investingHomeRow2;
                StockContentModel stockContentModel = discovery.contentModel;
                LinkScanner linkScanner = stockContentModel.avatar;
                String str14 = stockContentModel.title;
                String str15 = stockContentModel.subTitle;
                boolean z5 = z;
                StockMetric stockMetric = stockContentModel.metric;
                InvestmentEntityToken investmentEntityToken = stockContentModel.investmentEntityToken;
                String str16 = stockContentModel.upcomingLabel;
                String str17 = stockContentModel.stockPrice;
                str14.getClass();
                investmentEntityToken.getClass();
                StockContentModel stockContentModel2 = new StockContentModel(linkScanner, str14, str15, stockMetric, investmentEntityToken, z5, str16, str17);
                z = z5;
                long j4 = discovery.id;
                String str18 = discovery.sectionHeader;
                str18.getClass();
                investingHomeRow2 = new InvestingHomeViewModel.InvestingHomeRow.Stock.Discovery(stockContentModel2, j4, str18);
            }
            arrayList6.add(investingHomeRow2);
        }
        InvestingHomePortfolioHeaderContentModel.TitleColorType titleColorType = z ? InvestingHomePortfolioHeaderContentModel.TitleColorType.STALE : InvestingHomePortfolioHeaderContentModel.TitleColorType.UP_TO_DATE;
        String str19 = investing_settings != null ? investing_settings.disclosures_web_url : null;
        if (str19 == null) {
            str19 = "null";
        }
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.investing_home_disclosure)).format(new Object[]{str19});
        format3.getClass();
        if (investingPortfolioPresenter2.serverDrivenDisclosuresEnabled && investing_settings != null && (str5 = investing_settings.investing_home_disclosure_text) != null) {
            format3 = str5;
        }
        String str20 = investingPortfolioPresenter2.isDependentPortfolio() ? null : format3;
        boolean z6 = (investingState3 instanceof InvestingState.Content) && (((InvestingState.Content) investingState3).brokerageAccountState instanceof InvestingState.Content.BrokerageAccountState.TransferInProgress);
        boolean z7 = longValue > 0;
        Set ofNotNull = SetsKt__SetsKt.setOfNotNull(z3 ? InvestingHomeViewModel.Module.DEPENDENT_DISABLED_STATE : null, ((KybRestrictionBannerViewModel) uiCallbackModel.model) != null ? InvestingHomeViewModel.Module.KYB_RESTRICTION : null, InvestingHomeViewModel.Module.PORTFOLIO_HERO, (investingPortfolioPresenter2.isDependentPortfolio() && j == 0) ? InvestingHomeViewModel.Module.PLACEHOLDER_GRAPH : InvestingHomeViewModel.Module.GRAPH, z6 ? InvestingHomeViewModel.Module.ACCOUNT_TRANSFER_STATUS : null, InvestingHomeViewModel.Module.NEWS_CAROUSEL, z7 ? InvestingHomeViewModel.Module.PENDING_TRADES : null, InvestingHomeViewModel.Module.MY_INVESTMENTS, InvestingHomeViewModel.Module.HOLDINGS, InvestingHomeViewModel.Module.MY_FIRST_CONFIGURATION, InvestingHomeViewModel.Module.DISCLOSURE);
        if (z7) {
            Long valueOf2 = Long.valueOf(longValue);
            z2 = z;
            set = ofNotNull;
            ArrayMap arrayMap = new ArrayMap(1);
            arrayMap.put("count", valueOf2);
            String format4 = new MessageFormat(resources.getString(R.string.investing_pending_stocks)).format(arrayMap);
            format4.getClass();
            investingPendingTradesTileWidgetViewModel = new InvestingPendingTradesTileWidgetViewModel(format4, androidStringManager.get(R.string.investing_view_all_pending_stock));
        } else {
            z2 = z;
            set = ofNotNull;
            investingPendingTradesTileWidgetViewModel = null;
        }
        if (z3) {
            dependentDisabledStateViewModel = new DependentDisabledStateViewModel(androidStringManager.get(R.string.investing_dependent_disabled_state_title), androidStringManager.get(R.string.investing_dependent_disabled_state_cta));
            investingPortfolioPresenter = investingPortfolioPresenter2;
        } else {
            investingPortfolioPresenter = investingPortfolioPresenter2;
            dependentDisabledStateViewModel = null;
        }
        if (str7 != null) {
            arrayList2 = arrayList6;
            str3 = new MessageFormat(resources.getString(R.string.dependent_investing_tab_title)).format(new Object[]{str7});
            str3.getClass();
        } else {
            arrayList2 = arrayList6;
            str3 = androidStringManager.get(R.string.investing_tab_title);
        }
        String str21 = str3;
        InvestingHomeViewModel.MenuIcon settings = investingPortfolioPresenter.isDependentPortfolio() ? InvestingHomeViewModel.MenuIcon.Hidden.INSTANCE : new InvestingHomeViewModel.MenuIcon.Settings(androidStringManager.get(R.string.investing_settings_menu_icon_title));
        SparseArrayCompat sparseArrayCompat = graphPresenterData.ticks;
        InvestingGraphContentModel investingGraphContentModel2 = graphPresenterData.contentModel;
        int size = sparseArrayCompat.size();
        TextIndentKt textIndentKt = InvestingHomePortfolioHeaderContentModel$Subtitle$StaleData.INSTANCE;
        ColorModel.Investing investing = ColorModel.Investing.INSTANCE;
        if (size == 0) {
            InvestingHomeViewModel.MenuIcon menuIcon = settings;
            if (!z2) {
                textIndentKt = new InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData("", null, "", "", investing);
            }
            return new InvestingHomeViewModel.Portfolio(new InvestingHomePortfolioHeaderContentModel(str12, titleColorType, textIndentKt, null), investingGraphContentModel2, historicalRange, arrayList, unknownNetProfit, arrayList2, (investingHome2.dependentCustomerToken != null || investing_settings == null || (learnMoreConfiguration2 = investing_settings.my_first_stock_configuration) == null) ? null : new ColoredLearnMoreConfigurationModel(learnMoreConfiguration2), investingPortfolioPresenter.isDependentPortfolio() ? null : investingCryptoNewsViewModel, str20, z6, investingPendingTradesTileWidgetViewModel, uiCallbackModel, dependentDisabledStateViewModel, str21, menuIcon, set, z4);
        }
        MyInvestmentsContentModel myInvestmentsContentModel2 = unknownNetProfit;
        Set set2 = set;
        InvestingHomeViewModel.MenuIcon menuIcon2 = settings;
        ArrayList arrayList7 = arrayList2;
        Integer valueOf3 = point != null ? Integer.valueOf((int) point.x) : null;
        if (valueOf3 != null) {
            Integer num = valueOf3;
            int intValue = num.intValue();
            investingGraphContentModel = investingGraphContentModel2;
            if (sparseArrayCompat.garbage) {
                SieveCacheKt.access$gc(sparseArrayCompat);
            }
            myInvestmentsContentModel = myInvestmentsContentModel2;
            if (ContainerHelpersKt.binarySearch(sparseArrayCompat.size, intValue, sparseArrayCompat.keys) >= 0) {
                Object commonGet = SieveCacheKt.commonGet(sparseArrayCompat, num.intValue());
                commonGet.getClass();
                balanceTick = (BalanceTick) commonGet;
                MoneyFormatter moneyFormatter2 = investingPortfolioPresenter.alwaysSignedCompactMoneyFormatter;
                Long l3 = balanceTick.gain_amount_cents;
                l3.getClass();
                CurrencyCode currencyCode2 = CurrencyCode.USD;
                String format5 = moneyFormatter2.format(new Money(l3, currencyCode2, 4));
                Long l4 = balanceTick.gain_bps;
                l4.getClass();
                String str22 = str20;
                BigDecimal stripTrailingZeros = new BigDecimal(l4.longValue()).divide(BigDecimal.valueOf(100L), 2, RoundingMode.HALF_UP).stripTrailingZeros();
                if (z2) {
                    BigDecimal abs = stripTrailingZeros.abs();
                    abs.getClass();
                    String concat = BigDecimalsKt.toPrettyString(abs, false).concat(str2);
                    InvestingCryptoImage.Companion.getClass();
                    InvestingCryptoImage icon = zza.icon(stripTrailingZeros);
                    int ordinal = historicalRange.ordinal();
                    if (ordinal == 0) {
                        RealInvestingGraphCalculator realInvestingGraphCalculator = investingPortfolioPresenter.graphCalculator;
                        Object lastOrNull = zzg.lastOrNull(sparseArrayCompat);
                        lastOrNull.getClass();
                        AndroidClock androidClock = realInvestingGraphCalculator.clock;
                        ZoneId of = ZoneId.of(androidClock.timeZone().getID());
                        Long l5 = ((BalanceTick) lastOrNull).time_sec;
                        l5.getClass();
                        ZonedDateTime atZone = Instant.ofEpochSecond(l5.longValue()).atZone(of);
                        ZonedDateTime atZone2 = Instant.ofEpochMilli(androidClock.millis()).atZone(of);
                        str4 = realInvestingGraphCalculator.stringManager.get(R.string.portfolio_value_today);
                        if (!Intrinsics.areEqual(atZone.toLocalDate(), atZone2.toLocalDate())) {
                            str4 = DateTimeFormatter.ofPattern("EEEE", Locale.US).format(atZone);
                            str4.getClass();
                        }
                    } else if (ordinal == 1) {
                        str4 = androidStringManager.get(R.string.portfolio_value_past_week);
                    } else if (ordinal == 2) {
                        str4 = androidStringManager.get(R.string.portfolio_value_past_month);
                    } else if (ordinal == 3) {
                        str4 = androidStringManager.get(R.string.portfolio_value_past_year);
                    } else {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str4 = androidStringManager.get(R.string.portfolio_value_all);
                    }
                    investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData = new InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData(format5, icon, concat, str4, investing);
                } else {
                    investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData = textIndentKt;
                }
                MoneyFormatter moneyFormatter3 = investingPortfolioPresenter.compactMoneyFormatter;
                Long l6 = balanceTick.amount_cents;
                l6.getClass();
                return new InvestingHomeViewModel.Portfolio(new InvestingHomePortfolioHeaderContentModel(moneyFormatter3.format(new Money(l6, currencyCode2, 4)), titleColorType, investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData, null), investingGraphContentModel, historicalRange, arrayList, myInvestmentsContentModel, arrayList7, (investingPortfolioPresenter.isDependentPortfolio() || investing_settings == null || (learnMoreConfiguration = investing_settings.my_first_stock_configuration) == null) ? null : new ColoredLearnMoreConfigurationModel(learnMoreConfiguration), investingPortfolioPresenter.isDependentPortfolio() ? null : investingCryptoNewsViewModel, str22, z6, investingPendingTradesTileWidgetViewModel, uiCallbackModel, dependentDisabledStateViewModel, str21, menuIcon2, set2, z4);
            }
        } else {
            investingGraphContentModel = investingGraphContentModel2;
            myInvestmentsContentModel = myInvestmentsContentModel2;
        }
        if (investingPortfolioPresenter.isDependentPortfolio() && j == 0) {
            balanceTick = new BalanceTick((Long) j2, (BalanceEventList) null, (Long) null, (Long) j2, (Long) j2, (String) null, 102);
        } else {
            Object lastOrNull2 = zzg.lastOrNull(sparseArrayCompat);
            lastOrNull2.getClass();
            balanceTick = (BalanceTick) lastOrNull2;
        }
        MoneyFormatter moneyFormatter22 = investingPortfolioPresenter.alwaysSignedCompactMoneyFormatter;
        Long l32 = balanceTick.gain_amount_cents;
        l32.getClass();
        CurrencyCode currencyCode22 = CurrencyCode.USD;
        String format52 = moneyFormatter22.format(new Money(l32, currencyCode22, 4));
        Long l42 = balanceTick.gain_bps;
        l42.getClass();
        String str222 = str20;
        BigDecimal stripTrailingZeros2 = new BigDecimal(l42.longValue()).divide(BigDecimal.valueOf(100L), 2, RoundingMode.HALF_UP).stripTrailingZeros();
        if (z2) {
        }
        MoneyFormatter moneyFormatter32 = investingPortfolioPresenter.compactMoneyFormatter;
        Long l62 = balanceTick.amount_cents;
        l62.getClass();
        if (investingPortfolioPresenter.isDependentPortfolio()) {
            return new InvestingHomeViewModel.Portfolio(new InvestingHomePortfolioHeaderContentModel(moneyFormatter32.format(new Money(l62, currencyCode22, 4)), titleColorType, investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData, null), investingGraphContentModel, historicalRange, arrayList, myInvestmentsContentModel, arrayList7, (investingPortfolioPresenter.isDependentPortfolio() || investing_settings == null || (learnMoreConfiguration = investing_settings.my_first_stock_configuration) == null) ? null : new ColoredLearnMoreConfigurationModel(learnMoreConfiguration), investingPortfolioPresenter.isDependentPortfolio() ? null : investingCryptoNewsViewModel, str222, z6, investingPendingTradesTileWidgetViewModel, uiCallbackModel, dependentDisabledStateViewModel, str21, menuIcon2, set2, z4);
        }
        return new InvestingHomeViewModel.Portfolio(new InvestingHomePortfolioHeaderContentModel(moneyFormatter32.format(new Money(l62, currencyCode22, 4)), titleColorType, investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData, null), investingGraphContentModel, historicalRange, arrayList, myInvestmentsContentModel, arrayList7, (investingPortfolioPresenter.isDependentPortfolio() || investing_settings == null || (learnMoreConfiguration = investing_settings.my_first_stock_configuration) == null) ? null : new ColoredLearnMoreConfigurationModel(learnMoreConfiguration), investingPortfolioPresenter.isDependentPortfolio() ? null : investingCryptoNewsViewModel, str222, z6, investingPendingTradesTileWidgetViewModel, uiCallbackModel, dependentDisabledStateViewModel, str21, menuIcon2, set2, z4);
    }
}
