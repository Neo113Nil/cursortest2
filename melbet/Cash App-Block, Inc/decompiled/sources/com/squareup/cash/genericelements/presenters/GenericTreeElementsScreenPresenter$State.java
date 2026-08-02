package com.squareup.cash.genericelements.presenters;

import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;

/* loaded from: classes6.dex */
public final class GenericTreeElementsScreenPresenter$State {
    public final GenericTreeElementsViewModel model;

    public GenericTreeElementsScreenPresenter$State(GenericTreeElementsViewModel genericTreeElementsViewModel) {
        this.model = genericTreeElementsViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericTreeElementsScreenPresenter$State) && this.model.equals(((GenericTreeElementsScreenPresenter$State) obj).model);
    }

    public final int hashCode() {
        return this.model.hashCode();
    }

    public final String toString() {
        return "State(model=" + this.model + ")";
    }
}
