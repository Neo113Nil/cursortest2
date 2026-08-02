package com.squareup.cash.bitcoin.viewmodels.applet.activity;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinDependentActivityViewModel implements BitcoinHomeWidgetViewModel {
    public final UiCallbackModel embeddedActivityViewModel;

    public BitcoinDependentActivityViewModel(UiCallbackModel uiCallbackModel) {
        uiCallbackModel.getClass();
        this.embeddedActivityViewModel = uiCallbackModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinDependentActivityViewModel) && Intrinsics.areEqual(this.embeddedActivityViewModel, ((BitcoinDependentActivityViewModel) obj).embeddedActivityViewModel);
    }

    public final int hashCode() {
        return this.embeddedActivityViewModel.hashCode();
    }

    public final String toString() {
        return "BitcoinDependentActivityViewModel(embeddedActivityViewModel=" + this.embeddedActivityViewModel + ")";
    }
}
