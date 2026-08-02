package com.squareup.cash.merchant.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SquareLoyaltyDetailsViewModel {
    public final boolean alwaysShowToolbarTitle;
    public final GenericTreeElementsViewModel genericTreeElements;
    public final String toolbarTitle;

    public SquareLoyaltyDetailsViewModel(GenericTreeElementsViewModel genericTreeElementsViewModel, String str, boolean z) {
        genericTreeElementsViewModel.getClass();
        this.toolbarTitle = str;
        this.alwaysShowToolbarTitle = z;
        this.genericTreeElements = genericTreeElementsViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SquareLoyaltyDetailsViewModel)) {
            return false;
        }
        SquareLoyaltyDetailsViewModel squareLoyaltyDetailsViewModel = (SquareLoyaltyDetailsViewModel) obj;
        return Intrinsics.areEqual(this.toolbarTitle, squareLoyaltyDetailsViewModel.toolbarTitle) && this.alwaysShowToolbarTitle == squareLoyaltyDetailsViewModel.alwaysShowToolbarTitle && Intrinsics.areEqual(this.genericTreeElements, squareLoyaltyDetailsViewModel.genericTreeElements);
    }

    public final int hashCode() {
        String str = this.toolbarTitle;
        return this.genericTreeElements.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.alwaysShowToolbarTitle);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("SquareLoyaltyDetailsViewModel(toolbarTitle=", this.toolbarTitle, ", alwaysShowToolbarTitle=", ", genericTreeElements=", this.alwaysShowToolbarTitle);
        m1540m.append(this.genericTreeElements);
        m1540m.append(")");
        return m1540m.toString();
    }
}
