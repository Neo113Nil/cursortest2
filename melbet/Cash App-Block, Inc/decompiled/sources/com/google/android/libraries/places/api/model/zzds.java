package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzds implements Parcelable {
    public static final Parcelable.Creator<zzds> CREATOR = new zzdp(1);
    public final String zza;
    public final String zzb;

    public zzds(String str, String str2) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null resourceName");
            throw null;
        }
        this.zza = str;
        if (str2 != null) {
            this.zzb = str2;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null id");
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
        if (obj instanceof zzds) {
            zzds zzdsVar = (zzds) obj;
            if (this.zza.equals(zzdsVar.zza) && this.zzb.equals(zzdsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.zza;
        int length = str.length() + 34;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(length, 1, str2));
        Boxes$$ExternalSyntheticOutline1.m(sb, "ContainingPlace{resourceName=", str, ", id=", str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }
}
