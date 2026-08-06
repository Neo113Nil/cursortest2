package defpackage;

/* loaded from: classes.dex */
public final class ve implements defpackage.lj, java.io.Serializable {
    public final defpackage.lj adDC3e2L;
    public final defpackage.jj xiZrDbcSW0;

    public ve(defpackage.jj jjVar, defpackage.lj ljVar) {
        ljVar.getClass();
        jjVar.getClass();
        this.adDC3e2L = ljVar;
        this.xiZrDbcSW0 = jjVar;
    }

    @Override // defpackage.lj
    public final java.lang.Object EgCjBq0SZwJ(defpackage.k00 k00Var, java.lang.Object obj) {
        return k00Var.adDC3e2L(this.adDC3e2L.EgCjBq0SZwJ(k00Var, obj), this.xiZrDbcSW0);
    }

    @Override // defpackage.lj
    public final defpackage.lj JlrlGoKF(defpackage.lj ljVar) {
        ljVar.getClass();
        return ljVar == defpackage.lt.adDC3e2L ? this : (defpackage.lj) ljVar.EgCjBq0SZwJ(new defpackage.e6(8, (byte) 0), this);
    }

    @Override // defpackage.lj
    public final defpackage.lj V7bD7b8KA(defpackage.kj kjVar) {
        kjVar.getClass();
        defpackage.jj jjVar = this.xiZrDbcSW0;
        defpackage.jj cnag84Bm = jjVar.cnag84Bm(kjVar);
        defpackage.lj ljVar = this.adDC3e2L;
        if (cnag84Bm != null) {
            return ljVar;
        }
        defpackage.lj V7bD7b8KA = ljVar.V7bD7b8KA(kjVar);
        return V7bD7b8KA == ljVar ? this : V7bD7b8KA == defpackage.lt.adDC3e2L ? jjVar : new defpackage.ve(jjVar, V7bD7b8KA);
    }

    @Override // defpackage.lj
    public final defpackage.jj cnag84Bm(defpackage.kj kjVar) {
        kjVar.getClass();
        while (true) {
            defpackage.jj cnag84Bm = this.xiZrDbcSW0.cnag84Bm(kjVar);
            if (cnag84Bm != null) {
                return cnag84Bm;
            }
            defpackage.lj ljVar = this.adDC3e2L;
            if (!(ljVar instanceof defpackage.ve)) {
                return ljVar.cnag84Bm(kjVar);
            }
            this = (defpackage.ve) ljVar;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ve) {
            defpackage.ve veVar = (defpackage.ve) obj;
            int i = 2;
            defpackage.ve veVar2 = veVar;
            int i2 = 2;
            while (true) {
                defpackage.lj ljVar = veVar2.adDC3e2L;
                veVar2 = ljVar instanceof defpackage.ve ? (defpackage.ve) ljVar : null;
                if (veVar2 == null) {
                    break;
                }
                i2++;
            }
            defpackage.ve veVar3 = this;
            while (true) {
                defpackage.lj ljVar2 = veVar3.adDC3e2L;
                veVar3 = ljVar2 instanceof defpackage.ve ? (defpackage.ve) ljVar2 : null;
                if (veVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    defpackage.jj jjVar = this.xiZrDbcSW0;
                    if (!defpackage.x70.QoRHpC4k(veVar.cnag84Bm(jjVar.getKey()), jjVar)) {
                        z = false;
                        break;
                    }
                    defpackage.lj ljVar3 = this.adDC3e2L;
                    if (!(ljVar3 instanceof defpackage.ve)) {
                        ljVar3.getClass();
                        defpackage.jj jjVar2 = (defpackage.jj) ljVar3;
                        z = defpackage.x70.QoRHpC4k(veVar.cnag84Bm(jjVar2.getKey()), jjVar2);
                        break;
                    }
                    this = (defpackage.ve) ljVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.xiZrDbcSW0.hashCode() + this.adDC3e2L.hashCode();
    }

    public final java.lang.String toString() {
        return "[" + ((java.lang.String) EgCjBq0SZwJ(new defpackage.e6(2, (byte) 0), "")) + ']';
    }
}
