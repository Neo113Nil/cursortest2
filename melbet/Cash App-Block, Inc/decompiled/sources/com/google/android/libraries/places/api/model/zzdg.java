package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.wallet.zzb;

/* loaded from: classes4.dex */
public final class zzdg implements Parcelable {
    public static final Parcelable.Creator<zzdg> CREATOR = new zzb(26);
    public final int zza;
    public final int zzb;

    public zzdg(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdg) {
            zzdg zzdgVar = (zzdg) obj;
            if (this.zza == zzdgVar.zza && this.zzb == zzdgVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(i2).length() + 1);
        Fragment$5$$ExternalSyntheticOutline0.m(i, i2, "SubstringMatch{offset=", ", length=", sb);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
    }
}
