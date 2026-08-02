package com.squareup.cash.blockers.scenarioplan.viewmodels;

import com.squareup.cash.formview.viewmodels.FormViewModel;

/* loaded from: classes5.dex */
public final class ScenarioPlanErrorViewModel {
    public final FormViewModel formViewModel;

    public ScenarioPlanErrorViewModel(FormViewModel formViewModel) {
        this.formViewModel = formViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScenarioPlanErrorViewModel) && this.formViewModel.equals(((ScenarioPlanErrorViewModel) obj).formViewModel);
    }

    public final int hashCode() {
        return this.formViewModel.hashCode();
    }

    public final String toString() {
        return "ScenarioPlanErrorViewModel(formViewModel=" + this.formViewModel + ")";
    }
}
