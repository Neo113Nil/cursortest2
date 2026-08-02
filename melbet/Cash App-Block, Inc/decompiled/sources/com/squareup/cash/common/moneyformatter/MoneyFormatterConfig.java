package com.squareup.cash.common.moneyformatter;

import com.squareup.cash.common.moneyformatter.DenominationOption;
import com.squareup.cash.common.moneyformatter.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes.dex */
public final class MoneyFormatterConfig {
    public static final KSerializer[] $childSerializers;
    public static final MoneyFormatterConfig ACCOUNTING;
    public static final MoneyFormatterConfig CENTS;
    public static final MoneyFormatterConfig CENTS_SYMBOL;
    public static final MoneyFormatterConfig CODE;
    public static final MoneyFormatterConfig COMPACT;
    public static final MoneyFormatterConfig COMPACT_CODE;
    public static final MoneyFormatterConfig COMPACT_POSITIVE_SIGN_ONLY;
    public static final MoneyFormatterConfig COMPACT_SYMBOL_AND_CODE;
    public static final Companion Companion = new Companion();
    public static final MoneyFormatterConfig STANDARD;
    public final CurrencyRepresentationOption currencyRepresentationOption;
    public final DenominationOption denominationOption;
    public final NumberFormat numberFormat;
    public final SignOption signOption;
    public final ZeroBiasOption zeroBiasOption;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"com/squareup/cash/common/moneyformatter/MoneyFormatterConfig$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/common/moneyformatter/MoneyFormatterConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ACCOUNTING", "Lcom/squareup/cash/common/moneyformatter/MoneyFormatterConfig;", "CENTS", "CENTS_SYMBOL", "CODE", "COMPACT", "COMPACT_CODE", "COMPACT_POSITIVE_SIGN_ONLY", "COMPACT_SYMBOL_AND_CODE", "STANDARD", "money-formatter-config_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MoneyFormatterConfig$$serializer.INSTANCE;
        }
    }

    static {
        KSerializer serializer = NumberFormat.Companion.serializer();
        CurrencyRepresentationOption[] values = CurrencyRepresentationOption.values();
        values.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.squareup.cash.common.moneyformatter.CurrencyRepresentationOption", (Enum[]) values);
        KSerializer serializer2 = DenominationOption.Companion.serializer();
        SignOption[] values2 = SignOption.values();
        values2.getClass();
        EnumSerializer enumSerializer2 = new EnumSerializer("com.squareup.cash.common.moneyformatter.SignOption", (Enum[]) values2);
        ZeroBiasOption[] values3 = ZeroBiasOption.values();
        values3.getClass();
        $childSerializers = new KSerializer[]{serializer, enumSerializer, serializer2, enumSerializer2, new EnumSerializer("com.squareup.cash.common.moneyformatter.ZeroBiasOption", (Enum[]) values3)};
        NumberFormat.Full full = NumberFormat.Full.INSTANCE;
        CurrencyRepresentationOption currencyRepresentationOption = CurrencyRepresentationOption.NARROW_SYMBOL;
        DenominationOption.DollarsAndCents dollarsAndCents = new DenominationOption.DollarsAndCents(false);
        SignOption signOption = SignOption.STANDARD;
        ZeroBiasOption zeroBiasOption = ZeroBiasOption.NONE;
        STANDARD = new MoneyFormatterConfig(full, currencyRepresentationOption, dollarsAndCents, signOption, zeroBiasOption);
        ACCOUNTING = new MoneyFormatterConfig(full, currencyRepresentationOption, new DenominationOption.DollarsAndCents(false), SignOption.ACCOUNTING, zeroBiasOption);
        CurrencyRepresentationOption currencyRepresentationOption2 = CurrencyRepresentationOption.CODE;
        CODE = new MoneyFormatterConfig(full, currencyRepresentationOption2, new DenominationOption.DollarsAndCents(false), signOption, zeroBiasOption);
        COMPACT = new MoneyFormatterConfig(full, currencyRepresentationOption, new DenominationOption.DollarsAndCents(true), signOption, zeroBiasOption);
        COMPACT_CODE = new MoneyFormatterConfig(full, currencyRepresentationOption2, new DenominationOption.DollarsAndCents(true), signOption, zeroBiasOption);
        COMPACT_POSITIVE_SIGN_ONLY = new MoneyFormatterConfig(full, currencyRepresentationOption, new DenominationOption.DollarsAndCents(true), SignOption.POSITIVE_ONLY, zeroBiasOption);
        COMPACT_SYMBOL_AND_CODE = new MoneyFormatterConfig(full, CurrencyRepresentationOption.NARROW_SYMBOL_AND_CODE, new DenominationOption.DollarsAndCents(true), signOption, zeroBiasOption);
        CurrencyRepresentationOption currencyRepresentationOption3 = CurrencyRepresentationOption.CENT_NAME;
        DenominationOption.Cents cents = DenominationOption.Cents.INSTANCE;
        CENTS = new MoneyFormatterConfig(full, currencyRepresentationOption3, cents, signOption, zeroBiasOption);
        CENTS_SYMBOL = new MoneyFormatterConfig(full, currencyRepresentationOption, cents, signOption, zeroBiasOption);
    }

    public /* synthetic */ MoneyFormatterConfig(int i, NumberFormat numberFormat, CurrencyRepresentationOption currencyRepresentationOption, DenominationOption denominationOption, SignOption signOption, ZeroBiasOption zeroBiasOption) {
        if (31 != (i & 31)) {
            TuplesKt.throwMissingFieldException(i, 31, MoneyFormatterConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.numberFormat = numberFormat;
        this.currencyRepresentationOption = currencyRepresentationOption;
        this.denominationOption = denominationOption;
        this.signOption = signOption;
        this.zeroBiasOption = zeroBiasOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.squareup.cash.common.moneyformatter.DenominationOption] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.squareup.cash.common.moneyformatter.NumberFormat] */
    public static MoneyFormatterConfig copy$default(MoneyFormatterConfig moneyFormatterConfig, NumberFormat.Abbreviated abbreviated, CurrencyRepresentationOption currencyRepresentationOption, DenominationOption.Dollars dollars, int i) {
        SignOption signOption = SignOption.ALWAYS_SIGNED;
        NumberFormat.Abbreviated abbreviated2 = abbreviated;
        if ((i & 1) != 0) {
            abbreviated2 = moneyFormatterConfig.numberFormat;
        }
        NumberFormat.Abbreviated abbreviated3 = abbreviated2;
        if ((i & 2) != 0) {
            currencyRepresentationOption = moneyFormatterConfig.currencyRepresentationOption;
        }
        CurrencyRepresentationOption currencyRepresentationOption2 = currencyRepresentationOption;
        DenominationOption.Dollars dollars2 = dollars;
        if ((i & 4) != 0) {
            dollars2 = moneyFormatterConfig.denominationOption;
        }
        DenominationOption.Dollars dollars3 = dollars2;
        if ((i & 8) != 0) {
            signOption = moneyFormatterConfig.signOption;
        }
        SignOption signOption2 = signOption;
        ZeroBiasOption zeroBiasOption = moneyFormatterConfig.zeroBiasOption;
        moneyFormatterConfig.getClass();
        abbreviated3.getClass();
        currencyRepresentationOption2.getClass();
        dollars3.getClass();
        signOption2.getClass();
        zeroBiasOption.getClass();
        return new MoneyFormatterConfig(abbreviated3, currencyRepresentationOption2, dollars3, signOption2, zeroBiasOption);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyFormatterConfig)) {
            return false;
        }
        MoneyFormatterConfig moneyFormatterConfig = (MoneyFormatterConfig) obj;
        return Intrinsics.areEqual(this.numberFormat, moneyFormatterConfig.numberFormat) && this.currencyRepresentationOption == moneyFormatterConfig.currencyRepresentationOption && Intrinsics.areEqual(this.denominationOption, moneyFormatterConfig.denominationOption) && this.signOption == moneyFormatterConfig.signOption && this.zeroBiasOption == moneyFormatterConfig.zeroBiasOption;
    }

    public final int hashCode() {
        return this.zeroBiasOption.hashCode() + ((this.signOption.hashCode() + ((this.denominationOption.hashCode() + ((this.currencyRepresentationOption.hashCode() + (this.numberFormat.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MoneyFormatterConfig(numberFormat=" + this.numberFormat + ", currencyRepresentationOption=" + this.currencyRepresentationOption + ", denominationOption=" + this.denominationOption + ", signOption=" + this.signOption + ", zeroBiasOption=" + this.zeroBiasOption + ")";
    }

    public MoneyFormatterConfig(NumberFormat numberFormat, CurrencyRepresentationOption currencyRepresentationOption, DenominationOption denominationOption, SignOption signOption, ZeroBiasOption zeroBiasOption) {
        numberFormat.getClass();
        denominationOption.getClass();
        this.numberFormat = numberFormat;
        this.currencyRepresentationOption = currencyRepresentationOption;
        this.denominationOption = denominationOption;
        this.signOption = signOption;
        this.zeroBiasOption = zeroBiasOption;
    }
}
