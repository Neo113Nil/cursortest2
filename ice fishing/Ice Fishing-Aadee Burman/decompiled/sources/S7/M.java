package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class M implements Runnable, Comparable, H {
    private volatile Object _heap;

    /* renamed from: n, reason: collision with root package name */
    public long f2925n;

    /* renamed from: u, reason: collision with root package name */
    public int f2926u = -1;

    public M(long j6) {
        this.f2925n = j6;
    }

    @Override // S7.H
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                D2.b bVar = AbstractC0406y.f3008b;
                if (obj == bVar) {
                    return;
                }
                N n9 = obj instanceof N ? (N) obj : null;
                if (n9 != null) {
                    synchronized (n9) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof X7.x ? (X7.x) obj2 : null) != null) {
                            n9.b(this.f2926u);
                        }
                    }
                }
                this._heap = bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j6, N n9, O o6) {
        synchronized (this) {
            if (this._heap == AbstractC0406y.f3008b) {
                return 2;
            }
            synchronized (n9) {
                try {
                    M[] mArr = n9.f3868a;
                    M m4 = mArr != null ? mArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O.f2930z;
                    o6.getClass();
                    if (O.f2929B.get(o6) != 0) {
                        return 1;
                    }
                    if (m4 == null) {
                        n9.f2927c = j6;
                    } else {
                        long j9 = m4.f2925n;
                        if (j9 - j6 < 0) {
                            j6 = j9;
                        }
                        if (j6 - n9.f2927c > 0) {
                            n9.f2927c = j6;
                        }
                    }
                    long j10 = this.f2925n;
                    long j11 = n9.f2927c;
                    if (j10 - j11 < 0) {
                        this.f2925n = j11;
                    }
                    n9.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = this.f2925n - ((M) obj).f2925n;
        if (j6 > 0) {
            return 1;
        }
        return j6 < 0 ? -1 : 0;
    }

    public final void d(N n9) {
        if (this._heap == AbstractC0406y.f3008b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = n9;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f2925n + ']';
    }
}
