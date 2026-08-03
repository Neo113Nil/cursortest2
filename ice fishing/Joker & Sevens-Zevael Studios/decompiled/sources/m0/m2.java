package m0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final j2 f4658a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4659b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4660c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4661d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f4662e;

    /* renamed from: f, reason: collision with root package name */
    public s.u f4663f;

    /* renamed from: g, reason: collision with root package name */
    public int f4664g;

    /* renamed from: h, reason: collision with root package name */
    public int f4665h;

    /* renamed from: i, reason: collision with root package name */
    public int f4666i;

    /* renamed from: j, reason: collision with root package name */
    public int f4667j;

    /* renamed from: k, reason: collision with root package name */
    public int f4668k;

    /* renamed from: l, reason: collision with root package name */
    public int f4669l;

    /* renamed from: m, reason: collision with root package name */
    public int f4670m;

    /* renamed from: n, reason: collision with root package name */
    public int f4671n;

    /* renamed from: o, reason: collision with root package name */
    public int f4672o;

    /* renamed from: p, reason: collision with root package name */
    public final r0 f4673p;

    /* renamed from: q, reason: collision with root package name */
    public final r0 f4674q;

    /* renamed from: r, reason: collision with root package name */
    public final r0 f4675r;

    /* renamed from: s, reason: collision with root package name */
    public s.u f4676s;

    /* renamed from: t, reason: collision with root package name */
    public int f4677t;

    /* renamed from: u, reason: collision with root package name */
    public int f4678u;

    /* renamed from: v, reason: collision with root package name */
    public int f4679v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4680w;

    /* renamed from: x, reason: collision with root package name */
    public s.t f4681x;

    public m2(j2 j2Var) {
        this.f4658a = j2Var;
        int[] iArr = j2Var.f4631g;
        this.f4659b = iArr;
        Object[] objArr = j2Var.f4633i;
        this.f4660c = objArr;
        this.f4661d = j2Var.f4639o;
        this.f4662e = j2Var.f4640p;
        this.f4663f = j2Var.f4641q;
        int i10 = j2Var.f4632h;
        this.f4664g = i10;
        this.f4665h = (iArr.length / 5) - i10;
        int i11 = j2Var.f4634j;
        this.f4668k = i11;
        this.f4669l = objArr.length - i11;
        this.f4670m = i10;
        this.f4673p = new r0();
        this.f4674q = new r0();
        this.f4675r = new r0();
        this.f4678u = i10;
        this.f4679v = -1;
    }

    public static int i(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static void y(m2 m2Var) {
        int i10 = m2Var.f4679v;
        int r5 = m2Var.r(i10);
        int[] iArr = m2Var.f4659b;
        int i11 = (r5 * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) != 0) {
            return;
        }
        int i13 = (i12 & (-134217729)) | 134217728;
        iArr[i11] = i13;
        if ((67108864 & i13) != 0) {
            return;
        }
        m2Var.S(m2Var.D(iArr, i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f4659b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        bc.l.P(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        bc.l.P(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i10) {
        a aVar;
        int i11;
        a aVar2;
        int i12;
        int i13;
        int i14 = this.f4665h;
        int i15 = this.f4664g;
        if (i15 != i10) {
            if (!this.f4661d.isEmpty()) {
                int o7 = o() - this.f4665h;
                if (i15 < i10) {
                    for (int b2 = l2.b(this.f4661d, i15, o7); b2 < this.f4661d.size() && (i12 = (aVar2 = (a) this.f4661d.get(b2)).f4509a) < 0 && (i13 = i12 + o7) < i10; b2++) {
                        aVar2.f4509a = i13;
                    }
                } else {
                    for (int b10 = l2.b(this.f4661d, i10, o7); b10 < this.f4661d.size() && (i11 = (aVar = (a) this.f4661d.get(b10)).f4509a) >= 0; b10++) {
                        aVar.f4509a = -(o7 - i11);
                    }
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int o10 = o();
            if (i15 >= o10) {
                t.c("Check failed");
            }
            while (i15 < o10) {
                int i16 = (i15 * 5) + 2;
                int i17 = this.f4659b[i16];
                int p8 = i17 > -2 ? i17 : (p() + i17) - (-2);
                if (p8 >= i10) {
                    p8 = -((p() - p8) - (-2));
                }
                if (p8 != i17) {
                    this.f4659b[i16] = p8;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f4664g = i10;
    }

    public final void B(int i10, int i11) {
        int i12 = this.f4669l;
        int i13 = this.f4668k;
        int i14 = this.f4670m;
        if (i13 != i10) {
            Object[] objArr = this.f4660c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int min = Math.min(i11 + 1, p());
        if (i14 != min) {
            int length = this.f4660c.length - i12;
            if (min < i14) {
                int r5 = r(min);
                int r10 = r(i14);
                int i16 = this.f4664g;
                while (r5 < r10) {
                    int i17 = (r5 * 5) + 4;
                    int i18 = this.f4659b[i17];
                    if (!(i18 >= 0)) {
                        t.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f4659b[i17] = -((length - i18) + 1);
                    r5++;
                    if (r5 == i16) {
                        r5 += this.f4665h;
                    }
                }
            } else {
                int r11 = r(i14);
                int r12 = r(min);
                while (r11 < r12) {
                    int i19 = (r11 * 5) + 4;
                    int i20 = this.f4659b[i19];
                    if (!(i20 < 0)) {
                        t.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f4659b[i19] = i20 + length + 1;
                    r11++;
                    if (r11 == this.f4664g) {
                        r11 += this.f4665h;
                    }
                }
            }
            this.f4670m = min;
        }
        this.f4668k = i10;
    }

    public final Object C(int i10) {
        int r5 = r(i10);
        int[] iArr = this.f4659b;
        if ((iArr[(r5 * 5) + 1] & 1073741824) != 0) {
            return this.f4660c[h(g(iArr, r5))];
        }
        return null;
    }

    public final int D(int[] iArr, int i10) {
        int i11 = iArr[(r(i10) * 5) + 2];
        return i11 > -2 ? i11 : (p() + i11) - (-2);
    }

    public final Object E(Object obj) {
        if (this.f4671n > 0) {
            w(1, this.f4679v);
        }
        Object[] objArr = this.f4660c;
        int i10 = this.f4666i;
        this.f4666i = i10 + 1;
        Object obj2 = objArr[h(i10)];
        if (this.f4666i > this.f4667j) {
            t.c("Writing to an invalid slot");
        }
        this.f4660c[h(this.f4666i - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i10;
        s.t tVar = this.f4681x;
        if (tVar != null) {
            while (tVar.f6342b != 0) {
                int x10 = z.x(tVar);
                int r5 = r(x10);
                int i11 = x10 + 1;
                int t3 = t(x10) + x10;
                while (true) {
                    if (i11 >= t3) {
                        i10 = 0;
                        break;
                    } else {
                        if ((this.f4659b[(r(i11) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        i11 += t(i11);
                    }
                }
                int[] iArr = this.f4659b;
                int i12 = (r5 * 5) + 1;
                int i13 = iArr[i12];
                if (((67108864 & i13) != 0 ? 1 : 0) != i10) {
                    iArr[i12] = (i10 << 26) | ((-67108865) & i13);
                    int D = D(iArr, x10);
                    if (D >= 0) {
                        z.h(tVar, D);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (!(this.f4671n == 0)) {
            t.c("Cannot remove group while inserting");
        }
        int i10 = this.f4677t;
        int i11 = this.f4666i;
        int g8 = g(this.f4659b, r(i10));
        int K = K();
        N(this.f4679v);
        s.t tVar = this.f4681x;
        if (tVar != null) {
            while (true) {
                int i12 = tVar.f6342b;
                if (i12 == 0) {
                    break;
                }
                if (i12 == 0) {
                    t.a.e("IntList is empty.");
                    throw null;
                }
                if (tVar.f6341a[0] < i10) {
                    break;
                }
                z.x(tVar);
            }
        }
        boolean H = H(i10, this.f4677t - i10);
        I(g8, this.f4666i - g8, i10 - 1);
        this.f4677t = i10;
        this.f4666i = i11;
        this.f4672o -= K;
        return H;
    }

    public final boolean H(int i10, int i11) {
        if (i11 > 0) {
            ArrayList arrayList = this.f4661d;
            A(i10);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f4662e;
                int i12 = i10 + i11;
                int b2 = l2.b(this.f4661d, i12, o() - this.f4665h);
                if (b2 >= this.f4661d.size()) {
                    b2--;
                }
                int i13 = b2 + 1;
                int i14 = 0;
                while (b2 >= 0) {
                    a aVar = (a) this.f4661d.get(b2);
                    int c3 = c(aVar);
                    if (c3 < i10) {
                        break;
                    }
                    if (c3 < i12) {
                        aVar.f4509a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i14 == 0) {
                            i14 = b2 + 1;
                        }
                        i13 = b2;
                    }
                    b2--;
                }
                r0 = i13 < i14;
                if (r0) {
                    this.f4661d.subList(i13, i14).clear();
                }
            }
            this.f4664g = i10;
            this.f4665h += i11;
            int i15 = this.f4670m;
            if (i15 > i10) {
                this.f4670m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f4678u;
            if (i16 >= this.f4664g) {
                this.f4678u = i16 - i11;
            }
            int i17 = this.f4679v;
            if (i17 >= 0 && (this.f4659b[(r(i17) * 5) + 1] & 67108864) != 0) {
                S(i17);
            }
        }
        return r0;
    }

    public final void I(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f4669l;
            int i14 = i10 + i11;
            B(i14, i12);
            this.f4668k = i10;
            this.f4669l = i13 + i11;
            bc.l.V(i10, i14, null, this.f4660c);
            int i15 = this.f4667j;
            if (i15 >= i10) {
                this.f4667j = i15 - i11;
            }
        }
    }

    public final Object J(int i10, int i11, Object obj) {
        int M = M(this.f4659b, r(i10));
        int g8 = g(this.f4659b, r(i10 + 1));
        int i12 = M + i11;
        if (i12 < M || i12 >= g8) {
            t.c("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        int h10 = h(i12);
        Object[] objArr = this.f4660c;
        Object obj2 = objArr[h10];
        objArr[h10] = obj;
        return obj2;
    }

    public final int K() {
        int r5 = r(this.f4677t);
        int a6 = l2.a(this.f4659b, r5) + this.f4677t;
        this.f4677t = a6;
        this.f4666i = g(this.f4659b, r(a6));
        int i10 = this.f4659b[(r5 * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    public final void L() {
        int i10 = this.f4678u;
        this.f4677t = i10;
        this.f4666i = g(this.f4659b, r(i10));
    }

    public final int M(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f4660c.length - this.f4669l;
        }
        int c3 = l2.c(iArr, i10);
        return c3 < 0 ? (this.f4660c.length - this.f4669l) + c3 + 1 : c3;
    }

    public final q0 N(int i10) {
        a Q;
        HashMap hashMap = this.f4662e;
        if (hashMap == null || (Q = Q(i10)) == null) {
            return null;
        }
        return (q0) hashMap.get(Q);
    }

    public final void O() {
        if (this.f4671n != 0) {
            t.c("Key must be supplied when inserting");
        }
        z0 z0Var = l.f4646a;
        P(0, z0Var, z0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i10, Object obj, Object obj2, boolean z10) {
        int i11;
        int i12 = this.f4679v;
        Object[] objArr = this.f4671n > 0;
        this.f4675r.c(this.f4672o);
        z0 z0Var = l.f4646a;
        if (objArr == true) {
            int i13 = this.f4677t;
            int g8 = g(this.f4659b, r(i13));
            v(1);
            this.f4666i = g8;
            this.f4667j = g8;
            int r5 = r(i13);
            int i14 = obj != z0Var ? 1 : 0;
            int i15 = (z10 || obj2 == z0Var) ? 0 : 1;
            int i16 = i(g8, this.f4668k, this.f4669l, this.f4660c.length);
            if (i16 >= 0 && this.f4670m < i13) {
                i16 = -(((this.f4660c.length - this.f4669l) - i16) + 1);
            }
            int[] iArr = this.f4659b;
            int i17 = this.f4679v;
            int i18 = r5 * 5;
            iArr[i18] = i10;
            iArr[i18 + 1] = ((z10 ? 1 : 0) << 30) | (i14 << 29) | (i15 << 28);
            iArr[i18 + 2] = i17;
            iArr[i18 + 3] = 0;
            iArr[i18 + 4] = i16;
            int i19 = (z10 ? 1 : 0) + i14 + i15;
            if (i19 > 0) {
                w(i19, i13);
                Object[] objArr2 = this.f4660c;
                int i20 = this.f4666i;
                if (z10) {
                    objArr2[i20] = obj2;
                    i20++;
                }
                if (i14 != 0) {
                    objArr2[i20] = obj;
                    i20++;
                }
                if (i15 != 0) {
                    objArr2[i20] = obj2;
                    i20++;
                }
                this.f4666i = i20;
            }
            this.f4672o = 0;
            i11 = i13 + 1;
            this.f4679v = i13;
            this.f4677t = i11;
            if (i12 >= 0) {
                N(i12);
            }
        } else {
            this.f4673p.c(i12);
            this.f4674q.c((o() - this.f4665h) - this.f4678u);
            int i21 = this.f4677t;
            int r10 = r(i21);
            if (!pc.j.a(obj2, z0Var)) {
                if (z10) {
                    T(this.f4677t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.f4666i = M(this.f4659b, r10);
            this.f4667j = g(this.f4659b, r(this.f4677t + 1));
            int[] iArr2 = this.f4659b;
            int i22 = r10 * 5;
            this.f4672o = iArr2[i22 + 1] & 67108863;
            this.f4679v = i21;
            this.f4677t = i21 + 1;
            i11 = i21 + iArr2[i22 + 3];
        }
        this.f4678u = i11;
    }

    public final a Q(int i10) {
        ArrayList arrayList;
        int e10;
        if (i10 < 0 || i10 >= p() || (e10 = l2.e((arrayList = this.f4661d), i10, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(e10);
    }

    public final void R(Object obj) {
        int r5 = r(this.f4677t);
        int i10 = (r5 * 5) + 1;
        if ((this.f4659b[i10] & 268435456) == 0) {
            t.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f4660c;
        int[] iArr = this.f4659b;
        objArr[h(Integer.bitCount(iArr[i10] >> 29) + g(iArr, r5))] = obj;
    }

    public final void S(int i10) {
        if (i10 >= 0) {
            s.t tVar = this.f4681x;
            if (tVar == null) {
                tVar = new s.t();
                this.f4681x = tVar;
            }
            z.h(tVar, i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i10, Object obj) {
        int r5 = r(i10);
        int[] iArr = this.f4659b;
        boolean z10 = r5 < iArr.length;
        if (!z10) {
            t.c("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f4660c[h(g(this.f4659b, r5))] = obj;
    }

    public final void a(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            t.c("Cannot seek backwards");
        }
        if (!(this.f4671n <= 0)) {
            s1.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f4677t + i10;
        if (i11 >= this.f4679v && i11 <= this.f4678u) {
            z10 = true;
        }
        if (!z10) {
            t.c("Cannot seek outside the current group (" + this.f4679v + '-' + this.f4678u + ')');
        }
        this.f4677t = i11;
        int g8 = g(this.f4659b, r(i11));
        this.f4666i = g8;
        this.f4667j = g8;
    }

    public final a b(int i10) {
        ArrayList arrayList = this.f4661d;
        int e10 = l2.e(arrayList, i10, p());
        if (e10 >= 0) {
            return (a) arrayList.get(e10);
        }
        if (i10 > this.f4664g) {
            i10 = -(p() - i10);
        }
        a aVar = new a(i10);
        arrayList.add(-(e10 + 1), aVar);
        return aVar;
    }

    public final int c(a aVar) {
        int i10 = aVar.f4509a;
        return i10 < 0 ? p() + i10 : i10;
    }

    public final void d() {
        int i10 = this.f4671n;
        this.f4671n = i10 + 1;
        if (i10 == 0) {
            this.f4674q.c((o() - this.f4665h) - this.f4678u);
        }
    }

    public final void e(boolean z10) {
        this.f4680w = true;
        if (z10 && this.f4673p.f4748b == 0) {
            A(p());
            B(this.f4660c.length - this.f4669l, this.f4664g);
            int i10 = this.f4668k;
            Arrays.fill(this.f4660c, i10, this.f4669l + i10, (Object) null);
            F();
        }
        int[] iArr = this.f4659b;
        int i11 = this.f4664g;
        Object[] objArr = this.f4660c;
        int i12 = this.f4668k;
        ArrayList arrayList = this.f4661d;
        HashMap hashMap = this.f4662e;
        s.u uVar = this.f4663f;
        j2 j2Var = this.f4658a;
        if (!j2Var.f4637m) {
            s1.a("Unexpected writer close()");
        }
        j2Var.f4637m = false;
        j2Var.f4631g = iArr;
        j2Var.f4632h = i11;
        j2Var.f4633i = objArr;
        j2Var.f4634j = i12;
        j2Var.f4639o = arrayList;
        j2Var.f4640p = hashMap;
        j2Var.f4641q = uVar;
    }

    public final int f(int i10) {
        return g(this.f4659b, r(i10));
    }

    public final int g(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f4660c.length - this.f4669l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f4660c.length - this.f4669l) + i11 + 1 : i11;
    }

    public final int h(int i10) {
        return (this.f4669l * (i10 < this.f4668k ? 0 : 1)) + i10;
    }

    public final void j() {
        s.a0 a0Var;
        boolean z10 = this.f4671n > 0;
        int i10 = this.f4677t;
        int i11 = this.f4678u;
        int i12 = this.f4679v;
        int r5 = r(i12);
        int i13 = this.f4672o;
        int i14 = i10 - i12;
        int i15 = r5 * 5;
        int i16 = i15 + 1;
        boolean z11 = (this.f4659b[i16] & 1073741824) != 0;
        r0 r0Var = this.f4675r;
        if (z10) {
            s.u uVar = this.f4676s;
            if (uVar != null && (a0Var = (s.a0) uVar.b(i12)) != null) {
                Object[] objArr = a0Var.f6219a;
                int i17 = a0Var.f6220b;
                for (int i18 = 0; i18 < i17; i18++) {
                    E(objArr[i18]);
                }
            }
            int[] iArr = this.f4659b;
            iArr[i15 + 3] = i14;
            l2.d(r5, i13, iArr);
            int b2 = r0Var.b();
            if (z11) {
                i13 = 1;
            }
            this.f4672o = b2 + i13;
            int D = D(this.f4659b, i12);
            this.f4679v = D;
            int p8 = D < 0 ? p() : r(D + 1);
            int g8 = p8 >= 0 ? g(this.f4659b, p8) : 0;
            this.f4666i = g8;
            this.f4667j = g8;
            return;
        }
        if (i10 != i11) {
            t.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f4659b;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        l2.d(r5, i13, iArr2);
        int b10 = this.f4673p.b();
        this.f4678u = (o() - this.f4665h) - this.f4674q.b();
        this.f4679v = b10;
        int D2 = D(this.f4659b, i12);
        int b11 = r0Var.b();
        this.f4672o = b11;
        if (D2 == b10) {
            this.f4672o = b11 + (z11 ? 0 : i13 - i21);
            return;
        }
        int i22 = i14 - i20;
        int i23 = z11 ? 0 : i13 - i21;
        if (i22 != 0 || i23 != 0) {
            while (D2 != 0 && D2 != b10 && (i23 != 0 || i22 != 0)) {
                int r10 = r(D2);
                if (i22 != 0) {
                    int[] iArr3 = this.f4659b;
                    int i24 = (r10 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i22;
                }
                if (i23 != 0) {
                    int[] iArr4 = this.f4659b;
                    l2.d(r10, (iArr4[(r10 * 5) + 1] & 67108863) + i23, iArr4);
                }
                int[] iArr5 = this.f4659b;
                if ((iArr5[(r10 * 5) + 1] & 1073741824) != 0) {
                    i23 = 0;
                }
                D2 = D(iArr5, D2);
            }
        }
        this.f4672o += i23;
    }

    public final void k() {
        if (this.f4671n <= 0) {
            s1.b("Unbalanced begin/end insert");
        }
        int i10 = this.f4671n - 1;
        this.f4671n = i10;
        if (i10 == 0) {
            if (this.f4675r.f4748b != this.f4673p.f4748b) {
                t.c("startGroup/endGroup mismatch while inserting");
            }
            this.f4678u = (o() - this.f4665h) - this.f4674q.b();
        }
    }

    public final void l(int i10) {
        boolean z10 = false;
        if (!(this.f4671n <= 0)) {
            t.c("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f4679v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f4678u) {
                z10 = true;
            }
            if (!z10) {
                t.c("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f4677t;
            int i13 = this.f4666i;
            int i14 = this.f4667j;
            this.f4677t = i10;
            O();
            this.f4677t = i12;
            this.f4666i = i13;
            this.f4667j = i14;
        }
    }

    public final void m(int i10, int i11, int i12) {
        if (i10 >= this.f4664g) {
            i10 = -((p() - i10) + 2);
        }
        while (i12 < i11) {
            this.f4659b[(r(i12) * 5) + 2] = i10;
            int i13 = this.f4659b[(r(i12) * 5) + 3] + i12;
            m(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i10, oc.e eVar) {
        int i11;
        int i12;
        a aVar;
        oc.e eVar2 = eVar;
        int D = D(this.f4659b, i10);
        int p8 = p();
        int t3 = t(i10) + i10;
        int i13 = i10;
        s.v vVar = null;
        s.t tVar = null;
        loop0: while (i13 < t3) {
            int i14 = i13 + 1;
            int f10 = f(i14);
            for (int f11 = f(i13); f11 < f10; f11++) {
                Object obj = this.f4660c[h(f11)];
                if ((obj instanceof f2) && (aVar = ((f2) obj).f4586b) != null && aVar.a()) {
                    int c3 = c(aVar);
                    if (vVar == null) {
                        int[] iArr = s.m.f6304a;
                        vVar = new s.v();
                    }
                    if (tVar == null) {
                        tVar = new s.t();
                    }
                    vVar.a(c3);
                    tVar.a(c3);
                    tVar.a(f11);
                } else {
                    eVar2.invoke(Integer.valueOf(f11), obj);
                }
            }
            int D2 = i14 < p8 ? D(this.f4659b, i14) : -1;
            if (D2 != i13) {
                while (true) {
                    if (tVar == null || vVar == null || !vVar.e(i13)) {
                        i11 = p8;
                    } else {
                        int i15 = tVar.f6342b;
                        int i16 = i15 / 2;
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < i16) {
                            int i19 = i17 * 2;
                            int i20 = p8;
                            int c7 = tVar.c(i19);
                            if (c7 == i13) {
                                int c10 = tVar.c(i19 + 1);
                                eVar2.invoke(Integer.valueOf(c10), this.f4660c[h(c10)]);
                            } else if (i19 != i18) {
                                int i21 = i18 + 1;
                                tVar.e(i18, c7);
                                i18 += 2;
                                tVar.e(i21, tVar.c(i19 + 1));
                            } else {
                                i18 += 2;
                            }
                            i17++;
                            eVar2 = eVar;
                            p8 = i20;
                        }
                        i11 = p8;
                        if (i18 != i15) {
                            if (i18 < 0 || i18 > (i12 = tVar.f6342b) || i15 < 0 || i15 > i12) {
                                break loop0;
                            }
                            if (i15 < i18) {
                                t.a.c("The end index must be < start index");
                                throw null;
                            }
                            if (i15 != i18) {
                                if (i15 < i12) {
                                    int[] iArr2 = tVar.f6341a;
                                    bc.l.P(i18, i15, i12, iArr2, iArr2);
                                }
                                tVar.f6342b -= i15 - i18;
                            }
                        }
                    }
                    if (i13 != i10 && D != D2) {
                        i13 = D;
                        p8 = i11;
                        D = D(this.f4659b, D);
                        eVar2 = eVar;
                    }
                }
            } else {
                i11 = p8;
            }
            eVar2 = eVar;
            D = D2;
            i13 = i14;
            p8 = i11;
        }
    }

    public final int o() {
        return this.f4659b.length / 5;
    }

    public final int p() {
        return o() - this.f4665h;
    }

    public final Object q(int i10) {
        int r5 = r(i10);
        int[] iArr = this.f4659b;
        int i11 = (r5 * 5) + 1;
        if ((iArr[i11] & 268435456) == 0) {
            return l.f4646a;
        }
        return this.f4660c[Integer.bitCount(iArr[i11] >> 29) + g(iArr, r5)];
    }

    public final int r(int i10) {
        return (this.f4665h * (i10 < this.f4664g ? 0 : 1)) + i10;
    }

    public final Object s(int i10) {
        int r5 = r(i10);
        int[] iArr = this.f4659b;
        int i11 = r5 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f4660c[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int t(int i10) {
        return l2.a(this.f4659b, r(i10));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f4677t + " end=" + this.f4678u + " size = " + p() + " gap=" + this.f4664g + '-' + (this.f4664g + this.f4665h) + ')';
    }

    public final boolean u(int i10, int i11) {
        int o7;
        int t3;
        if (i11 == this.f4679v) {
            o7 = this.f4678u;
        } else {
            r0 r0Var = this.f4673p;
            if (i11 > r0Var.a(0)) {
                t3 = t(i11);
            } else {
                int[] iArr = r0Var.f4747a;
                int min = Math.min(iArr.length, r0Var.f4748b);
                int i12 = 0;
                while (true) {
                    if (i12 >= min) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == i11) {
                        break;
                    }
                    i12++;
                }
                if (i12 < 0) {
                    t3 = t(i11);
                } else {
                    o7 = (o() - this.f4665h) - this.f4674q.f4747a[i12];
                }
            }
            o7 = t3 + i11;
        }
        return i10 > i11 && i10 < o7;
    }

    public final void v(int i10) {
        if (i10 > 0) {
            int i11 = this.f4677t;
            A(i11);
            int i12 = this.f4664g;
            int i13 = this.f4665h;
            int[] iArr = this.f4659b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[max * 5];
                int i15 = max - i14;
                bc.l.P(0, 0, i12 * 5, iArr, iArr2);
                bc.l.P((i12 + i15) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f4659b = iArr2;
                i13 = i15;
            }
            int i16 = this.f4678u;
            if (i16 >= i12) {
                this.f4678u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f4664g = i17;
            this.f4665h = i13 - i10;
            int i18 = i(i14 > 0 ? f(i11 + i10) : 0, this.f4670m >= i12 ? this.f4668k : 0, this.f4669l, this.f4660c.length);
            for (int i19 = i12; i19 < i17; i19++) {
                this.f4659b[(i19 * 5) + 4] = i18;
            }
            int i20 = this.f4670m;
            if (i20 >= i12) {
                this.f4670m = i20 + i10;
            }
        }
    }

    public final void w(int i10, int i11) {
        if (i10 > 0) {
            B(this.f4666i, i11);
            int i12 = this.f4668k;
            int i13 = this.f4669l;
            if (i13 < i10) {
                Object[] objArr = this.f4660c;
                int length = objArr.length;
                int i14 = length - i13;
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[max];
                for (int i15 = 0; i15 < max; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = max - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f4660c = objArr2;
                i13 = i16;
            }
            int i18 = this.f4667j;
            if (i18 >= i12) {
                this.f4667j = i18 + i10;
            }
            this.f4668k = i12 + i10;
            this.f4669l = i13 - i10;
        }
    }

    public final boolean x(int i10) {
        return (this.f4659b[(r(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(j2 j2Var, int i10) {
        if (this.f4671n <= 0) {
            t.c("Check failed");
        }
        if (i10 == 0 && this.f4677t == 0 && this.f4658a.f4632h == 0) {
            int[] iArr = j2Var.f4631g;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = j2Var.f4632h;
            if (i11 == i12) {
                int[] iArr2 = this.f4659b;
                Object[] objArr = this.f4660c;
                ArrayList arrayList = this.f4661d;
                HashMap hashMap = this.f4662e;
                s.u uVar = this.f4663f;
                Object[] objArr2 = j2Var.f4633i;
                int i13 = j2Var.f4634j;
                HashMap hashMap2 = j2Var.f4640p;
                s.u uVar2 = j2Var.f4641q;
                this.f4659b = iArr;
                this.f4660c = objArr2;
                this.f4661d = j2Var.f4639o;
                this.f4664g = i12;
                this.f4665h = (iArr.length / 5) - i12;
                this.f4668k = i13;
                this.f4669l = objArr2.length - i13;
                this.f4670m = i12;
                this.f4662e = hashMap2;
                this.f4663f = uVar2;
                j2Var.f4631g = iArr2;
                j2Var.f4632h = 0;
                j2Var.f4633i = objArr;
                j2Var.f4634j = 0;
                j2Var.f4639o = arrayList;
                j2Var.f4640p = hashMap;
                j2Var.f4641q = uVar;
                return;
            }
        }
        m2 d10 = j2Var.d();
        try {
            z.r(d10, i10, this, true, true, false);
            d10.e(true);
        } catch (Throwable th) {
            d10.e(false);
            throw th;
        }
    }
}
