package ru.CryptoPro.JCSP.tools.common.window.elements;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import java.util.Iterator;
import java.util.Vector;
import ru.CryptoPro.JCSP.tools.common.window.DialogConstants;

/* loaded from: classes4.dex */
public final class BioNetCell implements IBioNetObject, IBioBuilder, DialogConstants {
    private final int cornerRadiusForCell;
    private final Paint paint;
    private final BioNetCellBlock parentBlock;
    private final Vector<Rect> parts = new Vector<>();
    private final Point securePoint;
    private final int sideOfCell;

    public BioNetCell(BioNetCellBlock bioNetCellBlock, Point point, int i, int i2, int i3) {
        this.parentBlock = bioNetCellBlock;
        this.securePoint = point;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(i);
        this.sideOfCell = i2;
        this.cornerRadiusForCell = i3;
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioObject
    public void draw(Canvas canvas) {
        Path path = new Path();
        RectF rectF = new RectF(this.parts.get(0));
        int i = this.cornerRadiusForCell;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        Region region = new Region(this.parentBlock.getParentBioNet().getDrawingRegion());
        Region region2 = new Region();
        region2.setPath(path, region);
        Path boundaryPath = region2.getBoundaryPath();
        boundaryPath.close();
        canvas.drawPath(boundaryPath, this.paint);
    }

    public Point getSecurePoint() {
        return this.securePoint;
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioNetObject
    public boolean hit(Point point) {
        Iterator<Rect> it = this.parts.iterator();
        while (it.hasNext()) {
            if (it.next().contains(point.x, point.y)) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioBuilder
    public void rebuild() {
        this.parts.clear();
        int dynamicPaddingX = this.parentBlock.getParentBioNet().getDynamicPaddingX();
        int dynamicPaddingY = this.parentBlock.getParentBioNet().getDynamicPaddingY();
        int i = this.parentBlock.getParentBioNet().getDrawingRegion().left;
        int i2 = this.parentBlock.getParentBioNet().getDrawingRegion().top;
        int i3 = this.parentBlock.getParentBioNet().getDrawingRegion().right;
        int i4 = this.parentBlock.getParentBioNet().getDrawingRegion().bottom;
        int i5 = this.sideOfCell * 5;
        Point point = this.securePoint;
        int i6 = point.x - dynamicPaddingX;
        point.x = i6;
        int i7 = point.y - dynamicPaddingY;
        point.y = i7;
        int i8 = i5 / 2;
        int i9 = i6 - i8;
        int i10 = i7 - i8;
        int i11 = i9 + i5;
        int i12 = i10 + i5;
        this.parts.add(new Rect(i9, i10, i11, i12));
        if (i9 < i) {
            int i13 = (i3 - i) + i9;
            this.parts.add(new Rect(i13, i10, i13 + i5, i12));
        }
        if (i10 < i2) {
            int i14 = (i4 - i2) + i10;
            this.parts.add(new Rect(i9, i14, i11, i14 + i5));
        }
        if (i11 > i3) {
            int i15 = (i + i11) - i3;
            this.parts.add(new Rect(i15 - i5, i12 - i5, i15, i12));
        }
        if (i12 > i4) {
            int i16 = (i2 + i12) - i4;
            this.parts.add(new Rect(i11 - i5, i16 - i5, i11, i16));
        }
        if (i9 < i && i10 < i2) {
            int i17 = (i3 - i) + i9;
            int i18 = (i4 - i2) + i10;
            this.parts.add(new Rect(i17, i18, i17 + i5, i18 + i5));
        }
        if (i9 < i && i12 > i4) {
            int i19 = (i3 - i) + i9;
            int i20 = (i2 + i12) - i4;
            this.parts.add(new Rect(i19, i20 - i5, i19 + i5, i20));
        }
        if (i11 > i3 && i12 > i4) {
            int i21 = (i + i11) - i3;
            int i22 = (i12 + i2) - i4;
            this.parts.add(new Rect(i21 - i5, i22 - i5, i21, i22));
        }
        if (i11 <= i3 || i10 >= i2) {
            return;
        }
        int i23 = (i + i11) - i3;
        int i24 = (i4 - i2) + i10;
        this.parts.add(new Rect(i23 - i5, i24, i23, i5 + i24));
    }
}
