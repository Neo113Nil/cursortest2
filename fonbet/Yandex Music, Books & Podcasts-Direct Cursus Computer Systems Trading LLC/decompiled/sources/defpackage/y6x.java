package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class y6x extends u5x {
    public final transient Object f;

    public y6x(Object obj) {
        super(0);
        this.f = obj;
    }

    @Override // defpackage.r4x
    public final int a(Object[] objArr) {
        objArr[0] = this.f;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.equals(obj);
    }

    @Override // defpackage.u5x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new f6x(this.f);
    }

    @Override // defpackage.r4x
    public final xkt o() {
        return new f6x(this.f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return hrg.q("[", this.f.toString(), "]");
    }

    @Override // defpackage.u5x
    public final q5x u() {
        Object[] objArr = {this.f};
        for (int i = 0; i < 1; i++) {
            t4x t4xVar = q5x.d;
            if (objArr[i] == null) {
                jj4.j(k5r.i(i, "at index "));
                return null;
            }
        }
        return q5x.u(1, objArr);
    }
}
