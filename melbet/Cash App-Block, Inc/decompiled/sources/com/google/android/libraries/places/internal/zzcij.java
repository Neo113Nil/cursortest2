package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.cloudmessaging.zzv;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzcij {
    public final /* synthetic */ zzv zza;
    public final zzclo zzb;
    public final int zzc;
    public int zzd;
    public int zze;
    public final zzcho zzf;
    public boolean zzg;

    public zzcij(zzv zzvVar, int i, int i2, zzcho zzchoVar) {
        Objects.requireNonNull(zzvVar);
        this.zza = zzvVar;
        this.zzb = new zzclo();
        this.zzg = false;
        this.zzc = i;
        this.zzd = i2;
        this.zzf = zzchoVar;
    }

    public final int zzf(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.zzd) {
            int i2 = this.zzd + i;
            this.zzd = i2;
            return i2;
        }
        int i3 = this.zzc;
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i3, "Window size overflow for stream: ", new StringBuilder(String.valueOf(i3).length() + 33)));
        return 0;
    }

    public final void zzi(int i, zzcil zzcilVar) {
        int i2 = this.zzd;
        zzv zzvVar = this.zza;
        int min = Math.min(i, Math.min(i2, ((zzcij) zzvVar.zzd).zzd));
        int i3 = 0;
        while (true) {
            zzclo zzcloVar = this.zzb;
            long j = zzcloVar.zzb;
            if (j <= 0 || min <= 0) {
                return;
            }
            if (min >= j) {
                int i4 = (int) j;
                i3 += i4;
                zzj(i4, zzcloVar, this.zzg);
            } else {
                i3 += min;
                zzj(min, zzcloVar, false);
            }
            zzcilVar.zza++;
            min = Math.min(i - i3, Math.min(this.zzd, ((zzcij) zzvVar.zzd).zzd));
        }
    }

    public final void zzj(int i, zzclo zzcloVar, boolean z) {
        while (true) {
            zzv zzvVar = this.zza;
            int min = Math.min(i, ((zzcjp) ((zzche) zzvVar.zzc).zzc.zza$1).zzd);
            int i2 = -min;
            ((zzcij) zzvVar.zzd).zzf(i2);
            zzf(i2);
            try {
                boolean z2 = true;
                boolean z3 = zzcloVar.zzb == ((long) min) && z;
                zzche zzcheVar = (zzche) zzvVar.zzc;
                int i3 = this.zzc;
                zzclo zzcloVar2 = zzcloVar;
                zzcheVar.zzd.zza(2, i3, zzcloVar2, min, z3);
                try {
                    zzcheVar.zzc.zzh(z3, i3, zzcloVar2, min);
                } catch (IOException e) {
                    zzcheVar.zzb.zzg(e);
                }
                zzcho zzchoVar = this.zzf;
                synchronized (zzchoVar.zzs) {
                    Trace.checkState("onStreamAllocated was not called, but it seems the stream is active", zzchoVar.zzw);
                    int i4 = zzchoVar.zzv;
                    int i5 = zzchoVar.zzy;
                    int i6 = i4 - min;
                    zzchoVar.zzv = i6;
                    if (i4 < i5 || i6 >= i5) {
                        z2 = false;
                    }
                }
                if (z2) {
                    zzchoVar.zzc();
                }
                i -= min;
                if (i <= 0) {
                    return;
                } else {
                    zzcloVar = zzcloVar2;
                }
            } catch (IOException e2) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
                return;
            }
        }
    }
}
