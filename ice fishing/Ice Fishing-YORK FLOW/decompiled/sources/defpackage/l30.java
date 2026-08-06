package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l30 implements java.util.Iterator, defpackage.nb0 {
    public final java.lang.Object P05cfTpS5W5L;
    public java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    public l30(defpackage.bo0 bo0Var) {
        this.WDYagTQQm9ns = 2;
        this.P05cfTpS5W5L = bo0Var;
        this.oh71FJcDz6S2 = -1;
        this.QiMR8OkAhezm = defpackage.v70.blKFvluuDQOf(new defpackage.ao0(bo0Var, this, null));
    }

    public void ZpBGe2uQfcn8() {
        java.lang.Object P05cfTpS5W5L;
        int i = this.oh71FJcDz6S2;
        defpackage.cx cxVar = (defpackage.cx) this.P05cfTpS5W5L;
        if (i == -2) {
            P05cfTpS5W5L = ((defpackage.l3) cxVar.giKS3J6vZuNy).oh71FJcDz6S2;
        } else {
            defpackage.y10 y10Var = cxVar.fWTAfUmVKrZq;
            java.lang.Object obj = this.QiMR8OkAhezm;
            obj.getClass();
            P05cfTpS5W5L = y10Var.P05cfTpS5W5L(obj);
        }
        this.QiMR8OkAhezm = P05cfTpS5W5L;
        this.oh71FJcDz6S2 = P05cfTpS5W5L == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                if (this.oh71FJcDz6S2 < 0) {
                    ZpBGe2uQfcn8();
                }
                return this.oh71FJcDz6S2 == 1;
            case 1:
                return ((defpackage.ec1) this.QiMR8OkAhezm).hasNext();
            case 2:
                return ((defpackage.ec1) this.QiMR8OkAhezm).hasNext();
            default:
                return this.oh71FJcDz6S2 < ((java.util.Map) this.P05cfTpS5W5L).size();
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object obj = null;
        switch (this.WDYagTQQm9ns) {
            case 0:
                if (this.oh71FJcDz6S2 < 0) {
                    ZpBGe2uQfcn8();
                }
                if (this.oh71FJcDz6S2 == 0) {
                    defpackage.h7.BHfvd2J71qpO();
                    return null;
                }
                java.lang.Object obj2 = this.QiMR8OkAhezm;
                obj2.getClass();
                this.oh71FJcDz6S2 = -1;
                return obj2;
            case 1:
                return ((defpackage.ec1) this.QiMR8OkAhezm).next();
            case 2:
                return ((defpackage.ec1) this.QiMR8OkAhezm).next();
            default:
                if (hasNext()) {
                    obj = this.QiMR8OkAhezm;
                    this.oh71FJcDz6S2++;
                    java.lang.Object obj3 = ((java.util.Map) this.P05cfTpS5W5L).get(obj);
                    if (obj3 == null) {
                        throw new java.util.ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.QiMR8OkAhezm = ((defpackage.th0) obj3).giKS3J6vZuNy;
                } else {
                    defpackage.h7.BHfvd2J71qpO();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.P05cfTpS5W5L;
        switch (i) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.oh71FJcDz6S2;
                if (i2 != -1) {
                    ((defpackage.vn0) obj).oh71FJcDz6S2.P05cfTpS5W5L(i2);
                    this.oh71FJcDz6S2 = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.oh71FJcDz6S2;
                if (i3 != -1) {
                    ((defpackage.bo0) obj).oh71FJcDz6S2.h3m55N1URyyK(i3);
                    this.oh71FJcDz6S2 = -1;
                    return;
                }
                return;
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l30(defpackage.cx cxVar) {
        this.WDYagTQQm9ns = 0;
        this.P05cfTpS5W5L = cxVar;
        this.oh71FJcDz6S2 = -2;
    }

    public l30(java.lang.Object obj, java.util.Map map) {
        this.WDYagTQQm9ns = 3;
        this.QiMR8OkAhezm = obj;
        this.P05cfTpS5W5L = map;
    }

    public l30(defpackage.vn0 vn0Var) {
        this.WDYagTQQm9ns = 1;
        this.P05cfTpS5W5L = vn0Var;
        this.oh71FJcDz6S2 = -1;
        this.QiMR8OkAhezm = defpackage.v70.blKFvluuDQOf(new defpackage.un0(vn0Var, this, null));
    }
}
