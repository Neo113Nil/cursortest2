package u;

import M0.h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0354b {

    /* renamed from: d, reason: collision with root package name */
    public final C0353a f4402d;

    /* renamed from: a, reason: collision with root package name */
    public f f4399a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f4400b = RecyclerView.f2111C0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4401c = new ArrayList();
    public boolean e = false;

    public C0354b(h hVar) {
        this.f4402d = new C0353a(this, hVar);
    }

    public final void a(C0355c c0355c, int i) {
        this.f4402d.g(c0355c.j(i), 1.0f);
        this.f4402d.g(c0355c.j(i), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f4400b = i;
        }
        if (z2) {
            this.f4402d.g(fVar, 1.0f);
            this.f4402d.g(fVar2, -1.0f);
            this.f4402d.g(fVar3, -1.0f);
        } else {
            this.f4402d.g(fVar, -1.0f);
            this.f4402d.g(fVar2, 1.0f);
            this.f4402d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f4400b = i;
        }
        if (z2) {
            this.f4402d.g(fVar, 1.0f);
            this.f4402d.g(fVar2, -1.0f);
            this.f4402d.g(fVar3, 1.0f);
        } else {
            this.f4402d.g(fVar, -1.0f);
            this.f4402d.g(fVar2, 1.0f);
            this.f4402d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f4399a == null && this.f4400b == RecyclerView.f2111C0 && this.f4402d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i;
        int d2 = this.f4402d.d();
        f fVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d2; i2++) {
            float f3 = this.f4402d.f(i2);
            if (f3 < RecyclerView.f2111C0) {
                f e = this.f4402d.e(i2);
                if ((zArr == null || !zArr[e.f4422b]) && e != fVar && (((i = e.f4429l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    fVar2 = e;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f4399a;
        if (fVar2 != null) {
            this.f4402d.g(fVar2, -1.0f);
            this.f4399a.f4423c = -1;
            this.f4399a = null;
        }
        float h2 = this.f4402d.h(fVar, true) * (-1.0f);
        this.f4399a = fVar;
        if (h2 == 1.0f) {
            return;
        }
        this.f4400b /= h2;
        C0353a c0353a = this.f4402d;
        int i = c0353a.f4398h;
        for (int i2 = 0; i != -1 && i2 < c0353a.f4392a; i2++) {
            float[] fArr = c0353a.f4397g;
            fArr[i] = fArr[i] / h2;
            i = c0353a.f4396f[i];
        }
    }

    public final void h(C0355c c0355c, f fVar, boolean z2) {
        if (fVar == null || !fVar.f4425f) {
            return;
        }
        float c2 = this.f4402d.c(fVar);
        this.f4400b = (fVar.e * c2) + this.f4400b;
        this.f4402d.h(fVar, z2);
        if (z2) {
            fVar.b(this);
        }
        if (this.f4402d.d() == 0) {
            this.e = true;
            c0355c.f4405b = true;
        }
    }

    public void i(C0355c c0355c, C0354b c0354b, boolean z2) {
        C0353a c0353a = this.f4402d;
        c0353a.getClass();
        float c2 = c0353a.c(c0354b.f4399a);
        c0353a.h(c0354b.f4399a, z2);
        C0353a c0353a2 = c0354b.f4402d;
        int d2 = c0353a2.d();
        for (int i = 0; i < d2; i++) {
            f e = c0353a2.e(i);
            c0353a.a(e, c0353a2.c(e) * c2, z2);
        }
        this.f4400b = (c0354b.f4400b * c2) + this.f4400b;
        if (z2) {
            c0354b.f4399a.b(this);
        }
        if (this.f4399a == null || this.f4402d.d() != 0) {
            return;
        }
        this.e = true;
        c0355c.f4405b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String f2 = D1.h.f(this.f4399a == null ? "0" : "" + this.f4399a, " = ");
        if (this.f4400b != RecyclerView.f2111C0) {
            f2 = f2 + this.f4400b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d2 = this.f4402d.d();
        for (int i = 0; i < d2; i++) {
            f e = this.f4402d.e(i);
            if (e != null) {
                float f3 = this.f4402d.f(i);
                if (f3 != RecyclerView.f2111C0) {
                    String fVar = e.toString();
                    if (!z2) {
                        if (f3 < RecyclerView.f2111C0) {
                            f2 = D1.h.f(f2, "- ");
                            f3 *= -1.0f;
                        }
                        f2 = f3 == 1.0f ? D1.h.f(f2, fVar) : f2 + f3 + " " + fVar;
                        z2 = true;
                    } else if (f3 > RecyclerView.f2111C0) {
                        f2 = D1.h.f(f2, " + ");
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        f2 = D1.h.f(f2, " - ");
                        f3 *= -1.0f;
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? D1.h.f(f2, "0.0") : f2;
    }
}
