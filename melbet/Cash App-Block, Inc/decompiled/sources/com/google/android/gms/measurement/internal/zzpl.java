package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;

/* loaded from: classes4.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new zab(2);
    public final int zza;
    public final String zzb;
    public final long zzc;
    public final Long zzd;
    public final String zze;
    public final String zzf;
    public final Double zzg;

    public zzpl(long j, Object obj, String str, String str2) {
        zzae.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                a$$ExternalSyntheticBUOutline0.m$3("User attribute given of un-supported type");
                throw null;
            }
            this.zzd = null;
            this.zzg = (Double) obj;
            this.zze = null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zab.zza(this, parcel);
    }

    public final Object zza() {
        Long l = this.zzd;
        if (l != null) {
            return l;
        }
        Double d = this.zzg;
        if (d != null) {
            return d;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.zza = i;
        this.zzb = str;
        this.zzc = j;
        this.zzd = l;
        this.zzg = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.zze = str2;
        this.zzf = str3;
    }

    public zzpl(zzpn zzpnVar) {
        this(zzpnVar.zzd, zzpnVar.zze, zzpnVar.zzc, zzpnVar.zzb);
    }
}
