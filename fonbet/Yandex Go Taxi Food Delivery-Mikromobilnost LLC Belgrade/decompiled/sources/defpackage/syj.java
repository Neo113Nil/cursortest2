package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes9.dex */
public final class syj implements Executor {
    public final jse a;

    public syj(jse jseVar) {
        this.a = jseVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        jse jseVar = this.a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        if (bvf0.R(jseVar, emptyCoroutineContext)) {
            bvf0.Q(emptyCoroutineContext, jseVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
