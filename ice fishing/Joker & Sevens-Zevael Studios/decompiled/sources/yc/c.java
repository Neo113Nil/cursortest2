package yc;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: j, reason: collision with root package name */
    public final Thread f8834j;

    /* renamed from: k, reason: collision with root package name */
    public final s0 f8835k;

    public c(fc.i iVar, Thread thread, s0 s0Var) {
        super(iVar, true);
        this.f8834j = thread;
        this.f8835k = s0Var;
    }

    @Override // yc.k1
    public final void x(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f8834j;
        if (pc.j.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
