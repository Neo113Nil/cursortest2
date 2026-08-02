package com.squareup.cash.investing.presenters.custom.order;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.bitcoin.navigation.BitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.cdf.stock.StockTradeSetPrice;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingCustomSharePricePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $currentPrice$delegate;
    public final /* synthetic */ MutableState $moneySubmitted$delegate;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingCustomSharePricePresenter$models$1$1(LocalHomePresenter localHomePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localHomePresenter;
        this.$moneySubmitted$delegate = mutableState;
        this.$currentPrice$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InvestingCustomSharePricePresenter$models$1$1(this.this$0, this.$moneySubmitted$delegate, this.$currentPrice$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InvestingCustomSharePricePresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        MutableState mutableState = this.$moneySubmitted$delegate;
        AmountPickerViewEvent$Full$MoneySubmitted amountPickerViewEvent$Full$MoneySubmitted = (AmountPickerViewEvent$Full$MoneySubmitted) mutableState.getValue();
        amountPickerViewEvent$Full$MoneySubmitted.getClass();
        Long l = amountPickerViewEvent$Full$MoneySubmitted.amount.amount;
        l.getClass();
        long longValue = l.longValue();
        LocalHomePresenter localHomePresenter = this.this$0;
        InvestingScreens.CustomSharePriceScreen customSharePriceScreen = (InvestingScreens.CustomSharePriceScreen) localHomePresenter.tabContentPresenterFactory;
        InvestingScreens.OrderTypeSelectionScreen.Type type2 = customSharePriceScreen.f1158type;
        OrderSide orderSide = customSharePriceScreen.orderSide;
        boolean z = type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity;
        MutableState mutableState2 = this.$currentPrice$delegate;
        if (z) {
            RealInvestingAnalytics realInvestingAnalytics = (RealInvestingAnalytics) localHomePresenter.localHomeGeoPresenterFactory;
            com.squareup.cash.cdf.stock.OrderSide cdf = ProcessPhoenix.toCdf(orderSide);
            InvestingScreens.OrderTypeSelectionScreen.Type.Equity equity = (InvestingScreens.OrderTypeSelectionScreen.Type.Equity) type2;
            String str = equity.symbol;
            str.getClass();
            realInvestingAnalytics.analytics.track(new StockTradeSetPrice(cdf, str, l), null);
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
            InvestmentEntityToken investmentEntityToken = equity.entityToken;
            OrderSide orderSide2 = customSharePriceScreen.orderSide;
            Money money = (Money) mutableState2.getValue();
            money.getClass();
            Long l2 = money.amount;
            l2.getClass();
            long longValue2 = l2.longValue();
            ColorModel colorModel = customSharePriceScreen.accentColor;
            Money money2 = (Money) mutableState2.getValue();
            money2.getClass();
            Long l3 = money2.amount;
            l3.getClass();
            screenNavigator.goTo(new InvestingScreens.TransferStock(investmentEntityToken, orderSide2, longValue2, colorModel, new InvestingScreens.OrderType.CustomOrder(l3.longValue(), longValue), null, 128));
        } else {
            if (!(type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            RealBitcoinInboundNavigator realBitcoinInboundNavigator = (RealBitcoinInboundNavigator) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
            boolean z2 = orderSide == OrderSide.BUY;
            Money money3 = (Money) mutableState2.getValue();
            money3.getClass();
            Long l4 = money3.amount;
            l4.getClass();
            BitcoinInboundNavigator.showTransferBitcoin$default(realBitcoinInboundNavigator, z2, new BitcoinTransferScreen.OrderType.CustomOrder(l4.longValue(), longValue), null, null, null, null, 496);
        }
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }
}
