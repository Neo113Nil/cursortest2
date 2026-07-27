package kotlin.text;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class CatchingFishKtorMVIFAB {
    public static final long CatchingFishParcelableFAB;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        CatchingFishParcelableFAB = j;
    }
}
