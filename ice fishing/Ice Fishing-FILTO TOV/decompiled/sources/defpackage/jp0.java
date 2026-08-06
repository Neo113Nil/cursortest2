package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jp0 extends arNh8D4Z5gB implements q40 {
    public final bp0 OOA6hdeuvCS;

    public jp0(bp0 bp0Var) {
        this.OOA6hdeuvCS = bp0Var;
    }

    @Override // defpackage.arNh8D4Z5gB
    public final int GWasM1elztuh() {
        return this.OOA6hdeuvCS.mOu10nynGul;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.OOA6hdeuvCS.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.OOA6hdeuvCS.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ab1[] ab1VarArr = new ab1[8];
        for (int i = 0; i < 8; i++) {
            ab1VarArr[i] = new bb1(2);
        }
        return new ip0(this.OOA6hdeuvCS, ab1VarArr);
    }
}
