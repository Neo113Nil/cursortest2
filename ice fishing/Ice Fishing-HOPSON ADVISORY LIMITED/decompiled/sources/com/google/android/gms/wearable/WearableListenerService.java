package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.NodeClient;
import com.google.android.gms.wearable.internal.zzba;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class WearableListenerService extends Service implements DataApi.DataListener, MessageApi.MessageListener, NodeClient.OnNodeMigratedListener, CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, MessageClient.RpcService {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private ComponentName zza;
    private zzv zzb;
    private IBinder zzc;
    private Intent zzd;
    private HandlerThread zze;
    private boolean zzg;
    private final Object zzf = new Object();
    private final zzba zzh = new zzba(new zzt(this, null));

    public Looper getLooper() {
        if (this.zze == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.zze = handlerThread;
        }
        return this.zze.getLooper();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        char c;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        switch (action.hashCode()) {
            case -1487371046:
                if (action.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1140095138:
                if (action.equals(MessageClient.ACTION_REQUEST_RECEIVED)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -786751258:
                if (action.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 705066793:
                if (action.equals(NodeClient.ACTION_NODE_MIGRATED)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 915816236:
                if (action.equals("com.google.android.gms.wearable.DATA_CHANGED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1003809169:
                if (action.equals("com.google.android.gms.wearable.CHANNEL_EVENT")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1460975593:
                if (action.equals(BIND_LISTENER_INTENT_ACTION)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return this.zzc;
            default:
                if (!Log.isLoggable("WearableLS", 3)) {
                    return null;
                }
                String obj = intent.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 46);
                sb.append("onBind: Provided bind intent (");
                sb.append(obj);
                sb.append(") is not allowed");
                Log.d("WearableLS", sb.toString());
                return null;
        }
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelClosed(Channel channel, int i, int i2) {
    }

    public void onChannelClosed(ChannelClient.Channel channel, int i, int i2) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelOpened(Channel channel) {
    }

    public void onChannelOpened(ChannelClient.Channel channel) {
    }

    public void onConnectedNodes(List<Node> list) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zza = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.zza);
            String.valueOf(valueOf);
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(valueOf)));
        }
        this.zzb = new zzv(this, getLooper());
        Intent intent = new Intent(BIND_LISTENER_INTENT_ACTION);
        this.zzd = intent;
        intent.setComponent(this.zza);
        this.zzc = new zzai(this);
    }

    @Override // com.google.android.gms.wearable.DataApi.DataListener
    public void onDataChanged(DataEventBuffer dataEventBuffer) {
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.zza);
            String.valueOf(valueOf);
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(valueOf)));
        }
        synchronized (this.zzf) {
            this.zzg = true;
            zzv zzvVar = this.zzb;
            if (zzvVar == null) {
                String valueOf2 = String.valueOf(this.zza);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 111);
                sb.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb.append(valueOf2);
                throw new IllegalStateException(sb.toString());
            }
            zzvVar.zzb();
        }
        super.onDestroy();
    }

    public void onEntityUpdate(zza zzaVar) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onInputClosed(Channel channel, int i, int i2) {
    }

    public void onInputClosed(ChannelClient.Channel channel, int i, int i2) {
    }

    @Override // com.google.android.gms.wearable.MessageApi.MessageListener
    public void onMessageReceived(MessageEvent messageEvent) {
    }

    @Override // com.google.android.gms.wearable.NodeClient.OnNodeMigratedListener
    public void onNodeMigrated(String str, DataItemBuffer dataItemBuffer) {
    }

    public void onNotificationReceived(zzb zzbVar) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onOutputClosed(Channel channel, int i, int i2) {
    }

    public void onOutputClosed(ChannelClient.Channel channel, int i, int i2) {
    }

    public void onPeerConnected(Node node) {
    }

    public void onPeerDisconnected(Node node) {
    }

    @Override // com.google.android.gms.wearable.MessageClient.RpcService
    public Task<byte[]> onRequest(String str, String str2, byte[] bArr) {
        return null;
    }

    final /* synthetic */ ComponentName zza() {
        return this.zza;
    }

    final /* synthetic */ zzv zzb() {
        return this.zzb;
    }

    final /* synthetic */ IBinder zzc() {
        return this.zzc;
    }

    final /* synthetic */ Intent zzd() {
        return this.zzd;
    }

    final /* synthetic */ HandlerThread zze() {
        return this.zze;
    }

    final /* synthetic */ void zzf(HandlerThread handlerThread) {
        this.zze = null;
    }

    final /* synthetic */ Object zzg() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzg;
    }

    final /* synthetic */ zzba zzi() {
        return this.zzh;
    }
}
