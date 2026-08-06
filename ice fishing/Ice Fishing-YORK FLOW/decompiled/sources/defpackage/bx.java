package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bx implements java.util.Iterator, defpackage.nb0 {
    public java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ defpackage.dc1 e6mdH7fiFuta;
    public final java.util.Iterator oh71FJcDz6S2;
    public final /* synthetic */ int WDYagTQQm9ns = 0;
    public int QiMR8OkAhezm = -1;

    public bx(defpackage.cx cxVar) {
        this.e6mdH7fiFuta = cxVar;
        this.oh71FJcDz6S2 = new defpackage.bp1((defpackage.dj1) cxVar.giKS3J6vZuNy);
    }

    public void ZpBGe2uQfcn8() {
        java.lang.Object next;
        defpackage.cx cxVar = (defpackage.cx) this.e6mdH7fiFuta;
        do {
            java.util.Iterator it = this.oh71FJcDz6S2;
            if (!it.hasNext()) {
                this.QiMR8OkAhezm = 0;
                return;
            }
            next = it.next();
        } while (((java.lang.Boolean) ((defpackage.g81) cxVar.fWTAfUmVKrZq).P05cfTpS5W5L(next)).booleanValue());
        this.P05cfTpS5W5L = next;
        this.QiMR8OkAhezm = 1;
    }

    public void giKS3J6vZuNy() {
        java.util.Iterator it = this.oh71FJcDz6S2;
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) ((defpackage.dj1) this.e6mdH7fiFuta).fWTAfUmVKrZq.P05cfTpS5W5L(next)).booleanValue()) {
                this.QiMR8OkAhezm = 1;
                this.P05cfTpS5W5L = next;
                return;
            }
        }
        this.QiMR8OkAhezm = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                if (this.QiMR8OkAhezm == -1) {
                    ZpBGe2uQfcn8();
                }
                if (this.QiMR8OkAhezm == 1) {
                }
                break;
            default:
                if (this.QiMR8OkAhezm == -1) {
                    giKS3J6vZuNy();
                }
                if (this.QiMR8OkAhezm == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                if (this.QiMR8OkAhezm == -1) {
                    ZpBGe2uQfcn8();
                }
                if (this.QiMR8OkAhezm == 0) {
                    defpackage.h7.BHfvd2J71qpO();
                    break;
                } else {
                    java.lang.Object obj = this.P05cfTpS5W5L;
                    this.P05cfTpS5W5L = null;
                    this.QiMR8OkAhezm = -1;
                    break;
                }
            default:
                if (this.QiMR8OkAhezm == -1) {
                    giKS3J6vZuNy();
                }
                if (this.QiMR8OkAhezm == 0) {
                    defpackage.h7.BHfvd2J71qpO();
                    break;
                } else {
                    java.lang.Object obj2 = this.P05cfTpS5W5L;
                    this.P05cfTpS5W5L = null;
                    this.QiMR8OkAhezm = -1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bx(defpackage.dj1 dj1Var) {
        this.e6mdH7fiFuta = dj1Var;
        this.oh71FJcDz6S2 = dj1Var.giKS3J6vZuNy.iterator();
    }
}
