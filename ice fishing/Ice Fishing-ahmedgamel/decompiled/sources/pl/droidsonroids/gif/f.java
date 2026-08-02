package pl.droidsonroids.gif;

import java.lang.Thread;

/* loaded from: classes2.dex */
public abstract class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final c f40017n;

    public f(c cVar) {
        this.f40017n = cVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        try {
            GifInfoHandle gifInfoHandle = this.f40017n.f40015z;
            synchronized (gifInfoHandle) {
                z6 = gifInfoHandle.f39995a == 0;
            }
            if (z6) {
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
