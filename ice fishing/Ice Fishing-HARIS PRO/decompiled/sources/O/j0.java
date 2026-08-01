package O;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f818b;

    /* renamed from: a, reason: collision with root package name */
    public final h0 f819a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f818b = g0.f807q;
        } else {
            f818b = h0.f815b;
        }
    }

    public j0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f819a = new g0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f819a = new f0(this, windowInsets);
        } else if (i >= 28) {
            this.f819a = new e0(this, windowInsets);
        } else {
            this.f819a = new d0(this, windowInsets);
        }
    }

    public static G.c e(G.c cVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, cVar.f261a - i);
        int max2 = Math.max(0, cVar.f262b - i2);
        int max3 = Math.max(0, cVar.f263c - i3);
        int max4 = Math.max(0, cVar.f264d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? cVar : G.c.b(max, max2, max3, max4);
    }

    public static j0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        j0 j0Var = new j0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = K.f747a;
            j0 a2 = C.a(view);
            h0 h0Var = j0Var.f819a;
            h0Var.p(a2);
            h0Var.d(view.getRootView());
        }
        return j0Var;
    }

    public final int a() {
        return this.f819a.j().f264d;
    }

    public final int b() {
        return this.f819a.j().f261a;
    }

    public final int c() {
        return this.f819a.j().f263c;
    }

    public final int d() {
        return this.f819a.j().f262b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        return Objects.equals(this.f819a, ((j0) obj).f819a);
    }

    public final WindowInsets f() {
        h0 h0Var = this.f819a;
        if (h0Var instanceof c0) {
            return ((c0) h0Var).f792c;
        }
        return null;
    }

    public final int hashCode() {
        h0 h0Var = this.f819a;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.hashCode();
    }

    public j0() {
        this.f819a = new h0(this);
    }
}
