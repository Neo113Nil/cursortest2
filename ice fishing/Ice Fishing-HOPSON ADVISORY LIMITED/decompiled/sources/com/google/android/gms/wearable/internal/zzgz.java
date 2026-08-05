package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzgz implements MessageApi {
    private static final PendingResult zza(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener, IntentFilter[] intentFilterArr) {
        return googleApiClient.enqueue(new zzgx(googleApiClient, messageListener, googleApiClient.registerListener(messageListener), intentFilterArr, null));
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener) {
        return zza(googleApiClient, messageListener, new IntentFilter[]{zzjd.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener) {
        return googleApiClient.enqueue(new zzgw(this, googleApiClient, messageListener));
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final PendingResult<MessageApi.SendMessageResult> sendMessage(GoogleApiClient googleApiClient, String str, String str2, byte[] bArr) {
        return googleApiClient.enqueue(new zzgv(this, googleApiClient, str, str2, bArr));
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener, Uri uri, int i) {
        boolean z;
        com.google.android.gms.internal.wearable.zzai.zzd(uri, "uri must not be null");
        if (i == 0) {
            z = true;
        } else if (i == 1) {
            i = 1;
            z = true;
        } else {
            z = false;
        }
        com.google.android.gms.internal.wearable.zzai.zzb(z, "invalid filter type");
        return zza(googleApiClient, messageListener, new IntentFilter[]{zzjd.zzb("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i)});
    }
}
