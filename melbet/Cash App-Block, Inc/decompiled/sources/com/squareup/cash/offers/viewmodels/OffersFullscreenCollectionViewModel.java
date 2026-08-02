package com.squareup.cash.offers.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersFullscreenCollectionViewModel {
    public final OffersCollectionHeaderViewModel headerViewModel;
    public final OffersCollectionListingViewModel listViewModel;

    public /* synthetic */ OffersFullscreenCollectionViewModel(OffersCollectionListingViewModel offersCollectionListingViewModel) {
        this(new OffersCollectionHeaderViewModel("", null), offersCollectionListingViewModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersFullscreenCollectionViewModel)) {
            return false;
        }
        OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel = (OffersFullscreenCollectionViewModel) obj;
        return Intrinsics.areEqual(this.headerViewModel, offersFullscreenCollectionViewModel.headerViewModel) && Intrinsics.areEqual(this.listViewModel, offersFullscreenCollectionViewModel.listViewModel);
    }

    public final int hashCode() {
        return this.listViewModel.hashCode() + (this.headerViewModel.hashCode() * 31);
    }

    public final String toString() {
        return "OffersFullscreenCollectionViewModel(headerViewModel=" + this.headerViewModel + ", listViewModel=" + this.listViewModel + ")";
    }

    public OffersFullscreenCollectionViewModel(OffersCollectionHeaderViewModel offersCollectionHeaderViewModel, OffersCollectionListingViewModel offersCollectionListingViewModel) {
        this.headerViewModel = offersCollectionHeaderViewModel;
        this.listViewModel = offersCollectionListingViewModel;
    }
}
