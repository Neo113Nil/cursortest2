package defpackage;

import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.w;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class dlt extends AbstractList<String> implements awf, RandomAccess {
    public final w a;

    public dlt(w wVar) {
        this.a = wVar;
    }

    @Override // defpackage.awf
    public final void J(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.awf
    public final List e() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        blt bltVar = new blt();
        bltVar.a = this.a.iterator();
        return bltVar;
    }

    @Override // defpackage.awf
    public final Object k(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        zkt zktVar = new zkt();
        zktVar.a = this.a.listIterator(i);
        return zktVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.awf
    public final awf j() {
        return this;
    }
}
