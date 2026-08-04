package com.gamericefishpro.space.pi;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 extends u0 implements f0 {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(t0.class, "_isCompleted$volatile");

    @Override // com.gamericefishpro.space.pi.f0
    public final void C(long j, h hVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            p0 p0Var = new p0(this, j2 + jNanoTime, hVar);
            e0(jNanoTime, p0Var);
            hVar.v(new e(2, p0Var));
        }
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void P(CoroutineContext coroutineContext, Runnable runnable) {
        a0(runnable);
    }

    @Override // com.gamericefishpro.space.pi.u0
    public final long X() {
        Runnable runnable;
        r0 r0Var;
        com.gamericefishpro.space.d6.a aVar = a0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
        if (!Y()) {
            b0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof com.gamericefishpro.space.ui.l) {
                        com.gamericefishpro.space.ui.l lVar = (com.gamericefishpro.space.ui.l) obj;
                        Object objD = lVar.d();
                        if (objD != com.gamericefishpro.space.ui.l.g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        com.gamericefishpro.space.ui.l lVarC = lVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != aVar) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            com.gamericefishpro.space.ph.r rVar = this.w;
            if (((rVar == null || rVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof com.gamericefishpro.space.ui.l) {
                        long j = com.gamericefishpro.space.ui.l.f.get((com.gamericefishpro.space.ui.l) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == aVar) {
                        return Long.MAX_VALUE;
                    }
                }
                s0 s0Var = (s0) A.get(this);
                if (s0Var != null) {
                    synchronized (s0Var) {
                        r0[] r0VarArr = s0Var.a;
                        r0Var = r0VarArr != null ? r0VarArr[0] : null;
                    }
                    if (r0Var != null) {
                        long jNanoTime = r0Var.d - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void a0(Runnable runnable) {
        b0();
        if (!c0(runnable)) {
            b0.C.a0(runnable);
            return;
        }
        Thread threadV = V();
        if (Thread.currentThread() != threadV) {
            LockSupport.unpark(threadV);
        }
    }

    public final void b0() {
        r0 r0VarB;
        s0 s0Var = (s0) A.get(this);
        if (s0Var == null || com.gamericefishpro.space.ui.w.b.get(s0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (s0Var) {
                try {
                    r0[] r0VarArr = s0Var.a;
                    r0VarB = null;
                    r0 r0Var = r0VarArr != null ? r0VarArr[0] : null;
                    if (r0Var != null) {
                        r0VarB = ((jNanoTime - r0Var.d) > 0L ? 1 : ((jNanoTime - r0Var.d) == 0L ? 0 : -1)) >= 0 ? c0(r0Var) : false ? s0Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (r0VarB != null);
    }

    public final boolean c0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (B.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof com.gamericefishpro.space.ui.l)) {
                if (obj == a0.c) {
                    return false;
                }
                com.gamericefishpro.space.ui.l lVar = new com.gamericefishpro.space.ui.l(8, true);
                lVar.a((Runnable) obj);
                lVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            com.gamericefishpro.space.ui.l lVar2 = (com.gamericefishpro.space.ui.l) obj;
            int iA = lVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                com.gamericefishpro.space.ui.l lVarC = lVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public final boolean d0() {
        Object obj;
        long j;
        com.gamericefishpro.space.ph.r rVar = this.w;
        if (rVar != null ? rVar.isEmpty() : true) {
            s0 s0Var = (s0) A.get(this);
            if (s0Var == null) {
                obj = z.get(this);
                if (obj != null) {
                    if (obj instanceof com.gamericefishpro.space.ui.l) {
                        j = com.gamericefishpro.space.ui.l.f.get((com.gamericefishpro.space.ui.l) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == a0.c) {
                    }
                }
                return true;
            }
            if (com.gamericefishpro.space.ui.w.b.get(s0Var) == 0) {
                obj = z.get(this);
                if (obj != null) {
                    if (obj instanceof com.gamericefishpro.space.ui.l) {
                        j = com.gamericefishpro.space.ui.l.f.get((com.gamericefishpro.space.ui.l) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == a0.c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void e0(long j, r0 r0Var) {
        int iB;
        Thread threadV;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        r0 r0Var2 = null;
        if (B.get(this) == 1) {
            iB = 1;
        } else {
            s0 s0Var = (s0) atomicReferenceFieldUpdater.get(this);
            if (s0Var == null) {
                s0 s0Var2 = new s0();
                s0Var2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, s0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.b(obj);
                s0Var = (s0) obj;
            }
            iB = r0Var.b(j, s0Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                Z(j, r0Var);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        s0 s0Var3 = (s0) atomicReferenceFieldUpdater.get(this);
        if (s0Var3 != null) {
            synchronized (s0Var3) {
                r0[] r0VarArr = s0Var3.a;
                r0Var2 = r0VarArr != null ? r0VarArr[0] : null;
            }
        }
        if (r0Var2 != r0Var || Thread.currentThread() == (threadV = V())) {
            return;
        }
        LockSupport.unpark(threadV);
    }

    public m0 l(long j, z1 z1Var, CoroutineContext coroutineContext) {
        return c0.a.l(j, z1Var, coroutineContext);
    }

    @Override // com.gamericefishpro.space.pi.u0
    public void shutdown() {
        r0 r0VarB;
        w1.a.set(null);
        B.set(this, 1);
        com.gamericefishpro.space.d6.a aVar = a0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof com.gamericefishpro.space.ui.l) {
                ((com.gamericefishpro.space.ui.l) obj).b();
                break;
            } else {
                if (obj == aVar) {
                    break;
                }
                com.gamericefishpro.space.ui.l lVar = new com.gamericefishpro.space.ui.l(8, true);
                lVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (X() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            s0 s0Var = (s0) A.get(this);
            if (s0Var == null) {
                return;
            }
            synchronized (s0Var) {
                r0VarB = com.gamericefishpro.space.ui.w.b.get(s0Var) > 0 ? s0Var.b(0) : null;
            }
            if (r0VarB == null) {
                return;
            } else {
                Z(jNanoTime, r0VarB);
            }
        }
    }
}
