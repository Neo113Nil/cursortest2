package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzmv implements Comparable {
    public final long zza;
    public final String zzb;
    public final int zzc;
    public final long zzd;
    public final Object zze;
    public final RuntimeException zzf;

    public zzmv(long j, String str, int i, long j2, Object obj) {
        Trace.checkArgument(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
        this.zzd = j2;
        this.zze = obj;
        if (i != 5) {
            this.zzf = null;
            return;
        }
        if (obj == null) {
            this.zzf = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof zzacr)) {
            this.zzf = null;
        } else {
            this.zzf = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzmv zzmvVar = (zzmv) obj;
        long j = zzmvVar.zza;
        long j2 = this.zza;
        int compare = Long.compare(j2, j);
        if (compare != 0) {
            return compare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.zzb;
        str.getClass();
        String str2 = zzmvVar.zzb;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmv)) {
            return false;
        }
        zzmv zzmvVar = (zzmv) obj;
        return this.zza == zzmvVar.zza && Objects.equals(this.zzb, zzmvVar.zzb);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String str = this.zzb;
        if (str == null) {
            str = Long.toString(this.zza);
        }
        String valueOf = String.valueOf(zzb());
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(String.valueOf(str).length() + 1 + valueOf.length()), str, ":", valueOf);
    }

    public final Object zzb() {
        int i = this.zzc;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.zzd;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.zze;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Impossible, this was validated when parsed or created");
            return null;
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((zzacr) obj).zzm();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.zzf;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }
}
