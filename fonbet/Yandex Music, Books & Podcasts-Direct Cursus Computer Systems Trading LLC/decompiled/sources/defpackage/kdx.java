package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class kdx extends ocx {
    public final transient Object f;

    public kdx(Object obj) {
        super(1);
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

    @Override // defpackage.ocx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new qcx(this.f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return hrg.q("[", this.f.toString(), "]");
    }
}
