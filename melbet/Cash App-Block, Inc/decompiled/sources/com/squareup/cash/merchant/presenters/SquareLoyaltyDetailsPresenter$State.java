package com.squareup.cash.merchant.presenters;

import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SquareLoyaltyDetailsPresenter$State {
    public final boolean alwaysShowToolbarTitle;
    public final GenericTreeElementsViewModel model;
    public final String toolbarTitle;

    public SquareLoyaltyDetailsPresenter$State(GenericTreeElementsViewModel genericTreeElementsViewModel, String str, boolean z) {
        genericTreeElementsViewModel.getClass();
        this.model = genericTreeElementsViewModel;
        this.toolbarTitle = str;
        this.alwaysShowToolbarTitle = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SquareLoyaltyDetailsPresenter$State)) {
            return false;
        }
        SquareLoyaltyDetailsPresenter$State squareLoyaltyDetailsPresenter$State = (SquareLoyaltyDetailsPresenter$State) obj;
        return Intrinsics.areEqual(this.model, squareLoyaltyDetailsPresenter$State.model) && Intrinsics.areEqual(this.toolbarTitle, squareLoyaltyDetailsPresenter$State.toolbarTitle) && this.alwaysShowToolbarTitle == squareLoyaltyDetailsPresenter$State.alwaysShowToolbarTitle;
    }

    public final int hashCode() {
        int hashCode = this.model.hashCode() * 31;
        String str = this.toolbarTitle;
        return Boolean.hashCode(this.alwaysShowToolbarTitle) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(model=");
        sb.append(this.model);
        sb.append(", toolbarTitle=");
        sb.append(this.toolbarTitle);
        sb.append(", alwaysShowToolbarTitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.alwaysShowToolbarTitle, ")");
    }
}
