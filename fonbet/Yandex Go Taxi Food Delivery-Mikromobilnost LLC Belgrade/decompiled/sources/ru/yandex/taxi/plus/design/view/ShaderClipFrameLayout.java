package ru.yandex.taxi.plus.design.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.i3y;
import defpackage.iwq0;
import defpackage.jl40;
import defpackage.w511;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\n2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J7\u0010&\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/yandex/taxi/plus/design/view/ShaderClipFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateLayerType", "()V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "disableShader", "enableShader", "Landroid/graphics/Shader;", "shader", "updateShader", "(Landroid/graphics/Shader;)V", "", "hardware", "clipShimmeringToDrawable", "(Z)V", "Ljava/util/function/BiConsumer;", "onSizeChangeListener", "setOnSizeChangeListener", "(Ljava/util/function/BiConsumer;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/RectF;", "currentDrawRect", "Landroid/graphics/RectF;", "hardwareClip", "Z", "Ljava/util/function/BiConsumer;", "Landroid/graphics/Shader;", "Landroid/graphics/Paint;", "topRenderPaint$delegate", "Li3y;", "getTopRenderPaint", "()Landroid/graphics/Paint;", "topRenderPaint", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ShaderClipFrameLayout extends FrameLayout {
    private final RectF currentDrawRect;
    private boolean hardwareClip;
    private BiConsumer<Integer, Integer> onSizeChangeListener;
    private Shader shader;

    /* renamed from: topRenderPaint$delegate, reason: from kotlin metadata */
    private final i3y topRenderPaint;

    public ShaderClipFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentDrawRect = new RectF();
        this.topRenderPaint = a.a(new iwq0(21));
    }

    public static /* synthetic */ void clipShimmeringToDrawable$default(ShaderClipFrameLayout shaderClipFrameLayout, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: clipShimmeringToDrawable");
            return;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        shaderClipFrameLayout.clipShimmeringToDrawable(z);
    }

    private final Paint getTopRenderPaint() {
        return (Paint) this.topRenderPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint topRenderPaint_delegate$lambda$0() {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        return paint;
    }

    private final void updateLayerType() {
        if (getTopRenderPaint().getShader() == null) {
            return;
        }
        if (this.hardwareClip) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public final void clipShimmeringToDrawable(boolean hardware) {
        this.hardwareClip = hardware;
        updateLayerType();
    }

    public final void disableShader() {
        getTopRenderPaint().setShader(null);
        updateLayerType();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getTopRenderPaint().getShader() != null) {
            canvas.drawRect(this.currentDrawRect, getTopRenderPaint());
        }
    }

    public final void enableShader() {
        if (jl40.l(this.shader, getTopRenderPaint().getShader())) {
            return;
        }
        getTopRenderPaint().setShader(this.shader);
        updateLayerType();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.currentDrawRect.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        BiConsumer<Integer, Integer> biConsumer = this.onSizeChangeListener;
        if (biConsumer != null) {
            biConsumer.accept(Integer.valueOf(w), Integer.valueOf(h));
        }
    }

    public final void setOnSizeChangeListener(BiConsumer<Integer, Integer> onSizeChangeListener) {
        this.onSizeChangeListener = onSizeChangeListener;
        if (onSizeChangeListener == null || getWidth() <= 0 || getHeight() <= 0 || getParent() == null) {
            return;
        }
        onSizeChangeListener.accept(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    public final void updateShader(Shader shader) {
        this.shader = shader;
        getTopRenderPaint().setShader(shader);
        updateLayerType();
    }

    public ShaderClipFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ShaderClipFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ShaderClipFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
