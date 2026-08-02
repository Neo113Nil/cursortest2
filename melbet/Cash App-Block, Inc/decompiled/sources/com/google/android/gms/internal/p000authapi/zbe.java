package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.auth.api.zbd;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.squareup.cash.boost.db.Reward$Adapter;

/* loaded from: classes4.dex */
public final class zbe extends GmsClient {
    public final zbd zba;

    /* JADX WARN: Multi-variable type inference failed */
    public zbe(Context context, Looper looper, Reward$Adapter reward$Adapter, zbd zbdVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
        zbdVar = zbdVar == null ? zbd.zba : zbdVar;
        zbc zbcVar = new zbc(0, (boolean) (0 == true ? 1 : 0));
        zbcVar.zba = Boolean.FALSE;
        zbd zbdVar2 = zbd.zba;
        zbdVar.getClass();
        zbcVar.zba = Boolean.valueOf(zbdVar.zbc);
        zbcVar.zbb = zbdVar.zbd;
        zbcVar.zbb = zbat.zba();
        this.zba = new zbd(zbcVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbf ? (zbf) queryLocalInterface : new zbf(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        zbd zbdVar = this.zba;
        zbdVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", zbdVar.zbc);
        bundle.putString("log_session_id", zbdVar.zbd);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
