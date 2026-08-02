package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class cs2 {
    public final zr2 c;
    public szg e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public cs2(List list) {
        zr2 bs2Var;
        if (list.isEmpty()) {
            bs2Var = new imp();
        } else {
            bs2Var = list.size() == 1 ? new bs2(list) : new as2(list);
        }
        this.c = bs2Var;
    }

    public final void a(yr2 yr2Var) {
        this.a.add(yr2Var);
    }

    public float b() {
        if (this.h == -1.0f) {
            this.h = this.c.j();
        }
        return this.h;
    }

    public final float c() {
        Interpolator interpolator;
        acf e = this.c.e();
        if (e == null || e.c() || (interpolator = e.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        acf e = this.c.e();
        if (e.c()) {
            return 0.0f;
        }
        return (this.d - e.b()) / (e.a() - e.b());
    }

    public Object e() {
        float d = d();
        szg szgVar = this.e;
        zr2 zr2Var = this.c;
        if (szgVar == null && zr2Var.c(d) && !k()) {
            return this.f;
        }
        acf e = zr2Var.e();
        Interpolator interpolator = e.e;
        Interpolator interpolator2 = e.f;
        Object f = (interpolator == null || interpolator2 == null) ? f(e, c()) : g(e, d, interpolator.getInterpolation(d), interpolator2.getInterpolation(d));
        this.f = f;
        return f;
    }

    public abstract Object f(acf acfVar, float f);

    public Object g(acf acfVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((yr2) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        zr2 zr2Var = this.c;
        if (zr2Var.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = zr2Var.h();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = zr2Var.h();
            }
            f = this.g;
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (zr2Var.g(f)) {
            h();
        }
    }

    public final void j(szg szgVar) {
        szg szgVar2 = this.e;
        if (szgVar2 != null) {
            szgVar2.getClass();
        }
        this.e = szgVar;
    }

    public boolean k() {
        return false;
    }
}
