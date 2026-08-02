package ru.yandex.taxi.widget.pin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.shapes.OvalShape;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.scc;
import defpackage.vy80;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/widget/pin/OvalShadowShape;", "Landroid/graphics/drawable/shapes/OvalShape;", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V", "", "radius", "blurSize", "updateRadialGradient", "(FF)V", "", "shaderStops", "Ljava/util/List;", "shadowPaint", "Landroid/graphics/Paint;", "Companion", "vy80", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OvalShadowShape extends OvalShape {
    public static final vy80 Companion = new vy80();
    private static final int[] SHADER_COLORS = {ModalContentViewContainer.BASE_SHADOW_COLOR, 0};
    private final List<Float> shaderStops = scc.i(Float.valueOf(0.8f), Float.valueOf(1.0f));
    private final Paint shadowPaint = new Paint();

    @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public void draw(Canvas canvas, Paint paint) {
        float width = rect().width();
        float height = rect().height();
        this.shadowPaint.setAlpha(paint.getAlpha());
        float f = width / 2.0f;
        canvas.drawCircle(f, height / 2.0f, f, this.shadowPaint);
    }

    public final void updateRadialGradient(float radius, float blurSize) {
        if (radius > 0.0f) {
            float f = 1.0f - (blurSize / radius);
            this.shaderStops.set(0, Float.valueOf(f >= 0.0f ? f : 0.0f));
            this.shadowPaint.setShader(new RadialGradient(rect().width() / 2.0f, rect().height() / 2.0f, radius, SHADER_COLORS, a.G0(this.shaderStops), Shader.TileMode.CLAMP));
        }
    }
}
