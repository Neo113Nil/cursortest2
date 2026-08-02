package ru.yandex.taxi.plus.design.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.b;
import defpackage.efh0;
import defpackage.erh0;
import defpackage.fes0;
import defpackage.qke;
import defpackage.rp31;
import defpackage.th5;
import defpackage.ziy;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\b\b\u0001\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u000e2\b\b\u0001\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000e2\b\b\u0001\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u0013J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000e¢\u0006\u0004\b&\u0010\u001aR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/¨\u00062"}, d2 = {"Lru/yandex/taxi/plus/design/view/GradientGlyphValueView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lziy;", "linearGradientShaderController", "Lru/yandex/taxi/plus/design/view/ShaderClipFrameLayout;", "container", "Lzy11;", "setupView", "(Lziy;Lru/yandex/taxi/plus/design/view/ShaderClipFrameLayout;)V", "px", "setPrefixMarginEnd", "(I)V", "", "value", "setPrefix", "(Ljava/lang/CharSequence;)V", "setValue", "setGradientToIcon", "()V", "setGradientToValue", "color", "setSolidColorToPrefix", "setSolidColorToIcon", "setSolidColorToValue", "typeface", "setPrefixTypeface", "Landroid/graphics/drawable/Drawable;", "drawable", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "disableShaderToIcon", "Lru/yandex/taxi/widget/RobotoTextView;", "prefixView", "Lru/yandex/taxi/widget/RobotoTextView;", "valueView", "Landroid/widget/ImageView;", "iconView", "Landroid/widget/ImageView;", "prefixContainer", "Lru/yandex/taxi/plus/design/view/ShaderClipFrameLayout;", "iconContainer", "valueContainer", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GradientGlyphValueView extends FrameLayout {
    private final ShaderClipFrameLayout iconContainer;
    private final ImageView iconView;
    private final ShaderClipFrameLayout prefixContainer;
    private final RobotoTextView prefixView;
    private final ShaderClipFrameLayout valueContainer;
    private final RobotoTextView valueView;

    public GradientGlyphValueView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(erh0.gradient_cashback_value_view, (ViewGroup) this, true);
        int i2 = efh0.cashback_prefix;
        WeakHashMap weakHashMap = b.a;
        this.prefixView = (RobotoTextView) ((View) rp31.d(this, i2));
        this.valueView = (RobotoTextView) ((View) rp31.d(this, efh0.cashback_value));
        this.iconView = (ImageView) ((View) rp31.d(this, efh0.cashback_icon));
        ShaderClipFrameLayout shaderClipFrameLayout = (ShaderClipFrameLayout) ((View) rp31.d(this, efh0.gradient_glyph_prefix_container));
        this.prefixContainer = shaderClipFrameLayout;
        ShaderClipFrameLayout shaderClipFrameLayout2 = (ShaderClipFrameLayout) ((View) rp31.d(this, efh0.gradient_glyph_icon_container));
        this.iconContainer = shaderClipFrameLayout2;
        ShaderClipFrameLayout shaderClipFrameLayout3 = (ShaderClipFrameLayout) ((View) rp31.d(this, efh0.gradient_glyph_value_container));
        this.valueContainer = shaderClipFrameLayout3;
        int[] iArr = qke.f;
        float[] fArr = qke.l;
        float f = qke.m;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        setupView(new fes0(iArr, fArr, f, tileMode), shaderClipFrameLayout);
        setupView(new fes0(qke.f, qke.k, qke.m, tileMode), shaderClipFrameLayout2);
        setupView(new fes0(qke.f, qke.l, qke.m, tileMode), shaderClipFrameLayout3);
    }

    private final void setupView(ziy linearGradientShaderController, ShaderClipFrameLayout container) {
        container.updateShader(linearGradientShaderController.b());
        container.setOnSizeChangeListener(new th5(8, linearGradientShaderController));
    }

    public final void disableShaderToIcon() {
        this.iconContainer.disableShader();
    }

    public final void setGradientToIcon() {
        this.iconContainer.enableShader();
    }

    public final void setGradientToValue() {
        this.valueContainer.enableShader();
    }

    public final void setIconDrawable(Drawable drawable) {
        this.iconView.setImageDrawable(drawable);
        requestLayout();
        invalidate();
    }

    public final void setPrefix(CharSequence value) {
        this.prefixView.setText(value == null ? "" : value);
        this.prefixView.setVisibility(value != null && value.length() != 0 ? 0 : 8);
    }

    public final void setPrefixMarginEnd(int px) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.prefixContainer.getLayoutParams());
        marginLayoutParams.setMarginEnd(px);
        this.prefixContainer.setLayoutParams(new LinearLayout.LayoutParams(marginLayoutParams));
    }

    public final void setPrefixTypeface(int typeface) {
        this.prefixView.setTextTypeface(typeface);
    }

    public final void setSolidColorToIcon(int color) {
        this.iconContainer.disableShader();
        this.iconView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
    }

    public final void setSolidColorToPrefix(int color) {
        this.prefixContainer.disableShader();
        this.prefixView.setTextColor(color);
    }

    public final void setSolidColorToValue(int color) {
        this.valueContainer.disableShader();
        this.valueView.setTextColor(color);
    }

    public final void setValue(CharSequence value) {
        this.valueView.setText(value == null ? "" : value);
        this.valueView.setVisibility(value != null && value.length() != 0 ? 0 : 8);
    }

    public GradientGlyphValueView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GradientGlyphValueView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ GradientGlyphValueView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
