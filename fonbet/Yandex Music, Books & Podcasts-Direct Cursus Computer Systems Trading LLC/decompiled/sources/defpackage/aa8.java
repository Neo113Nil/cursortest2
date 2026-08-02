package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.g;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class aa8 implements Executor {
    public final a a;

    public aa8(a aVar) {
        this.a = aVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g gVar = g.a;
        a aVar = this.a;
        if (w98.c(aVar, gVar)) {
            w98.b(runnable, gVar, aVar);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
