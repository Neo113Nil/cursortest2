package com.squareup.cash.investing.backend.api.data;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class CategoryDetails {
    public final Category category;
    public final ArrayList filters;

    public CategoryDetails(Category category, ArrayList arrayList) {
        this.category = category;
        this.filters = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryDetails)) {
            return false;
        }
        CategoryDetails categoryDetails = (CategoryDetails) obj;
        return this.category.equals(categoryDetails.category) && this.filters.equals(categoryDetails.filters);
    }

    public final int hashCode() {
        return this.filters.hashCode() + (this.category.hashCode() * 31);
    }

    public final String toString() {
        return "CategoryDetails(category=" + this.category + ", filters=" + this.filters + ")";
    }
}
