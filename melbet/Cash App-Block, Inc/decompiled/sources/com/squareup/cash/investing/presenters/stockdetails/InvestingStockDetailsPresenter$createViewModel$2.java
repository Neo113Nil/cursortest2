package com.squareup.cash.investing.presenters.stockdetails;

import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.google.mlkit.vision.text.zza;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.nimbusds.jose.util.X509CertUtils;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.db.Investment_holding;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingAboutContentModel;
import com.squareup.cash.investing.viewmodels.InvestingDetailRowContentModel;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewModel;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewModel;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.investing.viewmodels.PortfolioStockMetricType;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investing.viewmodels.categories.InvestingDetailsCategorySectionContentModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.GraphPresenterData$$ExternalSyntheticLambda0;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$StaleData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.portfolios.BalanceEventList;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import com.squareup.util.BigDecimalsKt;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.LongRange;
import kotlin.text.StringsKt;
import kotlin.uuid.UuidKt;
import kotlinx.coroutines.CoroutineScope;
import okio.AsyncTimeout;
import okio.internal.RealBufferedSource;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsPresenter$createViewModel$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ UiCallbackModel $activityModel;
    public final /* synthetic */ X509CertChainUtils $analystOpinionsViewModel;
    public final /* synthetic */ List $categories;
    public final /* synthetic */ StockDetails $details;
    public final /* synthetic */ String $disclosureText;
    public final /* synthetic */ InvestingEarningsViewModel $earningsViewModel;
    public final /* synthetic */ InvestingEtfHoldingsViewModel $etfHoldingModel;
    public final /* synthetic */ X509CertUtils $financialViewModel;
    public final /* synthetic */ GraphPresenterData $graphData;
    public final /* synthetic */ Investment_holding $holding;
    public final /* synthetic */ InvestingDetailTileViewModel $keyStatsModel;
    public final /* synthetic */ InvestingCryptoNewsViewModel $newsModel;
    public final /* synthetic */ HistoricalRange $range;
    public final /* synthetic */ InvestingCryptoRecurringPurchaseTileViewModel $recurringPreferenceModel;
    public final /* synthetic */ InvestingGraphContentModel.Point $scrubbedPoint;
    public final /* synthetic */ boolean $showMyInvestments;
    public final /* synthetic */ InvestingStockDetailsPresenter this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoricalRange.values().length];
            try {
                AsyncTimeout.Companion companion = HistoricalRange.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AsyncTimeout.Companion companion2 = HistoricalRange.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AsyncTimeout.Companion companion3 = HistoricalRange.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AsyncTimeout.Companion companion4 = HistoricalRange.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AsyncTimeout.Companion companion5 = HistoricalRange.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockDetailsPresenter$createViewModel$2(StockDetails stockDetails, GraphPresenterData graphPresenterData, InvestingStockDetailsPresenter investingStockDetailsPresenter, HistoricalRange historicalRange, InvestingGraphContentModel.Point point, List list, boolean z, Investment_holding investment_holding, UiCallbackModel uiCallbackModel, InvestingDetailTileViewModel investingDetailTileViewModel, InvestingCryptoNewsViewModel investingCryptoNewsViewModel, InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel, X509CertUtils x509CertUtils, InvestingEarningsViewModel investingEarningsViewModel, X509CertChainUtils x509CertChainUtils, InvestingEtfHoldingsViewModel investingEtfHoldingsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.$details = stockDetails;
        this.$graphData = graphPresenterData;
        this.this$0 = investingStockDetailsPresenter;
        this.$range = historicalRange;
        this.$scrubbedPoint = point;
        this.$categories = list;
        this.$showMyInvestments = z;
        this.$holding = investment_holding;
        this.$activityModel = uiCallbackModel;
        this.$keyStatsModel = investingDetailTileViewModel;
        this.$newsModel = investingCryptoNewsViewModel;
        this.$recurringPreferenceModel = investingCryptoRecurringPurchaseTileViewModel;
        this.$financialViewModel = x509CertUtils;
        this.$earningsViewModel = investingEarningsViewModel;
        this.$analystOpinionsViewModel = x509CertChainUtils;
        this.$etfHoldingModel = investingEtfHoldingsViewModel;
        this.$disclosureText = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InvestingStockDetailsPresenter$createViewModel$2(this.$details, this.$graphData, this.this$0, this.$range, this.$scrubbedPoint, this.$categories, this.$showMyInvestments, this.$holding, this.$activityModel, this.$keyStatsModel, this.$newsModel, this.$recurringPreferenceModel, this.$financialViewModel, this.$earningsViewModel, this.$analystOpinionsViewModel, this.$etfHoldingModel, this.$disclosureText, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InvestingStockDetailsPresenter$createViewModel$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0606 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ca  */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4, types: [com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v7, types: [com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel$InvestmentEntityButtonContainerModel] */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r51v0 */
    /* JADX WARN: Type inference failed for: r51v1, types: [org.commonmark.internal.util.LinkScanner] */
    /* JADX WARN: Type inference failed for: r51v2 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.collection.SparseArrayCompat] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SparseArrayCompat sparseArrayCompat;
        long j;
        Long l;
        long longValue;
        InvestmentEntityWithPrice investmentEntityWithPrice;
        boolean z;
        StockDetails stockDetails;
        InvestingGraphContentModel investingGraphContentModel;
        InvestingStockDetailsPresenter investingStockDetailsPresenter;
        CurrentPrice currentPrice;
        InvestingGraphContentModel.Point point;
        boolean z2;
        long longValue2;
        int i;
        String format2;
        InvestingCryptoAvatarContentModel$Icon investingCryptoAvatarContentModel$Icon;
        String str;
        String concat;
        InvestingCryptoImage icon;
        int ordinal;
        String str2;
        String str3;
        boolean z3;
        boolean z4;
        StockDetails stockDetails2;
        String str4;
        Color color;
        InvestingCryptoAvatarContentModel$Icon investingCryptoAvatarContentModel$Icon2;
        InvestingAboutContentModel investingAboutContentModel;
        List list;
        String str5;
        String str6;
        InvestingDetailsCategorySectionContentModel investingDetailsCategorySectionContentModel;
        InvestingStockDetailsPresenter investingStockDetailsPresenter2;
        StockMetric stockMetric;
        boolean z5;
        InvestmentEntityWithPrice investmentEntityWithPrice2;
        String str7;
        String str8;
        CurrentPrice currentPrice2;
        Money access$currentValue;
        String str9;
        float f;
        float f2;
        MyInvestmentsContentModel.StatRow statRow;
        MyInvestmentsContentModel.StatRow statRow2;
        boolean z6;
        String str10;
        GraphPresenterData graphPresenterData;
        MyInvestmentsContentModel.StatRow statRow3;
        MyInvestmentsContentModel.StatRow statRow4;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState;
        InvestingScreens.StockDetails stockDetails3;
        MyInvestmentsContentModel knownNetProfit;
        MyInvestmentsContentModel myInvestmentsContentModel;
        Money money;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState2;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState3;
        boolean z7;
        boolean z8;
        boolean z9;
        ActivityEmbeddedViewModel activityEmbeddedViewModel;
        List list2;
        InvestingDetailRowContentModel.Row row;
        InvestingStockDetailsPresenter investingStockDetailsPresenter3 = this.this$0;
        InvestingScreens.StockDetails stockDetails4 = investingStockDetailsPresenter3.args;
        AndroidClock androidClock = investingStockDetailsPresenter3.clock;
        MoneyFormatter moneyFormatter = investingStockDetailsPresenter3.moneyFormatter;
        AndroidStringManager androidStringManager = investingStockDetailsPresenter3.stringManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        StockDetails stockDetails5 = this.$details;
        InvestmentEntityWithPrice investmentEntityWithPrice3 = stockDetails5.entityWithPrice;
        String str11 = stockDetails5.aboutText;
        Color color2 = stockDetails5.color;
        CurrentPrice price = investmentEntityWithPrice3.getPrice();
        InvestmentEntityWithPrice investmentEntityWithPrice4 = stockDetails5.entityWithPrice;
        boolean delisted = investmentEntityWithPrice4.getDelisted();
        boolean z10 = investmentEntityWithPrice4.getReleaseStage() == SyncInvestmentEntity.ReleaseStage.PREVIEW_FOR_IPO;
        GraphPresenterData graphPresenterData2 = this.$graphData;
        InvestingGraphContentModel investingGraphContentModel2 = graphPresenterData2.contentModel;
        SparseArrayCompat sparseArrayCompat2 = graphPresenterData2.ticks;
        boolean z11 = investingGraphContentModel2.getAccentColor() instanceof InvestingGraphContentModel$AccentColorType$StaleData;
        InvestingStockDetailsHeaderViewModel.Subtitle.ColorType colorType = z11 ? InvestingStockDetailsHeaderViewModel.Subtitle.ColorType.STALE_DATA : (z10 || delisted) ? InvestingStockDetailsHeaderViewModel.Subtitle.ColorType.PRE_IPO : InvestingStockDetailsHeaderViewModel.Subtitle.ColorType.ACCENT_COLOR;
        HistoricalRange historicalRange = this.$range;
        if (z10) {
            str3 = androidStringManager.get(R.string.upcoming_stocks_subtitle);
        } else {
            if (!delisted) {
                if (price == null) {
                    investingStockDetailsPresenter = investingStockDetailsPresenter3;
                    investmentEntityWithPrice = investmentEntityWithPrice4;
                    z = z11;
                    stockDetails = stockDetails5;
                    currentPrice = price;
                    concat = "";
                    str2 = concat;
                    format2 = null;
                    icon = null;
                    z2 = true;
                    str = "%";
                    investingCryptoAvatarContentModel$Icon = null;
                    if (str11 != null || str11.length() == 0) {
                        z3 = z2;
                        z4 = z;
                        stockDetails2 = stockDetails;
                        str4 = format2;
                        color = color2;
                        investingCryptoAvatarContentModel$Icon2 = investingCryptoAvatarContentModel$Icon;
                        investingAboutContentModel = null;
                    } else {
                        stockDetails2 = stockDetails;
                        List<SyncInvestmentEntity.DetailRow> list3 = stockDetails2.aboutDetailRows;
                        ArrayList arrayList = new ArrayList();
                        for (SyncInvestmentEntity.DetailRow detailRow : list3) {
                            boolean z12 = z2;
                            String str12 = detailRow.detail_text;
                            str12.getClass();
                            if (StringsKt.isBlank(str12)) {
                                row = null;
                            } else {
                                String str13 = detailRow.title;
                                str13.getClass();
                                String str14 = detailRow.detail_text;
                                str14.getClass();
                                row = new InvestingDetailRowContentModel.Row(str13, str14);
                            }
                            if (row != null) {
                                arrayList.add(row);
                            }
                            z2 = z12;
                        }
                        z3 = z2;
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        int size = arrayList2.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        arrayList2.add(size, new InvestingDetailRowContentModel.Row(androidStringManager.get(R.string.ticker_symbol), stockDetails2.symbol));
                        String str15 = androidStringManager.get(R.string.investing_about_title);
                        str11.getClass();
                        z4 = z;
                        str4 = format2;
                        color = color2;
                        investingCryptoAvatarContentModel$Icon2 = investingCryptoAvatarContentModel$Icon;
                        investingAboutContentModel = new InvestingAboutContentModel(str15, str11, new InvestingDetailRowContentModel(arrayList2, z4), new ColorModel.Accented(color));
                    }
                    list = this.$categories;
                    if (list.isEmpty()) {
                        String str16 = androidStringManager.get(R.string.featured_in);
                        List list4 = list;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            Category category = (Category) it.next();
                            Iterator it2 = it;
                            String str17 = category.imageUrl;
                            str17.getClass();
                            String str18 = concat;
                            Image image = new Image(str17, str17, 4);
                            Color color3 = category.color;
                            color3.getClass();
                            arrayList3.add(new InvestingDetailsCategorySectionContentModel.Cell(image, color3, category.name, category.token));
                            it = it2;
                            concat = str18;
                            str2 = str2;
                        }
                        str5 = concat;
                        str6 = str2;
                        investingDetailsCategorySectionContentModel = new InvestingDetailsCategorySectionContentModel(str16, arrayList3);
                    } else {
                        str5 = concat;
                        str6 = str2;
                        investingDetailsCategorySectionContentModel = null;
                    }
                    InvestmentEntityWithPrice investmentEntityWithPrice5 = investmentEntityWithPrice;
                    if (delisted && (investmentEntityWithPrice5 instanceof InvestmentEntityWithPrice.Owned)) {
                        investingStockDetailsPresenter2 = investingStockDetailsPresenter;
                        stockMetric = investingStockDetailsPresenter2.stockMetricFactory.createMetric(PortfolioStockMetricType.TOTAL_INVESTMENT_VALUE, (InvestmentEntityWithPrice.Owned) investmentEntityWithPrice5);
                    } else {
                        investingStockDetailsPresenter2 = investingStockDetailsPresenter;
                        stockMetric = null;
                    }
                    z5 = this.$showMyInvestments;
                    Investment_holding investment_holding = this.$holding;
                    if (z5) {
                        investmentEntityWithPrice2 = investmentEntityWithPrice5;
                        graphPresenterData = graphPresenterData2;
                        stockDetails3 = stockDetails4;
                        investmentHoldingState = null;
                        myInvestmentsContentModel = null;
                    } else {
                        Money money2 = investment_holding == null ? new Money(new Long(0L), CurrencyCode.USD, 4) : new Money(new Long(investment_holding.invested_amount), investment_holding.currency, 4);
                        String format3 = moneyFormatter.format(money2);
                        String str19 = androidStringManager.get(R.string.investing_components_stat_my_investment);
                        if (currentPrice == null) {
                            investmentEntityWithPrice2 = investmentEntityWithPrice5;
                            graphPresenterData = graphPresenterData2;
                            myInvestmentsContentModel = new MyInvestmentsContentModel.UnknownNetProfit(format3, str19, z4, investment_holding != null ? z3 : false);
                            stockDetails3 = stockDetails4;
                            investmentHoldingState = null;
                        } else {
                            if (investment_holding == null) {
                                investmentEntityWithPrice2 = investmentEntityWithPrice5;
                                str7 = format3;
                                str8 = str19;
                                access$currentValue = new Money(new Long(0L), CurrencyCode.USD, 4);
                                currentPrice2 = currentPrice;
                            } else {
                                investmentEntityWithPrice2 = investmentEntityWithPrice5;
                                str7 = format3;
                                str8 = str19;
                                currentPrice2 = currentPrice;
                                access$currentValue = InvestingStockDetailsPresenter.access$currentValue(investingStockDetailsPresenter2, currentPrice2, investment_holding);
                            }
                            Money minus = Moneys.minus(access$currentValue, money2);
                            String format4 = moneyFormatter.format(minus);
                            Long l2 = money2.amount;
                            float div = (l2 != null && l2.longValue() == 0) ? RecyclerView.DECELERATION_RATE : Moneys.div(minus, money2) * 100.0f;
                            if (delisted) {
                                f2 = div;
                                statRow = null;
                                f = RecyclerView.DECELERATION_RATE;
                            } else {
                                String str20 = androidStringManager.get(R.string.myinvestments_total_value_stat);
                                if (stockMetric == null || (str9 = stockMetric.getText()) == null) {
                                    str9 = "$0.00";
                                }
                                String str21 = str9;
                                f = RecyclerView.DECELERATION_RATE;
                                f2 = div;
                                statRow = new MyInvestmentsContentModel.StatRow(str20, str21, null);
                            }
                            if (delisted) {
                                z6 = z4;
                                statRow2 = null;
                            } else {
                                z6 = z4;
                                statRow2 = new MyInvestmentsContentModel.StatRow(androidStringManager.get(R.string.myinvestments_total_gain_percent_stat), String.format("%.2f", Arrays.copyOf(new Object[]{new Float(Math.abs(f2))}, z3 ? 1 : 0)).concat(str), f2 == f ? null : f2 > f ? MyInvestmentsContentModel.StatRow.StatValueIconKind.ArrowUp : MyInvestmentsContentModel.StatRow.StatValueIconKind.ArrowDown);
                            }
                            String str22 = androidStringManager.get(R.string.myinvestments_shares_owned_stat);
                            if (investment_holding == null || (str10 = investment_holding.units) == null) {
                                str10 = "0.00";
                            }
                            MyInvestmentsContentModel.StatRow statRow5 = new MyInvestmentsContentModel.StatRow(str22, str10, null);
                            if (investment_holding == null || (money = investment_holding.average_cost) == null) {
                                graphPresenterData = graphPresenterData2;
                                statRow3 = null;
                            } else {
                                graphPresenterData = graphPresenterData2;
                                statRow3 = new MyInvestmentsContentModel.StatRow(androidStringManager.get(R.string.myinvestments_average_share_price_stat), moneyFormatter.format(money), null);
                            }
                            if (delisted) {
                                statRow4 = null;
                                investmentHoldingState = null;
                            } else {
                                String str23 = androidStringManager.get(R.string.current_price_equity);
                                Money money3 = currentPrice2.current_price;
                                money3.getClass();
                                investmentHoldingState = null;
                                statRow4 = new MyInvestmentsContentModel.StatRow(str23, moneyFormatter.format(money3), null);
                            }
                            List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new MyInvestmentsContentModel.StatRow[]{statRow, statRow2, statRow5, statRow3, statRow4});
                            if (delisted) {
                                boolean z13 = !delisted;
                                stockDetails3 = stockDetails4;
                                if (stockDetails3.isDependentCustomer) {
                                    str8 = "";
                                }
                                knownNetProfit = new MyInvestmentsContentModel.UnknownNetProfit(str7, z6, filterNotNull, z13, str8, investment_holding != null);
                            } else {
                                stockDetails3 = stockDetails4;
                                if (stockDetails3.isDependentCustomer) {
                                    str8 = "";
                                }
                                knownNetProfit = new MyInvestmentsContentModel.KnownNetProfit(str7, z6, filterNotNull, format4, str8, investment_holding != null);
                            }
                            myInvestmentsContentModel = knownNetProfit;
                        }
                    }
                    Buttons access$getButtons = InvestingStockDetailsPresenter.access$getButtons(investingStockDetailsPresenter2, stockDetails2, investment_holding);
                    investmentHoldingState2 = investment_holding == null ? investment_holding.state : investmentHoldingState;
                    investmentHoldingState3 = SyncInvestmentHolding.InvestmentHoldingState.OWNED;
                    if (investmentHoldingState2 == investmentHoldingState3) {
                        UiCallbackModel uiCallbackModel = this.$activityModel;
                        if (uiCallbackModel == null || (activityEmbeddedViewModel = (ActivityEmbeddedViewModel) uiCallbackModel.model) == null || (list2 = activityEmbeddedViewModel.feedEntries) == null) {
                            z7 = true;
                            z9 = false;
                        } else {
                            z7 = true;
                            z9 = !list2.isEmpty();
                        }
                        if (!z9) {
                            z8 = false;
                            LinkedHashSet sortOrder = RealBufferedSource.getSortOrder(stockDetails2.f1150type == InvestmentEntityType.ETF ? z7 : false, z8);
                            Image icon2 = investmentEntityWithPrice2.getIcon();
                            return new InvestingStockDetailsViewModel(new InvestmentEntityContentModel(new InvestingStockDetailsHeaderViewModel(icon2 != null ? new InvestingCryptoAvatarContentModel$Image(icon2, MoshiJsonIntegration.toModel(investmentEntityWithPrice2.getAccentColor())) : investmentHoldingState, investmentEntityWithPrice2.getDisplayName(), new InvestingStockDetailsHeaderViewModel.Subtitle(icon != null ? new InvestingCryptoAvatarContentModel$Icon(icon) : investmentHoldingState, str5, str6, investingCryptoAvatarContentModel$Icon2, str4, colorType), new ColorModel.Accented(color), stockMetric, true), graphPresenterData.contentModel, (!z10 || delisted) ? z7 : false, (delisted && z10) ? false : z7, this.$keyStatsModel, historicalRange, stockDetails3.isDependentCustomer ? investmentHoldingState : new InvestmentEntityContentModel.InvestmentEntityButtonContainerModel(new ColorModel.Accented(color), access$getButtons.firstButtonLabel, access$getButtons.secondButtonLabel), myInvestmentsContentModel, this.$newsModel, this.$recurringPreferenceModel, this.$financialViewModel, this.$earningsViewModel, this.$analystOpinionsViewModel, investingAboutContentModel, (investment_holding != null ? investment_holding.state : investmentHoldingState) != investmentHoldingState3 ? z7 : false, investingDetailsCategorySectionContentModel, this.$etfHoldingModel, this.$activityModel, this.$disclosureText, sortOrder));
                        }
                    } else {
                        z7 = true;
                    }
                    z8 = z7;
                    LinkedHashSet sortOrder2 = RealBufferedSource.getSortOrder(stockDetails2.f1150type == InvestmentEntityType.ETF ? z7 : false, z8);
                    Image icon22 = investmentEntityWithPrice2.getIcon();
                    return new InvestingStockDetailsViewModel(new InvestmentEntityContentModel(new InvestingStockDetailsHeaderViewModel(icon22 != null ? new InvestingCryptoAvatarContentModel$Image(icon22, MoshiJsonIntegration.toModel(investmentEntityWithPrice2.getAccentColor())) : investmentHoldingState, investmentEntityWithPrice2.getDisplayName(), new InvestingStockDetailsHeaderViewModel.Subtitle(icon != null ? new InvestingCryptoAvatarContentModel$Icon(icon) : investmentHoldingState, str5, str6, investingCryptoAvatarContentModel$Icon2, str4, colorType), new ColorModel.Accented(color), stockMetric, true), graphPresenterData.contentModel, (!z10 || delisted) ? z7 : false, (delisted && z10) ? false : z7, this.$keyStatsModel, historicalRange, stockDetails3.isDependentCustomer ? investmentHoldingState : new InvestmentEntityContentModel.InvestmentEntityButtonContainerModel(new ColorModel.Accented(color), access$getButtons.firstButtonLabel, access$getButtons.secondButtonLabel), myInvestmentsContentModel, this.$newsModel, this.$recurringPreferenceModel, this.$financialViewModel, this.$earningsViewModel, this.$analystOpinionsViewModel, investingAboutContentModel, (investment_holding != null ? investment_holding.state : investmentHoldingState) != investmentHoldingState3 ? z7 : false, investingDetailsCategorySectionContentModel, this.$etfHoldingModel, this.$activityModel, this.$disclosureText, sortOrder2));
                }
                Money money4 = price.price_at_market_open;
                Money money5 = price.current_price;
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                if (iArr[historicalRange.ordinal()] == 1) {
                    money4.getClass();
                    Long l3 = money4.amount;
                    l3.getClass();
                    longValue = l3.longValue();
                } else {
                    BalanceTick balanceTick = (BalanceTick) SieveCacheKt.commonGet(sparseArrayCompat2, 0);
                    if (balanceTick == null || (l = balanceTick.amount_cents) == null) {
                        sparseArrayCompat = sparseArrayCompat2;
                        j = 0;
                        money5.getClass();
                        investmentEntityWithPrice = investmentEntityWithPrice4;
                        Long l4 = money5.amount;
                        l4.getClass();
                        z = z11;
                        BigDecimal movement = UuidKt.movement(true, l4.longValue(), j);
                        Long l5 = money5.amount;
                        l5.getClass();
                        long longValue3 = l5.longValue();
                        long longValue4 = movement.longValue();
                        Long l6 = money5.amount;
                        l6.getClass();
                        stockDetails = stockDetails5;
                        ?? r7 = sparseArrayCompat;
                        BalanceTick balanceTick2 = new BalanceTick(new Long(longValue3), (BalanceEventList) null, new Long(androidClock.millis() / 1000), new Long(l6.longValue()), new Long(longValue4), (String) null, 98);
                        AndroidDateFormatManager androidDateFormatManager = investingStockDetailsPresenter3.dateFormatManager;
                        investingGraphContentModel = graphPresenterData2.contentModel;
                        if (investingGraphContentModel instanceof InvestingGraphContentModel.Loaded) {
                            investingStockDetailsPresenter = investingStockDetailsPresenter3;
                        } else {
                            Long l7 = balanceTick2.time_sec;
                            l7.getClass();
                            long millis = TimeUnit.SECONDS.toMillis(l7.longValue());
                            LongRange longRange = graphPresenterData2.timeRangeMilliseconds;
                            long j2 = longRange.first;
                            if (millis <= longRange.last && j2 <= millis) {
                                r7.put(r7.keyAt(r7.size() - 1) + 1, balanceTick2);
                                InvestingGraphContentModel.Loaded loaded = (InvestingGraphContentModel.Loaded) investingGraphContentModel;
                                List list5 = loaded.points;
                                float f3 = ((InvestingGraphContentModel.Point) CollectionsKt.last(list5)).x + 1.0f;
                                balanceTick2.gain_amount_cents.getClass();
                                investingStockDetailsPresenter = investingStockDetailsPresenter3;
                                currentPrice = price;
                                graphPresenterData2 = GraphPresenterData.copy$default(graphPresenterData2, r7, InvestingGraphContentModel.Loaded.copy$default(loaded, CollectionsKt.plus((Collection) list5, (Object) new InvestingGraphContentModel.Point(f3, r2.longValue(), InvestingGraphContentModel.LineDashEffect.SOLID, InvestingGraphContentModel.PointTreatment.NONE, new InvestingGraphContentModel.NonComparableStringProvider(new GraphPresenterData$$ExternalSyntheticLambda0(graphPresenterData2, androidClock, millis, androidDateFormatManager, 0)))), null, 510), 10);
                                point = this.$scrubbedPoint;
                                if (point != null) {
                                    float f4 = point.y;
                                    Long l8 = money4 != null ? money4.amount : null;
                                    InvestingGraphContentModel.Point point2 = (InvestingGraphContentModel.Point) CollectionsKt.firstOrNull(graphPresenterData2.contentModel.getPoints());
                                    Long l9 = point2 != null ? new Long((long) point2.y) : null;
                                    long j3 = (long) f4;
                                    int i2 = iArr[historicalRange.ordinal()];
                                    z2 = true;
                                    if (i2 == 1) {
                                        if (l8 != null) {
                                            longValue2 = l8.longValue();
                                            movement = UuidKt.movement(true, j3, longValue2);
                                            i = 4;
                                            format2 = moneyFormatter.format(new Money(new Long((long) f4), CurrencyCode.USD, 4));
                                            investingCryptoAvatarContentModel$Icon = null;
                                        }
                                        longValue2 = 0;
                                        movement = UuidKt.movement(true, j3, longValue2);
                                        i = 4;
                                        format2 = moneyFormatter.format(new Money(new Long((long) f4), CurrencyCode.USD, 4));
                                        investingCryptoAvatarContentModel$Icon = null;
                                    } else {
                                        if (l9 != null) {
                                            longValue2 = l9.longValue();
                                            movement = UuidKt.movement(true, j3, longValue2);
                                            i = 4;
                                            format2 = moneyFormatter.format(new Money(new Long((long) f4), CurrencyCode.USD, 4));
                                            investingCryptoAvatarContentModel$Icon = null;
                                        }
                                        longValue2 = 0;
                                        movement = UuidKt.movement(true, j3, longValue2);
                                        i = 4;
                                        format2 = moneyFormatter.format(new Money(new Long((long) f4), CurrencyCode.USD, 4));
                                        investingCryptoAvatarContentModel$Icon = null;
                                    }
                                    if (str11 != null) {
                                    }
                                    z3 = z2;
                                    z4 = z;
                                    stockDetails2 = stockDetails;
                                    str4 = format2;
                                    color = color2;
                                    investingCryptoAvatarContentModel$Icon2 = investingCryptoAvatarContentModel$Icon;
                                    investingAboutContentModel = null;
                                    list = this.$categories;
                                    if (list.isEmpty()) {
                                    }
                                    InvestmentEntityWithPrice investmentEntityWithPrice52 = investmentEntityWithPrice;
                                    if (delisted) {
                                    }
                                    investingStockDetailsPresenter2 = investingStockDetailsPresenter;
                                    stockMetric = null;
                                    z5 = this.$showMyInvestments;
                                    Investment_holding investment_holding2 = this.$holding;
                                    if (z5) {
                                    }
                                    Buttons access$getButtons2 = InvestingStockDetailsPresenter.access$getButtons(investingStockDetailsPresenter2, stockDetails2, investment_holding2);
                                    if (investment_holding2 == null) {
                                    }
                                    investmentHoldingState3 = SyncInvestmentHolding.InvestmentHoldingState.OWNED;
                                    if (investmentHoldingState2 == investmentHoldingState3) {
                                    }
                                    z8 = z7;
                                    LinkedHashSet sortOrder22 = RealBufferedSource.getSortOrder(stockDetails2.f1150type == InvestmentEntityType.ETF ? z7 : false, z8);
                                    Image icon222 = investmentEntityWithPrice2.getIcon();
                                    return new InvestingStockDetailsViewModel(new InvestmentEntityContentModel(new InvestingStockDetailsHeaderViewModel(icon222 != null ? new InvestingCryptoAvatarContentModel$Image(icon222, MoshiJsonIntegration.toModel(investmentEntityWithPrice2.getAccentColor())) : investmentHoldingState, investmentEntityWithPrice2.getDisplayName(), new InvestingStockDetailsHeaderViewModel.Subtitle(icon != null ? new InvestingCryptoAvatarContentModel$Icon(icon) : investmentHoldingState, str5, str6, investingCryptoAvatarContentModel$Icon2, str4, colorType), new ColorModel.Accented(color), stockMetric, true), graphPresenterData.contentModel, (!z10 || delisted) ? z7 : false, (delisted && z10) ? false : z7, this.$keyStatsModel, historicalRange, stockDetails3.isDependentCustomer ? investmentHoldingState : new InvestmentEntityContentModel.InvestmentEntityButtonContainerModel(new ColorModel.Accented(color), access$getButtons2.firstButtonLabel, access$getButtons2.secondButtonLabel), myInvestmentsContentModel, this.$newsModel, this.$recurringPreferenceModel, this.$financialViewModel, this.$earningsViewModel, this.$analystOpinionsViewModel, investingAboutContentModel, (investment_holding2 != null ? investment_holding2.state : investmentHoldingState) != investmentHoldingState3 ? z7 : false, investingDetailsCategorySectionContentModel, this.$etfHoldingModel, this.$activityModel, this.$disclosureText, sortOrder22));
                                }
                                format2 = z ? androidStringManager.get(R.string.investing_stock_details_offline) : null;
                                investingCryptoAvatarContentModel$Icon = z ? new InvestingCryptoAvatarContentModel$Icon(InvestingCryptoImage.CAUTION) : null;
                                i = 4;
                                z2 = true;
                                BigDecimal abs = movement.abs();
                                abs.getClass();
                                str = "%";
                                concat = BigDecimalsKt.toPrettyString(abs, z2).concat(str);
                                InvestingCryptoImage.Companion.getClass();
                                icon = zza.icon(movement);
                                ordinal = historicalRange.ordinal();
                                if (ordinal == 0) {
                                    str2 = androidStringManager.get(R.string.portfolio_value_today);
                                } else if (ordinal == z2) {
                                    str2 = androidStringManager.get(R.string.portfolio_value_past_week);
                                } else if (ordinal == 2) {
                                    str2 = androidStringManager.get(R.string.portfolio_value_past_month);
                                } else if (ordinal == 3) {
                                    str2 = androidStringManager.get(R.string.portfolio_value_past_year);
                                } else {
                                    if (ordinal != i) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    str2 = androidStringManager.get(R.string.portfolio_value_all);
                                }
                                if (str11 != null) {
                                }
                                z3 = z2;
                                z4 = z;
                                stockDetails2 = stockDetails;
                                str4 = format2;
                                color = color2;
                                investingCryptoAvatarContentModel$Icon2 = investingCryptoAvatarContentModel$Icon;
                                investingAboutContentModel = null;
                                list = this.$categories;
                                if (list.isEmpty()) {
                                }
                                InvestmentEntityWithPrice investmentEntityWithPrice522 = investmentEntityWithPrice;
                                if (delisted) {
                                }
                                investingStockDetailsPresenter2 = investingStockDetailsPresenter;
                                stockMetric = null;
                                z5 = this.$showMyInvestments;
                                Investment_holding investment_holding22 = this.$holding;
                                if (z5) {
                                }
                                Buttons access$getButtons22 = InvestingStockDetailsPresenter.access$getButtons(investingStockDetailsPresenter2, stockDetails2, investment_holding22);
                                if (investment_holding22 == null) {
                                }
                                investmentHoldingState3 = SyncInvestmentHolding.InvestmentHoldingState.OWNED;
                                if (investmentHoldingState2 == investmentHoldingState3) {
                                }
                                z8 = z7;
                                LinkedHashSet sortOrder222 = RealBufferedSource.getSortOrder(stockDetails2.f1150type == InvestmentEntityType.ETF ? z7 : false, z8);
                                Image icon2222 = investmentEntityWithPrice2.getIcon();
                                return new InvestingStockDetailsViewModel(new InvestmentEntityContentModel(new InvestingStockDetailsHeaderViewModel(icon2222 != null ? new InvestingCryptoAvatarContentModel$Image(icon2222, MoshiJsonIntegration.toModel(investmentEntityWithPrice2.getAccentColor())) : investmentHoldingState, investmentEntityWithPrice2.getDisplayName(), new InvestingStockDetailsHeaderViewModel.Subtitle(icon != null ? new InvestingCryptoAvatarContentModel$Icon(icon) : investmentHoldingState, str5, str6, investingCryptoAvatarContentModel$Icon2, str4, colorType), new ColorModel.Accented(color), stockMetric, true), graphPresenterData.contentModel, (!z10 || delisted) ? z7 : false, (delisted && z10) ? false : z7, this.$keyStatsModel, historicalRange, stockDetails3.isDependentCustomer ? investmentHoldingState : new InvestmentEntityContentModel.InvestmentEntityButtonContainerModel(new ColorModel.Accented(color), access$getButtons22.firstButtonLabel, access$getButtons22.secondButtonLabel), myInvestmentsContentModel, this.$newsModel, this.$recurringPreferenceModel, this.$financialViewModel, this.$earningsViewModel, this.$analystOpinionsViewModel, investingAboutContentModel, (investment_holding22 != null ? investment_holding22.state : investmentHoldingState) != investmentHoldingState3 ? z7 : false, investingDetailsCategorySectionContentModel, this.$etfHoldingModel, this.$activityModel, this.$disclosureText, sortOrder222));
                            }
                            investingStockDetailsPresenter = investingStockDetailsPresenter3;
                            graphPresenterData2 = graphPresenterData2;
                        }
                        currentPrice = price;
                        point = this.$scrubbedPoint;
                        if (point != null) {
                        }
                        BigDecimal abs2 = movement.abs();
                        abs2.getClass();
                        str = "%";
                        concat = BigDecimalsKt.toPrettyString(abs2, z2).concat(str);
                        InvestingCryptoImage.Companion.getClass();
                        icon = zza.icon(movement);
                        ordinal = historicalRange.ordinal();
                        if (ordinal == 0) {
                        }
                        if (str11 != null) {
                        }
                        z3 = z2;
                        z4 = z;
                        stockDetails2 = stockDetails;
                        str4 = format2;
                        color = color2;
                        investingCryptoAvatarContentModel$Icon2 = investingCryptoAvatarContentModel$Icon;
                        investingAboutContentModel = null;
                        list = this.$categories;
                        if (list.isEmpty()) {
                        }
                        InvestmentEntityWithPrice investmentEntityWithPrice5222 = investmentEntityWithPrice;
                        if (delisted) {
                        }
                        investingStockDetailsPresenter2 = investingStockDetailsPresenter;
                        stockMetric = null;
                        z5 = this.$showMyInvestments;
                        Investment_holding investment_holding222 = this.$holding;
                        if (z5) {
                        }
                        Buttons access$getButtons222 = InvestingStockDetailsPresenter.access$getButtons(investingStockDetailsPresenter2, stockDetails2, investment_holding222);
                        if (investment_holding222 == null) {
                        }
                        investmentHoldingState3 = SyncInvestmentHolding.InvestmentHoldingState.OWNED;
                        if (investmentHoldingState2 == investmentHoldingState3) {
                        }
                        z8 = z7;
                        LinkedHashSet sortOrder2222 = RealBufferedSource.getSortOrder(stockDetails2.f1150type == InvestmentEntityType.ETF ? z7 : false, z8);
                        Image icon22222 = investmentEntityWithPrice2.getIcon();
                        return new InvestingStockDetailsViewModel(new InvestmentEntityContentModel(new InvestingStockDetailsHeaderViewModel(icon22222 != null ? new InvestingCryptoAvatarContentModel$Image(icon22222, MoshiJsonIntegration.toModel(investmentEntityWithPrice2.getAccentColor())) : investmentHoldingState, investmentEntityWithPrice2.getDisplayName(), new InvestingStockDetailsHeaderViewModel.Subtitle(icon != null ? new InvestingCryptoAvatarContentModel$Icon(icon) : investmentHoldingState, str5, str6, investingCryptoAvatarContentModel$Icon2, str4, colorType), new ColorModel.Accented(color), stockMetric, true), graphPresenterData.contentModel, (!z10 || delisted) ? z7 : false, (delisted && z10) ? false : z7, this.$keyStatsModel, historicalRange, stockDetails3.isDependentCustomer ? investmentHoldingState : new InvestmentEntityContentModel.InvestmentEntityButtonContainerModel(new ColorModel.Accented(color), access$getButtons222.firstButtonLabel, access$getButtons222.secondButtonLabel), myInvestmentsContentModel, this.$newsModel, this.$recurringPreferenceModel, this.$financialViewModel, this.$earningsViewModel, this.$analystOpinionsViewModel, investingAboutContentModel, (investment_holding222 != null ? investment_holding222.state : investmentHoldingState) != investmentHoldingState3 ? z7 : false, investingDetailsCategorySectionContentModel, this.$etfHoldingModel, this.$activityModel, this.$disclosureText, sortOrder2222));
                    }
                    longValue = l.longValue();
                }
                sparseArrayCompat = sparseArrayCompat2;
                j = longValue;
                money5.getClass();
                investmentEntityWithPrice = investmentEntityWithPrice4;
                Long l42 = money5.amount;
                l42.getClass();
                z = z11;
                BigDecimal movement2 = UuidKt.movement(true, l42.longValue(), j);
                Long l52 = money5.amount;
                l52.getClass();
                long longValue32 = l52.longValue();
                long longValue42 = movement2.longValue();
                Long l62 = money5.amount;
                l62.getClass();
                stockDetails = stockDetails5;
                ?? r72 = sparseArrayCompat;
                BalanceTick balanceTick22 = new BalanceTick(new Long(longValue32), (BalanceEventList) null, new Long(androidClock.millis() / 1000), new Long(l62.longValue()), new Long(longValue42), (String) null, 98);
                AndroidDateFormatManager androidDateFormatManager2 = investingStockDetailsPresenter3.dateFormatManager;
                investingGraphContentModel = graphPresenterData2.contentModel;
                if (investingGraphContentModel instanceof InvestingGraphContentModel.Loaded) {
                }
                currentPrice = price;
                point = this.$scrubbedPoint;
                if (point != null) {
                }
                BigDecimal abs22 = movement2.abs();
                abs22.getClass();
                str = "%";
                concat = BigDecimalsKt.toPrettyString(abs22, z2).concat(str);
                InvestingCryptoImage.Companion.getClass();
                icon = zza.icon(movement2);
                ordinal = historicalRange.ordinal();
                if (ordinal == 0) {
                }
                if (str11 != null) {
                }
                z3 = z2;
                z4 = z;
                stockDetails2 = stockDetails;
                str4 = format2;
                color = color2;
                investingCryptoAvatarContentModel$Icon2 = investingCryptoAvatarContentModel$Icon;
                investingAboutContentModel = null;
                list = this.$categories;
                if (list.isEmpty()) {
                }
                InvestmentEntityWithPrice investmentEntityWithPrice52222 = investmentEntityWithPrice;
                if (delisted) {
                }
                investingStockDetailsPresenter2 = investingStockDetailsPresenter;
                stockMetric = null;
                z5 = this.$showMyInvestments;
                Investment_holding investment_holding2222 = this.$holding;
                if (z5) {
                }
                Buttons access$getButtons2222 = InvestingStockDetailsPresenter.access$getButtons(investingStockDetailsPresenter2, stockDetails2, investment_holding2222);
                if (investment_holding2222 == null) {
                }
                investmentHoldingState3 = SyncInvestmentHolding.InvestmentHoldingState.OWNED;
                if (investmentHoldingState2 == investmentHoldingState3) {
                }
                z8 = z7;
                LinkedHashSet sortOrder22222 = RealBufferedSource.getSortOrder(stockDetails2.f1150type == InvestmentEntityType.ETF ? z7 : false, z8);
                Image icon222222 = investmentEntityWithPrice2.getIcon();
                return new InvestingStockDetailsViewModel(new InvestmentEntityContentModel(new InvestingStockDetailsHeaderViewModel(icon222222 != null ? new InvestingCryptoAvatarContentModel$Image(icon222222, MoshiJsonIntegration.toModel(investmentEntityWithPrice2.getAccentColor())) : investmentHoldingState, investmentEntityWithPrice2.getDisplayName(), new InvestingStockDetailsHeaderViewModel.Subtitle(icon != null ? new InvestingCryptoAvatarContentModel$Icon(icon) : investmentHoldingState, str5, str6, investingCryptoAvatarContentModel$Icon2, str4, colorType), new ColorModel.Accented(color), stockMetric, true), graphPresenterData.contentModel, (!z10 || delisted) ? z7 : false, (delisted && z10) ? false : z7, this.$keyStatsModel, historicalRange, stockDetails3.isDependentCustomer ? investmentHoldingState : new InvestmentEntityContentModel.InvestmentEntityButtonContainerModel(new ColorModel.Accented(color), access$getButtons2222.firstButtonLabel, access$getButtons2222.secondButtonLabel), myInvestmentsContentModel, this.$newsModel, this.$recurringPreferenceModel, this.$financialViewModel, this.$earningsViewModel, this.$analystOpinionsViewModel, investingAboutContentModel, (investment_holding2222 != null ? investment_holding2222.state : investmentHoldingState) != investmentHoldingState3 ? z7 : false, investingDetailsCategorySectionContentModel, this.$etfHoldingModel, this.$activityModel, this.$disclosureText, sortOrder22222));
            }
            str3 = androidStringManager.get(R.string.delisted_stock_subtitle);
        }
        investingStockDetailsPresenter = investingStockDetailsPresenter3;
        investmentEntityWithPrice = investmentEntityWithPrice4;
        concat = str3;
        z = z11;
        stockDetails = stockDetails5;
        currentPrice = price;
        str2 = "";
        format2 = null;
        icon = null;
        z2 = true;
        str = "%";
        investingCryptoAvatarContentModel$Icon = null;
        if (str11 != null) {
        }
        z3 = z2;
        z4 = z;
        stockDetails2 = stockDetails;
        str4 = format2;
        color = color2;
        investingCryptoAvatarContentModel$Icon2 = investingCryptoAvatarContentModel$Icon;
        investingAboutContentModel = null;
        list = this.$categories;
        if (list.isEmpty()) {
        }
        InvestmentEntityWithPrice investmentEntityWithPrice522222 = investmentEntityWithPrice;
        if (delisted) {
        }
        investingStockDetailsPresenter2 = investingStockDetailsPresenter;
        stockMetric = null;
        z5 = this.$showMyInvestments;
        Investment_holding investment_holding22222 = this.$holding;
        if (z5) {
        }
        Buttons access$getButtons22222 = InvestingStockDetailsPresenter.access$getButtons(investingStockDetailsPresenter2, stockDetails2, investment_holding22222);
        if (investment_holding22222 == null) {
        }
        investmentHoldingState3 = SyncInvestmentHolding.InvestmentHoldingState.OWNED;
        if (investmentHoldingState2 == investmentHoldingState3) {
        }
        z8 = z7;
        LinkedHashSet sortOrder222222 = RealBufferedSource.getSortOrder(stockDetails2.f1150type == InvestmentEntityType.ETF ? z7 : false, z8);
        Image icon2222222 = investmentEntityWithPrice2.getIcon();
        return new InvestingStockDetailsViewModel(new InvestmentEntityContentModel(new InvestingStockDetailsHeaderViewModel(icon2222222 != null ? new InvestingCryptoAvatarContentModel$Image(icon2222222, MoshiJsonIntegration.toModel(investmentEntityWithPrice2.getAccentColor())) : investmentHoldingState, investmentEntityWithPrice2.getDisplayName(), new InvestingStockDetailsHeaderViewModel.Subtitle(icon != null ? new InvestingCryptoAvatarContentModel$Icon(icon) : investmentHoldingState, str5, str6, investingCryptoAvatarContentModel$Icon2, str4, colorType), new ColorModel.Accented(color), stockMetric, true), graphPresenterData.contentModel, (!z10 || delisted) ? z7 : false, (delisted && z10) ? false : z7, this.$keyStatsModel, historicalRange, stockDetails3.isDependentCustomer ? investmentHoldingState : new InvestmentEntityContentModel.InvestmentEntityButtonContainerModel(new ColorModel.Accented(color), access$getButtons22222.firstButtonLabel, access$getButtons22222.secondButtonLabel), myInvestmentsContentModel, this.$newsModel, this.$recurringPreferenceModel, this.$financialViewModel, this.$earningsViewModel, this.$analystOpinionsViewModel, investingAboutContentModel, (investment_holding22222 != null ? investment_holding22222.state : investmentHoldingState) != investmentHoldingState3 ? z7 : false, investingDetailsCategorySectionContentModel, this.$etfHoldingModel, this.$activityModel, this.$disclosureText, sortOrder222222));
    }
}
