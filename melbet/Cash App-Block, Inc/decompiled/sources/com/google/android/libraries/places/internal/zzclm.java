package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class zzclm implements zzcme {
    public final /* synthetic */ zzclt zza;

    public zzclm(zzclt zzcltVar) {
        this.zza = zzcltVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zza.close();
        } catch (IOException e) {
            throw e;
        } finally {
            zzcmd.zza();
        }
    }

    public final String toString() {
        zzclt zzcltVar = this.zza;
        StringBuilder sb = new StringBuilder(zzcltVar.toString().length() + 21);
        sb.append("AsyncTimeout.source(");
        sb.append(zzcltVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcme
    public final long zza(zzclo zzcloVar, long j) {
        try {
            return this.zza.zza(zzcloVar, j);
        } catch (IOException e) {
            throw e;
        } finally {
            zzcmd.zza();
        }
    }
}
