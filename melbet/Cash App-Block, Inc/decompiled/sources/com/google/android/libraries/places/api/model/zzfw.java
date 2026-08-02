package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzfw extends zzco {
    public static final Parcelable.Creator<zzfw> CREATOR = new zzdp(25);
    public final String zza;
    public final String zzb;
    public final Uri zzc;
    public final String zzd;
    public final String zze;
    public final Uri zzf;

    public zzfw(String str, String str2, Uri uri, String str3, String str4, Uri uri2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfw) {
            zzfw zzfwVar = (zzfw) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfwVar.zza) : zzfwVar.zza == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfwVar.zzb) : zzfwVar.zzb == null) {
                    Uri uri = this.zzc;
                    if (uri != null ? uri.equals(zzfwVar.zzc) : zzfwVar.zzc == null) {
                        String str3 = this.zzd;
                        if (str3 != null ? str3.equals(zzfwVar.zzd) : zzfwVar.zzd == null) {
                            String str4 = this.zze;
                            if (str4 != null ? str4.equals(zzfwVar.zze) : zzfwVar.zze == null) {
                                Uri uri2 = this.zzf;
                                if (uri2 != null ? uri2.equals(zzfwVar.zzf) : zzfwVar.zzf == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        Uri uri = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str3 = this.zzd;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.zze;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Uri uri2 = this.zzf;
        return hashCode5 ^ (uri2 != null ? uri2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzf);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int length3 = valueOf.length();
        String str3 = this.zzd;
        int length4 = String.valueOf(str3).length();
        String str4 = this.zze;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 17 + length3 + 17 + length4 + 29 + String.valueOf(str4).length() + 13 + valueOf2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "ReviewSummary{text=", str, ", textLanguageCode=", str2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", flagContentUri=", valueOf, ", disclosureText=", str3);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", disclosureTextLanguageCode=", str4, ", reviewsUri=", valueOf2);
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
        parcel.writeParcelable(this.zzc, i);
        String str3 = this.zzd;
        if (str3 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str3);
        }
        String str4 = this.zze;
        if (str4 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str4);
        }
        parcel.writeParcelable(this.zzf, i);
    }
}
