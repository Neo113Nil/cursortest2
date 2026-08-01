package h;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3219a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3220b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final o f3221c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f3222d;

    public n(o oVar) {
        this.f3221c = oVar;
    }

    public final void a() {
        synchronized (this.f3219a) {
            try {
                Runnable runnable = (Runnable) this.f3220b.poll();
                this.f3222d = runnable;
                if (runnable != null) {
                    this.f3221c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3219a) {
            try {
                this.f3220b.add(new F.l(this, 1, runnable));
                if (this.f3222d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
