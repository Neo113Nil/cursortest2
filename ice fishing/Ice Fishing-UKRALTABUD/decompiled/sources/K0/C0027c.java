package K0;

import java.util.concurrent.locks.LockSupport;

/* renamed from: K0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027c extends AbstractC0025a {

    /* renamed from: i, reason: collision with root package name */
    public final Thread f501i;

    /* renamed from: j, reason: collision with root package name */
    public final I f502j;

    public C0027c(v0.i iVar, Thread thread, I i2) {
        super(iVar, true);
        this.f501i = thread;
        this.f502j = i2;
    }

    @Override // K0.a0
    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f501i;
        if (E0.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
