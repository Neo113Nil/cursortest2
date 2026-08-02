package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class u3c extends AnimatorListenerAdapter implements a8t {
    public final View a;
    public boolean b = false;

    public u3c(View view) {
        this.a = view;
    }

    @Override // defpackage.a8t
    public final void a() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? yhu.a.z(view) : 0.0f));
    }

    @Override // defpackage.a8t
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        yhu.a.H(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        aiu aiuVar = yhu.a;
        aiuVar.H(view, 1.0f);
        aiuVar.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.a8t
    public final void b(b8t b8tVar) {
    }

    @Override // defpackage.a8t
    public final void d(b8t b8tVar) {
    }

    @Override // defpackage.a8t
    public final void e(b8t b8tVar) {
    }

    @Override // defpackage.a8t
    public final void f(b8t b8tVar) {
    }
}
