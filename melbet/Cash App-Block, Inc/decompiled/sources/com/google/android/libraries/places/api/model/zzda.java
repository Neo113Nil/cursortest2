package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.wallet.zzb;

/* loaded from: classes4.dex */
public final class zzda implements Parcelable {
    public static final Parcelable.Creator<zzda> CREATOR = new zzb(23);
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzda(String str, String str2, String str3) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null name");
            throw null;
        }
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zza.equals(zzdaVar.zza)) {
                String str = zzdaVar.zzb;
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = zzdaVar.zzc;
                    String str4 = this.zzc;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzc;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        StringBuilder sb = new StringBuilder(str3.length() + 29 + length + 11 + length2 + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "AuthorAttribution{name=", str3, ", uri=", str);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", photoUri=", str2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        String str = this.zzb;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        String str2 = this.zzc;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
    }
}
