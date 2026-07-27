package x7;

import O7.AbstractC0395u;
import O7.C0382g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.C5134e;
import v7.InterfaceC5133d;
import v7.InterfaceC5135f;
import v7.InterfaceC5136g;
import v7.InterfaceC5138i;

/* renamed from: x7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5219c extends AbstractC5217a {
    private final InterfaceC5138i _context;
    private transient InterfaceC5133d intercepted;

    public AbstractC5219c(InterfaceC5133d interfaceC5133d, InterfaceC5138i interfaceC5138i) {
        super(interfaceC5133d);
        this._context = interfaceC5138i;
    }

    @Override // v7.InterfaceC5133d
    public InterfaceC5138i getContext() {
        InterfaceC5138i interfaceC5138i = this._context;
        kotlin.jvm.internal.h.b(interfaceC5138i);
        return interfaceC5138i;
    }

    public final InterfaceC5133d intercepted() {
        InterfaceC5133d interfaceC5133d = this.intercepted;
        if (interfaceC5133d != null) {
            return interfaceC5133d;
        }
        InterfaceC5135f interfaceC5135f = (InterfaceC5135f) getContext().i(C5134e.f41371n);
        InterfaceC5133d hVar = interfaceC5135f != null ? new T7.h((AbstractC0395u) interfaceC5135f, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // x7.AbstractC5217a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC5133d interfaceC5133d = this.intercepted;
        if (interfaceC5133d != null && interfaceC5133d != this) {
            InterfaceC5136g i = getContext().i(C5134e.f41371n);
            kotlin.jvm.internal.h.b(i);
            T7.h hVar = (T7.h) interfaceC5133d;
            do {
                atomicReferenceFieldUpdater = T7.h.f3139A;
            } while (atomicReferenceFieldUpdater.get(hVar) == T7.a.f3129d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0382g c0382g = obj instanceof C0382g ? (C0382g) obj : null;
            if (c0382g != null) {
                c0382g.n();
            }
        }
        this.intercepted = C5218b.f41797n;
    }

    public AbstractC5219c(InterfaceC5133d interfaceC5133d) {
        this(interfaceC5133d, interfaceC5133d != null ? interfaceC5133d.getContext() : null);
    }
}
