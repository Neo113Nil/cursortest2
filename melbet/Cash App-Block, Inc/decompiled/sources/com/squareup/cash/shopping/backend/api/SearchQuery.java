package com.squareup.cash.shopping.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SearchQuery {
    public final String searchFlowToken;
    public final String searchText;
    public final String shopFlowToken;

    public SearchQuery(String str, String str2, String str3) {
        str.getClass();
        this.searchText = str;
        this.shopFlowToken = str2;
        this.searchFlowToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchQuery)) {
            return false;
        }
        SearchQuery searchQuery = (SearchQuery) obj;
        return Intrinsics.areEqual(this.searchText, searchQuery.searchText) && Intrinsics.areEqual(this.shopFlowToken, searchQuery.shopFlowToken) && Intrinsics.areEqual(this.searchFlowToken, searchQuery.searchFlowToken);
    }

    public final int hashCode() {
        int hashCode = this.searchText.hashCode() * 31;
        String str = this.shopFlowToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.searchFlowToken;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchQuery(searchText=", this.searchText, ", shopFlowToken=", this.shopFlowToken, ", searchFlowToken="), this.searchFlowToken, ")");
    }
}
