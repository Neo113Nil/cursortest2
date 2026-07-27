package S7;

import java.util.concurrent.locks.LockSupport;
import z7.InterfaceC5272i;

/* renamed from: S7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0385c extends AbstractC0383a {

    /* renamed from: w, reason: collision with root package name */
    public final Thread f2945w;

    /* renamed from: x, reason: collision with root package name */
    public final P f2946x;

    public C0385c(InterfaceC5272i interfaceC5272i, Thread thread, P p9) {
        super(interfaceC5272i, true);
        this.f2945w = thread;
        this.f2946x = p9;
    }

    @Override // S7.h0
    public final void h(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f2945w;
        if (kotlin.jvm.internal.h.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
