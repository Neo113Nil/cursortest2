package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzgc implements Parcelable {
    public static final Parcelable.Creator<zzgc> CREATOR = new zzdp(26);
    public final List zza;
    public final Uri zzb;

    public zzgc(Uri uri, List list) {
        if (list == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null legs");
            throw null;
        }
        this.zza = list;
        this.zzb = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgc) {
            zzgc zzgcVar = (zzgc) obj;
            if (this.zza.equals(zzgcVar.zza)) {
                Uri uri = zzgcVar.zzb;
                Uri uri2 = this.zzb;
                if (uri2 != null ? uri2.equals(uri) : uri == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        Uri uri = this.zzb;
        return (uri == null ? 0 : uri.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 36 + valueOf.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "RoutingSummary{legs=", obj, ", directionsUri=", valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zza);
        parcel.writeParcelable(this.zzb, i);
    }
}
