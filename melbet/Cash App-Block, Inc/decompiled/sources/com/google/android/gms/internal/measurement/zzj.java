package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import androidx.core.view.NestedScrollingParentHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.util.AndroidSystemCallbacks;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzj implements zzafa, ListenerHolder.Notifier, RemoteCall, AsyncCallable, OnCompleteListener {
    public static volatile zzj zza;
    public static final zztw zzb = new zztw(6);
    public final /* synthetic */ int $r8$classId;

    /* renamed from: zza, reason: collision with other field name */
    public final Object f64zza;

    public zzj(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.f64zza = new CopyOnWriteArrayList();
                break;
            case 2:
                int i2 = zzacf.$r8$clinit;
                this.f64zza = new zzj(new zzafa[]{zztw.zza$1, zzb}, 4);
                break;
            default:
                this.f64zza = new HashMap();
                break;
        }
    }

    public static zzj zza() {
        if (zza == null) {
            synchronized (zzj.class) {
                try {
                    if (zza == null) {
                        zza = new zzj(1);
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f64zza;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        zzku zzkuVar = (zzku) obj;
        switch (i) {
            case 6:
                int i2 = zzkk.$r8$clinit;
                zzjy zzjyVar = new zzjy(taskCompletionSource);
                zzkt zzktVar = (zzkt) zzkuVar.getService();
                byte[] zzcd = ((zzme) obj3).zzcd();
                Parcel zza2 = zzktVar.zza();
                zzbn.zzd(zza2, zzjyVar);
                zza2.writeByteArray(zzcd);
                zzktVar.zzc(zza2, 31);
                break;
            default:
                zzkt zzktVar2 = (zzkt) zzkuVar.getService();
                zzjy zzjyVar2 = new zzjy((zzkk) obj3, taskCompletionSource);
                Parcel zza3 = zzktVar2.zza();
                zzbn.zzd(zza3, zzjyVar2);
                zzktVar2.zzc(zza3, 27);
                break;
        }
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public ListenableFuture call() {
        int i = this.$r8$classId;
        Object obj = this.f64zza;
        switch (i) {
            case 8:
                TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask((Callable) obj);
                DirectExecutor.INSTANCE.execute(trustedListenableFutureTask);
                return trustedListenableFutureTask;
            default:
                return (AbstractFuture) obj;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public void notifyListener(Object obj) {
        boolean z;
        boolean z2;
        zzqd zzqdVar = (zzqd) obj;
        try {
            byte[] bArr = (byte[]) this.f64zza;
            zzadf zzadfVar = zzadf.zzd;
            int i = zzacf.$r8$clinit;
            zzpl zzb2 = zzpl.zzb(bArr, zzadf.zza);
            Iterator it = zzqdVar.zza.zzf.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                zzou zzouVar = (zzou) it.next();
                List zza2 = zzb2.zza();
                zzouVar.getClass();
                zzxs zzxsVar = zzpg.zzc;
                zzxsVar.getClass();
                if (zza2 == null || zza2.isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = zza2.iterator();
                    z = false;
                    while (it2.hasNext()) {
                        zzoo zzooVar = (zzoo) ((ConcurrentHashMap) zzxsVar.zza$1).get((String) it2.next());
                        if (zzooVar != null) {
                            zzpg zzpgVar = zzooVar.zza;
                            if (zzpgVar.zzh) {
                                AndroidSystemCallbacks androidSystemCallbacks = zzpgVar.zzd;
                                if (androidSystemCallbacks != null && (androidSystemCallbacks.shutdown || ((NestedScrollingParentHelper) androidSystemCallbacks.application).mNestedScrollAxesTouch == 3 || zzpgVar.zzk.zzb())) {
                                    synchronized (zzpgVar) {
                                        try {
                                            AndroidSystemCallbacks androidSystemCallbacks2 = zzpgVar.zzd;
                                            if (androidSystemCallbacks2 != null) {
                                                if (!androidSystemCallbacks2.shutdown) {
                                                    if (!(((NestedScrollingParentHelper) androidSystemCallbacks2.application).mNestedScrollAxesTouch == 3)) {
                                                        if (zzpgVar.zzk.zzb()) {
                                                        }
                                                    }
                                                }
                                                zzpgVar.zzd = null;
                                                ((AtomicInteger) zzpgVar.zzj.zza$1).incrementAndGet();
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            z |= z2;
                        }
                    }
                }
                if (z && !z3) {
                    zzqdVar.zzb.zza();
                    z3 = true;
                }
            }
        } catch (zzaeh unused) {
            zzqdVar.getClass();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        zzkz zzkzVar = (zzkz) this.f64zza;
        if (task.isCanceled()) {
            zzkzVar.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            zzkzVar.set(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception != null) {
            zzkzVar.setException(exception);
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((zzafa[]) this.f64zza)[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public zzafn zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzafa zzafaVar = ((zzafa[]) this.f64zza)[i];
            if (zzafaVar.zzb(cls)) {
                return zzafaVar.zzc(cls);
            }
        }
        a$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public void zzj(int i, long j) {
        ((zzada) this.f64zza).zzg(i, j);
    }

    public void zzk(int i, int i2) {
        ((zzada) this.f64zza).zze(i, i2);
    }

    public void zzn(int i, zzacr zzacrVar) {
        ((zzada) this.f64zza).zzj(i, zzacrVar);
    }

    public void zzr(int i, Object obj, zzafp zzafpVar) {
        zzada zzadaVar = (zzada) this.f64zza;
        zzacb zzacbVar = (zzacb) obj;
        zzadaVar.zzb(i, 2);
        zzadaVar.zzr(zzacbVar.zzcf(zzafpVar));
        zzafpVar.zzf(zzacbVar, this);
    }

    public void zzt(int i) {
        ((zzada) this.f64zza).zzb(i, 3);
    }

    public void zzu(int i) {
        ((zzada) this.f64zza).zzb(i, 4);
    }

    public void zzb(zztw zztwVar) {
        ((CopyOnWriteArrayList) this.f64zza).add(0, zztwVar);
    }

    public static zzj zza(zzada zzadaVar) {
        zzj zzjVar = zzadaVar.zza;
        return zzjVar != null ? zzjVar : new zzj(zzadaVar);
    }

    public void zzc(int i, long j) {
        ((zzada) this.f64zza).zzf(i, j);
    }

    public /* synthetic */ zzj(Object obj, int i) {
        this.$r8$classId = i;
        this.f64zza = obj;
    }

    public zzj(zzada zzadaVar) {
        this.$r8$classId = 3;
        this.f64zza = zzadaVar;
        zzadaVar.zza = this;
    }

    public zzj(zzjy zzjyVar, byte[] bArr) {
        this.$r8$classId = 5;
        this.f64zza = bArr;
    }
}
