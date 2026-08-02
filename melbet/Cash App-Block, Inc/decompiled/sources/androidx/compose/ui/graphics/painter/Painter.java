package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import curtains.WindowsKt$onNextDraw$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class Painter {
    public static final int $stable = 8;
    private ColorFilter colorFilter;
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final Function1<DrawScope, Unit> drawLambda = new WindowsKt$onNextDraw$1(this, 3);

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m761drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j, float f, ColorFilter colorFilter, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
            return;
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            colorFilter = null;
        }
        painter.m762drawx_KDEd0(drawScope, j, f2, colorFilter);
    }

    public boolean applyAlpha(float f) {
        return false;
    }

    public boolean applyColorFilter(ColorFilter colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m762drawx_KDEd0(DrawScope drawScope, long j, float f, ColorFilter colorFilter) {
        if (this.alpha != f) {
            if (!applyAlpha(f)) {
                Paint paint = this.layerPaint;
                if (f == 1.0f) {
                    if (paint != null) {
                        ((AndroidPaint) paint).setAlpha(f);
                    }
                    this.useLayer = false;
                } else {
                    if (paint == null) {
                        paint = ColorKt.Paint();
                        this.layerPaint = paint;
                    }
                    ((AndroidPaint) paint).setAlpha(f);
                    this.useLayer = true;
                }
            }
            this.alpha = f;
        }
        if (!Intrinsics.areEqual(this.colorFilter, colorFilter)) {
            if (!applyColorFilter(colorFilter)) {
                Paint paint2 = this.layerPaint;
                if (colorFilter == null) {
                    if (paint2 != null) {
                        ((AndroidPaint) paint2).setColorFilter(null);
                    }
                    this.useLayer = false;
                } else {
                    if (paint2 == null) {
                        paint2 = ColorKt.Paint();
                        this.layerPaint = paint2;
                    }
                    ((AndroidPaint) paint2).setColorFilter(colorFilter);
                    this.useLayer = true;
                }
            }
            this.colorFilter = colorFilter;
        }
        LayoutDirection layoutDirection = drawScope.getLayoutDirection();
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - Float.intBitsToFloat(i);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        float intBitsToFloat3 = intBitsToFloat2 - Float.intBitsToFloat(i2);
        ((Extras.Key) drawScope.getDrawContext().path).inset(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, intBitsToFloat, intBitsToFloat3);
        if (f > RecyclerView.DECELERATION_RATE) {
            try {
                if (Float.intBitsToFloat(i) > RecyclerView.DECELERATION_RATE && Float.intBitsToFloat(i2) > RecyclerView.DECELERATION_RATE) {
                    if (this.useLayer) {
                        float intBitsToFloat4 = Float.intBitsToFloat(i);
                        float intBitsToFloat5 = Float.intBitsToFloat(i2);
                        Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(0L, (Float.floatToRawIntBits(intBitsToFloat5) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat4) << 32));
                        Canvas canvas = drawScope.getDrawContext().getCanvas();
                        Paint paint3 = this.layerPaint;
                        if (paint3 == null) {
                            paint3 = ColorKt.Paint();
                            this.layerPaint = paint3;
                        }
                        try {
                            canvas.saveLayer(m1180Recttz77jQw, paint3);
                            onDraw(drawScope);
                            canvas.restore();
                        } catch (Throwable th) {
                            canvas.restore();
                            throw th;
                        }
                    } else {
                        onDraw(drawScope);
                    }
                }
            } catch (Throwable th2) {
                ((Extras.Key) drawScope.getDrawContext().path).inset(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat3);
                throw th2;
            }
        }
        ((Extras.Key) drawScope.getDrawContext().path).inset(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat3);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo759getIntrinsicSizeNHjbRc();

    public abstract void onDraw(DrawScope drawScope);
}
