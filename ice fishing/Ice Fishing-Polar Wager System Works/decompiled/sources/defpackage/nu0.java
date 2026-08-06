package defpackage;

/* loaded from: classes.dex */
public final class nu0 extends defpackage.C0U8sNJm implements defpackage.g90 {
    public final defpackage.fu0 adDC3e2L;

    public nu0(defpackage.fu0 fu0Var) {
        this.adDC3e2L = fu0Var;
    }

    @Override // defpackage.C0U8sNJm
    public final int IHQe1A4L2xu() {
        return this.adDC3e2L.riuEU0zW4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.adDC3e2L.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.adDC3e2L.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.zi1[] zi1VarArr = new defpackage.zi1[8];
        for (int i = 0; i < 8; i++) {
            zi1VarArr[i] = new defpackage.aj1(2);
        }
        return new defpackage.mu0(this.adDC3e2L, zi1VarArr);
    }
}
