package U3;

import F.n;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f3293e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f3294a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f3295b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3296c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f3297d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f3295b = str;
        this.f3296c = i;
        this.f3297d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f3293e.newThread(new n(9, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f3295b + " Thread #" + this.f3294a.getAndIncrement());
        return newThread;
    }
}
