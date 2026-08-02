package com.squareup.cash.investing.presenters.custom.order;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.mlkit.vision.text.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.presenters.StockMetricFactory;
import com.squareup.cash.investing.presenters.TotalInvestmentValue;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investing.viewmodels.custom.order.CustomOrderTooltipViewModel$CurrentPrice;
import com.squareup.cash.investing.viewmodels.custom.order.CustomOrderTooltipViewModel$Informational;
import com.squareup.cash.investing.viewmodels.custom.order.CustomOrderTooltipViewModel$PercentChange;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderContentModel;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$2$1;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.money.Moneys;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.cash.portfolios.BalanceEventList;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataResponse;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.protos.franklin.common.PriceTick;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.util.BigDecimalsKt;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.TypesJVMKt;
import kotlin.uuid.UuidKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import net.oneformapp.schema.SchemaFactory;

/* loaded from: classes6.dex */
public final class InvestingCustomOrderPresenter implements MoleculePresenter {
    public final RealInvestingAnalytics analytics;
    public final RealBitcoinInboundNavigator bitcoinInboundNavigator;
    public final ChannelFlowTransformLatest bitcoinValueFlow;
    public final MoneyFormatter compactMoneyFormatter;
    public final RealCryptoBalanceRepo cryptoBalanceRepo;
    public final BooleanPreference firstBuyPreference;
    public final BooleanPreference firstSellPreference;
    public final zzd graphInformationPresenter;
    public final RealInvestingHistoricalData historicalData;
    public final RealInvestmentEntities investmentEntities;
    public final MoneyFormatter moneyFormatter;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Cache rangeCache;
    public final InvestingScreens.CustomOrderScreen screen;
    public final Cache selectedPriceCache;
    public final StockMetricFactory stockMetricFactory;
    public final AndroidStringManager stringManager;

    public final class GraphInformation {
        public final CurrencyCode currencyCode;
        public final InvestingGraphContentModel.Loaded graph;
        public final long maxPrice;
        public final long minPrice;
        public final HistoricalRange range;
        public final List ticks;

        public GraphInformation(long j, long j2, ListBuilder listBuilder, InvestingGraphContentModel.Loaded loaded, CurrencyCode currencyCode, HistoricalRange historicalRange) {
            listBuilder.getClass();
            loaded.getClass();
            currencyCode.getClass();
            historicalRange.getClass();
            this.maxPrice = j;
            this.minPrice = j2;
            this.ticks = listBuilder;
            this.graph = loaded;
            this.currencyCode = currencyCode;
            this.range = historicalRange;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GraphInformation)) {
                return false;
            }
            GraphInformation graphInformation = (GraphInformation) obj;
            return PriceValue.m3663equalsimpl0(this.maxPrice, graphInformation.maxPrice) && PriceValue.m3663equalsimpl0(this.minPrice, graphInformation.minPrice) && Intrinsics.areEqual(this.ticks, graphInformation.ticks) && Intrinsics.areEqual(this.graph, graphInformation.graph) && this.currencyCode == graphInformation.currencyCode && this.range == graphInformation.range;
        }

        public final int hashCode() {
            return this.range.hashCode() + ((this.currencyCode.hashCode() + ((this.graph.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.maxPrice) * 31, 31, this.minPrice), 31, this.ticks)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GraphInformation(maxPrice=", PriceValue.m3664toStringimpl(this.maxPrice), ", minPrice=", PriceValue.m3664toStringimpl(this.minPrice), ", ticks=");
            m.append(this.ticks);
            m.append(", graph=");
            m.append(this.graph);
            m.append(", currencyCode=");
            m.append(this.currencyCode);
            m.append(", range=");
            m.append(this.range);
            m.append(")");
            return m.toString();
        }
    }

    public InvestingCustomOrderPresenter(RealInvestingHistoricalData realInvestingHistoricalData, Cache cache, RealInvestmentEntities realInvestmentEntities, AndroidStringManager androidStringManager, Cache cache2, StockMetricFactory stockMetricFactory, RealCryptoBalanceRepo realCryptoBalanceRepo, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, RealInvestingAnalytics realInvestingAnalytics, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, RealInvestingGraphCalculator realInvestingGraphCalculator, RealCryptoValueRepo realCryptoValueRepo, LocalizedMoneyFormatter.Factory factory, InvestingScreens.CustomOrderScreen customOrderScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        customOrderScreen.getClass();
        this.historicalData = realInvestingHistoricalData;
        this.rangeCache = cache;
        this.investmentEntities = realInvestmentEntities;
        this.stringManager = androidStringManager;
        this.selectedPriceCache = cache2;
        this.stockMetricFactory = stockMetricFactory;
        this.cryptoBalanceRepo = realCryptoBalanceRepo;
        this.analytics = realInvestingAnalytics;
        this.firstBuyPreference = booleanPreference;
        this.firstSellPreference = booleanPreference2;
        this.moneyFormatterFactory = factory;
        this.screen = customOrderScreen;
        this.navigator = screenNavigator;
        this.bitcoinInboundNavigator = realBitcoinInboundNavigator$Factory$Impl.create(screenNavigator);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.compactMoneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.graphInformationPresenter = new zzd(realInvestingGraphCalculator, 26);
        this.bitcoinValueFlow = realCryptoValueRepo.valuePerBitcoin(CurrencyCode.USD);
    }

    public static final Money createContentModel$asMoney(long j, GraphInformation graphInformation) {
        return new Money(Long.valueOf(j), graphInformation.currencyCode, 4);
    }

    public static final Money createContentModelForBtc$asMoney(long j, GraphInformation graphInformation) {
        return new Money(Long.valueOf(j), graphInformation.currencyCode, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x065d  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object investingCustomOrderPresenter$models$5$1;
        MutableState mutableState;
        ColorModel colorModel;
        MoneyFormatter moneyFormatter;
        OrderSide orderSide;
        InvestingScreens.CustomOrderScreen customOrderScreen;
        HistoricalRange historicalRange;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        GapComposer gapComposer;
        boolean z;
        TypesJVMKt customOrderTooltipViewModel$Informational;
        TypesJVMKt customOrderTooltipViewModel$PercentChange;
        TotalInvestmentValue totalInvestmentValue;
        Object investingCustomOrderPresenter$models$5$12;
        GapComposer gapComposer2;
        MutableState mutableState5;
        ColorModel colorModel2;
        HistoricalRange historicalRange2;
        InvestingCustomOrderPresenter investingCustomOrderPresenter;
        MutableState mutableState6;
        MutableState mutableState7;
        GapComposer gapComposer3;
        TypesJVMKt customOrderTooltipViewModel$PercentChange2;
        TotalInvestmentValue totalInvestmentValue2;
        flow.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startReplaceGroup(668481393);
        Object rememberedValue = gapComposer4.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = this.bitcoinValueFlow;
            gapComposer4.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer4, 48, 2);
        Object rememberedValue2 = gapComposer4.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer4.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState8 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer4.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            HistoricalRange historicalRange3 = HistoricalRange.MONTH;
            Cache cache = this.rangeCache;
            if (cache.cache == null) {
                cache.cache = historicalRange3;
            }
            Object obj = cache.cache;
            obj.getClass();
            rememberedValue3 = Updater.mutableStateOf$default(obj);
            gapComposer4.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState9 = (MutableState) rememberedValue3;
        HistoricalRange historicalRange4 = (HistoricalRange) mutableState9.getValue();
        boolean changedInstance = gapComposer4.changedInstance(this);
        Object rememberedValue4 = gapComposer4.rememberedValue();
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new InvestingCustomOrderPresenter$models$1$1(this, mutableState9, null, 0);
            gapComposer4.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer4, historicalRange4, (Function2) rememberedValue4);
        Object rememberedValue5 = gapComposer4.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            InvestingCustomOrderViewEvent.SelectedPrice selectedPrice = new InvestingCustomOrderViewEvent.SelectedPrice(null);
            Cache cache2 = this.selectedPriceCache;
            if (cache2.cache == null) {
                cache2.cache = selectedPrice;
            }
            Object obj2 = cache2.cache;
            obj2.getClass();
            rememberedValue5 = Updater.mutableStateOf$default(obj2);
            gapComposer4.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState10 = (MutableState) rememberedValue5;
        InvestingCustomOrderViewEvent.SelectedPrice selectedPrice2 = (InvestingCustomOrderViewEvent.SelectedPrice) mutableState10.getValue();
        boolean changedInstance2 = gapComposer4.changedInstance(this);
        Object rememberedValue6 = gapComposer4.rememberedValue();
        if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new InvestingCustomOrderPresenter$models$1$1(this, mutableState10, null, 1);
            gapComposer4.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(gapComposer4, selectedPrice2, (Function2) rememberedValue6);
        Object rememberedValue7 = gapComposer4.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer4.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState11 = (MutableState) rememberedValue7;
        HistoricalRange historicalRange5 = (HistoricalRange) mutableState9.getValue();
        Object rememberedValue8 = gapComposer4.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new OffersHomePresenter$models$2$1(mutableState11, mutableState10, null, 5);
            gapComposer4.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(gapComposer4, historicalRange5, (Function2) rememberedValue8);
        Object rememberedValue9 = gapComposer4.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = Updater.mutableStateOf$default(null);
            gapComposer4.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState12 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer4.rememberedValue();
        if (rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer4.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState13 = (MutableState) rememberedValue10;
        Object rememberedValue11 = gapComposer4.rememberedValue();
        if (rememberedValue11 == neverEqualPolicy) {
            rememberedValue11 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer4.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState14 = (MutableState) rememberedValue11;
        Updater.LaunchedEffect(gapComposer4, flow, new OffersHomePresenter$models$8$1(flow, (Continuation) null, (MoleculePresenter) this, mutableState12, mutableState8, mutableState10, mutableState13, mutableState14, mutableState9, 6));
        InvestingScreens.CustomOrderScreen customOrderScreen2 = this.screen;
        InvestingScreens.OrderTypeSelectionScreen.Type type2 = customOrderScreen2.f1157type;
        OrderSide orderSide2 = customOrderScreen2.side;
        ColorModel colorModel3 = customOrderScreen2.accentColor;
        boolean z2 = type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity;
        StockMetricFactory stockMetricFactory = this.stockMetricFactory;
        BooleanPreference booleanPreference = this.firstSellPreference;
        BooleanPreference booleanPreference2 = this.firstBuyPreference;
        MoneyFormatter moneyFormatter2 = this.moneyFormatter;
        MoneyFormatter moneyFormatter3 = this.compactMoneyFormatter;
        zzd zzdVar = this.graphInformationPresenter;
        InvestingCustomOrderContentModel.Loading loading = InvestingCustomOrderContentModel.Loading.INSTANCE;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z2) {
            gapComposer4.startReplaceGroup(-1028726142);
            Object rememberedValue12 = gapComposer4.rememberedValue();
            if (rememberedValue12 == neverEqualPolicy) {
                type2.getClass();
                rememberedValue12 = this.investmentEntities.stockDetails(((InvestingScreens.OrderTypeSelectionScreen.Type.Equity) type2).entityToken);
                gapComposer4.updateRememberedValue(rememberedValue12);
            }
            MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue12, null, null, gapComposer4, 48, 2);
            Object rememberedValue13 = gapComposer4.rememberedValue();
            if (rememberedValue13 == neverEqualPolicy) {
                rememberedValue13 = Updater.mutableStateOf$default(null);
                gapComposer4.updateRememberedValue(rememberedValue13);
            }
            MutableState mutableState15 = (MutableState) rememberedValue13;
            HistoricalRange historicalRange6 = (HistoricalRange) mutableState9.getValue();
            boolean changedInstance3 = gapComposer4.changedInstance(this);
            Object rememberedValue14 = gapComposer4.rememberedValue();
            if (changedInstance3 || rememberedValue14 == neverEqualPolicy) {
                gapComposer2 = gapComposer4;
                mutableState5 = mutableState9;
                colorModel2 = colorModel3;
                historicalRange2 = historicalRange6;
                investingCustomOrderPresenter = this;
                investingCustomOrderPresenter$models$5$12 = new InvestingCustomOrderPresenter$models$5$1(investingCustomOrderPresenter, mutableState5, mutableState15, mutableState13, null, 0);
                mutableState6 = mutableState15;
                mutableState7 = mutableState13;
                gapComposer2.updateRememberedValue(investingCustomOrderPresenter$models$5$12);
            } else {
                gapComposer2 = gapComposer4;
                investingCustomOrderPresenter$models$5$12 = rememberedValue14;
                mutableState5 = mutableState9;
                mutableState6 = mutableState15;
                mutableState7 = mutableState13;
                colorModel2 = colorModel3;
                historicalRange2 = historicalRange6;
                investingCustomOrderPresenter = this;
            }
            Updater.LaunchedEffect(gapComposer2, historicalRange2, (Function2) investingCustomOrderPresenter$models$5$12);
            if (((StockDetails) collectAsState2.getValue()) != null && ((GetInvestmentEntityHistoricalDataResponse) mutableState6.getValue()) != null) {
                GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) mutableState6.getValue();
                getInvestmentEntityHistoricalDataResponse.getClass();
                GetPortfoliosHistoricalDataResponse asPortfolioModel = SchemaFactory.asPortfolioModel(getInvestmentEntityHistoricalDataResponse, EmptyList.INSTANCE, new MerchantBlockingViewKt$$ExternalSyntheticLambda15(26, androidStringManager, investingCustomOrderPresenter.moneyFormatterFactory));
                CurrencyCode currencyCode = getInvestmentEntityHistoricalDataResponse.base_currency_code;
                currencyCode.getClass();
                GraphInformation model = zzdVar.model(new GraphInformationPresenter$HistoricalData(asPortfolioModel, currencyCode), (HistoricalRange) mutableState5.getValue(), gapComposer2);
                InvestingGraphContentModel.Loaded loaded = model.graph;
                StockDetails stockDetails = (StockDetails) collectAsState2.getValue();
                stockDetails.getClass();
                InvestmentEntityWithPrice investmentEntityWithPrice = stockDetails.entityWithPrice;
                InvestingCustomOrderViewEvent.SelectedPrice selectedPrice3 = (InvestingCustomOrderViewEvent.SelectedPrice) mutableState10.getValue();
                boolean booleanValue = ((Boolean) mutableState8.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) mutableState7.getValue()).booleanValue();
                boolean booleanValue3 = ((Boolean) mutableState14.getValue()).booleanValue();
                String str = (String) mutableState12.getValue();
                long j = (long) ((InvestingGraphContentModel.Point) CollectionsKt.last(loaded.points)).y;
                PriceValue priceValue = selectedPrice3.priceValue;
                long j2 = priceValue != null ? priceValue.value : j;
                if (PriceValue.m3663equalsimpl0(j2, j)) {
                    customOrderTooltipViewModel$PercentChange2 = (orderSide2 != OrderSide.BUY || booleanPreference2.get() || booleanValue) ? ((orderSide2 != OrderSide.SELL && orderSide2 != OrderSide.SELL_ALL) || booleanPreference.get() || booleanValue) ? new CustomOrderTooltipViewModel$CurrentPrice(moneyFormatter2.format(createContentModel$asMoney(j, model)), androidStringManager.get(R.string.custom_order_current_value)) : new CustomOrderTooltipViewModel$Informational(androidStringManager.get(R.string.custom_order_first_time_sale)) : new CustomOrderTooltipViewModel$Informational(androidStringManager.get(R.string.custom_order_first_time_purchase));
                    gapComposer3 = gapComposer2;
                } else {
                    BigDecimal movement = UuidKt.movement(true, j2, j);
                    String format2 = moneyFormatter2.format(createContentModel$asMoney(j2, model));
                    BigDecimal abs = movement.abs();
                    abs.getClass();
                    gapComposer3 = gapComposer2;
                    customOrderTooltipViewModel$PercentChange2 = new CustomOrderTooltipViewModel$PercentChange(format2, BigDecimalsKt.toPrettyString(abs, false).concat("%"), Intrinsics.compare(j, j2) > 0 ? InvestingCryptoImage.ARROW_DOWN : InvestingCryptoImage.ARROW_UP);
                }
                if (orderSide2 == OrderSide.SELL && (investmentEntityWithPrice instanceof InvestmentEntityWithPrice.Owned)) {
                    CurrencyCode currencyCode2 = model.currencyCode;
                    String str2 = ((InvestmentEntityWithPrice.Owned) investmentEntityWithPrice).units;
                    type2.getClass();
                    InvestmentEntityToken investmentEntityToken = ((InvestingScreens.OrderTypeSelectionScreen.Type.Equity) type2).entityToken;
                    long roundToLong = MathKt__MathJVMKt.roundToLong(Double.parseDouble(str2) * j2);
                    StockMetric.BackgroundType backgroundType = StockMetric.BackgroundType.DARK;
                    investmentEntityToken.getClass();
                    totalInvestmentValue2 = new TotalInvestmentValue(roundToLong, currencyCode2, investmentEntityToken, backgroundType, stockMetricFactory.moneyFormatter.format(new Money(Long.valueOf(roundToLong), currencyCode2, 4)));
                } else {
                    totalInvestmentValue2 = null;
                }
                String str3 = androidStringManager.get(R.string.custom_order_screen_title);
                Image icon = investmentEntityWithPrice.getIcon();
                InvestingCustomOrderContentModel.Content content = new InvestingCustomOrderContentModel.Content(str3, new InvestingStockDetailsHeaderViewModel(icon != null ? new InvestingCryptoAvatarContentModel$Image(icon, MoshiJsonIntegration.toModel(investmentEntityWithPrice.getAccentColor())) : null, investmentEntityWithPrice.getDisplayName(), null, customOrderScreen2.accentColor, totalInvestmentValue2, false), InvestingGraphContentModel.Loaded.copy$default(loaded, null, new InvestingGraphContentModel$AccentColorType$UptoDateData(colorModel2), 503), moneyFormatter3.format(createContentModel$asMoney(model.maxPrice, model)), moneyFormatter3.format(createContentModel$asMoney(model.minPrice, model)), model.ticks, customOrderTooltipViewModel$PercentChange2, model.range, new PriceValue(j2), j, str, booleanValue2, booleanValue3);
                GapComposer gapComposer5 = gapComposer3;
                gapComposer5.end(false);
                gapComposer5.end(false);
                return content;
            }
            gapComposer = gapComposer2;
            z = false;
            gapComposer.end(false);
        } else {
            if (!(type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, -1834300102, false);
            }
            gapComposer4.startReplaceGroup(-1027516677);
            Object rememberedValue15 = gapComposer4.rememberedValue();
            if (rememberedValue15 == neverEqualPolicy) {
                rememberedValue15 = Updater.mutableStateOf$default(null);
                gapComposer4.updateRememberedValue(rememberedValue15);
            }
            MutableState mutableState16 = (MutableState) rememberedValue15;
            HistoricalRange historicalRange7 = (HistoricalRange) mutableState9.getValue();
            boolean changedInstance4 = gapComposer4.changedInstance(this);
            Object rememberedValue16 = gapComposer4.rememberedValue();
            if (changedInstance4 || rememberedValue16 == neverEqualPolicy) {
                mutableState = collectAsState;
                colorModel = colorModel3;
                moneyFormatter = moneyFormatter3;
                orderSide = orderSide2;
                customOrderScreen = customOrderScreen2;
                historicalRange = historicalRange7;
                investingCustomOrderPresenter$models$5$1 = new InvestingCustomOrderPresenter$models$5$1(this, mutableState9, mutableState13, mutableState16, null, 1);
                mutableState2 = mutableState9;
                mutableState3 = mutableState13;
                mutableState4 = mutableState16;
                gapComposer4.updateRememberedValue(investingCustomOrderPresenter$models$5$1);
            } else {
                mutableState4 = mutableState16;
                mutableState = collectAsState;
                colorModel = colorModel3;
                moneyFormatter = moneyFormatter3;
                orderSide = orderSide2;
                mutableState2 = mutableState9;
                customOrderScreen = customOrderScreen2;
                historicalRange = historicalRange7;
                investingCustomOrderPresenter$models$5$1 = rememberedValue16;
                mutableState3 = mutableState13;
            }
            Updater.LaunchedEffect(gapComposer4, historicalRange, (Function2) investingCustomOrderPresenter$models$5$1);
            Object rememberedValue17 = gapComposer4.rememberedValue();
            if (rememberedValue17 == neverEqualPolicy) {
                RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(this.cryptoBalanceRepo.getBitcoinBalance(), 11);
                gapComposer4.updateRememberedValue(realDrawerOpener$getDrawerScreen$$inlined$map$1);
                rememberedValue17 = realDrawerOpener$getDrawerScreen$$inlined$map$1;
            }
            MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue17, null, null, gapComposer4, 48, 2);
            gapComposer = gapComposer4;
            if (((GetHistoricalExchangeDataResponse) mutableState4.getValue()) == null || ((Money) collectAsState3.getValue()) == null) {
                z = false;
                gapComposer.end(false);
            } else {
                GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) mutableState4.getValue();
                getHistoricalExchangeDataResponse.getClass();
                PriceHistory priceHistory = getHistoricalExchangeDataResponse.price_history;
                priceHistory.getClass();
                Long l = priceHistory.start_time;
                Long l2 = priceHistory.end_time;
                Long l3 = priceHistory.tick_frequency_ms;
                String str4 = priceHistory.base_currency_code;
                str4.getClass();
                CurrencyCode valueOf = CurrencyCode.valueOf(str4);
                List list = priceHistory.price_ticks;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PriceTick priceTick = (PriceTick) it.next();
                    Iterator it2 = it;
                    Long l4 = priceTick.price_cents;
                    arrayList.add(new BalanceTick(l4, new BalanceEventList(), priceTick.time, l4, (Long) null, (String) null, 112));
                    it = it2;
                }
                GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = new GetPortfoliosHistoricalDataResponse(new BalanceHistory(l, l3, valueOf, arrayList, l2), EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                String str5 = priceHistory.quote_currency_code;
                str5.getClass();
                GraphInformation model2 = zzdVar.model(new GraphInformationPresenter$HistoricalData(getPortfoliosHistoricalDataResponse, CurrencyCode.valueOf(str5)), (HistoricalRange) mutableState2.getValue(), gapComposer);
                Money money = (Money) mutableState.getValue();
                if (money != null) {
                    Money money2 = (Money) collectAsState3.getValue();
                    money2.getClass();
                    InvestingCustomOrderViewEvent.SelectedPrice selectedPrice4 = (InvestingCustomOrderViewEvent.SelectedPrice) mutableState10.getValue();
                    boolean booleanValue4 = ((Boolean) mutableState8.getValue()).booleanValue();
                    String str6 = (String) mutableState12.getValue();
                    boolean booleanValue5 = ((Boolean) mutableState3.getValue()).booleanValue();
                    boolean booleanValue6 = ((Boolean) mutableState14.getValue()).booleanValue();
                    long amount = Moneys.amount(money);
                    PriceValue priceValue2 = selectedPrice4.priceValue;
                    long j3 = priceValue2 != null ? priceValue2.value : amount;
                    if (orderSide == OrderSide.BUY && !booleanPreference2.get() && !booleanValue4) {
                        customOrderTooltipViewModel$Informational = new CustomOrderTooltipViewModel$Informational(androidStringManager.get(R.string.custom_order_first_time_purchase_bitcoin));
                    } else if ((orderSide == OrderSide.SELL || orderSide == OrderSide.SELL_ALL) && !booleanPreference.get() && !booleanValue4) {
                        customOrderTooltipViewModel$Informational = new CustomOrderTooltipViewModel$Informational(androidStringManager.get(R.string.custom_order_first_time_sale_bitcoin));
                    } else {
                        if (!PriceValue.m3663equalsimpl0(j3, amount)) {
                            BigDecimal movement2 = UuidKt.movement(true, j3, amount);
                            String format3 = moneyFormatter2.format(createContentModelForBtc$asMoney(j3, model2));
                            BigDecimal abs2 = movement2.abs();
                            abs2.getClass();
                            customOrderTooltipViewModel$PercentChange = new CustomOrderTooltipViewModel$PercentChange(format3, BigDecimalsKt.toPrettyString(abs2, false).concat("%"), Intrinsics.compare(amount, j3) > 0 ? InvestingCryptoImage.ARROW_DOWN : InvestingCryptoImage.ARROW_UP);
                            if (orderSide != OrderSide.SELL) {
                                Long l5 = money2.amount;
                                l5.getClass();
                                BigDecimal valueOf2 = BigDecimal.valueOf(l5.longValue());
                                valueOf2.getClass();
                                BigDecimal valueOf3 = BigDecimal.valueOf(100000000L);
                                valueOf3.getClass();
                                String bigDecimal = valueOf2.divide(valueOf3, MathContext.DECIMAL32).toString();
                                bigDecimal.getClass();
                                CurrencyCode currencyCode3 = model2.currencyCode;
                                InvestmentEntityToken investmentEntityToken2 = new InvestmentEntityToken("bitcoin");
                                long roundToLong2 = MathKt__MathJVMKt.roundToLong(Double.parseDouble(bigDecimal) * j3);
                                totalInvestmentValue = new TotalInvestmentValue(roundToLong2, currencyCode3, investmentEntityToken2, StockMetric.BackgroundType.DARK, stockMetricFactory.moneyFormatter.format(new Money(Long.valueOf(roundToLong2), currencyCode3, 4)));
                            } else {
                                totalInvestmentValue = null;
                            }
                            MoneyFormatter moneyFormatter4 = moneyFormatter;
                            InvestingCustomOrderContentModel.Content content2 = new InvestingCustomOrderContentModel.Content(androidStringManager.get(R.string.custom_order_screen_title_bitcoin), new InvestingStockDetailsHeaderViewModel(new InvestingCryptoAvatarContentModel$Icon(InvestingCryptoImage.BITCOIN), androidStringManager.get(R.string.custom_order_screen_header_bitcoin), null, customOrderScreen.accentColor, totalInvestmentValue, false), InvestingGraphContentModel.Loaded.copy$default(model2.graph, null, new InvestingGraphContentModel$AccentColorType$UptoDateData(colorModel), 503), moneyFormatter4.format(createContentModelForBtc$asMoney(model2.maxPrice, model2)), moneyFormatter4.format(createContentModelForBtc$asMoney(model2.minPrice, model2)), model2.ticks, customOrderTooltipViewModel$PercentChange, model2.range, new PriceValue(j3), amount, str6, booleanValue5, booleanValue6);
                            gapComposer.end(false);
                            gapComposer.end(false);
                            return content2;
                        }
                        customOrderTooltipViewModel$Informational = new CustomOrderTooltipViewModel$CurrentPrice(moneyFormatter2.format(createContentModelForBtc$asMoney(amount, model2)), androidStringManager.get(R.string.custom_order_current_value_bitcoin));
                    }
                    customOrderTooltipViewModel$PercentChange = customOrderTooltipViewModel$Informational;
                    if (orderSide != OrderSide.SELL) {
                    }
                    MoneyFormatter moneyFormatter42 = moneyFormatter;
                    InvestingCustomOrderContentModel.Content content22 = new InvestingCustomOrderContentModel.Content(androidStringManager.get(R.string.custom_order_screen_title_bitcoin), new InvestingStockDetailsHeaderViewModel(new InvestingCryptoAvatarContentModel$Icon(InvestingCryptoImage.BITCOIN), androidStringManager.get(R.string.custom_order_screen_header_bitcoin), null, customOrderScreen.accentColor, totalInvestmentValue, false), InvestingGraphContentModel.Loaded.copy$default(model2.graph, null, new InvestingGraphContentModel$AccentColorType$UptoDateData(colorModel), 503), moneyFormatter42.format(createContentModelForBtc$asMoney(model2.maxPrice, model2)), moneyFormatter42.format(createContentModelForBtc$asMoney(model2.minPrice, model2)), model2.ticks, customOrderTooltipViewModel$PercentChange, model2.range, new PriceValue(j3), amount, str6, booleanValue5, booleanValue6);
                    gapComposer.end(false);
                    gapComposer.end(false);
                    return content22;
                }
                z = false;
                gapComposer.end(false);
            }
        }
        gapComposer.end(z);
        return loading;
    }
}
