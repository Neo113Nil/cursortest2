package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x6e implements nob {
    public static final hs4 c = new hs4(25);
    public final int a;
    public final ArrayList b;

    public x6e(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.pob
    public final pob a(oob oobVar) {
        oobVar.getClass();
        return c.equals(oobVar) ? x4b.a : this;
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
        pob a = pobVar.a(c);
        return a == x4b.a ? this : new jb5(a, this);
    }

    @Override // defpackage.pob
    public final nob d(oob oobVar) {
        oobVar.getClass();
        if (c.equals(oobVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.nob
    public final oob getKey() {
        return c;
    }
}
