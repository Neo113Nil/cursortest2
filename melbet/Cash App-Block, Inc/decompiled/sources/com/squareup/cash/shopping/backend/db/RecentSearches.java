package com.squareup.cash.shopping.backend.db;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecentSearches {
    public final List searches;
    public final List viewed;

    public RecentSearches(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.viewed = list;
        this.searches = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentSearches)) {
            return false;
        }
        RecentSearches recentSearches = (RecentSearches) obj;
        return Intrinsics.areEqual(this.viewed, recentSearches.viewed) && Intrinsics.areEqual(this.searches, recentSearches.searches);
    }

    public final int hashCode() {
        return this.searches.hashCode() + (this.viewed.hashCode() * 31);
    }

    public final String toString() {
        return "RecentSearches(viewed=" + this.viewed + ", searches=" + this.searches + ")";
    }
}
