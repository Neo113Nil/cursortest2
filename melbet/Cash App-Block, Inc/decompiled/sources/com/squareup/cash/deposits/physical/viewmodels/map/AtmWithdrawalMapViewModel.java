package com.squareup.cash.deposits.physical.viewmodels.map;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AtmWithdrawalMapViewModel {
    public final List atmLocations;
    public final UiCallbackModel cashMapUiModel;
    public final AtmFeeViewModel feeViewModel;
    public final boolean hasSeenExplainer;
    public final String searchedAddress;
    public final boolean showAddress;
    public final ViewTextViewModel viewTextViewModel;

    public final class AtmFeeViewModel {
        public final Icon icon;
        public final String text;

        public AtmFeeViewModel(Icon icon, String str) {
            this.icon = icon;
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtmFeeViewModel)) {
                return false;
            }
            AtmFeeViewModel atmFeeViewModel = (AtmFeeViewModel) obj;
            return this.icon.equals(atmFeeViewModel.icon) && this.text.equals(atmFeeViewModel.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.icon.hashCode() * 31);
        }

        public final String toString() {
            return "AtmFeeViewModel(icon=" + this.icon + ", text=" + this.text + ")";
        }
    }

    public AtmWithdrawalMapViewModel(ViewTextViewModel viewTextViewModel, UiCallbackModel uiCallbackModel, List list, boolean z, boolean z2, String str, AtmFeeViewModel atmFeeViewModel) {
        list.getClass();
        str.getClass();
        this.viewTextViewModel = viewTextViewModel;
        this.cashMapUiModel = uiCallbackModel;
        this.atmLocations = list;
        this.hasSeenExplainer = z;
        this.showAddress = z2;
        this.searchedAddress = str;
        this.feeViewModel = atmFeeViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtmWithdrawalMapViewModel)) {
            return false;
        }
        AtmWithdrawalMapViewModel atmWithdrawalMapViewModel = (AtmWithdrawalMapViewModel) obj;
        return this.viewTextViewModel.equals(atmWithdrawalMapViewModel.viewTextViewModel) && this.cashMapUiModel.equals(atmWithdrawalMapViewModel.cashMapUiModel) && Intrinsics.areEqual(this.atmLocations, atmWithdrawalMapViewModel.atmLocations) && this.hasSeenExplainer == atmWithdrawalMapViewModel.hasSeenExplainer && this.showAddress == atmWithdrawalMapViewModel.showAddress && Intrinsics.areEqual(this.searchedAddress, atmWithdrawalMapViewModel.searchedAddress) && Intrinsics.areEqual(this.feeViewModel, atmWithdrawalMapViewModel.feeViewModel);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((this.cashMapUiModel.hashCode() + (this.viewTextViewModel.mapScreen.hashCode() * 31)) * 31, 31, this.atmLocations), 31, this.hasSeenExplainer), 31, this.showAddress), 31, this.searchedAddress);
        AtmFeeViewModel atmFeeViewModel = this.feeViewModel;
        return m + (atmFeeViewModel == null ? 0 : atmFeeViewModel.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtmWithdrawalMapViewModel(viewTextViewModel=");
        sb.append(this.viewTextViewModel);
        sb.append(", cashMapUiModel=");
        sb.append(this.cashMapUiModel);
        sb.append(", atmLocations=");
        sb.append(this.atmLocations);
        sb.append(", hasSeenExplainer=");
        sb.append(this.hasSeenExplainer);
        sb.append(", showAddress=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.showAddress, ", searchedAddress=", this.searchedAddress, ", feeViewModel=");
        sb.append(this.feeViewModel);
        sb.append(")");
        return sb.toString();
    }
}
