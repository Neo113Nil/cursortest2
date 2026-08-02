package com.squareup.cash.investing.viewmodels;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsViewModel {
    public final InvestmentEntityContentModel entity;

    public InvestingStockDetailsViewModel(InvestmentEntityContentModel investmentEntityContentModel) {
        this.entity = investmentEntityContentModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestingStockDetailsViewModel) && this.entity.equals(((InvestingStockDetailsViewModel) obj).entity);
    }

    public final int hashCode() {
        return this.entity.hashCode();
    }

    public final String toString() {
        return "InvestingStockDetailsViewModel(entity=" + this.entity + ")";
    }
}
