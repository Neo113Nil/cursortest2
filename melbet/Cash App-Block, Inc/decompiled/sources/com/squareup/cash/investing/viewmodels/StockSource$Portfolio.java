package com.squareup.cash.investing.viewmodels;

import com.nimbusds.jose.util.DeflateUtils;

/* loaded from: classes6.dex */
public final class StockSource$Portfolio extends DeflateUtils {
    public static final StockSource$Portfolio INSTANCE = new StockSource$Portfolio();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StockSource$Portfolio);
    }

    public final int hashCode() {
        return 628050111;
    }

    public final String toString() {
        return "Portfolio";
    }
}
