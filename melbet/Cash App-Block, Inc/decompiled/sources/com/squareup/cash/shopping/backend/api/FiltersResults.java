package com.squareup.cash.shopping.backend.api;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class FiltersResults {
    public final String errorMessage;
    public final List filters;

    public FiltersResults(List list, String str) {
        list.getClass();
        this.filters = list;
        this.errorMessage = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersResults)) {
            return false;
        }
        FiltersResults filtersResults = (FiltersResults) obj;
        return Intrinsics.areEqual(this.filters, filtersResults.filters) && Intrinsics.areEqual(this.errorMessage, filtersResults.errorMessage);
    }

    public final int hashCode() {
        int hashCode = this.filters.hashCode() * 31;
        String str = this.errorMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FiltersResults(filters=" + this.filters + ", errorMessage=" + this.errorMessage + ")";
    }
}
