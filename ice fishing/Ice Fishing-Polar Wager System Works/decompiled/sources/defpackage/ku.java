package defpackage;

/* loaded from: classes.dex */
public abstract class ku implements java.lang.Runnable, java.lang.Comparable, defpackage.kq {
    private volatile java.lang.Object _heap;
    public long adDC3e2L;
    public int xiZrDbcSW0 = -1;

    public ku(long j) {
        this.adDC3e2L = j;
    }

    public final void F7NU4MC0GW(defpackage.lu luVar) {
        if (this._heap != defpackage.gq1.r1MBDhnF) {
            this._heap = luVar;
        } else {
            defpackage.db.fnWB2E7cs("Failed requirement.");
        }
    }

    @Override // defpackage.kq
    public final void IHQe1A4L2xu() {
        synchronized (this) {
            try {
                java.lang.Object obj = this._heap;
                defpackage.et etVar = defpackage.gq1.r1MBDhnF;
                if (obj == etVar) {
                    return;
                }
                defpackage.lu luVar = obj instanceof defpackage.lu ? (defpackage.lu) obj : null;
                if (luVar != null) {
                    synchronized (luVar) {
                        java.lang.Object obj2 = this._heap;
                        if ((obj2 instanceof defpackage.og1 ? (defpackage.og1) obj2 : null) != null) {
                            luVar.oh6vYeIP(this.xiZrDbcSW0);
                        }
                    }
                }
                this._heap = etVar;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        long j = this.adDC3e2L - ((defpackage.ku) obj).adDC3e2L;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int oh6vYeIP(long j, defpackage.lu luVar, defpackage.mu muVar) {
        synchronized (this) {
            if (this._heap == defpackage.gq1.r1MBDhnF) {
                return 2;
            }
            synchronized (luVar) {
                try {
                    defpackage.ku[] kuVarArr = luVar.IHQe1A4L2xu;
                    defpackage.ku kuVar = kuVarArr != null ? kuVarArr[0] : null;
                    if (defpackage.mu.DFo87pBq1E5.get(muVar) != 0) {
                        return 1;
                    }
                    if (kuVar == null) {
                        luVar.r1MBDhnF = j;
                    } else {
                        long j2 = kuVar.adDC3e2L;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - luVar.r1MBDhnF > 0) {
                            luVar.r1MBDhnF = j;
                        }
                    }
                    long j3 = this.adDC3e2L;
                    long j4 = luVar.r1MBDhnF;
                    if (j3 - j4 < 0) {
                        this.adDC3e2L = j4;
                    }
                    luVar.IHQe1A4L2xu(this);
                    return 0;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public java.lang.String toString() {
        return "Delayed[nanos=" + this.adDC3e2L + ']';
    }
}
