package com.squareup.cash.earnings.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;

/* loaded from: classes6.dex */
public final class EarningsActivityListViewModel {
    public final UiCallbackModel activityEmbeddedModel;

    public EarningsActivityListViewModel(UiCallbackModel uiCallbackModel) {
        this.activityEmbeddedModel = uiCallbackModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsActivityListViewModel) && this.activityEmbeddedModel.equals(((EarningsActivityListViewModel) obj).activityEmbeddedModel);
    }

    public final int hashCode() {
        return this.activityEmbeddedModel.hashCode();
    }

    public final String toString() {
        return "EarningsActivityListViewModel(activityEmbeddedModel=" + this.activityEmbeddedModel + ")";
    }
}
