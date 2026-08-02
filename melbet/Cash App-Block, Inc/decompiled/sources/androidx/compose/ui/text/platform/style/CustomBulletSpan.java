package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {
    public final float alpha;
    public final Brush brush;
    public final float bulletHeightPx;
    public final float bulletWidthPx;
    public final Density density;
    public final int diff;
    public final DrawStyle drawStyle;
    public final int minimumRequiredIndent;
    public final Shape shape;

    public CustomBulletSpan(Shape shape, float f, float f2, float f3, Brush brush, float f4, DrawStyle drawStyle, Density density, float f5) {
        this.shape = shape;
        this.bulletWidthPx = f;
        this.bulletHeightPx = f2;
        this.brush = brush;
        this.alpha = f4;
        this.drawStyle = drawStyle;
        this.density = density;
        int roundToInt = MathKt__MathJVMKt.roundToInt(f + f3);
        this.minimumRequiredIndent = roundToInt;
        this.diff = MathKt__MathJVMKt.roundToInt(f5) - roundToInt;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.minimumRequiredIndent;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        Fill fill = Fill.INSTANCE;
        DrawStyle drawStyle = this.drawStyle;
        Integer num = null;
        if (Intrinsics.areEqual(drawStyle, fill)) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            if (!(drawStyle instanceof Stroke)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) drawStyle;
            paint.setStrokeWidth(stroke.width);
            paint.setStrokeMiter(stroke.miter);
            int i10 = stroke.cap;
            paint.setStrokeCap(i10 == 0 ? Paint.Cap.BUTT : i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            int i11 = stroke.join;
            paint.setStrokeJoin(i11 == 0 ? Paint.Join.MITER : i11 == 1 ? Paint.Join.ROUND : i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            PathEffect pathEffect = stroke.pathEffect;
            paint.setPathEffect(pathEffect != null ? ((AndroidPathEffect) pathEffect).nativePathEffect : null);
        }
        final long floatToRawIntBits = (Float.floatToRawIntBits(this.bulletWidthPx) << 32) | (Float.floatToRawIntBits(this.bulletHeightPx) & BodyPartID.bodyIdMax);
        Function0 function0 = new Function0() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CustomBulletSpan customBulletSpan = CustomBulletSpan.this;
                Shape shape = customBulletSpan.shape;
                int i12 = i2;
                ColorKt mo175createOutlinePq9zytI = shape.mo175createOutlinePq9zytI(floatToRawIntBits, i12 > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, customBulletSpan.density);
                float f2 = i9;
                boolean z2 = mo175createOutlinePq9zytI instanceof Outline$Generic;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (z2) {
                    canvas2.save();
                    Outline$Generic outline$Generic = (Outline$Generic) mo175createOutlinePq9zytI;
                    Rect bounds = outline$Generic.getBounds();
                    canvas2.translate(f2, f3 - ((bounds.bottom - bounds.top) / 2.0f));
                    AndroidPath androidPath = outline$Generic.path;
                    if (!(androidPath instanceof AndroidPath)) {
                        a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
                        return null;
                    }
                    canvas2.drawPath(androidPath.internalPath, paint2);
                    canvas2.restore();
                } else if (mo175createOutlinePq9zytI instanceof Outline$Rounded) {
                    RoundRect roundRect = ((Outline$Rounded) mo175createOutlinePq9zytI).roundRect;
                    if (Strings.isSimple(roundRect)) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.topLeftCornerRadius >> 32));
                        canvas2.drawRoundRect(f2, f3 - (roundRect.getHeight() / 2.0f), (roundRect.getWidth() * i12) + f2, (roundRect.getHeight() / 2.0f) + f3, intBitsToFloat, intBitsToFloat, paint2);
                    } else {
                        AndroidPath Path = AndroidPath_androidKt.Path();
                        AndroidPath.addRoundRect$default(Path, roundRect);
                        canvas2.save();
                        canvas2.translate(f2, f3 - (roundRect.getHeight() / 2.0f));
                        canvas2.drawPath(Path.internalPath, paint2);
                        canvas2.restore();
                    }
                } else {
                    if (!(mo175createOutlinePq9zytI instanceof Outline$Rectangle)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Rect rect = ((Outline$Rectangle) mo175createOutlinePq9zytI).rect;
                    float f4 = (rect.bottom - rect.top) / 2.0f;
                    canvas2.drawRect(f2, f3 - f4, CameraState$Type$EnumUnboxingLocalUtility.m(rect.right, rect.left, i12, f2), f4 + f3, paint2);
                }
                return Unit.INSTANCE;
            }
        };
        Brush brush = this.brush;
        float f2 = this.alpha;
        if (brush == null) {
            if (!Float.isNaN(f2)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            function0.invoke();
            if (num != null) {
                paint.setAlpha(num.intValue());
            }
        } else if (brush instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f2)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            paint.setColor(ColorKt.m694toArgb8_81llA(((SolidColor) brush).value));
            function0.invoke();
            paint.setColor(color);
            if (num != null) {
                paint.setAlpha(num.intValue());
            }
        } else {
            if (!(brush instanceof ShaderBrush)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Shader shader = paint.getShader();
            if (!Float.isNaN(f2)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            paint.setShader(((ShaderBrush) brush).mo671createShaderuvyYCjk(floatToRawIntBits));
            function0.invoke();
            paint.setShader(shader);
            if (num != null) {
                paint.setAlpha(num.intValue());
            }
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.diff;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
