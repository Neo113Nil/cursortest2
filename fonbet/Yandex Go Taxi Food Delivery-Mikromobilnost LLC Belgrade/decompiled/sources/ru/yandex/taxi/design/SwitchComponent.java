package ru.yandex.taxi.design;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.c4i0;
import defpackage.lh;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.qke;
import defpackage.tje;
import defpackage.unr0;
import defpackage.wyw0;
import defpackage.xng0;
import defpackage.xyw0;
import defpackage.yd2;
import defpackage.zyw0;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u0084\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0007\u0085\u0001\u0010\u0086\u0001\u0081\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\b\b\u0001\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0017J!\u0010\u001e\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\t2\b\b\u0001\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010#J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010#J\r\u0010+\u001a\u00020 ¢\u0006\u0004\b+\u0010'J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0012H\u0014¢\u0006\u0004\b0\u0010%J\u000f\u00101\u001a\u00020\u0012H\u0014¢\u0006\u0004\b1\u0010%J\u000f\u00103\u001a\u000202H\u0014¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u000202H\u0014¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0012H\u0014¢\u0006\u0004\b8\u0010%J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\tH\u0004¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u0010%J\u001f\u0010@\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tH\u0014¢\u0006\u0004\b@\u0010\u001fJ\u0017\u0010C\u001a\u00020\u00122\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\u00122\u0006\u0010H\u001a\u00020 ¢\u0006\u0004\bI\u0010#J\u0015\u0010J\u001a\u00020\u00122\u0006\u0010H\u001a\u00020 ¢\u0006\u0004\bJ\u0010#J)\u0010K\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\bK\u0010\fJ\u000f\u0010L\u001a\u00020\u0012H\u0002¢\u0006\u0004\bL\u0010%J\u001f\u0010N\u001a\u00020\u00122\u0006\u0010&\u001a\u00020 2\u0006\u0010M\u001a\u00020 H\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010R\u001a\u00020\u00122\b\b\u0001\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00122\u0006\u0010T\u001a\u00020PH\u0002¢\u0006\u0004\bU\u0010SJ\u000f\u0010V\u001a\u00020\u0012H\u0002¢\u0006\u0004\bV\u0010%J\u000f\u0010W\u001a\u00020\u0012H\u0002¢\u0006\u0004\bW\u0010%J\u000f\u0010X\u001a\u00020\u0012H\u0002¢\u0006\u0004\bX\u0010%J\u0017\u0010Y\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bY\u0010/J\u0017\u0010Z\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bZ\u0010/J\u000f\u0010[\u001a\u00020 H\u0002¢\u0006\u0004\b[\u0010'R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010oR\u0016\u0010r\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010t\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010sR\u0016\u0010&\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010yR\u0016\u0010z\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010uR\u0016\u0010{\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010wR\u0016\u0010|\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010wR\u0016\u0010}\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b}\u0010wR\u0016\u0010~\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010wR\u0016\u0010\u007f\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010yR\u0018\u0010\u0080\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010yR\u001c\u0010\u0082\u0001\u001a\u00070\u0081\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Lru/yandex/taxi/design/SwitchComponent;", "Landroid/view/View;", "Landroid/widget/Checkable;", "Lnwy0;", "Llh;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/FrameLayout$LayoutParams;", "generateDefaultFrameLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "Lxyw0;", "listener", "Lzy11;", "setOnCheckedChangedListener", "(Lxyw0;)V", "colorAttr", "setUncheckedColorAttr", "(I)V", "setTrackColorAttr", "colorId", "setUncheckedTrackColor", "checkedColor", "setTrackColor", "uncheckedColor", "setTrackColors", "(II)V", "", "checked", "setCheckedWithAnimation", "(Z)V", "toggleWithAnimation", "()V", "isChecked", "()Z", "setChecked", BackendConfig.Restrictions.ENABLED, "setEnabled", "performClick", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", ClidProvider.STATE, "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "drawableStateChanged", "extraSpace", "", "onCreateDrawableState", "(I)[I", "toggle", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroidx/core/view/AccessibilityDelegateCompat;", "provideAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "value", "setAutoToggle", "setHapticEnabled", "initAttrs", "initPaints", "animate", "setCheckedInternal", "(ZZ)V", "", "progress", "setThumbProgress", "(F)V", "newProgress", "animateProgress", "cancelProgressAnimation", "updateBackgroundPaint", "updateThumbPaint", "drawBackground", "drawThumb", "isLayoutRTL", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "animatorUpdateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/Animator$AnimatorListener;", "animatorListener", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "Landroid/view/animation/Interpolator;", "progressInterpolator", "Landroid/view/animation/Interpolator;", "Landroid/animation/ValueAnimator;", "progressAnimator", "Landroid/animation/ValueAnimator;", "checkedChangedListener", "Lxyw0;", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "thumbPaint", "Landroid/content/res/ColorStateList;", "backgroundColorList", "Landroid/content/res/ColorStateList;", "thumbRadius", "F", "thumbSidePadding", CA20Status.STATUS_USER_I, "thumbColorList", "Z", "thumbProgress", "uncheckedBackgroundColor", "checkedBackgroundColor", "uncheckedThumbColor", "checkedThumbColor", "autoToggle", "haptic", "Lzyw0;", "accessibilityDelegate", "Lzyw0;", "Companion", "wyw0", "SavedState", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class SwitchComponent extends View implements Checkable, nwy0, lh {
    private static final String CHECKED_COLOR_ATTR = "track_color";
    private static final long DEFAULT_ANIMATION_DURATION = 150;
    private static final int DEFAULT_COLOR = -65281;
    public static final float DISABLED_ALPHA = 0.5f;
    public static final float ENABLED_ALPHA = 1.0f;
    public static final float MAX_PROGRESS = 1.0f;
    public static final float MIN_PROGRESS = 0.0f;
    private static final String UNCHECKED_COLOR_ATTR = "unchecked_color";
    private final zyw0 accessibilityDelegate;
    private final Animator.AnimatorListener animatorListener;
    private final ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
    private final ArgbEvaluator argbEvaluator;
    private boolean autoToggle;
    private ColorStateList backgroundColorList;
    private Paint backgroundPaint;
    private int checkedBackgroundColor;
    private xyw0 checkedChangedListener;
    private int checkedThumbColor;
    private boolean haptic;
    private boolean isChecked;
    private ValueAnimator progressAnimator;
    private final Interpolator progressInterpolator;
    private ColorStateList thumbColorList;
    private Paint thumbPaint;
    private float thumbProgress;
    private final float thumbRadius;
    private final int thumbSidePadding;
    private int uncheckedBackgroundColor;
    private int uncheckedThumbColor;
    public static final wyw0 Companion = new wyw0();
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int CHECKED_BACKGROUND_TAG = ndh0.checked_color_id;
    private static final int UNCHECKED_BACKGROUND_TAG = ndh0.unchecked_color_id;
    private static final int UNCHECKED_COLOR_STYLE = c4i0.SwitchComponent_unchecked_color;
    private static final int CHECKED_COLOR_STYLE = c4i0.SwitchComponent_track_color;

    public SwitchComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animatorUpdateListener = new yd2(7, this);
        this.animatorListener = new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.SwitchComponent$animatorListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                SwitchComponent.this.progressAnimator = null;
            }
        };
        this.argbEvaluator = new ArgbEvaluator();
        this.progressInterpolator = new FastOutSlowInInterpolator();
        int i2 = DEFAULT_COLOR;
        this.uncheckedBackgroundColor = i2;
        this.checkedBackgroundColor = i2;
        this.autoToggle = true;
        this.haptic = true;
        zyw0 zyw0Var = new zyw0(this);
        this.accessibilityDelegate = zyw0Var;
        initAttrs(context, attributeSet, i);
        this.thumbRadius = getResources().getDimension(mrg0.component_switch_thumb_radius);
        this.thumbSidePadding = tje.u(2, getContext());
        setLayerType(1, null);
        initPaints();
        androidx.core.view.b.p(this, zyw0Var);
        this.backgroundColorList = new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{this.checkedBackgroundColor, this.uncheckedBackgroundColor});
        this.thumbColorList = new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{this.checkedThumbColor, this.uncheckedThumbColor});
    }

    private final void animateProgress(float newProgress) {
        cancelProgressAnimation();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.thumbProgress, newProgress);
        ofFloat.setInterpolator(this.progressInterpolator);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(this.animatorUpdateListener);
        ofFloat.addListener(this.animatorListener);
        ofFloat.start();
        this.progressAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animatorUpdateListener$lambda$0(SwitchComponent switchComponent, ValueAnimator valueAnimator) {
        switchComponent.setThumbProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void cancelProgressAnimation() {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.progressAnimator = null;
    }

    private final void drawBackground(Canvas canvas) {
        Paint paint = this.backgroundPaint;
        if (paint == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = new RectF(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f = measuredHeight / 2.0f;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    private final void drawThumb(Canvas canvas) {
        Paint paint = this.thumbPaint;
        if (paint == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = isLayoutRTL() ? (measuredWidth - r4) - this.thumbRadius : this.thumbSidePadding + this.thumbRadius;
        float abs = Math.abs(f - (isLayoutRTL() ? this.thumbSidePadding + this.thumbRadius : (measuredWidth - r5) - this.thumbRadius));
        boolean isLayoutRTL = isLayoutRTL();
        float f2 = this.thumbProgress;
        canvas.drawCircle(isLayoutRTL ? f - (abs * f2) : f + (abs * f2), measuredHeight / 2.0f, this.thumbRadius, paint);
    }

    private final void initAttrs(Context context, AttributeSet attrs, int defStyleAttr) {
        final int i = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, c4i0.SwitchComponent, defStyleAttr, 0);
        final int i2 = 1;
        if (attrs != null) {
            qje.S(attrs, obtainStyledAttributes, UNCHECKED_COLOR_ATTR, UNCHECKED_COLOR_STYLE, xng0.controlMinor, new Consumer(this) { // from class: vyw0
                public final /* synthetic */ SwitchComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i3 = i;
                    SwitchComponent switchComponent = this.b;
                    int intValue = ((Integer) obj).intValue();
                    switch (i3) {
                        case 0:
                            switchComponent.setUncheckedColorAttr(intValue);
                            break;
                        case 1:
                            switchComponent.setUncheckedTrackColor(intValue);
                            break;
                        case 2:
                            switchComponent.setTrackColorAttr(intValue);
                            break;
                        default:
                            switchComponent.setTrackColor(intValue);
                            break;
                    }
                }
            }, new Consumer(this) { // from class: vyw0
                public final /* synthetic */ SwitchComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i3 = i2;
                    SwitchComponent switchComponent = this.b;
                    int intValue = ((Integer) obj).intValue();
                    switch (i3) {
                        case 0:
                            switchComponent.setUncheckedColorAttr(intValue);
                            break;
                        case 1:
                            switchComponent.setUncheckedTrackColor(intValue);
                            break;
                        case 2:
                            switchComponent.setTrackColorAttr(intValue);
                            break;
                        default:
                            switchComponent.setTrackColor(intValue);
                            break;
                    }
                }
            });
            int i3 = CHECKED_COLOR_STYLE;
            int i4 = xng0.controlMain;
            final int i5 = 2;
            Consumer consumer = new Consumer(this) { // from class: vyw0
                public final /* synthetic */ SwitchComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i32 = i5;
                    SwitchComponent switchComponent = this.b;
                    int intValue = ((Integer) obj).intValue();
                    switch (i32) {
                        case 0:
                            switchComponent.setUncheckedColorAttr(intValue);
                            break;
                        case 1:
                            switchComponent.setUncheckedTrackColor(intValue);
                            break;
                        case 2:
                            switchComponent.setTrackColorAttr(intValue);
                            break;
                        default:
                            switchComponent.setTrackColor(intValue);
                            break;
                    }
                }
            };
            final int i6 = 3;
            qje.S(attrs, obtainStyledAttributes, CHECKED_COLOR_ATTR, i3, i4, consumer, new Consumer(this) { // from class: vyw0
                public final /* synthetic */ SwitchComponent b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i32 = i6;
                    SwitchComponent switchComponent = this.b;
                    int intValue = ((Integer) obj).intValue();
                    switch (i32) {
                        case 0:
                            switchComponent.setUncheckedColorAttr(intValue);
                            break;
                        case 1:
                            switchComponent.setUncheckedTrackColor(intValue);
                            break;
                        case 2:
                            switchComponent.setTrackColorAttr(intValue);
                            break;
                        default:
                            switchComponent.setTrackColor(intValue);
                            break;
                    }
                }
            });
        } else {
            setUncheckedColorAttr(xng0.controlMinor);
            setTrackColorAttr(xng0.controlMain);
        }
        int color = getContext().getColor(mqg0.component_white);
        this.checkedThumbColor = color;
        this.uncheckedThumbColor = color;
        this.backgroundColorList = new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{this.checkedBackgroundColor, this.uncheckedBackgroundColor});
        this.thumbColorList = new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{this.checkedThumbColor, this.uncheckedThumbColor});
        boolean z = obtainStyledAttributes.getBoolean(c4i0.SwitchComponent_checked, false);
        boolean z2 = obtainStyledAttributes.getBoolean(c4i0.SwitchComponent_enabled, true);
        setCheckedInternal(z, false);
        setEnabled(z2);
        setBackgroundColor(getContext().getColor(mqg0.transparent));
        obtainStyledAttributes.recycle();
    }

    private final void initPaints() {
        this.backgroundPaint = unr0.f(true);
        this.thumbPaint = unr0.f(true);
        updateBackgroundPaint();
        updateThumbPaint();
    }

    private final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    private final void setCheckedInternal(boolean isChecked, boolean animate) {
        if (isChecked != this.isChecked) {
            this.isChecked = isChecked;
            float f = isChecked ? 1.0f : 0.0f;
            refreshDrawableState();
            if (animate) {
                if (this.haptic) {
                    qke.E(getContext(), HapticController$Effect.TICK, false, 8);
                }
                animateProgress(f);
            } else {
                cancelProgressAnimation();
                setThumbProgress(f);
            }
            xyw0 xyw0Var = this.checkedChangedListener;
            if (xyw0Var != null) {
                xyw0Var.a(isChecked);
            }
            sendAccessibilityEvent(0);
        }
    }

    private final void setThumbProgress(float progress) {
        this.thumbProgress = progress;
        updateBackgroundPaint();
        updateThumbPaint();
        invalidate();
    }

    private final void updateBackgroundPaint() {
        if (this.backgroundPaint == null) {
            initPaints();
            return;
        }
        int intValue = ((Integer) this.argbEvaluator.evaluate(this.thumbProgress, Integer.valueOf(this.uncheckedBackgroundColor), Integer.valueOf(this.checkedBackgroundColor))).intValue();
        Paint paint = this.backgroundPaint;
        if (paint != null) {
            paint.setColor(intValue);
        }
    }

    private final void updateThumbPaint() {
        if (this.thumbPaint == null) {
            initPaints();
            return;
        }
        int intValue = ((Integer) this.argbEvaluator.evaluate(this.thumbProgress, Integer.valueOf(this.uncheckedThumbColor), Integer.valueOf(this.checkedThumbColor))).intValue();
        Paint paint = this.thumbPaint;
        if (paint != null) {
            paint.setColor(intValue);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        Object tag = getTag(UNCHECKED_BACKGROUND_TAG);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            this.uncheckedBackgroundColor = qje.t(num.intValue(), getContext());
        }
        Object tag2 = getTag(CHECKED_BACKGROUND_TAG);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            this.checkedBackgroundColor = qje.t(num2.intValue(), getContext());
        }
        setTrackColors(this.checkedBackgroundColor, this.uncheckedBackgroundColor);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] onCreateDrawableState = super.onCreateDrawableState(0);
        int[] copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
        View.mergeDrawableStates(copyOf, CHECKED_STATE_SET);
        ColorStateList colorStateList = this.backgroundColorList;
        int i = DEFAULT_COLOR;
        this.uncheckedBackgroundColor = colorStateList.getColorForState(onCreateDrawableState, i);
        this.checkedBackgroundColor = this.backgroundColorList.getColorForState(copyOf, i);
        this.uncheckedThumbColor = this.thumbColorList.getColorForState(onCreateDrawableState, i);
        this.checkedThumbColor = this.thumbColorList.getColorForState(copyOf, i);
        updateBackgroundPaint();
        updateThumbPaint();
        invalidate();
    }

    public final FrameLayout.LayoutParams generateDefaultFrameLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.setMarginStart(tje.r(mrg0.component_safe_switch_start_margin, getContext()));
        layoutParams.setMarginEnd(tje.r(mrg0.component_safe_switch_end_margin, getContext()));
        return layoutParams;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.isChecked;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setThumbProgress(isChecked() ? 1.0f : 0.0f);
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int extraSpace) {
        int[] onCreateDrawableState = super.onCreateDrawableState(extraSpace + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelProgressAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        drawBackground(canvas);
        drawThumb(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(tje.u(56, getContext()), 1073741824), View.MeasureSpec.makeMeasureSpec(tje.u(32, getContext()), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedInternal(savedState.getIsChecked(), false);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = AbsSavedState.EMPTY_STATE;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.setChecked(isChecked());
        return savedState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!isEnabled() || !this.autoToggle) {
            return super.performClick();
        }
        toggleWithAnimation();
        return super.performClick();
    }

    @Override // defpackage.lh
    /* renamed from: provideAccessibilityDelegate */
    public AccessibilityDelegateCompat getDefaultAccessibilityDelegate() {
        return this.accessibilityDelegate;
    }

    public final void setAutoToggle(boolean value) {
        this.autoToggle = false;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        setCheckedInternal(checked, false);
    }

    public final void setCheckedWithAnimation(boolean checked) {
        setCheckedInternal(checked, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        setAlpha(enabled ? 1.0f : 0.5f);
        super.setEnabled(enabled);
    }

    public final void setHapticEnabled(boolean value) {
        this.haptic = value;
    }

    public final void setOnCheckedChangedListener(xyw0 listener) {
        if (listener != null && !isClickable()) {
            setClickable(true);
        }
        this.checkedChangedListener = listener;
    }

    public final void setTrackColor(int checkedColor) {
        setTrackColors(getContext().getColor(checkedColor), this.uncheckedBackgroundColor);
    }

    public final void setTrackColorAttr(int colorAttr) {
        setTag(CHECKED_BACKGROUND_TAG, Integer.valueOf(colorAttr));
        setTrackColors(qje.t(colorAttr, getContext()), this.uncheckedBackgroundColor);
    }

    public final void setTrackColors(int checkedColor, int uncheckedColor) {
        this.checkedBackgroundColor = checkedColor;
        this.uncheckedBackgroundColor = uncheckedColor;
        this.backgroundColorList = new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{checkedColor, uncheckedColor});
        updateBackgroundPaint();
        invalidate();
    }

    public final void setUncheckedColorAttr(int colorAttr) {
        setTag(UNCHECKED_BACKGROUND_TAG, Integer.valueOf(colorAttr));
        setTrackColors(this.checkedBackgroundColor, qje.t(colorAttr, getContext()));
    }

    public final void setUncheckedTrackColor(int colorId) {
        setTrackColors(this.checkedBackgroundColor, getContext().getColor(colorId));
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setCheckedInternal(!isChecked(), false);
    }

    public final void toggleWithAnimation() {
        if (isEnabled()) {
            setCheckedInternal(!isChecked(), true);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/design/SwitchComponent$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "<init>", "(Landroid/os/Parcelable;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "isChecked", "Z", "()Z", "setChecked", "(Z)V", "Companion", "ru/yandex/taxi/design/u", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SavedState extends View.BaseSavedState {
        private boolean isChecked;
        public static final u Companion = new u();
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: ru.yandex.taxi.design.SwitchComponent$SavedState$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            public SwitchComponent.SavedState createFromParcel(Parcel source) {
                return new SwitchComponent.SavedState(source, null);
            }

            @Override // android.os.Parcelable.Creator
            public SwitchComponent.SavedState[] newArray(int size) {
                return new SwitchComponent.SavedState[size];
            }
        };

        private SavedState(Parcel parcel) {
            super(parcel);
            this.isChecked = parcel.readInt() == 1;
        }

        /* renamed from: isChecked, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final void setChecked(boolean z) {
            this.isChecked = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.isChecked ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public /* synthetic */ SavedState(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }
    }

    public SwitchComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SwitchComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SwitchComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.switchComponentStyle : i);
    }
}
