package O;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.ads.C2545Eo;
import com.google.android.gms.internal.ads.C2991bm;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C2545Eo f2089a;

    /* renamed from: b, reason: collision with root package name */
    public A0 f2090b;

    public i0(View view, C2545Eo c2545Eo) {
        A0 a02;
        this.f2089a = c2545Eo;
        WeakHashMap weakHashMap = X.f2054a;
        A0 a9 = M.a(view);
        if (a9 != null) {
            int i = Build.VERSION.SDK_INT;
            a02 = (i >= 30 ? new r0(a9) : i >= 29 ? new q0(a9) : new p0(a9)).b();
        } else {
            a02 = null;
        }
        this.f2090b = a02;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        y0 y0Var;
        if (!view.isLaidOut()) {
            this.f2090b = A0.h(view, windowInsets);
            return j0.i(view, windowInsets);
        }
        A0 h9 = A0.h(view, windowInsets);
        if (this.f2090b == null) {
            WeakHashMap weakHashMap = X.f2054a;
            this.f2090b = M.a(view);
        }
        if (this.f2090b == null) {
            this.f2090b = h9;
            return j0.i(view, windowInsets);
        }
        C2545Eo j6 = j0.j(view);
        if (j6 != null && Objects.equals((WindowInsets) j6.f24651v, windowInsets)) {
            return j0.i(view, windowInsets);
        }
        A0 a02 = this.f2090b;
        int i = 1;
        int i6 = 0;
        while (true) {
            y0Var = h9.f2027a;
            if (i > 256) {
                break;
            }
            if (!y0Var.f(i).equals(a02.f2027a.f(i))) {
                i6 |= i;
            }
            i <<= 1;
        }
        if (i6 == 0) {
            return j0.i(view, windowInsets);
        }
        A0 a03 = this.f2090b;
        n0 n0Var = new n0(i6, (i6 & 8) != 0 ? y0Var.f(8).f1008d > a03.f2027a.f(8).f1008d ? j0.f2091e : j0.f2092f : j0.f2093g, 160L);
        n0Var.f2114a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(n0Var.f2114a.a());
        G.e f3 = y0Var.f(i6);
        G.e f9 = a03.f2027a.f(i6);
        int min = Math.min(f3.f1005a, f9.f1005a);
        int i9 = f3.f1006b;
        int i10 = f9.f1006b;
        int min2 = Math.min(i9, i10);
        int i11 = f3.f1007c;
        int i12 = f9.f1007c;
        int min3 = Math.min(i11, i12);
        int i13 = f3.f1008d;
        int i14 = f9.f1008d;
        C2991bm c2991bm = new C2991bm(3, G.e.b(min, min2, min3, Math.min(i13, i14)), G.e.b(Math.max(f3.f1005a, f9.f1005a), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i14)));
        j0.f(view, windowInsets, false);
        duration.addUpdateListener(new h0(n0Var, h9, a03, i6, view));
        duration.addListener(new D0.j(n0Var, view, 2));
        ViewTreeObserverOnPreDrawListenerC0348x.a(view, new C2.y(view, n0Var, c2991bm, duration));
        this.f2090b = h9;
        return j0.i(view, windowInsets);
    }
}
