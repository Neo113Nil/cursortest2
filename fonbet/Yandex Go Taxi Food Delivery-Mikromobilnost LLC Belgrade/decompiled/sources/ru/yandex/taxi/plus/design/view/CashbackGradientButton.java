package ru.yandex.taxi.plus.design.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.c4i0;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.yi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.plus.design.gradient.CashbackGradientDrawable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/plus/design/view/CashbackGradientButton;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyAttributes", "(Landroid/util/AttributeSet;I)V", "", "isAnimated", "setIsAnimated", "(Z)V", "Lru/yandex/taxi/plus/design/gradient/CashbackGradientDrawable;", "backgroundDrawable", "Lru/yandex/taxi/plus/design/gradient/CashbackGradientDrawable;", "Landroid/animation/ValueAnimator;", "animation", "Landroid/animation/ValueAnimator;", "isAnimationRunning", "Z", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackGradientButton extends ListItemComponent {
    private ValueAnimator animation;
    private final CashbackGradientDrawable backgroundDrawable;
    private boolean isAnimationRunning;

    public CashbackGradientButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CashbackGradientDrawable cashbackGradientDrawable = new CashbackGradientDrawable();
        this.backgroundDrawable = cashbackGradientDrawable;
        applyAttributes(attributeSet, i);
        setBackground(cashbackGradientDrawable);
    }

    private final void applyAttributes(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ButtonComponent, defStyleAttr, 0);
        try {
            this.backgroundDrawable.setRoundedCornersRadius(obtainStyledAttributes.getDimensionPixelOffset(c4i0.ButtonComponent_component_button_rounded_corners_radius, tje.r(mrg0.button_component_default_rounded_corners_radius, getContext())));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setIsAnimated$lambda$0$0(CashbackGradientButton cashbackGradientButton, ValueAnimator valueAnimator) {
        cashbackGradientButton.backgroundDrawable.setTopShaderAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        cashbackGradientButton.invalidate();
    }

    public final void setIsAnimated(boolean isAnimated) {
        if (!isAnimated) {
            ValueAnimator valueAnimator = this.animation;
            if (valueAnimator != null) {
                valueAnimator.setRepeatCount(1);
                return;
            }
            return;
        }
        if (this.isAnimationRunning) {
            return;
        }
        this.isAnimationRunning = true;
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
        ofInt.setDuration(800L);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setRepeatMode(2);
        ofInt.addUpdateListener(new yi(12, this));
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.plus.design.view.CashbackGradientButton$setIsAnimated$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                CashbackGradientDrawable cashbackGradientDrawable;
                CashbackGradientButton.this.isAnimationRunning = false;
                cashbackGradientDrawable = CashbackGradientButton.this.backgroundDrawable;
                cashbackGradientDrawable.setTopShaderAlpha(255);
            }
        });
        ofInt.start();
        this.animation = ofInt;
    }

    public CashbackGradientButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CashbackGradientButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CashbackGradientButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
