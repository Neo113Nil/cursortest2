package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class tf6 implements mm6 {
    public final CoroutineContext a;

    public tf6(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
