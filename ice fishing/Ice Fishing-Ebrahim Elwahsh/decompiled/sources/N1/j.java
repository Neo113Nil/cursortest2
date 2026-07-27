package N1;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final double f1964a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1965b = 0;

    public static double a(long j9) {
        return (SystemClock.elapsedRealtimeNanos() - j9) * f1964a;
    }
}
