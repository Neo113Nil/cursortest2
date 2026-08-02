package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.RemoteException;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzx;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzk implements IBinder.DeathRecipient {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzk(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                zzt zztVar = (zzt) obj;
                zztVar.zzc.zzc("reportBinderDeath", new Object[0]);
                if (zztVar.zzj.get() != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                zztVar.zzc.zzc("%s : Binder has died.", zztVar.zzd);
                Iterator it = zztVar.zze.iterator();
                while (it.hasNext()) {
                    zzj zzjVar = (zzj) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(zztVar.zzd).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = zzjVar.zza;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                zztVar.zze.clear();
                synchronized (zztVar.zzg) {
                    zztVar.zzw();
                }
                return;
            default:
                zzx zzxVar = (zzx) obj;
                zzxVar.zzc.zzd("reportBinderDeath", new Object[0]);
                if (zzxVar.zzj.get() != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                zzxVar.zzc.zzd("%s : Binder has died.", zzxVar.zzd);
                Iterator it2 = zzxVar.zze.iterator();
                while (it2.hasNext()) {
                    com.google.android.play.core.appupdate.internal.zzn zznVar = (com.google.android.play.core.appupdate.internal.zzn) it2.next();
                    RemoteException remoteException2 = new RemoteException(String.valueOf(zzxVar.zzd).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource2 = zznVar.zza;
                    if (taskCompletionSource2 != null) {
                        taskCompletionSource2.trySetException(remoteException2);
                    }
                }
                zzxVar.zze.clear();
                synchronized (zzxVar.zzg) {
                    zzxVar.zzw();
                }
                return;
        }
    }
}
