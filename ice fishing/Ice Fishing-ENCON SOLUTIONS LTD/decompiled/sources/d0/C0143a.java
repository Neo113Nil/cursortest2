package d0;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.i;
import y.Q;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0143a f2826a = new C0143a();

    public final Q a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        i.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        i.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return Q.a(windowInsets, null);
    }
}
