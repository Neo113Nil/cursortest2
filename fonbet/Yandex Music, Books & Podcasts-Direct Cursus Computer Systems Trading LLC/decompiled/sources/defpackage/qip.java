package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public final class qip extends zwf {
    public final AtomicIntegerFieldUpdater a;

    public qip(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.zwf
    public final boolean Y(sip sipVar) {
        return this.a.compareAndSet(sipVar, 0, -1);
    }

    @Override // defpackage.zwf
    public final void Z(sip sipVar) {
        this.a.set(sipVar, 0);
    }
}
