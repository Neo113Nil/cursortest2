package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.squareup.cash.boost.db.Reward$Adapter;

/* loaded from: classes.dex */
public final class zzdz extends GmsClient {
    public final SimpleArrayMap zzf;
    public final SimpleArrayMap zzg;
    public final SimpleArrayMap zzh;

    public zzdz(Context context, Looper looper, Reward$Adapter reward$Adapter, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
        this.zzf = new SimpleArrayMap(0);
        this.zzg = new SimpleArrayMap(0);
        this.zzh = new SimpleArrayMap(0);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzu ? (zzu) queryLocalInterface : new zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zzo.zzp;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzw(ListenerHolder.ListenerKey listenerKey, boolean z, TaskCompletionSource taskCompletionSource) {
        Feature feature;
        synchronized (this.zzg) {
            try {
                zzdv zzdvVar = (zzdv) this.zzg.remove(listenerKey);
                if (zzdvVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzdvVar.zzg();
                if (z) {
                    Feature[] availableFeatures = getAvailableFeatures();
                    if (availableFeatures != null) {
                        int i = 0;
                        while (true) {
                            if (i >= availableFeatures.length) {
                                feature = null;
                                break;
                            }
                            feature = availableFeatures[i];
                            if ("location_updates_with_callback".equals(feature.zza)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (feature != null && feature.getVersion() >= 1) {
                            zzu zzuVar = (zzu) getService();
                            int identityHashCode = System.identityHashCode(zzdvVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                            sb.append("ILocationCallback@");
                            sb.append(identityHashCode);
                            zzuVar.zzx(zzee.zzb(null, zzdvVar, sb.toString()), new zzdj(Boolean.TRUE, taskCompletionSource));
                        }
                    }
                    ((zzu) getService()).zzv(new zzei(2, null, null, zzdvVar, null, new zzdn(taskCompletionSource), null));
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
