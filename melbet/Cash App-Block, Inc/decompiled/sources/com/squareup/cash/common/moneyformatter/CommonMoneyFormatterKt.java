package com.squareup.cash.common.moneyformatter;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.common.moneyformatter.DenominationOption;
import com.squareup.cash.common.moneyformatter.NumberFormat;
import com.squareup.cash.common.moneyformatter.currency.Currency;
import com.squareup.cash.common.moneyformatter.locale.LocalizedUnitMagnitudes;
import com.squareup.util.emojis.EmojiEmbeddedImageResolverKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Locale;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public abstract class CommonMoneyFormatterKt {
    public static final Amount ONE_BILLION;
    public static final Amount ONE_HUNDRED;
    public static final Amount ONE_MILLION;
    public static final Amount ONE_THOUSAND;
    public static final Amount ONE_TRILLION;
    public static final Amount TEN;

    static {
        Amount amount = Amount.ZERO;
        Amount amount2 = Amount.ONE;
        TEN = amount2.shiftDecimalPoint(1);
        ONE_HUNDRED = amount2.shiftDecimalPoint(2);
        ONE_THOUSAND = amount2.shiftDecimalPoint(3);
        ONE_MILLION = amount2.shiftDecimalPoint(6);
        ONE_BILLION = amount2.shiftDecimalPoint(9);
        ONE_TRILLION = amount2.shiftDecimalPoint(12);
    }

    public static final String appendAbbreviation(String str, Amount amount, String str2, NumberFormat numberFormat) {
        List split$default;
        if (numberFormat instanceof NumberFormat.Full) {
            return str;
        }
        if (!(numberFormat instanceof NumberFormat.Abbreviated)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        Amount absoluteValue = amount.absoluteValue();
        LocalizedUnitMagnitudes.Companion.getClass();
        str2.getClass();
        split$default = StringsKt__StringsKt.split$default(str2, new String[]{"-", "_"}, false, 0, 6, null);
        String str3 = (String) split$default.get(0);
        str3.getClass();
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        LocalizedUnitMagnitudes localizedUnitMagnitudes = lowerCase.equals("es") ? LocalizedUnitMagnitudes.Spanish : LocalizedUnitMagnitudes.English;
        int ordinal = ((NumberFormat.Abbreviated) numberFormat).unitMagnitudeFormat.ordinal();
        Amount amount2 = ONE_THOUSAND;
        Amount amount3 = ONE_MILLION;
        Amount amount4 = ONE_BILLION;
        Amount amount5 = ONE_TRILLION;
        if (ordinal == 0) {
            return absoluteValue.compareTo(amount5) >= 0 ? Recorder$$ExternalSyntheticOutline2.m$1(str, localizedUnitMagnitudes.trillionAbbreviated) : absoluteValue.compareTo(amount4) >= 0 ? Recorder$$ExternalSyntheticOutline2.m$1(str, localizedUnitMagnitudes.billionAbbreviated) : absoluteValue.compareTo(amount3) >= 0 ? Recorder$$ExternalSyntheticOutline2.m$1(str, "M") : absoluteValue.compareTo(amount2) >= 0 ? Recorder$$ExternalSyntheticOutline2.m$1(str, localizedUnitMagnitudes.thousandAbbreviated) : str;
        }
        if (ordinal == 1) {
            return absoluteValue.compareTo(amount5) >= 0 ? Recorder$$ExternalSyntheticOutline2.m(str, " ", localizedUnitMagnitudes.trillionFull) : absoluteValue.compareTo(amount4) >= 0 ? Recorder$$ExternalSyntheticOutline2.m(str, " ", localizedUnitMagnitudes.billionFull) : absoluteValue.compareTo(amount3) >= 0 ? Recorder$$ExternalSyntheticOutline2.m(str, " ", localizedUnitMagnitudes.millionFull) : absoluteValue.compareTo(amount2) >= 0 ? Recorder$$ExternalSyntheticOutline2.m(str, " ", localizedUnitMagnitudes.thousandFull) : str;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String appendSign(Amount amount, String str, SignOption signOption, ZeroBiasOption zeroBiasOption) {
        Amount amount2 = Amount.ZERO;
        Amount amount3 = Amount.ZERO;
        if (amount.compareTo(amount3) > 0) {
            int ordinal = signOption.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2) {
                    return Recorder$$ExternalSyntheticOutline2.m(Marker.ANY_NON_NULL_MARKER, str);
                }
                if (ordinal != 3 && ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
        } else if (amount.compareTo(amount3) < 0) {
            int ordinal2 = signOption.ordinal();
            if (ordinal2 == 0 || ordinal2 == 1) {
                return Recorder$$ExternalSyntheticOutline2.m("−", str);
            }
            if (ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        } else {
            int ordinal3 = zeroBiasOption.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    return Recorder$$ExternalSyntheticOutline2.m("−", str);
                }
                if (ordinal3 == 2) {
                    return Recorder$$ExternalSyntheticOutline2.m(Marker.ANY_NON_NULL_MARKER, str);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0046, code lost:
    
        if (com.squareup.cash.common.moneyformatter.MoneyKt.belowOneDollar(r17) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String format(Money money, String str, NumberFormat numberFormat, CurrencyRepresentationOption currencyRepresentationOption, DenominationOption denominationOption, SignOption signOption, ZeroBiasOption zeroBiasOption) {
        CurrencyRepresentationOption currencyRepresentationOption2;
        Object obj;
        IntRange intRange;
        NumberStyle numberStyle;
        String appendAbbreviation;
        int ordinal;
        Object obj2;
        Amount amount = money.centsAmount;
        Currency currency = money.currency;
        str.getClass();
        numberFormat.getClass();
        currencyRepresentationOption.getClass();
        denominationOption.getClass();
        signOption.getClass();
        zeroBiasOption.getClass();
        boolean z = denominationOption instanceof DenominationOption.Cents;
        if (!z) {
            boolean z2 = denominationOption instanceof DenominationOption.Dollars;
            if (!z2) {
                if (!(denominationOption instanceof DenominationOption.DollarsAndCents)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (((DenominationOption.DollarsAndCents) denominationOption).showsAsCentsIfPossible) {
                }
            }
            Amount resolveAmount = resolveAmount(money, denominationOption);
            if (numberFormat instanceof NumberFormat.Full) {
                int resolveFullFractionDigitCount = resolveFullFractionDigitCount(money, denominationOption);
                intRange = new IntRange(resolveFullFractionDigitCount, resolveFullFractionDigitCount, 1);
            } else {
                if (!(numberFormat instanceof NumberFormat.Abbreviated)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                FractionDigitsStrategy fractionDigitsStrategy = ((NumberFormat.Abbreviated) numberFormat).fractionDigitsStrategy;
                if (!z) {
                    if (z2) {
                        amount = MoneyKt.dollarAmount(money);
                    } else {
                        if (!(denominationOption instanceof DenominationOption.DollarsAndCents)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        amount = MoneyKt.dollarAmount(money);
                    }
                }
                Amount absoluteValue = amount.absoluteValue();
                Amount amount2 = ONE_THOUSAND;
                if (absoluteValue.compareTo(amount2) < 0) {
                    int resolveFullFractionDigitCount2 = resolveFullFractionDigitCount(money, denominationOption);
                    intRange = new IntRange(resolveFullFractionDigitCount2, resolveFullFractionDigitCount2, 1);
                } else {
                    while (absoluteValue.compareTo(amount2) >= 0) {
                        absoluteValue = absoluteValue.shiftDecimalPoint(-3);
                    }
                    intRange = new IntRange(fractionDigitsStrategy.minimumFractionDigits, Math.min(fractionDigitsStrategy.maximumFractionDigits, fractionDigitsStrategy.maximumTotalDigits - (absoluteValue.compareTo(ONE_HUNDRED) >= 0 ? 3 : absoluteValue.compareTo(TEN) >= 0 ? 2 : 1)), 1);
                }
            }
            Amount resolveAmountToFormat = resolveAmountToFormat(resolveAmount, numberFormat, intRange, signOption);
            int ordinal2 = currencyRepresentationOption.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3 && ordinal2 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                }
                numberStyle = NumberStyle.NUMBER;
                appendAbbreviation = appendAbbreviation(appendSign(resolveAmount, EmojiEmbeddedImageResolverKt.format(resolveAmountToFormat, currency, str, intRange, numberStyle), signOption, zeroBiasOption), resolveAmount, str, numberFormat);
                ordinal = currencyRepresentationOption.ordinal();
                if (ordinal == 1 && ordinal != 2) {
                    return appendAbbreviation;
                }
                obj2 = currency.syntheticTextCode;
                if (obj2 == null) {
                    obj2 = currency.isoTextCode;
                }
                return appendAbbreviation + " " + obj2;
            }
            numberStyle = signOption == SignOption.ACCOUNTING ? NumberStyle.CURRENCY_ACCOUNTING : NumberStyle.CURRENCY;
            appendAbbreviation = appendAbbreviation(appendSign(resolveAmount, EmojiEmbeddedImageResolverKt.format(resolveAmountToFormat, currency, str, intRange, numberStyle), signOption, zeroBiasOption), resolveAmount, str, numberFormat);
            ordinal = currencyRepresentationOption.ordinal();
            if (ordinal == 1) {
            }
            obj2 = currency.syntheticTextCode;
            if (obj2 == null) {
            }
            return appendAbbreviation + " " + obj2;
        }
        Amount resolveAmount2 = resolveAmount(money, DenominationOption.Cents.INSTANCE);
        IntRange intRange2 = new IntRange(0, 0, 1);
        String format2 = EmojiEmbeddedImageResolverKt.format(resolveAmountToFormat(resolveAmount2, numberFormat, intRange2, signOption), currency, str, intRange2, NumberStyle.NUMBER);
        String str2 = currency.centSymbol;
        String appendSign = appendSign(resolveAmount2, format2, signOption, zeroBiasOption);
        String appendAbbreviation2 = appendAbbreviation(appendSign, resolveAmount2, str, numberFormat);
        if (currency == Currency.BTC) {
            currencyRepresentationOption2 = currencyRepresentationOption;
            if (currencyRepresentationOption2 == CurrencyRepresentationOption.NARROW_SYMBOL) {
                if (StringsKt.startsWith$default(appendSign, (char) 8722)) {
                    obj = (char) 8722;
                } else {
                    obj = Marker.ANY_NON_NULL_MARKER;
                    if (!StringsKt__StringsJVMKt.startsWith(appendSign, Marker.ANY_NON_NULL_MARKER, false)) {
                        obj = "";
                    }
                }
                return obj + str2 + format2;
            }
        } else {
            currencyRepresentationOption2 = currencyRepresentationOption;
        }
        int ordinal3 = currencyRepresentationOption2.ordinal();
        if (ordinal3 == 0 || ordinal3 == 2) {
            return Recorder$$ExternalSyntheticOutline2.m$1(appendAbbreviation2, str2);
        }
        if (ordinal3 != 3) {
            return appendAbbreviation2;
        }
        amount.getClass();
        return Recorder$$ExternalSyntheticOutline2.m(appendAbbreviation2, " ", amount.absoluteValue().equals(Amount.ONE) ? currency.centName : currency.centNamePlural);
    }

    public static final Amount resolveAmount(Money money, DenominationOption denominationOption) {
        Amount amount = money.centsAmount;
        if (denominationOption instanceof DenominationOption.Cents) {
            return amount;
        }
        if (denominationOption instanceof DenominationOption.Dollars) {
            Amount dollarAmount = MoneyKt.dollarAmount(money);
            RoundingMode roundingMode = ((DenominationOption.Dollars) denominationOption).roundingMode;
            roundingMode.getClass();
            return dollarAmount.isWholeNumber() ? dollarAmount : dollarAmount.round(0, roundingMode);
        }
        if (denominationOption instanceof DenominationOption.DollarsAndCents) {
            return (((DenominationOption.DollarsAndCents) denominationOption).showsAsCentsIfPossible && MoneyKt.belowOneDollar(money)) ? amount : MoneyKt.dollarAmount(money);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final Amount resolveAmountToFormat(Amount amount, NumberFormat numberFormat, IntRange intRange, SignOption signOption) {
        if (!(numberFormat instanceof NumberFormat.Full)) {
            if (!(numberFormat instanceof NumberFormat.Abbreviated)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            NumberFormat.Abbreviated abbreviated = (NumberFormat.Abbreviated) numberFormat;
            while (amount.absoluteValue().compareTo(ONE_THOUSAND) >= 0) {
                amount = amount.shiftDecimalPoint(-3);
            }
            amount = amount.round(intRange.last, abbreviated.roundingMode);
        }
        int ordinal = signOption.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                return amount;
            }
            if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return amount.absoluteValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if ((r0.centDigits == 0 ? true : com.squareup.cash.common.moneyformatter.MoneyKt.dollarAmount(r3).isWholeNumber()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int resolveFullFractionDigitCount(Money money, DenominationOption denominationOption) {
        Currency currency = money.currency;
        if ((denominationOption instanceof DenominationOption.Cents) || (denominationOption instanceof DenominationOption.Dollars)) {
            return 0;
        }
        if (!(denominationOption instanceof DenominationOption.DollarsAndCents)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        DenominationOption.DollarsAndCents dollarsAndCents = (DenominationOption.DollarsAndCents) denominationOption;
        if (dollarsAndCents.omitsCentsIfPossible) {
        }
        if (!dollarsAndCents.showsAsCentsIfPossible || !MoneyKt.belowOneDollar(money)) {
            TrailingZeroesBehavior trailingZeroesBehavior = dollarsAndCents.trailingZeroesBehavior;
            if ((trailingZeroesBehavior == null ? currency.trailingZeroesBehavior : trailingZeroesBehavior) == TrailingZeroesBehavior.SHOW_ALL) {
                return currency.centDigits;
            }
            if (trailingZeroesBehavior == null) {
                trailingZeroesBehavior = currency.trailingZeroesBehavior;
            }
            if (trailingZeroesBehavior == TrailingZeroesBehavior.SHOW_TWO) {
                return 2;
            }
            Amount absoluteValue = money.centsAmount.absoluteValue();
            int i = currency.centDigits;
            while (absoluteValue.isWholeNumber() && absoluteValue.compareTo(Amount.ZERO) > 0 && i > 0) {
                absoluteValue = absoluteValue.shiftDecimalPoint(-1);
                if (absoluteValue.isWholeNumber()) {
                    i--;
                }
            }
            return i;
        }
        return 0;
    }
}
