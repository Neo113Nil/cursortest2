package w;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p.C0225c;

/* loaded from: classes.dex */
public class P {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3042b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final S f3043a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new H() : i2 >= 29 ? new G() : new C0262F()).b().f3044a.a().f3044a.b().f3044a.c();
    }

    public P(S s2) {
        this.f3043a = s2;
    }

    public S a() {
        return this.f3043a;
    }

    public S b() {
        return this.f3043a;
    }

    public S c() {
        return this.f3043a;
    }

    public C0267e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p2 = (P) obj;
        return l() == p2.l() && k() == p2.k() && Objects.equals(i(), p2.i()) && Objects.equals(g(), p2.g()) && Objects.equals(e(), p2.e());
    }

    public C0225c f() {
        return i();
    }

    public C0225c g() {
        return C0225c.f2800e;
    }

    public C0225c h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public C0225c i() {
        return C0225c.f2800e;
    }

    public C0225c j() {
        return i();
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i2) {
        return true;
    }

    public void d(View view) {
    }

    public void n(C0225c[] c0225cArr) {
    }

    public void o(S s2) {
    }

    public void p(C0225c c0225c) {
    }
}
