package com.squareup.cash.activity.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class FullScreenActivityViewModel {
    public final UiCallbackModel activityEmbeddedViewModel;
    public final String title;

    public FullScreenActivityViewModel(UiCallbackModel uiCallbackModel, String str) {
        str.getClass();
        uiCallbackModel.getClass();
        this.title = str;
        this.activityEmbeddedViewModel = uiCallbackModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullScreenActivityViewModel)) {
            return false;
        }
        FullScreenActivityViewModel fullScreenActivityViewModel = (FullScreenActivityViewModel) obj;
        return Intrinsics.areEqual(this.title, fullScreenActivityViewModel.title) && Intrinsics.areEqual(this.activityEmbeddedViewModel, fullScreenActivityViewModel.activityEmbeddedViewModel);
    }

    public final int hashCode() {
        return this.activityEmbeddedViewModel.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return "FullScreenActivityViewModel(title=" + this.title + ", activityEmbeddedViewModel=" + this.activityEmbeddedViewModel + ")";
    }
}
