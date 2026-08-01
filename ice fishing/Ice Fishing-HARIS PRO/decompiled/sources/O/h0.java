package O;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f815b;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f816a;

    static {
        int i = Build.VERSION.SDK_INT;
        f815b = (i >= 30 ? new a0() : i >= 29 ? new Z() : new Y()).b().f819a.a().f819a.b().f819a.c();
    }

    public h0(j0 j0Var) {
        this.f816a = j0Var;
    }

    public j0 a() {
        return this.f816a;
    }

    public j0 b() {
        return this.f816a;
    }

    public j0 c() {
        return this.f816a;
    }

    public void d(View view) {
    }

    public C0033i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return n() == h0Var.n() && m() == h0Var.m() && Objects.equals(j(), h0Var.j()) && Objects.equals(h(), h0Var.h()) && Objects.equals(e(), h0Var.e());
    }

    public G.c f(int i) {
        return G.c.e;
    }

    public G.c g() {
        return j();
    }

    public G.c h() {
        return G.c.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public G.c i() {
        return j();
    }

    public G.c j() {
        return G.c.e;
    }

    public G.c k() {
        return j();
    }

    public j0 l(int i, int i2, int i3, int i4) {
        return f815b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(G.c[] cVarArr) {
    }

    public void p(j0 j0Var) {
    }

    public void q(G.c cVar) {
    }
}
