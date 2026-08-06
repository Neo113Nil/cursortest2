package y;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class O {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8564b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Q f8565a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new H() : i2 >= 29 ? new G() : new F()).b().f8566a.a().f8566a.b().f8566a.c();
    }

    public O(Q q2) {
        this.f8565a = q2;
    }

    public Q a() {
        return this.f8565a;
    }

    public Q b() {
        return this.f8565a;
    }

    public Q c() {
        return this.f8565a;
    }

    public C1072e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o2 = (O) obj;
        return l() == o2.l() && k() == o2.k() && Objects.equals(i(), o2.i()) && Objects.equals(g(), o2.g()) && Objects.equals(e(), o2.e());
    }

    public r.c f() {
        return i();
    }

    public r.c g() {
        return r.c.f8447e;
    }

    public r.c h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public r.c i() {
        return r.c.f8447e;
    }

    public r.c j() {
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

    public void n(r.c[] cVarArr) {
    }

    public void o(Q q2) {
    }

    public void p(r.c cVar) {
    }
}
