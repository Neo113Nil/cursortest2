package kotlinx.coroutines;

import defpackage.nbw;
import defpackage.qq6;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class e extends a {
    public static final e d = new e();

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        nbw nbwVar = (nbw) coroutineContext.get(nbw.d);
        if (nbwVar != null) {
            nbwVar.c = true;
        } else {
            qq6.d("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // kotlinx.coroutines.a
    public final a I0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
