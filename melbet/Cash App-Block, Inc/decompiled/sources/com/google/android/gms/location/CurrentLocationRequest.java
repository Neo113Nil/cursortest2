package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeo;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzac(14);
    public final long zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final boolean zze;
    public final int zzf;
    public final WorkSource zzg;
    public final zze zzh;

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, zze zzeVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j2;
        this.zze = z;
        this.zzf = i3;
        this.zzg = workSource;
        this.zzh = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && this.zzf == currentLocationRequest.zzf && zzae.equal(this.zzg, currentLocationRequest.zzg) && zzae.equal(this.zzh, currentLocationRequest.zzh);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd)});
    }

    public final String toString() {
        String str;
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("CurrentLocationRequest[");
        m.append(zzo.zzb(this.zzc));
        long j = this.zza;
        if (j != Long.MAX_VALUE) {
            m.append(", maxAge=");
            zzeo.zzc(j, m);
        }
        long j2 = this.zzd;
        if (j2 != Long.MAX_VALUE) {
            Boxes$$ExternalSyntheticOutline1.m1151m(j2, ", duration=", "ms", m);
        }
        int i = this.zzb;
        if (i != 0) {
            m.append(", ");
            m.append(zzo.zzb$1(i));
        }
        if (this.zze) {
            m.append(", bypass");
        }
        int i2 = this.zzf;
        if (i2 != 0) {
            m.append(", ");
            if (i2 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i2 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i2 != 2) {
                    Path$$ExternalSyntheticBUOutline0.m$3();
                    return null;
                }
                str = "THROTTLE_NEVER";
            }
            m.append(str);
        }
        WorkSource workSource = this.zzg;
        if (!WorkSourceUtil.isEmpty(workSource)) {
            m.append(", workSource=");
            m.append(workSource);
        }
        zze zzeVar = this.zzh;
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
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 8);
        parcel.writeLong(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze ? 1 : 0);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.zzg, i);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeInt(this.zzf);
        MooncakeHeaderViewKt.writeParcelable(parcel, 9, this.zzh, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
