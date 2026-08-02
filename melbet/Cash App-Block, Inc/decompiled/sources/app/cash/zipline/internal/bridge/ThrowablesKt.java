package app.cash.zipline.internal.bridge;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public abstract class ThrowablesKt {
    public static final CancellationException theOnlyCancellationException = new CancellationException("canceled");

    public static final CancellationException getTheOnlyCancellationException() {
        return theOnlyCancellationException;
    }
}
