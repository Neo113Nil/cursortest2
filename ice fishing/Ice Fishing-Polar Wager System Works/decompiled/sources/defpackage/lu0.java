package defpackage;

/* loaded from: classes.dex */
public final class lu0 implements java.util.Iterator, defpackage.g90 {
    public final defpackage.ju0 adDC3e2L;

    public lu0(defpackage.fu0 fu0Var) {
        defpackage.zi1[] zi1VarArr = new defpackage.zi1[8];
        for (int i = 0; i < 8; i++) {
            zi1VarArr[i] = new defpackage.bj1(this);
        }
        this.adDC3e2L = new defpackage.ju0(fu0Var, zi1VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.adDC3e2L.AARZUJiTa;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return (java.util.Map.Entry) this.adDC3e2L.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.adDC3e2L.remove();
    }
}
