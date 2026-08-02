package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzem implements Parcelable {
    public static final Parcelable.Creator<zzem> CREATOR = new zzdp(9);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final List zze;
    public final int zzf;
    public final Double zzg;
    public final Double zzh;

    public zzem(String str, String str2, String str3, String str4, ArrayList arrayList, int i, Double d, Double d2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = arrayList;
        this.zzf = i;
        this.zzg = d;
        this.zzh = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzem)) {
            return false;
        }
        zzem zzemVar = (zzem) obj;
        String str = this.zza;
        if (str == null) {
            if (zzemVar.zza != null) {
                return false;
            }
        } else if (!str.equals(zzemVar.zza)) {
            return false;
        }
        String str2 = this.zzb;
        if (str2 == null) {
            if (zzemVar.zzb != null) {
                return false;
            }
        } else if (!str2.equals(zzemVar.zzb)) {
            return false;
        }
        String str3 = this.zzc;
        if (str3 == null) {
            if (zzemVar.zzc != null) {
                return false;
            }
        } else if (!str3.equals(zzemVar.zzc)) {
            return false;
        }
        String str4 = this.zzd;
        if (str4 == null) {
            if (zzemVar.zzd != null) {
                return false;
            }
        } else if (!str4.equals(zzemVar.zzd)) {
            return false;
        }
        List list = this.zze;
        if (list == null) {
            if (zzemVar.zze != null) {
                return false;
            }
        } else if (!list.equals(zzemVar.zze)) {
            return false;
        }
        int i = this.zzf;
        if (i == 0) {
            if (zzemVar.zzf != 0) {
                return false;
            }
        } else if (!CameraSelector$$ExternalSyntheticOutline0.equals(i, zzemVar.zzf)) {
            return false;
        }
        Double d = this.zzg;
        if (d == null) {
            if (zzemVar.zzg != null) {
                return false;
            }
        } else if (!d.equals(zzemVar.zzg)) {
            return false;
        }
        Double d2 = this.zzh;
        return d2 == null ? zzemVar.zzh == null : d2.equals(zzemVar.zzh);
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
        List list = this.zze;
        int hashCode5 = (hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        int i2 = this.zzf;
        int ordinal = (hashCode5 ^ (i2 == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i2))) * 1000003;
        Double d = this.zzg;
        int hashCode6 = (ordinal ^ (d == null ? 0 : d.hashCode())) * 1000003;
        Double d2 = this.zzh;
        return hashCode6 ^ (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.zze);
        switch (this.zzf) {
            case 1:
                str = "NEAR";
                break;
            case 2:
                str = "WITHIN";
                break;
            case 3:
                str = "BESIDE";
                break;
            case 4:
                str = "ACROSS_THE_ROAD";
                break;
            case 5:
                str = "DOWN_THE_ROAD";
                break;
            case 6:
                str = "AROUND_THE_CORNER";
                break;
            case 7:
                str = "BEHIND";
                break;
            default:
                str = "null";
                break;
        }
        String str2 = this.zza;
        int length = String.valueOf(str2).length();
        String str3 = this.zzb;
        int length2 = String.valueOf(str3).length();
        String str4 = this.zzc;
        int length3 = String.valueOf(str4).length();
        String str5 = this.zzd;
        int length4 = String.valueOf(str5).length();
        int length5 = valueOf.length();
        int length6 = str.length();
        Double d = this.zzg;
        int length7 = String.valueOf(d).length();
        Double d2 = this.zzh;
        StringBuilder sb = new StringBuilder(length + 27 + length2 + 14 + length3 + 26 + length4 + 8 + length5 + 22 + length6 + 29 + length7 + 23 + String.valueOf(d2).length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "Landmark{resourceName=", str2, ", id=", str3);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", displayName=", str4, ", displayNameLanguageCode=", str5);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", types=", valueOf, ", spatialRelationship=", str);
        sb.append(", straightLineDistanceMeters=");
        sb.append(d);
        sb.append(", travelDistanceMeters=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
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
        parcel.writeList(this.zze);
        int i2 = this.zzf;
        if (i2 == 0) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            switch (i2) {
                case 1:
                    str = "NEAR";
                    break;
                case 2:
                    str = "WITHIN";
                    break;
                case 3:
                    str = "BESIDE";
                    break;
                case 4:
                    str = "ACROSS_THE_ROAD";
                    break;
                case 5:
                    str = "DOWN_THE_ROAD";
                    break;
                case 6:
                    str = "AROUND_THE_CORNER";
                    break;
                case 7:
                    str = "BEHIND";
                    break;
                default:
                    throw null;
            }
            parcel.writeString(str);
        }
        Double d = this.zzg;
        if (d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.zzh;
        if (d2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(d2.doubleValue());
        }
    }
}
