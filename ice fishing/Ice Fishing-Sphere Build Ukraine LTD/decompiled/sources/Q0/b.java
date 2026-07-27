package Q0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f875a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0068a.f869a;

    @Override // Q0.r
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f875a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        A.j jVar = AbstractC0068a.f869a;
        if (obj2 == jVar) {
            A.j c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == jVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, jVar, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != jVar) {
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

    public abstract A.j c(Object obj);
}
