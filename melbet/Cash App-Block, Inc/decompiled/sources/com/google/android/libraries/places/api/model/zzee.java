package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzee implements Parcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new zzdp(5);
    public final List zza;

    public zzee(List list) {
        if (list != null) {
            this.zza = list;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null fuelPrices");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzee)) {
            return false;
        }
        return this.zza.equals(((zzee) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(obj.length() + 24), "FuelOptions{fuelPrices=", obj, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zza);
    }
}
