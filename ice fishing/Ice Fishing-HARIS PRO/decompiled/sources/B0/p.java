package B0;

import O.B;
import O.K;
import O.j0;
import O.k0;
import O.m0;
import O.n0;
import a.AbstractC0078a;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f63a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f64b;

    /* renamed from: c, reason: collision with root package name */
    public Window f65c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f66d;

    public p(View view, j0 j0Var) {
        ColorStateList c2;
        this.f64b = j0Var;
        S0.g gVar = BottomSheetBehavior.A(view).i;
        if (gVar != null) {
            c2 = gVar.f1076a.f1064c;
        } else {
            WeakHashMap weakHashMap = K.f747a;
            c2 = B.c(view);
        }
        if (c2 != null) {
            this.f63a = Boolean.valueOf(AbstractC0078a.L(c2.getDefaultColor()));
            return;
        }
        ColorStateList C2 = AbstractC0078a.C(view.getBackground());
        Integer valueOf = C2 != null ? Integer.valueOf(C2.getDefaultColor()) : null;
        if (valueOf != null) {
            this.f63a = Boolean.valueOf(AbstractC0078a.L(valueOf.intValue()));
        } else {
            this.f63a = null;
        }
    }

    @Override // B0.h
    public final void a(View view) {
        d(view);
    }

    @Override // B0.h
    public final void b(View view) {
        d(view);
    }

    @Override // B0.h
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        j0 j0Var = this.f64b;
        if (top < j0Var.d()) {
            Window window = this.f65c;
            if (window != null) {
                Boolean bool = this.f63a;
                boolean booleanValue = bool == null ? this.f66d : bool.booleanValue();
                S0.e eVar = new S0.e(window.getDecorView(), 5);
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new n0(window, eVar) : i >= 30 ? new m0(window, eVar) : new k0(window, eVar)).a0(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), j0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f65c;
            if (window2 != null) {
                boolean z2 = this.f66d;
                S0.e eVar2 = new S0.e(window2.getDecorView(), 5);
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new n0(window2, eVar2) : i2 >= 30 ? new m0(window2, eVar2) : new k0(window2, eVar2)).a0(z2);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f65c == window) {
            return;
        }
        this.f65c = window;
        if (window != null) {
            S0.e eVar = new S0.e(window.getDecorView(), 5);
            int i = Build.VERSION.SDK_INT;
            this.f66d = (i >= 35 ? new n0(window, eVar) : i >= 30 ? new m0(window, eVar) : new k0(window, eVar)).K();
        }
    }
}
