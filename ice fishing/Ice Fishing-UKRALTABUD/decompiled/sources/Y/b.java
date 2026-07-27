package Y;

import E0.i;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import w.S;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1072a = new b();

    public final S a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        i.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        i.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return S.a(windowInsets, null);
    }
}
