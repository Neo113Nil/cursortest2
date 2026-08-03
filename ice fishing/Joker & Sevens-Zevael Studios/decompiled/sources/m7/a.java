package m7;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f4932e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f4933a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f4934b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4935c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f4936d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f4934b = str;
        this.f4935c = i10;
        this.f4936d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f4932e.newThread(new a1.d(8, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f4934b + " Thread #" + this.f4933a.getAndIncrement());
        return newThread;
    }
}
