package E1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient D1.e f310a;

    public a(D1.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f310a = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
