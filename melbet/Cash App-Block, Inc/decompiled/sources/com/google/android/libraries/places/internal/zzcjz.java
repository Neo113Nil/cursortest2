package com.google.android.libraries.places.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class zzcjz extends InputStream implements zzbrg {
    public zzbhz zza;
    public final zzblh zzb;
    public ByteArrayInputStream zzc;

    public zzcjz(zzbhz zzbhzVar, zzblh zzblhVar) {
        this.zza = zzbhzVar;
        this.zzb = zzblhVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        zzbhz zzbhzVar = this.zza;
        if (zzbhzVar != null) {
            return ((zzbjr) zzbhzVar).zzbD();
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        zzbhz zzbhzVar = this.zza;
        if (zzbhzVar != null) {
            int zzbD = ((zzbjr) zzbhzVar).zzbD();
            if (zzbD == 0) {
                this.zza = null;
                this.zzc = null;
                return -1;
            }
            if (i2 >= zzbD) {
                boolean z = zzbiv.zzc;
                zzbis zzbisVar = new zzbis(bArr, i, zzbD);
                ((zzbjr) this.zza).zzbR(zzbisVar);
                zzbisVar.zzJ();
                this.zza = null;
                this.zzc = null;
                return zzbD;
            }
            this.zzc = new ByteArrayInputStream(this.zza.zzbr());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        zzbhz zzbhzVar = this.zza;
        if (zzbhzVar != null) {
            this.zzc = new ByteArrayInputStream(zzbhzVar.zzbr());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
