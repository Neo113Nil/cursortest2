package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {
    public Rect dstRect;
    public android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;
    public Rect srcRect;

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public final void mo647clipPathmtrdDE(AndroidPath androidPath, int i) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (androidPath instanceof AndroidPath) {
            canvas.clipPath(androidPath.internalPath, ClipOp.m673equalsimpl0(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
        } else {
            a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public final void mo648clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        this.internalCanvas.clipRect(f, f2, f3, f4, ClipOp.m673equalsimpl0(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public final void mo649concat58bKbWc(float[] fArr) {
        if (ColorKt.m688isIdentity58bKbWc(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        ColorKt.m691setFromEL8BTi8(matrix, fArr);
        this.internalCanvas.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void disableZ() {
        CanvasUtils.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.internalCanvas.drawArc(f, f2, f3, f4, f5, f6, false, ColorKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public final void mo650drawCircle9KIMszo(float f, long j, Paint paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), f, ColorKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public final void mo651drawImaged4ec7I(AndroidImageBitmap androidImageBitmap, long j, Paint paint) {
        this.internalCanvas.drawBitmap(ColorKt.asAndroidBitmap(androidImageBitmap), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), ColorKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public final void mo652drawImageRectHPBpro0(AndroidImageBitmap androidImageBitmap, long j, long j2, long j3, long j4, Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = ColorKt.asAndroidBitmap(androidImageBitmap);
        Rect rect = this.srcRect;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & BodyPartID.bodyIdMax));
        Rect rect2 = this.dstRect;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & BodyPartID.bodyIdMax);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & BodyPartID.bodyIdMax));
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, ColorKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public final void mo653drawLineWko1d7g(long j, long j2, Paint paint) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)), ColorKt.getNativePaint(paint));
    }

    public final void drawLines(ArrayList arrayList, Paint paint, int i) {
        if (arrayList.size() >= 2) {
            android.graphics.Paint nativePaint = ColorKt.getNativePaint(paint);
            int i2 = 0;
            while (i2 < arrayList.size() - 1) {
                long j = ((Offset) arrayList.get(i2)).packedValue;
                long j2 = ((Offset) arrayList.get(i2 + 1)).packedValue;
                this.internalCanvas.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)), nativePaint);
                i2 += i;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        this.internalCanvas.drawOval(f, f2, f3, f4, ColorKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawPath(AndroidPath androidPath, Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (androidPath instanceof AndroidPath) {
            canvas.drawPath(androidPath.internalPath, ColorKt.getNativePaint(paint));
        } else {
            a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public final void mo654drawPointsO7TthRY(ArrayList arrayList, Paint paint) {
        if (PointMode.m707equalsimpl0(1)) {
            drawLines(arrayList, paint, 2);
            return;
        }
        if (PointMode.m707equalsimpl0(2)) {
            drawLines(arrayList, paint, 1);
            return;
        }
        if (PointMode.m707equalsimpl0(0)) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                long j = ((Offset) arrayList.get(i)).packedValue;
                this.internalCanvas.drawPoint(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), ColorKt.getNativePaint(paint));
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        this.internalCanvas.drawRect(f, f2, f3, f4, ColorKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.internalCanvas.drawRoundRect(f, f2, f3, f4, f5, f6, ColorKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void enableZ() {
        CanvasUtils.enableZ(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void rotate(float f) {
        this.internalCanvas.rotate(f);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void saveLayer(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.internalCanvas.saveLayer(rect.left, rect.top, rect.right, rect.bottom, ColorKt.getNativePaint(paint), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void scale(float f, float f2) {
        this.internalCanvas.scale(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void translate(float f, float f2) {
        this.internalCanvas.translate(f, f2);
    }
}
