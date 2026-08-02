package com.squareup.cash.marketcapabilities.db;

import com.squareup.protos.cash.cashabilities.api.MarketCapability;
import com.squareup.protos.franklin.api.UiAlias;

/* loaded from: classes.dex */
public abstract class MarketCapabilitiesAdapterKt {
    public static final UiAlias.Type.Companion marketCapabilitiesAdapter;

    static {
        MarketCapability.ADAPTER.getClass();
        marketCapabilitiesAdapter = new UiAlias.Type.Companion();
    }
}
