package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.C4939h;
import w7.EnumC5179a;

/* renamed from: v7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5140k implements InterfaceC5133d, x7.d {

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f41373u = AtomicReferenceFieldUpdater.newUpdater(C5140k.class, Object.class, "result");

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5133d f41374n;
    private volatile Object result;

    public C5140k(InterfaceC5133d interfaceC5133d) {
        EnumC5179a enumC5179a = EnumC5179a.f41705u;
        this.f41374n = interfaceC5133d;
        this.result = enumC5179a;
    }

    public final Object a() {
        Object obj = this.result;
        EnumC5179a enumC5179a = EnumC5179a.f41705u;
        if (obj == enumC5179a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41373u;
            EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC5179a, enumC5179a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC5179a) {
                    obj = this.result;
                }
            }
            return EnumC5179a.f41704n;
        }
        if (obj == EnumC5179a.f41706v) {
            return EnumC5179a.f41704n;
        }
        if (obj instanceof C4939h) {
            throw ((C4939h) obj).f40164n;
        }
        return obj;
    }

    @Override // x7.d
    public final x7.d getCallerFrame() {
        InterfaceC5133d interfaceC5133d = this.f41374n;
        if (interfaceC5133d instanceof x7.d) {
            return (x7.d) interfaceC5133d;
        }
        return null;
    }

    @Override // v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        return this.f41374n.getContext();
    }

    @Override // v7.InterfaceC5133d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC5179a enumC5179a = EnumC5179a.f41705u;
            if (obj2 == enumC5179a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41373u;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC5179a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC5179a) {
                        break;
                    }
                }
                return;
            }
            EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
            if (obj2 != enumC5179a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f41373u;
            EnumC5179a enumC5179a3 = EnumC5179a.f41706v;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC5179a2, enumC5179a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC5179a2) {
                    break;
                }
            }
            this.f41374n.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f41374n;
    }
}
