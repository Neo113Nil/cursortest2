package z7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.C5090h;

/* renamed from: z7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5274k implements InterfaceC5267d, B7.d {

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f42270u = AtomicReferenceFieldUpdater.newUpdater(C5274k.class, Object.class, "result");

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5267d f42271n;
    private volatile Object result;

    public C5274k(InterfaceC5267d interfaceC5267d) {
        A7.a aVar = A7.a.f59u;
        this.f42271n = interfaceC5267d;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        A7.a aVar = A7.a.f59u;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42270u;
            A7.a aVar2 = A7.a.f58n;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return A7.a.f58n;
        }
        if (obj == A7.a.f60v) {
            return A7.a.f58n;
        }
        if (obj instanceof C5090h) {
            throw ((C5090h) obj).f41331n;
        }
        return obj;
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5267d interfaceC5267d = this.f42271n;
        if (interfaceC5267d instanceof B7.d) {
            return (B7.d) interfaceC5267d;
        }
        return null;
    }

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        return this.f42271n.getContext();
    }

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            A7.a aVar = A7.a.f59u;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42270u;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            A7.a aVar2 = A7.a.f58n;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42270u;
            A7.a aVar3 = A7.a.f60v;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f42271n.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f42271n;
    }
}
