package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public final class sb4 extends Transition {
    public static final mb4 c = new mb4(PointF.class, "position", 5);
    public final Rect a;
    public final boolean b;

    public sb4(Rect rect, boolean z) {
        this.a = rect;
        this.b = z;
    }

    public static void b(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if ("shared_cover".equals(view.getTransitionName())) {
            transitionValues.values.put("bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        }
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        b(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        b(transitionValues);
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator ofObject;
        if (transitionValues == null || transitionValues2 == null || !"shared_cover".equals(transitionValues2.view.getTransitionName())) {
            return null;
        }
        View view = transitionValues2.view;
        Rect rect = (Rect) transitionValues.values.get("bounds");
        Rect rect2 = (Rect) transitionValues2.values.get("bounds");
        Rect rect3 = this.a;
        boolean z = this.b;
        kb4 kb4Var = new kb4(this, view, rect, rect2, rect3, z);
        AnimatorSet animatorSet = new AnimatorSet();
        if (rect3 != null && z) {
            view.setClipBounds(new Rect(0, (int) ((rect3.top / rect.height()) * rect2.height()), rect2.width(), (int) (rect2.height() * (rect3.bottom / rect.height()))));
        }
        Path path = new Path();
        float width = rect.width() / rect2.width();
        float height = rect.height() / rect2.height();
        path.moveTo(width, height);
        path.lineTo(1.0f, 1.0f);
        view.setScaleX(width);
        view.setScaleY(height);
        ObjectAnimator ofObject2 = ObjectAnimator.ofObject(view, c, (TypeConverter) null, path);
        int width2 = rect.left - ((rect2.width() - rect.width()) / 2);
        int height2 = rect.top - ((rect2.height() - rect.height()) / 2);
        view.setTranslationX(width2 - view.getLeft());
        view.setTranslationY(height2 - view.getTop());
        float f = width2;
        float f2 = height2;
        Path path2 = getPathMotion().getPath(f, f2, rect2.left, rect2.top);
        if (z) {
            PointF pointF = new PointF(f, f2);
            ss2 ss2Var = new ss2("position", PointF.class);
            ss2Var.b = pointF;
            ofObject = ObjectAnimator.ofObject(view, ss2Var, (TypeConverter) null, path2);
        } else {
            ofObject = ObjectAnimator.ofObject(view, new rb4(new PointF(rect2.left, rect2.top), rect3), (TypeConverter) null, path2);
        }
        animatorSet.playTogether(ofObject2, ofObject);
        i4a i4aVar = new i4a();
        i4aVar.b = new n(9, kb4Var);
        animatorSet.addListener(i4aVar);
        return animatorSet;
    }
}
