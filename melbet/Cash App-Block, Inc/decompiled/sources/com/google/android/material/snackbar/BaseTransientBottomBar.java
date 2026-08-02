package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.TouchResponse;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.engine.Resource;
import com.fillr.n;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.WindowUtils$Api30Impl;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.jca.JCAContext;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.scannerview.SizeMap;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.SnackBarStateKt$renderErrorSnackbarIfNeeded$2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public abstract class BaseTransientBottomBar {
    public final AccessibilityManager accessibilityManager;
    public Anchor anchor;
    public final int animationFadeInDuration;
    public final TimeInterpolator animationFadeInterpolator;
    public final int animationFadeOutDuration;
    public final TimeInterpolator animationScaleInterpolator;
    public final int animationSlideDuration;
    public final TimeInterpolator animationSlideInterpolator;
    public int appliedBottomMarginGestureInset;
    public ArrayList callbacks;
    public final SnackbarContentLayout contentViewCallback;
    public final Context context;
    public int duration;
    public int extraBottomMarginAnchorView;
    public int extraBottomMarginGestureInset;
    public int extraBottomMarginWindowInset;
    public int extraLeftMarginWindowInset;
    public int extraRightMarginWindowInset;
    public boolean pendingShowingView;
    public final ViewGroup targetParent;
    public final SnackbarBaseLayout view;
    public static final FastOutSlowInInterpolator DEFAULT_ANIMATION_SLIDE_INTERPOLATOR = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    public static final LinearInterpolator DEFAULT_ANIMATION_FADE_INTERPOLATOR = AnimationUtils.LINEAR_INTERPOLATOR;
    public static final FastOutSlowInInterpolator DEFAULT_ANIMATION_SCALE_INTERPOLATOR = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
    public static final int[] SNACKBAR_STYLE_ATTR = {R.attr.snackbarStyle};
    public static final String TAG = "BaseTransientBottomBar";
    public static final Handler handler = new Handler(Looper.getMainLooper(), new AnonymousClass1(0));
    public final AnonymousClass2 bottomMarginGestureInsetRunnable = new AnonymousClass2(this, 0);
    public final AnonymousClass5 managerCallback = new AnonymousClass5();

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$1, reason: invalid class name */
    public final class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = 0;
            int i2 = 1;
            switch (this.$r8$classId) {
                case 0:
                    int i3 = message.what;
                    if (i3 == 0) {
                        BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                        SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.view;
                        ViewGroup viewGroup = baseTransientBottomBar.targetParent;
                        if (snackbarBaseLayout.getParent() == null) {
                            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
                            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                                Behavior behavior = new Behavior();
                                JCAContext jCAContext = behavior.delegate;
                                jCAContext.getClass();
                                jCAContext.provider = baseTransientBottomBar.managerCallback;
                                behavior.listener = new zzb(baseTransientBottomBar);
                                layoutParams2.setBehavior(behavior);
                                if (baseTransientBottomBar.getAnchorView() == null) {
                                    layoutParams2.insetEdge = 80;
                                }
                            }
                            snackbarBaseLayout.addingToTargetParent = true;
                            viewGroup.addView(snackbarBaseLayout);
                            snackbarBaseLayout.addingToTargetParent = false;
                            if (baseTransientBottomBar.getAnchorView() != null) {
                                int[] iArr = new int[2];
                                baseTransientBottomBar.getAnchorView().getLocationOnScreen(iArr);
                                int i4 = iArr[1];
                                int[] iArr2 = new int[2];
                                viewGroup.getLocationOnScreen(iArr2);
                                i = (viewGroup.getHeight() + iArr2[1]) - i4;
                            }
                            baseTransientBottomBar.extraBottomMarginAnchorView = i;
                            baseTransientBottomBar.updateMargins();
                            snackbarBaseLayout.setVisibility(4);
                        }
                        if (snackbarBaseLayout.isLaidOut()) {
                            baseTransientBottomBar.showViewImpl();
                        } else {
                            baseTransientBottomBar.pendingShowingView = true;
                        }
                    } else if (i3 == 1) {
                        BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                        int i5 = message.arg1;
                        SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar2.view;
                        AccessibilityManager accessibilityManager = baseTransientBottomBar2.accessibilityManager;
                        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || snackbarBaseLayout2.getVisibility() != 0) {
                            baseTransientBottomBar2.onViewHidden();
                        } else if (snackbarBaseLayout2.animationMode == 1) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, RecyclerView.DECELERATION_RATE);
                            ofFloat.setInterpolator(baseTransientBottomBar2.animationFadeInterpolator);
                            ofFloat.addUpdateListener(new AnonymousClass11(baseTransientBottomBar2, i));
                            ofFloat.setDuration(baseTransientBottomBar2.animationFadeOutDuration);
                            ofFloat.addListener(new AnonymousClass9(baseTransientBottomBar2, i5, i2));
                            ofFloat.start();
                        } else {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            SnackbarBaseLayout snackbarBaseLayout3 = baseTransientBottomBar2.view;
                            int height = snackbarBaseLayout3.getHeight();
                            ViewGroup.LayoutParams layoutParams3 = snackbarBaseLayout3.getLayoutParams();
                            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                height += ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            }
                            valueAnimator.setIntValues(0, height);
                            valueAnimator.setInterpolator(baseTransientBottomBar2.animationSlideInterpolator);
                            valueAnimator.setDuration(baseTransientBottomBar2.animationSlideDuration);
                            int i6 = 3;
                            valueAnimator.addListener(new AnonymousClass9(baseTransientBottomBar2, i5, i6));
                            valueAnimator.addUpdateListener(new AnonymousClass11(baseTransientBottomBar2, i6));
                            valueAnimator.start();
                        }
                    }
                    break;
                default:
                    if (message.what == 1) {
                        ((Resource) message.obj).recycle();
                        break;
                    }
                    break;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$11, reason: invalid class name */
    public final class AnonymousClass11 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public /* synthetic */ AnonymousClass11(BaseTransientBottomBar baseTransientBottomBar, int i) {
            this.$r8$classId = i;
            this.this$0 = baseTransientBottomBar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i = this.$r8$classId;
            BaseTransientBottomBar baseTransientBottomBar = this.this$0;
            switch (i) {
                case 0:
                    baseTransientBottomBar.view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                case 1:
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.view;
                    snackbarBaseLayout.setScaleX(floatValue);
                    snackbarBaseLayout.setScaleY(floatValue);
                    break;
                case 2:
                    baseTransientBottomBar.view.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    break;
                default:
                    baseTransientBottomBar.view.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    break;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$2, reason: invalid class name */
    public final class AnonymousClass2 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public /* synthetic */ AnonymousClass2(BaseTransientBottomBar baseTransientBottomBar, int i) {
            this.$r8$classId = i;
            this.this$0 = baseTransientBottomBar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rect rect;
            int i = this.$r8$classId;
            BaseTransientBottomBar baseTransientBottomBar = this.this$0;
            int i2 = 1;
            int i3 = 2;
            switch (i) {
                case 0:
                    SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.view;
                    if (snackbarBaseLayout != null) {
                        WindowManager windowManager = (WindowManager) baseTransientBottomBar.context.getSystemService("window");
                        if (Build.VERSION.SDK_INT >= 30) {
                            rect = WindowUtils$Api30Impl.getCurrentWindowBounds(windowManager);
                        } else {
                            Display defaultDisplay = windowManager.getDefaultDisplay();
                            Point point = new Point();
                            defaultDisplay.getRealSize(point);
                            rect = new Rect();
                            rect.right = point.x;
                            rect.bottom = point.y;
                        }
                        int height = rect.height();
                        int[] iArr = new int[2];
                        snackbarBaseLayout.getLocationInWindow(iArr);
                        int height2 = (height - (snackbarBaseLayout.getHeight() + iArr[1])) + ((int) snackbarBaseLayout.getTranslationY());
                        int i4 = baseTransientBottomBar.extraBottomMarginGestureInset;
                        if (height2 < i4) {
                            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
                            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                                Log.w(BaseTransientBottomBar.TAG, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                                break;
                            } else {
                                int i5 = baseTransientBottomBar.extraBottomMarginGestureInset;
                                baseTransientBottomBar.appliedBottomMarginGestureInset = i5;
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.bottomMargin = (i5 - height2) + marginLayoutParams.bottomMargin;
                                snackbarBaseLayout.requestLayout();
                                break;
                            }
                        } else {
                            baseTransientBottomBar.appliedBottomMarginGestureInset = i4;
                            break;
                        }
                    }
                    break;
                case 1:
                    baseTransientBottomBar.onViewHidden();
                    break;
                default:
                    SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar.view;
                    if (snackbarBaseLayout2 != null) {
                        int i6 = 0;
                        if (snackbarBaseLayout2.getParent() != null) {
                            snackbarBaseLayout2.setVisibility(0);
                        }
                        if (snackbarBaseLayout2.animationMode != 1) {
                            int height3 = snackbarBaseLayout2.getHeight();
                            ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout2.getLayoutParams();
                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                            }
                            snackbarBaseLayout2.setTranslationY(height3);
                            ValueAnimator valueAnimator = new ValueAnimator();
                            valueAnimator.setIntValues(height3, 0);
                            valueAnimator.setInterpolator(baseTransientBottomBar.animationSlideInterpolator);
                            valueAnimator.setDuration(baseTransientBottomBar.animationSlideDuration);
                            valueAnimator.addListener(new AnonymousClass9(baseTransientBottomBar, i3));
                            valueAnimator.addUpdateListener(new AnonymousClass11(baseTransientBottomBar, i3));
                            valueAnimator.start();
                            break;
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
                            ofFloat.setInterpolator(baseTransientBottomBar.animationFadeInterpolator);
                            ofFloat.addUpdateListener(new AnonymousClass11(baseTransientBottomBar, i6));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                            ofFloat2.setInterpolator(baseTransientBottomBar.animationScaleInterpolator);
                            ofFloat2.addUpdateListener(new AnonymousClass11(baseTransientBottomBar, i2));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofFloat, ofFloat2);
                            animatorSet.setDuration(baseTransientBottomBar.animationFadeInDuration);
                            animatorSet.addListener(new AnonymousClass9(baseTransientBottomBar, i6));
                            animatorSet.start();
                            break;
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$5, reason: invalid class name */
    public final class AnonymousClass5 {
        public AnonymousClass5() {
        }
    }

    public final class Anchor implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        public final WeakReference anchorView;
        public final WeakReference transientBottomBar;

        public Anchor(Snackbar snackbar, View view) {
            this.transientBottomBar = new WeakReference(snackbar);
            this.anchorView = new WeakReference(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            WeakReference weakReference = this.transientBottomBar;
            if (weakReference.get() == null) {
                unanchor();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) weakReference.get();
            FastOutSlowInInterpolator fastOutSlowInInterpolator = BaseTransientBottomBar.DEFAULT_ANIMATION_SLIDE_INTERPOLATOR;
            baseTransientBottomBar.getClass();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (this.transientBottomBar.get() == null) {
                unanchor();
            } else if (view != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (this.transientBottomBar.get() == null) {
                unanchor();
            } else if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        public final void unanchor() {
            WeakReference weakReference = this.anchorView;
            if (weakReference.get() != null) {
                ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
                View view = (View) weakReference.get();
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
            weakReference.clear();
            this.transientBottomBar.clear();
        }
    }

    public class Behavior extends SwipeDismissBehavior<View> {
        public final JCAContext delegate;

        public Behavior() {
            JCAContext jCAContext = new JCAContext((byte) 0, 3);
            this.alphaStartSwipeDistance = Math.min(Math.max(RecyclerView.DECELERATION_RATE, 0.1f), 1.0f);
            this.alphaEndSwipeDistance = Math.min(Math.max(RecyclerView.DECELERATION_RATE, 0.6f), 1.0f);
            this.swipeDirection = 0;
            this.delegate = jCAContext;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean canSwipeDismissView(View view) {
            this.delegate.getClass();
            return view instanceof SnackbarBaseLayout;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            JCAContext jCAContext = this.delegate;
            jCAContext.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    n.getInstance().restoreTimeoutIfPaused((AnonymousClass5) jCAContext.provider);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                n.getInstance().pauseTimeout((AnonymousClass5) jCAContext.provider);
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    public abstract class SnackbarBaseLayout extends FrameLayout {
        public static final TouchResponse.AnonymousClass1 consumeAllTouchListener = new TouchResponse.AnonymousClass1(2);
        public final float actionTextColorAlpha;
        public boolean addingToTargetParent;
        public final int animationMode;
        public ColorStateList backgroundTint;
        public PorterDuff.Mode backgroundTintMode;
        public BaseTransientBottomBar baseTransientBottomBar;
        public final int maxInlineActionWidth;
        public final int maxWidth;
        public Rect originalMargins;
        public final ShapeAppearanceModel shapeAppearanceModel;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(MaterialThemeOverlay.wrap(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(6)) {
                setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.animationMode = obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, 0, 0).build();
            }
            float f = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(ViewUtils.parseTintMode(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.actionTextColorAlpha = obtainStyledAttributes.getFloat(1, 1.0f);
            this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.maxInlineActionWidth = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            getPaddingEnd();
            setOnTouchListener(consumeAllTouchListener);
            setFocusable(true);
            if (getBackground() == null) {
                int layer = MaterialColors.layer(f, MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.colorSurface)), MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.colorOnSurface)));
                ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
                if (shapeAppearanceModel != null) {
                    FastOutSlowInInterpolator fastOutSlowInInterpolator = BaseTransientBottomBar.DEFAULT_ANIMATION_SLIDE_INTERPOLATOR;
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
                    materialShapeDrawable.setFillColor(ColorStateList.valueOf(layer));
                    gradientDrawable = materialShapeDrawable;
                } else {
                    Resources resources = getResources();
                    FastOutSlowInInterpolator fastOutSlowInInterpolator2 = BaseTransientBottomBar.DEFAULT_ANIMATION_SLIDE_INTERPOLATOR;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(layer);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                setBackground(gradientDrawable);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.baseTransientBottomBar;
            if (baseTransientBottomBar != null && (rootWindowInsets = baseTransientBottomBar.view.getRootWindowInsets()) != null) {
                baseTransientBottomBar.extraBottomMarginGestureInset = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                baseTransientBottomBar.updateMargins();
            }
            requestApplyInsets();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        
            if ((r0 != null && r0.callback.get() == r1) != false) goto L15;
         */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onDetachedFromWindow() {
            int i;
            boolean z;
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.baseTransientBottomBar;
            if (baseTransientBottomBar != null) {
                n nVar = n.getInstance();
                AnonymousClass5 anonymousClass5 = baseTransientBottomBar.managerCallback;
                synchronized (nVar.a) {
                    i = 1;
                    if (!nVar.isCurrentSnackbarLocked(anonymousClass5)) {
                        SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord = (SnackbarManager$SnackbarRecord) nVar.d;
                        z = false;
                    }
                    z = true;
                }
                if (z) {
                    BaseTransientBottomBar.handler.post(new AnonymousClass2(baseTransientBottomBar, i));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar baseTransientBottomBar = this.baseTransientBottomBar;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.pendingShowingView) {
                return;
            }
            baseTransientBottomBar.showViewImpl();
            baseTransientBottomBar.pendingShowingView = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.maxWidth;
            if (i3 <= 0 || getMeasuredWidth() <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.backgroundTint != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.backgroundTint);
                drawable.setTintMode(this.backgroundTintMode);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.backgroundTint = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintList(colorStateList);
                mutate.setTintMode(this.backgroundTintMode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.backgroundTintMode = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintMode(mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.addingToTargetParent || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.originalMargins = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar baseTransientBottomBar = this.baseTransientBottomBar;
            if (baseTransientBottomBar != null) {
                FastOutSlowInInterpolator fastOutSlowInInterpolator = BaseTransientBottomBar.DEFAULT_ANIMATION_SLIDE_INTERPOLATOR;
                baseTransientBottomBar.updateMargins();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : consumeAllTouchListener);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.targetParent = viewGroup;
        this.contentViewCallback = snackbarContentLayout;
        this.context = context;
        ViewUtils.checkTheme(context, ViewUtils.APPCOMPAT_CHECK_ATTRS, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_STYLE_ATTR);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.view = snackbarBaseLayout;
        snackbarBaseLayout.baseTransientBottomBar = this;
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float f = snackbarBaseLayout.actionTextColorAlpha;
            if (f != 1.0f) {
                snackbarContentLayout2.actionView.setTextColor(MaterialColors.layer(f, MaterialColors.resolveColor(snackbarContentLayout2.getContext(), MaterialAttributes.resolveTypedValueOrThrow(snackbarContentLayout2, R.attr.colorSurface)), snackbarContentLayout2.actionView.getCurrentTextColor()));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(snackbarBaseLayout.maxInlineActionWidth);
        }
        snackbarBaseLayout.addView(view);
        snackbarBaseLayout.setAccessibilityLiveRegion(1);
        snackbarBaseLayout.setImportantForAccessibility(1);
        snackbarBaseLayout.setFitsSystemWindows(true);
        SizeMap sizeMap = new SizeMap(this, 2);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(snackbarBaseLayout, sizeMap);
        ViewCompat.setAccessibilityDelegate(snackbarBaseLayout, new ClockFaceView.AnonymousClass2(this, 6));
        this.accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.animationSlideDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
        this.animationFadeInDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 150);
        this.animationFadeOutDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium1, 75);
        this.animationFadeInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, DEFAULT_ANIMATION_FADE_INTERPOLATOR);
        this.animationScaleInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, DEFAULT_ANIMATION_SCALE_INTERPOLATOR);
        this.animationSlideInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, DEFAULT_ANIMATION_SLIDE_INTERPOLATOR);
    }

    public final void dispatchDismiss(int i) {
        n nVar = n.getInstance();
        AnonymousClass5 anonymousClass5 = this.managerCallback;
        synchronized (nVar.a) {
            try {
                if (nVar.isCurrentSnackbarLocked(anonymousClass5)) {
                    nVar.cancelSnackbarLocked((SnackbarManager$SnackbarRecord) nVar.c, i);
                } else {
                    SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord = (SnackbarManager$SnackbarRecord) nVar.d;
                    if (snackbarManager$SnackbarRecord != null && snackbarManager$SnackbarRecord.callback.get() == anonymousClass5) {
                        nVar.cancelSnackbarLocked((SnackbarManager$SnackbarRecord) nVar.d, i);
                    }
                }
            } finally {
            }
        }
    }

    public final View getAnchorView() {
        Anchor anchor = this.anchor;
        if (anchor == null) {
            return null;
        }
        return (View) anchor.anchorView.get();
    }

    public final void onViewHidden() {
        n nVar = n.getInstance();
        AnonymousClass5 anonymousClass5 = this.managerCallback;
        synchronized (nVar.a) {
            try {
                if (nVar.isCurrentSnackbarLocked(anonymousClass5)) {
                    nVar.c = null;
                    if (((SnackbarManager$SnackbarRecord) nVar.d) != null) {
                        nVar.showNextSnackbarLocked();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.callbacks;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                SnackBarStateKt$renderErrorSnackbarIfNeeded$2 snackBarStateKt$renderErrorSnackbarIfNeeded$2 = (SnackBarStateKt$renderErrorSnackbarIfNeeded$2) this.callbacks.get(size);
                snackBarStateKt$renderErrorSnackbarIfNeeded$2.getClass();
                snackBarStateKt$renderErrorSnackbarIfNeeded$2.$onDismissed.invoke();
            }
        }
        ViewParent parent = this.view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.view);
        }
    }

    public final void onViewShown() {
        n nVar = n.getInstance();
        AnonymousClass5 anonymousClass5 = this.managerCallback;
        synchronized (nVar.a) {
            try {
                if (nVar.isCurrentSnackbarLocked(anonymousClass5)) {
                    nVar.scheduleTimeoutLocked((SnackbarManager$SnackbarRecord) nVar.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.callbacks;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((SnackBarStateKt$renderErrorSnackbarIfNeeded$2) this.callbacks.get(size)).getClass();
            }
        }
    }

    public final void showViewImpl() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        SnackbarBaseLayout snackbarBaseLayout = this.view;
        if (z) {
            snackbarBaseLayout.post(new AnonymousClass2(this, 2));
            return;
        }
        if (snackbarBaseLayout.getParent() != null) {
            snackbarBaseLayout.setVisibility(0);
        }
        onViewShown();
    }

    public final void updateMargins() {
        SnackbarBaseLayout snackbarBaseLayout = this.view;
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = TAG;
        if (!z) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (snackbarBaseLayout.originalMargins == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (snackbarBaseLayout.getParent() == null) {
            return;
        }
        int i = getAnchorView() != null ? this.extraBottomMarginAnchorView : this.extraBottomMarginWindowInset;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = snackbarBaseLayout.originalMargins;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.extraLeftMarginWindowInset;
        int i4 = rect.right + this.extraRightMarginWindowInset;
        int i5 = rect.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            snackbarBaseLayout.requestLayout();
        }
        if ((z2 || this.appliedBottomMarginGestureInset != this.extraBottomMarginGestureInset) && this.extraBottomMarginGestureInset > 0) {
            ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams2).mBehavior instanceof SwipeDismissBehavior) && getAnchorView() == null) {
                AnonymousClass2 anonymousClass2 = this.bottomMarginGestureInsetRunnable;
                snackbarBaseLayout.removeCallbacks(anonymousClass2);
                snackbarBaseLayout.post(anonymousClass2);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$9, reason: invalid class name */
    public final class AnonymousClass9 extends AnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ BaseTransientBottomBar this$0;

        public /* synthetic */ AnonymousClass9(BaseTransientBottomBar baseTransientBottomBar, int i) {
            this.$r8$classId = i;
            this.this$0 = baseTransientBottomBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            BaseTransientBottomBar baseTransientBottomBar = this.this$0;
            switch (i) {
                case 0:
                    baseTransientBottomBar.onViewShown();
                    break;
                case 1:
                    baseTransientBottomBar.onViewHidden();
                    break;
                case 2:
                    baseTransientBottomBar.onViewShown();
                    break;
                default:
                    baseTransientBottomBar.onViewHidden();
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
            BaseTransientBottomBar baseTransientBottomBar = this.this$0;
            switch (i) {
                case 2:
                    SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.contentViewCallback;
                    int i2 = baseTransientBottomBar.animationSlideDuration;
                    int i3 = baseTransientBottomBar.animationFadeInDuration;
                    int i4 = i2 - i3;
                    snackbarContentLayout.messageView.setAlpha(RecyclerView.DECELERATION_RATE);
                    long j = i3;
                    ViewPropertyAnimator duration = snackbarContentLayout.messageView.animate().alpha(1.0f).setDuration(j);
                    TimeInterpolator timeInterpolator = snackbarContentLayout.contentInterpolator;
                    long j2 = i4;
                    duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    if (snackbarContentLayout.actionView.getVisibility() == 0) {
                        snackbarContentLayout.actionView.setAlpha(RecyclerView.DECELERATION_RATE);
                        snackbarContentLayout.actionView.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                        break;
                    }
                    break;
                case 3:
                    SnackbarContentLayout snackbarContentLayout2 = baseTransientBottomBar.contentViewCallback;
                    int i5 = baseTransientBottomBar.animationFadeOutDuration;
                    snackbarContentLayout2.messageView.setAlpha(1.0f);
                    long j3 = i5;
                    ViewPropertyAnimator duration2 = snackbarContentLayout2.messageView.animate().alpha(RecyclerView.DECELERATION_RATE).setDuration(j3);
                    TimeInterpolator timeInterpolator2 = snackbarContentLayout2.contentInterpolator;
                    duration2.setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                    if (snackbarContentLayout2.actionView.getVisibility() == 0) {
                        snackbarContentLayout2.actionView.setAlpha(1.0f);
                        snackbarContentLayout2.actionView.animate().alpha(RecyclerView.DECELERATION_RATE).setDuration(j3).setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                        break;
                    }
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }

        public /* synthetic */ AnonymousClass9(BaseTransientBottomBar baseTransientBottomBar, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = baseTransientBottomBar;
        }
    }
}
