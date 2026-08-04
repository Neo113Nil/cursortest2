package com.gamericefishpro.space.pi;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 implements Runnable, Comparable, m0 {
    private volatile Object _heap;
    public long d;
    public int e = -1;

    public r0(long j) {
        this.d = j;
    }

    @Override // com.gamericefishpro.space.pi.m0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                com.gamericefishpro.space.d6.a aVar = a0.b;
                if (obj == aVar) {
                    return;
                }
                s0 s0Var = obj instanceof s0 ? (s0) obj : null;
                if (s0Var != null) {
                    synchronized (s0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof com.gamericefishpro.space.ui.w ? (com.gamericefishpro.space.ui.w) obj2 : null) != null) {
                            s0Var.b(this.e);
                        }
                    }
                }
                this._heap = aVar;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, s0 s0Var, t0 t0Var) {
        synchronized (this) {
            if (this._heap == a0.b) {
                return 2;
            }
            synchronized (s0Var) {
                try {
                    r0[] r0VarArr = s0Var.a;
                    r0 r0Var = r0VarArr != null ? r0VarArr[0] : null;
                    if (t0.B.get(t0Var) == 1) {
                        return 1;
                    }
                    if (r0Var == null) {
                        s0Var.c = j;
                    } else {
                        long j2 = r0Var.d;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - s0Var.c > 0) {
                            s0Var.c = j;
                        }
                    }
                    long j3 = this.d;
                    long j4 = s0Var.c;
                    if (j3 - j4 < 0) {
                        this.d = j4;
                    }
                    s0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.d - ((r0) obj).d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(s0 s0Var) {
        if (this._heap == a0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = s0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.d + ']';
    }
}
