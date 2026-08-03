package h3;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f2833b;

    /* renamed from: a, reason: collision with root package name */
    public final a1 f2834a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f2833b = (i10 >= 34 ? new o0() : i10 >= 31 ? new n0() : i10 >= 30 ? new m0() : i10 >= 29 ? new l0() : new j0()).b().f2745a.a().f2745a.b().f2745a.c();
    }

    public x0(a1 a1Var) {
        this.f2834a = a1Var;
    }

    public a1 a() {
        return this.f2834a;
    }

    public a1 b() {
        return this.f2834a;
    }

    public a1 c() {
        return this.f2834a;
    }

    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return o() == x0Var.o() && n() == x0Var.n() && Objects.equals(k(), x0Var.k()) && Objects.equals(i(), x0Var.i()) && Objects.equals(e(), x0Var.e());
    }

    public a3.b f(int i10) {
        return a3.b.f193e;
    }

    public a3.b g(int i10) {
        if ((i10 & 8) == 0) {
            return a3.b.f193e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public a3.b h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public a3.b i() {
        return a3.b.f193e;
    }

    public a3.b j() {
        return k();
    }

    public a3.b k() {
        return a3.b.f193e;
    }

    public a3.b l() {
        return k();
    }

    public a1 m(int i10, int i11, int i12, int i13) {
        return f2833b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void q(a3.b[] bVarArr) {
    }

    public void r(a1 a1Var) {
    }

    public void s(a3.b bVar) {
    }

    public void t(int i10) {
    }
}
