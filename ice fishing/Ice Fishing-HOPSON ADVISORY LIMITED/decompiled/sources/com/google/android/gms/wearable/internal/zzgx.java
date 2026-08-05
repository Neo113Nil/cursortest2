package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzgx extends zzt {
    private MessageApi.MessageListener zza;
    private ListenerHolder zzb;
    private IntentFilter[] zzc;

    /* synthetic */ zzgx(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr, byte[] bArr) {
        super(googleApiClient);
        messageListener.getClass();
        this.zza = messageListener;
        listenerHolder.getClass();
        this.zzb = listenerHolder;
        this.zzc = intentFilterArr;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzkf zzkfVar = (zzkf) anyClient;
        MessageApi.MessageListener messageListener = this.zza;
        if (messageListener == null) {
            throw null;
        }
        ListenerHolder listenerHolder = this.zzb;
        if (listenerHolder == null) {
            throw null;
        }
        IntentFilter[] intentFilterArr = this.zzc;
        if (intentFilterArr == null) {
            throw null;
        }
        zzkfVar.zzy(this, messageListener, listenerHolder, intentFilterArr);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
