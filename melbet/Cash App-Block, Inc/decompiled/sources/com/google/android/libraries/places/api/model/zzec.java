package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzec extends zzco {
    public static final Parcelable.Creator<zzec> CREATOR = new zzdp(4);
    public final zzdu zza;
    public final zzdu zzb;
    public final zzdu zzc;
    public final zzdu zzd;
    public final Uri zze;
    public final String zzf;
    public final String zzg;

    public zzec(zzdu zzduVar, zzdu zzduVar2, zzdu zzduVar3, zzdu zzduVar4, Uri uri, String str, String str2) {
        if (zzduVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null overview");
            throw null;
        }
        this.zza = zzduVar;
        this.zzb = zzduVar2;
        this.zzc = zzduVar3;
        this.zzd = zzduVar4;
        this.zze = uri;
        this.zzf = str;
        this.zzg = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzec) {
            zzec zzecVar = (zzec) obj;
            if (this.zza.equals(zzecVar.zza)) {
                zzdu zzduVar = zzecVar.zzb;
                zzdu zzduVar2 = this.zzb;
                if (zzduVar2 != null ? zzduVar2.equals(zzduVar) : zzduVar == null) {
                    zzdu zzduVar3 = zzecVar.zzc;
                    zzdu zzduVar4 = this.zzc;
                    if (zzduVar4 != null ? zzduVar4.equals(zzduVar3) : zzduVar3 == null) {
                        zzdu zzduVar5 = zzecVar.zzd;
                        zzdu zzduVar6 = this.zzd;
                        if (zzduVar6 != null ? zzduVar6.equals(zzduVar5) : zzduVar5 == null) {
                            Uri uri = zzecVar.zze;
                            Uri uri2 = this.zze;
                            if (uri2 != null ? uri2.equals(uri) : uri == null) {
                                String str = zzecVar.zzf;
                                String str2 = this.zzf;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    String str3 = zzecVar.zzg;
                                    String str4 = this.zzg;
                                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                                        return true;
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
        int hashCode = this.zza.hashCode() ^ 1000003;
        zzdu zzduVar = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (zzduVar == null ? 0 : zzduVar.hashCode())) * 1000003;
        zzdu zzduVar2 = this.zzc;
        int hashCode3 = (hashCode2 ^ (zzduVar2 == null ? 0 : zzduVar2.hashCode())) * 1000003;
        zzdu zzduVar3 = this.zzd;
        int hashCode4 = (hashCode3 ^ (zzduVar3 == null ? 0 : zzduVar3.hashCode())) * 1000003;
        Uri uri = this.zze;
        int hashCode5 = (hashCode4 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str = this.zzf;
        int hashCode6 = (hashCode5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzg;
        return hashCode6 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String valueOf4 = String.valueOf(this.zze);
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        int length5 = valueOf4.length();
        String str = this.zzf;
        int length6 = String.valueOf(str).length();
        String str2 = this.zzg;
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 13 + length3 + 8 + length4 + 17 + length5 + 17 + length6 + 29 + String.valueOf(str2).length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "EvChargeAmenitySummary{overview=", obj, ", coffee=", valueOf);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", restaurant=", valueOf2, ", store=", valueOf3);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", flagContentUri=", valueOf4, ", disclosureText=", str);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", disclosureTextLanguageCode=", str2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeParcelable(this.zzc, i);
        parcel.writeParcelable(this.zzd, i);
        parcel.writeParcelable(this.zze, i);
        String str = this.zzf;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        String str2 = this.zzg;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
    }
}
