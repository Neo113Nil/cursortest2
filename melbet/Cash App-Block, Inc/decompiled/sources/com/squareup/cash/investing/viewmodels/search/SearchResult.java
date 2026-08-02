package com.squareup.cash.investing.viewmodels.search;

import com.squareup.cash.investing.viewmodels.StockContentModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class SearchResult implements InvestingSearchRow {

    public final class CategoryResult extends SearchResult {
        public final StockContentModel contentModel;

        public CategoryResult(StockContentModel stockContentModel) {
            this.contentModel = stockContentModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryResult) && this.contentModel.equals(((CategoryResult) obj).contentModel);
        }

        @Override // com.squareup.cash.investing.viewmodels.search.SearchResult
        public final StockContentModel getContentModel() {
            return this.contentModel;
        }

        public final int hashCode() {
            return this.contentModel.hashCode();
        }

        public final String toString() {
            return "CategoryResult(contentModel=" + this.contentModel + ")";
        }
    }

    public final class StockResult extends SearchResult {
        public final StockContentModel contentModel;
        public final String symbol;

        public StockResult(StockContentModel stockContentModel, String str) {
            str.getClass();
            this.contentModel = stockContentModel;
            this.symbol = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StockResult)) {
                return false;
            }
            StockResult stockResult = (StockResult) obj;
            return this.contentModel.equals(stockResult.contentModel) && Intrinsics.areEqual(this.symbol, stockResult.symbol);
        }

        @Override // com.squareup.cash.investing.viewmodels.search.SearchResult
        public final StockContentModel getContentModel() {
            return this.contentModel;
        }

        public final int hashCode() {
            return this.symbol.hashCode() + (this.contentModel.hashCode() * 31);
        }

        public final String toString() {
            return "StockResult(contentModel=" + this.contentModel + ", symbol=" + this.symbol + ")";
        }
    }

    public abstract StockContentModel getContentModel();
}
