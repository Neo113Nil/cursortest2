package O;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class S implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0028d f764a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f765b;

    public S(View view, C0028d c0028d) {
        j0 j0Var;
        this.f764a = c0028d;
        WeakHashMap weakHashMap = K.f747a;
        j0 a2 = C.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            j0Var = (i >= 30 ? new a0(a2) : i >= 29 ? new Z(a2) : new Y(a2)).b();
        } else {
            j0Var = null;
        }
        this.f765b = j0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        h0 h0Var;
        if (!view.isLaidOut()) {
            this.f765b = j0.g(view, windowInsets);
            return T.i(view, windowInsets);
        }
        j0 g2 = j0.g(view, windowInsets);
        if (this.f765b == null) {
            WeakHashMap weakHashMap = K.f747a;
            this.f765b = C.a(view);
        }
        if (this.f765b == null) {
            this.f765b = g2;
            return T.i(view, windowInsets);
        }
        C0028d j = T.j(view);
        if (j != null && Objects.equals((WindowInsets) j.f797b, windowInsets)) {
            return T.i(view, windowInsets);
        }
        j0 j0Var = this.f765b;
        int i = 1;
        int i2 = 0;
        while (true) {
            h0Var = g2.f819a;
            if (i > 256) {
                break;
            }
            if (!h0Var.f(i).equals(j0Var.f819a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return T.i(view, windowInsets);
        }
        j0 j0Var2 = this.f765b;
        X x2 = new X(i2, (i2 & 8) != 0 ? h0Var.f(8).f264d > j0Var2.f819a.f(8).f264d ? T.e : T.f766f : T.f767g, 160L);
        x2.f776a.d(RecyclerView.f2111C0);
        ValueAnimator duration = ValueAnimator.ofFloat(RecyclerView.f2111C0, 1.0f).setDuration(x2.f776a.a());
        G.c f2 = h0Var.f(i2);
        G.c f3 = j0Var2.f819a.f(i2);
        int min = Math.min(f2.f261a, f3.f261a);
        int i3 = f2.f262b;
        int i4 = f3.f262b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.f263c;
        int i6 = f3.f263c;
        int min3 = Math.min(i5, i6);
        int i7 = f2.f264d;
        int i8 = i2;
        int i9 = f3.f264d;
        F.i iVar = new F.i(G.c.b(min, min2, min3, Math.min(i7, i9)), 3, G.c.b(Math.max(f2.f261a, f3.f261a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        T.f(view, windowInsets, false);
        duration.addUpdateListener(new P(x2, g2, j0Var2, i8, view));
        duration.addListener(new Q(x2, view));
        ViewTreeObserverOnPreDrawListenerC0041q.a(view, new L.m(view, x2, iVar, duration));
        this.f765b = g2;
        return T.i(view, windowInsets);
    }
}
