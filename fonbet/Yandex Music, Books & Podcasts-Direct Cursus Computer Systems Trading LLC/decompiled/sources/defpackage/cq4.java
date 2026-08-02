package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class cq4 implements AutoCloseable, mm6 {
    public final CoroutineContext a;

    public cq4(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        saf.B(this.a, null);
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }
}
