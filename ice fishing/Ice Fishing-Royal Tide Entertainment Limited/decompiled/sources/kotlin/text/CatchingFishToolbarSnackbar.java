package kotlin.text;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class CatchingFishToolbarSnackbar {
    public static final ReentrantLock CatchingFishCoroutine = new ReentrantLock();
    public static CatchingFishToolbarSnackbar CatchingFishReduxKtor;
    public final ReentrantLock CatchingFishParcelableFAB = new ReentrantLock();
    public final SharedPreferences CatchingFishSnackbar;

    public CatchingFishToolbarSnackbar(Context context) {
        this.CatchingFishSnackbar = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String CatchingFishParcelableFAB(String str) {
        ReentrantLock reentrantLock = this.CatchingFishParcelableFAB;
        reentrantLock.lock();
        try {
            return this.CatchingFishSnackbar.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
