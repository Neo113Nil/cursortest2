package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class te6 implements Runnable {
    public final Enum a;
    public final re6 b;
    public final we6 c;

    /* JADX WARN: Multi-variable type inference failed */
    public te6(Executor executor, re6 re6Var, we6 we6Var) {
        this.a = (Enum) executor;
        this.b = re6Var;
        this.c = we6Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, java.util.concurrent.Executor] */
    public final void a() {
        try {
            this.a.execute(this);
        } catch (Throwable th) {
            we6.d.log(Level.INFO, "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.m(this.c);
    }
}
