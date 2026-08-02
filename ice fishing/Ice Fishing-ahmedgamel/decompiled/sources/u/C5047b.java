package u;

import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import l4.g;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5047b {

    /* renamed from: d, reason: collision with root package name */
    public final C5046a f40915d;

    /* renamed from: a, reason: collision with root package name */
    public C5051f f40912a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f40913b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f40914c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f40916e = false;

    public C5047b(g gVar) {
        this.f40915d = new C5046a(this, gVar);
    }

    public final void a(C5048c c5048c, int i) {
        this.f40915d.g(c5048c.j(i), 1.0f);
        this.f40915d.g(c5048c.j(i), -1.0f);
    }

    public final void b(C5051f c5051f, C5051f c5051f2, C5051f c5051f3, int i) {
        boolean z6 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z6 = true;
            }
            this.f40913b = i;
        }
        if (z6) {
            this.f40915d.g(c5051f, 1.0f);
            this.f40915d.g(c5051f2, -1.0f);
            this.f40915d.g(c5051f3, -1.0f);
        } else {
            this.f40915d.g(c5051f, -1.0f);
            this.f40915d.g(c5051f2, 1.0f);
            this.f40915d.g(c5051f3, 1.0f);
        }
    }

    public final void c(C5051f c5051f, C5051f c5051f2, C5051f c5051f3, int i) {
        boolean z6 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z6 = true;
            }
            this.f40913b = i;
        }
        if (z6) {
            this.f40915d.g(c5051f, 1.0f);
            this.f40915d.g(c5051f2, -1.0f);
            this.f40915d.g(c5051f3, 1.0f);
        } else {
            this.f40915d.g(c5051f, -1.0f);
            this.f40915d.g(c5051f2, 1.0f);
            this.f40915d.g(c5051f3, -1.0f);
        }
    }

    public C5051f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f40912a == null && this.f40913b == 0.0f && this.f40915d.d() == 0;
    }

    public final C5051f f(boolean[] zArr, C5051f c5051f) {
        int i;
        int d9 = this.f40915d.d();
        C5051f c5051f2 = null;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < d9; i4++) {
            float f9 = this.f40915d.f(i4);
            if (f9 < 0.0f) {
                C5051f e9 = this.f40915d.e(i4);
                if ((zArr == null || !zArr[e9.f40943u]) && e9 != c5051f && (((i = e9.f40941E) == 3 || i == 4) && f9 < f2)) {
                    f2 = f9;
                    c5051f2 = e9;
                }
            }
        }
        return c5051f2;
    }

    public final void g(C5051f c5051f) {
        C5051f c5051f2 = this.f40912a;
        if (c5051f2 != null) {
            this.f40915d.g(c5051f2, -1.0f);
            this.f40912a.f40944v = -1;
            this.f40912a = null;
        }
        float h3 = this.f40915d.h(c5051f, true) * (-1.0f);
        this.f40912a = c5051f;
        if (h3 == 1.0f) {
            return;
        }
        this.f40913b /= h3;
        C5046a c5046a = this.f40915d;
        int i = c5046a.f40910h;
        for (int i4 = 0; i != -1 && i4 < c5046a.f40903a; i4++) {
            float[] fArr = c5046a.f40909g;
            fArr[i] = fArr[i] / h3;
            i = c5046a.f40908f[i];
        }
    }

    public final void h(C5048c c5048c, C5051f c5051f, boolean z6) {
        if (c5051f == null || !c5051f.f40947y) {
            return;
        }
        float c9 = this.f40915d.c(c5051f);
        this.f40913b = (c5051f.f40946x * c9) + this.f40913b;
        this.f40915d.h(c5051f, z6);
        if (z6) {
            c5051f.b(this);
        }
        if (this.f40915d.d() == 0) {
            this.f40916e = true;
            c5048c.f40919b = true;
        }
    }

    public void i(C5048c c5048c, C5047b c5047b, boolean z6) {
        C5046a c5046a = this.f40915d;
        c5046a.getClass();
        float c9 = c5046a.c(c5047b.f40912a);
        c5046a.h(c5047b.f40912a, z6);
        C5046a c5046a2 = c5047b.f40915d;
        int d9 = c5046a2.d();
        for (int i = 0; i < d9; i++) {
            C5051f e9 = c5046a2.e(i);
            c5046a.a(e9, c5046a2.c(e9) * c9, z6);
        }
        this.f40913b = (c5047b.f40913b * c9) + this.f40913b;
        if (z6) {
            c5047b.f40912a.b(this);
        }
        if (this.f40912a == null || this.f40915d.d() != 0) {
            return;
        }
        this.f40916e = true;
        c5048c.f40919b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z6;
        String g9 = Wv.g(this.f40912a == null ? "0" : "" + this.f40912a, " = ");
        if (this.f40913b != 0.0f) {
            StringBuilder b9 = AbstractC5050e.b(g9);
            b9.append(this.f40913b);
            g9 = b9.toString();
            z6 = true;
        } else {
            z6 = false;
        }
        int d9 = this.f40915d.d();
        for (int i = 0; i < d9; i++) {
            C5051f e9 = this.f40915d.e(i);
            if (e9 != null) {
                float f2 = this.f40915d.f(i);
                if (f2 != 0.0f) {
                    String c5051f = e9.toString();
                    if (!z6) {
                        if (f2 < 0.0f) {
                            g9 = Wv.g(g9, "- ");
                            f2 *= -1.0f;
                        }
                        g9 = f2 == 1.0f ? Wv.g(g9, c5051f) : g9 + f2 + " " + c5051f;
                        z6 = true;
                    } else if (f2 > 0.0f) {
                        g9 = Wv.g(g9, " + ");
                        if (f2 == 1.0f) {
                        }
                        z6 = true;
                    } else {
                        g9 = Wv.g(g9, " - ");
                        f2 *= -1.0f;
                        if (f2 == 1.0f) {
                        }
                        z6 = true;
                    }
                }
            }
        }
        return !z6 ? Wv.g(g9, "0.0") : g9;
    }
}
