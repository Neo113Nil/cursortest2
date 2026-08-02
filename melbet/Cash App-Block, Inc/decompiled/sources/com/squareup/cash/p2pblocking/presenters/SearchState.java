package com.squareup.cash.p2pblocking.presenters;

import com.squareup.cash.p2pblocking.screens.P2PSearchData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SearchState {
    public final P2PSearchData data;
    public final boolean isLoading;

    public /* synthetic */ SearchState(P2PSearchData.AllowSearchData allowSearchData, int i) {
        this((P2PSearchData) ((i & 1) != 0 ? null : allowSearchData), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.squareup.cash.p2pblocking.screens.P2PSearchData] */
    public static SearchState copy$default(SearchState searchState, P2PSearchData.AllowSearchData allowSearchData, boolean z, int i) {
        P2PSearchData.AllowSearchData allowSearchData2 = allowSearchData;
        if ((i & 1) != 0) {
            allowSearchData2 = searchState.data;
        }
        if ((i & 2) != 0) {
            z = searchState.isLoading;
        }
        searchState.getClass();
        searchState.getClass();
        return new SearchState(allowSearchData2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchState)) {
            return false;
        }
        SearchState searchState = (SearchState) obj;
        return Intrinsics.areEqual(this.data, searchState.data) && this.isLoading == searchState.isLoading;
    }

    public final int hashCode() {
        P2PSearchData p2PSearchData = this.data;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m((p2PSearchData == null ? 0 : p2PSearchData.hashCode()) * 31, 31, this.isLoading);
    }

    public final String toString() {
        return "SearchState(data=" + this.data + ", isLoading=" + this.isLoading + ", error=null)";
    }

    public SearchState(P2PSearchData p2PSearchData, boolean z) {
        this.data = p2PSearchData;
        this.isLoading = z;
    }
}
