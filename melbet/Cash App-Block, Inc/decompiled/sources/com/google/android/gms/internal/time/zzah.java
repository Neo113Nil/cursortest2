package com.google.android.gms.internal.time;

import android.content.Context;
import androidx.room.Room;
import coil3.request.OneShotDisposable;
import com.fillr.n;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.gms.time.zzb;

/* loaded from: classes4.dex */
public final class zzah extends GoogleApi {
    public static final Api zza = new Api("TrustedTime.API", new zaa(10), new Api.ClientKey());
    public final Object zze;
    public Task zzf;
    public boolean zzg;

    public zzah(Context context, Api api) {
        super(context, null, api, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = new Object();
    }

    public final String toString() {
        String str;
        synchronized (this.zze) {
            str = "BasicInternalTimeSignalSupplierInitializer{task=" + String.valueOf(this.zzf) + ", disposed=" + this.zzg + "}";
        }
        return str;
    }

    public final zzw zzb() {
        synchronized (this.zze) {
            try {
                if (this.zzg) {
                    return Room.forResult(null);
                }
                this.zzg = true;
                this.zzf = null;
                return Room.forResult(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final Task zzc() {
        Task task;
        synchronized (this.zze) {
            try {
                if (this.zzg) {
                    throw new IllegalStateException("dispose() has been called");
                }
                if (this.zzf == null) {
                    zacn builder = zacn.builder();
                    builder.zaa$1 = new Feature[]{zzb.zza};
                    builder.zac = 29801;
                    final int i = 1;
                    builder.zaa = new zzdg(this, i);
                    final int i2 = 0;
                    zzw zae = zae(0, builder.build());
                    zzag zzagVar = new zzag();
                    zzhk zzhkVar = zzhk.zza;
                    int i3 = 22;
                    this.zzf = zae.continueWithTask(zzhkVar, new OneShotDisposable(zzagVar, i3)).continueWithTask(zzhkVar, new Continuation(this) { // from class: com.google.android.gms.internal.time.zzx
                        public final /* synthetic */ zzah zza;

                        {
                            this.zza = this;
                        }

                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task2) {
                            zzw forResult;
                            switch (i2) {
                                case 0:
                                    if (!task2.isSuccessful()) {
                                        return zzcw.zza(task2);
                                    }
                                    zzag zzagVar2 = (zzag) task2.getResult();
                                    zzk zzkVar = zzagVar2.zza;
                                    if (zzkVar == null) {
                                        zzagVar2.zza();
                                        return Room.forException(new IllegalStateException("taskChainState.globalState unexpectedly null"));
                                    }
                                    zzah zzahVar = this.zza;
                                    Context context = zzahVar.zab;
                                    zzagVar2.zzb = new zzu(context, zzahVar, zzkVar, context.getMainExecutor());
                                    return Room.forResult(zzagVar2);
                                default:
                                    zzah zzahVar2 = this.zza;
                                    if (!task2.isSuccessful()) {
                                        return zzcw.zza(task2);
                                    }
                                    zzag zzagVar3 = (zzag) task2.getResult();
                                    synchronized (zzahVar2.zze) {
                                        try {
                                            zzu zzuVar = zzagVar3.zzb;
                                            if (zzuVar == null) {
                                                zzagVar3.zza();
                                                forResult = Room.forException(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                                            } else if (zzahVar2.zzg) {
                                                zzagVar3.zza();
                                                forResult = Room.forException(new IllegalStateException("dispose() called"));
                                            } else {
                                                forResult = Room.forResult(zzuVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    return forResult;
                            }
                        }
                    }).continueWithTask(zzhkVar, new com.google.android.gms.tasks.zzb(this, i3)).continueWithTask(zzhkVar, new n.b(this, 26)).continueWithTask(zzhkVar, new Continuation(this) { // from class: com.google.android.gms.internal.time.zzx
                        public final /* synthetic */ zzah zza;

                        {
                            this.zza = this;
                        }

                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task2) {
                            zzw forResult;
                            switch (i) {
                                case 0:
                                    if (!task2.isSuccessful()) {
                                        return zzcw.zza(task2);
                                    }
                                    zzag zzagVar2 = (zzag) task2.getResult();
                                    zzk zzkVar = zzagVar2.zza;
                                    if (zzkVar == null) {
                                        zzagVar2.zza();
                                        return Room.forException(new IllegalStateException("taskChainState.globalState unexpectedly null"));
                                    }
                                    zzah zzahVar = this.zza;
                                    Context context = zzahVar.zab;
                                    zzagVar2.zzb = new zzu(context, zzahVar, zzkVar, context.getMainExecutor());
                                    return Room.forResult(zzagVar2);
                                default:
                                    zzah zzahVar2 = this.zza;
                                    if (!task2.isSuccessful()) {
                                        return zzcw.zza(task2);
                                    }
                                    zzag zzagVar3 = (zzag) task2.getResult();
                                    synchronized (zzahVar2.zze) {
                                        try {
                                            zzu zzuVar = zzagVar3.zzb;
                                            if (zzuVar == null) {
                                                zzagVar3.zza();
                                                forResult = Room.forException(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                                            } else if (zzahVar2.zzg) {
                                                zzagVar3.zza();
                                                forResult = Room.forException(new IllegalStateException("dispose() called"));
                                            } else {
                                                forResult = Room.forResult(zzuVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    return forResult;
                            }
                        }
                    });
                }
                task = this.zzf;
            } catch (Throwable th) {
                throw th;
            }
        }
        return task;
    }
}
