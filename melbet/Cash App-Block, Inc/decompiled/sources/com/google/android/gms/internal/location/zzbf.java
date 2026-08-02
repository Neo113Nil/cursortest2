package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Looper;
import coil3.size.DimensionKt;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zau;
import com.google.android.gms.internal.measurement.zzku;
import com.squareup.cash.boost.db.Reward$Adapter;

/* loaded from: classes.dex */
public final class zzbf extends DimensionKt {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzbf(int i) {
        this.$r8$classId = i;
    }

    @Override // coil3.size.DimensionKt
    public GmsClient buildClient(Context context, Looper looper, Reward$Adapter reward$Adapter, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        switch (this.$r8$classId) {
            case 2:
                return new zzku(context, looper, 51, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
            default:
                return super.buildClient(context, looper, reward$Adapter, obj, connectionCallbacks, onConnectionFailedListener);
        }
    }

    @Override // coil3.size.DimensionKt
    public /* synthetic */ GmsClient buildClient$1(Context context, Looper looper, Reward$Adapter reward$Adapter, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        switch (this.$r8$classId) {
            case 0:
                return new zzdz(context, looper, reward$Adapter, connectionCallbacks, onConnectionFailedListener);
            case 1:
                return new zau(context, looper, reward$Adapter, (TelemetryLoggingOptions) obj, connectionCallbacks, onConnectionFailedListener);
            default:
                return super.buildClient$1(context, looper, reward$Adapter, obj, connectionCallbacks, onConnectionFailedListener);
        }
    }
}
