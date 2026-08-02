package com.squareup.cash.moneyformatter.api;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;

/* loaded from: classes.dex */
public interface MoneyFormatter {
    String currencySymbol(CurrencyCode currencyCode);

    String format(Money money);
}
