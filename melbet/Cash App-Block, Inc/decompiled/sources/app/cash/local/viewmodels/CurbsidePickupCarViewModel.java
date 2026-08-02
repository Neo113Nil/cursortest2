package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CurbsidePickupCarViewModel {
    public final List colorOptions;
    public final boolean hasSelectionChanges;
    public final String initialNote;
    public final VehicleColorOption selectedColor;
    public final VehicleTypeOption selectedType;
    public final List typeOptions;

    public CurbsidePickupCarViewModel(List list, List list2, VehicleColorOption vehicleColorOption, VehicleTypeOption vehicleTypeOption, String str, boolean z) {
        list.getClass();
        list2.getClass();
        this.colorOptions = list;
        this.typeOptions = list2;
        this.selectedColor = vehicleColorOption;
        this.selectedType = vehicleTypeOption;
        this.initialNote = str;
        this.hasSelectionChanges = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurbsidePickupCarViewModel)) {
            return false;
        }
        CurbsidePickupCarViewModel curbsidePickupCarViewModel = (CurbsidePickupCarViewModel) obj;
        return Intrinsics.areEqual(this.colorOptions, curbsidePickupCarViewModel.colorOptions) && Intrinsics.areEqual(this.typeOptions, curbsidePickupCarViewModel.typeOptions) && Intrinsics.areEqual(this.selectedColor, curbsidePickupCarViewModel.selectedColor) && Intrinsics.areEqual(this.selectedType, curbsidePickupCarViewModel.selectedType) && this.initialNote.equals(curbsidePickupCarViewModel.initialNote) && this.hasSelectionChanges == curbsidePickupCarViewModel.hasSelectionChanges;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.colorOptions.hashCode() * 31, 31, this.typeOptions);
        VehicleColorOption vehicleColorOption = this.selectedColor;
        int hashCode = (m + (vehicleColorOption == null ? 0 : vehicleColorOption.hashCode())) * 31;
        VehicleTypeOption vehicleTypeOption = this.selectedType;
        return Boolean.hashCode(this.hasSelectionChanges) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (vehicleTypeOption != null ? vehicleTypeOption.label.hashCode() : 0)) * 31, 31, this.initialNote);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("CurbsidePickupCarViewModel(colorOptions=", ", typeOptions=", ", selectedColor=", this.colorOptions, this.typeOptions);
        m.append(this.selectedColor);
        m.append(", selectedType=");
        m.append(this.selectedType);
        m.append(", initialNote=");
        return re$$ExternalSyntheticOutline0.m(m, this.initialNote, ", hasSelectionChanges=", this.hasSelectionChanges, ")");
    }
}
