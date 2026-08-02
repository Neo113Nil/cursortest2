package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class Slide extends Visibility {
    public static final AnonymousClass3 sCalculateBottom;
    public static final AnonymousClass1 sCalculateEnd;
    public static final AnonymousClass1 sCalculateLeft;
    public static final AnonymousClass1 sCalculateRight;
    public static final AnonymousClass1 sCalculateStart;
    public static final AnonymousClass3 sCalculateTop;
    public Styleable mSlideCalculator;
    public static final DecelerateInterpolator sDecelerate = new DecelerateInterpolator();
    public static final AccelerateInterpolator sAccelerate = new AccelerateInterpolator();

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.transition.Slide$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.transition.Slide$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.transition.Slide$3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.transition.Slide$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.transition.Slide$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.transition.Slide$3] */
    static {
        final int i = 0;
        sCalculateLeft = new Styleable() { // from class: androidx.transition.Slide.1
            @Override // androidx.transition.Styleable
            public final float getGoneX(View view, ViewGroup viewGroup) {
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        if (viewGroup.getLayoutDirection() != 1) {
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        break;
                    default:
                        if (viewGroup.getLayoutDirection() != 1) {
                            break;
                        } else {
                            break;
                        }
                }
                return view.getTranslationX() + viewGroup.getWidth();
            }
        };
        final int i2 = 1;
        sCalculateStart = new Styleable() { // from class: androidx.transition.Slide.1
            @Override // androidx.transition.Styleable
            public final float getGoneX(View view, ViewGroup viewGroup) {
                switch (i2) {
                    case 0:
                        break;
                    case 1:
                        if (viewGroup.getLayoutDirection() != 1) {
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        break;
                    default:
                        if (viewGroup.getLayoutDirection() != 1) {
                            break;
                        } else {
                            break;
                        }
                }
                return view.getTranslationX() + viewGroup.getWidth();
            }
        };
        final int i3 = 0;
        sCalculateTop = new Styleable() { // from class: androidx.transition.Slide.3
            @Override // androidx.transition.Styleable
            public final float getGoneY(View view, ViewGroup viewGroup) {
                switch (i3) {
                    case 0:
                        return view.getTranslationY() - viewGroup.getHeight();
                    default:
                        return view.getTranslationY() + viewGroup.getHeight();
                }
            }
        };
        final int i4 = 2;
        sCalculateRight = new Styleable() { // from class: androidx.transition.Slide.1
            @Override // androidx.transition.Styleable
            public final float getGoneX(View view, ViewGroup viewGroup) {
                switch (i4) {
                    case 0:
                        break;
                    case 1:
                        if (viewGroup.getLayoutDirection() != 1) {
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        break;
                    default:
                        if (viewGroup.getLayoutDirection() != 1) {
                            break;
                        } else {
                            break;
                        }
                }
                return view.getTranslationX() + viewGroup.getWidth();
            }
        };
        final int i5 = 3;
        sCalculateEnd = new Styleable() { // from class: androidx.transition.Slide.1
            @Override // androidx.transition.Styleable
            public final float getGoneX(View view, ViewGroup viewGroup) {
                switch (i5) {
                    case 0:
                        break;
                    case 1:
                        if (viewGroup.getLayoutDirection() != 1) {
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        break;
                    default:
                        if (viewGroup.getLayoutDirection() != 1) {
                            break;
                        } else {
                            break;
                        }
                }
                return view.getTranslationX() + viewGroup.getWidth();
            }
        };
        final int i6 = 1;
        sCalculateBottom = new Styleable() { // from class: androidx.transition.Slide.3
            @Override // androidx.transition.Styleable
            public final float getGoneY(View view, ViewGroup viewGroup) {
                switch (i6) {
                    case 0:
                        return view.getTranslationY() - viewGroup.getHeight();
                    default:
                        return view.getTranslationY() + viewGroup.getHeight();
                }
            }
        };
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSlideCalculator = sCalculateBottom;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.SLIDE);
        int namedInt = DimensionKt.getNamedInt(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        setSlideEdge(namedInt);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        Visibility.captureValues$2(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        Visibility.captureValues$2(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return Styleable.createAnimation(view, transitionValues2, iArr[0], iArr[1], this.mSlideCalculator.getGoneX(view, viewGroup), this.mSlideCalculator.getGoneY(view, viewGroup), translationX, translationY, sDecelerate, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:slide:screenPosition");
        return Styleable.createAnimation(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.mSlideCalculator.getGoneX(view, viewGroup), this.mSlideCalculator.getGoneY(view, viewGroup), sAccelerate, this);
    }

    public final void setSlideEdge(int i) {
        if (i == 3) {
            this.mSlideCalculator = sCalculateLeft;
        } else if (i == 5) {
            this.mSlideCalculator = sCalculateRight;
        } else if (i == 48) {
            this.mSlideCalculator = sCalculateTop;
        } else if (i == 80) {
            this.mSlideCalculator = sCalculateBottom;
        } else if (i == 8388611) {
            this.mSlideCalculator = sCalculateStart;
        } else {
            if (i != 8388613) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid slide direction");
                return;
            }
            this.mSlideCalculator = sCalculateEnd;
        }
        SidePropagation sidePropagation = new SidePropagation();
        sidePropagation.mSide = i;
        this.mPropagation = sidePropagation;
    }

    public Slide(int i) {
        this.mSlideCalculator = sCalculateBottom;
        setSlideEdge(i);
    }
}
