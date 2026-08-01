package u;

import F.i;
import M0.h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f4403q = false;

    /* renamed from: d, reason: collision with root package name */
    public final C0356d f4407d;

    /* renamed from: m, reason: collision with root package name */
    public final h f4413m;

    /* renamed from: p, reason: collision with root package name */
    public C0354b f4416p;

    /* renamed from: a, reason: collision with root package name */
    public int f4404a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4405b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f4406c = 0;
    public int e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f4408f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4410h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f4411k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f4412l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f4414n = new f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f4415o = 0;

    /* renamed from: g, reason: collision with root package name */
    public C0354b[] f4409g = new C0354b[32];

    public C0355c() {
        s();
        h hVar = new h();
        hVar.f616b = new N.b();
        hVar.f617c = new N.b();
        hVar.f618d = new f[32];
        this.f4413m = hVar;
        C0356d c0356d = new C0356d(hVar);
        c0356d.f4417f = new f[128];
        c0356d.f4418g = new f[128];
        c0356d.f4419h = 0;
        c0356d.i = new i(16, c0356d);
        this.f4407d = c0356d;
        this.f4416p = new C0354b(hVar);
    }

    public static int n(Object obj) {
        f fVar = ((w.c) obj).i;
        if (fVar != null) {
            return (int) (fVar.e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i) {
        N.b bVar = (N.b) this.f4413m.f617c;
        int i2 = bVar.f630b;
        f fVar = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = bVar.f629a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            bVar.f630b = i3;
            fVar = r4;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i);
            fVar2.f4429l = i;
        } else {
            fVar2.c();
            fVar2.f4429l = i;
        }
        int i4 = this.f4415o;
        int i5 = this.f4404a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f4404a = i6;
            this.f4414n = (f[]) Arrays.copyOf(this.f4414n, i6);
        }
        f[] fVarArr = this.f4414n;
        int i7 = this.f4415o;
        this.f4415o = i7 + 1;
        fVarArr[i7] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i, float f2, f fVar3, f fVar4, int i2, int i3) {
        C0354b l2 = l();
        if (fVar2 == fVar3) {
            l2.f4402d.g(fVar, 1.0f);
            l2.f4402d.g(fVar4, 1.0f);
            l2.f4402d.g(fVar2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.f4402d.g(fVar, 1.0f);
            l2.f4402d.g(fVar2, -1.0f);
            l2.f4402d.g(fVar3, -1.0f);
            l2.f4402d.g(fVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                l2.f4400b = (-i) + i2;
            }
        } else if (f2 <= RecyclerView.f2111C0) {
            l2.f4402d.g(fVar, -1.0f);
            l2.f4402d.g(fVar2, 1.0f);
            l2.f4400b = i;
        } else if (f2 >= 1.0f) {
            l2.f4402d.g(fVar4, -1.0f);
            l2.f4402d.g(fVar3, 1.0f);
            l2.f4400b = -i2;
        } else {
            float f3 = 1.0f - f2;
            l2.f4402d.g(fVar, f3 * 1.0f);
            l2.f4402d.g(fVar2, f3 * (-1.0f));
            l2.f4402d.g(fVar3, (-1.0f) * f2);
            l2.f4402d.g(fVar4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                l2.f4400b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f4428k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f4428k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f4428k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f4428k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0354b c0354b) {
        boolean z2;
        boolean z3;
        f fVar;
        f f2;
        ArrayList arrayList;
        if (this.f4411k + 1 >= this.f4412l || this.j + 1 >= this.f4408f) {
            o();
        }
        if (c0354b.e) {
            z2 = false;
        } else {
            if (this.f4409g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d2 = c0354b.f4402d.d();
                    int i = 0;
                    while (true) {
                        arrayList = c0354b.f4401c;
                        if (i >= d2) {
                            break;
                        }
                        f e = c0354b.f4402d.e(i);
                        if (e.f4423c != -1 || e.f4425f) {
                            arrayList.add(e);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            f fVar2 = (f) arrayList.get(i2);
                            if (fVar2.f4425f) {
                                c0354b.h(this, fVar2, true);
                            } else {
                                c0354b.i(this, this.f4409g[fVar2.f4423c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c0354b.f4399a != null && c0354b.f4402d.d() == 0) {
                    c0354b.e = true;
                    this.f4405b = true;
                }
            }
            if (c0354b.e()) {
                return;
            }
            float f3 = c0354b.f4400b;
            if (f3 < RecyclerView.f2111C0) {
                c0354b.f4400b = f3 * (-1.0f);
                C0353a c0353a = c0354b.f4402d;
                int i3 = c0353a.f4398h;
                for (int i4 = 0; i3 != -1 && i4 < c0353a.f4392a; i4++) {
                    float[] fArr = c0353a.f4397g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0353a.f4396f[i3];
                }
            }
            int d3 = c0354b.f4402d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            f fVar3 = null;
            f fVar4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < d3; i5++) {
                float f6 = c0354b.f4402d.f(i5);
                f e2 = c0354b.f4402d.e(i5);
                if (e2.f4429l == 1) {
                    if (fVar3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e2.f4428k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    fVar3 = e2;
                    f4 = f6;
                } else if (fVar3 == null && f6 < RecyclerView.f2111C0) {
                    if (fVar4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e2.f4428k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    fVar4 = e2;
                    f5 = f6;
                }
            }
            if (fVar3 == null) {
                fVar3 = fVar4;
            }
            if (fVar3 == null) {
                z3 = true;
            } else {
                c0354b.g(fVar3);
                z3 = false;
            }
            if (c0354b.f4402d.d() == 0) {
                c0354b.e = true;
            }
            if (z3) {
                if (this.j + 1 >= this.f4408f) {
                    o();
                }
                f a2 = a(3);
                int i6 = this.f4406c + 1;
                this.f4406c = i6;
                this.j++;
                a2.f4422b = i6;
                h hVar = this.f4413m;
                ((f[]) hVar.f618d)[i6] = a2;
                c0354b.f4399a = a2;
                int i7 = this.f4411k;
                h(c0354b);
                if (this.f4411k == i7 + 1) {
                    C0354b c0354b2 = this.f4416p;
                    c0354b2.f4399a = null;
                    c0354b2.f4402d.b();
                    for (int i8 = 0; i8 < c0354b.f4402d.d(); i8++) {
                        c0354b2.f4402d.a(c0354b.f4402d.e(i8), c0354b.f4402d.f(i8), true);
                    }
                    r(this.f4416p);
                    if (a2.f4423c == -1) {
                        if (c0354b.f4399a == a2 && (f2 = c0354b.f(null, a2)) != null) {
                            c0354b.g(f2);
                        }
                        if (!c0354b.e) {
                            c0354b.f4399a.e(this, c0354b);
                        }
                        ((N.b) hVar.f616b).b(c0354b);
                        this.f4411k--;
                    }
                    z2 = true;
                    fVar = c0354b.f4399a;
                    if (fVar != null) {
                        return;
                    }
                    if (fVar.f4429l != 1 && c0354b.f4400b < RecyclerView.f2111C0) {
                        return;
                    }
                }
            }
            z2 = false;
            fVar = c0354b.f4399a;
            if (fVar != null) {
            }
        }
        if (z2) {
            return;
        }
        h(c0354b);
    }

    public final void d(f fVar, int i) {
        int i2 = fVar.f4423c;
        if (i2 == -1) {
            fVar.d(this, i);
            for (int i3 = 0; i3 < this.f4406c + 1; i3++) {
                f fVar2 = ((f[]) this.f4413m.f618d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0354b l2 = l();
            l2.f4399a = fVar;
            float f2 = i;
            fVar.e = f2;
            l2.f4400b = f2;
            l2.e = true;
            c(l2);
            return;
        }
        C0354b c0354b = this.f4409g[i2];
        if (c0354b.e) {
            c0354b.f4400b = i;
            return;
        }
        if (c0354b.f4402d.d() == 0) {
            c0354b.e = true;
            c0354b.f4400b = i;
            return;
        }
        C0354b l3 = l();
        if (i < 0) {
            l3.f4400b = i * (-1);
            l3.f4402d.g(fVar, 1.0f);
        } else {
            l3.f4400b = i;
            l3.f4402d.g(fVar, -1.0f);
        }
        c(l3);
    }

    public final void e(f fVar, f fVar2, int i, int i2) {
        if (i2 == 8 && fVar2.f4425f && fVar.f4423c == -1) {
            fVar.d(this, fVar2.e + i);
            return;
        }
        C0354b l2 = l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            l2.f4400b = i;
        }
        if (z2) {
            l2.f4402d.g(fVar, 1.0f);
            l2.f4402d.g(fVar2, -1.0f);
        } else {
            l2.f4402d.g(fVar, -1.0f);
            l2.f4402d.g(fVar2, 1.0f);
        }
        if (i2 != 8) {
            l2.a(this, i2);
        }
        c(l2);
    }

    public final void f(f fVar, f fVar2, int i, int i2) {
        C0354b l2 = l();
        f m2 = m();
        m2.f4424d = 0;
        l2.b(fVar, fVar2, m2, i);
        if (i2 != 8) {
            l2.f4402d.g(j(i2), (int) (l2.f4402d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void g(f fVar, f fVar2, int i, int i2) {
        C0354b l2 = l();
        f m2 = m();
        m2.f4424d = 0;
        l2.c(fVar, fVar2, m2, i);
        if (i2 != 8) {
            l2.f4402d.g(j(i2), (int) (l2.f4402d.c(m2) * (-1.0f)));
        }
        c(l2);
    }

    public final void h(C0354b c0354b) {
        int i;
        if (c0354b.e) {
            c0354b.f4399a.d(this, c0354b.f4400b);
        } else {
            C0354b[] c0354bArr = this.f4409g;
            int i2 = this.f4411k;
            c0354bArr[i2] = c0354b;
            f fVar = c0354b.f4399a;
            fVar.f4423c = i2;
            this.f4411k = i2 + 1;
            fVar.e(this, c0354b);
        }
        if (this.f4405b) {
            int i3 = 0;
            while (i3 < this.f4411k) {
                if (this.f4409g[i3] == null) {
                    System.out.println("WTF");
                }
                C0354b c0354b2 = this.f4409g[i3];
                if (c0354b2 != null && c0354b2.e) {
                    c0354b2.f4399a.d(this, c0354b2.f4400b);
                    ((N.b) this.f4413m.f616b).b(c0354b2);
                    this.f4409g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f4411k;
                        if (i4 >= i) {
                            break;
                        }
                        C0354b[] c0354bArr2 = this.f4409g;
                        int i6 = i4 - 1;
                        C0354b c0354b3 = c0354bArr2[i4];
                        c0354bArr2[i6] = c0354b3;
                        f fVar2 = c0354b3.f4399a;
                        if (fVar2.f4423c == i4) {
                            fVar2.f4423c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f4409g[i5] = null;
                    }
                    this.f4411k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f4405b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f4411k; i++) {
            C0354b c0354b = this.f4409g[i];
            c0354b.f4399a.e = c0354b.f4400b;
        }
    }

    public final f j(int i) {
        if (this.j + 1 >= this.f4408f) {
            o();
        }
        f a2 = a(4);
        int i2 = this.f4406c + 1;
        this.f4406c = i2;
        this.j++;
        a2.f4422b = i2;
        a2.f4424d = i;
        ((f[]) this.f4413m.f618d)[i2] = a2;
        C0356d c0356d = this.f4407d;
        c0356d.i.f208b = a2;
        float[] fArr = a2.f4427h;
        Arrays.fill(fArr, RecyclerView.f2111C0);
        fArr[a2.f4424d] = 1.0f;
        c0356d.j(a2);
        return a2;
    }

    public final f k(Object obj) {
        f fVar = null;
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f4408f) {
            o();
        }
        if (obj instanceof w.c) {
            w.c cVar = (w.c) obj;
            fVar = cVar.i;
            if (fVar == null) {
                cVar.k();
                fVar = cVar.i;
            }
            int i = fVar.f4422b;
            h hVar = this.f4413m;
            if (i == -1 || i > this.f4406c || ((f[]) hVar.f618d)[i] == null) {
                if (i != -1) {
                    fVar.c();
                }
                int i2 = this.f4406c + 1;
                this.f4406c = i2;
                this.j++;
                fVar.f4422b = i2;
                fVar.f4429l = 1;
                ((f[]) hVar.f618d)[i2] = fVar;
            }
        }
        return fVar;
    }

    public final C0354b l() {
        Object obj;
        h hVar = this.f4413m;
        N.b bVar = (N.b) hVar.f616b;
        int i = bVar.f630b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.f629a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.f630b = i2;
        } else {
            obj = null;
        }
        C0354b c0354b = (C0354b) obj;
        if (c0354b == null) {
            return new C0354b(hVar);
        }
        c0354b.f4399a = null;
        c0354b.f4402d.b();
        c0354b.f4400b = RecyclerView.f2111C0;
        c0354b.e = false;
        return c0354b;
    }

    public final f m() {
        if (this.j + 1 >= this.f4408f) {
            o();
        }
        f a2 = a(3);
        int i = this.f4406c + 1;
        this.f4406c = i;
        this.j++;
        a2.f4422b = i;
        ((f[]) this.f4413m.f618d)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.f4409g = (C0354b[]) Arrays.copyOf(this.f4409g, i);
        h hVar = this.f4413m;
        hVar.f618d = (f[]) Arrays.copyOf((f[]) hVar.f618d, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f4408f = i2;
        this.f4412l = i2;
    }

    public final void p() {
        C0356d c0356d = this.f4407d;
        if (c0356d.e()) {
            i();
            return;
        }
        if (!this.f4410h) {
            q(c0356d);
            return;
        }
        for (int i = 0; i < this.f4411k; i++) {
            if (!this.f4409g[i].e) {
                q(c0356d);
                return;
            }
        }
        i();
    }

    public final void q(C0356d c0356d) {
        int i = 0;
        while (true) {
            if (i >= this.f4411k) {
                break;
            }
            C0354b c0354b = this.f4409g[i];
            int i2 = 1;
            if (c0354b.f4399a.f4429l != 1) {
                float f2 = c0354b.f4400b;
                float f3 = RecyclerView.f2111C0;
                if (f2 < RecyclerView.f2111C0) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f4 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f4411k) {
                            C0354b c0354b2 = this.f4409g[i6];
                            if (c0354b2.f4399a.f4429l != i2 && !c0354b2.e && c0354b2.f4400b < f3) {
                                int d2 = c0354b2.f4402d.d();
                                int i8 = 0;
                                while (i8 < d2) {
                                    f e = c0354b2.f4402d.e(i8);
                                    float c2 = c0354b2.f4402d.c(e);
                                    if (c2 > f3) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f5 = e.f4426g[i9] / c2;
                                            if ((f5 < f4 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e.f4422b;
                                                i4 = i6;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f3 = RecyclerView.f2111C0;
                                }
                            }
                            i6++;
                            f3 = RecyclerView.f2111C0;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0354b c0354b3 = this.f4409g[i4];
                            c0354b3.f4399a.f4423c = -1;
                            c0354b3.g(((f[]) this.f4413m.f618d)[i5]);
                            f fVar = c0354b3.f4399a;
                            fVar.f4423c = i4;
                            fVar.e(this, c0354b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.j / 2) {
                            z2 = true;
                        }
                        f3 = RecyclerView.f2111C0;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(c0356d);
        i();
    }

    public final void r(C0354b c0354b) {
        boolean z2;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            int i4 = 1;
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            f fVar = c0354b.f4399a;
            if (fVar != null) {
                this.i[fVar.f4422b] = true;
            }
            f d2 = c0354b.d(this.i);
            if (d2 != null) {
                boolean[] zArr = this.i;
                int i5 = d2.f4422b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (d2 != null) {
                float f2 = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.f4411k) {
                    C0354b c0354b2 = this.f4409g[i6];
                    if (c0354b2.f4399a.f4429l != i4 && !c0354b2.e) {
                        C0353a c0353a = c0354b2.f4402d;
                        int i8 = c0353a.f4398h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c0353a.f4392a; i9++) {
                                if (c0353a.e[i8] == d2.f4422b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c0353a.f4396f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float c2 = c0354b2.f4402d.c(d2);
                            if (c2 < RecyclerView.f2111C0) {
                                float f3 = (-c0354b2.f4400b) / c2;
                                if (f3 < f2) {
                                    f2 = f3;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    C0354b c0354b3 = this.f4409g[i7];
                    c0354b3.f4399a.f4423c = -1;
                    c0354b3.g(d2);
                    f fVar2 = c0354b3.f4399a;
                    fVar2.f4423c = i7;
                    fVar2.e(this, c0354b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f4411k; i++) {
            C0354b c0354b = this.f4409g[i];
            if (c0354b != null) {
                ((N.b) this.f4413m.f616b).b(c0354b);
            }
            this.f4409g[i] = null;
        }
    }

    public final void t() {
        h hVar;
        int i = 0;
        while (true) {
            hVar = this.f4413m;
            f[] fVarArr = (f[]) hVar.f618d;
            if (i >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i];
            if (fVar != null) {
                fVar.c();
            }
            i++;
        }
        N.b bVar = (N.b) hVar.f617c;
        f[] fVarArr2 = this.f4414n;
        int i2 = this.f4415o;
        bVar.getClass();
        if (i2 > fVarArr2.length) {
            i2 = fVarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            f fVar2 = fVarArr2[i3];
            int i4 = bVar.f630b;
            Object[] objArr = bVar.f629a;
            if (i4 < objArr.length) {
                objArr[i4] = fVar2;
                bVar.f630b = i4 + 1;
            }
        }
        this.f4415o = 0;
        Arrays.fill((f[]) hVar.f618d, (Object) null);
        this.f4406c = 0;
        C0356d c0356d = this.f4407d;
        c0356d.f4419h = 0;
        c0356d.f4400b = RecyclerView.f2111C0;
        this.j = 1;
        for (int i5 = 0; i5 < this.f4411k; i5++) {
            C0354b c0354b = this.f4409g[i5];
        }
        s();
        this.f4411k = 0;
        this.f4416p = new C0354b(hVar);
    }
}
