package O3;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f2488e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f2489a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f2490b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2491c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f2492d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f2490b = str;
        this.f2491c = i;
        this.f2492d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f2488e.newThread(new D5.b(7, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f2490b + " Thread #" + this.f2489a.getAndIncrement());
        return newThread;
    }
}
