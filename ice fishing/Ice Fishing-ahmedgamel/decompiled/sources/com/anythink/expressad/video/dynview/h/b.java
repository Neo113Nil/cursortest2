package com.anythink.expressad.video.dynview.h;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import com.anythink.expressad.video.dynview.c;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: com.anythink.expressad.video.dynview.h.b$5, reason: invalid class name */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f21208a;

        public AnonymousClass5(View view) {
            this.f21208a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f21208a.getLayoutParams();
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f21208a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.h.b$6, reason: invalid class name */
    public class AnonymousClass6 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f21210a;

        public AnonymousClass6(View view) {
            this.f21210a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f21210a.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f21210a.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    private static void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view != null) {
            com.anythink.expressad.video.dynview.i.a.a.a().a(map, cVar, view);
        }
    }

    private static PropertyValuesHolder b(Property property) {
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.1f, 0.6f), Keyframe.ofFloat(0.2f, 0.6f), Keyframe.ofFloat(0.3f, 1.0f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(0.5f, 1.0f), Keyframe.ofFloat(0.6f, 1.0f), Keyframe.ofFloat(0.7f, 1.0f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(0.9f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f));
    }

    public static ObjectAnimator c(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, a(View.ROTATION, 2.0f)).setDuration(1000L);
        duration.setRepeatCount(-1);
        return duration;
    }

    public static void e(View view) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(500L);
        }
    }

    private static TranslateAnimation f(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(400L);
        view.setVisibility(0);
        return translateAnimation;
    }

    private static ObjectAnimator g(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, a(View.SCALE_X), a(View.SCALE_Y), a(View.ROTATION_X, 5.0f)).setDuration(com.anythink.basead.exoplayer.i.a.f7883f);
    }

    private static ObjectAnimator h(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, b(View.SCALE_X), b(View.SCALE_Y)).setDuration(com.anythink.basead.exoplayer.i.a.f7883f);
    }

    private static ObjectAnimator i(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, a(View.ROTATION, 2.0f)).setDuration(1000L);
    }

    public final void d(final View view) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(500L).setListener(new Animator.AnimatorListener() { // from class: com.anythink.expressad.video.dynview.h.b.1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    View view2 = view;
                    if (view2 == null || !(view2 instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) view2).removeAllViews();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    View view2 = view;
                    if (view2 == null || !(view2 instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) view2).removeAllViews();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    private void a(View view, long j6) {
        if (view == null) {
            return;
        }
        ValueAnimator ofInt = view.getLayoutParams().width == 0 ? ValueAnimator.ofInt(0, r2) : ValueAnimator.ofInt(r2, 0);
        ofInt.setDuration(j6);
        ofInt.addUpdateListener(new AnonymousClass5(view));
        ValueAnimator ofFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(j6);
        ofFloat.addUpdateListener(new AnonymousClass6(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    public static ObjectAnimator b(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, b(View.SCALE_X), b(View.SCALE_Y)).setDuration(com.anythink.basead.exoplayer.i.a.f7883f);
        duration.setRepeatCount(-1);
        return duration;
    }

    private void a(final List<View> list, int i, int i6, long j6) {
        ValueAnimator duration = ValueAnimator.ofInt(i, i6).setDuration(j6);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.h.b.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                List list2 = list;
                if (list2 == null || list2.size() <= 0) {
                    return;
                }
                for (View view : list) {
                    if (view != null) {
                        view.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                        view.requestLayout();
                    }
                }
            }
        });
        duration.start();
    }

    private void a(final View view, int i, int i6, int i9, int i10, long j6) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i6);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.h.b.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i9, i10);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.h.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofInt2);
        animatorSet.setDuration(j6);
        animatorSet.start();
    }

    private void a(View view, int i, long j6) {
        ValueAnimator ofInt;
        ValueAnimator ofFloat;
        if (view.getLayoutParams().width == 0) {
            ofInt = ValueAnimator.ofInt(0, i);
        } else {
            ofInt = ValueAnimator.ofInt(i, 0);
        }
        ofInt.setDuration(j6);
        ofInt.addUpdateListener(new AnonymousClass5(view));
        if (view.getLayoutParams().width == 0) {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        ofFloat.setDuration(j6);
        ofFloat.addUpdateListener(new AnonymousClass6(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    private static PropertyValuesHolder a(Property property) {
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.1f, 0.6f), Keyframe.ofFloat(0.2f, 0.8f), Keyframe.ofFloat(0.3f, 1.3f), Keyframe.ofFloat(0.4f, 0.8f), Keyframe.ofFloat(0.5f, 1.3f), Keyframe.ofFloat(0.6f, 0.9f), Keyframe.ofFloat(0.7f, 1.3f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(0.9f, 1.1f), Keyframe.ofFloat(1.0f, 1.0f));
    }

    private static PropertyValuesHolder a(Property property, float f3) {
        float f9 = (-2.0f) * f3;
        float f10 = f3 * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f9), Keyframe.ofFloat(0.2f, f9), Keyframe.ofFloat(0.3f, f10), Keyframe.ofFloat(0.4f, f9), Keyframe.ofFloat(0.5f, f10), Keyframe.ofFloat(0.6f, f9), Keyframe.ofFloat(0.7f, f10), Keyframe.ofFloat(0.8f, f9), Keyframe.ofFloat(0.9f, f10), Keyframe.ofFloat(1.0f, 0.0f));
    }

    public static ObjectAnimator a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, a(View.SCALE_X), a(View.SCALE_Y), a(View.ROTATION_X, 5.0f)).setDuration(com.anythink.basead.exoplayer.i.a.f7883f);
        duration.setRepeatCount(-1);
        return duration;
    }
}
