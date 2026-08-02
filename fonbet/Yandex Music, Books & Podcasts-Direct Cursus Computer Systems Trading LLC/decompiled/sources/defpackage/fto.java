package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes5.dex */
public final class fto extends d6 implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = d6.c;
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.b = null;
        }
    }
}
