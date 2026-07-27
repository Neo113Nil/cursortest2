package O;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: O.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330e0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2073a;

    public C0330e0(View view) {
        this.f2073a = new WeakReference(view);
    }

    public final void a(float f3) {
        View view = (View) this.f2073a.get();
        if (view != null) {
            view.animate().alpha(f3);
        }
    }

    public final void b() {
        View view = (View) this.f2073a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j6) {
        View view = (View) this.f2073a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
    }

    public final void d(f0 f0Var) {
        View view = (View) this.f2073a.get();
        if (view != null) {
            if (f0Var != null) {
                view.animate().setListener(new D0.j(f0Var, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f3) {
        View view = (View) this.f2073a.get();
        if (view != null) {
            view.animate().translationY(f3);
        }
    }
}
