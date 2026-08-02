package com.squareup.cash.investing.viewmodels.search;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SearchRowHeader implements InvestingSearchRow {
    public final String description;
    public final String title;

    public SearchRowHeader(String str, String str2) {
        str.getClass();
        this.title = str;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchRowHeader)) {
            return false;
        }
        SearchRowHeader searchRowHeader = (SearchRowHeader) obj;
        return Intrinsics.areEqual(this.title, searchRowHeader.title) && Intrinsics.areEqual(this.description, searchRowHeader.description);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SearchRowHeader(title=", this.title, ", description=", this.description, ")");
    }
}
