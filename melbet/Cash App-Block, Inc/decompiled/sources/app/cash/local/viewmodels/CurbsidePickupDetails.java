package app.cash.local.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CurbsidePickupDetails {
    public final boolean isSelected;
    public final String vehicleColorLabel;
    public final String vehicleNote;
    public final String vehicleTypeLabel;

    public CurbsidePickupDetails(boolean z, String str, String str2, String str3) {
        this.isSelected = z;
        this.vehicleColorLabel = str;
        this.vehicleTypeLabel = str2;
        this.vehicleNote = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurbsidePickupDetails)) {
            return false;
        }
        CurbsidePickupDetails curbsidePickupDetails = (CurbsidePickupDetails) obj;
        return this.isSelected == curbsidePickupDetails.isSelected && Intrinsics.areEqual(this.vehicleColorLabel, curbsidePickupDetails.vehicleColorLabel) && Intrinsics.areEqual(this.vehicleTypeLabel, curbsidePickupDetails.vehicleTypeLabel) && Intrinsics.areEqual(this.vehicleNote, curbsidePickupDetails.vehicleNote);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isSelected) * 31;
        String str = this.vehicleColorLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.vehicleTypeLabel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vehicleNote;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("CurbsidePickupDetails(isSelected=", ", vehicleColorLabel=", this.vehicleColorLabel, ", vehicleTypeLabel=", this.isSelected), this.vehicleTypeLabel, ", vehicleNote=", this.vehicleNote, ")");
    }
}
