package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zad;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.boost.db.Reward$Adapter;

/* loaded from: classes.dex */
public final class zau extends GmsClient {
    public final TelemetryLoggingOptions zaa;

    public zau(Context context, Looper looper, Reward$Adapter reward$Adapter, TelemetryLoggingOptions telemetryLoggingOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
        this.zaa = telemetryLoggingOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof zak ? (zak) queryLocalInterface : new zak(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zad.zac;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        TelemetryLoggingOptions telemetryLoggingOptions = this.zaa;
        telemetryLoggingOptions.getClass();
        Bundle bundle = new Bundle();
        String str = telemetryLoggingOptions.zab;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
