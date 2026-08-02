package B7;

import S7.AbstractC0406u;
import S7.C0393g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z7.C5241e;
import z7.InterfaceC5240d;
import z7.InterfaceC5242f;
import z7.InterfaceC5243g;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public abstract class c extends a {
    private final InterfaceC5245i _context;
    private transient InterfaceC5240d intercepted;

    public c(InterfaceC5240d interfaceC5240d, InterfaceC5245i interfaceC5245i) {
        super(interfaceC5240d);
        this._context = interfaceC5245i;
    }

    @Override // z7.InterfaceC5240d
    public InterfaceC5245i getContext() {
        InterfaceC5245i interfaceC5245i = this._context;
        kotlin.jvm.internal.h.b(interfaceC5245i);
        return interfaceC5245i;
    }

    public final InterfaceC5240d intercepted() {
        InterfaceC5240d interfaceC5240d = this.intercepted;
        if (interfaceC5240d != null) {
            return interfaceC5240d;
        }
        InterfaceC5242f interfaceC5242f = (InterfaceC5242f) getContext().m(C5241e.f42240n);
        InterfaceC5240d hVar = interfaceC5242f != null ? new X7.h((AbstractC0406u) interfaceC5242f, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // B7.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC5240d interfaceC5240d = this.intercepted;
        if (interfaceC5240d != null && interfaceC5240d != this) {
            InterfaceC5243g m9 = getContext().m(C5241e.f42240n);
            kotlin.jvm.internal.h.b(m9);
            X7.h hVar = (X7.h) interfaceC5240d;
            do {
                atomicReferenceFieldUpdater = X7.h.f3788A;
            } while (atomicReferenceFieldUpdater.get(hVar) == X7.a.f3778d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0393g c0393g = obj instanceof C0393g ? (C0393g) obj : null;
            if (c0393g != null) {
                c0393g.n();
            }
        }
        this.intercepted = b.f286n;
    }

    public c(InterfaceC5240d interfaceC5240d) {
        this(interfaceC5240d, interfaceC5240d != null ? interfaceC5240d.getContext() : null);
    }
}
