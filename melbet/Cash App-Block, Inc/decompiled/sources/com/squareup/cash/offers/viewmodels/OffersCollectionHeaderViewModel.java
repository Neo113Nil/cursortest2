package com.squareup.cash.offers.viewmodels;

import com.squareup.cash.offers.viewmodels.FormattedDetailViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersCollectionHeaderViewModel {
    public final FormattedDetailViewModel collectionSubtitle;
    public final String collectionTitle;

    public OffersCollectionHeaderViewModel(String str, FormattedDetailViewModel.Text text) {
        str.getClass();
        this.collectionTitle = str;
        this.collectionSubtitle = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersCollectionHeaderViewModel)) {
            return false;
        }
        OffersCollectionHeaderViewModel offersCollectionHeaderViewModel = (OffersCollectionHeaderViewModel) obj;
        return Intrinsics.areEqual(this.collectionTitle, offersCollectionHeaderViewModel.collectionTitle) && Intrinsics.areEqual(this.collectionSubtitle, offersCollectionHeaderViewModel.collectionSubtitle);
    }

    public final int hashCode() {
        int hashCode = this.collectionTitle.hashCode() * 31;
        FormattedDetailViewModel formattedDetailViewModel = this.collectionSubtitle;
        return hashCode + (formattedDetailViewModel == null ? 0 : formattedDetailViewModel.hashCode());
    }

    public final String toString() {
        return "OffersCollectionHeaderViewModel(collectionTitle=" + this.collectionTitle + ", collectionSubtitle=" + this.collectionSubtitle + ")";
    }
}
