package com.google.android.material.transformation;

import android.animation.Animator;
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
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.afi;
import defpackage.am4;
import defpackage.bm4;
import defpackage.ciq;
import defpackage.f7t;
import defpackage.fgq;
import defpackage.g7t;
import defpackage.ix0;
import defpackage.lj4;
import defpackage.npa;
import defpackage.nt0;
import defpackage.re3;
import defpackage.v2c;
import defpackage.vl4;
import defpackage.w2c;
import defpackage.wm0;
import defpackage.wxf;
import defpackage.x2c;
import defpackage.xk6;
import defpackage.xq0;
import defpackage.zhm;
import defpackage.zl4;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import ru.yandex.music.R;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private float dependencyOriginalTranslationX;
    private float dependencyOriginalTranslationY;
    private final int[] tmpArray;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;

    public FabTransformationBehavior() {
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }

    private ViewGroup calculateChildContentContainer(@NonNull View view) {
        View findViewById = view.findViewById(R.id.mtrl_child_content_container);
        return findViewById != null ? toViewGroupOrNull(findViewById) : ((view instanceof g7t) || (view instanceof f7t)) ? toViewGroupOrNull(((ViewGroup) view).getChildAt(0)) : toViewGroupOrNull(view);
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(@NonNull View view, @NonNull x2c x2cVar, @NonNull afi afiVar, @NonNull afi afiVar2, float f, float f2, float f3, float f4, @NonNull RectF rectF) {
        float calculateValueOfAnimationAtEndOfExpansion = calculateValueOfAnimationAtEndOfExpansion(x2cVar, afiVar, f, f3);
        float calculateValueOfAnimationAtEndOfExpansion2 = calculateValueOfAnimationAtEndOfExpansion(x2cVar, afiVar2, f2, f4);
        Rect rect = this.tmpRect;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.tmpRectF1;
        rectF2.set(rect);
        RectF rectF3 = this.tmpRectF2;
        calculateWindowBounds(view, rectF3);
        rectF3.offset(calculateValueOfAnimationAtEndOfExpansion, calculateValueOfAnimationAtEndOfExpansion2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void calculateDependencyWindowBounds(@NonNull View view, @NonNull RectF rectF) {
        calculateWindowBounds(view, rectF);
        rectF.offset(this.dependencyOriginalTranslationX, this.dependencyOriginalTranslationY);
    }

    @NonNull
    private Pair<afi, afi> calculateMotionTiming(float f, float f2, boolean z, @NonNull x2c x2cVar) {
        afi f3;
        afi f4;
        if (f == 0.0f || f2 == 0.0f) {
            f3 = x2cVar.a.f("translationXLinear");
            f4 = x2cVar.a.f("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            f3 = x2cVar.a.f("translationXCurveDownwards");
            f4 = x2cVar.a.f("translationYCurveDownwards");
        } else {
            f3 = x2cVar.a.f("translationXCurveUpwards");
            f4 = x2cVar.a.f("translationYCurveUpwards");
        }
        return new Pair<>(f3, f4);
    }

    private float calculateRevealCenterX(@NonNull View view, @NonNull View view2, @NonNull zhm zhmVar) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        rectF2.offset(-calculateTranslationX(view, view2, zhmVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float calculateRevealCenterY(@NonNull View view, @NonNull View view2, @NonNull zhm zhmVar) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        rectF2.offset(0.0f, -calculateTranslationY(view, view2, zhmVar));
        return rectF.centerY() - rectF2.top;
    }

    private float calculateTranslationX(@NonNull View view, @NonNull View view2, @NonNull zhm zhmVar) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        zhmVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    private float calculateTranslationY(@NonNull View view, @NonNull View view2, @NonNull zhm zhmVar) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        zhmVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    private float calculateValueOfAnimationAtEndOfExpansion(@NonNull x2c x2cVar, @NonNull afi afiVar, float f, float f2) {
        long j = afiVar.a;
        long j2 = afiVar.b;
        afi f3 = x2cVar.a.f("expansion");
        return wm0.a(f, f2, afiVar.b().getInterpolation((((f3.a + f3.b) + 17) - j) / j2));
    }

    private void calculateWindowBounds(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.tmpArray);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void createChildrenFadeAnimation(View view, View view2, boolean z, boolean z2, @NonNull x2c x2cVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup calculateChildContentContainer;
        ObjectAnimator ofFloat;
        if ((view2 instanceof ViewGroup) && (calculateChildContentContainer = calculateChildContentContainer(view2)) != null) {
            if (z) {
                if (!z2) {
                    lj4.a.set(calculateChildContentContainer, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(calculateChildContentContainer, lj4.a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(calculateChildContentContainer, lj4.a, 0.0f);
            }
            x2cVar.a.f("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createColorAnimation(@NonNull View view, View view2, boolean z, boolean z2, @NonNull x2c x2cVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof bm4) {
            bm4 bm4Var = (bm4) view2;
            int backgroundTint = getBackgroundTint(view);
            int i = 16777215 & backgroundTint;
            if (z) {
                if (!z2) {
                    bm4Var.setCircularRevealScrimColor(backgroundTint);
                }
                ofInt = ObjectAnimator.ofInt(bm4Var, zl4.a, i);
            } else {
                ofInt = ObjectAnimator.ofInt(bm4Var, zl4.a, backgroundTint);
            }
            ofInt.setEvaluator(ix0.a);
            x2cVar.a.f("color").a(ofInt);
            list.add(ofInt);
        }
    }

    private void createDependencyTranslationAnimation(@NonNull View view, @NonNull View view2, boolean z, @NonNull x2c x2cVar, @NonNull List<Animator> list) {
        float calculateTranslationX = calculateTranslationX(view, view2, x2cVar.b);
        float calculateTranslationY = calculateTranslationY(view, view2, x2cVar.b);
        Pair<afi, afi> calculateMotionTiming = calculateMotionTiming(calculateTranslationX, calculateTranslationY, z, x2cVar);
        afi afiVar = (afi) calculateMotionTiming.first;
        afi afiVar2 = (afi) calculateMotionTiming.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            calculateTranslationX = this.dependencyOriginalTranslationX;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, calculateTranslationX);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            calculateTranslationY = this.dependencyOriginalTranslationY;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, calculateTranslationY);
        afiVar.a(ofFloat);
        afiVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void createElevationAnimation(View view, @NonNull View view2, boolean z, boolean z2, @NonNull x2c x2cVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        x2cVar.a.f("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createExpansionAnimation(@NonNull View view, View view2, boolean z, boolean z2, @NonNull x2c x2cVar, float f, float f2, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        AnimatorSet animatorSet;
        if (view2 instanceof bm4) {
            bm4 bm4Var = (bm4) view2;
            float calculateRevealCenterX = calculateRevealCenterX(view, view2, x2cVar.b);
            float calculateRevealCenterY = calculateRevealCenterY(view, view2, x2cVar.b);
            ((FloatingActionButton) view).f(this.tmpRect);
            float width = this.tmpRect.width() / 2.0f;
            afi f3 = x2cVar.a.f("expansion");
            if (z) {
                if (!z2) {
                    bm4Var.setRevealInfo(new am4(calculateRevealCenterX, calculateRevealCenterY, width));
                }
                if (z2) {
                    width = bm4Var.getRevealInfo().c;
                }
                animatorSet = nt0.v(bm4Var, calculateRevealCenterX, calculateRevealCenterY, wxf.t(calculateRevealCenterX, calculateRevealCenterY, f, f2));
                animatorSet.addListener(new vl4(bm4Var, 1));
                createPreFillRadialExpansion(view2, f3.a, (int) calculateRevealCenterX, (int) calculateRevealCenterY, width, list);
            } else {
                float f4 = bm4Var.getRevealInfo().c;
                AnimatorSet v = nt0.v(bm4Var, calculateRevealCenterX, calculateRevealCenterY, width);
                int i = (int) calculateRevealCenterX;
                int i2 = (int) calculateRevealCenterY;
                createPreFillRadialExpansion(view2, f3.a, i, i2, f4, list);
                long j = f3.a;
                int i3 = i;
                long j2 = f3.b;
                ciq ciqVar = x2cVar.a.a;
                long j3 = 0;
                int i4 = 0;
                for (int i5 = ciqVar.c; i4 < i5; i5 = i5) {
                    afi afiVar = (afi) ciqVar.j(i4);
                    j3 = Math.max(j3, afiVar.a + afiVar.b);
                    i4++;
                    i3 = i3;
                }
                createPostFillRadialExpansion(view2, j, j2, j3, i3, i2, width, list);
                animatorSet = v;
            }
            f3.a(animatorSet);
            list.add(animatorSet);
            list2.add(new vl4(bm4Var, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createIconFadeAnimation(View view, View view2, boolean z, boolean z2, @NonNull x2c x2cVar, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof bm4) && (view instanceof ImageView)) {
            bm4 bm4Var = (bm4) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                }
                ofInt = ObjectAnimator.ofInt(drawable, npa.a, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, npa.a, KotlinVersion.MAX_COMPONENT_VALUE);
            }
            ofInt.addUpdateListener(new re3(2, view2));
            x2cVar.a.f("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new w2c(0, bm4Var, drawable));
        }
    }

    private void createPostFillRadialExpansion(View view, long j, long j2, long j3, int i, int i2, float f, @NonNull List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    private void createPreFillRadialExpansion(View view, long j, int i, int i2, float f, @NonNull List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void createTranslationAnimation(@NonNull View view, @NonNull View view2, boolean z, boolean z2, @NonNull x2c x2cVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        afi afiVar;
        afi afiVar2;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float calculateTranslationX = calculateTranslationX(view, view2, x2cVar.b);
        float calculateTranslationY = calculateTranslationY(view, view2, x2cVar.b);
        Pair<afi, afi> calculateMotionTiming = calculateMotionTiming(calculateTranslationX, calculateTranslationY, z, x2cVar);
        afi afiVar3 = (afi) calculateMotionTiming.first;
        afi afiVar4 = (afi) calculateMotionTiming.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-calculateTranslationX);
                view2.setTranslationY(-calculateTranslationY);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            afiVar = afiVar4;
            afiVar2 = afiVar3;
            calculateChildVisibleBoundsAtEndOfExpansion(view2, x2cVar, afiVar2, afiVar, -calculateTranslationX, -calculateTranslationY, 0.0f, 0.0f, rectF);
        } else {
            afiVar = afiVar4;
            afiVar2 = afiVar3;
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -calculateTranslationX);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -calculateTranslationY);
        }
        afiVar2.a(ofFloat);
        afiVar.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int getBackgroundTint(@NonNull View view) {
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup toViewGroupOrNull(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.uk6
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            xq0.q("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
            return false;
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // defpackage.uk6
    public void onAttachedToLayoutParams(@NonNull xk6 xk6Var) {
        if (xk6Var.h == 0) {
            xk6Var.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet onCreateExpandedStateChangeAnimation(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        x2c onCreateMotionSpec = onCreateMotionSpec(view2.getContext(), z);
        if (z) {
            this.dependencyOriginalTranslationX = view.getTranslationX();
            this.dependencyOriginalTranslationY = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        createElevationAnimation(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2);
        RectF rectF = this.tmpRectF1;
        createTranslationAnimation(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        createDependencyTranslationAnimation(view, view2, z, onCreateMotionSpec, arrayList);
        createIconFadeAnimation(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2);
        createExpansionAnimation(view, view2, z, z2, onCreateMotionSpec, width, height, arrayList, arrayList2);
        createColorAnimation(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2);
        createChildrenFadeAnimation(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        fgq.C(animatorSet, arrayList);
        animatorSet.addListener(new v2c(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public abstract x2c onCreateMotionSpec(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }
}
