package ru.yandex.taxi.plus.badge;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.b6t0;
import defpackage.dn7;
import defpackage.e4i0;
import defpackage.efh0;
import defpackage.erh0;
import defpackage.gsg0;
import defpackage.kdc;
import defpackage.mqg0;
import defpackage.n0h0;
import defpackage.pm5;
import defpackage.qje;
import defpackage.rkt;
import defpackage.s8o;
import defpackage.t39;
import defpackage.tqg0;
import defpackage.u39;
import defpackage.v39;
import defpackage.vh4;
import defpackage.vng;
import defpackage.w511;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.xyt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.plus.design.view.CashbackClipFrameLayout;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 w2\u00020\u0001:\u0001xB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b7\u0010\u0012J\u0017\u00108\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b=\u0010\u001fJ\u0017\u0010>\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\fH\u0002¢\u0006\u0004\b@\u0010\u0014J\u000f\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bA\u0010\u0014J\u0017\u0010C\u001a\u00020-2\u0006\u0010B\u001a\u00020)H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\bE\u0010#J\u0017\u0010F\u001a\u00020)2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0018\u0010M\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010cR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010iR\u0014\u0010k\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010lR\u0016\u0010q\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010lR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010lR\u0018\u0010r\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010lR\u0016\u0010u\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010lR\u0016\u0010v\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010l¨\u0006y"}, d2 = {"Lru/yandex/taxi/plus/badge/CashbackHorizontalView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "startPromoTextAnimation", "()V", "stopPromoTextAnimation", "", "value", "setValueText", "(Ljava/lang/String;)V", "text", "setPromoText", "Lru/yandex/taxi/plus/badge/CashbackBadgeStyle;", "badgeStyle", "setBadgeStyle", "(Lru/yandex/taxi/plus/badge/CashbackBadgeStyle;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setCustomIcon", "(Landroid/graphics/drawable/Drawable;)V", "useDefaultIcon", "Lkdc;", "color", "setTextColor", "(Lkdc;)V", "", "height", "setHeightDp", "(Ljava/lang/Float;)V", "", "isGradientEnabled", "setIsGradientEnabled", "(Z)V", "initialDelay", "Landroid/animation/AnimatorSet;", "expandAndChangeToPromoTextAnimator", "(I)Landroid/animation/AnimatorSet;", "collapseAndShowValueTextAnimator", "()Landroid/animation/AnimatorSet;", "renderContent", "measureTextWidth", "(Ljava/lang/String;)F", "Lvh4;", "createBackgroundPainter", "(Lru/yandex/taxi/plus/badge/CashbackBadgeStyle;)Lvh4;", "onBadgeStyleChanged", "getPaintColor", "(Lru/yandex/taxi/plus/badge/CashbackBadgeStyle;)I", "enableElevationShadow", "disableElevationShadow", CaretView.ALPHA_PROPERTY, "alphaAlmostTransparent", "(F)Z", "setPlusIconDrawable", "getCustomDrawableScale", "(Landroid/graphics/drawable/Drawable;)F", "backgroundPainter", "Lvh4;", "valueText", "Ljava/lang/String;", "promoText", "promoAnimatorSet", "Landroid/animation/AnimatorSet;", "Landroid/view/animation/Interpolator;", "promoAnimationInterpolator", "Landroid/view/animation/Interpolator;", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/RectF;", "textClipRectF", "Landroid/graphics/RectF;", "Lrkt;", "glyphPainter", "Lrkt;", "cashbackBadgeStyle", "Lru/yandex/taxi/plus/badge/CashbackBadgeStyle;", "Lru/yandex/taxi/plus/design/view/CashbackClipFrameLayout;", "rootView", "Lru/yandex/taxi/plus/design/view/CashbackClipFrameLayout;", "Landroid/widget/TextView;", "valueView", "Landroid/widget/TextView;", "promoView", "Landroid/widget/ImageView;", "iconView", "Landroid/widget/ImageView;", "plusIconOverrideDrawable", "Landroid/graphics/drawable/Drawable;", "defaultIconDrawable", "textPadding", "F", "radius", "glyphStartMargin", CA20Status.STATUS_USER_I, "valueTextWidth", "promoTextWidth", "customHeightDp", "Ljava/lang/Float;", "promoWidthAnimationRatio", "valueTextAlpha", "promoTextAlpha", "Companion", "u39", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackHorizontalView extends View {
    private static final float ALPHA_MINIMUM_DEVIATION = 0.001f;
    public static final u39 Companion = new u39();
    private static final float HEIGHT_DP = 20.0f;
    private static final float OUTLINE_SHADOW_ALPHA = 0.5f;
    private static final int PROMO_ANIMATION_FIRST_RUN_INITIAL_DELAY = 700;
    private static final int PROMO_ANIMATION_PHASE_DURATION = 500;
    private static final int PROMO_ANIMATION_PROMO_TEXT_DURATION = 2000;
    private static final int PROMO_ANIMATION_SECOND_RUN_INITIAL_DELAY = 2000;
    private static final float RADIUS_DP = 11.0f;
    private static final float TEXT_PADDING = 6.0f;
    private static final float TEXT_SIZE_DP = 13.0f;
    private final Paint backgroundPaint;
    private vh4 backgroundPainter;
    private CashbackBadgeStyle cashbackBadgeStyle;
    private Float customHeightDp;
    private final Drawable defaultIconDrawable;
    private rkt glyphPainter;
    private final int glyphStartMargin;
    private final float height;
    private final ImageView iconView;
    private Drawable plusIconOverrideDrawable;
    private final Interpolator promoAnimationInterpolator;
    private AnimatorSet promoAnimatorSet;
    private String promoText;
    private float promoTextAlpha;
    private float promoTextWidth;
    private final TextView promoView;
    private float promoWidthAnimationRatio;
    private final float radius;
    private final CashbackClipFrameLayout rootView;
    private final RectF textClipRectF;
    private final float textPadding;
    private final Paint textPaint;
    private String valueText;
    private float valueTextAlpha;
    private float valueTextWidth;
    private final TextView valueView;

    public CashbackHorizontalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.valueText = "";
        this.promoText = "";
        this.promoAnimationInterpolator = new DecelerateInterpolator();
        Paint paint = new Paint(65);
        this.textPaint = paint;
        this.backgroundPaint = new Paint(1);
        this.textClipRectF = new RectF();
        this.cashbackBadgeStyle = CashbackBadgeStyle.DARK_GRADIENT;
        this.textPadding = TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        this.radius = TypedValue.applyDimension(1, RADIUS_DP, getResources().getDisplayMetrics());
        this.height = TypedValue.applyDimension(1, HEIGHT_DP, getResources().getDisplayMetrics());
        this.valueTextAlpha = 1.0f;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e4i0.CashbackHorizontalView, i, 0);
        String string = obtainStyledAttributes.getString(e4i0.CashbackHorizontalView_android_text);
        this.valueText = string != null ? string : "";
        context.getResources().getDimensionPixelSize(gsg0.cashback_glyph_big_view_size);
        Drawable t = vng.t(n0h0.ic_plus_glyph_label, context);
        if (t == null) {
            xby.d.getClass();
            t = new ShapeDrawable();
        }
        this.defaultIconDrawable = t;
        this.glyphPainter = new rkt(t);
        this.glyphStartMargin = context.getResources().getDimensionPixelSize(gsg0.cashback_glyph_start_margin_small_badge);
        obtainStyledAttributes.recycle();
        CashbackClipFrameLayout cashbackClipFrameLayout = (CashbackClipFrameLayout) LayoutInflater.from(context).inflate(erh0.cashback_value_view, (ViewGroup) null);
        this.rootView = cashbackClipFrameLayout;
        cashbackClipFrameLayout.setLayoutDirection(getResources().getConfiguration().getLayoutDirection());
        TextView textView = (TextView) cashbackClipFrameLayout.findViewById(efh0.content_cashback_value_text);
        this.valueView = textView;
        this.promoView = (TextView) cashbackClipFrameLayout.findViewById(efh0.content_cashback_promo_text);
        ImageView imageView = (ImageView) cashbackClipFrameLayout.findViewById(efh0.content_cashback_icon_view);
        this.iconView = imageView;
        Drawable drawable = this.plusIconOverrideDrawable;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        paint.setTextSize(TypedValue.applyDimension(1, TEXT_SIZE_DP, getResources().getDisplayMetrics()));
        paint.setTypeface(textView.getTypeface());
        this.valueTextWidth = measureTextWidth(this.valueText);
        this.backgroundPainter = createBackgroundPainter(this.cashbackBadgeStyle);
        onBadgeStyleChanged(this.cashbackBadgeStyle);
    }

    private final boolean alphaAlmostTransparent(float alpha) {
        return alpha < ALPHA_MINIMUM_DEVIATION;
    }

    private final AnimatorSet collapseAndShowValueTextAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(this.promoAnimationInterpolator);
        ofFloat.addUpdateListener(new t39(this, 3));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setDuration(500L);
        ofFloat2.setInterpolator(this.promoAnimationInterpolator);
        ofFloat2.addUpdateListener(new t39(this, 4));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.setDuration(500L);
        ofFloat3.setInterpolator(this.promoAnimationInterpolator);
        ofFloat3.addUpdateListener(new t39(this, 5));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collapseAndShowValueTextAnimator$lambda$0(CashbackHorizontalView cashbackHorizontalView, ValueAnimator valueAnimator) {
        cashbackHorizontalView.promoWidthAnimationRatio = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cashbackHorizontalView.requestLayout();
        cashbackHorizontalView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collapseAndShowValueTextAnimator$lambda$1(CashbackHorizontalView cashbackHorizontalView, ValueAnimator valueAnimator) {
        cashbackHorizontalView.promoTextAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cashbackHorizontalView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collapseAndShowValueTextAnimator$lambda$2(CashbackHorizontalView cashbackHorizontalView, ValueAnimator valueAnimator) {
        cashbackHorizontalView.valueTextAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cashbackHorizontalView.invalidate();
    }

    private final vh4 createBackgroundPainter(CashbackBadgeStyle badgeStyle) {
        Float f = this.customHeightDp;
        float applyDimension = f != null ? TypedValue.applyDimension(1, f.floatValue(), getResources().getDisplayMetrics()) : this.height;
        float dimension = getResources().getDimension(gsg0.cashback_gradient_shadow_radius);
        int i = v39.a[badgeStyle.ordinal()];
        if (i == 1) {
            return new b6t0(this.backgroundPaint, this, getContext().getColor(mqg0.white), (int) Math.rint(applyDimension), (float) Math.rint(this.radius));
        }
        if (i == 2) {
            return new b6t0(this.backgroundPaint, this, getContext().getColor(mqg0.component_gray_225), (int) Math.rint(applyDimension), (float) Math.rint(this.radius));
        }
        if (i == 3 || i == 4 || i == 5) {
            return new xyt(this.backgroundPaint, new pm5(26, this), false, true, (int) Math.rint(applyDimension), (int) Math.rint(this.radius), dimension, getContext().getColor(tqg0.cashback_shadow_color), getContext().getColor(tqg0.cashback_small_shadow_color));
        }
        w511.b();
        return null;
    }

    private final void disableElevationShadow() {
        setOutlineProvider(null);
        setElevation(0.0f);
    }

    private final void enableElevationShadow() {
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.yandex.taxi.plus.badge.CashbackHorizontalView$enableElevationShadow$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f;
                float f2;
                int width = CashbackHorizontalView.this.getWidth();
                f = CashbackHorizontalView.this.height;
                f2 = CashbackHorizontalView.this.radius;
                outline.setRoundRect(0, 0, width, (int) f, f2);
                outline.setAlpha(0.5f);
            }
        });
        setElevation(TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics()));
    }

    private final AnimatorSet expandAndChangeToPromoTextAnimator(int initialDelay) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(this.promoAnimationInterpolator);
        ofFloat.addUpdateListener(new t39(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setDuration(500L);
        ofFloat2.setInterpolator(this.promoAnimationInterpolator);
        ofFloat2.addUpdateListener(new t39(this, 1));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.setDuration(500L);
        ofFloat3.setInterpolator(this.promoAnimationInterpolator);
        ofFloat3.addUpdateListener(new t39(this, 2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setStartDelay(initialDelay);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandAndChangeToPromoTextAnimator$lambda$0(CashbackHorizontalView cashbackHorizontalView, ValueAnimator valueAnimator) {
        cashbackHorizontalView.promoWidthAnimationRatio = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cashbackHorizontalView.requestLayout();
        cashbackHorizontalView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandAndChangeToPromoTextAnimator$lambda$1(CashbackHorizontalView cashbackHorizontalView, ValueAnimator valueAnimator) {
        cashbackHorizontalView.valueTextAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cashbackHorizontalView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandAndChangeToPromoTextAnimator$lambda$2(CashbackHorizontalView cashbackHorizontalView, ValueAnimator valueAnimator) {
        cashbackHorizontalView.promoTextAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cashbackHorizontalView.invalidate();
    }

    private final float getCustomDrawableScale(Drawable drawable) {
        return (this.defaultIconDrawable.getBounds().height() * 1.0f) / drawable.getIntrinsicHeight();
    }

    private final int getPaintColor(CashbackBadgeStyle badgeStyle) {
        if (badgeStyle != CashbackBadgeStyle.LIGHT_GRAY) {
            return getContext().getColor(mqg0.white);
        }
        return qje.t(xng0.textMinor, getContext());
    }

    private final float measureTextWidth(String text) {
        return (2.0f * this.textPadding) + this.textPaint.measureText(text);
    }

    private final void onBadgeStyleChanged(CashbackBadgeStyle badgeStyle) {
        int i = v39.a[this.cashbackBadgeStyle.ordinal()];
        if (i == 1) {
            this.rootView.setUseSolidPaint(false);
            enableElevationShadow();
        } else if (i == 2 || i == 3 || i == 5) {
            this.rootView.setSolidPaintColor(getPaintColor(badgeStyle));
            this.rootView.setUseSolidPaint(true);
            disableElevationShadow();
        } else {
            this.rootView.setSolidPaintColor(getPaintColor(badgeStyle));
            this.rootView.setUseSolidPaint(true);
            disableElevationShadow();
        }
        this.backgroundPainter = createBackgroundPainter(badgeStyle);
    }

    private final void renderContent(Canvas canvas) {
        boolean alphaAlmostTransparent = alphaAlmostTransparent(this.valueTextAlpha);
        TextView textView = this.valueView;
        if (alphaAlmostTransparent) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.valueView.setText(this.valueText);
            this.valueView.setAlpha(this.valueTextAlpha);
        }
        boolean alphaAlmostTransparent2 = alphaAlmostTransparent(this.promoTextAlpha);
        TextView textView2 = this.promoView;
        if (alphaAlmostTransparent2) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            this.promoView.setText(this.promoText);
            this.promoView.setAlpha(this.promoTextAlpha);
        }
        this.textClipRectF.top = getPaddingTop();
        this.textClipRectF.bottom = this.height - getPaddingBottom();
        this.textClipRectF.right = getPaddingEnd() + getWidth() + getPaddingStart();
        this.textClipRectF.left = getPaddingStart();
        canvas.clipRect(this.textClipRectF);
        canvas.drawBitmap(xw31.s(this.rootView), this.glyphStartMargin, (int) ((this.height - r0.getHeight()) / 2.0f), (Paint) null);
    }

    private final void setPlusIconDrawable(Drawable drawable) {
        this.glyphPainter = new rkt(drawable, getCustomDrawableScale(drawable));
        this.iconView.setImageDrawable(drawable);
        requestLayout();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startPromoTextAnimation$lambda$0(CashbackHorizontalView cashbackHorizontalView) {
        cashbackHorizontalView.promoWidthAnimationRatio = 0.0f;
        cashbackHorizontalView.promoTextAlpha = 0.0f;
        cashbackHorizontalView.valueTextAlpha = 1.0f;
        cashbackHorizontalView.requestLayout();
        cashbackHorizontalView.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.cashbackBadgeStyle != CashbackBadgeStyle.LIGHT_GRAY) {
            this.backgroundPainter.draw(canvas);
        }
        renderContent(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float abs = Math.abs(this.valueTextWidth - this.promoTextWidth);
        float f = this.valueTextWidth;
        float f2 = this.promoTextWidth;
        float f3 = this.promoWidthAnimationRatio;
        setMeasuredDimension(View.resolveSize(getPaddingEnd() + getPaddingStart() + ((int) Math.rint(f > f2 ? f - (abs * f3) : f + (abs * f3))) + this.glyphPainter.c, widthMeasureSpec), View.resolveSize(getPaddingBottom() + getPaddingTop() + this.backgroundPainter.b(), heightMeasureSpec));
    }

    public final void setBadgeStyle(CashbackBadgeStyle badgeStyle) {
        if (this.cashbackBadgeStyle == badgeStyle) {
            return;
        }
        this.cashbackBadgeStyle = badgeStyle;
        onBadgeStyleChanged(badgeStyle);
        requestLayout();
        invalidate();
    }

    public final void setCustomIcon(Drawable drawable) {
        this.plusIconOverrideDrawable = drawable;
        setPlusIconDrawable(drawable);
    }

    public final void setHeightDp(Float height) {
        this.customHeightDp = height;
        onBadgeStyleChanged(this.cashbackBadgeStyle);
        requestLayout();
        invalidate();
    }

    public final void setIsGradientEnabled(boolean isGradientEnabled) {
        CashbackClipFrameLayout cashbackClipFrameLayout = this.rootView;
        if (isGradientEnabled) {
            cashbackClipFrameLayout.enableGradient();
        } else {
            cashbackClipFrameLayout.disableGradient();
        }
    }

    public final void setPromoText(String text) {
        this.promoText = text;
    }

    public final void setTextColor(kdc color) {
        if (color == null) {
            this.rootView.enableGradient();
        } else {
            this.valueView.setTextColor(s8o.m(color, getContext()));
            this.rootView.disableGradient();
        }
    }

    public final void setValueText(String value) {
        if (value == null) {
            value = "";
        }
        this.valueText = value;
        this.valueTextWidth = measureTextWidth(value);
        requestLayout();
        invalidate();
    }

    public final void startPromoTextAnimation() {
        if (this.promoText.length() == 0) {
            return;
        }
        AnimatorSet animatorSet = this.promoAnimatorSet;
        if (animatorSet == null || !animatorSet.isStarted()) {
            this.promoTextWidth = measureTextWidth(this.promoText);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.promoAnimatorSet = animatorSet2;
            animatorSet2.playSequentially(expandAndChangeToPromoTextAnimator(PROMO_ANIMATION_FIRST_RUN_INITIAL_DELAY), collapseAndShowValueTextAnimator(), expandAndChangeToPromoTextAnimator(2000), collapseAndShowValueTextAnimator());
            AnimatorSet animatorSet3 = this.promoAnimatorSet;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new AnimUtils$AnimationEndListener(new dn7(19, this)));
            }
            AnimatorSet animatorSet4 = this.promoAnimatorSet;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
        }
    }

    public final void stopPromoTextAnimation() {
        AnimatorSet animatorSet = this.promoAnimatorSet;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    public final void useDefaultIcon() {
        if (this.plusIconOverrideDrawable == null) {
            return;
        }
        this.plusIconOverrideDrawable = null;
        setPlusIconDrawable(this.defaultIconDrawable);
    }

    public CashbackHorizontalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CashbackHorizontalView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CashbackHorizontalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
