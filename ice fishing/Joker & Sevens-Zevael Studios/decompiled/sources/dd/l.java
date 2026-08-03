package dd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1871a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1871a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a6 = nVar.a(runnable);
            if (a6 == 0) {
                return true;
            }
            if (a6 == 1) {
                n c3 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c3) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a6 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1871a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c3 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c3) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f1871a.get(this);
        nVar.getClass();
        long j3 = n.f1874f.get(nVar);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1871a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d10 = nVar.d();
            if (d10 != n.f1875g) {
                return d10;
            }
            n c3 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c3) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
