package A1;

import i1.C0250g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class I extends J implements A {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6g = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_queue");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7h = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_delayed");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8i = AtomicIntegerFieldUpdater.newUpdater(I.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // A1.AbstractC0018t
    public final void j(l1.i iVar, Runnable runnable) {
        u(runnable);
    }

    @Override // A1.J
    public final long r() {
        Runnable runnable;
        if (s()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof F1.n)) {
                if (obj != AbstractC0022x.f75b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            F1.n nVar = (F1.n) obj;
            Object d2 = nVar.d();
            if (d2 != F1.n.f619g) {
                runnable = (Runnable) d2;
                break;
            }
            F1.n c2 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C0250g c0250g = this.f12e;
        if (((c0250g == null || c0250g.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f6g.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof F1.n)) {
                if (obj2 != AbstractC0022x.f75b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = F1.n.f618f.get((F1.n) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // A1.J
    public void t() {
        j0.f52a.set(null);
        f8i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C.j jVar = AbstractC0022x.f75b;
            if (obj != null) {
                if (!(obj instanceof F1.n)) {
                    if (obj != jVar) {
                        F1.n nVar = new F1.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((F1.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, jVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (r() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f8i.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof F1.n)) {
                    if (obj != AbstractC0022x.f75b) {
                        F1.n nVar = new F1.n(8, true);
                        nVar.a((Runnable) obj);
                        nVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                F1.n nVar2 = (F1.n) obj;
                int a2 = nVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    F1.n c2 = nVar2.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (a2 == 2) {
                    break;
                }
            } else {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            }
        }
        RunnableC0023y.f83j.u(runnable);
    }

    public final boolean v() {
        C0250g c0250g = this.f12e;
        if (!(c0250g != null ? c0250g.isEmpty() : true)) {
            return false;
        }
        Object obj = f6g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof F1.n) {
            long j2 = F1.n.f618f.get((F1.n) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0022x.f75b) {
            return true;
        }
        return false;
    }
}
