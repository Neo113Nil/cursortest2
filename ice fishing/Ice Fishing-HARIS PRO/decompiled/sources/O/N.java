package O;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f756a;

    public N(View view) {
        this.f756a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f756a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f756a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f756a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(O o2) {
        View view = (View) this.f756a.get();
        if (view != null) {
            if (o2 != null) {
                view.animate().setListener(new B0.c(o2, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f756a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
