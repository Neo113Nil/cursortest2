package kotlin.text;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class CatchingFishIntentLayout {
    public static final AtomicInteger CatchingFishParcelableFAB = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean CatchingFishParcelableFAB(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !CatchingFishLifecycleJUnit.CatchingFishPayPal(resources.getDrawable(i, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
