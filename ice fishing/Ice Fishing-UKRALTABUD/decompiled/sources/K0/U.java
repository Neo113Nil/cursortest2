package K0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class U extends a0 {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f482h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Q q2) {
        super(true);
        boolean z2 = true;
        H(q2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a0.f499g;
        InterfaceC0033i interfaceC0033i = (InterfaceC0033i) atomicReferenceFieldUpdater.get(this);
        C0034j c0034j = interfaceC0033i instanceof C0034j ? (C0034j) interfaceC0033i : null;
        if (c0034j != null) {
            a0 n2 = c0034j.n();
            while (!n2.B()) {
                InterfaceC0033i interfaceC0033i2 = (InterfaceC0033i) atomicReferenceFieldUpdater.get(n2);
                C0034j c0034j2 = interfaceC0033i2 instanceof C0034j ? (C0034j) interfaceC0033i2 : null;
                if (c0034j2 != null) {
                    n2 = c0034j2.n();
                }
            }
            this.f482h = z2;
        }
        z2 = false;
        this.f482h = z2;
    }

    @Override // K0.a0
    public final boolean B() {
        return this.f482h;
    }

    @Override // K0.a0
    public final boolean C() {
        return true;
    }
}
