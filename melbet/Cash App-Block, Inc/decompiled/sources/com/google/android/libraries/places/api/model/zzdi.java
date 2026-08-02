package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.wallet.zzb;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class zzdi implements Parcelable {
    public static final Parcelable.Creator<zzdi> CREATOR = new zzb(27);
    public final ParcelUuid zza;

    public zzdi(ParcelUuid parcelUuid) {
        if (parcelUuid != null) {
            this.zza = parcelUuid;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null UUID");
            throw null;
        }
    }

    public static zzdi newInstance() {
        return new zzdi(new ParcelUuid(UUID.randomUUID()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdi)) {
            return false;
        }
        return this.zza.equals(((zzdi) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
    }
}
