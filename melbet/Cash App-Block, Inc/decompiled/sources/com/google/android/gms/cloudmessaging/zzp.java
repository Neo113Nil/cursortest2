package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.bugsnag.android.Client;
import com.google.android.filament.Box;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.base.zao;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzp implements ServiceConnection {
    public int zza = 0;
    public final Messenger zzb;
    public Box zzc;
    public final ArrayDeque zzd;
    public final SparseArray zze;
    public final /* synthetic */ zzv zzf;

    public zzp(zzv zzvVar) {
        this.zzf = zzvVar;
        zao zaoVar = new zao(Looper.getMainLooper(), new zzm(this, 0));
        Looper.getMainLooper();
        this.zzb = new Messenger(zaoVar);
        this.zzd = new ArrayDeque();
        this.zze = new SparseArray();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.zzf.zzc).execute(new Client.AnonymousClass4(17, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.zzf.zzc).execute(new zzj(this, i));
    }

    public final synchronized void zza(String str) {
        zzb(str, null);
    }

    public final synchronized void zzb(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.zza;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.zza = 4;
            ConnectionTracker.getInstance().unbindService((Context) this.zzf.zzb, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((zzr) it.next()).zzc(zztVar);
            }
            this.zzd.clear();
            int i2 = 0;
            while (true) {
                int size = this.zze.size();
                SparseArray sparseArray = this.zze;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((zzr) sparseArray.valueAt(i2)).zzc(zztVar);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzf() {
        try {
            if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.zza = 3;
                ConnectionTracker.getInstance().unbindService((Context) this.zzf.zzb, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean zzg(zzr zzrVar) {
        int i = this.zza;
        Object[] objArr = 0;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                this.zzd.add(zzrVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.zzd.add(zzrVar);
            ((ScheduledExecutorService) this.zzf.zzc).execute(new zzj(this, objArr == true ? 1 : 0));
            return true;
        }
        this.zzd.add(zzrVar);
        com.google.android.gms.common.internal.zzae.checkState(this.zza == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService((Context) this.zzf.zzb, intent, this, 1)) {
                ((ScheduledExecutorService) this.zzf.zzc).schedule(new zzj(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                zza("Unable to bind to service");
            }
        } catch (SecurityException e) {
            zzb("Unable to bind to service", e);
        }
        return true;
    }
}
