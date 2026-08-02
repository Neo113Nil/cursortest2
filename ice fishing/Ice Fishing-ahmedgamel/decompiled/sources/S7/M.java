package S7;

import E2.C0316m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class M implements Runnable, Comparable, H {
    private volatile Object _heap;

    /* renamed from: n, reason: collision with root package name */
    public long f3008n;

    /* renamed from: u, reason: collision with root package name */
    public int f3009u = -1;

    public M(long j6) {
        this.f3008n = j6;
    }

    @Override // S7.H
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0316m c0316m = AbstractC0410y.f3091b;
                if (obj == c0316m) {
                    return;
                }
                N n9 = obj instanceof N ? (N) obj : null;
                if (n9 != null) {
                    synchronized (n9) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof X7.x ? (X7.x) obj2 : null) != null) {
                            n9.b(this.f3009u);
                        }
                    }
                }
                this._heap = c0316m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j6, N n9, O o4) {
        synchronized (this) {
            if (this._heap == AbstractC0410y.f3091b) {
                return 2;
            }
            synchronized (n9) {
                try {
                    M[] mArr = n9.f3823a;
                    M m9 = mArr != null ? mArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O.f3013z;
                    o4.getClass();
                    if (O.f3012B.get(o4) != 0) {
                        return 1;
                    }
                    if (m9 == null) {
                        n9.f3010c = j6;
                    } else {
                        long j9 = m9.f3008n;
                        if (j9 - j6 < 0) {
                            j6 = j9;
                        }
                        if (j6 - n9.f3010c > 0) {
                            n9.f3010c = j6;
                        }
                    }
                    long j10 = this.f3008n;
                    long j11 = n9.f3010c;
                    if (j10 - j11 < 0) {
                        this.f3008n = j11;
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
        long j6 = this.f3008n - ((M) obj).f3008n;
        if (j6 > 0) {
            return 1;
        }
        return j6 < 0 ? -1 : 0;
    }

    public final void d(N n9) {
        if (this._heap == AbstractC0410y.f3091b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = n9;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f3008n + ']';
    }
}
