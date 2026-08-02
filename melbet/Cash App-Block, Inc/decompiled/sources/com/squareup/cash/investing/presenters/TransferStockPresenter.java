package com.squareup.cash.investing.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.presenters.AmountSelectorPresenter;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.cdf.stock.StockTradeSetCustomOrder;
import com.squareup.cash.cdf.stock.StockTradeStartSellFailed;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.investing.backend.real.RecurringScheduleBuilder;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.db.InvestmentEntityQueries$withHoldings$2;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.db.WithHoldings;
import com.squareup.cash.investing.presenters.errors.FailedToStartTradeFlowError;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.TransferStockViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingFrequencyOption;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingFrequencyOptionKt$WhenMappings;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest$RequestValue$Amount;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest$RequestValue$Units;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.franklin.investing.resources.OrderType;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import okhttp3.MultipartBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;
import retrofit2.HttpException;

/* loaded from: classes6.dex */
public final class TransferStockPresenter implements MoleculePresenter {
    public final AmountSelectorPresenter amountSelectorPresenter;
    public final InvestingScreens.TransferStock args;
    public final ProductionAttributionEventEmitter attributionEventEmitter;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final CoroutineContext computationDispatcher;
    public final CashAccountDatabaseImpl database;
    public final TransferStockViewModel.DefaultEmptyModel defaultEmptyModel;
    public final InvestingFrequencyOption frequencyModel;
    public final RealInvestingAnalytics investingAnalytics;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final MoneyFormatter noSymbolMoneyFormatter;
    public final RecurringScheduleBuilder recurringScheduleBuilder;
    public final MoneyFormatter standardMoneyFormatter;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                ClientDriven.Companion companion = OrderSide.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ClientDriven.Companion companion2 = OrderSide.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ClientDriven.Companion companion3 = OrderSide.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TransferStockPresenter(AndroidStringManager androidStringManager, RealBalanceSnapshotManager realBalanceSnapshotManager, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CashAccountDatabaseImpl cashAccountDatabaseImpl, AmountSelectorPresenter amountSelectorPresenter, RecurringScheduleBuilder recurringScheduleBuilder, ProductionAttributionEventEmitter productionAttributionEventEmitter, InvestmentOrderPresenter$Factory$Impl investmentOrderPresenter$Factory$Impl, RealInvestingAnalytics realInvestingAnalytics, LocalizedMoneyFormatter.Factory factory, BetterNavigator.ScreenNavigator screenNavigator, InvestingScreens.TransferStock transferStock) {
        transferStock.getClass();
        this.stringManager = androidStringManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.ioDispatcher = coroutineContext;
        this.computationDispatcher = coroutineContext2;
        this.database = cashAccountDatabaseImpl;
        this.amountSelectorPresenter = amountSelectorPresenter;
        this.recurringScheduleBuilder = recurringScheduleBuilder;
        this.attributionEventEmitter = productionAttributionEventEmitter;
        this.investingAnalytics = realInvestingAnalytics;
        this.navigator = screenNavigator;
        this.args = transferStock;
        this.standardMoneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.noSymbolMoneyFormatter = factory.createNoSymbolCompact();
        RecurringSchedule.Frequency frequency = transferStock.frequency;
        this.frequencyModel = (frequency == null ? -1 : InvestingFrequencyOptionKt$WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()]) == -1 ? InvestingFrequencyOption.OneTime.INSTANCE : new InvestingFrequencyOption.Recurring(frequency);
        this.defaultEmptyModel = TransferStockViewModel.DefaultEmptyModel.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleTradeEvent(TransferStockPresenter transferStockPresenter, WithHoldings withHoldings, String str, MultipartBody.Companion companion, AmountSheetSavedState amountSheetSavedState, Function1 function1, Function2 function2, ContinuationImpl continuationImpl) {
        TransferStockPresenter$handleTradeEvent$1 transferStockPresenter$handleTradeEvent$1;
        int i;
        Object initiateInvestmentOrderRequest;
        RealInvestingAnalytics realInvestingAnalytics = transferStockPresenter.investingAnalytics;
        InvestingScreens.TransferStock transferStock = transferStockPresenter.args;
        try {
            if (continuationImpl instanceof TransferStockPresenter$handleTradeEvent$1) {
                transferStockPresenter$handleTradeEvent$1 = (TransferStockPresenter$handleTradeEvent$1) continuationImpl;
                int i2 = transferStockPresenter$handleTradeEvent$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    transferStockPresenter$handleTradeEvent$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = transferStockPresenter$handleTradeEvent$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = transferStockPresenter$handleTradeEvent$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        InvestingScreens.OrderType orderType = transferStock.f1162type;
                        InvestmentEntityToken investmentEntityToken = transferStock.investmentEntityToken;
                        OrderSide orderSide = transferStock.side;
                        if (orderSide == OrderSide.SELL && (companion instanceof TradeEvent$TransferStock)) {
                            long j = orderType instanceof InvestingScreens.OrderType.CustomOrder ? ((InvestingScreens.OrderType.CustomOrder) orderType).targetUsdPerShare : transferStock.usdPerShare;
                            String str2 = withHoldings.units;
                            str2.getClass();
                            BigDecimal bigDecimal = new BigDecimal(str2);
                            BigDecimal valueOf = BigDecimal.valueOf(j);
                            valueOf.getClass();
                            BigDecimal multiply = bigDecimal.multiply(valueOf);
                            multiply.getClass();
                            long longValue = multiply.longValue();
                            long j2 = longValue - ((TradeEvent$TransferStock) companion).amount;
                            if (j2 <= 100 || j2 <= longValue * 0.02d) {
                                AndroidStringManager androidStringManager = transferStockPresenter.stringManager;
                                String str3 = withHoldings.display_name;
                                str3.getClass();
                                Resources resources = androidStringManager.resources;
                                resources.getClass();
                                String format2 = new MessageFormat(resources.getString(R.string.transfer_stock_roundup_title)).format(new Object[]{str3});
                                format2.getClass();
                                function1.invoke(new TransferStockViewModel.Content.FullScreenContent.DialogContent(format2, transferStock.accentColor, TransferStockViewModel.Content.FullScreenContent.DialogContent.Type.AGREE_OR_CANCEL));
                                return Unit.INSTANCE;
                            }
                        }
                        if (orderType instanceof InvestingScreens.OrderType.CustomOrder) {
                            String str4 = withHoldings.symbol;
                            com.squareup.cash.cdf.stock.OrderSide cdf = ProcessPhoenix.toCdf(orderSide);
                            TradeEvent$TransferStock tradeEvent$TransferStock = companion instanceof TradeEvent$TransferStock ? (TradeEvent$TransferStock) companion : null;
                            Long l = tradeEvent$TransferStock != null ? new Long(tradeEvent$TransferStock.amount) : null;
                            long j3 = ((InvestingScreens.OrderType.CustomOrder) orderType).currentUsdPerShare;
                            long j4 = ((InvestingScreens.OrderType.CustomOrder) orderType).targetUsdPerShare;
                            str4.getClass();
                            realInvestingAnalytics.analytics.track(new StockTradeSetCustomOrder(cdf, str4, l, Long.valueOf(j3), Long.valueOf(j4)), null);
                            ColorModel colorModel = transferStock.accentColor;
                            InvestingScreens.OrderType.CustomOrder customOrder = (InvestingScreens.OrderType.CustomOrder) orderType;
                            if (companion instanceof TradeEvent$TransferAllShares) {
                                orderSide = OrderSide.SELL_ALL;
                            } else if (!(companion instanceof TradeEvent$TransferStock)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            OrderSide orderSide2 = orderSide;
                            InvestmentEntityToken investmentEntityToken2 = transferStock.investmentEntityToken;
                            String str5 = withHoldings.symbol;
                            TradeEvent$TransferAllShares tradeEvent$TransferAllShares = companion instanceof TradeEvent$TransferAllShares ? (TradeEvent$TransferAllShares) companion : null;
                            String str6 = tradeEvent$TransferAllShares != null ? tradeEvent$TransferAllShares.shares : null;
                            TradeEvent$TransferStock tradeEvent$TransferStock2 = companion instanceof TradeEvent$TransferStock ? (TradeEvent$TransferStock) companion : null;
                            transferStockPresenter.navigator.goTo(new InvestingScreens.InvestingPeriodSelectionScreen(colorModel, customOrder, orderSide2, str, tradeEvent$TransferStock2 != null ? new Long(tradeEvent$TransferStock2.amount) : null, InvestingScreens.TransferStock.copy$default(transferStock, null, amountSheetSavedState, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), investmentEntityToken2, str5, str6));
                        } else {
                            if (!Intrinsics.areEqual(orderType, InvestingScreens.OrderType.Standard.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            RecurringSchedule build = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()] == 1 ? transferStockPresenter.recurringScheduleBuilder.build(transferStock.frequency) : null;
                            if (companion instanceof TradeEvent$TransferAllShares) {
                                initiateInvestmentOrderRequest = new InitiateInvestmentOrderRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), investmentEntityToken.value, str, UUID.randomUUID().toString(), new InitiateInvestmentOrderRequest$RequestValue$Units(((TradeEvent$TransferAllShares) companion).shares), OrderType.MARKET, OrderSide.SELL_ALL, build, null, 1792);
                            } else {
                                if (!(companion instanceof TradeEvent$TransferStock)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                initiateInvestmentOrderRequest = new InitiateInvestmentOrderRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), investmentEntityToken.value, str, UUID.randomUUID().toString(), new InitiateInvestmentOrderRequest$RequestValue$Amount(new Money(new Long(((TradeEvent$TransferStock) companion).amount), CurrencyCode.USD, 4)), OrderType.MARKET, transferStock.side, build, null, 1792);
                            }
                            transferStockPresenter$handleTradeEvent$1.label = 1;
                            if (function2.invoke(initiateInvestmentOrderRequest, transferStockPresenter$handleTradeEvent$1) == obj2) {
                                return obj2;
                            }
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            if (transferStock.side == OrderSide.SELL && (!(e instanceof HttpException) || ((HttpException) e).code == 500)) {
                realInvestingAnalytics.analytics.track(new StockTradeStartSellFailed(), null);
            }
            throw new FailedToStartTradeFlowError(e, transferStock.f1162type.toString(), transferStock.investmentEntityToken.toString());
        }
        transferStockPresenter$handleTradeEvent$1 = new TransferStockPresenter$handleTradeEvent$1(transferStockPresenter, continuationImpl);
        Object obj3 = transferStockPresenter$handleTradeEvent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferStockPresenter$handleTradeEvent$1.label;
    }

    public final Long getMinimumStocksAmount(Investing_settings investing_settings) {
        Money money;
        if (Intrinsics.areEqual(this.frequencyModel, InvestingFrequencyOption.OneTime.INSTANCE) || investing_settings == null || (money = investing_settings.min_scheduled_stock_buy_amt) == null) {
            return null;
        }
        return money.amount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032a  */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.squareup.cash.investing.viewmodels.TransferStockViewModel$Content$Icon, java.lang.String] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Money money;
        MutableState mutableState;
        MutableState mutableState2;
        int i2;
        InvestingScreens.OrderType orderType;
        OrderSide orderSide;
        AndroidStringManager androidStringManager;
        Resources resources;
        Money money2;
        char c;
        Money money3;
        Money money4;
        Object rememberedValue;
        Object obj;
        boolean changed;
        Object rememberedValue2;
        Object rememberedValue3;
        Object obj2;
        TransferStockPresenter transferStockPresenter;
        WithHoldings withHoldings;
        Object obj3;
        MutableState mutableState3;
        TransferStockViewModel.DefaultEmptyModel defaultEmptyModel;
        State state;
        Channel channel;
        InvestingScreens.OrderType orderType2;
        OrderSide orderSide2;
        boolean z;
        MutableState mutableState4;
        Object obj4;
        MutableState mutableState5;
        boolean z2;
        Resources resources2;
        String format2;
        AndroidStringManager androidStringManager2;
        WithHoldings withHoldings2;
        boolean z3;
        MutableState mutableState6;
        MutableState mutableState7;
        FormattedResource formattedResource;
        TransferStockViewModel.Content.Subtitle subtitle;
        boolean z4;
        TransferStockViewModel.Content.Subtitle subtitle2;
        KFunction kFunction;
        Channel channel2;
        String format3;
        Object amountSelectorState;
        Object bottomSheetContent;
        Long minimumStocksAmount;
        String str;
        TransferStockViewModel.Content.Icon icon;
        WithHoldings withHoldings3;
        Money money5;
        AndroidStringManager androidStringManager3 = this.stringManager;
        Resources resources3 = androidStringManager3.resources;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-467708729);
        Object rememberedValue4 = gapComposer.rememberedValue();
        int i3 = 6;
        Object obj5 = Composer.Companion.Empty;
        if (rememberedValue4 == obj5) {
            rememberedValue4 = PapaEvent.Channel$default(1, null, null, 6);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Channel channel3 = (Channel) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj5) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState8 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        InvestingScreens.TransferStock transferStock = this.args;
        if (rememberedValue6 == obj5) {
            rememberedValue6 = Recorder$$ExternalSyntheticOutline1.m(transferStock.savedState instanceof AmountSheetSavedState.AmountKeypadState, gapComposer);
        }
        MutableState mutableState9 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj5) {
            rememberedValue7 = Updater.derivedStateOf(new ScoreSummaryKt$$ExternalSyntheticLambda1(mutableState8, mutableState9, i3));
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        State state2 = (State) rememberedValue7;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj5) {
            rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState10 = (MutableState) rememberedValue8;
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj5) {
            Object obj6 = transferStock.savedState;
            if (obj6 == null) {
                obj6 = new AmountSheetSavedState.AmountSelectorState(null);
            }
            rememberedValue9 = Updater.mutableStateOf$default(obj6);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState11 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer.rememberedValue();
        CoroutineContext coroutineContext = this.ioDispatcher;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = this.database;
        if (rememberedValue10 == obj5) {
            rememberedValue10 = DBUtil.mapToOneOrNull(DBUtil.toFlow(cashAccountDatabaseImpl.investingSettingsQueries.select$2()), coroutineContext);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer, 48, 2);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == obj5) {
            Object realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.balanceSnapshotManager.select(), 24);
            gapComposer.updateRememberedValue(realBadger2$setup$lambda$0$$inlined$mapNotNull$1);
            rememberedValue11 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue11, null, null, gapComposer, 48, 2);
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) collectAsState2.getValue();
        if (balanceSnapshot == null || (money = balanceSnapshot.balance) == null) {
            money = new Money((Long) 0L, CurrencyCode.USD, 4);
        }
        Money money6 = money;
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == obj5) {
            InvestmentEntityQueries investmentEntityQueries = cashAccountDatabaseImpl.investmentEntityQueries;
            String str2 = transferStock.investmentEntityToken.value;
            investmentEntityQueries.getClass();
            str2.getClass();
            InvestmentEntityQueries$withHoldings$2 investmentEntityQueries$withHoldings$2 = InvestmentEntityQueries$withHoldings$2.INSTANCE;
            mutableState = mutableState8;
            mutableState2 = collectAsState2;
            i2 = 4;
            rememberedValue12 = new FinishSetupTileBadgeCounter(i2, DBUtil.toFlow(new InvestmentEntityQueries.ForTokenQuery(investmentEntityQueries, str2, new InvestmentEntityQueries$$ExternalSyntheticLambda7(investmentEntityQueries, 1), (byte) 0)), coroutineContext);
            gapComposer.updateRememberedValue(rememberedValue12);
        } else {
            mutableState = mutableState8;
            mutableState2 = collectAsState2;
            i2 = 4;
        }
        MutableState mutableState12 = mutableState2;
        int i4 = i2;
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue12, null, null, gapComposer, 48, 2);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == obj5) {
            rememberedValue13 = new FinishSetupTileBadgeCounter(i4, DBUtil.toFlow(cashAccountDatabaseImpl.investmentEntityQueries.forToken(transferStock.investmentEntityToken.value)), coroutineContext);
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue13, null, null, gapComposer, 48, 2);
        WithHoldings withHoldings4 = (WithHoldings) collectAsState3.getValue();
        TransferStockViewModel.DefaultEmptyModel defaultEmptyModel2 = this.defaultEmptyModel;
        if (withHoldings4 == null || ((Investment_entity) collectAsState4.getValue()) == null) {
            gapComposer.end(false);
            return defaultEmptyModel2;
        }
        WithHoldings withHoldings5 = (WithHoldings) collectAsState3.getValue();
        withHoldings5.getClass();
        CurrencyCode currencyCode = withHoldings5.currency;
        String str3 = withHoldings5.units;
        OrderSide orderSide3 = transferStock.side;
        InvestingScreens.OrderType orderType3 = transferStock.f1162type;
        OrderSide orderSide4 = OrderSide.BUY;
        if (orderSide3 == orderSide4) {
            Investing_settings investing_settings = (Investing_settings) collectAsState.getValue();
            if (investing_settings != null && (money5 = investing_settings.purchase_limit) != null) {
                orderType = orderType3;
                orderSide = orderSide3;
                androidStringManager = androidStringManager3;
                resources = resources3;
                money4 = money5;
                c = 4;
                rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj5) {
                    obj = null;
                    rememberedValue = FlowKt.flowOn(new SafeFlow(new AnimationsKt$takeUntil$1$1(this, withHoldings5, collectAsState, (Continuation) null)), this.computationDispatcher);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    obj = null;
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue, EmptyList.INSTANCE, null, gapComposer, 48, 2);
                changed = gapComposer.changed((AmountSheetSavedState) mutableState11.getValue());
                rememberedValue2 = gapComposer.rememberedValue();
                if (!changed || rememberedValue2 == obj5) {
                    String str4 = transferStock.investmentEntityToken.value;
                    ColorModel colorModel = transferStock.accentColor;
                    String valueOf = String.valueOf(transferStock.referrerFlowToken);
                    str4.getClass();
                    colorModel.getClass();
                    Object inviteErrorPresenter = new InviteErrorPresenter(colorModel, str4, valueOf);
                    gapComposer.updateRememberedValue(inviteErrorPresenter);
                    rememberedValue2 = inviteErrorPresenter;
                }
                MoleculePresenter moleculePresenter = (MoleculePresenter) rememberedValue2;
                rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == obj5) {
                    rememberedValue3 = FlowKt.receiveAsFlow(channel3);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Screen screen = (Screen) moleculePresenter.models((Flow) rememberedValue3, gapComposer, 0);
                obj2 = !(screen instanceof InvestmentOrderPresenter$Empty) ? screen : obj;
                if (obj2 != null) {
                    gapComposer.startReplaceGroup(-1106477359);
                    withHoldings = withHoldings5;
                    obj3 = obj;
                    mutableState3 = collectAsState;
                    defaultEmptyModel = defaultEmptyModel2;
                    state = state2;
                    channel = channel3;
                    orderType2 = orderType;
                    orderSide2 = orderSide;
                    mutableState4 = collectAsState5;
                    obj4 = obj5;
                    mutableState5 = mutableState10;
                    MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(obj2, (Continuation) null, this, screen, mutableState5, 16);
                    Object obj7 = obj2;
                    transferStockPresenter = this;
                    Updater.LaunchedEffect(gapComposer, obj7, moleculeKt$immediateClockFlow$1$1$1);
                    z = false;
                    gapComposer.end(false);
                } else {
                    transferStockPresenter = this;
                    withHoldings = withHoldings5;
                    obj3 = obj;
                    mutableState3 = collectAsState;
                    defaultEmptyModel = defaultEmptyModel2;
                    state = state2;
                    channel = channel3;
                    orderType2 = orderType;
                    orderSide2 = orderSide;
                    z = false;
                    mutableState4 = collectAsState5;
                    obj4 = obj5;
                    mutableState5 = mutableState10;
                    gapComposer.startReplaceGroup(-1106436997);
                    gapComposer.end(false);
                }
                if (((List) mutableState4.getValue()).isEmpty()) {
                    gapComposer.end(z);
                    return defaultEmptyModel;
                }
                Object singleOrNull = CollectionsKt.singleOrNull((List) mutableState4.getValue());
                Object obj8 = singleOrNull instanceof AmountSelection.TradeAll ? (AmountSelection.TradeAll) singleOrNull : obj3;
                Object obj9 = TransferStockViewModel.Loading.INSTANCE;
                if (obj8 != null) {
                    gapComposer.startReplaceGroup(-633587156);
                    if (((BalanceSnapshot) mutableState12.getValue()) != null) {
                        gapComposer.startReplaceGroup(-633552436);
                        BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) mutableState12.getValue();
                        boolean changedInstance = gapComposer.changedInstance(transferStockPresenter) | gapComposer.changedInstance(withHoldings) | gapComposer.changed(mutableState12) | gapComposer.changedInstance(obj8) | gapComposer.changedInstance(channel);
                        Object rememberedValue14 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue14 == obj4) {
                            WithHoldings withHoldings6 = withHoldings;
                            z2 = z;
                            withHoldings3 = withHoldings6;
                            Object dbSessionManager$updateDb$2 = new DbSessionManager$updateDb$2(transferStockPresenter, withHoldings3, obj8, mutableState12, mutableState11, mutableState, channel, null, 6);
                            gapComposer.updateRememberedValue(dbSessionManager$updateDb$2);
                            rememberedValue14 = dbSessionManager$updateDb$2;
                        } else {
                            withHoldings3 = withHoldings;
                            z2 = z;
                        }
                        Updater.LaunchedEffect(withHoldings3, balanceSnapshot2, obj8, (Function2) rememberedValue14, gapComposer);
                        gapComposer.end(z2);
                    } else {
                        z2 = z;
                        gapComposer.startReplaceGroup(-633107493);
                        gapComposer.end(z2);
                    }
                    gapComposer.end(z2);
                } else {
                    WithHoldings withHoldings7 = withHoldings;
                    z2 = z;
                    gapComposer.startReplaceGroup(-633080709);
                    gapComposer.end(z2);
                    if (orderSide2 == orderSide4 || !withHoldings7.delisted) {
                        gapComposer.startReplaceGroup(-632613477);
                        gapComposer.end(z2);
                        String str5 = withHoldings7.display_name;
                        int ordinal = orderSide2.ordinal();
                        InvestingScreens.OrderType.Standard standard = InvestingScreens.OrderType.Standard.INSTANCE;
                        if (ordinal == 0) {
                            resources2 = resources;
                            if (Intrinsics.areEqual(orderType2, standard)) {
                                str5.getClass();
                                resources2.getClass();
                                format2 = new MessageFormat(resources2.getString(R.string.investing_transfer_stock_purchase_amount)).format(new Object[]{str5});
                                format2.getClass();
                            } else {
                                if (!(orderType2 instanceof InvestingScreens.OrderType.CustomOrder)) {
                                    Object obj10 = obj3;
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj10;
                                }
                                str5.getClass();
                                resources2.getClass();
                                format2 = new MessageFormat(resources2.getString(R.string.investing_transfer_stock_purchase_amount_custom)).format(new Object[]{str5});
                                format2.getClass();
                            }
                        } else {
                            if (ordinal != 1 && ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return obj3;
                            }
                            if (Intrinsics.areEqual(orderType2, standard)) {
                                str5.getClass();
                                resources.getClass();
                                resources2 = resources;
                                format2 = new MessageFormat(resources2.getString(R.string.investing_transfer_stock_sell_amount)).format(new Object[]{str5});
                                format2.getClass();
                            } else {
                                resources2 = resources;
                                if (!(orderType2 instanceof InvestingScreens.OrderType.CustomOrder)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj3;
                                }
                                str5.getClass();
                                resources2.getClass();
                                format2 = new MessageFormat(resources2.getString(R.string.investing_transfer_stock_sell_amount_custom)).format(new Object[]{str5});
                                format2.getClass();
                            }
                        }
                        String str6 = format2;
                        boolean z5 = orderType2 instanceof InvestingScreens.OrderType.Standard;
                        gapComposer.startReplaceGroup(1503647818);
                        if (z5) {
                            gapComposer.startReplaceGroup(1732974390);
                            InvestingFrequencyOption investingFrequencyOption = transferStockPresenter.frequencyModel;
                            AndroidStringManager androidStringManager4 = androidStringManager;
                            String str7 = androidStringManager4.get(investingFrequencyOption.getLabelResId());
                            if (investingFrequencyOption.equals(InvestingFrequencyOption.OneTime.INSTANCE)) {
                                Object obj11 = obj3;
                                str = obj11;
                                icon = obj11;
                            } else {
                                str = obj3;
                                icon = TransferStockViewModel.Content.Icon.RECURRING;
                            }
                            TransferStockViewModel.Content.Subtitle subtitle3 = new TransferStockViewModel.Content.Subtitle(str7, icon, str, 4);
                            gapComposer.end(false);
                            mutableState6 = mutableState12;
                            withHoldings2 = withHoldings7;
                            z3 = z5;
                            mutableState7 = mutableState5;
                            subtitle2 = subtitle3;
                            z4 = false;
                            androidStringManager2 = androidStringManager4;
                        } else {
                            ?? r9 = obj3;
                            androidStringManager2 = androidStringManager;
                            gapComposer.startReplaceGroup(1733229179);
                            if (z5) {
                                gapComposer.startReplaceGroup(1733217027);
                                TransferStockViewModel.Content.Subtitle subtitle4 = new TransferStockViewModel.Content.Subtitle(withHoldings7.symbol, r9, r9, 6);
                                z4 = false;
                                gapComposer.end(false);
                                gapComposer.end(false);
                                mutableState6 = mutableState12;
                                withHoldings2 = withHoldings7;
                                z3 = z5;
                                mutableState7 = mutableState5;
                                subtitle2 = subtitle4;
                            } else {
                                if (!(orderType2 instanceof InvestingScreens.OrderType.CustomOrder)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 471552615, false);
                                }
                                gapComposer.startReplaceGroup(1733375902);
                                InvestingScreens.OrderType.CustomOrder customOrder = (InvestingScreens.OrderType.CustomOrder) orderType2;
                                withHoldings2 = withHoldings7;
                                z3 = z5;
                                long j = customOrder.currentUsdPerShare;
                                long j2 = customOrder.targetUsdPerShare;
                                Long valueOf2 = Long.valueOf(j2);
                                mutableState6 = mutableState12;
                                CurrencyCode currencyCode2 = CurrencyCode.USD;
                                mutableState7 = mutableState5;
                                Money money7 = new Money(valueOf2, currencyCode2, 4);
                                MoneyFormatter moneyFormatter = transferStockPresenter.standardMoneyFormatter;
                                String format4 = moneyFormatter.format(money7);
                                if (WhenMappings.$EnumSwitchMapping$0[orderSide2.ordinal()] == 1) {
                                    gapComposer.startReplaceGroup(1733475722);
                                    FormattedResources formattedResources = FormattedResources.INSTANCE;
                                    if (j2 > j) {
                                        gapComposer.startReplaceGroup(1733617640);
                                        Object rememberedValue15 = gapComposer.rememberedValue();
                                        if (rememberedValue15 == obj4) {
                                            rememberedValue15 = new EnumListAdapter$encode$1(1, formattedResources, FormattedResources.class, "investing_transfer_stock_subtitle_up_custom", "investing_transfer_stock_subtitle_up_custom(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 21);
                                            gapComposer.updateRememberedValue(rememberedValue15);
                                        }
                                        kFunction = (KFunction) rememberedValue15;
                                        z4 = false;
                                        gapComposer.end(false);
                                    } else {
                                        gapComposer.startReplaceGroup(1733709958);
                                        Object rememberedValue16 = gapComposer.rememberedValue();
                                        if (rememberedValue16 == obj4) {
                                            rememberedValue16 = new EnumListAdapter$encode$1(1, formattedResources, FormattedResources.class, "investing_transfer_stock_subtitle_down_custom", "investing_transfer_stock_subtitle_down_custom(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 22);
                                            gapComposer.updateRememberedValue(rememberedValue16);
                                        }
                                        kFunction = (KFunction) rememberedValue16;
                                        z4 = false;
                                        gapComposer.end(false);
                                    }
                                    subtitle = new TransferStockViewModel.Content.Subtitle(androidStringManager2.getString((FormattedResource) ((Function1) kFunction).invoke(format4)), null, null, 6);
                                    Boxes$$ExternalSyntheticOutline1.m(gapComposer, z4, z4, z4);
                                } else {
                                    gapComposer.startReplaceGroup(1733970916);
                                    BigDecimal bigDecimal = new BigDecimal(j2);
                                    str3.getClass();
                                    BigDecimal multiply = bigDecimal.multiply(new BigDecimal(str3));
                                    multiply.getClass();
                                    String format5 = moneyFormatter.format(new Money(Long.valueOf(multiply.longValue()), currencyCode2, 4));
                                    if (j2 > j) {
                                        format4.getClass();
                                        format5.getClass();
                                        ArrayMap arrayMap = new ArrayMap(2);
                                        arrayMap.put("target_price", format4);
                                        arrayMap.put("target_value", format5);
                                        formattedResource = new FormattedResource(R.string.investing_transfer_stock_custom_sell_up_information, arrayMap);
                                    } else {
                                        format4.getClass();
                                        format5.getClass();
                                        ArrayMap arrayMap2 = new ArrayMap(2);
                                        arrayMap2.put("target_price", format4);
                                        arrayMap2.put("target_value", format5);
                                        formattedResource = new FormattedResource(R.string.investing_transfer_stock_custom_sell_down_information, arrayMap2);
                                    }
                                    format5.getClass();
                                    resources2.getClass();
                                    String format6 = new MessageFormat(resources2.getString(R.string.investing_transfer_stock_custom_sell_limit)).format(new Object[]{format5});
                                    format6.getClass();
                                    subtitle = new TransferStockViewModel.Content.Subtitle(format6, null, Countries.getString(resources2, formattedResource), 2);
                                    z4 = false;
                                    Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, false, false);
                                }
                                subtitle2 = subtitle;
                            }
                        }
                        gapComposer.end(z4);
                        Object rememberedValue17 = gapComposer.rememberedValue();
                        if (rememberedValue17 == obj4) {
                            rememberedValue17 = Updater.mutableStateOf$default("0");
                            gapComposer.updateRememberedValue(rememberedValue17);
                        }
                        MutableState mutableState13 = (MutableState) rememberedValue17;
                        Object rememberedValue18 = gapComposer.rememberedValue();
                        if (rememberedValue18 == obj4) {
                            rememberedValue18 = Updater.derivedStateOf(new CashMapViewKt$$ExternalSyntheticLambda2(5, mutableState13));
                            gapComposer.updateRememberedValue(rememberedValue18);
                        }
                        State state3 = (State) rememberedValue18;
                        Object rememberedValue19 = gapComposer.rememberedValue();
                        if (rememberedValue19 == obj4) {
                            rememberedValue19 = Updater.mutableStateOf$default(null);
                            gapComposer.updateRememberedValue(rememberedValue19);
                        }
                        MutableState mutableState14 = (MutableState) rememberedValue19;
                        Object rememberedValue20 = gapComposer.rememberedValue();
                        if (rememberedValue20 == obj4) {
                            rememberedValue20 = Updater.mutableStateOf$default("0");
                            gapComposer.updateRememberedValue(rememberedValue20);
                        }
                        MutableState mutableState15 = (MutableState) rememberedValue20;
                        boolean z6 = (((Boolean) mutableState7.getValue()).booleanValue() || (!((Boolean) state.getValue()).booleanValue() ? ((AmountSelection) mutableState14.getValue()) != null : !((minimumStocksAmount = transferStockPresenter.getMinimumStocksAmount((Investing_settings) mutableState3.getValue())) != null ? ((Number) state3.getValue()).longValue() < minimumStocksAmount.longValue() : ((Number) state3.getValue()).longValue() <= 0))) ? z4 : true;
                        if (((Boolean) state.getValue()).booleanValue() || ((AmountSelection) mutableState14.getValue()) != null) {
                            if (((Boolean) state.getValue()).booleanValue()) {
                                format3 = (String) mutableState13.getValue();
                            } else {
                                AmountSelection amountSelection = (AmountSelection) mutableState14.getValue();
                                amountSelection.getClass();
                                boolean z7 = amountSelection instanceof AmountSelection.TradeSome;
                                MoneyFormatter moneyFormatter2 = transferStockPresenter.noSymbolMoneyFormatter;
                                if (z7) {
                                    format3 = moneyFormatter2.format(new Money(Long.valueOf(((AmountSelection.TradeSome) amountSelection).amount), CurrencyCode.USD, 4));
                                } else {
                                    if (amountSelection instanceof AmountSelection.TradeAll) {
                                        channel2 = channel;
                                        format3 = moneyFormatter2.format(new Money(Long.valueOf(((AmountSelection.TradeAll) amountSelection).amount), CurrencyCode.USD, 4));
                                    } else {
                                        channel2 = channel;
                                        if (!(amountSelection instanceof AmountSelection.TradeCustomize)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        format3 = moneyFormatter2.format(new Money((Long) 0L, CurrencyCode.USD, 4));
                                    }
                                    mutableState15.setValue(format3);
                                }
                            }
                            channel2 = channel;
                            mutableState15.setValue(format3);
                        } else {
                            channel2 = channel;
                        }
                        if (((Boolean) state.getValue()).booleanValue()) {
                            amountSelectorState = new AmountSheetSavedState.AmountKeypadState((String) mutableState15.getValue());
                        } else {
                            Object obj12 = (AmountSelection) mutableState14.getValue();
                            AmountSelection.HasAmount hasAmount = obj12 instanceof AmountSelection.HasAmount ? (AmountSelection.HasAmount) obj12 : null;
                            amountSelectorState = new AmountSheetSavedState.AmountSelectorState(hasAmount != null ? Long.valueOf(hasAmount.getAmount()) : null);
                        }
                        mutableState11.setValue(amountSelectorState);
                        boolean changed2 = gapComposer.changed(((Number) state3.getValue()).longValue());
                        Object rememberedValue21 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue21 == obj4) {
                            rememberedValue21 = Updater.derivedStateOf(new IntentLauncher$$ExternalSyntheticLambda0(18, transferStockPresenter, state3));
                            gapComposer.updateRememberedValue(rememberedValue21);
                        }
                        State state4 = (State) rememberedValue21;
                        if (((Boolean) state.getValue()).booleanValue()) {
                            bottomSheetContent = new TransferStockViewModel.Content.FullScreenContent(str6, subtitle2, z3, (String) mutableState15.getValue(), money4, androidStringManager2.get(R.string.investing_transfer_stock_button_text), z6, (String) state4.getValue(), (TransferStockViewModel.Content.FullScreenContent.DialogContent) mutableState.getValue());
                        } else {
                            boolean z8 = z6;
                            bottomSheetContent = new TransferStockViewModel.Content.BottomSheetContent(str6, subtitle2, z3, (List) mutableState4.getValue(), (String) mutableState15.getValue(), money4, androidStringManager2.get(R.string.investing_transfer_stock_button_text), z8, (String) state4.getValue());
                            z6 = z8;
                        }
                        MutableState mutableState16 = mutableState7;
                        boolean z9 = z6;
                        Updater.LaunchedEffect(gapComposer, flow, new TransferStockPresenter$models$$inlined$CollectEffect$1(flow, null, z9, transferStockPresenter, withHoldings2, subtitle2, mutableState9, mutableState, state, state3, mutableState14, mutableState3, mutableState6, mutableState11, channel2, mutableState13, collectAsState4, mutableState4, mutableState16));
                        if (!((Boolean) mutableState16.getValue()).booleanValue()) {
                            obj9 = bottomSheetContent;
                        }
                        gapComposer.end(false);
                        return obj9;
                    }
                    gapComposer.startReplaceGroup(-633020941);
                    boolean changedInstance2 = gapComposer.changedInstance(transferStockPresenter) | gapComposer.changedInstance(withHoldings7) | gapComposer.changed(mutableState12) | gapComposer.changedInstance(channel);
                    Object rememberedValue22 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue22 == obj4) {
                        Object moneybotChatPresenter$models$6$1 = new MoneybotChatPresenter$models$6$1(transferStockPresenter, withHoldings7, mutableState12, mutableState11, mutableState, channel, (Continuation) null);
                        gapComposer.updateRememberedValue(moneybotChatPresenter$models$6$1);
                        rememberedValue22 = moneybotChatPresenter$models$6$1;
                    }
                    Updater.LaunchedEffect(gapComposer, withHoldings7, (Function2) rememberedValue22);
                    gapComposer.end(z2);
                }
                gapComposer.end(z2);
                return obj9;
            }
            orderType = orderType3;
            money4 = money6;
            orderSide = orderSide3;
            androidStringManager = androidStringManager3;
            resources = resources3;
            c = 4;
            rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == obj5) {
            }
            MutableState collectAsState52 = Updater.collectAsState((Flow) rememberedValue, EmptyList.INSTANCE, null, gapComposer, 48, 2);
            changed = gapComposer.changed((AmountSheetSavedState) mutableState11.getValue());
            rememberedValue2 = gapComposer.rememberedValue();
            if (!changed) {
            }
            String str42 = transferStock.investmentEntityToken.value;
            ColorModel colorModel2 = transferStock.accentColor;
            String valueOf3 = String.valueOf(transferStock.referrerFlowToken);
            str42.getClass();
            colorModel2.getClass();
            Object inviteErrorPresenter2 = new InviteErrorPresenter(colorModel2, str42, valueOf3);
            gapComposer.updateRememberedValue(inviteErrorPresenter2);
            rememberedValue2 = inviteErrorPresenter2;
            MoleculePresenter moleculePresenter2 = (MoleculePresenter) rememberedValue2;
            rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj5) {
            }
            Screen screen2 = (Screen) moleculePresenter2.models((Flow) rememberedValue3, gapComposer, 0);
            if (!(screen2 instanceof InvestmentOrderPresenter$Empty)) {
            }
            if (obj2 != null) {
            }
            if (((List) mutableState4.getValue()).isEmpty()) {
            }
        } else {
            if (orderType3 instanceof InvestingScreens.OrderType.CustomOrder) {
                Investing_settings investing_settings2 = (Investing_settings) collectAsState.getValue();
                if (investing_settings2 == null || (money6 = investing_settings2.sell_limit) == null) {
                    orderType = orderType3;
                    str3.getClass();
                    BigDecimal bigDecimal2 = new BigDecimal(str3);
                    orderSide = orderSide3;
                    androidStringManager = androidStringManager3;
                    resources = resources3;
                    BigDecimal valueOf4 = BigDecimal.valueOf(((InvestingScreens.OrderType.CustomOrder) orderType).targetUsdPerShare);
                    valueOf4.getClass();
                    BigDecimal multiply2 = bigDecimal2.multiply(valueOf4);
                    multiply2.getClass();
                    c = 4;
                    money2 = new Money(Long.valueOf(multiply2.longValue()), currencyCode, 4);
                }
                orderType = orderType3;
                money4 = money6;
                orderSide = orderSide3;
                androidStringManager = androidStringManager3;
                resources = resources3;
                c = 4;
                rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj5) {
                }
                MutableState collectAsState522 = Updater.collectAsState((Flow) rememberedValue, EmptyList.INSTANCE, null, gapComposer, 48, 2);
                changed = gapComposer.changed((AmountSheetSavedState) mutableState11.getValue());
                rememberedValue2 = gapComposer.rememberedValue();
                if (!changed) {
                }
                String str422 = transferStock.investmentEntityToken.value;
                ColorModel colorModel22 = transferStock.accentColor;
                String valueOf32 = String.valueOf(transferStock.referrerFlowToken);
                str422.getClass();
                colorModel22.getClass();
                Object inviteErrorPresenter22 = new InviteErrorPresenter(colorModel22, str422, valueOf32);
                gapComposer.updateRememberedValue(inviteErrorPresenter22);
                rememberedValue2 = inviteErrorPresenter22;
                MoleculePresenter moleculePresenter22 = (MoleculePresenter) rememberedValue2;
                rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == obj5) {
                }
                Screen screen22 = (Screen) moleculePresenter22.models((Flow) rememberedValue3, gapComposer, 0);
                if (!(screen22 instanceof InvestmentOrderPresenter$Empty)) {
                }
                if (obj2 != null) {
                }
                if (((List) mutableState4.getValue()).isEmpty()) {
                }
            } else {
                orderType = orderType3;
                orderSide = orderSide3;
                androidStringManager = androidStringManager3;
                resources = resources3;
                Investing_settings investing_settings3 = (Investing_settings) collectAsState.getValue();
                if (investing_settings3 == null || (money3 = investing_settings3.sell_limit) == null) {
                    str3.getClass();
                    BigDecimal bigDecimal3 = new BigDecimal(str3);
                    BigDecimal valueOf5 = BigDecimal.valueOf(transferStock.usdPerShare);
                    valueOf5.getClass();
                    BigDecimal multiply3 = bigDecimal3.multiply(valueOf5);
                    multiply3.getClass();
                    c = 4;
                    money2 = new Money(Long.valueOf(multiply3.longValue()), currencyCode, 4);
                } else {
                    money4 = money3;
                    c = 4;
                    rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj5) {
                    }
                    MutableState collectAsState5222 = Updater.collectAsState((Flow) rememberedValue, EmptyList.INSTANCE, null, gapComposer, 48, 2);
                    changed = gapComposer.changed((AmountSheetSavedState) mutableState11.getValue());
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (!changed) {
                    }
                    String str4222 = transferStock.investmentEntityToken.value;
                    ColorModel colorModel222 = transferStock.accentColor;
                    String valueOf322 = String.valueOf(transferStock.referrerFlowToken);
                    str4222.getClass();
                    colorModel222.getClass();
                    Object inviteErrorPresenter222 = new InviteErrorPresenter(colorModel222, str4222, valueOf322);
                    gapComposer.updateRememberedValue(inviteErrorPresenter222);
                    rememberedValue2 = inviteErrorPresenter222;
                    MoleculePresenter moleculePresenter222 = (MoleculePresenter) rememberedValue2;
                    rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == obj5) {
                    }
                    Screen screen222 = (Screen) moleculePresenter222.models((Flow) rememberedValue3, gapComposer, 0);
                    if (!(screen222 instanceof InvestmentOrderPresenter$Empty)) {
                    }
                    if (obj2 != null) {
                    }
                    if (((List) mutableState4.getValue()).isEmpty()) {
                    }
                }
            }
            money4 = money2;
            rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == obj5) {
            }
            MutableState collectAsState52222 = Updater.collectAsState((Flow) rememberedValue, EmptyList.INSTANCE, null, gapComposer, 48, 2);
            changed = gapComposer.changed((AmountSheetSavedState) mutableState11.getValue());
            rememberedValue2 = gapComposer.rememberedValue();
            if (!changed) {
            }
            String str42222 = transferStock.investmentEntityToken.value;
            ColorModel colorModel2222 = transferStock.accentColor;
            String valueOf3222 = String.valueOf(transferStock.referrerFlowToken);
            str42222.getClass();
            colorModel2222.getClass();
            Object inviteErrorPresenter2222 = new InviteErrorPresenter(colorModel2222, str42222, valueOf3222);
            gapComposer.updateRememberedValue(inviteErrorPresenter2222);
            rememberedValue2 = inviteErrorPresenter2222;
            MoleculePresenter moleculePresenter2222 = (MoleculePresenter) rememberedValue2;
            rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj5) {
            }
            Screen screen2222 = (Screen) moleculePresenter2222.models((Flow) rememberedValue3, gapComposer, 0);
            if (!(screen2222 instanceof InvestmentOrderPresenter$Empty)) {
            }
            if (obj2 != null) {
            }
            if (((List) mutableState4.getValue()).isEmpty()) {
            }
        }
    }
}
