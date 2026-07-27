package X7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class b extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3826a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f3820a;

    @Override // X7.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3826a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        D2.b bVar = a.f3820a;
        if (obj2 == bVar) {
            D2.b c9 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == bVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, bVar, c9)) {
                        obj2 = c9;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != bVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract D2.b c(Object obj);
}
