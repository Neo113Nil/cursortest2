package com.squareup.cash.sheet;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.PaintDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.PathInterpolator;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent2;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.animation.AnimationCurves;
import com.squareup.cash.arcade.treehouse.BottomSheetBinding$bottomSheet$1;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.overlays.Overlay;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStateListener;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.MooncakeBottomSheetStyle;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$SCALE$1;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes7.dex */
public final class BottomSheet extends ContourLayout implements Overlay, NestedScrollingParent2 {
    public static final BottomSheetState initialState = BottomSheetState.SYSTEM_DISMISSED;
    public final BottomSheet asView;
    public final OnBackListener backListener;
    public BottomSheetState currentState;
    public int distanceDragged;
    public boolean dragReleasedAtTop;
    public int lastSheetTopBound;
    public final int maxHeightPercentage;
    public final ArrayList moveListeners;
    public BottomSheet$$ExternalSyntheticLambda2 onNextStop;
    public final OutsideBoundsTouchHandler outsideBoundsTouchHandler;
    public Integer peekHeight;
    public final BottomSheet$preDrawListener$1 preDrawListener;
    public final ViewGroup sheet;
    public final HuffmanTreeGroup sheetBackground;
    public final BottomSheetConfig sheetConfig;
    public final View sheetView;
    public Animator stateChangeAnimator;
    public final ArrayList stateListeners;
    public boolean stateListenersAreStale;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.squareup.cash.ui.BottomSheetConfig] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.squareup.cash.sheet.BottomSheet$preDrawListener$1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, com.squareup.cash.sheet.BottomSheet, com.squareup.contour.ContourLayout, java.lang.Object] */
    public BottomSheet(Context context, ViewGroup viewGroup, BottomSheetBinding$bottomSheet$1 bottomSheetBinding$bottomSheet$1, int i) {
        super(context);
        BottomSheetBinding$bottomSheet$1 bottomSheetBinding$bottomSheet$12 = (i & 4) != 0 ? viewGroup instanceof BottomSheetConfig ? (BottomSheetConfig) viewGroup : null : bottomSheetBinding$bottomSheet$1;
        OnBackListener onBackListener = viewGroup instanceof OnBackListener ? (OnBackListener) viewGroup : null;
        BottomSheetStateListener bottomSheetStateListener = viewGroup instanceof BottomSheetStateListener ? (BottomSheetStateListener) viewGroup : null;
        context.getClass();
        this.sheet = viewGroup;
        this.sheetConfig = bottomSheetBinding$bottomSheet$12;
        this.backListener = onBackListener;
        this.maxHeightPercentage = 100;
        this.stateListeners = new ArrayList();
        this.currentState = initialState;
        if (viewGroup.getLayoutParams() == null) {
            viewGroup.setLayoutParams(generateDefaultLayoutParams());
        }
        final int i2 = 1;
        UselessNestedScrollView uselessNestedScrollView = viewGroup;
        if (bottomSheetBinding$bottomSheet$12 != null) {
            uselessNestedScrollView = viewGroup;
            if (bottomSheetBinding$bottomSheet$12.getWrapChildInNestedScrollingContainer()) {
                boolean z = viewGroup instanceof NestedScrollingChild;
                uselessNestedScrollView = viewGroup;
                if (!z) {
                    Context context2 = getContext();
                    context2.getClass();
                    uselessNestedScrollView = new UselessNestedScrollView(context2, viewGroup);
                }
            }
        }
        this.sheetView = uselessNestedScrollView;
        this.moveListeners = new ArrayList();
        this.outsideBoundsTouchHandler = new OutsideBoundsTouchHandler(this);
        this.stateChangeAnimator = new ValueAnimator();
        this.asView = this;
        BottomSheetStyle mooncakeBottomSheetStyle = (bottomSheetBinding$bottomSheet$12 == null || (mooncakeBottomSheetStyle = bottomSheetBinding$bottomSheet$12.getBottomSheetStyle()) == null) ? new MooncakeBottomSheetStyle(ThemeHelpersKt.themeInfo((View) this)) : mooncakeBottomSheetStyle;
        this.sheetBackground = new HuffmanTreeGroup(this, mooncakeBottomSheetStyle.getBackgroundColor(), Views.dip((View) this, mooncakeBottomSheetStyle.getCornerRadiusDp()), mooncakeBottomSheetStyle.getBottomSheetHandleConfig());
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.squareup.cash.sheet.BottomSheet$preDrawListener$1
            public int lastSheetY = -1;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                BottomSheet bottomSheet = BottomSheet.this;
                ArrayList arrayList = bottomSheet.moveListeners;
                if (bottomSheet.isMeasured()) {
                    if (this.lastSheetY != bottomSheet.getSheetY$overlays()) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((Function1) arrayList.get(i3)).invoke(Float.valueOf((bottomSheet.getSheetY$overlays() - bottomSheet.getSheetTopBound$overlays()) / (bottomSheet.getSheetBottomBound$overlays() - bottomSheet.getSheetTopBound$overlays())));
                        }
                    }
                    this.lastSheetY = bottomSheet.getSheetY$overlays();
                }
                return true;
            }
        };
        ColorDrawable colorDrawable = new ColorDrawable(mooncakeBottomSheetStyle.getScrimColor());
        final int i3 = 0;
        colorDrawable.setAlpha(0);
        addOnMoveListener(new BottomSheet$$ExternalSyntheticLambda3(i3, this, colorDrawable));
        setBackground(colorDrawable);
        if (uselessNestedScrollView.getLayoutParams() == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
        final int i4 = 2;
        int i5 = uselessNestedScrollView.getLayoutParams().height == -1 ? 1 : 2;
        ByteArrayProtoReader32 matchParentX = ContourLayout.matchParentX(0, 0);
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda4
            public final /* synthetic */ BottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6;
                int i7 = i3;
                BottomSheet bottomSheet = this.f$0;
                switch (i7) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(bottomSheet.getSheetBottomBound$overlays());
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        if (bottomSheet.isMeasured()) {
                            return new YInt((int) ((bottomSheet.maxHeightPercentage / 100.0f) * ((bottomSheet.getHeight() - bottomSheet.getPaddingTop()) - bottomSheet.getPaddingBottom())));
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    default:
                        ((Float) obj).getClass();
                        if (bottomSheet.peekHeight != null) {
                            int height = bottomSheet.sheet.getHeight();
                            Integer num = bottomSheet.peekHeight;
                            num.getClass();
                            i6 = height - num.intValue();
                        } else {
                            i6 = 0;
                        }
                        int sheetY$overlays = bottomSheet.getSheetY$overlays() - bottomSheet.getPaddingTop();
                        if (sheetY$overlays <= i6) {
                            i6 = sheetY$overlays;
                        }
                        BottomSheetConfig bottomSheetConfig = bottomSheet.sheetConfig;
                        if (bottomSheetConfig != null) {
                            bottomSheetConfig.onSheetPositionChanged(i6);
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        byteArrayProtoReader32.heightOf(i5, new Function1(this) { // from class: com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda4
            public final /* synthetic */ BottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6;
                int i7 = i2;
                BottomSheet bottomSheet = this.f$0;
                switch (i7) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(bottomSheet.getSheetBottomBound$overlays());
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        if (bottomSheet.isMeasured()) {
                            return new YInt((int) ((bottomSheet.maxHeightPercentage / 100.0f) * ((bottomSheet.getHeight() - bottomSheet.getPaddingTop()) - bottomSheet.getPaddingBottom())));
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    default:
                        ((Float) obj).getClass();
                        if (bottomSheet.peekHeight != null) {
                            int height = bottomSheet.sheet.getHeight();
                            Integer num = bottomSheet.peekHeight;
                            num.getClass();
                            i6 = height - num.intValue();
                        } else {
                            i6 = 0;
                        }
                        int sheetY$overlays = bottomSheet.getSheetY$overlays() - bottomSheet.getPaddingTop();
                        if (sheetY$overlays <= i6) {
                            i6 = sheetY$overlays;
                        }
                        BottomSheetConfig bottomSheetConfig = bottomSheet.sheetConfig;
                        if (bottomSheetConfig != null) {
                            bottomSheetConfig.onSheetPositionChanged(i6);
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        ContourLayout.layoutBy$default(this, uselessNestedScrollView, matchParentX, byteArrayProtoReader32);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setWillNotDraw(false);
        if (bottomSheetBinding$bottomSheet$12 != null) {
            int i6 = bottomSheetBinding$bottomSheet$12.getMaxHeightMode().percentage;
            if (i6 < 0 || i6 >= 101) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i6, "Max height should be between 0 and 100, was "));
                throw null;
            }
            this.maxHeightPercentage = i6;
            int initialHeight = bottomSheetBinding$bottomSheet$12.getInitialHeight();
            if (initialHeight != 0) {
                this.peekHeight = Integer.valueOf(initialHeight);
            }
        }
        if (bottomSheetStateListener != null) {
            addOnStateChangeListener(bottomSheetStateListener);
        }
        addOnMoveListener(new Function1(this) { // from class: com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda4
            public final /* synthetic */ BottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62;
                int i7 = i4;
                BottomSheet bottomSheet = this.f$0;
                switch (i7) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(bottomSheet.getSheetBottomBound$overlays());
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        if (bottomSheet.isMeasured()) {
                            return new YInt((int) ((bottomSheet.maxHeightPercentage / 100.0f) * ((bottomSheet.getHeight() - bottomSheet.getPaddingTop()) - bottomSheet.getPaddingBottom())));
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    default:
                        ((Float) obj).getClass();
                        if (bottomSheet.peekHeight != null) {
                            int height = bottomSheet.sheet.getHeight();
                            Integer num = bottomSheet.peekHeight;
                            num.getClass();
                            i62 = height - num.intValue();
                        } else {
                            i62 = 0;
                        }
                        int sheetY$overlays = bottomSheet.getSheetY$overlays() - bottomSheet.getPaddingTop();
                        if (sheetY$overlays <= i62) {
                            i62 = sheetY$overlays;
                        }
                        BottomSheetConfig bottomSheetConfig = bottomSheet.sheetConfig;
                        if (bottomSheetConfig != null) {
                            bottomSheetConfig.onSheetPositionChanged(i62);
                        }
                        return Unit.INSTANCE;
                }
            }
        });
    }

    public final void addOnMoveListener(Function1 function1) {
        this.moveListeners.add(function1);
        if (isMeasured()) {
            function1.invoke(Float.valueOf((getSheetY$overlays() - getSheetTopBound$overlays()) / (getSheetBottomBound$overlays() - getSheetTopBound$overlays())));
        }
    }

    public final void addOnStateChangeListener(BottomSheetStateListener bottomSheetStateListener) {
        this.stateListeners.add(bottomSheetStateListener);
        bottomSheetStateListener.onBottomSheetStateChange(this.currentState);
    }

    @Override // com.squareup.contour.ContourLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        if (getChildCount() == 0) {
            super.addView(view, i, layoutParams);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Can only have one direct child that acts as the sheet.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dragReleasedAtTop = false;
        } else if (action == 1) {
            this.dragReleasedAtTop = getSheetY$overlays() == getSheetTopBound$overlays();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final Animator enterAnimator() {
        if (this.currentState != initialState) {
            return new AnimatorSet();
        }
        BottomSheetState bottomSheetState = this.peekHeight != null ? BottomSheetState.PEEKING : BottomSheetState.EXPANDED;
        Animator moveSheetToStateAnimator = moveSheetToStateAnimator(bottomSheetState);
        moveSheetToStateAnimator.addListener(new CircularProgressDrawable.AnonymousClass2(4, this, bottomSheetState));
        return moveSheetToStateAnimator;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final Animator exitAnimator() {
        Animator moveSheetToStateAnimator = moveSheetToStateAnimator(BottomSheetState.SYSTEM_DISMISSED);
        moveSheetToStateAnimator.addListener(new BottomSheet$exitAnimator$lambda$0$$inlined$doOnStart$1(this, 0));
        return moveSheetToStateAnimator;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -2);
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final View getAsView() {
        return this.asView;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final OnBackListener getBackListener() {
        return this.backListener;
    }

    public final Integer getPeekY$overlays() {
        if (!isMeasured()) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return null;
        }
        if (this.peekHeight == null) {
            return null;
        }
        int sheetBottomBound$overlays = getSheetBottomBound$overlays();
        Integer num = this.peekHeight;
        num.getClass();
        return Integer.valueOf(sheetBottomBound$overlays - num.intValue());
    }

    public final int getSheetBottomBound$overlays() {
        if (isMeasured()) {
            return getHeight() - getPaddingBottom();
        }
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        return 0;
    }

    public final int getSheetTopBound$overlays() {
        if (isMeasured()) {
            return Math.max(getPaddingTop(), getSheetBottomBound$overlays() - this.sheetView.getHeight());
        }
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        return 0;
    }

    public final int getSheetY$overlays() {
        if (isMeasured()) {
            return (int) this.sheetView.getY();
        }
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        return 0;
    }

    public final boolean isMeasured() {
        return getWidth() > 0 || getHeight() > 0;
    }

    public final Animator moveSheetTo(int i) {
        if (getSheetY$overlays() == i) {
            return new AnimatorSet();
        }
        boolean z = i < getSheetY$overlays();
        ValueAnimator ofInt = ValueAnimator.ofInt(getSheetY$overlays(), i);
        if (z) {
            ofInt.setInterpolator(AnimationCurves.longTail);
            ofInt.setDuration(350L);
        } else {
            ofInt.setInterpolator(new PathInterpolator(0.3f, RecyclerView.DECELERATION_RATE, 0.5f, RecyclerView.DECELERATION_RATE));
            ofInt.setDuration(250L);
        }
        ofInt.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(this, 17));
        return ofInt;
    }

    public final Animator moveSheetToStateAnimator(BottomSheetState bottomSheetState) {
        Animator moveSheetTo;
        if (isMeasured()) {
            BottomSheetState bottomSheetState2 = BottomSheetState.EXPANDED;
            View view = this.sheetView;
            if (bottomSheetState == bottomSheetState2) {
                moveSheetTo = moveSheetTo(Math.max(getSheetTopBound$overlays(), getSheetBottomBound$overlays() - view.getMeasuredHeight()));
            } else if (bottomSheetState == BottomSheetState.PEEKING) {
                Integer num = this.peekHeight;
                num.getClass();
                int intValue = num.intValue();
                int height = view.getHeight();
                if (intValue > height) {
                    intValue = height;
                }
                moveSheetTo = moveSheetTo(getSheetBottomBound$overlays() - intValue);
            } else {
                moveSheetTo = moveSheetTo(getSheetBottomBound$overlays());
            }
        } else {
            moveSheetTo = new AnimatorSet();
        }
        moveSheetTo.addListener(new CircularProgressDrawable.AnonymousClass2(5, this, moveSheetTo));
        moveSheetTo.addListener(new BottomSheet$exitAnimator$lambda$0$$inlined$doOnStart$1(this, 1));
        return moveSheetTo;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        HuffmanTreeGroup huffmanTreeGroup = this.sheetBackground;
        huffmanTreeGroup.getClass();
        huffmanTreeGroup.alphabetSize = windowInsets.getSystemWindowInsetTop();
        Views$SCALE$1 views$SCALE$1 = Views.SCALE;
        setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        WindowInsets consumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
        consumeSystemWindowInsets.getClass();
        return consumeSystemWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
        getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        HuffmanTreeGroup huffmanTreeGroup = this.sheetBackground;
        huffmanTreeGroup.getClass();
        canvas.getClass();
        ((PaintDrawable) huffmanTreeGroup.codes).draw(canvas);
        ((BottomSheetDragHandle) huffmanTreeGroup.trees).draw(canvas);
        super.onDraw(canvas);
    }

    @Override // com.squareup.contour.ContourLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = this.currentState == BottomSheetState.SYSTEM_DISMISSED && this.stateChangeAnimator.isRunning();
        if (isMeasured() && Math.abs(this.distanceDragged) == 0 && !z2) {
            moveSheetToStateAnimator(this.currentState).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        view.getClass();
        if (this.dragReleasedAtTop) {
            return super.onNestedPreFling(view, f, f2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    @Override // androidx.core.view.NestedScrollingParent2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int sheetY$overlays;
        int sheetBottomBound$overlays;
        int i4;
        view.getClass();
        iArr.getClass();
        BottomSheetConfig bottomSheetConfig = this.sheetConfig;
        if (bottomSheetConfig == null || !bottomSheetConfig.isLocked()) {
            if (i3 == 0) {
                if (i2 > 0) {
                    if (getSheetY$overlays() > getSheetTopBound$overlays()) {
                        if (getSheetY$overlays() - i2 < getSheetTopBound$overlays()) {
                            sheetY$overlays = getSheetY$overlays();
                            sheetBottomBound$overlays = getSheetTopBound$overlays();
                            i2 = sheetY$overlays - sheetBottomBound$overlays;
                        }
                    }
                } else if (!view.canScrollVertically(-1)) {
                    if (getSheetY$overlays() - i2 > getSheetBottomBound$overlays()) {
                        sheetY$overlays = getSheetY$overlays();
                        sheetBottomBound$overlays = getSheetBottomBound$overlays();
                        i2 = sheetY$overlays - sheetBottomBound$overlays;
                    }
                }
                iArr[1] = i2;
                i4 = -i2;
                if (i4 != 0) {
                    View view2 = this.sheetView;
                    view2.setTranslationY(view2.getTranslationY() + i4);
                }
                this.distanceDragged -= i2;
            }
            i2 = 0;
            iArr[1] = i2;
            i4 = -i2;
            if (i4 != 0) {
            }
            this.distanceDragged -= i2;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        view.getClass();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        view.getClass();
        view2.getClass();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        view.getClass();
        view2.getClass();
        return (i & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i) {
        view.getClass();
        onStopNestedScroll(view);
        if (i == 0 && this.currentState != BottomSheetState.SYSTEM_DISMISSED) {
            boolean isRunning = this.stateChangeAnimator.isRunning();
            this.stateChangeAnimator.cancel();
            int i2 = 0;
            if (Math.abs(this.distanceDragged) > 0) {
                boolean z = this.distanceDragged < 0;
                int ordinal = this.currentState.ordinal();
                setCurrentState(ordinal != 0 ? ordinal != 1 ? this.currentState : z ? BottomSheetState.EXPANDED : BottomSheetState.USER_HIDDEN : z ? BottomSheetState.EXPANDED : BottomSheetState.USER_HIDDEN);
                moveSheetToStateAnimator(this.currentState).start();
            } else if (isRunning) {
                this.onNextStop = new BottomSheet$$ExternalSyntheticLambda2(this, i2);
            } else {
                BottomSheetConfig bottomSheetConfig = this.sheetConfig;
                if (bottomSheetConfig == null || !bottomSheetConfig.isSnapping()) {
                    BottomSheet$$ExternalSyntheticLambda2 bottomSheet$$ExternalSyntheticLambda2 = this.onNextStop;
                    if (bottomSheet$$ExternalSyntheticLambda2 != null) {
                        bottomSheet$$ExternalSyntheticLambda2.invoke();
                    }
                    this.onNextStop = null;
                } else {
                    moveSheetToStateAnimator(this.currentState).start();
                }
            }
            this.distanceDragged = 0;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        OutsideBoundsTouchHandler outsideBoundsTouchHandler = this.outsideBoundsTouchHandler;
        BottomSheet bottomSheet = outsideBoundsTouchHandler.layout;
        boolean onTouchEvent = outsideBoundsTouchHandler.scrollDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && Math.abs(bottomSheet.distanceDragged) > 0) {
            View childAt = outsideBoundsTouchHandler.layout.getChildAt(0);
            childAt.getClass();
            bottomSheet.onStopNestedScroll(childAt, 0);
        }
        return onTouchEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0.intValue() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCurrentState(BottomSheetState bottomSheetState) {
        if (bottomSheetState == BottomSheetState.PEEKING) {
            Integer num = this.peekHeight;
            if (num != null) {
                num.getClass();
            }
            a$$ExternalSyntheticBUOutline0.m$3("What's there to peek even?");
            return;
        }
        if (this.currentState != bottomSheetState) {
            this.stateListenersAreStale = true;
        }
        this.currentState = bottomSheetState;
    }

    public final void setDistanceDragged$overlays(int i) {
        this.distanceDragged = i;
    }

    public void setOnClickOutsideListener(Function0<Unit> function0) {
        function0.getClass();
        setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(0, this, function0));
    }

    public final void setPeekHeight(Integer num) {
        this.peekHeight = num;
    }
}
