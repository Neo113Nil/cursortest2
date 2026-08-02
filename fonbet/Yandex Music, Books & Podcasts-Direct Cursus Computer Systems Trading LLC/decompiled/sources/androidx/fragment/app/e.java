package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.j5r;
import defpackage.jtc;
import defpackage.or7;
import defpackage.pr7;
import defpackage.qr7;
import defpackage.ri2;

/* loaded from: classes.dex */
public final class e extends j5r {
    public final d c;
    public AnimatorSet d;

    public e(d dVar) {
        this.c = dVar;
    }

    @Override // defpackage.j5r
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.d;
        f0 f0Var = this.c.a;
        if (animatorSet == null) {
            f0Var.c(this);
            return;
        }
        if (!f0Var.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            qr7.a.a(animatorSet);
        }
        if (y.M(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(f0Var);
            sb.append(" has been canceled");
            sb.append(f0Var.g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // defpackage.j5r
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        f0 f0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            f0Var.c(this);
            return;
        }
        animatorSet.start();
        if (y.M(2)) {
            Log.v("FragmentManager", "Animator from operation " + f0Var + " has started.");
        }
    }

    @Override // defpackage.j5r
    public final void d(ri2 ri2Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        f0 f0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            f0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !f0Var.c.mTransitioning) {
            return;
        }
        if (y.M(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + f0Var);
        }
        long a = pr7.a.a(animatorSet);
        long j = (long) (ri2Var.c * a);
        if (j == 0) {
            j = 1;
        }
        if (j == a) {
            j = a - 1;
        }
        if (y.M(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + f0Var);
        }
        qr7.a.b(animatorSet, j);
    }

    @Override // defpackage.j5r
    public final void e(ViewGroup viewGroup) {
        e eVar;
        viewGroup.getClass();
        d dVar = this.c;
        if (dVar.a()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        jtc b = dVar.b(context);
        this.d = b != null ? (AnimatorSet) b.b : null;
        f0 f0Var = dVar.a;
        o oVar = f0Var.c;
        boolean z = f0Var.a == 3;
        View view = oVar.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            eVar = this;
            animatorSet.addListener(new or7(viewGroup, view, z, f0Var, eVar));
        } else {
            eVar = this;
        }
        AnimatorSet animatorSet2 = eVar.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
