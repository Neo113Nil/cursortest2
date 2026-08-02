package com.squareup.cash.moneyformatter.fakes;

import com.squareup.cash.common.moneyformatter.CurrencyRepresentationOption;
import com.squareup.cash.common.moneyformatter.DenominationOption;
import com.squareup.cash.common.moneyformatter.FractionDigitsStrategy;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.moneyformatter.NumberFormat;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.common.moneyformatter.SignOption;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import kotlin.text.StringsKt;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public final class UnlocalizedMoneyFormatter implements MoneyFormatter {
    public final MoneyFormatterConfig config;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencyCode.values().length];
            try {
                iArr[CurrencyCode.AUD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyCode.CAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencyCode.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CurrencyCode.BTC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CurrencyCode.EUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CurrencyCode.GBP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CurrencyRepresentationOption.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                CurrencyRepresentationOption currencyRepresentationOption = CurrencyRepresentationOption.NARROW_SYMBOL;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                CurrencyRepresentationOption currencyRepresentationOption2 = CurrencyRepresentationOption.NARROW_SYMBOL;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[SignOption.values().length];
            try {
                iArr3[2] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                SignOption signOption = SignOption.STANDARD;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                SignOption signOption2 = SignOption.STANDARD;
                iArr3[0] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[RoundingMode.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                RoundingMode roundingMode = RoundingMode.DOWN;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                RoundingMode roundingMode2 = RoundingMode.DOWN;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                RoundingMode roundingMode3 = RoundingMode.DOWN;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                iArr4[4] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                RoundingMode roundingMode5 = RoundingMode.DOWN;
                iArr4[5] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                RoundingMode roundingMode6 = RoundingMode.DOWN;
                iArr4[6] = 7;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public UnlocalizedMoneyFormatter(MoneyFormatterConfig moneyFormatterConfig) {
        moneyFormatterConfig.getClass();
        this.config = moneyFormatterConfig;
    }

    public static java.math.RoundingMode toJavaRoundingMode(RoundingMode roundingMode) {
        switch (roundingMode.ordinal()) {
            case 0:
                return java.math.RoundingMode.UP;
            case 1:
                return java.math.RoundingMode.DOWN;
            case 2:
                return java.math.RoundingMode.CEILING;
            case 3:
                return java.math.RoundingMode.FLOOR;
            case 4:
                return java.math.RoundingMode.HALF_UP;
            case 5:
                return java.math.RoundingMode.HALF_DOWN;
            case 6:
                return java.math.RoundingMode.HALF_EVEN;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    @Override // com.squareup.cash.moneyformatter.api.MoneyFormatter
    public final String currencySymbol(CurrencyCode currencyCode) {
        currencyCode.getClass();
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()];
        sb.append(i != 4 ? i != 5 ? i != 6 ? '$' : (char) 163 : (char) 8364 : (char) 8383);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x02c9  */
    @Override // com.squareup.cash.moneyformatter.api.MoneyFormatter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String format(Money money) {
        int ordinal;
        long j;
        int ordinal2;
        int ordinal3;
        money.getClass();
        StringBuilder sb = new StringBuilder();
        Long l = money.amount;
        l.getClass();
        long longValue = l.longValue();
        MoneyFormatterConfig moneyFormatterConfig = this.config;
        if (longValue <= 0 || !((ordinal3 = moneyFormatterConfig.signOption.ordinal()) == 1 || ordinal3 == 2)) {
            Long l2 = money.amount;
            l2.getClass();
            if (l2.longValue() < 0 && ((ordinal = moneyFormatterConfig.signOption.ordinal()) == 0 || ordinal == 1)) {
                sb.append("−");
            }
        } else {
            sb.append(Marker.ANY_NON_NULL_MARKER);
        }
        CurrencyRepresentationOption currencyRepresentationOption = moneyFormatterConfig.currencyRepresentationOption;
        NumberFormat numberFormat = moneyFormatterConfig.numberFormat;
        int ordinal4 = currencyRepresentationOption.ordinal();
        if (ordinal4 == 0 || ordinal4 == 2) {
            CurrencyCode currencyCode = money.currency_code;
            if (currencyCode == null) {
                currencyCode = CurrencyCode.USD;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()];
            sb.append(i != 4 ? i != 5 ? i != 6 ? '$' : (char) 163 : (char) 8364 : (char) 8383);
        }
        DenominationOption denominationOption = moneyFormatterConfig.denominationOption;
        if (numberFormat instanceof NumberFormat.Full) {
            j = 0;
        } else {
            NumberFormat numberFormat2 = moneyFormatterConfig.numberFormat;
            numberFormat2.getClass();
            RoundingMode roundingMode = ((NumberFormat.Abbreviated) numberFormat2).roundingMode;
            j = 0;
            Long l3 = money.amount;
            l3.getClass();
            double longValue2 = l3.longValue();
            CurrencyCode currencyCode2 = money.currency_code;
            if (Math.abs(new BigDecimal(longValue2 / ((currencyCode2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencyCode2.ordinal()]) == 4 ? 100000000L : 100L)).setScale(0, toJavaRoundingMode(roundingMode)).longValue()) >= 1000.0d) {
                NumberFormat numberFormat3 = moneyFormatterConfig.numberFormat;
                numberFormat3.getClass();
                RoundingMode roundingMode2 = ((NumberFormat.Abbreviated) numberFormat3).roundingMode;
                Long l4 = money.amount;
                l4.getClass();
                double longValue3 = l4.longValue();
                CurrencyCode currencyCode3 = money.currency_code;
                double longValue4 = new BigDecimal(longValue3 / ((currencyCode3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencyCode3.ordinal()]) == 4 ? 100000000L : 100L)).setScale(0, toJavaRoundingMode(roundingMode2)).longValue();
                if (Math.abs(longValue4) >= 1.0E12d) {
                    longValue4 /= 1.0E12d;
                } else if (Math.abs(longValue4) >= 1.0E9d) {
                    longValue4 /= 1.0E9d;
                } else if (Math.abs(longValue4) >= 1000000.0d) {
                    longValue4 /= 1000000.0d;
                } else if (Math.abs(longValue4) >= 1000.0d) {
                    longValue4 /= 1000.0d;
                }
                int i2 = Math.abs(longValue4) >= 1000.0d ? 4 : Math.abs(longValue4) >= 100.0d ? 3 : Math.abs(longValue4) >= 10.0d ? 2 : 1;
                numberFormat.getClass();
                NumberFormat.Abbreviated abbreviated = (NumberFormat.Abbreviated) numberFormat;
                FractionDigitsStrategy fractionDigitsStrategy = abbreviated.fractionDigitsStrategy;
                DecimalFormat decimalFormat = new DecimalFormat();
                decimalFormat.setMinimumFractionDigits(fractionDigitsStrategy.minimumFractionDigits);
                decimalFormat.setMaximumFractionDigits(Math.min(fractionDigitsStrategy.maximumFractionDigits, fractionDigitsStrategy.maximumTotalDigits - i2));
                decimalFormat.setRoundingMode(toJavaRoundingMode(abbreviated.roundingMode));
                sb.append(decimalFormat.format(Math.abs(longValue4)));
                if (numberFormat instanceof NumberFormat.Abbreviated) {
                    NumberFormat numberFormat4 = moneyFormatterConfig.numberFormat;
                    numberFormat4.getClass();
                    RoundingMode roundingMode3 = ((NumberFormat.Abbreviated) numberFormat4).roundingMode;
                    Long l5 = money.amount;
                    l5.getClass();
                    double longValue5 = l5.longValue();
                    CurrencyCode currencyCode4 = money.currency_code;
                    double abs = Math.abs(new BigDecimal(longValue5 / ((currencyCode4 != null ? WhenMappings.$EnumSwitchMapping$0[currencyCode4.ordinal()] : -1) == 4 ? 100000000L : 100L)).setScale(0, toJavaRoundingMode(roundingMode3)).longValue());
                    if (abs >= 1.0E12d) {
                        sb.append("T");
                    } else if (abs >= 1.0E9d) {
                        sb.append("B");
                    } else if (abs >= 1000000.0d) {
                        sb.append("M");
                    } else if (abs >= 1000.0d) {
                        sb.append("K");
                    }
                }
                ordinal2 = moneyFormatterConfig.currencyRepresentationOption.ordinal();
                if (ordinal2 != 1 || ordinal2 == 2) {
                    sb.append(' ');
                    CurrencyCode currencyCode5 = money.currency_code;
                    currencyCode5.getClass();
                    sb.append(currencyCode5.name());
                }
                return sb.toString();
            }
        }
        if (denominationOption instanceof DenominationOption.Dollars) {
            RoundingMode roundingMode4 = ((DenominationOption.Dollars) denominationOption).roundingMode;
            Long l6 = money.amount;
            l6.getClass();
            double longValue6 = l6.longValue();
            CurrencyCode currencyCode6 = money.currency_code;
            sb.append(String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf(Math.abs(new BigDecimal(longValue6 / ((currencyCode6 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencyCode6.ordinal()]) == 4 ? 100000000L : 100L)).setScale(0, toJavaRoundingMode(roundingMode4)).longValue()))}, 1)));
        } else {
            Long l7 = money.amount;
            l7.getClass();
            double longValue7 = l7.longValue();
            CurrencyCode currencyCode7 = money.currency_code;
            sb.append(String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf(Math.abs((long) (longValue7 / ((currencyCode7 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencyCode7.ordinal()]) == 4 ? 100000000L : 100L))))}, 1)));
        }
        if (denominationOption instanceof DenominationOption.DollarsAndCents) {
            CurrencyCode currencyCode8 = money.currency_code;
            long j2 = (currencyCode8 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencyCode8.ordinal()]) == 4 ? 100000000L : 100L;
            Long l8 = money.amount;
            l8.getClass();
            if (l8.longValue() % j2 != j || !((DenominationOption.DollarsAndCents) denominationOption).omitsCentsIfPossible) {
                Long l9 = money.amount;
                l9.getClass();
                long abs2 = Math.abs(l9.longValue()) % j2;
                CurrencyCode currencyCode9 = money.currency_code;
                if ((currencyCode9 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencyCode9.ordinal()]) == 4) {
                    String format2 = String.format(".%08d", Arrays.copyOf(new Object[]{Long.valueOf(abs2)}, 1));
                    if (((DenominationOption.DollarsAndCents) denominationOption).omitsCentsIfPossible) {
                        format2 = StringsKt.trimEnd(format2, '0');
                    }
                    sb.append(format2);
                } else {
                    sb.append(String.format(".%02d", Arrays.copyOf(new Object[]{Long.valueOf(abs2)}, 1)));
                }
            }
        }
        if (numberFormat instanceof NumberFormat.Abbreviated) {
        }
        ordinal2 = moneyFormatterConfig.currencyRepresentationOption.ordinal();
        if (ordinal2 != 1) {
        }
        sb.append(' ');
        CurrencyCode currencyCode52 = money.currency_code;
        currencyCode52.getClass();
        sb.append(currencyCode52.name());
        return sb.toString();
    }
}
