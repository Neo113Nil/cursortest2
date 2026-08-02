package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class fj4 extends CancellationException {
    public fj4() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (ve7.a()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
