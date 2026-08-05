package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzby implements zzd {
    final /* synthetic */ String zza;
    final /* synthetic */ IntentFilter[] zzb;

    zzby(String str, IntentFilter[] intentFilterArr) {
        this.zza = str;
        this.zzb = intentFilterArr;
    }

    @Override // com.google.android.gms.wearable.internal.zzd
    public final /* bridge */ /* synthetic */ void zza(zzkf zzkfVar, BaseImplementation.ResultHolder resultHolder, Object obj, ListenerHolder listenerHolder) throws RemoteException {
        zzkfVar.zzB(resultHolder, (ChannelApi.ChannelListener) obj, listenerHolder, this.zza, this.zzb);
    }
}
