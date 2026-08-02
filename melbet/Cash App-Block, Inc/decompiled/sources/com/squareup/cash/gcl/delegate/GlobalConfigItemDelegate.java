package com.squareup.cash.gcl.delegate;

import com.squareup.cash.gcl.InstrumentLinkingPostcodeItem;
import com.squareup.cash.gcl.data.MarketAttributes;

/* loaded from: classes6.dex */
public interface GlobalConfigItemDelegate {
    Object get(MarketAttributes marketAttributes);

    InstrumentLinkingPostcodeItem getItem();
}
