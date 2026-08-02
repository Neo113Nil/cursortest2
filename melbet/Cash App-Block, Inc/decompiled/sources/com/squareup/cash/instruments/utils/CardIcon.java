package com.squareup.cash.instruments.utils;

import com.squareup.cash.R;

/* loaded from: classes6.dex */
public enum CardIcon {
    /* JADX INFO: Fake field, exist only in values array */
    GENERIC(2131232871),
    /* JADX INFO: Fake field, exist only in values array */
    VISA(2131231308),
    /* JADX INFO: Fake field, exist only in values array */
    MASTERCARD(2131231307),
    /* JADX INFO: Fake field, exist only in values array */
    AMERICAN_EXPRESS(2131231303),
    /* JADX INFO: Fake field, exist only in values array */
    DISCOVER(2131231304),
    TAB_VISA(R.drawable.instrument_visa),
    TAB_MASTERCARD(R.drawable.instrument_mastercard),
    TAB_AMERICAN_EXPRESS(R.drawable.instrument_american_express),
    TAB_DISCOVER(R.drawable.instrument_discover),
    TAB_CARD_GENERIC(R.drawable.instrument_card_generic);

    public final int iconResId;

    CardIcon(int i) {
        this.iconResId = i;
    }
}
