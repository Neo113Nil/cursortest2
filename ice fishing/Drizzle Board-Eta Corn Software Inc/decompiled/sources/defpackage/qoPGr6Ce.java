package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qoPGr6Ce extends CancellationException {
    public final transient Object NCTxEWno;

    public qoPGr6Ce(nd ndVar) {
        super("Flow was aborted, no more elements needed");
        this.NCTxEWno = ndVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
