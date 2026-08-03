package m0;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final j2 f4614a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4615b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4616c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4617d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4618e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4619f;

    /* renamed from: g, reason: collision with root package name */
    public int f4620g;

    /* renamed from: h, reason: collision with root package name */
    public int f4621h;

    /* renamed from: i, reason: collision with root package name */
    public int f4622i;

    /* renamed from: j, reason: collision with root package name */
    public final r0 f4623j;

    /* renamed from: k, reason: collision with root package name */
    public int f4624k;

    /* renamed from: l, reason: collision with root package name */
    public int f4625l;

    /* renamed from: m, reason: collision with root package name */
    public int f4626m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4627n;

    public i2(j2 j2Var) {
        this.f4614a = j2Var;
        this.f4615b = j2Var.f4631g;
        int i10 = j2Var.f4632h;
        this.f4616c = i10;
        this.f4617d = j2Var.f4633i;
        this.f4618e = j2Var.f4634j;
        this.f4621h = i10;
        this.f4622i = -1;
        this.f4623j = new r0();
    }

    public final a a(int i10) {
        ArrayList arrayList = this.f4614a.f4639o;
        int e10 = l2.e(arrayList, i10, this.f4616c);
        if (e10 >= 0) {
            return (a) arrayList.get(e10);
        }
        a aVar = new a(i10);
        arrayList.add(-(e10 + 1), aVar);
        return aVar;
    }

    public final Object b(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((268435456 & i12) != 0) {
            return this.f4617d[i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(i12 >> 29)];
        }
        return l.f4646a;
    }

    public final void c() {
        this.f4619f = true;
        j2 j2Var = this.f4614a;
        j2Var.getClass();
        if (this.f4614a != j2Var || j2Var.f4635k <= 0) {
            t.c("Unexpected reader close()");
        }
        j2Var.f4635k--;
        this.f4617d = new Object[0];
    }

    public final boolean d(int i10) {
        return (this.f4615b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f4624k == 0) {
            if (!(this.f4620g == this.f4621h)) {
                t.c("endGroup() not called at the end of a group");
            }
            int i10 = (this.f4622i * 5) + 2;
            int[] iArr = this.f4615b;
            int i11 = iArr[i10];
            this.f4622i = i11;
            int i12 = this.f4616c;
            this.f4621h = i11 < 0 ? i12 : l2.a(iArr, i11) + i11;
            int b2 = this.f4623j.b();
            if (b2 < 0) {
                this.f4625l = 0;
                this.f4626m = 0;
            } else {
                this.f4625l = b2;
                this.f4626m = i11 >= i12 - 1 ? this.f4618e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i10 = this.f4620g;
        if (i10 < this.f4621h) {
            return b(this.f4615b, i10);
        }
        return 0;
    }

    public final int g() {
        int i10 = this.f4620g;
        if (i10 >= this.f4621h) {
            return 0;
        }
        return this.f4615b[i10 * 5];
    }

    public final Object h(int i10, int i11) {
        int[] iArr = this.f4615b;
        int c3 = l2.c(iArr, i10);
        int i12 = i10 + 1;
        int i13 = c3 + i11;
        return i13 < (i12 < this.f4616c ? iArr[(i12 * 5) + 4] : this.f4618e) ? this.f4617d[i13] : l.f4646a;
    }

    public final int i(int i10) {
        return this.f4615b[i10 * 5];
    }

    public final boolean j(int i10) {
        return (this.f4615b[(i10 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i10) {
        return (this.f4615b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i10) {
        return (this.f4615b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i10;
        if (this.f4624k > 0 || (i10 = this.f4625l) >= this.f4626m) {
            this.f4627n = false;
            return l.f4646a;
        }
        this.f4627n = true;
        Object[] objArr = this.f4617d;
        this.f4625l = i10 + 1;
        return objArr[i10];
    }

    public final Object n(int i10) {
        int i11 = i10 * 5;
        int[] iArr = this.f4615b;
        int i12 = iArr[i11 + 1] & 1073741824;
        if (i12 != 0) {
            return i12 != 0 ? this.f4617d[iArr[i11 + 4]] : l.f4646a;
        }
        return null;
    }

    public final int o(int i10) {
        return this.f4615b[(i10 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f4617d[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int q(int i10) {
        return this.f4615b[(i10 * 5) + 2];
    }

    public final void r(int i10) {
        if (!(this.f4624k == 0)) {
            t.c("Cannot reposition while in an empty region");
        }
        this.f4620g = i10;
        int[] iArr = this.f4615b;
        int i11 = this.f4616c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        if (i12 != this.f4622i) {
            this.f4622i = i12;
            if (i12 < 0) {
                this.f4621h = i11;
            } else {
                this.f4621h = l2.a(iArr, i12) + i12;
            }
            this.f4625l = 0;
            this.f4626m = 0;
        }
    }

    public final int s() {
        if (!(this.f4624k == 0)) {
            t.c("Cannot skip while in an empty region");
        }
        int i10 = this.f4620g;
        int[] iArr = this.f4615b;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f4620g = l2.a(iArr, i10) + i10;
        return i11;
    }

    public final void t() {
        if (!(this.f4624k == 0)) {
            t.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f4620g = this.f4621h;
        this.f4625l = 0;
        this.f4626m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f4620g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.f4622i);
        sb.append(", end=");
        return a4.d.l(sb, this.f4621h, ')');
    }

    public final void u() {
        if (this.f4624k <= 0) {
            int i10 = this.f4622i;
            int i11 = this.f4620g;
            int[] iArr = this.f4615b;
            if (!(iArr[(i11 * 5) + 2] == i10)) {
                s1.a("Invalid slot table detected");
            }
            int i12 = this.f4625l;
            int i13 = this.f4626m;
            r0 r0Var = this.f4623j;
            if (i12 == 0 && i13 == 0) {
                r0Var.c(-1);
            } else {
                r0Var.c(i12);
            }
            this.f4622i = i11;
            this.f4621h = l2.a(iArr, i11) + i11;
            int i14 = i11 + 1;
            this.f4620g = i14;
            this.f4625l = l2.c(iArr, i11);
            this.f4626m = i11 >= this.f4616c - 1 ? this.f4618e : iArr[(i14 * 5) + 4];
        }
    }
}
