package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzek implements Parcelable {
    public static final Parcelable.Creator<zzek> CREATOR = new zzdp(8);
    public final Uri zza;
    public final Uri zzb;
    public final Uri zzc;
    public final Uri zzd;
    public final Uri zze;

    public zzek(Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5) {
        this.zza = uri;
        this.zzb = uri2;
        this.zzc = uri3;
        this.zzd = uri4;
        this.zze = uri5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            Uri uri = this.zza;
            if (uri != null ? uri.equals(zzekVar.zza) : zzekVar.zza == null) {
                Uri uri2 = this.zzb;
                if (uri2 != null ? uri2.equals(zzekVar.zzb) : zzekVar.zzb == null) {
                    Uri uri3 = this.zzc;
                    if (uri3 != null ? uri3.equals(zzekVar.zzc) : zzekVar.zzc == null) {
                        Uri uri4 = this.zzd;
                        if (uri4 != null ? uri4.equals(zzekVar.zzd) : zzekVar.zzd == null) {
                            Uri uri5 = this.zze;
                            if (uri5 != null ? uri5.equals(zzekVar.zze) : zzekVar.zze == null) {
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
        Uri uri = this.zza;
        int hashCode = uri == null ? 0 : uri.hashCode();
        Uri uri2 = this.zzb;
        int hashCode2 = uri2 == null ? 0 : uri2.hashCode();
        int i = hashCode ^ 1000003;
        Uri uri3 = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (uri3 == null ? 0 : uri3.hashCode())) * 1000003;
        Uri uri4 = this.zzd;
        int hashCode4 = (hashCode3 ^ (uri4 == null ? 0 : uri4.hashCode())) * 1000003;
        Uri uri5 = this.zze;
        return hashCode4 ^ (uri5 != null ? uri5.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String valueOf4 = String.valueOf(this.zzd);
        String valueOf5 = String.valueOf(this.zze);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 18 + length3 + 13 + valueOf4.length() + 12 + valueOf5.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "GoogleMapsLinks{directionsUri=", valueOf, ", placeUri=", valueOf2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", writeAReviewUri=", valueOf3, ", reviewsUri=", valueOf4);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", photosUri=", valueOf5, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeParcelable(this.zzc, i);
        parcel.writeParcelable(this.zzd, i);
        parcel.writeParcelable(this.zze, i);
    }
}
