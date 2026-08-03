package fd;

import dd.x;
import java.util.concurrent.Executor;
import yc.t0;
import yc.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends t0 implements Executor {

    /* renamed from: i, reason: collision with root package name */
    public static final d f2377i = new d();

    /* renamed from: j, reason: collision with root package name */
    public static final u f2378j;

    static {
        u uVar = m.f2394i;
        int i10 = x.f1888a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j3 = dd.a.j("kotlinx.coroutines.io.parallelism", i10, 12);
        uVar.getClass();
        if (j3 < 1) {
            throw new IllegalArgumentException(a4.d.g("Expected positive parallelism level, but got ", j3).toString());
        }
        if (j3 < l.f2389d) {
            if (j3 < 1) {
                throw new IllegalArgumentException(a4.d.g("Expected positive parallelism level, but got ", j3).toString());
            }
            uVar = new dd.j(uVar, j3);
        }
        f2378j = uVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        w(fc.j.f2348g, runnable);
    }

    @Override // yc.u
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // yc.u
    public final void w(fc.i iVar, Runnable runnable) {
        f2378j.w(iVar, runnable);
    }

    @Override // yc.u
    public final void x(fc.i iVar, Runnable runnable) {
        f2378j.x(iVar, runnable);
    }
}
