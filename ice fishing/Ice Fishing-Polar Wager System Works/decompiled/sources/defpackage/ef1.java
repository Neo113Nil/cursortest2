package defpackage;

/* loaded from: classes.dex */
public final class ef1 extends android.graphics.Canvas {
    public android.graphics.Canvas IHQe1A4L2xu;

    public final android.graphics.Canvas IHQe1A4L2xu() {
        android.graphics.Canvas canvas = this.IHQe1A4L2xu;
        if (canvas != null) {
            return canvas;
        }
        defpackage.y50.r1MBDhnF("Text drawing wrapper is missing a Canvas!");
        throw new defpackage.cf();
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(android.graphics.Path path) {
        boolean clipOutPath;
        clipOutPath = IHQe1A4L2xu().clipOutPath(path);
        return clipOutPath;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.RectF rectF) {
        boolean clipOutRect;
        clipOutRect = IHQe1A4L2xu().clipOutRect(rectF);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path path, android.graphics.Region.Op op) {
        return IHQe1A4L2xu().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF rectF, android.graphics.Region.Op op) {
        return IHQe1A4L2xu().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(android.graphics.Matrix matrix) {
        IHQe1A4L2xu().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        IHQe1A4L2xu().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        IHQe1A4L2xu().drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(android.graphics.RectF rectF, float f, float f2, boolean z, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawArc(rectF, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, float f, float f2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawBitmap(bitmap, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(android.graphics.Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawCircle(f, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        IHQe1A4L2xu().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF rectF, float f, float f2, android.graphics.RectF rectF2, float f3, float f4, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, android.graphics.fonts.Font font, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawLine(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawLines(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(android.graphics.RectF rectF, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(android.graphics.Paint paint) {
        IHQe1A4L2xu().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch ninePatch, android.graphics.Rect rect, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(android.graphics.Path path, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture picture) {
        IHQe1A4L2xu().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawPoint(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawPoints(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        IHQe1A4L2xu().drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.RectF rectF, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(android.graphics.RenderNode renderNode) {
        IHQe1A4L2xu().drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(android.graphics.RectF rectF, float f, float f2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawRoundRect(rectF, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawText(cArr, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, android.graphics.Path path, float f, float f2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(android.graphics.Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        IHQe1A4L2xu().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(android.graphics.Rect rect) {
        boolean clipBounds = IHQe1A4L2xu().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return IHQe1A4L2xu().getDensity();
    }

    @Override // android.graphics.Canvas
    public final android.graphics.DrawFilter getDrawFilter() {
        return IHQe1A4L2xu().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return IHQe1A4L2xu().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(android.graphics.Matrix matrix) {
        IHQe1A4L2xu().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return IHQe1A4L2xu().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return IHQe1A4L2xu().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return IHQe1A4L2xu().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return IHQe1A4L2xu().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return IHQe1A4L2xu().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF rectF, android.graphics.Canvas.EdgeType edgeType) {
        return IHQe1A4L2xu().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        IHQe1A4L2xu().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        IHQe1A4L2xu().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        IHQe1A4L2xu().rotate(f);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return IHQe1A4L2xu().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF rectF, android.graphics.Paint paint, int i) {
        return IHQe1A4L2xu().saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF rectF, int i, int i2) {
        return IHQe1A4L2xu().saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        IHQe1A4L2xu().scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(android.graphics.Bitmap bitmap) {
        IHQe1A4L2xu().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        IHQe1A4L2xu().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(android.graphics.DrawFilter drawFilter) {
        IHQe1A4L2xu().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(android.graphics.Matrix matrix) {
        IHQe1A4L2xu().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        IHQe1A4L2xu().skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        IHQe1A4L2xu().translate(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.RectF rectF, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        IHQe1A4L2xu().drawColor(j);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF rectF, float[] fArr, android.graphics.RectF rectF2, float[] fArr2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawOval(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch ninePatch, android.graphics.RectF rectF, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture picture, android.graphics.RectF rectF) {
        IHQe1A4L2xu().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(java.lang.String str, float[] fArr, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.Rect rect, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String str, float f, float f2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawText(str, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(java.lang.String str, android.graphics.Path path, float f, float f2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawTextOnPath(str, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.Rect rect) {
        boolean clipOutRect;
        clipOutRect = IHQe1A4L2xu().clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path path) {
        return IHQe1A4L2xu().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect rect, android.graphics.Region.Op op) {
        return IHQe1A4L2xu().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture picture, android.graphics.Rect rect) {
        IHQe1A4L2xu().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawRect(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String str, int i, int i2, float f, float f2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawText(str, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF rectF) {
        boolean quickReject;
        quickReject = IHQe1A4L2xu().quickReject(rectF);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF rectF, android.graphics.Paint paint) {
        return IHQe1A4L2xu().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF rectF, int i) {
        return IHQe1A4L2xu().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF rectF) {
        return IHQe1A4L2xu().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, android.graphics.PorterDuff.Mode mode) {
        IHQe1A4L2xu().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.CharSequence charSequence, int i, int i2, float f, float f2, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(android.graphics.text.MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, android.graphics.Paint paint, int i) {
        return IHQe1A4L2xu().saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return IHQe1A4L2xu().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        boolean clipOutRect;
        clipOutRect = IHQe1A4L2xu().clipOutRect(f, f2, f3, f4);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect rect) {
        return IHQe1A4L2xu().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, android.graphics.BlendMode blendMode) {
        IHQe1A4L2xu().drawColor(i, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path path, android.graphics.Canvas.EdgeType edgeType) {
        return IHQe1A4L2xu().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, android.graphics.Paint paint) {
        return IHQe1A4L2xu().saveLayer(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return IHQe1A4L2xu().saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, android.graphics.Region.Op op) {
        return IHQe1A4L2xu().clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Matrix matrix, android.graphics.Paint paint) {
        IHQe1A4L2xu().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path path) {
        boolean quickReject;
        quickReject = IHQe1A4L2xu().quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        boolean clipOutRect;
        clipOutRect = IHQe1A4L2xu().clipOutRect(i, i2, i3, i4);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return IHQe1A4L2xu().clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, android.graphics.BlendMode blendMode) {
        IHQe1A4L2xu().drawColor(j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return IHQe1A4L2xu().clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, android.graphics.Canvas.EdgeType edgeType) {
        return IHQe1A4L2xu().quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        boolean quickReject;
        quickReject = IHQe1A4L2xu().quickReject(f, f2, f3, f4);
        return quickReject;
    }
}
