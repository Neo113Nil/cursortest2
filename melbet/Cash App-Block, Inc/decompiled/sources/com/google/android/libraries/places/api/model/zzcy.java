package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.wallet.zzb;

/* loaded from: classes4.dex */
public final class zzcy implements Parcelable {
    public static final Parcelable.Creator<zzcy> CREATOR = new zzb(22);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public zzcy(String str, int i, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcy)) {
            return false;
        }
        zzcy zzcyVar = (zzcy) obj;
        String str = this.zza;
        if (str == null) {
            if (zzcyVar.zza != null) {
                return false;
            }
        } else if (!str.equals(zzcyVar.zza)) {
            return false;
        }
        String str2 = this.zzb;
        if (str2 == null) {
            if (zzcyVar.zzb != null) {
                return false;
            }
        } else if (!str2.equals(zzcyVar.zzb)) {
            return false;
        }
        String str3 = this.zzc;
        if (str3 == null) {
            if (zzcyVar.zzc != null) {
                return false;
            }
        } else if (!str3.equals(zzcyVar.zzc)) {
            return false;
        }
        String str4 = this.zzd;
        if (str4 == null) {
            if (zzcyVar.zzd != null) {
                return false;
            }
        } else if (!str4.equals(zzcyVar.zzd)) {
            return false;
        }
        int i = this.zze;
        return i == 0 ? zzcyVar.zze == 0 : CameraSelector$$ExternalSyntheticOutline0.equals(i, zzcyVar.zze);
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.zzd;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        int i2 = this.zze;
        return hashCode4 ^ (i2 != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i2) : 0);
    }

    public final String toString() {
        int i = this.zze;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NEAR" : "OUTSKIRTS" : "WITHIN" : "CONTAINMENT_UNSPECIFIED";
        String str2 = this.zza;
        int length = String.valueOf(str2).length();
        String str3 = this.zzb;
        int length2 = String.valueOf(str3).length();
        String str4 = this.zzc;
        int length3 = String.valueOf(str4).length();
        String str5 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 23 + length2 + 14 + length3 + 26 + String.valueOf(str5).length() + 14 + str.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "Area{resourceName=", str2, ", id=", str3);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", displayName=", str4, ", displayNameLanguageCode=", str5);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", containment=", str, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2 = this.zza;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
        String str3 = this.zzb;
        if (str3 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str3);
        }
        String str4 = this.zzc;
        if (str4 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str4);
        }
        String str5 = this.zzd;
        if (str5 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str5);
        }
        int i2 = this.zze;
        if (i2 == 0) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        if (i2 == 1) {
            str = "CONTAINMENT_UNSPECIFIED";
        } else if (i2 == 2) {
            str = "WITHIN";
        } else if (i2 == 3) {
            str = "OUTSKIRTS";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "NEAR";
        }
        parcel.writeString(str);
    }
}
