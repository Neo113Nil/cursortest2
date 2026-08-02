package O;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: b, reason: collision with root package name */
    public static final A0 f2114b;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f2115a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2114b = x0.f2239q;
        } else {
            f2114b = y0.f2240b;
        }
    }

    public A0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f2115a = new x0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f2115a = new w0(this, windowInsets);
        } else if (i >= 28) {
            this.f2115a = new v0(this, windowInsets);
        } else {
            this.f2115a = new u0(this, windowInsets);
        }
    }

    public static G.e e(G.e eVar, int i, int i4, int i6, int i9) {
        int max = Math.max(0, eVar.f1031a - i);
        int max2 = Math.max(0, eVar.f1032b - i4);
        int max3 = Math.max(0, eVar.f1033c - i6);
        int max4 = Math.max(0, eVar.f1034d - i9);
        return (max == i && max2 == i4 && max3 == i6 && max4 == i9) ? eVar : G.e.b(max, max2, max3, max4);
    }

    public static A0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        A0 a02 = new A0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = X.f2142a;
            A0 a9 = M.a(view);
            y0 y0Var = a02.f2115a;
            y0Var.p(a9);
            y0Var.d(view.getRootView());
        }
        return a02;
    }

    public final int a() {
        return this.f2115a.j().f1034d;
    }

    public final int b() {
        return this.f2115a.j().f1031a;
    }

    public final int c() {
        return this.f2115a.j().f1033c;
    }

    public final int d() {
        return this.f2115a.j().f1032b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        return Objects.equals(this.f2115a, ((A0) obj).f2115a);
    }

    public final A0 f(int i, int i4, int i6, int i9) {
        int i10 = Build.VERSION.SDK_INT;
        s0 r0Var = i10 >= 30 ? new r0(this) : i10 >= 29 ? new q0(this) : new p0(this);
        r0Var.g(G.e.b(i, i4, i6, i9));
        return r0Var.b();
    }

    public final WindowInsets g() {
        y0 y0Var = this.f2115a;
        if (y0Var instanceof t0) {
            return ((t0) y0Var).f2227c;
        }
        return null;
    }

    public final int hashCode() {
        y0 y0Var = this.f2115a;
        if (y0Var == null) {
            return 0;
        }
        return y0Var.hashCode();
    }

    public A0() {
        this.f2115a = new y0(this);
    }
}
