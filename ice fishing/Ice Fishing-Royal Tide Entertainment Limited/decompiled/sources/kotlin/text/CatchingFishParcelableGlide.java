package kotlin.text;

import android.app.PendingIntent;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class CatchingFishParcelableGlide {
    public final CatchingFishCoroutinePayPal CatchingFishParcelableFAB;
    public final PendingIntent CatchingFishSnackbar;

    public CatchingFishParcelableGlide(CatchingFishCoroutinePayPal catchingFishCoroutinePayPal, PendingIntent pendingIntent) {
        if (catchingFishCoroutinePayPal == null && pendingIntent == null) {
            throw new IllegalStateException("AuthTabSessionToken must have either a session id or a callback (or both).");
        }
        this.CatchingFishParcelableFAB = catchingFishCoroutinePayPal;
        this.CatchingFishSnackbar = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishParcelableGlide) {
            CatchingFishParcelableGlide catchingFishParcelableGlide = (CatchingFishParcelableGlide) obj;
            PendingIntent pendingIntent = catchingFishParcelableGlide.CatchingFishSnackbar;
            PendingIntent pendingIntent2 = this.CatchingFishSnackbar;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                CatchingFishCoroutinePayPal catchingFishCoroutinePayPal = this.CatchingFishParcelableFAB;
                if (catchingFishCoroutinePayPal == null) {
                    throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
                }
                IBinder iBinder = ((CatchingFishMockkDagger) catchingFishCoroutinePayPal).CatchingFishEspressoTesting;
                CatchingFishCoroutinePayPal catchingFishCoroutinePayPal2 = catchingFishParcelableGlide.CatchingFishParcelableFAB;
                if (catchingFishCoroutinePayPal2 != null) {
                    return iBinder.equals(((CatchingFishMockkDagger) catchingFishCoroutinePayPal2).CatchingFishEspressoTesting);
                }
                throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.CatchingFishSnackbar;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        CatchingFishCoroutinePayPal catchingFishCoroutinePayPal = this.CatchingFishParcelableFAB;
        if (catchingFishCoroutinePayPal != null) {
            return ((CatchingFishMockkDagger) catchingFishCoroutinePayPal).CatchingFishEspressoTesting.hashCode();
        }
        throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
    }
}
