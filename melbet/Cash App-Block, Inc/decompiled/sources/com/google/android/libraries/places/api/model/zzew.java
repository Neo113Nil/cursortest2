package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzew extends zzco {
    public static final Parcelable.Creator<zzew> CREATOR = new zzdp(14);
    public final zzdu zza;
    public final zzdu zzb;
    public final Uri zzc;
    public final String zzd;
    public final String zze;

    public zzew(zzdu zzduVar, zzdu zzduVar2, Uri uri, String str, String str2) {
        this.zza = zzduVar;
        this.zzb = zzduVar2;
        this.zzc = uri;
        this.zzd = str;
        this.zze = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzew) {
            zzew zzewVar = (zzew) obj;
            zzdu zzduVar = this.zza;
            if (zzduVar != null ? zzduVar.equals(zzewVar.zza) : zzewVar.zza == null) {
                zzdu zzduVar2 = this.zzb;
                if (zzduVar2 != null ? zzduVar2.equals(zzewVar.zzb) : zzewVar.zzb == null) {
                    Uri uri = this.zzc;
                    if (uri != null ? uri.equals(zzewVar.zzc) : zzewVar.zzc == null) {
                        String str = this.zzd;
                        if (str != null ? str.equals(zzewVar.zzd) : zzewVar.zzd == null) {
                            String str2 = this.zze;
                            if (str2 != null ? str2.equals(zzewVar.zze) : zzewVar.zze == null) {
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
        zzdu zzduVar = this.zza;
        int hashCode = zzduVar == null ? 0 : zzduVar.hashCode();
        zzdu zzduVar2 = this.zzb;
        int hashCode2 = zzduVar2 == null ? 0 : zzduVar2.hashCode();
        int i = hashCode ^ 1000003;
        Uri uri = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str = this.zzd;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zze;
        return hashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        String str = this.zzd;
        int length4 = String.valueOf(str).length();
        String str2 = this.zze;
        StringBuilder sb = new StringBuilder(length + 43 + length2 + 17 + length3 + 17 + length4 + 29 + String.valueOf(str2).length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "NeighborhoodSummary{overview=", valueOf, ", description=", valueOf2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", flagContentUri=", valueOf3, ", disclosureText=", str);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", disclosureTextLanguageCode=", str2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeParcelable(this.zzc, i);
        String str = this.zzd;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        String str2 = this.zze;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
    }
}
