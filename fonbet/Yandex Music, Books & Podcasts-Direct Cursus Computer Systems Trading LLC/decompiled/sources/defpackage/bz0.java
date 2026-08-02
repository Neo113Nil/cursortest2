package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class bz0 {
    public final py0 d;
    public i3r a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public bz0(osh oshVar) {
        this.d = new py0(this, oshVar);
    }

    public final void a(j7g j7gVar, int i) {
        this.d.g(j7gVar.j(i), 1.0f);
        this.d.g(j7gVar.j(i), -1.0f);
    }

    public final void b(i3r i3rVar, i3r i3rVar2, i3r i3rVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        py0 py0Var = this.d;
        if (z) {
            py0Var.g(i3rVar, 1.0f);
            this.d.g(i3rVar2, -1.0f);
            this.d.g(i3rVar3, -1.0f);
        } else {
            py0Var.g(i3rVar, -1.0f);
            this.d.g(i3rVar2, 1.0f);
            this.d.g(i3rVar3, 1.0f);
        }
    }

    public final void c(i3r i3rVar, i3r i3rVar2, i3r i3rVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        py0 py0Var = this.d;
        if (z) {
            py0Var.g(i3rVar, 1.0f);
            this.d.g(i3rVar2, -1.0f);
            this.d.g(i3rVar3, 1.0f);
        } else {
            py0Var.g(i3rVar, -1.0f);
            this.d.g(i3rVar2, 1.0f);
            this.d.g(i3rVar3, -1.0f);
        }
    }

    public i3r d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final i3r f(boolean[] zArr, i3r i3rVar) {
        int i;
        int d = this.d.d();
        i3r i3rVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f2 = this.d.f(i2);
            if (f2 < 0.0f) {
                i3r e = this.d.e(i2);
                if ((zArr == null || !zArr[e.b]) && e != i3rVar && (((i = e.l) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    i3rVar2 = e;
                }
            }
        }
        return i3rVar2;
    }

    public final void g(i3r i3rVar) {
        i3r i3rVar2 = this.a;
        if (i3rVar2 != null) {
            this.d.g(i3rVar2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float h = this.d.h(i3rVar, true) * (-1.0f);
        this.a = i3rVar;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        py0 py0Var = this.d;
        int i = py0Var.h;
        for (int i2 = 0; i != -1 && i2 < py0Var.a; i2++) {
            float[] fArr = py0Var.g;
            fArr[i] = fArr[i] / h;
            i = py0Var.f[i];
        }
    }

    public final void h(j7g j7gVar, i3r i3rVar, boolean z) {
        if (i3rVar.f) {
            float c = this.d.c(i3rVar);
            this.b = (i3rVar.e * c) + this.b;
            this.d.h(i3rVar, z);
            if (z) {
                i3rVar.b(this);
            }
            if (this.d.d() == 0) {
                this.e = true;
                j7gVar.b = true;
            }
        }
    }

    public void i(j7g j7gVar, bz0 bz0Var, boolean z) {
        py0 py0Var = this.d;
        py0Var.getClass();
        float c = py0Var.c(bz0Var.a);
        py0Var.h(bz0Var.a, z);
        py0 py0Var2 = bz0Var.d;
        int d = py0Var2.d();
        for (int i = 0; i < d; i++) {
            i3r e = py0Var2.e(i);
            py0Var.a(e, py0Var2.c(e) * c, z);
        }
        this.b = (bz0Var.b * c) + this.b;
        if (z) {
            bz0Var.a.b(this);
        }
        if (this.a == null || this.d.d() != 0) {
            return;
        }
        this.e = true;
        j7gVar.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String concat = (this.a == null ? CommonUrlParts.Values.FALSE_INTEGER : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            StringBuilder k = dfi.k(concat);
            k.append(this.b);
            concat = k.toString();
            z = true;
        } else {
            z = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            i3r e = this.d.e(i);
            if (e != null) {
                float f = this.d.f(i);
                if (f != 0.0f) {
                    String i3rVar = e.toString();
                    if (!z) {
                        if (f < 0.0f) {
                            concat = ouj.n(concat, "- ");
                            f *= -1.0f;
                        }
                        concat = f == 1.0f ? ouj.n(concat, i3rVar) : concat + f + StringUtil.SPACE + i3rVar;
                        z = true;
                    } else if (f > 0.0f) {
                        concat = ouj.n(concat, " + ");
                        if (f == 1.0f) {
                        }
                        z = true;
                    } else {
                        concat = ouj.n(concat, " - ");
                        f *= -1.0f;
                        if (f == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? ouj.n(concat, "0.0") : concat;
    }
}
