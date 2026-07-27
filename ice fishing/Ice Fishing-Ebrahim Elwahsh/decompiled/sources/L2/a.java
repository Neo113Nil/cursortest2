package L2;

import O2.w;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public boolean f1708n = false;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedBlockingQueue f1709u = new LinkedBlockingQueue();

    public final IBinder a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        w.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f1708n) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f1708n = true;
        IBinder iBinder = (IBinder) this.f1709u.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1709u.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
