package u;

import j4.g;
import java.util.ArrayList;
import java.util.Arrays;
import m1.C4726a;
import w.C5138c;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5047c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f40955q = false;

    /* renamed from: d, reason: collision with root package name */
    public final C5048d f40959d;

    /* renamed from: m, reason: collision with root package name */
    public final g f40967m;

    /* renamed from: p, reason: collision with root package name */
    public C5046b f40970p;

    /* renamed from: a, reason: collision with root package name */
    public int f40956a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40957b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f40958c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f40960e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f40961f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40963h = false;
    public boolean[] i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f40964j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f40965k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f40966l = 32;

    /* renamed from: n, reason: collision with root package name */
    public C5050f[] f40968n = new C5050f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f40969o = 0;

    /* renamed from: g, reason: collision with root package name */
    public C5046b[] f40962g = new C5046b[32];

    public C5047c() {
        s();
        g gVar = new g(4);
        gVar.f38404u = new N.c();
        gVar.f38405v = new N.c();
        gVar.f38406w = new C5050f[32];
        this.f40967m = gVar;
        C5048d c5048d = new C5048d(gVar);
        c5048d.f40971f = new C5050f[128];
        c5048d.f40972g = new C5050f[128];
        c5048d.f40973h = 0;
        c5048d.i = new C4726a(3, c5048d);
        this.f40959d = c5048d;
        this.f40970p = new C5046b(gVar);
    }

    public static int n(Object obj) {
        C5050f c5050f = ((C5138c) obj).i;
        if (c5050f != null) {
            return (int) (c5050f.f40984x + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C5050f a(int i) {
        N.c cVar = (N.c) this.f40967m.f38405v;
        int i6 = cVar.f1897b;
        C5050f c5050f = null;
        if (i6 > 0) {
            int i9 = i6 - 1;
            ?? r32 = cVar.f1896a;
            ?? r42 = r32[i9];
            r32[i9] = 0;
            cVar.f1897b = i9;
            c5050f = r42;
        }
        C5050f c5050f2 = c5050f;
        if (c5050f2 == null) {
            c5050f2 = new C5050f(i);
            c5050f2.f40979E = i;
        } else {
            c5050f2.c();
            c5050f2.f40979E = i;
        }
        int i10 = this.f40969o;
        int i11 = this.f40956a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f40956a = i12;
            this.f40968n = (C5050f[]) Arrays.copyOf(this.f40968n, i12);
        }
        C5050f[] c5050fArr = this.f40968n;
        int i13 = this.f40969o;
        this.f40969o = i13 + 1;
        c5050fArr[i13] = c5050f2;
        return c5050f2;
    }

    public final void b(C5050f c5050f, C5050f c5050f2, int i, float f3, C5050f c5050f3, C5050f c5050f4, int i6, int i9) {
        C5046b l9 = l();
        if (c5050f2 == c5050f3) {
            l9.f40953d.g(c5050f, 1.0f);
            l9.f40953d.g(c5050f4, 1.0f);
            l9.f40953d.g(c5050f2, -2.0f);
        } else if (f3 == 0.5f) {
            l9.f40953d.g(c5050f, 1.0f);
            l9.f40953d.g(c5050f2, -1.0f);
            l9.f40953d.g(c5050f3, -1.0f);
            l9.f40953d.g(c5050f4, 1.0f);
            if (i > 0 || i6 > 0) {
                l9.f40951b = (-i) + i6;
            }
        } else if (f3 <= 0.0f) {
            l9.f40953d.g(c5050f, -1.0f);
            l9.f40953d.g(c5050f2, 1.0f);
            l9.f40951b = i;
        } else if (f3 >= 1.0f) {
            l9.f40953d.g(c5050f4, -1.0f);
            l9.f40953d.g(c5050f3, 1.0f);
            l9.f40951b = -i6;
        } else {
            float f9 = 1.0f - f3;
            l9.f40953d.g(c5050f, f9 * 1.0f);
            l9.f40953d.g(c5050f2, f9 * (-1.0f));
            l9.f40953d.g(c5050f3, (-1.0f) * f3);
            l9.f40953d.g(c5050f4, 1.0f * f3);
            if (i > 0 || i6 > 0) {
                l9.f40951b = (i6 * f3) + ((-i) * f9);
            }
        }
        if (i9 != 8) {
            l9.a(this, i9);
        }
        c(l9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d3, code lost:
    
        if (r4.f40978D <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e0, code lost:
    
        if (r4.f40978D <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f5, code lost:
    
        if (r4.f40978D <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0102, code lost:
    
        if (r4.f40978D <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C5046b c5046b) {
        boolean z3;
        boolean z6;
        C5050f c5050f;
        C5050f f3;
        ArrayList arrayList;
        if (this.f40965k + 1 >= this.f40966l || this.f40964j + 1 >= this.f40961f) {
            o();
        }
        if (c5046b.f40954e) {
            z3 = false;
        } else {
            if (this.f40962g.length != 0) {
                boolean z9 = false;
                while (!z9) {
                    int d2 = c5046b.f40953d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c5046b.f40952c;
                        if (i >= d2) {
                            break;
                        }
                        C5050f e9 = c5046b.f40953d.e(i);
                        if (e9.f40982v != -1 || e9.f40985y) {
                            arrayList.add(e9);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i6 = 0; i6 < size; i6++) {
                            C5050f c5050f2 = (C5050f) arrayList.get(i6);
                            if (c5050f2.f40985y) {
                                c5046b.h(this, c5050f2, true);
                            } else {
                                c5046b.i(this, this.f40962g[c5050f2.f40982v], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z9 = true;
                    }
                }
                if (c5046b.f40950a != null && c5046b.f40953d.d() == 0) {
                    c5046b.f40954e = true;
                    this.f40957b = true;
                }
            }
            if (c5046b.e()) {
                return;
            }
            float f9 = c5046b.f40951b;
            float f10 = 0.0f;
            if (f9 < 0.0f) {
                c5046b.f40951b = f9 * (-1.0f);
                C5045a c5045a = c5046b.f40953d;
                int i9 = c5045a.f40948h;
                for (int i10 = 0; i9 != -1 && i10 < c5045a.f40941a; i10++) {
                    float[] fArr = c5045a.f40947g;
                    fArr[i9] = fArr[i9] * (-1.0f);
                    i9 = c5045a.f40946f[i9];
                }
            }
            int d9 = c5046b.f40953d.d();
            float f11 = 0.0f;
            float f12 = 0.0f;
            C5050f c5050f3 = null;
            C5050f c5050f4 = null;
            int i11 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i11 < d9) {
                float f13 = c5046b.f40953d.f(i11);
                C5050f e10 = c5046b.f40953d.e(i11);
                float f14 = f10;
                if (e10.f40979E == 1) {
                    if (c5050f3 != null) {
                        if (f11 <= f13) {
                            if (!z10) {
                                if (e10.f40978D > 1) {
                                }
                            }
                        }
                        z10 = true;
                    }
                    c5050f3 = e10;
                    f11 = f13;
                } else if (c5050f3 == null && f13 < f14) {
                    if (c5050f4 != null) {
                        if (f12 <= f13) {
                            if (!z11) {
                                if (e10.f40978D > 1) {
                                }
                            }
                        }
                        z11 = true;
                    }
                    c5050f4 = e10;
                    f12 = f13;
                }
                i11++;
                f10 = f14;
            }
            float f15 = f10;
            if (c5050f3 == null) {
                c5050f3 = c5050f4;
            }
            if (c5050f3 == null) {
                z6 = true;
            } else {
                c5046b.g(c5050f3);
                z6 = false;
            }
            if (c5046b.f40953d.d() == 0) {
                c5046b.f40954e = true;
            }
            if (z6) {
                if (this.f40964j + 1 >= this.f40961f) {
                    o();
                }
                C5050f a9 = a(3);
                int i12 = this.f40958c + 1;
                this.f40958c = i12;
                this.f40964j++;
                a9.f40981u = i12;
                g gVar = this.f40967m;
                ((C5050f[]) gVar.f38406w)[i12] = a9;
                c5046b.f40950a = a9;
                int i13 = this.f40965k;
                h(c5046b);
                if (this.f40965k == i13 + 1) {
                    C5046b c5046b2 = this.f40970p;
                    c5046b2.f40950a = null;
                    c5046b2.f40953d.b();
                    for (int i14 = 0; i14 < c5046b.f40953d.d(); i14++) {
                        c5046b2.f40953d.a(c5046b.f40953d.e(i14), c5046b.f40953d.f(i14), true);
                    }
                    r(this.f40970p);
                    if (a9.f40982v == -1) {
                        if (c5046b.f40950a == a9 && (f3 = c5046b.f(null, a9)) != null) {
                            c5046b.g(f3);
                        }
                        if (!c5046b.f40954e) {
                            c5046b.f40950a.e(this, c5046b);
                        }
                        ((N.c) gVar.f38404u).b(c5046b);
                        this.f40965k--;
                    }
                    z3 = true;
                    c5050f = c5046b.f40950a;
                    if (c5050f != null) {
                        return;
                    }
                    if (c5050f.f40979E != 1 && c5046b.f40951b < f15) {
                        return;
                    }
                }
            }
            z3 = false;
            c5050f = c5046b.f40950a;
            if (c5050f != null) {
            }
        }
        if (z3) {
            return;
        }
        h(c5046b);
    }

    public final void d(C5050f c5050f, int i) {
        int i6 = c5050f.f40982v;
        if (i6 == -1) {
            c5050f.d(this, i);
            for (int i9 = 0; i9 < this.f40958c + 1; i9++) {
                C5050f c5050f2 = ((C5050f[]) this.f40967m.f38406w)[i9];
            }
            return;
        }
        if (i6 == -1) {
            C5046b l9 = l();
            l9.f40950a = c5050f;
            float f3 = i;
            c5050f.f40984x = f3;
            l9.f40951b = f3;
            l9.f40954e = true;
            c(l9);
            return;
        }
        C5046b c5046b = this.f40962g[i6];
        if (c5046b.f40954e) {
            c5046b.f40951b = i;
            return;
        }
        if (c5046b.f40953d.d() == 0) {
            c5046b.f40954e = true;
            c5046b.f40951b = i;
            return;
        }
        C5046b l10 = l();
        if (i < 0) {
            l10.f40951b = i * (-1);
            l10.f40953d.g(c5050f, 1.0f);
        } else {
            l10.f40951b = i;
            l10.f40953d.g(c5050f, -1.0f);
        }
        c(l10);
    }

    public final void e(C5050f c5050f, C5050f c5050f2, int i, int i6) {
        if (i6 == 8 && c5050f2.f40985y && c5050f.f40982v == -1) {
            c5050f.d(this, c5050f2.f40984x + i);
            return;
        }
        C5046b l9 = l();
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            l9.f40951b = i;
        }
        if (z3) {
            l9.f40953d.g(c5050f, 1.0f);
            l9.f40953d.g(c5050f2, -1.0f);
        } else {
            l9.f40953d.g(c5050f, -1.0f);
            l9.f40953d.g(c5050f2, 1.0f);
        }
        if (i6 != 8) {
            l9.a(this, i6);
        }
        c(l9);
    }

    public final void f(C5050f c5050f, C5050f c5050f2, int i, int i6) {
        C5046b l9 = l();
        C5050f m4 = m();
        m4.f40983w = 0;
        l9.b(c5050f, c5050f2, m4, i);
        if (i6 != 8) {
            l9.f40953d.g(j(i6), (int) (l9.f40953d.c(m4) * (-1.0f)));
        }
        c(l9);
    }

    public final void g(C5050f c5050f, C5050f c5050f2, int i, int i6) {
        C5046b l9 = l();
        C5050f m4 = m();
        m4.f40983w = 0;
        l9.c(c5050f, c5050f2, m4, i);
        if (i6 != 8) {
            l9.f40953d.g(j(i6), (int) (l9.f40953d.c(m4) * (-1.0f)));
        }
        c(l9);
    }

    public final void h(C5046b c5046b) {
        int i;
        if (c5046b.f40954e) {
            c5046b.f40950a.d(this, c5046b.f40951b);
        } else {
            C5046b[] c5046bArr = this.f40962g;
            int i6 = this.f40965k;
            c5046bArr[i6] = c5046b;
            C5050f c5050f = c5046b.f40950a;
            c5050f.f40982v = i6;
            this.f40965k = i6 + 1;
            c5050f.e(this, c5046b);
        }
        if (this.f40957b) {
            int i9 = 0;
            while (i9 < this.f40965k) {
                if (this.f40962g[i9] == null) {
                    System.out.println("WTF");
                }
                C5046b c5046b2 = this.f40962g[i9];
                if (c5046b2 != null && c5046b2.f40954e) {
                    c5046b2.f40950a.d(this, c5046b2.f40951b);
                    ((N.c) this.f40967m.f38404u).b(c5046b2);
                    this.f40962g[i9] = null;
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (true) {
                        i = this.f40965k;
                        if (i10 >= i) {
                            break;
                        }
                        C5046b[] c5046bArr2 = this.f40962g;
                        int i12 = i10 - 1;
                        C5046b c5046b3 = c5046bArr2[i10];
                        c5046bArr2[i12] = c5046b3;
                        C5050f c5050f2 = c5046b3.f40950a;
                        if (c5050f2.f40982v == i10) {
                            c5050f2.f40982v = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i) {
                        this.f40962g[i11] = null;
                    }
                    this.f40965k = i - 1;
                    i9--;
                }
                i9++;
            }
            this.f40957b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f40965k; i++) {
            C5046b c5046b = this.f40962g[i];
            c5046b.f40950a.f40984x = c5046b.f40951b;
        }
    }

    public final C5050f j(int i) {
        if (this.f40964j + 1 >= this.f40961f) {
            o();
        }
        C5050f a9 = a(4);
        int i6 = this.f40958c + 1;
        this.f40958c = i6;
        this.f40964j++;
        a9.f40981u = i6;
        a9.f40983w = i;
        ((C5050f[]) this.f40967m.f38406w)[i6] = a9;
        C5048d c5048d = this.f40959d;
        c5048d.i.f39272u = a9;
        float[] fArr = a9.f40975A;
        Arrays.fill(fArr, 0.0f);
        fArr[a9.f40983w] = 1.0f;
        c5048d.j(a9);
        return a9;
    }

    public final C5050f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f40964j + 1 >= this.f40961f) {
            o();
        }
        if (!(obj instanceof C5138c)) {
            return null;
        }
        C5138c c5138c = (C5138c) obj;
        C5050f c5050f = c5138c.i;
        if (c5050f == null) {
            c5138c.k();
            c5050f = c5138c.i;
        }
        int i = c5050f.f40981u;
        g gVar = this.f40967m;
        if (i != -1 && i <= this.f40958c && ((C5050f[]) gVar.f38406w)[i] != null) {
            return c5050f;
        }
        if (i != -1) {
            c5050f.c();
        }
        int i6 = this.f40958c + 1;
        this.f40958c = i6;
        this.f40964j++;
        c5050f.f40981u = i6;
        c5050f.f40979E = 1;
        ((C5050f[]) gVar.f38406w)[i6] = c5050f;
        return c5050f;
    }

    public final C5046b l() {
        Object obj;
        g gVar = this.f40967m;
        N.c cVar = (N.c) gVar.f38404u;
        int i = cVar.f1897b;
        if (i > 0) {
            int i6 = i - 1;
            Object[] objArr = cVar.f1896a;
            obj = objArr[i6];
            objArr[i6] = null;
            cVar.f1897b = i6;
        } else {
            obj = null;
        }
        C5046b c5046b = (C5046b) obj;
        if (c5046b == null) {
            return new C5046b(gVar);
        }
        c5046b.f40950a = null;
        c5046b.f40953d.b();
        c5046b.f40951b = 0.0f;
        c5046b.f40954e = false;
        return c5046b;
    }

    public final C5050f m() {
        if (this.f40964j + 1 >= this.f40961f) {
            o();
        }
        C5050f a9 = a(3);
        int i = this.f40958c + 1;
        this.f40958c = i;
        this.f40964j++;
        a9.f40981u = i;
        ((C5050f[]) this.f40967m.f38406w)[i] = a9;
        return a9;
    }

    public final void o() {
        int i = this.f40960e * 2;
        this.f40960e = i;
        this.f40962g = (C5046b[]) Arrays.copyOf(this.f40962g, i);
        g gVar = this.f40967m;
        gVar.f38406w = (C5050f[]) Arrays.copyOf((C5050f[]) gVar.f38406w, this.f40960e);
        int i6 = this.f40960e;
        this.i = new boolean[i6];
        this.f40961f = i6;
        this.f40966l = i6;
    }

    public final void p() {
        C5048d c5048d = this.f40959d;
        if (c5048d.e()) {
            i();
            return;
        }
        if (!this.f40963h) {
            q(c5048d);
            return;
        }
        for (int i = 0; i < this.f40965k; i++) {
            if (!this.f40962g[i].f40954e) {
                q(c5048d);
                return;
            }
        }
        i();
    }

    public final void q(C5048d c5048d) {
        int i = 0;
        while (true) {
            if (i >= this.f40965k) {
                break;
            }
            C5046b c5046b = this.f40962g[i];
            int i6 = 1;
            if (c5046b.f40950a.f40979E != 1) {
                float f3 = 0.0f;
                if (c5046b.f40951b < 0.0f) {
                    boolean z3 = false;
                    int i9 = 0;
                    while (!z3) {
                        i9 += i6;
                        float f9 = Float.MAX_VALUE;
                        int i10 = -1;
                        int i11 = -1;
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < this.f40965k) {
                            C5046b c5046b2 = this.f40962g[i12];
                            if (c5046b2.f40950a.f40979E != i6 && !c5046b2.f40954e && c5046b2.f40951b < f3) {
                                int d2 = c5046b2.f40953d.d();
                                int i14 = 0;
                                while (i14 < d2) {
                                    C5050f e9 = c5046b2.f40953d.e(i14);
                                    float c9 = c5046b2.f40953d.c(e9);
                                    if (c9 > f3) {
                                        for (int i15 = 0; i15 < 9; i15++) {
                                            float f10 = e9.f40986z[i15] / c9;
                                            if ((f10 < f9 && i15 == i13) || i15 > i13) {
                                                i13 = i15;
                                                i11 = e9.f40981u;
                                                i10 = i12;
                                                f9 = f10;
                                            }
                                        }
                                    }
                                    i14++;
                                    f3 = 0.0f;
                                }
                            }
                            i12++;
                            f3 = 0.0f;
                            i6 = 1;
                        }
                        if (i10 != -1) {
                            C5046b c5046b3 = this.f40962g[i10];
                            c5046b3.f40950a.f40982v = -1;
                            c5046b3.g(((C5050f[]) this.f40967m.f38406w)[i11]);
                            C5050f c5050f = c5046b3.f40950a;
                            c5050f.f40982v = i10;
                            c5050f.e(this, c5046b3);
                        } else {
                            z3 = true;
                        }
                        if (i9 > this.f40964j / 2) {
                            z3 = true;
                        }
                        f3 = 0.0f;
                        i6 = 1;
                    }
                }
            }
            i++;
        }
        r(c5048d);
        i();
    }

    public final void r(C5046b c5046b) {
        boolean z3;
        int i = 0;
        for (int i6 = 0; i6 < this.f40964j; i6++) {
            this.i[i6] = false;
        }
        boolean z6 = false;
        int i9 = 0;
        while (!z6) {
            int i10 = 1;
            i9++;
            if (i9 >= this.f40964j * 2) {
                return;
            }
            C5050f c5050f = c5046b.f40950a;
            if (c5050f != null) {
                this.i[c5050f.f40981u] = true;
            }
            C5050f d2 = c5046b.d(this.i);
            if (d2 != null) {
                boolean[] zArr = this.i;
                int i11 = d2.f40981u;
                if (zArr[i11]) {
                    return;
                } else {
                    zArr[i11] = true;
                }
            }
            if (d2 != null) {
                float f3 = Float.MAX_VALUE;
                int i12 = i;
                int i13 = -1;
                while (i12 < this.f40965k) {
                    C5046b c5046b2 = this.f40962g[i12];
                    if (c5046b2.f40950a.f40979E != i10 && !c5046b2.f40954e) {
                        C5045a c5045a = c5046b2.f40953d;
                        int i14 = c5045a.f40948h;
                        if (i14 != -1) {
                            for (int i15 = 0; i14 != -1 && i15 < c5045a.f40941a; i15++) {
                                if (c5045a.f40945e[i14] == d2.f40981u) {
                                    z3 = true;
                                    break;
                                }
                                i14 = c5045a.f40946f[i14];
                            }
                        }
                        z3 = false;
                        if (z3) {
                            float c9 = c5046b2.f40953d.c(d2);
                            if (c9 < 0.0f) {
                                float f9 = (-c5046b2.f40951b) / c9;
                                if (f9 < f3) {
                                    f3 = f9;
                                    i13 = i12;
                                }
                            }
                        }
                    }
                    i12++;
                    i10 = 1;
                }
                if (i13 > -1) {
                    C5046b c5046b3 = this.f40962g[i13];
                    c5046b3.f40950a.f40982v = -1;
                    c5046b3.g(d2);
                    C5050f c5050f2 = c5046b3.f40950a;
                    c5050f2.f40982v = i13;
                    c5050f2.e(this, c5046b3);
                }
            } else {
                z6 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f40965k; i++) {
            C5046b c5046b = this.f40962g[i];
            if (c5046b != null) {
                ((N.c) this.f40967m.f38404u).b(c5046b);
            }
            this.f40962g[i] = null;
        }
    }

    public final void t() {
        g gVar;
        int i = 0;
        while (true) {
            gVar = this.f40967m;
            C5050f[] c5050fArr = (C5050f[]) gVar.f38406w;
            if (i >= c5050fArr.length) {
                break;
            }
            C5050f c5050f = c5050fArr[i];
            if (c5050f != null) {
                c5050f.c();
            }
            i++;
        }
        N.c cVar = (N.c) gVar.f38405v;
        C5050f[] c5050fArr2 = this.f40968n;
        int i6 = this.f40969o;
        cVar.getClass();
        if (i6 > c5050fArr2.length) {
            i6 = c5050fArr2.length;
        }
        for (int i9 = 0; i9 < i6; i9++) {
            C5050f c5050f2 = c5050fArr2[i9];
            int i10 = cVar.f1897b;
            Object[] objArr = cVar.f1896a;
            if (i10 < objArr.length) {
                objArr[i10] = c5050f2;
                cVar.f1897b = i10 + 1;
            }
        }
        this.f40969o = 0;
        Arrays.fill((C5050f[]) gVar.f38406w, (Object) null);
        this.f40958c = 0;
        C5048d c5048d = this.f40959d;
        c5048d.f40973h = 0;
        c5048d.f40951b = 0.0f;
        this.f40964j = 1;
        for (int i11 = 0; i11 < this.f40965k; i11++) {
            C5046b c5046b = this.f40962g[i11];
        }
        s();
        this.f40965k = 0;
        this.f40970p = new C5046b(gVar);
    }
}
