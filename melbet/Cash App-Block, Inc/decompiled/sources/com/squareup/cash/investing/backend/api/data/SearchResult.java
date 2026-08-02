package com.squareup.cash.investing.backend.api.data;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class SearchResult {

    public final class CategorySearchResult extends SearchResult {
        public final Category category;

        public CategorySearchResult(Category category) {
            category.getClass();
            this.category = category;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategorySearchResult) && Intrinsics.areEqual(this.category, ((CategorySearchResult) obj).category);
        }

        public final int hashCode() {
            return this.category.hashCode();
        }

        public final String toString() {
            return "CategorySearchResult(category=" + this.category + ")";
        }
    }

    public final class InvestmentEntitySearchResult extends SearchResult {
        public final InvestmentEntityWithPrice entity;

        public InvestmentEntitySearchResult(InvestmentEntityWithPrice investmentEntityWithPrice) {
            this.entity = investmentEntityWithPrice;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvestmentEntitySearchResult) && this.entity.equals(((InvestmentEntitySearchResult) obj).entity);
        }

        public final int hashCode() {
            return this.entity.hashCode();
        }

        public final String toString() {
            return "InvestmentEntitySearchResult(entity=" + this.entity + ")";
        }
    }
}
