package com.squareup.cash.earnings.backend.real;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.time.DateTimeException;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import squareup.cash.earnings.EarningStream;
import squareup.cash.earnings.EarningsYearMonth;

/* loaded from: classes6.dex */
public abstract class RealEarningsStreamsRepositoryKt {
    public static final CurrencyCode fallbackCurrency(ArrayList arrayList) {
        CurrencyCode currencyCode;
        Iterator it = arrayList.iterator();
        do {
            currencyCode = null;
            if (!it.hasNext()) {
                break;
            }
            Money money = ((EarningStream) it.next()).earnings;
            if (money != null) {
                currencyCode = money.currency_code;
            }
        } while (currencyCode == null);
        return currencyCode == null ? CurrencyCode.USD : currencyCode;
    }

    public static final YearMonth toYearMonth(EarningsYearMonth earningsYearMonth) {
        int intValue;
        Integer num = earningsYearMonth.year;
        if (num != null) {
            int intValue2 = num.intValue();
            Integer num2 = earningsYearMonth.month;
            if (num2 != null && 1 <= (intValue = num2.intValue()) && intValue < 13) {
                try {
                    return YearMonth.of(intValue2, intValue);
                } catch (DateTimeException unused) {
                }
            }
        }
        return null;
    }
}
