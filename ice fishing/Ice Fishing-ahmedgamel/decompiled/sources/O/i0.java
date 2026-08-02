package O;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.ads.C2582Fo;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C2582Fo f2177a;

    /* renamed from: b, reason: collision with root package name */
    public A0 f2178b;

    public i0(View view, C2582Fo c2582Fo) {
        A0 a02;
        this.f2177a = c2582Fo;
        WeakHashMap weakHashMap = X.f2142a;
        A0 a9 = M.a(view);
        if (a9 != null) {
            int i = Build.VERSION.SDK_INT;
            a02 = (i >= 30 ? new r0(a9) : i >= 29 ? new q0(a9) : new p0(a9)).b();
        } else {
            a02 = null;
        }
        this.f2178b = a02;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        y0 y0Var;
        if (!view.isLaidOut()) {
            this.f2178b = A0.h(view, windowInsets);
            return j0.i(view, windowInsets);
        }
        A0 h3 = A0.h(view, windowInsets);
        if (this.f2178b == null) {
            WeakHashMap weakHashMap = X.f2142a;
            this.f2178b = M.a(view);
        }
        if (this.f2178b == null) {
            this.f2178b = h3;
            return j0.i(view, windowInsets);
        }
        C2582Fo j6 = j0.j(view);
        if (j6 != null && Objects.equals((WindowInsets) j6.f25636v, windowInsets)) {
            return j0.i(view, windowInsets);
        }
        A0 a02 = this.f2178b;
        int i = 1;
        int i4 = 0;
        while (true) {
            y0Var = h3.f2115a;
            if (i > 256) {
                break;
            }
            if (!y0Var.f(i).equals(a02.f2115a.f(i))) {
                i4 |= i;
            }
            i <<= 1;
        }
        if (i4 == 0) {
            return j0.i(view, windowInsets);
        }
        A0 a03 = this.f2178b;
        n0 n0Var = new n0(i4, (i4 & 8) != 0 ? y0Var.f(8).f1034d > a03.f2115a.f(8).f1034d ? j0.f2179e : j0.f2180f : j0.f2181g, 160L);
        n0Var.f2202a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(n0Var.f2202a.a());
        G.e f2 = y0Var.f(i4);
        G.e f9 = a03.f2115a.f(i4);
        int min = Math.min(f2.f1031a, f9.f1031a);
        int i6 = f2.f1032b;
        int i9 = f9.f1032b;
        int min2 = Math.min(i6, i9);
        int i10 = f2.f1033c;
        int i11 = f9.f1033c;
        int min3 = Math.min(i10, i11);
        int i12 = f2.f1034d;
        int i13 = f9.f1034d;
        S0.c cVar = new S0.c(4, G.e.b(min, min2, min3, Math.min(i12, i13)), G.e.b(Math.max(f2.f1031a, f9.f1031a), Math.max(i6, i9), Math.max(i10, i11), Math.max(i12, i13)));
        j0.f(view, windowInsets, false);
        duration.addUpdateListener(new h0(n0Var, h3, a03, i4, view));
        duration.addListener(new D0.j(n0Var, view, 2));
        ViewTreeObserverOnPreDrawListenerC0353x.a(view, new E2.x(view, n0Var, cVar, duration));
        this.f2178b = h3;
        return j0.i(view, windowInsets);
    }
}
