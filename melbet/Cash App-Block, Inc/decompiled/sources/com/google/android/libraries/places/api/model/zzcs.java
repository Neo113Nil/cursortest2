package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.wallet.zzb;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzcs implements Parcelable {
    public static final Parcelable.Creator<zzcs> CREATOR = new zzb(19);
    public final String zza;
    public final String zzb;
    public final List zzc;

    public zzcs(String str, String str2, List list) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null name");
            throw null;
        }
        this.zza = str;
        this.zzb = str2;
        if (list != null) {
            this.zzc = list;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null types");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcs) {
            zzcs zzcsVar = (zzcs) obj;
            if (this.zza.equals(zzcsVar.zza)) {
                String str = zzcsVar.zzb;
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.zzc.equals(zzcsVar.zzc)) {
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
        return this.zzc.hashCode() ^ (((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public final String toString() {
        String obj = this.zzc.toString();
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = obj.length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(str2.length() + 34 + length + 8 + length2 + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "AddressComponent{name=", str2, ", shortName=", str);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", types=", obj, "}");
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
        parcel.writeList(this.zzc);
    }
}
