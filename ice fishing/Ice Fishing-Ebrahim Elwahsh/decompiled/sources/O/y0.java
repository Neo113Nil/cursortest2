package O;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final A0 f2338b;

    /* renamed from: a, reason: collision with root package name */
    public final A0 f2339a;

    static {
        int i = Build.VERSION.SDK_INT;
        f2338b = (i >= 30 ? new r0() : i >= 29 ? new q0() : new p0()).b().f2213a.a().f2213a.b().f2213a.c();
    }

    public y0(A0 a02) {
        this.f2339a = a02;
    }

    public A0 a() {
        return this.f2339a;
    }

    public A0 b() {
        return this.f2339a;
    }

    public A0 c() {
        return this.f2339a;
    }

    public C0347i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return n() == y0Var.n() && m() == y0Var.m() && Objects.equals(j(), y0Var.j()) && Objects.equals(h(), y0Var.h()) && Objects.equals(e(), y0Var.e());
    }

    public G.e f(int i) {
        return G.e.f1150e;
    }

    public G.e g() {
        return j();
    }

    public G.e h() {
        return G.e.f1150e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public G.e i() {
        return j();
    }

    public G.e j() {
        return G.e.f1150e;
    }

    public G.e k() {
        return j();
    }

    public A0 l(int i, int i4, int i9, int i10) {
        return f2338b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(G.e[] eVarArr) {
    }

    public void p(A0 a02) {
    }

    public void q(G.e eVar) {
    }
}
