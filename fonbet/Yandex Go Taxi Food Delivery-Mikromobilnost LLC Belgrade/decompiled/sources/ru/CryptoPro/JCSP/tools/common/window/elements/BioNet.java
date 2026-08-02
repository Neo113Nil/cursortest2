package ru.CryptoPro.JCSP.tools.common.window.elements;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;
import ru.CryptoPro.JCSP.tools.common.window.DialogConstants;

/* loaded from: classes4.dex */
public final class BioNet implements IBioObject, IBioBuilder, IBioNetObject, IBioAnalysable, DialogConstants {
    public static final int MAX_BLOCK_COUNT = 5;
    private final int cellColor;
    private final int cornerRadiusForCell;
    private Rect drawingRegion;
    private int nullZoneX;
    private int nullZoneY;
    private Paint paint;
    private IBioAnalysable parentView;
    private final int sideOfCell;
    private int dynamicPaddingX = 0;
    private int dynamicPaddingY = 0;
    private final Vector<BioNetCellBlock> selectedBlocks = new Vector<>();
    private final Random indentRandomGenerator = new Random();

    public BioNet(IBioAnalysable iBioAnalysable, Rect rect, int i, int i2, int i3) {
        this.nullZoneX = 0;
        this.nullZoneY = 0;
        this.paint = null;
        this.drawingRegion = null;
        this.parentView = iBioAnalysable;
        this.cellColor = i;
        this.sideOfCell = i2;
        this.cornerRadiusForCell = i3;
        this.nullZoneX = rect.width() % i2;
        this.nullZoneY = rect.height() % i2;
        this.drawingRegion = new Rect(rect.left + this.nullZoneX, rect.top + this.nullZoneY, rect.right, rect.bottom);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStrokeWidth(1.0f);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioObject
    public void draw(Canvas canvas) {
        synchronized (this.selectedBlocks) {
            try {
                if (!this.selectedBlocks.isEmpty()) {
                    Iterator<BioNetCellBlock> it = this.selectedBlocks.iterator();
                    while (it.hasNext()) {
                        it.next().draw(canvas);
                    }
                    if (this.parentView.isBioAnalysisEnabled()) {
                        this.paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
                        Iterator<BioNetCellBlock> it2 = this.selectedBlocks.iterator();
                        while (it2.hasNext()) {
                            BioNetCellBlock next = it2.next();
                            canvas.drawCircle(next.getSecurePoint().x, next.getSecurePoint().y, 2.0f, this.paint);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Rect getDrawingRegion() {
        return this.drawingRegion;
    }

    public int getDynamicPaddingX() {
        return this.dynamicPaddingX;
    }

    public int getDynamicPaddingY() {
        return this.dynamicPaddingY;
    }

    public int getNullZoneX() {
        return this.nullZoneX;
    }

    public int getNullZoneY() {
        return this.nullZoneY;
    }

    public ArrayList<Point> getSecurePoints() {
        ArrayList<Point> arrayList = new ArrayList<>();
        Iterator<BioNetCellBlock> it = this.selectedBlocks.iterator();
        while (it.hasNext()) {
            Point securePoint = it.next().getSecurePoint();
            securePoint.x += this.dynamicPaddingX;
            securePoint.y += this.dynamicPaddingY;
            arrayList.add(securePoint);
        }
        return arrayList;
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioNetObject
    public boolean hit(Point point) {
        if (!this.drawingRegion.contains(point.x, point.y)) {
            return true;
        }
        synchronized (this.selectedBlocks) {
            try {
                Iterator<BioNetCellBlock> it = this.selectedBlocks.iterator();
                while (it.hasNext()) {
                    if (it.next().hit(point)) {
                        return true;
                    }
                }
                rebuild();
                BioNetCellBlock bioNetCellBlock = new BioNetCellBlock(this, point, this.cellColor, this.sideOfCell, this.cornerRadiusForCell);
                bioNetCellBlock.rebuild();
                if (this.selectedBlocks.size() >= 5) {
                    this.selectedBlocks.remove(0);
                }
                this.selectedBlocks.add(bioNetCellBlock);
                Iterator<BioNetCellBlock> it2 = this.selectedBlocks.iterator();
                while (it2.hasNext()) {
                    it2.next().rebuildCell();
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioAnalysable
    public boolean isBioAnalysisEnabled() {
        return this.parentView.isBioAnalysisEnabled();
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioBuilder
    public void rebuild() {
        if (this.parentView.isBioAnalysisEnabled()) {
            this.dynamicPaddingX = 0;
            this.dynamicPaddingY = 0;
        } else {
            this.dynamicPaddingX = this.indentRandomGenerator.nextInt() % this.sideOfCell;
            this.dynamicPaddingY = this.indentRandomGenerator.nextInt() % this.sideOfCell;
        }
    }

    public void restoreDynamicPaddingAndSelectedBlocks(int i, int i2, ArrayList<Point> arrayList) {
        this.dynamicPaddingX = i;
        this.dynamicPaddingY = i2;
        Iterator<Point> it = arrayList.iterator();
        while (it.hasNext()) {
            BioNet bioNet = this;
            BioNetCellBlock bioNetCellBlock = new BioNetCellBlock(bioNet, it.next(), this.cellColor, this.sideOfCell, this.cornerRadiusForCell);
            bioNetCellBlock.rebuild();
            bioNetCellBlock.rebuildCell();
            bioNet.selectedBlocks.add(bioNetCellBlock);
            this = bioNet;
        }
    }
}
