package w1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import u1.u;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5151d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f41587e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41588a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f41589b;

    /* renamed from: c, reason: collision with root package name */
    public final u f41590c;

    /* renamed from: d, reason: collision with root package name */
    public final float f41591d;

    static {
        f41587e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C5151d(Context context) {
        this.f41591d = f41587e;
        this.f41588a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f41589b = activityManager;
        this.f41590c = new u(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f41591d = 0.0f;
    }
}
