package androidx.compose.ui.graphics.drawscope;

import android.graphics.Paint;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import coil3.size.DimensionKt;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public interface DrawScope extends Density {
    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m737drawArcyD3GUKo$default(DrawScope drawScope, long j, float f, float f2, long j2, long j3, float f3, Stroke stroke, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        drawScope.mo725drawArcyD3GUKo(j, f, f2, j4, (i & 32) != 0 ? m750offsetSizePENXr5M(drawScope.mo753getSizeNHjbRc(), j4) : j3, (i & 64) != 0 ? 1.0f : f3, stroke);
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m738drawCircleVaOC9Bg$default(DrawScope drawScope, long j, float f, long j2, Stroke stroke, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = Size.m642getMinDimensionimpl(drawScope.mo753getSizeNHjbRc()) / 2.0f;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            j2 = drawScope.mo752getCenterF1C5BW0();
        }
        long j3 = j2;
        DrawStyle drawStyle = stroke;
        if ((i2 & 16) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        drawScope.mo726drawCircleVaOC9Bg(j, f2, j3, drawStyle, (i2 & 64) != 0 ? 3 : i);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static void m739drawImageAZ2fEMs$default(DrawScope drawScope, AndroidImageBitmap androidImageBitmap, long j, long j2, long j3, float f, ColorFilter colorFilter, int i, int i2, int i3) {
        long height = (i3 & 4) != 0 ? (androidImageBitmap.bitmap.getHeight() & BodyPartID.bodyIdMax) | (androidImageBitmap.bitmap.getWidth() << 32) : j;
        drawScope.mo727drawImageAZ2fEMs(androidImageBitmap, 0L, height, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? height : j3, (i3 & 32) != 0 ? 1.0f : f, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? 3 : i, (i3 & 512) != 0 ? 1 : i2);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m740drawImagegbVJVH8$default(DrawScope drawScope, AndroidImageBitmap androidImageBitmap, long j, float f, ColorFilter colorFilter, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        drawScope.mo728drawImagegbVJVH8(androidImageBitmap, j2, f2, colorFilter2, i);
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static void m741drawLine1RTmtNc$default(LayoutNodeDrawScope layoutNodeDrawScope, Brush brush, long j, long j2, float f, float f2, int i) {
        if ((i & 64) != 0) {
            f2 = 1.0f;
        }
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        Canvas canvas = canvasDrawScope.drawParams.canvas;
        AndroidPaint androidPaint = canvasDrawScope.strokePaint;
        if (androidPaint == null) {
            androidPaint = ColorKt.Paint();
            androidPaint.m663setStylek9PVt8s(1);
            canvasDrawScope.strokePaint = androidPaint;
        }
        Paint paint = androidPaint.internalPaint;
        if (brush != null) {
            brush.mo670applyToPq9zytI(f2, canvasDrawScope.mo753getSizeNHjbRc(), androidPaint);
        } else if (paint.getAlpha() / 255.0f != f2) {
            androidPaint.setAlpha(f2);
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
        if (androidPaint.m656getStrokeCapKaPHkGw() != 0) {
            androidPaint.m661setStrokeCapBeK7IIE(0);
        }
        if (androidPaint.m657getStrokeJoinLxFBmk8() != 0) {
            androidPaint.m662setStrokeJoinWw9F2mQ(0);
        }
        if (!Intrinsics.areEqual(androidPaint.pathEffect, (Object) null)) {
            androidPaint.setPathEffect(null);
        }
        if (!paint.isFilterBitmap()) {
            androidPaint.m660setFilterQualityvDHp3xo(1);
        }
        canvas.mo653drawLineWko1d7g(j, j2, androidPaint);
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m743drawOvalnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        drawScope.mo730drawOvalnJ9OG0(j, j4, (i & 4) != 0 ? m750offsetSizePENXr5M(drawScope.mo753getSizeNHjbRc(), j4) : j3, (i & 16) != 0 ? Fill.INSTANCE : drawStyle);
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m744drawPathGBMwjPU$default(DrawScope drawScope, AndroidPath androidPath, Brush brush, float f, Stroke stroke, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        DrawStyle drawStyle = stroke;
        if ((i & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        drawScope.mo731drawPathGBMwjPU(androidPath, brush, f2, drawStyle, (i & 32) != 0 ? 3 : 0);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m745drawPathLG529CI$default(DrawScope drawScope, AndroidPath androidPath, long j, float f, DrawStyle drawStyle, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        drawScope.mo732drawPathLG529CI(androidPath, j, f2, drawStyle);
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m746drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, BlendModeColorFilter blendModeColorFilter, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        drawScope.mo734drawRectAsUm42w(brush, j3, (i2 & 4) != 0 ? m750offsetSizePENXr5M(drawScope.mo753getSizeNHjbRc(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : blendModeColorFilter, (i2 & 64) != 0 ? 3 : i);
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m747drawRectnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, Stroke stroke, ColorFilter colorFilter, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        drawScope.mo735drawRectnJ9OG0(j, j4, (i2 & 4) != 0 ? m750offsetSizePENXr5M(drawScope.mo753getSizeNHjbRc(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : stroke, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? 3 : i);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static void m748drawRoundRectZuiqVtQ$default(LayoutNodeDrawScope layoutNodeDrawScope, Brush brush, long j, long j2, long j3, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        layoutNodeDrawScope.m875drawRoundRectZuiqVtQ(brush, j4, (i & 4) != 0 ? m750offsetSizePENXr5M(layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? Fill.INSTANCE : drawStyle);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m749drawRoundRectuAw5IA$default(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        drawScope.mo736drawRoundRectuAw5IA(j, j5, (i & 4) != 0 ? m750offsetSizePENXr5M(drawScope.mo753getSizeNHjbRc(), j5) : j3, j4, (i & 16) != 0 ? Fill.INSTANCE : drawStyle);
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    static long m750offsetSizePENXr5M(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    /* renamed from: drawArc-illE91I */
    void mo724drawArcillE91I(Brush brush, long j, long j2, DrawStyle drawStyle);

    /* renamed from: drawArc-yD3GUKo */
    void mo725drawArcyD3GUKo(long j, float f, float f2, long j2, long j3, float f3, Stroke stroke);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo726drawCircleVaOC9Bg(long j, float f, long j2, DrawStyle drawStyle, int i);

    /* renamed from: drawImage-AZ2fEMs */
    void mo727drawImageAZ2fEMs(AndroidImageBitmap androidImageBitmap, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i, int i2);

    /* renamed from: drawImage-gbVJVH8 */
    void mo728drawImagegbVJVH8(AndroidImageBitmap androidImageBitmap, long j, float f, ColorFilter colorFilter, int i);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo729drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2);

    /* renamed from: drawOval-n-J9OG0 */
    void mo730drawOvalnJ9OG0(long j, long j2, long j3, DrawStyle drawStyle);

    /* renamed from: drawPath-GBMwjPU */
    void mo731drawPathGBMwjPU(AndroidPath androidPath, Brush brush, float f, DrawStyle drawStyle, int i);

    /* renamed from: drawPath-LG529CI */
    void mo732drawPathLG529CI(AndroidPath androidPath, long j, float f, DrawStyle drawStyle);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo733drawPointsF8ZwMP8(ArrayList arrayList, long j, float f);

    /* renamed from: drawRect-AsUm42w */
    void mo734drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRect-n-J9OG0 */
    void mo735drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo736drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle);

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo752getCenterF1C5BW0() {
        return DimensionKt.m1466getCenteruvyYCjk(getDrawContext().m3999getSizeNHjbRc());
    }

    GrpcMethod getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo753getSizeNHjbRc() {
        return getDrawContext().m3999getSizeNHjbRc();
    }
}
