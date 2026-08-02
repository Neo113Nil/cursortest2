package defpackage;

/* loaded from: classes9.dex */
public final class wy40 {
    public Object[] a;
    public int b;
    public ty40 c;

    public wy40(int i) {
        this.a = i == 0 ? jx81.c : new Object[i];
    }

    public final void a(wy40 wy40Var) {
        int i = this.b;
        int i2 = wy40Var.b;
        if (i2 == 0) {
            return;
        }
        int i3 = i + i2;
        Object[] objArr = this.a;
        if (objArr.length < i3) {
            int length = objArr.length;
            Object[] objArr2 = new Object[Math.max(i3, (length * 3) / 2)];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.a = objArr2;
        }
        f73.g(wy40Var.a, this.b, this.a, 0, wy40Var.b);
        this.b += wy40Var.b;
    }

    public final int b(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wy40) {
            wy40 wy40Var = (wy40) obj;
            int i = wy40Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = wy40Var.a;
                d6w n = y6i0.n(0, i2);
                int i3 = n.a;
                int i4 = n.b;
                if (i3 > i4) {
                    return true;
                }
                while (jl40.l(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public wy40() {
        this(16);
    }
}
