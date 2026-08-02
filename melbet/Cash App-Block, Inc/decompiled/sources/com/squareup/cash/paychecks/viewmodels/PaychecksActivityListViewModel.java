package com.squareup.cash.paychecks.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;

/* loaded from: classes6.dex */
public final class PaychecksActivityListViewModel {
    public final UiCallbackModel activityEmbeddedModel;

    public PaychecksActivityListViewModel(UiCallbackModel uiCallbackModel) {
        this.activityEmbeddedModel = uiCallbackModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaychecksActivityListViewModel) && this.activityEmbeddedModel.equals(((PaychecksActivityListViewModel) obj).activityEmbeddedModel);
    }

    public final int hashCode() {
        return this.activityEmbeddedModel.hashCode();
    }

    public final String toString() {
        return "PaychecksActivityListViewModel(activityEmbeddedModel=" + this.activityEmbeddedModel + ")";
    }
}
