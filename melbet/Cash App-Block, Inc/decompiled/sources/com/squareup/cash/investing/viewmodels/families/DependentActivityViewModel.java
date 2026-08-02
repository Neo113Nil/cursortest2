package com.squareup.cash.investing.viewmodels.families;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentActivityViewModel {
    public final UiCallbackModel activityEmbeddedModel;
    public final String title;

    public DependentActivityViewModel(UiCallbackModel uiCallbackModel, String str) {
        str.getClass();
        this.title = str;
        this.activityEmbeddedModel = uiCallbackModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentActivityViewModel)) {
            return false;
        }
        DependentActivityViewModel dependentActivityViewModel = (DependentActivityViewModel) obj;
        return Intrinsics.areEqual(this.title, dependentActivityViewModel.title) && this.activityEmbeddedModel.equals(dependentActivityViewModel.activityEmbeddedModel);
    }

    public final int hashCode() {
        return this.activityEmbeddedModel.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return "DependentActivityViewModel(title=" + this.title + ", activityEmbeddedModel=" + this.activityEmbeddedModel + ")";
    }
}
