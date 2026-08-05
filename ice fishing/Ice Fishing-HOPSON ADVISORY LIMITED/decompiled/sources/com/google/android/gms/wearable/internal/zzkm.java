package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.MessageClient;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzkm implements ListenerHolder.Notifier {
    public static final /* synthetic */ int zzc = 0;
    final /* synthetic */ zzhk zza;
    final /* synthetic */ zzgj zzb;

    zzkm(zzhk zzhkVar, zzgj zzgjVar) {
        this.zza = zzhkVar;
        this.zzb = zzgjVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzhk zzhkVar = this.zza;
        Task<byte[]> onRequest = ((MessageClient.RpcService) obj).onRequest(zzhkVar.getSourceNodeId(), zzhkVar.getPath(), zzhkVar.getData());
        if (onRequest == null) {
            zzko.zzA(this.zzb, false, null);
        } else {
            final zzgj zzgjVar = this.zzb;
            onRequest.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.wearable.internal.zzkl
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    int i = zzkm.zzc;
                    boolean isSuccessful = task.isSuccessful();
                    zzgj zzgjVar2 = zzgj.this;
                    if (isSuccessful) {
                        zzko.zzA(zzgjVar2, true, (byte[]) task.getResult());
                    } else {
                        Log.e("WearableListenerStub", "Failed to resolve future, sending null response", task.getException());
                        zzko.zzA(zzgjVar2, false, null);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
        Log.e("WearableListenerStub", "Failed to notify listener, sending null response");
        zzko.zzA(this.zzb, false, null);
    }
}
