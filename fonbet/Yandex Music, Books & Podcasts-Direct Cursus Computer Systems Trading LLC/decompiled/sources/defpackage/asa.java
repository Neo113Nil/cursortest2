package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class asa extends ValueAnimator {
    public Animator.AnimatorListener a;
    public ValueAnimator.AnimatorUpdateListener b;
    public gn0[] c;
    public final ArrayList d = new ArrayList();

    public asa() {
        setFloatValues(0.0f, 1.0f);
        super.addUpdateListener(new hr2(7, this));
        super.addListener(new i4a(1, this));
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.a = animatorListener;
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b = animatorUpdateListener;
    }

    public final void b(Function1 function1) {
        function1.invoke(new csa(new o57(1, this, asa.class, "accumulate", "accumulate(Lcom/lightside/animations/AnimationActor;)V", 0, 11)));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        this.c = (gn0[]) this.d.toArray(new gn0[0]);
        super.start();
    }
}
