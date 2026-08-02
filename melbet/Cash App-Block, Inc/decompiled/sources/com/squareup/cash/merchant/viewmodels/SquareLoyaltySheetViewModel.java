package com.squareup.cash.merchant.viewmodels;

import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SquareLoyaltySheetViewModel {
    public final GenericTreeElementsViewModel genericTreeElements;

    public SquareLoyaltySheetViewModel(GenericTreeElementsViewModel genericTreeElementsViewModel) {
        genericTreeElementsViewModel.getClass();
        this.genericTreeElements = genericTreeElementsViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SquareLoyaltySheetViewModel) && Intrinsics.areEqual(this.genericTreeElements, ((SquareLoyaltySheetViewModel) obj).genericTreeElements);
    }

    public final int hashCode() {
        return this.genericTreeElements.hashCode();
    }

    public final String toString() {
        return "SquareLoyaltySheetViewModel(genericTreeElements=" + this.genericTreeElements + ")";
    }
}
