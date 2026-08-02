package kotlin;

import kotlin.Result;

/* loaded from: classes9.dex */
public abstract class b {
    public static final Result.Failure a(Throwable th) {
        return new Result.Failure(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
