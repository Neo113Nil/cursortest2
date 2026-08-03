package cd;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: g, reason: collision with root package name */
    public final transient Object f1334g;

    public a(bd.c cVar) {
        super("Flow was aborted, no more elements needed");
        this.f1334g = cVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
