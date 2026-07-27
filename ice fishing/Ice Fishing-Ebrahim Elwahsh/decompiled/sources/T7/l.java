package T7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3153a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3153a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a9 = nVar.a(runnable);
            if (a9 == 0) {
                return true;
            }
            if (a9 == 1) {
                n c4 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c4) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a9 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3153a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c4 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c4) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f3153a.get(this);
        nVar.getClass();
        long j9 = n.f3156f.get(nVar);
        return (((int) ((j9 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j9))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3153a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d2 = nVar.d();
            if (d2 != n.f3157g) {
                return d2;
            }
            n c4 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c4) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
