package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.collection.SimpleArrayMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.math.MathUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.nfc.NfcTrackingEventsHolder;
import java.util.ArrayList;
import sqip.internal.CardImage;

@Deprecated
/* loaded from: classes4.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public float dependencyOriginalTranslationX;
    public float dependencyOriginalTranslationY;
    public final int[] tmpArray;
    public final Rect tmpRect;
    public final RectF tmpRectF1;
    public final RectF tmpRectF2;

    public FabTransformationBehavior() {
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }

    public static Pair calculateMotionTiming(float f, float f2, boolean z, Result result) {
        MotionTiming timing;
        MotionTiming timing2;
        if (f == RecyclerView.DECELERATION_RATE || f2 == RecyclerView.DECELERATION_RATE) {
            timing = ((MotionSpec) result.text).getTiming("translationXLinear");
            timing2 = ((MotionSpec) result.text).getTiming("translationYLinear");
        } else if ((!z || f2 >= RecyclerView.DECELERATION_RATE) && (z || f2 <= RecyclerView.DECELERATION_RATE)) {
            timing = ((MotionSpec) result.text).getTiming("translationXCurveDownwards");
            timing2 = ((MotionSpec) result.text).getTiming("translationYCurveDownwards");
        } else {
            timing = ((MotionSpec) result.text).getTiming("translationXCurveUpwards");
            timing2 = ((MotionSpec) result.text).getTiming("translationYCurveUpwards");
        }
        return new Pair(timing, timing2);
    }

    public static float calculateValueOfAnimationAtEndOfExpansion(Result result, MotionTiming motionTiming, float f) {
        long j = motionTiming.delay;
        long j2 = motionTiming.duration;
        MotionTiming timing = ((MotionSpec) result.text).getTiming("expansion");
        return AnimationUtils.lerp(f, RecyclerView.DECELERATION_RATE, motionTiming.getInterpolator().getInterpolation((((timing.delay + timing.duration) + 17) - j) / j2));
    }

    public final float calculateTranslationX(View view, View view2, Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        calculateWindowBounds(view, rectF);
        rectF.offset(this.dependencyOriginalTranslationX, this.dependencyOriginalTranslationY);
        RectF rectF2 = this.tmpRectF2;
        calculateWindowBounds(view2, rectF2);
        positioning.getClass();
        return (rectF2.centerX() - rectF.centerX()) + RecyclerView.DECELERATION_RATE;
    }

    public final float calculateTranslationY(View view, View view2, Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        calculateWindowBounds(view, rectF);
        rectF.offset(this.dependencyOriginalTranslationX, this.dependencyOriginalTranslationY);
        RectF rectF2 = this.tmpRectF2;
        calculateWindowBounds(view2, rectF2);
        positioning.getClass();
        return (rectF2.centerY() - rectF.centerY()) + RecyclerView.DECELERATION_RATE;
    }

    public final void calculateWindowBounds(View view, RectF rectF) {
        rectF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.tmpArray);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(View view, View view2) {
        int i;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((i = ((FloatingActionButton) view2).expandableWidgetHelper.zzb) == 0 || i == view.getId());
        }
        a$$ExternalSyntheticBUOutline0.m$1("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03a1 A[LOOP:0: B:61:0x039f->B:62:0x03a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        ArrayList arrayList;
        float f;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ArrayList arrayList2;
        boolean z3;
        AnimatorSet animatorSet;
        int i;
        int size;
        int i2;
        ObjectAnimator ofFloat4;
        ObjectAnimator ofInt;
        ObjectAnimator ofInt2;
        Result onCreateMotionSpec = onCreateMotionSpec(view2.getContext(), z);
        if (z) {
            this.dependencyOriginalTranslationX = view.getTranslationX();
            this.dependencyOriginalTranslationY = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        final int i3 = 0;
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, RecyclerView.DECELERATION_RATE);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((MotionSpec) onCreateMotionSpec.text).getTiming(CardImage.ELEVATION).apply(ofFloat);
        arrayList3.add(ofFloat);
        float calculateTranslationX = calculateTranslationX(view, view2, (Positioning) onCreateMotionSpec.resultMetadata);
        float calculateTranslationY = calculateTranslationY(view, view2, (Positioning) onCreateMotionSpec.resultMetadata);
        Pair calculateMotionTiming = calculateMotionTiming(calculateTranslationX, calculateTranslationY, z, onCreateMotionSpec);
        MotionTiming motionTiming = (MotionTiming) calculateMotionTiming.first;
        MotionTiming motionTiming2 = (MotionTiming) calculateMotionTiming.second;
        RectF rectF = this.tmpRectF2;
        Rect rect = this.tmpRect;
        RectF rectF2 = this.tmpRectF1;
        if (z) {
            f = 0.0f;
            if (!z2) {
                view2.setTranslationX(-calculateTranslationX);
                view2.setTranslationY(-calculateTranslationY);
            }
            arrayList = arrayList4;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, RecyclerView.DECELERATION_RATE);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, RecyclerView.DECELERATION_RATE);
            float calculateValueOfAnimationAtEndOfExpansion = calculateValueOfAnimationAtEndOfExpansion(onCreateMotionSpec, motionTiming, -calculateTranslationX);
            float calculateValueOfAnimationAtEndOfExpansion2 = calculateValueOfAnimationAtEndOfExpansion(onCreateMotionSpec, motionTiming2, -calculateTranslationY);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF2.set(rect);
            calculateWindowBounds(view2, rectF);
            rectF.offset(calculateValueOfAnimationAtEndOfExpansion, calculateValueOfAnimationAtEndOfExpansion2);
            rectF.intersect(rectF2);
            rectF2.set(rectF);
            ofFloat3 = ofFloat6;
            ofFloat2 = ofFloat5;
        } else {
            arrayList = arrayList4;
            f = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -calculateTranslationX);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -calculateTranslationY);
        }
        motionTiming.apply(ofFloat2);
        motionTiming2.apply(ofFloat3);
        arrayList3.add(ofFloat2);
        arrayList3.add(ofFloat3);
        float width = rectF2.width();
        float height = rectF2.height();
        float calculateTranslationX2 = calculateTranslationX(view, view2, (Positioning) onCreateMotionSpec.resultMetadata);
        float calculateTranslationY2 = calculateTranslationY(view, view2, (Positioning) onCreateMotionSpec.resultMetadata);
        Pair calculateMotionTiming2 = calculateMotionTiming(calculateTranslationX2, calculateTranslationY2, z, onCreateMotionSpec);
        MotionTiming motionTiming3 = (MotionTiming) calculateMotionTiming2.first;
        MotionTiming motionTiming4 = (MotionTiming) calculateMotionTiming2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            calculateTranslationX2 = this.dependencyOriginalTranslationX;
        }
        float f2 = calculateTranslationY2;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, calculateTranslationX2);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            f2 = this.dependencyOriginalTranslationY;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f2);
        motionTiming3.apply(ofFloat7);
        motionTiming4.apply(ofFloat8);
        arrayList3.add(ofFloat7);
        arrayList3.add(ofFloat8);
        boolean z4 = view2 instanceof CircularRevealWidget;
        if (z4 && (view instanceof ImageView)) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    ofInt2 = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0);
                } else {
                    ofInt2 = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255);
                }
                ofInt2.addUpdateListener(new TabLayout.AnonymousClass1(view2, 4));
                ((MotionSpec) onCreateMotionSpec.text).getTiming("iconFade").apply(ofInt2);
                arrayList3.add(ofInt2);
                Transition.AnonymousClass2 anonymousClass2 = new Transition.AnonymousClass2(5, circularRevealWidget, drawable);
                arrayList2 = arrayList;
                arrayList2.add(anonymousClass2);
                if (z4) {
                    z3 = z4;
                } else {
                    final CircularRevealWidget circularRevealWidget2 = (CircularRevealWidget) view2;
                    Positioning positioning = (Positioning) onCreateMotionSpec.resultMetadata;
                    calculateWindowBounds(view, rectF2);
                    rectF2.offset(this.dependencyOriginalTranslationX, this.dependencyOriginalTranslationY);
                    calculateWindowBounds(view2, rectF);
                    rectF.offset(-calculateTranslationX(view, view2, positioning), f);
                    float centerX = rectF2.centerX() - rectF.left;
                    Positioning positioning2 = (Positioning) onCreateMotionSpec.resultMetadata;
                    calculateWindowBounds(view, rectF2);
                    z3 = z4;
                    rectF2.offset(this.dependencyOriginalTranslationX, this.dependencyOriginalTranslationY);
                    calculateWindowBounds(view2, rectF);
                    rectF.offset(RecyclerView.DECELERATION_RATE, -calculateTranslationY(view, view2, positioning2));
                    float centerY = rectF2.centerY() - rectF.top;
                    ((FloatingActionButton) view).getMeasuredContentRect(rect);
                    float width2 = rect.width() / 2.0f;
                    MotionTiming timing = ((MotionSpec) onCreateMotionSpec.text).getTiming("expansion");
                    if (z) {
                        if (!z2) {
                            circularRevealWidget2.setRevealInfo(new CircularRevealWidget.RevealInfo(centerX, centerY, width2));
                        }
                        if (z2) {
                            width2 = circularRevealWidget2.getRevealInfo().radius;
                        }
                        animatorSet = NfcTrackingEventsHolder.createCircularReveal(circularRevealWidget2, centerX, centerY, MathUtils.distanceToFurthestCorner(centerX, centerY, width, height));
                        final int i4 = 1;
                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.circularreveal.CircularRevealCompat$1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                int i5 = i4;
                                CircularRevealWidget circularRevealWidget3 = circularRevealWidget2;
                                switch (i5) {
                                    case 0:
                                        circularRevealWidget3.destroyCircularRevealCache();
                                        break;
                                    default:
                                        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget3.getRevealInfo();
                                        revealInfo.radius = Float.MAX_VALUE;
                                        circularRevealWidget3.setRevealInfo(revealInfo);
                                        break;
                                }
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                                switch (i4) {
                                    case 0:
                                        circularRevealWidget2.buildCircularRevealCache();
                                        break;
                                    default:
                                        super.onAnimationStart(animator);
                                        break;
                                }
                            }
                        });
                        long j = timing.delay;
                        int i5 = (int) centerX;
                        int i6 = (int) centerY;
                        if (j > 0) {
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i5, i6, width2, width2);
                            createCircularReveal.setStartDelay(0L);
                            createCircularReveal.setDuration(j);
                            arrayList3.add(createCircularReveal);
                        }
                    } else {
                        float f3 = circularRevealWidget2.getRevealInfo().radius;
                        AnimatorSet createCircularReveal2 = NfcTrackingEventsHolder.createCircularReveal(circularRevealWidget2, centerX, centerY, width2);
                        long j2 = timing.delay;
                        int i7 = (int) centerX;
                        int i8 = (int) centerY;
                        if (j2 > 0) {
                            Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i7, i8, f3, f3);
                            createCircularReveal3.setStartDelay(0L);
                            createCircularReveal3.setDuration(j2);
                            arrayList3.add(createCircularReveal3);
                        }
                        long j3 = timing.delay;
                        long j4 = timing.duration;
                        SimpleArrayMap simpleArrayMap = ((MotionSpec) onCreateMotionSpec.text).timings;
                        int i9 = 0;
                        long j5 = 0;
                        for (int i10 = simpleArrayMap.size; i9 < i10; i10 = i10) {
                            MotionTiming motionTiming5 = (MotionTiming) simpleArrayMap.valueAt(i9);
                            j5 = Math.max(j5, motionTiming5.delay + motionTiming5.duration);
                            i9++;
                            simpleArrayMap = simpleArrayMap;
                        }
                        long j6 = j3 + j4;
                        if (j6 < j5) {
                            Animator createCircularReveal4 = ViewAnimationUtils.createCircularReveal(view2, i7, i8, width2, width2);
                            createCircularReveal4.setStartDelay(j6);
                            createCircularReveal4.setDuration(j5 - j6);
                            arrayList3.add(createCircularReveal4);
                        }
                        animatorSet = createCircularReveal2;
                    }
                    timing.apply(animatorSet);
                    arrayList3.add(animatorSet);
                    arrayList2.add(new AnimatorListenerAdapter() { // from class: com.google.android.material.circularreveal.CircularRevealCompat$1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            int i52 = i3;
                            CircularRevealWidget circularRevealWidget3 = circularRevealWidget2;
                            switch (i52) {
                                case 0:
                                    circularRevealWidget3.destroyCircularRevealCache();
                                    break;
                                default:
                                    CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget3.getRevealInfo();
                                    revealInfo.radius = Float.MAX_VALUE;
                                    circularRevealWidget3.setRevealInfo(revealInfo);
                                    break;
                            }
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            switch (i3) {
                                case 0:
                                    circularRevealWidget2.buildCircularRevealCache();
                                    break;
                                default:
                                    super.onAnimationStart(animator);
                                    break;
                            }
                        }
                    });
                }
                if (z3) {
                    CircularRevealWidget circularRevealWidget3 = (CircularRevealWidget) view2;
                    ColorStateList backgroundTintList = view.getBackgroundTintList();
                    int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
                    int i11 = 16777215 & colorForState;
                    if (z) {
                        if (!z2) {
                            circularRevealWidget3.setCircularRevealScrimColor(colorForState);
                        }
                        ofInt = ObjectAnimator.ofInt(circularRevealWidget3, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, i11);
                    } else {
                        ofInt = ObjectAnimator.ofInt(circularRevealWidget3, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, colorForState);
                    }
                    ofInt.setEvaluator(ArgbEvaluatorCompat.instance);
                    ((MotionSpec) onCreateMotionSpec.text).getTiming("color").apply(ofInt);
                    arrayList3.add(ofInt);
                }
                if (view2 instanceof ViewGroup) {
                    View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
                    ViewGroup viewGroup = null;
                    if (findViewById != null) {
                        if (findViewById instanceof ViewGroup) {
                            viewGroup = (ViewGroup) findViewById;
                        }
                    } else if ((view2 instanceof TransformationChildLayout) || (view2 instanceof TransformationChildCard)) {
                        View childAt = ((ViewGroup) view2).getChildAt(0);
                        if (childAt instanceof ViewGroup) {
                            viewGroup = (ViewGroup) childAt;
                        }
                    } else {
                        viewGroup = (ViewGroup) view2;
                    }
                    if (viewGroup != null) {
                        if (z) {
                            if (!z2) {
                                ChildrenAlphaProperty.CHILDREN_ALPHA.set(viewGroup, Float.valueOf(RecyclerView.DECELERATION_RATE));
                            }
                            i = 0;
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, ChildrenAlphaProperty.CHILDREN_ALPHA, 1.0f);
                        } else {
                            i = 0;
                            ofFloat4 = ObjectAnimator.ofFloat(viewGroup, ChildrenAlphaProperty.CHILDREN_ALPHA, RecyclerView.DECELERATION_RATE);
                        }
                        ((MotionSpec) onCreateMotionSpec.text).getTiming("contentFade").apply(ofFloat4);
                        arrayList3.add(ofFloat4);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        AnimatorSetCompat.playTogether(animatorSet2, arrayList3);
                        animatorSet2.addListener(new AnonymousClass1(z, view2, view));
                        size = arrayList2.size();
                        for (i2 = i; i2 < size; i2++) {
                            animatorSet2.addListener((Animator.AnimatorListener) arrayList2.get(i2));
                        }
                        return animatorSet2;
                    }
                }
                i = 0;
                AnimatorSet animatorSet22 = new AnimatorSet();
                AnimatorSetCompat.playTogether(animatorSet22, arrayList3);
                animatorSet22.addListener(new AnonymousClass1(z, view2, view));
                size = arrayList2.size();
                while (i2 < size) {
                }
                return animatorSet22;
            }
        }
        arrayList2 = arrayList;
        if (z4) {
        }
        if (z3) {
        }
        if (view2 instanceof ViewGroup) {
        }
        i = 0;
        AnimatorSet animatorSet222 = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet222, arrayList3);
        animatorSet222.addListener(new AnonymousClass1(z, view2, view));
        size = arrayList2.size();
        while (i2 < size) {
        }
        return animatorSet222;
    }

    public abstract Result onCreateMotionSpec(Context context, boolean z);

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$1, reason: invalid class name */
    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId = 1;
        public final /* synthetic */ Object val$child;
        public final /* synthetic */ Object val$dependency;
        public final /* synthetic */ boolean val$expanded;

        public AnonymousClass1(boolean z, View view, View view2) {
            this.val$expanded = z;
            this.val$child = view;
            this.val$dependency = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.val$child;
            Object obj2 = this.val$dependency;
            switch (i) {
                case 0:
                    View view = (View) obj2;
                    if (!this.val$expanded) {
                        ((View) obj).setVisibility(4);
                        view.setAlpha(1.0f);
                        view.setVisibility(0);
                        break;
                    }
                    break;
                default:
                    FloatingActionButtonImpl floatingActionButtonImpl = (FloatingActionButtonImpl) obj2;
                    floatingActionButtonImpl.animState = 0;
                    floatingActionButtonImpl.currentAnimator = null;
                    Result result = (Result) obj;
                    if (result != null) {
                        ((zzpc) result.text).onShown();
                        break;
                    }
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
            boolean z = this.val$expanded;
            Object obj = this.val$dependency;
            switch (i) {
                case 0:
                    View view = (View) obj;
                    if (z) {
                        ((View) this.val$child).setVisibility(0);
                        view.setAlpha(RecyclerView.DECELERATION_RATE);
                        view.setVisibility(4);
                        break;
                    }
                    break;
                default:
                    FloatingActionButtonImpl floatingActionButtonImpl = (FloatingActionButtonImpl) obj;
                    floatingActionButtonImpl.view.internalSetVisibility(0, z);
                    floatingActionButtonImpl.animState = 2;
                    floatingActionButtonImpl.currentAnimator = animator;
                    break;
            }
        }

        public AnonymousClass1(FloatingActionButtonImpl floatingActionButtonImpl, boolean z, Result result) {
            this.val$dependency = floatingActionButtonImpl;
            this.val$expanded = z;
            this.val$child = result;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }
}
