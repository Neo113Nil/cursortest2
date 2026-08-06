package defpackage;

/* loaded from: classes.dex */
public final class y11 extends defpackage.abhbClRa {
    public final java.util.List adDC3e2L;

    public y11(java.util.List list) {
        list.getClass();
        this.adDC3e2L = list;
    }

    @Override // defpackage.SyNS6RMn
    public final int IHQe1A4L2xu() {
        return this.adDC3e2L.size();
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        if (i >= 0 && i <= defpackage.fm.nBH8hAHy(this)) {
            return this.adDC3e2L.get(defpackage.fm.nBH8hAHy(this) - i);
        }
        java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "Element index ", " must be in range [");
        JlrlGoKF.append(new defpackage.d70(0, defpackage.fm.nBH8hAHy(this), 1));
        JlrlGoKF.append("].");
        throw new java.lang.IndexOutOfBoundsException(JlrlGoKF.toString());
    }

    @Override // defpackage.abhbClRa, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new defpackage.x11(this, 0);
    }

    @Override // defpackage.abhbClRa, java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.x11(this, 0);
    }

    @Override // defpackage.abhbClRa, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.x11(this, i);
    }
}
