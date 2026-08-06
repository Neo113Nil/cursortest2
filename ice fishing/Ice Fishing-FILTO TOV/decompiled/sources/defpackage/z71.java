package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z71 extends Canvas {
    public Canvas GWasM1elztuh;

    public final Canvas GWasM1elztuh() {
        Canvas canvas = this.GWasM1elztuh;
        if (canvas != null) {
            return canvas;
        }
        u10.X1lG3V04pd("Text drawing wrapper is missing a Canvas!");
        throw new vc();
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        boolean clipOutPath;
        clipOutPath = GWasM1elztuh().clipOutPath(path);
        return clipOutPath;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        boolean clipOutRect;
        clipOutRect = GWasM1elztuh().clipOutRect(rectF);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return GWasM1elztuh().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return GWasM1elztuh().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        GWasM1elztuh().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        GWasM1elztuh().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        GWasM1elztuh().drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        GWasM1elztuh().drawArc(rectF, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        GWasM1elztuh().drawBitmap(bitmap, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        GWasM1elztuh().drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        GWasM1elztuh().drawCircle(f, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        GWasM1elztuh().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        GWasM1elztuh().drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        GWasM1elztuh().drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        GWasM1elztuh().drawLine(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        GWasM1elztuh().drawLines(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        GWasM1elztuh().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        GWasM1elztuh().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        GWasM1elztuh().drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        GWasM1elztuh().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        GWasM1elztuh().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        GWasM1elztuh().drawPoint(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        GWasM1elztuh().drawPoints(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        GWasM1elztuh().drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        GWasM1elztuh().drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        GWasM1elztuh().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        GWasM1elztuh().drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        GWasM1elztuh().drawRoundRect(rectF, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        GWasM1elztuh().drawText(cArr, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        GWasM1elztuh().drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        GWasM1elztuh().drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        GWasM1elztuh().drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        GWasM1elztuh().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = GWasM1elztuh().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return GWasM1elztuh().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return GWasM1elztuh().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return GWasM1elztuh().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        GWasM1elztuh().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return GWasM1elztuh().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return GWasM1elztuh().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return GWasM1elztuh().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return GWasM1elztuh().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return GWasM1elztuh().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return GWasM1elztuh().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        GWasM1elztuh().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        GWasM1elztuh().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        GWasM1elztuh().rotate(f);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return GWasM1elztuh().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        return GWasM1elztuh().saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        return GWasM1elztuh().saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        GWasM1elztuh().scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        GWasM1elztuh().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        GWasM1elztuh().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        GWasM1elztuh().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        GWasM1elztuh().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        GWasM1elztuh().skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        GWasM1elztuh().translate(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        GWasM1elztuh().drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        GWasM1elztuh().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        GWasM1elztuh().drawColor(j);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        GWasM1elztuh().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        GWasM1elztuh().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        GWasM1elztuh().drawOval(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        GWasM1elztuh().drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        GWasM1elztuh().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        GWasM1elztuh().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        GWasM1elztuh().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        GWasM1elztuh().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        GWasM1elztuh().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        GWasM1elztuh().drawText(str, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        GWasM1elztuh().drawTextOnPath(str, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        GWasM1elztuh().drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        clipOutRect = GWasM1elztuh().clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return GWasM1elztuh().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return GWasM1elztuh().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        GWasM1elztuh().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        GWasM1elztuh().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        GWasM1elztuh().drawRect(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        GWasM1elztuh().drawText(str, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        boolean quickReject;
        quickReject = GWasM1elztuh().quickReject(rectF);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return GWasM1elztuh().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        return GWasM1elztuh().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return GWasM1elztuh().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        GWasM1elztuh().drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        GWasM1elztuh().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        GWasM1elztuh().drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        GWasM1elztuh().drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        return GWasM1elztuh().saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return GWasM1elztuh().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        boolean clipOutRect;
        clipOutRect = GWasM1elztuh().clipOutRect(f, f2, f3, f4);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return GWasM1elztuh().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        GWasM1elztuh().drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        GWasM1elztuh().drawColor(i, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return GWasM1elztuh().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        return GWasM1elztuh().saveLayer(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return GWasM1elztuh().saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        return GWasM1elztuh().clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        GWasM1elztuh().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        boolean quickReject;
        quickReject = GWasM1elztuh().quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        boolean clipOutRect;
        clipOutRect = GWasM1elztuh().clipOutRect(i, i2, i3, i4);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return GWasM1elztuh().clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        GWasM1elztuh().drawColor(j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return GWasM1elztuh().clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        return GWasM1elztuh().quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        boolean quickReject;
        quickReject = GWasM1elztuh().quickReject(f, f2, f3, f4);
        return quickReject;
    }
}
