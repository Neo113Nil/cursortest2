package u;

import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import m.Q0;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5085b {

    /* renamed from: d, reason: collision with root package name */
    public final C5084a f40967d;

    /* renamed from: a, reason: collision with root package name */
    public C5089f f40964a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f40965b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f40966c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f40968e = false;

    public C5085b(Q0 q02) {
        this.f40967d = new C5084a(this, q02);
    }

    public final void a(C5086c c5086c, int i) {
        this.f40967d.g(c5086c.j(i), 1.0f);
        this.f40967d.g(c5086c.j(i), -1.0f);
    }

    public final void b(C5089f c5089f, C5089f c5089f2, C5089f c5089f3, int i) {
        boolean z8 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z8 = true;
            }
            this.f40965b = i;
        }
        if (z8) {
            this.f40967d.g(c5089f, 1.0f);
            this.f40967d.g(c5089f2, -1.0f);
            this.f40967d.g(c5089f3, -1.0f);
        } else {
            this.f40967d.g(c5089f, -1.0f);
            this.f40967d.g(c5089f2, 1.0f);
            this.f40967d.g(c5089f3, 1.0f);
        }
    }

    public final void c(C5089f c5089f, C5089f c5089f2, C5089f c5089f3, int i) {
        boolean z8 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z8 = true;
            }
            this.f40965b = i;
        }
        if (z8) {
            this.f40967d.g(c5089f, 1.0f);
            this.f40967d.g(c5089f2, -1.0f);
            this.f40967d.g(c5089f3, 1.0f);
        } else {
            this.f40967d.g(c5089f, -1.0f);
            this.f40967d.g(c5089f2, 1.0f);
            this.f40967d.g(c5089f3, -1.0f);
        }
    }

    public C5089f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f40964a == null && this.f40965b == 0.0f && this.f40967d.d() == 0;
    }

    public final C5089f f(boolean[] zArr, C5089f c5089f) {
        int i;
        int d2 = this.f40967d.d();
        C5089f c5089f2 = null;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < d2; i4++) {
            float f9 = this.f40967d.f(i4);
            if (f9 < 0.0f) {
                C5089f e6 = this.f40967d.e(i4);
                if ((zArr == null || !zArr[e6.f40995u]) && e6 != c5089f && (((i = e6.f40993E) == 3 || i == 4) && f9 < f6)) {
                    f6 = f9;
                    c5089f2 = e6;
                }
            }
        }
        return c5089f2;
    }

    public final void g(C5089f c5089f) {
        C5089f c5089f2 = this.f40964a;
        if (c5089f2 != null) {
            this.f40967d.g(c5089f2, -1.0f);
            this.f40964a.f40996v = -1;
            this.f40964a = null;
        }
        float h9 = this.f40967d.h(c5089f, true) * (-1.0f);
        this.f40964a = c5089f;
        if (h9 == 1.0f) {
            return;
        }
        this.f40965b /= h9;
        C5084a c5084a = this.f40967d;
        int i = c5084a.f40962h;
        for (int i4 = 0; i != -1 && i4 < c5084a.f40955a; i4++) {
            float[] fArr = c5084a.f40961g;
            fArr[i] = fArr[i] / h9;
            i = c5084a.f40960f[i];
        }
    }

    public final void h(C5086c c5086c, C5089f c5089f, boolean z8) {
        if (c5089f == null || !c5089f.f40999y) {
            return;
        }
        float c4 = this.f40967d.c(c5089f);
        this.f40965b = (c5089f.f40998x * c4) + this.f40965b;
        this.f40967d.h(c5089f, z8);
        if (z8) {
            c5089f.b(this);
        }
        if (this.f40967d.d() == 0) {
            this.f40968e = true;
            c5086c.f40971b = true;
        }
    }

    public void i(C5086c c5086c, C5085b c5085b, boolean z8) {
        C5084a c5084a = this.f40967d;
        c5084a.getClass();
        float c4 = c5084a.c(c5085b.f40964a);
        c5084a.h(c5085b.f40964a, z8);
        C5084a c5084a2 = c5085b.f40967d;
        int d2 = c5084a2.d();
        for (int i = 0; i < d2; i++) {
            C5089f e6 = c5084a2.e(i);
            c5084a.a(e6, c5084a2.c(e6) * c4, z8);
        }
        this.f40965b = (c5085b.f40965b * c4) + this.f40965b;
        if (z8) {
            c5085b.f40964a.b(this);
        }
        if (this.f40964a == null || this.f40967d.d() != 0) {
            return;
        }
        this.f40968e = true;
        c5086c.f40971b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z8;
        String j9 = CL.j(this.f40964a == null ? "0" : "" + this.f40964a, " = ");
        if (this.f40965b != 0.0f) {
            StringBuilder b9 = AbstractC5088e.b(j9);
            b9.append(this.f40965b);
            j9 = b9.toString();
            z8 = true;
        } else {
            z8 = false;
        }
        int d2 = this.f40967d.d();
        for (int i = 0; i < d2; i++) {
            C5089f e6 = this.f40967d.e(i);
            if (e6 != null) {
                float f6 = this.f40967d.f(i);
                if (f6 != 0.0f) {
                    String c5089f = e6.toString();
                    if (!z8) {
                        if (f6 < 0.0f) {
                            j9 = CL.j(j9, "- ");
                            f6 *= -1.0f;
                        }
                        j9 = f6 == 1.0f ? CL.j(j9, c5089f) : j9 + f6 + " " + c5089f;
                        z8 = true;
                    } else if (f6 > 0.0f) {
                        j9 = CL.j(j9, " + ");
                        if (f6 == 1.0f) {
                        }
                        z8 = true;
                    } else {
                        j9 = CL.j(j9, " - ");
                        f6 *= -1.0f;
                        if (f6 == 1.0f) {
                        }
                        z8 = true;
                    }
                }
            }
        }
        return !z8 ? CL.j(j9, "0.0") : j9;
    }
}
