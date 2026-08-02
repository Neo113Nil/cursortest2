package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import defpackage.ci;
import defpackage.sls;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class yoq0 {
    public final AnimatorSet a;

    public yoq0(final ListItemInputComponent listItemInputComponent, ListItemComponent listItemComponent, String str, final dnr dnrVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(100L);
        final ViewGroup viewGroup = (ViewGroup) ((ViewGroup) listItemComponent.getRootView()).requireViewById(x7h0.content_frame);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(hkh0.superapp_suggest_ai_assistant_message, viewGroup, false);
        viewGroup.addView(inflate);
        if (inflate == null) {
            ny61.t("rootView");
            throw null;
        }
        final RobotoTextView robotoTextView = (RobotoTextView) inflate;
        robotoTextView.setText(str);
        robotoTextView.setMaxWidth((int) (viewGroup.getWidth() * 0.8d));
        robotoTextView.measure(0, 0);
        int[] iArr = new int[2];
        listItemInputComponent.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = (viewGroup.getWidth() - tje.u(20, robotoTextView.getContext())) - robotoTextView.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = listItemComponent.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
        int u = tje.u(8, robotoTextView.getContext()) + listItemComponent.getHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        Path path = new Path();
        path.moveTo(i, i2);
        float f = width;
        float f2 = u;
        path.quadTo(f, ((i2 - u) * 0.8f) + f2, f, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(robotoTextView, (Property<RobotoTextView, Float>) View.X, (Property<RobotoTextView, Float>) View.Y, path);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(listItemInputComponent, (Property<ListItemInputComponent, Float>) property, 1.0f, 0.0f);
        ofFloat2.setDuration(100L);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(robotoTextView, PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, 1.0f), Keyframe.ofFloat(0.3f, 1.0f), Keyframe.ofFloat(0.6f, 0.0f)));
        ofPropertyValuesHolder.setDuration(600L);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(robotoTextView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.7f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.7f, 1.0f));
        ofPropertyValuesHolder2.setDuration(300L);
        ofPropertyValuesHolder2.setInterpolator(new FastOutSlowInInterpolator());
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(qje.t(xng0.bgFloating, robotoTextView.getContext())), Integer.valueOf(robotoTextView.getContext().getColor(mqg0.component_yellow_toxic)));
        ofObject.setDuration(600L);
        ofObject.addUpdateListener(new rge0(1, robotoTextView));
        animatorSet.playTogether(ofFloat2, ofFloat, ofPropertyValuesHolder, ofPropertyValuesHolder2, ofObject);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.suggest.impl.modals.SendMessageInstantlyAnimationDelegate$animation$lambda$0$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ViewGroup viewGroup2 = viewGroup;
                View view = robotoTextView;
                View view2 = listItemInputComponent;
                sls slsVar = dnrVar;
                viewGroup2.removeView(view);
                view2.setAlpha(1.0f);
                slsVar.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2 = viewGroup;
                View view = robotoTextView;
                View view2 = listItemInputComponent;
                sls slsVar = dnrVar;
                viewGroup2.removeView(view);
                view2.setAlpha(1.0f);
                slsVar.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                View view = robotoTextView;
                view.postDelayed(new ci(view, 4), 250L);
            }
        });
        animatorSet.start();
        this.a = animatorSet;
    }

    public final void a(final sls slsVar) {
        AnimatorSet animatorSet = this.a;
        if (animatorSet.isStarted()) {
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.suggest.impl.modals.SendMessageInstantlyAnimationDelegate$doOnEnd$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    sls.this.invoke();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        } else {
            slsVar.invoke();
        }
    }

    public final boolean b() {
        return this.a.isStarted();
    }
}
