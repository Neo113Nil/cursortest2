package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.SignInClientImpl;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
public final class zaap implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ zaar zaa;

    public /* synthetic */ zaap(zaar zaarVar) {
        this.zaa = zaarVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zaar zaarVar = this.zaa;
        zzae.checkNotNull(zaarVar.zar);
        SignInClientImpl signInClientImpl = zaarVar.zak;
        zzae.checkNotNull(signInClientImpl);
        signInClientImpl.zaa(new zaao(zaarVar));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zaar zaarVar = this.zaa;
        Lock lock = zaarVar.zab;
        Lock lock2 = zaarVar.zab;
        lock.lock();
        try {
            if (zaarVar.zal && !connectionResult.hasResolution()) {
                zaarVar.zaD();
                zaarVar.zaA();
            } else {
                zaarVar.zaF(connectionResult);
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
