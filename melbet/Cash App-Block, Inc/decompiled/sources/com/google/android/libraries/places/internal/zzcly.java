package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzcly implements ReadableByteChannel, zzcme {
    public final zzcme zza;
    public final zzclo zzb = new zzclo();
    public boolean zzc;

    public zzcly(zzcme zzcmeVar) {
        this.zza = zzcmeVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        this.zza.close();
        zzclo zzcloVar = this.zzb;
        zzcloVar.zzt(zzcloVar.zzb);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.zzc;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        zzclo zzcloVar = this.zzb;
        if (zzcloVar.zzb == 0 && this.zza.zza(zzcloVar, 8192L) == -1) {
            return -1;
        }
        return zzcloVar.read(byteBuffer);
    }

    public final String toString() {
        zzcme zzcmeVar = this.zza;
        StringBuilder sb = new StringBuilder(zzcmeVar.toString().length() + 8);
        sb.append("buffer(");
        sb.append(zzcmeVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcme
    public final long zza(zzclo zzcloVar, long j) {
        if (j < 0) {
            TransportImpl$$ExternalSyntheticLambda0.m(j, "byteCount < 0: ", String.valueOf(j).length() + 15);
            return 0L;
        }
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return 0L;
        }
        zzclo zzcloVar2 = this.zzb;
        if (zzcloVar2.zzb == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.zza.zza(zzcloVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return zzcloVar2.zza(zzcloVar, Math.min(j, zzcloVar2.zzb));
    }

    public final void zzg(long j) {
        zzclo zzcloVar;
        if (j < 0) {
            TransportImpl$$ExternalSyntheticLambda0.m(j, "byteCount < 0: ", String.valueOf(j).length() + 15);
            return;
        }
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return;
        }
        do {
            zzcloVar = this.zzb;
            if (zzcloVar.zzb >= j) {
                return;
            }
        } while (this.zza.zza(zzcloVar, 8192L) != -1);
        Path$$ExternalSyntheticBUOutline0.m$1();
    }

    public final byte zzj() {
        zzg(1L);
        return this.zzb.zzj();
    }

    public final int zzm() {
        zzg(4L);
        zzclo zzcloVar = this.zzb;
        if (zzcloVar.zzb < 4) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0;
        }
        zzclz zzclzVar = zzcloVar.zza;
        zzclzVar.getClass();
        int i = zzclzVar.zzb;
        int i2 = zzclzVar.zzc;
        if (i2 - i < 4) {
            return (zzcloVar.zzj() & 255) | ((zzcloVar.zzj() & 255) << 24) | ((zzcloVar.zzj() & 255) << 16) | ((zzcloVar.zzj() & 255) << 8);
        }
        byte[] bArr = zzclzVar.zza;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        zzcloVar.zzb -= 4;
        int i6 = (bArr[i + 3] & 255) | i4 | i3 | i5;
        int i7 = i + 4;
        if (i7 == i2) {
            zzcloVar.zza = zzclzVar.zzb();
            zzcma.zzb(zzclzVar);
        } else {
            zzclzVar.zzb = i7;
        }
        return i6;
    }

    public final zzcls zzn(long j) {
        zzg(j);
        return this.zzb.zzn(j);
    }

    public final void zzt(long j) {
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return;
        }
        while (j > 0) {
            zzclo zzcloVar = this.zzb;
            if (zzcloVar.zzb == 0 && this.zza.zza(zzcloVar, 8192L) == -1) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return;
            } else {
                long min = Math.min(j, zzcloVar.zzb);
                zzcloVar.zzt(min);
                j -= min;
            }
        }
    }
}
