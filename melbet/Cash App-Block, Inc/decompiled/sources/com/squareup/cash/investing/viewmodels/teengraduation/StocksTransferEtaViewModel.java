package com.squareup.cash.investing.viewmodels.teengraduation;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StocksTransferEtaViewModel {
    public final String description;
    public final String doneButtonLabel;
    public final String title;

    public StocksTransferEtaViewModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.description = str2;
        this.doneButtonLabel = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StocksTransferEtaViewModel)) {
            return false;
        }
        StocksTransferEtaViewModel stocksTransferEtaViewModel = (StocksTransferEtaViewModel) obj;
        return Intrinsics.areEqual(this.title, stocksTransferEtaViewModel.title) && Intrinsics.areEqual(this.description, stocksTransferEtaViewModel.description) && Intrinsics.areEqual(this.doneButtonLabel, stocksTransferEtaViewModel.doneButtonLabel);
    }

    public final int hashCode() {
        return this.doneButtonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StocksTransferEtaViewModel(title=", this.title, ", description=", this.description, ", doneButtonLabel="), this.doneButtonLabel, ")");
    }
}
