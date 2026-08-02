package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class hfm extends CancellationException {
    public hfm(long j) {
        super(dfi.e(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(y2x.i);
        return this;
    }
}
