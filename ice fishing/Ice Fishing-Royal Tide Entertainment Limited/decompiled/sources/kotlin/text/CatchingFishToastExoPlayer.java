package kotlin.text;

import android.app.PendingIntent;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class CatchingFishToastExoPlayer {
    public final CatchingFishMVILifecycle CatchingFishParcelableFAB;
    public final PendingIntent CatchingFishSnackbar;

    public CatchingFishToastExoPlayer(CatchingFishMVILifecycle catchingFishMVILifecycle, PendingIntent pendingIntent) {
        if (catchingFishMVILifecycle == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.CatchingFishParcelableFAB = catchingFishMVILifecycle;
        this.CatchingFishSnackbar = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishToastExoPlayer) {
            CatchingFishToastExoPlayer catchingFishToastExoPlayer = (CatchingFishToastExoPlayer) obj;
            PendingIntent pendingIntent = catchingFishToastExoPlayer.CatchingFishSnackbar;
            PendingIntent pendingIntent2 = this.CatchingFishSnackbar;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                CatchingFishMVILifecycle catchingFishMVILifecycle = this.CatchingFishParcelableFAB;
                if (catchingFishMVILifecycle == null) {
                    throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
                }
                IBinder asBinder = catchingFishMVILifecycle.asBinder();
                CatchingFishMVILifecycle catchingFishMVILifecycle2 = catchingFishToastExoPlayer.CatchingFishParcelableFAB;
                if (catchingFishMVILifecycle2 != null) {
                    return asBinder.equals(catchingFishMVILifecycle2.asBinder());
                }
                throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.CatchingFishSnackbar;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        CatchingFishMVILifecycle catchingFishMVILifecycle = this.CatchingFishParcelableFAB;
        if (catchingFishMVILifecycle != null) {
            return catchingFishMVILifecycle.asBinder().hashCode();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
