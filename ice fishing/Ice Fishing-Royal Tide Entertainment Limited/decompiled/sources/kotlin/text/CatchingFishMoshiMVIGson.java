package kotlin.text;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishMoshiMVIGson implements ServiceConnection {
    public final long CatchingFishParcelableFAB;
    public boolean CatchingFishSnackbar = false;
    public final LinkedBlockingQueue CatchingFishCoroutine = new LinkedBlockingQueue(1);

    public CatchingFishMoshiMVIGson(long j) {
        this.CatchingFishParcelableFAB = j;
    }

    public final IBinder CatchingFishParcelableFAB() {
        if (this.CatchingFishSnackbar) {
            throw new IllegalStateException();
        }
        this.CatchingFishSnackbar = true;
        return (IBinder) this.CatchingFishCoroutine.poll(this.CatchingFishParcelableFAB, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.CatchingFishCoroutine.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
