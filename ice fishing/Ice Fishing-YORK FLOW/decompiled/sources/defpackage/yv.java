package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class yv implements java.lang.Runnable, java.lang.Comparable, defpackage.cr {
    public long WDYagTQQm9ns;
    private volatile java.lang.Object _heap;
    public int oh71FJcDz6S2 = -1;

    public yv(long j) {
        this.WDYagTQQm9ns = j;
    }

    public final void JhCgjQRTAOCT(defpackage.zv zvVar) {
        if (this._heap != defpackage.nn.JhCgjQRTAOCT) {
            this._heap = zvVar;
        } else {
            defpackage.h7.w7APNrr0aGRc("Failed requirement.");
        }
    }

    @Override // defpackage.cr
    public final void ZpBGe2uQfcn8() {
        synchronized (this) {
            try {
                java.lang.Object obj = this._heap;
                defpackage.ru ruVar = defpackage.nn.JhCgjQRTAOCT;
                if (obj == ruVar) {
                    return;
                }
                defpackage.zv zvVar = obj instanceof defpackage.zv ? (defpackage.zv) obj : null;
                if (zvVar != null) {
                    synchronized (zvVar) {
                        java.lang.Object obj2 = this._heap;
                        if ((obj2 instanceof defpackage.ao1 ? (defpackage.ao1) obj2 : null) != null) {
                            zvVar.giKS3J6vZuNy(this.oh71FJcDz6S2);
                        }
                    }
                }
                this._heap = ruVar;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        long j = this.WDYagTQQm9ns - ((defpackage.yv) obj).WDYagTQQm9ns;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int giKS3J6vZuNy(long j, defpackage.zv zvVar, defpackage.aw awVar) {
        synchronized (this) {
            if (this._heap == defpackage.nn.JhCgjQRTAOCT) {
                return 2;
            }
            synchronized (zvVar) {
                try {
                    defpackage.yv[] yvVarArr = zvVar.ZpBGe2uQfcn8;
                    defpackage.yv yvVar = yvVarArr != null ? yvVarArr[0] : null;
                    if (defpackage.aw.h3m55N1URyyK.get(awVar) != 0) {
                        return 1;
                    }
                    if (yvVar == null) {
                        zvVar.fWTAfUmVKrZq = j;
                    } else {
                        long j2 = yvVar.WDYagTQQm9ns;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - zvVar.fWTAfUmVKrZq > 0) {
                            zvVar.fWTAfUmVKrZq = j;
                        }
                    }
                    long j3 = this.WDYagTQQm9ns;
                    long j4 = zvVar.fWTAfUmVKrZq;
                    if (j3 - j4 < 0) {
                        this.WDYagTQQm9ns = j4;
                    }
                    zvVar.ZpBGe2uQfcn8(this);
                    return 0;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public java.lang.String toString() {
        return "Delayed[nanos=" + this.WDYagTQQm9ns + ']';
    }
}
