package com.caverock.androidsvg;

import androidx.recyclerview.widget.RecyclerView;
import com.caverock.androidsvg.SVG;
import com.fillr.e0;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class SVGAndroidRenderer$MarkerPositionCalculator implements SVG.PathInterface {
    public boolean closepathReAdjustPending;
    public SVGAndroidRenderer$MarkerVector lastPos;
    public final ArrayList markers;
    public boolean normalCubic;
    public boolean startArc;
    public float startX;
    public float startY;
    public int subpathStartIndex;

    public SVGAndroidRenderer$MarkerPositionCalculator(e0 e0Var, SVG.PathDefinition pathDefinition) {
        ArrayList arrayList = new ArrayList();
        this.markers = arrayList;
        this.lastPos = null;
        this.startArc = false;
        this.normalCubic = true;
        this.subpathStartIndex = -1;
        if (pathDefinition == null) {
            return;
        }
        pathDefinition.enumeratePath(this);
        if (this.closepathReAdjustPending) {
            this.lastPos.add((SVGAndroidRenderer$MarkerVector) arrayList.get(this.subpathStartIndex));
            arrayList.set(this.subpathStartIndex, this.lastPos);
            this.closepathReAdjustPending = false;
        }
        SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector = this.lastPos;
        if (sVGAndroidRenderer$MarkerVector != null) {
            arrayList.add(sVGAndroidRenderer$MarkerVector);
        }
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.startArc = true;
        this.normalCubic = false;
        SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector = this.lastPos;
        e0.access$700(sVGAndroidRenderer$MarkerVector.x, sVGAndroidRenderer$MarkerVector.y, f, f2, f3, z, z2, f4, f5, this);
        this.normalCubic = true;
        this.closepathReAdjustPending = false;
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void close() {
        this.markers.add(this.lastPos);
        lineTo(this.startX, this.startY);
        this.closepathReAdjustPending = true;
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.normalCubic || this.startArc) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            this.startArc = false;
        }
        this.lastPos = new SVGAndroidRenderer$MarkerVector(f5, f6, f5 - f3, f6 - f4);
        this.closepathReAdjustPending = false;
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void lineTo(float f, float f2) {
        this.lastPos.add(f, f2);
        this.markers.add(this.lastPos);
        SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector = this.lastPos;
        this.lastPos = new SVGAndroidRenderer$MarkerVector(f, f2, f - sVGAndroidRenderer$MarkerVector.x, f2 - sVGAndroidRenderer$MarkerVector.y);
        this.closepathReAdjustPending = false;
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void moveTo(float f, float f2) {
        boolean z = this.closepathReAdjustPending;
        ArrayList arrayList = this.markers;
        if (z) {
            this.lastPos.add((SVGAndroidRenderer$MarkerVector) arrayList.get(this.subpathStartIndex));
            arrayList.set(this.subpathStartIndex, this.lastPos);
            this.closepathReAdjustPending = false;
        }
        SVGAndroidRenderer$MarkerVector sVGAndroidRenderer$MarkerVector = this.lastPos;
        if (sVGAndroidRenderer$MarkerVector != null) {
            arrayList.add(sVGAndroidRenderer$MarkerVector);
        }
        this.startX = f;
        this.startY = f2;
        this.lastPos = new SVGAndroidRenderer$MarkerVector(f, f2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        this.subpathStartIndex = arrayList.size();
    }

    @Override // com.caverock.androidsvg.SVG.PathInterface
    public final void quadTo(float f, float f2, float f3, float f4) {
        this.lastPos.add(f, f2);
        this.markers.add(this.lastPos);
        this.lastPos = new SVGAndroidRenderer$MarkerVector(f3, f4, f3 - f, f4 - f2);
        this.closepathReAdjustPending = false;
    }
}
