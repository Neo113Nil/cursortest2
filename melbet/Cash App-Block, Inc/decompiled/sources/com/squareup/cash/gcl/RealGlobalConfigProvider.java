package com.squareup.cash.gcl;

import com.squareup.cash.gcl.data.MarketAttributes;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.gcl.delegate.GlobalConfigItemDelegate;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class RealGlobalConfigProvider {
    public final RealGlobalConfigDataSource configDataSource;
    public final RealMarketAttributesProvider marketAttributesProvider;

    public RealGlobalConfigProvider(RealGlobalConfigDataSource realGlobalConfigDataSource, RealMarketAttributesProvider realMarketAttributesProvider) {
        this.configDataSource = realGlobalConfigDataSource;
        this.marketAttributesProvider = realMarketAttributesProvider;
    }

    public final Object get(InstrumentLinkingPostcodeItem instrumentLinkingPostcodeItem) {
        Object obj = this.configDataSource.configItems.get(instrumentLinkingPostcodeItem);
        if (obj != null) {
            return ((GlobalConfigItemDelegate) obj).get(new MarketAttributes(this.marketAttributesProvider.regionProvider.get()));
        }
        Handlers$$ExternalSyntheticBUOutline0.m("Cannot find binder for item = ", instrumentLinkingPostcodeItem, ". You may want to add an entry into the GclLocalItemModule class");
        return null;
    }
}
