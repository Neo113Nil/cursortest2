package a7;

import java.lang.Thread;

/* renamed from: a7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0445d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f4358a;

    public C0445d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f4358a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof InterruptedException) {
            thread.interrupt();
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4358a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
