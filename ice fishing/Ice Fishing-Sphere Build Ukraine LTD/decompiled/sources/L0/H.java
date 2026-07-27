package L0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class H extends I implements InterfaceC0067z {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f615k = AtomicReferenceFieldUpdater.newUpdater(H.class, Object.class, "_queue");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f616l = AtomicReferenceFieldUpdater.newUpdater(H.class, Object.class, "_delayed");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f617m = AtomicIntegerFieldUpdater.newUpdater(H.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // L0.AbstractC0061t
    public final void c(v0.i iVar, Runnable runnable) {
        o(runnable);
    }

    @Override // L0.I
    public final long k() {
        Runnable runnable;
        if (l()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f615k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof Q0.o)) {
                if (obj != AbstractC0064w.f684b) {
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
            Q0.o oVar = (Q0.o) obj;
            Object d2 = oVar.d();
            if (d2 != Q0.o.f902g) {
                runnable = (Runnable) d2;
                break;
            }
            Q0.o c2 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        u0.b bVar = this.f621i;
        if (((bVar == null || bVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f615k.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof Q0.o)) {
                if (obj2 != AbstractC0064w.f684b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j2 = Q0.o.f901f.get((Q0.o) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // L0.I
    public void n() {
        i0.f660a.set(null);
        f617m.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f615k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            A.j jVar = AbstractC0064w.f684b;
            if (obj != null) {
                if (!(obj instanceof Q0.o)) {
                    if (obj != jVar) {
                        Q0.o oVar = new Q0.o(8, true);
                        oVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((Q0.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, jVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (k() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = h();
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
    public void o(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f615k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f617m.get(this) != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof Q0.o)) {
                    if (obj != AbstractC0064w.f684b) {
                        Q0.o oVar = new Q0.o(8, true);
                        oVar.a((Runnable) obj);
                        oVar.a(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                Q0.o oVar2 = (Q0.o) obj;
                int a2 = oVar2.a(runnable);
                if (a2 == 0) {
                    break;
                }
                if (a2 == 1) {
                    Q0.o c2 = oVar2.c();
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
        RunnableC0065x.f692n.o(runnable);
    }

    public final boolean p() {
        u0.b bVar = this.f621i;
        if (!(bVar != null ? bVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f615k.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof Q0.o) {
            long j2 = Q0.o.f901f.get((Q0.o) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0064w.f684b) {
            return true;
        }
        return false;
    }
}
