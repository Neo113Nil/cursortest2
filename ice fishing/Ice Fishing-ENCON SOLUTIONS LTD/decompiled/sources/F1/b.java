package F1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f595a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f589a;

    @Override // F1.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f595a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C.j jVar = a.f589a;
        if (obj2 == jVar) {
            C.j c2 = c(obj);
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

    public abstract C.j c(Object obj);
}
