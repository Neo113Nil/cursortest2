package X7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3802a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3802a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a9 = nVar.a(runnable);
            if (a9 == 0) {
                return true;
            }
            if (a9 == 1) {
                n c9 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c9) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a9 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3802a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c9 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c9) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f3802a.get(this);
        nVar.getClass();
        long j6 = n.f3805f.get(nVar);
        return (((int) ((j6 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j6))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3802a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d9 = nVar.d();
            if (d9 != n.f3806g) {
                return d9;
            }
            n c9 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c9) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
