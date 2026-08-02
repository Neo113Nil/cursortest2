package com.squareup.cash.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.overlays.Overlay;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.util.android.Views;
import com.squareup.util.android.animation.Interpolators;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes6.dex */
public final class MooncakeDialog extends FrameLayout implements Overlay, DesignSystemDialog {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final MooncakeDialog asView;
    public final FrameLayout content;
    public boolean exiting;
    public boolean hasClickListener;
    public final MooncakeDialog overlay;

    public MooncakeDialog(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null);
        this.asView = this;
        this.overlay = this;
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        frameLayout.setElevation(frameLayout.getResources().getDimension(R.dimen.dialog_elevation));
        frameLayout.setOnClickListener(new ArcadeModal$$ExternalSyntheticLambda0(2));
        frameLayout.setSoundEffectsEnabled(false);
        frameLayout.setClipToOutline(true);
        frameLayout.setBackground(PlatformKt.getDrawableCompat(contextThemeWrapper, R.drawable.dialog_background, Integer.valueOf(ThemeHelpersKt.themeInfo(frameLayout).colorPalette.elevatedBackground)));
        this.content = frameLayout;
        setClickable(true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(contextThemeWrapper.getColor(R.color.dialog_window_background));
        setClipToPadding(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dialog_children_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        addView(frameLayout, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final Animator enterAnimator() {
        return ArcadeModal2Kt.createInAnimator(this, this.overlay.getAsView());
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final Animator exitAnimator() {
        MooncakeDialog mooncakeDialog = this.overlay.asView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.content, Views.SCALE, 1.05f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mooncakeDialog, "alpha", RecyclerView.DECELERATION_RATE);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(Interpolators.ACCEL);
        return animatorSet;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final View getAsView() {
        return this.asView;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final OnBackListener getBackListener() {
        Object singleOrNull = SequencesKt___SequencesKt.singleOrNull(new ViewGroupKt$children$1(this.content));
        if (singleOrNull instanceof OnBackListener) {
            return (OnBackListener) singleOrNull;
        }
        return null;
    }

    @Override // com.squareup.cash.dialog.DesignSystemDialog
    public final ViewGroup getContent() {
        return this.content;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final void onEnterDone() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        setLayoutTransition(layoutTransition);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.exiting || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.hasClickListener ? super.onTouchEvent(motionEvent) : motionEvent.getActionMasked() == 0;
    }

    public void setExiting(boolean z) {
        this.exiting = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.hasClickListener = onClickListener != null;
    }

    public void setOnClickOutsideListener(Function0<Unit> function0) {
        function0.getClass();
        setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(21, this, function0));
    }
}
