package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzbm implements zzbn {
    final /* synthetic */ zzbo zza;
    private final String zzb;

    public zzbm(zzbo zzboVar, String str) {
        Objects.requireNonNull(zzboVar);
        this.zza = zzboVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.wearable.internal.zzbn
    public final Task zza() {
        return this.zza.doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zzbm.this.zzb((zzkf) obj, (TaskCompletionSource) obj2);
            }
        }).setFeatures(com.google.android.gms.wearable.zzn.zzG).setAutoResolveMissingFeatures(false).setMethodKey(24057).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzb(zzkf zzkfVar, TaskCompletionSource taskCompletionSource) {
        try {
            ((zzgq) zzkfVar.getService()).zzA(new zzbk(this, taskCompletionSource), this.zzb);
        } catch (RemoteException e) {
            taskCompletionSource.setException(e);
        }
    }
}
