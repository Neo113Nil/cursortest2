package L0;

import java.util.concurrent.locks.LockSupport;

/* renamed from: L0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045c extends AbstractC0043a {

    /* renamed from: h, reason: collision with root package name */
    public final Thread f649h;

    /* renamed from: i, reason: collision with root package name */
    public final I f650i;

    public C0045c(v0.i iVar, Thread thread, I i2) {
        super(iVar, true);
        this.f649h = thread;
        this.f650i = i2;
    }

    @Override // L0.a0
    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f649h;
        if (E0.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
