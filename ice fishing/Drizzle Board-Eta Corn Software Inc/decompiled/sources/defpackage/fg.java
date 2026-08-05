package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class fg implements Runnable, Comparable, kd {
    public int MdtA4re8 = -1;
    public long NCTxEWno;
    private volatile Object _heap;

    public fg(long j) {
        this.NCTxEWno = j;
    }

    public final int NCTxEWno(long j, gg ggVar, hg hgVar) {
        synchronized (this) {
            if (this._heap == ej0.P7K7Inc8) {
                return 2;
            }
            synchronized (ggVar) {
                try {
                    fg[] fgVarArr = ggVar.qoPGr6Ce;
                    fg fgVar = fgVarArr != null ? fgVarArr[0] : null;
                    int i = hg.k3x7lurq;
                    if (b1.qoPGr6Ce.getIntVolatile(hgVar, hg.jb9XjC4I) != 0) {
                        return 1;
                    }
                    if (fgVar == null) {
                        ggVar.MdtA4re8 = j;
                    } else {
                        long j2 = fgVar.NCTxEWno;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = ggVar.MdtA4re8;
                        if (j - j3 > 0) {
                            ggVar.MdtA4re8 = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.NCTxEWno - j < 0) {
                        this.NCTxEWno = j;
                    }
                    ggVar.qoPGr6Ce(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.NCTxEWno - ((fg) obj).NCTxEWno;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // defpackage.kd
    public final void qoPGr6Ce() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                lf lfVar = ej0.P7K7Inc8;
                if (obj == lfVar) {
                    return;
                }
                gg ggVar = obj instanceof gg ? (gg) obj : null;
                if (ggVar != null) {
                    synchronized (ggVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof mc0 ? (mc0) obj2 : null) != null) {
                            ggVar.MdtA4re8(this.MdtA4re8);
                        }
                    }
                }
                this._heap = lfVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.NCTxEWno + ']';
    }

    public final void wxUZMvaN(gg ggVar) {
        if (this._heap != ej0.P7K7Inc8) {
            this._heap = ggVar;
        } else {
            m1.sjUBp5pO("Failed requirement.");
        }
    }
}
