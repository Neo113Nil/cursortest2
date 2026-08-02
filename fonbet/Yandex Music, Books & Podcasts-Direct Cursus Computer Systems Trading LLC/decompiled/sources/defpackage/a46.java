package defpackage;

import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class a46 implements nob {
    public static final ovn b = new ovn();
    public final tf6 a;

    public a46(a aVar, tf6 tf6Var) {
        aVar.getClass();
        this.a = tf6Var;
    }

    @Override // defpackage.pob
    public final pob a(oob oobVar) {
        oobVar.getClass();
        return b.equals(oobVar) ? x4b.a : this;
    }

    @Override // defpackage.pob
    public final pob b(pob pobVar) {
        pobVar.getClass();
        return pobVar == x4b.a ? this : (pob) pobVar.c(this);
    }

    @Override // defpackage.pob
    public final Object c(Object obj) {
        pob pobVar = (pob) obj;
        pobVar.getClass();
        pob a = pobVar.a(b);
        return a == x4b.a ? this : new jb5(a, this);
    }

    @Override // defpackage.pob
    public final nob d(oob oobVar) {
        oobVar.getClass();
        if (b.equals(oobVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.nob
    public final oob getKey() {
        return b;
    }
}
