package u;

import java.util.ArrayList;
import java.util.Arrays;
import l4.g;
import o1.C4797a;
import w.C5129d;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5048c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f40917q = false;

    /* renamed from: d, reason: collision with root package name */
    public final C5049d f40921d;

    /* renamed from: m, reason: collision with root package name */
    public final g f40929m;

    /* renamed from: p, reason: collision with root package name */
    public C5047b f40932p;

    /* renamed from: a, reason: collision with root package name */
    public int f40918a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40919b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f40920c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f40922e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f40923f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40925h = false;
    public boolean[] i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f40926j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f40927k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f40928l = 32;

    /* renamed from: n, reason: collision with root package name */
    public C5051f[] f40930n = new C5051f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f40931o = 0;

    /* renamed from: g, reason: collision with root package name */
    public C5047b[] f40924g = new C5047b[32];

    public C5048c() {
        s();
        g gVar = new g(4);
        gVar.f38916u = new N.c();
        gVar.f38917v = new N.c();
        gVar.f38918w = new C5051f[32];
        this.f40929m = gVar;
        C5049d c5049d = new C5049d(gVar);
        c5049d.f40933f = new C5051f[128];
        c5049d.f40934g = new C5051f[128];
        c5049d.f40935h = 0;
        c5049d.i = new C4797a(c5049d);
        this.f40921d = c5049d;
        this.f40932p = new C5047b(gVar);
    }

    public static int n(Object obj) {
        C5051f c5051f = ((C5129d) obj).i;
        if (c5051f != null) {
            return (int) (c5051f.f40946x + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C5051f a(int i) {
        N.c cVar = (N.c) this.f40929m.f38917v;
        int i4 = cVar.f1899b;
        C5051f c5051f = null;
        if (i4 > 0) {
            int i6 = i4 - 1;
            ?? r32 = cVar.f1898a;
            ?? r42 = r32[i6];
            r32[i6] = 0;
            cVar.f1899b = i6;
            c5051f = r42;
        }
        C5051f c5051f2 = c5051f;
        if (c5051f2 == null) {
            c5051f2 = new C5051f(i);
            c5051f2.f40941E = i;
        } else {
            c5051f2.c();
            c5051f2.f40941E = i;
        }
        int i9 = this.f40931o;
        int i10 = this.f40918a;
        if (i9 >= i10) {
            int i11 = i10 * 2;
            this.f40918a = i11;
            this.f40930n = (C5051f[]) Arrays.copyOf(this.f40930n, i11);
        }
        C5051f[] c5051fArr = this.f40930n;
        int i12 = this.f40931o;
        this.f40931o = i12 + 1;
        c5051fArr[i12] = c5051f2;
        return c5051f2;
    }

    public final void b(C5051f c5051f, C5051f c5051f2, int i, float f2, C5051f c5051f3, C5051f c5051f4, int i4, int i6) {
        C5047b l9 = l();
        if (c5051f2 == c5051f3) {
            l9.f40915d.g(c5051f, 1.0f);
            l9.f40915d.g(c5051f4, 1.0f);
            l9.f40915d.g(c5051f2, -2.0f);
        } else if (f2 == 0.5f) {
            l9.f40915d.g(c5051f, 1.0f);
            l9.f40915d.g(c5051f2, -1.0f);
            l9.f40915d.g(c5051f3, -1.0f);
            l9.f40915d.g(c5051f4, 1.0f);
            if (i > 0 || i4 > 0) {
                l9.f40913b = (-i) + i4;
            }
        } else if (f2 <= 0.0f) {
            l9.f40915d.g(c5051f, -1.0f);
            l9.f40915d.g(c5051f2, 1.0f);
            l9.f40913b = i;
        } else if (f2 >= 1.0f) {
            l9.f40915d.g(c5051f4, -1.0f);
            l9.f40915d.g(c5051f3, 1.0f);
            l9.f40913b = -i4;
        } else {
            float f9 = 1.0f - f2;
            l9.f40915d.g(c5051f, f9 * 1.0f);
            l9.f40915d.g(c5051f2, f9 * (-1.0f));
            l9.f40915d.g(c5051f3, (-1.0f) * f2);
            l9.f40915d.g(c5051f4, 1.0f * f2);
            if (i > 0 || i4 > 0) {
                l9.f40913b = (i4 * f2) + ((-i) * f9);
            }
        }
        if (i6 != 8) {
            l9.a(this, i6);
        }
        c(l9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d3, code lost:
    
        if (r4.f40940D <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e0, code lost:
    
        if (r4.f40940D <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f5, code lost:
    
        if (r4.f40940D <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0102, code lost:
    
        if (r4.f40940D <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C5047b c5047b) {
        boolean z6;
        boolean z9;
        C5051f c5051f;
        C5051f f2;
        ArrayList arrayList;
        if (this.f40927k + 1 >= this.f40928l || this.f40926j + 1 >= this.f40923f) {
            o();
        }
        if (c5047b.f40916e) {
            z6 = false;
        } else {
            if (this.f40924g.length != 0) {
                boolean z10 = false;
                while (!z10) {
                    int d9 = c5047b.f40915d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c5047b.f40914c;
                        if (i >= d9) {
                            break;
                        }
                        C5051f e9 = c5047b.f40915d.e(i);
                        if (e9.f40944v != -1 || e9.f40947y) {
                            arrayList.add(e9);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i4 = 0; i4 < size; i4++) {
                            C5051f c5051f2 = (C5051f) arrayList.get(i4);
                            if (c5051f2.f40947y) {
                                c5047b.h(this, c5051f2, true);
                            } else {
                                c5047b.i(this, this.f40924g[c5051f2.f40944v], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z10 = true;
                    }
                }
                if (c5047b.f40912a != null && c5047b.f40915d.d() == 0) {
                    c5047b.f40916e = true;
                    this.f40919b = true;
                }
            }
            if (c5047b.e()) {
                return;
            }
            float f9 = c5047b.f40913b;
            float f10 = 0.0f;
            if (f9 < 0.0f) {
                c5047b.f40913b = f9 * (-1.0f);
                C5046a c5046a = c5047b.f40915d;
                int i6 = c5046a.f40910h;
                for (int i9 = 0; i6 != -1 && i9 < c5046a.f40903a; i9++) {
                    float[] fArr = c5046a.f40909g;
                    fArr[i6] = fArr[i6] * (-1.0f);
                    i6 = c5046a.f40908f[i6];
                }
            }
            int d10 = c5047b.f40915d.d();
            float f11 = 0.0f;
            float f12 = 0.0f;
            C5051f c5051f3 = null;
            C5051f c5051f4 = null;
            int i10 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i10 < d10) {
                float f13 = c5047b.f40915d.f(i10);
                C5051f e10 = c5047b.f40915d.e(i10);
                float f14 = f10;
                if (e10.f40941E == 1) {
                    if (c5051f3 != null) {
                        if (f11 <= f13) {
                            if (!z11) {
                                if (e10.f40940D > 1) {
                                }
                            }
                        }
                        z11 = true;
                    }
                    c5051f3 = e10;
                    f11 = f13;
                } else if (c5051f3 == null && f13 < f14) {
                    if (c5051f4 != null) {
                        if (f12 <= f13) {
                            if (!z12) {
                                if (e10.f40940D > 1) {
                                }
                            }
                        }
                        z12 = true;
                    }
                    c5051f4 = e10;
                    f12 = f13;
                }
                i10++;
                f10 = f14;
            }
            float f15 = f10;
            if (c5051f3 == null) {
                c5051f3 = c5051f4;
            }
            if (c5051f3 == null) {
                z9 = true;
            } else {
                c5047b.g(c5051f3);
                z9 = false;
            }
            if (c5047b.f40915d.d() == 0) {
                c5047b.f40916e = true;
            }
            if (z9) {
                if (this.f40926j + 1 >= this.f40923f) {
                    o();
                }
                C5051f a9 = a(3);
                int i11 = this.f40920c + 1;
                this.f40920c = i11;
                this.f40926j++;
                a9.f40943u = i11;
                g gVar = this.f40929m;
                ((C5051f[]) gVar.f38918w)[i11] = a9;
                c5047b.f40912a = a9;
                int i12 = this.f40927k;
                h(c5047b);
                if (this.f40927k == i12 + 1) {
                    C5047b c5047b2 = this.f40932p;
                    c5047b2.f40912a = null;
                    c5047b2.f40915d.b();
                    for (int i13 = 0; i13 < c5047b.f40915d.d(); i13++) {
                        c5047b2.f40915d.a(c5047b.f40915d.e(i13), c5047b.f40915d.f(i13), true);
                    }
                    r(this.f40932p);
                    if (a9.f40944v == -1) {
                        if (c5047b.f40912a == a9 && (f2 = c5047b.f(null, a9)) != null) {
                            c5047b.g(f2);
                        }
                        if (!c5047b.f40916e) {
                            c5047b.f40912a.e(this, c5047b);
                        }
                        ((N.c) gVar.f38916u).b(c5047b);
                        this.f40927k--;
                    }
                    z6 = true;
                    c5051f = c5047b.f40912a;
                    if (c5051f != null) {
                        return;
                    }
                    if (c5051f.f40941E != 1 && c5047b.f40913b < f15) {
                        return;
                    }
                }
            }
            z6 = false;
            c5051f = c5047b.f40912a;
            if (c5051f != null) {
            }
        }
        if (z6) {
            return;
        }
        h(c5047b);
    }

    public final void d(C5051f c5051f, int i) {
        int i4 = c5051f.f40944v;
        if (i4 == -1) {
            c5051f.d(this, i);
            for (int i6 = 0; i6 < this.f40920c + 1; i6++) {
                C5051f c5051f2 = ((C5051f[]) this.f40929m.f38918w)[i6];
            }
            return;
        }
        if (i4 == -1) {
            C5047b l9 = l();
            l9.f40912a = c5051f;
            float f2 = i;
            c5051f.f40946x = f2;
            l9.f40913b = f2;
            l9.f40916e = true;
            c(l9);
            return;
        }
        C5047b c5047b = this.f40924g[i4];
        if (c5047b.f40916e) {
            c5047b.f40913b = i;
            return;
        }
        if (c5047b.f40915d.d() == 0) {
            c5047b.f40916e = true;
            c5047b.f40913b = i;
            return;
        }
        C5047b l10 = l();
        if (i < 0) {
            l10.f40913b = i * (-1);
            l10.f40915d.g(c5051f, 1.0f);
        } else {
            l10.f40913b = i;
            l10.f40915d.g(c5051f, -1.0f);
        }
        c(l10);
    }

    public final void e(C5051f c5051f, C5051f c5051f2, int i, int i4) {
        if (i4 == 8 && c5051f2.f40947y && c5051f.f40944v == -1) {
            c5051f.d(this, c5051f2.f40946x + i);
            return;
        }
        C5047b l9 = l();
        boolean z6 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z6 = true;
            }
            l9.f40913b = i;
        }
        if (z6) {
            l9.f40915d.g(c5051f, 1.0f);
            l9.f40915d.g(c5051f2, -1.0f);
        } else {
            l9.f40915d.g(c5051f, -1.0f);
            l9.f40915d.g(c5051f2, 1.0f);
        }
        if (i4 != 8) {
            l9.a(this, i4);
        }
        c(l9);
    }

    public final void f(C5051f c5051f, C5051f c5051f2, int i, int i4) {
        C5047b l9 = l();
        C5051f m9 = m();
        m9.f40945w = 0;
        l9.b(c5051f, c5051f2, m9, i);
        if (i4 != 8) {
            l9.f40915d.g(j(i4), (int) (l9.f40915d.c(m9) * (-1.0f)));
        }
        c(l9);
    }

    public final void g(C5051f c5051f, C5051f c5051f2, int i, int i4) {
        C5047b l9 = l();
        C5051f m9 = m();
        m9.f40945w = 0;
        l9.c(c5051f, c5051f2, m9, i);
        if (i4 != 8) {
            l9.f40915d.g(j(i4), (int) (l9.f40915d.c(m9) * (-1.0f)));
        }
        c(l9);
    }

    public final void h(C5047b c5047b) {
        int i;
        if (c5047b.f40916e) {
            c5047b.f40912a.d(this, c5047b.f40913b);
        } else {
            C5047b[] c5047bArr = this.f40924g;
            int i4 = this.f40927k;
            c5047bArr[i4] = c5047b;
            C5051f c5051f = c5047b.f40912a;
            c5051f.f40944v = i4;
            this.f40927k = i4 + 1;
            c5051f.e(this, c5047b);
        }
        if (this.f40919b) {
            int i6 = 0;
            while (i6 < this.f40927k) {
                if (this.f40924g[i6] == null) {
                    System.out.println("WTF");
                }
                C5047b c5047b2 = this.f40924g[i6];
                if (c5047b2 != null && c5047b2.f40916e) {
                    c5047b2.f40912a.d(this, c5047b2.f40913b);
                    ((N.c) this.f40929m.f38916u).b(c5047b2);
                    this.f40924g[i6] = null;
                    int i9 = i6 + 1;
                    int i10 = i9;
                    while (true) {
                        i = this.f40927k;
                        if (i9 >= i) {
                            break;
                        }
                        C5047b[] c5047bArr2 = this.f40924g;
                        int i11 = i9 - 1;
                        C5047b c5047b3 = c5047bArr2[i9];
                        c5047bArr2[i11] = c5047b3;
                        C5051f c5051f2 = c5047b3.f40912a;
                        if (c5051f2.f40944v == i9) {
                            c5051f2.f40944v = i11;
                        }
                        i10 = i9;
                        i9++;
                    }
                    if (i10 < i) {
                        this.f40924g[i10] = null;
                    }
                    this.f40927k = i - 1;
                    i6--;
                }
                i6++;
            }
            this.f40919b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f40927k; i++) {
            C5047b c5047b = this.f40924g[i];
            c5047b.f40912a.f40946x = c5047b.f40913b;
        }
    }

    public final C5051f j(int i) {
        if (this.f40926j + 1 >= this.f40923f) {
            o();
        }
        C5051f a9 = a(4);
        int i4 = this.f40920c + 1;
        this.f40920c = i4;
        this.f40926j++;
        a9.f40943u = i4;
        a9.f40945w = i;
        ((C5051f[]) this.f40929m.f38918w)[i4] = a9;
        C5049d c5049d = this.f40921d;
        c5049d.i.f39715b = a9;
        float[] fArr = a9.f40937A;
        Arrays.fill(fArr, 0.0f);
        fArr[a9.f40945w] = 1.0f;
        c5049d.j(a9);
        return a9;
    }

    public final C5051f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f40926j + 1 >= this.f40923f) {
            o();
        }
        if (!(obj instanceof C5129d)) {
            return null;
        }
        C5129d c5129d = (C5129d) obj;
        C5051f c5051f = c5129d.i;
        if (c5051f == null) {
            c5129d.k();
            c5051f = c5129d.i;
        }
        int i = c5051f.f40943u;
        g gVar = this.f40929m;
        if (i != -1 && i <= this.f40920c && ((C5051f[]) gVar.f38918w)[i] != null) {
            return c5051f;
        }
        if (i != -1) {
            c5051f.c();
        }
        int i4 = this.f40920c + 1;
        this.f40920c = i4;
        this.f40926j++;
        c5051f.f40943u = i4;
        c5051f.f40941E = 1;
        ((C5051f[]) gVar.f38918w)[i4] = c5051f;
        return c5051f;
    }

    public final C5047b l() {
        Object obj;
        g gVar = this.f40929m;
        N.c cVar = (N.c) gVar.f38916u;
        int i = cVar.f1899b;
        if (i > 0) {
            int i4 = i - 1;
            Object[] objArr = cVar.f1898a;
            obj = objArr[i4];
            objArr[i4] = null;
            cVar.f1899b = i4;
        } else {
            obj = null;
        }
        C5047b c5047b = (C5047b) obj;
        if (c5047b == null) {
            return new C5047b(gVar);
        }
        c5047b.f40912a = null;
        c5047b.f40915d.b();
        c5047b.f40913b = 0.0f;
        c5047b.f40916e = false;
        return c5047b;
    }

    public final C5051f m() {
        if (this.f40926j + 1 >= this.f40923f) {
            o();
        }
        C5051f a9 = a(3);
        int i = this.f40920c + 1;
        this.f40920c = i;
        this.f40926j++;
        a9.f40943u = i;
        ((C5051f[]) this.f40929m.f38918w)[i] = a9;
        return a9;
    }

    public final void o() {
        int i = this.f40922e * 2;
        this.f40922e = i;
        this.f40924g = (C5047b[]) Arrays.copyOf(this.f40924g, i);
        g gVar = this.f40929m;
        gVar.f38918w = (C5051f[]) Arrays.copyOf((C5051f[]) gVar.f38918w, this.f40922e);
        int i4 = this.f40922e;
        this.i = new boolean[i4];
        this.f40923f = i4;
        this.f40928l = i4;
    }

    public final void p() {
        C5049d c5049d = this.f40921d;
        if (c5049d.e()) {
            i();
            return;
        }
        if (!this.f40925h) {
            q(c5049d);
            return;
        }
        for (int i = 0; i < this.f40927k; i++) {
            if (!this.f40924g[i].f40916e) {
                q(c5049d);
                return;
            }
        }
        i();
    }

    public final void q(C5049d c5049d) {
        int i = 0;
        while (true) {
            if (i >= this.f40927k) {
                break;
            }
            C5047b c5047b = this.f40924g[i];
            int i4 = 1;
            if (c5047b.f40912a.f40941E != 1) {
                float f2 = 0.0f;
                if (c5047b.f40913b < 0.0f) {
                    boolean z6 = false;
                    int i6 = 0;
                    while (!z6) {
                        i6 += i4;
                        float f9 = Float.MAX_VALUE;
                        int i9 = -1;
                        int i10 = -1;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < this.f40927k) {
                            C5047b c5047b2 = this.f40924g[i11];
                            if (c5047b2.f40912a.f40941E != i4 && !c5047b2.f40916e && c5047b2.f40913b < f2) {
                                int d9 = c5047b2.f40915d.d();
                                int i13 = 0;
                                while (i13 < d9) {
                                    C5051f e9 = c5047b2.f40915d.e(i13);
                                    float c9 = c5047b2.f40915d.c(e9);
                                    if (c9 > f2) {
                                        for (int i14 = 0; i14 < 9; i14++) {
                                            float f10 = e9.f40948z[i14] / c9;
                                            if ((f10 < f9 && i14 == i12) || i14 > i12) {
                                                i12 = i14;
                                                i10 = e9.f40943u;
                                                i9 = i11;
                                                f9 = f10;
                                            }
                                        }
                                    }
                                    i13++;
                                    f2 = 0.0f;
                                }
                            }
                            i11++;
                            f2 = 0.0f;
                            i4 = 1;
                        }
                        if (i9 != -1) {
                            C5047b c5047b3 = this.f40924g[i9];
                            c5047b3.f40912a.f40944v = -1;
                            c5047b3.g(((C5051f[]) this.f40929m.f38918w)[i10]);
                            C5051f c5051f = c5047b3.f40912a;
                            c5051f.f40944v = i9;
                            c5051f.e(this, c5047b3);
                        } else {
                            z6 = true;
                        }
                        if (i6 > this.f40926j / 2) {
                            z6 = true;
                        }
                        f2 = 0.0f;
                        i4 = 1;
                    }
                }
            }
            i++;
        }
        r(c5049d);
        i();
    }

    public final void r(C5047b c5047b) {
        boolean z6;
        int i = 0;
        for (int i4 = 0; i4 < this.f40926j; i4++) {
            this.i[i4] = false;
        }
        boolean z9 = false;
        int i6 = 0;
        while (!z9) {
            int i9 = 1;
            i6++;
            if (i6 >= this.f40926j * 2) {
                return;
            }
            C5051f c5051f = c5047b.f40912a;
            if (c5051f != null) {
                this.i[c5051f.f40943u] = true;
            }
            C5051f d9 = c5047b.d(this.i);
            if (d9 != null) {
                boolean[] zArr = this.i;
                int i10 = d9.f40943u;
                if (zArr[i10]) {
                    return;
                } else {
                    zArr[i10] = true;
                }
            }
            if (d9 != null) {
                float f2 = Float.MAX_VALUE;
                int i11 = i;
                int i12 = -1;
                while (i11 < this.f40927k) {
                    C5047b c5047b2 = this.f40924g[i11];
                    if (c5047b2.f40912a.f40941E != i9 && !c5047b2.f40916e) {
                        C5046a c5046a = c5047b2.f40915d;
                        int i13 = c5046a.f40910h;
                        if (i13 != -1) {
                            for (int i14 = 0; i13 != -1 && i14 < c5046a.f40903a; i14++) {
                                if (c5046a.f40907e[i13] == d9.f40943u) {
                                    z6 = true;
                                    break;
                                }
                                i13 = c5046a.f40908f[i13];
                            }
                        }
                        z6 = false;
                        if (z6) {
                            float c9 = c5047b2.f40915d.c(d9);
                            if (c9 < 0.0f) {
                                float f9 = (-c5047b2.f40913b) / c9;
                                if (f9 < f2) {
                                    f2 = f9;
                                    i12 = i11;
                                }
                            }
                        }
                    }
                    i11++;
                    i9 = 1;
                }
                if (i12 > -1) {
                    C5047b c5047b3 = this.f40924g[i12];
                    c5047b3.f40912a.f40944v = -1;
                    c5047b3.g(d9);
                    C5051f c5051f2 = c5047b3.f40912a;
                    c5051f2.f40944v = i12;
                    c5051f2.e(this, c5047b3);
                }
            } else {
                z9 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f40927k; i++) {
            C5047b c5047b = this.f40924g[i];
            if (c5047b != null) {
                ((N.c) this.f40929m.f38916u).b(c5047b);
            }
            this.f40924g[i] = null;
        }
    }

    public final void t() {
        g gVar;
        int i = 0;
        while (true) {
            gVar = this.f40929m;
            C5051f[] c5051fArr = (C5051f[]) gVar.f38918w;
            if (i >= c5051fArr.length) {
                break;
            }
            C5051f c5051f = c5051fArr[i];
            if (c5051f != null) {
                c5051f.c();
            }
            i++;
        }
        N.c cVar = (N.c) gVar.f38917v;
        C5051f[] c5051fArr2 = this.f40930n;
        int i4 = this.f40931o;
        cVar.getClass();
        if (i4 > c5051fArr2.length) {
            i4 = c5051fArr2.length;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            C5051f c5051f2 = c5051fArr2[i6];
            int i9 = cVar.f1899b;
            Object[] objArr = cVar.f1898a;
            if (i9 < objArr.length) {
                objArr[i9] = c5051f2;
                cVar.f1899b = i9 + 1;
            }
        }
        this.f40931o = 0;
        Arrays.fill((C5051f[]) gVar.f38918w, (Object) null);
        this.f40920c = 0;
        C5049d c5049d = this.f40921d;
        c5049d.f40935h = 0;
        c5049d.f40913b = 0.0f;
        this.f40926j = 1;
        for (int i10 = 0; i10 < this.f40927k; i10++) {
            C5047b c5047b = this.f40924g[i10];
        }
        s();
        this.f40927k = 0;
        this.f40932p = new C5047b(gVar);
    }
}
