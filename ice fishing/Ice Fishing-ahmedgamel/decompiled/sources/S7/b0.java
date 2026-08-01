package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class b0 extends h0 implements InterfaceC0396n {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2944v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0() {
        super(true);
        boolean z3 = true;
        F(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0.f2971u;
        InterfaceC0392j interfaceC0392j = (InterfaceC0392j) atomicReferenceFieldUpdater.get(this);
        C0393k c0393k = interfaceC0392j instanceof C0393k ? (C0393k) interfaceC0392j : null;
        if (c0393k != null) {
            h0 h9 = c0393k.h();
            while (!h9.y()) {
                InterfaceC0392j interfaceC0392j2 = (InterfaceC0392j) atomicReferenceFieldUpdater.get(h9);
                C0393k c0393k2 = interfaceC0392j2 instanceof C0393k ? (C0393k) interfaceC0392j2 : null;
                if (c0393k2 != null) {
                    h9 = c0393k2.h();
                }
            }
            this.f2944v = z3;
        }
        z3 = false;
        this.f2944v = z3;
    }

    @Override // S7.h0
    public final boolean A() {
        return true;
    }

    @Override // S7.h0
    public final boolean y() {
        return this.f2944v;
    }
}
