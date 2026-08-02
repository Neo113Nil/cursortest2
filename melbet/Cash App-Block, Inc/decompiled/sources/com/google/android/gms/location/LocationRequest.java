package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ReflectedParcelable;
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
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzac(8);
    public final int zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final int zzf;
    public final float zzg;
    public final boolean zzh;
    public final long zzi;
    public final int zzj;
    public final int zzk;
    public final boolean zzl;
    public final WorkSource zzm;
    public final zze zzn;

    public final class Builder {
        public final int zza;
        public final long zzb;
        public long zzc = -1;
        public long zzd = 0;
        public long zze = Long.MAX_VALUE;
        public int zzf = Integer.MAX_VALUE;
        public float zzg = RecyclerView.DECELERATION_RATE;
        public boolean zzh = true;
        public long zzi = -1;
        public int zzj = 0;
        public int zzk = 0;
        public boolean zzl = false;
        public WorkSource zzm = null;
        public zze zzn = null;

        public Builder(int i, long j) {
            this.zza = 102;
            zzae.checkArgument("intervalMillis must be greater than or equal to 0", j >= 0);
            this.zzb = j;
            zzo.zza(i);
            this.zza = i;
        }

        public final LocationRequest build() {
            long j = this.zzc;
            int i = this.zza;
            long j2 = this.zzb;
            if (j == -1) {
                j = j2;
            } else if (i != 105) {
                j = Math.min(j, j2);
            }
            long max = Math.max(this.zzd, this.zzb);
            long j3 = this.zze;
            int i2 = this.zzf;
            float f = this.zzg;
            boolean z = this.zzh;
            long j4 = this.zzi;
            if (j4 == -1) {
                j4 = this.zzb;
            }
            return new LocationRequest(i, j2, j, max, Long.MAX_VALUE, j3, i2, f, z, j4, this.zzj, this.zzk, this.zzl, new WorkSource(this.zzm), this.zzn);
        }

        public final void setDurationMillis(long j) {
            zzae.checkArgument("durationMillis must be greater than 0", j > 0);
            this.zze = j;
        }

        public final void setGranularity(int i) {
            int i2;
            boolean z = true;
            if (i != 0 && i != 1) {
                i2 = 2;
                if (i != 2) {
                    z = false;
                }
                zzae.checkArgument(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i2));
                this.zzj = i;
            }
            i2 = i;
            zzae.checkArgument(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i2));
            this.zzj = i;
        }

        public final void setMaxUpdateAgeMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            zzae.checkArgument("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z);
            this.zzi = j;
        }

        public final void setMinUpdateIntervalMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            zzae.checkArgument("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", z);
            this.zzc = j;
        }

        public final void zza(int i) {
            int i2;
            boolean z = true;
            if (i != 0 && i != 1) {
                i2 = 2;
                if (i != 2) {
                    z = false;
                }
                zzae.checkArgument(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i2));
                this.zzk = i;
            }
            i2 = i;
            zzae.checkArgument(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i2));
            this.zzk = i;
        }
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, zze zzeVar) {
        this.zza = i;
        if (i == 105) {
            this.zzb = Long.MAX_VALUE;
        } else {
            this.zzb = j;
        }
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.zzf = i2;
        this.zzg = f;
        this.zzh = z;
        this.zzi = j6 != -1 ? j6 : j;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = z2;
        this.zzm = workSource;
        this.zzn = zzeVar;
    }

    public static String zze(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = zzeo.zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzeo.zzc(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = locationRequest.zza;
        int i2 = this.zza;
        if (i2 != i) {
            return false;
        }
        if ((i2 == 105 || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched()) {
            return (!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzl == locationRequest.zzl && this.zzm.equals(locationRequest.zzm) && zzae.equal(this.zzn, locationRequest.zzn);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzm});
    }

    public final boolean isBatched() {
        long j = this.zzd;
        return j > 0 && (j >> 1) >= this.zzb;
    }

    public final String toString() {
        String str;
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("Request[");
        int i = this.zza;
        long j = this.zzb;
        long j2 = this.zzd;
        if (i == 105) {
            m.append(zzo.zzb(i));
            if (j2 > 0) {
                m.append("/");
                zzeo.zzc(j2, m);
            }
        } else {
            m.append("@");
            if (isBatched()) {
                zzeo.zzc(j, m);
                m.append("/");
                zzeo.zzc(j2, m);
            } else {
                zzeo.zzc(j, m);
            }
            m.append(" ");
            m.append(zzo.zzb(i));
        }
        long j3 = this.zzc;
        if (i == 105 || j3 != j) {
            m.append(", minUpdateInterval=");
            m.append(zze(j3));
        }
        float f = this.zzg;
        if (f > 0.0d) {
            m.append(", minUpdateDistance=");
            m.append(f);
        }
        long j4 = this.zzi;
        if (i != 105 ? j4 != j : j4 != Long.MAX_VALUE) {
            m.append(", maxUpdateAge=");
            m.append(zze(j4));
        }
        long j5 = this.zze;
        if (j5 != Long.MAX_VALUE) {
            m.append(", duration=");
            zzeo.zzc(j5, m);
        }
        int i2 = this.zzf;
        if (i2 != Integer.MAX_VALUE) {
            m.append(", maxUpdates=");
            m.append(i2);
        }
        int i3 = this.zzk;
        if (i3 != 0) {
            m.append(", ");
            if (i3 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i3 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i3 != 2) {
                    Path$$ExternalSyntheticBUOutline0.m$3();
                    return null;
                }
                str = "THROTTLE_NEVER";
            }
            m.append(str);
        }
        int i4 = this.zzj;
        if (i4 != 0) {
            m.append(", ");
            m.append(zzo.zzb$1(i4));
        }
        if (this.zzh) {
            m.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            m.append(", bypass");
        }
        WorkSource workSource = this.zzm;
        if (!WorkSourceUtil.isEmpty(workSource)) {
            m.append(", ");
            m.append(workSource);
        }
        zze zzeVar = this.zzn;
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
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 8);
        parcel.writeLong(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 8);
        parcel.writeLong(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zzf);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeFloat(this.zzg);
        MooncakeHeaderViewKt.zza(parcel, 8, 8);
        parcel.writeLong(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeInt(this.zzh ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 10, 8);
        parcel.writeLong(this.zze);
        MooncakeHeaderViewKt.zza(parcel, 11, 8);
        parcel.writeLong(this.zzi);
        MooncakeHeaderViewKt.zza(parcel, 12, 4);
        parcel.writeInt(this.zzj);
        MooncakeHeaderViewKt.zza(parcel, 13, 4);
        parcel.writeInt(this.zzk);
        MooncakeHeaderViewKt.zza(parcel, 15, 4);
        parcel.writeInt(this.zzl ? 1 : 0);
        MooncakeHeaderViewKt.writeParcelable(parcel, 16, this.zzm, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 17, this.zzn, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
