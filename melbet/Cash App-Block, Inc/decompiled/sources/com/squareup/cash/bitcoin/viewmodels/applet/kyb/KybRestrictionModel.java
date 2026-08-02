package com.squareup.cash.bitcoin.viewmodels.applet.kyb;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;

/* loaded from: classes5.dex */
public final class KybRestrictionModel implements BitcoinHomeWidgetViewModel {
    public final UiCallbackModel uiCallbackModel;

    public KybRestrictionModel(UiCallbackModel uiCallbackModel) {
        this.uiCallbackModel = uiCallbackModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KybRestrictionModel) && this.uiCallbackModel.equals(((KybRestrictionModel) obj).uiCallbackModel);
    }

    public final int hashCode() {
        return this.uiCallbackModel.hashCode();
    }

    public final String toString() {
        return "KybRestrictionModel(uiCallbackModel=" + this.uiCallbackModel + ")";
    }
}
