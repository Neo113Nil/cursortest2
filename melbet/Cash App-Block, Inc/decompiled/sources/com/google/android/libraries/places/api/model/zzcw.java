package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.wallet.zzb;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzcw implements Parcelable {
    public static final Parcelable.Creator<zzcw> CREATOR = new zzb(21);
    public final List zza;
    public final List zzb;

    public zzcw(List list, List list2) {
        this.zza = list;
        this.zzb = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcw) {
            zzcw zzcwVar = (zzcw) obj;
            List list = this.zza;
            if (list != null ? list.equals(zzcwVar.zza) : zzcwVar.zza == null) {
                List list2 = this.zzb;
                if (list2 != null ? list2.equals(zzcwVar.zzb) : zzcwVar.zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.zza;
        int hashCode = list == null ? 0 : list.hashCode();
        List list2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(valueOf.length() + 36 + valueOf2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "AddressDescriptor{landmarks=", valueOf, ", areas=", valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zza);
        parcel.writeList(this.zzb);
    }
}
