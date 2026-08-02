package com.squareup.cash.instruments.screens;

import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.protos.common.Money;
import java.util.List;

/* loaded from: classes.dex */
public interface SelectPaymentInstrumentArgs extends BottomSheetScreen {
    Money getAmount();

    boolean getCashBalanceEnabled();

    boolean getConfirmingPayment();

    long getCreditCardFeeBps();

    boolean getCreditCardLinkingEnabled();

    List getInstrumentTokens();

    List getInstrumentTypes();

    List getRecipients();

    String getSelectedInstrumentToken();

    boolean getShowDisabledOptions();

    SelectPaymentInstrumentType getType();

    boolean isRequest();
}
