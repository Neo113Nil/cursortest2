package com.squareup.cash.investing.backend.real.analytics;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.cash.cdf.stock.OrderSide;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.cdf.stock.StockSelectSelectCategory;
import com.squareup.cash.cdf.stock.StockTradeEnterAmount;
import com.squareup.cash.cdf.stock.StockTradeSelectCustomAmount;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.analytics.InvestingAnalytics$SellAmount;
import com.squareup.cash.investing.backend.api.data.CategoryDetails;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInvestingAnalytics {
    public final Analytics analytics;
    public final RealCategoryBackend categoryBackend;

    public RealInvestingAnalytics(Analytics analytics, RealCategoryBackend realCategoryBackend) {
        this.analytics = analytics;
        this.categoryBackend = realCategoryBackend;
    }

    public final void trackAtmAmount(InvestmentEntityToken investmentEntityToken, String str, OrderSide orderSide, InvestingAnalytics$SellAmount investingAnalytics$SellAmount) {
        investmentEntityToken.getClass();
        str.getClass();
        Analytics analytics = this.analytics;
        if (investingAnalytics$SellAmount == null) {
            analytics.track(new StockTradeSelectCustomAmount(orderSide, str), null);
            return;
        }
        if (investingAnalytics$SellAmount instanceof InvestingAnalytics$SellAmount.Some) {
            InvestingAnalytics$SellAmount.Some some = (InvestingAnalytics$SellAmount.Some) investingAnalytics$SellAmount;
            analytics.track(new StockTradeEnterAmount(orderSide, str, Long.valueOf(some.amount), some.text), null);
        } else if (investingAnalytics$SellAmount instanceof InvestingAnalytics$SellAmount.All) {
            analytics.track(new StockTradeEnterAmount(orderSide, str, Long.valueOf(((InvestingAnalytics$SellAmount.All) investingAnalytics$SellAmount).amount), "SELL_ALL"), null);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trackStockSelectCategory(CategoryToken categoryToken, ScreenSource screenSource, EquityType equityType, ContinuationImpl continuationImpl) {
        RealInvestingAnalytics$trackStockSelectCategory$1 realInvestingAnalytics$trackStockSelectCategory$1;
        int i;
        if (continuationImpl instanceof RealInvestingAnalytics$trackStockSelectCategory$1) {
            realInvestingAnalytics$trackStockSelectCategory$1 = (RealInvestingAnalytics$trackStockSelectCategory$1) continuationImpl;
            int i2 = realInvestingAnalytics$trackStockSelectCategory$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInvestingAnalytics$trackStockSelectCategory$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInvestingAnalytics$trackStockSelectCategory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInvestingAnalytics$trackStockSelectCategory$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealContactRepository$contacts$$inlined$map$1 categoryDetails = this.categoryBackend.categoryDetails(categoryToken);
                    realInvestingAnalytics$trackStockSelectCategory$1.L$1 = screenSource;
                    realInvestingAnalytics$trackStockSelectCategory$1.L$2 = equityType;
                    realInvestingAnalytics$trackStockSelectCategory$1.label = 1;
                    obj = FlowKt.first(categoryDetails, realInvestingAnalytics$trackStockSelectCategory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    equityType = realInvestingAnalytics$trackStockSelectCategory$1.L$2;
                    screenSource = realInvestingAnalytics$trackStockSelectCategory$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                this.analytics.track(new StockSelectSelectCategory(((CategoryDetails) obj).category.name, screenSource, equityType), null);
                return Unit.INSTANCE;
            }
        }
        realInvestingAnalytics$trackStockSelectCategory$1 = new RealInvestingAnalytics$trackStockSelectCategory$1(this, continuationImpl);
        Object obj2 = realInvestingAnalytics$trackStockSelectCategory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInvestingAnalytics$trackStockSelectCategory$1.label;
        if (i != 0) {
        }
        this.analytics.track(new StockSelectSelectCategory(((CategoryDetails) obj2).category.name, screenSource, equityType), null);
        return Unit.INSTANCE;
    }
}
