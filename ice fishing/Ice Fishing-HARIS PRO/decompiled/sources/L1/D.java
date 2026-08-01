package L1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class D extends E implements InterfaceC0021w {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f526f = AtomicReferenceFieldUpdater.newUpdater(D.class, Object.class, "_queue");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f527g = AtomicReferenceFieldUpdater.newUpdater(D.class, Object.class, "_delayed");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f528h = AtomicIntegerFieldUpdater.newUpdater(D.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // L1.AbstractC0015p
    public final void b(v1.i iVar, Runnable runnable) {
        m(runnable);
    }

    @Override // L1.E
    public void l() {
        a0.f552a.set(null);
        f528h.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f526f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            Q1.u uVar = AbstractC0018t.f578b;
            if (obj != null) {
                if (!(obj instanceof Q1.m)) {
                    if (obj != uVar) {
                        Q1.m mVar = new Q1.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((Q1.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, uVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (o() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = i();
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
    public void m(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f526f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f528h.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof Q1.m)) {
                    if (obj != AbstractC0018t.f578b) {
                        Q1.m mVar = new Q1.m(8, true);
                        mVar.a((Runnable) obj);
                        mVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                Q1.m mVar2 = (Q1.m) obj;
                int a2 = mVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    Q1.m c2 = mVar2.c();
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
        RunnableC0019u.i.m(runnable);
    }

    public final boolean n() {
        u1.e eVar = this.e;
        if (!(eVar != null ? eVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f526f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof Q1.m) {
            long j = Q1.m.f958f.get((Q1.m) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0018t.f578b) {
            return true;
        }
        return false;
    }

    public final long o() {
        Runnable runnable;
        if (k()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f526f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof Q1.m)) {
                if (obj != AbstractC0018t.f578b) {
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
            Q1.m mVar = (Q1.m) obj;
            Object d2 = mVar.d();
            if (d2 != Q1.m.f959g) {
                runnable = (Runnable) d2;
                break;
            }
            Q1.m c2 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        u1.e eVar = this.e;
        if (((eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f526f.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof Q1.m)) {
                if (obj2 != AbstractC0018t.f578b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j = Q1.m.f958f.get((Q1.m) obj2);
            if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }
}
