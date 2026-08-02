package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class hqv {
    public static final kqv b;
    public final kqv a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 34 ? new zpv() : i >= 30 ? new ypv() : i >= 29 ? new xpv() : new wpv()).b().a.a().a.b().a.c();
    }

    public hqv(kqv kqvVar) {
        this.a = kqvVar;
    }

    public kqv a() {
        return this.a;
    }

    public kqv b() {
        return this.a;
    }

    public kqv c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqv)) {
            return false;
        }
        hqv hqvVar = (hqv) obj;
        return p() == hqvVar.p() && o() == hqvVar.o() && Objects.equals(l(), hqvVar.l()) && Objects.equals(j(), hqvVar.j()) && Objects.equals(f(), hqvVar.f());
    }

    public ea8 f() {
        return null;
    }

    public zne g(int i) {
        return zne.e;
    }

    public zne h(int i) {
        if ((i & 8) == 0) {
            return zne.e;
        }
        xq0.x("Unable to query the maximum insets for IME");
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public zne i() {
        return l();
    }

    public zne j() {
        return zne.e;
    }

    public zne k() {
        return l();
    }

    public zne l() {
        return zne.e;
    }

    public zne m() {
        return l();
    }

    public kqv n(int i, int i2, int i3, int i4) {
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

    public void e(kqv kqvVar) {
    }

    public void r(zne[] zneVarArr) {
    }

    public void s(zne zneVar) {
    }

    public void t(kqv kqvVar) {
    }

    public void u(zne zneVar) {
    }

    public void v(int i) {
    }
}
