package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.ViewUtils;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ChangeBounds extends Transition {
    public final boolean mResizeClip;
    public static final String[] sTransitionProperties = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final ViewUtils.AnonymousClass1 TOP_LEFT_PROPERTY = new ViewUtils.AnonymousClass1(2, PointF.class, "topLeft");
    public static final ViewUtils.AnonymousClass1 BOTTOM_RIGHT_PROPERTY = new ViewUtils.AnonymousClass1(3, PointF.class, "bottomRight");
    public static final ViewUtils.AnonymousClass1 BOTTOM_RIGHT_ONLY_PROPERTY = new ViewUtils.AnonymousClass1(4, PointF.class, "bottomRight");
    public static final ViewUtils.AnonymousClass1 TOP_LEFT_ONLY_PROPERTY = new ViewUtils.AnonymousClass1(5, PointF.class, "topLeft");
    public static final ViewUtils.AnonymousClass1 POSITION_PROPERTY = new ViewUtils.AnonymousClass1(6, PointF.class, "position");
    public static final RectEvaluator sRectEvaluator = new RectEvaluator();

    public final class SuppressLayoutListener extends TransitionListenerAdapter {
        public boolean mCanceled = false;
        public final ViewGroup mParent;

        public SuppressLayoutListener(ViewGroup viewGroup) {
            this.mParent = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            this.mParent.suppressLayout(false);
            this.mCanceled = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            if (!this.mCanceled) {
                this.mParent.suppressLayout(false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionPause() {
            this.mParent.suppressLayout(false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionResume() {
            this.mParent.suppressLayout(true);
        }
    }

    public final class ViewBounds {
        public int mBottom;
        public int mBottomRightCalls;
        public int mLeft;
        public int mRight;
        public int mTop;
        public int mTopLeftCalls;
        public final View mView;

        public ViewBounds(View view) {
            this.mView = view;
        }
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mResizeClip = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.CHANGE_BOUNDS);
        boolean z = DimensionKt.hasAttribute((XmlResourceParser) attributeSet, "resizeClip") ? obtainStyledAttributes.getBoolean(0, false) : false;
        obtainStyledAttributes.recycle();
        this.mResizeClip = z;
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        Rect rect;
        captureValues(transitionValues);
        if (!this.mResizeClip || (rect = (Rect) transitionValues.view.getTag(R.id.transition_clip)) == null) {
            return;
        }
        transitionValues.values.put("android:changeBounds:clip", rect);
    }

    public final void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        HashMap hashMap = transitionValues.values;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
        if (this.mResizeClip) {
            hashMap.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r22v0, types: [androidx.transition.ChangeBounds, androidx.transition.Transition] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.animation.Animator[]] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.animation.Animator, android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        int i2;
        int i3;
        ObjectAnimator ofObject;
        int i4;
        Rect rect;
        ?? r4;
        ObjectAnimator objectAnimator;
        if (transitionValues == null) {
            return null;
        }
        HashMap hashMap = transitionValues.values;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap hashMap2 = transitionValues2.values;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.view;
        Rect rect2 = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i5 = rect2.left;
        int i6 = rect3.left;
        int i7 = rect2.top;
        int i8 = rect3.top;
        int i9 = rect2.right;
        int i10 = rect3.right;
        int i11 = rect2.bottom;
        int i12 = rect3.bottom;
        int i13 = i9 - i5;
        int i14 = i11 - i7;
        int i15 = i10 - i6;
        int i16 = i12 - i8;
        Rect rect4 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect5 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
            i = 0;
        } else {
            i = (i5 == i6 && i7 == i8) ? 0 : 1;
            if (i9 != i10 || i11 != i12) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        int i17 = i;
        if (i17 <= 0) {
            return null;
        }
        boolean z = this.mResizeClip;
        ViewUtils.AnonymousClass1 anonymousClass1 = POSITION_PROPERTY;
        if (z) {
            int max = i5 + Math.max(i13, i15);
            int max2 = i7 + Math.max(i14, i16);
            ViewUtils.AnonymousClass1 anonymousClass12 = ViewUtils.TRANSITION_ALPHA;
            view.setLeftTopRightBottom(i5, i7, max, max2);
            if (i5 == i6 && i7 == i8) {
                i2 = i11;
                i3 = i6;
                ofObject = null;
            } else {
                i2 = i11;
                i3 = i6;
                this.mPathMotion.getClass();
                ofObject = ObjectAnimator.ofObject(view, anonymousClass1, (TypeConverter) null, Transition.AnonymousClass1.getPath(i5, i7, i6, i8));
            }
            boolean z2 = rect4 == null;
            if (z2) {
                i4 = 0;
                rect = new Rect(0, 0, i13, i14);
            } else {
                i4 = 0;
                rect = rect4;
            }
            int i18 = rect5 == null ? 1 : i4;
            Rect rect6 = i18 != 0 ? new Rect(i4, i4, i15, i16) : rect5;
            if (rect.equals(rect6)) {
                r4 = 0;
            } else {
                view.setClipBounds(rect);
                ObjectAnimator ofObject2 = ObjectAnimator.ofObject(view, "clipBounds", sRectEvaluator, rect, rect6);
                ClipListener clipListener = new ClipListener(view, rect, z2, rect6, i18, i5, i7, i9, i2, i3, i8, i10, i12);
                ofObject2.addListener(clipListener);
                addListener(clipListener);
                r4 = ofObject2;
            }
            if (ofObject != null) {
                if (r4 == 0) {
                    objectAnimator = ofObject;
                } else {
                    ?? animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{ofObject, r4});
                    objectAnimator = animatorSet;
                }
            }
            objectAnimator = r4;
        } else {
            ViewUtils.AnonymousClass1 anonymousClass13 = ViewUtils.TRANSITION_ALPHA;
            view.setLeftTopRightBottom(i5, i7, i9, i11);
            if (i17 == 2) {
                if (i13 == i15 && i14 == i16) {
                    this.mPathMotion.getClass();
                    objectAnimator = ObjectAnimator.ofObject(view, anonymousClass1, (TypeConverter) null, Transition.AnonymousClass1.getPath(i5, i7, i6, i8));
                } else {
                    ViewBounds viewBounds = new ViewBounds(view);
                    this.mPathMotion.getClass();
                    ObjectAnimator ofObject3 = ObjectAnimator.ofObject(viewBounds, TOP_LEFT_PROPERTY, (TypeConverter) null, Transition.AnonymousClass1.getPath(i5, i7, i6, i8));
                    this.mPathMotion.getClass();
                    ObjectAnimator ofObject4 = ObjectAnimator.ofObject(viewBounds, BOTTOM_RIGHT_PROPERTY, (TypeConverter) null, Transition.AnonymousClass1.getPath(i9, i11, i10, i12));
                    r4 = new AnimatorSet();
                    r4.playTogether(ofObject3, ofObject4);
                    r4.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                        private final ViewBounds mViewBounds;

                        {
                            this.mViewBounds = viewBounds;
                        }
                    });
                    objectAnimator = r4;
                }
            } else if (i5 == i6 && i7 == i8) {
                this.mPathMotion.getClass();
                objectAnimator = ObjectAnimator.ofObject(view, BOTTOM_RIGHT_ONLY_PROPERTY, (TypeConverter) null, Transition.AnonymousClass1.getPath(i9, i11, i10, i12));
            } else {
                this.mPathMotion.getClass();
                objectAnimator = ObjectAnimator.ofObject(view, TOP_LEFT_ONLY_PROPERTY, (TypeConverter) null, Transition.AnonymousClass1.getPath(i5, i7, i6, i8));
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            viewGroup4.suppressLayout(true);
            getRootTransition().addListener(new SuppressLayoutListener(viewGroup4));
        }
        return objectAnimator;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public ChangeBounds() {
        this.mResizeClip = false;
    }

    public final class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final int mEndBottom;
        public final Rect mEndClip;
        public final boolean mEndClipIsNull;
        public final int mEndLeft;
        public final int mEndRight;
        public final int mEndTop;
        public boolean mIsCanceled;
        public final int mStartBottom;
        public final Rect mStartClip;
        public final boolean mStartClipIsNull;
        public final int mStartLeft;
        public final int mStartRight;
        public final int mStartTop;
        public final View mView;

        public ClipListener(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.mView = view;
            this.mStartClip = rect;
            this.mStartClipIsNull = z;
            this.mEndClip = rect2;
            this.mEndClipIsNull = z2;
            this.mStartLeft = i;
            this.mStartTop = i2;
            this.mStartRight = i3;
            this.mStartBottom = i4;
            this.mEndLeft = i5;
            this.mEndTop = i6;
            this.mEndRight = i7;
            this.mEndBottom = i8;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (this.mIsCanceled) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.mStartClipIsNull) {
                    rect = this.mStartClip;
                }
            } else if (!this.mEndClipIsNull) {
                rect = this.mEndClip;
            }
            View view = this.mView;
            view.setClipBounds(rect);
            if (z) {
                ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
                view.setLeftTopRightBottom(this.mStartLeft, this.mStartTop, this.mStartRight, this.mStartBottom);
            } else {
                ViewUtils.AnonymousClass1 anonymousClass12 = ViewUtils.TRANSITION_ALPHA;
                view.setLeftTopRightBottom(this.mEndLeft, this.mEndTop, this.mEndRight, this.mEndBottom);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            int i = this.mStartRight;
            int i2 = this.mStartLeft;
            int i3 = this.mEndRight;
            int i4 = this.mEndLeft;
            int max = Math.max(i - i2, i3 - i4);
            int i5 = this.mStartBottom;
            int i6 = this.mStartTop;
            int i7 = this.mEndBottom;
            int i8 = this.mEndTop;
            int max2 = Math.max(i5 - i6, i7 - i8);
            if (z) {
                i2 = i4;
            }
            if (z) {
                i6 = i8;
            }
            ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
            View view = this.mView;
            view.setLeftTopRightBottom(i2, i6, max + i2, max2 + i6);
            view.setClipBounds(z ? this.mEndClip : this.mStartClip);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            this.mIsCanceled = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause() {
            View view = this.mView;
            view.setTag(R.id.transition_clip, view.getClipBounds());
            view.setClipBounds(this.mEndClipIsNull ? null : this.mEndClip);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume() {
            View view = this.mView;
            Rect rect = (Rect) view.getTag(R.id.transition_clip);
            view.setTag(R.id.transition_clip, null);
            view.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
