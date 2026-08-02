package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oxq {
    public final fxq a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public soi f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final iqe p;
    public final iqe q;
    public final iqe r;
    public soi s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public roi x;

    public oxq(fxq fxqVar) {
        this.a = fxqVar;
        int[] iArr = fxqVar.a;
        this.b = iArr;
        Object[] objArr = fxqVar.c;
        this.c = objArr;
        this.d = fxqVar.i;
        this.e = fxqVar.j;
        this.f = fxqVar.k;
        int i = fxqVar.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = fxqVar.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new iqe(1, false);
        this.q = new iqe(1, false);
        this.r = new iqe(1, false);
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void x(oxq oxqVar) {
        int i = oxqVar.v;
        int q = oxqVar.q(i);
        int[] iArr = oxqVar.b;
        int i2 = (q * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        oxqVar.U(oxqVar.E(iArr, i));
    }

    public final void A(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, n());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int q = q(min);
                int q2 = q(i5);
                int i7 = this.g;
                while (q < q2) {
                    int i8 = (q * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        pq5.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    q++;
                    if (q == i7) {
                        q += this.h;
                    }
                }
            } else {
                int q3 = q(i5);
                int q4 = q(min);
                while (q3 < q4) {
                    int i10 = (q3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        pq5.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    q3++;
                    if (q3 == this.g) {
                        q3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final List B(w80 w80Var, oxq oxqVar) {
        if (oxqVar.n <= 0) {
            pq5.c("Check failed");
        }
        if (this.n != 0) {
            pq5.c("Check failed");
        }
        if (!w80Var.a()) {
            pq5.c("Check failed");
        }
        int c = c(w80Var) + 1;
        int i = this.t;
        if (i > c || c >= this.u) {
            pq5.c("Check failed");
        }
        int E = E(this.b, c);
        int s = s(c);
        int D = w(c) ? 1 : D(c);
        List N = avf.N(this, c, oxqVar, false, false, true);
        U(E);
        boolean z = D > 0;
        while (E >= i) {
            int q = q(E);
            int[] iArr = this.b;
            int i2 = q * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - s;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    hxq.c(q, (i4 & 67108863) - D, iArr);
                }
            }
            E = E(this.b, E);
        }
        if (z) {
            if (this.o < D) {
                pq5.c("Check failed");
            }
            this.o -= D;
        }
        return N;
    }

    public final Object C(int i) {
        int q = q(i);
        int[] iArr = this.b;
        if ((iArr[(q * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iArr, q))];
        }
        return null;
    }

    public final int D(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int E(int[] iArr, int i) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (n() + i2) - (-2);
    }

    public final Object F(Object obj) {
        if (this.n > 0) {
            v(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            pq5.c("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i;
        roi roiVar = this.x;
        if (roiVar != null) {
            while (roiVar.b != 0) {
                int N = v7g.N(roiVar);
                int q = q(N);
                int i2 = N + 1;
                int s = s(N) + N;
                while (true) {
                    if (i2 >= s) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += s(i2);
                    }
                }
                int[] iArr = this.b;
                int i3 = (q * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int E = E(iArr, N);
                    if (E >= 0) {
                        v7g.n(roiVar, E);
                    }
                }
            }
        }
    }

    public final boolean H() {
        w80 R;
        if (this.n != 0) {
            pq5.c("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int f = f(this.b, q(i));
        int K = K();
        int i3 = this.v;
        HashMap hashMap = this.e;
        if (hashMap != null && (R = R(i3)) != null) {
        }
        roi roiVar = this.x;
        if (roiVar != null) {
            while (true) {
                int i4 = roiVar.b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    wvs.h("IntList is empty.");
                    return false;
                }
                if (roiVar.a[0] < i) {
                    break;
                }
                v7g.N(roiVar);
            }
        }
        boolean I = I(i, this.t - i);
        J(f, this.i - f, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= K;
        return I;
    }

    public final boolean I(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            z(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int a = hxq.a(this.d, i3, m() - this.h);
                if (a >= this.d.size()) {
                    a--;
                }
                int i4 = a + 1;
                int i5 = 0;
                while (a >= 0) {
                    w80 w80Var = (w80) this.d.get(a);
                    int c = c(w80Var);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        w80Var.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = a + 1;
                        }
                        i4 = a;
                    }
                    a--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                U(i8);
            }
        }
        return r0;
    }

    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            A(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final int K() {
        int q = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(iArr, q(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void L() {
        int i = this.u;
        this.t = i;
        this.i = f(this.b, q(i));
    }

    public final int M(int[] iArr, int i) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int b = hxq.b(iArr, i);
        return b < 0 ? (this.c.length - this.l) + b + 1 : b;
    }

    public final int N(int i, int i2) {
        int M = M(this.b, q(i));
        int f = f(this.b, q(i + 1));
        int i3 = M + i2;
        if (i3 >= M && i3 < f) {
            return i3;
        }
        pq5.c("Write to an invalid slot index " + i2 + " for group " + i);
        return i3;
    }

    public final int O(int i) {
        return f(this.b, q(s(i) + i));
    }

    public final void P() {
        if (this.n != 0) {
            pq5.c("Key must be supplied when inserting");
        }
        kjn kjnVar = gq5.a;
        Q(kjnVar, kjnVar, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Object obj, Object obj2, boolean z, int i) {
        int i2;
        HashMap hashMap;
        w80 R;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.d(this.o);
        kjn kjnVar = gq5.a;
        if (objArr == true) {
            int i4 = this.t;
            int f = f(this.b, q(i4));
            u(1);
            this.i = f;
            this.j = f;
            int q = q(i4);
            int i5 = obj != kjnVar ? 1 : 0;
            int i6 = (z || obj2 == kjnVar) ? 0 : 1;
            int h = h(f, this.k, this.l, this.c.length);
            if (h >= 0 && this.m < i4) {
                h = -(((this.c.length - this.l) - h) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = q * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = h;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                v(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0 && (hashMap = this.e) != null && (R = R(i3)) != null) {
            }
        } else {
            this.p.d(i3);
            this.q.d((m() - this.h) - this.u);
            int i11 = this.t;
            int q2 = q(i11);
            if (!Intrinsics.d(obj2, kjnVar)) {
                if (z) {
                    V(this.t, obj2);
                } else {
                    T(obj2);
                }
            }
            this.i = M(this.b, q2);
            this.j = f(this.b, q(this.t + 1));
            int[] iArr2 = this.b;
            int i12 = q2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final w80 R(int i) {
        ArrayList arrayList;
        int d;
        if (i < 0 || i >= n() || (d = hxq.d((arrayList = this.d), i, n())) < 0) {
            return null;
        }
        return (w80) arrayList.get(d);
    }

    public final void S(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            F(obj);
            return;
        }
        soi soiVar = this.s;
        if (soiVar == null) {
            soiVar = new soi();
        }
        this.s = soiVar;
        int i = this.v;
        Object b = soiVar.b(i);
        if (b == null) {
            b = new gpi();
            soiVar.h(i, b);
        }
        ((gpi) b).a(obj);
    }

    public final void T(Object obj) {
        int q = q(this.t);
        int i = (q * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            pq5.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iArr, q))] = obj;
    }

    public final void U(int i) {
        if (i >= 0) {
            roi roiVar = this.x;
            if (roiVar == null) {
                roiVar = new roi();
                this.x = roiVar;
            }
            v7g.n(roiVar, i);
        }
    }

    public final void V(int i, Object obj) {
        int q = q(i);
        int[] iArr = this.b;
        if (q >= iArr.length || (iArr[(q * 5) + 1] & 1073741824) == 0) {
            pq5.c("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(this.b, q))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            pq5.c("Cannot seek backwards");
        }
        if (this.n > 0) {
            llm.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            pq5.c("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int f = f(this.b, q(i2));
        this.i = f;
        this.j = f;
    }

    public final w80 b(int i) {
        ArrayList arrayList = this.d;
        int d = hxq.d(arrayList, i, n());
        if (d >= 0) {
            return (w80) arrayList.get(d);
        }
        if (i > this.g) {
            i = -(n() - i);
        }
        w80 w80Var = new w80(i);
        arrayList.add(-(d + 1), w80Var);
        return w80Var;
    }

    public final int c(w80 w80Var) {
        int i = w80Var.a;
        return i < 0 ? n() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.d((m() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            z(n());
            A(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            G();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        soi soiVar = this.f;
        fxq fxqVar = this.a;
        if (!fxqVar.g) {
            llm.a("Unexpected writer close()");
        }
        fxqVar.g = false;
        fxqVar.a = iArr;
        fxqVar.b = i2;
        fxqVar.c = objArr;
        fxqVar.d = i3;
        fxqVar.i = arrayList;
        fxqVar.j = hashMap;
        fxqVar.k = soiVar;
    }

    public final int f(int[] iArr, int i) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        gpi gpiVar;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int q = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = q * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        iqe iqeVar = this.r;
        if (z) {
            soi soiVar = this.s;
            if (soiVar != null && (gpiVar = (gpi) soiVar.b(i3)) != null) {
                Object[] objArr = gpiVar.a;
                int i8 = gpiVar.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    F(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            hxq.c(q, i4, iArr);
            int c = iqeVar.c();
            if (z2) {
                i4 = 1;
            }
            this.o = c + i4;
            int E = E(this.b, i3);
            this.v = E;
            int n = E < 0 ? n() : q(E + 1);
            int f = n >= 0 ? f(this.b, n) : 0;
            this.i = f;
            this.j = f;
            return;
        }
        if (i != i2) {
            pq5.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        hxq.c(q, i4, iArr2);
        int c2 = this.p.c();
        this.u = (m() - this.h) - this.q.c();
        this.v = c2;
        int E2 = E(this.b, i3);
        int c3 = iqeVar.c();
        this.o = c3;
        if (E2 == c2) {
            this.o = c3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (E2 != 0 && E2 != c2 && (i14 != 0 || i13 != 0)) {
                int q2 = q(E2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (q2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    hxq.c(q2, (iArr4[(q2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(q2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                E2 = E(iArr5, E2);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            llm.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                pq5.c("startGroup/endGroup mismatch while inserting");
            }
            this.u = (m() - this.h) - this.q.c();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            pq5.c("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                pq5.c("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            P();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((n() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int m() {
        return this.b.length / 5;
    }

    public final int n() {
        return m() - this.h;
    }

    public final int o() {
        return this.c.length - this.l;
    }

    public final Object p(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = (q * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return gq5.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iArr, q)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final Object r(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int s(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final boolean t(int i, int i2) {
        int m;
        int s;
        if (i2 == this.v) {
            m = this.u;
        } else {
            iqe iqeVar = this.p;
            if (i2 > iqeVar.b(0)) {
                s = s(i2);
            } else {
                int[] iArr = iqeVar.a;
                int min = Math.min(iArr.length, iqeVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    s = s(i2);
                } else {
                    m = (m() - this.h) - this.q.a[i3];
                }
            }
            m = s + i2;
        }
        return i > i2 && i < m;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + n() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final void u(int i) {
        if (i > 0) {
            int i2 = this.t;
            z(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                uz0.e(0, 0, i3 * 5, iArr, iArr2);
                uz0.e((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int h = h(i5 > 0 ? f(this.b, q(i2 + i)) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = h;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void v(int i, int i2) {
        if (i > 0) {
            A(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean w(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void y(fxq fxqVar, int i) {
        if (this.n <= 0) {
            pq5.c("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int[] iArr = fxqVar.a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = fxqVar.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                soi soiVar = this.f;
                Object[] objArr2 = fxqVar.c;
                int i4 = fxqVar.d;
                HashMap hashMap2 = fxqVar.j;
                soi soiVar2 = fxqVar.k;
                this.b = iArr;
                this.c = objArr2;
                this.d = fxqVar.i;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = soiVar2;
                fxqVar.a = iArr2;
                fxqVar.b = 0;
                fxqVar.c = objArr;
                fxqVar.d = 0;
                fxqVar.i = arrayList;
                fxqVar.j = hashMap;
                fxqVar.k = soiVar;
                return;
            }
        }
        oxq o = fxqVar.o();
        try {
            avf.N(o, i, this, true, true, false);
            o.e(true);
        } catch (Throwable th) {
            o.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.uz0.e(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.uz0.e(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(int i) {
        w80 w80Var;
        int i2;
        w80 w80Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int m = m() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int a = hxq.a(arrayList, i6, m); a < this.d.size() && (i3 = (w80Var2 = (w80) this.d.get(a)).a) < 0 && (i4 = i3 + m) < i; a++) {
                        w80Var2.a = i4;
                    }
                } else {
                    for (int a2 = hxq.a(arrayList, i, m); a2 < this.d.size() && (i2 = (w80Var = (w80) this.d.get(a2)).a) >= 0; a2++) {
                        w80Var.a = -(m - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int m2 = m();
            if (i6 >= m2) {
                pq5.c("Check failed");
            }
            while (i6 < m2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                int n = i8 > -2 ? i8 : (n() + i8) - (-2);
                if (n >= i) {
                    n = -((n() - n) - (-2));
                }
                if (n != i8) {
                    this.b[i7] = n;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }
}
