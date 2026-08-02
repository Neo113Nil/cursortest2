package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import defpackage.j5r;
import defpackage.jtc;
import defpackage.ktc;
import defpackage.nr7;
import defpackage.xq0;

/* loaded from: classes.dex */
public final class c extends j5r {
    public final d c;

    public c(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.j5r
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        f0 f0Var = this.c.a;
        View view = f0Var.c.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        f0Var.c(this);
        if (y.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + f0Var + " has been cancelled.");
        }
    }

    @Override // defpackage.j5r
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        d dVar = this.c;
        f0 f0Var = dVar.a;
        if (dVar.a()) {
            f0Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = f0Var.c.mView;
        context.getClass();
        jtc b = dVar.b(context);
        if (b == null) {
            xq0.q("Required value was null.");
            return;
        }
        Animation animation = (Animation) b.a;
        if (animation == null) {
            xq0.q("Required value was null.");
            return;
        }
        if (f0Var.a != 1) {
            view.startAnimation(animation);
            f0Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        ktc ktcVar = new ktc(animation, viewGroup, view);
        ktcVar.setAnimationListener(new nr7(f0Var, viewGroup, view, this));
        view.startAnimation(ktcVar);
        if (y.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + f0Var + " has started.");
        }
    }
}
