package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class clt extends AbstractList implements yvf, RandomAccess {
    public final wvf a;

    public clt(wvf wvfVar) {
        this.a = wvfVar;
    }

    @Override // defpackage.yvf
    public final void C(jn3 jn3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yvf
    public final List e() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        alt altVar = new alt();
        altVar.a = this.a.iterator();
        return altVar;
    }

    @Override // defpackage.yvf
    public final Object k(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ykt yktVar = new ykt();
        yktVar.a = this.a.listIterator(i);
        return yktVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.yvf
    public final yvf j() {
        return this;
    }
}
