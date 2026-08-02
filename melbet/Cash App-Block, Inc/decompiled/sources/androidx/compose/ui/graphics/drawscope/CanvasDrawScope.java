package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import coil3.Extras;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {
    public final GrpcMethod drawContext;
    public final DrawParams drawParams;
    public AndroidPaint fillPaint;
    public AndroidPaint strokePaint;

    public final class DrawParams {
        public Canvas canvas;
        public Density density;
        public LayoutDirection layoutDirection;
        public long size;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.areEqual(this.canvas, drawParams.canvas) && Size.m639equalsimpl0(this.size, drawParams.size);
        }

        public final int hashCode() {
            return Long.hashCode(this.size) + ((this.canvas.hashCode() + ((this.layoutDirection.hashCode() + (this.density.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m646toStringimpl(this.size)) + ')';
        }
    }

    public CanvasDrawScope() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        DrawParams drawParams = new DrawParams();
        drawParams.density = DrawContextKt.DefaultDensity;
        drawParams.layoutDirection = layoutDirection;
        drawParams.canvas = EmptyCanvas.INSTANCE;
        drawParams.size = 0L;
        this.drawParams = drawParams;
        GrpcMethod grpcMethod = new GrpcMethod();
        grpcMethod.responseAdapter = this;
        grpcMethod.path = new Extras.Key(grpcMethod);
        this.drawContext = grpcMethod;
    }

    /* renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    public static Paint m721configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        Paint selectPaint = canvasDrawScope.selectPaint(drawStyle);
        if (f != 1.0f) {
            j = Color.m675copywmQWz5c$default(Color.m677getAlphaimpl(j) * f, j, 14);
        }
        AndroidPaint androidPaint = (AndroidPaint) selectPaint;
        android.graphics.Paint paint = androidPaint.internalPaint;
        if (!Color.m676equalsimpl0(ColorKt.Color(paint.getColor()), j)) {
            androidPaint.m659setColor8_81llA(j);
        }
        if (androidPaint.internalShader != null) {
            androidPaint.setShader(null);
        }
        if (!Intrinsics.areEqual(androidPaint.internalColorFilter, colorFilter)) {
            androidPaint.setColorFilter(colorFilter);
        }
        if (androidPaint._blendMode != i) {
            androidPaint.m658setBlendModes9anfk8(i);
        }
        if (paint.isFilterBitmap()) {
            return selectPaint;
        }
        androidPaint.m660setFilterQualityvDHp3xo(1);
        return selectPaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    public static Paint m722configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j, float f, int i, PathEffect pathEffect, float f2) {
        AndroidPaint androidPaint = canvasDrawScope.strokePaint;
        if (androidPaint == null) {
            androidPaint = ColorKt.Paint();
            androidPaint.m663setStylek9PVt8s(1);
            canvasDrawScope.strokePaint = androidPaint;
        }
        android.graphics.Paint paint = androidPaint.internalPaint;
        if (f2 != 1.0f) {
            j = Color.m675copywmQWz5c$default(Color.m677getAlphaimpl(j) * f2, j, 14);
        }
        if (!Color.m676equalsimpl0(ColorKt.Color(paint.getColor()), j)) {
            androidPaint.m659setColor8_81llA(j);
        }
        if (androidPaint.internalShader != null) {
            androidPaint.setShader(null);
        }
        if (!Intrinsics.areEqual(androidPaint.internalColorFilter, (Object) null)) {
            androidPaint.setColorFilter(null);
        }
        if (androidPaint._blendMode != 3) {
            androidPaint.m658setBlendModes9anfk8(3);
        }
        if (paint.getStrokeWidth() != f) {
            androidPaint.setStrokeWidth(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (androidPaint.m656getStrokeCapKaPHkGw() != i) {
            androidPaint.m661setStrokeCapBeK7IIE(i);
        }
        if (androidPaint.m657getStrokeJoinLxFBmk8() != 0) {
            androidPaint.m662setStrokeJoinWw9F2mQ(0);
        }
        if (!Intrinsics.areEqual(androidPaint.pathEffect, pathEffect)) {
            androidPaint.setPathEffect(pathEffect);
        }
        if (paint.isFilterBitmap()) {
            return androidPaint;
        }
        androidPaint.m660setFilterQualityvDHp3xo(1);
        return androidPaint;
    }

    /* renamed from: configurePaint-swdJneE, reason: not valid java name */
    public final Paint m723configurePaintswdJneE(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint selectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo670applyToPq9zytI(f, mo753getSizeNHjbRc(), selectPaint);
        } else {
            AndroidPaint androidPaint = (AndroidPaint) selectPaint;
            android.graphics.Paint paint = androidPaint.internalPaint;
            if (androidPaint.internalShader != null) {
                androidPaint.setShader(null);
            }
            long Color = ColorKt.Color(paint.getColor());
            long j = Color.Black;
            if (!Color.m676equalsimpl0(Color, j)) {
                androidPaint.m659setColor8_81llA(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                androidPaint.setAlpha(f);
            }
        }
        AndroidPaint androidPaint2 = (AndroidPaint) selectPaint;
        if (!Intrinsics.areEqual(androidPaint2.internalColorFilter, colorFilter)) {
            androidPaint2.setColorFilter(colorFilter);
        }
        if (androidPaint2._blendMode != i) {
            androidPaint2.m658setBlendModes9anfk8(i);
        }
        if (androidPaint2.internalPaint.isFilterBitmap() == i2) {
            return selectPaint;
        }
        androidPaint2.m660setFilterQualityvDHp3xo(i2);
        return selectPaint;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public final void mo724drawArcillE91I(Brush brush, long j, long j2, DrawStyle drawStyle) {
        Canvas canvas = this.drawParams.canvas;
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        canvas.drawArc(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i2), 90.0f, 260.0f, m723configurePaintswdJneE(brush, drawStyle, 1.0f, null, 3, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public final void mo725drawArcyD3GUKo(long j, float f, float f2, long j2, long j3, float f3, Stroke stroke) {
        Canvas canvas = this.drawParams.canvas;
        int i = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        canvas.drawArc(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i2), f, f2, m721configurePaint2qPWKa0$default(this, j, stroke, f3, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public final void mo726drawCircleVaOC9Bg(long j, float f, long j2, DrawStyle drawStyle, int i) {
        this.drawParams.canvas.mo650drawCircle9KIMszo(f, j2, m721configurePaint2qPWKa0$default(this, j, drawStyle, 1.0f, null, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public final void mo727drawImageAZ2fEMs(AndroidImageBitmap androidImageBitmap, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i, int i2) {
        this.drawParams.canvas.mo652drawImageRectHPBpro0(androidImageBitmap, j, j2, j3, j4, m723configurePaintswdJneE(null, Fill.INSTANCE, f, colorFilter, i, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public final void mo728drawImagegbVJVH8(AndroidImageBitmap androidImageBitmap, long j, float f, ColorFilter colorFilter, int i) {
        this.drawParams.canvas.mo651drawImaged4ec7I(androidImageBitmap, j, m723configurePaintswdJneE(null, Fill.INSTANCE, f, colorFilter, i, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public final void mo729drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2) {
        this.drawParams.canvas.mo653drawLineWko1d7g(j2, j3, m722configureStrokePaintQ_0CZUI$default(this, j, f, i, pathEffect, f2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public final void mo730drawOvalnJ9OG0(long j, long j2, long j3, DrawStyle drawStyle) {
        Canvas canvas = this.drawParams.canvas;
        int i = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        canvas.drawOval(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i2), m721configurePaint2qPWKa0$default(this, j, drawStyle, 1.0f, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public final void mo731drawPathGBMwjPU(AndroidPath androidPath, Brush brush, float f, DrawStyle drawStyle, int i) {
        this.drawParams.canvas.drawPath(androidPath, m723configurePaintswdJneE(brush, drawStyle, f, null, i, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public final void mo732drawPathLG529CI(AndroidPath androidPath, long j, float f, DrawStyle drawStyle) {
        this.drawParams.canvas.drawPath(androidPath, m721configurePaint2qPWKa0$default(this, j, drawStyle, f, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public final void mo733drawPointsF8ZwMP8(ArrayList arrayList, long j, float f) {
        this.drawParams.canvas.mo654drawPointsO7TthRY(arrayList, m722configureStrokePaintQ_0CZUI$default(this, j, f, 1, null, 1.0f));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public final void mo734drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.canvas;
        int i2 = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j & BodyPartID.bodyIdMax);
        canvas.drawRect(intBitsToFloat, Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j2)) + Float.intBitsToFloat(i3), m723configurePaintswdJneE(brush, drawStyle, f, colorFilter, i, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public final void mo735drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.canvas;
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & BodyPartID.bodyIdMax);
        canvas.drawRect(intBitsToFloat, Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i3), m721configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public final void mo736drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle) {
        Canvas canvas = this.drawParams.canvas;
        int i = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        canvas.drawRoundRect(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax)), m721configurePaint2qPWKa0$default(this, j, drawStyle, 1.0f, null, 3));
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.drawParams.density.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final GrpcMethod getDrawContext() {
        return this.drawContext;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.drawParams.density.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.drawParams.layoutDirection;
    }

    public final Paint selectPaint(DrawStyle drawStyle) {
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            AndroidPaint androidPaint = this.fillPaint;
            if (androidPaint != null) {
                return androidPaint;
            }
            AndroidPaint Paint = ColorKt.Paint();
            Paint.m663setStylek9PVt8s(0);
            this.fillPaint = Paint;
            return Paint;
        }
        if (!(drawStyle instanceof Stroke)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        AndroidPaint androidPaint2 = this.strokePaint;
        if (androidPaint2 == null) {
            androidPaint2 = ColorKt.Paint();
            androidPaint2.m663setStylek9PVt8s(1);
            this.strokePaint = androidPaint2;
        }
        android.graphics.Paint paint = androidPaint2.internalPaint;
        float strokeWidth = paint.getStrokeWidth();
        Stroke stroke = (Stroke) drawStyle;
        PathEffect pathEffect = stroke.pathEffect;
        float f = stroke.width;
        if (strokeWidth != f) {
            androidPaint2.setStrokeWidth(f);
        }
        int m656getStrokeCapKaPHkGw = androidPaint2.m656getStrokeCapKaPHkGw();
        int i = stroke.cap;
        if (m656getStrokeCapKaPHkGw != i) {
            androidPaint2.m661setStrokeCapBeK7IIE(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = stroke.miter;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int m657getStrokeJoinLxFBmk8 = androidPaint2.m657getStrokeJoinLxFBmk8();
        int i2 = stroke.join;
        if (m657getStrokeJoinLxFBmk8 != i2) {
            androidPaint2.m662setStrokeJoinWw9F2mQ(i2);
        }
        if (!Intrinsics.areEqual(androidPaint2.pathEffect, pathEffect)) {
            androidPaint2.setPathEffect(pathEffect);
        }
        return androidPaint2;
    }
}
