package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class p2 extends CancellationException {
    public final transient Object a;

    public p2(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
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
