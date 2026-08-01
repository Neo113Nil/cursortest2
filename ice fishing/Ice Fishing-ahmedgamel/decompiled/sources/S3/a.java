package S3;

import F.n;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f2854e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f2855a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f2856b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2857c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f2858d;

    public a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f2856b = str;
        this.f2857c = i;
        this.f2858d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f2854e.newThread(new n(8, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f2856b + " Thread #" + this.f2855a.getAndIncrement());
        return newThread;
    }
}
