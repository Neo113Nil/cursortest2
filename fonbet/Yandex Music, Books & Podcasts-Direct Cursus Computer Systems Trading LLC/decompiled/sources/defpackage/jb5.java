package defpackage;

/* loaded from: classes.dex */
public final class jb5 implements pob {
    public final pob a;
    public final nob b;

    public jb5(pob pobVar, nob nobVar) {
        pobVar.getClass();
        nobVar.getClass();
        this.a = pobVar;
        this.b = nobVar;
    }

    @Override // defpackage.pob
    public final pob a(oob oobVar) {
        oobVar.getClass();
        nob nobVar = this.b;
        nob d = nobVar.d(oobVar);
        pob pobVar = this.a;
        if (d != null) {
            return pobVar;
        }
        pob a = pobVar.a(oobVar);
        return a == pobVar ? this : a == x4b.a ? nobVar : new jb5(a, nobVar);
    }

    @Override // defpackage.pob
    public final pob b(pob pobVar) {
        pobVar.getClass();
        return pobVar == x4b.a ? this : (pob) pobVar.c(this);
    }

    @Override // defpackage.pob
    public final Object c(Object obj) {
        pob pobVar = (pob) this.a.c(obj);
        pobVar.getClass();
        nob nobVar = this.b;
        nobVar.getClass();
        pob a = pobVar.a(nobVar.getKey());
        return a == x4b.a ? nobVar : new jb5(a, nobVar);
    }

    @Override // defpackage.pob
    public final nob d(oob oobVar) {
        jb5 jb5Var = this;
        while (true) {
            nob d = jb5Var.b.d(oobVar);
            if (d != null) {
                return d;
            }
            pob pobVar = jb5Var.a;
            if (!(pobVar instanceof jb5)) {
                return pobVar.d(oobVar);
            }
            jb5Var = (jb5) pobVar;
        }
    }
}
