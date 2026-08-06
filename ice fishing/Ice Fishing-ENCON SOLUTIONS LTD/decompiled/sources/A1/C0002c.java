package A1;

import java.util.concurrent.locks.LockSupport;

/* renamed from: A1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c extends AbstractC0000a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f40d;

    /* renamed from: e, reason: collision with root package name */
    public final J f41e;

    public C0002c(l1.i iVar, Thread thread, J j2) {
        super(iVar, true);
        this.f40d = thread;
        this.f41e = j2;
    }

    @Override // A1.b0
    public final void p(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f40d;
        if (kotlin.jvm.internal.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
