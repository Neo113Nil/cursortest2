package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import okio.Buffer$inputStream$1;

/* loaded from: classes9.dex */
public final class zzmu implements Closeable {
    public final Inflater zza = new Inflater(true);

    public static zzmu zza() {
        return new zzmu();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.end();
    }

    public final zzmw zzb(byte[] bArr) {
        Inflater inflater = this.zza;
        inflater.setInput(bArr);
        try {
            return zzmw.zzd(zzacv.zzM(new Buffer$inputStream$1(this, 1), 4096));
        } finally {
            inflater.reset();
        }
    }

    public final zzmw zzc(zzacv zzacvVar) {
        Inflater inflater = this.zza;
        int zzF = zzacvVar.zzF();
        try {
            return zzmw.zzd(zzacv.zzM(new InflaterInputStream(new Buffer$inputStream$1(this, zzacvVar), inflater, zzF < 0 ? 4096 : Math.min(zzF, 4096)), 4096));
        } finally {
            inflater.reset();
        }
    }
}
