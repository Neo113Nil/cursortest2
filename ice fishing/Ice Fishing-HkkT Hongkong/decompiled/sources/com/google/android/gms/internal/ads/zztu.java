package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zztu implements zzvi {
    private final zzadb zza;
    private zzacu zzb;
    private zzacv zzc;

    public zztu(zzadb zzadbVar) {
        this.zza = zzadbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final long zzb() {
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            return zzacvVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzc() {
        zzacu zzacuVar = this.zzb;
        if (zzacuVar != null && (zzacuVar instanceof zzaig)) {
            ((zzaig) zzacuVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x004b, code lost:
    
        if (r6.zzf() != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006d, code lost:
    
        if (r6.zzf() != r11) goto L38;
     */
    @Override // com.google.android.gms.internal.ads.zzvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzu zzuVar, Uri uri, Map map, long j, long j2, zzacx zzacxVar) throws IOException {
        zzack zzackVar = new zzack(zzuVar, j, j2);
        this.zzc = zzackVar;
        if (this.zzb != null) {
            return;
        }
        zzacu[] zza = this.zza.zza(uri, map);
        int length = zza.length;
        int i = 0;
        boolean z = true;
        if (length == 1) {
            this.zzb = zza[0];
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                zzacu zzacuVar = zza[i2];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzek.zzf(this.zzb != null || zzackVar.zzf() == j);
                    zzackVar.zzj();
                    throw th;
                }
                if (zzacuVar.zze(zzackVar)) {
                    this.zzb = zzacuVar;
                    if (zzacuVar == null && zzackVar.zzf() != j) {
                        z = false;
                    }
                    zzek.zzf(z);
                    zzackVar.zzj();
                } else {
                    if (this.zzb == null) {
                    }
                    boolean z2 = true;
                    zzek.zzf(z2);
                    zzackVar.zzj();
                    i2++;
                }
            }
            if (this.zzb == null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int length2 = zza.length;
                    if (i >= length2) {
                        throw new zzwt("None of the available extractors (" + sb.toString() + ") could read the stream.", uri);
                    }
                    sb.append(zza[i].getClass().getSimpleName());
                    if (i < length2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
        }
        this.zzb.zzc(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final int zza(zzadr zzadrVar) throws IOException {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacv zzacvVar = this.zzc;
        zzacvVar.getClass();
        return zzacuVar.zzb(zzacvVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzf(long j, long j2) {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacuVar.zzd(j, j2);
    }
}
