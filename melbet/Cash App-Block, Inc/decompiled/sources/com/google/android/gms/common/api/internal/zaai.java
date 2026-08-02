package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzae;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
public final class zaai implements BaseGmsClient.ConnectionProgressReportCallbacks {
    public final WeakReference zaa;
    public final Api zab;
    public final boolean zac;

    public zaai(zaar zaarVar, Api api, boolean z) {
        this.zaa = new WeakReference(zaarVar);
        this.zab = api;
        this.zac = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        zaar zaarVar = (zaar) this.zaa.get();
        if (zaarVar == null) {
            return;
        }
        Lock lock = zaarVar.zab;
        zzae.checkState("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == zaarVar.zaa.zag.zao);
        lock.lock();
        try {
            if (zaarVar.zaI(0)) {
                if (!connectionResult.isSuccess()) {
                    zaarVar.zaC(connectionResult, this.zab, this.zac);
                }
                if (zaarVar.zaz()) {
                    zaarVar.zaA();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
