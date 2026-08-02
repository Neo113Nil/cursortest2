package com.squareup.cash.billssubscriptions.viewmodels.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes5.dex */
public final class CategoryFilter {
    public final String displayName;
    public final String token;

    public CategoryFilter(String str, String str2) {
        this.token = str;
        this.displayName = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryFilter)) {
            return false;
        }
        CategoryFilter categoryFilter = (CategoryFilter) obj;
        return this.token.equals(categoryFilter.token) && this.displayName.equals(categoryFilter.displayName);
    }

    public final int hashCode() {
        return this.displayName.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CategoryFilter(token=", this.token, ", displayName=", this.displayName, ")");
    }
}
