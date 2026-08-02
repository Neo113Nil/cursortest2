package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.google.android.gms.internal.fido.zzfz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements ExpandableWidget, Shapeable, CoordinatorLayout.AttachedBehavior {
    public ColorStateList backgroundTint;
    public PorterDuff.Mode backgroundTintMode;
    public boolean compatPadding;
    public int customSize;
    public final zzfz expandableWidgetHelper;
    public final AppCompatImageHelper imageHelper;
    public PorterDuff.Mode imageMode;
    public int imagePadding;
    public ColorStateList imageTint;
    public FloatingActionButtonImpl impl;
    public int maxImageSize;
    public ColorStateList rippleColor;
    public final Rect shadowPadding;
    public int size;
    public final Rect touchArea;

    public final class TransformationCallbackWrapper {
        public final OneShotDisposable listener;

        public TransformationCallbackWrapper(OneShotDisposable oneShotDisposable) {
            this.listener = oneShotDisposable;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof TransformationCallbackWrapper) && ((TransformationCallbackWrapper) obj).listener.equals(this.listener);
        }

        public final int hashCode() {
            return this.listener.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        ColorStateList colorStateList;
        FloatingActionButton floatingActionButton;
        Drawable drawable;
        Drawable drawable2;
        this.shadowPadding = new Rect();
        this.touchArea = new Rect();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.FloatingActionButton, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.backgroundTint = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 1);
        this.backgroundTintMode = ViewUtils.parseTintMode(obtainStyledAttributes.getInt(2, -1), null);
        this.rippleColor = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 12);
        this.size = obtainStyledAttributes.getInt(7, -1);
        this.customSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        float dimension = obtainStyledAttributes.getDimension(4, RecyclerView.DECELERATION_RATE);
        float dimension2 = obtainStyledAttributes.getDimension(9, RecyclerView.DECELERATION_RATE);
        float dimension3 = obtainStyledAttributes.getDimension(11, RecyclerView.DECELERATION_RATE);
        this.compatPadding = obtainStyledAttributes.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        MotionSpec createFromAttribute = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, 15);
        MotionSpec createFromAttribute2 = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, 8);
        ShapeAppearanceModel build = ShapeAppearanceModel.builder(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, ShapeAppearanceModel.PILL).build();
        boolean z = obtainStyledAttributes.getBoolean(5, false);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.imageHelper = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i);
        zzfz zzfzVar = new zzfz();
        zzfzVar.zzc = false;
        zzfzVar.zzb = 0;
        zzfzVar.zza = this;
        this.expandableWidgetHelper = zzfzVar;
        getImpl().setShapeAppearance(build);
        FloatingActionButtonImpl impl = getImpl();
        ColorStateList colorStateList2 = this.backgroundTint;
        PorterDuff.Mode mode = this.backgroundTintMode;
        ColorStateList colorStateList3 = this.rippleColor;
        FloatingActionButton floatingActionButton2 = impl.view;
        ShapeAppearanceModel shapeAppearanceModel = impl.shapeAppearance;
        shapeAppearanceModel.getClass();
        FloatingActionButtonImpl.AlwaysStatefulMaterialShapeDrawable alwaysStatefulMaterialShapeDrawable = new FloatingActionButtonImpl.AlwaysStatefulMaterialShapeDrawable(shapeAppearanceModel);
        impl.shapeDrawable = alwaysStatefulMaterialShapeDrawable;
        alwaysStatefulMaterialShapeDrawable.setTintList(colorStateList2);
        if (mode != null) {
            impl.shapeDrawable.setTintMode(mode);
        }
        impl.shapeDrawable.initializeElevationOverlay(floatingActionButton2.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton2.getContext();
            ShapeAppearanceModel shapeAppearanceModel2 = impl.shapeAppearance;
            shapeAppearanceModel2.getClass();
            BorderDrawable borderDrawable = new BorderDrawable(shapeAppearanceModel2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            colorStateList = colorStateList3;
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            floatingActionButton = floatingActionButton2;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            borderDrawable.topOuterStrokeColor = color;
            borderDrawable.topInnerStrokeColor = color2;
            borderDrawable.bottomOuterStrokeColor = color3;
            borderDrawable.bottomInnerStrokeColor = color4;
            float f = dimensionPixelSize;
            if (borderDrawable.borderWidth != f) {
                borderDrawable.borderWidth = f;
                borderDrawable.paint.setStrokeWidth(f * 1.3333f);
                borderDrawable.invalidateShader = true;
                borderDrawable.invalidateSelf();
            }
            if (colorStateList2 != null) {
                borderDrawable.currentBorderTintColor = colorStateList2.getColorForState(borderDrawable.getState(), borderDrawable.currentBorderTintColor);
            }
            borderDrawable.borderTint = colorStateList2;
            borderDrawable.invalidateShader = true;
            borderDrawable.invalidateSelf();
            impl.borderDrawable = borderDrawable;
            BorderDrawable borderDrawable2 = impl.borderDrawable;
            borderDrawable2.getClass();
            FloatingActionButtonImpl.AlwaysStatefulMaterialShapeDrawable alwaysStatefulMaterialShapeDrawable2 = impl.shapeDrawable;
            alwaysStatefulMaterialShapeDrawable2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{borderDrawable2, alwaysStatefulMaterialShapeDrawable2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            floatingActionButton = floatingActionButton2;
            drawable = null;
            impl.borderDrawable = null;
            drawable2 = impl.shapeDrawable;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), drawable2, drawable);
        impl.rippleDrawable = rippleDrawable;
        FocusRingDrawable.layer(floatingActionButton.getContext(), rippleDrawable, impl.shapeDrawable);
        impl.contentBackground = rippleDrawable;
        getImpl().minTouchTargetSize = dimensionPixelSize2;
        FloatingActionButtonImpl impl2 = getImpl();
        if (impl2.elevation != dimension) {
            impl2.elevation = dimension;
            impl2.onElevationsChanged(dimension, impl2.hoveredFocusedTranslationZ, impl2.pressedTranslationZ);
        }
        FloatingActionButtonImpl impl3 = getImpl();
        if (impl3.hoveredFocusedTranslationZ != dimension2) {
            impl3.hoveredFocusedTranslationZ = dimension2;
            impl3.onElevationsChanged(impl3.elevation, dimension2, impl3.pressedTranslationZ);
        }
        FloatingActionButtonImpl impl4 = getImpl();
        if (impl4.pressedTranslationZ != dimension3) {
            impl4.pressedTranslationZ = dimension3;
            impl4.onElevationsChanged(impl4.elevation, impl4.hoveredFocusedTranslationZ, dimension3);
        }
        getImpl().showMotionSpec = createFromAttribute;
        getImpl().hideMotionSpec = createFromAttribute2;
        getImpl().ensureMinTouchTargetSize = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.backgroundTint;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public final CoordinatorLayout.Behavior getBehavior() {
        return new Behavior();
    }

    public final FloatingActionButtonImpl getImpl() {
        if (this.impl == null) {
            this.impl = new FloatingActionButtonImpl(this, new zzr(this, 5));
        }
        return this.impl;
    }

    public final void getMeasuredContentRect(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int i = rect.left;
        Rect rect2 = this.shadowPadding;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final int getSizeDimension(int i) {
        int i2 = this.customSize;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? getSizeDimension(1) : getSizeDimension(0);
    }

    public final void hide(BottomAppBar.AnonymousClass5 anonymousClass5, final boolean z) {
        final FloatingActionButtonImpl impl = getImpl();
        final Result result = anonymousClass5 == null ? null : new Result(this, anonymousClass5, false, 5);
        FloatingActionButton floatingActionButton = impl.view;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.animState;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (!floatingActionButton.isLaidOut()) {
            floatingActionButton.internalSetVisibility(z ? 8 : 4, z);
            if (result != null) {
                ((zzpc) result.text).onHidden((FloatingActionButton) result.resultMetadata);
                return;
            }
            return;
        }
        MotionSpec motionSpec = impl.hideMotionSpec;
        AnimatorSet createAnimator = motionSpec != null ? impl.createAnimator(motionSpec, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) : impl.createDefaultAnimator(RecyclerView.DECELERATION_RATE, 0.4f, 0.4f, FloatingActionButtonImpl.HIDE_ANIM_DURATION_ATTR, FloatingActionButtonImpl.HIDE_ANIM_EASING_ATTR);
        createAnimator.addListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: INVOKE 
              (r7v6 'createAnimator' android.animation.AnimatorSet)
              (wrap:android.animation.AnimatorListenerAdapter:0x004a: CONSTRUCTOR 
              (r0v0 'impl' com.google.android.material.floatingactionbutton.FloatingActionButtonImpl A[DONT_INLINE])
              (r8v0 'z' boolean A[DONT_INLINE])
              (r6v2 'result' com.google.zxing.Result A[DONT_INLINE])
             A[MD:(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl, boolean, com.google.zxing.Result):void (m), WRAPPED] call: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1.<init>(com.google.android.material.floatingactionbutton.FloatingActionButtonImpl, boolean, com.google.zxing.Result):void type: CONSTRUCTOR)
             VIRTUAL call: android.animation.Animator.addListener(android.animation.Animator$AnimatorListener):void A[MD:(android.animation.Animator$AnimatorListener):void (c)] in method: com.google.android.material.floatingactionbutton.FloatingActionButton.hide(com.google.android.material.bottomappbar.BottomAppBar$5, boolean):void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 19 more
            */
        /*
            this = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r6.getImpl()
            if (r7 != 0) goto L8
            r6 = 0
            goto L10
        L8:
            com.google.zxing.Result r1 = new com.google.zxing.Result
            r2 = 5
            r3 = 0
            r1.<init>(r6, r7, r3, r2)
            r6 = r1
        L10:
            com.google.android.material.floatingactionbutton.FloatingActionButton r7 = r0.view
            int r1 = r7.getVisibility()
            int r2 = r0.animState
            if (r1 != 0) goto L1e
            r1 = 1
            if (r2 != r1) goto L22
            goto L82
        L1e:
            r1 = 2
            if (r2 == r1) goto L22
            goto L82
        L22:
            android.animation.Animator r1 = r0.currentAnimator
            if (r1 == 0) goto L29
            r1.cancel()
        L29:
            boolean r1 = r7.isLaidOut()
            if (r1 == 0) goto L6c
            com.google.android.material.animation.MotionSpec r7 = r0.hideMotionSpec
            if (r7 == 0) goto L39
            r1 = 0
            android.animation.AnimatorSet r7 = r0.createAnimator(r7, r1, r1, r1)
            goto L48
        L39:
            int r4 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HIDE_ANIM_DURATION_ATTR
            int r5 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HIDE_ANIM_EASING_ATTR
            r1 = 0
            r2 = 1053609165(0x3ecccccd, float:0.4)
            r3 = 1053609165(0x3ecccccd, float:0.4)
            android.animation.AnimatorSet r7 = r0.createDefaultAnimator(r1, r2, r3, r4, r5)
        L48:
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1 r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1
            r1.<init>(r0, r8, r6)
            r7.addListener(r1)
            java.util.ArrayList r6 = r0.hideListeners
            if (r6 == 0) goto L68
            java.util.Iterator r6 = r6.iterator()
        L58:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L68
            java.lang.Object r8 = r6.next()
            android.animation.Animator$AnimatorListener r8 = (android.animation.Animator.AnimatorListener) r8
            r7.addListener(r8)
            goto L58
        L68:
            r7.start()
            return
        L6c:
            if (r8 == 0) goto L71
            r0 = 8
            goto L72
        L71:
            r0 = 4
        L72:
            r7.internalSetVisibility(r0, r8)
            if (r6 == 0) goto L82
            java.lang.Object r7 = r6.text
            com.google.android.gms.internal.mlkit_vision_text_common.zzpc r7 = (com.google.android.gms.internal.mlkit_vision_text_common.zzpc) r7
            java.lang.Object r6 = r6.resultMetadata
            com.google.android.material.floatingactionbutton.FloatingActionButton r6 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r6
            r7.onHidden(r6)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.hide(com.google.android.material.bottomappbar.BottomAppBar$5, boolean):void");
    }

    public final void onApplySupportImageTint() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.imageTint;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.imageMode;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FloatingActionButtonImpl impl = getImpl();
        FloatingActionButtonImpl.AlwaysStatefulMaterialShapeDrawable alwaysStatefulMaterialShapeDrawable = impl.shapeDrawable;
        if (alwaysStatefulMaterialShapeDrawable != null) {
            RetryKt.setParentAbsoluteElevation(impl.view, alwaysStatefulMaterialShapeDrawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().view.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension(this.size);
        this.imagePadding = (sizeDimension - this.maxImageSize) / 2;
        getImpl().updatePadding();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.shadowPadding;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mSuperState);
        Bundle bundle = (Bundle) extendableSavedState.extendableStates.get("expandableWidgetHelper");
        bundle.getClass();
        zzfz zzfzVar = this.expandableWidgetHelper;
        zzfzVar.getClass();
        zzfzVar.zzc = bundle.getBoolean("expanded", false);
        zzfzVar.zzb = bundle.getInt("expandedComponentIdHint", 0);
        if (zzfzVar.zzc) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) zzfzVar.zza;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        zzfz zzfzVar = this.expandableWidgetHelper;
        zzfzVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", zzfzVar.zzc);
        bundle.putInt("expandedComponentIdHint", zzfzVar.zzb);
        extendableSavedState.extendableStates.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.touchArea;
            getMeasuredContentRect(rect);
            FloatingActionButtonImpl floatingActionButtonImpl = this.impl;
            if (floatingActionButtonImpl.ensureMinTouchTargetSize) {
                int i2 = floatingActionButtonImpl.minTouchTargetSize;
                FloatingActionButton floatingActionButton = floatingActionButtonImpl.view;
                i = Math.max((i2 - floatingActionButton.getSizeDimension(floatingActionButton.size)) / 2, 0);
            } else {
                i = 0;
            }
            int i3 = -i;
            rect.inset(i3, i3);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            FloatingActionButtonImpl impl = getImpl();
            FloatingActionButtonImpl.AlwaysStatefulMaterialShapeDrawable alwaysStatefulMaterialShapeDrawable = impl.shapeDrawable;
            if (alwaysStatefulMaterialShapeDrawable != null) {
                alwaysStatefulMaterialShapeDrawable.setTintList(colorStateList);
            }
            BorderDrawable borderDrawable = impl.borderDrawable;
            if (borderDrawable != null) {
                if (colorStateList != null) {
                    borderDrawable.currentBorderTintColor = colorStateList.getColorForState(borderDrawable.getState(), borderDrawable.currentBorderTintColor);
                }
                borderDrawable.borderTint = colorStateList;
                borderDrawable.invalidateShader = true;
                borderDrawable.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            FloatingActionButtonImpl.AlwaysStatefulMaterialShapeDrawable alwaysStatefulMaterialShapeDrawable = getImpl().shapeDrawable;
            if (alwaysStatefulMaterialShapeDrawable != null) {
                alwaysStatefulMaterialShapeDrawable.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCompatElevation(float f) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.elevation != f) {
            impl.elevation = f;
            impl.onElevationsChanged(f, impl.hoveredFocusedTranslationZ, impl.pressedTranslationZ);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.hoveredFocusedTranslationZ != f) {
            impl.hoveredFocusedTranslationZ = f;
            impl.onElevationsChanged(impl.elevation, f, impl.pressedTranslationZ);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.pressedTranslationZ != f) {
            impl.pressedTranslationZ = f;
            impl.onElevationsChanged(impl.elevation, impl.hoveredFocusedTranslationZ, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Custom size must be non-negative");
        } else if (i != this.customSize) {
            this.customSize = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        FloatingActionButtonImpl.AlwaysStatefulMaterialShapeDrawable alwaysStatefulMaterialShapeDrawable = getImpl().shapeDrawable;
        if (alwaysStatefulMaterialShapeDrawable != null) {
            alwaysStatefulMaterialShapeDrawable.setElevation(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().ensureMinTouchTargetSize) {
            getImpl().ensureMinTouchTargetSize = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.expandableWidgetHelper.zzb = i;
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        getImpl().hideMotionSpec = motionSpec;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            FloatingActionButtonImpl impl = getImpl();
            float f = impl.imageMatrixScale;
            impl.imageMatrixScale = f;
            Matrix matrix = impl.tmpMatrix;
            impl.calculateImageMatrixFromScale(matrix, f);
            impl.view.setImageMatrix(matrix);
            if (this.imageTint != null) {
                onApplySupportImageTint();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.imageHelper.setImageResource(i);
        onApplySupportImageTint();
    }

    public void setMaxImageSize(int i) {
        this.maxImageSize = i;
        FloatingActionButtonImpl impl = getImpl();
        if (impl.maxImageSize != i) {
            impl.maxImageSize = i;
            float f = impl.imageMatrixScale;
            impl.imageMatrixScale = f;
            Matrix matrix = impl.tmpMatrix;
            impl.calculateImageMatrixFromScale(matrix, f);
            impl.view.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            FloatingActionButtonImpl impl = getImpl();
            ColorStateList colorStateList2 = this.rippleColor;
            RippleDrawable rippleDrawable = impl.rippleDrawable;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().onScaleChanged();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().onScaleChanged();
    }

    public void setShadowPaddingEnabled(boolean z) {
        FloatingActionButtonImpl impl = getImpl();
        impl.shadowPaddingEnabled = z;
        impl.updatePadding();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().setShapeAppearance(shapeAppearanceModel);
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        getImpl().showMotionSpec = motionSpec;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setSize(int i) {
        this.customSize = 0;
        if (i != this.size) {
            this.size = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.imageTint != colorStateList) {
            this.imageTint = colorStateList;
            onApplySupportImageTint();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.imageMode != mode) {
            this.imageMode = mode;
            onApplySupportImageTint();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().onTranslationChanged();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().onTranslationChanged();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().onTranslationChanged();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.compatPadding != z) {
            this.compatPadding = z;
            getImpl().updatePadding();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final void show(BottomAppBar.AnonymousClass5.AnonymousClass1 anonymousClass1, boolean z) {
        FloatingActionButtonImpl impl = getImpl();
        Result result = anonymousClass1 == null ? null : new Result(this, anonymousClass1, false, 5);
        FloatingActionButton floatingActionButton = impl.view;
        FloatingActionButton floatingActionButton2 = impl.view;
        Matrix matrix = impl.tmpMatrix;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.animState;
        if (visibility != 0) {
            if (i == 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        Animator animator = impl.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.showMotionSpec == null;
        if (!floatingActionButton.isLaidOut()) {
            floatingActionButton.internalSetVisibility(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.imageMatrixScale = 1.0f;
            impl.calculateImageMatrixFromScale(matrix, 1.0f);
            floatingActionButton2.setImageMatrix(matrix);
            if (result != null) {
                ((zzpc) result.text).onShown();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            float f = RecyclerView.DECELERATION_RATE;
            floatingActionButton.setAlpha(RecyclerView.DECELERATION_RATE);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            if (z2) {
                f = 0.4f;
            }
            impl.imageMatrixScale = f;
            impl.calculateImageMatrixFromScale(matrix, f);
            floatingActionButton2.setImageMatrix(matrix);
        }
        MotionSpec motionSpec = impl.showMotionSpec;
        AnimatorSet createAnimator = motionSpec != null ? impl.createAnimator(motionSpec, 1.0f, 1.0f, 1.0f) : impl.createDefaultAnimator(1.0f, 1.0f, 1.0f, FloatingActionButtonImpl.SHOW_ANIM_DURATION_ATTR, FloatingActionButtonImpl.SHOW_ANIM_EASING_ATTR);
        createAnimator.addListener(new FabTransformationBehavior.AnonymousClass1(impl, z, result));
        ArrayList arrayList = impl.showListeners;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                createAnimator.addListener((Animator.AnimatorListener) it.next());
            }
        }
        createAnimator.start();
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior {
        public final boolean autoHideEnabled;
        public Rect tmpRect;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean getInsetDodgeRect(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.shadowPadding;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).mBehavior instanceof BottomSheetBehavior : false) {
                    updateFabVisibilityForBottomSheet(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) dependencies.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).mBehavior instanceof BottomSheetBehavior : false) && updateFabVisibilityForBottomSheet(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            Rect rect = floatingActionButton.shadowPadding;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (!this.autoHideEnabled || layoutParams.mAnchorId != appBarLayout.getId() || floatingActionButton.userSetVisibility != 0) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.hide(null, false);
                return true;
            }
            floatingActionButton.show(null, false);
            return true;
        }

        public final boolean updateFabVisibilityForBottomSheet(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (!this.autoHideEnabled || layoutParams.mAnchorId != view.getId() || floatingActionButton.userSetVisibility != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.hide(null, false);
                return true;
            }
            floatingActionButton.show(null, false);
            return true;
        }

        public BaseBehavior() {
            this.autoHideEnabled = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
