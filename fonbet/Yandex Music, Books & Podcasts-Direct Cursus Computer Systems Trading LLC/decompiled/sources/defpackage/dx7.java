package defpackage;

/* loaded from: classes.dex */
public final class dx7 implements i1b {
    public final int a;
    public final int b;

    public dx7(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        tme.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.i1b
    public final void a(bh3 bh3Var) {
        int i = bh3Var.c;
        ah3 ah3Var = (ah3) bh3Var.f;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = ah3Var.r();
        }
        bh3Var.a(bh3Var.c, Math.min(i3, ah3Var.r()));
        int i4 = bh3Var.b;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            i6 = 0;
        }
        bh3Var.a(Math.max(0, i6), bh3Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx7)) {
            return false;
        }
        dx7 dx7Var = (dx7) obj;
        return this.a == dx7Var.a && this.b == dx7Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return vz1.r(sb, this.b, ')');
    }
}
