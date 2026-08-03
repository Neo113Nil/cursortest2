package y4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public final Executor f8752h;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f8753i;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f8751g = new ArrayDeque();

    /* renamed from: j, reason: collision with root package name */
    public final Object f8754j = new Object();

    public l(Executor executor) {
        this.f8752h = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.f8751g.poll();
        this.f8753i = runnable;
        if (runnable != null) {
            this.f8752h.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f8754j) {
            try {
                this.f8751g.add(new dd.i(22, this, runnable));
                if (this.f8753i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
