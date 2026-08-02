package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzei extends zzco {
    public static final Parcelable.Creator<zzei> CREATOR = new zzdp(7);
    public final String zza;
    public final String zzb;
    public final Uri zzc;
    public final String zzd;
    public final String zze;

    public zzei(String str, String str2, Uri uri, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzd = str3;
        this.zze = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzei) {
            zzei zzeiVar = (zzei) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzeiVar.zza) : zzeiVar.zza == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzeiVar.zzb) : zzeiVar.zzb == null) {
                    Uri uri = this.zzc;
                    if (uri != null ? uri.equals(zzeiVar.zzc) : zzeiVar.zzc == null) {
                        String str3 = this.zzd;
                        if (str3 != null ? str3.equals(zzeiVar.zzd) : zzeiVar.zzd == null) {
                            String str4 = this.zze;
                            if (str4 != null ? str4.equals(zzeiVar.zze) : zzeiVar.zze == null) {
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
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int length3 = valueOf.length();
        String str3 = this.zzd;
        int length4 = String.valueOf(str3).length();
        String str4 = this.zze;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 17 + length3 + 17 + length4 + 29 + String.valueOf(str4).length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "GenerativeSummary{overview=", str, ", overviewLanguageCode=", str2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", flagContentUri=", valueOf, ", disclosureText=", str3);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", disclosureTextLanguageCode=", str4, "}");
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
    }
}
