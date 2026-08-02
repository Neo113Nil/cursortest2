package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.wallet.zzb;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzcu implements Parcelable {
    public static final Parcelable.Creator<zzcu> CREATOR = new zzb(20);
    public final List zza;

    public zzcu(ArrayList arrayList) {
        if (arrayList != null) {
            this.zza = arrayList;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null asList");
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
        if (!(obj instanceof zzcu)) {
            return false;
        }
        return this.zza.equals(((zzcu) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(obj.length() + 26), "AddressComponents{asList=", obj, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zza);
    }
}
