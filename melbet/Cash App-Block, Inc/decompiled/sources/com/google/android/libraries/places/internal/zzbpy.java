package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbpy implements Comparable {
    public static final zzbpw zzb = new zzbpw();
    public static final long zzc = 3153600000000000000L;
    public static final long zzd = -3153600000000000000L;
    public static final long zze = 1000000000;
    public final zzbpx zzf;
    public final long zzg;
    public volatile boolean zzh;

    public zzbpy(zzbpx zzbpxVar, long j, long j2) {
        this.zzf = zzbpxVar;
        long min = Math.min(zzc, Math.max(zzd, j2));
        this.zzg = j + min;
        this.zzh = min <= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbpy)) {
            return false;
        }
        zzbpy zzbpyVar = (zzbpy) obj;
        return this.zzf == zzbpyVar.zzf && this.zzg == zzbpyVar.zzg;
    }

    public final int hashCode() {
        return Objects.hash(this.zzf, Long.valueOf(this.zzg));
    }

    public final String toString() {
        long zzc2 = zzc();
        long abs = Math.abs(zzc2);
        long j = zze;
        long j2 = abs / j;
        long abs2 = Math.abs(zzc2) % j;
        StringBuilder sb = new StringBuilder();
        if (zzc2 < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        zzbpw zzbpwVar = zzb;
        zzbpx zzbpxVar = this.zzf;
        if (zzbpxVar != zzbpwVar) {
            String obj = zzbpxVar.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 10);
            sb2.append(" (ticker=");
            sb2.append(obj);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public final long zzc() {
        long nanoTime = System.nanoTime();
        if (!this.zzh && this.zzg - nanoTime <= 0) {
            this.zzh = true;
        }
        return this.zzg - nanoTime;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbpy zzbpyVar) {
        zzbpx zzbpxVar = zzbpyVar.zzf;
        zzbpx zzbpxVar2 = this.zzf;
        if (zzbpxVar2 == zzbpxVar) {
            return Long.compare(this.zzg, zzbpyVar.zzg);
        }
        String obj = zzbpxVar2.toString();
        String obj2 = zzbpxVar.toString();
        StringBuilder sb = new StringBuilder(obj2.length() + obj.length() + 14 + 58);
        Boxes$$ExternalSyntheticOutline1.m(sb, "Tickers (", obj, " and ", obj2);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }
}
