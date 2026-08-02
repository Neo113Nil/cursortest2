package defpackage;

/* loaded from: classes.dex */
public final class hop implements i1b {
    public final int a;
    public final int b;

    public hop(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.i1b
    public final void a(bh3 bh3Var) {
        int d = yhn.d(this.a, 0, ((ah3) bh3Var.f).r());
        int d2 = yhn.d(this.b, 0, ((ah3) bh3Var.f).r());
        if (d < d2) {
            bh3Var.l(d, d2);
        } else {
            bh3Var.l(d2, d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hop)) {
            return false;
        }
        hop hopVar = (hop) obj;
        return this.a == hopVar.a && this.b == hopVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return vz1.r(sb, this.b, ')');
    }
}
