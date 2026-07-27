package O;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.ads.C2561Fo;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C2561Fo f2275a;

    /* renamed from: b, reason: collision with root package name */
    public A0 f2276b;

    public i0(View view, C2561Fo c2561Fo) {
        A0 a02;
        this.f2275a = c2561Fo;
        WeakHashMap weakHashMap = X.f2240a;
        A0 a9 = M.a(view);
        if (a9 != null) {
            int i = Build.VERSION.SDK_INT;
            a02 = (i >= 30 ? new r0(a9) : i >= 29 ? new q0(a9) : new p0(a9)).b();
        } else {
            a02 = null;
        }
        this.f2276b = a02;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        y0 y0Var;
        if (!view.isLaidOut()) {
            this.f2276b = A0.h(view, windowInsets);
            return j0.i(view, windowInsets);
        }
        A0 h9 = A0.h(view, windowInsets);
        if (this.f2276b == null) {
            WeakHashMap weakHashMap = X.f2240a;
            this.f2276b = M.a(view);
        }
        if (this.f2276b == null) {
            this.f2276b = h9;
            return j0.i(view, windowInsets);
        }
        C2561Fo j9 = j0.j(view);
        if (j9 != null && Objects.equals((WindowInsets) j9.f25019v, windowInsets)) {
            return j0.i(view, windowInsets);
        }
        A0 a02 = this.f2276b;
        int i = 1;
        int i4 = 0;
        while (true) {
            y0Var = h9.f2213a;
            if (i > 256) {
                break;
            }
            if (!y0Var.f(i).equals(a02.f2213a.f(i))) {
                i4 |= i;
            }
            i <<= 1;
        }
        if (i4 == 0) {
            return j0.i(view, windowInsets);
        }
        A0 a03 = this.f2276b;
        n0 n0Var = new n0(i4, (i4 & 8) != 0 ? y0Var.f(8).f1154d > a03.f2213a.f(8).f1154d ? j0.f2277e : j0.f2278f : j0.f2279g, 160L);
        n0Var.f2300a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(n0Var.f2300a.a());
        G.e f6 = y0Var.f(i4);
        G.e f9 = a03.f2213a.f(i4);
        int min = Math.min(f6.f1151a, f9.f1151a);
        int i9 = f6.f1152b;
        int i10 = f9.f1152b;
        int min2 = Math.min(i9, i10);
        int i11 = f6.f1153c;
        int i12 = f9.f1153c;
        int min3 = Math.min(i11, i12);
        int i13 = f6.f1154d;
        int i14 = f9.f1154d;
        S0.e eVar = new S0.e(5, G.e.b(min, min2, min3, Math.min(i13, i14)), G.e.b(Math.max(f6.f1151a, f9.f1151a), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i14)));
        j0.f(view, windowInsets, false);
        duration.addUpdateListener(new h0(n0Var, h9, a03, i4, view));
        duration.addListener(new D0.j(n0Var, view, 2));
        ViewTreeObserverOnPreDrawListenerC0361x.a(view, new B2.z(view, n0Var, eVar, duration));
        this.f2276b = h9;
        return j0.i(view, windowInsets);
    }
}
