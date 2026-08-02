package com.squareup.cash.bitcoin.viewmodels.map;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinMapViewModel {
    public final boolean canPayWithLightning;
    public final UiCallbackModel cashMapUiModel;
    public final FilteredLocations filteredLocations;
    public final boolean showPayButton;

    public BitcoinMapViewModel(boolean z, FilteredLocations filteredLocations, UiCallbackModel uiCallbackModel, boolean z2) {
        filteredLocations.getClass();
        this.canPayWithLightning = z;
        this.filteredLocations = filteredLocations;
        this.cashMapUiModel = uiCallbackModel;
        this.showPayButton = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinMapViewModel)) {
            return false;
        }
        BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj;
        return this.canPayWithLightning == bitcoinMapViewModel.canPayWithLightning && Intrinsics.areEqual(this.filteredLocations, bitcoinMapViewModel.filteredLocations) && this.cashMapUiModel.equals(bitcoinMapViewModel.cashMapUiModel) && this.showPayButton == bitcoinMapViewModel.showPayButton;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showPayButton) + ((this.cashMapUiModel.hashCode() + ((this.filteredLocations.hashCode() + (Boolean.hashCode(this.canPayWithLightning) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BitcoinMapViewModel(canPayWithLightning=" + this.canPayWithLightning + ", filteredLocations=" + this.filteredLocations + ", cashMapUiModel=" + this.cashMapUiModel + ", showPayButton=" + this.showPayButton + ")";
    }
}
