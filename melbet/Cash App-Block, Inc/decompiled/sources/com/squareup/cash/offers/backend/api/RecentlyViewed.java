package com.squareup.cash.offers.backend.api;

/* loaded from: classes6.dex */
public final class RecentlyViewed {
    public final OffersItemToken itemToken;
    public final long lastUpdatedMillis;

    public RecentlyViewed(OffersItemToken offersItemToken, long j) {
        this.itemToken = offersItemToken;
        this.lastUpdatedMillis = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyViewed)) {
            return false;
        }
        RecentlyViewed recentlyViewed = (RecentlyViewed) obj;
        return this.itemToken.equals(recentlyViewed.itemToken) && this.lastUpdatedMillis == recentlyViewed.lastUpdatedMillis;
    }

    public final OffersItemToken getItemToken() {
        return this.itemToken;
    }

    public final long getLastUpdatedMillis() {
        return this.lastUpdatedMillis;
    }

    public final int hashCode() {
        return Long.hashCode(this.lastUpdatedMillis) + (this.itemToken.hashCode() * 31);
    }

    public final String toString() {
        return "RecentlyViewed(itemToken=" + this.itemToken + ", lastUpdatedMillis=" + this.lastUpdatedMillis + ")";
    }
}
