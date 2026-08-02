package ru.yandex.taxi.plus.badge;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.b;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.dn7;
import defpackage.e4i0;
import defpackage.eja1;
import defpackage.gsg0;
import defpackage.jl40;
import defpackage.ju8;
import defpackage.k4o;
import defpackage.mg;
import defpackage.n0h0;
import defpackage.nsy0;
import defpackage.qkt;
import defpackage.rkt;
import defpackage.scc;
import defpackage.up11;
import defpackage.v19;
import defpackage.vng;
import defpackage.w19;
import defpackage.xby;
import defpackage.xw31;
import defpackage.y19;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.animation.AnimUtils$CancelAwareAnimationEndListener;
import ru.yandex.taxi.animation.BaseAnimatorListener;
import ru.yandex.taxi.plus.badge.CashbackAmountView;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 «\u00012\u00020\u0001:\u0006¬\u0001\u00ad\u0001®\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ7\u0010!\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J?\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\n¢\u0006\u0004\b-\u0010\fJ\r\u0010.\u001a\u00020\n¢\u0006\u0004\b.\u0010\fJ\r\u0010/\u001a\u00020\n¢\u0006\u0004\b/\u0010\fJ\u001d\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b1\u00102J%\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b1\u00103J\u0017\u00105\u001a\u00020\n2\b\b\u0001\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\n2\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00106J\u0017\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0014¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0014¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010BJ%\u0010F\u001a\b\u0012\u0004\u0012\u00020E0(2\u0006\u00100\u001a\u00020)2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010\fJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u0011\u0010Q\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bQ\u0010RJ\u0011\u0010S\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bS\u0010RJ\u001f\u0010W\u001a\u00020V2\u0006\u0010T\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0006H\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0006H\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0006H\u0002¢\u0006\u0004\b[\u0010ZJ\u000f\u0010\\\u001a\u00020MH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020MH\u0002¢\u0006\u0004\b^\u0010]J\u000f\u0010_\u001a\u00020\nH\u0002¢\u0006\u0004\b_\u0010\fJ\u000f\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\nH\u0002¢\u0006\u0004\bc\u0010\fJ'\u0010f\u001a\u00020\n2\u0006\u0010d\u001a\u00020\u00132\u0006\u0010e\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bf\u0010gJ'\u0010h\u001a\u00020\n2\u0006\u00100\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bh\u00103J\u0017\u0010j\u001a\u00020\n2\u0006\u0010i\u001a\u00020VH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020)2\u0006\u00100\u001a\u00020)H\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00062\u0006\u0010n\u001a\u00020\u0006H\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\u00062\u0006\u0010q\u001a\u00020\u0006H\u0002¢\u0006\u0004\br\u0010pJ\u0017\u0010t\u001a\u00020M2\u0006\u0010s\u001a\u00020MH\u0002¢\u0006\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020M8\u0002X\u0082D¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010{\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0082\u0001\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008d\u0001\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010wR\u0018\u0010\u008e\u0001\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010wR\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0081\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008c\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009b\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009b\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009b\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009b\u0001R\u0019\u0010 \u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u009b\u0001R\u0019\u0010¡\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009b\u0001R\u0019\u0010¢\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010£\u0001R\u0017\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010£\u0001R\u0019\u0010¥\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u009b\u0001R\u0019\u0010¨\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u009b\u0001R\u0019\u0010©\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¦\u0001R\u0017\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010¦\u0001R\u0017\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010ª\u0001¨\u0006¯\u0001"}, d2 = {"Lru/yandex/taxi/plus/badge/CashbackAmountView;", "Lru/yandex/taxi/plus/badge/CashbackBackgroundView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onDetachedFromWindow", "()V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "value", "", "shouldShowGlyph", "updateAmount", "(DZ)V", "Lru/yandex/taxi/plus/badge/CashbackAmountView$GlyphPosition;", "glyphPosition", "(DZLru/yandex/taxi/plus/badge/CashbackAmountView$GlyphPosition;)V", "currentValue", "futureValue", "animateScale", "Ljava/lang/Runnable;", "onAnimationEnd", "updateAmountAnimated", "(DDZZLjava/lang/Runnable;)V", "start", "end", "animate", "setValues", "(DDZZZLjava/lang/Runnable;)V", "", "", "promoTexts", "startPromoAnimation", "(Ljava/util/List;)Z", "stopPromoAnimation", "stopValueAnimation", "stopAnimations", "text", "setText", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;ZLru/yandex/taxi/plus/badge/CashbackAmountView$GlyphPosition;)V", "textColor", "setTextColor", "(I)V", CaretView.ALPHA_PROPERTY, "setTextAlpha", "Landroid/graphics/Canvas;", "canvas", "doChildDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "applyAttributes", "(Landroid/util/AttributeSet;I)V", "", "startDelay", "Landroid/animation/Animator;", "singlePromoTextAnimators", "(Ljava/lang/String;J)Ljava/util/List;", "Landroid/graphics/Typeface;", "typeface", "setTypeface", "(Landroid/graphics/Typeface;)V", "updateHeights", "", "animationProgress", "progressChanged", "(F)V", "expandAnimation", "()Landroid/animation/Animator;", "collapseAnimation", "srcWidth", "dstWidth", "Landroid/animation/ValueAnimator;", "widthAnimator", "(II)Landroid/animation/ValueAnimator;", "computeDesiredWidth", "()I", "computeDesiredHeight", "computeTextBaseline", "()F", "computeValueBaseline", "initGlyphProperties", "Lnsy0;", "initAnimationController", "()Lnsy0;", "checkForRelayout", "current", "future", "updateValues", "(DDZ)V", "updateText", "animator", "onTextAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "ellipsizeCashbackText", "(Ljava/lang/String;)Ljava/lang/String;", "glyphHeight", "computeGlyphStartY", "(I)I", "glyphWidth", "computeGlyphStartX", "textWidth", "computeTextStartX", "(F)F", "fromBottomToCenterAnimationFinishValue", "F", "Landroid/view/animation/Interpolator;", "decelerateInterpolator", "Landroid/view/animation/Interpolator;", "textAnimator", "Landroid/animation/ValueAnimator;", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "currentText", "Ljava/lang/String;", "textRollerAnimationController", "Lnsy0;", "Lqkt;", "glyphFactory", "Lqkt;", "Lrkt;", "glyphPainter", "Lrkt;", "Landroid/animation/AnimatorSet;", "valueAnimatorSet", "Landroid/animation/AnimatorSet;", "valueTextVerticalShiftFraction", "promoTextVerticalShiftFraction", "currentPromoText", "promoAnimatorSet", "Lv19;", "amountFormat", "Lv19;", "Landroid/graphics/RectF;", "textClipRect", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "textClipPath", "Landroid/graphics/Path;", "animatedWidth", CA20Status.STATUS_USER_I, "lastMeasuredDesiredWidth", "lastMeasuredDesiredHeight", "currentContentWidth", "targetContentWidth", "textHeight", "valueHeight", "startValue", CA20Status.STATUS_REQUEST_D, "endValue", "areValuesInitialized", "Z", "glyphStartMargin", "glyphToTextMargin", "isInTextMode", "Lru/yandex/taxi/plus/badge/CashbackAmountView$GlyphPosition;", "Companion", "GlyphPosition", "mg", "y19", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackAmountView extends CashbackBackgroundView {
    private static final int ALPHA_MAX = 255;
    private static final long ANIMATION_DELAY = 500;
    private static final int CASHBACK_TEXT_MAX_LENGTH = 10;
    private static final y19 Companion = new y19();
    private static final int DEFAULT_ANIMATED_WIDTH = -1;
    private static final int GRADIENT_ANIMATION_LENGTH = 1500;
    private static final long PROMO_ANIMATION_FIRST_RUN_INITIAL_DELAY = 3000;
    private static final long PROMO_ANIMATION_PHASE_DURATION = 500;
    private static final long PROMO_ANIMATION_PROMO_TEXT_DURATION = 2000;
    private static final long PROMO_ANIMATION_SUBSEQUENT_RUNS_INITIAL_DELAY = 2000;
    private static final float SCALE_ANIMATION_RATIO = 1.4f;
    private final v19 amountFormat;
    private int animatedWidth;
    private boolean areValuesInitialized;
    private int currentContentWidth;
    private String currentPromoText;
    private String currentText;
    private double currentValue;
    private final Interpolator decelerateInterpolator;
    private double endValue;
    private final float fromBottomToCenterAnimationFinishValue;
    private final qkt glyphFactory;
    private rkt glyphPainter;
    private GlyphPosition glyphPosition;
    private int glyphStartMargin;
    private int glyphToTextMargin;
    private boolean isInTextMode;
    private int lastMeasuredDesiredHeight;
    private int lastMeasuredDesiredWidth;
    private AnimatorSet promoAnimatorSet;
    private float promoTextVerticalShiftFraction;
    private boolean shouldShowGlyph;
    private double startValue;
    private int targetContentWidth;
    private final ValueAnimator textAnimator;
    private final Path textClipPath;
    private final RectF textClipRect;
    private int textHeight;
    private final TextPaint textPaint;
    private final nsy0 textRollerAnimationController;
    private AnimatorSet valueAnimatorSet;
    private int valueHeight;
    private float valueTextVerticalShiftFraction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/plus/badge/CashbackAmountView$GlyphPosition;", "", "START", "END", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class GlyphPosition {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ GlyphPosition[] $VALUES;
        public static final GlyphPosition END;
        public static final GlyphPosition START;

        static {
            GlyphPosition glyphPosition = new GlyphPosition("START", 0);
            START = glyphPosition;
            GlyphPosition glyphPosition2 = new GlyphPosition("END", 1);
            END = glyphPosition2;
            GlyphPosition[] glyphPositionArr = {glyphPosition, glyphPosition2};
            $VALUES = glyphPositionArr;
            $ENTRIES = a.a(glyphPositionArr);
        }

        public static GlyphPosition valueOf(String str) {
            return (GlyphPosition) Enum.valueOf(GlyphPosition.class, str);
        }

        public static GlyphPosition[] values() {
            return (GlyphPosition[]) $VALUES.clone();
        }
    }

    public CashbackAmountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fromBottomToCenterAnimationFinishValue = 1.0f;
        this.decelerateInterpolator = new DecelerateInterpolator();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.textAnimator = ofFloat;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.currentText = "";
        this.promoTextVerticalShiftFraction = 1.0f;
        this.amountFormat = new v19(Locale.getDefault());
        this.textClipRect = new RectF();
        this.textClipPath = new Path();
        this.animatedWidth = -1;
        this.glyphPosition = GlyphPosition.END;
        textPaint.setTextAlign(Paint.Align.LEFT);
        this.glyphFactory = new qkt(context);
        initGlyphProperties();
        applyAttributes(attributeSet, i);
        nsy0 initAnimationController = initAnimationController();
        this.textRollerAnimationController = initAnimationController;
        initAnimationController.b(this.startValue, this.currentValue);
        int[] iArr = up11.a;
        setTypeface(eja1.w(3, 0));
        ofFloat.setDuration(OperationProgressView.ROTATION_ANIMATION_DURATION);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new w19(this, 3));
        if (isInEditMode()) {
            updateText("800", true, this.glyphPosition);
        }
        b.p(this, new mg(12, this));
    }

    private final void applyAttributes(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, e4i0.CashbackAmountView, defStyleAttr, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e4i0.CashbackAmountView_cashbackTextSize, 0);
            int color = obtainStyledAttributes.getColor(e4i0.CashbackAmountView_cashbackTextColor, getContext().getColor(R.color.white));
            this.textPaint.setTextSize(dimensionPixelSize);
            this.textPaint.setColor(color);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void checkForRelayout() {
        boolean z = this.lastMeasuredDesiredWidth != computeDesiredWidth();
        boolean z2 = this.lastMeasuredDesiredHeight != computeDesiredHeight();
        if (z || z2) {
            requestLayout();
        }
    }

    private final Animator collapseAnimation() {
        int paddingEnd = getPaddingEnd() + getPaddingStart() + this.currentContentWidth;
        int paddingEnd2 = getPaddingEnd() + getPaddingStart() + this.targetContentWidth;
        if (paddingEnd > paddingEnd2) {
            return widthAnimator(paddingEnd, paddingEnd2);
        }
        return null;
    }

    private final int computeDesiredHeight() {
        return getPaddingBottom() + getPaddingTop();
    }

    private final int computeDesiredWidth() {
        int i = this.animatedWidth;
        if (i != -1) {
            return i;
        }
        int i2 = this.currentContentWidth;
        if (i2 == 0) {
            return 0;
        }
        return getPaddingRight() + getPaddingLeft() + i2;
    }

    private final int computeGlyphStartX(int glyphWidth) {
        return this.glyphPosition == GlyphPosition.START ? this.glyphStartMargin : (getWidth() - glyphWidth) - this.glyphStartMargin;
    }

    private final int computeGlyphStartY(int glyphHeight) {
        return ((ovalHeight() - glyphHeight) / 2) + ovalTop();
    }

    private final float computeTextBaseline() {
        return (this.textHeight / 2.0f) + (ovalHeight() / 2.0f) + ovalTop();
    }

    private final float computeTextStartX(float textWidth) {
        return this.glyphPosition == GlyphPosition.START ? (getWidth() - getPaddingEnd()) - textWidth : getPaddingStart();
    }

    private final float computeValueBaseline() {
        return (this.valueHeight / 2.0f) + (ovalHeight() / 2.0f) + ovalTop();
    }

    private final String ellipsizeCashbackText(String text) {
        if (text.length() <= 10) {
            return text;
        }
        this.textPaint.getTextBounds(text, 0, 10, new Rect());
        return TextUtils.ellipsize(text, this.textPaint, r0.width(), TextUtils.TruncateAt.END).toString();
    }

    private final Animator expandAnimation() {
        int paddingEnd = getPaddingEnd() + getPaddingStart() + this.currentContentWidth;
        int paddingEnd2 = getPaddingEnd() + getPaddingStart() + this.targetContentWidth;
        if (paddingEnd < paddingEnd2) {
            return widthAnimator(paddingEnd, paddingEnd2);
        }
        return null;
    }

    private final nsy0 initAnimationController() {
        return new nsy0(new ju8(5, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect initAnimationController$lambda$0(CashbackAmountView cashbackAmountView) {
        return new Rect(cashbackAmountView.getPaddingStart(), cashbackAmountView.getPaddingTop(), cashbackAmountView.getWidth() - cashbackAmountView.getPaddingEnd(), cashbackAmountView.ovalHeight() + cashbackAmountView.getPaddingTop());
    }

    private final void initGlyphProperties() {
        int ovalHeight = ovalHeight();
        qkt qktVar = this.glyphFactory;
        int i = qktVar.b;
        Context context = qktVar.a;
        Drawable t = ovalHeight > i ? vng.t(n0h0.ic_plus_glyph_badge_big, context) : vng.t(n0h0.ic_plus_glyph_badge_small, context);
        if (t == null) {
            xby.d.getClass();
            t = new ShapeDrawable();
        }
        this.glyphPainter = new rkt(t);
        qkt qktVar2 = this.glyphFactory;
        int i2 = qktVar2.b;
        Context context2 = qktVar2.a;
        this.glyphStartMargin = ovalHeight > i2 ? context2.getResources().getDimensionPixelSize(gsg0.cashback_glyph_start_margin_big_badge) : context2.getResources().getDimensionPixelSize(gsg0.cashback_glyph_start_margin_small_badge);
        qkt qktVar3 = this.glyphFactory;
        this.glyphToTextMargin = ovalHeight > qktVar3.b ? 0 : qktVar3.a.getResources().getDimensionPixelSize(gsg0.cashback_glyph_to_text_margin_small_badge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTextAnimationUpdate(ValueAnimator animator) {
        progressChanged(((Float) animator.getAnimatedValue()).floatValue());
        postInvalidateOnAnimation();
    }

    private final void progressChanged(float animationProgress) {
        double d = this.startValue;
        double d2 = (int) (((this.endValue - d) * animationProgress) + d);
        this.currentValue = d2;
        this.currentText = this.amountFormat.a.format(Double.valueOf(d2));
        this.textRollerAnimationController.b.b = animationProgress;
    }

    private final void setTypeface(Typeface typeface) {
        this.textPaint.setTypeface(typeface);
        this.textRollerAnimationController.c();
        updateHeights();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setValues$lambda$0(CashbackAmountView cashbackAmountView, boolean z, ValueAnimator valueAnimator) {
        cashbackAmountView.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        if (z) {
            cashbackAmountView.setTranslationX((((Float) valueAnimator.getAnimatedValue()).floatValue() * cashbackAmountView.getWidth()) - cashbackAmountView.getWidth());
        }
        cashbackAmountView.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setValues$lambda$1(CashbackAmountView cashbackAmountView, boolean z, ValueAnimator valueAnimator) {
        cashbackAmountView.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        if (z) {
            cashbackAmountView.setTranslationX((((Float) valueAnimator.getAnimatedValue()).floatValue() * cashbackAmountView.getWidth()) - cashbackAmountView.getWidth());
        }
        cashbackAmountView.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final List<Animator> singlePromoTextAnimators(final String text, long startDelay) {
        if (text.length() == 0) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        rkt rktVar = this.glyphPainter;
        int i = (rktVar == null || !this.shouldShowGlyph) ? 0 : rktVar.c + this.glyphToTextMargin;
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int measureText = ((int) this.textPaint.measureText(this.currentText)) + i + paddingEnd;
        int measureText2 = ((int) this.textPaint.measureText(text)) + i + paddingEnd;
        ValueAnimator ofInt = ValueAnimator.ofInt(measureText, measureText2);
        ofInt.addListener(new BaseAnimatorListener() { // from class: ru.yandex.taxi.plus.badge.CashbackAmountView$singlePromoTextAnimators$1
            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                CashbackAmountView.this.valueTextVerticalShiftFraction = 1.0f;
            }

            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                CashbackAmountView.this.currentPromoText = text;
            }
        });
        ofInt.addUpdateListener(new w19(this, 1));
        ofInt.setInterpolator(this.decelerateInterpolator);
        ofInt.setStartDelay(startDelay);
        ofInt.setDuration(500L);
        arrayList.add(ofInt);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(measureText2, measureText);
        ofInt2.addUpdateListener(new w19(this, 2));
        ofInt2.setInterpolator(this.decelerateInterpolator);
        ofInt2.setDuration(500L);
        ofInt2.setStartDelay(2000L);
        arrayList.add(ofInt2);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void singlePromoTextAnimators$lambda$0(CashbackAmountView cashbackAmountView, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        cashbackAmountView.valueTextVerticalShiftFraction = -animatedFraction;
        cashbackAmountView.promoTextVerticalShiftFraction = 1.0f - animatedFraction;
        cashbackAmountView.animatedWidth = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        cashbackAmountView.checkForRelayout();
        cashbackAmountView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void singlePromoTextAnimators$lambda$1(CashbackAmountView cashbackAmountView, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        cashbackAmountView.valueTextVerticalShiftFraction = 1.0f - animatedFraction;
        cashbackAmountView.promoTextVerticalShiftFraction = -animatedFraction;
        cashbackAmountView.animatedWidth = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        cashbackAmountView.checkForRelayout();
        cashbackAmountView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startPromoAnimation$lambda$0(CashbackAmountView cashbackAmountView) {
        cashbackAmountView.animatedWidth = -1;
        cashbackAmountView.valueTextVerticalShiftFraction = 0.0f;
        cashbackAmountView.promoTextVerticalShiftFraction = 1.0f;
        cashbackAmountView.checkForRelayout();
        cashbackAmountView.invalidate();
    }

    private final void updateHeights() {
        Rect rect = new Rect();
        this.textPaint.getTextBounds("a", 0, 1, rect);
        this.textHeight = rect.height();
        Rect rect2 = new Rect();
        this.textPaint.getTextBounds("1", 0, 1, rect2);
        this.valueHeight = rect2.height();
    }

    private final void updateText(String text, boolean shouldShowGlyph, GlyphPosition glyphPosition) {
        setTextAlpha(255);
        this.isInTextMode = true;
        this.shouldShowGlyph = shouldShowGlyph;
        this.glyphPosition = glyphPosition;
        String ellipsizeCashbackText = ellipsizeCashbackText(text);
        this.currentText = ellipsizeCashbackText;
        rkt rktVar = this.glyphPainter;
        int i = (rktVar == null || !shouldShowGlyph) ? 0 : rktVar.c + this.glyphToTextMargin;
        int measureText = ((int) this.textPaint.measureText(ellipsizeCashbackText)) + i;
        this.currentContentWidth = measureText;
        this.targetContentWidth = measureText + i;
    }

    private final void updateValues(double current, double future, boolean shouldShowGlyph) {
        setTextAlpha(255);
        int i = 0;
        this.isInTextMode = false;
        this.shouldShowGlyph = shouldShowGlyph;
        this.startValue = current;
        this.currentValue = current;
        this.endValue = future;
        this.areValuesInitialized = true;
        v19 v19Var = this.amountFormat;
        String format = v19Var.a.format(Double.valueOf(current));
        this.currentText = format;
        rkt rktVar = this.glyphPainter;
        if (rktVar != null && shouldShowGlyph) {
            i = rktVar.c + this.glyphToTextMargin;
        }
        this.currentContentWidth = ((int) this.textPaint.measureText(format)) + i;
        TextPaint textPaint = this.textPaint;
        v19 v19Var2 = this.amountFormat;
        this.targetContentWidth = ((int) textPaint.measureText(v19Var2.a.format(Double.valueOf(this.endValue)))) + i;
        checkForRelayout();
    }

    private final ValueAnimator widthAnimator(int srcWidth, int dstWidth) {
        ValueAnimator ofInt = ValueAnimator.ofInt(srcWidth, dstWidth);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new w19(this, 0));
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.plus.badge.CashbackAmountView$widthAnimator$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                CashbackAmountView.this.animatedWidth = -1;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                int i;
                CashbackAmountView.this.animatedWidth = -1;
                CashbackAmountView cashbackAmountView = CashbackAmountView.this;
                i = cashbackAmountView.targetContentWidth;
                cashbackAmountView.currentContentWidth = i;
            }
        });
        ofInt.setInterpolator(new LinearInterpolator());
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void widthAnimator$lambda$0(CashbackAmountView cashbackAmountView, ValueAnimator valueAnimator) {
        cashbackAmountView.animatedWidth = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        cashbackAmountView.checkForRelayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    @Override // ru.yandex.taxi.plus.badge.CashbackBackgroundView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doChildDraw(Canvas canvas) {
        Canvas canvas2;
        rkt rktVar;
        canvas.save();
        AnimatorSet animatorSet = this.promoAnimatorSet;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.textClipRect.top = getPaddingTop();
            this.textClipRect.bottom = getPaddingTop() + getGradientOvalHeight();
            this.textClipRect.right = getWidth();
            this.textClipRect.left = 0.0f;
            this.textClipPath.reset();
            this.textClipPath.addRoundRect(this.textClipRect, getCornerRadius(), getCornerRadius(), Path.Direction.CW);
            canvas.clipPath(this.textClipPath);
        }
        int height = (int) (this.valueTextVerticalShiftFraction * getHeight());
        int height2 = (int) (this.promoTextVerticalShiftFraction * getHeight());
        if (this.isInTextMode) {
            canvas.drawText(this.currentText, computeTextStartX(this.textPaint.measureText(this.currentText)), computeTextBaseline() + height, this.textPaint);
        } else if (this.areValuesInitialized) {
            canvas2 = canvas;
            this.textRollerAnimationController.a(canvas2, this.textPaint, computeTextStartX(this.textPaint.measureText(this.amountFormat.a.format(Double.valueOf(this.startValue)))), computeTextStartX(this.textPaint.measureText(this.amountFormat.a.format(Double.valueOf(this.endValue)))), computeValueBaseline() + height);
            if (this.promoTextVerticalShiftFraction < 0.99d) {
                canvas2.drawText(this.currentPromoText, computeTextStartX(this.textPaint.measureText(this.currentPromoText)), computeTextBaseline() + height2, this.textPaint);
            }
            rktVar = this.glyphPainter;
            if (rktVar != null && this.shouldShowGlyph) {
                int computeGlyphStartX = computeGlyphStartX(rktVar.c);
                int computeGlyphStartY = computeGlyphStartY(this.glyphPainter.d);
                canvas2.save();
                canvas2.translate(computeGlyphStartX, computeGlyphStartY);
                float f = rktVar.b;
                canvas2.scale(f, f);
                rktVar.a.draw(canvas2);
                canvas2.restore();
            }
            canvas2.restore();
        }
        canvas2 = canvas;
        if (this.promoTextVerticalShiftFraction < 0.99d) {
        }
        rktVar = this.glyphPainter;
        if (rktVar != null) {
            int computeGlyphStartX2 = computeGlyphStartX(rktVar.c);
            int computeGlyphStartY2 = computeGlyphStartY(this.glyphPainter.d);
            canvas2.save();
            canvas2.translate(computeGlyphStartX2, computeGlyphStartY2);
            float f2 = rktVar.b;
            canvas2.scale(f2, f2);
            rktVar.a.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override // ru.yandex.taxi.plus.badge.CashbackBackgroundView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.valueAnimatorSet;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    @Override // ru.yandex.taxi.plus.badge.CashbackBackgroundView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.lastMeasuredDesiredWidth = computeDesiredWidth();
        this.lastMeasuredDesiredHeight = computeDesiredHeight();
        setMeasuredDimension(View.resolveSize(this.lastMeasuredDesiredWidth, widthMeasureSpec), View.resolveSize(this.lastMeasuredDesiredHeight, heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        setPivotX(w);
        setPivotY(0.0f);
    }

    public final void setText(String text, boolean shouldShowGlyph, GlyphPosition glyphPosition) {
        if (jl40.l(ellipsizeCashbackText(text), this.currentText) && this.shouldShowGlyph == shouldShowGlyph && this.glyphPosition == glyphPosition) {
            return;
        }
        stopAnimations();
        updateText(text, shouldShowGlyph, glyphPosition);
        checkForRelayout();
        invalidate();
    }

    public final void setTextAlpha(int alpha) {
        this.textPaint.setAlpha(alpha);
        this.textRollerAnimationController.c();
    }

    public final void setTextColor(int textColor) {
        this.textPaint.setColor(getContext().getColor(textColor));
        this.textRollerAnimationController.c();
    }

    public final void setValues(double start, double end, boolean shouldShowGlyph, boolean animate, boolean animateScale, Runnable onAnimationEnd) {
        AnimatorSet animatorSet;
        stopValueAnimation();
        updateValues(start, end, shouldShowGlyph);
        this.textRollerAnimationController.c();
        this.textRollerAnimationController.b(start, end);
        if (!animate || end < start) {
            updateValues(end, end, shouldShowGlyph);
            progressChanged(this.fromBottomToCenterAnimationFinishValue);
            checkForRelayout();
            invalidate();
            return;
        }
        stopPromoAnimation();
        ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        final boolean n = xw31.n(getContext());
        if (animateScale) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, SCALE_ANIMATION_RATIO);
            ofFloat.setDuration(500L);
            ofFloat.setInterpolator(this.decelerateInterpolator);
            final int i = 0;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: x19
                public final /* synthetic */ CashbackAmountView b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i2 = i;
                    boolean z = n;
                    CashbackAmountView cashbackAmountView = this.b;
                    switch (i2) {
                        case 0:
                            CashbackAmountView.setValues$lambda$0(cashbackAmountView, z, valueAnimator);
                            break;
                        default:
                            CashbackAmountView.setValues$lambda$1(cashbackAmountView, z, valueAnimator);
                            break;
                    }
                }
            });
            arrayList2.add(ofFloat);
        }
        Animator expandAnimation = expandAnimation();
        if (expandAnimation != null) {
            arrayList2.add(expandAnimation);
        }
        arrayList2.add(this.textAnimator);
        animatorSet2.playTogether(arrayList2);
        arrayList.add(animatorSet2);
        Animator collapseAnimation = collapseAnimation();
        if (collapseAnimation != null) {
            arrayList.add(collapseAnimation);
        }
        if (animateScale) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(SCALE_ANIMATION_RATIO, 1.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.setInterpolator(this.decelerateInterpolator);
            final int i2 = 1;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: x19
                public final /* synthetic */ CashbackAmountView b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i22 = i2;
                    boolean z = n;
                    CashbackAmountView cashbackAmountView = this.b;
                    switch (i22) {
                        case 0:
                            CashbackAmountView.setValues$lambda$0(cashbackAmountView, z, valueAnimator);
                            break;
                        default:
                            CashbackAmountView.setValues$lambda$1(cashbackAmountView, z, valueAnimator);
                            break;
                    }
                }
            });
            arrayList.add(ofFloat2);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.valueAnimatorSet = animatorSet3;
        animatorSet3.playSequentially(arrayList);
        AnimatorSet animatorSet4 = this.valueAnimatorSet;
        if (animatorSet4 != null) {
            animatorSet4.setStartDelay(500L);
        }
        if (onAnimationEnd != null && (animatorSet = this.valueAnimatorSet) != null) {
            animatorSet.addListener(new AnimUtils$CancelAwareAnimationEndListener(onAnimationEnd));
        }
        AnimatorSet animatorSet5 = this.valueAnimatorSet;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final boolean startPromoAnimation(List<String> promoTexts) {
        AnimatorSet animatorSet;
        if (!promoTexts.isEmpty() && ((animatorSet = this.valueAnimatorSet) == null || !animatorSet.isRunning())) {
            stopPromoAnimation();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.promoAnimatorSet = animatorSet2;
            animatorSet2.addListener(new AnimUtils$AnimationEndListener(new dn7(16, this)));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : promoTexts) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                String str = (String) obj;
                if (i == 0) {
                    arrayList.addAll(singlePromoTextAnimators(str, 3000L));
                } else {
                    arrayList.addAll(singlePromoTextAnimators(str, 2000L));
                }
                i = i2;
            }
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet3 = this.promoAnimatorSet;
                if (animatorSet3 != null) {
                    animatorSet3.playSequentially(arrayList);
                }
                AnimatorSet animatorSet4 = this.promoAnimatorSet;
                if (animatorSet4 != null) {
                    animatorSet4.start();
                }
                return true;
            }
        }
        return false;
    }

    public final void stopAnimations() {
        stopPromoAnimation();
        stopValueAnimation();
    }

    public final void stopPromoAnimation() {
        AnimatorSet animatorSet = this.promoAnimatorSet;
        if (animatorSet != null) {
            animatorSet.end();
        }
        checkForRelayout();
        invalidate();
    }

    public final void stopValueAnimation() {
        AnimatorSet animatorSet = this.valueAnimatorSet;
        if (animatorSet != null) {
            animatorSet.end();
        }
        checkForRelayout();
        invalidate();
    }

    public final void updateAmount(double value, boolean shouldShowGlyph, GlyphPosition glyphPosition) {
        this.glyphPosition = glyphPosition;
        setValues(value, value, shouldShowGlyph, false, false, null);
    }

    public final void updateAmountAnimated(double currentValue, double futureValue, boolean shouldShowGlyph, boolean animateScale, Runnable onAnimationEnd) {
        setValues(currentValue, futureValue, shouldShowGlyph, true, animateScale, onAnimationEnd);
    }

    public final void updateAmount(double value, boolean shouldShowGlyph) {
        updateAmount(value, shouldShowGlyph, this.glyphPosition);
    }

    public final void setText(String text, boolean shouldShowGlyph) {
        setText(text, shouldShowGlyph, this.glyphPosition);
    }

    public CashbackAmountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CashbackAmountView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CashbackAmountView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
