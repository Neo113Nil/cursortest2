package com.squareup.cash.amountslider.presenters;

import com.squareup.protos.common.CurrencyCode;
import java.util.List;

/* loaded from: classes6.dex */
public interface AmountSelectorPresenter {
    static /* synthetic */ List toAmounts$default(AmountSelectorPresenter amountSelectorPresenter, TradeType tradeType, String str, Long l, CurrencyCode currencyCode, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            l = 0L;
        }
        if ((i & 8) != 0) {
            currencyCode = CurrencyCode.USD;
        }
        return ((RealAmountSelectorPresenter) amountSelectorPresenter).toAmounts(tradeType, str, l, currencyCode);
    }
}
