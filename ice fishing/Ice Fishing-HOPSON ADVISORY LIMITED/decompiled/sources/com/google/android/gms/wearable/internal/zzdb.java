package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.DataApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzdb implements zzd {
    final /* synthetic */ IntentFilter[] zza;

    zzdb(IntentFilter[] intentFilterArr) {
        this.zza = intentFilterArr;
    }

    @Override // com.google.android.gms.wearable.internal.zzd
    public final /* synthetic */ void zza(zzkf zzkfVar, BaseImplementation.ResultHolder resultHolder, Object obj, ListenerHolder listenerHolder) throws RemoteException {
        zzkfVar.zzx(resultHolder, (DataApi.DataListener) obj, listenerHolder, this.zza);
    }
}
