package ru.yandex.taxi.widget.floatbuttonholder;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.dzg0;
import defpackage.ijs;
import defpackage.ndh0;
import defpackage.qje;
import defpackage.qwk0;
import defpackage.rwk0;
import defpackage.sls;
import defpackage.swk0;
import defpackage.tje;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartListener;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 [2\u00020\u0001:\u0001\\B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010 J\u0015\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u0006¢\u0006\u0004\b(\u0010 J\u0015\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\r2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000101¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\r¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\r2\u0006\u00107\u001a\u00020-¢\u0006\u0004\b8\u00100J\u0019\u00109\u001a\u00020\r2\b\b\u0001\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010 J\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u00106J\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u00106J\u000f\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020<H\u0002¢\u0006\u0004\b?\u0010>J\u0017\u0010A\u001a\u00020<2\u0006\u0010@\u001a\u00020-H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020<2\u0006\u0010@\u001a\u00020-H\u0002¢\u0006\u0004\bC\u0010BJ\u0017\u0010D\u001a\u00020<2\u0006\u0010@\u001a\u00020-H\u0002¢\u0006\u0004\bD\u0010BR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010N\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u00100R$\u0010Q\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010W\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010I\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010 ¨\u0006]"}, d2 = {"Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "width", "height", "Lzy11;", "setImageSize", "(II)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "attrId", "setIconTintAttr", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "color", "setIconBackgroundTint", CaretView.ALPHA_PROPERTY, "setIconBackgroundAlpha", "", "rotation", "setImageRotation", "(F)V", "", BackendConfig.Restrictions.ENABLED, "setRippleEnabled", "(Z)V", "Lkotlin/Function0;", "onAnimationEnd", "show", "(Lsls;)V", "hide", "()V", "visible", "setVisibilityAnimated", "setIconTintColor", "initImageBackground", "initShadowBackground", "Landroid/animation/Animator;", "createHideAnimator", "()Landroid/animation/Animator;", "createShowAnimator", "isHideAnimation", "createAnimator", "(Z)Landroid/animation/Animator;", "createSlideAnimation", "createFadeAnimation", "Lswk0;", "binding", "Lswk0;", "shadowOffsetPx", CA20Status.STATUS_USER_I, "shadow", "Landroid/graphics/drawable/Drawable;", "isRippleEnabled", "Z", "isEnableShadowBackground", "()Z", "setEnableShadowBackground", "backgroundTintColor", "Ljava/lang/Integer;", "getBackgroundTintColor", "()Ljava/lang/Integer;", "setBackgroundTintColor", "(Ljava/lang/Integer;)V", "animatedHideVisibility", "getAnimatedHideVisibility", "()I", "setAnimatedHideVisibility", "Companion", "rwk0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RotatableFloatButton extends GoFrameLayout {
    public static final int $stable = 8;
    public static final int BUTTON_SIZE = 48;
    public static final rwk0 Companion = new rwk0();
    private int animatedHideVisibility;
    private Integer backgroundTintColor;
    private final swk0 binding;
    private boolean isEnableShadowBackground;
    private boolean isRippleEnabled;
    private Drawable shadow;
    private final int shadowOffsetPx;

    public RotatableFloatButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        swk0 o = swk0.o(LayoutInflater.from(context), this);
        this.binding = o;
        this.shadowOffsetPx = tje.u(6, getContext());
        this.isRippleEnabled = true;
        this.isEnableShadowBackground = true;
        this.animatedHideVisibility = 8;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        initImageBackground();
        c.D(tje.u(48, getContext()), tje.u(48, getContext()), o.b);
        setClipChildren(false);
        setWillNotDraw(false);
    }

    private final Animator createAnimator(boolean isHideAnimation) {
        Animator createSlideAnimation = createSlideAnimation(isHideAnimation);
        createSlideAnimation.setDuration(300L);
        createSlideAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        return createSlideAnimation;
    }

    private final Animator createFadeAnimation(boolean isHideAnimation) {
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        Pair pair = isHideAnimation ? new Pair(valueOf2, valueOf) : new Pair(valueOf, valueOf2);
        return ObjectAnimator.ofFloat(this, (Property<RotatableFloatButton, Float>) FrameLayout.ALPHA, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
    }

    private final Animator createHideAnimator() {
        return createAnimator(true);
    }

    private final Animator createShowAnimator() {
        return createAnimator(false);
    }

    private final Animator createSlideAnimation(boolean isHideAnimation) {
        Float valueOf = Float.valueOf(0.0f);
        float height = this.binding.b.getHeight();
        Pair pair = isHideAnimation ? new Pair(valueOf, Float.valueOf(height)) : new Pair(Float.valueOf(height), valueOf);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<RotatableFloatButton, Float>) FrameLayout.TRANSLATION_X, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        Animator createFadeAnimation = createFadeAnimation(isHideAnimation);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, createFadeAnimation);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$0$0(RotatableFloatButton rotatableFloatButton) {
        rotatableFloatButton.setVisibility(rotatableFloatButton.animatedHideVisibility);
    }

    private final void initImageBackground() {
        this.binding.b.setBackground(vng.t(this.isRippleEnabled ? dzg0.fab_component_light : dzg0.floating_button_background, getContext()));
        Integer num = this.backgroundTintColor;
        if (num != null) {
            this.binding.b.getBackground().setTint(num.intValue());
        }
    }

    private final void initShadowBackground() {
        if (this.isEnableShadowBackground) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(xng0.component_circle_button_shadow, typedValue, true);
            Drawable drawable = getContext().getDrawable(typedValue.resourceId);
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
            if (gradientDrawable != null) {
                gradientDrawable.setGradientRadius((this.binding.b.getMeasuredWidth() / 2.0f) + this.shadowOffsetPx);
            }
            this.shadow = gradientDrawable;
        }
    }

    private final void setIconTintColor(int color) {
        this.binding.b.setImageTintList(ColorStateList.valueOf(color));
    }

    public static /* synthetic */ void show$default(RotatableFloatButton rotatableFloatButton, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = null;
        }
        rotatableFloatButton.show(slsVar);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        Object tag = getTag(ndh0.circle_btn_icon);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setIconTintColor(qje.t(num.intValue(), getContext()));
        }
        initImageBackground();
        initShadowBackground();
    }

    public final int getAnimatedHideVisibility() {
        return this.animatedHideVisibility;
    }

    public final Integer getBackgroundTintColor() {
        return this.backgroundTintColor;
    }

    public final void hide() {
        if (getVisibility() == 0) {
            Animator createHideAnimator = createHideAnimator();
            createHideAnimator.addListener(new AnimUtils$AnimationEndListener(new qwk0(this, 1)));
            createHideAnimator.start();
        }
    }

    /* renamed from: isEnableShadowBackground, reason: from getter */
    public final boolean getIsEnableShadowBackground() {
        return this.isEnableShadowBackground;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.shadow;
        if (drawable != null) {
            drawable.setBounds(this.binding.b.getLeft() - this.shadowOffsetPx, this.binding.b.getTop() - this.shadowOffsetPx, this.binding.b.getRight() + this.shadowOffsetPx, this.binding.b.getBottom() + this.shadowOffsetPx);
            drawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        initShadowBackground();
    }

    public final void setAnimatedHideVisibility(int i) {
        this.animatedHideVisibility = i;
    }

    public final void setBackgroundTintColor(Integer num) {
        this.backgroundTintColor = num;
    }

    public final void setEnableShadowBackground(boolean z) {
        this.isEnableShadowBackground = z;
    }

    public final void setIconBackgroundAlpha(int alpha) {
        this.binding.b.getBackground().setAlpha(alpha);
    }

    public final void setIconBackgroundTint(int color) {
        this.backgroundTintColor = Integer.valueOf(color);
        this.binding.b.getBackground().setTint(color);
    }

    public final void setIconTintAttr(int attrId) {
        setTag(ndh0.circle_btn_icon, Integer.valueOf(attrId));
        setIconTintColor(qje.t(attrId, getContext()));
    }

    public final void setImageDrawable(Drawable drawable) {
        this.binding.b.setImageDrawable(drawable);
    }

    public final void setImageRotation(float rotation) {
        this.binding.b.setRotation(360.0f - rotation);
    }

    public final void setImageSize(int width, int height) {
        c.D(width, height, this.binding.b);
    }

    public final void setRippleEnabled(boolean enabled) {
        this.isRippleEnabled = enabled;
        initImageBackground();
    }

    public final void setVisibilityAnimated(boolean visible) {
        if (visible) {
            show$default(this, null, 1, null);
        } else {
            hide();
        }
    }

    public final void show(sls onAnimationEnd) {
        if (getVisibility() == 0) {
            return;
        }
        Animator createShowAnimator = createShowAnimator();
        createShowAnimator.addListener(new AnimUtils$AnimationStartListener(new qwk0(this, 0)));
        if (onAnimationEnd != null) {
            createShowAnimator.addListener(new AnimUtils$AnimationEndListener(new ijs(29, onAnimationEnd)));
        }
        createShowAnimator.start();
    }

    public RotatableFloatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public RotatableFloatButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public RotatableFloatButton(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ RotatableFloatButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
