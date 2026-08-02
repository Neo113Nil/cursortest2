package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzdu implements Parcelable {
    public static final Parcelable.Creator<zzdu> CREATOR = new zzdp(2);
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final List zzd;

    public zzdu(String str, String str2, List list, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = list;
        this.zzd = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdu) {
            zzdu zzduVar = (zzdu) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzduVar.zza) : zzduVar.zza == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzduVar.zzb) : zzduVar.zzb == null) {
                    List list = this.zzc;
                    if (list != null ? list.equals(zzduVar.zzc) : zzduVar.zzc == null) {
                        List list2 = this.zzd;
                        if (list2 != null ? list2.equals(zzduVar.zzd) : zzduVar.zzd == null) {
                            return true;
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
        List list = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.zzd;
        return hashCode3 ^ (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 43 + length2 + 31 + valueOf.length() + 21 + valueOf2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "ContentBlock{content=", str, ", contentLanguageCode=", str2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", referencedPlaceResourceNames=", valueOf, ", referencedPlaceIds=", valueOf2);
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
        parcel.writeList(this.zzc);
        parcel.writeList(this.zzd);
    }
}
