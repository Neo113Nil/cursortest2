package com.gamericefishpro.space.s8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.gamericefishpro.space.v8.c0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class a implements ServiceConnection {
    public boolean d = false;
    public final LinkedBlockingQueue e = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.d) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.d = true;
        IBinder iBinder = (IBinder) this.e.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.e.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
