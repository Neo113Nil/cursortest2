package O;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: b, reason: collision with root package name */
    public static final A0 f2026b;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f2027a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2026b = x0.f2151q;
        } else {
            f2026b = y0.f2152b;
        }
    }

    public A0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f2027a = new x0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f2027a = new w0(this, windowInsets);
        } else if (i >= 28) {
            this.f2027a = new v0(this, windowInsets);
        } else {
            this.f2027a = new u0(this, windowInsets);
        }
    }

    public static G.e e(G.e eVar, int i, int i6, int i9, int i10) {
        int max = Math.max(0, eVar.f1005a - i);
        int max2 = Math.max(0, eVar.f1006b - i6);
        int max3 = Math.max(0, eVar.f1007c - i9);
        int max4 = Math.max(0, eVar.f1008d - i10);
        return (max == i && max2 == i6 && max3 == i9 && max4 == i10) ? eVar : G.e.b(max, max2, max3, max4);
    }

    public static A0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        A0 a02 = new A0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = X.f2054a;
            A0 a9 = M.a(view);
            y0 y0Var = a02.f2027a;
            y0Var.p(a9);
            y0Var.d(view.getRootView());
        }
        return a02;
    }

    public final int a() {
        return this.f2027a.j().f1008d;
    }

    public final int b() {
        return this.f2027a.j().f1005a;
    }

    public final int c() {
        return this.f2027a.j().f1007c;
    }

    public final int d() {
        return this.f2027a.j().f1006b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        return Objects.equals(this.f2027a, ((A0) obj).f2027a);
    }

    public final A0 f(int i, int i6, int i9, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        s0 r0Var = i11 >= 30 ? new r0(this) : i11 >= 29 ? new q0(this) : new p0(this);
        r0Var.g(G.e.b(i, i6, i9, i10));
        return r0Var.b();
    }

    public final WindowInsets g() {
        y0 y0Var = this.f2027a;
        if (y0Var instanceof t0) {
            return ((t0) y0Var).f2139c;
        }
        return null;
    }

    public final int hashCode() {
        y0 y0Var = this.f2027a;
        if (y0Var == null) {
            return 0;
        }
        return y0Var.hashCode();
    }

    public A0() {
        this.f2027a = new y0(this);
    }
}
