package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.wallet.zzb;

/* loaded from: classes4.dex */
public final class zzdo implements Parcelable {
    public static final Parcelable.Creator<zzdo> CREATOR = new zzb(29);
    public final String zza;
    public final zzdq zzb;
    public final String zzc;

    public zzdo(String str, zzdq zzdqVar, String str2) {
        this.zza = str;
        this.zzb = zzdqVar;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdo) {
            zzdo zzdoVar = (zzdo) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzdoVar.zza) : zzdoVar.zza == null) {
                zzdq zzdqVar = this.zzb;
                if (zzdqVar != null ? zzdqVar.equals(zzdoVar.zzb) : zzdoVar.zzb == null) {
                    String str2 = this.zzc;
                    if (str2 != null ? str2.equals(zzdoVar.zzc) : zzdoVar.zzc == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        zzdq zzdqVar = this.zzb;
        int hashCode2 = zzdqVar == null ? 0 : zzdqVar.hashCode();
        int i = hashCode ^ 1000003;
        String str2 = this.zzc;
        return (((i * 1000003) ^ hashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        String str2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 15 + String.valueOf(str2).length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "ConsumerAlert{overview=", str, ", details=", valueOf);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", languageCode=", str2, "}");
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
        parcel.writeParcelable(this.zzb, i);
        String str2 = this.zzc;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
    }
}
