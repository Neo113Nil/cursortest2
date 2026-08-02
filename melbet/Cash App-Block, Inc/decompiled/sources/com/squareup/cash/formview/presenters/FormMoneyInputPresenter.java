package com.squareup.cash.formview.presenters;

import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.FormBlocker;

/* loaded from: classes6.dex */
public final class FormMoneyInputPresenter {
    public final CurrencyCode currencyCode;
    public final boolean isOptional;
    public final Money maxAmount;
    public final Money minAmount;
    public final MoneyFormatter moneyFormatter;
    public final boolean showErrorMessage;
    public final AndroidStringManager stringManager;

    public FormMoneyInputPresenter(FormBlocker.Element.MoneyInputElement moneyInputElement, AndroidStringManager androidStringManager, MoneyFormatter moneyFormatter) {
        moneyFormatter.getClass();
        this.stringManager = androidStringManager;
        this.moneyFormatter = moneyFormatter;
        CurrencyCode currencyCode = moneyInputElement.currency_code;
        currencyCode.getClass();
        this.currencyCode = currencyCode;
        Boolean bool = moneyInputElement.is_optional;
        this.isOptional = bool != null ? bool.booleanValue() : false;
        this.minAmount = moneyInputElement.minimum_amount;
        this.maxAmount = moneyInputElement.maximum_amount;
        Boolean bool2 = moneyInputElement.highlight_min_max_violations;
        this.showErrorMessage = bool2 != null ? bool2.booleanValue() : false;
    }
}
