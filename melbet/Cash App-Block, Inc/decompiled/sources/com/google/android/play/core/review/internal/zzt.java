package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.fillr.n;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzt {
    public static final HashMap zza = new HashMap();
    public final Context zzb;
    public final n.a zzc;
    public boolean zzh;
    public final Intent zzi;
    public zzr zzm;
    public zzf zzn;
    public final ArrayList zze = new ArrayList();
    public final HashSet zzf = new HashSet();
    public final Object zzg = new Object();
    public final zzk zzk = new zzk(this, 0);
    public final AtomicInteger zzl = new AtomicInteger(0);
    public final String zzd = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference zzj = new WeakReference(null);

    public zzt(Context context, n.a aVar, Intent intent) {
        this.zzb = context;
        this.zzc = aVar;
        this.zzi = intent;
    }

    public static void zzp(zzt zztVar, com.google.android.play.core.review.zzf zzfVar) {
        zzf zzfVar2 = zztVar.zzn;
        n.a aVar = zztVar.zzc;
        ArrayList arrayList = zztVar.zze;
        int i = 0;
        if (zzfVar2 != null || zztVar.zzh) {
            if (!zztVar.zzh) {
                zzfVar.run();
                return;
            } else {
                aVar.zzc("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zzfVar);
                return;
            }
        }
        aVar.zzc("Initiate binding to the service.", new Object[0]);
        arrayList.add(zzfVar);
        zzr zzrVar = new zzr(zztVar, i);
        zztVar.zzm = zzrVar;
        zztVar.zzh = true;
        if (zztVar.zzb.bindService(zztVar.zzi, zzrVar, 1)) {
            return;
        }
        aVar.zzc("Failed to bind to the service.", new Object[0]);
        zztVar.zzh = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzj zzjVar = (zzj) it.next();
            zzu zzuVar = new zzu("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = zzjVar.zza;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(zzuVar);
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

    public final void zzw() {
        HashSet hashSet = this.zzf;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
