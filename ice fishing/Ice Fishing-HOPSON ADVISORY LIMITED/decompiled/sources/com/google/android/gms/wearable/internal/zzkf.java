package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzkf extends GmsClient {
    public static final /* synthetic */ int zze = 0;
    private final ExecutorService zzf;
    private final zzgu zzg;
    private final zzgu zzh;
    private final zzgu zzi;
    private final zzgu zzj;
    private final zzgu zzk;
    private final zzgu zzl;
    private final zzgu zzm;
    private final zzgu zzn;
    private final zzgu zzo;
    private final zzgu zzp;
    private final zzkp zzq;
    private final com.google.android.gms.internal.wearable.zzak zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkf(final Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        super(context, looper, 14, clientSettings, connectionCallbacks, onConnectionFailedListener);
        ExecutorService zza = com.google.android.gms.internal.wearable.zzp.zza().zza(2);
        zzkp zza2 = zzkp.zza(context);
        this.zzg = new zzgu();
        this.zzh = new zzgu();
        this.zzi = new zzgu();
        this.zzj = new zzgu();
        this.zzk = new zzgu();
        this.zzl = new zzgu();
        this.zzm = new zzgu();
        this.zzn = new zzgu();
        this.zzo = new zzgu();
        this.zzp = new zzgu();
        new zzgu();
        new zzgu();
        zza.getClass();
        this.zzf = zza;
        this.zzq = zza2;
        this.zzr = com.google.android.gms.internal.wearable.zzam.zza(new com.google.android.gms.internal.wearable.zzak() { // from class: com.google.android.gms.wearable.internal.zzke
            @Override // com.google.android.gms.internal.wearable.zzak
            public final /* synthetic */ Object zza() {
                int i = zzkf.zze;
                File file = new File(com.google.android.gms.internal.wearable.zzg.zza().zza(new File(com.google.android.gms.internal.wearable.zzg.zza().zza(context.getFilesDir(), "wearos_assets")), "streamtmp"));
                file.mkdirs();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
                return file;
            }
        });
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        if (!requiresGooglePlayServices()) {
            try {
                Bundle bundle = getContext().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 71);
                    sb.append("The Wear OS app is out of date. Requires API version 8600000 but found ");
                    sb.append(i);
                    Log.w("WearableClient", sb.toString());
                    Context context = getContext();
                    Context context2 = getContext();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    triggerNotAvailable(connectionProgressReportCallbacks, 6, com.google.android.gms.internal.wearable.zzl.zza(context, 0, intent, com.google.android.gms.internal.wearable.zzl.zza));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                triggerNotAvailable(connectionProgressReportCallbacks, 16, null);
                return;
            }
        }
        super.connect(connectionProgressReportCallbacks);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof zzgq ? (zzgq) queryLocalInterface : new zzgq(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.wearable.zzn.zzH;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 8600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServicePackage() {
        return this.zzq.zzb() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 30);
            sb.append("onPostInitHandler: statusCode ");
            sb.append(i);
            Log.v("WearableClient", sb.toString());
        }
        if (i == 0) {
            this.zzg.zza(iBinder);
            this.zzh.zza(iBinder);
            this.zzi.zza(iBinder);
            this.zzk.zza(iBinder);
            this.zzl.zza(iBinder);
            this.zzm.zza(iBinder);
            this.zzn.zza(iBinder);
            this.zzo.zza(iBinder);
            this.zzp.zza(iBinder);
            this.zzj.zza(iBinder);
            i = 0;
        }
        super.onPostInitHandler(i, iBinder, bundle, i2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return !this.zzq.zzb();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(BaseImplementation.ResultHolder resultHolder, CapabilityApi.CapabilityListener capabilityListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzp.zzb(this, resultHolder, capabilityListener, zzko.zzt(listenerHolder, intentFilterArr));
    }

    public final void zzB(BaseImplementation.ResultHolder resultHolder, ChannelApi.ChannelListener channelListener, ListenerHolder listenerHolder, String str, IntentFilter[] intentFilterArr) throws RemoteException {
        if (str == null) {
            this.zzi.zzb(this, resultHolder, channelListener, zzko.zzq(listenerHolder, intentFilterArr));
        } else {
            this.zzi.zzb(this, resultHolder, new zzix(str, channelListener), zzko.zzs(listenerHolder, str, intentFilterArr));
        }
    }

    public final void zzC(BaseImplementation.ResultHolder resultHolder, DataApi.DataListener dataListener) throws RemoteException {
        this.zzk.zzc(this, resultHolder, dataListener);
    }

    public final void zzD(BaseImplementation.ResultHolder resultHolder, MessageApi.MessageListener messageListener) throws RemoteException {
        this.zzl.zzc(this, resultHolder, messageListener);
    }

    public final void zzE(BaseImplementation.ResultHolder resultHolder, MessageClient.RpcService rpcService) throws RemoteException {
        this.zzm.zzc(this, resultHolder, rpcService);
    }

    public final void zzF(BaseImplementation.ResultHolder resultHolder, CapabilityApi.CapabilityListener capabilityListener) throws RemoteException {
        this.zzp.zzc(this, resultHolder, capabilityListener);
    }

    public final void zzG(BaseImplementation.ResultHolder resultHolder, ChannelApi.ChannelListener channelListener, String str) throws RemoteException {
        if (str == null) {
            this.zzi.zzc(this, resultHolder, channelListener);
        } else {
            this.zzi.zzc(this, resultHolder, new zzix(str, channelListener));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzp(BaseImplementation.ResultHolder resultHolder, PutDataRequest putDataRequest) throws RemoteException {
        File file;
        Iterator<Map.Entry<String, Asset>> it = putDataRequest.getAssets().entrySet().iterator();
        while (it.hasNext()) {
            Asset value = it.next().getValue();
            if (value.zza() == null && value.getDigest() == null && value.getFd() == null && value.getUri() == null) {
                String valueOf = String.valueOf(putDataRequest.getUri());
                String valueOf2 = String.valueOf(value);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
                sb.append("Put for ");
                sb.append(valueOf);
                sb.append(" contains invalid asset: ");
                sb.append(valueOf2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        PutDataRequest zza = PutDataRequest.zza(putDataRequest.getUri());
        zza.setData(putDataRequest.getData());
        if (putDataRequest.isUrgent()) {
            zza.setUrgent();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Asset> entry : putDataRequest.getAssets().entrySet()) {
            Asset value2 = entry.getValue();
            if (value2.zza() != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(value2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 54 + String.valueOf(valueOf4).length() + 7 + String.valueOf(valueOf5).length());
                        sb2.append("processAssets: replacing data with FD in asset: ");
                        sb2.append(valueOf3);
                        sb2.append(" read:");
                        sb2.append(valueOf4);
                        sb2.append(" write:");
                        sb2.append(valueOf5);
                        Log.d("WearableClient", sb2.toString());
                    }
                    zza.putAsset(entry.getKey(), Asset.createFromFd(createPipe[0]));
                    FutureTask futureTask = new FutureTask(new zzkb(this, createPipe[1], value2.zza()));
                    arrayList.add(futureTask);
                    this.zzf.submit(futureTask);
                } catch (IOException e) {
                    String valueOf6 = String.valueOf(putDataRequest);
                    String.valueOf(valueOf6);
                    throw new IllegalStateException("Unable to create ParcelFileDescriptor for asset in request: ".concat(String.valueOf(valueOf6)), e);
                }
            } else {
                File file2 = null;
                if (value2.getUri() != null) {
                    try {
                        zza.putAsset(entry.getKey(), Asset.createFromFd(getContext().getContentResolver().openFileDescriptor(value2.getUri(), "r")));
                    } catch (FileNotFoundException unused) {
                        new zzjv(resultHolder, arrayList).zzh(new zzil(WearableStatusCodes.ASSET_UNAVAILABLE, null));
                        String valueOf7 = String.valueOf(value2.getUri());
                        String.valueOf(valueOf7);
                        Log.w("WearableClient", "Couldn't resolve asset URI: ".concat(String.valueOf(valueOf7)));
                        return;
                    }
                } else if (value2.getFd() != null) {
                    try {
                        file = com.google.android.gms.internal.wearable.zzr.zza(value2.getFd(), (File) this.zzr.zza());
                        try {
                            try {
                                zza.putAsset(entry.getKey(), Asset.createFromFd(ParcelFileDescriptor.open(file, 268435456)));
                                if (file != null) {
                                    file.delete();
                                }
                            } catch (Throwable th) {
                                th = th;
                                file2 = file;
                                if (file2 != null) {
                                    file2.delete();
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            Log.w("WearableClient", "DataItem asset copy failed", e);
                            new zzjv(resultHolder, arrayList).zzh(new zzil(WearableStatusCodes.ASSET_UNAVAILABLE, null));
                            String valueOf8 = String.valueOf(value2.getFd());
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf8).length() + 39);
                            sb3.append("Couldn't asset from a file descriptor: ");
                            sb3.append(valueOf8);
                            Log.w("WearableClient", sb3.toString());
                            if (file != null) {
                                file.delete();
                                return;
                            }
                            return;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        file = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (file2 != null) {
                        }
                        throw th;
                    }
                } else {
                    zza.putAsset(entry.getKey(), value2);
                }
            }
        }
        ((zzgq) getService()).zzd(new zzjv(resultHolder, arrayList), zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq(BaseImplementation.ResultHolder resultHolder, String str, String str2, byte[] bArr) throws RemoteException {
        ((zzgq) getService()).zzi(new zzjy(resultHolder), str, str2, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr(BaseImplementation.ResultHolder resultHolder, Asset asset) throws RemoteException {
        ((zzgq) getService()).zzk(new zzjr(resultHolder), asset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzs(BaseImplementation.ResultHolder resultHolder, String str, String str2) throws RemoteException {
        ((zzgq) getService()).zzv(new zzju(resultHolder), str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt(BaseImplementation.ResultHolder resultHolder, String str) throws RemoteException {
        ((zzgq) getService()).zzw(new zzjg(resultHolder), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzu(BaseImplementation.ResultHolder resultHolder, String str, int i) throws RemoteException {
        ((zzgq) getService()).zzx(new zzjh(resultHolder), str, i);
    }

    public final void zzv(BaseImplementation.ResultHolder resultHolder, String str, Uri uri, boolean z) {
        try {
            ExecutorService executorService = this.zzf;
            if (str == null) {
                throw null;
            }
            if (uri == null) {
                throw null;
            }
            executorService.execute(new zzkc(this, uri, resultHolder, z, str));
        } catch (RuntimeException e) {
            resultHolder.setFailedResult(new Status(8));
            throw e;
        }
    }

    public final void zzw(BaseImplementation.ResultHolder resultHolder, String str, Uri uri, long j, long j2) {
        try {
            ExecutorService executorService = this.zzf;
            if (str == null) {
                throw null;
            }
            if (uri == null) {
                throw null;
            }
            boolean z = true;
            com.google.android.gms.internal.wearable.zzai.zzc(j >= 0, "startOffset is negative: %s", j);
            if (j2 < -1) {
                z = false;
            }
            com.google.android.gms.internal.wearable.zzai.zzc(z, "invalid length: %s", j2);
            executorService.execute(new zzkd(this, uri, resultHolder, str, j, j2));
        } catch (RuntimeException e) {
            resultHolder.setFailedResult(new Status(8));
            throw e;
        }
    }

    public final void zzx(BaseImplementation.ResultHolder resultHolder, DataApi.DataListener dataListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzk.zzb(this, resultHolder, dataListener, zzko.zzl(listenerHolder, intentFilterArr));
    }

    public final void zzy(BaseImplementation.ResultHolder resultHolder, MessageApi.MessageListener messageListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzl.zzb(this, resultHolder, messageListener, zzko.zzm(listenerHolder, intentFilterArr));
    }

    public final void zzz(BaseImplementation.ResultHolder resultHolder, MessageClient.RpcService rpcService, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzm.zzb(this, resultHolder, rpcService, zzko.zzp(listenerHolder, intentFilterArr));
    }
}
