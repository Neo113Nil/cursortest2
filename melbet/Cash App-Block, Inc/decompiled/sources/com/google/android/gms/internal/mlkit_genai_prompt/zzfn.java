package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzfn implements IBinder.DeathRecipient, AutoCloseable {
    public static final ComponentName zzd;
    public static final ComponentName zze;
    public final Context zza;
    public final zzku zzf;
    public final Executor zzg;
    public final boolean zzh;
    public final long zzi;
    public final ScheduledExecutorService zzj;
    public final UserManager zzk;
    public final boolean zzl;
    public final Object zzm = new Object();
    public zzfl zzn;
    public ScheduledFuture zzo;

    static {
        ComponentName componentName = new ComponentName("com.google.android.aicore", "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService");
        zzd = componentName;
        zze = new ComponentName(componentName.getPackageName(), "com.google.android.apps.aicore.service.AiCoreService");
    }

    public zzfn(zzcr zzcrVar) {
        zzku zzkxVar;
        Context context = zzcrVar.zza;
        this.zza = context;
        ExecutorService executorService = zzcrVar.zzb;
        if (executorService instanceof zzku) {
            zzkxVar = (zzku) executorService;
        } else {
            zzkxVar = executorService instanceof ScheduledExecutorService ? new zzkx((ScheduledExecutorService) executorService) : new zzku(executorService);
        }
        this.zzf = zzkxVar;
        this.zzg = zzcrVar.zzc;
        this.zzh = true;
        this.zzi = zzcrVar.zze.toMillis();
        this.zzj = zzcrVar.zzf;
        this.zzk = (UserManager) context.getSystemService("user");
        this.zzl = ((Boolean) zzcrVar.zzg.orElse(Boolean.TRUE)).booleanValue();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied(IBinder iBinder) {
        Log.i("zzfn", "Binder died for component: ".concat(String.valueOf(iBinder)));
        zzq();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        zzq();
    }

    public final void zzq() {
        synchronized (this.zzm) {
            try {
                zzfl zzflVar = this.zzn;
                if (zzflVar != null) {
                    zzflVar.zzf();
                    this.zzn = null;
                }
                ScheduledFuture scheduledFuture = this.zzo;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.zzo = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzfl zzu() {
        synchronized (this.zzm) {
            try {
                zzv();
                zzfl zzflVar = this.zzn;
                if (zzflVar != null) {
                    return zzflVar;
                }
                zzfl zzflVar2 = new zzfl(this);
                this.zzn = zzflVar2;
                zzflVar2.zzb();
                return zzflVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzv() {
        long j = this.zzi;
        if (j <= 0) {
            return;
        }
        synchronized (this.zzm) {
            try {
                ScheduledFuture scheduledFuture = this.zzo;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zzo = this.zzj.schedule(new zzek(this, 1), j, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }
}
