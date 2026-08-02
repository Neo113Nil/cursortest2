package com.squareup.cash.family.familyhub.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentActivityEmbeddedSectionViewModel {
    public final DependentDetailViewEvent action;
    public final UiCallbackModel activitySectionViewModel;
    public final String sectionTitle;

    public DependentActivityEmbeddedSectionViewModel(String str, UiCallbackModel uiCallbackModel, DependentDetailViewEvent dependentDetailViewEvent) {
        str.getClass();
        dependentDetailViewEvent.getClass();
        this.sectionTitle = str;
        this.activitySectionViewModel = uiCallbackModel;
        this.action = dependentDetailViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentActivityEmbeddedSectionViewModel)) {
            return false;
        }
        DependentActivityEmbeddedSectionViewModel dependentActivityEmbeddedSectionViewModel = (DependentActivityEmbeddedSectionViewModel) obj;
        return Intrinsics.areEqual(this.sectionTitle, dependentActivityEmbeddedSectionViewModel.sectionTitle) && Intrinsics.areEqual(this.activitySectionViewModel, dependentActivityEmbeddedSectionViewModel.activitySectionViewModel) && Intrinsics.areEqual(this.action, dependentActivityEmbeddedSectionViewModel.action);
    }

    public final int hashCode() {
        int hashCode = this.sectionTitle.hashCode() * 31;
        UiCallbackModel uiCallbackModel = this.activitySectionViewModel;
        return this.action.hashCode() + ((hashCode + (uiCallbackModel == null ? 0 : uiCallbackModel.hashCode())) * 31);
    }

    public final String toString() {
        return "DependentActivityEmbeddedSectionViewModel(sectionTitle=" + this.sectionTitle + ", activitySectionViewModel=" + this.activitySectionViewModel + ", action=" + this.action + ")";
    }
}
