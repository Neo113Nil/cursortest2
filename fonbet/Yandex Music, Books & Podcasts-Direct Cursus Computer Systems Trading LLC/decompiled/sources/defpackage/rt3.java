package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class rt3 extends CancellationException {
    public static final rt3 a = new rt3();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(y2x.i);
        return this;
    }
}
