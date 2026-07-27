package W7;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class a extends CancellationException {

    /* renamed from: n, reason: collision with root package name */
    public final transient V7.i f3413n;

    public a(V7.i iVar) {
        super("Flow was aborted, no more elements needed");
        this.f3413n = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
