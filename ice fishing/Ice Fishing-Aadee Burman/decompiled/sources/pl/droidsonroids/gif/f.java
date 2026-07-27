package pl.droidsonroids.gif;

import java.lang.Thread;

/* loaded from: classes2.dex */
public abstract class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final c f39967n;

    public f(c cVar) {
        this.f39967n = cVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            GifInfoHandle gifInfoHandle = this.f39967n.f39965z;
            synchronized (gifInfoHandle) {
                z3 = gifInfoHandle.f39945a == 0;
            }
            if (z3) {
                return;
            }
            a();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
