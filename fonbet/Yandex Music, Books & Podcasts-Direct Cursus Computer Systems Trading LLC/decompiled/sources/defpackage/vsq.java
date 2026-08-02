package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class vsq extends AnimatorListenerAdapter implements a8t {
    public final View a;
    public final View b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public int[] g;
    public float h;
    public float i;

    public vsq(View view, View view2, int i, int i2, float f, float f2) {
        this.a = view;
        this.b = view2;
        this.c = f;
        this.d = f2;
        this.e = i - eeh.b(view2.getTranslationX());
        this.f = i2 - eeh.b(view2.getTranslationY());
        Object tag = view.getTag(R.id.div_transition_position);
        int[] iArr = tag instanceof int[] ? (int[]) tag : null;
        this.g = iArr;
        if (iArr != null) {
            view.setTag(R.id.div_transition_position, null);
        }
    }

    @Override // defpackage.a8t
    public final void e(b8t b8tVar) {
        float f = this.c;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.d);
        b8tVar.H(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.g == null) {
            View view = this.b;
            this.g = new int[]{eeh.b(view.getTranslationX()) + this.e, eeh.b(view.getTranslationY()) + this.f};
        }
        this.a.setTag(R.id.div_transition_position, this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        View view = this.b;
        this.h = view.getTranslationX();
        this.i = view.getTranslationY();
        view.setTranslationX(this.c);
        view.setTranslationY(this.d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        float f = this.h;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.i);
    }

    @Override // defpackage.a8t
    public final void a() {
    }

    @Override // defpackage.a8t
    public final void c() {
    }

    @Override // defpackage.a8t
    public final void d(b8t b8tVar) {
    }

    @Override // defpackage.a8t
    public final void f(b8t b8tVar) {
    }
}
