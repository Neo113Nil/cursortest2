package com.squareup.cash.moneyformatter.real;

import androidx.room.Room;
import com.squareup.cash.common.moneyformatter.CommonMoneyFormatterKt;
import com.squareup.cash.common.moneyformatter.CurrencyRepresentationOption;
import com.squareup.cash.common.moneyformatter.DenominationOption;
import com.squareup.cash.common.moneyformatter.FractionDigitsStrategy;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.moneyformatter.NumberFormat;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.common.moneyformatter.SignOption;
import com.squareup.cash.common.moneyformatter.UnitMagnitudeFormat;
import com.squareup.cash.common.moneyformatter.currency.Currency;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.util.Locale;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class LocalizedMoneyFormatter implements MoneyFormatter {
    public final ConnectionPool delegateFormatter;
    public final Locale locale;

    public final class Factory {
        public final RealLocaleManager localeManager;

        public Factory(RealLocaleManager realLocaleManager) {
            this.localeManager = realLocaleManager;
        }

        public static MoneyFormatter createAbbreviatedBalancedFractionDigits$default(Factory factory) {
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            MoneyFormatterConfig moneyFormatterConfig = MoneyFormatterConfig.COMPACT;
            UnitMagnitudeFormat unitMagnitudeFormat = UnitMagnitudeFormat.ABBREVIATED;
            return factory.create(MoneyFormatterConfig.copy$default(moneyFormatterConfig, new NumberFormat.Abbreviated(roundingMode, FractionDigitsStrategy.BALANCED), null, null, 30));
        }

        public final MoneyFormatter create(MoneyFormatterConfig moneyFormatterConfig) {
            moneyFormatterConfig.getClass();
            return new LocalizedMoneyFormatter(moneyFormatterConfig, (Locale) this.localeManager.resolvedLocale.$$delegate_0.getValue());
        }

        public MoneyFormatter createAbbreviatedExactlyTwoFractionDigits() {
            RoundingMode roundingMode = RoundingMode.DOWN;
            MoneyFormatterConfig moneyFormatterConfig = MoneyFormatterConfig.STANDARD;
            UnitMagnitudeFormat unitMagnitudeFormat = UnitMagnitudeFormat.ABBREVIATED;
            return create(MoneyFormatterConfig.copy$default(moneyFormatterConfig, new NumberFormat.Abbreviated(roundingMode, FractionDigitsStrategy.EXACTLY_TWO), null, null, 30));
        }

        public MoneyFormatter createAbbreviatedUpToOneFractionDigit() {
            RoundingMode roundingMode = RoundingMode.DOWN;
            MoneyFormatterConfig moneyFormatterConfig = MoneyFormatterConfig.COMPACT;
            UnitMagnitudeFormat unitMagnitudeFormat = UnitMagnitudeFormat.ABBREVIATED;
            return create(MoneyFormatterConfig.copy$default(moneyFormatterConfig, new NumberFormat.Abbreviated(roundingMode, FractionDigitsStrategy.UP_TO_ONE), null, new DenominationOption.Dollars(roundingMode), 26));
        }

        public MoneyFormatter createAlwaysSigned() {
            MoneyFormatterConfig moneyFormatterConfig = MoneyFormatterConfig.STANDARD;
            SignOption signOption = SignOption.STANDARD;
            return create(MoneyFormatterConfig.copy$default(moneyFormatterConfig, null, null, null, 23));
        }

        public MoneyFormatter createNoSymbol() {
            return create(MoneyFormatterConfig.copy$default(MoneyFormatterConfig.STANDARD, null, CurrencyRepresentationOption.NONE, null, 29));
        }

        public MoneyFormatter createNoSymbolCompact() {
            return create(MoneyFormatterConfig.copy$default(MoneyFormatterConfig.COMPACT, null, CurrencyRepresentationOption.NONE, null, 29));
        }

        public MoneyFormatter createRounded() {
            return create(MoneyFormatterConfig.copy$default(MoneyFormatterConfig.STANDARD, null, null, new DenominationOption.Dollars(RoundingMode.HALF_UP), 27));
        }

        public MoneyFormatter createSymbolAndCode() {
            return create(MoneyFormatterConfig.copy$default(MoneyFormatterConfig.STANDARD, null, CurrencyRepresentationOption.NARROW_SYMBOL_AND_CODE, null, 29));
        }
    }

    public LocalizedMoneyFormatter(MoneyFormatterConfig moneyFormatterConfig, Locale locale) {
        moneyFormatterConfig.getClass();
        locale.getClass();
        int i = com.squareup.cash.common.moneyformatter.MoneyFormatter.$r8$clinit;
        this.delegateFormatter = new ConnectionPool(moneyFormatterConfig);
        this.locale = locale;
    }

    @Override // com.squareup.cash.moneyformatter.api.MoneyFormatter
    public final String currencySymbol(CurrencyCode currencyCode) {
        currencyCode.getClass();
        return Room.toMultiplatformCurrency(currencyCode).getDollarSymbol();
    }

    @Override // com.squareup.cash.moneyformatter.api.MoneyFormatter
    public final String format(Money money) {
        Currency currency;
        money.getClass();
        Long l = money.amount;
        long longValue = l != null ? l.longValue() : 0L;
        CurrencyCode currencyCode = money.currency_code;
        if (currencyCode == null || (currency = Room.toMultiplatformCurrency(currencyCode)) == null) {
            currency = Currency.USD;
        }
        com.squareup.cash.common.moneyformatter.Money money2 = new com.squareup.cash.common.moneyformatter.Money(longValue, currency);
        String languageTag = this.locale.toLanguageTag();
        languageTag.getClass();
        ConnectionPool connectionPool = this.delegateFormatter;
        connectionPool.getClass();
        String replace = StringsKt__StringsJVMKt.replace(languageTag, '_', '-', false);
        MoneyFormatterConfig moneyFormatterConfig = (MoneyFormatterConfig) connectionPool.delegate;
        return CommonMoneyFormatterKt.format(money2, replace, moneyFormatterConfig.numberFormat, moneyFormatterConfig.currencyRepresentationOption, moneyFormatterConfig.denominationOption, moneyFormatterConfig.signOption, moneyFormatterConfig.zeroBiasOption);
    }
}
