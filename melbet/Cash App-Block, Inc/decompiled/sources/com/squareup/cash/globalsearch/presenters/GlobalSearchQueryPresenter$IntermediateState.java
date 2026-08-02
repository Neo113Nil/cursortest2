package com.squareup.cash.globalsearch.presenters;

import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GlobalSearchQueryPresenter$IntermediateState {
    public final GlobalSearchViewModel.ErrorToast errorToast;
    public final List sectionPresenters;

    public GlobalSearchQueryPresenter$IntermediateState(List list, GlobalSearchViewModel.ErrorToast errorToast) {
        list.getClass();
        this.sectionPresenters = list;
        this.errorToast = errorToast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchQueryPresenter$IntermediateState)) {
            return false;
        }
        GlobalSearchQueryPresenter$IntermediateState globalSearchQueryPresenter$IntermediateState = (GlobalSearchQueryPresenter$IntermediateState) obj;
        return Intrinsics.areEqual(this.sectionPresenters, globalSearchQueryPresenter$IntermediateState.sectionPresenters) && Intrinsics.areEqual(this.errorToast, globalSearchQueryPresenter$IntermediateState.errorToast);
    }

    public final int hashCode() {
        int hashCode = this.sectionPresenters.hashCode() * 31;
        GlobalSearchViewModel.ErrorToast errorToast = this.errorToast;
        return hashCode + (errorToast == null ? 0 : errorToast.hashCode());
    }

    public final String toString() {
        return "IntermediateState(sectionPresenters=" + this.sectionPresenters + ", errorToast=" + this.errorToast + ")";
    }
}
