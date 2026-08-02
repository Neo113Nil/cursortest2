package ru.yandex.taxi.scooters.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.a2i0;
import defpackage.dzg0;
import defpackage.e8n0;
import defpackage.f1h0;
import defpackage.f8n0;
import defpackage.gh00;
import defpackage.ndh0;
import defpackage.oyr;
import defpackage.qje;
import defpackage.sls;
import defpackage.swk0;
import defpackage.tje;
import defpackage.vng;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.scooters.presentation.common.ui.compass.ScootersCompassButtonPresenter$attachView$$inlined$collectIn$1;
import ru.yandex.taxi.scooters.presentation.common.ui.compass.b;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001CB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\n2\b\b\u0001\u0010(\u001a\u00020\b¢\u0006\u0004\b)\u0010\fJ\u0017\u0010*\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b*\u0010\u0019J\u0015\u0010+\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b+\u0010\fJ\u0015\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b-\u0010\fJ\u0015\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\n2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010@\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u00105¨\u0006D"}, d2 = {"Lru/yandex/taxi/scooters/utils/ScootersCompassRotatableFloatButton;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Le8n0;", "scootersCompassButtonPresenter", "<init>", "(Landroid/content/Context;Le8n0;)V", "", "color", "Lzy11;", "setIconTintColor", "(I)V", "initImageBackground", "()V", "initShadowBackground", "onAttachedToWindow", "onDetachedFromWindow", "width", "height", "setImageSize", "(II)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "attrId", "setIconTintAttr", "setImageDrawable", "setIconBackgroundTint", CaretView.ALPHA_PROPERTY, "setIconBackgroundAlpha", "", "rotation", "setImageRotation", "(F)V", "", BackendConfig.Restrictions.ENABLED, "setRippleEnabled", "(Z)V", "Le8n0;", "Lswk0;", "binding", "Lswk0;", "shadowOffsetPx", CA20Status.STATUS_USER_I, "shadow", "Landroid/graphics/drawable/Drawable;", "isRippleEnabled", "Z", "isEnableShadowBackground", "()Z", "setEnableShadowBackground", "f8n0", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCompassRotatableFloatButton extends GoFrameLayout {
    public static final int $stable = 8;
    private final swk0 binding;
    private boolean isEnableShadowBackground;
    private boolean isRippleEnabled;
    private final e8n0 scootersCompassButtonPresenter;
    private Drawable shadow;
    private final int shadowOffsetPx;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.scooters.utils.ScootersCompassRotatableFloatButton$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((gh00) ((e8n0) this.receiver).x).w();
            return zy11.a;
        }
    }

    public ScootersCompassRotatableFloatButton(Context context, e8n0 e8n0Var) {
        super(context, null, 0, 0, 14, null);
        this.scootersCompassButtonPresenter = e8n0Var;
        swk0 o = swk0.o(LayoutInflater.from(context), this);
        this.binding = o;
        this.shadowOffsetPx = tje.u(6, getContext());
        this.isRippleEnabled = true;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        initImageBackground();
        c.D(tje.u(48, getContext()), tje.u(48, getContext()), o.b);
        setClipChildren(false);
        setWillNotDraw(false);
        c.z(new AnonymousClass1(0, e8n0Var, e8n0.class, "compassButtonClicked", "compassButtonClicked()V", 0), this);
        int i = f1h0.ic_compass_24;
        Drawable t = vng.t(i, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
        if (t == null) {
            w511.f(oyr.j(i, "Drawable resource ", " not found"));
            throw null;
        }
        setIcon(t);
        setY(tje.w(-9, getContext()));
        setContentDescription("");
    }

    private final void initImageBackground() {
        this.binding.b.setBackground(vng.t(this.isRippleEnabled ? dzg0.fab_component_light : dzg0.floating_button_background, getContext()));
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

    /* renamed from: isEnableShadowBackground, reason: from getter */
    public final boolean getIsEnableShadowBackground() {
        return this.isEnableShadowBackground;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e8n0 e8n0Var = this.scootersCompassButtonPresenter;
        f8n0 f8n0Var = new f8n0(this);
        e8n0Var.Bg(f8n0Var);
        tje.N(e8n0Var.Jg(), null, null, new ScootersCompassButtonPresenter$attachView$$inlined$collectIn$1(e.t(new b(e8n0Var.y, e8n0Var)), null, f8n0Var), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersCompassButtonPresenter.Cg();
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

    public final void setEnableShadowBackground(boolean z) {
        this.isEnableShadowBackground = z;
    }

    public final void setIcon(Drawable drawable) {
        this.binding.b.setImageDrawable(drawable);
    }

    public final void setIconBackgroundAlpha(int alpha) {
        this.binding.b.getBackground().setAlpha(alpha);
    }

    public final void setIconBackgroundTint(int color) {
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
}
