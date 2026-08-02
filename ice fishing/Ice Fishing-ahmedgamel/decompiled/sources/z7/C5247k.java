package z7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.C5082h;

/* renamed from: z7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5247k implements InterfaceC5240d, B7.d {

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f42242u = AtomicReferenceFieldUpdater.newUpdater(C5247k.class, Object.class, "result");

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5240d f42243n;
    private volatile Object result;

    public C5247k(InterfaceC5240d interfaceC5240d) {
        A7.a aVar = A7.a.f216u;
        this.f42243n = interfaceC5240d;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        A7.a aVar = A7.a.f216u;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42242u;
            A7.a aVar2 = A7.a.f215n;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return A7.a.f215n;
        }
        if (obj == A7.a.f217v) {
            return A7.a.f215n;
        }
        if (obj instanceof C5082h) {
            throw ((C5082h) obj).f41054n;
        }
        return obj;
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5240d interfaceC5240d = this.f42243n;
        if (interfaceC5240d instanceof B7.d) {
            return (B7.d) interfaceC5240d;
        }
        return null;
    }

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        return this.f42243n.getContext();
    }

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            A7.a aVar = A7.a.f216u;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42242u;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            A7.a aVar2 = A7.a.f215n;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42242u;
            A7.a aVar3 = A7.a.f217v;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f42243n.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f42243n;
    }
}
