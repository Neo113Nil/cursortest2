package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a90 extends CancellationException {
    public a90() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
