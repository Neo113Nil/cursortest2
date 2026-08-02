package com.google.android.libraries.places.internal;

import java.net.SocketAddress;

/* loaded from: classes4.dex */
public final class zzbvf implements zzbvw {
    public final zzchl zza;

    public zzbvf(zzchl zzchlVar, zzayv zzayvVar) {
        this.zza = zzchlVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzbvw
    public final zzbwf zza(SocketAddress socketAddress, zzbvv zzbvvVar, zzcag zzcagVar) {
        return new zzbve(this, this.zza.zza(socketAddress, zzbvvVar, zzcagVar), zzbvvVar.zza);
    }
}
