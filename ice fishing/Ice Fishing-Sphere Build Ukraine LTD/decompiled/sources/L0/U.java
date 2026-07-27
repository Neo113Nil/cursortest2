package L0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class U extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f630g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Q q2) {
        super(true);
        boolean z2 = true;
        H(q2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a0.f647f;
        InterfaceC0051i interfaceC0051i = (InterfaceC0051i) atomicReferenceFieldUpdater.get(this);
        C0052j c0052j = interfaceC0051i instanceof C0052j ? (C0052j) interfaceC0051i : null;
        if (c0052j != null) {
            a0 n2 = c0052j.n();
            while (!n2.B()) {
                InterfaceC0051i interfaceC0051i2 = (InterfaceC0051i) atomicReferenceFieldUpdater.get(n2);
                C0052j c0052j2 = interfaceC0051i2 instanceof C0052j ? (C0052j) interfaceC0051i2 : null;
                if (c0052j2 != null) {
                    n2 = c0052j2.n();
                }
            }
            this.f630g = z2;
        }
        z2 = false;
        this.f630g = z2;
    }

    @Override // L0.a0
    public final boolean B() {
        return this.f630g;
    }

    @Override // L0.a0
    public final boolean C() {
        return true;
    }
}
