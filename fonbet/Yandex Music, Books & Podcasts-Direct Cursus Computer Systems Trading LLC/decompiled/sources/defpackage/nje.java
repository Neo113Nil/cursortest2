package defpackage;

/* loaded from: classes3.dex */
public final class nje extends wdp {
    public final int k;
    public final lje l;

    public nje(int i, lje ljeVar) {
        this.k = i;
        this.l = ljeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nje)) {
            return false;
        }
        nje njeVar = (nje) obj;
        return this.k == njeVar.k && this.l.equals(njeVar.l);
    }

    @Override // defpackage.wdp
    public final int h0() {
        return this.k;
    }

    public final int hashCode() {
        return Float.hashCode(this.l.i) + (Integer.hashCode(this.k) * 31);
    }

    @Override // defpackage.wdp
    public final weo j0() {
        return this.l;
    }

    public final String toString() {
        return "Circle(color=" + this.k + ", itemSize=" + this.l + ')';
    }
}
