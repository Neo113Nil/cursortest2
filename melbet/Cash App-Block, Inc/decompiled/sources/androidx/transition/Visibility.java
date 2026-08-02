package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.RendererHolder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.transition.ViewUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class Visibility extends Transition {
    public static final String[] sTransitionProperties = {"android:visibility:visibility", "android:visibility:parent"};
    public int mMode;

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.VISIBILITY_TRANSITION);
        int namedInt = DimensionKt.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (namedInt != 0) {
            setMode(namedInt);
        }
    }

    public static void captureValues$2(TransitionValues transitionValues) {
        View view = transitionValues.view;
        int visibility = view.getVisibility();
        HashMap hashMap = transitionValues.values;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RendererHolder getVisibilityChangeInfo(TransitionValues transitionValues, TransitionValues transitionValues2) {
        RendererHolder rendererHolder = new RendererHolder();
        rendererHolder.primaryRequiresReset = false;
        rendererHolder.secondaryRequiresReset = false;
        if (transitionValues != null) {
            HashMap hashMap = transitionValues.values;
            if (hashMap.containsKey("android:visibility:visibility")) {
                rendererHolder.index = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                rendererHolder.primaryRenderer = (ViewGroup) hashMap.get("android:visibility:parent");
                if (transitionValues2 != null) {
                    HashMap hashMap2 = transitionValues2.values;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        rendererHolder.prewarmingState = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        rendererHolder.secondaryRenderer = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (transitionValues == null && transitionValues2 != null) {
                            int i = rendererHolder.index;
                            int i2 = rendererHolder.prewarmingState;
                            if (i != i2 || ((ViewGroup) rendererHolder.primaryRenderer) != ((ViewGroup) rendererHolder.secondaryRenderer)) {
                                if (i != i2) {
                                    if (i == 0) {
                                        rendererHolder.secondaryRequiresReset = false;
                                        rendererHolder.primaryRequiresReset = true;
                                        return rendererHolder;
                                    }
                                    if (i2 == 0) {
                                        rendererHolder.secondaryRequiresReset = true;
                                        rendererHolder.primaryRequiresReset = true;
                                        return rendererHolder;
                                    }
                                } else {
                                    if (((ViewGroup) rendererHolder.secondaryRenderer) == null) {
                                        rendererHolder.secondaryRequiresReset = false;
                                        rendererHolder.primaryRequiresReset = true;
                                        return rendererHolder;
                                    }
                                    if (((ViewGroup) rendererHolder.primaryRenderer) == null) {
                                        rendererHolder.secondaryRequiresReset = true;
                                        rendererHolder.primaryRequiresReset = true;
                                        return rendererHolder;
                                    }
                                }
                            }
                        } else {
                            if (transitionValues != null && rendererHolder.prewarmingState == 0) {
                                rendererHolder.secondaryRequiresReset = true;
                                rendererHolder.primaryRequiresReset = true;
                                return rendererHolder;
                            }
                            if (transitionValues2 == null && rendererHolder.index == 0) {
                                rendererHolder.secondaryRequiresReset = false;
                                rendererHolder.primaryRequiresReset = true;
                            }
                        }
                        return rendererHolder;
                    }
                }
                rendererHolder.prewarmingState = -1;
                rendererHolder.secondaryRenderer = null;
                if (transitionValues == null) {
                }
                if (transitionValues != null) {
                }
                if (transitionValues2 == null) {
                    rendererHolder.secondaryRequiresReset = false;
                    rendererHolder.primaryRequiresReset = true;
                }
                return rendererHolder;
            }
        }
        rendererHolder.index = -1;
        rendererHolder.primaryRenderer = null;
        if (transitionValues2 != null) {
        }
        rendererHolder.prewarmingState = -1;
        rendererHolder.secondaryRenderer = null;
        if (transitionValues == null) {
        }
        if (transitionValues != null) {
        }
        if (transitionValues2 == null) {
        }
        return rendererHolder;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues$2(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        captureValues$2(transitionValues);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (getVisibilityChangeInfo(getMatchedTransitionValues(r5, false), getTransitionValues(r5, false)).primaryRequiresReset != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z;
        View view;
        int i;
        char c;
        int i2;
        View view2;
        Animator animator;
        View view3;
        boolean z2;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmap;
        RendererHolder visibilityChangeInfo = getVisibilityChangeInfo(transitionValues, transitionValues2);
        if (visibilityChangeInfo.primaryRequiresReset && (((ViewGroup) visibilityChangeInfo.primaryRenderer) != null || ((ViewGroup) visibilityChangeInfo.secondaryRenderer) != null)) {
            int i4 = 1;
            if (!visibilityChangeInfo.secondaryRequiresReset) {
                int i5 = visibilityChangeInfo.prewarmingState;
                if ((this.mMode & 2) == 2 && transitionValues != null) {
                    View view4 = transitionValues.view;
                    View view5 = transitionValues2 != null ? transitionValues2.view : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i5;
                        c = 1;
                        i2 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z = false;
                                view = null;
                                if (z) {
                                    if (view4.getParent() == null) {
                                        i = i5;
                                        c = 1;
                                        i4 = 0;
                                        i2 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        if (getVisibilityChangeInfo(getTransitionValues(view7, true), getMatchedTransitionValues(view7, true)).primaryRequiresReset) {
                                            i = i5;
                                            c = 1;
                                            i2 = 0;
                                            view2 = view;
                                            animator = null;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i4 = i2;
                                            view3 = view2;
                                        } else {
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
                                            view4.transformMatrixToGlobal(matrix);
                                            viewGroup.transformMatrixToLocal(matrix);
                                            animator = null;
                                            RectF rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, view4.getWidth(), view4.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            int round3 = Math.round(rectF.right);
                                            c = 1;
                                            int round4 = Math.round(rectF.bottom);
                                            i2 = 0;
                                            ImageView imageView = new ImageView(view4.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view4.isAttachedToWindow();
                                            boolean isAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z2 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i3 = 0;
                                            } else if (isAttachedToWindow2) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                ViewCompat.addOverlayView(view4, viewGroup);
                                                z2 = isAttachedToWindow;
                                                i3 = indexOfChild;
                                            } else {
                                                i = i5;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i4 = i2;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i = i5;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                Picture picture = new Picture();
                                                Canvas beginRecording = picture.beginRecording(round7, round8);
                                                beginRecording.concat(matrix);
                                                view4.draw(beginRecording);
                                                picture.endRecording();
                                                bitmap = Bitmap.createBitmap(picture);
                                            }
                                            if (!z2) {
                                                viewGroup.getOverlay().remove(view4);
                                                viewGroup2.addView(view4, i3);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i4 = i2;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i5;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i4 = i2;
                                view3 = view2;
                            }
                        } else if (i5 == 4 || view4 == view5) {
                            z = false;
                            view = view5;
                            view5 = null;
                            if (z) {
                            }
                            i = i5;
                            c = 1;
                            i2 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i4 = i2;
                            view3 = view2;
                        }
                        z = true;
                        view5 = null;
                        view = null;
                        if (z) {
                        }
                        i = i5;
                        c = 1;
                        i2 = 0;
                        view2 = view;
                        animator = null;
                        view6 = view5;
                        i4 = i2;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        ViewUtils.AnonymousClass1 anonymousClass12 = ViewUtils.TRANSITION_ALPHA;
                        view3.setTransitionVisibility(i2);
                        Animator onDisappear = onDisappear(viewGroup, view3, transitionValues, transitionValues2);
                        if (onDisappear == null) {
                            view3.setTransitionVisibility(visibility);
                            return onDisappear;
                        }
                        DisappearListener disappearListener = new DisappearListener(view3, i);
                        onDisappear.addListener(disappearListener);
                        getRootTransition().addListener(disappearListener);
                        return onDisappear;
                    }
                    if (i4 == 0) {
                        int[] iArr = (int[]) transitionValues.values.get("android:visibility:screenLocation");
                        int i6 = iArr[i2];
                        int i7 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i6 - iArr2[i2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i7 - iArr2[c]) - view6.getTop());
                        ViewCompat.addOverlayView(view6, viewGroup);
                    }
                    Animator onDisappear2 = onDisappear(viewGroup, view6, transitionValues, transitionValues2);
                    if (i4 == 0) {
                        if (onDisappear2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return onDisappear2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        OverlayListener overlayListener = new OverlayListener(viewGroup, view6, view4);
                        onDisappear2.addListener(overlayListener);
                        onDisappear2.addPauseListener(overlayListener);
                        getRootTransition().addListener(overlayListener);
                    }
                    return onDisappear2;
                }
            } else if ((this.mMode & 1) == 1 && transitionValues2 != null) {
                View view8 = transitionValues2.view;
                if (transitionValues == null) {
                    View view9 = (View) view8.getParent();
                }
                return onAppear(viewGroup, view8, transitionValues, transitionValues2);
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public final boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.values.containsKey("android:visibility:visibility") != transitionValues.values.containsKey("android:visibility:visibility")) {
            return false;
        }
        RendererHolder visibilityChangeInfo = getVisibilityChangeInfo(transitionValues, transitionValues2);
        if (visibilityChangeInfo.primaryRequiresReset) {
            return visibilityChangeInfo.index == 0 || visibilityChangeInfo.prewarmingState == 0;
        }
        return false;
    }

    public abstract Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2);

    public abstract Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2);

    public final void setMode(int i) {
        if ((i & (-4)) == 0) {
            this.mMode = i;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    public final class OverlayListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public boolean mHasOverlay = true;
        public final ViewGroup mOverlayHost;
        public final View mOverlayView;
        public final View mStartView;

        public OverlayListener(ViewGroup viewGroup, View view, View view2) {
            this.mOverlayHost = viewGroup;
            this.mOverlayView = view;
            this.mStartView = view2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            removeFromOverlay();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.mOverlayHost.getOverlay().remove(this.mOverlayView);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.mOverlayView;
            if (view.getParent() == null) {
                ViewCompat.addOverlayView(view, this.mOverlayHost);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                View view = this.mStartView;
                View view2 = this.mOverlayView;
                view.setTag(R.id.save_overlay_view, view2);
                ViewCompat.addOverlayView(view2, this.mOverlayHost);
                this.mHasOverlay = true;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            if (this.mHasOverlay) {
                removeFromOverlay();
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause() {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume() {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        public final void removeFromOverlay() {
            this.mStartView.setTag(R.id.save_overlay_view, null);
            this.mOverlayHost.getOverlay().remove(this.mOverlayView);
            this.mHasOverlay = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            removeFromOverlay();
        }
    }

    public final class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final int mFinalVisibility;
        public boolean mLayoutSuppressed;
        public final ViewGroup mParent;
        public final View mView;
        public boolean mCanceled = false;
        public final boolean mSuppressLayout = true;

        public DisappearListener(View view, int i) {
            this.mView = view;
            this.mFinalVisibility = i;
            this.mParent = (ViewGroup) view.getParent();
            suppressLayout(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            if (!this.mCanceled) {
                ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
                this.mView.setTransitionVisibility(this.mFinalVisibility);
                ViewGroup viewGroup = this.mParent;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            suppressLayout(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
                this.mView.setTransitionVisibility(0);
                ViewGroup viewGroup = this.mParent;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause() {
            suppressLayout(false);
            if (this.mCanceled) {
                return;
            }
            ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
            this.mView.setTransitionVisibility(this.mFinalVisibility);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume() {
            suppressLayout(true);
            if (this.mCanceled) {
                return;
            }
            ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
            this.mView.setTransitionVisibility(0);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        public final void suppressLayout(boolean z) {
            ViewGroup viewGroup;
            if (!this.mSuppressLayout || this.mLayoutSuppressed == z || (viewGroup = this.mParent) == null) {
                return;
            }
            this.mLayoutSuppressed = z;
            viewGroup.suppressLayout(z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.mCanceled) {
                ViewUtils.AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
                this.mView.setTransitionVisibility(this.mFinalVisibility);
                ViewGroup viewGroup = this.mParent;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            suppressLayout(false);
        }
    }

    public Visibility() {
        this.mMode = 3;
    }
}
