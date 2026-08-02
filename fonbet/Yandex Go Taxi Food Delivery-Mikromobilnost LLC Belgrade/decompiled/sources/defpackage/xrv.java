package defpackage;

/* loaded from: classes.dex */
public final class xrv extends sb2 {
    public final int x;
    public final vrv y;

    public xrv(int i, vrv vrvVar) {
        this.x = i;
        this.y = vrvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrv)) {
            return false;
        }
        xrv xrvVar = (xrv) obj;
        return this.x == xrvVar.x && this.y.equals(xrvVar.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (Integer.hashCode(this.x) * 31);
    }

    @Override // defpackage.sb2
    public final int r() {
        return this.x;
    }

    @Override // defpackage.sb2
    public final bb1 t() {
        return this.y;
    }

    public final String toString() {
        return "Circle(color=" + this.x + ", itemSize=" + this.y + ')';
    }
}
