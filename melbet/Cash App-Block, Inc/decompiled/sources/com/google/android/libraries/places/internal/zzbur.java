package com.google.android.libraries.places.internal;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.io.Closeable;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class zzbur implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public boolean zza() {
        return this instanceof zzcdw;
    }

    public void zzb() {
    }

    public void zzc() {
        throw new UnsupportedOperationException();
    }

    public final void zzd(int i) {
        if (zzf() >= i) {
            return;
        }
        JWK$$ExternalSyntheticBUOutline0.m2173m();
    }

    public abstract int zzf();

    public abstract int zzg();

    public abstract void zzh(int i);

    public abstract void zzi(int i, int i2, byte[] bArr);

    public abstract void zzj(OutputStream outputStream, int i);

    public abstract zzbur zzk(int i);
}
