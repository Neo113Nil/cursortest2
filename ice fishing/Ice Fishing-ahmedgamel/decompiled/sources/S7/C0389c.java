package S7;

import java.util.concurrent.locks.LockSupport;
import z7.InterfaceC5245i;

/* renamed from: S7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0389c extends AbstractC0387a {

    /* renamed from: w, reason: collision with root package name */
    public final Thread f3028w;

    /* renamed from: x, reason: collision with root package name */
    public final P f3029x;

    public C0389c(InterfaceC5245i interfaceC5245i, Thread thread, P p9) {
        super(interfaceC5245i, true);
        this.f3028w = thread;
        this.f3029x = p9;
    }

    @Override // S7.h0
    public final void h(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f3028w;
        if (kotlin.jvm.internal.h.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
