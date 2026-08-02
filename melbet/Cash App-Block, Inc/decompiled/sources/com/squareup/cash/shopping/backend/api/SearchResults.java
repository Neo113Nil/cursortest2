package com.squareup.cash.shopping.backend.api;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SearchResults {
    public final String errorMessage;
    public final String paginationToken;
    public final List sections;

    public /* synthetic */ SearchResults(int i, String str, String str2, List list) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResults)) {
            return false;
        }
        SearchResults searchResults = (SearchResults) obj;
        return Intrinsics.areEqual(this.sections, searchResults.sections) && Intrinsics.areEqual(this.errorMessage, searchResults.errorMessage) && Intrinsics.areEqual(this.paginationToken, searchResults.paginationToken);
    }

    public final int hashCode() {
        int hashCode = this.sections.hashCode() * 31;
        String str = this.errorMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paginationToken;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m("SearchResults(sections=", ", errorMessage=", this.errorMessage, ", paginationToken=", this.sections), this.paginationToken, ")");
    }

    public SearchResults(List list, String str, String str2) {
        list.getClass();
        this.sections = list;
        this.errorMessage = str;
        this.paginationToken = str2;
    }
}
