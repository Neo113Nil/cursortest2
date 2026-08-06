package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class n90 implements java.lang.Iterable, defpackage.nb0 {
    public final int QiMR8OkAhezm;
    public final int WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public n90(int i, int i2, int i3) {
        if (i3 == 0) {
            defpackage.h7.w7APNrr0aGRc("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            defpackage.h7.w7APNrr0aGRc("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.WDYagTQQm9ns = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                defpackage.h7.w7APNrr0aGRc("Step is zero.");
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
        this.oh71FJcDz6S2 = i2;
        this.QiMR8OkAhezm = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.n90)) {
            return false;
        }
        if (isEmpty() && ((defpackage.n90) obj).isEmpty()) {
            return true;
        }
        defpackage.n90 n90Var = (defpackage.n90) obj;
        return this.WDYagTQQm9ns == n90Var.WDYagTQQm9ns && this.oh71FJcDz6S2 == n90Var.oh71FJcDz6S2 && this.QiMR8OkAhezm == n90Var.QiMR8OkAhezm;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.WDYagTQQm9ns * 31) + this.oh71FJcDz6S2) * 31) + this.QiMR8OkAhezm;
    }

    public boolean isEmpty() {
        int i = this.oh71FJcDz6S2;
        int i2 = this.QiMR8OkAhezm;
        int i3 = this.WDYagTQQm9ns;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.o90(this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i = this.oh71FJcDz6S2;
        int i2 = this.QiMR8OkAhezm;
        int i3 = this.WDYagTQQm9ns;
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
