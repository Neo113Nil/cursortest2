package pl.droidsonroids.gif;

import java.lang.Thread;

/* loaded from: classes2.dex */
public abstract class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final c f39970n;

    public f(c cVar) {
        this.f39970n = cVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            GifInfoHandle gifInfoHandle = this.f39970n.f39968z;
            synchronized (gifInfoHandle) {
                z3 = gifInfoHandle.f39948a == 0;
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
