package Q1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f938a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f933a;

    @Override // Q1.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f938a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        u uVar = a.f933a;
        if (obj2 == uVar) {
            u c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == uVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
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

    public abstract u c(Object obj);
}
