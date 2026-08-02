package ru.CryptoPro.JCSP.tools.common.window.elements;

import android.graphics.Canvas;
import android.graphics.Point;
import ru.CryptoPro.JCSP.tools.common.window.DialogConstants;

/* loaded from: classes4.dex */
public final class BioNetCellBlock implements IBioNetObject, IBioBuilder, IBioAnalysable, DialogConstants {
    public static final int BLOCK_SIDE = 5;
    private BioNetCell cell;
    private final int cellColor;
    private final int cornerRadiusForCell;
    private final BioNet parentBioNet;
    private final Point securePoint;
    private final int sideOfCell;

    public BioNetCellBlock(BioNet bioNet, Point point, int i, int i2, int i3) {
        this.parentBioNet = bioNet;
        this.securePoint = point;
        this.cellColor = i;
        this.sideOfCell = i2;
        this.cornerRadiusForCell = i3;
    }

    private void add() {
        this.cell = new BioNetCell(this, this.securePoint, this.cellColor, this.sideOfCell, this.cornerRadiusForCell);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioObject
    public void draw(Canvas canvas) {
        this.cell.draw(canvas);
    }

    public BioNet getParentBioNet() {
        return this.parentBioNet;
    }

    public Point getSecurePoint() {
        return this.cell.getSecurePoint();
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioNetObject
    public boolean hit(Point point) {
        return this.cell.hit(point);
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioAnalysable
    public boolean isBioAnalysisEnabled() {
        return this.parentBioNet.isBioAnalysisEnabled();
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.elements.IBioBuilder
    public void rebuild() {
        add();
    }

    public void rebuildCell() {
        this.cell.rebuild();
    }
}
