package com.squareup.cash.buynowpaylater.presenters;

import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;

/* loaded from: classes4.dex */
public final class AfterPayOrderDetailsPresenter$State {
    public final AfterPayOrderDetailsViewModel viewModel;

    public AfterPayOrderDetailsPresenter$State(AfterPayOrderDetailsViewModel afterPayOrderDetailsViewModel) {
        this.viewModel = afterPayOrderDetailsViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterPayOrderDetailsPresenter$State) && this.viewModel.equals(((AfterPayOrderDetailsPresenter$State) obj).viewModel);
    }

    public final int hashCode() {
        return this.viewModel.hashCode();
    }

    public final String toString() {
        return "State(viewModel=" + this.viewModel + ")";
    }
}
