package D;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: D.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0284c {
    public static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
