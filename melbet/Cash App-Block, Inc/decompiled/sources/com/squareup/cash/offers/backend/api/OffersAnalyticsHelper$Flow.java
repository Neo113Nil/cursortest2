package com.squareup.cash.offers.backend.api;

/* loaded from: classes6.dex */
public enum OffersAnalyticsHelper$Flow {
    SHOP(0, false),
    BROWSE(1, false),
    SEARCH(2, false),
    BOOST_PLASMA(3, true),
    REFERRER(4, false);

    public final boolean isPlasmaFlow;
    public final String key;

    OffersAnalyticsHelper$Flow(int i, boolean z) {
        this.key = r2;
        this.isPlasmaFlow = z;
    }
}
