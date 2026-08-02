package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.zzm;
import com.google.android.play.core.review.internal.zzk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzx {
    public static final HashMap zza = new HashMap();
    public final Context zzb;
    public final Obfuscator zzc;
    public boolean zzh;
    public final Intent zzi;
    public com.google.android.play.core.review.internal.zzr zzm;
    public zzf zzn;
    public final ArrayList zze = new ArrayList();
    public final HashSet zzf = new HashSet();
    public final Object zzg = new Object();
    public final zzk zzk = new zzk(this, 1);
    public final AtomicInteger zzl = new AtomicInteger(0);
    public final String zzd = "AppUpdateService";
    public final WeakReference zzj = new WeakReference(null);

    public zzx(Context context, Obfuscator obfuscator, Intent intent) {
        this.zzb = context;
        this.zzc = obfuscator;
        this.zzi = intent;
    }

    public static void zzp(zzx zzxVar, zzm zzmVar) {
        zzf zzfVar = zzxVar.zzn;
        Obfuscator obfuscator = zzxVar.zzc;
        ArrayList arrayList = zzxVar.zze;
        if (zzfVar != null || zzxVar.zzh) {
            if (!zzxVar.zzh) {
                zzmVar.run();
                return;
            } else {
                obfuscator.zzd("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zzmVar);
                return;
            }
        }
        obfuscator.zzd("Initiate binding to the service.", new Object[0]);
        arrayList.add(zzmVar);
        com.google.android.play.core.review.internal.zzr zzrVar = new com.google.android.play.core.review.internal.zzr(zzxVar, 2);
        zzxVar.zzm = zzrVar;
        zzxVar.zzh = true;
        if (zzxVar.zzb.bindService(zzxVar.zzi, zzrVar, 1)) {
            return;
        }
        obfuscator.zzd("Failed to bind to the service.", new Object[0]);
        zzxVar.zzh = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzn zznVar = (zzn) it.next();
            zzy zzyVar = new zzy("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = zznVar.zza;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(zzyVar);
            }
        }
        arrayList.clear();
    }

    public final Handler zzc() {
        Handler handler;
        HashMap hashMap = zza;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.zzd)) {
                    HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                    handlerThread.start();
                    hashMap.put(this.zzd, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.zzd);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void zzu(TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
        zzc().post(new zzr(this, 0));
    }

    public final void zzw() {
        HashSet hashSet = this.zzf;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
