package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes4.dex */
public final class zzchc implements zzcmc {
    public final zzcfw zzc;
    public final zzchy zzd;
    public zzcll zzh;
    public Socket zzi;
    public boolean zzj;
    public int zzk;
    public int zzl;
    public final Object zza = new Object();
    public final zzclo zzb = new zzclo();
    public boolean zze = false;
    public boolean zzf = false;
    public boolean zzg = false;

    public zzchc(zzcfw zzcfwVar, zzchy zzchyVar) {
        Trace.checkNotNull(zzcfwVar, "executor");
        this.zzc = zzcfwVar;
        this.zzd = zzchyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        this.zzc.execute(new zzmu(this, 16));
    }

    @Override // com.google.android.libraries.places.internal.zzcmc, java.io.Flushable
    public final void flush() {
        if (this.zzg) {
            a$$ExternalSyntheticBUOutline0.m$4("closed");
            return;
        }
        int i = zzclf.$r8$clinit;
        synchronized (this.zza) {
            try {
                if (this.zzf) {
                    return;
                }
                this.zzf = true;
                this.zzc.execute(new zzcgx(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzcll zzcllVar, Socket socket) {
        Trace.checkState("AsyncSink's becomeConnected should only be called once.", this.zzh == null);
        this.zzh = zzcllVar;
        Trace.checkNotNull(socket, "socket");
        this.zzi = socket;
    }

    @Override // com.google.android.libraries.places.internal.zzcmc
    public final void zzc(zzclo zzcloVar, long j) {
        if (this.zzg) {
            a$$ExternalSyntheticBUOutline0.m$4("closed");
            return;
        }
        int i = zzclf.$r8$clinit;
        synchronized (this.zza) {
            try {
                zzclo zzcloVar2 = this.zzb;
                zzcloVar2.zzc(zzcloVar, j);
                int i2 = this.zzl + this.zzk;
                this.zzl = i2;
                this.zzk = 0;
                boolean z = true;
                if (this.zzj || i2 <= 10000) {
                    if (!this.zze && !this.zzf && zzcloVar2.zzi() > 0) {
                        this.zze = true;
                        z = false;
                    }
                    return;
                }
                this.zzj = true;
                if (!z) {
                    this.zzc.execute(new zzcgx(this, 0));
                    return;
                }
                try {
                    this.zzi.close();
                } catch (IOException e) {
                    this.zzd.zzg(e);
                }
            } finally {
            }
        }
    }
}
