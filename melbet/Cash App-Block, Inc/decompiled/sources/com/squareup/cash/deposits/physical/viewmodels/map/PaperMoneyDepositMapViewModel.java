package com.squareup.cash.deposits.physical.viewmodels.map;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import java.util.List;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositMapViewModel {
    public final UiCallbackModel cashMapUiModel;
    public final PaperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel centerOnUserLocationButtonViewModel;
    public final List depositMethods;
    public final PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel feeInformation;
    public final PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel forcedCameraUpdateViewModel;
    public final boolean helpButtonEnabled;
    public final PaperMoneyDepositMapSectionViewModel$MapDataViewModel mapDataViewModel;
    public final PaperMoneyDepositMapSectionViewModel$ViewTextViewModel viewTextViewModel;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DepositMethodFilter {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ DepositMethodFilter[] $VALUES;
        public static final DepositMethodFilter BarcodeScan;
        public static final DepositMethodFilter CardSwipe;

        static {
            DepositMethodFilter depositMethodFilter = new DepositMethodFilter("BarcodeScan", 0);
            BarcodeScan = depositMethodFilter;
            DepositMethodFilter depositMethodFilter2 = new DepositMethodFilter("CardSwipe", 1);
            CardSwipe = depositMethodFilter2;
            DepositMethodFilter[] depositMethodFilterArr = {depositMethodFilter, depositMethodFilter2};
            $VALUES = depositMethodFilterArr;
            $ENTRIES = new EnumEntriesList(depositMethodFilterArr);
        }

        public static DepositMethodFilter valueOf(String str) {
            return (DepositMethodFilter) Enum.valueOf(DepositMethodFilter.class, str);
        }

        public static DepositMethodFilter[] values() {
            return (DepositMethodFilter[]) $VALUES.clone();
        }
    }

    public PaperMoneyDepositMapViewModel(PaperMoneyDepositMapSectionViewModel$ViewTextViewModel paperMoneyDepositMapSectionViewModel$ViewTextViewModel, PaperMoneyDepositMapSectionViewModel$MapDataViewModel paperMoneyDepositMapSectionViewModel$MapDataViewModel, PaperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel paperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel, PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel paperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel, PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel paperMoneyDepositMapSectionViewModel$FeeInformationViewModel, UiCallbackModel uiCallbackModel, List list, boolean z) {
        paperMoneyDepositMapSectionViewModel$MapDataViewModel.getClass();
        paperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel.getClass();
        list.getClass();
        this.viewTextViewModel = paperMoneyDepositMapSectionViewModel$ViewTextViewModel;
        this.mapDataViewModel = paperMoneyDepositMapSectionViewModel$MapDataViewModel;
        this.centerOnUserLocationButtonViewModel = paperMoneyDepositMapSectionViewModel$CenterOnUserLocationButtonViewModel;
        this.forcedCameraUpdateViewModel = paperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel;
        this.feeInformation = paperMoneyDepositMapSectionViewModel$FeeInformationViewModel;
        this.cashMapUiModel = uiCallbackModel;
        this.depositMethods = list;
        this.helpButtonEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaperMoneyDepositMapViewModel)) {
            return false;
        }
        PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel = (PaperMoneyDepositMapViewModel) obj;
        return this.viewTextViewModel.equals(paperMoneyDepositMapViewModel.viewTextViewModel) && Intrinsics.areEqual(this.mapDataViewModel, paperMoneyDepositMapViewModel.mapDataViewModel) && Intrinsics.areEqual(this.centerOnUserLocationButtonViewModel, paperMoneyDepositMapViewModel.centerOnUserLocationButtonViewModel) && Intrinsics.areEqual(this.forcedCameraUpdateViewModel, paperMoneyDepositMapViewModel.forcedCameraUpdateViewModel) && Intrinsics.areEqual(this.feeInformation, paperMoneyDepositMapViewModel.feeInformation) && this.cashMapUiModel.equals(paperMoneyDepositMapViewModel.cashMapUiModel) && Intrinsics.areEqual(this.depositMethods, paperMoneyDepositMapViewModel.depositMethods) && this.helpButtonEnabled == paperMoneyDepositMapViewModel.helpButtonEnabled;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.viewTextViewModel.mapScreen.hashCode() * 31, 31, this.mapDataViewModel.retailerLocations);
        this.centerOnUserLocationButtonViewModel.getClass();
        int hashCode = (Boolean.hashCode(false) + m) * 31;
        PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel paperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel = this.forcedCameraUpdateViewModel;
        int hashCode2 = (hashCode + (paperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel == null ? 0 : paperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel.hashCode())) * 31;
        PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel paperMoneyDepositMapSectionViewModel$FeeInformationViewModel = this.feeInformation;
        return Boolean.hashCode(this.helpButtonEnabled) + Recorder$$ExternalSyntheticOutline2.m((this.cashMapUiModel.hashCode() + ((hashCode2 + (paperMoneyDepositMapSectionViewModel$FeeInformationViewModel != null ? paperMoneyDepositMapSectionViewModel$FeeInformationViewModel.hashCode() : 0)) * 31)) * 31, 31, this.depositMethods);
    }

    public final String toString() {
        return "PaperMoneyDepositMapViewModel(viewTextViewModel=" + this.viewTextViewModel + ", mapDataViewModel=" + this.mapDataViewModel + ", centerOnUserLocationButtonViewModel=" + this.centerOnUserLocationButtonViewModel + ", forcedCameraUpdateViewModel=" + this.forcedCameraUpdateViewModel + ", feeInformation=" + this.feeInformation + ", cashMapUiModel=" + this.cashMapUiModel + ", depositMethods=" + this.depositMethods + ", helpButtonEnabled=" + this.helpButtonEnabled + ")";
    }
}
