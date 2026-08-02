package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.passcode.screens.EndAppLock;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class VehicleDescription implements Parcelable {
    public static final Parcelable.Creator<VehicleDescription> CREATOR = new EndAppLock.Creator(16);
    public final String colorLabel;
    public final String note;
    public final String typeLabel;

    public VehicleDescription(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.colorLabel = str;
        this.typeLabel = str2;
        this.note = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleDescription)) {
            return false;
        }
        VehicleDescription vehicleDescription = (VehicleDescription) obj;
        return Intrinsics.areEqual(this.colorLabel, vehicleDescription.colorLabel) && Intrinsics.areEqual(this.typeLabel, vehicleDescription.typeLabel) && Intrinsics.areEqual(this.note, vehicleDescription.note);
    }

    public final int hashCode() {
        return this.note.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.colorLabel.hashCode() * 31, 31, this.typeLabel);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VehicleDescription(colorLabel=", this.colorLabel, ", typeLabel=", this.typeLabel, ", note="), this.note, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.colorLabel);
        parcel.writeString(this.typeLabel);
        parcel.writeString(this.note);
    }
}
