package defpackage;

import android.os.Build;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class vp4 {
    public static long a() {
        return (Build.VERSION.SDK_INT < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000;
    }
}
