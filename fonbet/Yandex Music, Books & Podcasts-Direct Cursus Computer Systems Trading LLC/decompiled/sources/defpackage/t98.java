package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class t98 extends Exception {
    public final Throwable a;

    public t98(Throwable th, a aVar, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + aVar + " threw an exception, context = " + coroutineContext, th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
