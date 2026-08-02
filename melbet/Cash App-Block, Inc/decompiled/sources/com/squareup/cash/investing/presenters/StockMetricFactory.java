package com.squareup.cash.investing.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.PortfolioStockMetricType;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.investing.DailyGainParams;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.uuid.UuidKt;

/* loaded from: classes6.dex */
public final class StockMetricFactory {
    public final MoneyFormatter abbreviatedMoneyFormatter;
    public final AndroidClock clock;
    public final MoneyFormatter moneyFormatter;

    public StockMetricFactory(AndroidClock androidClock, LocalizedMoneyFormatter.Factory factory) {
        this.clock = androidClock;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        RoundingMode roundingMode = RoundingMode.DOWN;
        this.abbreviatedMoneyFormatter = factory.createAbbreviatedExactlyTwoFractionDigits();
    }

    public static PercentChange createDailyPercentChange(InvestmentEntityWithPrice investmentEntityWithPrice) {
        Money money;
        Long l;
        Money money2;
        Long l2;
        CurrentPrice price = investmentEntityWithPrice.getPrice();
        if (price == null || (money = price.current_price) == null || (l = money.amount) == null) {
            return null;
        }
        long longValue = l.longValue();
        CurrentPrice price2 = investmentEntityWithPrice.getPrice();
        if (price2 == null || (money2 = price2.price_at_market_open) == null || (l2 = money2.amount) == null) {
            return null;
        }
        BigDecimal movement = UuidKt.movement(false, longValue, l2.longValue());
        InvestingCryptoImage.Companion.getClass();
        return new PercentChange(movement, zza.icon(movement));
    }

    public final MarketCapMetric createMarketCap(InvestmentEntityWithPrice investmentEntityWithPrice) {
        Long l;
        CurrencyCode currencyCode;
        Money marketCap = investmentEntityWithPrice.getMarketCap();
        if (marketCap == null || (l = marketCap.amount) == null) {
            return null;
        }
        long longValue = l.longValue();
        Money marketCap2 = investmentEntityWithPrice.getMarketCap();
        if (marketCap2 == null || (currencyCode = marketCap2.currency_code) == null) {
            return null;
        }
        return new MarketCapMetric(longValue, currencyCode, this.abbreviatedMoneyFormatter.format(new Money(l, currencyCode, 4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StockMetric createMetric(PortfolioStockMetricType portfolioStockMetricType, InvestmentEntityWithPrice.Owned owned) {
        DailyGainParams dailyGainParams;
        Money money;
        Long l;
        long longValue;
        Money money2;
        Long l2;
        CurrencyCode currencyCode;
        Long l3;
        Money money3;
        Long l4;
        Money money4;
        Money money5;
        Money money6;
        portfolioStockMetricType.getClass();
        owned.getClass();
        boolean z = owned.delisted;
        long j = owned.investedAmount;
        String str = owned.units;
        CurrentPrice currentPrice = owned.price;
        if (!z) {
            switch (portfolioStockMetricType.ordinal()) {
                case 0:
                    return createDailyPercentChange(owned);
                case 1:
                    long millis = this.clock.millis() / 1000;
                    SyncInvestmentHolding.DailyGainParams dailyGainParams2 = owned.dailyGainParams;
                    if (dailyGainParams2 != null && (l3 = dailyGainParams2.valid_until_seconds) != null) {
                        long longValue2 = l3.longValue();
                        String str2 = dailyGainParams2.units_at_market_open;
                        if (str2 != null && (money3 = dailyGainParams2.day_cash_value_change) != null && (l4 = money3.amount) != null) {
                            dailyGainParams = new DailyGainParams(longValue2, l4.longValue(), str2);
                            str.getClass();
                            if (currentPrice != null && (money = currentPrice.current_price) != null && (l = money.amount) != null) {
                                longValue = l.longValue();
                                money2 = currentPrice.price_at_market_open;
                                if (money2 != null && (l2 = money2.amount) != null) {
                                    long roundToLong = (dailyGainParams != null || dailyGainParams.valid_until_seconds < millis) ? MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * (longValue - r9)) : MathKt__MathJVMKt.roundToLong((Double.parseDouble(str) * longValue) - ((Double.parseDouble(dailyGainParams.units_at_market_open) * l2.longValue()) + dailyGainParams.day_cash_value_change));
                                    currencyCode = money.currency_code;
                                    if (currencyCode != null) {
                                        return new DailyReturn(roundToLong, currencyCode, returnText(roundToLong, currencyCode));
                                    }
                                }
                            }
                        }
                    }
                    dailyGainParams = null;
                    str.getClass();
                    if (currentPrice != null) {
                        longValue = l.longValue();
                        money2 = currentPrice.price_at_market_open;
                        if (money2 != null) {
                            if (dailyGainParams != null) {
                            }
                            currencyCode = money.currency_code;
                            if (currencyCode != null) {
                            }
                        }
                    }
                    break;
                case 2:
                    if (currentPrice != null && (money4 = currentPrice.current_price) != null) {
                        money4.amount.getClass();
                        long roundToLong2 = MathKt__MathJVMKt.roundToLong((Double.parseDouble(str) * r15.longValue()) - j);
                        CurrencyCode currencyCode2 = money4.currency_code;
                        return new TotalReturn(roundToLong2, currencyCode2, returnText(roundToLong2, currencyCode2));
                    }
                    break;
                case 3:
                    if (currentPrice != null && (money5 = currentPrice.current_price) != null) {
                        money5.amount.getClass();
                        BigDecimal movement = UuidKt.movement(false, MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * r13.longValue()), j);
                        InvestingCryptoImage.Companion.getClass();
                        return new PercentChange(movement, zza.icon(movement));
                    }
                    break;
                case 4:
                    if (currentPrice != null && (money6 = currentPrice.current_price) != null) {
                        money6.amount.getClass();
                        long roundToLong3 = MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * r0.longValue());
                        CurrencyCode currencyCode3 = money6.currency_code;
                        InvestmentEntityToken investmentEntityToken = owned.token;
                        StockMetric.BackgroundType backgroundType = StockMetric.BackgroundType.LIGHT;
                        investmentEntityToken.getClass();
                        return new TotalInvestmentValue(roundToLong3, currencyCode3, investmentEntityToken, backgroundType, this.moneyFormatter.format(new Money(Long.valueOf(roundToLong3), currencyCode3, 4)));
                    }
                    break;
                case 5:
                    return createSharePrice(owned);
                case 6:
                    return createMarketCap(owned);
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
        }
        return null;
    }

    public final SharePriceMetric createSharePrice(InvestmentEntityWithPrice investmentEntityWithPrice) {
        Money money;
        Long l;
        Money money2;
        CurrencyCode currencyCode;
        CurrentPrice price = investmentEntityWithPrice.getPrice();
        if (price == null || (money = price.current_price) == null || (l = money.amount) == null) {
            return null;
        }
        long longValue = l.longValue();
        CurrentPrice price2 = investmentEntityWithPrice.getPrice();
        if (price2 == null || (money2 = price2.current_price) == null || (currencyCode = money2.currency_code) == null) {
            return null;
        }
        return new SharePriceMetric(longValue, currencyCode, this.moneyFormatter.format(new Money(l, currencyCode, 4)));
    }

    public final String returnText(long j, CurrencyCode currencyCode) {
        return Recorder$$ExternalSyntheticOutline2.m$1(j == 0 ? "" : j > 0 ? "+ " : "- ", this.moneyFormatter.format(new Money(Long.valueOf(Math.abs(j)), currencyCode, 4)));
    }
}
