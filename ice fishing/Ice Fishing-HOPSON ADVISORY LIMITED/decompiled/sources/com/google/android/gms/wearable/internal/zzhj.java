package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzhj extends MessageClient {
    public static final /* synthetic */ int zza = 0;

    public zzhj(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
    }

    private final Task zza(final MessageClient.OnMessageReceivedListener onMessageReceivedListener, final IntentFilter[] intentFilterArr) {
        final ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(onMessageReceivedListener, getLooper(), "MessageListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(createListenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzhd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzhj.zza;
                ((zzkf) obj).zzy(new zzjc((TaskCompletionSource) obj2), MessageClient.OnMessageReceivedListener.this, createListenerHolder, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzhe
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzhj.zza;
                ((zzkf) obj).zzD(new zzjb((TaskCompletionSource) obj2), MessageClient.OnMessageReceivedListener.this);
            }
        }).setMethodKey(24016).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }

    private final Task zzb(final MessageClient.RpcService rpcService, final IntentFilter[] intentFilterArr) {
        final ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(rpcService, getLooper(), "RequestListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(createListenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzhf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzhj.zza;
                ((zzkf) obj).zzz(new zzjc((TaskCompletionSource) obj2), MessageClient.RpcService.this, createListenerHolder, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzhg
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzhj.zza;
                ((zzkf) obj).zzE(new zzjb((TaskCompletionSource) obj2), MessageClient.RpcService.this);
            }
        }).setMethodKey(24017).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Void> addListener(MessageClient.OnMessageReceivedListener onMessageReceivedListener) {
        return zza(onMessageReceivedListener, new IntentFilter[]{zzjd.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Void> addRpcService(MessageClient.RpcService rpcService, String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "pathPrefix must not be null");
        return zzb(rpcService, new IntentFilter[]{zzjd.zzb(MessageClient.ACTION_REQUEST_RECEIVED, new Uri.Builder().scheme(PutDataRequest.WEAR_URI_SCHEME).authority("*").path(str).build(), 1)});
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Boolean> removeListener(MessageClient.OnMessageReceivedListener onMessageReceivedListener) {
        ListenerHolder.ListenerKey<?> listenerKey = ListenerHolders.createListenerHolder(onMessageReceivedListener, getLooper(), "MessageListener").getListenerKey();
        com.google.android.gms.internal.wearable.zzai.zzd(listenerKey, "Key must not be null");
        return doUnregisterEventListener(listenerKey, 24007);
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Boolean> removeRpcService(MessageClient.RpcService rpcService) {
        ListenerHolder.ListenerKey<?> listenerKey = ListenerHolders.createListenerHolder(rpcService, getLooper(), "RequestListener").getListenerKey();
        com.google.android.gms.internal.wearable.zzai.zzd(listenerKey, "Key must not be null");
        return doUnregisterEventListener(listenerKey, 24008);
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Integer> sendMessage(final String str, final String str2, final byte[] bArr) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzhh
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zzhj zzhjVar = zzhj.this;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                try {
                    ((zzkf) obj).zzq(new zzha(zzhjVar, taskCompletionSource), str, str2, bArr);
                } catch (RemoteException e) {
                    taskCompletionSource.setException(e);
                }
            }
        }).setMethodKey(24020).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<byte[]> sendRequest(final String str, final String str2, final byte[] bArr) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzhc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zzhj zzhjVar = zzhj.this;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzkf zzkfVar = (zzkf) obj;
                String str3 = str;
                String str4 = str2;
                byte[] bArr2 = bArr;
                try {
                    ((zzgq) zzkfVar.getService()).zzj(new zzjz(new zzhb(zzhjVar, taskCompletionSource)), str3, str4, bArr2);
                } catch (RemoteException e) {
                    taskCompletionSource.setException(e);
                }
            }
        }).setMethodKey(24006).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }

    public zzhj(Context context, GoogleApi.Settings settings) {
        super(context, settings);
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Void> addListener(MessageClient.OnMessageReceivedListener onMessageReceivedListener, Uri uri, int i) {
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
        return zza(onMessageReceivedListener, new IntentFilter[]{zzjd.zzb("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i)});
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Void> addRpcService(MessageClient.RpcService rpcService, String str, String str2) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "pathPrefix must not be null");
        return zzb(rpcService, new IntentFilter[]{zzjd.zzb(MessageClient.ACTION_REQUEST_RECEIVED, new Uri.Builder().scheme(PutDataRequest.WEAR_URI_SCHEME).authority(str2).path(str).build(), 1)});
    }
}
