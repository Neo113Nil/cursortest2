package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzaai extends HandlerThread implements Handler.Callback {
    private zzer zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzaak zze;

    public zzaai() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzer zzerVar;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i2 = message.arg1;
                    zzer zzerVar2 = this.zza;
                    if (zzerVar2 == null) {
                        throw null;
                    }
                    zzerVar2.zzb(i2);
                    this.zze = new zzaak(this, this.zza.zza(), i2 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzet e) {
                    zzff.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.zzd = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    zzff.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.zzc = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    zzff.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzd = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    zzerVar = this.zza;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (zzerVar == null) {
                    throw null;
                }
                zzerVar.zzc();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzaak zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzer(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzaak zzaakVar = this.zze;
        zzaakVar.getClass();
        return zzaakVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
