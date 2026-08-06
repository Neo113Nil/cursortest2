package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class tq implements Runnable, Comparable, um {
    public int EljAMC1QTz = -1;
    public long OOA6hdeuvCS;
    private volatile Object _heap;

    public tq(long j) {
        this.OOA6hdeuvCS = j;
    }

    @Override // defpackage.um
    public final void GWasM1elztuh() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                pp ppVar = qj.XnEVoBF0td1l;
                if (obj == ppVar) {
                    return;
                }
                uq uqVar = obj instanceof uq ? (uq) obj : null;
                if (uqVar != null) {
                    synchronized (uqVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof f91 ? (f91) obj2 : null) != null) {
                            uqVar.Yi7zF1RB1(this.EljAMC1QTz);
                        }
                    }
                }
                this._heap = ppVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int Yi7zF1RB1(long j, uq uqVar, vq vqVar) {
        synchronized (this) {
            if (this._heap == qj.XnEVoBF0td1l) {
                return 2;
            }
            synchronized (uqVar) {
                try {
                    tq[] tqVarArr = uqVar.GWasM1elztuh;
                    tq tqVar = tqVarArr != null ? tqVarArr[0] : null;
                    if (vq.XnEVoBF0td1l.get(vqVar) != 0) {
                        return 1;
                    }
                    if (tqVar == null) {
                        uqVar.X1lG3V04pd = j;
                    } else {
                        long j2 = tqVar.OOA6hdeuvCS;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - uqVar.X1lG3V04pd > 0) {
                            uqVar.X1lG3V04pd = j;
                        }
                    }
                    long j3 = this.OOA6hdeuvCS;
                    long j4 = uqVar.X1lG3V04pd;
                    if (j3 - j4 < 0) {
                        this.OOA6hdeuvCS = j4;
                    }
                    uqVar.GWasM1elztuh(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.OOA6hdeuvCS - ((tq) obj).OOA6hdeuvCS;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.OOA6hdeuvCS + ']';
    }

    public final void xqGvceK5x(uq uqVar) {
        if (this._heap != qj.XnEVoBF0td1l) {
            this._heap = uqVar;
        } else {
            o4.mE4lRynR("Failed requirement.");
        }
    }
}
