package D;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: D.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0283b {
    public static void a(Activity activity) {
        activity.finishAfterTransition();
    }

    public static void b(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }

    public static void e(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
