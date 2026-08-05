package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataClient;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzdt extends DataClient {
    public static final /* synthetic */ int zza = 0;
    private final DataApi zzb;

    public zzdt(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzb = new zzdg();
    }

    private final Task zza(final DataClient.OnDataChangedListener onDataChangedListener, final IntentFilter[] intentFilterArr) {
        final ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(onDataChangedListener, getLooper(), "DataListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(createListenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzdo
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzdt.zza;
                ((zzkf) obj).zzx(new zzjc((TaskCompletionSource) obj2), DataClient.OnDataChangedListener.this, createListenerHolder, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzdn
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                int i = zzdt.zza;
                ((zzkf) obj).zzC(new zzjb((TaskCompletionSource) obj2), DataClient.OnDataChangedListener.this);
            }
        }).setMethodKey(24015).build());
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Void> addListener(DataClient.OnDataChangedListener onDataChangedListener) {
        return zza(onDataChangedListener, new IntentFilter[]{zzjd.zza("com.google.android.gms.wearable.DATA_CHANGED")});
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Integer> deleteDataItems(Uri uri) {
        return PendingResultUtil.toTask(((zzdg) this.zzb).deleteDataItems(asGoogleApiClient(), uri, 0), zzdk.zza);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItem> getDataItem(Uri uri) {
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzcv((zzdg) this.zzb, asGoogleApiClient, uri)), zzdh.zza);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItemBuffer> getDataItems() {
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzcw((zzdg) this.zzb, asGoogleApiClient)), zzds.zza);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataClient.GetFdForAssetResponse> getFdForAsset(Asset asset) {
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        if (asset == null) {
            throw new IllegalArgumentException("asset is null");
        }
        if (asset.getDigest() == null) {
            throw new IllegalArgumentException("invalid asset");
        }
        if (asset.zza() == null) {
            return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzcz((zzdg) this.zzb, asGoogleApiClient, asset)), zzdm.zza);
        }
        throw new IllegalArgumentException("invalid asset");
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItem> putDataItem(PutDataRequest putDataRequest) {
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzcu((zzdg) this.zzb, asGoogleApiClient, putDataRequest)), zzdi.zza);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Boolean> removeListener(DataClient.OnDataChangedListener onDataChangedListener) {
        ListenerHolder.ListenerKey<?> listenerKey = ListenerHolders.createListenerHolder(onDataChangedListener, getLooper(), "DataListener").getListenerKey();
        com.google.android.gms.internal.wearable.zzai.zzd(listenerKey, "Key must not be null");
        return doUnregisterEventListener(listenerKey, 24005);
    }

    public zzdt(Context context, GoogleApi.Settings settings) {
        super(context, settings);
        this.zzb = new zzdg();
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Void> addListener(DataClient.OnDataChangedListener onDataChangedListener, Uri uri, int i) {
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
        return zza(onDataChangedListener, new IntentFilter[]{zzjd.zzb("com.google.android.gms.wearable.DATA_CHANGED", uri, i)});
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItemBuffer> getDataItems(Uri uri) {
        return PendingResultUtil.toTask(((zzdg) this.zzb).getDataItems(asGoogleApiClient(), uri, 0), zzdq.zza);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Integer> deleteDataItems(Uri uri, int i) {
        return PendingResultUtil.toTask(this.zzb.deleteDataItems(asGoogleApiClient(), uri, i), zzdj.zza);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItemBuffer> getDataItems(Uri uri, int i) {
        return PendingResultUtil.toTask(this.zzb.getDataItems(asGoogleApiClient(), uri, i), zzdr.zza);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataClient.GetFdForAssetResponse> getFdForAsset(DataItemAsset dataItemAsset) {
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzda((zzdg) this.zzb, asGoogleApiClient, dataItemAsset)), zzdl.zza);
    }
}
