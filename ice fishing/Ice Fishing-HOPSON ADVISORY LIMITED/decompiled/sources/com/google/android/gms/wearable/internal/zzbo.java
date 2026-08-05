package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzbo extends ChannelClient {
    public static final /* synthetic */ int zza = 0;

    public zzbo(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
    }

    static /* synthetic */ zzcb zzc(Channel channel) {
        com.google.android.gms.internal.wearable.zzai.zzd(channel, "channel must not be null");
        return (zzcb) channel;
    }

    private static zzcb zzd(ChannelClient.Channel channel) {
        com.google.android.gms.internal.wearable.zzai.zzd(channel, "channel must not be null");
        return (zzcb) channel;
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> close(final ChannelClient.Channel channel) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zzbo.this.zza(channel, (zzkf) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(24059).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<InputStream> getInputStream(ChannelClient.Channel channel) {
        zzcb zzd = zzd(channel);
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzbu(zzd, asGoogleApiClient)), zzaz.zza);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<OutputStream> getOutputStream(ChannelClient.Channel channel) {
        final String zza2 = zzd(channel).zza();
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzkf zzkfVar = (zzkf) obj;
                String str = zza2;
                try {
                    zzcm zzcmVar = new zzcm();
                    ((zzgq) zzkfVar.getService()).zzz(new zzjm(new zzay(zzboVar, taskCompletionSource), zzcmVar, new zzbm(zzboVar, str)), zzcmVar, str);
                } catch (RemoteException e) {
                    taskCompletionSource.setException(e);
                }
            }
        }).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<ChannelClient.Channel> openChannel(final String str, final String str2) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbi
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                try {
                    ((zzkf) obj).zzs(new zzav(zzboVar, taskCompletionSource), str, str2);
                } catch (RemoteException e) {
                    taskCompletionSource.setException(e);
                }
            }
        }).setMethodKey(24058).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> receiveFile(ChannelClient.Channel channel, Uri uri, boolean z) {
        zzcb zzd = zzd(channel);
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        com.google.android.gms.internal.wearable.zzai.zzd(asGoogleApiClient, "client is null");
        com.google.android.gms.internal.wearable.zzai.zzd(uri, "uri is null");
        return PendingResultUtil.toVoidTask(asGoogleApiClient.enqueue(new zzbw(zzd, asGoogleApiClient, uri, z)));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> registerChannelCallback(ChannelClient.Channel channel, ChannelClient.ChannelCallback channelCallback) {
        final String zza2 = ((zzcb) channel).zza();
        com.google.android.gms.internal.wearable.zzai.zzd(channelCallback, "listener is null");
        Looper looper = getLooper();
        String.valueOf(zza2);
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(channelCallback, looper, "ChannelListener:".concat(String.valueOf(zza2)));
        final IntentFilter[] intentFilterArr = {zzjd.zza("com.google.android.gms.wearable.CHANNEL_EVENT")};
        final zzba zzbaVar = new zzba(channelCallback);
        final ListenerHolder createListenerHolder2 = ListenerHolders.createListenerHolder(zzbaVar, getLooper(), "ChannelListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(createListenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zzkf zzkfVar = (zzkf) obj;
                int i = zzbo.zza;
                zzkfVar.zzB(new zzjc((TaskCompletionSource) obj2), zzba.this, createListenerHolder2, zza2, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbe
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzbo.zza;
                ((zzkf) obj).zzG(new zzjb((TaskCompletionSource) obj2), zzba.this, zza2);
            }
        }).setMethodKey(24014).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> sendFile(ChannelClient.Channel channel, Uri uri) {
        return PendingResultUtil.toVoidTask(zzd(channel).sendFile(asGoogleApiClient(), uri, 0L, -1L));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Boolean> unregisterChannelCallback(ChannelClient.Channel channel, ChannelClient.ChannelCallback channelCallback) {
        String zza2 = zzd(channel).zza();
        Looper looper = getLooper();
        String.valueOf(zza2);
        ListenerHolder.ListenerKey<?> listenerKey = ListenerHolders.createListenerHolder(channelCallback, looper, "ChannelListener:".concat(String.valueOf(zza2))).getListenerKey();
        com.google.android.gms.internal.wearable.zzai.zzd(listenerKey, "Key must not be null");
        return doUnregisterEventListener(listenerKey, 24004);
    }

    final /* synthetic */ void zza(ChannelClient.Channel channel, zzkf zzkfVar, TaskCompletionSource taskCompletionSource) {
        try {
            zzkfVar.zzt(new zzaw(this, taskCompletionSource), zzd(channel).zza());
        } catch (RemoteException e) {
            taskCompletionSource.setException(e);
        }
    }

    final /* synthetic */ void zzb(ChannelClient.Channel channel, int i, zzkf zzkfVar, TaskCompletionSource taskCompletionSource) {
        try {
            zzkfVar.zzu(new zzax(this, taskCompletionSource), zzd(channel).zza(), i);
        } catch (RemoteException e) {
            taskCompletionSource.setException(e);
        }
    }

    public zzbo(Context context, GoogleApi.Settings settings) {
        super(context, settings);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> sendFile(ChannelClient.Channel channel, Uri uri, long j, long j2) {
        return PendingResultUtil.toVoidTask(zzd(channel).sendFile(asGoogleApiClient(), uri, j, j2));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Boolean> unregisterChannelCallback(ChannelClient.ChannelCallback channelCallback) {
        ListenerHolder.ListenerKey<?> listenerKey = ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener").getListenerKey();
        com.google.android.gms.internal.wearable.zzai.zzd(listenerKey, "Key must not be null");
        return doUnregisterEventListener(listenerKey, 24004);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> close(final ChannelClient.Channel channel, final int i) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbg
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zzbo.this.zzb(channel, i, (zzkf) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(24060).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> registerChannelCallback(ChannelClient.ChannelCallback channelCallback) {
        com.google.android.gms.internal.wearable.zzai.zzd(channelCallback, "listener is null");
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener");
        final IntentFilter[] intentFilterArr = {zzjd.zza("com.google.android.gms.wearable.CHANNEL_EVENT")};
        final zzba zzbaVar = new zzba(channelCallback);
        final ListenerHolder createListenerHolder2 = ListenerHolders.createListenerHolder(zzbaVar, getLooper(), "ChannelListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(createListenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zzkf zzkfVar = (zzkf) obj;
                int i = zzbo.zza;
                zzkfVar.zzB(new zzjc((TaskCompletionSource) obj2), zzba.this, createListenerHolder2, null, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzbo.zza;
                ((zzkf) obj).zzG(new zzjb((TaskCompletionSource) obj2), zzba.this, null);
            }
        }).setMethodKey(24014).setFeatures(com.google.android.gms.wearable.zzn.zzx).build());
    }
}
