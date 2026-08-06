package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class GWasM1elztuh extends CancellationException {
    public final transient Object OOA6hdeuvCS;

    public GWasM1elztuh(ms msVar) {
        super("Flow was aborted, no more elements needed");
        this.OOA6hdeuvCS = msVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
