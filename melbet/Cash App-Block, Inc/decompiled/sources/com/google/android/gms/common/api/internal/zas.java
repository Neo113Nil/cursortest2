package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes4.dex */
public final class zas implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api zaa;
    public final boolean zab;
    public zabd zac;

    public zas(Api api, boolean z) {
        this.zaa = api;
        this.zab = z;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzae.checkNotNull(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.zac.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Api api = this.zaa;
        boolean z = this.zab;
        zzae.checkNotNull(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        zabd zabdVar = this.zac;
        zabdVar.zai.lock();
        try {
            zabdVar.zan.zag(connectionResult, api, z);
        } finally {
            zabdVar.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzae.checkNotNull(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.zac.onConnectionSuspended(i);
    }
}
