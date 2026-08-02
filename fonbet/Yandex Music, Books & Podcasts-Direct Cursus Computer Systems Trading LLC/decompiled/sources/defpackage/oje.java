package defpackage;

/* loaded from: classes3.dex */
public final class oje extends wdp {
    public final int k;
    public final mje l;
    public final float m;
    public final int n;

    public oje(int i, mje mjeVar, float f, int i2) {
        this.k = i;
        this.l = mjeVar;
        this.m = f;
        this.n = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oje)) {
            return false;
        }
        oje ojeVar = (oje) obj;
        return this.k == ojeVar.k && this.l.equals(ojeVar.l) && Float.compare(this.m, ojeVar.m) == 0 && this.n == ojeVar.n;
    }

    @Override // defpackage.wdp
    public final int h0() {
        return this.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + eta.a((this.l.hashCode() + (Integer.hashCode(this.k) * 31)) * 31, this.m, 31);
    }

    @Override // defpackage.wdp
    public final weo j0() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedRect(color=");
        sb.append(this.k);
        sb.append(", itemSize=");
        sb.append(this.l);
        sb.append(", strokeWidth=");
        sb.append(this.m);
        sb.append(", strokeColor=");
        return vz1.r(sb, this.n, ')');
    }
}
