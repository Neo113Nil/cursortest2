package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzfg extends PhotoMetadata {
    public static final Parcelable.Creator<zzfg> CREATOR = new zzdp(19);
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final String zzd;
    public final String zze;
    public final zzdc zzf;
    public final Uri zzg;
    public final Uri zzh;

    public zzfg(String str, int i, int i2, String str2, String str3, zzdc zzdcVar, Uri uri, Uri uri2) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null attributions");
            throw null;
        }
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        if (str2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null photoReference");
            throw null;
        }
        this.zzd = str2;
        this.zze = str3;
        this.zzf = zzdcVar;
        this.zzg = uri;
        this.zzh = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhotoMetadata) {
            zzfg zzfgVar = (zzfg) ((PhotoMetadata) obj);
            if (this.zza.equals(zzfgVar.zza) && this.zzb == zzfgVar.zzb && this.zzc == zzfgVar.zzc && this.zzd.equals(zzfgVar.zzd)) {
                String str = zzfgVar.zze;
                String str2 = this.zze;
                if (str2 != null ? str2.equals(str) : str == null) {
                    zzdc zzdcVar = zzfgVar.zzf;
                    zzdc zzdcVar2 = this.zzf;
                    if (zzdcVar2 != null ? zzdcVar2.equals(zzdcVar) : zzdcVar == null) {
                        Uri uri = zzfgVar.zzg;
                        Uri uri2 = this.zzg;
                        if (uri2 != null ? uri2.equals(uri) : uri == null) {
                            Uri uri3 = zzfgVar.zzh;
                            Uri uri4 = this.zzh;
                            if (uri4 != null ? uri4.equals(uri3) : uri3 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc) * 1000003) ^ this.zzd.hashCode();
        String str = this.zze;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        zzdc zzdcVar = this.zzf;
        int hashCode3 = (hashCode2 ^ (zzdcVar == null ? 0 : zzdcVar.hashCode())) * 1000003;
        Uri uri = this.zzg;
        int hashCode4 = (hashCode3 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.zzh;
        return hashCode4 ^ (uri2 != null ? uri2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzf);
        String valueOf2 = String.valueOf(this.zzg);
        String valueOf3 = String.valueOf(this.zzh);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        int length2 = String.valueOf(i2).length();
        String str = this.zze;
        int length3 = String.valueOf(str).length();
        int length4 = valueOf.length();
        int length5 = valueOf2.length();
        int length6 = valueOf3.length();
        String str2 = this.zza;
        int length7 = str2.length() + 36 + length + 8 + length2 + 17;
        String str3 = this.zzd;
        StringBuilder sb = new StringBuilder(str3.length() + length7 + 7 + length3 + 21 + length4 + 17 + length5 + 16 + length6 + 1);
        sb.append("PhotoMetadata{attributions=");
        sb.append(str2);
        sb.append(", height=");
        sb.append(i);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", photoReference=");
        sb.append(str3);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", name=", str, ", authorAttributions=", valueOf);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", flagContentUri=", valueOf2, ", googleMapsUri=", valueOf3);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeString(this.zzd);
        String str = this.zze;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        parcel.writeParcelable(this.zzf, i);
        parcel.writeParcelable(this.zzg, i);
        parcel.writeParcelable(this.zzh, i);
    }
}
