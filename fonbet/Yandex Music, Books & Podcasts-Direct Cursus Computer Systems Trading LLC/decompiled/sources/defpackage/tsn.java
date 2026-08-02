package defpackage;

/* loaded from: classes3.dex */
public final class tsn extends hee {
    public final transient cee d;
    public final transient usn e;

    public tsn(cee ceeVar, usn usnVar) {
        this.d = ceeVar;
        this.e = usnVar;
    }

    @Override // defpackage.hee, defpackage.qde
    public final yde a() {
        return this.e;
    }

    @Override // defpackage.qde, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.qde
    public final int g(int i, Object[] objArr) {
        return this.e.g(i, objArr);
    }

    @Override // defpackage.qde
    public final boolean r() {
        return true;
    }

    @Override // defpackage.qde
    /* renamed from: s */
    public final xkt iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.hee, defpackage.qde
    public Object writeReplace() {
        return super.writeReplace();
    }
}
