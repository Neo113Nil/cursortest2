package defpackage;

import android.os.Process;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* loaded from: classes3.dex */
public final class zo6 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a;
    public final ys0 b;

    public zo6(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ys0 ys0Var) {
        this.a = uncaughtExceptionHandler;
        this.b = ys0Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        thread.getClass();
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        stringWriter.append((CharSequence) "FATAL EXCEPTION: ");
        stringWriter.append((CharSequence) thread.getName());
        stringWriter.append('\n');
        stringWriter.append((CharSequence) "PID: ");
        stringWriter.append((CharSequence) String.valueOf(Process.myPid()));
        stringWriter.append('\n');
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        this.b.invoke(stringWriter2);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
