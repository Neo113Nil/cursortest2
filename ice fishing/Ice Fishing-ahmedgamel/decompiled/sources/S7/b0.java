package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class b0 extends h0 implements InterfaceC0400n {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3027v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0() {
        super(true);
        boolean z6 = true;
        F(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0.f3054u;
        InterfaceC0396j interfaceC0396j = (InterfaceC0396j) atomicReferenceFieldUpdater.get(this);
        C0397k c0397k = interfaceC0396j instanceof C0397k ? (C0397k) interfaceC0396j : null;
        if (c0397k != null) {
            h0 h3 = c0397k.h();
            while (!h3.y()) {
                InterfaceC0396j interfaceC0396j2 = (InterfaceC0396j) atomicReferenceFieldUpdater.get(h3);
                C0397k c0397k2 = interfaceC0396j2 instanceof C0397k ? (C0397k) interfaceC0396j2 : null;
                if (c0397k2 != null) {
                    h3 = c0397k2.h();
                }
            }
            this.f3027v = z6;
        }
        z6 = false;
        this.f3027v = z6;
    }

    @Override // S7.h0
    public final boolean A() {
        return true;
    }

    @Override // S7.h0
    public final boolean y() {
        return this.f3027v;
    }
}
