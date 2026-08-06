package A1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class V extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(S s2) {
        super(true);
        boolean z2 = true;
        G(s2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b0.f39b;
        InterfaceC0008i interfaceC0008i = (InterfaceC0008i) atomicReferenceFieldUpdater.get(this);
        C0009j c0009j = interfaceC0008i instanceof C0009j ? (C0009j) interfaceC0008i : null;
        if (c0009j != null) {
            b0 j2 = c0009j.j();
            while (!j2.A()) {
                InterfaceC0008i interfaceC0008i2 = (InterfaceC0008i) atomicReferenceFieldUpdater.get(j2);
                C0009j c0009j2 = interfaceC0008i2 instanceof C0009j ? (C0009j) interfaceC0008i2 : null;
                if (c0009j2 != null) {
                    j2 = c0009j2.j();
                }
            }
            this.f21c = z2;
        }
        z2 = false;
        this.f21c = z2;
    }

    @Override // A1.b0
    public final boolean A() {
        return this.f21c;
    }

    @Override // A1.b0
    public final boolean B() {
        return true;
    }
}
