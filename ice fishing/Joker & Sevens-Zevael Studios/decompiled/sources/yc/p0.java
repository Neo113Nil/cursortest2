package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class p0 implements Runnable, Comparable, k0 {
    private volatile Object _heap;

    /* renamed from: g, reason: collision with root package name */
    public long f8890g;

    /* renamed from: h, reason: collision with root package name */
    public int f8891h = -1;

    public p0(long j3) {
        this.f8890g = j3;
    }

    @Override // yc.k0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                dd.w wVar = a0.f8819b;
                if (obj == wVar) {
                    return;
                }
                q0 q0Var = obj instanceof q0 ? (q0) obj : null;
                if (q0Var != null) {
                    synchronized (q0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof dd.z ? (dd.z) obj2 : null) != null) {
                            q0Var.b(this.f8891h);
                        }
                    }
                }
                this._heap = wVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j3, q0 q0Var, r0 r0Var) {
        synchronized (this) {
            if (this._heap == a0.f8819b) {
                return 2;
            }
            synchronized (q0Var) {
                try {
                    p0[] p0VarArr = q0Var.f1894a;
                    p0 p0Var = p0VarArr != null ? p0VarArr[0] : null;
                    if (r0.f8898o.get(r0Var) != 0) {
                        return 1;
                    }
                    if (p0Var == null) {
                        q0Var.f8892c = j3;
                    } else {
                        long j6 = p0Var.f8890g;
                        if (j6 - j3 < 0) {
                            j3 = j6;
                        }
                        if (j3 - q0Var.f8892c > 0) {
                            q0Var.f8892c = j3;
                        }
                    }
                    long j10 = this.f8890g;
                    long j11 = q0Var.f8892c;
                    if (j10 - j11 < 0) {
                        this.f8890g = j11;
                    }
                    q0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.f8890g - ((p0) obj).f8890g;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    public final void d(q0 q0Var) {
        if (this._heap == a0.f8819b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = q0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8890g + ']';
    }
}
