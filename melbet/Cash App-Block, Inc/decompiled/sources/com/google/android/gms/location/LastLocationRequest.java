package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeo;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzac(6);
    public final long zza;
    public final int zzb;
    public final boolean zzc;
    public final zze zzd;

    public LastLocationRequest(long j, int i, boolean z, zze zzeVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
        this.zzd = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && zzae.equal(this.zzd, lastLocationRequest.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc)});
    }

    public final String toString() {
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("LastLocationRequest[");
        long j = this.zza;
        if (j != Long.MAX_VALUE) {
            m.append("maxAge=");
            zzeo.zzc(j, m);
        }
        int i = this.zzb;
        if (i != 0) {
            m.append(", ");
            m.append(zzo.zzb$1(i));
        }
        if (this.zzc) {
            m.append(", bypass");
        }
        zze zzeVar = this.zzd;
        if (zzeVar != null) {
            m.append(", impersonation=");
            m.append(zzeVar);
        }
        m.append(']');
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 8);
        parcel.writeLong(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc ? 1 : 0);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zzd, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
