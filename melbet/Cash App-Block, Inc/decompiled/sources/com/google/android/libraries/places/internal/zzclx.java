package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class zzclx implements zzclp {
    public final zzcmc zza;
    public final zzclo zzb = new zzclo();
    public boolean zzc;

    public zzclx(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcmc
    public final void close() {
        Throwable th;
        zzcmc zzcmcVar = this.zza;
        if (this.zzc) {
            return;
        }
        try {
            zzclo zzcloVar = this.zzb;
            long j = zzcloVar.zzb;
            th = null;
            if (j > 0) {
                zzcmcVar.zzc(zzcloVar, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            zzcmcVar.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.zzc = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcmc, java.io.Flushable
    public final void flush() {
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return;
        }
        zzclo zzcloVar = this.zzb;
        long j = zzcloVar.zzb;
        zzcmc zzcmcVar = this.zza;
        if (j > 0) {
            zzcmcVar.zzc(zzcloVar, j);
        }
        zzcmcVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.zzc;
    }

    public final String toString() {
        zzcmc zzcmcVar = this.zza;
        StringBuilder sb = new StringBuilder(zzcmcVar.toString().length() + 8);
        sb.append("buffer(");
        sb.append(zzcmcVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return 0;
        }
        int write = this.zzb.write(byteBuffer);
        zza();
        return write;
    }

    public final zzclp zzH(String str) {
        str.getClass();
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.zzb.zzw(str.length(), str);
        zza();
        return this;
    }

    public final zzclp zzJ(int i) {
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.zzb.zzA(i);
        zza();
        return this;
    }

    public final zzclp zzL(int i) {
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        zzclo zzcloVar = this.zzb;
        zzclz zzE = zzcloVar.zzE(4);
        byte[] bArr = zzE.zza;
        int i2 = zzE.zzc;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        zzE.zzc = i2 + 4;
        zzcloVar.zzb += 4;
        zza();
        return this;
    }

    public final zzclx zza() {
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        zzclo zzcloVar = this.zzb;
        long zzi = zzcloVar.zzi();
        if (zzi > 0) {
            this.zza.zzc(zzcloVar, zzi);
        }
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcmc
    public final void zzc(zzclo zzcloVar, long j) {
        zzcloVar.getClass();
        if (this.zzc) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
        } else {
            this.zzb.zzc(zzcloVar, j);
            zza();
        }
    }
}
