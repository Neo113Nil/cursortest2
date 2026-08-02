package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class wde extends yde {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ yde e;

    public wde(yde ydeVar, int i, int i2) {
        this.e = ydeVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.yde, java.util.List
    /* renamed from: D */
    public final yde subList(int i, int i2) {
        o2g.Q(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        o2g.N(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.yde, defpackage.qde, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.yde, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.qde
    public final Object[] n() {
        return this.e.n();
    }

    @Override // defpackage.qde
    public final int o() {
        return this.e.q() + this.c + this.d;
    }

    @Override // defpackage.qde
    public final int q() {
        return this.e.q() + this.c;
    }

    @Override // defpackage.qde
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.yde, defpackage.qde
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.yde, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
