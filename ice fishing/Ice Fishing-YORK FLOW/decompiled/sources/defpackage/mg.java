package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mg implements defpackage.jm, java.io.Serializable {
    public final defpackage.jm WDYagTQQm9ns;
    public final defpackage.hm oh71FJcDz6S2;

    public mg(defpackage.hm hmVar, defpackage.jm jmVar) {
        jmVar.getClass();
        hmVar.getClass();
        this.WDYagTQQm9ns = jmVar;
        this.oh71FJcDz6S2 = hmVar;
    }

    @Override // defpackage.jm
    public final java.lang.Object BHfvd2J71qpO(defpackage.c20 c20Var, java.lang.Object obj) {
        return c20Var.QiMR8OkAhezm(this.WDYagTQQm9ns.BHfvd2J71qpO(c20Var, obj), this.oh71FJcDz6S2);
    }

    @Override // defpackage.jm
    public final defpackage.hm XntWc4eZSQ8j(defpackage.im imVar) {
        imVar.getClass();
        while (true) {
            defpackage.hm XntWc4eZSQ8j = this.oh71FJcDz6S2.XntWc4eZSQ8j(imVar);
            if (XntWc4eZSQ8j != null) {
                return XntWc4eZSQ8j;
            }
            defpackage.jm jmVar = this.WDYagTQQm9ns;
            if (!(jmVar instanceof defpackage.mg)) {
                return jmVar.XntWc4eZSQ8j(imVar);
            }
            this = (defpackage.mg) jmVar;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mg) {
            defpackage.mg mgVar = (defpackage.mg) obj;
            int i = 2;
            defpackage.mg mgVar2 = mgVar;
            int i2 = 2;
            while (true) {
                defpackage.jm jmVar = mgVar2.WDYagTQQm9ns;
                mgVar2 = jmVar instanceof defpackage.mg ? (defpackage.mg) jmVar : null;
                if (mgVar2 == null) {
                    break;
                }
                i2++;
            }
            defpackage.mg mgVar3 = this;
            while (true) {
                defpackage.jm jmVar2 = mgVar3.WDYagTQQm9ns;
                mgVar3 = jmVar2 instanceof defpackage.mg ? (defpackage.mg) jmVar2 : null;
                if (mgVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    defpackage.hm hmVar = this.oh71FJcDz6S2;
                    if (!defpackage.ma0.QiMR8OkAhezm(mgVar.XntWc4eZSQ8j(hmVar.getKey()), hmVar)) {
                        z = false;
                        break;
                    }
                    defpackage.jm jmVar3 = this.WDYagTQQm9ns;
                    if (!(jmVar3 instanceof defpackage.mg)) {
                        jmVar3.getClass();
                        defpackage.hm hmVar2 = (defpackage.hm) jmVar3;
                        z = defpackage.ma0.QiMR8OkAhezm(mgVar.XntWc4eZSQ8j(hmVar2.getKey()), hmVar2);
                        break;
                    }
                    this = (defpackage.mg) jmVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jm
    public final defpackage.jm fNwYGHIYeJcR(defpackage.jm jmVar) {
        jmVar.getClass();
        return jmVar == defpackage.xu.WDYagTQQm9ns ? this : (defpackage.jm) jmVar.BHfvd2J71qpO(new defpackage.b7(11, (byte) 0), this);
    }

    public final int hashCode() {
        return this.oh71FJcDz6S2.hashCode() + this.WDYagTQQm9ns.hashCode();
    }

    public final java.lang.String toString() {
        return defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(new java.lang.StringBuilder("["), (java.lang.String) BHfvd2J71qpO(new defpackage.b7(6, (byte) 0), ""), ']');
    }

    @Override // defpackage.jm
    public final defpackage.jm w7APNrr0aGRc(defpackage.im imVar) {
        imVar.getClass();
        defpackage.hm hmVar = this.oh71FJcDz6S2;
        defpackage.hm XntWc4eZSQ8j = hmVar.XntWc4eZSQ8j(imVar);
        defpackage.jm jmVar = this.WDYagTQQm9ns;
        if (XntWc4eZSQ8j != null) {
            return jmVar;
        }
        defpackage.jm w7APNrr0aGRc = jmVar.w7APNrr0aGRc(imVar);
        return w7APNrr0aGRc == jmVar ? this : w7APNrr0aGRc == defpackage.xu.WDYagTQQm9ns ? hmVar : new defpackage.mg(hmVar, w7APNrr0aGRc);
    }
}
