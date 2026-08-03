package h3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f2744b;

    /* renamed from: a, reason: collision with root package name */
    public final x0 f2745a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f2744b = w0.f2831s;
        } else if (i10 >= 30) {
            f2744b = u0.f2824r;
        } else {
            f2744b = x0.f2833b;
        }
    }

    public a1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f2745a = new w0(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f2745a = new v0(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f2745a = new u0(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f2745a = new t0(this, windowInsets);
        } else if (i10 >= 28) {
            this.f2745a = new s0(this, windowInsets);
        } else {
            this.f2745a = new r0(this, windowInsets);
        }
    }

    public static a3.b a(a3.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f194a - i10);
        int max2 = Math.max(0, bVar.f195b - i11);
        int max3 = Math.max(0, bVar.f196c - i12);
        int max4 = Math.max(0, bVar.f197d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : a3.b.b(max, max2, max3, max4);
    }

    public static a1 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        a1 a1Var = new a1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = w.f2829a;
            a1 a6 = r.a(view);
            x0 x0Var = a1Var.f2745a;
            x0Var.r(a6);
            x0Var.d(view.getRootView());
            x0Var.t(view.getWindowSystemUiVisibility());
        }
        return a1Var;
    }

    public final WindowInsets b() {
        x0 x0Var = this.f2745a;
        if (x0Var instanceof q0) {
            return ((q0) x0Var).f2814c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            return Objects.equals(this.f2745a, ((a1) obj).f2745a);
        }
        return false;
    }

    public final int hashCode() {
        x0 x0Var = this.f2745a;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.hashCode();
    }

    public a1() {
        this.f2745a = new x0(this);
    }
}
