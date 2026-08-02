package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.base.zao;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzq {
    public static HandlerThread zza = null;
    public static final Object zzb$1 = new Object();
    public static zzq zzd$1 = null;
    public static boolean zzf$1 = false;
    public final HashMap zzb = new HashMap();
    public final Context zzc;
    public volatile zao zzd;
    public final ConnectionTracker zzf;
    public final long zzg;
    public final long zzh;

    public zzq(Context context, Looper looper) {
        zzp zzpVar = new zzp(this);
        this.zzc = context.getApplicationContext();
        zao zaoVar = new zao(looper, zzpVar);
        Looper.getMainLooper();
        this.zzd = zaoVar;
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
    }

    public static zzq getInstance(Context context) {
        synchronized (zzb$1) {
            try {
                if (zzd$1 == null) {
                    if (!zzf$1) {
                        context.getPackageName();
                        zzf$1 = true;
                    }
                    zzd$1 = new zzq(context.getApplicationContext(), zzf$1 ? getOrStartHandlerThread().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzd$1;
    }

    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb$1) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return zza;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ConnectionResult zza(zzn zznVar, zze zzeVar, String str, Executor executor) {
        ConnectionResult connectionResult;
        HashMap hashMap = this.zzb;
        synchronized (hashMap) {
            try {
                zzo zzoVar = (zzo) hashMap.get(zznVar);
                if (executor == null) {
                    executor = null;
                }
                if (zzoVar == null) {
                    zzoVar = new zzo(this, zznVar);
                    zzoVar.zzb(zzeVar, zzeVar);
                    connectionResult = zzoVar.zzj(str, executor);
                    hashMap.put(zznVar, zzoVar);
                } else {
                    this.zzd.removeMessages(0, zznVar);
                    if (zzoVar.zzf(zzeVar)) {
                        String zznVar2 = zznVar.toString();
                        StringBuilder sb = new StringBuilder(zznVar2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(zznVar2);
                        throw new IllegalStateException(sb.toString());
                    }
                    zzoVar.zzb(zzeVar, zzeVar);
                    int zze = zzoVar.zze();
                    if (zze == 1) {
                        zzeVar.onServiceConnected(zzoVar.zzi(), zzoVar.zzh());
                    } else if (zze == 2) {
                        connectionResult = zzoVar.zzj(str, executor);
                    }
                    connectionResult = null;
                }
                if (zzoVar.zzd()) {
                    return ConnectionResult.RESULT_SUCCESS;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1, null, null);
                }
                return connectionResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzn zznVar, ServiceConnection serviceConnection) {
        zzae.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.zzb;
        synchronized (hashMap) {
            try {
                zzo zzoVar = (zzo) hashMap.get(zznVar);
                if (zzoVar == null) {
                    String zznVar2 = zznVar.toString();
                    StringBuilder sb = new StringBuilder(zznVar2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(zznVar2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!zzoVar.zzf(serviceConnection)) {
                    String zznVar3 = zznVar.toString();
                    StringBuilder sb2 = new StringBuilder(zznVar3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(zznVar3);
                    throw new IllegalStateException(sb2.toString());
                }
                zzoVar.zzc(serviceConnection);
                if (zzoVar.zzg()) {
                    this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zznVar), this.zzg);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
