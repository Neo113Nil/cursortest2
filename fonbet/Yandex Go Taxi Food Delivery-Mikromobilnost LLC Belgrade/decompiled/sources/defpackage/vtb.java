package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.sequences.b;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.design.CircleButtonsPanelComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes5.dex */
public final class vtb {
    public final CircleButtonsPanelComponent a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final OvershootInterpolator c = new OvershootInterpolator(1.5f);
    public amb1 d;
    public amb1 e;

    public vtb(CircleButtonsPanelComponent circleButtonsPanelComponent) {
        this.a = circleButtonsPanelComponent;
    }

    public static ValueAnimator d(float f, float f2, tls tlsVar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new nj2(1, tlsVar));
        return ofFloat;
    }

    public final void a(amb1 amb1Var) {
        View d = amb1Var.d();
        Pair a = amb1Var.a();
        float floatValue = ((Number) a.getFirst()).floatValue();
        float floatValue2 = ((Number) a.getSecond()).floatValue();
        Triple e = amb1Var.e();
        float floatValue3 = ((Number) e.getFirst()).floatValue();
        float floatValue4 = ((Number) e.getSecond()).floatValue();
        float floatValue5 = ((Number) e.getThird()).floatValue();
        Triple b = amb1Var.b();
        float floatValue6 = ((Number) b.getFirst()).floatValue();
        float floatValue7 = ((Number) b.getSecond()).floatValue();
        float floatValue8 = ((Number) b.getThird()).floatValue();
        ConcurrentHashMap concurrentHashMap = this.b;
        Animator animator = (Animator) concurrentHashMap.get(d);
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator d2 = d(floatValue6, floatValue3, new w29(d, 1));
        ValueAnimator d3 = d(floatValue7, floatValue4, new w29(d, 2));
        ValueAnimator d4 = d(floatValue8, floatValue5, new w29(d, 3));
        ValueAnimator d5 = d(floatValue, floatValue2, new w29(d, 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(d2, d3, d4, d5);
        animatorSet.setInterpolator(this.c);
        animatorSet.setDuration(500L);
        concurrentHashMap.put(d, animatorSet);
        animatorSet.addListener(new AnimUtils$AnimationEndListener(new d1(19, this, d, amb1Var)));
        animatorSet.start();
    }

    public final void b(View view, boolean z, boolean z2) {
        Object next;
        View view2;
        amb1 utbVar;
        CircleButtonsPanelComponent circleButtonsPanelComponent = this.a;
        t5r g = b.g(c.s(circleButtonsPanelComponent), new w29(view, 5));
        View view3 = null;
        if (z) {
            view2 = (View) b.j(g);
        } else {
            s5r s5rVar = new s5r(g);
            if (s5rVar.hasNext()) {
                next = s5rVar.next();
                while (s5rVar.hasNext()) {
                    next = s5rVar.next();
                }
            } else {
                next = null;
            }
            view2 = (View) next;
        }
        if (view2 != null && view2.getWidth() != 0 && view2.getHeight() != 0) {
            view3 = view2;
        }
        if (view3 == null) {
            return;
        }
        Triple triple = new Triple(Float.valueOf(view3.getX()), Float.valueOf(view3.getY()), Float.valueOf(view3.getZ() - 1.0f));
        if (z2) {
            utbVar = new ttb(view, triple);
        } else {
            circleButtonsPanelComponent.startViewTransition(view);
            utbVar = new utb(view, triple);
        }
        if (z) {
            amb1 amb1Var = this.d;
            if (amb1Var != null && (amb1Var instanceof utb)) {
                circleButtonsPanelComponent.endViewTransition(((utb) amb1Var).b);
            }
            this.d = utbVar;
            return;
        }
        amb1 amb1Var2 = this.e;
        if (amb1Var2 != null && (amb1Var2 instanceof utb)) {
            circleButtonsPanelComponent.endViewTransition(((utb) amb1Var2).b);
        }
        this.e = utbVar;
    }

    public final void c(sls slsVar) {
        CircleButtonsPanelComponent circleButtonsPanelComponent = this.a;
        rrq0 a = vrq0.a((wls) c.s(circleButtonsPanelComponent).b);
        while (a.hasNext()) {
            if (((View) a.next()).hasTransientState()) {
                circleButtonsPanelComponent.postDelayed(new l7a(6, this, slsVar), 500L);
                return;
            }
        }
        slsVar.invoke();
    }
}
