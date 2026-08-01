package L1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class N extends T {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(K k2) {
        super(true);
        boolean z2 = true;
        t(k2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f548b;
        InterfaceC0006g interfaceC0006g = (InterfaceC0006g) atomicReferenceFieldUpdater.get(this);
        C0007h c0007h = interfaceC0006g instanceof C0007h ? (C0007h) interfaceC0006g : null;
        if (c0007h != null) {
            T n2 = c0007h.n();
            while (!n2.o()) {
                InterfaceC0006g interfaceC0006g2 = (InterfaceC0006g) atomicReferenceFieldUpdater.get(n2);
                C0007h c0007h2 = interfaceC0006g2 instanceof C0007h ? (C0007h) interfaceC0006g2 : null;
                if (c0007h2 != null) {
                    n2 = c0007h2.n();
                }
            }
            this.f535c = z2;
        }
        z2 = false;
        this.f535c = z2;
    }

    @Override // L1.T
    public final boolean o() {
        return this.f535c;
    }
}
