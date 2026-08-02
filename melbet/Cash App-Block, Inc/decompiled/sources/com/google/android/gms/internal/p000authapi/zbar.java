package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.boost.db.Reward$Adapter;

/* loaded from: classes4.dex */
public final class zbar extends GmsClient {
    public final Bundle zba;

    public zbar(Context context, Looper looper, Reward$Adapter reward$Adapter, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
        this.zba = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof zbw ? (zbw) queryLocalInterface : new zbw(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zbas.zbi;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
