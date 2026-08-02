package com.google.android.libraries.places.internal;

import bo.app.re$$ExternalSyntheticOutline0;
import java.io.EOFException;
import java.io.OutputStream;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzcie extends zzbur {
    public final zzclo zza;

    public zzcie(zzclo zzcloVar) {
        this.zza = zzcloVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbur, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzclo zzcloVar = this.zza;
        zzcloVar.zzt(zzcloVar.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final int zzf() {
        return (int) this.zza.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final int zzg() {
        try {
            return this.zza.zzj() & 255;
        } catch (EOFException e) {
            Path$$ExternalSyntheticBUOutline0.m(e.getMessage());
            return 0;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzh(int i) {
        try {
            this.zza.zzt(i);
        } catch (EOFException e) {
            Path$$ExternalSyntheticBUOutline0.m(e.getMessage());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzi(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            int zzs = this.zza.zzs(i, i2, bArr);
            if (zzs == -1) {
                Path$$ExternalSyntheticBUOutline0.m(re$$ExternalSyntheticOutline0.m(i2, "EOF trying to read ", " bytes", new StringBuilder(String.valueOf(i2).length() + 25)));
                return;
            } else {
                i2 -= zzs;
                i += zzs;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzj(OutputStream outputStream, int i) {
        long j = i;
        zzclo zzcloVar = this.zza;
        zzcloVar.getClass();
        outputStream.getClass();
        zzkf.zza(zzcloVar.zzb, 0L, j);
        zzclz zzclzVar = zzcloVar.zza;
        while (j > 0) {
            zzclzVar.getClass();
            int min = (int) Math.min(j, zzclzVar.zzc - zzclzVar.zzb);
            outputStream.write(zzclzVar.zza, zzclzVar.zzb, min);
            int i2 = zzclzVar.zzb + min;
            zzclzVar.zzb = i2;
            long j2 = min;
            zzcloVar.zzb -= j2;
            j -= j2;
            if (i2 == zzclzVar.zzc) {
                zzclz zzb = zzclzVar.zzb();
                zzcloVar.zza = zzb;
                zzcma.zzb(zzclzVar);
                zzclzVar = zzb;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final zzbur zzk(int i) {
        zzclo zzcloVar = new zzclo();
        zzcloVar.zzc(this.zza, i);
        return new zzcie(zzcloVar);
    }
}
