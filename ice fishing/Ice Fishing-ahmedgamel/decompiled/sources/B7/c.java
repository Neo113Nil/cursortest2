package B7;

import S7.AbstractC0402u;
import S7.C0389g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z7.C5268e;
import z7.InterfaceC5267d;
import z7.InterfaceC5269f;
import z7.InterfaceC5270g;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public abstract class c extends a {
    private final InterfaceC5272i _context;
    private transient InterfaceC5267d intercepted;

    public c(InterfaceC5267d interfaceC5267d, InterfaceC5272i interfaceC5272i) {
        super(interfaceC5267d);
        this._context = interfaceC5272i;
    }

    @Override // z7.InterfaceC5267d
    public InterfaceC5272i getContext() {
        InterfaceC5272i interfaceC5272i = this._context;
        kotlin.jvm.internal.h.b(interfaceC5272i);
        return interfaceC5272i;
    }

    public final InterfaceC5267d intercepted() {
        InterfaceC5267d interfaceC5267d = this.intercepted;
        if (interfaceC5267d != null) {
            return interfaceC5267d;
        }
        InterfaceC5269f interfaceC5269f = (InterfaceC5269f) getContext().m(C5268e.f42271n);
        InterfaceC5267d hVar = interfaceC5269f != null ? new X7.h((AbstractC0402u) interfaceC5269f, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // B7.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC5267d interfaceC5267d = this.intercepted;
        if (interfaceC5267d != null && interfaceC5267d != this) {
            InterfaceC5270g m4 = getContext().m(C5268e.f42271n);
            kotlin.jvm.internal.h.b(m4);
            X7.h hVar = (X7.h) interfaceC5267d;
            do {
                atomicReferenceFieldUpdater = X7.h.f3833A;
            } while (atomicReferenceFieldUpdater.get(hVar) == X7.a.f3823d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0389g c0389g = obj instanceof C0389g ? (C0389g) obj : null;
            if (c0389g != null) {
                c0389g.n();
            }
        }
        this.intercepted = b.f220n;
    }

    public c(InterfaceC5267d interfaceC5267d) {
        this(interfaceC5267d, interfaceC5267d != null ? interfaceC5267d.getContext() : null);
    }
}
