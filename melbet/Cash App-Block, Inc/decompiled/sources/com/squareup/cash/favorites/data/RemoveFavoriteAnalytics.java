package com.squareup.cash.favorites.data;

import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectRemoveFavorite;

/* loaded from: classes6.dex */
public final class RemoveFavoriteAnalytics {
    public final CustomerProfileConnectRemoveFavorite.Origin origin;

    public RemoveFavoriteAnalytics(CustomerProfileConnectRemoveFavorite.Origin origin) {
        this.origin = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RemoveFavoriteAnalytics) && this.origin == ((RemoveFavoriteAnalytics) obj).origin;
    }

    public final int hashCode() {
        return this.origin.hashCode();
    }

    public final String toString() {
        return "RemoveFavoriteAnalytics(origin=" + this.origin + ")";
    }
}
