package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.http1.HeadersReader;

/* loaded from: classes4.dex */
public final class zzchl implements zzbvw {
    public final Executor zza;
    public final ScheduledExecutorService zzb;
    public final zzcar zzc;
    public final SSLSocketFactory zzd;
    public final zzciq zze;
    public final zzfv zzf;
    public final zzfv zzg;
    public final zzbuy zzh = new zzbuy();
    public boolean zzi;

    public /* synthetic */ zzchl(zzfv zzfvVar, zzfv zzfvVar2, SSLSocketFactory sSLSocketFactory, zzciq zzciqVar, zzcar zzcarVar) {
        this.zzf = zzfvVar;
        this.zza = (Executor) zzfvVar.zza();
        this.zzg = zzfvVar2;
        this.zzb = (ScheduledExecutorService) zzfvVar2.zza();
        this.zzd = sSLSocketFactory;
        this.zze = zzciqVar;
        Trace.checkNotNull(zzcarVar, "transportTracerFactory");
        this.zzc = zzcarVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzi) {
            return;
        }
        this.zzi = true;
        this.zzf.zzb(this.zza);
        this.zzg.zzb(this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbvw
    public final zzbwf zza(SocketAddress socketAddress, zzbvv zzbvvVar, zzcag zzcagVar) {
        if (this.zzi) {
            a$$ExternalSyntheticBUOutline0.m$1("The transport factory is closed.");
            return null;
        }
        zzbuy zzbuyVar = this.zzh;
        return new zzchy(this, (InetSocketAddress) socketAddress, zzbvvVar.zza, zzbvvVar.zzc, zzbvvVar.zzb, zzbvvVar.zzd, new zzmu(this, new HeadersReader(zzbuyVar, zzbuyVar.zzc.get())));
    }
}
