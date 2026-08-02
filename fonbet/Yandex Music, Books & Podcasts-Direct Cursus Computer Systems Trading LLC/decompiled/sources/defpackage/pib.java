package defpackage;

import kotlinx.coroutines.c;

/* loaded from: classes5.dex */
public abstract class pib implements Runnable, Comparable, qa8 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public pib(long j) {
        this.a = j;
    }

    @Override // defpackage.qa8
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                js3 js3Var = sib.a;
                if (obj == js3Var) {
                    return;
                }
                qib qibVar = obj instanceof qib ? (qib) obj : null;
                if (qibVar != null) {
                    synchronized (qibVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof yfs ? (yfs) obj2 : null) != null) {
                            qibVar.b(this.b);
                        }
                    }
                }
                this._heap = js3Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, qib qibVar, c cVar) {
        synchronized (this) {
            if (this._heap == sib.a) {
                return 2;
            }
            synchronized (qibVar) {
                try {
                    pib[] pibVarArr = qibVar.a;
                    pib pibVar = pibVarArr != null ? pibVarArr[0] : null;
                    if (c.j.get(cVar) == 1) {
                        return 1;
                    }
                    if (pibVar == null) {
                        qibVar.c = j;
                    } else {
                        long j2 = pibVar.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - qibVar.c > 0) {
                            qibVar.c = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = qibVar.c;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    qibVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((pib) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(qib qibVar) {
        if (this._heap != sib.a) {
            this._heap = qibVar;
        } else {
            xq0.x("Failed requirement.");
        }
    }

    public String toString() {
        return eta.g(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
