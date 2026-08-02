package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieCompositionFactory;
import com.squareup.cash.R;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.util.android.Views;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MooncakeProgress extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final CashLottieAnimationView arcadeProgress;
    public final int desiredSize;
    public final boolean runInOverlay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeProgress(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        context.getClass();
        this.runInOverlay = z;
        int dip = Views.dip(context, 60);
        this.desiredSize = dip;
        CashLottieAnimationView cashLottieAnimationView = new CashLottieAnimationView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        cashLottieAnimationView.setMaxWidth(dip);
        cashLottieAnimationView.setMaxHeight(dip);
        layoutParams.gravity = 17;
        cashLottieAnimationView.setLayoutParams(layoutParams);
        addView(cashLottieAnimationView);
        LottieCompositionFactory.fromRawRes(context, R.raw.progress_circular).addListener(new MooncakeProgress$$ExternalSyntheticLambda0(cashLottieAnimationView, this, 0));
        this.arcadeProgress = cashLottieAnimationView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.runInOverlay) {
            return;
        }
        this.arcadeProgress.playAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.runInOverlay) {
            return;
        }
        this.arcadeProgress.cancelAnimation();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.desiredSize;
        if (size <= 0) {
            size = i3;
        }
        if (size2 <= 0) {
            size2 = i3;
        }
        CashLottieAnimationView cashLottieAnimationView = this.arcadeProgress;
        ViewGroup.LayoutParams layoutParams = cashLottieAnimationView.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = Math.min(size, i3);
        layoutParams.height = Math.min(size2, i3);
        cashLottieAnimationView.setLayoutParams(layoutParams);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakeProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakeProgress(Context context) {
        this(context, null, false, 6, null);
        context.getClass();
    }

    public /* synthetic */ MooncakeProgress(Context context, AttributeSet attributeSet, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? false : z);
    }
}
