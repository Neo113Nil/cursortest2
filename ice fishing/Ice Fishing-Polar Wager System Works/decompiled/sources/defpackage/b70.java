package defpackage;

/* loaded from: classes.dex */
public class b70 implements java.lang.Iterable, defpackage.g90 {
    public final int AARZUJiTa;
    public final int adDC3e2L;
    public final int xiZrDbcSW0;

    public b70(int i, int i2, int i3) {
        if (i3 == 0) {
            defpackage.db.fnWB2E7cs("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            defpackage.db.fnWB2E7cs("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.adDC3e2L = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                defpackage.db.fnWB2E7cs("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.b70)) {
            return false;
        }
        if (isEmpty() && ((defpackage.b70) obj).isEmpty()) {
            return true;
        }
        defpackage.b70 b70Var = (defpackage.b70) obj;
        return this.adDC3e2L == b70Var.adDC3e2L && this.xiZrDbcSW0 == b70Var.xiZrDbcSW0 && this.AARZUJiTa == b70Var.AARZUJiTa;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.adDC3e2L * 31) + this.xiZrDbcSW0) * 31) + this.AARZUJiTa;
    }

    public boolean isEmpty() {
        int i = this.xiZrDbcSW0;
        int i2 = this.AARZUJiTa;
        int i3 = this.adDC3e2L;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.c70(this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i = this.xiZrDbcSW0;
        int i2 = this.AARZUJiTa;
        int i3 = this.adDC3e2L;
        if (i2 > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
