package com.squareup.cash.earnings.presenters.home;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import squareup.cash.earnings.Earning;
import squareup.cash.earnings.EarningsChartData;
import squareup.cash.earnings.EarningsYearMonth;

/* loaded from: classes6.dex */
public abstract class EarningsHeaderPresenterKt {
    public static final DateTimeFormatter DAY_DISPLAY_FORMATTER;
    public static final DateTimeFormatter MONTH_DISPLAY_FORMATTER;
    public static final DateTimeFormatter MONTH_SHORT_DISPLAY_FORMATTER;
    public static final Set DAILY_VISIBLE_LABELS = ArraysKt___ArraysKt.toSet(new Integer[]{1, 7, 14, 21, 28});
    public static final Set MONTHLY_VISIBLE_LABELS = ArraysKt___ArraysKt.toSet(new Integer[]{1, 4, 7, 10});

    static {
        Locale locale = Locale.US;
        DAY_DISPLAY_FORMATTER = DateTimeFormatter.ofPattern("MMMM d, yyyy", locale);
        MONTH_SHORT_DISPLAY_FORMATTER = DateTimeFormatter.ofPattern("MMM", locale);
        MONTH_DISPLAY_FORMATTER = DateTimeFormatter.ofPattern("MMMM yyyy", locale);
    }

    public static final CurrencyCode currencyCode(EarningsChartData earningsChartData) {
        CurrencyCode currencyCode;
        Iterator it = earningsChartData.earnings.iterator();
        do {
            currencyCode = null;
            if (!it.hasNext()) {
                break;
            }
            Money money = ((Earning) it.next()).amount;
            if (money != null) {
                currencyCode = money.currency_code;
            }
        } while (currencyCode == null);
        return currencyCode;
    }

    public static final long getChartValue(Money money) {
        Long l;
        long longValue = (money == null || (l = money.amount) == null) ? 0L : l.longValue();
        if (longValue < 0) {
            return 0L;
        }
        return longValue;
    }

    public static final YearMonth toYearMonthOrNull(EarningsYearMonth earningsYearMonth) {
        Integer num = earningsYearMonth.year;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = earningsYearMonth.month;
            if (num2 != null) {
                try {
                    return YearMonth.of(intValue, num2.intValue());
                } catch (DateTimeException unused) {
                }
            }
        }
        return null;
    }
}
