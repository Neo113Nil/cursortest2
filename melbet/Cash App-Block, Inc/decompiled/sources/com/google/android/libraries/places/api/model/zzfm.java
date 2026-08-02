package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzfm implements Parcelable {
    public static final Parcelable.Creator<zzfm> CREATOR = new zzdp(21);
    public final String zza;
    public final String zzb;

    public zzfm(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfm) {
            zzfm zzfmVar = (zzfm) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfmVar.zza) : zzfmVar.zza == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfmVar.zzb) : zzfmVar.zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 35 + String.valueOf(str2).length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "PlusCode{compoundCode=", str, ", globalCode=", str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        String str2 = this.zzb;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
    }
}
