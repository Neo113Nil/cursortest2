package X7;

import E2.C0316m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class b extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3781a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f3775a;

    @Override // X7.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3781a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C0316m c0316m = a.f3775a;
        if (obj2 == c0316m) {
            C0316m c9 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == c0316m) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c0316m, c9)) {
                        obj2 = c9;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c0316m) {
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

    public abstract C0316m c(Object obj);
}
