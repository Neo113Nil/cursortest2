package w1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import l.C4648e;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5146d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f41649e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41650a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f41651b;

    /* renamed from: c, reason: collision with root package name */
    public final C4648e f41652c;

    /* renamed from: d, reason: collision with root package name */
    public final float f41653d;

    static {
        f41649e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C5146d(Context context) {
        this.f41653d = f41649e;
        this.f41650a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f41651b = activityManager;
        this.f41652c = new C4648e(11, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f41653d = 0.0f;
    }
}
