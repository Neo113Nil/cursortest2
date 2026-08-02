package com.squareup.cash.merchant.presenters;

import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SquareLoyaltySheetPresenter$State {
    public final AnalyticsEvent dismissEvent;
    public final GenericTreeElementsViewModel model;

    public SquareLoyaltySheetPresenter$State(GenericTreeElementsViewModel genericTreeElementsViewModel, AnalyticsEvent analyticsEvent) {
        genericTreeElementsViewModel.getClass();
        this.model = genericTreeElementsViewModel;
        this.dismissEvent = analyticsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SquareLoyaltySheetPresenter$State)) {
            return false;
        }
        SquareLoyaltySheetPresenter$State squareLoyaltySheetPresenter$State = (SquareLoyaltySheetPresenter$State) obj;
        return Intrinsics.areEqual(this.model, squareLoyaltySheetPresenter$State.model) && Intrinsics.areEqual(this.dismissEvent, squareLoyaltySheetPresenter$State.dismissEvent);
    }

    public final int hashCode() {
        int hashCode = this.model.hashCode() * 31;
        AnalyticsEvent analyticsEvent = this.dismissEvent;
        return hashCode + (analyticsEvent == null ? 0 : analyticsEvent.hashCode());
    }

    public final String toString() {
        return "State(model=" + this.model + ", dismissEvent=" + this.dismissEvent + ")";
    }
}
