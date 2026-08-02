package com.squareup.cash.p2pblocking.presenters;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SearchResultsData {
    public final List searchResults;
    public final List suggestionResults;

    public SearchResultsData(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.suggestionResults = list;
        this.searchResults = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultsData)) {
            return false;
        }
        SearchResultsData searchResultsData = (SearchResultsData) obj;
        return Intrinsics.areEqual(this.suggestionResults, searchResultsData.suggestionResults) && Intrinsics.areEqual(this.searchResults, searchResultsData.searchResults);
    }

    public final int hashCode() {
        return this.searchResults.hashCode() + (this.suggestionResults.hashCode() * 31);
    }

    public final String toString() {
        return "SearchResultsData(suggestionResults=" + this.suggestionResults + ", searchResults=" + this.searchResults + ")";
    }
}
