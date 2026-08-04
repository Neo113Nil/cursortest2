package com.gamericefishpro.space.d4;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class l1 {
    public static final o1 b;
    public final o1 a;

    static {
        d1 z0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            z0Var = new c1();
        } else if (i >= 31) {
            z0Var = new b1();
        } else if (i >= 30) {
            z0Var = new a1();
        } else {
            z0Var = i >= 29 ? new z0() : new y0();
        }
        b = z0Var.b().a.a().a.b().a.c();
    }

    public l1(o1 o1Var) {
        this.a = o1Var;
    }

    public o1 a() {
        return this.a;
    }

    public o1 b() {
        return this.a;
    }

    public o1 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return p() == l1Var.p() && o() == l1Var.o() && Objects.equals(l(), l1Var.l()) && Objects.equals(j(), l1Var.j()) && Objects.equals(f(), l1Var.f());
    }

    public k f() {
        return null;
    }

    public com.gamericefishpro.space.u3.b g(int i) {
        return com.gamericefishpro.space.u3.b.e;
    }

    public com.gamericefishpro.space.u3.b h(int i) {
        if ((i & 8) == 0) {
            return com.gamericefishpro.space.u3.b.e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public com.gamericefishpro.space.u3.b i() {
        return l();
    }

    public com.gamericefishpro.space.u3.b j() {
        return com.gamericefishpro.space.u3.b.e;
    }

    public com.gamericefishpro.space.u3.b k() {
        return l();
    }

    public com.gamericefishpro.space.u3.b l() {
        return com.gamericefishpro.space.u3.b.e;
    }

    public com.gamericefishpro.space.u3.b m() {
        return l();
    }

    public o1 n(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void e(o1 o1Var) {
    }

    public void r(com.gamericefishpro.space.u3.b[] bVarArr) {
    }

    public void s(com.gamericefishpro.space.u3.b bVar) {
    }

    public void t(o1 o1Var) {
    }

    public void u(com.gamericefishpro.space.u3.b bVar) {
    }

    public void v(int i) {
    }
}
