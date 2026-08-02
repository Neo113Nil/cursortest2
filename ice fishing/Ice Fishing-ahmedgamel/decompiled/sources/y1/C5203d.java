package y1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import m.R0;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5203d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f41892e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41893a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f41894b;

    /* renamed from: c, reason: collision with root package name */
    public final R0 f41895c;

    /* renamed from: d, reason: collision with root package name */
    public final float f41896d;

    static {
        f41892e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C5203d(Context context) {
        this.f41896d = f41892e;
        this.f41893a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f41894b = activityManager;
        this.f41895c = new R0(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f41896d = 0.0f;
    }
}
