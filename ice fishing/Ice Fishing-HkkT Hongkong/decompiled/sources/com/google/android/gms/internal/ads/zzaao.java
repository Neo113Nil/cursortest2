package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzaao {
    private final zzaan zza;
    private final zzaaw zzb;
    private boolean zzc;
    private long zzf;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzi = 1.0f;
    private zzel zzj = zzel.zza;

    public zzaao(Context context, zzaan zzaanVar, long j) {
        this.zza = zzaanVar;
        this.zzb = new zzaaw(context);
    }

    private final void zzq(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r17.zza.zzb(r1, r14) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r20 >= r24) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r17.zzc != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(long j, long j2, long j3, long j4, boolean z, zzaam zzaamVar) throws zziz {
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        zzaam.zzg(zzaamVar);
        if (this.zze == -9223372036854775807L) {
            this.zze = j2;
        }
        if (this.zzg != j) {
            this.zzb.zzd(j);
            this.zzg = j;
        }
        long j11 = (long) ((j - j2) / this.zzi);
        if (this.zzc) {
            j11 -= zzfy.zzq(SystemClock.elapsedRealtime()) - j3;
        }
        zzaamVar.zza = j11;
        j5 = zzaamVar.zza;
        if (this.zzh == -9223372036854775807L) {
            int i = this.zzd;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        long zzq = zzfy.zzq(SystemClock.elapsedRealtime()) - this.zzf;
                        if (this.zzc) {
                        }
                    }
                }
                return 0;
            }
        }
        if (!this.zzc || j2 == this.zze) {
            return 5;
        }
        zzaaw zzaawVar = this.zzb;
        long nanoTime = System.nanoTime();
        j6 = zzaamVar.zza;
        zzaamVar.zzb = zzaawVar.zza((j6 * 1000) + nanoTime);
        j7 = zzaamVar.zzb;
        zzaamVar.zza = (j7 - nanoTime) / 1000;
        boolean z2 = this.zzh != -9223372036854775807L;
        zzaan zzaanVar = this.zza;
        j8 = zzaamVar.zza;
        if (zzaanVar.zzc(j8, j2, j3, z, z2)) {
            return 4;
        }
        zzaan zzaanVar2 = this.zza;
        j9 = zzaamVar.zza;
        if (zzaanVar2.zza(j9, j3, z)) {
            return z2 ? 3 : 2;
        }
        j10 = zzaamVar.zza;
        return j10 > 50000 ? 5 : 1;
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc() {
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z) {
        this.zzd = z ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzfy.zzq(SystemClock.elapsedRealtime());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzq(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzj(int i) {
        this.zzb.zzj(i);
    }

    public final void zzk(zzel zzelVar) {
        this.zzj = zzelVar;
    }

    public final void zzl(float f) {
        this.zzb.zzc(f);
    }

    public final void zzm(Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(float f) {
        this.zzi = f;
        this.zzb.zze(f);
    }

    public final boolean zzo(boolean z) {
        if (!z || this.zzd != 3) {
            if (this.zzh == -9223372036854775807L) {
                return false;
            }
            r0 = SystemClock.elapsedRealtime() < this.zzh;
            return r0;
        }
        this.zzh = -9223372036854775807L;
        return r0;
    }

    public final boolean zzp() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzfy.zzq(SystemClock.elapsedRealtime());
        return i != 3;
    }
}
