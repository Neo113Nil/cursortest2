package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzan extends CapabilityClient {
    public static final /* synthetic */ int zza = 0;
    private final CapabilityApi zzb;

    public zzan(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzb = new zzah();
    }

    private final Task zza(final ListenerHolder listenerHolder, final CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, final IntentFilter[] intentFilterArr) {
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzam
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzan.zza;
                ((zzkf) obj).zzA(new zzjc((TaskCompletionSource) obj2), CapabilityClient.OnCapabilityChangedListener.this, listenerHolder, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzal
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzan.zza;
                ((zzkf) obj).zzF(new zzjb((TaskCompletionSource) obj2), CapabilityClient.OnCapabilityChangedListener.this);
            }
        }).setMethodKey(24013).build());
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> addListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, Uri uri, int i) {
        boolean z;
        com.google.android.gms.internal.wearable.zzai.zzd(onCapabilityChangedListener, "listener must not be null");
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
        return zza(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener"), onCapabilityChangedListener, new IntentFilter[]{zzjd.zzb("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i)});
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> addLocalCapability(String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "capability must not be null");
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toVoidTask(asGoogleApiClient.enqueue(new zzy((zzah) this.zzb, asGoogleApiClient, str)));
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Map<String, CapabilityInfo>> getAllCapabilities(int i) {
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                i = 1;
            } else {
                z = false;
            }
        }
        CapabilityApi capabilityApi = this.zzb;
        com.google.android.gms.internal.wearable.zzai.zza(z);
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzx((zzah) capabilityApi, asGoogleApiClient, i)), zzaj.zza);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<CapabilityInfo> getCapability(String str, int i) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "capability must not be null");
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                i = 1;
            } else {
                z = false;
            }
        }
        CapabilityApi capabilityApi = this.zzb;
        com.google.android.gms.internal.wearable.zzai.zza(z);
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzw((zzah) capabilityApi, asGoogleApiClient, str, i)), zzak.zza);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Boolean> removeListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener) {
        com.google.android.gms.internal.wearable.zzai.zzd(onCapabilityChangedListener, "listener must not be null");
        ListenerHolder.ListenerKey<?> listenerKey = ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener").getListenerKey();
        com.google.android.gms.internal.wearable.zzai.zzd(listenerKey, "Key must not be null");
        return doUnregisterEventListener(listenerKey, 24003);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> removeLocalCapability(String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "capability must not be null");
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toVoidTask(asGoogleApiClient.enqueue(new zzz((zzah) this.zzb, asGoogleApiClient, str)));
    }

    public zzan(Context context, GoogleApi.Settings settings) {
        super(context, settings);
        this.zzb = new zzah();
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Boolean> removeListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(onCapabilityChangedListener, "listener must not be null");
        com.google.android.gms.internal.wearable.zzai.zzd(str, "capability must not be null");
        if (!str.startsWith("/")) {
            String.valueOf(str);
            str = "/".concat(String.valueOf(str));
        }
        Looper looper = getLooper();
        String.valueOf(str);
        ListenerHolder.ListenerKey<?> listenerKey = ListenerHolders.createListenerHolder(onCapabilityChangedListener, looper, "CapabilityListener:".concat(String.valueOf(str))).getListenerKey();
        com.google.android.gms.internal.wearable.zzai.zzd(listenerKey, "Key must not be null");
        return doUnregisterEventListener(listenerKey, 24003);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> addListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(onCapabilityChangedListener, "listener must not be null");
        com.google.android.gms.internal.wearable.zzai.zzd(str, "capability must not be null");
        IntentFilter zza2 = zzjd.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            String.valueOf(str);
            str = "/".concat(String.valueOf(str));
        }
        zza2.addDataPath(str, 0);
        IntentFilter[] intentFilterArr = {zza2};
        Looper looper = getLooper();
        String.valueOf(str);
        return zza(ListenerHolders.createListenerHolder(onCapabilityChangedListener, looper, "CapabilityListener:".concat(String.valueOf(str))), new zzai(onCapabilityChangedListener, str), intentFilterArr);
    }
}
