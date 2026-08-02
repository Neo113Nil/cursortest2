package com.squareup.cash.gcl.data;

import com.squareup.protos.franklin.api.Region;

/* loaded from: classes6.dex */
public final class MarketAttributes {
    public final Region region;

    public MarketAttributes(Region region) {
        region.getClass();
        this.region = region;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketAttributes) && this.region == ((MarketAttributes) obj).region;
    }

    public final int hashCode() {
        return this.region.hashCode();
    }

    public final String toString() {
        return "MarketAttributes(region=" + this.region + ")";
    }
}
