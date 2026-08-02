package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class BlockingServiceConnection implements ServiceConnection {
    public boolean zza = false;
    public final LinkedBlockingQueue zzb = new LinkedBlockingQueue();

    public final IBinder getServiceWithTimeout() {
        com.google.android.gms.common.internal.zzae.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zza) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot call get on this connection more than once");
            return null;
        }
        this.zza = true;
        IBinder iBinder = (IBinder) this.zzb.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zzb.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
