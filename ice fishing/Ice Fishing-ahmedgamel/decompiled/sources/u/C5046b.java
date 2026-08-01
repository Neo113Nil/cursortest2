package u;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import j4.g;
import java.util.ArrayList;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5046b {

    /* renamed from: d, reason: collision with root package name */
    public final C5045a f40953d;

    /* renamed from: a, reason: collision with root package name */
    public C5050f f40950a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f40951b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f40952c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f40954e = false;

    public C5046b(g gVar) {
        this.f40953d = new C5045a(this, gVar);
    }

    public final void a(C5047c c5047c, int i) {
        this.f40953d.g(c5047c.j(i), 1.0f);
        this.f40953d.g(c5047c.j(i), -1.0f);
    }

    public final void b(C5050f c5050f, C5050f c5050f2, C5050f c5050f3, int i) {
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            this.f40951b = i;
        }
        if (z3) {
            this.f40953d.g(c5050f, 1.0f);
            this.f40953d.g(c5050f2, -1.0f);
            this.f40953d.g(c5050f3, -1.0f);
        } else {
            this.f40953d.g(c5050f, -1.0f);
            this.f40953d.g(c5050f2, 1.0f);
            this.f40953d.g(c5050f3, 1.0f);
        }
    }

    public final void c(C5050f c5050f, C5050f c5050f2, C5050f c5050f3, int i) {
        boolean z3 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z3 = true;
            }
            this.f40951b = i;
        }
        if (z3) {
            this.f40953d.g(c5050f, 1.0f);
            this.f40953d.g(c5050f2, -1.0f);
            this.f40953d.g(c5050f3, 1.0f);
        } else {
            this.f40953d.g(c5050f, -1.0f);
            this.f40953d.g(c5050f2, 1.0f);
            this.f40953d.g(c5050f3, -1.0f);
        }
    }

    public C5050f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f40950a == null && this.f40951b == 0.0f && this.f40953d.d() == 0;
    }

    public final C5050f f(boolean[] zArr, C5050f c5050f) {
        int i;
        int d2 = this.f40953d.d();
        C5050f c5050f2 = null;
        float f3 = 0.0f;
        for (int i6 = 0; i6 < d2; i6++) {
            float f9 = this.f40953d.f(i6);
            if (f9 < 0.0f) {
                C5050f e9 = this.f40953d.e(i6);
                if ((zArr == null || !zArr[e9.f40981u]) && e9 != c5050f && (((i = e9.f40979E) == 3 || i == 4) && f9 < f3)) {
                    f3 = f9;
                    c5050f2 = e9;
                }
            }
        }
        return c5050f2;
    }

    public final void g(C5050f c5050f) {
        C5050f c5050f2 = this.f40950a;
        if (c5050f2 != null) {
            this.f40953d.g(c5050f2, -1.0f);
            this.f40950a.f40982v = -1;
            this.f40950a = null;
        }
        float h9 = this.f40953d.h(c5050f, true) * (-1.0f);
        this.f40950a = c5050f;
        if (h9 == 1.0f) {
            return;
        }
        this.f40951b /= h9;
        C5045a c5045a = this.f40953d;
        int i = c5045a.f40948h;
        for (int i6 = 0; i != -1 && i6 < c5045a.f40941a; i6++) {
            float[] fArr = c5045a.f40947g;
            fArr[i] = fArr[i] / h9;
            i = c5045a.f40946f[i];
        }
    }

    public final void h(C5047c c5047c, C5050f c5050f, boolean z3) {
        if (c5050f == null || !c5050f.f40985y) {
            return;
        }
        float c9 = this.f40953d.c(c5050f);
        this.f40951b = (c5050f.f40984x * c9) + this.f40951b;
        this.f40953d.h(c5050f, z3);
        if (z3) {
            c5050f.b(this);
        }
        if (this.f40953d.d() == 0) {
            this.f40954e = true;
            c5047c.f40957b = true;
        }
    }

    public void i(C5047c c5047c, C5046b c5046b, boolean z3) {
        C5045a c5045a = this.f40953d;
        c5045a.getClass();
        float c9 = c5045a.c(c5046b.f40950a);
        c5045a.h(c5046b.f40950a, z3);
        C5045a c5045a2 = c5046b.f40953d;
        int d2 = c5045a2.d();
        for (int i = 0; i < d2; i++) {
            C5050f e9 = c5045a2.e(i);
            c5045a.a(e9, c5045a2.c(e9) * c9, z3);
        }
        this.f40951b = (c5046b.f40951b * c9) + this.f40951b;
        if (z3) {
            c5046b.f40950a.b(this);
        }
        if (this.f40950a == null || this.f40953d.d() != 0) {
            return;
        }
        this.f40954e = true;
        c5047c.f40957b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z3;
        String f3 = AbstractC4404f.f(this.f40950a == null ? "0" : "" + this.f40950a, " = ");
        if (this.f40951b != 0.0f) {
            StringBuilder b9 = AbstractC5049e.b(f3);
            b9.append(this.f40951b);
            f3 = b9.toString();
            z3 = true;
        } else {
            z3 = false;
        }
        int d2 = this.f40953d.d();
        for (int i = 0; i < d2; i++) {
            C5050f e9 = this.f40953d.e(i);
            if (e9 != null) {
                float f9 = this.f40953d.f(i);
                if (f9 != 0.0f) {
                    String c5050f = e9.toString();
                    if (!z3) {
                        if (f9 < 0.0f) {
                            f3 = AbstractC4404f.f(f3, "- ");
                            f9 *= -1.0f;
                        }
                        f3 = f9 == 1.0f ? AbstractC4404f.f(f3, c5050f) : f3 + f9 + " " + c5050f;
                        z3 = true;
                    } else if (f9 > 0.0f) {
                        f3 = AbstractC4404f.f(f3, " + ");
                        if (f9 == 1.0f) {
                        }
                        z3 = true;
                    } else {
                        f3 = AbstractC4404f.f(f3, " - ");
                        f9 *= -1.0f;
                        if (f9 == 1.0f) {
                        }
                        z3 = true;
                    }
                }
            }
        }
        return !z3 ? AbstractC4404f.f(f3, "0.0") : f3;
    }
}
