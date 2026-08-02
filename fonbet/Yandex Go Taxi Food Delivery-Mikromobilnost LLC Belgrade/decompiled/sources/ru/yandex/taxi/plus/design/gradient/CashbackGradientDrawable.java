package ru.yandex.taxi.plus.design.gradient;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.fes0;
import defpackage.jxi;
import defpackage.qke;
import defpackage.ziy;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\bR\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b\u0007\u0010+¨\u0006,"}, d2 = {"Lru/yandex/taxi/plus/design/gradient/CashbackGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "", "radius", "Lzy11;", "setRoundedCornersRadius", "(I)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Lziy;", "topShaderController", "Lziy;", "bottomShaderController", "height", CA20Status.STATUS_USER_I, "width", "topShaderAlpha", "getTopShaderAlpha", "setTopShaderAlpha", "", "roundedCornersRadius", "F", "getRoundedCornersRadius", "()F", "(F)V", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackGradientDrawable extends Drawable {
    private final ziy bottomShaderController;
    private int height;
    private final Paint paint;
    private float roundedCornersRadius;
    private int topShaderAlpha;
    private final ziy topShaderController;
    private int width;

    public CashbackGradientDrawable() {
        Paint paint = new Paint();
        this.paint = paint;
        int[] iArr = qke.c;
        float[] fArr = qke.i;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.topShaderController = new fes0(iArr, fArr, 90.0f, tileMode);
        this.bottomShaderController = new fes0(qke.e, qke.j, qke.n, tileMode);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.topShaderAlpha = 255;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        this.paint.setAlpha(255);
        this.paint.setShader(this.bottomShaderController.b());
        float f = this.width;
        float f2 = this.height;
        float f3 = this.roundedCornersRadius;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.paint);
        this.paint.setShader(this.topShaderController.b());
        this.paint.setAlpha(this.topShaderAlpha);
        float f4 = this.width;
        float f5 = this.height;
        float f6 = this.roundedCornersRadius;
        canvas.drawRoundRect(0.0f, 0.0f, f4, f5, f6, f6, this.paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -1;
    }

    public final float getRoundedCornersRadius() {
        return this.roundedCornersRadius;
    }

    public final int getTopShaderAlpha() {
        return this.topShaderAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.width = bounds.width();
        int height = bounds.height();
        this.height = height;
        this.topShaderController.a(this.width, height);
        this.bottomShaderController.a(this.width, this.height);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setRoundedCornersRadius(int radius) {
        this.roundedCornersRadius = radius;
    }

    public final void setTopShaderAlpha(int i) {
        this.topShaderAlpha = i;
    }

    public final void setRoundedCornersRadius(float f) {
        this.roundedCornersRadius = f;
    }
}
