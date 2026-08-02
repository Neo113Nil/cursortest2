package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzfu implements Parcelable {
    public static final Parcelable.Creator<zzfu> CREATOR = new zzdp(24);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Double zzf;
    public final zzda zzg;
    public final String zzh;
    public final String zzi;
    public final Uri zzj;
    public final zzeq zzk;

    public zzfu(String str, String str2, String str3, String str4, String str5, Double d, zzda zzdaVar, String str6, String str7, Uri uri, zzeq zzeqVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = d;
        if (zzdaVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null authorAttribution");
            throw null;
        }
        this.zzg = zzdaVar;
        if (str6 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null attribution");
            throw null;
        }
        this.zzh = str6;
        this.zzi = str7;
        this.zzj = uri;
        this.zzk = zzeqVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfu) {
            zzfu zzfuVar = (zzfu) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfuVar.zza) : zzfuVar.zza == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfuVar.zzb) : zzfuVar.zzb == null) {
                    String str3 = this.zzc;
                    if (str3 != null ? str3.equals(zzfuVar.zzc) : zzfuVar.zzc == null) {
                        String str4 = this.zzd;
                        if (str4 != null ? str4.equals(zzfuVar.zzd) : zzfuVar.zzd == null) {
                            String str5 = this.zze;
                            if (str5 != null ? str5.equals(zzfuVar.zze) : zzfuVar.zze == null) {
                                if (this.zzf.equals(zzfuVar.zzf) && this.zzg.equals(zzfuVar.zzg) && this.zzh.equals(zzfuVar.zzh)) {
                                    String str6 = zzfuVar.zzi;
                                    String str7 = this.zzi;
                                    if (str7 != null ? str7.equals(str6) : str6 == null) {
                                        Uri uri = zzfuVar.zzj;
                                        Uri uri2 = this.zzj;
                                        if (uri2 != null ? uri2.equals(uri) : uri == null) {
                                            zzeq zzeqVar = zzfuVar.zzk;
                                            zzeq zzeqVar2 = this.zzk;
                                            if (zzeqVar2 != null ? zzeqVar2.equals(zzeqVar) : zzeqVar == null) {
                                                return true;
                                            }
                                        }
                                    }
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
        String str3 = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.zzd;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.zze;
        int hashCode5 = (((((((hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        String str6 = this.zzi;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        Uri uri = this.zzj;
        int hashCode7 = (hashCode6 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        zzeq zzeqVar = this.zzk;
        return hashCode7 ^ (zzeqVar != null ? zzeqVar.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zzg.toString();
        String valueOf = String.valueOf(this.zzj);
        String valueOf2 = String.valueOf(this.zzk);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zze;
        int length5 = String.valueOf(str5).length();
        Double d = this.zzf;
        int length6 = d.toString().length();
        int length7 = obj.length();
        String str6 = this.zzi;
        int length8 = String.valueOf(str6).length();
        int length9 = valueOf.length();
        String str7 = this.zzh;
        StringBuilder sb = new StringBuilder(str7.length() + length + 45 + length2 + 19 + length3 + 15 + length4 + 27 + length5 + 9 + length6 + 20 + length7 + 14 + 14 + length8 + 17 + length9 + 12 + valueOf2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "Review{relativePublishTimeDescription=", str, ", text=", str2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", textLanguageCode=", str3, ", originalText=", str4);
        sb.append(", originalTextLanguageCode=");
        sb.append(str5);
        sb.append(", rating=");
        sb.append(d);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", authorAttribution=", obj, ", attribution=", str7);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", publishTime=", str6, ", flagContentUri=", valueOf);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", visitDate=", valueOf2, "}");
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
        String str3 = this.zzc;
        if (str3 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str3);
        }
        String str4 = this.zzd;
        if (str4 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str4);
        }
        String str5 = this.zze;
        if (str5 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str5);
        }
        parcel.writeDouble(this.zzf.doubleValue());
        parcel.writeParcelable(this.zzg, i);
        parcel.writeString(this.zzh);
        String str6 = this.zzi;
        if (str6 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str6);
        }
        parcel.writeParcelable(this.zzj, i);
        parcel.writeParcelable(this.zzk, i);
    }
}
