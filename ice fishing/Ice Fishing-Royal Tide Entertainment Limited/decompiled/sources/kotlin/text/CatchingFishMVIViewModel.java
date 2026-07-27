package kotlin.text;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class CatchingFishMVIViewModel implements ServiceConnection {
    public boolean CatchingFishParcelableFAB = false;
    public final LinkedBlockingQueue CatchingFishSnackbar = new LinkedBlockingQueue();

    public final IBinder CatchingFishParcelableFAB() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        CatchingFishToastHiltBundle.CatchingFishUnitTesting("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.CatchingFishParcelableFAB) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.CatchingFishParcelableFAB = true;
        IBinder iBinder = (IBinder) this.CatchingFishSnackbar.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.CatchingFishSnackbar.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
