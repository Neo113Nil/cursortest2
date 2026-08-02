package defpackage;

/* loaded from: classes.dex */
public final class ex7 implements i1b {
    public final int a;
    public final int b;

    public ex7(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        tme.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.i1b
    public final void a(bh3 bh3Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = bh3Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(bh3Var.d((i5 - i4) + (-1))) && Character.isLowSurrogate(bh3Var.d(bh3Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = bh3Var.c;
            ah3 ah3Var = (ah3) bh3Var.f;
            if (i8 + i7 >= ah3Var.r()) {
                i6 = ah3Var.r() - bh3Var.c;
                break;
            } else {
                i6 = (Character.isHighSurrogate(bh3Var.d((bh3Var.c + i7) + (-1))) && Character.isLowSurrogate(bh3Var.d(bh3Var.c + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = bh3Var.c;
        bh3Var.a(i9, i6 + i9);
        int i10 = bh3Var.b;
        bh3Var.a(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex7)) {
            return false;
        }
        ex7 ex7Var = (ex7) obj;
        return this.a == ex7Var.a && this.b == ex7Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return vz1.r(sb, this.b, ')');
    }
}
