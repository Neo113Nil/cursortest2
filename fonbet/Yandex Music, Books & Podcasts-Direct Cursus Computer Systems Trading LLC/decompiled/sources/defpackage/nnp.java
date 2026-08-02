package defpackage;

/* loaded from: classes.dex */
public final class nnp implements i1b {
    public final int a;
    public final int b;

    public nnp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.i1b
    public final void a(bh3 bh3Var) {
        boolean z = bh3Var.d != -1;
        ah3 ah3Var = (ah3) bh3Var.f;
        if (z) {
            bh3Var.d = -1;
            bh3Var.e = -1;
        }
        int d = yhn.d(this.a, 0, ah3Var.r());
        int d2 = yhn.d(this.b, 0, ah3Var.r());
        if (d != d2) {
            if (d < d2) {
                bh3Var.j(d, d2);
            } else {
                bh3Var.j(d2, d);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnp)) {
            return false;
        }
        nnp nnpVar = (nnp) obj;
        return this.a == nnpVar.a && this.b == nnpVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return vz1.r(sb, this.b, ')');
    }
}
