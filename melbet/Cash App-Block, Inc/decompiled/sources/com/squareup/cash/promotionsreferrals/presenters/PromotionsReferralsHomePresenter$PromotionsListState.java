package com.squareup.cash.promotionsreferrals.presenters;

import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PromotionsReferralsHomePresenter$PromotionsListState {
    public final boolean isLoaded;
    public final PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel promotionsListViewModel;

    public PromotionsReferralsHomePresenter$PromotionsListState(PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel promotionsListViewModel, boolean z) {
        this.promotionsListViewModel = promotionsListViewModel;
        this.isLoaded = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionsReferralsHomePresenter$PromotionsListState)) {
            return false;
        }
        PromotionsReferralsHomePresenter$PromotionsListState promotionsReferralsHomePresenter$PromotionsListState = (PromotionsReferralsHomePresenter$PromotionsListState) obj;
        return Intrinsics.areEqual(this.promotionsListViewModel, promotionsReferralsHomePresenter$PromotionsListState.promotionsListViewModel) && this.isLoaded == promotionsReferralsHomePresenter$PromotionsListState.isLoaded;
    }

    public final int hashCode() {
        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel promotionsListViewModel = this.promotionsListViewModel;
        return Boolean.hashCode(this.isLoaded) + ((promotionsListViewModel == null ? 0 : promotionsListViewModel.hashCode()) * 31);
    }

    public final String toString() {
        return "PromotionsListState(promotionsListViewModel=" + this.promotionsListViewModel + ", isLoaded=" + this.isLoaded + ")";
    }
}
